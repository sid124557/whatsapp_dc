package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.80t  reason: invalid class name and case insensitive filesystem */
public abstract class C1673580t implements C187048wM {
    public C158557kA A00;
    public C158557kA A01;
    public C158557kA A02;
    public C158557kA A03;
    public ByteBuffer A04;
    public ByteBuffer A05;
    public boolean A06;

    public final void Bi3() {
        this.A06 = true;
        if (this instanceof C125766Jh) {
            C125766Jh r4 = (C125766Jh) this;
            if (r4.A05) {
                int i = r4.A00;
                if (i > 0) {
                    r4.A04 += (long) (i / r4.A00.A00);
                }
                r4.A00 = 0;
            }
        } else if (this instanceof C125776Ji) {
            C125776Ji r42 = (C125776Ji) this;
            int i2 = r42.A01;
            if (i2 > 0) {
                r42.A02(r42.A07, i2);
            }
            if (!r42.A06) {
                r42.A04 += (long) (r42.A02 / r42.A00);
            }
        }
    }

    public final ByteBuffer A00(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = AnonymousClass6C7.A0s(i);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A05 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C158557kA AzO(X.C158557kA r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r2 = r7
            boolean r0 = r7 instanceof X.C125766Jh
            if (r0 == 0) goto L_0x0024
            X.6Jh r2 = (X.C125766Jh) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00be
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x00ba
        L_0x0019:
            r7.A03 = r8
            boolean r0 = r7.BGz()
            if (r0 != 0) goto L_0x0023
            X.7kA r8 = X.C158557kA.A04
        L_0x0023:
            return r8
        L_0x0024:
            boolean r0 = r7 instanceof X.C125746Jf
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7 instanceof X.C125736Je
            if (r0 == 0) goto L_0x003d
            X.6Je r2 = (X.C125736Je) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00ba
            int r1 = r8.A02
            r0 = 2
            if (r1 == r0) goto L_0x0019
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x003d:
            boolean r0 = r7 instanceof X.C125776Ji
            if (r0 == 0) goto L_0x004b
            X.6Ji r2 = (X.C125776Ji) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00c4
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x004b:
            boolean r0 = r7 instanceof X.C125726Jd
            if (r0 == 0) goto L_0x006f
            int r1 = r8.A02
            r0 = 3
            r2 = 2
            if (r1 == r0) goto L_0x0065
            if (r1 == r2) goto L_0x00ba
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0065
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0065
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x0065:
            int r1 = r8.A03
            int r0 = r8.A01
            X.7kA r8 = new X.7kA
            r8.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x006f:
            boolean r0 = r7 instanceof X.C125786Jj
            if (r0 == 0) goto L_0x008e
            int r1 = r8.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0083
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0083
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x0083:
            int r2 = r8.A03
            int r1 = r8.A01
            r0 = 4
            X.7kA r8 = new X.7kA
            r8.<init>(r2, r1, r0)
            goto L_0x0019
        L_0x008e:
            X.6Jg r2 = (X.C125756Jg) r2
            int[] r6 = r2.A01
            if (r6 == 0) goto L_0x00ba
            int r0 = r8.A02
            r5 = 2
            if (r0 != r5) goto L_0x00d0
            int r4 = r8.A01
            int r3 = r6.length
            boolean r2 = X.AnonymousClass001.A1X(r4, r3)
            r1 = 0
        L_0x00a1:
            if (r1 >= r3) goto L_0x00af
            r0 = r6[r1]
            if (r0 >= r4) goto L_0x00ca
            boolean r0 = X.AnonymousClass001.A1X(r0, r1)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00af:
            if (r2 == 0) goto L_0x00ba
            int r0 = r8.A03
            X.7kA r8 = new X.7kA
            r8.<init>(r0, r3, r5)
            goto L_0x0019
        L_0x00ba:
            X.7kA r8 = X.C158557kA.A04
            goto L_0x0019
        L_0x00be:
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x00c4:
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x00ca:
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        L_0x00d0:
            X.6yK r0 = new X.6yK
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673580t.AzO(X.7kA):X.7kA");
    }

    public ByteBuffer BAF() {
        ByteBuffer byteBuffer = this.A05;
        this.A05 = C187048wM.A00;
        return byteBuffer;
    }

    public boolean BGz() {
        if (this instanceof C125736Je) {
            return ((C125736Je) this).A00;
        }
        if (this instanceof C125776Ji) {
            return ((C125776Ji) this).A05;
        }
        return C18300x5.A1W(this.A03, C158557kA.A04);
    }

    public boolean BHW() {
        if (!this.A06 || this.A05 != C187048wM.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A05 = C187048wM.A00;
        this.A06 = false;
        this.A00 = this.A02;
        this.A01 = this.A03;
        if (this instanceof C125766Jh) {
            C125766Jh r4 = (C125766Jh) this;
            if (r4.A05) {
                r4.A05 = false;
                int i = r4.A02;
                int i2 = r4.A00.A00;
                r4.A06 = new byte[(i * i2)];
                r4.A01 = r4.A03 * i2;
            } else {
                r4.A01 = 0;
            }
            r4.A00 = 0;
        } else if (this instanceof C125776Ji) {
            C125776Ji r42 = (C125776Ji) this;
            if (r42.A05) {
                C158557kA r2 = r42.A00;
                int i3 = r2.A00;
                r42.A00 = i3;
                long j = (long) r2.A03;
                int A0H = ((int) AnonymousClass6C7.A0H(150000, j)) * i3;
                if (r42.A07.length != A0H) {
                    r42.A07 = new byte[A0H];
                }
                int A0H2 = ((int) AnonymousClass6C7.A0H(20000, j)) * i3;
                r42.A02 = A0H2;
                if (r42.A08.length != A0H2) {
                    r42.A08 = new byte[A0H2];
                }
            }
            r42.A03 = 0;
            r42.A04 = 0;
            r42.A01 = 0;
            r42.A06 = false;
        } else if (this instanceof C125756Jg) {
            C125756Jg r43 = (C125756Jg) this;
            r43.A00 = r43.A01;
        }
    }

    public C1673580t() {
        ByteBuffer byteBuffer = C187048wM.A00;
        this.A04 = byteBuffer;
        this.A05 = byteBuffer;
        C158557kA r0 = C158557kA.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
    }

    public final void reset() {
        flush();
        this.A04 = C187048wM.A00;
        C158557kA r0 = C158557kA.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
        if (this instanceof C125766Jh) {
            ((C125766Jh) this).A06 = Util.A09;
        } else if (this instanceof C125736Je) {
            ((C125736Je) this).A00 = false;
        } else if (this instanceof C125776Ji) {
            C125776Ji r1 = (C125776Ji) this;
            r1.A05 = false;
            r1.A02 = 0;
            byte[] bArr = Util.A09;
            r1.A07 = bArr;
            r1.A08 = bArr;
        } else if (this instanceof C125756Jg) {
            C125756Jg r12 = (C125756Jg) this;
            r12.A00 = null;
            r12.A01 = null;
        }
    }
}
