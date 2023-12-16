package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.87a  reason: invalid class name and case insensitive filesystem */
public final class C1688587a implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(57);
    public final float A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1688587a.class != obj.getClass()) {
                return false;
            }
            C1688587a r5 = (C1688587a) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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
        return AnonymousClass6C8.A04(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public C1688587a(float f, int i) {
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

    public C1688587a(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
