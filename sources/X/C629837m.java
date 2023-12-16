package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37m  reason: invalid class name and case insensitive filesystem */
public final class C629837m implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass39D[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new AnonymousClass39D(valueOf, l, A0a, readString, readString2, readString3, readString4, readString5, readString6);
    }
}
