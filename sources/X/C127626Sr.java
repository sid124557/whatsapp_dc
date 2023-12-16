package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sr  reason: invalid class name and case insensitive filesystem */
public class C127626Sr extends C1695389r {
    public static final C127626Sr A02 = new C127626Sr(C142956y5.NOT_SUPPORTED.toString(), (String) null);
    public static final C127626Sr A03 = new C127626Sr(C142956y5.SUPPORTED.toString(), (String) null);
    public static final Parcelable.Creator CREATOR = new C163847uT();
    public final C142956y5 A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (X.C127626Sr) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C127626Sr
            r2 = 0
            if (r0 == 0) goto L_0x0025
            X.6Sr r4 = (X.C127626Sr) r4
            X.6y5 r1 = r3.A00
            X.6y5 r0 = r4.A00
            if (r1 == r0) goto L_0x0015
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0015:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 == r0) goto L_0x0023
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r0 = 1
            return r0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127626Sr.equals(java.lang.Object):boolean");
    }

    public C127626Sr(String str, String str2) {
        C162177rO.A02(str);
        try {
            for (C142956y5 r1 : C142956y5.values()) {
                if (str.equals(r1.zzb)) {
                    this.A00 = r1;
                    this.A01 = str2;
                    return;
                }
            }
            throw new C143256ya(str);
        } catch (C143256ya e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00.toString()));
        C162417s1.A06(parcel, A002);
    }
}
