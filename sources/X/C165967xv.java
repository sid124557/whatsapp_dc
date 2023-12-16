package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xv  reason: invalid class name and case insensitive filesystem */
public class C165967xv implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(33);
    public final String A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (X.C165967xv) r5;
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0026
            boolean r0 = r5 instanceof X.C165967xv
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.7xv r5 = (X.C165967xv) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0018:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == r0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165967xv.equals(java.lang.Object):boolean");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C165967xv(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SphericalMetadata{projectionType=");
        A0o.append(this.A00);
        A0o.append(", stereoMode=");
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }
}
