package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.7tk  reason: invalid class name and case insensitive filesystem */
public final class C163397tk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel2, readInt);
                    break;
                case 2:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 3:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 4:
                    str3 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    str4 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C162447s6.A0A(parcel2, Uri.CREATOR, readInt);
                    break;
                case 7:
                    str5 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 8:
                    j = C162447s6.A07(parcel2, readInt);
                    break;
                case 9:
                    str6 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 10:
                    arrayList = C162447s6.A0G(parcel2, Scope.CREATOR, readInt);
                    break;
                case 11:
                    str7 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 12:
                    str8 = C162447s6.A0D(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new GoogleSignInAccount(uri, str, str2, str3, str4, str5, str6, str7, str8, arrayList, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
