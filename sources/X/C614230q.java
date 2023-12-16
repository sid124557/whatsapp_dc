package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.30q  reason: invalid class name and case insensitive filesystem */
public class C614230q {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public final C56492s4 A05;
    public final C1228866f A06;
    public final C55132pq A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C = AnonymousClass0x9.A18();
    public final List A0D = AnonymousClass0x9.A18();
    public final List A0E = AnonymousClass0x9.A18();
    public final List A0F = AnonymousClass0x9.A18();
    public final AtomicBoolean A0G = new AtomicBoolean();
    public final AtomicReference A0H = new AtomicReference();
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A00(URL url) {
        if (!(url == null || url.getHost() == null)) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0171, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0188, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.AnonymousClass2A8.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018c, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc A[Catch:{ all -> 0x017b, all -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012e A[Catch:{ all -> 0x017b, all -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157 A[Catch:{ all -> 0x0171 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:146:0x02eb=Splitter:B:146:0x02eb, B:160:0x030b=Splitter:B:160:0x030b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AnonymousClass7US r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x000f
            java.util.List r2 = r13.A0F
            java.lang.String r1 = "auth"
            java.lang.String r0 = r14.A01
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            r2.add(r0)
        L_0x000f:
            java.lang.String r8 = X.C18280x3.A0Y()     // Catch:{ all -> 0x0359 }
            r9 = r13
            boolean r0 = r13 instanceof X.C27741eT     // Catch:{ all -> 0x0359 }
            if (r0 == 0) goto L_0x0197
            X.1eT r9 = (X.C27741eT) r9     // Catch:{ all -> 0x0359 }
            r0 = 1
            X.C162457s7.A0J(r8, r0)     // Catch:{ all -> 0x0359 }
            X.1VX r2 = r9.A01     // Catch:{ TimeoutException -> 0x0352 }
            r1 = 4601(0x11f9, float:6.447E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ TimeoutException -> 0x0352 }
            int r0 = r2.A0O(r0, r1)     // Catch:{ TimeoutException -> 0x0352 }
            if (r0 > 0) goto L_0x002d
            r4 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0031
        L_0x002d:
            long r4 = X.C18290x4.A0A(r0)     // Catch:{ all -> 0x0359 }
        L_0x0031:
            org.chromium.net.CronetEngine r1 = r9.A04     // Catch:{ TimeoutException -> 0x0352 }
            java.net.URL r0 = r9.A05()     // Catch:{ TimeoutException -> 0x0352 }
            java.net.URLConnection r7 = r1.openConnection(r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C162457s7.A0K(r7, r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ TimeoutException -> 0x0352 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r7.setReadTimeout(r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r1 = r9.A03     // Catch:{ TimeoutException -> 0x0352 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r7.setRequestProperty(r0, r1)     // Catch:{ TimeoutException -> 0x0352 }
        L_0x0052:
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r9.A0A     // Catch:{ TimeoutException -> 0x0352 }
            r7.setRequestProperty(r1, r0)     // Catch:{ TimeoutException -> 0x0352 }
            r6 = 0
            if (r14 == 0) goto L_0x00b6
            java.lang.String r1 = "Host"
            java.lang.String r0 = r14.A06     // Catch:{ TimeoutException -> 0x0352 }
            r7.setRequestProperty(r1, r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.util.List r0 = r9.A0C     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.Object r0 = X.C73723fy.A04(r0)     // Catch:{ TimeoutException -> 0x0352 }
            X.5KF r0 = (X.AnonymousClass5KF) r0     // Catch:{ TimeoutException -> 0x0352 }
            if (r0 == 0) goto L_0x00b6
            long r2 = r0.A01     // Catch:{ TimeoutException -> 0x0352 }
            long r0 = r0.A02     // Catch:{ TimeoutException -> 0x0352 }
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x008c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r2 = "bytes "
            r3.append(r2)     // Catch:{ TimeoutException -> 0x0352 }
            r3.append(r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "-*/*"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "Content-Range"
            goto L_0x00c3
        L_0x008c:
            boolean r0 = r9.A0I     // Catch:{ TimeoutException -> 0x0352 }
            if (r0 == 0) goto L_0x00c6
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ TimeoutException -> 0x0352 }
            r7.setRequestProperty(r1, r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "CronetUploadRequestKt/uploadWithTimeout add content length header: "
            r1.append(r0)     // Catch:{ TimeoutException -> 0x0352 }
            r1.append(r2)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = " to upload: "
            r1.append(r0)     // Catch:{ TimeoutException -> 0x0352 }
            java.net.URL r0 = r7.getURL()     // Catch:{ TimeoutException -> 0x0352 }
            X.C18260x0.A0m(r0, r1)     // Catch:{ TimeoutException -> 0x0352 }
            goto L_0x00c6
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r8, r1)     // Catch:{ TimeoutException -> 0x0352 }
            java.lang.String r0 = "Content-Type"
        L_0x00c3:
            r7.setRequestProperty(r0, r1)     // Catch:{ TimeoutException -> 0x0352 }
        L_0x00c6:
            r0 = 1
            r7.setDoOutput(r0)     // Catch:{ TimeoutException -> 0x0352 }
            r0 = 0
            r7.setChunkedStreamingMode(r0)     // Catch:{ TimeoutException -> 0x0352 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x0352 }
            r7.connect()     // Catch:{ all -> 0x018d }
            A02(r9, r7, r0)     // Catch:{ TimeoutException -> 0x0352 }
            X.66f r3 = r9.A06     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x00e1
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x0192 }
            r3.BPk(r0)     // Catch:{ all -> 0x0192 }
        L_0x00e1:
            X.2s4 r10 = r9.A05     // Catch:{ all -> 0x0192 }
            java.lang.Integer r2 = r9.A08     // Catch:{ all -> 0x0192 }
            X.203 r0 = X.AnonymousClass203.A00(r10, r6, r2, r7)     // Catch:{ all -> 0x0192 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0192 }
            r11.<init>(r0)     // Catch:{ all -> 0x0192 }
            r9.A07(r14, r11, r8)     // Catch:{ all -> 0x0186 }
            r11.close()     // Catch:{ all -> 0x0192 }
            X.46Q r0 = X.AnonymousClass2C4.A00     // Catch:{ all -> 0x0192 }
            X.4C6 r8 = X.AnonymousClass349.A02(r0)     // Catch:{ all -> 0x0192 }
            com.whatsapp.http.CronetUploadRequest$uploadWithTimeout$timeoutJob$1 r1 = new com.whatsapp.http.CronetUploadRequest$uploadWithTimeout$timeoutJob$1     // Catch:{ all -> 0x0192 }
            r1.<init>(r7, r6, r4)     // Catch:{ all -> 0x0192 }
            r0 = 3
            X.4Gj r5 = X.C616131n.A02(r6, r1, r8, r6, r0)     // Catch:{ all -> 0x0192 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0192 }
            int r4 = r7.getResponseCode()     // Catch:{ all -> 0x017b }
            long r0 = X.C18310x6.A0A(r0)     // Catch:{ all -> 0x0192 }
            r9.A01 = r0     // Catch:{ all -> 0x0192 }
            r5.AyX(r6)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r7.getHeaderField(r0)     // Catch:{ all -> 0x0192 }
            r9.A03 = r0     // Catch:{ all -> 0x0192 }
            java.util.Map r1 = r7.getHeaderFields()     // Catch:{ all -> 0x0192 }
            r5.AyX(r6)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "CronetUploadRequestKt/connect successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0192 }
            r0 = 400(0x190, float:5.6E-43)
            if (r4 < r0) goto L_0x0157
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "CronetUploadRequestKt/received error response code "
            X.C18260x0.A0w(r0, r1, r4)     // Catch:{ all -> 0x0192 }
            java.io.InputStream r0 = r7.getErrorStream()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0176
            if (r3 == 0) goto L_0x0176
            java.io.InputStream r1 = r7.getErrorStream()     // Catch:{ all -> 0x0192 }
            X.1zz r0 = new X.1zz     // Catch:{ all -> 0x0192 }
            r0.<init>(r10, r1, r6, r2)     // Catch:{ all -> 0x0192 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0192 }
            r2.<init>(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = X.C624535b.A00(r2)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x016b
            r3.BSF(r0)     // Catch:{ all -> 0x016f }
            goto L_0x016b
        L_0x0157:
            if (r3 == 0) goto L_0x0176
            X.1zz r0 = X.C36851zz.A00(r10, r6, r2, r7)     // Catch:{ all -> 0x0192 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0192 }
            r2.<init>(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = X.C624535b.A00(r2)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x016b
            r3.BaA(r0, r1)     // Catch:{ all -> 0x016f }
        L_0x016b:
            r2.close()     // Catch:{ all -> 0x0192 }
            goto L_0x0176
        L_0x016f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ all -> 0x0192 }
            goto L_0x018c
        L_0x0176:
            r7.disconnect()     // Catch:{ TimeoutException -> 0x0352 }
            goto L_0x0311
        L_0x017b:
            r2 = move-exception
            long r0 = X.C18310x6.A0A(r0)     // Catch:{ all -> 0x0192 }
            r9.A01 = r0     // Catch:{ all -> 0x0192 }
            r5.AyX(r6)     // Catch:{ all -> 0x0192 }
            throw r2     // Catch:{ all -> 0x0192 }
        L_0x0186:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r11, r0)     // Catch:{ all -> 0x0192 }
        L_0x018c:
            throw r1     // Catch:{ all -> 0x0192 }
        L_0x018d:
            r2 = move-exception
            A02(r9, r7, r0)     // Catch:{ TimeoutException -> 0x0352 }
            goto L_0x0196
        L_0x0192:
            r2 = move-exception
            r7.disconnect()     // Catch:{ TimeoutException -> 0x0352 }
        L_0x0196:
            throw r2     // Catch:{ TimeoutException -> 0x0352 }
        L_0x0197:
            java.net.URL r0 = r13.A05()     // Catch:{ all -> 0x0359 }
            java.net.URLConnection r3 = r0.openConnection()     // Catch:{ all -> 0x0359 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ all -> 0x0359 }
            boolean r0 = r13.A0J     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 == 0) goto L_0x01b1
            r1 = 1
            X.2pq r0 = r13.A07     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.3fm r12 = r0.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x01ac:
            boolean r0 = r13.A0K     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 == 0) goto L_0x01bf
            goto L_0x01b8
        L_0x01b1:
            X.2pq r0 = r13.A07     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.1r8 r12 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x01ac
        L_0x01b8:
            if (r14 == 0) goto L_0x01bf
            java.lang.String r0 = r14.A06     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.C72353da.A00(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x01bf:
            int r6 = r12.B5o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r12
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setSSLSocketFactory(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r3.setReadTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r13.A0A     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r3.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r1 = r13.A0B     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r1 == 0) goto L_0x01eb
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r3.setRequestProperty(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x01eb:
            r2 = 0
            if (r14 == 0) goto L_0x025b
            java.lang.String r1 = "Host"
            java.lang.String r0 = r14.A06     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.util.List r9 = r13.A0C     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r9.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x026b
            java.lang.Object r0 = r9.get(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.5KF r0 = (X.AnonymousClass5KF) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Object r4 = r9.get(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.5KF r4 = (X.AnonymousClass5KF) r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r4 = r4.A02     // Catch:{ IllegalArgumentException -> 0x0346 }
            r10 = 0
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0233
            java.lang.String r5 = "Content-Range"
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = "bytes "
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Object r0 = r9.get(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.5KF r0 = (X.AnonymousClass5KF) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = "-*/*"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setRequestProperty(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x026b
        L_0x0233:
            boolean r4 = r13.A0I     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 == 0) goto L_0x026b
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x026b
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Long.toString(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setRequestProperty(r5, r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r4 = "httpsformpost/uploadimpl add content length header: "
            r5.append(r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = " to upload: "
            r5.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = r13.A09     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.C18260x0.A1J(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x026b
        L_0x025b:
            java.lang.String r4 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r1)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setRequestProperty(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x026b:
            r0 = 1
            r3.setDoOutput(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.setChunkedStreamingMode(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.connect()     // Catch:{ all -> 0x0339 }
            A02(r13, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.66f r5 = r13.A06     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r5 == 0) goto L_0x0285
            java.lang.String r0 = r13.A09     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5.BPk(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0285:
            int r0 = r12.B5o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != r6) goto L_0x028c
            r2 = 1
        L_0x028c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r13.A02 = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.2s4 r7 = r13.A05     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Integer r6 = r13.A08     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2 = 0
            X.203 r1 = X.AnonymousClass203.A00(r7, r2, r6, r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r13.A07(r14, r0, r8)     // Catch:{ all -> 0x032f }
            r0.close()     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x033e }
            long r0 = X.C18310x6.A0A(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r13.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r3.getHeaderField(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r13.A03 = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.util.Map r8 = r3.getHeaderFields()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = 400(0x190, float:5.6E-43)
            if (r4 < r0) goto L_0x02f9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = "HttpsFormPost/received error response code = "
            X.C18260x0.A0w(r0, r1, r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 == 0) goto L_0x030e
            java.io.InputStream r1 = r3.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x0346 }
            X.1zz r0 = new X.1zz     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.<init>(r7, r1, r2, r6)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = X.C624535b.A00(r2)     // Catch:{ all -> 0x02ef }
            if (r5 == 0) goto L_0x02eb
            r5.BSF(r0)     // Catch:{ all -> 0x02ef }
        L_0x02eb:
            r2.close()     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x030e
        L_0x02ef:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02f4 }
            goto L_0x02f8
        L_0x02f4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02f8:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02f9:
            X.1zz r0 = X.C36851zz.A00(r7, r2, r6, r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x0346 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = X.C624535b.A00(r1)     // Catch:{ all -> 0x032a }
            if (r5 == 0) goto L_0x030b
            r5.BaA(r0, r8)     // Catch:{ all -> 0x032a }
        L_0x030b:
            r1.close()     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x030e:
            r3.disconnect()     // Catch:{ all -> 0x0359 }
        L_0x0311:
            java.util.List r0 = r13.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0317:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0329
            java.lang.Object r0 = r1.next()
            X.5KF r0 = (X.AnonymousClass5KF) r0
            java.io.InputStream r0 = r0.A03
            X.C624535b.A03(r0)
            goto L_0x0317
        L_0x0329:
            return r4
        L_0x032a:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0334 }
            goto L_0x0345
        L_0x032f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0334 }
            goto L_0x0345
        L_0x0334:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x0345
        L_0x0339:
            r2 = move-exception
            A02(r13, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            goto L_0x0345
        L_0x033e:
            r2 = move-exception
            long r0 = X.C18310x6.A0A(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r13.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0345:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0346:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x034d }
            r0.<init>(r1)     // Catch:{ all -> 0x034d }
            throw r0     // Catch:{ all -> 0x034d }
        L_0x034d:
            r0 = move-exception
            r3.disconnect()     // Catch:{ all -> 0x0359 }
            goto L_0x0358
        L_0x0352:
            r1 = move-exception
            X.6u3 r0 = new X.6u3     // Catch:{ all -> 0x0359 }
            r0.<init>(r1)     // Catch:{ all -> 0x0359 }
        L_0x0358:
            throw r0     // Catch:{ all -> 0x0359 }
        L_0x0359:
            r2 = move-exception
            java.util.List r0 = r13.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0360:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0372
            java.lang.Object r0 = r1.next()
            X.5KF r0 = (X.AnonymousClass5KF) r0
            java.io.InputStream r0 = r0.A03
            X.C624535b.A03(r0)
            goto L_0x0360
        L_0x0372:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614230q.A03(X.7US):int");
    }

    public final Pair A04() {
        boolean z;
        Socket socket = (Socket) this.A0H.get();
        int i = 0;
        if (socket != null) {
            try {
                i = NativeUtils.getFileDescriptorForSocket(socket);
                z = true;
            } catch (UnsatisfiedLinkError | UnsupportedOperationException e) {
                Log.w("httpsformpost/getSocketInfo", e);
            }
            return AnonymousClass0x9.A0C(Integer.valueOf(i), Boolean.valueOf(z));
        }
        z = false;
        return AnonymousClass0x9.A0C(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public URL A05() {
        Uri.Builder buildUpon = Uri.parse(this.A09).buildUpon();
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            Pair A0D2 = AnonymousClass0x9.A0D(it);
            buildUpon.appendQueryParameter((String) A0D2.first, (String) A0D2.second);
        }
        return C18330xA.A0B(buildUpon.toString());
    }

    public final void A06(Pair pair, AnonymousClass5KF r9, OutputStream outputStream, AtomicLong atomicLong) {
        long j = r9.A02;
        long j2 = j;
        while (j > 0) {
            j -= r9.A03.skip(j);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = r9.A03.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int A032 = C18280x3.A03(pair);
                int i = 0;
                if (AnonymousClass001.A1Z(pair.second)) {
                    try {
                        i = NativeUtils.getBytesInSocketOutputQueue(A032);
                    } catch (UnsupportedOperationException unused) {
                    }
                }
                long j3 = j2 - ((long) i);
                C1228866f r4 = this.A06;
                if (r4 != null) {
                    r4.BQe(j3);
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
            } else {
                atomicLong.set(j2);
                return;
            }
        } while (!this.A0G.getAndSet(false));
        throw new AnonymousClass57Z();
    }

    public void A07(AnonymousClass7US r18, OutputStream outputStream, String str) {
        String str2;
        String A062;
        String str3;
        OutputStream outputStream2 = outputStream;
        if (r18 != null) {
            List list = this.A0C;
            if (list.size() != 0) {
                boolean A1T = AnonymousClass001.A1T(list.size());
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1H("MMS4 upload only supports a single file; we have been given ", A0o, list);
                C626936e.A0D(A1T, A0o.toString());
                AtomicLong atomicLong = new AtomicLong();
                A06(A04(), (AnonymousClass5KF) list.get(0), outputStream2, atomicLong);
                return;
            }
            return;
        }
        Pair A042 = A04();
        byte[] bArr = {13, 10};
        Iterator it = this.A0C.iterator();
        boolean z = false;
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass5KF r13 = (AnonymousClass5KF) it.next();
            if (z) {
                outputStream2.write(bArr);
            }
            AnonymousClass0x2.A1L(C18260x0.A06("--", str2, "\r\n"), outputStream2);
            String replace = r13.A05.replace("\\", "\\\\").replace("\"", "\\\"");
            String str4 = r13.A04;
            if (!TextUtils.isEmpty(str4)) {
                A062 = AnonymousClass000.A0U("\"; filename=\"", str4.replace("\\", "\\\\").replace("\"", "\\\""), "\"\r\n", AnonymousClass000.A0m("Content-Disposition: form-data; name=\"", replace));
            } else {
                A062 = C18260x0.A06("Content-Disposition: form-data; name=\"", replace, "\"\r\n");
            }
            AnonymousClass0x2.A1L(A062, outputStream2);
            int i = r13.A00;
            if (i == 0) {
                AnonymousClass0x2.A1L("Content-Type: application/x-gzip\r\n", outputStream2);
                str3 = "Content-Encoding: gzip\r\n";
            } else if (i == 1) {
                str3 = "Content-Type: application/zip\r\n";
            } else {
                str3 = "Content-Type: application/octet-stream\r\n";
            }
            AnonymousClass0x2.A1L(str3, outputStream2);
            long j = r13.A02;
            if (j > 0) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Content-Range: bytes ");
                A0o2.append(j);
                AnonymousClass0x2.A1L(AnonymousClass000.A0X("-*/*\r\n", A0o2), outputStream2);
            }
            outputStream2.write(bArr);
            A06(A042, r13, outputStream2, new AtomicLong());
            z = true;
        }
        Iterator it2 = this.A0E.iterator();
        while (it2.hasNext()) {
            Pair A0D2 = AnonymousClass0x9.A0D(it2);
            String replace2 = ((String) A0D2.first).replace("\\", "\\\\").replace("\"", "\\\"");
            if (z) {
                outputStream2.write(bArr);
            }
            AnonymousClass0x2.A1L(C18260x0.A06("--", str2, "\r\n"), outputStream2);
            AnonymousClass0x2.A1L(C18260x0.A06("Content-Disposition: form-data; name=\"", replace2, "\"\r\n\r\n"), outputStream2);
            AnonymousClass0x2.A1L((String) A0D2.second, outputStream2);
            z = true;
        }
        Iterator it3 = this.A0D.iterator();
        while (it3.hasNext()) {
            Pair A0D3 = AnonymousClass0x9.A0D(it3);
            String replace3 = ((String) A0D3.first).replace("\\", "\\\\").replace("\"", "\\\"");
            if (z) {
                outputStream2.write(bArr);
            }
            AnonymousClass0x2.A1L(C18260x0.A06("--", str2, "\r\n"), outputStream2);
            AnonymousClass0x2.A1L(C18260x0.A06("Content-Disposition: form-data; name=\"", replace3, "\"\r\n\r\n"), outputStream2);
            try {
                AnonymousClass0x2.A1L((String) ((Callable) A0D3.second).call(), outputStream2);
                z = true;
            } catch (Exception e) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("failure during latePostParam call; name=");
                throw new IOException(AnonymousClass000.A0X((String) A0D3.first, A0o3), e);
            }
        }
        if (z) {
            outputStream2.write(bArr);
        }
        AnonymousClass0x2.A1L(AnonymousClass000.A0X("--\r\n", AnonymousClass000.A0m("--", str2)), outputStream2);
    }

    public void A08(String str, String str2) {
        this.A0E.add(Pair.create(str, str2));
    }

    public void A09(String str, String str2) {
        this.A0F.add(Pair.create(str, str2));
    }

    public C614230q(C56492s4 r2, C1228866f r3, C55132pq r4, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = r4;
        this.A09 = str;
        this.A0A = str2;
        this.A06 = r3;
        this.A0J = z;
        this.A0K = z2;
        this.A05 = r2;
        this.A08 = Integer.valueOf(i);
        this.A0I = z3;
        this.A0B = str3;
    }

    public static void A01(C614230q r10, File file, InputStream inputStream, String str) {
        r10.A0C.add(new AnonymousClass5KF(inputStream, str, file.getName(), 2, 0, file.length()));
    }

    public static void A02(C614230q r2, URLConnection uRLConnection, long j) {
        r2.A00 = SystemClock.uptimeMillis() - j;
        r2.A04 = A00(uRLConnection.getURL());
    }
}
