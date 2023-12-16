package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7x0  reason: invalid class name and case insensitive filesystem */
public final class C165397x0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166177yG[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        Parcelable.Creator creator = C166097y8.CREATOR;
        return new C166177yG((C166097y8) creator.createFromParcel(parcel), (C166097y8) creator.createFromParcel(parcel), (C166097y8) creator.createFromParcel(parcel), A0a, parcel.readInt());
    }
}
