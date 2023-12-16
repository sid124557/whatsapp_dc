package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9od  reason: invalid class name and case insensitive filesystem */
public class C203989od extends AnonymousClass5ZM {
    public Object A00;
    public final int A01;

    public C203989od(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C133796hx r4;
        AnonymousClass39R r7;
        AnonymousClass39M r2;
        C624134x r21;
        Integer num;
        AnonymousClass39R r13;
        switch (this.A01) {
            case 0:
                C191129Co r22 = (C191129Co) ((C204539pW) this.A00).A00;
                return AnonymousClass9U4.A03(r22.A0P).A08(r22.A00.A0A);
            case 1:
                Log.d("Saving pin state");
                C191129Co r6 = (C191129Co) this.A00;
                List A02 = r6.A0I.A02();
                C151007Tb A012 = r6.A0I.A01("2fa");
                if (!A02.contains(A012)) {
                    r6.A0I.A08(A012);
                }
                Log.d("2FA Step saved");
                List A08 = AnonymousClass9U4.A08(r6.A0P);
                C166587yw A002 = AnonymousClass8EA.A00(r6.A00.A0A, A08);
                if (!(A002 == null || (r4 = A002.A08) == null)) {
                    ((AnonymousClass99H) r4).A05 = C1899693i.A0F(AnonymousClass3QD.A00(), Boolean.class, Boolean.TRUE, "isPinSet");
                    AnonymousClass9U4.A03(r6.A0P).A0M(A08);
                }
                Log.d("pin state saved to DB");
                return A002;
            default:
                AnonymousClass9Bs r0 = (AnonymousClass9Bs) this.A00;
                PaymentView A74 = r0.A74();
                if (A74 == null || A74.getStickerIfSelected() == null) {
                    AnonymousClass9U5 r23 = r0.A0M;
                    C30481mW A7o = r0.A7o();
                    AnonymousClass39Q r42 = r0.A09;
                    C85204Fi r3 = r0.A05;
                    C166587yw r5 = r0.A0B;
                    AnonymousClass99L r62 = r0.A0O;
                    String str = r0.A0n;
                    String str2 = r0.A0o;
                    PaymentView paymentView = r0.A0N;
                    if (paymentView != null) {
                        r7 = paymentView.getPaymentBackground();
                    } else {
                        r7 = null;
                    }
                    return r23.A02(r3, r42, r5, r62, r7, A7o, str, str2, AnonymousClass9DC.A17(r0));
                }
                C194119Rq r32 = r0.A0X;
                PaymentView paymentView2 = r0.A0N;
                if (paymentView2 != null) {
                    r2 = paymentView2.getStickerIfSelected();
                } else {
                    r2 = null;
                }
                C626936e.A06(r2);
                AnonymousClass3QO r1 = r0.A08;
                String str3 = r0.A0U;
                C95814uZ r8 = r0.A0E;
                C626936e.A06(r8);
                UserJid userJid = r0.A0G;
                long j = r0.A02;
                if (j != 0) {
                    r21 = r0.A0e.A02.A01(j);
                } else {
                    r21 = null;
                }
                PaymentView paymentView3 = r0.A0N;
                if (paymentView3 != null) {
                    num = paymentView3.getStickerSendOrigin();
                } else {
                    num = null;
                }
                AnonymousClass39Q r10 = r0.A09;
                C85204Fi r9 = r0.A05;
                C166587yw r11 = r0.A0B;
                AnonymousClass99L r12 = r0.A0O;
                String str4 = r0.A0n;
                String str5 = r0.A0o;
                if (paymentView3 != null) {
                    r13 = paymentView3.getPaymentBackground();
                } else {
                    r13 = null;
                }
                boolean A17 = AnonymousClass9DC.A17(r0);
                AnonymousClass1nE A022 = r32.A04.A02(r8, userJid, r21, r2, num);
                boolean A0J = r32.A03.A0J(r9, r10, r11, r12, r13, A022, str4, str5, A17);
                if (r1 == null) {
                    C55972rD r43 = r32.A02;
                    AnonymousClass32J A003 = AnonymousClass9VS.A00(r2, str3);
                    C626936e.A06(A003);
                    r1 = r43.A02(A003, true);
                }
                r32.A00.A0S(new C201029jP(r1, r32, A022));
                r32.A05.A00(r13, A022);
                if (A0J) {
                    return A022.A0P;
                }
                return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        switch (this.A01) {
            case 0:
                C166587yw r9 = (C166587yw) obj;
                Object obj2 = ((C204539pW) this.A00).A00;
                if (r9 != null) {
                    C191129Co r0 = (C191129Co) obj2;
                    r0.A00 = (C133686hm) r9;
                    r0.A7j();
                    return;
                }
                ((AnonymousClass9D8) obj2).A7b();
                return;
            case 1:
                C166587yw r92 = (C166587yw) obj;
                if (r92 != null) {
                    C191129Co r02 = (C191129Co) this.A00;
                    C133686hm r93 = (C133686hm) r92;
                    r02.A00 = r93;
                    r02.A0A = r93;
                    AnonymousClass345.A02(r02.getApplicationContext(), true);
                    Log.d("enabled receive intent and finished");
                }
                C191129Co r3 = (C191129Co) this.A00;
                r3.BjL();
                r3.A7H();
                Intent A07 = C18320x8.A07();
                A07.putExtra("extra_bank_account", r3.A00);
                AnonymousClass0x2.A0m(r3, A07);
                return;
            default:
                C624034w r94 = (C624034w) obj;
                AnonymousClass9Bs r6 = (AnonymousClass9Bs) this.A00;
                if (!r6.A0w) {
                    r6.A0V.A04(r6.A00, 2);
                    r6.BjL();
                    r6.A7H();
                    r6.A76(0);
                    return;
                } else if (r94 == null) {
                    AnonymousClass34V r7 = new AnonymousClass34V(C196719bd.A00(r6.A05, 0));
                    AnonymousClass9B3 r5 = r6.A0V;
                    int i = r6.A00;
                    r5.A03(i, "error_code", (long) r7.A00);
                    r5.A04(i, 3);
                    r6.A85(r7);
                    return;
                } else {
                    r6.A0V.A04(r6.A00, 2);
                    r6.A82(r94, true);
                    return;
                }
        }
    }
}
