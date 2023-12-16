package X;

import android.app.ActivityManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.2qk  reason: invalid class name and case insensitive filesystem */
public abstract class C55682qk {
    public static void A05(C55682qk r2, String str, Throwable th) {
        r2.A0A(str, true, th.getMessage());
    }

    public String A06() {
        StringBuilder A0o;
        C22121Ep r3 = (C22121Ep) this;
        C56972sr r2 = r3.A03;
        Me A00 = C56972sr.A00(r2);
        int A0D = r2.A0D();
        if (A00 != null) {
            A0o = AnonymousClass001.A0o();
            C18290x4.A1R(A0o, A00.jabber_id);
            A0o.append(A0D);
        } else {
            String replaceAll = AnonymousClass0x9.A0z(r2.A0D.A03()).replaceAll("\\W", "-");
            if (!replaceAll.equals("")) {
                return replaceAll;
            }
            AnonymousClass5UR A0R = r3.A06.A0R();
            if (A0R == null) {
                Log.w("crashlogs/get-from-parameter cr=null");
                return replaceAll;
            }
            String A01 = C627236i.A01(A0R);
            if (A01 == null || A01.length() < 6) {
                A01 = "123456";
            }
            A0o = AnonymousClass001.A0o();
            A0o.append("new-");
            A0o.append(A01.substring(A01.length() - 6));
        }
        return A0o.toString();
    }

    public String A07(String str) {
        int memoryClass;
        C22121Ep r1 = (C22121Ep) this;
        ActivityManager A06 = r1.A06.A06();
        if (A06 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A06.getMemoryClass();
        }
        r1.A0C.A03(r1.A07, AnonymousClass5V3.A00(), false);
        return C22121Ep.A01(str, memoryClass);
    }

    public String A08(String str, String str2, boolean z) {
        C22121Ep r2 = (C22121Ep) this;
        String str3 = str2;
        C18260x0.A0q("CrashLogs/Checking fb upload server status type=", str3, AnonymousClass001.A0o());
        AnonymousClass2CH r1 = new AnonymousClass2CH();
        C614230q r4 = new C614230q(r2.A04, new AnonymousClass4JV(r1, 1, r2), r2.A0B, "https://crashlogs.whatsapp.net/wa_fls_upload_check", r2.A0C.A00(), (String) null, 6, false, false, false);
        r4.A08("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
        r4.A08("from_jid", str);
        r4.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        r4.A08("support_exception_only_upload", String.valueOf(z));
        int A03 = r4.A03((AnonymousClass7US) null);
        if (A03 == 200) {
            return r1.A00;
        }
        if (A03 == 403) {
            r1.A00 = "no_upload";
            return "no_upload";
        } else if (A03 != 500) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unknown response code ");
            A0o.append(A03);
            throw AnonymousClass002.A0C(AnonymousClass000.A0X(" from crash upload server", A0o));
        } else {
            throw AnonymousClass002.A0C("Response 500 received from server");
        }
    }

    public void A09(String str, String str2, Throwable th) {
        Log.e(str, th);
        ((C22121Ep) this).A0E(new C73173f3(str, th), str, str2, AnonymousClass001.A0t(), true);
    }

    public void A0A(String str, boolean z, String str2) {
        HashMap A0t = AnonymousClass001.A0t();
        ((C22121Ep) this).A0E(new C73173f3(str), str, str2, A0t, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r1 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(java.util.HashSet r24, java.util.Map r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r23 = this;
            r0 = r23
            X.1Ep r0 = (X.C22121Ep) r0
            java.lang.String r13 = "crash-log/initial upload failure-serialize crash data"
            boolean r1 = com.whatsapp.util.Log.rotate()
            r12 = 0
            r5 = r27
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = "crash-log/whatsapp/no_file"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.String r1 = "no-file"
            r0.A0G(r5, r1)
        L_0x001a:
            return r12
        L_0x001b:
            r1 = 0
            r4 = r25
            r22 = r29
            java.io.File r7 = com.whatsapp.util.Log.compress()     // Catch:{ Exception -> 0x00f8, all -> 0x0143 }
            X.2eK r6 = r0.A0A     // Catch:{ Exception -> 0x00f8, all -> 0x0143 }
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 5242880(0x500000, float:7.34684E-39)
            if (r28 == 0) goto L_0x0030
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r2 = 41943040(0x2800000, float:1.880791E-37)
        L_0x0030:
            android.util.Pair r3 = X.C627536m.A02(r6, r7, r3, r2)     // Catch:{ Exception -> 0x00f8, all -> 0x0143 }
            java.lang.Object r2 = r3.first     // Catch:{ Exception -> 0x00f8, all -> 0x0143 }
            boolean r11 = X.AnonymousClass001.A1Z(r2)     // Catch:{ Exception -> 0x00f8, all -> 0x0143 }
            java.lang.Object r3 = r3.second     // Catch:{ Exception -> 0x00f6, all -> 0x0141 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ Exception -> 0x00f6, all -> 0x0141 }
            if (r3 == 0) goto L_0x0057
            java.lang.String r15 = r3.getPath()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r16 = r0.A06()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r17 = X.C22121Ep.A02(r24)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            r14 = r0
            r18 = r4
            r19 = r5
            r20 = r22
            boolean r12 = r14.A0H(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
        L_0x0057:
            if (r26 == 0) goto L_0x00bb
            java.io.File r7 = com.whatsapp.util.Log.logFile     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r9 = ".gz"
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            r6.<init>()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r10 = X.AnonymousClass342.A02(r1, r6)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r2 = r7.getName()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            r1 = 46
            int r1 = r2.indexOf(r1)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r1 = r2.substring(r1)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r8 = X.AnonymousClass000.A0T(r1, r9)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r9 = X.AnonymousClass342.A00(r7, r9, r6)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            int r1 = r10.length()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            int r6 = r1 + 1
            int r2 = r9.length()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            int r1 = r8.length()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            int r2 = r2 - r1
            if (r6 >= r2) goto L_0x00a0
            java.lang.String r1 = r9.substring(r6, r2)     // Catch:{ NumberFormatException -> 0x00a0 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00a0 }
            int r1 = r1 + 1
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ NumberFormatException -> 0x00a0 }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r6 = "1"
        L_0x00a2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r10)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r1 = "."
            java.lang.String r2 = X.AnonymousClass000.A0U(r1, r6, r8, r2)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.lang.String r1 = r7.getParent()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            java.io.File r1 = X.C18330xA.A04(r1, r2)     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            r1.createNewFile()     // Catch:{ Exception -> 0x00b8, all -> 0x0147 }
            goto L_0x00bb
        L_0x00b8:
            r6 = move-exception
            r1 = r3
            goto L_0x00fa
        L_0x00bb:
            if (r3 == 0) goto L_0x00ee
            if (r12 != 0) goto L_0x00ee
            long r1 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A0C(r3, r1)
            if (r6 == 0) goto L_0x00ee
            java.util.Map r18 = r0.A0D(r4)
            java.lang.String r15 = r6.getPath()
            java.lang.String r16 = r0.A06()
            java.lang.String r17 = X.C22121Ep.A02(r24)
            X.2Sq r14 = new X.2Sq
            r19 = r1
            r21 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            com.whatsapp.util.Log.d((java.lang.String) r13)
            r0.A0F(r14)
            android.os.Handler r2 = r0.A01
            r1 = 2
            X.C69983Zk.A01(r2, r0, r1)
        L_0x00ee:
            if (r11 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x001a
            r3.delete()
            return r12
        L_0x00f6:
            r6 = move-exception
            goto L_0x00fa
        L_0x00f8:
            r6 = move-exception
            r11 = 0
        L_0x00fa:
            java.lang.String r2 = "crash-log/failedupload"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x0145 }
            r0.A0G(r5, r2)     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x0139
            if (r12 != 0) goto L_0x0139
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A0C(r1, r2)
            if (r6 == 0) goto L_0x0139
            java.util.Map r18 = r0.A0D(r4)
            java.lang.String r15 = r6.getPath()
            java.lang.String r16 = r0.A06()
            java.lang.String r17 = X.C22121Ep.A02(r24)
            X.2Sq r14 = new X.2Sq
            r19 = r2
            r21 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            com.whatsapp.util.Log.d((java.lang.String) r13)
            r0.A0F(r14)
            android.os.Handler r3 = r0.A01
            r2 = 2
            X.C69983Zk.A01(r3, r0, r2)
        L_0x0139:
            if (r11 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            r1.delete()
            return r12
        L_0x0141:
            r7 = move-exception
            goto L_0x017c
        L_0x0143:
            r7 = move-exception
            throw r7
        L_0x0145:
            r7 = move-exception
            goto L_0x0149
        L_0x0147:
            r7 = move-exception
            r1 = r3
        L_0x0149:
            if (r1 == 0) goto L_0x017c
            if (r12 != 0) goto L_0x017c
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A0C(r1, r2)
            if (r6 == 0) goto L_0x017c
            java.util.Map r18 = r0.A0D(r4)
            java.lang.String r15 = r6.getPath()
            java.lang.String r16 = r0.A06()
            java.lang.String r17 = X.C22121Ep.A02(r24)
            X.2Sq r14 = new X.2Sq
            r19 = r2
            r21 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            com.whatsapp.util.Log.d((java.lang.String) r13)
            r0.A0F(r14)
            android.os.Handler r3 = r0.A01
            r2 = 2
            X.C69983Zk.A01(r3, r0, r2)
        L_0x017c:
            if (r11 == 0) goto L_0x0183
            if (r1 == 0) goto L_0x0183
            r1.delete()
        L_0x0183:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55682qk.A0B(java.util.HashSet, java.util.Map, boolean, boolean, boolean, boolean):boolean");
    }

    public static StringBuilder A03(C55682qk r0, String str, String str2, boolean z) {
        r0.A0A(str, z, str2);
        return new StringBuilder();
    }

    public static void A04(C55682qk r2, String str, Throwable th) {
        r2.A0A(str, true, th.getMessage());
    }
}
