package es.com.blogspot.retoappsmoviles.training03;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
	    Tab tab = actionBar.newTab()
				.setText(getString(R.string.fragment1))
				.setTabListener(new TabListener<Fragment1>(this, getString(R.string.fragment1), Fragment1.class));	    
	    actionBar.addTab(tab);

	    tab = actionBar.newTab()
               .setText(getString(R.string.fragment2))
               .setTabListener(new TabListener<Fragment2>(this, getString(R.string.fragment2), Fragment2.class));
	    actionBar.addTab(tab);
	    	
	    tab = actionBar.newTab()
                .setText(getString(R.string.fragment3))
                .setTabListener(new TabListener<Fragment3>(this, getString(R.string.fragment3), Fragment3.class));
	    actionBar.addTab(tab);
	}
	
	public static class TabListener<T extends Fragment> implements ActionBar.TabListener {
	    private Fragment mFragment;
	    private final Activity mActivity;
	    private final String mTag;
	    private final Class<T> mClass;

	    /** Constructor used each time a new tab is created.
	      * @param activity  The host Activity, used to instantiate the fragment
	      * @param tag  The identifier tag for the fragment
	      * @param clz  The fragment's Class, used to instantiate the fragment
	      */
	    public TabListener(Activity activity, String tag, Class<T> clz) {
	        mActivity = activity;
	        mTag = tag;
	        mClass = clz;
	    }

	    /* The following are each of the ActionBar.TabListener callbacks */

	    public void onTabSelected(Tab tab, FragmentTransaction ft) {
	    	mFragment = Fragment.instantiate(mActivity, mClass.getName());
	        ft.replace(android.R.id.content, mFragment, mTag);	        
	    }

	    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	        if (mFragment != null) {
	            // Detach the fragment, because another one is being attached
	            ft.detach(mFragment);
	        }
	    }

	    public void onTabReselected(Tab tab, FragmentTransaction ft) {
	        // User selected the already selected tab. Usually do nothing.
	    }
	}
}
