package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Tm  reason: invalid class name and case insensitive filesystem */
public class C127836Tm extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163767uL();
    public final AnonymousClass6TC A00;
    public final AnonymousClass6UW A01;
    public final AnonymousClass6UV A02;
    public final AnonymousClass6UU A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public static C127836Tm A00(byte[] bArr) {
        return (C127836Tm) C162177rO.A00(CREATOR, bArr);
    }

    public AnonymousClass6TC A01() {
        return this.A00;
    }

    public C127206Rb A02() {
        C127206Rb r0 = this.A02;
        if (r0 != null || (r0 = this.A01) != null || (r0 = this.A03) != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("No response set.");
    }

    public String A03() {
        return this.A06;
    }

    public String A04() {
        return this.A04;
    }

    public String A05() {
        return this.A05;
    }

    public byte[] A06() {
        return this.A07;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C127836Tm) {
            C127836Tm r4 = (C127836Tm) obj;
            if (!AnonymousClass72K.A00(this.A04, r4.A04) || !AnonymousClass72K.A00(this.A05, r4.A05) || !Arrays.equals(this.A07, r4.A07) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A06, r4.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A04;
        objArr[1] = this.A05;
        objArr[2] = this.A07;
        objArr[3] = this.A01;
        objArr[4] = this.A02;
        objArr[5] = this.A03;
        objArr[6] = this.A00;
        return C18310x6.A08(this.A06, objArr, 7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 == null) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5 != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        throw X.AnonymousClass6CA.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r5 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1.A04 = r6;
        r1.A05 = r7;
        r1.A07 = r9;
        r1.A02 = r4;
        r1.A01 = r3;
        r1.A03 = r5;
        r1.A00 = r2;
        r1.A06 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C127836Tm(X.AnonymousClass6TC r2, X.AnonymousClass6UW r3, X.AnonymousClass6UV r4, X.AnonymousClass6UU r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L_0x000e
            if (r3 != 0) goto L_0x0009
        L_0x0007:
            if (r5 == 0) goto L_0x0012
        L_0x0009:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x000e:
            if (r3 != 0) goto L_0x0007
            if (r5 == 0) goto L_0x0009
        L_0x0012:
            r1.A04 = r6
            r1.A05 = r7
            r1.A07 = r9
            r1.A02 = r4
            r1.A01 = r3
            r1.A03 = r5
            r1.A00 = r2
            r1.A06 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127836Tm.<init>(X.6TC, X.6UW, X.6UV, X.6UU, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A04, 1, false);
        C162417s1.A0B(parcel, this.A05, 2, false);
        C162417s1.A0E(parcel, this.A07, 3, false);
        C162417s1.A0A(parcel, this.A02, 4, i, false);
        C162417s1.A0A(parcel, this.A01, 5, i, false);
        C162417s1.A0A(parcel, this.A03, 6, i, false);
        C162417s1.A0A(parcel, this.A00, 7, i, false);
        C162417s1.A0B(parcel, this.A06, 8, false);
        C162417s1.A06(parcel, A002);
    }
}
