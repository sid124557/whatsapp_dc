package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.3TG  reason: invalid class name */
public class AnonymousClass3TG implements AnonymousClass4EZ {
    public C56432ry A00;
    public final AnonymousClass31C A01;

    public String A00(byte[] bArr) {
        Log.d("PrivateStatssSnder/requestToSign ");
        if (this.A00 == null) {
            Log.e("PrivateStatsSender/requestToSign need to set iq response listener first");
            return null;
        }
        AnonymousClass31C r5 = this.A01;
        String A03 = r5.A03();
        AnonymousClass36K r3 = new AnonymousClass36K("blinded_credential", bArr, (AnonymousClass39V[]) null);
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean A0F = AnonymousClass39V.A0F("version", "1", r2);
        AnonymousClass36K A0F2 = AnonymousClass36K.A0F(r3, "sign_credential", r2);
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A03, A0F ? 1 : 0);
        AnonymousClass39V.A09("xmlns", "privatestats", A0H);
        if (r5.A0K(this, AnonymousClass36K.A0C(C135206kI.A00, A0F2, A0H), A03, 239, 32000)) {
            return A03;
        }
        Log.e("PrivateStatsSender/requestToSign failed to send iq request");
        return null;
    }

    public void BdM(AnonymousClass36K r12, String str) {
        Log.d("PrivateStatsSender/onSuccess");
        AnonymousClass36K A0m = r12.A0m("sign_credential");
        long A04 = AnonymousClass36K.A04(A0m, "t");
        byte[] bArr = A0m.A0m("signed_credential").A01;
        byte[] bArr2 = A0m.A0m("acs_public_key").A01;
        AnonymousClass36K A0l = A0m.A0l("dleq_proof");
        if (A0l != null) {
            AnonymousClass36K A0m2 = A0l.A0m("c");
            AnonymousClass36K A0m3 = A0l.A0m("s");
            C56432ry r5 = this.A00;
            if (r5 != null) {
                byte[] bArr3 = A0m2.A01;
                byte[] bArr4 = A0m3.A01;
                synchronized (r5) {
                    if (bArr3 != null) {
                        r5.A05.A05("dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        r5.A05.A05("dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        C56432ry r52 = this.A00;
        if (r52 != null) {
            synchronized (r52) {
                Log.d("PrivateStatsToken/onReceiveSignedToken");
                if (!str.equalsIgnoreCase(r52.A0C)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    r52.A02();
                } else if (bArr2 == null || bArr == null) {
                    Log.d("PrivateStatsToken/onReceivedSignedToken public key or signed token is null");
                    r52.A05.A03(10);
                    r52.A06(false, 3);
                } else {
                    r52.A07.BkM(new C71513cE(r52, bArr2, bArr, 5, A04));
                }
            }
        }
    }

    public AnonymousClass3TG(AnonymousClass31C r1) {
        this.A01 = r1;
    }

    public void BQs(String str) {
        C18260x0.A0r("PrivateStatsSender/onDeliveryFailure iqId = ", str, AnonymousClass001.A0o());
        C56432ry r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                C18260x0.A0q("PrivateStats/onSendFailure iqId = ", str, AnonymousClass001.A0o());
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    r2.A05.A03(12);
                    r2.A02();
                } else {
                    r2.A03(5);
                }
            }
        }
    }

    public void BSN(AnonymousClass36K r5, String str) {
        C18260x0.A0r("PrivateStatsSender/onError iqId = ", str, AnonymousClass001.A0o());
        AnonymousClass36K A0m = r5.A0m("error");
        int A02 = AnonymousClass36K.A02(A0m, "code");
        A0m.A0r("text", "");
        C56432ry r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                C18260x0.A0w("PrivateStats/onIqResponseError errCode = ", AnonymousClass001.A0o(), A02);
                if (!str.equalsIgnoreCase(r2.A0C)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    r2.A02();
                } else if (A02 == 500) {
                    r2.A03(3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    r2.A05.A03(11);
                    r2.A06(false, 2);
                }
            }
        }
    }
}
