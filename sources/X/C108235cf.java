package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5cf  reason: invalid class name and case insensitive filesystem */
public final class C108235cf implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Parcel parcel2 = parcel;
        String A0a = AnonymousClass0x2.A0a(parcel2);
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        int readInt = parcel2.readInt();
        AnonymousClass57v valueOf = AnonymousClass57v.valueOf(parcel2.readString());
        ArrayList arrayList = null;
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C108605dG.CREATOR.createFromParcel(parcel2);
        }
        C108605dG r5 = (C108605dG) createFromParcel;
        if (parcel2.readInt() != 0) {
            int readInt2 = parcel2.readInt();
            arrayList = AnonymousClass002.A0I(readInt2);
            for (int i = 0; i != readInt2; i = C86644Kx.A02(parcel2, C108595dF.CREATOR, arrayList, i)) {
            }
        }
        return new C108585dE(valueOf, r5, A0a, readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108585dE[i];
    }
}
