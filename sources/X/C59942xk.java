package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.2xk  reason: invalid class name and case insensitive filesystem */
public class C59942xk {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59942xk)) {
            return false;
        }
        C59942xk r7 = (C59942xk) obj;
        return r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public C59942xk(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        this.A00 = A1H.getInt("update_count");
        this.A01 = A1H.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A1S(A0M, this.A01);
        AnonymousClass000.A1M(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public C59942xk(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
