package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yS  reason: invalid class name and case insensitive filesystem */
public final class C166297yS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165277wo();
    public int A00;
    public boolean A01;
    public final C166047y3 A02;
    public final C109065e1 A03;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        C166047y3 r1 = this.A02;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A03, i);
    }

    public int describeContents() {
        return 0;
    }

    public C166297yS(C166047y3 r1, C109065e1 r2, int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
        this.A02 = r1;
        this.A03 = r2;
    }

    public C166297yS() {
        this((C166047y3) null, (C109065e1) null, 0, false);
    }
}
