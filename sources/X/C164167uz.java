package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: X.7uz  reason: invalid class name and case insensitive filesystem */
public final class C164167uz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel2, readInt);
                    break;
                case 2:
                    j = C162447s6.A07(parcel2, readInt);
                    break;
                case 3:
                    j2 = C162447s6.A07(parcel2, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 5:
                    j3 = C162447s6.A07(parcel2, readInt);
                    break;
                case 6:
                    i2 = C162447s6.A03(parcel2, readInt);
                    break;
                case 7:
                    f = C162447s6.A01(parcel2, readInt);
                    break;
                case 8:
                    j4 = C162447s6.A07(parcel2, readInt);
                    break;
                case 9:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new LocationRequest(f, i, i2, j, j2, j3, j4, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
