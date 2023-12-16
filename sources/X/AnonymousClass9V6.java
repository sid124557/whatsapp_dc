package X;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.9V6  reason: invalid class name */
public class AnonymousClass9V6 {
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass9U5 A02;

    public static byte[] A00(Boolean bool, Object obj, String str, long j) {
        return A01(bool, obj, str, (String) null, (byte[]) null, new Object[0], j);
    }

    public static byte[] A01(Boolean bool, Object obj, String str, String str2, byte[] bArr, Object[] objArr, long j) {
        String str3;
        String valueOf;
        if (bool == null) {
            str3 = null;
        } else if (bool.booleanValue()) {
            str3 = "PIN";
        } else {
            str3 = "BIO";
        }
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        C18280x3.A19(str, str3, objArr2);
        objArr2[2] = obj;
        AnonymousClass000.A1Q(objArr2, 3, j);
        objArr2[4] = str2;
        objArr2[5] = bArr;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        Object[] objArr3 = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr2[i2];
            if (obj2 == null) {
                valueOf = "";
            } else if (obj2 instanceof String) {
                objArr3[i2] = obj2;
            } else if ((obj2 instanceof Long) || (obj2 instanceof Integer)) {
                valueOf = String.valueOf(obj2);
            } else if (obj2 instanceof byte[]) {
                valueOf = Base64.encodeToString((byte[]) obj2, 2);
            } else {
                throw AnonymousClass001.A0c(C160757oG.A01("PinActions", "getPinNode: should only accept long, int, byte[], and String args"));
            }
            objArr3[i2] = valueOf;
        }
        try {
            return TextUtils.join("|", objArr3).getBytes(C58152un.A0B);
        } catch (UnsupportedEncodingException e) {
            C1899593h.A1Q("PinActions", AnonymousClass000.A0P(e, "constructPayload: UTF-8 not supported: ", AnonymousClass001.A0o()));
            throw new Error(e);
        }
    }

    public AnonymousClass9V6(C56972sr r1, C56612sH r2, AnonymousClass9U5 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
