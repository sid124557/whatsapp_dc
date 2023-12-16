package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* renamed from: X.7tj  reason: invalid class name and case insensitive filesystem */
public final class C163387tj implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 5) {
                C162447s6.A0I(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C162447s6.A0A(parcel, GoogleSignInOptions.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new SignInConfiguration(googleSignInOptions, str);
    }
}
