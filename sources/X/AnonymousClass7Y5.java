package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7Y5  reason: invalid class name */
public final class AnonymousClass7Y5 {
    public final LatLng A00;
    public final C109065e1 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y5) {
                AnonymousClass7Y5 r5 = (AnonymousClass7Y5) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public AnonymousClass7Y5(LatLng latLng, C109065e1 r2) {
        this.A01 = r2;
        this.A00 = latLng;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BottomSheetData(minifiedBusinessProfile=");
        A0o.append(this.A01);
        A0o.append(", userLocation=");
        return C18260x0.A04(this.A00, A0o);
    }
}
