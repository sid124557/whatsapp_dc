package X;

import java.util.Arrays;

/* renamed from: X.88R  reason: invalid class name */
public abstract class AnonymousClass88R implements C187638xZ {
    public int A00;
    public final int A01;
    public final C166377ya A02;
    public final int[] A03;
    public final C166527yp[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass88R r5 = (AnonymousClass88R) obj;
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

    public AnonymousClass88R(C166377ya r8, int... iArr) {
        int length = iArr.length;
        C161487pm.A04(AnonymousClass001.A1W(length));
        r8.getClass();
        this.A02 = r8;
        this.A01 = length;
        C166527yp[] r3 = new C166527yp[length];
        this.A04 = r3;
        for (int i = 0; i < length; i++) {
            r3[i] = r8.A02[iArr[i]];
        }
        Arrays.sort(r3, new AnonymousClass91S(11));
        int i2 = this.A01;
        int[] iArr2 = new int[i2];
        this.A03 = iArr2;
        for (int i3 = 0; i3 < i2; i3++) {
            C166527yp r32 = this.A04[i3];
            int i4 = 0;
            while (true) {
                C166527yp[] r1 = r8.A02;
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
