package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: X.7uu  reason: invalid class name and case insensitive filesystem */
public final class C164117uu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        List list = AnonymousClass6TG.A0B;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        list = C162447s6.A0G(parcel2, AnonymousClass6T7.CREATOR, readInt);
                        break;
                    case 6:
                        str = C162447s6.A0D(parcel2, readInt);
                        break;
                    case 7:
                        z = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                        break;
                    case 8:
                        z2 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                        break;
                    case 9:
                        z3 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                        break;
                    case 10:
                        str2 = C162447s6.A0D(parcel2, readInt);
                        break;
                    case 11:
                        z4 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                        break;
                    case 12:
                        z5 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                        break;
                    case 13:
                        str3 = C162447s6.A0D(parcel2, readInt);
                        break;
                    case 14:
                        j = C162447s6.A07(parcel2, readInt);
                        break;
                    default:
                        C162447s6.A0I(parcel2, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C162447s6.A0A(parcel2, LocationRequest.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new AnonymousClass6TG(locationRequest, str, str2, str3, list, j, z, z2, z3, z4, z5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TG[i];
    }
}
