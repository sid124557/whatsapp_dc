package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5du  reason: invalid class name and case insensitive filesystem */
public final class C108995du implements Parcelable {
    public static final C108995du A02 = new C108995du(C108975ds.A00(-90.0d, -180.0d), C108975ds.A00(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(15);
    public final C108975ds A00;
    public final C108975ds A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108995du)) {
            return false;
        }
        C108995du r4 = (C108995du) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public C108975ds A00() {
        double d;
        C108975ds r3 = this.A01;
        double d2 = r3.A00;
        C108975ds r2 = this.A00;
        double d3 = (d2 + r2.A00) / 2.0d;
        double d4 = r3.A01;
        double d5 = r2.A01;
        int i = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
        double d6 = d4 + d5;
        if (i <= 0) {
            d = d6 / 2.0d;
        } else {
            double d7 = 360.0d;
            double d8 = (d6 + 360.0d) / 2.0d;
            if (d8 <= 180.0d) {
                d7 = 0.0d;
            }
            d = d8 - d7;
        }
        return C108975ds.A00(d3, d);
    }

    public boolean A02(C108975ds r9) {
        double d = r9.A00;
        C108975ds r7 = this.A00;
        if (d > r7.A00) {
            return false;
        }
        C108975ds r3 = this.A01;
        if (d < r3.A00) {
            return false;
        }
        double d2 = r3.A01;
        double d3 = r7.A01;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        double d4 = r9.A01;
        int i2 = (d4 > d2 ? 1 : (d4 == d2 ? 0 : -1));
        if (i < 0) {
            if (i2 < 0) {
                return false;
            }
        } else if (i2 >= 0) {
            return true;
        }
        if (d4 <= d3) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (527 + this.A00.hashCode()) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public C108995du(Parcel parcel) {
        Class<C108975ds> cls = C108975ds.class;
        this.A00 = (C108975ds) C18280x3.A0C(parcel, cls);
        this.A01 = (C108975ds) C18280x3.A0C(parcel, cls);
    }

    public C108995du A01(C108975ds r2) {
        if (A02(r2)) {
            return this;
        }
        C158137jU r0 = new C158137jU(this);
        r0.A01(r2);
        return r0.A00();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C108995du.class.getSimpleName());
        A0o.append("{northeast=");
        A0o.append(this.A00);
        A0o.append(", southwest=");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("}", A0o);
    }

    public C108995du(C108975ds r7, C108975ds r8) {
        double d = r7.A00;
        double d2 = r8.A00;
        if (d <= d2) {
            this.A01 = r7;
            this.A00 = r8;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Southern latitude (");
        A0o.append(d);
        A0o.append(") exceeds Northern latitude (");
        A0o.append(d2);
        throw AnonymousClass000.A0F(").", A0o);
    }
}
