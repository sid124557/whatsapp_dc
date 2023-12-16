package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37k  reason: invalid class name and case insensitive filesystem */
public final class C629637k implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass38Y[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass38Y(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
