package X;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: X.0wW  reason: invalid class name and case insensitive filesystem */
public class C17960wW implements Parcelable.Creator {
    public final int A00;

    public C17960wW(int i) {
        this.A00 = i;
    }

    public static C17960wW A00(int i) {
        return new C17960wW(i);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return MediaDescriptionCompat.A00(MediaDescription.CREATOR.createFromParcel(parcel));
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 6:
                return new MediaSessionCompat$Token(parcel.readParcelable((ClassLoader) null));
            case 7:
                return new ParcelableVolumeInfo(parcel);
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 10:
                return new AnonymousClass0ZR(parcel);
            case 11:
                return new C06800Zg(parcel);
            case 12:
                return new C06760Zc(parcel);
            case 13:
                return new AnonymousClass0ZY(parcel);
            case 14:
                return new AnonymousClass02R(parcel);
            case 15:
                return new AnonymousClass02T(parcel);
            case 16:
                return new C06780Ze(parcel);
            case 17:
                return new AnonymousClass0ZP(parcel);
            case 18:
                return new C06740Za(parcel);
            case 19:
                return new C06770Zd(parcel);
            case 20:
                return new C06820Zi(parcel);
            case 21:
                return new C010408n(parcel);
            case 22:
                return new C010508o(parcel);
            case 23:
                return new C010608p(parcel);
            case 24:
                return new AnonymousClass02J(parcel);
            case 25:
                return new C010708q(parcel);
            case 26:
                return new C010808s(parcel);
            case 27:
                return new AnonymousClass08r(parcel);
            case 28:
                return new C06840Zk(parcel);
            case 29:
                return new C06810Zh(parcel);
            case 30:
                return new C06850Zl(parcel);
            case 31:
                return new ParcelImpl(parcel);
            default:
                return new AnonymousClass02S(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new AnonymousClass0ZR[i];
            case 11:
                return new C06800Zg[i];
            case 12:
                return new C06760Zc[i];
            case 13:
                return new AnonymousClass0ZY[i];
            case 14:
                return new AnonymousClass02R[i];
            case 15:
                return new AnonymousClass02T[i];
            case 16:
                return new C06780Ze[i];
            case 17:
                return new AnonymousClass0ZP[i];
            case 18:
                return new C06740Za[i];
            case 19:
                return new C06770Zd[i];
            case 20:
                return new C06820Zi[i];
            case 21:
                return new C010408n[i];
            case 22:
                return new C010508o[i];
            case 23:
                return new C010608p[i];
            case 24:
                return new AnonymousClass02J[i];
            case 25:
                return new C010708q[i];
            case 26:
                return new C010808s[i];
            case 27:
                return new AnonymousClass08r[i];
            case 28:
                return new C06840Zk[i];
            case 29:
                return new C06810Zh[i];
            case 30:
                return new C06850Zl[i];
            case 31:
                return new ParcelImpl[i];
            default:
                return new AnonymousClass02S[i];
        }
    }
}
