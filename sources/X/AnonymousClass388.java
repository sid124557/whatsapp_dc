package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.388  reason: invalid class name */
public final class AnonymousClass388 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632438m[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C632438m(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString());
    }
}
