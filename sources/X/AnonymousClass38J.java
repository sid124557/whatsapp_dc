package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38J  reason: invalid class name */
public final class AnonymousClass38J implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632138j[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C632138j(AnonymousClass0x2.A0a(parcel), parcel.readString());
    }
}
