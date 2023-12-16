package X;

import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.35M  reason: invalid class name */
public class AnonymousClass35M {
    public final int A00;
    public final C60642yt A01;
    public final AnonymousClass33J A02;
    public final AnonymousClass1EO A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass35M)) {
            return false;
        }
        AnonymousClass35M r4 = (AnonymousClass35M) obj;
        return this.A04.equals(r4.A04) && AnonymousClass75J.A00(this.A03, r4.A03) && this.A01.equals(r4.A01);
    }

    public static String A00(String str) {
        try {
            return new JSONArray(str).getString(0);
        } catch (JSONException unused) {
            throw AnonymousClass001.A0c("SyncMutationData/getValidMutationName: corrupt index");
        }
    }

    public static String[] A01(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        int i = 0;
        while (i < jSONArray.length()) {
            String string = jSONArray.getString(i);
            strArr[i] = string;
            if (!string.isEmpty()) {
                i++;
            } else {
                throw AnonymousClass000.A0G("SyncMutationData/getValidKeyArrayIndex: The key is empty in the keyArray at position: ", AnonymousClass001.A0o(), i);
            }
        }
        if (length > 0) {
            return strArr;
        }
        throw AnonymousClass001.A0c("SyncMutationData/getValidKeyArrayIndex: keyArray length should have action name");
    }

    public AnonymousClass35M(AnonymousClass33W r2) {
        this.A00 = r2.A03;
        this.A04 = r2.A08();
        this.A02 = r2.A00;
        this.A06 = r2.A0C();
        this.A01 = r2.A05;
        this.A03 = r2.A07();
        this.A05 = r2.A02;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A04;
        A1X[1] = this.A03;
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncMutationData{");
        A0o.append("index=");
        A0o.append(this.A04);
        A0o.append(";keyId=");
        A0o.append(this.A02);
        A0o.append(";operation=");
        A0o.append(this.A01);
        A0o.append(";value=");
        AnonymousClass1EO r0 = this.A03;
        if (r0 != null) {
            str = r0.toString().replace("\n", " ");
        } else {
            str = null;
        }
        A0o.append(str);
        A0o.append(";version=");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("}", A0o);
    }

    public AnonymousClass35M(C60642yt r1, AnonymousClass33J r2, AnonymousClass1EO r3, String str, byte[] bArr, String[] strArr, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A02 = r2;
        this.A06 = strArr;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = bArr;
    }

    public AnonymousClass35M(C60642yt r2, AnonymousClass33J r3, String str, byte[] bArr, byte[] bArr2, int i) {
        AnonymousClass1EO r0;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r3;
        this.A06 = A01(str);
        this.A01 = r2;
        if (bArr != null) {
            r0 = (AnonymousClass1EO) C130786cX.A05(AnonymousClass1EO.DEFAULT_INSTANCE, bArr);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A05 = bArr2;
    }
}
