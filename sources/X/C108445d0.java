package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5d0  reason: invalid class name and case insensitive filesystem */
public final class C108445d0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        int i = 0;
        while (i != readInt) {
            i = C86644Kx.A02(parcel, C108785dY.CREATOR, A0I, i);
        }
        return new C108725dS(A0a, readString, A0I);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108725dS[i];
    }
}
