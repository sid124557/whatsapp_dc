package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Objects;

/* renamed from: X.85l  reason: invalid class name and case insensitive filesystem */
public class C1684485l implements C186348v9 {
    public int A00 = 0;
    public int A01 = -1;
    public long A02 = 0;
    public long A03 = C1455676j.A00;
    public Context A04;
    public Uri A05;
    public C172258Kh A06;
    public AnonymousClass7TL A07;
    public C186218uw A08;
    public AnonymousClass7QR A09;
    public C183838qk A0A;
    public boolean A0B;
    public boolean A0C;

    public static EOFException A00() {
        return new EOFException("Unexpected end of gif file");
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        C172258Kh r3;
        if (!this.A0B) {
            r3 = null;
            try {
                C172258Kh r0 = this.A06;
                Objects.requireNonNull(r0);
                Bitmap A002 = C172258Kh.A00(r0);
                C186218uw r1 = this.A08;
                Objects.requireNonNull(r1);
                r1.Brb(this.A01, A002);
                C172258Kh r02 = this.A06;
                if (r02 != null) {
                    r02.close();
                    this.A06 = null;
                }
                this.A0B = true;
            } catch (Throwable th) {
                C172258Kh r03 = this.A06;
                if (r03 != null) {
                    r03.close();
                    this.A06 = r3;
                }
                throw th;
            }
        } else if (this.A0C) {
            r3 = null;
            C172258Kh A003 = this.A07.A00();
            this.A06 = A003;
            if (A003 != null) {
                Bitmap A004 = C172258Kh.A00(A003);
                C186218uw r12 = this.A08;
                Objects.requireNonNull(r12);
                r12.Brb(this.A01, A004);
            }
            C172258Kh r04 = this.A06;
            if (r04 != null) {
                r04.close();
                this.A06 = null;
            }
        }
    }

    public void AzQ(int i) {
        this.A01 = i;
        C153537bV r2 = this.A09.A05;
        Objects.requireNonNull(r2);
        C153007aW A002 = r2.A00(C142366x5.VIDEO, this.A01);
        if (A002 != null) {
            List list = A002.A02;
            if (!AnonymousClass002.A0J(list).isEmpty()) {
                AnonymousClass002.A0J(list).get(0);
                AnonymousClass002.A0J(list).get(0);
                this.A03 = C1455676j.A00;
            }
        }
        this.A08 = this.A0A.B0Z();
    }

    public long B6n() {
        return this.A02;
    }

    public C152527Zf B9T() {
        return null;
    }

    public boolean BHN() {
        return false;
    }

    public void cancel() {
    }

    public void release() {
        C186218uw r0 = this.A08;
        if (r0 != null) {
            r0.finish();
        }
        C172258Kh r02 = this.A06;
        if (r02 != null) {
            r02.close();
        }
        AnonymousClass7TL r2 = this.A07;
        r2.A01 = null;
        r2.A03 = null;
        C172258Kh r03 = r2.A02;
        if (r03 != null) {
            r03.close();
        }
        r2.A02 = null;
        r2.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0286, code lost:
        if (r5.size() <= 0) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0288, code lost:
        r6.close();
        r6 = X.AnonymousClass0x9.A0d(r5.toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0295, code lost:
        if ((r6 instanceof java.io.FileInputStream) == false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0297, code lost:
        ((java.io.FileInputStream) r6).getChannel().position(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02a3, code lost:
        r13 = android.graphics.Movie.decodeStream(r6);
        r4 = X.AnonymousClass001.A0s();
        r14 = r12.size();
        r11 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b2, code lost:
        r6.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b6, code lost:
        if (r11 >= r14) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bc, code lost:
        if (r11 < r12.size()) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02be, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c0, code lost:
        r3 = ((int[]) r12.get(r11))[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c8, code lost:
        r0 = new X.C149287Lw(r10, r3, r13.width(), r13.height());
        r10 = r10 + r3;
        r4.add(r0);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02dc, code lost:
        r0 = r21;
        r0.A01 = r13;
        r0.A03 = r4;
        r1 = r21.A00();
        r0.A02 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02ec, code lost:
        if (r4.size() <= r7) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02ee, code lost:
        r0 = X.C141276vJ.AnimatedImage;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f0, code lost:
        r3 = X.AnonymousClass0x9.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02f5, code lost:
        r0 = X.C141276vJ.StaticImage;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r6.close();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Unknown block header [");
        r0 = X.AnonymousClass002.A0C(X.AnonymousClass000.A0W(java.lang.Integer.toHexString(r13), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r13 != 59) goto L_0x0300;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x037d */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0377 A[Catch:{ Exception -> 0x03a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r22 = this;
            r9 = r22
            X.7QR r0 = r9.A09
            X.7bV r2 = r0.A05
            java.util.Objects.requireNonNull(r2)
            X.6x5 r1 = X.C142366x5.VIDEO
            int r0 = r9.A01
            X.7aW r0 = r2.A00(r1, r0)
            java.util.Objects.requireNonNull(r0)
            java.util.List r0 = r0.A02
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            r8 = 0
            java.lang.Object r0 = r0.get(r8)
            X.7aw r0 = (X.C153257aw) r0
            java.io.File r0 = r0.A02
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            r9.A05 = r1
            X.7TL r0 = r9.A07
            r21 = r0
            android.content.Context r0 = r9.A04
            boolean r7 = X.AnonymousClass0x2.A1Y(r0, r1)
            r18 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x03a5 }
            java.io.InputStream r6 = r0.openInputStream(r1)     // Catch:{ all -> 0x03a5 }
            if (r6 == 0) goto L_0x0385
            java.io.ByteArrayOutputStream r5 = X.AnonymousClass0x9.A0e()     // Catch:{ Exception -> 0x037b, all -> 0x036f }
            r17 = 0
            r0 = 256(0x100, float:3.59E-43)
            r10 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r13 = 0
            r0 = 6
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r3 = -1
            if (r0 == r3) goto L_0x0363
            byte r0 = r4[r8]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r11 = 4
            r2 = 2
            r0 = 71
            if (r0 != r1) goto L_0x035c
            byte r0 = r4[r7]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 73
            if (r0 != r1) goto L_0x035c
            byte r0 = r4[r2]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 70
            if (r0 != r1) goto L_0x035c
            r0 = 3
            byte r0 = r4[r0]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 56
            if (r0 != r1) goto L_0x035c
            byte r0 = r4[r11]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 55
            if (r0 == r1) goto L_0x0082
            r0 = 57
            if (r0 != r1) goto L_0x035c
        L_0x0082:
            r0 = 5
            byte r0 = r4[r0]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r1 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 97
            if (r0 != r1) goto L_0x035c
            long r0 = (long) r11     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r1 == r3) goto L_0x0357
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0099
            r13 = 1
        L_0x0099:
            r0 = r1 & 7
            int r11 = r2 << r0
            long r0 = (long) r2     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r19 = r0
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r16 = 13
            if (r13 == 0) goto L_0x00af
            int r11 = r11 * 3
            long r0 = (long) r11     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r11 + 13
        L_0x00af:
            int[] r11 = new int[r2]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r11 = {0, 0} // fill-array     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x00b4:
            int r13 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r14 = r16 + 1
            if (r13 == r3) goto L_0x0352
            if (r17 == 0) goto L_0x00c1
            r5.write(r13)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x00c1:
            r0 = 33
            if (r13 == r0) goto L_0x0153
            r0 = 44
            if (r13 == r0) goto L_0x00cf
            r0 = 59
            if (r13 != r0) goto L_0x0300
            goto L_0x0282
        L_0x00cf:
            int[] r0 = java.util.Arrays.copyOf(r11, r2)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r12.add(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 8
            if (r17 == 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            long r0 = (long) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x00eb
        L_0x00e0:
            int r0 = java.lang.Math.min(r10, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x00eb:
            int r0 = r14 + 8
            int r1 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r14 = r0 + 1
            if (r1 == r3) goto L_0x031b
            if (r17 == 0) goto L_0x00fa
            r5.write(r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x00fa:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x011c
            r0 = r1 & 7
            int r0 = r2 << r0
            int r13 = r0 * 3
            if (r17 == 0) goto L_0x0117
            r1 = r13
        L_0x0107:
            if (r1 <= 0) goto L_0x011b
            int r0 = java.lang.Math.min(r10, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r1 + -256
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x0107
        L_0x0117:
            long r0 = (long) r13     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x011b:
            int r14 = r14 + r13
        L_0x011c:
            if (r17 == 0) goto L_0x012a
            int r0 = java.lang.Math.min(r10, r7)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x012e
        L_0x012a:
            long r0 = (long) r7     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x012e:
            int r16 = r14 + 1
        L_0x0130:
            int r14 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + 1
            if (r14 == r3) goto L_0x0316
            if (r17 == 0) goto L_0x013d
            r5.write(r14)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x013d:
            r13 = 0
            if (r14 <= 0) goto L_0x00b4
        L_0x0140:
            int r1 = r14 - r13
            int r0 = r6.read(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + r1
            if (r17 == 0) goto L_0x014d
            r5.write(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x014d:
            if (r0 == r3) goto L_0x0368
            int r13 = r13 + r0
            if (r13 >= r14) goto L_0x0130
            goto L_0x0140
        L_0x0153:
            int r1 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r14 + 1
            if (r1 == r3) goto L_0x034d
            if (r17 == 0) goto L_0x0160
            r5.write(r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0160:
            if (r1 == r7) goto L_0x0258
            r0 = 249(0xf9, float:3.49E-43)
            if (r1 == r0) goto L_0x01c2
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x025f
            int r14 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + 1
            if (r14 == r3) goto L_0x032f
            if (r17 == 0) goto L_0x0177
            r5.write(r14)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0177:
            r13 = 0
            if (r14 <= 0) goto L_0x018d
        L_0x017a:
            int r1 = r14 - r13
            int r0 = r6.read(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + r1
            if (r17 == 0) goto L_0x0187
            r5.write(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0187:
            if (r0 == r3) goto L_0x0320
            int r13 = r13 + r0
            if (r13 >= r14) goto L_0x018d
            goto L_0x017a
        L_0x018d:
            char[] r15 = X.C1455276f.A00     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r14 = r15.length     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r10 < r14) goto L_0x025f
            r13 = 0
        L_0x0193:
            if (r13 >= r14) goto L_0x019f
            char r1 = r15[r13]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            byte r0 = r4[r13]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            char r0 = (char) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r1 != r0) goto L_0x025f
            int r13 = r13 + 1
            goto L_0x0193
        L_0x019f:
            int r14 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + 1
            if (r14 == r3) goto L_0x032a
            if (r17 == 0) goto L_0x01ac
            r5.write(r14)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x01ac:
            r13 = 0
            if (r14 <= 0) goto L_0x00b4
        L_0x01af:
            int r1 = r14 - r13
            int r0 = r6.read(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + r1
            if (r17 == 0) goto L_0x01bc
            r5.write(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x01bc:
            if (r0 == r3) goto L_0x0325
            int r13 = r13 + r0
            if (r13 >= r14) goto L_0x019f
            goto L_0x01af
        L_0x01c2:
            if (r17 == 0) goto L_0x01c5
            goto L_0x01ca
        L_0x01c5:
            long r0 = (long) r7     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x01d5
        L_0x01ca:
            int r0 = java.lang.Math.min(r10, r7)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x01d5:
            int r1 = r16 + 1
            int r0 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r1 + 1
            if (r0 == r3) goto L_0x033e
            if (r17 == 0) goto L_0x01e4
            r5.write(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x01e4:
            r0 = r0 & 28
            int r0 = r0 >> r2
            r11[r8] = r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r13 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r1 + 1
            if (r13 == r3) goto L_0x0339
            int r0 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r14 = r1 + 1
            if (r0 == r3) goto L_0x0334
            int r0 = r0 << 8
            r13 = r13 | r0
            int r0 = r13 * 10
            r11[r7] = r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r0 != 0) goto L_0x0235
            r0 = 100
            r11[r7] = r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r17 != 0) goto L_0x0235
            r17 = 1
            boolean r0 = r6 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r0 == 0) goto L_0x021b
            r0 = r6
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.nio.channels.FileChannel r13 = r0.getChannel()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 0
            r13.position(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x021e
        L_0x021b:
            r6.reset()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x021e:
            int r1 = r14 + -2
        L_0x0220:
            if (r1 <= 0) goto L_0x0230
            int r0 = java.lang.Math.min(r10, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r1 + -256
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x0220
        L_0x0230:
            r0 = 2
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0235:
            r0 = r11[r7]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r0 / 10
            if (r17 == 0) goto L_0x024f
            r5.write(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r0 >> 8
            r5.write(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = java.lang.Math.min(r10, r2)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r6.read(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r5.write(r4, r8, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x0254
        L_0x024f:
            r0 = r19
            r6.skip(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0254:
            int r16 = r14 + 2
            goto L_0x00b4
        L_0x0258:
            int[] r0 = java.util.Arrays.copyOf(r11, r2)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r12.add(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x025f:
            int r14 = r6.read()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + 1
            if (r14 == r3) goto L_0x0348
            if (r17 == 0) goto L_0x026c
            r5.write(r14)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x026c:
            r13 = 0
            if (r14 <= 0) goto L_0x00b4
        L_0x026f:
            int r1 = r14 - r13
            int r0 = r6.read(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r16 = r16 + r1
            if (r17 == 0) goto L_0x027c
            r5.write(r4, r13, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x027c:
            if (r0 == r3) goto L_0x0343
            int r13 = r13 + r0
            if (r13 >= r14) goto L_0x025f
            goto L_0x026f
        L_0x0282:
            int r0 = r5.size()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r0 <= 0) goto L_0x0293
            r6.close()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.io.ByteArrayInputStream r6 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x0293:
            boolean r0 = r6 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r0 == 0) goto L_0x02b2
            r0 = r6
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0 = 0
            r2.position(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x02a3:
            android.graphics.Movie r13 = android.graphics.Movie.decodeStream(r6)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r14 = r12.size()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r11 = 0
            r10 = 0
            goto L_0x02b6
        L_0x02b2:
            r6.reset()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x02a3
        L_0x02b6:
            if (r11 >= r14) goto L_0x02dc
            int r0 = r12.size()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r11 < r0) goto L_0x02c0
            r3 = 1
            goto L_0x02c8
        L_0x02c0:
            java.lang.Object r0 = r12.get(r11)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r3 = r0[r7]     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x02c8:
            int r2 = r13.width()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r1 = r13.height()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            X.7Lw r0 = new X.7Lw     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0.<init>(r10, r3, r2, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r10 = r10 + r3
            r4.add(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r11 = r11 + 1
            goto L_0x02b6
        L_0x02dc:
            r0 = r21
            r0.A01 = r13     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0.A03 = r4     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            X.8Kh r1 = r21.A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            r0.A02 = r1     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            int r0 = r4.size()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            if (r0 <= r7) goto L_0x02f5
            X.6vJ r0 = X.C141276vJ.AnimatedImage     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x02f0:
            android.util.Pair r3 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x02f8
        L_0x02f5:
            X.6vJ r0 = X.C141276vJ.StaticImage     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x02f0
        L_0x02f8:
            r6.close()     // Catch:{ Exception -> 0x038c }
            r5.close()     // Catch:{ Exception -> 0x038c }
            goto L_0x038c
        L_0x0300:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.lang.String r0 = "Unknown block header ["
            r1.append(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.lang.String r0 = java.lang.Integer.toHexString(r13)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.lang.String r0 = X.AnonymousClass000.A0W(r0, r1)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0316:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x031b:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0320:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0325:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x032a:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x032f:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0334:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0339:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x033e:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0343:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0348:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x034d:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0352:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0357:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x035c:
            java.lang.String r0 = "Illegal header for gif"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0363:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
            goto L_0x036c
        L_0x0368:
            java.io.EOFException r0 = A00()     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x036c:
            throw r0     // Catch:{ Exception -> 0x037d, all -> 0x036d }
        L_0x036d:
            r0 = move-exception
            goto L_0x0372
        L_0x036f:
            r0 = move-exception
            r5 = r18
        L_0x0372:
            r6.close()     // Catch:{ Exception -> 0x03a6 }
            if (r5 == 0) goto L_0x03a6
            r5.close()     // Catch:{ Exception -> 0x03a6 }
            throw r0
        L_0x037b:
            r5 = r18
        L_0x037d:
            r6.close()     // Catch:{ Exception -> 0x0385 }
            if (r5 == 0) goto L_0x0385
            r5.close()     // Catch:{ Exception -> 0x0385 }
        L_0x0385:
            android.util.Pair r3 = new android.util.Pair
            r1 = r18
            r3.<init>(r1, r1)
        L_0x038c:
            java.lang.Object r2 = r3.first
            X.8Kh r2 = (X.C172258Kh) r2
            r9.A06 = r2
            java.lang.Object r1 = r3.second
            X.6vJ r0 = X.C141276vJ.AnimatedImage
            if (r1 != r0) goto L_0x0399
            r8 = 1
        L_0x0399:
            r9.A0C = r8
            if (r2 == 0) goto L_0x039e
            return
        L_0x039e:
            java.lang.String r0 = "Bitmap cannot be loaded"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x03a5:
            r0 = move-exception
        L_0x03a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684485l.start():void");
    }

    public C1684485l(Context context, AnonymousClass7TL r4, AnonymousClass7QR r5, C183838qk r6) {
        this.A04 = context;
        this.A07 = r4;
        this.A09 = r5;
        this.A0A = r6;
    }

    public long B1I() {
        int i;
        int i2;
        A01();
        long j = this.A02;
        if (this.A0C) {
            AnonymousClass7TL r6 = this.A07;
            if (r6.A02 != null) {
                int i3 = this.A00 + 1;
                this.A00 = i3;
                List list = r6.A03;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i3 >= i) {
                    this.A00 = 0;
                }
                long j2 = this.A02;
                int i4 = this.A00;
                List list2 = r6.A03;
                if (list2 == null || list2.size() <= i4) {
                    i2 = 0;
                } else {
                    i2 = ((C149287Lw) list2.get(i4)).A00;
                }
                this.A02 = j2 + C18290x4.A0A(i2);
                int i5 = this.A00;
                Movie movie = r6.A01;
                List list3 = r6.A03;
                if (!(movie == null || list3 == null || list3.size() <= i5)) {
                    r6.A00 = i5;
                    movie.setTime(((C149287Lw) list3.get(i5)).A02);
                }
                return j;
            }
        }
        this.A02 = j + this.A03;
        return j;
    }

    public void B1J(long j) {
        A01();
        this.A02 = j;
    }

    public void Bl2(long j) {
        A01();
        this.A02 = j;
    }
}
