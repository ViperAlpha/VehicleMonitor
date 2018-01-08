package app.vehiclemonitor.features.home;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import app.vehiclemonitor.R;
import app.vehiclemonitor.core.VMBaseFragment;
import app.vehiclemonitor.features.home.di.HomeFragmentComponent;
import app.viperalpha.utils.providers.Navigator;
import app.viperalpha.di.fragment.BaseFragmentModule;

public class HomeFragment extends VMBaseFragment<HomeFragmentComponent> {

	@Inject
	ViewModelProvider.Factory viewModelFactory;

	HomeViewModel viewModel;

	public HomeFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @return A new instance of fragment HomeFragment.
	 */
	public static HomeFragment newInstance() {
		HomeFragment fragment = new HomeFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		viewModel = ViewModelProviders.of(this, viewModelFactory).get(HomeViewModel.class);
		viewModel.setNavigationProvider(new HomeNavigator(new Navigator(getActivity())));
	}

	@NonNull
	@Override
	protected HomeFragmentComponent createComponent() {
		//noinspection ConstantConditions Este método é chamado no OnCreate da super classe, não é necessário null-checks.
		return ((HomeActivity) getActivity()).component().injectHomeFragment(new BaseFragmentModule(this));
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
		}
	}

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_home, container, false);

		setHasOptionsMenu(true);

		return view;
	}

	@Override
	public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
		inflater.inflate(R.menu.home_menu, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(final MenuItem item) {

		switch (item.getItemId()) {
			case R.id.add:
				viewModel.handleAddButtonClick();
				break;
		}

		return true;
	}

	@Override
	public void inject() {
		component().inject(this);
	}

}
