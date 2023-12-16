package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.8Pf  reason: invalid class name and case insensitive filesystem */
public final class C173338Pf implements C188558z5 {
    public boolean A00;
    public final C172278Kj A01 = new C172278Kj();
    public final C188078yH A02;

    /* JADX WARNING: Removed duplicated region for block: B:110:0x016d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BFk(X.AnonymousClass8Lk r20) {
        /*
            r19 = this;
            r7 = 0
            r2 = 0
            r6 = r19
            boolean r0 = r6.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0012:
            X.8Kj r5 = r6.A01
            r17 = r2
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0174
            X.7kd r4 = r5.A01
            if (r4 == 0) goto L_0x0153
            long r0 = r5.A00
            long r11 = r0 - r2
            r9 = 2
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r8 = r20
            if (r10 >= 0) goto L_0x00bb
            r15 = r0
        L_0x002c:
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            X.7kd r4 = r4.A03
            if (r4 != 0) goto L_0x0039
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0039:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r15 = r15 - r0
            goto L_0x002c
        L_0x0041:
            int r0 = r8.A02()
            if (r0 != r9) goto L_0x007b
            byte r10 = r8.A01(r7)
            r0 = 1
            byte r9 = r8.A01(r0)
        L_0x0050:
            long r0 = r5.A00
            int r8 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0153
            byte[] r12 = r4.A06
            int r11 = r4.A01
            long r0 = (long) r11
            long r0 = r0 + r17
            long r0 = r0 - r15
            int r8 = (int) r0
            int r1 = r4.A00
        L_0x0061:
            if (r8 >= r1) goto L_0x006c
            byte r0 = r12[r8]
            if (r0 == r10) goto L_0x0156
            if (r0 == r9) goto L_0x0156
            int r8 = r8 + 1
            goto L_0x0061
        L_0x006c:
            int r1 = r1 - r11
            long r0 = (long) r1
            long r15 = r15 + r0
            X.7kd r4 = r4.A02
            if (r4 != 0) goto L_0x0078
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0078:
            r17 = r15
            goto L_0x0050
        L_0x007b:
            boolean r0 = r8 instanceof X.C175998aD
            if (r0 == 0) goto L_0x00b8
            r0 = r8
            X.8aD r0 = (X.C175998aD) r0
            byte[] r9 = r0.A06()
        L_0x0086:
            long r0 = r5.A00
            int r8 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0153
            byte[] r13 = r4.A06
            int r12 = r4.A01
            long r0 = (long) r12
            long r0 = r0 + r17
            long r0 = r0 - r15
            int r8 = (int) r0
            int r14 = r4.A00
        L_0x0097:
            if (r8 >= r14) goto L_0x00a9
            byte r11 = r13[r8]
            int r10 = r9.length
            r1 = 0
        L_0x009d:
            if (r1 >= r10) goto L_0x00a6
            byte r0 = r9[r1]
            if (r11 == r0) goto L_0x0156
            int r1 = r1 + 1
            goto L_0x009d
        L_0x00a6:
            int r8 = r8 + 1
            goto L_0x0097
        L_0x00a9:
            int r14 = r14 - r12
            long r0 = (long) r14
            long r15 = r15 + r0
            X.7kd r4 = r4.A02
            if (r4 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x00b5:
            r17 = r15
            goto L_0x0086
        L_0x00b8:
            byte[] r9 = r8.data
            goto L_0x0086
        L_0x00bb:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r15
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0104
            int r0 = r8.A02()
            if (r0 != r9) goto L_0x010f
            byte r9 = r8.A01(r7)
            r0 = 1
            byte r10 = r8.A01(r0)
        L_0x00d5:
            long r0 = r5.A00
            int r8 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0153
            byte[] r11 = r4.A06
            int r0 = r4.A01
            long r0 = (long) r0
            long r0 = r0 + r17
            long r0 = r0 - r15
            int r8 = (int) r0
            int r1 = r4.A00
        L_0x00e6:
            if (r8 >= r1) goto L_0x00f1
            byte r0 = r11[r8]
            if (r0 == r9) goto L_0x0156
            if (r0 == r10) goto L_0x0156
            int r8 = r8 + 1
            goto L_0x00e6
        L_0x00f1:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r15 = r15 + r0
            X.7kd r4 = r4.A02
            if (r4 != 0) goto L_0x0101
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0101:
            r17 = r15
            goto L_0x00d5
        L_0x0104:
            X.7kd r4 = r4.A02
            if (r4 != 0) goto L_0x010d
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x010d:
            r15 = r0
            goto L_0x00bb
        L_0x010f:
            boolean r0 = r8 instanceof X.C175998aD
            if (r0 == 0) goto L_0x0150
            r0 = r8
            X.8aD r0 = (X.C175998aD) r0
            byte[] r9 = r0.A06()
        L_0x011a:
            long r0 = r5.A00
            int r8 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0153
            byte[] r13 = r4.A06
            int r0 = r4.A01
            long r0 = (long) r0
            long r0 = r0 + r17
            long r0 = r0 - r15
            int r8 = (int) r0
            int r12 = r4.A00
        L_0x012b:
            if (r8 >= r12) goto L_0x013d
            byte r11 = r13[r8]
            int r10 = r9.length
            r1 = 0
        L_0x0131:
            if (r1 >= r10) goto L_0x013a
            byte r0 = r9[r1]
            if (r11 == r0) goto L_0x0156
            int r1 = r1 + 1
            goto L_0x0131
        L_0x013a:
            int r8 = r8 + 1
            goto L_0x012b
        L_0x013d:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r15 = r15 + r0
            X.7kd r4 = r4.A02
            if (r4 != 0) goto L_0x014d
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x014d:
            r17 = r15
            goto L_0x011a
        L_0x0150:
            byte[] r9 = r8.data
            goto L_0x011a
        L_0x0153:
            r8 = -1
            goto L_0x015b
        L_0x0156:
            int r0 = r4.A01
            int r8 = r8 - r0
            long r8 = (long) r8
            long r8 = r8 + r15
        L_0x015b:
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x016d
            long r0 = r5.A00
            long r8 = A00(r5, r6)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x016e
            r8 = -1
        L_0x016d:
            return r8
        L_0x016e:
            long r2 = java.lang.Math.max(r2, r0)
            goto L_0x0012
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fromIndex < 0: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0V(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173338Pf.BFk(X.8Lk):long");
    }

    public long BiH(C172278Kj r7, long j) {
        if (j < 0) {
            throw AnonymousClass6C7.A0V("byteCount < 0: ", AnonymousClass001.A0o(), j);
        } else if (true ^ this.A00) {
            C172278Kj r5 = this.A01;
            if (r5.A00 == 0 && A00(r5, this) == -1) {
                return -1;
            }
            return r5.BiH(r7, Math.min(j, r5.A00));
        } else {
            throw AnonymousClass001.A0e("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) {
        C162457s7.A0I(byteBuffer, 0);
        C172278Kj r5 = this.A01;
        if (r5.A00 == 0 && A00(r5, this) == -1) {
            return -1;
        }
        return r5.read(byteBuffer);
    }

    public static long A00(C172278Kj r3, C173338Pf r4) {
        return r4.A02.BiH(r3, (long) DefaultCrypto.BUFFER_SIZE);
    }

    public C172278Kj Ay8() {
        return this.A01;
    }

    public C172278Kj B4u() {
        return this.A01;
    }

    public InputStream BGc() {
        return new C140686uJ(this);
    }

    public C188558z5 Bga() {
        return new C173338Pf(new C173348Pg(this));
    }

    public boolean Bjk(long j) {
        C172278Kj r3;
        if (j < 0) {
            throw AnonymousClass6C7.A0V("byteCount < 0: ", AnonymousClass001.A0o(), j);
        } else if (!(!this.A00)) {
            throw AnonymousClass001.A0e("closed");
        } else {
            do {
                r3 = this.A01;
                if (r3.A00 >= j) {
                    return true;
                }
            } while (A00(r3, this) != -1);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r0 = r7[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        if (r5 == -2) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r5 == -1) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0098, code lost:
        r8.A0B((long) r13.A01[r5].A02());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bl7(X.AnonymousClass8TA r18) {
        /*
            r17 = this;
            r12 = r17
            boolean r0 = r12.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x000f:
            X.8Kj r8 = r12.A01
            X.7kd r14 = r8.A01
            r11 = -1
            if (r14 == 0) goto L_0x00a9
            byte[] r10 = r14.A06
            int r2 = r14.A01
            int r9 = r14.A00
            r13 = r18
            int[] r7 = r13.A00
            r6 = r14
            r1 = 0
            r5 = -1
        L_0x0023:
            int r0 = r1 + 1
            r3 = r7[r1]
            int r15 = r0 + 1
            r0 = r7[r0]
            if (r0 == r11) goto L_0x002e
            r5 = r0
        L_0x002e:
            if (r6 == 0) goto L_0x00a9
            r16 = 0
            if (r3 >= 0) goto L_0x0066
            int r0 = -r3
            int r3 = r15 + r0
        L_0x0037:
            int r4 = r2 + 1
            byte r0 = r10[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r15 + 1
            r0 = r7[r15]
            if (r2 != r0) goto L_0x0085
            boolean r0 = X.AnonymousClass000.A1U(r1, r3)
            if (r4 != r9) goto L_0x0052
            X.7kd r6 = r6.A02
            if (r6 != 0) goto L_0x0057
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0052:
            if (r0 != 0) goto L_0x0063
            r2 = r4
            r15 = r1
            goto L_0x0037
        L_0x0057:
            int r4 = r6.A01
            byte[] r10 = r6.A06
            int r9 = r6.A00
            if (r6 != r14) goto L_0x0052
            if (r0 == 0) goto L_0x00a9
            r6 = r16
        L_0x0063:
            r0 = r7[r1]
            goto L_0x0095
        L_0x0066:
            int r4 = r2 + 1
            byte r0 = r10[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r15 + r3
        L_0x006e:
            if (r15 == r0) goto L_0x0085
            r2 = r7[r15]
            if (r1 != r2) goto L_0x0082
            int r15 = r15 + r3
            r0 = r7[r15]
            if (r4 != r9) goto L_0x0095
            X.7kd r6 = r6.A02
            if (r6 != 0) goto L_0x008b
            java.lang.RuntimeException r0 = X.C162457s7.A05()
            throw r0
        L_0x0082:
            int r15 = r15 + 1
            goto L_0x006e
        L_0x0085:
            r0 = -2
            if (r5 == r0) goto L_0x00a9
            if (r5 == r11) goto L_0x00b3
            goto L_0x0098
        L_0x008b:
            int r4 = r6.A01
            byte[] r10 = r6.A06
            int r9 = r6.A00
            if (r6 != r14) goto L_0x0095
            r6 = r16
        L_0x0095:
            if (r0 < 0) goto L_0x00a5
            r5 = r0
        L_0x0098:
            X.8Lk[] r0 = r13.A01
            r0 = r0[r5]
            int r0 = r0.A02()
            long r0 = (long) r0
            r8.A0B(r0)
            return r5
        L_0x00a5:
            int r1 = -r0
            r2 = r4
            goto L_0x0023
        L_0x00a9:
            long r3 = A00(r8, r12)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
        L_0x00b3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173338Pf.Bl7(X.8TA):int");
    }

    public void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            this.A01.A08();
        }
    }

    public boolean isOpen() {
        return !this.A00;
    }

    public byte readByte() {
        if (Bjk(1)) {
            return this.A01.readByte();
        }
        throw AnonymousClass6CA.A0M();
    }

    public C173338Pf(C188078yH r2) {
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("buffer(");
        return C18260x0.A04(this.A02, A0o);
    }
}
