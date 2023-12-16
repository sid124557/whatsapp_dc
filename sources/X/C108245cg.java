package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5cg  reason: invalid class name and case insensitive filesystem */
public final class C108245cg implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        if (C18310x6.A04(parcel) == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new C108605dG(valueOf, parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108605dG[i];
    }
}
