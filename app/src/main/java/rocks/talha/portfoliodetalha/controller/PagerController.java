package rocks.talha.portfoliodetalha.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import rocks.talha.portfoliodetalha.views.AboutFragment;
import rocks.talha.portfoliodetalha.views.ContactFragment;
import rocks.talha.portfoliodetalha.views.SkillsFragment;
import rocks.talha.portfoliodetalha.views.WorkFragment;

public class PagerController extends FragmentPagerAdapter {

    public PagerController(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}
