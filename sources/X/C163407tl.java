package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.7tl  reason: invalid class name and case insensitive filesystem */
public final class C163407tl implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList = C162447s6.A0G(parcel, Scope.CREATOR, readInt);
                    break;
                case 3:
                    account = (Account) C162447s6.A0A(parcel, Account.CREATOR, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 5:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 6:
                    z3 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 7:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 8:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = C162447s6.A0G(parcel, AnonymousClass6SC.CREATOR, readInt);
                    break;
                case 10:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        HashMap A0t = AnonymousClass001.A0t();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AnonymousClass6SC r1 = (AnonymousClass6SC) it.next();
                AnonymousClass0x2.A1H(r1, A0t, r1.A00);
            }
        }
        return new GoogleSignInOptions(account, str, str2, str3, arrayList, A0t, i, z, z2, z3);
    }
}
