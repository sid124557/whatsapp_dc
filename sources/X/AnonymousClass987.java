package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.987  reason: invalid class name */
public class AnonymousClass987 extends C90034fi {
    public final C89654ea A00;
    public final FingerprintBottomSheet A01;
    public final C56612sH A02;
    public final AnonymousClass9VE A03;
    public final AnonymousClass9TR A04;
    public final C196999cI A05;

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01;
        fingerprintBottomSheet.A1P(true);
        fingerprintBottomSheet.A1L();
    }

    public void A01() {
        C196999cI r0 = this.A05;
        BrazilPaymentActivity brazilPaymentActivity = r0.A05;
        C166587yw r2 = r0.A03;
        AnonymousClass39Q r1 = r0.A02;
        String str = r0.A06;
        String str2 = r0.A07;
        BrazilPaymentActivity.A13(r0.A01, r1, r2, r0.A04, brazilPaymentActivity, str, str2);
    }

    public void A02(AnonymousClass0QU r10, C1229066h r11) {
        long A002 = this.A04.A00() * 1000;
        if (A002 > this.A02.A0H()) {
            this.A01.A1U(A002);
            return;
        }
        AnonymousClass9VE r5 = this.A03;
        C196039aC r6 = new C196039aC(r11, this);
        r5.A0Q.BkM(new C198969fm(r5));
        C67993Rl A012 = r5.A0H.A01("FB", "PIN");
        AnonymousClass0QU r4 = r10;
        if (A012 != null) {
            r5.A01(r10, r6, new C193849Qh(A012));
            return;
        }
        r5.A0G.A00(new C204879q4(r4, r5, r6, r6.A01.A05.A05.A0O.A00("get-provider-key"), 0), "FB");
    }

    public AnonymousClass987(C89654ea r1, FingerprintBottomSheet fingerprintBottomSheet, C56612sH r3, AnonymousClass9VE r4, AnonymousClass9TR r5, C196999cI r6) {
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = fingerprintBottomSheet;
        this.A05 = r6;
    }
}
