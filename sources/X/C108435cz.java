package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5cz  reason: invalid class name and case insensitive filesystem */
public final class C108435cz implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C633338v.CREATOR.createFromParcel(parcel);
        }
        return new C632838q((C633338v) createFromParcel, A0a, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632838q[i];
    }
}
