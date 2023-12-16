package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.7WW  reason: invalid class name */
public final class AnonymousClass7WW {
    public final Uri A00;
    public final Object A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7WW)) {
            return false;
        }
        AnonymousClass7WW r4 = (AnonymousClass7WW) obj;
        return this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && C162387ry.A0D(this.A01, r4.A01);
    }

    public int hashCode() {
        return (((((C18300x5.A04(this.A00) * 31 * 31 * 31) + this.A02.hashCode()) * 31 * 31) + this.A03.hashCode()) * 31) + C18310x6.A07(this.A01);
    }

    public AnonymousClass7WW(Uri uri, Object obj, List list, List list2) {
        this.A00 = uri;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = obj;
    }
}
