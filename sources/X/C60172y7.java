package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2y7  reason: invalid class name and case insensitive filesystem */
public class C60172y7 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60172y7)) {
            return false;
        }
        C60172y7 r7 = (C60172y7) obj;
        return Arrays.equals(this.A04, r7.A04) && Arrays.equals(this.A03, r7.A03) && AnonymousClass75J.A00(this.A02, r7.A02) && AnonymousClass75J.A00(this.A01, r7.A01) && this.A00 == r7.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        C18300x5.A1R(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public static C60172y7 A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            byte[] decode = Base64.decode(A1H.getString("wrappedCompanionEphemeralPubBase64"), 2);
            byte[] A1S = AnonymousClass0x9.A1S("companionServerAuthKeyPubBase64", A1H, 2);
            String string = A1H.getString("linkCodePairingRef");
            if (A1H.opt("companionPlatformId") != null) {
                str2 = A1H.getString("companionPlatformId");
            } else {
                str2 = null;
            }
            return new C60172y7(string, str2, decode, A1S, A1H.getLong("expirationTsMs"));
        } catch (IllegalArgumentException | JSONException e) {
            Log.e("CompanionHelloInfoManager/fromJsonString error", e);
            return null;
        }
    }

    public C60172y7(String str, String str2, byte[] bArr, byte[] bArr2, long j) {
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
