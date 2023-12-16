package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SV  reason: invalid class name */
public class AnonymousClass6SV extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164557ve();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final AnonymousClass6SO[] A0D;
    public final C127366Rr[] A0E;

    public AnonymousClass6SV(AnonymousClass6SO[] r1, C127366Rr[] r2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, int i2) {
        this.A0C = i;
        this.A0B = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0D = r1;
        this.A07 = f8;
        this.A08 = f9;
        this.A09 = f10;
        this.A0E = r2;
        this.A0A = f11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A0C);
        C162417s1.A07(parcel, 2, this.A0B);
        C162417s1.A05(parcel, this.A00, 3);
        C162417s1.A05(parcel, this.A01, 4);
        C162417s1.A05(parcel, this.A02, 5);
        C162417s1.A05(parcel, this.A03, 6);
        C162417s1.A05(parcel, this.A04, 7);
        C162417s1.A05(parcel, this.A05, 8);
        C162417s1.A0F(parcel, this.A0D, 9, i);
        C162417s1.A05(parcel, this.A07, 10);
        C162417s1.A05(parcel, this.A08, 11);
        C162417s1.A05(parcel, this.A09, 12);
        C162417s1.A0F(parcel, this.A0E, 13, i);
        C162417s1.A05(parcel, this.A06, 14);
        C162417s1.A05(parcel, this.A0A, 15);
        C162417s1.A06(parcel, A002);
    }
}
