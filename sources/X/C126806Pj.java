package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Pj  reason: invalid class name and case insensitive filesystem */
public final class C126806Pj extends C166417ye {
    public static final C126806Pj A0T = new C126796Pi().A00();
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(65);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final SparseArray A0C;
    public final SparseBooleanArray A0D;
    public final C129586aY A0E;
    public final C129586aY A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x013c
            r2 = 0
            if (r11 == 0) goto L_0x013b
            java.lang.Class<X.6Pj> r1 = X.C126806Pj.class
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x013b
            r5 = r11
            X.6Pj r5 = (X.C126806Pj) r5
            boolean r0 = super.equals(r11)
            if (r0 == 0) goto L_0x0136
            int r1 = r10.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A03
            int r0 = r5.A03
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A09
            int r0 = r5.A09
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A08
            int r0 = r5.A08
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A07
            int r0 = r5.A07
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A06
            int r0 = r5.A06
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0O
            boolean r0 = r5.A0O
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0K
            boolean r0 = r5.A0K
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0L
            boolean r0 = r5.A0L
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0S
            boolean r0 = r5.A0S
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A0B
            int r0 = r5.A0B
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A0A
            int r0 = r5.A0A
            if (r1 != r0) goto L_0x0136
            X.6aY r1 = r10.A0F
            X.6aY r0 = r5.A0F
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0136
            int r1 = r10.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0136
            int r1 = r10.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0M
            boolean r0 = r5.A0M
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0H
            boolean r0 = r5.A0H
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0I
            boolean r0 = r5.A0I
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0G
            boolean r0 = r5.A0G
            if (r1 != r0) goto L_0x0136
            X.6aY r1 = r10.A0E
            X.6aY r0 = r5.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0136
            boolean r1 = r10.A0Q
            boolean r0 = r5.A0Q
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0P
            boolean r0 = r5.A0P
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0N
            boolean r0 = r5.A0N
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0R
            boolean r0 = r5.A0R
            if (r1 != r0) goto L_0x0136
            boolean r1 = r10.A0J
            boolean r0 = r5.A0J
            if (r1 != r0) goto L_0x0136
            android.util.SparseBooleanArray r4 = r10.A0D
            android.util.SparseBooleanArray r3 = r5.A0D
            int r2 = r4.size()
            int r0 = r3.size()
            if (r0 != r2) goto L_0x0136
            r1 = 0
        L_0x00d0:
            if (r1 >= r2) goto L_0x00df
            int r0 = r4.keyAt(r1)
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x0136
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00df:
            android.util.SparseArray r8 = r10.A0C
            android.util.SparseArray r7 = r5.A0C
            int r6 = r8.size()
            int r0 = r7.size()
            if (r0 != r6) goto L_0x0136
            r5 = 0
        L_0x00ee:
            if (r5 >= r6) goto L_0x013c
            int r0 = r8.keyAt(r5)
            int r0 = r7.indexOfKey(r0)
            if (r0 < 0) goto L_0x0136
            java.lang.Object r2 = r8.valueAt(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r7.valueAt(r0)
            java.util.Map r4 = (java.util.Map) r4
            int r1 = r2.size()
            int r0 = r4.size()
            if (r0 != r1) goto L_0x0136
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r2)
        L_0x0114:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0138
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r2 = r1.getKey()
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 != 0) goto L_0x0114
        L_0x0136:
            r9 = 0
            return r9
        L_0x0138:
            int r5 = r5 + 1
            goto L_0x00ee
        L_0x013b:
            return r2
        L_0x013c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126806Pj.equals(java.lang.Object):boolean");
    }

    public C126806Pj(Parcel parcel) {
        super(parcel);
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0O = AnonymousClass6C7.A1W(parcel);
        this.A0K = AnonymousClass6C7.A1W(parcel);
        this.A0L = AnonymousClass6C7.A1W(parcel);
        this.A0B = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A0S = AnonymousClass6C7.A1W(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, (ClassLoader) null);
        this.A0F = C129586aY.copyOf((Collection) A0s);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A0M = AnonymousClass6C7.A1W(parcel);
        this.A0H = AnonymousClass6C7.A1W(parcel);
        this.A0I = AnonymousClass6C7.A1W(parcel);
        this.A0G = AnonymousClass6C7.A1W(parcel);
        this.A0E = C174098Sy.A00(parcel, (ClassLoader) null);
        this.A0Q = AnonymousClass6C7.A1W(parcel);
        this.A0P = AnonymousClass6C7.A1W(parcel);
        this.A0N = AnonymousClass6C7.A1W(parcel);
        this.A0R = AnonymousClass6C7.A1W(parcel);
        this.A0J = AnonymousClass6C7.A1W(parcel);
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                Parcelable A0C2 = C18280x3.A0C(parcel, C166387yb.class);
                A0C2.getClass();
                hashMap.put(A0C2, C18280x3.A0C(parcel, C165937xs.class));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.A0C = sparseArray;
        this.A0D = parcel.readSparseBooleanArray();
    }

    public int hashCode() {
        C129586aY r0 = this.A0F;
        return ((((((((AnonymousClass000.A08(this.A0E, (((((((((((AnonymousClass000.A08(r0, ((((((((((((((((((((((((((((super.hashCode() * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + this.A06) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0S ? 1 : 0)) * 31) + this.A0B) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A00) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31) + (this.A0J ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeList(this.A0F);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeList(this.A0E);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                parcel.writeParcelable((Parcelable) A0w.getKey(), 0);
                parcel.writeParcelable((Parcelable) A0w.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A0D);
    }

    public C126806Pj(SparseArray sparseArray, SparseBooleanArray sparseBooleanArray, C129586aY r5, C129586aY r6, C129586aY r7, C129586aY r8, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(r6, r8, i9);
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A06 = 0;
        this.A0O = z;
        this.A0K = false;
        this.A0L = z2;
        this.A0B = i5;
        this.A0A = i6;
        this.A0S = z3;
        this.A0F = r5;
        this.A01 = i7;
        this.A00 = i8;
        this.A0M = z4;
        this.A0H = false;
        this.A0I = false;
        this.A0G = false;
        this.A0E = r7;
        this.A0Q = false;
        this.A0P = false;
        this.A0N = z5;
        this.A0R = false;
        this.A0J = z6;
        this.A0C = sparseArray;
        this.A0D = sparseBooleanArray;
    }
}
