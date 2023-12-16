package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38Q  reason: invalid class name */
public final class AnonymousClass38Q implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass39M[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        boolean A1S = AnonymousClass000.A1S(parcel.readInt());
        boolean A1S2 = AnonymousClass000.A1S(parcel.readInt());
        boolean A1S3 = AnonymousClass000.A1S(parcel.readInt());
        boolean A1S4 = AnonymousClass000.A1S(parcel.readInt());
        boolean A1S5 = AnonymousClass000.A1S(parcel.readInt());
        return new AnonymousClass39M(A0a, readString, readString2, readString3, readString4, readString5, readString6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readInt, readInt2, parcel.readInt(), A1S, A1S2, A1S3, A1S4, A1S5);
    }
}
