package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.9XZ  reason: invalid class name */
public final class AnonymousClass9XZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass9XW();
    public final int A00;
    public final List A01;
    public final boolean A02;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        List<C632638o> list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (C632638o writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r2.isEmpty() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C632538n A00() {
        /*
            r5 = this;
            java.util.List r3 = r5.A01
            r2 = 0
            if (r3 == 0) goto L_0x0053
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0053
            r1 = 4
            X.9pa r0 = new X.9pa
            r0.<init>(r1)
            java.util.List r0 = X.C73723fy.A0L(r3, r0)
            java.lang.Object r0 = r0.get(r2)
            X.38o r0 = (X.C632638o) r0
            java.util.List r2 = r0.A02
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r4 = 0
            if (r1 != 0) goto L_0x0055
            int r1 = r5.A00
            int r0 = r2.size()
            int r3 = java.lang.Math.min(r1, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            X.38n r1 = (X.C632538n) r1
            int r0 = r1.A00
            if (r3 != r0) goto L_0x0036
            X.39L r0 = r1.A01
            if (r0 == 0) goto L_0x0036
            X.39Q r0 = r0.A02
            if (r0 == 0) goto L_0x0036
            java.math.BigDecimal r0 = r0.A00
            if (r0 == 0) goto L_0x0036
            return r1
        L_0x0053:
            r2 = 0
            goto L_0x0024
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XZ.A00():X.38n");
    }

    public AnonymousClass9XZ(List list, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = list;
    }

    public int describeContents() {
        return 0;
    }
}
