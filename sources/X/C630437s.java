package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37s  reason: invalid class name and case insensitive filesystem */
public final class C630437s implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C28061fQ[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18300x5.A1I(parcel);
        return new C28061fQ((C27981fH) C27981fH.CREATOR.createFromParcel(parcel), parcel.readInt());
    }
}
