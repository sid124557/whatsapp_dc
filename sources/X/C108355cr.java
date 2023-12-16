package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5cr  reason: invalid class name and case insensitive filesystem */
public final class C108355cr implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        boolean A1S = AnonymousClass000.A1S(parcel.readByte());
        Parcelable A0C = C18280x3.A0C(parcel, C109055e0.class);
        C626936e.A06(A0C);
        C162457s7.A0D(A0C);
        return new C109075e2((C109055e0) A0C, parcel.readFloat(), parcel.readFloat(), A1S);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109075e2[i];
    }
}
