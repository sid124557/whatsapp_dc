package com.whatsapp.payments.ui.instructions;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass3ZH;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XA;
import X.C1899593h;
import X.C1907099n;
import X.C195219Wq;
import X.C203499no;
import X.C56972sr;
import X.C66473Lo;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentCustomInstructionsBottomSheet extends Hilt_PaymentCustomInstructionsBottomSheet {
    public C56972sr A00;
    public C66473Lo A01;
    public AnonymousClass1VX A02;
    public C95814uZ A03;
    public AnonymousClass9XA A04 = new AnonymousClass9XA();
    public C1907099n A05;
    public C203499no A06;
    public C195219Wq A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final void A1e(int i, Integer num) {
        if (this.A0B) {
            AnonymousClass303 A0K = C1899593h.A0K();
            A0K.A03("payment_method", "cpi");
            Integer num2 = num;
            AnonymousClass9Wg.A02(A0K, this.A06, num2, "payment_instructions_prompt", this.A0A, i);
        }
    }

    public static PaymentCustomInstructionsBottomSheet A00(C95814uZ r2, String str, String str2, boolean z) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("merchantJid", r2);
        A082.putString("PayInstructionsKey", str);
        A082.putString("referral_screen", str2);
        A082.putBoolean("should_log_event", z);
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = new PaymentCustomInstructionsBottomSheet();
        paymentCustomInstructionsBottomSheet.A0u(A082);
        return paymentCustomInstructionsBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0J;
        Bundle A0H = A0H();
        this.A09 = A0H.getString("PayInstructionsKey", "");
        this.A03 = (C95814uZ) A0H.getParcelable("merchantJid");
        this.A0A = A0H.getString("referral_screen");
        this.A0B = A0H.getBoolean("should_log_event");
        C95814uZ r1 = this.A03;
        if (r1 == null) {
            A0J = null;
        } else {
            AnonymousClass3ZH A012 = this.A01.A01(r1);
            if (A012.A0L() != null) {
                A0J = A012.A0L();
            } else {
                A0J = A012.A0J();
            }
        }
        this.A08 = A0J;
        A1e(0, (Integer) null);
        return super.A0K(bundle, layoutInflater, viewGroup);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A04.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A04.onDismiss(dialogInterface);
    }
}
