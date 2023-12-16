package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6Se  reason: invalid class name and case insensitive filesystem */
public class C127496Se extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163877uW();
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C127496Se
            r3 = 0
            if (r0 == 0) goto L_0x000f
            X.6Se r5 = (X.C127496Se) r5
            java.util.List r2 = r4.A00
            java.util.List r1 = r5.A00
            if (r2 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x001e
        L_0x000f:
            return r3
        L_0x0010:
            if (r1 == 0) goto L_0x000f
            boolean r0 = r2.containsAll(r1)
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x000f
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127496Se.equals(java.lang.Object):boolean");
    }

    public C127496Se(List list) {
        this.A00 = list;
    }

    public int hashCode() {
        return C18310x6.A08(AnonymousClass0x9.A15(this.A00), AnonymousClass002.A0L(), 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0D(parcel, this.A00, 1, false);
        C162417s1.A06(parcel, A002);
    }
}
