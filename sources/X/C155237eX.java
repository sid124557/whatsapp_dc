package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7eX  reason: invalid class name and case insensitive filesystem */
public class C155237eX {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static C176148cX A00(URI uri, X509Certificate x509Certificate, List list, C176358cs r24, C149967Op r25, C180128kX r26) {
        C176148cX r5;
        Throwable A002;
        C176348cr r1;
        Map map;
        C176148cX r10;
        C176348cr r12;
        C176178ca r13;
        C176758dW r132;
        Map map2 = A00;
        URI uri2 = uri;
        Reference reference = (Reference) map2.get(uri2);
        C176358cs r8 = r24;
        C149967Op r3 = r25;
        if (!(reference == null || (map = (Map) reference.get()) == null || (r10 = (C176148cX) map.get(r8)) == null)) {
            byte[] A0C = C176778dY.A0C(r10.A01.A01);
            if (A0C instanceof C176348cr) {
                r12 = (C176348cr) A0C;
            } else if (A0C != null) {
                r12 = new C176348cr(C176958dq.A0C(A0C));
            } else {
                r12 = null;
            }
            C176478d4 r0 = r12.A02;
            if (r0 == null) {
                r0 = null;
            }
            C176958dq r122 = r0.A02;
            for (int i = 0; i != r122.A0U(); i++) {
                C183618qL A0W = r122.A0W(i);
                if (A0W instanceof C176178ca) {
                    r13 = (C176178ca) A0W;
                } else if (A0W != null) {
                    r13 = new C176178ca(C176958dq.A0C(A0W));
                } else {
                    r13 = null;
                }
                if (r8.equals(r13.A02) && (r132 = r13.A00) != null) {
                    try {
                        if (new Date(r3.A04.getTime()).after(r132.A0W())) {
                            map.remove(r8);
                            r10 = null;
                        }
                    } catch (ParseException unused) {
                        map.remove(r8);
                    }
                }
            }
            if (r10 != null) {
                return r10;
            }
        }
        try {
            URL url = uri2.toURL();
            C161377pW r11 = new C161377pW();
            r11.A03(new C176138cW(r8));
            C161377pW r102 = new C161377pW();
            byte[] bArr = null;
            int i2 = 0;
            while (true) {
                List list2 = list;
                if (i2 == list2.size()) {
                    break;
                }
                Extension extension = (Extension) list2.get(i2);
                byte[] value = extension.getValue();
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
                r102.A03(new C176548dB(C176768dX.A0B(extension.getId()), value, extension.isCritical()));
                i2++;
            }
            try {
                byte[] A0L = new C176118cU(new C176328cp(new C176948dp(r11), C176288cl.A0B(new C176948dp(r102)))).A0L();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(A0L.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(A0L);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                long j = (long) contentLength;
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                long j2 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                    if (read >= 0) {
                        long j3 = (long) read;
                        if (j - j2 < j3) {
                            A002 = new C140516ts();
                            break;
                        }
                        j2 += j3;
                        A0e.write(bArr2, 0, read);
                    } else {
                        byte[] byteArray = A0e.toByteArray();
                        if (byteArray instanceof C176148cX) {
                            r5 = (C176148cX) byteArray;
                        } else if (byteArray != null) {
                            r5 = new C176148cX(C176958dq.A0C(byteArray));
                        } else {
                            r5 = null;
                        }
                        C176728dT r14 = r5.A00.A00;
                        if (r14.A0U() == 0) {
                            C176278ck r6 = r5.A01;
                            if (r6 == null) {
                                r6 = null;
                            }
                            if (r6.A00.A0T(C186778vv.A02)) {
                                byte[] bArr3 = r6.A01.A00;
                                if (bArr3 instanceof C176348cr) {
                                    r1 = (C176348cr) bArr3;
                                } else if (bArr3 != null) {
                                    r1 = new C176348cr(C176958dq.A0C(bArr3));
                                } else {
                                    r1 = null;
                                }
                                if (C173528Qn.A01(x509Certificate, r1, r3, r26, bArr)) {
                                    Reference reference2 = (Reference) map2.get(uri2);
                                    if (reference2 != null) {
                                        ((Map) reference2.get()).put(r8, r5);
                                        return r5;
                                    }
                                    HashMap A0t = AnonymousClass001.A0t();
                                    A0t.put(r8, r5);
                                    map2.put(uri2, AnonymousClass0x9.A14(A0t));
                                    return r5;
                                }
                            }
                            A002 = C149967Op.A00("OCSP response failed to validate", (Throwable) null, r3);
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("OCSP responder failed: ");
                            A002 = C149967Op.A00(AnonymousClass000.A0R(new BigInteger(r14.A01), A0o), (Throwable) null, r3);
                        }
                    }
                }
                throw A002;
            } catch (IOException e) {
                throw C149967Op.A00(AnonymousClass000.A0a("configuration error: ", AnonymousClass001.A0o(), e), e, r3);
            }
        } catch (MalformedURLException e2) {
            throw C149967Op.A00(AnonymousClass000.A0a("configuration error: ", AnonymousClass001.A0o(), e2), e2, r3);
        }
    }
}
