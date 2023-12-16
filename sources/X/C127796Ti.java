package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ti  reason: invalid class name and case insensitive filesystem */
public class C127796Ti extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164427vR();
    public int A00;
    public int A01;
    public C127726Tb A02;
    public C127736Tc A03;
    public C127786Th A04;
    public AnonymousClass6TX A05;
    public AnonymousClass6TO A06;
    public AnonymousClass6TP A07;
    public AnonymousClass6TQ A08;
    public AnonymousClass6TR A09;
    public AnonymousClass6TV A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    public C127796Ti(C127726Tb r2, C127736Tc r3, C127786Th r4, AnonymousClass6TX r5, AnonymousClass6TO r6, AnonymousClass6TP r7, AnonymousClass6TQ r8, AnonymousClass6TR r9, AnonymousClass6TV r10, String str, String str2, byte[] bArr, Point[] pointArr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A0C = str;
        this.A0E = bArr;
        this.A0B = str2;
        this.A01 = i2;
        this.A0F = pointArr;
        this.A0D = z;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A0A = r10;
        this.A09 = r9;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0B(parcel, this.A0C, 3, false);
        C162417s1.A0B(parcel, this.A0B, 4, false);
        C162417s1.A07(parcel, 5, this.A01);
        C162417s1.A0F(parcel, this.A0F, 6, i);
        C162417s1.A0A(parcel, this.A05, 7, i, false);
        C162417s1.A0A(parcel, this.A07, 8, i, false);
        C162417s1.A0A(parcel, this.A08, 9, i, false);
        C162417s1.A0A(parcel, this.A0A, 10, i, false);
        C162417s1.A0A(parcel, this.A09, 11, i, false);
        C162417s1.A0A(parcel, this.A06, 12, i, false);
        C162417s1.A0A(parcel, this.A02, 13, i, false);
        C162417s1.A0A(parcel, this.A03, 14, i, false);
        C162417s1.A0A(parcel, this.A04, 15, i, false);
        C162417s1.A0E(parcel, this.A0E, 16, false);
        C162417s1.A09(parcel, 17, this.A0D);
        C162417s1.A06(parcel, A002);
    }

    public C127796Ti() {
    }
}
