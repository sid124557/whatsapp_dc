package com.whatsapp.calling.callrating;

import X.AnonymousClass4TY;
import X.AnonymousClass66R;
import X.C06270Wx;
import X.C06560Yg;
import X.C08270df;
import X.C08310eF;
import X.C104475Rc;
import X.C119085wP;
import X.C154517dI;
import X.C162457s7;
import X.C18290x4;
import X.C73783g4;
import X.C86664Kz;
import X.C999258s;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;
import java.util.Iterator;

public final class UserProblemsFragment extends WaFragment {
    public int A00 = -1;
    public ViewPager A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C119085wP(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        AnonymousClass66R r6 = this.A02;
        C06270Wx.A03(C86664Kz.A14(r6).A09, C999258s.USER_PROBLEMS.titleRes);
        ViewPager viewPager = (ViewPager) C06560Yg.A02(view, R.id.user_problems_view_pager);
        viewPager.getLayoutParams().height = (int) (((double) C08310eF.A09(this).getDisplayMetrics().heightPixels) * 0.5d);
        C08270df A0T = A0T();
        ArrayList arrayList = C86664Kz.A14(r6).A0D;
        ArrayList A0c = C73783g4.A0c(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0c.add(C18290x4.A0l(view.getContext(), ((C104475Rc) it.next()).A00.titleResId));
        }
        viewPager.setAdapter(new AnonymousClass4TY(A0T, A0c));
        this.A01 = viewPager;
        ((TabLayout) C06560Yg.A02(view, R.id.tab_layout)).setupWithViewPager(this.A01);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A00 != configuration.orientation) {
            ViewPager viewPager = this.A01;
            if (viewPager != null) {
                viewPager.getLayoutParams().height = (int) (((double) C08310eF.A09(this).getDisplayMetrics().heightPixels) * 0.5d);
                viewPager.requestLayout();
            }
            this.A00 = configuration.orientation;
        }
    }

    public void A0c() {
        super.A0c();
        this.A01 = null;
    }
}
