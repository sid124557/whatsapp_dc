package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.6Uv  reason: invalid class name and case insensitive filesystem */
public final class C128116Uv extends AnonymousClass6UK {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new C163257tW();
    public int A00;
    public PendingIntent A01;
    public AnonymousClass6SK A02;
    public String A03;
    public byte[] A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A07 = A0t;
        A0t.put("accountType", new C127856To((Class) null, "accountType", 7, 7, 2, false, false));
        A0t.put("status", new C127856To((Class) null, "status", 0, 0, 3, false, false));
        A0t.put("transferBytes", new C127856To((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public C128116Uv(PendingIntent pendingIntent, AnonymousClass6SK r2, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = bArr;
        this.A01 = pendingIntent;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        Set set = this.A06;
        if (C18300x5.A1X(set, 1)) {
            C162417s1.A07(parcel, 1, this.A05);
        }
        if (C18300x5.A1X(set, 2)) {
            C162417s1.A0B(parcel, this.A03, 2, true);
        }
        if (C18300x5.A1X(set, 3)) {
            C162417s1.A07(parcel, 3, this.A00);
        }
        if (C18300x5.A1X(set, 4)) {
            C162417s1.A0E(parcel, this.A04, 4, true);
        }
        if (C18300x5.A1X(set, 5)) {
            C162417s1.A0A(parcel, this.A01, 5, i, true);
        }
        if (C18300x5.A1X(set, 6)) {
            C162417s1.A0A(parcel, this.A02, 6, i, true);
        }
        C162417s1.A06(parcel, A002);
    }

    public C128116Uv() {
        this.A06 = new C13570nO(3);
        this.A05 = 1;
    }
}
