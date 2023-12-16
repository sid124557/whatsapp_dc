package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.5co  reason: invalid class name and case insensitive filesystem */
public final class C108325co implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C160617ny r3;
        Object createFromParcel;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString2 = parcel.readString();
        if (readString2 != null) {
            r3 = new C160617ny(readString2);
        } else {
            r3 = null;
        }
        C166357yY r2 = (C166357yY) C18280x3.A0C(parcel, C108635dJ.class);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C108755dV.CREATOR.createFromParcel(parcel);
        }
        return new C108635dJ((C108755dV) createFromParcel, r2, r3, A0a, readString, bigDecimal, readInt, readInt2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108635dJ[i];
    }
}
