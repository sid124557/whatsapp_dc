package com.whatsapp.status.archive;

import X.AnonymousClass0IT;
import X.AnonymousClass0x9;
import X.AnonymousClass1X2;
import X.AnonymousClass20D;
import X.AnonymousClass2D4;
import X.AnonymousClass4FV;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18330xA;
import X.C43782Tl;
import X.C616131n;
import X.C79603wt;
import X.C79613wu;
import X.C79623wv;
import X.C81183zT;
import X.C81193zU;
import X.C81483zx;
import X.C84814Du;
import X.C85494Gl;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class StatusArchiveSettingsBottomSheetDialog extends Hilt_StatusArchiveSettingsBottomSheetDialog {
    public AnonymousClass2D4 A00;
    public AnonymousClass4FV A01;
    public C43782Tl A02;
    public final AnonymousClass66R A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return (View) new C81483zx(layoutInflater, viewGroup, this).invoke();
    }

    public void A0c() {
        this.A02 = null;
        super.A0c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        A1Y(3);
        super.onCancel(dialogInterface);
    }

    public final void A1Y(int i) {
        AnonymousClass4FV r2 = this.A01;
        if (r2 != null) {
            AnonymousClass1X2 r1 = new AnonymousClass1X2();
            r1.A01 = C18280x3.A0S();
            r1.A00 = Integer.valueOf(i);
            r2.BhD(r1);
            return;
        }
        throw C18270x1.A0S("wamRuntime");
    }

    public StatusArchiveSettingsBottomSheetDialog() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C79613wu(new C79603wt(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(StatusArchiveSettingsViewModel.class);
        this.A03 = C18330xA.A02(new C79623wv(A002), new C81193zU(this, A002), new C81183zT(A002), A1E);
    }

    public void A0g() {
        super.A0g();
        A1Y(1);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C616131n.A02((C85494Gl) null, new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
    }
}
