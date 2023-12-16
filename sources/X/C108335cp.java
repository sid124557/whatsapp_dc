package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5cp  reason: invalid class name and case insensitive filesystem */
public final class C108335cp implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        String readString = parcel.readString();
        C626936e.A06(readString);
        C162457s7.A0D(readString);
        double readDouble = parcel.readDouble();
        double readDouble2 = parcel.readDouble();
        boolean A1U = AnonymousClass000.A1U(parcel.readByte(), 1);
        double readDouble3 = parcel.readDouble();
        Parcelable A0C = C18280x3.A0C(parcel, C91824lC.class);
        C626936e.A06(A0C);
        C162457s7.A0D(A0C);
        C109055e0 r2 = new C109055e0((C109065e1) C18280x3.A0C(parcel, C109065e1.class), (C91824lC) A0C, readString, readDouble, readDouble2, readDouble3, A1U);
        r2.A00 = parcel.readDouble();
        r2.A04 = Double.valueOf(parcel.readDouble());
        r2.A01 = parcel.readInt();
        r2.A02 = parcel.readInt();
        r2.A05 = Double.valueOf(parcel.readDouble());
        return r2;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109055e0[i];
    }
}
