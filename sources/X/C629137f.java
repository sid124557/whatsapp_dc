package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37f  reason: invalid class name and case insensitive filesystem */
public final class C629137f implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C631738f[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C631738f(AnonymousClass0x2.A0a(parcel), parcel.readString());
    }
}
