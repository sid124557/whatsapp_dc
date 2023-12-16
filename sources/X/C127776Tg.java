package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.6Tg  reason: invalid class name and case insensitive filesystem */
public final class C127776Tg extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164267vB();
    public float A00 = 0.5f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.5f;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public float A06;
    public AnonymousClass7BV A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D = false;

    public C127776Tg(IBinder iBinder, LatLng latLng, String str, String str2, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2, boolean z3) {
        AnonymousClass7BV r1;
        this.A08 = latLng;
        this.A09 = str;
        this.A0A = str2;
        if (iBinder == null) {
            r1 = null;
        } else {
            r1 = new AnonymousClass7BV(AnonymousClass6WL.A02(iBinder));
        }
        this.A07 = r1;
        this.A00 = f;
        this.A01 = f2;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C162417s1.A00(parcel);
        boolean A062 = C1695389r.A06(parcel, this.A08, i);
        C162417s1.A0B(parcel, this.A09, 3, A062);
        C162417s1.A0B(parcel, this.A0A, 4, A062);
        AnonymousClass7BV r0 = this.A07;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.A00.asBinder();
        }
        C162417s1.A03(asBinder, parcel, 5);
        C162417s1.A05(parcel, this.A00, 6);
        C162417s1.A05(parcel, this.A01, 7);
        C162417s1.A09(parcel, 8, this.A0B);
        C162417s1.A09(parcel, 9, this.A0C);
        C162417s1.A09(parcel, 10, this.A0D);
        C162417s1.A05(parcel, this.A02, 11);
        C162417s1.A05(parcel, this.A03, 12);
        C162417s1.A05(parcel, this.A04, 13);
        C162417s1.A05(parcel, this.A05, 14);
        C162417s1.A05(parcel, this.A06, 15);
        C162417s1.A06(parcel, A002);
    }

    public C127776Tg() {
    }
}
