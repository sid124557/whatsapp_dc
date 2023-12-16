package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.7vL  reason: invalid class name and case insensitive filesystem */
public final class C164367vL implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TZ[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                dataHolder = (DataHolder) C162447s6.A0A(parcel, DataHolder.CREATOR, readInt);
            } else if (c == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C162447s6.A0A(parcel, ParcelFileDescriptor.CREATOR, readInt);
            } else if (c != 5) {
                bArr = C162447s6.A0P(parcel, bArr, c, 6, readInt);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TZ(parcelFileDescriptor, dataHolder, str, bArr, j);
    }
}
