package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uP  reason: invalid class name and case insensitive filesystem */
public final class C163807uP implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142986y8[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C142986y8.A00(parcel.readString());
        } catch (C143236yY e) {
            throw C18330xA.A09(e);
        }
    }
}
