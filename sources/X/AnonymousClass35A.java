package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.35A  reason: invalid class name */
public class AnonymousClass35A {
    public static final AnonymousClass39V[] A00 = new AnonymousClass39V[0];

    public static AnonymousClass36K A00(C45442a1 r8, int i) {
        int i2 = r8.A01;
        return new AnonymousClass36K("enc", r8.A02, (AnonymousClass39V[]) A03((Integer) null, A02(r8.A00), (String) null, (String) null, i2, i, false).toArray(A00));
    }

    public static AnonymousClass36K A01(C45442a1 r7, Integer num, String str, String str2, int i, boolean z) {
        int i2 = r7.A01;
        String A02 = A02(r7.A00);
        return new AnonymousClass36K("enc", r7.A02, (AnonymousClass39V[]) A03(num, A02, str, str2, i2, i, z).toArray(A00));
    }

    public static String A02(int i) {
        if (i == 0) {
            return "msg";
        }
        if (i == 1) {
            return "pkmsg";
        }
        if (i == 2) {
            return "skmsg";
        }
        if (i == 3) {
            return "frskmsg";
        }
        if (i == 4) {
            return "msmsg";
        }
        throw AnonymousClass000.A0G("Unsupported ciphertext type ", AnonymousClass001.A0o(), i);
    }

    public static List A03(Integer num, String str, String str2, String str3, int i, int i2, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("v", Integer.toString(i), A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A0s);
        if (i2 != 0) {
            AnonymousClass39V.A03("count", String.valueOf(i2), A0s);
        }
        if (str2 != null) {
            AnonymousClass39V.A03("mediatype", str2, A0s);
        }
        if (str3 != null) {
            AnonymousClass39V.A03("native_flow_name", str3, A0s);
        }
        if (num != null && num.intValue() > 0) {
            AnonymousClass39V.A03("duration", String.valueOf(num), A0s);
        }
        if (z) {
            AnonymousClass39V.A03("decrypt-fail", "hide", A0s);
        }
        return A0s;
    }
}
