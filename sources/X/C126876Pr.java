package X;

import android.net.Uri;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.regex.Pattern;

/* renamed from: X.6Pr  reason: invalid class name and case insensitive filesystem */
public class C126876Pr extends C1691088a implements C187658xb {
    public static final Pattern A0D = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C157677ih A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public byte[] A09;
    public final AnonymousClass7GD A0A;
    public final AnonymousClass7GD A0B;
    public final String A0C;

    public C126876Pr(AnonymousClass7GD r2, String str) {
        super(true);
        this.A0C = str;
        this.A0A = r2;
        this.A0B = new AnonymousClass7GD();
    }

    public void close() {
        try {
            InputStream inputStream = this.A06;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A06 = null;
            A04();
            if (this.A08) {
                this.A08 = false;
                A00();
            }
        } catch (IOException e) {
            throw new C140596uA(this.A05, e, 3);
        } catch (Throwable th) {
            this.A06 = null;
            A04();
            if (this.A08) {
                this.A08 = false;
                A00();
            }
            throw th;
        }
    }

    public final void A04() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C159307lc.A02("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A07 = null;
        }
    }

    public Uri BE6() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d2 A[Catch:{ IOException -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bfx(X.C157677ih r24) {
        /*
            r23 = this;
            java.lang.String r12 = "Unable to connect"
            r9 = r23
            r10 = r24
            r9.A05 = r10
            r7 = 0
            r9.A01 = r7
            r9.A02 = r7
            r9.A01()
            r11 = 1
            android.net.Uri r0 = r10.A04     // Catch:{ IOException -> 0x023b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x023b }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x023b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x023b }
            int r0 = r10.A01     // Catch:{ IOException -> 0x023b }
            r18 = r0
            byte[] r13 = r10.A07     // Catch:{ IOException -> 0x023b }
            long r5 = r10.A03     // Catch:{ IOException -> 0x023b }
            long r3 = r10.A02     // Catch:{ IOException -> 0x023b }
            r17 = 1
            int r0 = r10.A00     // Catch:{ IOException -> 0x023b }
            r0 = r0 & 1
            if (r0 == r11) goto L_0x0031
            r17 = 0
        L_0x0031:
            java.util.Map r15 = r10.A06     // Catch:{ IOException -> 0x023b }
            java.net.URLConnection r2 = r1.openConnection()     // Catch:{ IOException -> 0x023b }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x023b }
            r0 = 8000(0x1f40, float:1.121E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException -> 0x023b }
            r2.setReadTimeout(r0)     // Catch:{ IOException -> 0x023b }
            java.util.HashMap r14 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x023b }
            X.7GD r1 = r9.A0A     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x005a
            monitor-enter(r1)     // Catch:{ IOException -> 0x023b }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0056
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0238 }
            java.util.Map r0 = X.AnonymousClass6C9.A0l(r0)     // Catch:{ all -> 0x0238 }
            r1.A00 = r0     // Catch:{ all -> 0x0238 }
        L_0x0056:
            monitor-exit(r1)     // Catch:{ IOException -> 0x023b }
            r14.putAll(r0)     // Catch:{ IOException -> 0x023b }
        L_0x005a:
            X.7GD r1 = r9.A0B     // Catch:{ IOException -> 0x023b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x023b }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0069
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0238 }
            java.util.Map r0 = X.AnonymousClass6C9.A0l(r0)     // Catch:{ all -> 0x0238 }
            r1.A00 = r0     // Catch:{ all -> 0x0238 }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ IOException -> 0x023b }
            r14.putAll(r0)     // Catch:{ IOException -> 0x023b }
            r14.putAll(r15)     // Catch:{ IOException -> 0x023b }
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r14)     // Catch:{ IOException -> 0x023b }
        L_0x0074:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x023b }
            if (r0 == 0) goto L_0x008a
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r14)     // Catch:{ IOException -> 0x023b }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ IOException -> 0x023b }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)     // Catch:{ IOException -> 0x023b }
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x023b }
            goto L_0x0074
        L_0x008a:
            r21 = 0
            r19 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0096
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00be
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x023b }
            java.lang.String r0 = "bytes="
            r1.append(r0)     // Catch:{ IOException -> 0x023b }
            r1.append(r5)     // Catch:{ IOException -> 0x023b }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x023b }
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException -> 0x023b }
            long r0 = r5 + r3
            r15 = 1
            long r0 = r0 - r15
            java.lang.String r1 = X.AnonymousClass001.A0k(r14, r0)     // Catch:{ IOException -> 0x023b }
        L_0x00b9:
            java.lang.String r0 = "Range"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x023b }
        L_0x00be:
            java.lang.String r1 = r9.A0C     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x00c7
            java.lang.String r0 = "User-Agent"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x023b }
        L_0x00c7:
            if (r17 == 0) goto L_0x00ca
            goto L_0x00cd
        L_0x00ca:
            java.lang.String r1 = "identity"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r1 = "gzip"
        L_0x00cf:
            java.lang.String r0 = "Accept-Encoding"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x023b }
            r2.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x023b }
            boolean r0 = X.AnonymousClass000.A1W(r13)
            r2.setDoOutput(r0)     // Catch:{ IOException -> 0x023b }
            r0 = r18
            if (r0 == r11) goto L_0x00e5
            java.lang.String r0 = "POST"
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r0 = "GET"
        L_0x00e7:
            r2.setRequestMethod(r0)     // Catch:{ IOException -> 0x023b }
            if (r13 == 0) goto L_0x00fe
            int r0 = r13.length     // Catch:{ IOException -> 0x023b }
            r2.setFixedLengthStreamingMode(r0)     // Catch:{ IOException -> 0x023b }
            r2.connect()     // Catch:{ IOException -> 0x023b }
            java.io.OutputStream r0 = r2.getOutputStream()     // Catch:{ IOException -> 0x023b }
            r0.write(r13)     // Catch:{ IOException -> 0x023b }
            r0.close()     // Catch:{ IOException -> 0x023b }
            goto L_0x0101
        L_0x00fe:
            r2.connect()     // Catch:{ IOException -> 0x023b }
        L_0x0101:
            r9.A07 = r2     // Catch:{ IOException -> 0x023b }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x022e }
            r9.A00 = r0     // Catch:{ IOException -> 0x022e }
            java.lang.String r13 = r2.getResponseMessage()     // Catch:{ IOException -> 0x022e }
            int r12 = r9.A00
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 < r1) goto L_0x01eb
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x01eb
            r2.getContentType()
            int r0 = r9.A00
            if (r0 != r1) goto L_0x0123
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            r7 = r5
        L_0x0123:
            r9.A04 = r7
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = r2.getHeaderField(r0)
            java.lang.String r0 = "gzip"
            boolean r18 = r0.equalsIgnoreCase(r1)
            if (r18 != 0) goto L_0x01c8
            r5 = -1
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "Content-Length"
            java.lang.String r15 = r2.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r13 = "]"
            java.lang.String r12 = "DefaultHttpDataSource"
            if (r0 != 0) goto L_0x015b
            long r3 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x014e }
            goto L_0x015d
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected Content-Length ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r15, r13, r1)
            android.util.Log.e(r12, r0)
        L_0x015b:
            r3 = -1
        L_0x015d:
            java.lang.String r0 = "Content-Range"
            java.lang.String r8 = r2.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01bd
            java.util.regex.Pattern r0 = A0D
            java.util.regex.Matcher r7 = r0.matcher(r8)
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x01bd
            r0 = 2
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r7, r0)     // Catch:{ NumberFormatException -> 0x01ae }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01ae }
            java.lang.String r7 = X.AnonymousClass6C8.A0f(r7, r11)     // Catch:{ NumberFormatException -> 0x01ae }
            long r16 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x01ae }
            long r0 = r0 - r16
            r16 = 1
            long r0 = r0 + r16
            int r7 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r7 >= 0) goto L_0x0191
            goto L_0x01bc
        L_0x0191:
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x01bd
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x01ae }
            java.lang.String r7 = "Inconsistent headers ["
            r14.append(r7)     // Catch:{ NumberFormatException -> 0x01ae }
            r14.append(r15)     // Catch:{ NumberFormatException -> 0x01ae }
            java.lang.String r7 = "] ["
            r14.append(r7)     // Catch:{ NumberFormatException -> 0x01ae }
            X.AnonymousClass6C7.A1F(r8, r13, r12, r14)     // Catch:{ NumberFormatException -> 0x01ae }
            long r3 = java.lang.Math.max(r3, r0)     // Catch:{ NumberFormatException -> 0x01ae }
            goto L_0x01bd
        L_0x01ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected Content-Range ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r8, r13, r1)
            android.util.Log.e(r12, r0)
            goto L_0x01bd
        L_0x01bc:
            r3 = r0
        L_0x01bd:
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01c5
            long r0 = r9.A04
            long r5 = r3 - r0
        L_0x01c5:
            r9.A03 = r5
            goto L_0x01ca
        L_0x01c8:
            r9.A03 = r3
        L_0x01ca:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x01e1 }
            r9.A06 = r1     // Catch:{ IOException -> 0x01e1 }
            if (r18 == 0) goto L_0x01d9
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01e1 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e1 }
            r9.A06 = r0     // Catch:{ IOException -> 0x01e1 }
        L_0x01d9:
            r9.A08 = r11
            r9.A03(r10)
            long r0 = r9.A03
            return r0
        L_0x01e1:
            r0 = move-exception
            r9.A04()
            X.6uA r3 = new X.6uA
            r3.<init>((X.C157677ih) r10, (java.io.IOException) r0, (int) r11)
            throw r3
        L_0x01eb:
            java.util.Map r14 = r2.getHeaderFields()
            java.io.InputStream r4 = r2.getErrorStream()
            if (r4 == 0) goto L_0x020e
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x0211 }
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException -> 0x0211 }
        L_0x01fd:
            int r1 = r4.read(r3)     // Catch:{ IOException -> 0x0211 }
            r0 = -1
            if (r1 == r0) goto L_0x0209
            r0 = 0
            r2.write(r3, r0, r1)     // Catch:{ IOException -> 0x0211 }
            goto L_0x01fd
        L_0x0209:
            byte[] r15 = r2.toByteArray()     // Catch:{ IOException -> 0x0211 }
            goto L_0x0213
        L_0x020e:
            byte[] r15 = X.C162387ry.A0A     // Catch:{ IOException -> 0x0211 }
            goto L_0x0213
        L_0x0211:
            byte[] r15 = X.C162387ry.A0A
        L_0x0213:
            r9.A04()
            int r1 = r9.A00
            X.6Pt r3 = new X.6Pt
            r11 = r3
            r12 = r10
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x022d
            X.6tw r0 = new X.6tw
            r0.<init>()
            r3.initCause(r0)
        L_0x022d:
            throw r3
        L_0x022e:
            r0 = move-exception
            r9.A04()
            X.6uA r3 = new X.6uA
            r3.<init>((X.C157677ih) r10, (java.io.IOException) r0, (java.lang.String) r12)
            throw r3
        L_0x0238:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x023b }
            throw r0     // Catch:{ IOException -> 0x023b }
        L_0x023b:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0254
            java.lang.String r1 = X.AnonymousClass0x9.A0z(r0)
            java.lang.String r0 = "cleartext http traffic.*not permitted.*"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x0254
            X.6Ps r3 = new X.6Ps
            r3.<init>(r10, r2)
            throw r3
        L_0x0254:
            X.6uA r3 = new X.6uA
            r3.<init>((X.C157677ih) r10, (java.io.IOException) r2, (java.lang.String) r12)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126876Pr.Bfx(X.7ih):long");
    }

    public int read(byte[] bArr, int i, int i2) {
        Throwable th;
        try {
            if (this.A02 != this.A04) {
                if (this.A09 == null) {
                    this.A09 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                }
                while (true) {
                    long j = this.A02;
                    long j2 = this.A04;
                    if (j == j2) {
                        break;
                    }
                    byte[] bArr2 = this.A09;
                    int A032 = AnonymousClass6CA.A03(this.A06, bArr2, AnonymousClass6CA.A02(j2 - j, (long) bArr2.length));
                    if (!Thread.currentThread().isInterrupted()) {
                        if (A032 == -1) {
                            th = AnonymousClass6CA.A0M();
                            break;
                        }
                        this.A02 += (long) A032;
                        A02(A032);
                    } else {
                        th = new InterruptedIOException();
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.A03;
            if (j3 != -1) {
                long j4 = j3 - this.A01;
                if (j4 == 0) {
                    return -1;
                }
                i2 = AnonymousClass6CA.A02((long) i2, j4);
            }
            int read = this.A06.read(bArr, i, i2);
            if (read != -1) {
                this.A01 += (long) read;
                A02(read);
                return read;
            } else if (this.A03 == -1) {
                return -1;
            } else {
                th = AnonymousClass6CA.A0M();
                throw th;
            }
        } catch (IOException e) {
            throw new C140596uA(this.A05, e, 2);
        }
    }

    @Deprecated
    public C126876Pr() {
        this((AnonymousClass7GD) null, (String) null);
    }
}
