package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GT;
import X.C03970Mg;
import X.C17960wW;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(1);
    public MediaDescription A00;
    public final Bitmap A01;
    public final Uri A02;
    public final Uri A03;
    public final Bundle A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final String A08;

    public static MediaDescriptionCompat A00(Object obj) {
        Uri uri;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C03970Mg r4 = new C03970Mg();
        MediaDescription mediaDescription = (MediaDescription) obj2;
        r4.A07 = mediaDescription.getMediaId();
        r4.A06 = mediaDescription.getTitle();
        r4.A05 = mediaDescription.getSubtitle();
        r4.A04 = mediaDescription.getDescription();
        r4.A00 = mediaDescription.getIconBitmap();
        r4.A01 = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras.setClassLoader(AnonymousClass0GT.class.getClassLoader());
            try {
                extras.isEmpty();
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
                extras = null;
            }
        }
        if (extras != null) {
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            bundle = extras;
        } else {
            uri = null;
            bundle = extras;
        }
        r4.A03 = bundle;
        if (uri != null) {
            r4.A02 = uri;
        } else if (i >= 23) {
            r4.A02 = mediaDescription.getMediaUri();
        }
        String str = r4.A07;
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(r4.A00, r4.A01, r4.A02, r4.A03, r4.A06, r4.A05, r4.A04, str);
        mediaDescriptionCompat.A00 = mediaDescription;
        return mediaDescriptionCompat;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Uri uri;
        MediaDescription mediaDescription = this.A00;
        if (mediaDescription == null) {
            int i2 = Build.VERSION.SDK_INT;
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.A08);
            builder.setTitle(this.A07);
            builder.setSubtitle(this.A06);
            builder.setDescription(this.A05);
            builder.setIconBitmap(this.A01);
            builder.setIconUri(this.A02);
            Bundle bundle = this.A04;
            if (i2 < 23 && (uri = this.A03) != null) {
                if (bundle == null) {
                    bundle = AnonymousClass002.A08();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.A03);
            }
            mediaDescription = builder.build();
            this.A00 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Bitmap bitmap, Uri uri, Uri uri2, Bundle bundle, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        this.A08 = str;
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A05 = charSequence3;
        this.A01 = bitmap;
        this.A02 = uri;
        this.A04 = bundle;
        this.A03 = uri2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A07);
        A0o.append(", ");
        A0o.append(this.A06);
        A0o.append(", ");
        return AnonymousClass000.A0R(this.A05, A0o);
    }
}
