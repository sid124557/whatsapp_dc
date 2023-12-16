package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ve  reason: invalid class name and case insensitive filesystem */
public final class C164557ve implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        AnonymousClass6SO[] r4 = null;
        C127366Rr[] r5 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel2, readInt);
                    break;
                case 2:
                    i2 = C162447s6.A03(parcel2, readInt);
                    break;
                case 3:
                    f = C162447s6.A01(parcel2, readInt);
                    break;
                case 4:
                    f2 = C162447s6.A01(parcel2, readInt);
                    break;
                case 5:
                    f3 = C162447s6.A01(parcel2, readInt);
                    break;
                case 6:
                    f4 = C162447s6.A01(parcel2, readInt);
                    break;
                case 7:
                    f5 = C162447s6.A01(parcel2, readInt);
                    break;
                case 8:
                    f6 = C162447s6.A01(parcel2, readInt);
                    break;
                case 9:
                    r4 = (AnonymousClass6SO[]) C162447s6.A0R(parcel2, AnonymousClass6SO.CREATOR, readInt);
                    break;
                case 10:
                    f8 = C162447s6.A01(parcel2, readInt);
                    break;
                case 11:
                    f9 = C162447s6.A01(parcel2, readInt);
                    break;
                case 12:
                    f10 = C162447s6.A01(parcel2, readInt);
                    break;
                case 13:
                    r5 = (C127366Rr[]) C162447s6.A0R(parcel2, C127366Rr.CREATOR, readInt);
                    break;
                case 14:
                    f7 = C162447s6.A01(parcel2, readInt);
                    break;
                case 15:
                    f11 = C162447s6.A01(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new AnonymousClass6SV(r4, r5, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SV[i];
    }
}
