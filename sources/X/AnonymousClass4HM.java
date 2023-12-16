package X;

import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.4HM  reason: invalid class name */
public class AnonymousClass4HM extends C54252oQ {
    public Object A00;
    public final int A01;

    public AnonymousClass4HM(AnonymousClass30X r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static void A00(AnonymousClass30X r1, Object obj, Map map, int i) {
        map.put(obj, new AnonymousClass4HM(r1, i));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [byte[][], java.io.Serializable] */
    public void A02(AnonymousClass36K r16) {
        int i;
        C83904Ag r10;
        Message A0J;
        int i2;
        AnonymousClass36K r1 = r16;
        switch (this.A01) {
            case 0:
                AnonymousClass36K.A0N(AnonymousClass36K.A0D(r1), "remove");
                C60592yo r12 = ((AnonymousClass30X) this.A00).A09;
                Log.i("ConnectionThreadRequestsImpl/removeaccount");
                r10 = r12.A01;
                i2 = 12;
                break;
            case 1:
                return;
            case 2:
                AnonymousClass36K A0l = r1.A0l("props");
                if (A0l != null) {
                    C60592yo r13 = ((AnonymousClass30X) this.A00).A09;
                    Log.i("ConnectionThreadRequestsImpl/server-props");
                    r10 = r13.A01;
                    A0J = C18290x4.A0J(174, A0l);
                    break;
                } else {
                    return;
                }
            case 3:
                AnonymousClass36K A0m = r1.A0m("digest");
                AnonymousClass36K A0m2 = A0m.A0m("registration");
                AnonymousClass36K A0m3 = A0m.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                AnonymousClass36K A0m4 = A0m.A0m("skey").A0m(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                AnonymousClass36K A0m5 = A0m.A0m("list");
                AnonymousClass36K A0m6 = A0m.A0m("hash");
                AnonymousClass36K[] r122 = A0m5.A03;
                if (r122 != null) {
                    i = r122.length;
                } else {
                    i = 0;
                }
                ? r6 = new byte[i][];
                for (int i3 = 0; i3 < i; i3++) {
                    AnonymousClass36K.A0N(r122[i3], PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    r6[i3] = AnonymousClass36K.A0Y(r122[i3], 3);
                }
                C60592yo r14 = ((AnonymousClass30X) this.A00).A09;
                byte[] A0Y = AnonymousClass36K.A0Y(A0m2, 4);
                byte b = AnonymousClass36K.A0Y(A0m3, 1)[0];
                byte[] A0Y2 = AnonymousClass36K.A0Y(A0m4, 3);
                byte[] A0Y3 = AnonymousClass36K.A0Y(A0m6, 20);
                Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-digest");
                r10 = r14.A01;
                Bundle A08 = AnonymousClass002.A08();
                A08.putByteArray("registration", A0Y);
                A08.putByte(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, b);
                A08.putByteArray("signedKeyId", A0Y2);
                A08.putSerializable("keyIds", r6);
                A08.putByteArray("hash", A0Y3);
                A0J = C18290x4.A0J(82, A08);
                break;
            case 4:
                Log.i("ConnectionWriter/Connection/sendClearFbnsToken/successfully cleared");
                return;
            case 5:
                AnonymousClass36K A0D = AnonymousClass36K.A0D(r1);
                AnonymousClass36K.A0N(A0D, "normalize");
                String A0r = A0D.A0r("result", (String) null);
                C60592yo r2 = ((AnonymousClass30X) this.A00).A09;
                C18260x0.A0s("ConnectionThreadRequestsImpl/on-number-normalized=", A0r, AnonymousClass001.A0o());
                AnonymousClass0x7.A19(r2.A01, A0r, 198);
                return;
            default:
                Log.i("ConnectionWriter/change number succeeded");
                AnonymousClass36K.A0N(AnonymousClass36K.A0D(r1), "modify");
                C60592yo r15 = ((AnonymousClass30X) this.A00).A09;
                Log.i("ConnectionThreadRequestsImpl/on-change-number-success");
                r10 = r15.A01;
                i2 = 200;
                break;
        }
        A0J = AnonymousClass0x7.A0G(i2);
        r10.Bfr(A0J);
    }
}
