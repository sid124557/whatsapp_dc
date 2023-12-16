package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6Us  reason: invalid class name and case insensitive filesystem */
public final class C128086Us extends AnonymousClass6UK {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new C163227tT();
    public int A00;
    public C128096Ut A01;
    public ArrayList A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A05 = A0t;
        A0t.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, new C127856To(C128106Uu.class, PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, 11, 11, 2, true, true));
        A0t.put("progress", new C127856To(C128096Ut.class, "progress", 11, 11, 4, false, false));
    }

    public C128086Us(C128096Ut r1, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A02 = arrayList;
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        Set set = this.A04;
        if (C18300x5.A1X(set, 1)) {
            C162417s1.A07(parcel, 1, this.A03);
        }
        if (C18300x5.A1X(set, 2)) {
            C162417s1.A0D(parcel, this.A02, 2, true);
        }
        if (C18300x5.A1X(set, 3)) {
            C162417s1.A07(parcel, 3, this.A00);
        }
        if (C18300x5.A1X(set, 4)) {
            C162417s1.A0A(parcel, this.A01, 4, i, true);
        }
        C162417s1.A06(parcel, A002);
    }

    public C128086Us() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }
}
