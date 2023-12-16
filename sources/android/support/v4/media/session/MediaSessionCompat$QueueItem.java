package android.support.v4.media.session;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17960wW;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaSession.QueueItem {Description=");
        A0o.append(this.A01);
        A0o.append(", Id=");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" }", A0o);
    }
}
