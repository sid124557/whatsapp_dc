package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass49F;
import X.AnonymousClass49I;
import X.AnonymousClass7r0;
import X.AnonymousClass9RA;
import X.AnonymousClass9Y5;
import X.C18310x6;
import X.C1899593h;
import X.C198009eE;
import X.C204149ot;
import X.C46202bF;
import X.C53332mv;
import X.C54522or;
import X.C60482yd;
import X.C69283Wk;
import X.C69303Wm;
import X.C70323aJ;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

public class BkFcsPreloadingScreenFragment extends Hilt_BkFcsPreloadingScreenFragment {
    public AnonymousClass49F A00;
    public C54522or A01;
    public C60482yd A02;
    public AnonymousClass9RA A03;
    public C53332mv A04;
    public String A05;
    public String A06;
    public String A07;
    public Map A08;
    public boolean A09 = false;
    public final Queue A0A = AnonymousClass0x9.A18();

    public static BkFcsPreloadingScreenFragment A00(AnonymousClass39C r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = new BkFcsPreloadingScreenFragment();
        bkFcsPreloadingScreenFragment.A1Q(str);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A0u(AnonymousClass002.A08());
        }
        bkFcsPreloadingScreenFragment.A0H().putString("config_prefixed_state_name", str2);
        C1899593h.A1P(bkFcsPreloadingScreenFragment, r3, str6, str5);
        bkFcsPreloadingScreenFragment.A1K();
        bkFcsPreloadingScreenFragment.A0H().putString("data_module_job_id", str3);
        bkFcsPreloadingScreenFragment.A0H().putString("data_module_namespace", str4);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A0u(AnonymousClass002.A08());
        }
        bkFcsPreloadingScreenFragment.A0H().putString("fds_manager_id", str7);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A0u(AnonymousClass002.A08());
        }
        bkFcsPreloadingScreenFragment.A0H().putString("observer_id", str8);
        return bkFcsPreloadingScreenFragment;
    }

    public void A1T() {
        C54522or r1 = this.A01;
        if (r1 != null) {
            r1.A01(new C69283Wk());
        }
        super.A1T();
    }

    public final void A1V(C198009eE r7) {
        Map map = this.A08;
        if (map != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add("");
            String str = r7.A00;
            if ("onLoadingFailure".equals(str)) {
                A0s.add(r7.A02);
            }
            AnonymousClass49I r1 = (AnonymousClass49I) map.get(str);
            AnonymousClass49F r0 = this.A00;
            if (r1 != null && r0 != null) {
                this.A04.A00(new C70323aJ(r0.B3o(), r1.B3r(), A0s, 1));
            }
        }
    }

    public Animation A0L(int i, int i2, boolean z) {
        if (i2 != R.anim.f0nameremoved) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(A0Q(), i2);
        if (loadAnimation != null && z) {
            this.A03.A00 = true;
            loadAnimation.setAnimationListener(new AnonymousClass9Y5(this));
        }
        return loadAnimation;
    }

    public void A0a() {
        super.A0a();
        C54522or r0 = this.A01;
        if (r0 != null) {
            r0.A03(this);
            this.A01 = null;
        }
    }

    public void A0e() {
        super.A0e();
        this.A09 = false;
    }

    public void A0f() {
        super.A0f();
        this.A09 = true;
        while (true) {
            Queue queue = this.A0A;
            if (!queue.isEmpty()) {
                ((Runnable) queue.remove()).run();
            } else {
                return;
            }
        }
    }

    public void A0p(Bundle bundle) {
        AnonymousClass7r0 r0;
        this.A05 = C18310x6.A0k(A0H(), "config_prefixed_state_name");
        this.A07 = C18310x6.A0k(A0H(), "screen_name");
        this.A06 = C18310x6.A0k(A0H(), "observer_id");
        C46202bF A002 = this.A04.A00(this.A07, C18310x6.A0k(A0H(), "fds_manager_id"), A0H().getString("screen_params"));
        if (!(A002 == null || (r0 = A002.A01) == null)) {
            this.A02 = r0;
        }
        super.A0p(bundle);
        C54522or A022 = this.A02.A02(this.A06);
        this.A01 = A022;
        A022.A00(new C204149ot(this, 2), C198009eE.class, this);
    }

    public void A1S() {
        super.A1S();
        C54522or r1 = this.A01;
        if (r1 != null) {
            r1.A01(new C69303Wm());
        }
    }
}
