package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2xT  reason: invalid class name and case insensitive filesystem */
public final class C59782xT {
    public int A00;
    public int A01 = 65536;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C613230f A07;
    public final AnonymousClass2SH A08;
    public final C26071bX A09;
    public final boolean A0A;

    public static long A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long j = (long) byteBuffer.getInt();
        if (0 > j) {
            return j + 4294967296L;
        }
        return j;
    }

    public final void A01(int i, int i2) {
        AnonymousClass2SG r7;
        C613230f r3 = this.A07;
        ByteBuffer byteBuffer = r3.A05;
        byteBuffer.clear();
        r3.A01 = 0;
        r3.A06.reset();
        r3.A00 = 0;
        byteBuffer.put(C57842uI.A00(i));
        if (i != 0) {
            byteBuffer.putInt(i2);
        }
        byteBuffer.putInt(this.A01);
        byteBuffer.putInt(this.A00);
        AnonymousClass2SH r4 = this.A08;
        byteBuffer.putInt(r4.A01);
        if (i >= 2) {
            byteBuffer.putInt(r4.A00);
            byteBuffer.put(r4.A04 ? (byte) 1 : 0);
            r3.A03(r4.A03);
            byteBuffer.putInt(r4.A02);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass2SG[] r1 = r4.A05;
            if (i3 < r1.length) {
                r7 = r1[i3];
            } else {
                r7 = new AnonymousClass2SG(this.A04);
            }
            byteBuffer.putInt(r7.A01);
            r3.A03(r7.A04);
            if (i >= 2) {
                byteBuffer.putInt(r7.A02);
                byteBuffer.putInt(r7.A00);
            }
            r3.A03(r7.A03);
        }
        long A002 = r3.A00();
        this.A02 = A002;
        r3.A03(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r3.A0A != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59782xT(X.AnonymousClass2SH r4, X.C26071bX r5, java.io.RandomAccessFile r6, int r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r3.<init>()
            r2 = 65536(0x10000, float:9.18355E-41)
            r3.A01 = r2
            r3.A08 = r4
            r3.A06 = r7
            r3.A05 = r8
            byte[] r0 = X.C57842uI.A00(r7)
            r3.A03 = r0
            r3.A04 = r9
            r3.A09 = r5
            r3.A0A = r10
            r1 = 0
            X.30f r0 = new X.30f
            r0.<init>(r5, r6, r1, r2)
            r3.A07 = r0
            if (r9 == 0) goto L_0x0032
            r0 = 1
            if (r9 != r0) goto L_0x002b
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0028:
            r3.A00 = r1
            return
        L_0x002b:
            boolean r0 = r3.A0A
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0028
        L_0x0032:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59782xT.<init>(X.2SH, X.1bX, java.io.RandomAccessFile, int, int, int, boolean):void");
    }
}
