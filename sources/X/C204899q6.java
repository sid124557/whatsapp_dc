package X;

import com.whatsapp.util.Log;

/* renamed from: X.9q6  reason: invalid class name and case insensitive filesystem */
public class C204899q6 implements C203069n4 {
    public Object A00;
    public final int A01;

    public C204899q6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZ3(AnonymousClass34V r4) {
        switch (this.A01) {
            case 0:
                Log.e("PAY: BrazilDeviceRegistrationAction/getPaymentProviderPublicKey iq returned null");
                ((AnonymousClass9S7) this.A00).A00(C1899693i.A0M(), (C67993Rl) null);
                return;
            case 1:
                Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
                ((AnonymousClass9TL) this.A00).A01(C1899693i.A0M(), (C67993Rl) null);
                return;
            default:
                Log.e("PAY: BrazilVerifyCardOTPSendAction/provider key iq returned null");
                AnonymousClass9A5 r1 = (AnonymousClass9A5) this.A00;
                r1.A03(r1.A09);
                return;
        }
    }

    public void BZ4(C67993Rl r5) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass9S7) this.A00).A00((AnonymousClass34V) null, r5);
                return;
            case 1:
                ((AnonymousClass9TL) this.A00).A01((AnonymousClass34V) null, r5);
                return;
            default:
                AnonymousClass9A5 r3 = (AnonymousClass9A5) this.A00;
                r3.A03(r3.A03.A02((C67973Rj) r5.A00, r3.A09));
                return;
        }
    }
}
