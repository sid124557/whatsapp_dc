package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9TL  reason: invalid class name */
public abstract class AnonymousClass9TL {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final AnonymousClass8EA A04;
    public final C40602Ha A05;
    public final AnonymousClass9U5 A06;
    public final AnonymousClass9U4 A07;
    public final AnonymousClass9VU A08;
    public final AnonymousClass9SD A09;

    public void A02(AnonymousClass34V r12, String str) {
        AnonymousClass9A5 r3 = (AnonymousClass9A5) this;
        if (r12 != null || str == null) {
            r3.A05.A00((C133736hr) null, r12);
            return;
        }
        r3.A09.A00(str);
        AnonymousClass9VU r9 = r3.A08;
        C67993Rl A012 = r9.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new C194149Rt(r3.A00, r3.A01, r3.A05, r3.A06, r9, "ADD-CARD").A00(new C204899q6(r3, 2), "FB");
            return;
        }
        r3.A03(r3.A03.A02((C67973Rj) A012.A00, r3.A09));
    }

    public void A00() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        AnonymousClass9VU r8 = this.A08;
        C67993Rl A012 = r8.A01("VISA", "STEP-UP");
        if (A012 == null) {
            new C194149Rt(this.A00, this.A01, this.A05, this.A06, r8, "STEP-UP").A00(new C204899q6(this, 1), "VISA");
            return;
        }
        A01((AnonymousClass34V) null, A012);
    }

    public void A01(AnonymousClass34V r5, C67993Rl r6) {
        AnonymousClass9RK r0;
        AnonymousClass9R5 r02;
        if (this instanceof AnonymousClass9A4) {
            AnonymousClass9A4 r2 = (AnonymousClass9A4) this;
            if (r5 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure ");
                C18260x0.A1K(A0o, r5.A08);
                r02 = r2.A04;
            } else {
                String A032 = r2.A03.A03(r6, r2.A05);
                if (TextUtils.isEmpty(A032)) {
                    Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
                    r02 = r2.A04;
                    r5 = C1899693i.A0M();
                } else {
                    Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
                    r2.A03(A032);
                    return;
                }
            }
            r02.A00(r5);
            return;
        }
        AnonymousClass9A5 r3 = (AnonymousClass9A5) this;
        if (r5 != null) {
            r0 = r3.A05;
        } else {
            String A033 = r3.A03.A03(r6, r3.A09);
            if (TextUtils.isEmpty(A033)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                r0 = r3.A05;
                r5 = C1899693i.A0M();
            } else {
                Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
                r3.A03(A033);
                return;
            }
        }
        r0.A00((C133736hr) null, r5);
    }

    public AnonymousClass9TL(Context context, C69263Wi r2, C56972sr r3, C56612sH r4, AnonymousClass8EA r5, C40602Ha r6, AnonymousClass9U5 r7, AnonymousClass9U4 r8, AnonymousClass9VU r9, AnonymousClass9SD r10) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = r9;
    }
}
