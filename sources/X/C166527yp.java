package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7yp  reason: invalid class name and case insensitive filesystem */
public final class C166527yp implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(34);
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final long A0J;
    public final C166647z2 A0K;
    public final C166547ys A0L;
    public final C166497ym A0M;
    public final Class A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final List A0U;
    public final byte[] A0V;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 == r7) goto L_0x0107
            r2 = 0
            if (r7 == 0) goto L_0x001a
            java.lang.Class<X.7yp> r1 = X.C166527yp.class
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L_0x001a
            X.7yp r7 = (X.C166527yp) r7
            int r1 = r6.A00
            if (r1 == 0) goto L_0x001b
            int r0 = r7.A00
            if (r0 == 0) goto L_0x001b
            if (r1 == r0) goto L_0x001b
        L_0x001a:
            return r2
        L_0x001b:
            int r1 = r6.A0G
            int r0 = r7.A0G
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0D
            int r0 = r7.A0D
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A04
            int r0 = r7.A04
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0C
            int r0 = r7.A0C
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0A
            int r0 = r7.A0A
            if (r1 != r0) goto L_0x0106
            long r3 = r6.A0J
            long r1 = r7.A0J
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            int r1 = r6.A0I
            int r0 = r7.A0I
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A09
            int r0 = r7.A09
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0E
            int r0 = r7.A0E
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0H
            int r0 = r7.A0H
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A06
            int r0 = r7.A06
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0F
            int r0 = r7.A0F
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0B
            int r0 = r7.A0B
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A07
            int r0 = r7.A07
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A08
            int r0 = r7.A08
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L_0x0106
            float r1 = r6.A01
            float r0 = r7.A01
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x0106
            float r1 = r6.A02
            float r0 = r7.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x0106
            java.lang.Class r1 = r6.A0N
            java.lang.Class r0 = r7.A0N
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r7.A0Q
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = r7.A0R
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = r7.A0O
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0P
            java.lang.String r0 = r7.A0P
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = r7.A0T
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0S
            java.lang.String r0 = r7.A0S
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            byte[] r1 = r6.A0V
            byte[] r0 = r7.A0V
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.7ys r1 = r6.A0L
            X.7ys r0 = r7.A0L
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.7ym r1 = r6.A0M
            X.7ym r0 = r7.A0M
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.7z2 r1 = r6.A0K
            X.7z2 r0 = r7.A0K
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 == 0) goto L_0x0106
            boolean r0 = r6.A02(r7)
            if (r0 == 0) goto L_0x0106
            return r5
        L_0x0106:
            r5 = 0
        L_0x0107:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166527yp.equals(java.lang.Object):boolean");
    }

    public static C166527yp A00(C157057he r1) {
        return new C166527yp(r1);
    }

    public static void A01(C157057he r1, C185598tw r2) {
        r2.B3T(new C166527yp(r1));
    }

    public boolean A02(C166527yp r7) {
        List list = this.A0U;
        int size = list.size();
        List list2 = r7.A0U;
        if (size == list2.size()) {
            int i = 0;
            while (i < list.size()) {
                if (Arrays.equals(AnonymousClass6C9.A1V(list, i), AnonymousClass6C9.A1V(list2, i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A072 = ((((((((((((((AnonymousClass6C9.A07((AnonymousClass6C9.A07((((((((((((((((((((((((((((AnonymousClass6C8.A04(C18270x1.A00(this.A0Q)) + C86624Kv.A04(this.A0R)) * 31) + C18270x1.A00(this.A0S)) * 31) + this.A0G) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31) + C18270x1.A00(this.A0O)) * 31) + AnonymousClass000.A07(this.A0L)) * 31) + C18270x1.A00(this.A0P)) * 31) + C18270x1.A00(this.A0T)) * 31) + this.A0A) * 31) + ((int) this.A0J)) * 31) + this.A0I) * 31) + this.A09) * 31, this.A01) + this.A0E) * 31, this.A02) + this.A0H) * 31) + this.A06) * 31) + this.A0F) * 31) + this.A0B) * 31) + this.A07) * 31) + this.A08) * 31) + this.A03) * 31) + C18310x6.A07(this.A0N);
        this.A00 = A072;
        return A072;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A0O);
        int i2 = 0;
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A0A);
        List list = this.A0U;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(AnonymousClass6C9.A1V(list, i3));
        }
        parcel.writeParcelable(this.A0K, 0);
        parcel.writeLong(this.A0J);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0V;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A03);
    }

    public C166527yp(Parcel parcel) {
        byte[] bArr;
        this.A0Q = parcel.readString();
        this.A0R = parcel.readString();
        this.A0S = parcel.readString();
        this.A0G = parcel.readInt();
        this.A0D = parcel.readInt();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int readInt2 = parcel.readInt();
        this.A0C = readInt2;
        this.A05 = readInt2 != -1 ? readInt2 : readInt;
        this.A0O = parcel.readString();
        this.A0L = (C166547ys) C18280x3.A0C(parcel, C166547ys.class);
        this.A0P = parcel.readString();
        this.A0T = parcel.readString();
        this.A0A = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.A0U = AnonymousClass002.A0I(readInt3);
        for (int i = 0; i < readInt3; i++) {
            List list = this.A0U;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            list.add(createByteArray);
        }
        C166647z2 r2 = (C166647z2) C18280x3.A0C(parcel, C166647z2.class);
        this.A0K = r2;
        this.A0J = parcel.readLong();
        this.A0I = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0E = parcel.readInt();
        this.A02 = parcel.readFloat();
        Class cls = null;
        if (AnonymousClass6C7.A1W(parcel)) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0V = bArr;
        this.A0H = parcel.readInt();
        this.A0M = (C166497ym) C18280x3.A0C(parcel, C166497ym.class);
        this.A06 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0N = r2 != null ? AnonymousClass86H.class : cls;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Format(");
        A0o.append(this.A0Q);
        A0o.append(", ");
        A0o.append(this.A0R);
        A0o.append(", ");
        A0o.append(this.A0P);
        A0o.append(", ");
        A0o.append(this.A0T);
        A0o.append(", ");
        A0o.append(this.A0O);
        A0o.append(", ");
        A0o.append(this.A05);
        A0o.append(", ");
        A0o.append(this.A0S);
        A0o.append(", [");
        A0o.append(this.A0I);
        A0o.append(", ");
        A0o.append(this.A09);
        A0o.append(", ");
        A0o.append(this.A01);
        A0o.append("], [");
        A0o.append(this.A06);
        A0o.append(", ");
        A0o.append(this.A0F);
        return AnonymousClass000.A0X("])", A0o);
    }

    public C166527yp(C157057he r6) {
        this.A0Q = r6.A0O;
        this.A0R = r6.A0P;
        this.A0S = C162387ry.A08(r6.A0Q);
        this.A0G = r6.A0E;
        this.A0D = r6.A0B;
        int i = r6.A03;
        this.A04 = i;
        int i2 = r6.A0A;
        this.A0C = i2;
        this.A05 = i2 != -1 ? i2 : i;
        this.A0O = r6.A0M;
        this.A0L = r6.A0J;
        this.A0P = r6.A0N;
        this.A0T = r6.A0R;
        this.A0A = r6.A08;
        List list = r6.A0S;
        this.A0U = list == null ? Collections.emptyList() : list;
        C166647z2 r2 = r6.A0I;
        this.A0K = r2;
        this.A0J = r6.A0H;
        this.A0I = r6.A0G;
        this.A09 = r6.A07;
        this.A01 = r6.A00;
        int i3 = r6.A0C;
        int i4 = 0;
        this.A0E = i3 == -1 ? 0 : i3;
        float f = r6.A01;
        this.A02 = f == -1.0f ? 1.0f : f;
        this.A0V = r6.A0T;
        this.A0H = r6.A0F;
        this.A0M = r6.A0K;
        this.A06 = r6.A04;
        this.A0F = r6.A0D;
        this.A0B = r6.A09;
        int i5 = r6.A05;
        this.A07 = i5 == -1 ? 0 : i5;
        int i6 = r6.A06;
        this.A08 = i6 != -1 ? i6 : i4;
        this.A03 = r6.A02;
        Class<AnonymousClass86H> cls = r6.A0L;
        if (cls == null && r2 != null) {
            cls = AnonymousClass86H.class;
        }
        this.A0N = cls;
    }
}
