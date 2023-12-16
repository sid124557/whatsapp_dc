package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.7xD  reason: invalid class name and case insensitive filesystem */
public final class C165527xD implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceInfo[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PlaceInfo(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
    }
}
