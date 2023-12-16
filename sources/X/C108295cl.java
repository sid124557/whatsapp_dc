package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5cl  reason: invalid class name and case insensitive filesystem */
public final class C108295cl implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        String A0a = AnonymousClass0x2.A0a(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new C108525d8(valueOf, num, A0a);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108525d8[i];
    }
}
