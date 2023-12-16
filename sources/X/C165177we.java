package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.7we  reason: invalid class name and case insensitive filesystem */
public final class C165177we implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166107y9[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i != readInt; i++) {
            A0I.add(C18280x3.A0C(parcel, C166107y9.class));
        }
        int readInt2 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            linkedHashMap.put(parcel.readSerializable(), C18280x3.A0C(parcel, C166107y9.class));
        }
        int readInt3 = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
        for (int i3 = 0; i3 != readInt3; i3++) {
            linkedHashMap2.put(C18280x3.A0C(parcel, C166107y9.class), parcel.readSerializable());
        }
        return new C166107y9(A0a, A0I, linkedHashMap, linkedHashMap2);
    }
}
