package com.whatsapp.group;

import X.AnonymousClass002;
import X.AnonymousClass4FV;
import X.C107575bX;
import X.C162457s7;
import X.C18260x0;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C24101Wc;
import X.C57012sv;
import X.C635439q;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class ReportGroupPrivacyTipDialogFragment extends WaDialogFragment {
    public int A00 = 4;
    public final C57012sv A01;
    public final AnonymousClass4FV A02;
    public final boolean A03;

    public Dialog A1J(Bundle bundle) {
        AnonymousClass4FV r2 = this.A02;
        C24101Wc r1 = new C24101Wc();
        r1.A00 = 1;
        r2.BhA(r1);
        View A0H = C18310x6.A0H(A0I(), R.layout.f8nameremoved);
        C162457s7.A0D(A0H);
        Context A0G = A0G();
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = C107575bX.A04(A0G(), R.color.f5nameremoved);
        Spanned A002 = C107575bX.A00(A0G, A0L, R.string.f11nameremoved);
        C162457s7.A0D(A002);
        AnonymousClass002.A09(A0H, R.id.group_privacy_tip_text).setText(A002);
        C635439q.A00(A0H.findViewById(R.id.group_privacy_tip_banner), this, 6);
        if (this.A03) {
            AnonymousClass002.A09(A0H, R.id.report_privacy_tip_dialog_body).setText(R.string.f11nameremoved);
        }
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0a(A0H);
        C85804Hr.A01(A0M, this, 66, R.string.f11nameremoved);
        return C18300x5.A0H(A0M);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        int i = this.A00;
        AnonymousClass4FV r2 = this.A02;
        C24101Wc r1 = new C24101Wc();
        r1.A00 = Integer.valueOf(i);
        r2.BhA(r1);
    }

    public ReportGroupPrivacyTipDialogFragment(C57012sv r2, AnonymousClass4FV r3, boolean z) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z;
    }
}
