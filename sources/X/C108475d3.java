package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5d3  reason: invalid class name and case insensitive filesystem */
public final class C108475d3 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Parcel parcel2 = parcel;
        C998958p valueOf = C998958p.valueOf(AnonymousClass0x2.A0a(parcel2));
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        int readInt = parcel2.readInt();
        String readString3 = parcel2.readString();
        int readInt2 = parcel2.readInt();
        boolean A1S = AnonymousClass000.A1S(parcel2.readInt());
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        String readString8 = parcel2.readString();
        long readLong = parcel2.readLong();
        String readString9 = parcel2.readString();
        int readInt3 = parcel2.readInt();
        String readString10 = parcel2.readString();
        String readString11 = parcel2.readString();
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C108565dC.CREATOR.createFromParcel(parcel2);
        }
        return new C108935do((C108565dC) createFromParcel, valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, parcel2.readString(), parcel2.readString(), readInt, readInt2, readInt3, readLong, A1S);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108935do[i];
    }
}
