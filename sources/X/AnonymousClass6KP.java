package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.6KP  reason: invalid class name */
public class AnonymousClass6KP extends C1675681o implements C187448xE {
    public static final AtomicReference A0E = new AtomicReference();
    public static final Pattern A0F = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C161387pX A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass7FD A0B;
    public final AnonymousClass7FD A0C;
    public final String A0D;

    public AnonymousClass6KP(String str, int i, int i2) {
        this((AnonymousClass7FD) null, (C184768sU) null, str, i, i2);
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
            throw new AnonymousClass6KR(this.A05, e, 3);
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
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A07 = null;
        }
    }

    public Map BCF() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public Uri BE6() {
        HttpURLConnection httpURLConnection = this.A07;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bfw(X.C161387pX r20) {
        /*
            r19 = this;
            java.lang.String r11 = "Unable to connect to "
            r9 = r19
            r4 = r20
            r9.A05 = r4
            r7 = 0
            r9.A01 = r7
            r9.A02 = r7
            r9.A01()
            X.7ni r0 = r4.A05
            java.util.Map r0 = r0.A0N
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r0)
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            r3.getClass()
            r1.getClass()
            X.7FD r2 = r9.A0C
            monitor-enter(r2)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x003e }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x003e }
            r0.put(r3, r1)     // Catch:{ all -> 0x003e }
            monitor-exit(r2)
            goto L_0x0019
        L_0x003e:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0041:
            r10 = 1
            android.net.Uri r13 = r4.A04     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x0268 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0268 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0268 }
            byte[] r14 = r4.A08     // Catch:{ IOException -> 0x0268 }
            long r2 = r4.A03     // Catch:{ IOException -> 0x0268 }
            long r5 = r4.A02     // Catch:{ IOException -> 0x0268 }
            r18 = 1
            int r0 = r4.A00     // Catch:{ IOException -> 0x0268 }
            r12 = r0 & 1
            if (r12 == r10) goto L_0x005d
            r18 = 0
        L_0x005d:
            java.lang.String r0 = r1.getHost()     // Catch:{ IOException -> 0x0268 }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ IOException -> 0x0268 }
            boolean r0 = r0.isLoopbackAddress()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x0087
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x0268 }
            java.net.URLConnection r1 = r1.openConnection(r0)     // Catch:{ IOException -> 0x0268 }
        L_0x0071:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0268 }
            r9.A07 = r1     // Catch:{ IOException -> 0x0268 }
            int r0 = r9.A09     // Catch:{ IOException -> 0x0268 }
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r1 = r9.A07     // Catch:{ IOException -> 0x0268 }
            int r0 = r9.A0A     // Catch:{ IOException -> 0x0268 }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x0268 }
            X.7FD r1 = r9.A0B     // Catch:{ IOException -> 0x0268 }
            if (r1 == 0) goto L_0x00b5
            monitor-enter(r1)     // Catch:{ IOException -> 0x0268 }
            goto L_0x008c
        L_0x0087:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0268 }
            goto L_0x0071
        L_0x008c:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0265 }
            if (r0 != 0) goto L_0x0098
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0265 }
            java.util.Map r0 = X.AnonymousClass6C9.A0l(r0)     // Catch:{ all -> 0x0265 }
            r1.A00 = r0     // Catch:{ all -> 0x0265 }
        L_0x0098:
            monitor-exit(r1)     // Catch:{ IOException -> 0x0268 }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException -> 0x0268 }
        L_0x009d:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x00b5
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r16)     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r15 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)     // Catch:{ IOException -> 0x0268 }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0268 }
            goto L_0x009d
        L_0x00b5:
            X.7FD r1 = r9.A0C     // Catch:{ IOException -> 0x0268 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0268 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0265 }
            if (r0 != 0) goto L_0x00c4
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0265 }
            java.util.Map r0 = X.AnonymousClass6C9.A0l(r0)     // Catch:{ all -> 0x0265 }
            r1.A00 = r0     // Catch:{ all -> 0x0265 }
        L_0x00c4:
            monitor-exit(r1)     // Catch:{ IOException -> 0x0268 }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException -> 0x0268 }
        L_0x00c9:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x00e1
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r16)     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r15 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)     // Catch:{ IOException -> 0x0268 }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0268 }
            goto L_0x00c9
        L_0x00e1:
            r16 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00eb
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0116
        L_0x00eb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "bytes="
            r1.append(r0)     // Catch:{ IOException -> 0x0268 }
            r1.append(r2)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "-"
            java.lang.String r15 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0268 }
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x010f
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0l(r15)     // Catch:{ IOException -> 0x0268 }
            long r0 = r2 + r5
            r16 = 1
            long r0 = r0 - r16
            java.lang.String r15 = X.AnonymousClass001.A0k(r15, r0)     // Catch:{ IOException -> 0x0268 }
        L_0x010f:
            java.net.HttpURLConnection r1 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "Range"
            r1.setRequestProperty(r0, r15)     // Catch:{ IOException -> 0x0268 }
        L_0x0116:
            java.net.HttpURLConnection r15 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r9.A0D     // Catch:{ IOException -> 0x0268 }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0268 }
            if (r18 != 0) goto L_0x012a
            java.net.HttpURLConnection r15 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0268 }
        L_0x012a:
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            r0.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r1 = r9.A07     // Catch:{ IOException -> 0x0268 }
            boolean r0 = X.AnonymousClass000.A1W(r14)
            r1.setDoOutput(r0)     // Catch:{ IOException -> 0x0268 }
            if (r14 == 0) goto L_0x015b
            java.net.HttpURLConnection r1 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ IOException -> 0x0268 }
            int r1 = r14.length     // Catch:{ IOException -> 0x0268 }
            if (r1 == 0) goto L_0x015b
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            r0.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            r0.connect()     // Catch:{ IOException -> 0x0268 }
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException -> 0x0268 }
            r0.write(r14)     // Catch:{ IOException -> 0x0268 }
            r0.close()     // Catch:{ IOException -> 0x0268 }
            goto L_0x0160
        L_0x015b:
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            r0.connect()     // Catch:{ IOException -> 0x0268 }
        L_0x0160:
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0268 }
            r9.A07 = r0     // Catch:{ IOException -> 0x0268 }
            int r14 = r0.getResponseCode()     // Catch:{ IOException -> 0x024e }
            r9.A00 = r14     // Catch:{ IOException -> 0x024e }
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 < r1) goto L_0x022f
            r0 = 299(0x12b, float:4.19E-43)
            if (r14 > r0) goto L_0x022f
            java.net.HttpURLConnection r0 = r9.A07
            r0.getContentType()
            int r0 = r9.A00
            if (r0 != r1) goto L_0x0180
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0180
            r7 = r2
        L_0x0180:
            r9.A04 = r7
            if (r12 == r10) goto L_0x0213
            java.net.HttpURLConnection r7 = r9.A07
            java.lang.String r0 = "Content-Length"
            java.lang.String r14 = r7.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r12 = "]"
            java.lang.String r11 = "DefaultHttpDataSource"
            if (r0 != 0) goto L_0x01a8
            long r2 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x019b }
            goto L_0x01aa
        L_0x019b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected Content-Length ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r14, r12, r1)
            android.util.Log.e(r11, r0)
        L_0x01a8:
            r2 = -1
        L_0x01aa:
            java.lang.String r0 = "Content-Range"
            java.lang.String r8 = r7.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0202
            java.util.regex.Pattern r0 = A0F
            java.util.regex.Matcher r7 = r0.matcher(r8)
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x0202
            r0 = 2
            long r0 = X.AnonymousClass6C9.A0O(r7, r0)     // Catch:{ NumberFormatException -> 0x01f3 }
            long r15 = X.AnonymousClass6C9.A0O(r7, r10)     // Catch:{ NumberFormatException -> 0x01f3 }
            long r0 = r0 - r15
            r15 = 1
            long r0 = r0 + r15
            r15 = 0
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x01d6
            goto L_0x0201
        L_0x01d6:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0202
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x01f3 }
            java.lang.String r7 = "Inconsistent headers ["
            r13.append(r7)     // Catch:{ NumberFormatException -> 0x01f3 }
            r13.append(r14)     // Catch:{ NumberFormatException -> 0x01f3 }
            java.lang.String r7 = "] ["
            r13.append(r7)     // Catch:{ NumberFormatException -> 0x01f3 }
            X.AnonymousClass6C7.A1F(r8, r12, r11, r13)     // Catch:{ NumberFormatException -> 0x01f3 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x01f3 }
            goto L_0x0202
        L_0x01f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected Content-Range ["
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r8, r12, r1)
            android.util.Log.e(r11, r0)
            goto L_0x0202
        L_0x0201:
            r2 = r0
        L_0x0202:
            r0 = -1
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0213
            if (r8 == 0) goto L_0x0210
            long r5 = r9.A04
            long r0 = r2 - r5
        L_0x0210:
            r9.A03 = r0
            goto L_0x0215
        L_0x0213:
            r9.A03 = r5
        L_0x0215:
            java.net.HttpURLConnection r0 = r9.A07     // Catch:{ IOException -> 0x0225 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0225 }
            r9.A06 = r0     // Catch:{ IOException -> 0x0225 }
            r9.A08 = r10
            r9.A03(r4)
            long r0 = r9.A03
            return r0
        L_0x0225:
            r0 = move-exception
            r9.A04()
            X.6KR r1 = new X.6KR
            r1.<init>((X.C161387pX) r4, (java.io.IOException) r0, (int) r10)
            throw r1
        L_0x022f:
            java.net.HttpURLConnection r0 = r9.A07
            java.util.Map r1 = r0.getHeaderFields()
            r9.A04()
            int r0 = r9.A00
            X.6KQ r2 = new X.6KQ
            r2.<init>(r4, r1, r0)
            int r1 = r9.A00
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x024d
            X.6uC r0 = new X.6uC
            r0.<init>()
            r2.initCause(r0)
        L_0x024d:
            throw r2
        L_0x024e:
            r3 = move-exception
            r9.A04()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A1H(r0, r11, r13)
            java.lang.String r2 = r0.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            X.6KR r0 = new X.6KR
            r0.<init>(r4, r3, r2, r1)
            throw r0
        L_0x0265:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0268 }
            throw r0     // Catch:{ IOException -> 0x0268 }
        L_0x0268:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            android.net.Uri r0 = r4.A04
            X.AnonymousClass000.A1B(r0, r1)
            java.lang.String r2 = r1.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            X.6KR r0 = new X.6KR
            r0.<init>(r4, r3, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KP.Bfw(X.7pX):long");
    }

    public int read(byte[] bArr, int i, int i2) {
        Throwable th;
        try {
            if (this.A02 != this.A04) {
                AtomicReference atomicReference = A0E;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                }
                while (true) {
                    long j = this.A02;
                    long j2 = this.A04;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
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
            throw new AnonymousClass6KR(this.A05, e, 2);
        }
    }

    public AnonymousClass6KP(AnonymousClass7FD r2, C184768sU r3, String str, int i, int i2) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.A0D = str;
            this.A0C = new AnonymousClass7FD();
            this.A09 = i;
            this.A0A = i2;
            this.A0B = r2;
            if (r3 != null) {
                Awq(r3);
                return;
            }
            return;
        }
        throw AnonymousClass6CA.A0N();
    }
}
