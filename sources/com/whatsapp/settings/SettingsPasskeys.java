package com.whatsapp.settings;

import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass36l;
import X.AnonymousClass3DZ;
import X.AnonymousClass43H;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass66R;
import X.C107695bk;
import X.C162457s7;
import X.C18300x5;
import X.C18330xA;
import X.C626936e;
import X.C64333Db;
import X.C79523wl;
import X.C79533wm;
import X.C81143zP;
import X.C89644eZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class SettingsPasskeys extends C89644eZ {
    public AnonymousClass4FV A00;
    public boolean A01;
    public final AnonymousClass66R A02;

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog A06 = AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
            C162457s7.A0H(A06);
            return A06;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        C162457s7.A0D(onCreateDialog);
        return onCreateDialog;
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = C64333Db.A4H(A002);
        }
    }

    public SettingsPasskeys(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 112);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass66R r3 = this.A02;
        AnonymousClass4K2.A00(this, ((SettingsPasskeysViewModel) r3.getValue()).A00, new AnonymousClass43H(this), 190);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
        supportActionBar.A0B(R.string.f11nameremoved);
        C18300x5.A0V(r3).A00((Throwable) null, 20);
    }

    public SettingsPasskeys() {
        this(0);
        this.A02 = C18330xA.A02(new C79533wm(this), new C79523wl(this), new C81143zP(this), AnonymousClass0x9.A1E(SettingsPasskeysViewModel.class));
    }
}
