package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0R8;
import X.AnonymousClass21S;
import X.AnonymousClass5PU;
import X.AnonymousClass693;
import X.AnonymousClass97r;
import X.C105945Xa;
import X.C110065fd;
import X.C111135hb;
import X.C117075rL;
import X.C1228966g;
import X.C1235468v;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C183538qC;
import X.C86624Kv;
import X.C86654Ky;
import X.C88694ab;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.util.ArrayList;

public final class ShareToFacebookActivity extends AnonymousClass97r implements C1228966g {
    public static final AnonymousClass21S A06 = AnonymousClass21S.A0Q;
    public C110065fd A00;
    public AnonymousClass5PU A01;
    public C111135hb A02;
    public C105945Xa A03;
    public C183538qC A04;
    public C183538qC A05;

    public C110065fd BD8(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        C110065fd r1 = new C110065fd(this, C88694ab.A00(view, i, i2), this.A08, A0s, z);
        this.A00 = r1;
        r1.A05(new C117075rL(this));
        C110065fd r12 = this.A00;
        C162457s7.A0K(r12, "null cannot be cast to non-null type com.whatsapp.snackbar.WaSnackbar");
        return r12;
    }

    public final C111135hb A74() {
        C111135hb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("xFamilyUserFlowLogger");
    }

    public AnonymousClass0GC B6S() {
        AnonymousClass0GC r0 = this.A06.A02;
        C162457s7.A0D(r0);
        return r0;
    }

    public String B8C() {
        return "share_to_fb_activity";
    }

    public void onDestroy() {
        AnonymousClass5PU r0 = this.A01;
        if (r0 != null) {
            r0.A01(this);
            C111135hb A74 = A74();
            C183538qC r02 = this.A05;
            if (r02 != null) {
                A74.A06("final_auto_setting", Boolean.valueOf(C86624Kv.A1Y(C86654Ky.A0g(r02), A06)));
                A74().A05("EXIT_STATUS_PRIVACY_DETAILS");
                A74().A01();
                super.onDestroy();
                return;
            }
            throw C18270x1.A0S("fbAccountManagerLazy");
        }
        throw C18270x1.A0S("waSnackbarRegistry");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass5PU r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(true);
                supportActionBar.A0J(getString(R.string.f11nameremoved));
            }
            setContentView((int) R.layout.f8nameremoved);
            CompoundButton compoundButton = (CompoundButton) C18280x3.A0E(this.A00, R.id.auto_crosspost_setting_switch);
            C183538qC r02 = this.A05;
            if (r02 != null) {
                compoundButton.setChecked(C86624Kv.A1Y(C86654Ky.A0g(r02), A06));
                AnonymousClass693.A00(compoundButton, this, 11);
                findViewById(R.id.share_to_facebook_unlink_container).setOnClickListener(new C1235468v(this, 5));
                A74().A03(927601761, (String) null, "SEE_STATUS_PRIVACY_DETAILS");
                A74().A06("initial_auto_setting", Boolean.valueOf(compoundButton.isChecked()));
                return;
            }
            throw C18270x1.A0S("fbAccountManagerLazy");
        }
        throw C18270x1.A0S("waSnackbarRegistry");
    }
}
