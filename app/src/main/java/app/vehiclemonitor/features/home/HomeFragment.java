package app.vehiclemonitor.features.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.vehiclemonitor.R;
import app.vehiclemonitor.core.VMBaseFragment;
import app.vehiclemonitor.features.home.di.HomeFragmentComponent;
import app.viperalpha.di.fragment.BaseFragmentModule;

public class HomeFragment extends VMBaseFragment<HomeFragmentComponent> {

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
	public void onAttach(Context context) {
		super.onAttach(context);
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

		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	@Override
	public void inject() {
		component().inject(this);
	}

	@NonNull
	@Override
	protected HomeFragmentComponent createComponent() {
		//noinspection ConstantConditions Este método é chamado no OnCreate da super classe, não é necessário null-checks.
		return ((HomeActivity) getActivity()).component().injectHomeFragment(new BaseFragmentModule(this));
	}

}
