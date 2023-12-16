package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.6SL  reason: invalid class name */
public final class AnonymousClass6SL extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163527tx();
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public AnonymousClass6SL(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        boolean A06 = C1695389r.A06(parcel, this.A02, i);
        C162417s1.A07(parcel, 3, this.A01);
        C162417s1.A0A(parcel, this.A03, 4, i, A06);
        C162417s1.A06(parcel, A002);
    }
}
