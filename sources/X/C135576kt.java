package X;

import android.net.Uri;
import android.os.PowerManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;

/* renamed from: X.6kt  reason: invalid class name and case insensitive filesystem */
public class C135576kt extends C172738Mn {
    public final PowerManager.WakeLock A00;
    public final C55682qk A01;
    public final C620633i A02;
    public final C61072zf A03;
    public final AnonymousClass319 A04;
    public final AnonymousClass1VX A05;
    public final C66843Mz A06;
    public final C66833My A07;
    public final C135446kg A08;
    public final C989053r A09;

    public C135546kq A04(C135496kl r10, C30471mV r11, File file) {
        AnonymousClass33C r0;
        File file2;
        InputStream A0G;
        if (!(r11 == null || r11.A04 == null || (r0 = r11.A01) == null || (file2 = r0.A0F) == null || !file2.exists())) {
            try {
                A0G = this.A09.A0G(Uri.fromFile(r11.A01.A0F), true);
                C627536m.A0R(file, A0G);
                if (!r11.A04.equals(C615131b.A00(this.A01, file))) {
                    C627536m.A0O(file);
                    A0G.close();
                    return null;
                }
                C66833My r1 = this.A07;
                C614630w A0y = r11.A0y();
                C626936e.A06(A0y);
                r1.A00(A0y);
                C66843Mz r12 = this.A06;
                C613030d A1v = r11.A1v();
                C626936e.A06(A1v);
                r12.A00(A1v);
                int[] A072 = r11.A1v().A07();
                if (A072 != null && A072.length == 4) {
                    boolean z = false;
                    if (((long) (A072[0] + A072[1] + A072[2] + A072[3])) == file.length()) {
                        r10.A05 = r11.A1v().A07();
                        if (r11.A1v().A07() != null) {
                            z = true;
                        }
                        r10.A04 = z;
                    }
                }
                AnonymousClass33C r13 = r11.A01;
                r10.A02 = r13.A06;
                r10.A03 = r13.A08;
                r10.A00 = r13.A02;
                r10.A01 = r13.A03;
                r10.A03 = r11.A0y().A09();
                r10.A00 = file;
                r10.A02 = true;
                C135546kq A002 = r10.A00();
                A0G.close();
                return A002;
            } catch (IOException unused) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ProcessImageTask/processImage/failed to get bitmap stream from file ");
                C18260x0.A0n(r11.A01.A0F, A0o);
                C627536m.A0O(file);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    public static boolean A01(int i) {
        if (i == 192 || i == 193 || i == 195 || i == 197 || i == 199 || i == 200 || i == 201 || i == 203 || i == 205 || i == 207) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0242, code lost:
        r10.write(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0293, code lost:
        if (r18 == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0295, code lost:
        r14[0] = -1;
        r1 = r15[0];
        r14[1] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a1, code lost:
        if (X.AnonymousClass367.A05(X.AnonymousClass7pG.A05, r1) == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a3, code lost:
        r10.write(r14);
        r12 = r12 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a9, code lost:
        r10.write(r15);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0360, code lost:
        if (r12 == -1) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0362, code lost:
        if (r27 != false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0364, code lost:
        if (r12 == 0) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0367, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0373, code lost:
        if (((long) r12) <= (((long) r5.A02) * 1024)) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0375, code lost:
        r13 = X.AnonymousClass001.A0o();
        r13.append("imageprocessor/prepareimageforsend/copy size:");
        r13.append(r12);
        r13.append(" max:");
        r13.append(r5.A02);
        r0 = X.AnonymousClass000.A0b(" recompress:", r13, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        com.whatsapp.util.Log.i("imageprocessor/stripmetadata missing valid application signature before image");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0769, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x076e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x079c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        r9.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/security ", r1);
        r8.A0Q = "permissions-error";
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        r9.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/oom/ ", r1);
        r8.A0Q = "oom";
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x07bd, code lost:
        r40.A05.B1x(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07c5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r9.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/io/ ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07d2, code lost:
        if (r2.getMessage() != null) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07d4, code lost:
        r0 = X.C86624Kv.A1Z(r2);
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07db, code lost:
        if (r0 == false) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x07dd, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x07e1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/image/not-a-image/ ", r1);
        r9.A02 = false;
        r0 = "NotAImageException";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x07ed, code lost:
        r40.A05.B1x(r1);
        r0 = X.AnonymousClass000.A0P(r2, "IOError: ", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x07fe, code lost:
        r8.A0Q = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0800, code lost:
        r19 = r41.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007f, code lost:
        if (r1 != null) goto L_0x0081;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:238:0x04e4 */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03c2 A[Catch:{ all -> 0x03dc, SecurityException -> 0x078d }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x040d A[Catch:{ all -> 0x041f, all -> 0x0424, OutOfMemoryError -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0419 A[SYNTHETIC, Splitter:B:204:0x0419] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0475 A[Catch:{ all -> 0x03dc, SecurityException -> 0x078d }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04b0 A[Catch:{ all -> 0x0769, all -> 0x076e, 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x060d A[Catch:{ IOException -> 0x0693 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0697 A[SYNTHETIC, Splitter:B:391:0x0697] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06f4 A[Catch:{ all -> 0x0769, all -> 0x076e, 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0741 A[Catch:{ all -> 0x0769, all -> 0x076e, 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x079c A[ExcHandler: SecurityException (r1v12 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:38:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x07ad A[ExcHandler: OutOfMemoryError (r1v10 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:1:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x07e1 A[ExcHandler: 59c (r1v4 'e' X.59c A[CUSTOM_DECLARE]), Splitter:B:1:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0811  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0693 A[EDGE_INSN: B:502:0x0693->B:388:0x0693 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e A[Catch:{ all -> 0x03dc, SecurityException -> 0x078d }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020f A[Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6, all -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0216 A[Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6, all -> 0x03cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7N0 A03() {
        /*
            r42 = this;
            X.6kl r9 = new X.6kl
            r9.<init>()
            r41 = r42
            r0 = r41
            X.6kg r0 = r0.A08
            r40 = r0
            X.7kZ r0 = r0.A01
            r39 = r0
            r1 = 1
            X.6ie r8 = r0.A03
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r8.A0P = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            r0 = r39
            r0.A00 = r1
            r0 = r40
            boolean r0 = r0.A02
            r30 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r30)
            r8.A01 = r0
            r0 = r41
            android.os.PowerManager$WakeLock r0 = r0.A00     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r19 = r0
            if (r0 == 0) goto L_0x0039
            r19.acquire()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x0039:
            r0 = r40
            java.lang.String r0 = r0.A01     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            android.net.Uri r7 = android.net.Uri.parse(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.io.File r2 = X.C18310x6.A0a(r7)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            long r13 = r2.length()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r8.A0K = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            X.33C r6 = new X.33C     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r6.<init>()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r40
            java.io.File r0 = r0.A06     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r38 = r0
            r0 = r40
            X.7Td r5 = r0.A00     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r41
            X.1VX r12 = r0.A05     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = 5179(0x143b, float:7.257E-42)
            boolean r10 = r12.A0X(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "rotation"
            java.lang.String r4 = r7.getQueryParameter(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "flip-v"
            java.lang.String r3 = r7.getQueryParameter(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "flip-h"
            java.lang.String r1 = r7.getQueryParameter(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r4 != 0) goto L_0x0081
            if (r3 != 0) goto L_0x0081
            r0 = 0
            if (r1 == 0) goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            r4 = 2
            if (r0 != 0) goto L_0x00ed
            if (r10 != 0) goto L_0x00ed
            r10 = 0
            r0 = r41
            X.2qk r0 = r0.A01     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r10 = X.C615131b.A00(r0, r2)     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            boolean r0 = r5 instanceof X.C135646l0     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r10 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ IOException -> 0x00a7, 59c -> 0x07e1, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            goto L_0x00ad
        L_0x00a7:
            r1 = move-exception
            java.lang.String r0 = "ProcessImageTask/errorComputingHash"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x00ad:
            r0 = r41
            X.319 r11 = r0.A04     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            X.1mV r3 = r11.A0C(r10)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r3 == 0) goto L_0x00c1
            r1 = r0
            r0 = r38
            X.6kq r3 = r1.A04(r9, r3, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00e6
        L_0x00c1:
            if (r10 == 0) goto L_0x00eb
            r0 = 1
            java.util.Collection r0 = r11.A0H(r10, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x00cc:
            boolean r0 = r11.hasNext()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r3 = r11.next()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            X.1mV r3 = (X.C30471mV) r3     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            boolean r0 = r3 instanceof X.AnonymousClass1n2     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r0 == 0) goto L_0x00cc
            r1 = r41
            r0 = r38
            X.6kq r3 = r1.A04(r9, r3, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r3 == 0) goto L_0x00cc
        L_0x00e6:
            X.C172738Mn.A02(r19)
            goto L_0x080d
        L_0x00eb:
            r9.A01 = r10     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x00ed:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "mediatranscodequeue/processing "
            r1.append(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r1.append(r2)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = " with quality "
            X.C18260x0.A1P(r1, r0, r5)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r41
            X.2zf r0 = r0.A03     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r37 = r0
            r0 = r41
            X.53r r0 = r0.A09     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r36 = r0
            r0 = r41
            X.33i r2 = r0.A02     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r40
            boolean r0 = r0.A03     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r27 = r0
            r3 = 0
            int r0 = r5.A00     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r35 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r35)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r8.A0D = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r30 == 0) goto L_0x0124
            X.7Hr r29 = X.AnonymousClass7pG.A01     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            goto L_0x0126
        L_0x0124:
            X.7Hr r29 = X.AnonymousClass7pG.A00     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x0126:
            java.io.File r11 = r38.getParentFile()     // Catch:{ SecurityException -> 0x078d }
            r1 = 1
            r0 = r36
            java.io.InputStream r1 = r0.A0G(r7, r1)     // Catch:{ IOException -> 0x0164 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0164 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0164 }
            java.io.DataInputStream r10 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0164 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0164 }
            X.0YU r1 = new X.0YU     // Catch:{ all -> 0x015a }
            r1.<init>((java.io.InputStream) r10)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "Xmp"
            java.lang.String r1 = r1.A0H(r0)     // Catch:{ all -> 0x015a }
            r28 = 0
            if (r1 == 0) goto L_0x0154
            java.lang.String r0 = "trainedAlgorithmicMedia"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r3)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0154
            r28 = 1
        L_0x0154:
            r10.close()     // Catch:{ IOException -> 0x0158 }
            goto L_0x016c
        L_0x0158:
            r1 = move-exception
            goto L_0x0167
        L_0x015a:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x015f }
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0164 }
        L_0x0163:
            throw r1     // Catch:{ IOException -> 0x0164 }
        L_0x0164:
            r1 = move-exception
            r28 = 0
        L_0x0167:
            java.lang.String r0 = "imageprocessor/prepareimageforsend/hasXMPDataWithTrainedAlgorithmicMedia Failed to get XMP Data"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x078d }
        L_0x016c:
            if (r11 == 0) goto L_0x017b
            boolean r10 = r11.mkdirs()     // Catch:{ SecurityException -> 0x078d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x078d }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/mk "
            X.C18260x0.A1D(r0, r1, r10)     // Catch:{ SecurityException -> 0x078d }
        L_0x017b:
            X.5UR r0 = r2.A0R()     // Catch:{ SecurityException -> 0x078d }
            android.graphics.Matrix r26 = X.C107655bf.A0K(r7, r0)     // Catch:{ SecurityException -> 0x078d }
            r2 = 1
            r1 = r36
            r0 = r35
            android.graphics.BitmapFactory$Options r25 = r1.A0D(r7, r0, r2, r2)     // Catch:{ SecurityException -> 0x078d }
            r0 = r25
            int r0 = r0.outWidth     // Catch:{ SecurityException -> 0x078d }
            r34 = r0
            r0 = r25
            int r0 = r0.outHeight     // Catch:{ SecurityException -> 0x078d }
            r33 = r0
            r0 = r34
            long r10 = (long) r0     // Catch:{ SecurityException -> 0x078d }
            r0 = r33
            long r0 = (long) r0     // Catch:{ SecurityException -> 0x078d }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ SecurityException -> 0x078d }
            r8.A0L = r10     // Catch:{ SecurityException -> 0x078d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SecurityException -> 0x078d }
            r8.A0J = r0     // Catch:{ SecurityException -> 0x078d }
            r24 = 1
            if (r26 != 0) goto L_0x03e1
            int r1 = r5.A01     // Catch:{ SecurityException -> 0x078d }
            r0 = r34
            if (r0 > r1) goto L_0x01b8
            r0 = r33
            if (r0 <= r1) goto L_0x01c5
        L_0x01b8:
            r10 = 0
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x03e1
            r10 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x03e1
        L_0x01c5:
            r0 = r36
            java.io.InputStream r1 = r0.A0G(r7, r2)     // Catch:{ SecurityException -> 0x078d }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ SecurityException -> 0x078d }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x078d }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ SecurityException -> 0x078d }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x078d }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r38)     // Catch:{ all -> 0x03d7 }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x03d7 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x03d7 }
            r0 = 1577(0x629, float:2.21E-42)
            int r0 = r12.A0N(r0)     // Catch:{ all -> 0x03cd }
            long r0 = (long) r0     // Catch:{ all -> 0x03cd }
            r22 = r0
            r0 = 1024(0x400, double:5.06E-321)
            long r22 = r22 * r0
            byte[] r14 = new byte[r4]     // Catch:{ all -> 0x03cd }
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x03cd }
            r32 = r0
            r0 = 5
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x03cd }
            r31 = r0
            java.lang.String r0 = "imageprocessor/stripmetadata begin stripping metadata"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03cd }
            r13 = -1
            r11.readFully(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            byte[] r1 = new byte[r4]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r1[r3] = r13     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = -40
            r1[r2] = r0     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            boolean r0 = X.AnonymousClass7pG.A01(r14, r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 != 0) goto L_0x0216
            java.lang.String r0 = "imageprocessor/stripmetadata not a jpeg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x0216:
            r10.write(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r11.readFully(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r12 = 4
            r21 = 0
            r20 = 0
        L_0x0221:
            long r0 = (long) r12     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r15 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x03a0
            byte r0 = r14[r3]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 == r13) goto L_0x023c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = "imageprocessor/stripmetadata not a marker"
            r1.append(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = X.C107575bX.A0E(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x023c:
            byte r1 = r14[r2]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = -39
            if (r1 != r0) goto L_0x0247
            r10.write(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x0360
        L_0x0247:
            r0 = r32
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 2
            int r1 = X.AnonymousClass6C9.A0F(r0, r3)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r0 = X.AnonymousClass6CA.A0C(r0, r2, r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r1 = r0 + -2
            if (r1 >= 0) goto L_0x0261
            java.lang.String r0 = "imageprocessor/invalid size bytes on marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x0261:
            byte r16 = r14[r2]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = -38
            r15 = r0
            r0 = r16
            if (r0 != r15) goto L_0x02af
            if (r21 != 0) goto L_0x026e
            goto L_0x0394
        L_0x026e:
            r10.write(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = r32
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            byte[] r0 = new byte[r1]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + r1
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            byte[] r15 = new byte[r2]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
        L_0x0281:
            r18 = 0
        L_0x0283:
            long r0 = (long) r12     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0221
            byte r0 = r11.readByte()     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r15[r3] = r0     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 != r13) goto L_0x0293
            r18 = 1
            goto L_0x0283
        L_0x0293:
            if (r18 == 0) goto L_0x02a9
            r14[r3] = r13     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            byte r1 = r15[r3]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r14[r2] = r1     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int[] r0 = X.AnonymousClass7pG.A05     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            boolean r0 = X.AnonymousClass367.A05(r0, r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 == 0) goto L_0x0221
            r10.write(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 2
            goto L_0x0281
        L_0x02a9:
            r10.write(r15)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 1
            goto L_0x0281
        L_0x02af:
            r15 = r16 & -16
            r0 = -32
            if (r15 != r0) goto L_0x034b
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x02f2
            r0 = -31
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x02ca
            r0 = -19
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0346
            goto L_0x039a
        L_0x02ca:
            if (r20 != 0) goto L_0x0346
            r0 = r31
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 5
            int r1 = r1 + -5
            byte[] r15 = X.AnonymousClass7pG.A02     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            boolean r0 = X.AnonymousClass7pG.A01(r0, r15)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 != 0) goto L_0x02ef
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP1 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = X.C107575bX.A0E(r31)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x02ef:
            r20 = 1
            goto L_0x0346
        L_0x02f2:
            r0 = r31
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 5
            int r1 = r1 + -5
            byte[] r15 = X.AnonymousClass7pG.A03     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            boolean r0 = X.AnonymousClass7pG.A01(r0, r15)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 == 0) goto L_0x032b
            if (r21 != 0) goto L_0x0320
            r10.write(r13)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = -32
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = r32
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r10.write(r15)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            byte[] r0 = new byte[r1]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r21 = 1
            goto L_0x0324
        L_0x0320:
            X.AnonymousClass7pG.A00(r11, r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + r1
        L_0x0324:
            r11.readFully(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + 2
            goto L_0x0221
        L_0x032b:
            byte[] r15 = X.AnonymousClass7pG.A04     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = r31
            boolean r0 = X.AnonymousClass7pG.A01(r0, r15)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            if (r0 != 0) goto L_0x0346
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP0 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            java.lang.String r0 = X.C107575bX.A0E(r31)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x0346:
            X.AnonymousClass7pG.A00(r11, r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            int r12 = r12 + r1
            goto L_0x035b
        L_0x034b:
            byte[] r1 = new byte[r1]     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r11.readFully(r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r10.write(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r0 = r32
            r10.write(r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            r10.write(r1)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
        L_0x035b:
            r11.readFully(r14)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x0221
        L_0x0360:
            if (r12 == r13) goto L_0x03b5
            if (r27 != 0) goto L_0x0367
            if (r12 == 0) goto L_0x0375
            goto L_0x036a
        L_0x0367:
            r24 = 0
            goto L_0x0375
        L_0x036a:
            long r13 = (long) r12     // Catch:{ all -> 0x03cd }
            int r0 = r5.A02     // Catch:{ all -> 0x03cd }
            long r0 = (long) r0     // Catch:{ all -> 0x03cd }
            r15 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r15
            int r15 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0367
        L_0x0375:
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/copy size:"
            r13.append(r0)     // Catch:{ all -> 0x03cd }
            r13.append(r12)     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = " max:"
            r13.append(r0)     // Catch:{ all -> 0x03cd }
            int r0 = r5.A02     // Catch:{ all -> 0x03cd }
            r13.append(r0)     // Catch:{ all -> 0x03cd }
            java.lang.String r1 = " recompress:"
            r0 = r24
            java.lang.String r0 = X.AnonymousClass000.A0b(r1, r13, r0)     // Catch:{ all -> 0x03cd }
            goto L_0x03b7
        L_0x0394:
            java.lang.String r0 = "imageprocessor/stripmetadata missing valid application signature before image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x039a:
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x03a0:
            java.lang.String r0 = "imageprocessor/stripmetadata file too large"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03af, IOException -> 0x03ab, NullPointerException -> 0x03a6 }
            goto L_0x03b5
        L_0x03a6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03cd }
            goto L_0x03b5
        L_0x03ab:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata IOException"
            goto L_0x03b2
        L_0x03af:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata stream ended unexpectedly"
        L_0x03b2:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03cd }
        L_0x03b5:
            java.lang.String r0 = "imageprocessor/prepareimageforsend/stripmetadata unable to strip metadata, file needs reencoding"
        L_0x03b7:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03cd }
            r10.close()     // Catch:{ all -> 0x03d7 }
            r11.close()     // Catch:{ SecurityException -> 0x078d }
            if (r24 != 0) goto L_0x03e1
            r2 = r39
            r1 = r34
            r0 = r33
            r2.A02(r1, r0)     // Catch:{ SecurityException -> 0x078d }
            goto L_0x0473
        L_0x03cd:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x03d2 }
            goto L_0x03d6
        L_0x03d2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d7 }
        L_0x03d6:
            throw r1     // Catch:{ all -> 0x03d7 }
        L_0x03d7:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x03dc }
            goto L_0x03e0
        L_0x03dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SecurityException -> 0x078d }
        L_0x03e0:
            throw r1     // Catch:{ SecurityException -> 0x078d }
        L_0x03e1:
            int r10 = r5.A03     // Catch:{ SecurityException -> 0x078d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r10)     // Catch:{ SecurityException -> 0x078d }
            r8.A0G = r0     // Catch:{ SecurityException -> 0x078d }
            r0 = r36
            java.io.InputStream r0 = r0.A0G(r7, r2)     // Catch:{ OutOfMemoryError -> 0x0429 }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x0429 }
            r11.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0429 }
            byte[] r12 = X.C624535b.A05(r11)     // Catch:{ all -> 0x041f }
            int r1 = r12.length     // Catch:{ all -> 0x041f }
            r0 = r25
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeByteArray(r12, r3, r1, r0)     // Catch:{ all -> 0x041f }
            if (r13 == 0) goto L_0x0419
            int r0 = r13.getWidth()     // Catch:{ all -> 0x041f }
            if (r0 == 0) goto L_0x0419
            int r0 = r13.getHeight()     // Catch:{ all -> 0x041f }
            if (r0 == 0) goto L_0x0419
            r12 = r35
            r1 = r26
            android.graphics.Bitmap r12 = X.C107655bf.A0I(r13, r1, r12, r12)     // Catch:{ all -> 0x041f }
            r11.close()     // Catch:{ OutOfMemoryError -> 0x0429 }
            goto L_0x0451
        L_0x0419:
            X.59c r0 = new X.59c     // Catch:{ all -> 0x041f }
            r0.<init>()     // Catch:{ all -> 0x041f }
            throw r0     // Catch:{ all -> 0x041f }
        L_0x041f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0424 }
            goto L_0x0428
        L_0x0424:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0429 }
        L_0x0428:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0429 }
        L_0x0429:
            r11 = move-exception
            r0 = r25
            int r0 = r0.inSampleSize     // Catch:{ SecurityException -> 0x078d }
            int r12 = r0 * 2
            r0 = r25
            r0.inSampleSize = r12     // Catch:{ SecurityException -> 0x078d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x078d }
            java.lang.String r0 = "imageprocessor/compressToFile/oom "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r12)     // Catch:{ SecurityException -> 0x078d }
            com.whatsapp.util.Log.i(r0, r11)     // Catch:{ SecurityException -> 0x078d }
            r1 = r36
            r0 = r25
            android.graphics.Bitmap r12 = r1.A0A(r0, r7, r2)     // Catch:{ SecurityException -> 0x078d }
            r11 = r35
            r1 = r26
            android.graphics.Bitmap r12 = X.C107655bf.A0I(r12, r1, r11, r11)     // Catch:{ SecurityException -> 0x078d }
        L_0x0451:
            int r11 = r12.getWidth()     // Catch:{ SecurityException -> 0x078d }
            int r1 = r12.getHeight()     // Catch:{ SecurityException -> 0x078d }
            r0 = r39
            r0.A02(r11, r1)     // Catch:{ SecurityException -> 0x078d }
            boolean r0 = r5 instanceof X.C135646l0     // Catch:{ IOException -> 0x0773 }
            com.whatsapp.media.transcode.Mozjpeg r11 = X.C105495Ve.A00     // Catch:{ IOException -> 0x0773 }
            java.lang.String r13 = r38.getAbsolutePath()     // Catch:{ IOException -> 0x0773 }
            r14 = r10
            r15 = r2
            r16 = r3
            r17 = r0
            r11.A00(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x0773 }
            r3 = 1
            r12.recycle()     // Catch:{ SecurityException -> 0x078d }
        L_0x0473:
            if (r28 == 0) goto L_0x0478
            X.C107655bf.A0b(r38)     // Catch:{ SecurityException -> 0x078d }
        L_0x0478:
            r0 = r29
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x078d }
            r0 = r36
            android.graphics.Bitmap r2 = r0.A0B(r7, r1, r1)     // Catch:{ SecurityException -> 0x078d }
            r0 = r38
            r6.A0F = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/thumbnail width:"
            r1.append(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r2.getWidth()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r1.append(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = " height:"
            r1.append(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r2.getHeight()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            X.C18260x0.A1F(r1, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r29
            int r7 = r0.A00     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r30 ^ 1
            boolean r13 = r5 instanceof X.C135646l0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            byte[] r5 = X.C105495Ve.A00(r2, r7, r0, r13)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            if (r5 != 0) goto L_0x04bd
            java.io.ByteArrayOutputStream r1 = X.AnonymousClass0x9.A0e()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r2.compress(r0, r7, r1)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            byte[] r5 = r1.toByteArray()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x04bd:
            java.lang.String r0 = "imageprocessor/prepareimageforsend/thumbnailGenerated"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r1 = r2.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            int r0 = r2.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            if (r1 <= r0) goto L_0x04e4
            java.io.File r0 = r6.A0F     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            android.util.Pair r1 = X.AnonymousClass29I.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            if (r1 == 0) goto L_0x04e4
            java.lang.Object r0 = r1.first     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            r6.A02 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            java.lang.Object r0 = r1.second     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
            r6.A03 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x04e4 }
        L_0x04e4:
            r2.recycle()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A03 = r5     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.io.File r0 = r6.A0F     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            X.C107655bf.A0a(r6, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r2 = r6.A08     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r1 = r6.A06     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r39
            r0.A02(r2, r1)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r41
            X.2qk r1 = r0.A01     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r38
            java.io.FileInputStream r1 = X.C107655bf.A0T(r1, r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.io.BufferedInputStream r23 = new java.io.BufferedInputStream     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = r23
            r0.<init>(r1)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r22 = 0
            r21 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0769 }
            r20 = 0
            r18 = 0
            r17 = 0
            r11 = 0
            r1 = 0
            java.lang.String r2 = "ProcessImageTask/number of scans after compression = "
            r12 = 7
            r10 = 1
            if (r3 != 0) goto L_0x05fa
            if (r27 != 0) goto L_0x05fa
            r13 = 10
            r7 = 0
        L_0x0523:
            int r3 = r23.read()     // Catch:{ IOException -> 0x05b7 }
            r0 = -1
            if (r3 == r0) goto L_0x05b7
            if (r11 >= r13) goto L_0x05b7
            int r20 = r20 + 1
            if (r22 != 0) goto L_0x05b7
            r15 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x05ac
            if (r1 == r10) goto L_0x05a7
            r14 = 3
            if (r1 == r4) goto L_0x05a3
            r0 = 4
            if (r1 == r14) goto L_0x054b
            if (r1 == r0) goto L_0x0549
            int r15 = r18 << 8
            int r15 = r15 + r3
            int r15 = r15 - r4
            long r0 = (long) r15     // Catch:{ IOException -> 0x05b7 }
            r14 = r23
            X.C624535b.A04(r14, r0)     // Catch:{ IOException -> 0x05b7 }
            goto L_0x05b0
        L_0x0549:
            r1 = 5
            goto L_0x05b3
        L_0x054b:
            if (r3 == r15) goto L_0x05a5
            if (r3 == 0) goto L_0x05b2
            r0 = 217(0xd9, float:3.04E-43)
            if (r3 != r0) goto L_0x0561
            r22 = 1
            int r0 = r20 + -2
            if (r17 <= 0) goto L_0x055c
            X.C18270x1.A1K(r5, r0)     // Catch:{ IOException -> 0x05b7 }
        L_0x055c:
            r11 = r17
            int r17 = r17 + 1
            goto L_0x05b2
        L_0x0561:
            if (r21 != 0) goto L_0x056b
            boolean r0 = A01(r3)     // Catch:{ IOException -> 0x05b7 }
            if (r0 == 0) goto L_0x056b
            goto L_0x074d
        L_0x056b:
            r0 = 194(0xc2, float:2.72E-43)
            if (r3 == r0) goto L_0x05a0
            r0 = 198(0xc6, float:2.77E-43)
            if (r3 == r0) goto L_0x05a0
            r0 = 202(0xca, float:2.83E-43)
            if (r3 == r0) goto L_0x05a0
            r0 = 206(0xce, float:2.89E-43)
            if (r3 == r0) goto L_0x05a0
            r0 = 218(0xda, float:3.05E-43)
            if (r3 != r0) goto L_0x0587
            int r0 = r20 - r4
            if (r17 <= 0) goto L_0x059a
            X.C18270x1.A1K(r5, r0)     // Catch:{ IOException -> 0x05b7 }
            goto L_0x059a
        L_0x0587:
            if (r3 == r10) goto L_0x05b2
            r0 = 208(0xd0, float:2.91E-43)
            if (r3 < r0) goto L_0x059e
            r0 = 215(0xd7, float:3.01E-43)
            if (r3 <= r0) goto L_0x05b2
            r0 = 217(0xd9, float:3.04E-43)
            if (r3 == r0) goto L_0x05b2
            r0 = 216(0xd8, float:3.03E-43)
            if (r3 == r0) goto L_0x05b2
            goto L_0x059e
        L_0x059a:
            r11 = r17
            int r17 = r17 + 1
        L_0x059e:
            r1 = 4
            goto L_0x05b3
        L_0x05a0:
            r21 = 1
            goto L_0x05b3
        L_0x05a3:
            if (r3 != r15) goto L_0x05b3
        L_0x05a5:
            r1 = 3
            goto L_0x05b3
        L_0x05a7:
            r0 = 216(0xd8, float:3.03E-43)
            if (r3 != r0) goto L_0x05b7
            goto L_0x05b2
        L_0x05ac:
            if (r3 != r15) goto L_0x05b7
            r1 = 1
            goto L_0x05b3
        L_0x05b0:
            int r20 = r20 + r15
        L_0x05b2:
            r1 = 2
        L_0x05b3:
            r18 = r3
            goto L_0x0523
        L_0x05b7:
            if (r21 == 0) goto L_0x074d
            int r1 = r5.size()     // Catch:{ all -> 0x0769 }
            r0 = 8
            if (r1 == r0) goto L_0x05d5
            int r0 = r5.size()     // Catch:{ all -> 0x0769 }
            if (r0 == r12) goto L_0x05d5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0769 }
            X.C18260x0.A19(r2, r1, r5)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = " does not match target=1"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0769 }
            goto L_0x074d
        L_0x05d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0769 }
            r8.A03 = r0     // Catch:{ all -> 0x0769 }
            r9.A04 = r10     // Catch:{ all -> 0x0769 }
            int r11 = A00(r5, r7)     // Catch:{ all -> 0x0769 }
            long r2 = r38.length()     // Catch:{ all -> 0x0769 }
            long r0 = (long) r11     // Catch:{ all -> 0x0769 }
            long r2 = r2 - r0
            int r5 = (int) r2     // Catch:{ all -> 0x0769 }
            r2 = 100
            if (r5 <= r2) goto L_0x074d
            int[] r5 = new int[r4]     // Catch:{ all -> 0x0769 }
            r5[r7] = r11     // Catch:{ all -> 0x0769 }
            long r2 = r38.length()     // Catch:{ all -> 0x0769 }
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch:{ all -> 0x0769 }
            r5[r10] = r0     // Catch:{ all -> 0x0769 }
            goto L_0x06e9
        L_0x05fa:
            r7 = 0
        L_0x05fb:
            r12 = 6
            r16 = 1
            int r3 = r23.read()     // Catch:{ IOException -> 0x0693 }
            r0 = -1
            if (r3 == r0) goto L_0x0693
            r0 = 20
            if (r11 >= r0) goto L_0x0693
            int r20 = r20 + 1
            if (r22 != 0) goto L_0x0693
            r15 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0688
            if (r1 == r10) goto L_0x0683
            r14 = 3
            if (r1 == r4) goto L_0x067f
            r0 = 4
            if (r1 == r14) goto L_0x0628
            if (r1 == r0) goto L_0x0626
            int r15 = r18 << 8
            int r15 = r15 + r3
            int r15 = r15 - r4
            long r0 = (long) r15     // Catch:{ IOException -> 0x0693 }
            r14 = r23
            X.C624535b.A04(r14, r0)     // Catch:{ IOException -> 0x0693 }
            goto L_0x068c
        L_0x0626:
            r1 = 5
            goto L_0x068f
        L_0x0628:
            if (r3 == r15) goto L_0x0681
            if (r3 == 0) goto L_0x068e
            r0 = 217(0xd9, float:3.04E-43)
            if (r3 != r0) goto L_0x063e
            r22 = 1
            int r0 = r20 + -2
            if (r17 <= 0) goto L_0x0639
            X.C18270x1.A1K(r5, r0)     // Catch:{ IOException -> 0x0693 }
        L_0x0639:
            r11 = r17
            int r17 = r17 + 1
            goto L_0x068e
        L_0x063e:
            if (r21 != 0) goto L_0x0647
            boolean r0 = A01(r3)     // Catch:{ IOException -> 0x0693 }
            if (r0 == 0) goto L_0x0647
            goto L_0x0693
        L_0x0647:
            r0 = 194(0xc2, float:2.72E-43)
            if (r3 == r0) goto L_0x067c
            r0 = 198(0xc6, float:2.77E-43)
            if (r3 == r0) goto L_0x067c
            r0 = 202(0xca, float:2.83E-43)
            if (r3 == r0) goto L_0x067c
            r0 = 206(0xce, float:2.89E-43)
            if (r3 == r0) goto L_0x067c
            r0 = 218(0xda, float:3.05E-43)
            if (r3 != r0) goto L_0x0663
            int r0 = r20 - r4
            if (r17 <= 0) goto L_0x0676
            X.C18270x1.A1K(r5, r0)     // Catch:{ IOException -> 0x0693 }
            goto L_0x0676
        L_0x0663:
            if (r3 == r10) goto L_0x068e
            r0 = 208(0xd0, float:2.91E-43)
            if (r3 < r0) goto L_0x067a
            r0 = 215(0xd7, float:3.01E-43)
            if (r3 <= r0) goto L_0x068e
            r0 = 217(0xd9, float:3.04E-43)
            if (r3 == r0) goto L_0x068e
            r0 = 216(0xd8, float:3.03E-43)
            if (r3 == r0) goto L_0x068e
            goto L_0x067a
        L_0x0676:
            r11 = r17
            int r17 = r17 + 1
        L_0x067a:
            r1 = 4
            goto L_0x068f
        L_0x067c:
            r21 = 1
            goto L_0x068f
        L_0x067f:
            if (r3 != r15) goto L_0x068f
        L_0x0681:
            r1 = 3
            goto L_0x068f
        L_0x0683:
            r0 = 216(0xd8, float:3.03E-43)
            if (r3 != r0) goto L_0x0693
            goto L_0x068e
        L_0x0688:
            if (r3 != r15) goto L_0x0693
            r1 = 1
            goto L_0x068f
        L_0x068c:
            int r20 = r20 + r15
        L_0x068e:
            r1 = 2
        L_0x068f:
            r18 = r3
            goto L_0x05fb
        L_0x0693:
            r11 = 4
            r15 = 3
            if (r13 == 0) goto L_0x06ec
            int r1 = r5.size()     // Catch:{ all -> 0x0769 }
            r0 = 9
            if (r1 != r0) goto L_0x06ec
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0769 }
            r8.A03 = r0     // Catch:{ all -> 0x0769 }
            r9.A04 = r10     // Catch:{ all -> 0x0769 }
            int r13 = A00(r5, r7)     // Catch:{ all -> 0x0769 }
            int r12 = A00(r5, r4)     // Catch:{ all -> 0x0769 }
            int r12 = r12 - r13
            r0 = 7
            int r10 = A00(r5, r0)     // Catch:{ all -> 0x0769 }
            int r0 = A00(r5, r4)     // Catch:{ all -> 0x0769 }
            int r10 = r10 - r0
            long r2 = r38.length()     // Catch:{ all -> 0x0769 }
            r0 = 7
            int r0 = A00(r5, r0)     // Catch:{ all -> 0x0769 }
            long r0 = (long) r0     // Catch:{ all -> 0x0769 }
            long r2 = r2 - r0
            int r1 = (int) r2     // Catch:{ all -> 0x0769 }
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x0769 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0769 }
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x0769 }
            r8.A0C = r0     // Catch:{ all -> 0x0769 }
            r0 = 7
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0769 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0769 }
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x0769 }
            r8.A0F = r0     // Catch:{ all -> 0x0769 }
            int[] r5 = new int[r11]     // Catch:{ all -> 0x0769 }
            r5[r7] = r13     // Catch:{ all -> 0x0769 }
            r5[r16] = r12     // Catch:{ all -> 0x0769 }
            r5[r4] = r10     // Catch:{ all -> 0x0769 }
            r5[r15] = r1     // Catch:{ all -> 0x0769 }
        L_0x06e9:
            r9.A05 = r5     // Catch:{ all -> 0x0769 }
            goto L_0x074d
        L_0x06ec:
            int r1 = r5.size()     // Catch:{ all -> 0x0769 }
            r0 = 8
            if (r1 != r0) goto L_0x0741
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0769 }
            r8.A03 = r0     // Catch:{ all -> 0x0769 }
            r9.A04 = r10     // Catch:{ all -> 0x0769 }
            int r14 = A00(r5, r7)     // Catch:{ all -> 0x0769 }
            r0 = 5
            int r13 = A00(r5, r0)     // Catch:{ all -> 0x0769 }
            int r13 = r13 - r14
            int r10 = A00(r5, r12)     // Catch:{ all -> 0x0769 }
            int r0 = A00(r5, r0)     // Catch:{ all -> 0x0769 }
            int r10 = r10 - r0
            long r2 = r38.length()     // Catch:{ all -> 0x0769 }
            int r0 = A00(r5, r12)     // Catch:{ all -> 0x0769 }
            long r0 = (long) r0     // Catch:{ all -> 0x0769 }
            long r2 = r2 - r0
            int r4 = (int) r2     // Catch:{ all -> 0x0769 }
            r0 = 5
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0769 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0769 }
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x0769 }
            r8.A0C = r0     // Catch:{ all -> 0x0769 }
            java.lang.Object r0 = r5.get(r12)     // Catch:{ all -> 0x0769 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0769 }
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x0769 }
            r8.A0F = r0     // Catch:{ all -> 0x0769 }
            int[] r1 = new int[r11]     // Catch:{ all -> 0x0769 }
            r1[r7] = r14     // Catch:{ all -> 0x0769 }
            r1[r16] = r13     // Catch:{ all -> 0x0769 }
            r0 = 2
            r1[r0] = r10     // Catch:{ all -> 0x0769 }
            r1[r15] = r4     // Catch:{ all -> 0x0769 }
            r9.A05 = r1     // Catch:{ all -> 0x0769 }
            goto L_0x074d
        L_0x0741:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0769 }
            X.C18260x0.A19(r2, r1, r5)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = " does not match target=8"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0769 }
        L_0x074d:
            r23.close()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r6.A06     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A02 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r6.A08     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A03 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r6.A02     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A00 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            int r0 = r6.A03     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A01 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.io.File r0 = r6.A0F     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r9.A00 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            r0 = 1
            r9.A02 = r0     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            goto L_0x0806
        L_0x0769:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x076e }
            goto L_0x0772
        L_0x076e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x0772:
            throw r1     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x0773:
            r4 = move-exception
            long r6 = r37.A02()     // Catch:{ all -> 0x0788 }
            int r0 = r5.A02     // Catch:{ all -> 0x0788 }
            long r2 = (long) r0     // Catch:{ all -> 0x0788 }
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0787
            java.lang.String r0 = "imageprocessor/compressToFile/No space left on device"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0788 }
        L_0x0787:
            throw r4     // Catch:{ all -> 0x0788 }
        L_0x0788:
            r0 = move-exception
            r12.recycle()     // Catch:{ SecurityException -> 0x078d }
            throw r0     // Catch:{ SecurityException -> 0x078d }
        L_0x078d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/securityexception"
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
            throw r2     // Catch:{ 59c -> 0x07e1, IOException -> 0x07c5, OutOfMemoryError -> 0x07ad, SecurityException -> 0x079c }
        L_0x079c:
            r1 = move-exception
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "mediatranscodequeue/image/security "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "permissions-error"
            r8.A0Q = r0     // Catch:{ all -> 0x0849 }
            r1 = 2131891184(0x7f1213f0, float:1.941708E38)
            goto L_0x07bd
        L_0x07ad:
            r1 = move-exception
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "mediatranscodequeue/image/oom/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "oom"
            r8.A0Q = r0     // Catch:{ all -> 0x0849 }
            r1 = 2131889108(0x7f120bd4, float:1.941287E38)
        L_0x07bd:
            r0 = r40
            X.8oe r0 = r0.A05     // Catch:{ all -> 0x0849 }
            r0.B1x(r1)     // Catch:{ all -> 0x0849 }
            goto L_0x0800
        L_0x07c5:
            r2 = move-exception
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "mediatranscodequeue/image/io/ "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0849 }
            if (r0 == 0) goto L_0x07dd
            boolean r0 = X.C86624Kv.A1Z(r2)     // Catch:{ all -> 0x0849 }
            r1 = 2131889102(0x7f120bce, float:1.9412858E38)
            if (r0 != 0) goto L_0x07ed
        L_0x07dd:
            r1 = 2131889079(0x7f120bb7, float:1.9412811E38)
            goto L_0x07ed
        L_0x07e1:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/image/not-a-image/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0849 }
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "NotAImageException"
            goto L_0x07fe
        L_0x07ed:
            r0 = r40
            X.8oe r0 = r0.A05     // Catch:{ all -> 0x0849 }
            r0.B1x(r1)     // Catch:{ all -> 0x0849 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0849 }
            java.lang.String r0 = "IOError: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x0849 }
        L_0x07fe:
            r8.A0Q = r0     // Catch:{ all -> 0x0849 }
        L_0x0800:
            r0 = r41
            android.os.PowerManager$WakeLock r0 = r0.A00
            r19 = r0
        L_0x0806:
            X.C172738Mn.A02(r19)
            X.6kq r3 = r9.A00()
        L_0x080d:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0845
            int[] r1 = r3.A05
            int r0 = r1.length
            if (r0 <= 0) goto L_0x081f
            r0 = 0
            r0 = r1[r0]
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r8.A0B = r0
        L_0x081f:
            java.io.File r0 = r3.A00
            X.C626936e.A06(r0)
            java.lang.Long r0 = X.AnonymousClass6C9.A0Z(r0)
            r8.A08 = r0
            boolean r0 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A03 = r0
            byte[] r0 = r3.A03
            if (r0 == 0) goto L_0x0842
            int r0 = r0.length
            long r0 = (long) r0
        L_0x0838:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0N = r0
            r39.A01()
            return r3
        L_0x0842:
            r0 = 0
            goto L_0x0838
        L_0x0845:
            r39.A00()
            return r3
        L_0x0849:
            r1 = move-exception
            r0 = r41
            android.os.PowerManager$WakeLock r0 = r0.A00
            X.C172738Mn.A02(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135576kt.A03():X.7N0");
    }

    public C135576kt(PowerManager.WakeLock wakeLock, C55682qk r2, C620633i r3, C61072zf r4, AnonymousClass319 r5, AnonymousClass1VX r6, C66843Mz r7, C66833My r8, C135446kg r9, C989053r r10) {
        super(r9);
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A09 = r10;
        this.A02 = r3;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = wakeLock;
        this.A04 = r5;
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((Integer) abstractList.get(i)).intValue();
    }
}
