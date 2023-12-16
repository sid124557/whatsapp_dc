package X;

import java.util.Arrays;

/* renamed from: X.81g  reason: invalid class name and case insensitive filesystem */
public abstract class C1674881g implements C187428xC {
    public int A00;
    public final int A01;
    public final C166617yz A02;
    public final int[] A03;
    public final C166637z1[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1674881g r5 = (C1674881g) obj;
            if (this.A02 != r5.A02 || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = identityHashCode;
        return identityHashCode;
    }

    public C1674881g(C166617yz r8, int[] iArr) {
        int length = iArr.length;
        C159197lM.A02(AnonymousClass001.A1W(length));
        r8.getClass();
        this.A02 = r8;
        this.A01 = length;
        C166637z1[] r3 = new C166637z1[length];
        this.A04 = r3;
        for (int i = 0; i < length; i++) {
            r3[i] = r8.A03[iArr[i]];
        }
        Arrays.sort(r3, new AnonymousClass91S(0));
        int i2 = this.A01;
        int[] iArr2 = new int[i2];
        this.A03 = iArr2;
        for (int i3 = 0; i3 < i2; i3++) {
            C166637z1 r32 = this.A04[i3];
            int i4 = 0;
            while (true) {
                C166637z1[] r1 = r8.A03;
                if (i4 < r1.length) {
                    if (r32 == r1[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            iArr2[i3] = i4;
        }
    }
}
