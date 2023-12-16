package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5aq  reason: invalid class name and case insensitive filesystem */
public class C107185aq {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C55132pq A02;
    public final File A03;
    public final Executor A04;

    public static void A01(C193909Qr r6, C195349Xk r7, AnonymousClass9KQ r8, File file, AtomicBoolean atomicBoolean) {
        String str;
        if (atomicBoolean.compareAndSet(false, true)) {
            String A032 = r7.A03();
            if (r8 == null) {
                str = "true";
            } else {
                str = "false";
            }
            if (C162477s9.A01.BI0(4)) {
                C162477s9.A07("WaAssetDownloader", StringFormatUtil.formatStrLocaleSafe("[ARD][%s] report download completed. e == null? %s", A032, str));
            }
            r6.A00(r7, r8, file);
            return;
        }
        C162477s9.A05(r7.A03(), "WaAssetDownloader", "[ARD][%s] request canceled, ignore failure callback");
    }

    public static C194579Tm A00() {
        C194579Tm r1 = new C194579Tm();
        r1.A01(AnonymousClass9K2.DOWNLOAD_ERROR);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r13 = java.lang.Long.valueOf(r16);
        r11 = java.lang.Long.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (X.C162477s9.A01.BI0(4) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        X.C162477s9.A07("WaAssetDownloader", com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe("[ARD][%s] download finish. %d + %d", r12, r13, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        A01(r7, r6, (X.AnonymousClass9KQ) null, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r9.delete();
        X.C162477s9.A0A("WaAssetDownloader", "IOException:", r3);
        r2 = A00();
        r2.A03("local_io_failure");
        r2.A02(X.AnonymousClass000.A0a("Error in writing download contents to the destination file: ", X.AnonymousClass001.A0o(), r3));
        A01(r14, r15, r2.A00(), (java.io.File) null, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0123, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.C162477s9.A0B("WaAssetDownloader", "caught runtime exception from WaDownloader", r3);
        r2 = A00();
        r2.A03("local_io_failure");
        r2.A02(X.AnonymousClass000.A0a("Error in downloading file: ", X.AnonymousClass001.A0o(), r3));
        A01(r14, r15, r2.A00(), (java.io.File) null, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0163, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0168, code lost:
        A03((java.io.FileOutputStream) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0162 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(X.C193909Qr r14, X.C195349Xk r15, X.C107185aq r16, java.util.concurrent.atomic.AtomicBoolean r17) {
        /*
            r5 = r17
            r7 = r14
            r6 = r15
            java.lang.String r8 = r15.A04()     // Catch:{ MalformedURLException -> 0x016c }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x016c }
            r0.<init>(r8)     // Catch:{ MalformedURLException -> 0x016c }
            java.lang.String r1 = "local_io_failure"
            java.lang.String r2 = "WaAssetDownloader"
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x016b
            r4 = 0
            r9 = r16
            X.33K r3 = r9.A01     // Catch:{ IOException -> 0x0123, all -> 0x0162 }
            X.2pq r0 = r9.A02     // Catch:{ IOException -> 0x0123, all -> 0x0162 }
            X.4GL r10 = r3.A00(r0, r8, r4)     // Catch:{ IOException -> 0x0123, all -> 0x0162 }
            java.lang.String r0 = "[%s] got response from server."
            java.lang.String r12 = r15.A03()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.C162477s9.A05(r12, r2, r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.io.File r0 = r9.A03     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r0.mkdirs()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r0 = r10
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.net.HttpURLConnection r3 = r0.A01     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r0 = 400(0x190, float:5.6E-43)
            if (r8 < r0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.String r0 = "WaDownloader/download/Error, code="
            r1.append(r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.C162477s9.A09(r2, r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.io.File r0 = r9.A04(r15)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r0.delete()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.9Tm r1 = A00()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r1.A03(r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.9KQ r0 = r1.A00()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            A01(r14, r15, r0, r4, r5)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            return
        L_0x006f:
            X.2s4 r3 = r9.A00     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.io.InputStream r0 = r10.B47(r3, r4, r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.io.File r9 = r9.A04(r15)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            r0 = 1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f8, all -> 0x011d }
            r3.<init>(r9, r0)     // Catch:{ IOException -> 0x00f8, all -> 0x011d }
            java.lang.String r0 = "[%s] start writing server response to output."
            X.C162477s9.A05(r12, r2, r0)     // Catch:{ IOException -> 0x00f6 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r0]     // Catch:{ IOException -> 0x00f6 }
            long r16 = r9.length()     // Catch:{ IOException -> 0x00f6 }
            r14 = 0
        L_0x0097:
            boolean r0 = r5.get()     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x00f2
            int r1 = r8.read(r10)     // Catch:{ IOException | RuntimeException -> 0x00cb }
            r0 = -1
            if (r1 != r0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            r0 = 0
            r3.write(r10, r0, r1)     // Catch:{ IOException -> 0x00de }
            long r0 = (long) r1     // Catch:{ IOException -> 0x00de }
            long r14 = r14 + r0
            goto L_0x0097
        L_0x00ac:
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ IOException -> 0x00f6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r10 = "[ARD][%s] download finish. %d + %d"
            X.8vJ r1 = X.C162477s9.A01     // Catch:{ IOException -> 0x00f6 }
            r0 = 4
            boolean r0 = r1.BI0(r0)     // Catch:{ IOException -> 0x00f6 }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r10, r12, r13, r11)     // Catch:{ IOException -> 0x00f6 }
            X.C162477s9.A07(r2, r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00c6:
            A01(r7, r6, r4, r9, r5)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x015b
        L_0x00cb:
            r1 = move-exception
            r9.delete()     // Catch:{ IOException -> 0x00f6 }
            X.9Tm r0 = A00()     // Catch:{ IOException -> 0x00f6 }
            r0.A04(r1)     // Catch:{ IOException -> 0x00f6 }
            X.9KQ r0 = r0.A00()     // Catch:{ IOException -> 0x00f6 }
            A01(r7, r6, r0, r4, r5)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x015b
        L_0x00de:
            r1 = move-exception
            X.9Tm r0 = A00()     // Catch:{ IOException -> 0x00f6 }
            r0.A04(r1)     // Catch:{ IOException -> 0x00f6 }
            X.9KQ r0 = r0.A00()     // Catch:{ IOException -> 0x00f6 }
            A01(r7, r6, r0, r4, r5)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = "[ARD][%s] failed to write to output. Reset temp file."
            X.C162477s9.A05(r12, r2, r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00f2:
            r9.delete()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x015b
        L_0x00f6:
            r2 = move-exception
            goto L_0x0148
        L_0x00f8:
            r3 = move-exception
            r9.delete()     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            java.lang.String r0 = "IOException:"
            X.C162477s9.A0A(r2, r0, r3)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            X.9Tm r2 = A00()     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            r2.A03(r1)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            java.lang.String r0 = "Error in writing download contents to the destination file: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            r2.A02(r0)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            X.9KQ r0 = r2.A00()     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            A01(r14, r15, r0, r4, r5)     // Catch:{ IOException -> 0x0120, all -> 0x011d }
            goto L_0x0168
        L_0x011d:
            r0 = move-exception
            r3 = r4
            goto L_0x0160
        L_0x0120:
            r2 = move-exception
            r3 = r4
            goto L_0x0148
        L_0x0123:
            r3 = move-exception
            java.lang.String r0 = "caught runtime exception from WaDownloader"
            X.C162477s9.A0B(r2, r0, r3)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.9Tm r2 = A00()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r2.A03(r1)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            java.lang.String r0 = "Error in downloading file: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            r2.A02(r0)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            X.9KQ r0 = r2.A00()     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            A01(r14, r15, r0, r4, r5)     // Catch:{ IOException -> 0x0145, all -> 0x0162 }
            return
        L_0x0145:
            r2 = move-exception
            r3 = r4
            r8 = r4
        L_0x0148:
            X.9Tm r1 = A00()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "downloader_error"
            r1.A03(r0)     // Catch:{ all -> 0x015f }
            r1.A04(r2)     // Catch:{ all -> 0x015f }
            X.9KQ r0 = r1.A00()     // Catch:{ all -> 0x015f }
            A01(r7, r6, r0, r4, r5)     // Catch:{ all -> 0x015f }
        L_0x015b:
            A03(r3, r8)
            return
        L_0x015f:
            r0 = move-exception
        L_0x0160:
            r4 = r8
            goto L_0x0164
        L_0x0162:
            r0 = move-exception
            r3 = r4
        L_0x0164:
            A03(r3, r4)
            throw r0
        L_0x0168:
            A03(r4, r8)
        L_0x016b:
            return
        L_0x016c:
            X.9Tm r2 = A00()
            java.lang.String r0 = "malformed_url"
            r2.A03(r0)
            java.lang.String r1 = r15.A04()
            java.lang.String r0 = "url"
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r1)
            r2.A05(r0)
            X.9KQ r1 = r2.A00()
            r0 = 0
            A01(r14, r15, r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107185aq.A02(X.9Qr, X.9Xk, X.5aq, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    public static void A03(FileOutputStream fileOutputStream, InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                C162477s9.A0A("WaAssetDownloader", "IOException", e);
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
            } catch (IOException e2) {
                C162477s9.A0A("WaAssetDownloader", "IOException", e2);
            }
        }
    }

    public File A04(C195349Xk r4) {
        File file = new File(this.A03.getCanonicalPath(), r4.A03());
        if (file.getAbsolutePath().equals(file.getCanonicalPath())) {
            return file;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "The absolute path of temp file: ", A0o);
        A0o.append(" is different from the canonical path: ");
        A0o.append(file.getCanonicalPath());
        throw AnonymousClass002.A0C(AnonymousClass000.A0X(". This might cause directory traversal.", A0o));
    }

    public C107185aq(C56492s4 r2, AnonymousClass33K r3, C55132pq r4, AnonymousClass4FS r5, File file) {
        this.A04 = C72173dI.A00(r5);
        this.A03 = file;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
