package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17960wW;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(3);
    public final float A00;
    public final int A01;

    public int describeContents() {
        return this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public String toString() {
        String valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Rating:style=");
        A0o.append(this.A01);
        A0o.append(" rating=");
        float f = this.A00;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        return AnonymousClass000.A0X(valueOf, A0o);
    }
}
