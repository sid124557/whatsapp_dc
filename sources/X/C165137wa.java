package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7wa  reason: invalid class name and case insensitive filesystem */
public final class C165137wa implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C132206es[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        int i = 0;
        while (i != readInt) {
            i = C86644Kx.A02(parcel, C132226eu.CREATOR, A0I, i);
        }
        return new C132206es(A0a, A0I);
    }
}
