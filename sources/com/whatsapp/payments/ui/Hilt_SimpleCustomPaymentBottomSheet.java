package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.C107695bk;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C64333Db;
import X.C86644Kx;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.payments.ui.instructions.Hilt_PaymentCustomInstructionsBottomSheet;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

public abstract class Hilt_SimpleCustomPaymentBottomSheet extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_PaymentCustomInstructionsBottomSheet) {
            Hilt_PaymentCustomInstructionsBottomSheet hilt_PaymentCustomInstructionsBottomSheet = (Hilt_PaymentCustomInstructionsBottomSheet) this;
            if (!hilt_PaymentCustomInstructionsBottomSheet.A02) {
                hilt_PaymentCustomInstructionsBottomSheet.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_PaymentCustomInstructionsBottomSheet);
                PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) hilt_PaymentCustomInstructionsBottomSheet;
                C64333Db r2 = ((C88854au) A0O).A1B;
                C107695bk r1 = r2.A00;
                C18260x0.A0J(r1, paymentCustomInstructionsBottomSheet);
                paymentCustomInstructionsBottomSheet.A02 = C64333Db.A4B(r2);
                paymentCustomInstructionsBottomSheet.A00 = C64333Db.A06(r2);
                paymentCustomInstructionsBottomSheet.A07 = C1899693i.A0S(r2);
                paymentCustomInstructionsBottomSheet.A06 = C1899593h.A0M(r1);
                paymentCustomInstructionsBottomSheet.A01 = C86644Kx.A0U(r2);
                paymentCustomInstructionsBottomSheet.A05 = C1899593h.A0H(r2);
            }
        } else if (this instanceof Hilt_BrazilPixBottomSheet) {
            Hilt_BrazilPixBottomSheet hilt_BrazilPixBottomSheet = (Hilt_BrazilPixBottomSheet) this;
            if (!hilt_BrazilPixBottomSheet.A02) {
                hilt_BrazilPixBottomSheet.A02 = true;
                AnonymousClass3DY A0O2 = C18310x6.A0O(hilt_BrazilPixBottomSheet);
                BrazilPixBottomSheet brazilPixBottomSheet = (BrazilPixBottomSheet) hilt_BrazilPixBottomSheet;
                C64333Db r22 = ((C88854au) A0O2).A1B;
                C107695bk r12 = r22.A00;
                C18260x0.A0J(r12, brazilPixBottomSheet);
                brazilPixBottomSheet.A01 = C64333Db.A06(r22);
                brazilPixBottomSheet.A06 = C1899593h.A0H(r22);
                brazilPixBottomSheet.A07 = C1899593h.A0M(r12);
                brazilPixBottomSheet.A02 = C86644Kx.A0U(r22);
            }
        } else if (this instanceof Hilt_BrazilContentCopiedBottomSheet) {
            Hilt_BrazilContentCopiedBottomSheet hilt_BrazilContentCopiedBottomSheet = (Hilt_BrazilContentCopiedBottomSheet) this;
            if (!hilt_BrazilContentCopiedBottomSheet.A02) {
                hilt_BrazilContentCopiedBottomSheet.A02 = true;
                AnonymousClass3DY A0O3 = C18310x6.A0O(hilt_BrazilContentCopiedBottomSheet);
                BrazilContentCopiedBottomSheet brazilContentCopiedBottomSheet = (BrazilContentCopiedBottomSheet) hilt_BrazilContentCopiedBottomSheet;
                C107695bk r0 = ((C88854au) A0O3).A1B.A00;
                C18260x0.A0J(r0, brazilContentCopiedBottomSheet);
                brazilContentCopiedBottomSheet.A01 = C1899593h.A0M(r0);
            }
        } else if (!this.A02) {
            this.A02 = true;
            C18260x0.A0J(((C88854au) C18310x6.A0O(this)).A1B.A00, this);
        }
    }

    public final void A1Z() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1Z();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A1Z()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_SimpleCustomPaymentBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
