package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uX  reason: invalid class name and case insensitive filesystem */
public final class C163887uX implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142976y7[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C142976y7.A00(parcel.readString());
        } catch (C143206yV e) {
            throw C18330xA.A09(e);
        }
    }
}
