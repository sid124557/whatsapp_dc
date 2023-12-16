package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5cc  reason: invalid class name and case insensitive filesystem */
public final class C108205cc implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        if (C18310x6.A04(parcel) == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            int i = 0;
            while (i != readInt) {
                i = C86644Kx.A02(parcel, C108535d9.CREATOR, A0I, i);
            }
        }
        return new C108545dA(C997958f.valueOf(parcel.readString()), C996057h.valueOf(parcel.readString()), parcel.readString(), A0I, parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108545dA[i];
    }
}
