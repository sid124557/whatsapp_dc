package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wz  reason: invalid class name and case insensitive filesystem */
public final class C165387wz implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        byte readByte = parcel.readByte();
        return new C165877xm(AnonymousClass002.A0B(C18310x6.A0l(parcel)), readByte, parcel.readInt(), AnonymousClass29S.A00(parcel).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C165877xm[i];
    }
}
