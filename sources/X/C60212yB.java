package X;

import java.util.Arrays;

/* renamed from: X.2yB  reason: invalid class name and case insensitive filesystem */
public class C60212yB {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public static int A00(AnonymousClass239 r3) {
        if (r3 != null) {
            int ordinal = r3.ordinal();
            if (ordinal == 1) {
                return 1;
            }
            if (ordinal != 0) {
                C626936e.A0D(false, "unsupported ADVEncryptionType");
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C60212yB)) {
                return false;
            }
            C60212yB r7 = (C60212yB) obj;
            if (!(this.A01 == r7.A01 && this.A05 == r7.A05 && this.A02 == r7.A02 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass001.A1Q(objArr, this.A05);
        AnonymousClass0x2.A1U(objArr, this.A02);
        AnonymousClass0x2.A1V(objArr, this.A04);
        C18300x5.A1R(objArr, this.A03);
        C18310x6.A1U(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C60212yB(int i, int i2, long j, long j2, long j3, long j4) {
        this.A01 = i;
        this.A05 = j;
        this.A02 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A00 = i2;
    }
}
