package X;

import android.util.Base64;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2rE  reason: invalid class name and case insensitive filesystem */
public class C55982rE {
    public AnonymousClass7L0 A00;
    public C158207jb A01;
    public Exception A02;
    public String A03;
    public String A04;
    public final C55682qk A05;
    public final C64393Dh A06;
    public final AnonymousClass36E A07;
    public final Mp4Ops A08;
    public final C56492s4 A09;
    public final C153407bG A0A;
    public final C56612sH A0B;
    public final C54292oU A0C;
    public final C61072zf A0D;
    public final C60872zJ A0E;
    public final C42162Na A0F;
    public final AnonymousClass1VX A0G;
    public final C55002pd A0H;
    public final C55572qZ A0I;
    public final AnonymousClass1I7 A0J;
    public final C56902sk A0K;
    public final C47662dc A0L;
    public final AnonymousClass7US A0M;
    public final C56742sU A0N;
    public final C59132wP A0O;
    public final File A0P;
    public final File A0Q;
    public final File A0R;
    public final String A0S;
    public final URL A0T;
    public final byte[] A0U;
    public final int[] A0V;

    public final boolean A04(String str) {
        long j;
        BufferedInputStream bufferedInputStream;
        if (str != null) {
            try {
                C55682qk r7 = this.A05;
                File file = this.A0Q;
                MessageDigest A0t = AnonymousClass0x7.A0t();
                int[] iArr = this.A0V;
                if (iArr == null || iArr.length != 4) {
                    j = -1;
                } else {
                    j = C18310x6.A0C(iArr);
                }
                bufferedInputStream = new BufferedInputStream(new C140706uL(C107655bf.A0T(r7, file), j));
                C615131b.A02(bufferedInputStream, A0t);
                String encodeToString = Base64.encodeToString(A0t.digest(), 2);
                bufferedInputStream.close();
                if (str.equals(encodeToString)) {
                    return true;
                }
                Log.e("ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match");
                return false;
            } catch (IOException | NoSuchAlgorithmException e) {
                Log.e("ProgressiveJpegUtils/validatePartialHashesFailed", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
    }

    public final AnonymousClass4GL A00(URL url, long j, long j2) {
        AnonymousClass4GL A012 = this.A0H.A01(this.A0M, this.A0S, url, j, j2, true);
        if (this.A00 == null) {
            AnonymousClass3PZ r1 = (AnonymousClass3PZ) A012;
            this.A00 = new AnonymousClass7L0(r1.A01.getHeaderField("X-WA-Metadata"), r1.A00);
        }
        return A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r5 = this;
            X.2dc r2 = r5.A0L
            X.38t r0 = r2.A0A
            boolean r1 = r2.A0Y
            boolean r0 = X.AnonymousClass36O.A04(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r4 = 0
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.A0Q
            if (r0 != 0) goto L_0x0031
            int[] r3 = r5.A0V
            if (r3 == 0) goto L_0x0031
            X.2sk r2 = r5.A0K
            byte[] r0 = r2.A0H()
            if (r0 != 0) goto L_0x0031
            java.io.File r1 = r5.A0Q
            r0 = r3[r4]
            byte[] r0 = X.C59132wP.A00(r1, r0)
            r2.A0G(r0)
            if (r0 == 0) goto L_0x0031
            r4 = 1
        L_0x0031:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55982rE.A01():boolean");
    }

    public final boolean A02(long j) {
        long j2;
        int i = this.A0J.A12;
        if (i == 2 || i == 3) {
            C47662dc r1 = this.A0L;
            if (!r1.A0Y || !AnonymousClass36O.A09(r1.A0A) || i != 3) {
                int[] iArr = this.A0V;
                if (iArr != null) {
                    j2 = (long) iArr[0];
                } else {
                    j2 = 262144;
                }
            } else {
                long j3 = r1.A07;
                long j4 = r1.A06;
                if (j4 == 0) {
                    j2 = 0;
                } else {
                    j2 = (long) Math.ceil((double) (5.0f * (((float) j3) / ((float) j4))));
                }
            }
            if (j >= j2) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03(C56712sR r9) {
        int[] iArr;
        String str;
        C47662dc r7 = this.A0L;
        if (r7.A02 == 3 && r9 != null && (iArr = this.A0V) != null && iArr.length == 4 && (str = r7.A0M) != null && r9.A09(0) && r9.A09(1) && r9.A09(2)) {
            try {
                if (this.A0O.A01(this.A0Q, iArr[0], r7.A0Y) && A04(str)) {
                    return A05(iArr);
                }
            } catch (IOException e) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(int[] r8) {
        /*
            r7 = this;
            java.io.File r1 = r7.A0Q
            r6 = 0
            r4 = 1
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0037 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0037 }
            r1 = r8[r6]     // Catch:{ all -> 0x0030 }
            r0 = r8[r4]     // Catch:{ all -> 0x0030 }
            int r1 = r1 + r0
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x0030 }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ all -> 0x0030 }
            r5.seek(r2)     // Catch:{ all -> 0x0030 }
            byte[] r0 = X.C107655bf.A04     // Catch:{ all -> 0x0030 }
            r5.write(r0)     // Catch:{ all -> 0x0030 }
            int r0 = r0.length     // Catch:{ all -> 0x0030 }
            long r0 = (long) r0     // Catch:{ all -> 0x0030 }
            long r2 = r2 + r0
            r5.setLength(r2)     // Catch:{ all -> 0x0030 }
            java.io.FileDescriptor r0 = r5.getFD()     // Catch:{ all -> 0x0030 }
            r0.sync()     // Catch:{ all -> 0x0030 }
            r5.close()     // Catch:{ IOException -> 0x0037 }
            r0 = 1
            goto L_0x003d
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IOException -> 0x0037 }
            throw r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
        L_0x003d:
            X.2sk r1 = r7.A0K
            if (r0 == 0) goto L_0x004f
            monitor-enter(r1)
            r1.A0I = r4     // Catch:{ all -> 0x004c }
            monitor-exit(r1)
            X.2sU r1 = r7.A0N
            r0 = 3
            r1.A05(r0)
            return r4
        L_0x004c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004f:
            r1.A06()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55982rE.A05(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0069, code lost:
        if (r2 == 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C55982rE(X.C55682qk r6, X.C64393Dh r7, X.AnonymousClass36E r8, com.whatsapp.Mp4Ops r9, X.C56492s4 r10, X.C153407bG r11, X.C56612sH r12, X.C54292oU r13, X.C61072zf r14, X.C60872zJ r15, X.AnonymousClass1VX r16, X.C55002pd r17, X.C55572qZ r18, X.AnonymousClass1I7 r19, X.C56902sk r20, X.C47662dc r21, X.AnonymousClass7US r22, X.C56742sU r23, X.C59132wP r24, java.io.File r25, java.io.File r26, java.io.File r27, java.lang.String r28, java.net.URL r29, byte[] r30, int[] r31) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0C = r13
            r5.A0B = r12
            r5.A08 = r9
            r0 = r16
            r5.A0G = r0
            r5.A05 = r6
            r5.A06 = r7
            r5.A09 = r10
            r5.A0D = r14
            r5.A0E = r15
            r5.A0A = r11
            r5.A07 = r8
            r0 = r18
            r5.A0I = r0
            r0 = r24
            r5.A0O = r0
            r0 = r30
            r5.A0U = r0
            r4 = r21
            r5.A0L = r4
            r3 = r20
            r5.A0K = r3
            r0 = r31
            r5.A0V = r0
            r0 = r17
            r5.A0H = r0
            X.38t r0 = r4.A0A
            X.3G7 r1 = new X.3G7
            r1.<init>(r0)
            byte[] r0 = r4.A0d
            X.2Na r0 = r1.B1Z(r0)
            r5.A0F = r0
            r0 = r19
            r5.A0J = r0
            r0 = r23
            r5.A0N = r0
            r0 = r29
            r5.A0T = r0
            r0 = r25
            r5.A0R = r0
            r0 = r26
            r5.A0Q = r0
            r0 = r27
            r5.A0P = r0
            r0 = r22
            r5.A0M = r0
            int r2 = r4.A02
            r0 = 3
            if (r2 == r0) goto L_0x006b
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            X.C626936e.A0C(r0)
            r0 = 3
            if (r2 != r0) goto L_0x007e
            java.lang.String r1 = r4.A0M
            r0 = 6
            if (r1 != 0) goto L_0x0078
            r0 = 4
        L_0x0078:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
        L_0x007e:
            r0 = r28
            r5.A0S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55982rE.<init>(X.2qk, X.3Dh, X.36E, com.whatsapp.Mp4Ops, X.2s4, X.7bG, X.2sH, X.2oU, X.2zf, X.2zJ, X.1VX, X.2pd, X.2qZ, X.1I7, X.2sk, X.2dc, X.7US, X.2sU, X.2wP, java.io.File, java.io.File, java.io.File, java.lang.String, java.net.URL, byte[], int[]):void");
    }
}
