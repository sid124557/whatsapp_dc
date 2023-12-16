package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.3TF  reason: invalid class name */
public class AnonymousClass3TF implements AnonymousClass4EZ {
    public C54162oH A00;
    public final AnonymousClass31C A01;

    public String A00(byte[] bArr, String str) {
        Log.d("ACSSender/request to sign");
        if (this.A00 == null) {
            Log.e("ACSSender/requestToSign need to set iq response listener first");
            return null;
        }
        AnonymousClass31C r9 = this.A01;
        String A03 = r9.A03();
        AnonymousClass36K r8 = new AnonymousClass36K("blinded_credential", bArr, (AnonymousClass39V[]) null);
        AnonymousClass36K r3 = new AnonymousClass36K("project_name", str, (AnonymousClass39V[]) null);
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        int A0F = AnonymousClass39V.A0F("version", "2", r2);
        AnonymousClass36K[] r1 = new AnonymousClass36K[2];
        r1[A0F] = r8;
        r1[1] = r3;
        AnonymousClass36K A0J = AnonymousClass36K.A0J("sign_credential", r2, r1);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0B("xmlns", "privatestats", A1W, A0F);
        AnonymousClass39V.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, A1W, 1, 2);
        if (r9.A0K(this, AnonymousClass36K.A0C(C135206kI.A00, A0J, A1W), A03, 278, 32000)) {
            return A03;
        }
        Log.e("ACSSender/requestToSign failed to send iq request");
        return null;
    }

    public void BdM(AnonymousClass36K r9, String str) {
        Log.d("ACSSender/onSuccess");
        AnonymousClass36K A0m = r9.A0m("sign_credential");
        long A04 = AnonymousClass36K.A04(A0m, "t");
        byte[] bArr = A0m.A0m("signed_credential").A01;
        byte[] bArr2 = A0m.A0m("acs_public_key").A01;
        AnonymousClass36K A0l = A0m.A0l("dleq_proof");
        if (A0l != null) {
            A0l.A0m("c");
            A0l.A0m("s");
        }
        C54162oH r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                Log.d("ACSToken/onReceiveSignedToken");
                if (!str.equalsIgnoreCase(r2.A0E)) {
                    Log.e("ACSToken/onReceiveSignedToken iq requests messed up, reset");
                    r2.A00();
                } else if (bArr2 == null || bArr == null) {
                    Log.d("ACSToken/onReceivedSignedToken public key or signed token is null");
                    r2.A05.A01(10);
                    r2.A02(false);
                } else {
                    r2.A09.execute(new C71513cE(r2, bArr2, bArr, 1, A04));
                }
            }
        }
    }

    public AnonymousClass3TF(AnonymousClass31C r1) {
        this.A01 = r1;
    }

    public void BQs(String str) {
        C18260x0.A0r("ACSSender/onDeliveryFailure iqId = ", str, AnonymousClass001.A0o());
        C54162oH r2 = this.A00;
        if (r2 != null) {
            C18260x0.A0q("ACSToken/onSendFailure iqId = ", str, AnonymousClass001.A0o());
            if (!str.equalsIgnoreCase(r2.A0E)) {
                Log.e("ACSToken/onSendFailure mismatched iq id, reset");
                r2.A05.A01(12);
                r2.A00();
                return;
            }
            r2.A01(5);
        }
    }

    public void BSN(AnonymousClass36K r5, String str) {
        C18260x0.A0r("ACSSender/onError iqId = ", str, AnonymousClass001.A0o());
        AnonymousClass36K A0m = r5.A0m("error");
        int A02 = AnonymousClass36K.A02(A0m, "code");
        A0m.A0r("text", "");
        C54162oH r2 = this.A00;
        if (r2 != null) {
            C18260x0.A0w("ACSToken/onIqResponseError errCode = ", AnonymousClass001.A0o(), A02);
            if (!str.equalsIgnoreCase(r2.A0E)) {
                Log.e("ACSToken/onIqResponseError mismatched iq id, reset");
                r2.A00();
            } else if (A02 == 500) {
                r2.A01(3);
            } else {
                Log.e("ACSToken/onIqResponseError iq errors, stop attempting to send iq");
                r2.A05.A01(11);
                r2.A02(false);
            }
        }
    }
}
