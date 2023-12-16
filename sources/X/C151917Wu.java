package X;

import android.net.Uri;

/* renamed from: X.7Wu  reason: invalid class name and case insensitive filesystem */
public abstract class C151917Wu {
    public final Uri A00;
    public final AnonymousClass8L9 A01;
    public final String A02;
    public final AnonymousClass7WQ A03;
    public final C142766xj A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A00;
        objArr[2] = this.A03;
        objArr[3] = this.A04;
        return C18310x6.A08(this.A01, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C151917Wu)) {
            return false;
        }
        C151917Wu r4 = (C151917Wu) obj;
        if (!this.A00.equals(r4.A00) || !this.A03.equals(r4.A03) || !this.A01.equals(r4.A01) || !this.A02.equals(r4.A02)) {
            return false;
        }
        return true;
    }

    public C151917Wu(AnonymousClass8L9 r2, String str, String str2, AnonymousClass7WQ r5, C142766xj r6) {
        this.A00 = Uri.parse(str);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = str2;
        this.A01 = r2;
    }
}
