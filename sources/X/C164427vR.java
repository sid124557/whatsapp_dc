package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vR  reason: invalid class name and case insensitive filesystem */
public final class C164427vR implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        AnonymousClass6TX r8 = null;
        AnonymousClass6TP r10 = null;
        AnonymousClass6TQ r11 = null;
        AnonymousClass6TV r13 = null;
        AnonymousClass6TR r12 = null;
        AnonymousClass6TO r9 = null;
        C127726Tb r5 = null;
        C127736Tc r6 = null;
        C127786Th r7 = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C162447s6.A03(parcel2, readInt);
                    break;
                case 3:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 4:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    i2 = C162447s6.A03(parcel2, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) C162447s6.A0R(parcel2, Point.CREATOR, readInt);
                    break;
                case 7:
                    r8 = (AnonymousClass6TX) C162447s6.A0A(parcel2, AnonymousClass6TX.CREATOR, readInt);
                    break;
                case 8:
                    r10 = (AnonymousClass6TP) C162447s6.A0A(parcel2, AnonymousClass6TP.CREATOR, readInt);
                    break;
                case 9:
                    r11 = (AnonymousClass6TQ) C162447s6.A0A(parcel2, AnonymousClass6TQ.CREATOR, readInt);
                    break;
                case 10:
                    r13 = (AnonymousClass6TV) C162447s6.A0A(parcel2, AnonymousClass6TV.CREATOR, readInt);
                    break;
                case 11:
                    r12 = (AnonymousClass6TR) C162447s6.A0A(parcel2, AnonymousClass6TR.CREATOR, readInt);
                    break;
                case 12:
                    r9 = (AnonymousClass6TO) C162447s6.A0A(parcel2, AnonymousClass6TO.CREATOR, readInt);
                    break;
                case 13:
                    r5 = (C127726Tb) C162447s6.A0A(parcel2, C127726Tb.CREATOR, readInt);
                    break;
                case 14:
                    r6 = (C127736Tc) C162447s6.A0A(parcel2, C127736Tc.CREATOR, readInt);
                    break;
                case 15:
                    r7 = (C127786Th) C162447s6.A0A(parcel2, C127786Th.CREATOR, readInt);
                    break;
                case 16:
                    bArr = C162447s6.A0O(parcel2, readInt);
                    break;
                case 17:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new C127796Ti(r5, r6, r7, r8, r9, r10, r11, r12, r13, str, str2, bArr, pointArr, i, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C127796Ti[i];
    }
}
