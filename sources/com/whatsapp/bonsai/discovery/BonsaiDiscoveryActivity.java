package com.whatsapp.bonsai.discovery;

import X.AnonymousClass001;
import X.AnonymousClass1Hf;
import X.AnonymousClass1ZN;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass6C2;
import X.AnonymousClass6JK;
import X.AnonymousClass8C2;
import X.AnonymousClass8PJ;
import X.AnonymousClass8VO;
import X.C104265Qh;
import X.C107695bk;
import X.C118935wA;
import X.C125086Fc;
import X.C13750ng;
import X.C175028Wu;
import X.C175258Xr;
import X.C175268Xs;
import X.C175518Yr;
import X.C18270x1;
import X.C64333Db;
import X.C86604Kt;
import X.C86644Kx;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

public final class BonsaiDiscoveryActivity extends C89644eZ {
    public AnonymousClass4FV A00;
    public boolean A01;
    public boolean A02 = false;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A00 = C64333Db.A4H(A2Y);
        }
    }

    public BonsaiDiscoveryActivity() {
        super(R.layout.f8nameremoved);
        C86604Kt.A1K(this, 19);
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        View findViewById = findViewById(R.id.toolbar_holder);
        setSupportActionBar(C86644Kx.A0K(findViewById));
        AnonymousClass1Hf.A2E(this);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            C125086Fc r1 = (C125086Fc) layoutParams;
            r1.A00 = 21;
            findViewById.setLayoutParams(r1);
            AnonymousClass6JK r8 = new AnonymousClass6JK(this);
            TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.A0D(new AnonymousClass6C2(this, 0));
            View findViewById2 = findViewById(R.id.touch_interceptor);
            ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
            viewPager2.setAdapter(r8);
            new C104265Qh(viewPager2, tabLayout, new AnonymousClass8C2(r8)).A00();
            C13750ng r3 = new C13750ng(new C118935wA(this), new AnonymousClass8VO(this), new C175028Wu(this), new AnonymousClass8PJ(BonsaiDiscoveryViewModel.class));
            ((BonsaiDiscoveryViewModel) r3.getValue()).A02.A0H((Object) null);
            C86604Kt.A1N(this, ((BonsaiDiscoveryViewModel) r3.getValue()).A00, new C175518Yr(findViewById2, (ShimmerFrameLayout) findViewById(R.id.shimmer_container), r8), 57);
            C86604Kt.A1N(this, ((BonsaiDiscoveryViewModel) r3.getValue()).A01, new C175258Xr(this), 58);
            C86604Kt.A1N(this, ((BonsaiDiscoveryViewModel) r3.getValue()).A02, new C175268Xs(this), 59);
            AnonymousClass4FV r4 = this.A00;
            if (r4 != null) {
                AnonymousClass1ZN r32 = new AnonymousClass1ZN();
                r32.A00 = 29;
                int intExtra = getIntent().getIntExtra("bonsaiDiscoveryEntryPoint", -1);
                if (intExtra == -1) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(intExtra);
                }
                r32.A01 = valueOf;
                r4.BhD(r32);
                return;
            }
            throw C18270x1.A0S("wamRuntime");
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
    }
}
