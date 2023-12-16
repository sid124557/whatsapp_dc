package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.8U6  reason: invalid class name */
public class AnonymousClass8U6 extends SSLSocket implements C179538jJ {
    public int A00;
    public long A01;
    public C140696uK A02;
    public C140776uT A03;
    public C171558Hn A04;
    public C73543fg A05;
    public AnonymousClass8P3 A06;
    public AnonymousClass8P3 A07;
    public C150547Rf A08;
    public InputStream A09;
    public OutputStream A0A;
    public String A0B;
    public Set A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public static void A02(AnonymousClass8U6 r1) {
        r1.A0E = false;
        r1.A0D = false;
        r1.A0F = false;
        r1.A0C = new HashSet();
    }

    public static void A03(AnonymousClass8U6 r5, byte[] bArr, byte b) {
        byte[] A012 = C154377d4.A01(bArr, b);
        r5.A04.A0B.A01(A012, 0, A012.length, (byte) 22);
        r5.A04.A0D.A00(A012);
    }

    public final synchronized void A0A() {
        this.A0F = true;
        C171558Hn r1 = this.A04;
        r1.A0R = null;
        r1.A0S = null;
        if (this.A0E) {
            this.A02.close();
            this.A03.close();
        }
        A09();
    }

    public final synchronized void A0C(SSLException sSLException, byte b, byte b2, boolean z) {
        IOException iOException;
        String str;
        String str2;
        if (z) {
            iOException = (IOException) AnonymousClass6C8.A0h(sSLException);
        } else {
            if (!this.A0F) {
                C141976wR r6 = C141976wR.DEBUG;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Sending Alert : type : ");
                if (b == 2) {
                    str = "FATAL";
                } else {
                    str = "WARNING";
                }
                A0o.append(str);
                A0o.append(" description : ");
                C18310x6.A1O(A0o, A00(b2));
                A0o.append(b2);
                A0o.append(") exception : ");
                if (sSLException == null) {
                    str2 = "";
                } else {
                    str2 = sSLException.toString();
                }
                String A0X = AnonymousClass000.A0X(str2, A0o);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                C151477Uy r1 = C155097eH.A00;
                String obj = stackTrace[2].toString();
                if (r1 instanceof C136266mO) {
                    Log.d(C18260x0.A06(obj, " :", A0X), sSLException);
                } else {
                    PrintStream printStream = System.err;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(r6);
                    A0o2.append(": ");
                    A0o2.append(obj);
                    printStream.println(AnonymousClass000.A0V(" : ", A0X, A0o2));
                    if (sSLException != null) {
                        sSLException.printStackTrace(printStream);
                    }
                }
                try {
                    this.A04.A0B.A01(new byte[]{b, b2}, 0, 2, (byte) 21);
                } catch (Exception e) {
                    C155097eH.A00(C141976wR.ERROR, AnonymousClass000.A0P(e, "Encountered exception. Nothing much can be done here. ", AnonymousClass001.A0o()));
                }
                A0A();
            }
            if (b == 2) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("WATLS Exception\n");
                String A0X2 = AnonymousClass000.A0X(A05(), A0o3);
                Throwable th = sSLException;
                if (sSLException != null) {
                    th = AnonymousClass6C8.A0h(sSLException);
                }
                iOException = new IOException(A0X2, th);
            }
        }
        throw iOException;
    }

    public synchronized void close() {
        if (!this.A0F) {
            if (this.A0E) {
                A0C((SSLException) null, (byte) 1, (byte) 0, false);
            } else {
                A0A();
            }
        }
    }

    public String[] getEnabledCipherSuites() {
        return new String[]{"TLS_AES_128_GCM_SHA256", "use default"};
    }

    public String[] getSupportedCipherSuites() {
        return new String[]{"TLS_AES_128_GCM_SHA256", "use default"};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = X.C141976wR.A02;
        r1 = X.AnonymousClass001.A0o();
        r1.append("Failed to normalize the IP address ");
        X.C155097eH.A00(r2, X.AnonymousClass000.A0X(r10.A0B, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        if (r7 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ea, code lost:
        A0C(new javax.net.ssl.SSLException(r0.getMessage(), X.AnonymousClass6C8.A0h(r0)), (byte) 2, (byte) 80, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fe, code lost:
        A0C(r0.ex, (byte) 2, r0.description, r0.errorTransient);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0208, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c5 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e A[Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015d A[Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016e A[Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bb A[Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01db A[Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startHandshake() {
        /*
            r10 = this;
            r3 = 2
            r4 = 0
            X.6wR r1 = X.C141976wR.INFO     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = "Start handshake."
            X.C155097eH.A00(r1, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            boolean r0 = r10.A0E     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0207
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r10.A01 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r6 = 1
            r10.A0E = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.3fg r5 = r10.A05     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r1 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6uO r0 = new X.6uO     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.A08 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.1gr r5 = (X.C28431gr) r5     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.2BZ r0 = r5.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0F = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = "SHA-256"
            r2.A0P = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0 = 32
            r2.A02 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r9 = 32
            X.7Ux r0 = new X.7Ux     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A09 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.2J2 r0 = r5.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.29p r1 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7TD r0 = new X.7TD     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0G = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r7 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7TD r0 = r7.A0G     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.29p r0 = r0.A02     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.A0H = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.29q r0 = r5.A03     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.A0I = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.2J1 r0 = r5.A02     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.29q r0 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7IZ r1 = new X.7IZ     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.A0J = r1     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            javax.net.ssl.X509TrustManager r0 = r5.A08     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.A00 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = "http/1.1"
            r7.A0O = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.29o r0 = r5.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.A0E = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.io.InputStream r2 = r10.A09     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6uO r1 = r7.A08     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6n3 r0 = new X.6n3     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.A0A = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.io.OutputStream r1 = r10.A0A     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6n5 r0 = new X.6n5     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0B = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Er r0 = new X.7Er     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0K = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.A00 = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7VN r2 = r5.A07     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r2 == 0) goto L_0x00eb
            java.lang.String r1 = r10.A0B     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.ThreadLocal r8 = r2.A00     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00e8 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00e8 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r7 = X.C18310x6.A0o(r1, r0)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r7 == 0) goto L_0x00a8
            int r0 = r7.length()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x00dd
        L_0x00a8:
            java.lang.String r0 = r10.A0B     // Catch:{ UnknownHostException -> 0x00c5 }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x00c5 }
            java.lang.String r1 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00c5 }
            monitor-enter(r2)     // Catch:{ UnknownHostException -> 0x00c5 }
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00c2 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00c2 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = X.C18310x6.A0o(r1, r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r2)     // Catch:{ UnknownHostException -> 0x00c5 }
            goto L_0x00da
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ UnknownHostException -> 0x00c5 }
            throw r0     // Catch:{ UnknownHostException -> 0x00c5 }
        L_0x00c5:
            X.6wR r2 = X.C141976wR.ERROR     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = "Failed to normalize the IP address "
            r1.append(r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = r10.A0B     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.C155097eH.A00(r2, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            goto L_0x00db
        L_0x00da:
            r7 = r0
        L_0x00db:
            if (r7 == 0) goto L_0x00eb
        L_0x00dd:
            int r0 = r7.length()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 <= 0) goto L_0x00eb
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0Q = r7     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            goto L_0x00f1
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            throw r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x00eb:
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r0 = r10.A0B     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x00f1:
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0U = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.io.InputStream r0 = r10.A09     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0M = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.io.OutputStream r0 = r10.A0A     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0N = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6uK r0 = r10.A02     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6uO r0 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A07 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8P4 r0 = r5.A06     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0L = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0b = r4     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0d = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0l = r1     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Er r0 = r2.A0K     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8P4 r2 = r0.A0L     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            int r0 = r10.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r8 = "TLS_AES_128_GCM_SHA256"
            byte[] r0 = X.C162257rX.A09(r1, r8, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            javax.net.ssl.SSLSession r7 = r2.getSession(r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8P3 r7 = (X.AnonymousClass8P3) r7     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r7 != 0) goto L_0x013b
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8P4 r2 = r0.A0L     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            int r0 = r10.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8P3 r7 = new X.8P3     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r7.<init>(r2, r1, r8, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x013b:
            r10.A06 = r7     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.A0C = r7     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r10.A07 = r7     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.A0j = r1     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Er r0 = r0.A0K     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7TD r0 = r0.A0G     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.A00()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7TD r1 = r2.A0G     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Ij r0 = r1.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0160
            r1.A00()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x0160:
            X.7Ij r0 = r1.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r0 = r0.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0i = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7TD r1 = r2.A0G     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Ij r0 = r1.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0171
            r1.A00()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x0171:
            X.7Ij r0 = r1.A01     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0h = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.lang.String r1 = r2.A0P     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7aJ r0 = new X.7aJ     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0D = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r2 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0e = r4     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0Z = r4     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            boolean r0 = r5.A09     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0a = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0R = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r2.A0S = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            r2.A06 = r0     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r0 = A04(r2)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r5 = X.C154377d4.A01(r0, r6)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r0 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Uz r2 = r0.A0B     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            int r1 = r5.length     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0 = 22
            r2.A01(r5, r4, r1, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r1 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            boolean r0 = r1.A0a     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01db
            X.8P3 r0 = r1.A0C     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            com.whatsapp.net.tls13.WtCachedPsk r0 = r0.A03     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01db
            boolean r0 = r1.A0d     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01ce
            X.7Uz r2 = r1.A0B     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1[r4] = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0 = 20
            r2.A01(r1, r4, r6, r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.8Hn r1 = r10.A04     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.A0e = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
        L_0x01ce:
            r1.A0Y = r6     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.7Rf r1 = r10.A08     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6mq r0 = new X.6mq     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.A00(r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            return
        L_0x01db:
            X.7Rf r1 = r10.A08     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            X.6mp r0 = new X.6mp     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r1.A00(r0)     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            r10.A06()     // Catch:{ IOException -> 0x0208, 6zV -> 0x01fd, Exception -> 0x01e9 }
            return
        L_0x01e9:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r0 = X.AnonymousClass6C8.A0h(r0)
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r2, r0)
            r0 = 80
            r10.A0C(r1, r3, r0, r4)
            return
        L_0x01fd:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            r10.A0C(r0, r3, r2, r1)
        L_0x0207:
            return
        L_0x0208:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8U6.startHandshake():void");
    }

    public static String A00(byte b) {
        if (b == 0) {
            return "close_notify";
        }
        if (b == 10) {
            return "unexpected_message";
        }
        if (b == 20) {
            return "bad_record_mac";
        }
        if (b == 22) {
            return "record_overflow";
        }
        if (b == 40) {
            return "handshake_failure";
        }
        if (b == 80) {
            return "internal_error";
        }
        if (b == 86) {
            return "inappropriate_fallback";
        }
        if (b == 90) {
            return "user_cancelled";
        }
        if (b == 120) {
            return "no_application_protocol";
        }
        if (b == 70) {
            return "protocol_version";
        }
        if (b == 71) {
            return "insufficient_security";
        }
        if (b == 109) {
            return "missing_extension";
        }
        if (b == 110) {
            return "unsupported_version";
        }
        if (b == 112) {
            return "unrecognized_name";
        }
        if (b == 113) {
            return "bad_certificate_status_response";
        }
        if (b == 115) {
            return "unknown_psk_identity";
        }
        if (b == 116) {
            return "certificate_required";
        }
        switch (b) {
            case 42:
                return "bad_certificate";
            case 43:
                return "unsupported_certificate";
            case 44:
                return "certificate_revoked";
            case 45:
                return "certificate_expired";
            case 46:
                return "certificate_unknown";
            case 47:
                return "illegal_parameter";
            case 48:
                return "unknown_ca";
            case 49:
                return "access_denied";
            case 50:
                return "decode_error";
            case 51:
                return "decrypt_error";
            default:
                return "invalid description";
        }
    }

    public static void A01(C158537k8 r4, byte[] bArr, short s) {
        AnonymousClass7SO r3 = new AnonymousClass7SO(bArr, s);
        ArrayList arrayList = r4.A02;
        int i = r4.A00;
        arrayList.add(i, r3);
        r4.A01 += r3.A01.length + 4;
        r4.A00 = i + 1;
    }

    public static byte[] A04(C171558Hn r11) {
        ByteBuffer allocate;
        long currentTimeMillis;
        short s;
        byte[] bArr;
        if (r11 != null) {
            byte[] bArr2 = r11.A0j;
            if (bArr2 == null || bArr2.length != 32) {
                throw C143806zV.A01("Client random is not correctly initialized.", (byte) 80);
            } else if (r11.A0l != null) {
                C158537k8 r5 = new C158537k8();
                try {
                    String str = r11.A0O;
                    if (str != null) {
                        if (!str.isEmpty()) {
                            byte[] bytes = str.getBytes(DefaultCrypto.UTF_8);
                            int length = bytes.length;
                            ByteBuffer allocate2 = ByteBuffer.allocate(length + 3);
                            C162257rX.A05(length + 1, allocate2);
                            allocate2.put((byte) length);
                            allocate2.put(bytes);
                            A01(r5, allocate2.array(), 16);
                        }
                    }
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.putShort(2);
                    allocate3.putShort(1027);
                    A01(r5, allocate3.array(), 13);
                    ByteBuffer allocate4 = ByteBuffer.allocate(4);
                    allocate4.putShort(2);
                    allocate4.putShort(29);
                    A01(r5, allocate4.array(), 10);
                    ByteBuffer allocate5 = ByteBuffer.allocate(2);
                    allocate5.put((byte) 1);
                    allocate5.put(r11.A00);
                    A01(r5, allocate5.array(), 45);
                    ByteBuffer allocate6 = ByteBuffer.allocate(5);
                    allocate6.put((byte) 4);
                    allocate6.putShort(772);
                    allocate6.putShort(-1254);
                    A01(r5, allocate6.array(), 43);
                    ByteBuffer allocate7 = ByteBuffer.allocate(4);
                    allocate7.putShort(2);
                    allocate7.putShort(1027);
                    A01(r5, allocate7.array(), 50);
                    if (r11.A0a && r11.A0C.A03 != null && !r11.A0c) {
                        A01(r5, new byte[0], 42);
                    }
                    try {
                        byte[] bytes2 = r11.A0Q.getBytes(DefaultCrypto.UTF_8);
                        int length2 = bytes2.length;
                        ByteBuffer allocate8 = ByteBuffer.allocate(length2 + 5);
                        C162257rX.A05(length2 + 3, allocate8);
                        allocate8.put(C162257rX.A07(length2));
                        allocate8.put(bytes2);
                        A01(r5, allocate8.array(), 0);
                        if (r11.A0c && (bArr = r11.A0k) != null) {
                            ByteBuffer allocate9 = ByteBuffer.allocate(bArr.length + 2);
                            C162257rX.A05(bArr.length, allocate9);
                            allocate9.put(bArr);
                            A01(r5, allocate9.array(), 44);
                        }
                        if (!r11.A0c || (s = r11.A0W) == 29) {
                            ByteBuffer allocate10 = ByteBuffer.allocate(38);
                            C162257rX.A05(36, allocate10);
                            allocate10.putShort(29);
                            C162257rX.A05(32, allocate10);
                            allocate10.put(r11.A0i);
                            A01(r5, allocate10.array(), 51);
                            ByteBuffer allocate11 = ByteBuffer.allocate(r5.A01);
                            Iterator it = r5.A02.iterator();
                            while (it.hasNext()) {
                                AnonymousClass7SO r52 = (AnonymousClass7SO) it.next();
                                byte[] bArr3 = r52.A01;
                                int length3 = bArr3.length;
                                ByteBuffer allocate12 = ByteBuffer.allocate(length3 + 4);
                                allocate12.putShort(r52.A00);
                                C162257rX.A05(length3, allocate12);
                                allocate12.put(bArr3);
                                allocate11.put(allocate12.array());
                            }
                            byte[] array = allocate11.array();
                            WtCachedPsk wtCachedPsk = r11.A0C.A03;
                            if (wtCachedPsk == null) {
                                allocate = ByteBuffer.allocate(0);
                            } else {
                                byte[] bArr4 = wtCachedPsk.ticket;
                                allocate = ByteBuffer.allocate(bArr4.length + 6 + 6 + r11.A02 + 1 + 2);
                                byte[] bArr5 = r11.A0C.A03.ticket;
                                allocate.putShort(41);
                                C162257rX.A05(allocate.capacity() - 4, allocate);
                                int length4 = bArr5.length;
                                C162257rX.A05(length4 + 6, allocate);
                                C162257rX.A05(length4, allocate);
                                allocate.put(bArr5);
                                WtCachedPsk wtCachedPsk2 = r11.A0C.A03;
                                if (wtCachedPsk2.useTestTime) {
                                    currentTimeMillis = 3600000;
                                } else {
                                    currentTimeMillis = System.currentTimeMillis();
                                }
                                long j = currentTimeMillis - wtCachedPsk2.ticketIssuedTime;
                                if (j < 0) {
                                    j = 0;
                                }
                                long j2 = (j + wtCachedPsk2.ticketAgeAdd) % 4294967296L;
                                if (j2 < 0) {
                                    j2 += 4294967296L;
                                }
                                if (j2 < 0 || j2 >= 4294967296L) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Invalid argument. The supplied long value = ");
                                    A0o.append(j2);
                                    throw C143806zV.A01(AnonymousClass000.A0X(" does not  fit in 4 bytes.", A0o), (byte) 80);
                                }
                                allocate.put(new byte[]{(byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) (j2 & 255))});
                            }
                            int length5 = array.length + allocate.capacity();
                            ByteBuffer allocate13 = ByteBuffer.allocate(r11.A0l.length + 35 + 2 + 2 + 1 + 1 + 2 + length5);
                            allocate13.putShort(771);
                            allocate13.put(r11.A0j);
                            allocate13.put((byte) r11.A0l.length);
                            allocate13.put(r11.A0l);
                            allocate13.putShort(2);
                            allocate13.putShort(4865);
                            allocate13.put((byte) 1);
                            allocate13.put((byte) 0);
                            C162257rX.A05(length5, allocate13);
                            allocate13.put(array);
                            if (r11.A0C.A03 != null) {
                                try {
                                    MessageDigest messageDigest = (MessageDigest) r11.A0D.A00.clone();
                                    byte[] copyOfRange = Arrays.copyOfRange(allocate13.array(), 0, allocate13.position());
                                    byte[] copyOfRange2 = Arrays.copyOfRange(allocate.array(), 0, allocate.position());
                                    messageDigest.update((byte) 1);
                                    messageDigest.update(C162257rX.A07(allocate13.capacity()));
                                    messageDigest.update(copyOfRange);
                                    messageDigest.update(copyOfRange2);
                                    byte[] digest = messageDigest.digest();
                                    int i = r11.A02 + 1;
                                    ByteBuffer allocate14 = ByteBuffer.allocate(i + 2);
                                    C162257rX.A05(i, allocate14);
                                    try {
                                        byte[] A0B2 = C162257rX.A0B(r11.A0P, C151467Ux.A00(r11.A09, r11, "finished", new byte[0], C151467Ux.A00(r11.A09, r11, "res binder", MessageDigest.getInstance(r11.A0P).digest(), r11.A09.A01(new byte[r11.A02], r11.A0C.A03.pskVal))), digest);
                                        allocate14.put((byte) A0B2.length);
                                        allocate14.put(A0B2);
                                        allocate.put(allocate14.array());
                                        allocate13.put(allocate.array());
                                    } catch (NoSuchAlgorithmException e) {
                                        throw C143806zV.A04(e);
                                    }
                                } catch (CloneNotSupportedException e2) {
                                    throw C143806zV.A04(e2);
                                }
                            }
                            return allocate13.array();
                        }
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Must use key group sent by HelloRetryRequest: ");
                        A0o2.append(s);
                        throw C143806zV.A01(AnonymousClass000.A0Y(" client key group: ", A0o2, 29), (byte) 80);
                    } catch (UnsupportedEncodingException e3) {
                        throw C143806zV.A03(e3);
                    }
                } catch (UnsupportedEncodingException e4) {
                    throw C143806zV.A03(e4);
                }
            } else {
                throw C143806zV.A01("Legacy session id is not correctly initialized.", (byte) 80);
            }
        } else {
            throw C143806zV.A01("Illegal argument. Context cannot be null.", (byte) 80);
        }
    }

    public void A06() {
        AnonymousClass7EH A012;
        while (true) {
            boolean equals = this.A08.A00.A00.equals(C1462579j.A08);
            C171558Hn r0 = this.A04;
            if (!equals) {
                C152927aO r2 = r0.A0A;
                synchronized (r2) {
                    A012 = r2.A01();
                }
                if (!(A012 instanceof C136606mw)) {
                    if (A012 instanceof C136486mk) {
                        A0B(A012);
                        throw AnonymousClass000.A0L();
                    }
                    this.A08.A00(A012);
                    if (A012 instanceof C136586mu) {
                        A03(this, A04(this.A04), (byte) 1);
                    }
                }
            } else {
                if (!r0.A0b) {
                    A0C(new SSLException("Server must either choose a PSK or send certificates."), (byte) 2, (byte) 116, false);
                }
                if (this.A04.A0f) {
                    A03(this, new byte[0], (byte) 5);
                }
                C171558Hn r1 = this.A04;
                if (r1.A0d && !r1.A0e) {
                    r1.A0B.A01(new byte[]{1}, 0, 1, (byte) 20);
                }
                C171558Hn r02 = this.A04;
                C171548Hm r6 = new C171548Hm();
                r6.A00(AnonymousClass6CA.A0h("client_hs_key", r02.A0U), AnonymousClass6CA.A0h("client_hs_iv", this.A04.A0U));
                C171558Hn r22 = this.A04;
                r22.A0B = new C136686n6(r6, r22.A0N);
                if (r22.A0X) {
                    A03(this, new byte[4], (byte) 11);
                }
                C171558Hn r62 = this.A04;
                if (r62 != null) {
                    byte[] A013 = r62.A0D.A01();
                    byte[] A014 = C154377d4.A01(C162257rX.A0B(r62.A0P, AnonymousClass6CA.A0h("client_finished", r62.A0U), A013), (byte) 20);
                    this.A04.A0B.A01(A014, 0, A014.length, (byte) 22);
                    this.A08.A00(new C136526mo(A014));
                    long currentTimeMillis = System.currentTimeMillis();
                    this.A0D = true;
                    C141976wR r4 = C141976wR.INFO;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Handshake complete : session_resumed ");
                    C171558Hn r12 = this.A04;
                    A0o.append(r12.A0g);
                    A0o.append(" early_data_sent ");
                    A0o.append(r12.A0Z);
                    A0o.append(" early_data_accepted ");
                    A0o.append(r12.A0f);
                    A0o.append(" client_cert_requested ");
                    A0o.append(r12.A0X);
                    A0o.append(" time_ms ");
                    C155097eH.A00(r4, AnonymousClass001.A0k(A0o, currentTimeMillis - this.A01));
                    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A07);
                    for (HandshakeCompletedListener handshakeCompleted : this.A0C) {
                        handshakeCompleted.handshakeCompleted(handshakeCompletedEvent);
                    }
                    return;
                }
                throw C143806zV.A00("Illegal argument. Context cannot be null.");
            }
        }
    }

    public void A07() {
        C155097eH.A00 = new C136266mO((C28431gr) this.A05);
        A08();
        this.A02 = new C140696uK(this);
        this.A03 = new C140776uT(this);
        C171558Hn r1 = new C171558Hn();
        this.A04 = r1;
        try {
            this.A08 = new C150547Rf(r1);
        } catch (C143806zV e) {
            throw new IOException(e);
        }
    }

    public final void A0B(AnonymousClass7EH r7) {
        byte[] bArr = (byte[]) r7.A00;
        C141976wR r4 = C141976wR.DEBUG;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Received Alert: Level ");
        A0o.append(bArr[0]);
        A0o.append(" Description ");
        byte b = bArr[1];
        C18310x6.A1O(A0o, A00(b));
        A0o.append(b);
        C155097eH.A00(r4, AnonymousClass000.A0e(A0o));
        A0A();
        byte b2 = bArr[1];
        if (b2 == 0 || b2 == 50) {
            throw new IOException(new SSLException(C18260x0.A05("Received alert ", b2)));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WATLS Exception\n");
        throw new IOException(AnonymousClass000.A0X(A05(), A0o2), new SSLException(C18260x0.A05("Received alert ", b2)));
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0C.add(handshakeCompletedListener);
    }

    public SocketChannel getChannel() {
        throw AnonymousClass0x9.A0i("Channels are not supported by WtSocket.");
    }

    public boolean getEnableSessionCreation() {
        return true;
    }

    public String[] getEnabledProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public SSLSession getHandshakeSession() {
        return this.A06;
    }

    public InputStream getInputStream() {
        C140696uK r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass002.A0C("Input stream is closed.");
    }

    public boolean getNeedClientAuth() {
        return this.A05.getNeedClientAuth();
    }

    public OutputStream getOutputStream() {
        C140776uT r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass002.A0C("Output stream is closed.");
    }

    public SSLParameters getSSLParameters() {
        return this.A05;
    }

    public SSLSession getSession() {
        return this.A07;
    }

    public String[] getSupportedProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public boolean getUseClientMode() {
        return true;
    }

    public boolean getWantClientAuth() {
        return this.A05.getWantClientAuth();
    }

    public boolean isClosed() {
        return this.A0F;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0C.remove(handshakeCompletedListener);
    }

    public void setEnableSessionCreation(boolean z) {
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A05.setCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.A05.setProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.A05.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof C73543fg) {
            this.A05 = (C73543fg) sSLParameters;
        }
    }

    public void setUseClientMode(boolean z) {
    }

    public void setWantClientAuth(boolean z) {
        this.A05.setWantClientAuth(z);
    }

    public AnonymousClass8U6(C73543fg r2, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        A02(this);
        this.A05 = r2;
        this.A0B = null;
        this.A00 = i;
        A07();
    }

    public final String A05() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("host=");
        C171558Hn r2 = this.A04;
        A0o.append(r2.A0Q);
        A0o.append(" hrr=");
        A0o.append(r2.A0c);
        A0o.append(" r=");
        A0o.append(r2.A0g);
        A0o.append(" ed=");
        A0o.append(r2.A0Z);
        A0o.append(" eda=");
        A0o.append(r2.A0f);
        A0o.append(" s=");
        return AnonymousClass000.A0X(this.A08.A00.A00.A03, A0o);
    }

    public void A08() {
        this.A09 = super.getInputStream();
        this.A0A = super.getOutputStream();
    }

    public void A09() {
        super.close();
        this.A09.close();
        this.A0A.close();
    }

    public AnonymousClass8U6(C73543fg r1, String str, int i) {
        super(str, i);
        A02(this);
        this.A05 = r1;
        this.A0B = str;
        this.A00 = i;
        A07();
    }

    public AnonymousClass8U6(C73543fg r2) {
        A02(this);
        this.A05 = r2;
        this.A0B = null;
        this.A00 = -1;
        A07();
    }

    public AnonymousClass8U6(C73543fg r1, String str, InetAddress inetAddress, int i, int i2) {
        super(str, i, inetAddress, i2);
        A02(this);
        this.A05 = r1;
        this.A0B = str;
        this.A00 = i;
        A07();
    }

    public AnonymousClass8U6(C73543fg r2, InetAddress inetAddress, InetAddress inetAddress2, int i, int i2) {
        super(inetAddress, i, inetAddress2, i2);
        A02(this);
        this.A05 = r2;
        this.A0B = inetAddress.getHostName();
        this.A00 = i;
        A07();
    }

    public AnonymousClass8U6() {
        A02(this);
    }
}
