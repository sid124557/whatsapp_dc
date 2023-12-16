package X;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.1u9  reason: invalid class name and case insensitive filesystem */
public class C34051u9 extends AnonymousClass5ZM {
    public static final HashMap A0A = AnonymousClass001.A0t();
    public final int A00;
    public final long A01;
    public final C56492s4 A02;
    public final C55052pi A03;
    public final C54292oU A04;
    public final AnonymousClass2T0 A05;
    public final C103265Mf A06;
    public final C55132pq A07;
    public final AnonymousClass3FI A08;
    public final AnonymousClass4FS A09;

    public static void A01(C56492s4 r7, C55052pi r8, C54292oU r9, AnonymousClass2T0 r10, C103265Mf r11, C55132pq r12, AnonymousClass3FI r13, AnonymousClass4FS r14, int i, long j) {
        HashMap hashMap = A0A;
        synchronized (hashMap) {
            C95814uZ r4 = r10.A03;
            if (hashMap.containsKey(r4)) {
                C34051u9 r3 = (C34051u9) hashMap.get(r4);
                AnonymousClass2T0 r2 = r3.A05;
                if (!r2.A06.equals(r10.A06)) {
                    r3.A0D(true);
                    hashMap.remove(r2.A03);
                } else if (r3.A06() != 1) {
                    hashMap.remove(r2.A03);
                }
            }
            C34051u9 r6 = new C34051u9(r7, r8, r9, r10, r11, r12, r13, r14, i, j);
            hashMap.put(r4, r6);
            C18270x1.A0w(r6, r14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r12 != 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.C18260x0.A1S(X.AnonymousClass001.A0o(), "ProfilePictureDownload: IO Exception in middle of download: ", r7);
        r12 = new X.AnonymousClass7O2(r0, r10, 0, 5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0146, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0147, code lost:
        r6 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014b, code lost:
        r6 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c6, code lost:
        if (r1 == null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c8, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cb, code lost:
        if (r6 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d2, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Could not close connection input stream", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014a A[ExcHandler: 6zD (e X.6zD), Splitter:B:15:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0189 A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019b A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b3 A[SYNTHETIC, Splitter:B:81:0x01b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r0 = r18
            X.2oU r1 = r0.A04
            android.content.Context r1 = r1.A00
            java.io.File r10 = A00(r1, r0)
            boolean r1 = r10.createNewFile()     // Catch:{ IOException -> 0x01f0 }
            if (r1 != 0) goto L_0x0015
            long r4 = r10.length()     // Catch:{ IOException -> 0x01f0 }
            goto L_0x0017
        L_0x0015:
            r4 = 0
        L_0x0017:
            java.lang.String r9 = "ProfilePictureDownload: Could not close connection input stream"
            java.lang.String r3 = "ProfilePictureDownload: Could not close FileOutputStream "
            r7 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01de }
            r2.<init>(r10, r7)     // Catch:{ FileNotFoundException -> 0x01de }
            r1 = 0
            X.2T0 r6 = r0.A05     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.net.URL r13 = r6.A06     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.net.URLConnection r8 = r13.openConnection()     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            boolean r6 = r8 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            if (r6 == 0) goto L_0x0152
            javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.2pq r6 = r0.A07     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.1r8 r6 = r6.A02()     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            r8.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.C18270x1.A1J(r8)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.3FI r6 = r0.A08     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.C18280x3.A0z(r6, r8)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x005e
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.lang.String r6 = "bytes="
            r11.append(r6)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            r11.append(r4)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.lang.String r6 = "-"
            java.lang.String r11 = X.AnonymousClass000.A0X(r6, r11)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.lang.String r6 = "Range"
            r8.setRequestProperty(r6, r11)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
        L_0x005e:
            r8.connect()     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            int r6 = r8.getResponseCode()     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r14 = 0
            r12 = 206(0xce, float:2.89E-43)
            int r11 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            r4 = 200(0xc8, float:2.8E-43)
            if (r11 <= 0) goto L_0x0071
            r4 = 206(0xce, float:2.89E-43)
        L_0x0071:
            if (r6 != r4) goto L_0x012d
            X.2s4 r4 = r0.A02     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r11 = 0
            X.1zz r1 = X.C36851zz.A01(r4, r8, r11)     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r15 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r15]     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
        L_0x007e:
            int r5 = r1.read(r14, r11, r15)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r4 = -1
            if (r5 == r4) goto L_0x009d
            boolean r4 = X.C18320x8.A1T(r0)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            if (r4 == 0) goto L_0x0099
            X.7O2 r12 = new X.7O2     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r15 = r7
            r17 = r6
            r16 = r7
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            goto L_0x0125
        L_0x0099:
            r2.write(r14, r11, r5)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            goto L_0x007e
        L_0x009d:
            r2.flush()     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            if (r6 != r12) goto L_0x00c1
            java.lang.String r4 = "Content-Range"
            java.lang.String r5 = r8.getHeaderField(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            boolean r4 = r5.isEmpty()     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            if (r4 != 0) goto L_0x00bf
            java.lang.String r4 = "/"
            java.lang.String[] r12 = r5.split(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            int r5 = r12.length     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r4 = 2
            if (r5 != r4) goto L_0x00bf
            r4 = r12[r7]     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            int r12 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            goto L_0x00c5
        L_0x00bf:
            r12 = -1
            goto L_0x00c7
        L_0x00c1:
            int r12 = r8.getContentLength()     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
        L_0x00c5:
            if (r12 == 0) goto L_0x0102
        L_0x00c7:
            long r4 = (long) r12     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            long r15 = r10.length()     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            int r14 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x0102
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = "ProfilePictureDownload: Length mismatch between CDN response and stored file: "
            r5.append(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r5.append(r13)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = " responseCode:"
            r5.append(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r5.append(r6)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = " contentLength:"
            r5.append(r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r5.append(r12)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = " fileLength:"
            java.lang.String r4 = X.AnonymousClass000.A0N(r10, r4, r5)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r16 = 6
            X.7O2 r12 = new X.7O2     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r13 = r0
            r14 = r10
            r15 = r7
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            goto L_0x0125
        L_0x0102:
            r15 = 2
            X.7O2 r12 = new X.7O2     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            r17 = r6
            r16 = r7
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x010f, 6zD -> 0x014a, all -> 0x0146 }
            goto L_0x0125
        L_0x010f:
            r7 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = "ProfilePictureDownload: IO Exception in middle of download: "
            X.C18260x0.A1S(r5, r4, r7)     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r16 = 5
            X.7O2 r12 = new X.7O2     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r13 = r0
            r14 = r10
            r15 = r11
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
        L_0x0125:
            r8.disconnect()
            r1.close()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01bb
        L_0x012d:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            java.lang.String r4 = "ProfilePictureDownload: Non Success Response from CDN: "
            X.C18260x0.A0z(r4, r5, r6)     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r16 = 6
            X.7O2 r12 = new X.7O2     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r13 = r0
            r14 = r10
            r15 = r7
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x014e, 6zD -> 0x014a, all -> 0x0146 }
            r8.disconnect()
            goto L_0x01bb
        L_0x0146:
            r4 = move-exception
            r6 = r1
            r1 = r8
            goto L_0x01c8
        L_0x014a:
            r5 = move-exception
            r6 = r1
            r1 = r8
            goto L_0x0169
        L_0x014e:
            r5 = move-exception
            r6 = r1
            r1 = r8
            goto L_0x017d
        L_0x0152:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.lang.String r4 = "Could not get HTTPS Connection:"
            X.C18260x0.A1T(r5, r4, r8)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            X.6zD r4 = new X.6zD     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            r4.<init>(r0, r5)     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
            throw r4     // Catch:{ IOException -> 0x017b, 6zD -> 0x0167, all -> 0x0165 }
        L_0x0165:
            r4 = move-exception
            goto L_0x01d5
        L_0x0167:
            r5 = move-exception
            r6 = r1
        L_0x0169:
            java.lang.String r4 = "ProfilePictureDownload: "
            com.whatsapp.util.Log.w(r4, r5)     // Catch:{ all -> 0x01c5 }
            r15 = 0
            r16 = 4
            r17 = -1
            X.7O2 r12 = new X.7O2     // Catch:{ all -> 0x01c5 }
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01c5 }
            goto L_0x01ac
        L_0x017b:
            r5 = move-exception
            r6 = r1
        L_0x017d:
            boolean r4 = r5 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x01c5 }
            if (r4 != 0) goto L_0x019b
            boolean r4 = r5 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x01c5 }
            if (r4 != 0) goto L_0x019b
            boolean r4 = r5 instanceof java.net.ConnectException     // Catch:{ all -> 0x01c5 }
            if (r4 != 0) goto L_0x019b
            java.lang.String r4 = "ProfilePictureDownload: Fatal error connecting to CDN "
            com.whatsapp.util.Log.w(r4, r5)     // Catch:{ all -> 0x01c5 }
            r15 = 1
            r16 = 4
            r17 = -1
            X.7O2 r12 = new X.7O2     // Catch:{ all -> 0x01c5 }
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01c5 }
            goto L_0x01ac
        L_0x019b:
            java.lang.String r4 = "ProfilePictureDownload: Transient error connecting to CDN "
            com.whatsapp.util.Log.w(r4, r5)     // Catch:{ all -> 0x01c5 }
            r15 = 0
            r16 = 4
            r17 = -1
            X.7O2 r12 = new X.7O2     // Catch:{ all -> 0x01c5 }
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01c5 }
        L_0x01ac:
            if (r1 == 0) goto L_0x01b1
            r1.disconnect()
        L_0x01b1:
            if (r6 == 0) goto L_0x01bb
            r6.close()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01bb
        L_0x01b7:
            r0 = move-exception
            com.whatsapp.util.Log.w(r9, r0)
        L_0x01bb:
            r2.close()     // Catch:{ IOException -> 0x01bf }
            goto L_0x01c4
        L_0x01bf:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            return r12
        L_0x01c4:
            return r12
        L_0x01c5:
            r4 = move-exception
            if (r1 == 0) goto L_0x01cb
        L_0x01c8:
            r1.disconnect()
        L_0x01cb:
            if (r6 == 0) goto L_0x01d5
            r6.close()     // Catch:{ IOException -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            com.whatsapp.util.Log.w(r9, r0)
        L_0x01d5:
            r2.close()     // Catch:{ IOException -> 0x01d9 }
            throw r4
        L_0x01d9:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            throw r4
        L_0x01de:
            r2 = move-exception
            java.lang.String r1 = "ProfilePictureDownload: Could not open FileOutputStream "
            com.whatsapp.util.Log.w(r1, r2)
            r5 = 5
            r6 = -1
            X.7O2 r12 = new X.7O2
            r1 = r12
            r2 = r0
            r3 = r10
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x01f0:
            r2 = move-exception
            java.lang.String r1 = "ProfilePictureDownload: Failed, could not create temp file:"
            com.whatsapp.util.Log.w(r1, r2)
            r15 = 1
            r16 = 5
            r17 = -1
            X.7O2 r12 = new X.7O2
            r14 = r10
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34051u9.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        C18270x1.A0x(A00(this.A04.A00, this));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r14) {
        /*
            r13 = this;
            X.7O2 r14 = (X.AnonymousClass7O2) r14
            int r1 = r14.A02
            r0 = 2
            if (r1 != r0) goto L_0x003c
            java.io.File r0 = r14.A03
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r4 = new byte[r1]
            java.io.FileInputStream r3 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x005b }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r2.<init>(r3)     // Catch:{ all -> 0x002e }
            r0 = 0
            r2.read(r4, r0, r1)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x002e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x005b }
            goto L_0x0061
        L_0x0024:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x002e }
        L_0x002d:
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x005b }
        L_0x0037:
            throw r1     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x005b }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
            goto L_0x005e
        L_0x003c:
            if (r1 != 0) goto L_0x006a
            int r1 = r13.A00
            r0 = 3
            if (r1 >= r0) goto L_0x006a
            X.2oU r4 = r13.A04
            X.3FI r8 = r13.A08
            X.4FS r9 = r13.A09
            X.2s4 r2 = r13.A02
            X.2pq r7 = r13.A07
            X.2pi r3 = r13.A03
            X.5Mf r6 = r13.A06
            X.2T0 r5 = r13.A05
            int r10 = r1 + 1
            long r11 = r13.A01
            A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
        L_0x005e:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0061:
            X.2T0 r1 = r13.A05
            r1.A00 = r4
            X.2pi r0 = r13.A03
            r0.A03(r1)
        L_0x006a:
            X.5Mf r4 = r13.A06
            int r7 = r14.A01
            r8 = 2
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r13.A01
            java.lang.Long r6 = X.C18310x6.A0f(r2, r0)
            java.io.File r2 = r14.A03
            long r0 = r2.length()
            java.lang.Double r5 = X.C18330xA.A07(r0)
            int r9 = r14.A00
            r4.A00(r5, r6, r7, r8, r9)
            java.util.HashMap r1 = A0A
            monitor-enter(r1)
            X.2T0 r0 = r13.A05     // Catch:{ all -> 0x0097 }
            X.4uZ r0 = r0.A03     // Catch:{ all -> 0x0097 }
            r1.remove(r0)     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            r2.delete()
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34051u9.A0C(java.lang.Object):void");
    }

    public C34051u9(C56492s4 r1, C55052pi r2, C54292oU r3, AnonymousClass2T0 r4, C103265Mf r5, C55132pq r6, AnonymousClass3FI r7, AnonymousClass4FS r8, int i, long j) {
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r1;
        this.A07 = r6;
        this.A03 = r2;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = j;
    }

    public static File A00(Context context, C34051u9 r3) {
        return AnonymousClass002.A0A(AnonymousClass0x7.A0e(context.getCacheDir(), "ProfilePictureTemp"), URLUtil.guessFileName(r3.A05.A06.toString(), (String) null, (String) null));
    }
}
