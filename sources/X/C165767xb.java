package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: X.7xb  reason: invalid class name and case insensitive filesystem */
public final class C165767xb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        Scope[] scopeArr = AnonymousClass6SU.A0F;
        Bundle A08 = AnonymousClass002.A08();
        C127806Tj[] r9 = AnonymousClass6SU.A0E;
        String str = null;
        C127806Tj[] r10 = r9;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
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
                    i3 = C162447s6.A03(parcel2, readInt);
                    break;
                case 4:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C162447s6.A09(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C162447s6.A0R(parcel2, Scope.CREATOR, readInt);
                    break;
                case 7:
                    A08 = C162447s6.A08(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) C162447s6.A0A(parcel2, Account.CREATOR, readInt);
                    break;
                case 10:
                    r9 = (C127806Tj[]) C162447s6.A0R(parcel2, C127806Tj.CREATOR, readInt);
                    break;
                case 11:
                    r10 = (C127806Tj[]) C162447s6.A0R(parcel2, C127806Tj.CREATOR, readInt);
                    break;
                case 12:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 13:
                    i4 = C162447s6.A03(parcel2, readInt);
                    break;
                case 14:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel2, readInt));
                    break;
                case 15:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new AnonymousClass6SU(account, A08, iBinder, str, str2, r9, r10, scopeArr, i, i2, i3, i4, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SU[i];
    }

    public static void A00(Parcel parcel, AnonymousClass6SU r5, int i) {
        int A00 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, r5.A0C);
        C162417s1.A07(parcel, 2, r5.A0D);
        C162417s1.A07(parcel, 3, r5.A00);
        C162417s1.A0B(parcel, r5.A05, 4, false);
        C162417s1.A03(r5.A04, parcel, 5);
        C162417s1.A0F(parcel, r5.A0B, 6, i);
        C162417s1.A02(r5.A03, parcel, 7);
        C162417s1.A0A(parcel, r5.A02, 8, i, false);
        C162417s1.A0F(parcel, r5.A09, 10, i);
        C162417s1.A0F(parcel, r5.A0A, 11, i);
        C162417s1.A09(parcel, 12, r5.A07);
        C162417s1.A07(parcel, 13, r5.A01);
        C162417s1.A09(parcel, 14, r5.A08);
        C162417s1.A0B(parcel, r5.A06, 15, false);
        C162417s1.A06(parcel, A00);
    }
}
