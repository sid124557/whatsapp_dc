package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rr  reason: invalid class name and case insensitive filesystem */
public final class C127366Rr extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164547vd();
    public final int A00;
    public final PointF[] A01;

    public C127366Rr(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0F(parcel, this.A01, 2, i);
        C162417s1.A07(parcel, 3, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
