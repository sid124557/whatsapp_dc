package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xx  reason: invalid class name and case insensitive filesystem */
public final class C165987xx implements Parcelable {
    public static final C165217wi CREATOR = new C165217wi();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C165987xx) {
                C165987xx r5 = (C165987xx) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C165987xx(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewLayer(layerZoomLevelIndex=");
        A0o.append(this.A00);
        A0o.append(", regularPinCount=");
        return C18260x0.A09(A0o, this.A01);
    }
}
