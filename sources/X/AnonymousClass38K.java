package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38K  reason: invalid class name */
public final class AnonymousClass38K implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633438w[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        return new C633438w(A0a, readString, parcel.readString(), parcel.readString(), parcel.readString(), readInt, parcel.readInt(), parcel.readInt(), AnonymousClass000.A1S(parcel.readInt()));
    }
}
