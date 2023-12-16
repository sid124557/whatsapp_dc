package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4VN  reason: invalid class name */
public final class AnonymousClass4VN extends C05550Ty {
    public UserJid A00;
    public String A01;
    public String A02;
    public String A03 = "pincode";
    public final C06270Wx A04;
    public final AnonymousClass08M A05;
    public final C48372en A06;
    public final C155027eA A07;
    public final C64773Ex A08;
    public final C56422rx A09;
    public final AnonymousClass5ZU A0A;
    public final AnonymousClass4UC A0B;
    public final AnonymousClass4UC A0C;

    public final void A0E() {
        String str;
        C150477Qw A0D;
        Object[] A0L;
        int i;
        Object[] A0L2;
        int i2;
        Object[] A0L3;
        int i3;
        AnonymousClass08M r2 = this.A05;
        String str2 = this.A02;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        boolean z = !A0F(A00(str2));
        C48372en r4 = this.A06;
        if (!r4.A01()) {
            A0D = AnonymousClass4L0.A0N(new Object[0], R.string.f11nameremoved);
        } else {
            A0D = A0D();
        }
        String str3 = this.A01;
        if (str3 == null) {
            str3 = "";
        }
        AnonymousClass7Y0 r5 = new AnonymousClass7Y0(A0D, str3);
        if (!r4.A01()) {
            A0L = new Object[0];
            i = R.string.f11nameremoved;
        } else {
            A0L = AnonymousClass002.A0L();
            A0L[0] = A0D();
            i = R.string.f11nameremoved;
        }
        C137946pW A0N = AnonymousClass4L0.A0N(A0L, i);
        if (!r4.A01()) {
            A0L2 = new Object[0];
            i2 = R.string.f11nameremoved;
        } else {
            A0L2 = AnonymousClass002.A0L();
            A0L2[0] = A0D();
            i2 = R.string.f11nameremoved;
        }
        C137946pW A0N2 = AnonymousClass4L0.A0N(A0L2, i2);
        if (!r4.A01()) {
            A0L3 = new Object[0];
            i3 = R.string.f11nameremoved;
        } else {
            A0L3 = AnonymousClass002.A0L();
            A0L3[0] = A0D();
            i3 = R.string.f11nameremoved;
        }
        r2.A0H(new C104865Sq(r5, A0N, A0N2, AnonymousClass4L0.A0N(A0L3, i3), str, z));
    }

    public static final String A00(String str) {
        String A002;
        if (str == null || (A002 = AnonymousClass2AB.A00(str)) == null) {
            return null;
        }
        return C175738Zn.A0U(A002, "-", "", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return X.AnonymousClass4L0.A0N(new java.lang.Object[0], r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0 == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C150477Qw A0D() {
        /*
            r3 = this;
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case -2053263135: goto L_0x001e;
                case -129639349: goto L_0x0028;
                case 98382: goto L_0x0014;
                default: goto L_0x000a;
            }
        L_0x000a:
            r1 = 2131887607(0x7f1205f7, float:1.9409826E38)
        L_0x000d:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.6pW r0 = X.AnonymousClass4L0.A0N(r0, r1)
            return r0
        L_0x0014:
            java.lang.String r0 = "cep"
            boolean r0 = r1.equals(r0)
            r1 = 2131887606(0x7f1205f6, float:1.9409824E38)
            goto L_0x0031
        L_0x001e:
            java.lang.String r0 = "postal_code"
            boolean r0 = r1.equals(r0)
            r1 = 2131887608(0x7f1205f8, float:1.9409828E38)
            goto L_0x0031
        L_0x0028:
            java.lang.String r0 = "zip_code"
            boolean r0 = r1.equals(r0)
            r1 = 2131887609(0x7f1205f9, float:1.940983E38)
        L_0x0031:
            if (r0 != 0) goto L_0x000d
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VN.A0D():X.7Qw");
    }

    public final boolean A0F(String str) {
        String str2 = this.A03;
        boolean z = !this.A06.A01();
        C162457s7.A0J(str2, 0);
        String A0o = C18310x6.A0o(str2, C155027eA.A00);
        if (str == null) {
            return false;
        }
        if (z) {
            if (str.length() == 6) {
                return true;
            }
            return false;
        } else if (A0o == null) {
            return false;
        } else {
            Matcher matcher = Pattern.compile(A0o).matcher(str);
            C162457s7.A0D(matcher);
            return matcher.matches();
        }
    }

    public AnonymousClass4VN(C48372en r3, C155027eA r4, C64773Ex r5, C56422rx r6, AnonymousClass5ZU r7) {
        C18260x0.A0f(r5, r7, r6, r3, r4);
        this.A08 = r5;
        this.A0A = r7;
        this.A09 = r6;
        this.A06 = r3;
        this.A07 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A05 = A012;
        this.A04 = A012;
        AnonymousClass4UC r0 = new AnonymousClass4UC(Boolean.FALSE);
        this.A0B = r0;
        this.A0C = r0;
    }
}
