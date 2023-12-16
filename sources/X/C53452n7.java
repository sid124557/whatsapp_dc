package X;

import java.net.InetAddress;
import java.util.Locale;

/* renamed from: X.2n7  reason: invalid class name and case insensitive filesystem */
public final class C53452n7 {
    public final int A00;
    public final Long A01;
    public final Short A02;
    public final InetAddress A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C53452n7)) {
            return false;
        }
        C53452n7 r4 = (C53452n7) obj;
        Long l = this.A01;
        Long l2 = r4.A01;
        if (l != l2 && (l == null || !l.equals(l2))) {
            return false;
        }
        InetAddress inetAddress = this.A03;
        InetAddress inetAddress2 = r4.A03;
        if (inetAddress != inetAddress2 && (inetAddress == null || !inetAddress.equals(inetAddress2))) {
            return false;
        }
        Short sh = this.A02;
        Short sh2 = r4.A02;
        return sh == sh2 || (sh != null && sh.equals(sh2));
    }

    public int hashCode() {
        int i = 0;
        int A042 = (((C18280x3.A04(this.A01) + 41) * 41) + C18280x3.A04(this.A03)) * 41;
        Short sh = this.A02;
        if (sh != null) {
            i = sh.hashCode();
        }
        return A042 + i;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A03;
        A1X[1] = this.A02;
        A1X[2] = this.A01;
        return String.format(locale, "%s:%d EXPIRE: %tc", A1X);
    }

    public C53452n7(Long l, Short sh, InetAddress inetAddress, int i, boolean z, boolean z2) {
        this.A01 = l;
        this.A03 = inetAddress;
        this.A02 = sh;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }
}
