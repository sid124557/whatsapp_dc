package android.support.v4.media;

import X.AnonymousClass001;
import X.AnonymousClass05C;
import X.AnonymousClass0GT;
import X.C17960wW;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final AnonymousClass05C A01;
    public static final Parcelable.Creator CREATOR = C17960wW.A00(2);
    public final Bundle A00;

    static {
        AnonymousClass05C r3 = new AnonymousClass05C();
        A01 = r3;
        Integer A0f = AnonymousClass001.A0f();
        r3.put("android.media.metadata.TITLE", A0f);
        r3.put("android.media.metadata.ARTIST", A0f);
        r3.put("android.media.metadata.DURATION", 0);
        r3.put("android.media.metadata.ALBUM", A0f);
        r3.put("android.media.metadata.AUTHOR", A0f);
        r3.put("android.media.metadata.WRITER", A0f);
        r3.put("android.media.metadata.COMPOSER", A0f);
        r3.put("android.media.metadata.COMPILATION", A0f);
        r3.put("android.media.metadata.DATE", A0f);
        r3.put("android.media.metadata.YEAR", 0);
        r3.put("android.media.metadata.GENRE", A0f);
        r3.put("android.media.metadata.TRACK_NUMBER", 0);
        r3.put("android.media.metadata.NUM_TRACKS", 0);
        r3.put("android.media.metadata.DISC_NUMBER", 0);
        r3.put("android.media.metadata.ALBUM_ARTIST", A0f);
        r3.put("android.media.metadata.ART", 2);
        r3.put("android.media.metadata.ART_URI", A0f);
        r3.put("android.media.metadata.ALBUM_ART", 2);
        r3.put("android.media.metadata.ALBUM_ART_URI", A0f);
        r3.put("android.media.metadata.USER_RATING", 3);
        r3.put("android.media.metadata.RATING", 3);
        r3.put("android.media.metadata.DISPLAY_TITLE", A0f);
        r3.put("android.media.metadata.DISPLAY_SUBTITLE", A0f);
        r3.put("android.media.metadata.DISPLAY_DESCRIPTION", A0f);
        r3.put("android.media.metadata.DISPLAY_ICON", 2);
        r3.put("android.media.metadata.DISPLAY_ICON_URI", A0f);
        r3.put("android.media.metadata.MEDIA_ID", A0f);
        r3.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r3.put("android.media.metadata.MEDIA_URI", A0f);
        r3.put("android.media.metadata.ADVERTISEMENT", 0);
        r3.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(AnonymousClass0GT.class.getClassLoader());
    }
}
