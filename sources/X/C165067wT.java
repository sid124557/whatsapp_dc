package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wT  reason: invalid class name and case insensitive filesystem */
public final class C165067wT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166017y0[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C166187yH.CREATOR.createFromParcel(parcel);
        }
        return new C166017y0((C166187yH) createFromParcel, A0a, readString);
    }
}
