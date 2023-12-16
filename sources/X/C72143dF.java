package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3dF  reason: invalid class name and case insensitive filesystem */
public final class C72143dF implements Callable, C185088t4, C182538oa {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final C56492s4 A04;
    public final C56612sH A05;
    public final C55002pd A06;
    public final C56852sf A07;
    public final AnonymousClass7L2 A08;
    public final C184458rr A09;
    public final C29011i8 A0A;
    public final C46822cG A0B;
    public final CountDownLatch A0C = new CountDownLatch(1);
    public final FutureTask A0D = new FutureTask(this);
    public final boolean A0E;

    public C72143dF(C56492s4 r3, C56612sH r4, C55002pd r5, C56852sf r6, AnonymousClass7L2 r7, C184458rr r8, C29011i8 r9, C46822cG r10, boolean z) {
        C162457s7.A0J(r4, 1);
        C18260x0.A0a(r3, r9, r5, 2);
        this.A05 = r4;
        this.A04 = r3;
        this.A0A = r9;
        this.A06 = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
        this.A0E = z;
        this.A0B = r10;
    }

    public final void A00() {
        if (this.A0D.isCancelled()) {
            throw new CancellationException("PlainDownloadTransfer/ cancelled");
        }
    }

    public AnonymousClass7E5 B2A() {
        int i = 1;
        try {
            FutureTask futureTask = this.A0D;
            futureTask.run();
            AnonymousClass7E5 r1 = (AnonymousClass7E5) futureTask.get();
            this.A0C.countDown();
            C162457s7.A0H(r1);
            return r1;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("PlainDownloadTransfer/ exception ", e);
            this.A0C.countDown();
            return new AnonymousClass7E5(new C625435m(i));
        } catch (CancellationException e2) {
            Log.e("PlainDownloadTransfer/ exception ", e2);
            this.A0C.countDown();
            i = 13;
            return new AnonymousClass7E5(new C625435m(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0171, code lost:
        if (java.lang.Long.parseLong(r0) == r13) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C161997qy BkH(X.AnonymousClass7US r19) {
        /*
            r18 = this;
            java.lang.String r6 = "PlainDownloadTransfer/ error downloading from mms, url: "
            java.lang.String r5 = "PlainDownloadTransfer/ download fail: "
            r1 = 0
            r4 = r18
            java.util.concurrent.FutureTask r0 = r4.A0D
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x001a
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.7qy r7 = X.C161997qy.A01(r0)
        L_0x0019:
            return r7
        L_0x001a:
            X.7L2 r3 = r4.A08     // Catch:{ MalformedURLException -> 0x028e }
            X.8pJ r0 = r3.A01     // Catch:{ MalformedURLException -> 0x028e }
            r10 = r19
            java.lang.String r0 = r0.B3m(r10, r1)     // Catch:{ MalformedURLException -> 0x028e }
            java.net.URL r12 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x028e }
            X.2sf r2 = r4.A07
            if (r2 == 0) goto L_0x004e
            r2.A0c = r12
            X.2pd r1 = r4.A06
            boolean r0 = r4.A0E
            int r0 = r1.A00(r10, r0)
            r2.A02 = r0
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0P = r0
            java.lang.String r0 = r10.A04
            r2.A0X = r0
            java.lang.Integer r0 = X.C18280x3.A0S()
            r2.A0O = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A0L = r0
        L_0x004e:
            r0 = 7
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PlainDownloadTransfer/ downloading: "
            X.C18260x0.A1P(r1, r0, r12)
            X.8t5 r7 = r3.A00
            r7.Brp()
            long r13 = r7.BA7()
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0078
            r15 = 262143(0x3ffff, double:1.29516E-318)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            java.lang.Integer r0 = X.C18320x8.A0W()
            X.7qy r7 = X.C161997qy.A02(r0)
            return r7
        L_0x0078:
            r15 = -1
        L_0x007a:
            X.2cG r0 = r4.A0B     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            r11 = 0
            if (r0 == 0) goto L_0x0083
            java.lang.String r11 = r0.A00()     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
        L_0x0083:
            X.2pd r9 = r4.A06     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            boolean r0 = r4.A0E     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            r17 = r0
            X.4GL r8 = r9.A01(r10, r11, r12, r13, r15, r17)     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            X.C162457s7.A0H(r8)     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x00bb
            r2.A07()     // Catch:{ all -> 0x01a7 }
            r1 = r8
            X.3PZ r1 = (X.AnonymousClass3PZ) r1     // Catch:{ all -> 0x01a7 }
            java.lang.Boolean r0 = r1.A00     // Catch:{ all -> 0x01a7 }
            r2.A0K = r0     // Catch:{ all -> 0x01a7 }
            java.net.HttpURLConnection r1 = r1.A01     // Catch:{ all -> 0x01a7 }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x01a7 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x01a7 }
            r2.A0U = r0     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r1.getHeaderField(r0)     // Catch:{ all -> 0x01a7 }
            r2.A0a = r0     // Catch:{ all -> 0x01a7 }
            int r0 = r1.getContentLength()     // Catch:{ all -> 0x01a7 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x01a7 }
            r2.A0T = r0     // Catch:{ all -> 0x01a7 }
        L_0x00bb:
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]     // Catch:{ all -> 0x01a7 }
            r0 = 200(0xc8, float:2.8E-43)
            boolean r9 = X.C18300x5.A1Y(r1, r0)     // Catch:{ all -> 0x01a7 }
            r0 = 206(0xce, float:2.89E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01a7 }
            r11 = 1
            r1[r11] = r0     // Catch:{ all -> 0x01a7 }
            r0 = r8
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x01a7 }
            java.net.HttpURLConnection r10 = r0.A01     // Catch:{ all -> 0x01a7 }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x01a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01a7 }
            int r0 = X.C73703fw.A00(r0, r1)     // Catch:{ all -> 0x01a7 }
            if (r0 < 0) goto L_0x013e
            int r0 = r10.getContentLength()     // Catch:{ all -> 0x01a7 }
            long r0 = (long) r0     // Catch:{ all -> 0x01a7 }
            long r0 = r0 + r13
            r4.A02 = r0     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x00ef
            r0 = 0
            r2.A0A(r13, r0)     // Catch:{ all -> 0x01a7 }
        L_0x00ef:
            java.io.OutputStream r7 = r7.BgO(r8)     // Catch:{ all -> 0x01a7 }
            X.C162457s7.A0H(r7)     // Catch:{ all -> 0x0137 }
            X.2s4 r1 = r4.A04     // Catch:{ all -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0137 }
            java.io.InputStream r10 = r8.B47(r1, r0, r0)     // Catch:{ all -> 0x0137 }
            r0 = 21
            X.4Ji r11 = new X.4Ji     // Catch:{ all -> 0x0130 }
            r11.<init>(r4, r0)     // Catch:{ all -> 0x0130 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0130 }
        L_0x010b:
            int r0 = r10.read(r1)     // Catch:{ all -> 0x0130 }
            if (r0 < 0) goto L_0x011c
            r7.write(r1, r9, r0)     // Catch:{ all -> 0x0130 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0130 }
            r11.AwB(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x010b
        L_0x011c:
            r10.close()     // Catch:{ all -> 0x0137 }
            r7.close()     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "PlainDownloadTransfer/ download success: "
            X.C18260x0.A1P(r1, r0, r12)     // Catch:{ all -> 0x01a7 }
            if (r3 == 0) goto L_0x0173
            r9 = 14
            goto L_0x0173
        L_0x0130:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x0137 }
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x013e:
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x01a7 }
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x017c
            java.lang.String r0 = "Content-Range"
            java.lang.String r3 = r10.getHeaderField(r0)     // Catch:{ all -> 0x01a7 }
            if (r3 == 0) goto L_0x017c
            java.lang.String r0 = "*/"
            boolean r0 = X.C175728Zm.A0S(r3, r0, r9)     // Catch:{ all -> 0x01a7 }
            if (r0 != r11) goto L_0x017c
            r1 = 47
            int r0 = r3.length()     // Catch:{ all -> 0x01a7 }
            int r0 = r0 + -1
            int r0 = X.C175728Zm.A0D(r3, r1, r0)     // Catch:{ all -> 0x01a7 }
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)     // Catch:{ all -> 0x01a7 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x01a7 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x01a7 }
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
        L_0x0173:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01a7 }
            X.7qy r1 = X.C161997qy.A02(r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01a2
        L_0x017c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "PlainDownloadTransfer/ http connection error/code: "
            r1.append(r0)     // Catch:{ all -> 0x01a7 }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x01a7 }
            X.C18270x1.A1F(r1, r0)     // Catch:{ all -> 0x01a7 }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x01a7 }
            r0 = 507(0x1fb, float:7.1E-43)
            if (r1 != r0) goto L_0x0196
            r11 = 12
        L_0x0196:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01a7 }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x01a7 }
            X.7qy r1 = X.C161997qy.A04(r1, r0, r9)     // Catch:{ all -> 0x01a7 }
        L_0x01a2:
            r8.close()     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            goto L_0x0255
        L_0x01a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a9 }
        L_0x01a9:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
            throw r0     // Catch:{ 4uq -> 0x0209, 1fo -> 0x01f3, IOException -> 0x01dd, 59g -> 0x01c0, Exception -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            if (r2 == 0) goto L_0x01b4
            X.C56852sf.A00(r2, r0, r12)     // Catch:{ all -> 0x0271 }
        L_0x01b4:
            com.whatsapp.util.Log.e(r5, r0)     // Catch:{ all -> 0x0271 }
            java.lang.Integer r0 = X.AnonymousClass001.A0f()     // Catch:{ all -> 0x0271 }
            X.7qy r7 = X.C161997qy.A01(r0)     // Catch:{ all -> 0x0271 }
            goto L_0x0239
        L_0x01c0:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r3, r5)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = ", url: "
            X.C18260x0.A1Q(r1, r0, r12)     // Catch:{ all -> 0x0271 }
            int r0 = r3.downloadStatus     // Catch:{ all -> 0x0271 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0271 }
            boolean r12 = X.C625435m.A02(r0)     // Catch:{ all -> 0x0271 }
            r10 = 0
            r9 = -1
            X.7qy r7 = new X.7qy     // Catch:{ all -> 0x0271 }
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0271 }
            goto L_0x0239
        L_0x01dd:
            r1 = move-exception
            if (r2 == 0) goto L_0x01ea
            X.C56852sf.A00(r2, r1, r12)     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0271 }
            X.C18260x0.A0k(r12, r6, r0, r1)     // Catch:{ all -> 0x0271 }
        L_0x01ea:
            java.lang.Integer r0 = X.C18300x5.A0Y()     // Catch:{ all -> 0x0271 }
            X.7qy r7 = X.C161997qy.A00(r0)     // Catch:{ all -> 0x0271 }
            goto L_0x0239
        L_0x01f3:
            r1 = move-exception
            if (r2 == 0) goto L_0x0200
            X.C56852sf.A00(r2, r1, r12)     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0271 }
            X.C18260x0.A0k(r12, r6, r0, r1)     // Catch:{ all -> 0x0271 }
        L_0x0200:
            java.lang.Integer r0 = X.C18300x5.A0Z()     // Catch:{ all -> 0x0271 }
            X.7qy r7 = X.C161997qy.A00(r0)     // Catch:{ all -> 0x0271 }
            goto L_0x0239
        L_0x0209:
            r3 = move-exception
            if (r2 == 0) goto L_0x021a
            r2.A07()     // Catch:{ all -> 0x0271 }
            X.C56852sf.A00(r2, r3, r12)     // Catch:{ all -> 0x0271 }
            int r0 = r3.responseCode     // Catch:{ all -> 0x0271 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0271 }
            r2.A0U = r0     // Catch:{ all -> 0x0271 }
        L_0x021a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = "PlainDownloadTransfer/ http error "
            r1.append(r0)     // Catch:{ all -> 0x0271 }
            int r0 = r3.responseCode     // Catch:{ all -> 0x0271 }
            r1.append(r0)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = " downloading from mms, url: "
            X.C18260x0.A0k(r12, r0, r1, r3)     // Catch:{ all -> 0x0271 }
            int r0 = r3.downloadStatus     // Catch:{ all -> 0x0271 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0271 }
            int r0 = r3.responseCode     // Catch:{ all -> 0x0271 }
            X.7qy r7 = X.C161997qy.A03(r1, r0)     // Catch:{ all -> 0x0271 }
        L_0x0239:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0247
            r2.A07()
        L_0x0247:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r2.A09()
            return r7
        L_0x0255:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r2 == 0) goto L_0x0270
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0263
            r2.A07()
        L_0x0263:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0270
            r2.A09()
        L_0x0270:
            return r1
        L_0x0271:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            if (r2 == 0) goto L_0x028d
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0280
            r2.A07()
        L_0x0280:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x028d
            r2.A09()
        L_0x028d:
            throw r1
        L_0x028e:
            java.lang.Integer r0 = X.C18310x6.A0e()
            X.7qy r0 = X.C161997qy.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72143dF.BkH(X.7US):X.7qy");
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        String str;
        Long A0f;
        C56852sf r7 = this.A07;
        if (r7 != null) {
            r7.A0A = SystemClock.elapsedRealtime();
            r7.A03 = 0;
        }
        C56612sH r3 = this.A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C29011i8 r10 = this.A0A;
        r10.A0D();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        AnonymousClass7L2 r6 = this.A08;
        long BA7 = r6.A00.BA7();
        this.A01 = BA7;
        this.A03 = BA7;
        if (r7 != null) {
            r7.A0V = C18310x6.A0f(elapsedRealtime2, elapsedRealtime);
            r7.A09 = BA7;
        }
        A00();
        AnonymousClass2YO A082 = r10.A08(r6.A01, 2);
        A00();
        Number number = (Number) A082.A00(this);
        if (r7 != null) {
            r7.A0G = (long) A082.A01.get();
        }
        A00();
        if (number != null) {
            i = number.intValue();
        } else {
            i = 11;
        }
        C625435m r2 = new C625435m(i);
        A00();
        if (r7 != null) {
            r7.A0J = r2;
            r7.A07 = SystemClock.elapsedRealtime();
            r7.A03 = 4;
            r7.A08 = r3.A0H();
        }
        AnonymousClass7E5 r62 = new AnonymousClass7E5(r2);
        if (r7 != null) {
            C625435m r5 = r62.A00;
            C26051bV r4 = new C26051bV();
            C625435m r0 = r7.A0J;
            if (r0 != null) {
                i2 = r0.A01;
            } else {
                i2 = -1;
            }
            int A012 = C106495Zf.A01(i2);
            r4.A0A = r7.A0P;
            if (!(A012 == 1 || A012 == 15)) {
                r4.A0d = r7.A0Y;
                r4.A0e = r7.A0b;
                r4.A0f = AnonymousClass0x7.A0q(r7.A0c);
            }
            r4.A06 = C18330xA.A07(r7.A0I);
            r4.A0L = Long.valueOf(r7.A01());
            r4.A0M = r7.A0U;
            r4.A00 = r7.A0K;
            r4.A01 = Boolean.FALSE;
            r4.A0N = Long.valueOf(r7.A02());
            r4.A0D = Integer.valueOf(r7.A02);
            r4.A0a = Long.valueOf(r7.A0G);
            r4.A0E = r7.A0O;
            Long l = r7.A0V;
            if (l != null) {
                r4.A0V = l;
            }
            r4.A0g = r7.A0X;
            r4.A0W = Long.valueOf(r7.A04());
            URL url = r7.A0c;
            if (url != null) {
                str = url.getHost();
            } else {
                str = null;
            }
            r4.A0h = str;
            r4.A0H = Integer.valueOf(A012);
            r4.A04 = r7.A0L;
            Long l2 = r7.A0T;
            if (l2 == null) {
                l2 = Long.valueOf(r7.A0I);
            }
            C162457s7.A0K(l2, "null cannot be cast to non-null type kotlin.Long");
            r4.A09 = C18330xA.A07(l2.longValue());
            long j = r7.A0A;
            if (j == -1) {
                A0f = null;
            } else {
                A0f = C18310x6.A0f(j, r7.A0f);
            }
            r4.A0Z = A0f;
            r4.A0b = Long.valueOf(r7.A04());
            long j2 = r7.A09;
            if (j2 == -1) {
                j2 = 0;
            }
            r4.A0O = Long.valueOf(j2);
            r4.A0P = Long.valueOf(r7.A03());
            Float f = r7.A0N;
            if (f != null) {
                float floatValue = f.floatValue();
                if (Math.abs(-1.0f - floatValue) > Float.MIN_VALUE) {
                    r4.A07 = Double.valueOf((double) floatValue);
                }
            }
            r4.A0X = r7.A0S;
            r4.A02 = Boolean.valueOf(r7.A0d);
            r4.A08 = C18330xA.A07(r7.A0B);
            r4.A0Q = Long.valueOf(r7.A0C);
            r4.A0C = C619833a.A00(r7.A0a);
            r4.A0G = r7.A0Q;
            r4.A0I = r7.A0R;
            r5.A00 = r4;
        }
        return r62;
    }

    public void cancel() {
        this.A0D.cancel(true);
    }

    public void Ayb() {
        try {
            cancel();
            this.A0C.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Log.e("PlainDownloadTransfer/ waitCancelFinish Cannot fully cancel after 3 seconds");
        }
    }
}
