package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TO  reason: invalid class name */
public class AnonymousClass6TO extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164497vY();
    public double A00;
    public double A01;

    public AnonymousClass6TO(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        double d = this.A00;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        double d2 = this.A01;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TO() {
    }
}
