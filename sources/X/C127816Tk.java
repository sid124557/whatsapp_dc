package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Tk  reason: invalid class name and case insensitive filesystem */
public final class C127816Tk extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163457tq();
    public C127826Tl A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public int[] A04;
    public C127876Tq[] A05;
    public String[] A06;
    public byte[][] A07;
    public final AnonymousClass6WC A08;

    public C127816Tk(AnonymousClass6WC r3, C127826Tl r4) {
        this.A00 = r4;
        this.A08 = r3;
        this.A03 = null;
        this.A06 = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A01 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127816Tk) {
                C127816Tk r5 = (C127816Tk) obj;
                if (!AnonymousClass72K.A00(this.A00, r5.A00) || !Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A06, r5.A06) || !AnonymousClass72K.A00(this.A08, r5.A08) || !Arrays.equals(this.A04, r5.A04) || !Arrays.deepEquals(this.A07, r5.A07) || !Arrays.equals(this.A05, r5.A05) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A00;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A08;
        objArr[5] = null;
        objArr[6] = null;
        objArr[7] = this.A04;
        objArr[8] = this.A07;
        objArr[9] = this.A05;
        return C18310x6.A08(Boolean.valueOf(this.A01), objArr, 10);
    }

    public final String toString() {
        String str;
        StringBuilder A0A = C18330xA.A0A("LogEventParcelable[");
        A0A.append(this.A00);
        A0A.append(", LogEventBytes: ");
        byte[] bArr = this.A02;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A0A.append(str);
        A0A.append(", TestCodes: ");
        A0A.append(Arrays.toString(this.A03));
        A0A.append(", MendelPackages: ");
        C18320x8.A1P(A0A, this.A06);
        A0A.append(", LogEvent: ");
        A0A.append(this.A08);
        A0A.append(", ExtensionProducer: ");
        A0A.append((Object) null);
        A0A.append(", VeProducer: ");
        A0A.append((Object) null);
        A0A.append(", ExperimentIDs: ");
        A0A.append(Arrays.toString(this.A04));
        A0A.append(", ExperimentTokens: ");
        C18320x8.A1P(A0A, this.A07);
        A0A.append(", ExperimentTokensParcelables: ");
        C18320x8.A1P(A0A, this.A05);
        A0A.append(", AddPhenotypeExperimentTokens: ");
        A0A.append(this.A01);
        return AnonymousClass000.A0f(A0A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A02, 3, C1695389r.A06(parcel, this.A00, i));
        C1695389r.A05(parcel, this.A03, 4);
        C162417s1.A0G(parcel, this.A06, 5);
        C1695389r.A05(parcel, this.A04, 6);
        C162417s1.A0H(parcel, this.A07, 7);
        C162417s1.A09(parcel, 8, this.A01);
        C162417s1.A0F(parcel, this.A05, 9, i);
        C162417s1.A06(parcel, A002);
    }

    public C127816Tk(C127826Tl r2, byte[] bArr, int[] iArr, int[] iArr2, C127876Tq[] r6, String[] strArr, byte[][] bArr2, boolean z) {
        this.A00 = r2;
        this.A02 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A08 = null;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = r6;
        this.A01 = z;
    }
}
