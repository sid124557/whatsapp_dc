package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.6Tj  reason: invalid class name and case insensitive filesystem */
public class C127806Tj extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163667uB();
    @Deprecated
    public final int A00;
    public final long A01;
    public final String A02;

    public static C127806Tj A00(String str, long j) {
        return new C127806Tj(str, j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C127806Tj) {
            C127806Tj r9 = (C127806Tj) obj;
            String str = this.A02;
            String str2 = r9.A02;
            if (str == null ? str2 == null : str.equals(str2)) {
                long j = this.A01;
                if (j == -1) {
                    j = (long) this.A00;
                }
                long j2 = r9.A01;
                if (j2 == -1) {
                    j2 = (long) r9.A00;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        C151567Vh r5 = new C151567Vh(this);
        r5.A00(this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        r5.A00(Long.valueOf(j), "version");
        return r5.toString();
    }

    public C127806Tj(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A02;
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        AnonymousClass001.A1Q(A0M, j);
        return Arrays.hashCode(A0M);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A02, 1, false);
        int i2 = this.A00;
        C162417s1.A07(parcel, 2, i2);
        long j = this.A01;
        if (j == -1) {
            j = (long) i2;
        }
        C162417s1.A08(parcel, 3, j);
        C162417s1.A06(parcel, A002);
    }

    public C127806Tj(String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = -1;
    }
}
