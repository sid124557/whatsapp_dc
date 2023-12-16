package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.81N  reason: invalid class name */
public final class AnonymousClass81N implements C187338x1 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(10);
    public final float A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass81N.class != obj.getClass()) {
                return false;
            }
            AnonymousClass81N r5 = (AnonymousClass81N) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass6C8.A04(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public AnonymousClass81N(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("smta: captureFrameRate=");
        A0o.append(this.A00);
        A0o.append(", svcTemporalLayerCount=");
        return AnonymousClass000.A0h(A0o, this.A01);
    }

    public AnonymousClass81N(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
