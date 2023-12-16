package com.google.android.gms.auth.api.signin;

import X.C162177rO;
import X.C162417s1;
import X.C163417tm;
import X.C1695389r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C163417tm();
    public final GoogleSignInAccount A00;
    @Deprecated
    public final String A01;
    @Deprecated
    public final String A02;

    public SignInAccount(GoogleSignInAccount googleSignInAccount, String str, String str2) {
        this.A00 = googleSignInAccount;
        C162177rO.A07(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        C162177rO.A07(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01, 4, false);
        C162417s1.A0A(parcel, this.A00, 7, i, false);
        C162417s1.A0B(parcel, this.A02, 8, false);
        C162417s1.A06(parcel, A002);
    }
}
