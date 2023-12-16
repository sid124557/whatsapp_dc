package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ty  reason: invalid class name and case insensitive filesystem */
public final class C163537ty implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T1[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        IBinder iBinder = null;
        C127866Tp r5 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                iBinder = C162447s6.A09(parcel, readInt);
            } else if (c == 3) {
                r5 = (C127866Tp) C162447s6.A0A(parcel, C127866Tp.CREATOR, readInt);
            } else if (c != 4) {
                z2 = C162447s6.A0M(parcel, c, 5, readInt, z2);
            } else {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T1(iBinder, r5, i, z, z2);
    }
}
