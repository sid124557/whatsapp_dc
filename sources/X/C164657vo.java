package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vo  reason: invalid class name and case insensitive filesystem */
public final class C164657vo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SY[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                uri = (Uri) C162447s6.A0A(parcel, Uri.CREATOR, readInt);
            } else if (c != 4) {
                bArr = C162447s6.A0P(parcel, bArr, c, 5, readInt);
            } else {
                bundle = C162447s6.A08(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SY(uri, bundle, bArr);
    }
}
