package android.support.v4.media;

import X.AnonymousClass000;
import X.C17960wW;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.A00);
        sb.append(", mDescription=");
        return AnonymousClass000.A0Q(this.A01, sb);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
