package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass2XB;
import X.AnonymousClass317;
import X.AnonymousClass33T;
import X.AnonymousClass356;
import X.AnonymousClass4UC;
import X.AnonymousClass66R;
import X.C009707r;
import X.C05550Ty;
import X.C05680Um;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C627736r;
import android.app.Activity;
import com.whatsapp.R;

public final class WfacBanViewModel extends C05550Ty {
    public int A00 = 1;
    public String A01 = "other";
    public final AnonymousClass33T A02;
    public final AnonymousClass317 A03;
    public final AnonymousClass4UC A04 = AnonymousClass0x9.A0b();
    public final AnonymousClass2XB A05;

    public WfacBanViewModel(AnonymousClass33T r3, AnonymousClass317 r4, AnonymousClass2XB r5) {
        C18260x0.A0Z(r4, r5, r3, 1);
        this.A03 = r4;
        this.A05 = r5;
        this.A02 = r3;
    }

    public static final void A00(Activity activity) {
        AnonymousClass0R8 supportActionBar = ((C009707r) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(false);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
    }

    public final int A0D() {
        int A032 = C18310x6.A03(C18310x6.A0F(this.A05.A00.A01), "wfac_ban_violation_source");
        if (A032 == 0) {
            return 0;
        }
        if (A032 == 1) {
            return 1;
        }
        if (A032 != 2) {
            return -1;
        }
        return 2;
    }

    public final void A0E(Activity activity) {
        AnonymousClass356.A03("WfacBanViewModel/resetRegistration");
        this.A02.A05(76, "WfacBanActivity");
        this.A03.A01();
        AnonymousClass66R r2 = this.A05.A00.A01;
        C18270x1.A0g(C18270x1.A04(r2), "wfac_ban_state");
        C18270x1.A0g(C18270x1.A04(r2), "wfac_ban_violation_type");
        C18270x1.A0g(C18270x1.A04(r2), "wfac_ban_violation_reason");
        C18270x1.A0g(C18270x1.A04(r2), "wfac_ban_violation_source");
        activity.startActivity(C627736r.A01(activity));
        C05680Um.A00(activity);
    }
}
