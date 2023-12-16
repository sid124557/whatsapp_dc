package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.6TF  reason: invalid class name */
public final class AnonymousClass6TF extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164287vD();
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6TF) {
                AnonymousClass6TF r5 = (AnonymousClass6TF) obj;
                if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01) || !this.A04.equals(r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A00;
        objArr[3] = this.A01;
        return C18310x6.A08(this.A04, objArr, 4);
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(this.A02, "nearLeft");
        r2.A00(this.A03, "nearRight");
        r2.A00(this.A00, "farLeft");
        r2.A00(this.A01, "farRight");
        r2.A00(this.A04, "latLngBounds");
        return r2.toString();
    }

    public AnonymousClass6TF(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A06 = C1695389r.A06(parcel, this.A02, i);
        C162417s1.A0A(parcel, this.A03, 3, i, A06);
        C162417s1.A0A(parcel, this.A00, 4, i, A06);
        C162417s1.A0A(parcel, this.A01, 5, i, A06);
        C162417s1.A0A(parcel, this.A04, 6, i, A06);
        C162417s1.A06(parcel, A002);
    }
}
