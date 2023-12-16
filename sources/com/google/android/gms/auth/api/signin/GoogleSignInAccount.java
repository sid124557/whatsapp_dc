package com.google.android.gms.auth.api.signin;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.C162417s1;
import X.C163397tk;
import X.C1695389r;
import X.C1695689u;
import X.C178448hY;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends C1695389r implements ReflectedParcelable {
    public static C178448hY A0D = C1695689u.A00;
    public static final Parcelable.Creator CREATOR = new C163397tk();
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = AnonymousClass002.A0K();
    public final int A0C;

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A07.equals(this.A07)) {
                        HashSet A15 = AnonymousClass0x9.A15(googleSignInAccount.A0A);
                        A15.addAll(googleSignInAccount.A0B);
                        HashSet A152 = AnonymousClass0x9.A15(this.A0A);
                        A152.addAll(this.A0B);
                        if (A15.equals(A152)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A07.hashCode() + 527) * 31;
        HashSet A15 = AnonymousClass0x9.A15(this.A0A);
        A15.addAll(this.A0B);
        return AnonymousClass002.A02(A15, hashCode);
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A0C = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A0C);
        boolean A072 = C1695389r.A07(parcel, this.A02);
        C162417s1.A0B(parcel, this.A03, 3, A072);
        C162417s1.A0B(parcel, this.A04, 4, A072);
        C162417s1.A0B(parcel, this.A05, 5, A072);
        C162417s1.A0A(parcel, this.A01, 6, i, A072);
        C162417s1.A0B(parcel, this.A06, 7, A072);
        C162417s1.A08(parcel, 8, this.A00);
        C162417s1.A0B(parcel, this.A07, 9, A072);
        C162417s1.A0D(parcel, this.A0A, 10, A072);
        C162417s1.A0B(parcel, this.A08, 11, A072);
        C162417s1.A0B(parcel, this.A09, 12, A072);
        C162417s1.A06(parcel, A002);
    }
}
