package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6Rm  reason: invalid class name and case insensitive filesystem */
public class C127316Rm extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163507tv();
    public List A00;
    public final int A01;

    public C127316Rm(List list, int i) {
        this.A01 = i;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A01);
        C162417s1.A0D(parcel, this.A00, 2, false);
        C162417s1.A06(parcel, A002);
    }
}
