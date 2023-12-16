package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass29V;
import X.AnonymousClass32Y;
import X.AnonymousClass340;
import X.AnonymousClass35J;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C08310eF;
import X.C106715a2;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C27981fH;
import X.C30261mA;
import X.C56962sq;
import X.C621033m;
import X.C70173a4;
import X.C77293tA;
import X.C80173xo;
import X.C85704Hh;
import X.C89654ea;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.jid.Jid;

public final class SharePhoneNumberBottomSheet extends Hilt_SharePhoneNumberBottomSheet {
    public C56962sq A00;
    public AnonymousClass1VX A01;
    public C106715a2 A02;
    public final AnonymousClass66R A03 = AnonymousClass340.A03(this, "arg_entry_point", 6);
    public final AnonymousClass66R A04 = C154517dI.A00(AnonymousClass58H.NONE, new C80173xo(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new C77293tA(this));

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 == 5) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r5 = 0
            X.C162457s7.A0J(r9, r5)
            super.A0w(r8, r9)
            android.widget.TextView r1 = r7.A02
            if (r1 == 0) goto L_0x0011
            r0 = 2131893822(0x7f121e3e, float:1.9422431E38)
            r1.setText(r0)
        L_0x0011:
            android.widget.TextView r2 = r7.A05
            r4 = 5
            r6 = 4
            r3 = 3
            if (r2 == 0) goto L_0x002d
            X.66R r0 = r7.A03
            int r1 = X.AnonymousClass0x2.A09(r0)
            if (r1 == r3) goto L_0x0027
            if (r1 == r6) goto L_0x0027
            r0 = 2131893821(0x7f121e3d, float:1.942243E38)
            if (r1 != r4) goto L_0x002a
        L_0x0027:
            r0 = 2131893820(0x7f121e3c, float:1.9422427E38)
        L_0x002a:
            r2.setText(r0)
        L_0x002d:
            android.widget.TextView r2 = r7.A04
            if (r2 == 0) goto L_0x0046
            X.66R r0 = r7.A03
            int r1 = X.AnonymousClass0x2.A09(r0)
            if (r1 == r3) goto L_0x008b
            if (r1 == r6) goto L_0x008b
            r0 = 2131893817(0x7f121e39, float:1.9422421E38)
            if (r1 == r4) goto L_0x0043
            r0 = 2131893819(0x7f121e3b, float:1.9422425E38)
        L_0x0043:
            r2.setText(r0)
        L_0x0046:
            android.widget.TextView r1 = r7.A01
            if (r1 == 0) goto L_0x0050
            r0 = 2131893815(0x7f121e37, float:1.9422417E38)
            r1.setText(r0)
        L_0x0050:
            android.widget.TextView r1 = r7.A03
            if (r1 == 0) goto L_0x005a
            r0 = 2131893816(0x7f121e38, float:1.942242E38)
            r1.setText(r0)
        L_0x005a:
            X.66R r0 = r7.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.chatinfo.SharePhoneNumberViewModel r4 = (com.whatsapp.chatinfo.SharePhoneNumberViewModel) r4
            X.66R r0 = r7.A04
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            X.66R r0 = r7.A03
            int r1 = X.AnonymousClass0x2.A09(r0)
            X.C162457s7.A0J(r3, r5)
            X.08M r2 = r4.A00
            boolean r0 = r3 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0080
            X.5N2 r0 = r4.A02
            X.1fH r3 = (X.C27981fH) r3
            r0.A00(r3, r6, r1, r5)
        L_0x0080:
            X.41K r1 = new X.41K
            r1.<init>(r7)
            r0 = 20
            X.AnonymousClass4K2.A00(r7, r2, r1, r0)
            return
        L_0x008b:
            r0 = 2131893818(0x7f121e3a, float:1.9422423E38)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet.A0w(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        C162457s7.A0J(view, 0);
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_negative)) {
            if (id == R.id.share_pn_cta_positive) {
                C003203q A0Q = A0Q();
                C162457s7.A0K(A0Q, "null cannot be cast to non-null type android.app.Activity");
                C56962sq r2 = this.A00;
                if (r2 != null) {
                    AnonymousClass66R r1 = this.A04;
                    if (r2.A0P(AnonymousClass32Y.A05((Jid) r1.getValue()))) {
                        A1L();
                        AnonymousClass29V r22 = new AnonymousClass29V(A0Q, new C85704Hh(A0Q, 0, this), this, 0);
                        AnonymousClass0x9.A1L(A0Q);
                        ((C89654ea) A0Q).Boo(UnblockDialogFragment.A00(r22, C08310eF.A09(this).getString(R.string.f11nameremoved), 0, false));
                        return;
                    } else if (r1.getValue() instanceof C27981fH) {
                        r1.getValue();
                        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
                        Jid jid = (Jid) r1.getValue();
                        int A09 = AnonymousClass0x2.A09(this.A03);
                        C162457s7.A0J(jid, 0);
                        if (jid instanceof C27981fH) {
                            C621033m r5 = sharePhoneNumberViewModel.A01;
                            C27981fH r8 = (C27981fH) jid;
                            r5.A0l.A0V(new C30261mA(AnonymousClass35J.A01(r8, r5.A1X), r5.A0V.A0H()));
                            C70173a4.A00(r5.A1r, r8, r5, 39);
                            sharePhoneNumberViewModel.A02.A00(r8, 6, A09, false);
                        }
                    } else {
                        return;
                    }
                } else {
                    throw C18270x1.A0S("blockListManager");
                }
            } else {
                return;
            }
        }
        A1L();
    }

    public void A0c() {
        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
        Jid jid = (Jid) this.A04.getValue();
        int A09 = AnonymousClass0x2.A09(this.A03);
        C162457s7.A0J(jid, 0);
        if (jid instanceof C27981fH) {
            sharePhoneNumberViewModel.A02.A00((C27981fH) jid, 5, A09, false);
        }
        super.A0c();
    }
}
