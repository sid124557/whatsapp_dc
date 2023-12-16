package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38A  reason: invalid class name */
public final class AnonymousClass38A implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass39I[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass39I(AnonymousClass212.valueOf(AnonymousClass0x2.A0a(parcel)), parcel.readInt(), parcel.readInt());
    }
}
