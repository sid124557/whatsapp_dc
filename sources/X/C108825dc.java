package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5dc  reason: invalid class name and case insensitive filesystem */
public final class C108825dc implements Parcelable {
    public static final C165227wj CREATOR = new C165227wj();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final ArrayList A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108825dc) {
                C108825dc r5 = (C108825dc) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && C162457s7.A0P(this.A04, r5.A04) && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A03);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A04, ((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02) * 31) + this.A03;
    }

    public C108825dc(ArrayList arrayList, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A04 = arrayList;
        this.A03 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewSegment(startDistanceInMeter=");
        A0o.append(this.A01);
        A0o.append(", endDistanceInMeter=");
        A0o.append(this.A00);
        A0o.append(", compactPinLayerCount=");
        A0o.append(this.A02);
        A0o.append(", mapViewLayers=");
        A0o.append(this.A04);
        A0o.append(", gridSize=");
        return C18260x0.A09(A0o, this.A03);
    }
}
