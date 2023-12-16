package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xO  reason: invalid class name and case insensitive filesystem */
public final class C165637xO implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633338v[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C142396x8 valueOf;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        C142406x9 r2 = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = C142396x8.valueOf(parcel.readString());
        }
        if (parcel.readInt() != 0) {
            r2 = C142406x9.valueOf(parcel.readString());
        }
        return new C633338v(valueOf, r2, A0a, readString, readString2);
    }
}
