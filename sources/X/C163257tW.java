package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.7tW  reason: invalid class name and case insensitive filesystem */
public final class C163257tW implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C128116Uv[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        int A02 = C162447s6.A02(parcel);
        HashSet A0K = AnonymousClass002.A0K();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        AnonymousClass6SK r4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C162447s6.A03(parcel, readInt);
                    i = 1;
                    break;
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    i = 2;
                    break;
                case 3:
                    i3 = C162447s6.A03(parcel, readInt);
                    i = 3;
                    break;
                case 4:
                    bArr = C162447s6.A0O(parcel, readInt);
                    i = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C162447s6.A0A(parcel, PendingIntent.CREATOR, readInt);
                    i = 5;
                    break;
                case 6:
                    r4 = (AnonymousClass6SK) C162447s6.A0A(parcel, AnonymousClass6SK.CREATOR, readInt);
                    i = 6;
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    continue;
            }
            C18270x1.A1K(A0K, i);
        }
        if (parcel.dataPosition() == A02) {
            return new C128116Uv(pendingIntent, r4, str, A0K, bArr, i2, i3);
        }
        throw new AnonymousClass8RI(parcel, AnonymousClass000.A0Y("Overread allowed size end=", AnonymousClass001.A0o(), A02));
    }
}
