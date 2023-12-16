package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.3Ap  reason: invalid class name and case insensitive filesystem */
public class C63773Ap implements C177858gZ {
    public int A00;
    public final DataTaskListener A01;
    public final C56492s4 A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass33K A04;
    public final C55132pq A05;
    public final AnonymousClass3FI A06;
    public final AnonymousClass4FS A07;
    public final File A08;
    public final Map A09 = AnonymousClass0x7.A0y();

    public final void A02(NetworkSession networkSession, OutputStream outputStream, String str, HttpURLConnection httpURLConnection, boolean z) {
        C36851zz A002;
        try {
            A002 = C36851zz.A00(this.A02, (Integer) null, 29, httpURLConnection);
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[10240];
            int i = 0;
            while (true) {
                int read = A002.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    i += read;
                    if (z) {
                        Execution.executeAsync(new AnonymousClass6Ms(networkSession, this, str, read, i, contentLength, 0), 3);
                    }
                } else {
                    A002.close();
                    return;
                }
            }
        } catch (IOException unused) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 400 && responseCode <= 500) {
                Object[] A0L = AnonymousClass002.A0L();
                C18270x1.A1Q(A0L, responseCode);
                String format = String.format((Locale) null, "[HTTP status=%d] Error Content = ", A0L);
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        try {
                            StringBuilder A0l = AnonymousClass000.A0l(format);
                            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                            byte[] bArr2 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                            while (true) {
                                int read2 = errorStream.read(bArr2);
                                if (read2 == -1) {
                                    break;
                                }
                                A0e.write(bArr2, 0, read2);
                            }
                            AnonymousClass000.A1B(A0e, A0l);
                            format = A0l.toString();
                            errorStream.close();
                        } catch (Throwable th) {
                            errorStream.close();
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw AnonymousClass002.A0C(format);
            }
            return;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Malformed Http Response", e);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public final UrlResponse A00(NetworkSession networkSession, UrlRequest urlRequest, FileInputStream fileInputStream, OutputStream outputStream, String str, boolean z, boolean z2) {
        DataOutputStream dataOutputStream;
        int read;
        UrlRequest urlRequest2 = urlRequest;
        urlRequest2.getUrl();
        byte[] httpBody = urlRequest2.getHttpBody();
        FileInputStream fileInputStream2 = fileInputStream;
        HttpsURLConnection A012 = A01(urlRequest2, fileInputStream2, httpBody);
        try {
            NetworkSession networkSession2 = networkSession;
            String str2 = str;
            if (A012.getDoOutput()) {
                try {
                    dataOutputStream = new DataOutputStream(AnonymousClass203.A00(this.A02, (Integer) null, 29, A012));
                    int i = 0;
                    if (fileInputStream != null) {
                        int available = fileInputStream2.available();
                        int min = Math.min(10240, available);
                        byte[] bArr = new byte[min];
                        do {
                            read = fileInputStream2.read(bArr, 0, min);
                            dataOutputStream.write(bArr, 0, read);
                            int available2 = fileInputStream2.available();
                            min = Math.min(10240, available2);
                            int i2 = available - available2;
                            if (z) {
                                Execution.executeAsync(new AnonymousClass6Ms(networkSession2, this, str2, read, i2, available, 1), 3);
                                continue;
                            }
                        } while (read > 0);
                    } else {
                        int length = httpBody.length;
                        int i3 = length;
                        while (i < i3) {
                            int min2 = Math.min(10240, length);
                            dataOutputStream.write(httpBody, i, min2);
                            length -= min2;
                            i += min2;
                            if (z) {
                                Execution.executeAsync(new AnonymousClass6Mr(networkSession2, this, str2, httpBody, min2, i), 3);
                            }
                        }
                    }
                    dataOutputStream.close();
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Failed to setup connection", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            A02(networkSession2, outputStream, str2, A012, z2);
            UrlResponse urlResponse = new UrlResponse(urlRequest2, A012.getResponseCode(), NetworkUtils.flattenHeaders((Map) A012.getHeaderFields()));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wa-msys/NetworkSession: Finish MSys system handleDataTask, ");
            C18260x0.A1F(A0o, A012.getResponseCode());
            return urlResponse;
            throw th;
        } finally {
            A012.disconnect();
        }
    }

    public C63773Ap(C56492s4 r2, AnonymousClass1VW r3, AnonymousClass33K r4, C55132pq r5, AnonymousClass3FI r6, AnonymousClass4FS r7, File file) {
        this.A06 = r6;
        this.A07 = r7;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A08 = file;
        this.A01 = new C63763Ao(this);
    }

    public final HttpsURLConnection A01(UrlRequest urlRequest, FileInputStream fileInputStream, byte[] bArr) {
        SSLSocketFactory A022;
        int length;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) C18300x5.A0q(urlRequest.getUrl());
        Map httpHeaders = urlRequest.getHttpHeaders();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setRequestMethod(urlRequest.getHttpMethod());
        C18280x3.A0z(this.A06, httpsURLConnection);
        httpsURLConnection.setRequestProperty("WaMsysRequest", "1");
        if (httpHeaders.containsKey("X-Forwarded-Host")) {
            A022 = (SSLSocketFactory) SSLSocketFactory.getDefault();
        } else {
            if (httpHeaders.containsKey("Host")) {
                C72353da.A00(C18310x6.A0o("Host", httpHeaders), httpsURLConnection);
            }
            A022 = this.A05.A02();
        }
        httpsURLConnection.setSSLSocketFactory(A022);
        int i = this.A00;
        if (i > 0) {
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(this.A00);
        }
        if (!(bArr == null && fileInputStream == null)) {
            httpsURLConnection.setDoOutput(true);
            if (fileInputStream != null) {
                length = fileInputStream.available();
            } else {
                C626936e.A06(bArr);
                length = bArr.length;
            }
            httpsURLConnection.setFixedLengthStreamingMode(length);
        }
        Iterator A0q = AnonymousClass000.A0q(httpHeaders);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            httpsURLConnection.setRequestProperty(C18310x6.A0q(A0w), AnonymousClass0x9.A12(A0w));
        }
        return httpsURLConnection;
    }
}
