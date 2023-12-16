package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: X.7tm  reason: invalid class name and case insensitive filesystem */
public final class C163417tm implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 4) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 7) {
                str2 = C162447s6.A0E(parcel, str2, c, 8, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C162447s6.A0A(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new SignInAccount(googleSignInAccount, str, str2);
    }
}
