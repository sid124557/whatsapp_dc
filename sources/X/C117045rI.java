package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;

/* renamed from: X.5rI  reason: invalid class name and case insensitive filesystem */
public final class C117045rI implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(73);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Calendar A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117045rI)) {
            return false;
        }
        C117045rI r4 = (C117045rI) obj;
        return this.A03 == r4.A03 && this.A04 == r4.A04;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A06.compareTo(((C117045rI) obj).A06);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }

    public C117045rI(Calendar calendar) {
        calendar.set(5, 1);
        Calendar A012 = C161097oz.A01(calendar);
        this.A06 = A012;
        this.A03 = A012.get(2);
        this.A04 = A012.get(1);
        this.A02 = A012.getMaximum(7);
        this.A01 = A012.getActualMaximum(5);
        this.A05 = A012.getTimeInMillis();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A03);
        AnonymousClass000.A1M(A0M, this.A04);
        return Arrays.hashCode(A0M);
    }
}
