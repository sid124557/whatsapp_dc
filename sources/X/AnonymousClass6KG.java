package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6KG  reason: invalid class name */
public final class AnonymousClass6KG extends C1672680k implements Parcelable {
    @Deprecated
    public static final AnonymousClass6KG A09;
    public static final AnonymousClass6KG A0A;
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(11);
    public final int A00;
    public final SparseArray A01;
    public final SparseBooleanArray A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x00bc
            r2 = 0
            if (r11 == 0) goto L_0x00bb
            java.lang.Class<X.6KG> r1 = X.AnonymousClass6KG.class
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x00bb
            boolean r0 = super.equals(r11)
            if (r0 == 0) goto L_0x00bb
            X.6KG r11 = (X.AnonymousClass6KG) r11
            boolean r1 = r10.A04
            boolean r0 = r11.A04
            if (r1 != r0) goto L_0x00af
            boolean r1 = r10.A05
            boolean r0 = r11.A05
            if (r1 != r0) goto L_0x00af
            boolean r1 = r10.A08
            boolean r0 = r11.A08
            if (r1 != r0) goto L_0x00af
            boolean r1 = r10.A07
            boolean r0 = r11.A07
            if (r1 != r0) goto L_0x00af
            int r1 = r10.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x00af
            boolean r1 = r10.A03
            boolean r0 = r11.A03
            if (r1 != r0) goto L_0x00af
            android.util.SparseBooleanArray r4 = r10.A02
            android.util.SparseBooleanArray r3 = r11.A02
            int r2 = r4.size()
            int r0 = r3.size()
            if (r0 != r2) goto L_0x00af
            r1 = 0
        L_0x0049:
            if (r1 >= r2) goto L_0x0058
            int r0 = r4.keyAt(r1)
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x00af
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0058:
            android.util.SparseArray r8 = r10.A01
            android.util.SparseArray r7 = r11.A01
            int r6 = r8.size()
            int r0 = r7.size()
            if (r0 != r6) goto L_0x00af
            r5 = 0
        L_0x0067:
            if (r5 >= r6) goto L_0x00b4
            int r0 = r8.keyAt(r5)
            int r0 = r7.indexOfKey(r0)
            if (r0 < 0) goto L_0x00af
            java.lang.Object r2 = r8.valueAt(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r7.valueAt(r0)
            java.util.Map r4 = (java.util.Map) r4
            int r1 = r2.size()
            int r0 = r4.size()
            if (r0 != r1) goto L_0x00af
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r2)
        L_0x008d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r2 = r1.getKey()
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            if (r0 != 0) goto L_0x008d
        L_0x00af:
            r9 = 0
            return r9
        L_0x00b1:
            int r5 = r5 + 1
            goto L_0x0067
        L_0x00b4:
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 != r0) goto L_0x00af
            return r9
        L_0x00bb:
            return r2
        L_0x00bc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KG.equals(java.lang.Object):boolean");
    }

    static {
        AnonymousClass6KG r0 = new AnonymousClass6KG(new AnonymousClass6KF());
        A0A = r0;
        A09 = r0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0E);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeList(this.A0L);
        parcel.writeInt(this.A0D);
        parcel.writeList(this.A0I);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A0J);
        parcel.writeList(this.A0K);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        AnonymousClass8OQ r2 = this.A0G;
        parcel.writeInt(r2.size());
        C172878Nf it = r2.keySet().iterator();
        while (it.hasNext()) {
            C166617yz r0 = (C166617yz) it.next();
            parcel.writeParcelable(r0, i);
            parcel.writeParcelable((Parcelable) r2.get(r0), i);
        }
        parcel.writeIntArray(C159357lh.A02(this.A0H));
        SparseArray sparseArray = this.A01;
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
        parcel.writeSparseBooleanArray(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public AnonymousClass6KG(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put(C18280x3.A0C(parcel, C166607yy.class), C18280x3.A0C(parcel, C165927xr.class));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.A01 = sparseArray;
        this.A02 = parcel.readSparseBooleanArray();
        this.A04 = AnonymousClass6C7.A1W(parcel);
        this.A05 = AnonymousClass6C7.A1W(parcel);
        this.A08 = AnonymousClass6C7.A1W(parcel);
        this.A07 = AnonymousClass6C7.A1W(parcel);
        this.A00 = parcel.readInt();
        this.A03 = AnonymousClass6C7.A1W(parcel);
        this.A06 = AnonymousClass6C7.A1W(parcel);
    }

    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + this.A00) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0);
    }

    public AnonymousClass6KG(AnonymousClass6KF r2) {
        super((C157777ir) r2);
        this.A01 = r2.A07;
        this.A02 = r2.A08;
        this.A04 = r2.A02;
        this.A05 = r2.A03;
        this.A08 = r2.A06;
        this.A07 = r2.A05;
        this.A00 = r2.A00;
        this.A03 = r2.A01;
        this.A06 = r2.A04;
    }
}
