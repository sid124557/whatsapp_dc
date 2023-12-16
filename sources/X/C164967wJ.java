package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.7wJ  reason: invalid class name and case insensitive filesystem */
public final class C164967wJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 5:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 6:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 7:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 8:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                case 9:
                    z3 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 10:
                    str4 = C162447s6.A0D(parcel, readInt);
                    break;
                case 11:
                    str5 = C162447s6.A0D(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new ConnectionConfiguration(str, str2, str3, str4, str5, i, i2, z, z2, z3);
    }
}
