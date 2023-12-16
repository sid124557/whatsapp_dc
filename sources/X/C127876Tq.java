package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Tq  reason: invalid class name and case insensitive filesystem */
public class C127876Tq extends C1695389r {
    public static final C127876Tq A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = new C164307vF();
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new C127876Tq("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass002.A0I(r4);
        for (byte[] encodeToString : bArr) {
            A0I.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A0I);
        return A0I;
    }

    public static boolean A02(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof C127876Tq) {
            C127876Tq r8 = (C127876Tq) obj;
            if (A02(this.A00, r8.A00) && Arrays.equals(this.A01, r8.A01) && A02(A00(this.A03), A00(r8.A03)) && A02(A00(this.A04), A00(r8.A04)) && A02(A00(this.A05), A00(r8.A05)) && A02(A00(this.A06), A00(r8.A06))) {
                int[] iArr = this.A02;
                if (iArr == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList A0I = AnonymousClass002.A0I(r2);
                    for (int A1K : iArr) {
                        C18270x1.A1K(A0I, A1K);
                    }
                    Collections.sort(A0I);
                    list = A0I;
                }
                int[] iArr2 = r8.A02;
                if (iArr2 == null) {
                    list2 = Collections.emptyList();
                } else {
                    ArrayList A0I2 = AnonymousClass002.A0I(r2);
                    for (int A1K2 : iArr2) {
                        C18270x1.A1K(A0I2, A1K2);
                    }
                    Collections.sort(A0I2);
                    list2 = A0I2;
                }
                if (!A02(list, list2) || !A02(A00(this.A07), A00(r8.A07))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String A0V;
        StringBuilder A0A = C18330xA.A0A("ExperimentTokens");
        A0A.append("(");
        String str = this.A00;
        if (str == null) {
            A0V = "null";
        } else {
            A0V = AnonymousClass000.A0V(str, "'", AnonymousClass6C8.A0g(AnonymousClass6C7.A06(str) + 2, "'"));
        }
        A0A.append(A0V);
        A0A.append(", ");
        byte[] bArr = this.A01;
        A0A.append("direct");
        A0A.append("=");
        if (bArr == null) {
            A0A.append("null");
        } else {
            A0A.append("'");
            A0A.append(Base64.encodeToString(bArr, 3));
            A0A.append("'");
        }
        A0A.append(", ");
        A01("GAIA", A0A, this.A03);
        A0A.append(", ");
        A01("PSEUDO", A0A, this.A04);
        A0A.append(", ");
        A01("ALWAYS", A0A, this.A05);
        A0A.append(", ");
        A01("OTHER", A0A, this.A06);
        A0A.append(", ");
        int[] iArr = this.A02;
        A0A.append("weak");
        A0A.append("=");
        if (iArr == null) {
            A0A.append("null");
        } else {
            A0A.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A0A.append(", ");
                }
                A0A.append(i2);
                i++;
                z = false;
            }
            A0A.append(")");
        }
        A0A.append(", ");
        A01("directs", A0A, this.A07);
        return AnonymousClass000.A0X(")", A0A);
    }

    public C127876Tq(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    AnonymousClass001.A1M(sb);
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00));
        C162417s1.A0H(parcel, this.A03, 4);
        C162417s1.A0H(parcel, this.A04, 5);
        C162417s1.A0H(parcel, this.A05, 6);
        C162417s1.A0H(parcel, this.A06, 7);
        C1695389r.A05(parcel, this.A02, 8);
        C162417s1.A0H(parcel, this.A07, 9);
        C162417s1.A06(parcel, A002);
    }
}
