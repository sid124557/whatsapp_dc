package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.security.Signature;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9aC  reason: invalid class name and case insensitive filesystem */
public class C196039aC implements C1229066h, C203729oD {
    public final /* synthetic */ C1229066h A00;
    public final /* synthetic */ AnonymousClass987 A01;

    public void BMx(int i, CharSequence charSequence) {
        if (i == 7) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AnonymousClass987 r5 = this.A01;
            C56612sH r6 = r5.A02;
            long seconds = timeUnit.toSeconds(r6.A0H()) + 30;
            r5.A04.A02(seconds);
            long j = (seconds * 1000) + 500;
            if (j > r6.A0H()) {
                r5.A01.A1U(j);
            }
        }
        this.A00.BMx(i, charSequence);
    }

    public C196039aC(C1229066h r1, AnonymousClass987 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static /* synthetic */ void A00(C196039aC r6) {
        C196999cI r0 = r6.A01.A05;
        BrazilPaymentActivity brazilPaymentActivity = r0.A05;
        C166587yw r2 = r0.A03;
        AnonymousClass39Q r1 = r0.A02;
        String str = r0.A06;
        String str2 = r0.A07;
        BrazilPaymentActivity.A13(r0.A01, r1, r2, r0.A04, brazilPaymentActivity, str, str2);
    }

    public void A01() {
        AnonymousClass987 r1 = this.A01;
        r1.A01.A1K();
        C19340zH A002 = AnonymousClass5V0.A00(r1.A00);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        C204219p0.A01(A002, this, 1, R.string.f11nameremoved);
        A002.A0i(false);
        A002.A0S();
    }

    public void BJz(AnonymousClass34V r2, Integer num) {
        this.A01.A05.BJz(r2, num);
        BS7(r2, num);
    }

    public Integer BK3() {
        return this.A01.A05.BK3();
    }

    public void BKG(AnonymousClass34V r2, Integer num) {
        this.A01.A05.BKG(r2, num);
    }

    public void BKH(Integer num) {
        this.A01.A05.BKH(num);
    }

    public void BMy() {
        this.A00.BMy();
    }

    public void BN0(int i, CharSequence charSequence) {
        this.A00.BN0(i, charSequence);
    }

    public void BN1(byte[] bArr) {
        AnonymousClass987 r2 = this.A01;
        r2.A01.A09 = true;
        r2.A00.Bp9(R.string.f11nameremoved);
    }

    public void BS7(AnonymousClass34V r13, Integer num) {
        C196709bc r5;
        int i;
        String str;
        DialogInterface.OnDismissListener r8;
        C204619pe r7;
        C204619pe r9;
        C165897xo A002;
        AnonymousClass987 r2 = this.A01;
        r2.A00.BjL();
        FingerprintBottomSheet fingerprintBottomSheet = r2.A01;
        fingerprintBottomSheet.A09 = false;
        int i2 = r13.A00;
        if (i2 == 1441) {
            fingerprintBottomSheet.A1U(r13.A02 * 1000);
            return;
        }
        C196999cI r22 = r2.A05;
        BrazilPaymentActivity brazilPaymentActivity = r22.A05;
        brazilPaymentActivity.A0O.A03(brazilPaymentActivity.A00, "error_code", (long) i2);
        int i3 = r13.A00;
        if (i3 == 454) {
            AnonymousClass36K r0 = r13.A05;
            if (!(r0 == null || (A002 = C154407d7.A00(r0)) == null)) {
                brazilPaymentActivity.A0C.A04(C192779Ln.A00(brazilPaymentActivity.A06, A002));
            }
            BrazilPaymentActivity.A0C(r22.A00, brazilPaymentActivity);
            return;
        }
        if (i3 == 2896003 || i3 == 2896004) {
            AnonymousClass9Wg.A03(AnonymousClass9Wg.A00(brazilPaymentActivity.A06, (AnonymousClass39Q) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
            r5 = brazilPaymentActivity.A0A;
            i = r13.A00;
            str = null;
            r8 = new C204619pe(r22.A00, 0, r22);
            r7 = null;
            r9 = null;
        } else {
            if (i3 == 444 || i3 == 478) {
                brazilPaymentActivity.A0J.A01.A02("FB", "PIN");
            }
            r5 = brazilPaymentActivity.A0A;
            i = r13.A00;
            AnonymousClass5ZU r3 = brazilPaymentActivity.A05;
            C66473Lo r1 = brazilPaymentActivity.A07;
            UserJid userJid = brazilPaymentActivity.A0G;
            C626936e.A06(userJid);
            str = r3.A0H(r1.A01(userJid));
            FingerprintBottomSheet fingerprintBottomSheet2 = r22.A00;
            r7 = new C204619pe(fingerprintBottomSheet2, 1, r22);
            r8 = new C204629pf(fingerprintBottomSheet2, 4);
            r9 = new C204619pe(fingerprintBottomSheet2, 2, r22);
        }
        r5.A00(brazilPaymentActivity, r7, r8, r9, str, i).show();
    }

    public void BaQ(String str, Integer num) {
        AnonymousClass987 r3 = this.A01;
        r3.A00.BjL();
        FingerprintBottomSheet fingerprintBottomSheet = r3.A01;
        fingerprintBottomSheet.A1P(false);
        fingerprintBottomSheet.A03.setEnabled(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        C196999cI r2 = r3.A05;
        BrazilPaymentActivity brazilPaymentActivity = r2.A05;
        brazilPaymentActivity.A0O.A07(num, "pay-precheck");
        String str2 = r2.A06;
        AnonymousClass39Q r5 = r2.A02;
        C166587yw r6 = r2.A03;
        String str3 = r2.A07;
        int i = 1;
        if (brazilPaymentActivity.A7H(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A7K(r2.A01, r5, r6, r2.A04, str2, str, str3, i);
        this.A00.BN1((byte[]) null);
    }

    public /* synthetic */ void BN2(Signature signature) {
    }
}
