package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6Uu  reason: invalid class name and case insensitive filesystem */
public final class C128106Uu extends AnonymousClass6UK {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new C163247tV();
    public C128116Uv A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A06 = A0t;
        A0t.put("authenticatorInfo", new C127856To(C128116Uv.class, "authenticatorInfo", 11, 11, 2, false, false));
        A0t.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, new C127856To((Class) null, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, 7, 7, 3, false, false));
        A0t.put("package", new C127856To((Class) null, "package", 7, 7, 4, false, false));
    }

    public C128106Uu(C128116Uv r1, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        Set set = this.A05;
        if (C18300x5.A1X(set, 1)) {
            C162417s1.A07(parcel, 1, this.A04);
        }
        if (C18300x5.A1X(set, 2)) {
            C162417s1.A0A(parcel, this.A00, 2, i, true);
        }
        if (C18300x5.A1X(set, 3)) {
            C162417s1.A0B(parcel, this.A01, 3, true);
        }
        if (C18300x5.A1X(set, 4)) {
            C162417s1.A0B(parcel, this.A02, 4, true);
        }
        if (C18300x5.A1X(set, 5)) {
            C162417s1.A0B(parcel, this.A03, 5, true);
        }
        C162417s1.A06(parcel, A002);
    }

    public C128106Uu() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
