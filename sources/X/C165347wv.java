package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wv  reason: invalid class name and case insensitive filesystem */
public final class C165347wv implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C165997xy[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object obj = null;
        if (C18310x6.A04(parcel) == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C108775dX.CREATOR.createFromParcel(parcel);
        }
        C108775dX r1 = (C108775dX) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C108775dX.CREATOR.createFromParcel(parcel);
        }
        return new C165997xy(r1, (C108775dX) obj);
    }
}
