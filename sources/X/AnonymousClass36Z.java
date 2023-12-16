package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.36Z  reason: invalid class name */
public class AnonymousClass36Z {
    public static final AnonymousClass39V[] A00 = new AnonymousClass39V[0];

    public static AnonymousClass36K A00(C95814uZ r8, C95814uZ r9, Integer num, String str, String str2, String str3, String str4) {
        C95814uZ r7 = r8;
        boolean z = r9 instanceof AnonymousClass1fI;
        C95814uZ r6 = r8;
        if (z) {
            r6 = r9;
        }
        C626936e.A06(r6);
        if (!z) {
            r7 = r9;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, A0s);
        if (num != null) {
            AnonymousClass39V.A03("reason", String.valueOf(num), A0s);
        }
        if (str2 != null) {
            AnonymousClass39V.A03("sub-type", str2, A0s);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass36K A0I = AnonymousClass36K.A0I("error", (AnonymousClass39V[]) A0s.toArray(A00));
        AnonymousClass39V[] A08 = A08(r6, r7, (UserJid) null, str, "error", (String) null);
        A0s2.add(A0I);
        if (str4 != null) {
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            AnonymousClass39V.A0B("reason", str4, A1V, 0);
            AnonymousClass36K.A0R("biz", A0s2, A1V);
        }
        return AnonymousClass36K.A0J("receipt", A08, C18280x3.A1a(A0s2, 0));
    }

    public static AnonymousClass36K A02(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3) {
        AnonymousClass36K[] r4 = new AnonymousClass36K[1];
        AnonymousClass39V[] r1 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F("call-id", str2, r1);
        AnonymousClass39V.A02(deviceJid2, "call-creator", r1, 1);
        AnonymousClass36K.A0U(str3, r1, r4, A0F ? 1 : 0);
        AnonymousClass39V[] r12 = new AnonymousClass39V[2];
        AnonymousClass39V.A02(deviceJid, "to", r12, A0F);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r12, 1);
        return AnonymousClass36K.A0J("receipt", r12, r4);
    }

    public static AnonymousClass36K A03(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3, byte[] bArr, byte b) {
        int i = 2;
        if (bArr == null) {
            i = 1;
        }
        AnonymousClass36K[] r2 = new AnonymousClass36K[i];
        int i2 = 3;
        AnonymousClass39V[] r7 = new AnonymousClass39V[3];
        boolean A0F = AnonymousClass39V.A0F("call-id", str2, r7);
        AnonymousClass39V.A02(deviceJid2, "call-creator", r7, 1);
        AnonymousClass39V.A0B("count", String.valueOf(b), r7, 2);
        AnonymousClass36K.A0U("enc_rekey", r7, r2, A0F ? 1 : 0);
        if (bArr != null) {
            AnonymousClass36K.A0T("registration", bArr, r2, 1);
        }
        if (str3 == null) {
            i2 = 2;
        }
        AnonymousClass39V[] r1 = new AnonymousClass39V[i2];
        AnonymousClass39V.A02(deviceJid, "to", r1, A0F);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r1, 1);
        if (str3 != null) {
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, r1, 2);
        }
        return AnonymousClass36K.A0J("receipt", r1, r2);
    }

    public static AnonymousClass36K[] A09(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        AnonymousClass36K[] r5 = new AnonymousClass36K[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass39V[] r2 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr[i], r2, 0);
            AnonymousClass36K.A0U("item", r2, r5, i);
        }
        return new AnonymousClass36K[]{AnonymousClass36K.A0J("list", (AnonymousClass39V[]) null, r5)};
    }

    public static AnonymousClass36K A01(C95814uZ r3, DeviceJid deviceJid, UserJid userJid, AnonymousClass2z0 r6, String str, String[] strArr) {
        Pair A05 = C626635z.A05(deviceJid, r6.A00, r3);
        return AnonymousClass36K.A0J("receipt", A08((Jid) A05.first, (Jid) A05.second, userJid, r6.A01, str, (String) null), A09(strArr));
    }

    public static AnonymousClass36K A04(AnonymousClass2U5 r22) {
        AnonymousClass2U5 r2 = r22;
        Jid jid = r2.A05;
        String str = r2.A0B;
        Jid jid2 = r2.A06;
        UserJid userJid = r2.A07;
        int i = r2.A01;
        long j = r2.A04;
        byte[] bArr = r2.A0E;
        byte[] bArr2 = r2.A0D;
        byte b = r2.A00;
        C42612Ov r15 = r2.A09;
        C42612Ov r3 = r2.A08;
        byte[] bArr3 = r2.A0C;
        String str2 = r2.A0A;
        int i2 = r2.A02;
        Jid jid3 = jid2;
        if (!(jid2 instanceof AnonymousClass1fI)) {
            jid3 = jid;
            jid = jid2;
        }
        AnonymousClass39V[] A08 = A08(jid3, jid, userJid, str, "retry", str2);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass39V.A03("v", "1", A0s2);
        AnonymousClass39V.A03("count", String.valueOf(i), A0s2);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0s2);
        AnonymousClass39V.A03("t", String.valueOf(C18290x4.A0B(j)), A0s2);
        A0s2.add(new AnonymousClass39V("error", i2));
        AnonymousClass36K.A0R("retry", A0s, (AnonymousClass39V[]) A0s2.toArray(A00));
        AnonymousClass36K.A0Q("registration", A0s, bArr, (AnonymousClass39V[]) null);
        if (!(bArr2 == null || r15 == null || r3 == null)) {
            AnonymousClass36K[] r8 = new AnonymousClass36K[3];
            AnonymousClass36K.A0T(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r15.A01, r8, 0);
            r8[1] = new AnonymousClass36K("value", r15.A00, (AnonymousClass39V[]) null);
            r8[2] = new AnonymousClass36K(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r15.A02, (AnonymousClass39V[]) null);
            AnonymousClass36K A0J = AnonymousClass36K.A0J("skey", (AnonymousClass39V[]) null, r8);
            AnonymousClass36K[] r1 = new AnonymousClass36K[2];
            AnonymousClass36K.A0T(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A01, r1, 0);
            AnonymousClass36K.A0T("value", r3.A00, r1, 1);
            AnonymousClass36K A0J2 = AnonymousClass36K.A0J("key", (AnonymousClass39V[]) null, r1);
            ArrayList A0s3 = AnonymousClass001.A0s();
            AnonymousClass36K.A0Q("identity", A0s3, bArr2, (AnonymousClass39V[]) null);
            AnonymousClass36K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0s3, new byte[]{b}, (AnonymousClass39V[]) null);
            A0s3.add(A0J2);
            A0s3.add(A0J);
            if (bArr3 != null) {
                AnonymousClass36K.A0Q("device-identity", A0s3, bArr3, (AnonymousClass39V[]) null);
            }
            AnonymousClass36K.A0S("keys", A0s, (AnonymousClass39V[]) null, C18280x3.A1a(A0s3, 0));
        }
        return AnonymousClass36K.A0J("receipt", A08, C18280x3.A1a(A0s, 0));
    }

    public static AnonymousClass36K A05(C624134x r8) {
        String str;
        UserJid userJid;
        boolean z = r8.A1W;
        if (z) {
            str = "sender";
        } else if (r8 instanceof AnonymousClass4B5) {
            str = ((AnonymousClass4B5) r8).B9c();
        } else {
            str = null;
        }
        AnonymousClass2z0 r5 = r8.A1J;
        C95814uZ A0n = r8.A0n();
        if (z) {
            C95814uZ r1 = r5.A00;
            if (!(r1 instanceof C28011fL)) {
                userJid = AnonymousClass32Y.A03(r1);
                return A01(A0n, r8.A1R, userJid, r5, str, (String[]) null);
            }
        }
        userJid = null;
        return A01(A0n, r8.A1R, userJid, r5, str, (String[]) null);
    }

    public static AnonymousClass36K A06(AnonymousClass36K r7, AnonymousClass39T r8) {
        String str;
        Jid jid = r8.A02;
        String str2 = r8.A05;
        if (!"receipt".equals(str2) || !"delivery".equals(r8.A08)) {
            str = r8.A08;
        } else {
            str = null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        String str3 = r8.A07;
        if (str3 != null) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, A0s);
        } else {
            C626936e.A0D(false, "received stanza with null id");
        }
        if (jid != null) {
            AnonymousClass39V.A01(jid, "to", A0s);
        }
        if (str2 != null) {
            AnonymousClass39V.A03("class", str2, A0s);
        } else {
            C626936e.A0D(false, "received stanza with null class");
        }
        if (str != null) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A0s);
        }
        Jid jid2 = r8.A01;
        if (jid2 != null) {
            AnonymousClass39V.A01(jid2, "participant", A0s);
        }
        UserJid userJid = r8.A03;
        if (userJid != null) {
            AnonymousClass39V.A01(userJid, "recipient", A0s);
        }
        String str4 = r8.A06;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            AnonymousClass39V.A03("edit", str4, A0s);
        }
        List list = r8.A09;
        if (list != null) {
            A0s.addAll(list);
        }
        return AnonymousClass36K.A0J("ack", C18300x5.A1Z(A0s, 0), r7 == null ? null : new AnonymousClass36K[]{r7});
    }

    public static AnonymousClass39V[] A07(C95814uZ r2, C95814uZ r3, String str, String str2, String str3) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A01(r2, "to", A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, A0s);
        if (r3 != null) {
            AnonymousClass39V.A01(r3, "participant", A0s);
        }
        if (str2 != null) {
            AnonymousClass39V.A03("category", str2, A0s);
        }
        return (AnonymousClass39V[]) A0s.toArray(A00);
    }

    public static AnonymousClass39V[] A08(Jid jid, Jid jid2, UserJid userJid, String str, String str2, String str3) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A01(jid, "to", A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0s);
        if (str2 != null) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, A0s);
        }
        if (jid2 != null) {
            AnonymousClass39V.A01(jid2, "participant", A0s);
        }
        if (userJid != null) {
            AnonymousClass39V.A01(userJid, "recipient", A0s);
        }
        if (str3 != null) {
            AnonymousClass39V.A03("category", str3, A0s);
        }
        return (AnonymousClass39V[]) A0s.toArray(A00);
    }
}
