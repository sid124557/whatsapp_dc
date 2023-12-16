package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7ys  reason: invalid class name and case insensitive filesystem */
public final class C166547ys implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(37);
    public final C187368x6[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166547ys A00(X.C166547ys r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return r5
        L_0x0003:
            X.8x6[] r4 = r6.A00
            int r3 = r4.length
            if (r3 != 0) goto L_0x0009
            return r5
        L_0x0009:
            X.8x6[] r1 = r5.A00
            int r2 = r1.length
            int r0 = r2 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r2, r3)
            X.8x6[] r1 = (X.C187368x6[]) r1
            X.7ys r0 = new X.7ys
            r0.<init>((X.C187368x6[]) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166547ys.A00(X.7ys):X.7ys");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C166547ys.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C166547ys) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (C187368x6 writeParcelable : this.A00) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C166547ys(Parcel parcel) {
        this.A00 = new C187368x6[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A00;
            if (i < objArr.length) {
                objArr[i] = C18280x3.A0C(parcel, C187368x6.class);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("entries=");
        C18320x8.A1P(A0o, this.A00);
        return A0o.toString();
    }

    public C166547ys(List list) {
        this.A00 = (C187368x6[]) list.toArray(new C187368x6[0]);
    }

    public C166547ys(C187368x6... r1) {
        this.A00 = r1;
    }
}
