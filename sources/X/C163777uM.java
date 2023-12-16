package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* renamed from: X.7uM  reason: invalid class name and case insensitive filesystem */
public final class C163777uM implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127676Sw[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                bArr = C162447s6.A0O(parcel, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                arrayList = C162447s6.A0G(parcel, Transport.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127676Sw(str, arrayList, bArr);
    }
}
