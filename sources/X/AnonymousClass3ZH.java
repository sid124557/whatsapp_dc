package X;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3ZH  reason: invalid class name */
public class AnonymousClass3ZH implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public C55502qS A0E;
    public C51602k5 A0F;
    public AnonymousClass3ZH A0G;
    public C95814uZ A0H;
    public UserJid A0I;
    public C41822Ls A0J;
    public C60912zN A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public Locale A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    @Deprecated
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (android.text.TextUtils.equals(r3.A0Y, r2.A0Y) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        if (android.text.TextUtils.equals(r3.A0L(), r2.A0L()) == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(X.AnonymousClass2W6 r8, java.util.List r9) {
        /*
            r7 = 0
            if (r9 == 0) goto L_0x00d5
            java.util.Iterator r6 = r9.iterator()
        L_0x0007:
            r7 = 0
        L_0x0008:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d5
            X.3ZH r2 = X.C18310x6.A0R(r6)
            X.3ZH r3 = r8.A00
            if (r2 == r3) goto L_0x0022
            X.4uZ r1 = r3.A0H
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = "wacontact/updatecontact/invalid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0020:
            if (r7 == 0) goto L_0x0007
        L_0x0022:
            r7 = 1
            goto L_0x0008
        L_0x0024:
            X.4uZ r0 = r2.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r8 instanceof X.AnonymousClass1RQ
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = r3.A0X
            java.lang.String r0 = r2.A0X
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r1 = r3.A0Y
            java.lang.String r0 = r2.A0Y
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r5 = 1
        L_0x0046:
            java.lang.String r0 = r3.A0X
            r2.A0X = r0
            long r0 = r3.A0D
            r2.A0D = r0
            java.lang.String r0 = r3.A0Y
            r2.A0Y = r0
        L_0x0052:
            if (r5 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0055:
            boolean r0 = r8 instanceof X.AnonymousClass1RP
            if (r0 == 0) goto L_0x0093
            boolean r0 = r3.A0g
            r2.A0g = r0
            int r4 = r3.A05
            if (r4 <= 0) goto L_0x0065
            int r0 = r2.A05
            if (r0 != r4) goto L_0x0085
        L_0x0065:
            int r1 = r3.A06
            if (r1 <= 0) goto L_0x006d
            int r0 = r2.A06
            if (r0 != r1) goto L_0x0085
        L_0x006d:
            if (r4 != 0) goto L_0x0073
            int r0 = r2.A05
            if (r0 != 0) goto L_0x0085
        L_0x0073:
            if (r1 != 0) goto L_0x0079
            int r0 = r2.A06
            if (r0 != 0) goto L_0x0085
        L_0x0079:
            if (r4 >= 0) goto L_0x007f
            int r0 = r2.A05
            if (r0 > 0) goto L_0x0085
        L_0x007f:
            if (r1 >= 0) goto L_0x0091
            int r0 = r2.A06
            if (r0 <= 0) goto L_0x0091
        L_0x0085:
            r5 = 1
        L_0x0086:
            r2.A05 = r4
            int r0 = r3.A06
            r2.A06 = r0
            long r0 = r3.A0C
            r2.A0C = r0
            goto L_0x0052
        L_0x0091:
            r5 = 0
            goto L_0x0086
        L_0x0093:
            java.lang.String r1 = r3.A0J()
            java.lang.String r0 = r2.A0J()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = r3.A0L()
            java.lang.String r0 = r2.A0L()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x00b1
        L_0x00b0:
            r5 = 1
        L_0x00b1:
            java.lang.String r0 = r3.A0J()
            r2.A0P = r0
            java.lang.String r0 = r3.A0N
            r2.A0N = r0
            java.lang.String r1 = r3.A0L()
            boolean r0 = r2 instanceof X.AnonymousClass1RT
            if (r0 == 0) goto L_0x00d2
            java.lang.String r1 = "Setting verified name for ServerContact not allowed"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x00c9:
            java.util.Locale r0 = r3.A0c
            r2.A0c = r0
            int r0 = r3.A08
            r2.A08 = r0
            goto L_0x0052
        L_0x00d2:
            r2.A0a = r1
            goto L_0x00c9
        L_0x00d5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZH.A0D(X.2W6, java.util.List):boolean");
    }

    public AnonymousClass3ZH A0G() {
        try {
            Object clone = super.clone();
            if (clone instanceof AnonymousClass3ZH) {
                return (AnonymousClass3ZH) clone;
            }
        } catch (CloneNotSupportedException unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3ZH)) {
            return false;
        }
        AnonymousClass3ZH r4 = (AnonymousClass3ZH) obj;
        return AnonymousClass75J.A00(this.A0H, r4.A0H) && AnonymousClass75J.A00(this.A0F, r4.A0F);
    }

    public static C95814uZ A01(AnonymousClass3ZH r1) {
        return (C95814uZ) r1.A0I(C95814uZ.class);
    }

    public static Jid A03(AnonymousClass3ZH r1) {
        return r1.A0I(UserJid.class);
    }

    public static Jid A04(AnonymousClass3ZH r1) {
        return r1.A0I(C27991fJ.class);
    }

    public static UserJid A07(AnonymousClass3ZH r1) {
        return (UserJid) r1.A0I(UserJid.class);
    }

    public static String A08(AnonymousClass3ZH r0) {
        C95814uZ r02 = r0.A0H;
        C626936e.A06(r02);
        return r02.getRawString();
    }

    public static List A09(Collection collection) {
        Class<UserJid> cls = UserJid.class;
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A0I2 = C18310x6.A0R(it).A0I(cls);
                if (A0I2 != null) {
                    A0s2.add(A0I2);
                }
            }
        }
        return A0s2;
    }

    public static void A0A(ContentValues contentValues, AnonymousClass3ZH r3) {
        contentValues.put("display_name", r3.A0J());
    }

    public static void A0B(ContentValues contentValues, AnonymousClass3ZH r3) {
        contentValues.put("given_name", r3.A0R);
        contentValues.put("family_name", r3.A0Q);
    }

    public long A0F() {
        if (this instanceof AnonymousClass1RT) {
            return -2;
        }
        return this.A0A;
    }

    public Jid A0I(Class cls) {
        if (cls.isInstance(this.A0H)) {
            return (Jid) cls.cast(this.A0H);
        }
        return null;
    }

    public String A0J() {
        if (!(this instanceof AnonymousClass1RT)) {
            return this.A0P;
        }
        Context context = ((AnonymousClass1RT) this).A00.A00;
        String str = AnonymousClass1RT.A02;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.f11nameremoved);
        AnonymousClass1RT.A02 = string;
        return string;
    }

    public String A0K() {
        C51602k5 r3 = this.A0F;
        if (r3 == null) {
            return C627336j.A07(this.A0H);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(r3.A00);
        A0o2.append(":");
        return AnonymousClass000.A0X(r3.A01, A0o2);
    }

    public String A0L() {
        if (this instanceof AnonymousClass1RT) {
            return A0J();
        }
        return this.A0a;
    }

    public void A0N(long j) {
        if (this instanceof AnonymousClass1RT) {
            C18260x0.A11("Attempting to set the id of the server contact to=", AnonymousClass001.A0o(), j);
        } else {
            this.A0A = j;
        }
    }

    public void A0O(C60912zN r3) {
        C60912zN r0;
        if (r3 != null && (r0 = this.A0K) != null && !TextUtils.equals(r0.A04, r3.A04)) {
            this.A0K = r3;
        }
    }

    public boolean A0Q() {
        C51602k5 r0 = this.A0F;
        if (r0 == null || TextUtils.isEmpty(r0.A01)) {
            return false;
        }
        return true;
    }

    public boolean A0U() {
        if (this instanceof AnonymousClass1RS) {
            return true;
        }
        C95814uZ r0 = this.A0H;
        if (r0 != null) {
            return C627336j.A0K(r0);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("row_id=");
        A0o2.append(A0F());
        A0o2.append(" jid=");
        A0o2.append("(null)");
        A0o2.append(" key=");
        C51602k5 r2 = this.A0F;
        if (r2 == null) {
            A0o2.append("(null)");
        } else {
            A0o2.append(r2.A00);
            A0o2.append("-");
            A0o2.append(r2.A01);
        }
        A0o2.append(" phone=");
        A0o2.append(this.A0L);
        A0o2.append(" iswa=");
        A0o2.append(this.A10);
        if (A0F() == -1) {
            return false;
        }
        C18260x0.A1O(AnonymousClass001.A0o(), "problematic contact:", A0o2);
        return false;
    }

    public boolean A0V() {
        if (this instanceof AnonymousClass1RT) {
            return true;
        }
        if (!A0R() || !A0P()) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        if (this instanceof AnonymousClass1RT) {
            return true;
        }
        if (!A0U() || !this.A0j) {
            return false;
        }
        return true;
    }

    public boolean A0X(C55682qk r7, C41822Ls r8) {
        int i;
        String str;
        if (r8 == null || !(((i = r8.A00) == 2 || i == 6) && r8.A01 == null)) {
            this.A0J = r8;
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        C95814uZ r2 = this.A0H;
        if (r2 != null) {
            str = r2.toString();
        } else {
            str = "unknown@unknown";
        }
        if (!(r2 instanceof C27991fJ) && !(r2 instanceof C28001fK)) {
            str = String.format(locale, "[obfuscated]@%s", new Object[]{str.substring(str.indexOf("@") + 1)});
        }
        objArr[0] = str;
        String format = String.format(locale, "(manage_community_groups) contact/community_info Detected subgroup '%s' without parent info", objArr);
        Log.e(format);
        r7.A0A("missing_parent_info", true, format);
        return false;
    }

    public AnonymousClass3ZH(C95814uZ r4) {
        this.A0A = -1;
        this.A0g = true;
        this.A0M = "pn";
        this.A0G = null;
        this.A00 = 0;
        this.A0H = r4;
        this.A10 = true;
        this.A0F = null;
        if (C627336j.A0K(r4)) {
            this.A0K = C60912zN.A05;
        }
    }

    public static C95814uZ A02(AnonymousClass3ZH r0, Class cls) {
        Jid A0I2 = r0.A0I(cls);
        C626936e.A06(A0I2);
        return (C95814uZ) A0I2;
    }

    public static Jid A05(AnonymousClass3ZH r0, Class cls) {
        Jid A0I2 = r0.A0I(cls);
        C626936e.A06(A0I2);
        return A0I2;
    }

    public static Jid A06(Iterator it) {
        return ((AnonymousClass3ZH) it.next()).A0I(UserJid.class);
    }

    public static void A0C(AnonymousClass3ZH r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0H);
    }

    public static boolean A0E(AnonymousClass3ZH r0) {
        return TextUtils.isEmpty(r0.A0J());
    }

    public C95814uZ A0H() {
        return this.A0H;
    }

    public String A0M(float f, int i) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(A0K());
        A0o2.append("_");
        A0o2.append(i);
        A0o2.append("_");
        A0o2.append(f);
        return A0o2.toString();
    }

    public boolean A0P() {
        if (!A0R() || this.A08 != 3) {
            return false;
        }
        return true;
    }

    public boolean A0R() {
        int i;
        if (A0L() == null || (i = this.A08) == 0 || i == -1) {
            return false;
        }
        return true;
    }

    public boolean A0S() {
        if (!A0R() || this.A00 != 1) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        if (!A0R() || this.A00 != 2) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] A0M2 = AnonymousClass002.A0M();
        A0M2[0] = this.A0H;
        return C18310x6.A08(this.A0F, A0M2, 1);
    }

    public String toString() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("row_id=");
        A0o2.append(A0F());
        A0o2.append(" jid=");
        C95814uZ r0 = this.A0H;
        if (r0 == null) {
            r0 = "(null)";
        }
        A0o2.append(r0);
        A0o2.append(" key=");
        C51602k5 r2 = this.A0F;
        if (r2 == null) {
            A0o2.append("(null)");
        } else {
            A0o2.append(r2.A00);
            A0o2.append("-");
            C18310x6.A1P(A0o2, r2.A01);
        }
        A0o2.append(" phone=");
        A0o2.append(this.A0L);
        A0o2.append(" iswa=");
        A0o2.append(this.A10);
        if (A0U()) {
            A0o2.append(" status=");
            A0o2.append(this.A0X);
        }
        return A0o2.toString();
    }

    public AnonymousClass3ZH(C95814uZ r5, String str, String str2, String str3, int i, long j, boolean z) {
        int length;
        this.A0A = -1;
        boolean z2 = true;
        this.A0g = true;
        this.A0M = "pn";
        this.A0G = null;
        this.A00 = 0;
        this.A0H = r5;
        this.A10 = z;
        this.A0P = str2;
        if ((j > 0 || j == -2) && str != null && 5 <= (length = str.length()) && length <= 20) {
            this.A0F = new C51602k5(j, str);
        }
        this.A0L = Integer.valueOf(i);
        this.A0V = str3;
        this.A0o = j != -4 ? false : z2;
    }
}
