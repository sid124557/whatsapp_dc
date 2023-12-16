package com.whatsapp.shops;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass2PX;
import X.AnonymousClass9PS;
import X.C06560Yg;
import X.C18310x6;
import X.C199779hE;
import X.C203969ob;
import X.C85244Fm;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;

public class ShopsProductPreviewFragment extends Hilt_ShopsProductPreviewFragment {
    public ConstraintLayout A00;
    public ShimmerFrameLayout A01;
    public C85244Fm A02;
    public AnonymousClass2PX A03;
    public ShopsProductPreviewFragmentViewModel A04;
    public AnonymousClass9PS A05;
    public Runnable A06;
    public String A07;
    public final Handler A08 = new Handler();

    public void A1J() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A08.removeCallbacks(runnable);
        }
        this.A01.A03();
        this.A01.setVisibility(8);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A07 = C18310x6.A0k(A0H(), "shopUrl");
        this.A04 = (ShopsProductPreviewFragmentViewModel) new AnonymousClass0XL(this).A01(ShopsProductPreviewFragmentViewModel.class);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        A0J();
        this.A01 = (ShimmerFrameLayout) C06560Yg.A02(view, R.id.shimmer_container);
        this.A00 = (ConstraintLayout) C06560Yg.A02(view, R.id.placeholder_container);
        C203969ob.A00(C06560Yg.A02(view, R.id.see_all), this, 11);
        C199779hE r3 = new C199779hE(this);
        this.A06 = r3;
        this.A08.postDelayed(r3, 200);
    }

    public int A1H() {
        return R.id.bk_container;
    }
}
