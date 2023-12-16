package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9XT  reason: invalid class name */
public final class AnonymousClass9XT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new AnonymousClass9XY(parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass9XY[i];
    }
}
