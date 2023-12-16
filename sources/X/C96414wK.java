package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4wK  reason: invalid class name and case insensitive filesystem */
public class C96414wK extends C136186lz {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public final int A06;
    public final LatLng A07;
    public final C184248rU A08;
    public final C182048nm A09;
    public final C186368vB A0A;
    public final C109065e1 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A0B.equals(((C96414wK) obj).A0B);
    }

    public int hashCode() {
        return this.A0B.hashCode();
    }

    public String toString() {
        return this.A0B.toString();
    }

    public C96414wK(LatLng latLng, C184248rU r5, C182048nm r6, C186368vB r7, C109065e1 r8, int i, int i2, boolean z, boolean z2) {
        super(i);
        this.A06 = i2;
        this.A0C = z;
        this.A0B = r8;
        this.A07 = latLng;
        this.A08 = r5;
        this.A0D = z2;
        this.A09 = r6;
        this.A0A = r7;
        String str = r8.A04;
        if (str != null) {
            this.A01 = str.replaceAll("(\\n){2,}", "\n");
        }
    }
}
