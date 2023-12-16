package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vf  reason: invalid class name and case insensitive filesystem */
public final class C164567vf implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127716Ta[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 3:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 4:
                    i3 = C162447s6.A03(parcel, readInt);
                    break;
                case 5:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 6:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 7:
                    f = C162447s6.A01(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127716Ta(f, i, i2, i3, z, z2);
    }
}
