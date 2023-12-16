package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5do  reason: invalid class name and case insensitive filesystem */
public final class C108935do implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108475d3();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C108565dC A06;
    public C998958p A07;
    public C53732nZ A08;
    public AnonymousClass5T0 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;

    public C108935do(C998958p r23) {
        this((C108565dC) null, r23, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A07.name());
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0F);
        C108565dC r1 = this.A06;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0O);
    }

    public int describeContents() {
        return 0;
    }

    public C108935do(C108565dC r3, C998958p r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, int i3, long j, boolean z) {
        C162457s7.A0J(r4, 1);
        this.A07 = r4;
        this.A0H = str;
        this.A0L = str2;
        this.A02 = i;
        this.A0D = str3;
        this.A03 = i2;
        this.A0U = z;
        this.A0J = str4;
        this.A0N = str5;
        this.A0P = str6;
        this.A0Q = str7;
        this.A0R = str8;
        this.A05 = j;
        this.A0I = str9;
        this.A04 = i3;
        this.A0C = str10;
        this.A0F = str11;
        this.A06 = r3;
        this.A0M = str12;
        this.A0O = str13;
    }
}
