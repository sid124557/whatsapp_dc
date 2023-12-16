package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7X3  reason: invalid class name */
public class AnonymousClass7X3 {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7X3)) {
            return false;
        }
        AnonymousClass7X3 r4 = (AnonymousClass7X3) obj;
        return this.A02.equals(r4.A02) && Util.A0D(this.A06, r4.A06) && Util.A0D(this.A05, r4.A05) && this.A01 == r4.A01 && this.A00 == r4.A00 && Util.A0D(this.A04, r4.A04) && Util.A0D(this.A03, r4.A03);
    }

    public int hashCode() {
        return ((((((((((C18300x5.A04(this.A02) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A05)) * 31) + this.A01) * 31) + this.A00) * 31) + C18270x1.A00(this.A04)) * 31) + AnonymousClass0x7.A07(this.A03);
    }

    public AnonymousClass7X3(C149977Oq r2) {
        this.A02 = r2.A02;
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A04 = r2.A04;
        this.A03 = r2.A03;
    }
}
