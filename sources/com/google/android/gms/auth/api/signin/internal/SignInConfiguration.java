package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass7RL;
import X.C162177rO;
import X.C162417s1;
import X.C163387tj;
import X.C1695389r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C163387tj();
    public final GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        AnonymousClass7RL r1 = new AnonymousClass7RL();
        r1.A00(this.A01);
        r1.A00(this.A00);
        return r1.A00;
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        C162177rO.A05(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 5, i, C1695389r.A07(parcel, this.A01));
        C162417s1.A06(parcel, A002);
    }
}
