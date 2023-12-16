package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.7v7  reason: invalid class name and case insensitive filesystem */
public final class C164227v7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127766Tf[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = C162447s6.A0B(parcel, readInt);
                    break;
                case 3:
                    d = C162447s6.A00(parcel, readInt);
                    break;
                case 4:
                    f = C162447s6.A01(parcel, readInt);
                    break;
                case 5:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 6:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 7:
                    f2 = C162447s6.A01(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 10:
                    arrayList = C162447s6.A0G(parcel, AnonymousClass6T8.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127766Tf(latLng, arrayList, d, f, f2, i, i2, z, z2);
    }
}
