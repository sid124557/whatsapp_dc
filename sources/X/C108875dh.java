package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dh  reason: invalid class name and case insensitive filesystem */
public final class C108875dh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108365cs();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C108655dL A04;
    public final boolean A05;

    public C108875dh(C108655dL r2, int i, int i2, int i3, int i4, boolean z) {
        C162457s7.A0J(r2, 6);
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A05 = z;
        this.A04 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108875dh) {
                C108875dh r5 = (C108875dh) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A05 == r5.A05 && C162457s7.A0P(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, AnonymousClass0x2.A01(((((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00) * 31, this.A05));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoteEntityFilter(filterId=");
        A0o.append(this.A01);
        A0o.append(", filterViewIdRes=");
        A0o.append(this.A03);
        A0o.append(", filterNameStringRes=");
        A0o.append(this.A02);
        A0o.append(", filterDrawableRes=");
        A0o.append(this.A00);
        A0o.append(", isInternalOnly=");
        A0o.append(this.A05);
        A0o.append(", nuxListener=");
        return C18260x0.A04(this.A04, A0o);
    }
}
