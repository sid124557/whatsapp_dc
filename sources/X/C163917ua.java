package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ua  reason: invalid class name and case insensitive filesystem */
public final class C163917ua implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T4[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127466Sb r3 = null;
        C127546Sj r10 = null;
        C127486Sd r5 = null;
        C127566Sl r12 = null;
        C127506Sf r6 = null;
        C127516Sg r7 = null;
        C127556Sk r11 = null;
        C127526Sh r8 = null;
        C127476Sc r4 = null;
        C127536Si r9 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (C127466Sb) C162447s6.A0A(parcel, C127466Sb.CREATOR, readInt);
                    break;
                case 3:
                    r10 = (C127546Sj) C162447s6.A0A(parcel, C127546Sj.CREATOR, readInt);
                    break;
                case 4:
                    r5 = (C127486Sd) C162447s6.A0A(parcel, C127486Sd.CREATOR, readInt);
                    break;
                case 5:
                    r12 = (C127566Sl) C162447s6.A0A(parcel, C127566Sl.CREATOR, readInt);
                    break;
                case 6:
                    r6 = (C127506Sf) C162447s6.A0A(parcel, C127506Sf.CREATOR, readInt);
                    break;
                case 7:
                    r7 = (C127516Sg) C162447s6.A0A(parcel, C127516Sg.CREATOR, readInt);
                    break;
                case 8:
                    r11 = (C127556Sk) C162447s6.A0A(parcel, C127556Sk.CREATOR, readInt);
                    break;
                case 9:
                    r8 = (C127526Sh) C162447s6.A0A(parcel, C127526Sh.CREATOR, readInt);
                    break;
                case 10:
                    r4 = (C127476Sc) C162447s6.A0A(parcel, C127476Sc.CREATOR, readInt);
                    break;
                case 11:
                    r9 = (C127536Si) C162447s6.A0A(parcel, C127536Si.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T4(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }
}
