package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36K  reason: invalid class name */
public class AnonymousClass36K {
    public final String A00;
    public final byte[] A01;
    public final AnonymousClass39V[] A02;
    public final AnonymousClass36K[] A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass36K(AnonymousClass36K r4, String str, AnonymousClass39V[] r6) {
        this(str, (byte[]) null, r6, r4 != null ? new AnonymousClass36K[]{r4} : null);
    }

    public static int A01(AnonymousClass36K r1, String str) {
        return r1.A0b(str, 0);
    }

    public static AnonymousClass36K A0D(AnonymousClass36K r1) {
        return r1.A0k(0);
    }

    public static AnonymousClass36K A0H(String str) {
        return new AnonymousClass36K(str, (AnonymousClass39V[]) null);
    }

    public static String A0K(AnonymousClass36K r2) {
        return r2.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
    }

    public static String A0L(AnonymousClass36K r1, String str) {
        return r1.A0r(str, (String) null);
    }

    public static void A0P(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass36K(str, str2, (AnonymousClass39V[]) null));
    }

    public static void A0T(String str, byte[] bArr, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass36K(str, bArr, (AnonymousClass39V[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r6 == null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x0081
            r8 = 0
            if (r11 == 0) goto L_0x0080
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x0080
            X.36K r11 = (X.AnonymousClass36K) r11
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r11.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.39V[] r5 = r10.A02
            X.39V[] r0 = r11.A02
            if (r5 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0080
            int r4 = r5.length
            int r0 = r0.length
            if (r4 != r0) goto L_0x0080
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x0042
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            java.lang.String r1 = A0L(r11, r0)
            if (r1 == 0) goto L_0x0080
            java.lang.String r0 = r2.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0040:
            if (r0 != 0) goto L_0x0080
        L_0x0042:
            X.36K[] r7 = r10.A03
            X.36K[] r6 = r11.A03
            if (r7 == 0) goto L_0x0064
            if (r6 == 0) goto L_0x0080
            int r5 = r7.length
            int r4 = r6.length
            if (r5 != r4) goto L_0x0080
            r3 = 0
        L_0x004f:
            if (r3 >= r5) goto L_0x0066
            r2 = r7[r3]
            r1 = 0
        L_0x0054:
            if (r1 >= r4) goto L_0x0080
            r0 = r6[r1]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
            int r3 = r3 + 1
            goto L_0x004f
        L_0x0061:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0064:
            if (r6 != 0) goto L_0x0080
        L_0x0066:
            byte[] r3 = r10.A01
            if (r3 == 0) goto L_0x0079
            byte[] r2 = r11.A01
            if (r2 == 0) goto L_0x007e
            int r1 = r3.length
            int r0 = r2.length
            if (r1 != r0) goto L_0x007e
            boolean r0 = java.util.Arrays.equals(r3, r2)
            if (r0 == 0) goto L_0x007e
            return r9
        L_0x0079:
            byte[] r0 = r11.A01
            if (r0 != 0) goto L_0x007e
            return r9
        L_0x007e:
            r9 = 0
            return r9
        L_0x0080:
            return r8
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36K.equals(java.lang.Object):boolean");
    }

    public static int A00(AnonymousClass36K r2) {
        AnonymousClass36K A0l = r2.A0l("error");
        if (A0l != null) {
            return A0l.A0b("code", -2);
        }
        return -2;
    }

    public static long A05(AnonymousClass36K r2, String str) {
        return r2.A0e(str, 0);
    }

    public static Jid A06(AnonymousClass36K r2) {
        return r2.A0g(UserJid.class, "jid");
    }

    public static Jid A07(AnonymousClass36K r2) {
        return r2.A0g(C27991fJ.class, "from");
    }

    public static C27991fJ A08(AnonymousClass36K r2) {
        String A0r = r2.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
        C626936e.A06(A0r);
        return C627336j.A04(A0r);
    }

    public static UserJid A09(AnonymousClass36K r2) {
        return (UserJid) r2.A0g(UserJid.class, "creator");
    }

    public static AnonymousClass3ZC A0B(AnonymousClass36K r4) {
        return new AnonymousClass3ZC(r4.A0r("host_storage", (String) null), r4.A0r("actual_actors", (String) null), r4.A0r("privacy_mode_ts", (String) null));
    }

    public static AnonymousClass36K A0E(AnonymousClass36K r2, String str, String str2, AnonymousClass39V[] r5) {
        r5[3] = new AnonymousClass39V(str, str2);
        return new AnonymousClass36K(r2, "iq", r5);
    }

    public static AnonymousClass36K A0F(AnonymousClass36K r1, String str, AnonymousClass39V[] r3) {
        return new AnonymousClass36K(r1, str, r3);
    }

    public static AnonymousClass36K A0G(AnonymousClass36K r2, AnonymousClass39V[] r3) {
        return new AnonymousClass36K(r2, "iq", r3);
    }

    public static AnonymousClass36K A0I(String str, AnonymousClass39V[] r2) {
        return new AnonymousClass36K(str, r2);
    }

    public static AnonymousClass36K A0J(String str, AnonymousClass39V[] r2, AnonymousClass36K[] r3) {
        return new AnonymousClass36K(str, r2, r3);
    }

    public static void A0O(AnonymousClass36K r1, String str, AbstractCollection abstractCollection, AnonymousClass39V[] r4) {
        abstractCollection.add(new AnonymousClass36K(r1, str, r4));
    }

    public static void A0Q(String str, AbstractCollection abstractCollection, byte[] bArr, AnonymousClass39V[] r4) {
        abstractCollection.add(new AnonymousClass36K(str, bArr, r4));
    }

    public static void A0R(String str, AbstractCollection abstractCollection, AnonymousClass39V[] r3) {
        abstractCollection.add(new AnonymousClass36K(str, r3));
    }

    public static void A0S(String str, AbstractCollection abstractCollection, AnonymousClass39V[] r3, AnonymousClass36K[] r4) {
        abstractCollection.add(new AnonymousClass36K(str, r3, r4));
    }

    public static void A0U(String str, AnonymousClass39V[] r2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass36K(str, r2);
    }

    public static boolean A0W(AnonymousClass36K r0, String str) {
        if (r0 == null || !r0.A00.equals(str)) {
            return false;
        }
        return true;
    }

    public static byte[] A0Y(AnonymousClass36K r3, int i) {
        byte[] bArr = r3.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i) {
                return bArr;
            }
            StringBuilder A0k = AnonymousClass000.A0k(r3, "failed require. node ");
            A0k.append(" data length ");
            A0k.append(length);
            throw AnonymousClass24Y.A01(AnonymousClass000.A0Y(" != required length ", A0k, i));
        }
        throw AnonymousClass24Y.A01(AnonymousClass000.A0X(" missing data", AnonymousClass000.A0k(r3, "failed require. node ")));
    }

    public AnonymousClass39V A0i(String str) {
        int length;
        AnonymousClass39V[] r4 = this.A02;
        if (r4 == null || (length = r4.length) <= 0) {
            return null;
        }
        int i = 0;
        do {
            AnonymousClass39V r1 = r4[i];
            if (TextUtils.equals(str, r1.A02)) {
                return r1;
            }
            i++;
        } while (i < length);
        return null;
    }

    public AnonymousClass36K A0j() {
        AnonymousClass36K[] r1 = this.A03;
        if (r1 != null && r1.length != 0) {
            return r1[0];
        }
        throw AnonymousClass24Y.A00(this, "required first child missing for tag ", AnonymousClass001.A0o());
    }

    public AnonymousClass36K A0k(int i) {
        AnonymousClass36K[] r1 = this.A03;
        if (r1 == null || r1.length <= i) {
            return null;
        }
        return r1[i];
    }

    public AnonymousClass36K A0l(String str) {
        AnonymousClass36K[] r5 = this.A03;
        if (r5 != null) {
            for (AnonymousClass36K r1 : r5) {
                if (TextUtils.equals(str, r1.A00)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public String A0n() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return null;
        }
        try {
            return C18320x8.A0h(bArr);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public List A0s(String str) {
        AnonymousClass36K[] r5 = this.A03;
        if (r5 == null) {
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass36K r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                A0s.add(r1);
            }
        }
        return A0s;
    }

    public AnonymousClass39V[] A0u() {
        AnonymousClass39V[] r1 = this.A02;
        if (r1 == null || r1.length != 0) {
            return r1;
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.A00.hashCode() + 31) * 31;
        byte[] bArr = this.A01;
        int i2 = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i3 = (hashCode2 + hashCode) * 31;
        AnonymousClass36K[] r4 = this.A03;
        if (r4 == null) {
            i = 0;
        } else {
            i = 0;
            for (AnonymousClass36K r0 : r4) {
                if (r0 != null) {
                    i = AnonymousClass002.A02(r0, i);
                }
            }
        }
        int i4 = (i3 + i) * 31;
        AnonymousClass39V[] r3 = this.A02;
        if (r3 != null) {
            for (AnonymousClass39V r02 : r3) {
                if (r02 != null) {
                    i2 = AnonymousClass002.A02(r02, i2);
                }
            }
        }
        return i4 + i2;
    }

    public static int A02(AnonymousClass36K r1, String str) {
        return r1.A0c(r1.A0q(str), str);
    }

    public static long A03(AnonymousClass36K r3) {
        return 1000 * r3.A0f(r3.A0q("t"), "t");
    }

    public static long A04(AnonymousClass36K r1, String str) {
        return r1.A0f(r1.A0q(str), str);
    }

    public static UserJid A0A(AnonymousClass36K r0, Class cls, String str) {
        return (UserJid) r0.A0g(cls, str);
    }

    public static AnonymousClass36K A0C(Jid jid, AnonymousClass36K r3, AnonymousClass39V[] r4) {
        r4[3] = new AnonymousClass39V(jid, "to");
        return new AnonymousClass36K(r3, "iq", r4);
    }

    public static Iterator A0M(AnonymousClass36K r0, String str) {
        return r0.A0s(str).iterator();
    }

    public static void A0N(AnonymousClass36K r2, String str) {
        String str2;
        if (!A0W(r2, str)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("failed requireTag: expected: ");
            A0o.append(str);
            A0o.append(", actual: ");
            if (r2 != null) {
                str2 = r2.A00;
            } else {
                str2 = "null";
            }
            throw AnonymousClass24Y.A01(AnonymousClass000.A0X(str2, A0o));
        }
    }

    public static boolean A0V(AnonymousClass36K r0, String str) {
        if (r0.A0l(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean A0X(AnonymousClass36K r0, String str, String str2) {
        return "true".equals(r0.A0r(str, str2));
    }

    public static String[] A0Z(AnonymousClass36K r0, String str) {
        A0N(r0, str);
        return new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
    }

    public int A0a(String str) {
        return A02(this, str);
    }

    public int A0b(String str, int i) {
        String A0L = A0L(this, str);
        if (A0L == null) {
            return i;
        }
        return A0c(A0L, str);
    }

    public int A0c(String str, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("attribute ");
            A0o.append(str2);
            A0o.append(" for tag ");
            A0o.append(this.A00);
            throw AnonymousClass24Y.A02(" is not integral: ", str, A0o);
        }
    }

    public long A0d(String str) {
        return A04(this, str);
    }

    public long A0e(String str, long j) {
        String A0L = A0L(this, str);
        if (A0L == null) {
            return j;
        }
        return A0f(A0L, str);
    }

    public long A0f(String str, String str2) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("attribute ");
            A0o.append(str2);
            A0o.append(" for tag ");
            A0o.append(this.A00);
            throw AnonymousClass24Y.A02(" is not integral: ", str, A0o);
        }
    }

    public Jid A0g(Class cls, String str) {
        Jid jid;
        AnonymousClass39V A0i = A0i(str);
        if (!((A0i == null || (jid = A0i.A01) == null) && (jid = AnonymousClass32W.A00(A0r(str, (String) null))) == null) && !jid.isProtocolCompliant()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ProtocolTreeNode/getAttributeJid invalid jid, Jid: '");
            A0o.append(jid);
            A0o.append("' key: '");
            A0o.append(str);
            A0o.append("' tag: '");
            A0o.append(this.A00);
            C18260x0.A1K(A0o, "'");
        }
        if (cls == DeviceJid.class && (jid instanceof UserJid)) {
            jid = DeviceJid.of(jid);
        }
        try {
            return (Jid) cls.cast(jid);
        } catch (ClassCastException e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ProtocolTreeNode/getAttributeJid/failed to convert '");
            A0o2.append(jid);
            A0o2.append("' to ");
            C18260x0.A15(cls.getName(), A0o2, e);
            return null;
        }
    }

    public Jid A0h(Class cls, String str) {
        Jid A0g = A0g(cls, str);
        if (A0g != null) {
            return A0g;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("required attribute '");
        A0o.append(str);
        throw AnonymousClass24Y.A00(this, "' missing for tag ", A0o);
    }

    public AnonymousClass36K A0m(String str) {
        AnonymousClass36K A0l = A0l(str);
        if (A0l != null) {
            return A0l;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("required child ");
        A0o.append(str);
        throw AnonymousClass24Y.A00(this, " missing for tag ", A0o);
    }

    public String A0o() {
        return this.A00;
    }

    public String A0p(String str) {
        return A0L(this, str);
    }

    public String A0q(String str) {
        String A0L = A0L(this, str);
        if (A0L != null) {
            return A0L;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("required attribute '");
        A0o.append(str);
        throw AnonymousClass24Y.A00(this, "' missing for tag ", A0o);
    }

    public String A0r(String str, String str2) {
        AnonymousClass39V A0i = A0i(str);
        if (A0i != null) {
            return A0i.A03;
        }
        return str2;
    }

    public byte[] A0t() {
        return this.A01;
    }

    public String toString() {
        String str;
        boolean z;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("<");
        String str3 = this.A00;
        A0o.append(str3);
        AnonymousClass39V[] r4 = this.A02;
        if (r4 == null) {
            r4 = new AnonymousClass39V[0];
        }
        for (AnonymousClass39V r1 : r4) {
            AnonymousClass001.A1L(A0o);
            A0o.append(r1.A02);
            A0o.append("='");
            A0o.append(r1.A03);
            A0o.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A03 == null) {
            str = "/>";
        } else {
            str = ">";
            A0o.append(str);
            AnonymousClass36K[] r2 = this.A03;
            if (r2 == null) {
                r2 = new AnonymousClass36K[0];
            }
            for (AnonymousClass36K r0 : r2) {
                if (r0 != null) {
                    AnonymousClass000.A1B(r0, A0o);
                }
            }
            if (bArr != null) {
                try {
                    C58152un.A0D.newDecoder().decode(ByteBuffer.wrap(bArr));
                    z = true;
                } catch (CharacterCodingException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        str2 = C18320x8.A0h(bArr);
                    } catch (UnsupportedEncodingException unused2) {
                        str2 = null;
                    }
                } else {
                    str2 = C18290x4.A0t(bArr);
                }
                A0o.append(str2);
            }
            A0o.append("</");
            A0o.append(str3);
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public AnonymousClass36K(String str, AnonymousClass39V[] r3) {
        this(str, (byte[]) null, r3, (AnonymousClass36K[]) null);
    }

    public AnonymousClass36K(String str, byte[] bArr, AnonymousClass39V[] r4, AnonymousClass36K[] r5) {
        C626936e.A06(str);
        this.A00 = str;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = bArr;
        if (r5 != null && bArr != null) {
            throw AnonymousClass001.A0c("node may not have both data and children");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass36K(String str, String str2, AnonymousClass39V[] r5) {
        this(str, str2 != null ? str2.getBytes() : null, r5, (AnonymousClass36K[]) null);
    }

    public AnonymousClass36K(String str, byte[] bArr, AnonymousClass39V[] r4) {
        this(str, bArr, r4, (AnonymousClass36K[]) null);
    }

    public AnonymousClass36K(String str, AnonymousClass39V[] r3, AnonymousClass36K[] r4) {
        this(str, (byte[]) null, r3, r4);
    }
}
