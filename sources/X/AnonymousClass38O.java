package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38O  reason: invalid class name */
public final class AnonymousClass38O implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632938r[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C632938r(AnonymousClass0x2.A0a(parcel), parcel.readInt(), parcel.readInt());
    }
}
