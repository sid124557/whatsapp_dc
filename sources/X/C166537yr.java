package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yr  reason: invalid class name and case insensitive filesystem */
public final class C166537yr implements Parcelable {
    public static final String A0a = C166537yr.class.getSimpleName();
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(28);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final int A0W;
    public final long A0X;
    public final String A0Y;
    public final String A0Z;

    public long A00() {
        if (C142486xH.DASH_LIVE.toString().equals(this.A0N)) {
            return this.A0E;
        }
        long j = this.A08;
        if (j < 0) {
            String str = A0a;
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1Q(A0L2, 0, j);
            C162477s9.A0F(str, "negative position=%d", A0L2);
            return 0;
        }
        long j2 = this.A0X;
        if (j2 <= 0 || j <= j2) {
            return j;
        }
        return j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A0H);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeLong(this.A0X);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0I);
        parcel.writeString(this.A0N);
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0G);
        parcel.writeInt(this.A05);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0J);
        parcel.writeLong(this.A0A);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A06);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A0K);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0Y);
        parcel.writeInt(this.A0W);
        parcel.writeString(this.A0M);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0L);
    }

    public C166537yr(Parcel parcel) {
        this.A0H = parcel.readLong();
        boolean z = false;
        this.A0R = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A0U = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A0P = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A0X = parcel.readLong();
        this.A09 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A0E = parcel.readLong();
        this.A0C = parcel.readLong();
        this.A0B = parcel.readLong();
        this.A0I = parcel.readLong();
        this.A0N = parcel.readString();
        this.A0F = parcel.readLong();
        this.A0G = parcel.readLong();
        this.A05 = parcel.readInt();
        this.A0D = parcel.readLong();
        this.A0J = parcel.readLong();
        this.A0A = parcel.readLong();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A0K = parcel.readLong();
        this.A07 = parcel.readInt();
        this.A0O = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A0Y = parcel.readString();
        this.A0W = parcel.readInt();
        this.A0M = parcel.readString();
        this.A0S = parcel.readInt() == 1 ? true : z;
        this.A0Z = parcel.readString();
        this.A0L = parcel.readString();
    }

    public C166537yr(String str, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0H = j;
        this.A0R = z;
        this.A0U = z2;
        this.A0P = z3;
        this.A0X = j2;
        this.A09 = j3;
        this.A08 = j4;
        this.A0E = j5;
        this.A0C = j6;
        this.A0B = j7;
        this.A0I = j8;
        this.A0N = str;
        this.A0F = j9;
        this.A0G = j10;
        this.A05 = i;
        this.A04 = i2;
        this.A0D = j11;
        this.A0J = j12;
        this.A0A = j13;
        this.A03 = i3;
        this.A06 = i4;
        this.A01 = i5;
        this.A02 = i6;
        this.A00 = f;
        this.A0K = System.currentTimeMillis();
        this.A07 = i7;
        this.A0O = z4;
        this.A0Y = null;
        this.A0W = i8;
        this.A0Q = z5;
        this.A0V = z6;
        this.A0Z = null;
    }

    public C166537yr() {
        this.A0H = 0;
        this.A0R = false;
        this.A0U = false;
        this.A0P = false;
        this.A0X = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A0E = 0;
        this.A0C = 0;
        this.A0B = 0;
        this.A0I = 0;
        this.A0N = "";
        this.A0F = -1;
        this.A0G = -1;
        this.A05 = 0;
        this.A04 = 0;
        this.A0D = 0;
        this.A0J = -1;
        this.A0A = -1;
        this.A03 = 0;
        this.A06 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A0K = System.currentTimeMillis();
        this.A07 = 0;
        this.A0O = false;
        this.A0Y = null;
        this.A0Z = null;
        this.A0W = -1;
        this.A0Q = false;
        this.A0V = false;
        this.A0M = "";
        this.A0S = false;
        this.A0L = "";
    }
}
