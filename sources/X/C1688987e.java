package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.87e  reason: invalid class name and case insensitive filesystem */
public final class C1688987e implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(42);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1688987e.class != obj.getClass()) {
                return false;
            }
            C1688987e r5 = (C1688987e) obj;
            if (this.A00 != r5.A00 || !C162387ry.A0D(this.A02, r5.A02) || !C162387ry.A0D(this.A03, r5.A03) || !C162387ry.A0D(this.A04, r5.A04) || this.A05 != r5.A05 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return ((((((((((527 + this.A00) * 31) + C86624Kv.A04(this.A02)) * 31) + C86624Kv.A04(this.A03)) * 31) + AnonymousClass6CA.A06(this.A04)) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6 > 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1688987e(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, int r6, boolean r7) {
        /*
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r6 == r0) goto L_0x0009
            r0 = 0
            if (r6 <= 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.C161487pm.A03(r0)
            r1.A00 = r5
            r1.A02 = r2
            r1.A03 = r3
            r1.A04 = r4
            r1.A05 = r7
            r1.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688987e.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IcyHeaders: name=\"");
        A0o.append(this.A03);
        A0o.append("\", genre=\"");
        A0o.append(this.A02);
        A0o.append("\", bitrate=");
        A0o.append(this.A00);
        A0o.append(", metadataInterval=");
        return AnonymousClass000.A0h(A0o, this.A01);
    }

    public C1688987e(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AnonymousClass6C7.A1W(parcel);
        this.A01 = parcel.readInt();
    }
}
