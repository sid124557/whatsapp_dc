package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0YT  reason: invalid class name */
public final class AnonymousClass0YT {
    public static final Pair A0F = Pair.create((Object) null, (Object) null);
    public static final Pattern A0G = Pattern.compile("bytes=0-(\\d*)");
    public final int A00;
    public final C55682qk A01;
    public final AnonymousClass0WN A02;
    public final C16410tE A03;
    public final AnonymousClass0QR A04;
    public final C04710Qi A05;
    public final C05580Ub A06;
    public final AnonymousClass0Y7 A07;
    public final AnonymousClass0UO A08;
    public final C29441ip A09;
    public final AnonymousClass310 A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FS A0D;
    public final String A0E;

    public static void A04(AnonymousClass0YT r4, AtomicLong atomicLong, long j) {
        r4.A03.BQe((atomicLong.get() + j) * -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A05(AnonymousClass49Y r2) {
        this.A09.A06(r2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A06(AnonymousClass49Y r2) {
        this.A09.A07(r2);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0078=Splitter:B:21:0x0078, B:43:0x014c=Splitter:B:43:0x014c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A09() {
        /*
            r20 = this;
            java.lang.String r7 = " are not identical to ones on the disk, so, we will have to re-upload them"
            r4 = r20
            X.0QR r12 = r4.A04
            java.lang.String r11 = r4.A0E
            X.0UO r8 = r4.A08
            java.lang.String r5 = r8.A06
            java.lang.String r6 = r12.A01(r11, r5)
            if (r6 != 0) goto L_0x0015
            android.util.Pair r0 = A0F
            return r0
        L_0x0015:
            X.0Qi r0 = r4.A05
            boolean r0 = r0.A06()
            r13 = 0
            if (r0 == 0) goto L_0x0161
            long r0 = r8.A01()     // Catch:{ IOException -> 0x015a }
            X.0vS r3 = r4.A0B(r6, r0)     // Catch:{ IOException -> 0x015a }
            int r9 = r3.Az6()     // Catch:{ all -> 0x0150 }
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r2 = " "
            if (r9 == r0) goto L_0x007c
            r0 = 401(0x191, float:5.62E-43)
            if (r9 == r0) goto L_0x0073
            r0 = 403(0x193, float:5.65E-43)
            if (r9 == r0) goto L_0x0059
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "GoogleBackupApi/upload-file/unexpected-response-code "
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r9)     // Catch:{ all -> 0x0150 }
            r1.append(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r3.BCG()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            A00(r3)     // Catch:{ all -> 0x0150 }
            r12.A03(r11, r5)     // Catch:{ all -> 0x0150 }
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = r3.B7O()     // Catch:{ all -> 0x0150 }
            r12.A03(r11, r5)     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "GoogleBackupApi/api disabled upload-file "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            X.0EL r0 = new X.0EL     // Catch:{ all -> 0x0150 }
            r0.<init>()     // Catch:{ all -> 0x0150 }
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x0073:
            X.0Y7 r0 = r4.A07     // Catch:{ all -> 0x0150 }
            r0.A0H()     // Catch:{ all -> 0x0150 }
        L_0x0078:
            r3.close()     // Catch:{ IOException -> 0x015a }
            return r13
        L_0x007c:
            A00(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "Range"
            java.util.List r9 = r3.BFa(r0)     // Catch:{ all -> 0x0150 }
            r10 = 1
            if (r9 == 0) goto L_0x0123
            int r0 = r9.size()     // Catch:{ all -> 0x0150 }
            if (r0 != r10) goto L_0x0123
            java.util.regex.Pattern r1 = A0G     // Catch:{ all -> 0x0150 }
            r2 = 0
            java.lang.Object r0 = r9.get(r2)     // Catch:{ all -> 0x0150 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0150 }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ all -> 0x0150 }
            boolean r0 = r1.find()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r1.group(r10)     // Catch:{ all -> 0x0150 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0150 }
            r9 = 1
            long r0 = r0 + r9
            java.lang.String r2 = "X-Range-MD5"
            java.lang.String r17 = r3.BFZ(r2)     // Catch:{ all -> 0x0150 }
            X.310 r14 = r4.A0A     // Catch:{ all -> 0x0150 }
            X.5ZR r15 = r4.A0B     // Catch:{ all -> 0x0150 }
            java.io.File r16 = r8.A02()     // Catch:{ all -> 0x0150 }
            r18 = r0
            boolean r4 = A08(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "GoogleBackupApi/upload-file for file "
            if (r4 == 0) goto L_0x00f6
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0m(r2, r5)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = " bytes already uploaded ("
            r7.append(r2)     // Catch:{ all -> 0x0150 }
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = " out of "
            r7.append(r2)     // Catch:{ all -> 0x0150 }
            long r4 = r8.A01()     // Catch:{ all -> 0x0150 }
            r7.append(r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "): "
            r7.append(r2)     // Catch:{ all -> 0x0150 }
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = " are identical to ones on the disk, so, we will not re-upload them."
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r7)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.d((java.lang.String) r2)     // Catch:{ all -> 0x0150 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = android.util.Pair.create(r6, r0)     // Catch:{ all -> 0x0150 }
            goto L_0x014c
        L_0x00f6:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "GoogleBackupApi/upload-file for a file bytes already uploaded: "
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            r4.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r4)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x0150 }
            goto L_0x014c
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "GoogleBackupApi/upload-file cannot find uploaded length in "
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = X.AnonymousClass001.A0n(r9, r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x0150 }
            goto L_0x014c
        L_0x0123:
            if (r9 == 0) goto L_0x0142
            int r0 = r9.size()     // Catch:{ all -> 0x0150 }
            if (r0 <= r10) goto L_0x0142
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "GoogleBackupApi/upload-file error: multiple range headers, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = android.text.TextUtils.join(r2, r9)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x0150 }
            goto L_0x014c
        L_0x0142:
            java.lang.String r0 = "GoogleBackupApi/upload-file already uploaded data is none."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            r12.A03(r11, r5)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x0150 }
        L_0x014c:
            r3.close()     // Catch:{ IOException -> 0x015a }
            return r0
        L_0x0150:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0155 }
            goto L_0x0159
        L_0x0155:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x015a }
        L_0x0159:
            throw r1     // Catch:{ IOException -> 0x015a }
        L_0x015a:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        L_0x0161:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YT.A09():android.util.Pair");
    }

    public final C17390vS A0B(String str, long j) {
        Log.d("GoogleBackupApi/getPreviousResumableUploadSession");
        HttpsURLConnection A0D2 = this.A07.A0D("PUT", str, (String) null, (Map) null, false);
        Locale locale = Locale.ENGLISH;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, j);
        A0D2.addRequestProperty("Content-Range", String.format(locale, "bytes */%d", A0L));
        A0D2.connect();
        A0D2.getURL();
        A0D2.getRequestMethod();
        return new C02130Ez(A0D2);
    }

    public AnonymousClass0UI A0C() {
        FileNotFoundException e;
        String str;
        long j;
        AnonymousClass0UO r4 = this.A08;
        if (r4.A02().exists()) {
            Pair A092 = A09();
            if (A092 == null) {
                Log.w("GoogleBackupApi/upload-file/error-while-fetching-previous-upload-session");
                return null;
            }
            Object obj = A092.first;
            if (obj != null) {
                str = (String) obj;
                j = ((Number) A092.second).longValue();
                this.A03.BQe(j);
            } else {
                str = A0H();
                if (str == null) {
                    Log.i("GoogleBackupApi/upload-file/error-creating-new-session");
                    return null;
                }
                j = 0;
            }
            try {
                return A0D(str, j);
            } catch (FileNotFoundException e2) {
                e = e2;
                if (this.A0A.A0C(r4.A02()) && this.A0B.A0H()) {
                    Log.e(AnonymousClass000.A0P(r4, "GoogleBackupApi/upload-file/missing-read-external-storage-permission/ ", AnonymousClass001.A0o()), e);
                    throw new AnonymousClass0EV(e);
                }
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupApi/upload-file file ");
            A0o.append("<file>");
            Log.e(AnonymousClass000.A0X(" does not exist.", A0o));
            e = new FileNotFoundException(AnonymousClass000.A0U("file ", "<file>", " does not exist.", AnonymousClass001.A0o()));
            throw e;
        }
    }

    public final AnonymousClass0UI A0D(String str, long j) {
        Log.d("GoogleBackupApi/finishResumableUpload");
        return A0E(str, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0176, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0177, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0189, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0189 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException)] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0UI A0E(java.lang.String r20, long r21) {
        /*
            r19 = this;
            r9 = r19
            X.0UO r6 = r9.A08
            long r4 = r6.A01()
            r0 = 1
            long r2 = r4 - r0
            android.os.Handler r8 = X.AnonymousClass000.A0A()
            r11 = 0
            java.io.File r0 = r6.A02()     // Catch:{ FileNotFoundException -> 0x0189, IOException -> 0x0176, all -> 0x0174 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0189, IOException -> 0x0176, all -> 0x0174 }
            r10.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0189, IOException -> 0x0176, all -> 0x0174 }
            r0 = r21
            long r6 = r10.skip(r0)     // Catch:{ IOException -> 0x015a }
            int r12 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r12 == 0) goto L_0x0043
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x015a }
            java.lang.String r12 = "GoogleBackupApi/upload-file/ "
            r13.append(r12)     // Catch:{ IOException -> 0x015a }
            java.lang.String r12 = "<file>"
            r13.append(r12)     // Catch:{ IOException -> 0x015a }
            java.lang.String r12 = " seek required: "
            r13.append(r12)     // Catch:{ IOException -> 0x015a }
            r13.append(r0)     // Catch:{ IOException -> 0x015a }
            java.lang.String r12 = " seek actual: "
            java.lang.String r6 = X.AnonymousClass000.A0Z(r12, r13, r6)     // Catch:{ IOException -> 0x015a }
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ IOException -> 0x015a }
        L_0x0043:
            X.0Qi r6 = r9.A05     // Catch:{ all -> 0x0164 }
            boolean r6 = r6.A06()     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0152
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = "GoogleBackupApi/upload-file value of startByte is "
            r7.append(r6)     // Catch:{ all -> 0x0164 }
            r7.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = " and endByte is "
            java.lang.String r6 = X.AnonymousClass000.A0Z(r6, r7, r2)     // Catch:{ all -> 0x0164 }
            com.whatsapp.util.Log.d((java.lang.String) r6)     // Catch:{ all -> 0x0164 }
            X.0Y7 r13 = r9.A07     // Catch:{ all -> 0x0164 }
            boolean r6 = r13.A0I()     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0073
            java.lang.String r0 = "GoogleBackupApi/upload-file/interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            goto L_0x0152
        L_0x006f:
            r1 = move-exception
            r12 = r11
            goto L_0x0166
        L_0x0073:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0164 }
            java.lang.String r12 = "retryCount"
            int r6 = r9.A00     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0164 }
            r7.put(r12, r6)     // Catch:{ all -> 0x0164 }
            r6 = 13
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch:{ all -> 0x0164 }
            java.lang.String r14 = "PUT"
            java.lang.String r16 = "application/binary"
            r18 = 1
            r15 = r20
            r17 = r7
            javax.net.ssl.HttpsURLConnection r13 = r13.A0D(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0164 }
            r6 = 0
            java.util.concurrent.atomic.AtomicBoolean r14 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0164 }
            r14.<init>(r6)     // Catch:{ all -> 0x0164 }
            X.0hd r12 = new X.0hd     // Catch:{ all -> 0x0164 }
            r12.<init>(r9, r14, r13)     // Catch:{ all -> 0x0164 }
            X.0la r6 = new X.0la     // Catch:{ all -> 0x0150 }
            r6.<init>(r9, r12)     // Catch:{ all -> 0x0150 }
            r8.post(r6)     // Catch:{ all -> 0x0150 }
            boolean r6 = r14.get()     // Catch:{ all -> 0x0150 }
            if (r6 == 0) goto L_0x00bf
            java.lang.String r0 = "GoogleBackupApi/upload-file/request-aborted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016f }
            X.0lZ r0 = new X.0lZ
            r0.<init>(r9, r12)
            r8.post(r0)
            return r11
        L_0x00bf:
            r6 = 0
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0150 }
            r11.<init>(r6)     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "Content-Range"
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0127 }
            java.lang.String r6 = "bytes "
            r15.append(r6)     // Catch:{ IllegalStateException -> 0x0127 }
            r15.append(r0)     // Catch:{ IllegalStateException -> 0x0127 }
            java.lang.String r6 = "-"
            r15.append(r6)     // Catch:{ IllegalStateException -> 0x0127 }
            r15.append(r2)     // Catch:{ IllegalStateException -> 0x0127 }
            java.lang.String r6 = "/"
            java.lang.String r6 = X.AnonymousClass000.A0Z(r6, r15, r4)     // Catch:{ IllegalStateException -> 0x0127 }
            r13.addRequestProperty(r7, r6)     // Catch:{ IllegalStateException -> 0x0127 }
            java.lang.String r7 = "Content-Length"
            long r2 = r2 - r21
            r15 = 1
            long r2 = r2 + r15
            java.lang.String r6 = java.lang.Long.toString(r2)     // Catch:{ IllegalStateException -> 0x0127 }
            r13.addRequestProperty(r7, r6)     // Catch:{ IllegalStateException -> 0x0127 }
            r13.setFixedLengthStreamingMode(r2)     // Catch:{ IllegalStateException -> 0x0127 }
            r13.getURL()     // Catch:{ IllegalStateException -> 0x0127 }
            r13.getRequestMethod()     // Catch:{ IllegalStateException -> 0x0127 }
            r13.connect()     // Catch:{ IllegalStateException -> 0x0127 }
            java.io.OutputStream r2 = r13.getOutputStream()     // Catch:{ IllegalStateException -> 0x0127 }
            boolean r2 = r9.A0I(r10, r2, r11)     // Catch:{ IllegalStateException -> 0x0127 }
            if (r2 != 0) goto L_0x010a
            goto L_0x0137
        L_0x010a:
            int r2 = r13.getResponseCode()     // Catch:{ IllegalStateException -> 0x0127 }
            X.0UI r2 = r9.A0G(r13, r2, r4)     // Catch:{ IllegalStateException -> 0x0127 }
            A04(r9, r11, r0)     // Catch:{ all -> 0x0150 }
            r13.disconnect()     // Catch:{ all -> 0x0150 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0150 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016f }
            X.0lZ r0 = new X.0lZ
            r0.<init>(r9, r12)
            r8.post(r0)
            return r2
        L_0x0127:
            r3 = move-exception
            boolean r2 = r14.get()     // Catch:{ all -> 0x0145 }
            if (r2 == 0) goto L_0x0144
            java.lang.String r2 = "GoogleBackupApi/upload-file/aborted"
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x0145 }
            A04(r9, r11, r0)     // Catch:{ all -> 0x0150 }
            goto L_0x013a
        L_0x0137:
            A04(r9, r11, r0)     // Catch:{ all -> 0x0150 }
        L_0x013a:
            r13.disconnect()     // Catch:{ all -> 0x0150 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0150 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016f }
            goto L_0x017f
        L_0x0144:
            throw r3     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r2 = move-exception
            A04(r9, r11, r0)     // Catch:{ all -> 0x0150 }
            r13.disconnect()     // Catch:{ all -> 0x0150 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r1 = move-exception
            goto L_0x0166
        L_0x0152:
            r10.close()     // Catch:{ FileNotFoundException -> 0x0189, IOException -> 0x0156 }
            goto L_0x0159
        L_0x0156:
            r1 = move-exception
            r12 = r11
            goto L_0x0178
        L_0x0159:
            return r11
        L_0x015a:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-during-seek"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0164 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0189, IOException -> 0x0176, all -> 0x0174 }
            return r11
        L_0x0164:
            r1 = move-exception
            r12 = 0
        L_0x0166:
            r10.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016f }
        L_0x016f:
            r1 = move-exception
            goto L_0x0178
        L_0x0171:
            r0 = move-exception
            r11 = r12
            goto L_0x018a
        L_0x0174:
            r1 = move-exception
            throw r1
        L_0x0176:
            r1 = move-exception
            r12 = 0
        L_0x0178:
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x018d }
            if (r12 == 0) goto L_0x0187
        L_0x017f:
            X.0lZ r0 = new X.0lZ
            r0.<init>(r9, r12)
            r8.post(r0)
        L_0x0187:
            r0 = 0
            return r0
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            throw r0     // Catch:{ all -> 0x018b }
        L_0x018b:
            r1 = move-exception
            goto L_0x018f
        L_0x018d:
            r1 = move-exception
            r11 = r12
        L_0x018f:
            if (r11 == 0) goto L_0x0199
            X.0lZ r0 = new X.0lZ
            r0.<init>(r9, r11)
            r8.post(r0)
        L_0x0199:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YT.A0E(java.lang.String, long):X.0UI");
    }

    public String A0H() {
        C17390vS A0A2;
        Throwable th;
        Object obj;
        AnonymousClass0UO r5 = this.A08;
        if (!this.A05.A06()) {
            return null;
        }
        try {
            A0A2 = A0A();
            int Az6 = A0A2.Az6();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupApi/upload-file status of the response is ");
            A0o.append(Az6);
            A0o.append(" response ");
            Log.d(AnonymousClass000.A0X(A0A2.BCG(), A0o));
            if (Az6 == 200) {
                A0A2.B5t();
                List BFa = A0A2.BFa("Location");
                if (BFa == null || BFa.size() != 1) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("GoogleBackupApi/upload-file exactly one location header should have been returned by Google drive, it returned ");
                    if (BFa == null) {
                        obj = "no";
                    } else {
                        obj = Integer.valueOf(BFa.size());
                    }
                    A0o2.append(obj);
                    Log.e(AnonymousClass000.A0X(" headers.", A0o2));
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("GoogleBackupApi/upload-file value of location header is ");
                    Log.d(AnonymousClass000.A0X(AnonymousClass001.A0n(BFa, 0), A0o3));
                    Log.d("GoogleBackupApi/upload-file received url to do resumable uploading.");
                    String A0n = AnonymousClass001.A0n(BFa, 0);
                    this.A04.A04(this.A0E, r5.A06, A0n);
                    A0A2.close();
                    return A0n;
                }
            } else if (Az6 == 401) {
                this.A07.A0H();
            } else {
                if (Az6 == 403) {
                    Log.e(AnonymousClass000.A0V("GoogleBackupApi/api disabled upload-file ", A0A2.B7O(), AnonymousClass001.A0o()));
                    th = new AnonymousClass0EL();
                } else if (Az6 == 404) {
                    th = new AnonymousClass0EI(A0A2.B7O());
                } else if (Az6 == 429) {
                    C06380Xl.A01(A0A2, "upload-file", C06520Ya.A0G(this.A0C));
                    th = AnonymousClass000.A0L();
                } else {
                    Log.e(AnonymousClass000.A0Y("GoogleBackupApi/upload-file/unexpected-response/", AnonymousClass001.A0o(), Az6));
                    String B7O = A0A2.B7O();
                    AnonymousClass0Y7.A02(this.A01, "upload-file", Az6);
                    th = new AnonymousClass0EU(B7O, -1);
                }
                throw th;
            }
            A0A2.close();
            return null;
        } catch (IOException e) {
            Log.e("GoogleBackupApi/upload-file", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final boolean A0I(FileInputStream fileInputStream, OutputStream outputStream, AtomicLong atomicLong) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            byte[] bArr = new byte[16384];
            while (this.A05.A06()) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read > 0) {
                    long j = (long) read;
                    atomicLong.addAndGet(j);
                    this.A03.BQe(j);
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    C624535b.A03(fileInputStream);
                    bufferedOutputStream.close();
                    return true;
                }
            }
            C624535b.A03(fileInputStream);
            bufferedOutputStream.close();
            return false;
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public AnonymousClass0YT(C55682qk r2, AnonymousClass0WN r3, C16410tE r4, AnonymousClass0QR r5, C04710Qi r6, C05580Ub r7, AnonymousClass0Y7 r8, AnonymousClass0UO r9, C29441ip r10, AnonymousClass310 r11, AnonymousClass5ZR r12, AnonymousClass1VX r13, AnonymousClass4FS r14, int i) {
        this.A0C = r13;
        this.A01 = r2;
        this.A0A = r11;
        this.A02 = r3;
        this.A04 = r5;
        this.A0B = r12;
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = i;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A0E = r8.A0G;
        this.A09 = r10;
        this.A0D = r14;
    }

    public static void A00(C17390vS r2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-util/log-response ");
        A0o.append(r2.Az6());
        AnonymousClass001.A1L(A0o);
        Log.d(AnonymousClass000.A0X(r2.BCG(), A0o));
    }

    public static void A07(HttpURLConnection httpURLConnection) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-util/log-response ");
        A0o.append(httpURLConnection.getResponseCode());
        AnonymousClass001.A1L(A0o);
        Log.d(AnonymousClass000.A0X(httpURLConnection.getResponseMessage(), A0o));
    }

    public static boolean A08(AnonymousClass310 r3, AnonymousClass5ZR r4, File file, String str, long j) {
        StringBuilder A0o;
        String str2;
        String A082 = AnonymousClass0YV.A08(r3, r4, file, j);
        if (str == null) {
            A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "gdrive-api/save-file/check-md5 ", A0o);
            str2 = " downloaded but its remote md5 is null.";
        } else if (str.equals(A082)) {
            return true;
        } else {
            A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "gdrive-api/save-file/check-md5 ", A0o);
            A0o.append(" downloaded but its MD5(");
            A0o.append(A082);
            A0o.append(") does not match remote md5(");
            A0o.append(str);
            str2 = ").";
        }
        Log.e(AnonymousClass000.A0X(str2, A0o));
        return false;
    }

    public final C17390vS A0A() {
        String A012;
        String str;
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("/upload/v1/clients/wa/backups/");
            C05580Ub r4 = this.A06;
            A0o.append(r4.A0B);
            A0o.append("/files/");
            AnonymousClass0UO r0 = this.A08;
            String replaceAll = new URI("https", (String) null, "backup.googleapis.com", -1, AnonymousClass000.A0X(r0.A06, A0o), (String) null, (String) null).toASCIIString().replaceAll("\\+", "%2B");
            Log.d("GoogleBackupApi/createNewResumableUpload");
            HashMap hashMap = new HashMap(2);
            String A022 = r4.A02();
            C626936e.A06(A022);
            hashMap.put("transaction_id", A022);
            hashMap.put("retryCount", Integer.toString(this.A00));
            hashMap.put("uploadType", "resumable");
            AnonymousClass0UF r1 = r0.A02;
            if (r1 == null) {
                A012 = null;
            } else {
                A012 = r1.A01();
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("{\"mimeType\":\"application/binary\"");
            if (A012 != null) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append(",\"metadata\":\"");
                A0o3.append(A012);
                str = AnonymousClass000.A0X("\"", A0o3);
            } else {
                str = "";
            }
            A0o2.append(str);
            String A0g = AnonymousClass000.A0g(A0o2);
            HttpsURLConnection A0D2 = this.A07.A0D("PUT", replaceAll, "application/json; charset=UTF-8", hashMap, true);
            A0D2.setRequestProperty("X-Upload-Content-Length", Long.toString(r0.A01()));
            A0D2.getURL();
            A0D2.getRequestMethod();
            A0D2.connect();
            A0D2.getOutputStream().write(A0g.getBytes());
            A07(A0D2);
            return new C02130Ez(A0D2);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    public final AnonymousClass0UI A0F(String str, String str2, long j) {
        if (TextUtils.isEmpty(str)) {
            Log.e("GoogleBackupApi/upload-file/unexpected-response/file-uploaded-but-no-entity-in-response");
            return null;
        }
        try {
            AnonymousClass0UI A002 = AnonymousClass0UI.A00(this.A02, (String) null, str2, new JSONObject(str), j);
            if (A002 != null) {
                Log.d("GoogleBackupApi/upload-file uploaded successfully.");
                return A002;
            }
            Log.e("GoogleBackupApi/upload-file/some attributes are missing");
            return A002;
        } catch (JSONException e) {
            Log.e(AnonymousClass000.A0V("GoogleBackupApi/upload-file/malformed-json-response/", str, AnonymousClass001.A0o()), e);
            return null;
        }
    }

    public AnonymousClass0UI A0G(HttpsURLConnection httpsURLConnection, int i, long j) {
        A07(httpsURLConnection);
        if (i == 200 || i == 201) {
            String A002 = AnonymousClass0Y7.A00(httpsURLConnection);
            String str = this.A08.A06;
            AnonymousClass0UI A0F2 = A0F(A002, str, j);
            if (A0F2 != null) {
                Log.d("GoogleBackupApi/upload-file uploaded successfully.");
                this.A04.A03(this.A0E, str);
            }
            return A0F2;
        } else if (i == 401) {
            Log.i("GoogleBackupApi/upload-file/unauthorized");
            this.A07.A0H();
            return null;
        } else if (i == 403) {
            this.A04.A03(this.A0E, this.A08.A06);
            Log.e(AnonymousClass000.A0V("GoogleBackupApi/api disabled upload-file ", C624535b.A00(httpsURLConnection.getErrorStream()), AnonymousClass001.A0o()));
            throw new AnonymousClass0EL();
        } else if (i == 429) {
            C06380Xl.A03("upload-file", httpsURLConnection, C06520Ya.A0G(this.A0C));
            throw AnonymousClass000.A0L();
        } else {
            String A003 = C624535b.A00(httpsURLConnection.getErrorStream());
            Log.i(AnonymousClass000.A0V("GoogleBackupApi/upload-file/unexpected-response/", A003, AnonymousClass001.A0o()));
            AnonymousClass0Y7.A02(this.A01, "upload-file", i);
            throw new AnonymousClass0EU(A003, -1);
        }
    }
}
