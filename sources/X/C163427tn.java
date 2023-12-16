package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tn  reason: invalid class name and case insensitive filesystem */
public final class C163427tn implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127306Rl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                z = C162447s6.A0M(parcel, c, 2, readInt, z);
            } else {
                bArr = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127306Rl(bArr, z);
    }
}
