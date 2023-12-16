package X;

import java.util.Set;

/* renamed from: X.0XS  reason: invalid class name */
public final class AnonymousClass0XS {
    public static final AnonymousClass0XS A08 = new AnonymousClass0XS((C02380Fy) null, 255);
    public final long A00;
    public final long A01;
    public final C02380Fy A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass0XS(X.C02380Fy r12, int r13) {
        /*
            r11 = this;
            r1 = r12
            r2 = 0
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0008
            X.0Fy r1 = X.C02380Fy.NOT_REQUIRED
        L_0x0008:
            r7 = 0
            r0 = r13 & 32
            r5 = -1
            if (r0 == 0) goto L_0x0027
            r3 = -1
        L_0x0011:
            r0 = r13 & 64
            if (r0 != 0) goto L_0x0017
            r5 = 0
        L_0x0017:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001f
            java.util.Set r2 = X.C73833g9.A04()
        L_0x001f:
            r0 = r11
            r9 = r7
            r10 = r7
            r8 = r7
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            return
        L_0x0027:
            r3 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XS.<init>(X.0Fy, int):void");
    }

    public final boolean A00() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, AnonymousClass0XS.class)) {
            return false;
        }
        AnonymousClass0XS r7 = (AnonymousClass0XS) obj;
        if (this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A07 == r7.A07 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02) {
            return C162457s7.A0P(this.A03, r7.A03);
        }
        return false;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return AnonymousClass002.A02(this.A03, ((((((((((((this.A02.hashCode() * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0XS(X.AnonymousClass0XS r12) {
        /*
            r11 = this;
            r0 = 1
            X.C162457s7.A0J(r12, r0)
            boolean r7 = r12.A05
            boolean r8 = r12.A06
            X.0Fy r1 = r12.A02
            boolean r9 = r12.A04
            boolean r10 = r12.A07
            java.util.Set r2 = r12.A03
            long r3 = r12.A01
            long r5 = r12.A00
            r0 = r11
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XS.<init>(X.0XS):void");
    }

    public AnonymousClass0XS(C02380Fy r2, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        C162457s7.A0J(r2, 1);
        C162457s7.A0J(set, 8);
        this.A02 = r2;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = set;
    }

    public AnonymousClass0XS() {
        this((C02380Fy) null, 255);
    }
}
