package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38R  reason: invalid class name */
public final class AnonymousClass38R implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass38X[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass38X(parcel.readLong(), AnonymousClass0x2.A0a(parcel), parcel.readString());
    }
}
