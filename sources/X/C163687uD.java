package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uD  reason: invalid class name and case insensitive filesystem */
public final class C163687uD implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142966y6[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C142966y6.A00(parcel.readString());
        } catch (C143196yU e) {
            throw C18330xA.A09(e);
        }
    }
}
