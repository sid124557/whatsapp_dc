package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uL  reason: invalid class name and case insensitive filesystem */
public final class C163767uL implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127836Tm[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        AnonymousClass6UV r5 = null;
        AnonymousClass6UW r4 = null;
        AnonymousClass6UU r6 = null;
        AnonymousClass6TC r3 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 2:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    bArr = C162447s6.A0O(parcel, readInt);
                    break;
                case 4:
                    r5 = (AnonymousClass6UV) C162447s6.A0A(parcel, AnonymousClass6UV.CREATOR, readInt);
                    break;
                case 5:
                    r4 = (AnonymousClass6UW) C162447s6.A0A(parcel, AnonymousClass6UW.CREATOR, readInt);
                    break;
                case 6:
                    r6 = (AnonymousClass6UU) C162447s6.A0A(parcel, AnonymousClass6UU.CREATOR, readInt);
                    break;
                case 7:
                    r3 = (AnonymousClass6TC) C162447s6.A0A(parcel, AnonymousClass6TC.CREATOR, readInt);
                    break;
                case 8:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127836Tm(r3, r4, r5, r6, str, str2, str3, bArr);
    }
}
