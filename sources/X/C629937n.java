package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37n  reason: invalid class name and case insensitive filesystem */
public final class C629937n implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632338l[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        String A0a = AnonymousClass0x2.A0a(parcel);
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1S(parcel.readInt()));
        }
        return new C632338l(valueOf, A0a, parcel.readString());
    }
}
