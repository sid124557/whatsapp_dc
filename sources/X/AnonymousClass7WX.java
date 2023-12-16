package X;

import android.net.Uri;

/* renamed from: X.7WX  reason: invalid class name */
public final class AnonymousClass7WX {
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7WX)) {
            return false;
        }
        AnonymousClass7WX r4 = (AnonymousClass7WX) obj;
        return this.A01.equals(r4.A01) && this.A03.equals(r4.A03) && C162387ry.A0D(this.A02, r4.A02) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return (((AnonymousClass0x2.A07(this.A03, C18300x5.A04(this.A01)) + C18270x1.A00(this.A02)) * 31) + this.A00) * 31 * 31;
    }

    public AnonymousClass7WX(Uri uri, String str, String str2, int i) {
        this.A01 = uri;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
