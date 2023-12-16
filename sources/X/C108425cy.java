package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;

/* renamed from: X.5cy  reason: invalid class name and case insensitive filesystem */
public final class C108425cy implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        Parcel parcel2 = parcel;
        int A04 = C18310x6.A04(parcel2);
        double readDouble = parcel2.readDouble();
        double readDouble2 = parcel2.readDouble();
        int readInt = parcel2.readInt();
        String readString = parcel2.readString();
        int readInt2 = parcel2.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt2);
        for (int i = 0; i != readInt2; i = C86644Kx.A02(parcel2, PlaceInfo.CREATOR, A0I, i)) {
        }
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        int readInt3 = parcel2.readInt();
        if (parcel2.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel2.readInt());
        }
        String readString5 = parcel2.readString();
        boolean A1S = AnonymousClass000.A1S(parcel2.readInt());
        return new C109005dv(valueOf, readString, readString2, readString3, readString4, readString5, parcel2.readString(), A0I, readDouble, readDouble2, A04, readInt, readInt3, parcel2.readLong(), A1S, AnonymousClass000.A1S(parcel2.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109005dv[i];
    }
}
