package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wS  reason: invalid class name and case insensitive filesystem */
public final class C165057wS implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C132006eX[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C132006eX(AnonymousClass59G.valueOf(parcel.readString()), AnonymousClass0x2.A0a(parcel), parcel.readInt());
    }
}
