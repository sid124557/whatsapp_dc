package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7vB  reason: invalid class name and case insensitive filesystem */
public final class C164267vB implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = C162447s6.A0B(parcel2, readInt);
                    break;
                case 3:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 4:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C162447s6.A09(parcel2, readInt);
                    break;
                case 6:
                    f = C162447s6.A01(parcel2, readInt);
                    break;
                case 7:
                    f2 = C162447s6.A01(parcel2, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 10:
                    z3 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 11:
                    f3 = C162447s6.A01(parcel2, readInt);
                    break;
                case 12:
                    f4 = C162447s6.A01(parcel2, readInt);
                    break;
                case 13:
                    f5 = C162447s6.A01(parcel2, readInt);
                    break;
                case 14:
                    f6 = C162447s6.A01(parcel2, readInt);
                    break;
                case 15:
                    f7 = C162447s6.A01(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new C127776Tg(iBinder, latLng, str, str2, f, f2, f3, f4, f5, f6, f7, z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127776Tg[i];
    }
}
