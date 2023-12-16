package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.8Bn  reason: invalid class name and case insensitive filesystem */
public class C170018Bn implements C187358x4 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(72);
    public final long A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C170018Bn) && this.A00 == ((C170018Bn) obj).A00;
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }

    public C170018Bn(long j) {
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        C18280x3.A1S(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
