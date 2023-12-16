package X;

import java.nio.ByteBuffer;

/* renamed from: X.867  reason: invalid class name */
public abstract class AnonymousClass867 implements C187058wN {
    public C157507iQ A00;
    public C157507iQ A01;
    public C157507iQ A02;
    public C157507iQ A03;
    public ByteBuffer A04;
    public ByteBuffer A05;
    public boolean A06;

    public final void Bi3() {
        this.A06 = true;
        if (this instanceof AnonymousClass6OS) {
            AnonymousClass6OS r4 = (AnonymousClass6OS) this;
            if (r4.A05) {
                int i = r4.A00;
                if (i > 0) {
                    r4.A04 += (long) (i / r4.A00.A00);
                }
                r4.A00 = 0;
            }
        } else if (this instanceof AnonymousClass6OT) {
            AnonymousClass6OT r42 = (AnonymousClass6OT) this;
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
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C157507iQ AzP(X.C157507iQ r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r2 = r7
            boolean r0 = r7 instanceof X.AnonymousClass6OS
            if (r0 == 0) goto L_0x0024
            X.6OS r2 = (X.AnonymousClass6OS) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00a5
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x00a1
        L_0x0019:
            r7.A03 = r8
            boolean r0 = r7.BGz()
            if (r0 != 0) goto L_0x0023
            X.7iQ r8 = X.C157507iQ.A04
        L_0x0023:
            return r8
        L_0x0024:
            boolean r0 = r7 instanceof X.AnonymousClass6OT
            if (r0 == 0) goto L_0x0032
            X.6OT r2 = (X.AnonymousClass6OT) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00ab
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x0032:
            boolean r0 = r7 instanceof X.AnonymousClass6OQ
            if (r0 == 0) goto L_0x0053
            int r1 = r8.A02
            r0 = 3
            r2 = 2
            if (r1 == r0) goto L_0x006b
            if (r1 == r2) goto L_0x00a1
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L_0x006b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x006b
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x006b
            r0 = 4
            if (r1 == r0) goto L_0x006b
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        L_0x0053:
            boolean r0 = r7 instanceof X.AnonymousClass6OU
            if (r0 == 0) goto L_0x0075
            int r1 = r8.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x006a
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x006a
            r0 = 4
            if (r1 == r0) goto L_0x00a1
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        L_0x006a:
            r2 = 4
        L_0x006b:
            int r1 = r8.A03
            int r0 = r8.A01
            X.7iQ r8 = new X.7iQ
            r8.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x0075:
            X.6OR r2 = (X.AnonymousClass6OR) r2
            int[] r6 = r2.A01
            if (r6 == 0) goto L_0x00a1
            int r0 = r8.A02
            r5 = 2
            if (r0 != r5) goto L_0x00b7
            int r4 = r8.A01
            int r3 = r6.length
            boolean r2 = X.AnonymousClass001.A1X(r4, r3)
            r1 = 0
        L_0x0088:
            if (r1 >= r3) goto L_0x0096
            r0 = r6[r1]
            if (r0 >= r4) goto L_0x00b1
            boolean r0 = X.AnonymousClass001.A1X(r0, r1)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L_0x0088
        L_0x0096:
            if (r2 == 0) goto L_0x00a1
            int r0 = r8.A03
            X.7iQ r8 = new X.7iQ
            r8.<init>(r0, r3, r5)
            goto L_0x0019
        L_0x00a1:
            X.7iQ r8 = X.C157507iQ.A04
            goto L_0x0019
        L_0x00a5:
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        L_0x00ab:
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        L_0x00b1:
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        L_0x00b7:
            X.6yR r0 = new X.6yR
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass867.AzP(X.7iQ):X.7iQ");
    }

    public ByteBuffer BAF() {
        ByteBuffer byteBuffer = this.A05;
        this.A05 = C187058wN.A00;
        return byteBuffer;
    }

    public boolean BGz() {
        if (this instanceof AnonymousClass6OT) {
            return ((AnonymousClass6OT) this).A05;
        }
        return C18300x5.A1W(this.A03, C157507iQ.A04);
    }

    public boolean BHW() {
        if (!this.A06 || this.A05 != C187058wN.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A05 = C187058wN.A00;
        this.A06 = false;
        this.A00 = this.A02;
        this.A01 = this.A03;
        if (this instanceof AnonymousClass6OS) {
            AnonymousClass6OS r4 = (AnonymousClass6OS) this;
            if (r4.A05) {
                r4.A05 = false;
                int i = r4.A02;
                int i2 = r4.A00.A00;
                r4.A06 = new byte[(i * i2)];
                r4.A01 = r4.A03 * i2;
            }
            r4.A00 = 0;
        } else if (this instanceof AnonymousClass6OT) {
            AnonymousClass6OT r42 = (AnonymousClass6OT) this;
            if (r42.A05) {
                C157507iQ r2 = r42.A00;
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
        } else if (this instanceof AnonymousClass6OR) {
            AnonymousClass6OR r43 = (AnonymousClass6OR) this;
            r43.A00 = r43.A01;
        }
    }

    public AnonymousClass867() {
        ByteBuffer byteBuffer = C187058wN.A00;
        this.A04 = byteBuffer;
        this.A05 = byteBuffer;
        C157507iQ r0 = C157507iQ.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
    }

    public final void reset() {
        flush();
        this.A04 = C187058wN.A00;
        C157507iQ r0 = C157507iQ.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
        if (this instanceof AnonymousClass6OS) {
            ((AnonymousClass6OS) this).A06 = C162387ry.A0A;
        } else if (this instanceof AnonymousClass6OT) {
            AnonymousClass6OT r1 = (AnonymousClass6OT) this;
            r1.A05 = false;
            r1.A02 = 0;
            byte[] bArr = C162387ry.A0A;
            r1.A07 = bArr;
            r1.A08 = bArr;
        } else if (this instanceof AnonymousClass6OR) {
            AnonymousClass6OR r12 = (AnonymousClass6OR) this;
            r12.A00 = null;
            r12.A01 = null;
        }
    }
}
