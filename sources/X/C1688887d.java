package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.87d  reason: invalid class name and case insensitive filesystem */
public final class C1688887d implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(56);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1688887d.class != obj.getClass()) {
                return false;
            }
            C1688887d r7 = (C1688887d) obj;
            if (!(this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A03 == r7.A03)) {
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
        return AnonymousClass0x2.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass6C8.A04(AnonymousClass6C8.A0B(this.A02)), this.A01), this.A00), this.A04), this.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }

    public C1688887d(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Motion photo metadata: photoStartPosition=");
        A0o.append(this.A02);
        A0o.append(", photoSize=");
        A0o.append(this.A01);
        A0o.append(", photoPresentationTimestampUs=");
        A0o.append(this.A00);
        A0o.append(", videoStartPosition=");
        A0o.append(this.A04);
        A0o.append(", videoSize=");
        return AnonymousClass001.A0k(A0o, this.A03);
    }

    public C1688887d(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }
}
