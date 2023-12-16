package X;

import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7jb  reason: invalid class name and case insensitive filesystem */
public class C158207jb {
    public static final byte[] A08 = {102, 116, 121, 112};
    public static final byte[] A09 = {109, 100, 97, 116};
    public static final byte[] A0A = {109, 111, 111, 118};
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final C55682qk A03;
    public final Mp4Ops A04;
    public final C153407bG A05;
    public final C54292oU A06;
    public final File A07;

    public final int A00(boolean z) {
        AnonymousClass6z0 r1;
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        try {
            C153407bG r5 = this.A05;
            File file = this.A07;
            long j = this.A02;
            Log.i("mp4ops/check/start");
            C134206ic A042 = r5.A04(file, AnonymousClass001.A0f(), false);
            int i = 0;
            while (true) {
                try {
                    mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z, j);
                    if (mp4streamcheck.success || !mp4streamcheck.ioException) {
                        break;
                    }
                    SystemClock.sleep(100);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/integration fail/", e);
                    r1 = new AnonymousClass6z0(0, "stream integrity check error");
                }
            }
            C626936e.A06(mp4streamcheck);
            if (mp4streamcheck.success) {
                Log.i("mp4ops/streamcheck/finished");
                long length = file.length();
                if (A042 != null) {
                    C134206ic.A01(A042);
                    A042.A0D = AnonymousClass0x9.A0m(mp4streamcheck.errorCode);
                    A042.A0B = Long.valueOf(length);
                    A042.A0C = Long.valueOf(mp4streamcheck.bytesRequiredToExtractThumbnail);
                    r5.A02.BhD(A042);
                }
                long j2 = mp4streamcheck.bytesRequiredToExtractThumbnail;
                if (j2 <= 0) {
                    return 1;
                }
                this.A01 = j2;
                return 1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mp4ops/streamcheck/error_message/");
            C18260x0.A1K(A0o, mp4streamcheck.errorMessage);
            int i2 = mp4streamcheck.errorCode;
            r1 = new AnonymousClass6z0(i2, AnonymousClass000.A0Y("integrity check failed, error_code: ", AnonymousClass001.A0o(), i2));
            throw r1;
        } catch (AnonymousClass6z0 e2) {
            Log.e("Mp4StreamCheck/failed/exception", e2);
            Mp4Ops.A00(this.A06.A00, this.A03, this.A05, this.A07, e2, "stream check on download");
            return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        r5 = 0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ca, code lost:
        if (r13 == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r0 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ce, code lost:
        r0 = r15.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        if (r5 > r0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d9, code lost:
        if (r5 <= (r0 - 1024)) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00dc, code lost:
        r3 = A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        if (r0 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        com.whatsapp.util.Log.e("Mp4StreamCheck/mdat before moov, failing check");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ed, code lost:
        r3 = A00(true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(long r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0006
            r2 = 0
            return r2
        L_0x0006:
            java.io.File r0 = r15.A07
            java.io.FileInputStream r8 = X.AnonymousClass0x9.A0g(r0)
            r6 = 8
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x0105 }
            r4 = 0
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x0105 }
            r7 = 1
            if (r0 != r6) goto L_0x00e9
            byte[] r10 = A08     // Catch:{ all -> 0x0105 }
            r9 = 4
            int r3 = r10.length     // Catch:{ all -> 0x0105 }
            if (r9 < r3) goto L_0x002d
            r2 = 0
        L_0x001f:
            r0 = 1
            if (r2 >= r3) goto L_0x002e
            int r0 = r2 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x0105 }
            byte r0 = r10[r2]     // Catch:{ all -> 0x0105 }
            if (r1 != r0) goto L_0x002d
            int r2 = r2 + 1
            goto L_0x001f
        L_0x002d:
            r0 = 0
        L_0x002e:
            r3 = 2
            if (r0 == 0) goto L_0x00f1
            byte r10 = r5[r4]     // Catch:{ all -> 0x0105 }
            byte r2 = r5[r7]     // Catch:{ all -> 0x0105 }
            byte r1 = r5[r3]     // Catch:{ all -> 0x0105 }
            r14 = 3
            byte r0 = r5[r14]     // Catch:{ all -> 0x0105 }
            int r11 = X.AnonymousClass6C7.A02(r10, r2, r1, r0)
            int r11 = r11 - r6
            int r2 = r11 + 8
            long r0 = (long) r2
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x00e9
            long r0 = (long) r11     // Catch:{ all -> 0x0105 }
            r8.skip(r0)     // Catch:{ all -> 0x0105 }
            r13 = 0
        L_0x004b:
            int r0 = r2 + 8
            long r0 = (long) r0     // Catch:{ all -> 0x0105 }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c7
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x0105 }
            int r2 = r2 + r0
            if (r0 != r6) goto L_0x00e9
            byte[] r12 = A0A     // Catch:{ all -> 0x0105 }
            int r11 = r12.length     // Catch:{ all -> 0x0105 }
            if (r9 < r11) goto L_0x0085
            r10 = 0
        L_0x005f:
            if (r10 >= r11) goto L_0x006c
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x0105 }
            byte r0 = r12[r10]     // Catch:{ all -> 0x0105 }
            if (r1 != r0) goto L_0x0085
            int r10 = r10 + 1
            goto L_0x005f
        L_0x006c:
            byte r11 = r5[r4]     // Catch:{ all -> 0x0105 }
            byte r10 = r5[r7]     // Catch:{ all -> 0x0105 }
            byte r1 = r5[r3]     // Catch:{ all -> 0x0105 }
            byte r0 = r5[r14]     // Catch:{ all -> 0x0105 }
            int r11 = X.AnonymousClass6C7.A02(r11, r10, r1, r0)
            int r11 = r11 - r6
            int r2 = r2 + r11
            long r0 = (long) r2
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x00e9
            long r0 = (long) r11     // Catch:{ all -> 0x0105 }
            r8.skip(r0)     // Catch:{ all -> 0x0105 }
            r13 = 1
            goto L_0x004b
        L_0x0085:
            byte[] r12 = A09     // Catch:{ all -> 0x0105 }
            int r11 = r12.length     // Catch:{ all -> 0x0105 }
            if (r9 < r11) goto L_0x00b0
            r10 = 0
        L_0x008b:
            if (r10 >= r11) goto L_0x0098
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x0105 }
            byte r0 = r12[r10]     // Catch:{ all -> 0x0105 }
            if (r1 != r0) goto L_0x00b0
            int r10 = r10 + 1
            goto L_0x008b
        L_0x0098:
            byte r10 = r5[r4]     // Catch:{ all -> 0x0105 }
            byte r9 = r5[r7]     // Catch:{ all -> 0x0105 }
            byte r1 = r5[r3]     // Catch:{ all -> 0x0105 }
            byte r0 = r5[r14]     // Catch:{ all -> 0x0105 }
            int r9 = X.AnonymousClass6C7.A02(r10, r9, r1, r0)
            int r9 = r9 - r6
            int r0 = r2 + 8
            long r0 = (long) r0
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e9
            int r2 = r2 + r9
            long r5 = (long) r2
            r0 = 1
            goto L_0x00ca
        L_0x00b0:
            byte r11 = r5[r4]     // Catch:{ all -> 0x0105 }
            byte r10 = r5[r7]     // Catch:{ all -> 0x0105 }
            byte r1 = r5[r3]     // Catch:{ all -> 0x0105 }
            byte r0 = r5[r14]     // Catch:{ all -> 0x0105 }
            int r10 = X.AnonymousClass6C7.A02(r11, r10, r1, r0)     // Catch:{ all -> 0x0105 }
            int r10 = r10 - r6
            long r0 = (long) r10     // Catch:{ all -> 0x0105 }
            r8.skip(r0)     // Catch:{ all -> 0x0105 }
            int r2 = r2 + r10
            long r0 = (long) r2     // Catch:{ all -> 0x0105 }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x004b
        L_0x00c7:
            r5 = 0
            r0 = 0
        L_0x00ca:
            if (r13 == 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e9
            long r0 = r15.A02     // Catch:{ all -> 0x0105 }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00f1
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00dc
            goto L_0x00ed
        L_0x00dc:
            int r3 = r15.A00(r4)     // Catch:{ all -> 0x0105 }
            goto L_0x00f1
        L_0x00e1:
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "Mp4StreamCheck/mdat before moov, failing check"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00f1
        L_0x00e9:
            r2 = 1
            java.lang.String r0 = "Mp4StreamCheck/need more data to attempt stream check"
            goto L_0x00fe
        L_0x00ed:
            int r3 = r15.A00(r7)     // Catch:{ all -> 0x0105 }
        L_0x00f1:
            r15.A00 = r3     // Catch:{ all -> 0x0105 }
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "Mp4StreamCheck/check complete: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x0105 }
        L_0x00fe:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0105 }
            r8.close()
            return r2
        L_0x0105:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x010a }
            throw r1
        L_0x010a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158207jb.A01(long):boolean");
    }

    public C158207jb(C55682qk r3, Mp4Ops mp4Ops, C153407bG r5, C54292oU r6, File file, long j) {
        this.A06 = r6;
        this.A04 = mp4Ops;
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = file;
        this.A02 = j;
    }
}
