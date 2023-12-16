package X;

import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.3cE  reason: invalid class name and case insensitive filesystem */
public class C71513cE implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C71513cE(FirebaseInstanceId firebaseInstanceId, AnonymousClass2ZF r6, long j) {
        this.A04 = 0;
        this.A02 = firebaseInstanceId;
        this.A03 = r6;
        this.A00 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) A01().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A01 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context A01() {
        C161757qO r0 = ((FirebaseInstanceId) this.A02).A01;
        r0.A02();
        return r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ee, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C160637o2.A00(r10), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fa, code lost:
        if (r4.A0B(r1) != false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fc, code lost:
        r12 = com.google.firebase.iid.FirebaseInstanceId.A01();
        r11 = r4.A06;
        r8 = r1.A01;
        r7 = X.AnonymousClass002.A08();
        r7.putString("gcm.topic", A00("/topics/", r15));
        r7.putString("delete", "1");
        X.C18290x4.A1J(r11.A00(r7, r12, r8, A00("/topics/", r15)), r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0229, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022b, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0238, code lost:
        if (r7.equals("S") == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023a, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C160637o2.A00(r10), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0246, code lost:
        if (r4.A0B(r1) != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0248, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A01();
        r12 = r1.A01;
        r11 = r4.A06;
        r8 = X.AnonymousClass002.A08();
        r8.putString("gcm.topic", A00("/topics/", r15));
        X.C18290x4.A1J(r11.A00(r8, r13, r12, A00("/topics/", r15)), r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x026e, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0270, code lost:
        android.util.Log.d("FirebaseInstanceId", "subscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r7 = (X.C152017Xf) r2.A02.remove(java.lang.Integer.valueOf(r2.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r8 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0287, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r12 = r8.A01;
        r13 = X.AnonymousClass0x9.A0v(r12, "topic_operation_queue");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x029b, code lost:
        if (r13.startsWith(A00(",", r14)) == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        X.C18270x1.A0j(r12.edit(), "topic_operation_queue", X.C18320x8.A0f(A00(",", r14), r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r2.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b3, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b4, code lost:
        if (r7 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r7.A00((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r0 = X.AnonymousClass002.A0C("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c4, code lost:
        r0 = X.AnonymousClass002.A0C("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02cc, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02d7, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r2.getMessage()) != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e9, code lost:
        if (r2.getMessage() == null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02eb, code lost:
        r0 = "Topic operation failed without exception message. Will retry Topic operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ef, code lost:
        r2 = r2.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 53);
        r1.append("Topic operation failed: ");
        r1.append(r2);
        r0 = X.AnonymousClass000.A0X(". Will retry Topic operation.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r3 == -1206) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0323, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0350, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r2 = r0.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 93);
        r1.append("Topic sync or token retrieval failed on hard failure exceptions: ");
        r1.append(r2);
        android.util.Log.e("FirebaseInstanceId", X.AnonymousClass000.A0X(". Won't retry the operation.", r1));
        ((com.google.firebase.iid.FirebaseInstanceId) r3.A02).A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07d6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07e3, code lost:
        if (X.C59592xA.A00().A01(A01()) != false) goto L_0x07e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07e5, code lost:
        ((android.os.PowerManager.WakeLock) r3.A01).release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07ec, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x080a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x080b, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x080e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r8 = r14.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d4, code lost:
        if (r8.length != 2) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d6, code lost:
        r7 = r8[0];
        r15 = r8[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (r1 == 83) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e4, code lost:
        if (r1 != 85) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ec, code lost:
        if (r7.equals("U") == false) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r3 = r27
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x03d7;
                case 2: goto L_0x05e4;
                case 3: goto L_0x060a;
                case 4: goto L_0x0394;
                case 5: goto L_0x061f;
                case 6: goto L_0x077d;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x079e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r3.A01
            X.3Ql r6 = (X.C67733Ql) r6
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            long r0 = r3.A00
            java.lang.Object r8 = r3.A03
            X.2a1 r8 = (X.C45442a1) r8
            com.whatsapp.jid.DeviceJid r2 = X.C618932r.A00(r4)
            X.C626936e.A06(r2)
            X.2ov r3 = X.AnonymousClass36G.A02(r2)
            X.6kD r2 = X.C135156kD.A00
            X.2oh r7 = X.C54422oh.A00(r3, r2)
            X.33n r5 = r6.A01
            byte[] r3 = r8.A02
            X.3G2 r2 = new X.3G2
            r2.<init>(r4, r6, r0)
            X.2ex r0 = r5.A05(r2, r7, r3)
            int r3 = r0.A00
            if (r3 == 0) goto L_0x0070
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl error while decrypt-group-using-fast-fatchet; status="
            X.C18260x0.A0z(r0, r1, r3)
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r3 == r0) goto L_0x0059
            r0 = -1203(0xfffffffffffffb4d, float:NaN)
            if (r3 == r0) goto L_0x0059
            r0 = -1202(0xfffffffffffffb4e, float:NaN)
            if (r3 == r0) goto L_0x0059
            r0 = -1204(0xfffffffffffffb4c, float:NaN)
            if (r3 == r0) goto L_0x0059
            r0 = -1205(0xfffffffffffffb4b, float:NaN)
            if (r3 == r0) goto L_0x0059
            r1 = -1206(0xfffffffffffffb4a, float:NaN)
            r0 = 0
            if (r3 != r1) goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            r2 = 0
            if (r0 != 0) goto L_0x0061
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r3 != r0) goto L_0x0070
        L_0x0061:
            X.33o r1 = r6.A03
            X.2qF r0 = r5.A07
            int r0 = r0.A01()
            byte[] r0 = X.AnonymousClass36A.A01(r0)
            r1.A0U(r4, r0, r2)
        L_0x0070:
            return
        L_0x0071:
            X.2xA r1 = X.C59592xA.A00()
            android.content.Context r0 = r3.A01()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.acquire()
        L_0x0086:
            r5 = 0
            java.lang.Object r4 = r3.A02     // Catch:{ IOException -> 0x0350 }
            com.google.firebase.iid.FirebaseInstanceId r4 = (com.google.firebase.iid.FirebaseInstanceId) r4     // Catch:{ IOException -> 0x0350 }
            r0 = 1
            r4.A0A(r0)     // Catch:{ IOException -> 0x0350 }
            X.7o2 r0 = r4.A03     // Catch:{ IOException -> 0x0350 }
            int r0 = r0.A02()     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x034c
            X.2xA r2 = X.C59592xA.A00()     // Catch:{ IOException -> 0x0350 }
            android.content.Context r1 = r3.A01()     // Catch:{ IOException -> 0x0350 }
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r1.checkCallingOrSelfPermission(r0)     // Catch:{ IOException -> 0x0350 }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0350 }
            r2.A01 = r0     // Catch:{ IOException -> 0x0350 }
        L_0x00b3:
            java.lang.Boolean r0 = r2.A00     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x00c9
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x0350 }
        L_0x00c9:
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x00eb
            android.content.Context r1 = r3.A01()     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ IOException -> 0x0350 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x0329
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x0329
            boolean r0 = r0.isConnected()     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x0329
        L_0x00eb:
            java.lang.String r6 = "FirebaseInstanceId"
            X.7qO r10 = r4.A01     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = X.C160637o2.A00(r10)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r9 = "*"
            X.7gn r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r4.A0B(r1)     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = X.C160637o2.A00(r10)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r2 = r4.A05(r0, r9)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            if (r2 != 0) goto L_0x0110
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r6, r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            goto L_0x0316
        L_0x0110:
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r7)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "Token successfully retrieved"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
        L_0x011c:
            if (r1 == 0) goto L_0x0126
            java.lang.String r0 = r1.A01     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            if (r0 != 0) goto L_0x01b0
        L_0x0126:
            java.lang.String r0 = "[DEFAULT]"
            r10.A02()     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r1 = r10.A04     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            if (r0 == 0) goto L_0x01b0
            boolean r0 = android.util.Log.isLoggable(r6, r7)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "Invoking onNewToken for app: "
            r10.A02()     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r0 = A00(r0, r1)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
        L_0x0145:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            android.content.Intent r8 = X.AnonymousClass0x9.A09(r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r0 = "token"
            r8.putExtra(r0, r2)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            android.content.Context r7 = r3.A01()     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r7, r0)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            r1.setAction(r2)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            java.lang.String r0 = "wrapped_intent"
            r1.putExtra(r0, r8)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            r7.sendBroadcast(r1)     // Catch:{ IOException -> 0x016a, SecurityException -> 0x0311 }
            goto L_0x01b0
        L_0x016a:
            r2 = move-exception
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x01ac
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0350 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0350 }
            int r0 = r0 + 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0350 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = "Token retrieval failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x0350 }
            r1.append(r2)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = ". Will retry token retrieval"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0350 }
            goto L_0x0313
        L_0x01ac:
            java.lang.String r0 = "Token retrieval failed without exception message. Will retry token retrieval"
            goto L_0x0313
        L_0x01b0:
            java.lang.Object r2 = r3.A03     // Catch:{ IOException -> 0x0350 }
            X.2ZF r2 = (X.AnonymousClass2ZF) r2     // Catch:{ IOException -> 0x0350 }
        L_0x01b4:
            monitor-enter(r2)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r14 = r2.A00()     // Catch:{ all -> 0x0326 }
            r11 = 1
            if (r14 != 0) goto L_0x01cb
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x0326 }
        L_0x01c8:
            monitor-exit(r2)     // Catch:{ all -> 0x0326 }
            goto L_0x034c
        L_0x01cb:
            monitor-exit(r2)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = "!"
            java.lang.String[] r8 = r14.split(r0)     // Catch:{ IOException -> 0x0350 }
            int r1 = r8.length     // Catch:{ IOException -> 0x0350 }
            r0 = 2
            if (r1 != r0) goto L_0x0276
            r7 = r8[r5]     // Catch:{ IOException -> 0x0350 }
            r15 = r8[r11]     // Catch:{ IOException -> 0x0350 }
            int r1 = r7.hashCode()     // Catch:{ IOException -> 0x02cc }
            r0 = 83
            if (r1 == r0) goto L_0x0232
            r0 = 85
            if (r1 != r0) goto L_0x0276
            java.lang.String r0 = "U"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = X.C160637o2.A00(r10)     // Catch:{ IOException -> 0x02cc }
            X.7gn r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x02cc }
            boolean r0 = r4.A0B(r1)     // Catch:{ IOException -> 0x02cc }
            if (r0 != 0) goto L_0x02bc
            java.lang.String r12 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x02cc }
            X.7Tn r11 = r4.A06     // Catch:{ IOException -> 0x02cc }
            java.lang.String r8 = r1.A01     // Catch:{ IOException -> 0x02cc }
            android.os.Bundle r7 = X.AnonymousClass002.A08()     // Catch:{ IOException -> 0x02cc }
            java.lang.String r13 = "/topics/"
            java.lang.String r1 = A00(r13, r15)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = "gcm.topic"
            r7.putString(r0, r1)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r1 = "delete"
            java.lang.String r0 = "1"
            r7.putString(r1, r0)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = A00(r13, r15)     // Catch:{ IOException -> 0x02cc }
            com.google.android.gms.tasks.Task r0 = r11.A00(r7, r12, r8, r0)     // Catch:{ IOException -> 0x02cc }
            X.C18290x4.A1J(r0, r4, r11)     // Catch:{ IOException -> 0x02cc }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "unsubscribe operation succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x02cc }
            goto L_0x0276
        L_0x0232:
            java.lang.String r0 = "S"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = X.C160637o2.A00(r10)     // Catch:{ IOException -> 0x02cc }
            X.7gn r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x02cc }
            boolean r0 = r4.A0B(r1)     // Catch:{ IOException -> 0x02cc }
            if (r0 != 0) goto L_0x02c4
            java.lang.String r13 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x02cc }
            java.lang.String r12 = r1.A01     // Catch:{ IOException -> 0x02cc }
            X.7Tn r11 = r4.A06     // Catch:{ IOException -> 0x02cc }
            android.os.Bundle r8 = X.AnonymousClass002.A08()     // Catch:{ IOException -> 0x02cc }
            java.lang.String r7 = "/topics/"
            java.lang.String r1 = A00(r7, r15)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = "gcm.topic"
            r8.putString(r0, r1)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = A00(r7, r15)     // Catch:{ IOException -> 0x02cc }
            com.google.android.gms.tasks.Task r0 = r11.A00(r8, r13, r12, r0)     // Catch:{ IOException -> 0x02cc }
            X.C18290x4.A1J(r0, r4, r11)     // Catch:{ IOException -> 0x02cc }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "subscribe operation succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x02cc }
        L_0x0276:
            monitor-enter(r2)     // Catch:{ IOException -> 0x0350 }
            java.util.Map r1 = r2.A02     // Catch:{ all -> 0x0323 }
            int r0 = r2.A00     // Catch:{ all -> 0x0323 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0323 }
            java.lang.Object r7 = r1.remove(r0)     // Catch:{ all -> 0x0323 }
            X.7Xf r7 = (X.C152017Xf) r7     // Catch:{ all -> 0x0323 }
            X.7nI r8 = r2.A01     // Catch:{ all -> 0x0321 }
            monitor-enter(r8)     // Catch:{ all -> 0x0321 }
            android.content.SharedPreferences r12 = r8.A01     // Catch:{ all -> 0x031c }
            java.lang.String r11 = "topic_operation_queue"
            java.lang.String r13 = X.AnonymousClass0x9.A0v(r12, r11)     // Catch:{ all -> 0x031c }
            java.lang.String r1 = ","
            java.lang.String r0 = A00(r1, r14)     // Catch:{ all -> 0x031e }
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x031e }
            if (r0 == 0) goto L_0x02ac
            java.lang.String r0 = A00(r1, r14)     // Catch:{ all -> 0x031e }
            java.lang.String r1 = X.C18320x8.A0f(r0, r13)     // Catch:{ all -> 0x031e }
            android.content.SharedPreferences$Editor r0 = r12.edit()     // Catch:{ all -> 0x031c }
            X.C18270x1.A0j(r0, r11, r1)     // Catch:{ all -> 0x031c }
        L_0x02ac:
            monitor-exit(r8)     // Catch:{ all -> 0x031e }
            int r0 = r2.A00     // Catch:{ all -> 0x0323 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x0323 }
            monitor-exit(r2)     // Catch:{ all -> 0x0323 }
            if (r7 == 0) goto L_0x01b4
            r0 = 0
            r7.A00(r0)     // Catch:{ IOException -> 0x0350 }
            goto L_0x01b4
        L_0x02bc:
            java.lang.String r0 = "token not available"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x02cc }
            goto L_0x02cb
        L_0x02c4:
            java.lang.String r0 = "token not available"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x02cc }
        L_0x02cb:
            throw r0     // Catch:{ IOException -> 0x02cc }
        L_0x02cc:
            r2 = move-exception
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x02ef
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x02ef
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L_0x0313
        L_0x02ee:
            throw r2     // Catch:{ IOException -> 0x0350 }
        L_0x02ef:
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0350 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0350 }
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0350 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = "Topic operation failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x0350 }
            r1.append(r2)     // Catch:{ IOException -> 0x0350 }
            java.lang.String r0 = ". Will retry Topic operation."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0350 }
            goto L_0x0313
        L_0x0311:
            java.lang.String r0 = "Token retrieval failed with SecurityException. Will retry token retrieval"
        L_0x0313:
            android.util.Log.e(r6, r0)     // Catch:{ IOException -> 0x0350 }
        L_0x0316:
            long r0 = r3.A00     // Catch:{ IOException -> 0x0350 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0350 }
            goto L_0x037e
        L_0x031c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x031e }
        L_0x031e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x031e }
            throw r0     // Catch:{ all -> 0x0321 }
        L_0x0321:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0323 }
        L_0x0323:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0323 }
            goto L_0x0328
        L_0x0326:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0326 }
        L_0x0328:
            throw r0     // Catch:{ IOException -> 0x0350 }
        L_0x0329:
            X.0xR r2 = new X.0xR     // Catch:{ IOException -> 0x0350 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0350 }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x0350 }
            if (r0 == 0) goto L_0x033b
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Connectivity change received registered"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x0350 }
        L_0x033b:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ IOException -> 0x0350 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0350 }
            X.3cE r0 = r2.A00     // Catch:{ IOException -> 0x0350 }
            android.content.Context r0 = r0.A01()     // Catch:{ IOException -> 0x0350 }
            r0.registerReceiver(r2, r1)     // Catch:{ IOException -> 0x0350 }
            goto L_0x037e
        L_0x034c:
            r4.A0A(r5)     // Catch:{ IOException -> 0x0350 }
            goto L_0x037e
        L_0x0350:
            r0 = move-exception
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x07d6 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07d6 }
            int r0 = r0.length()     // Catch:{ all -> 0x07d6 }
            int r0 = r0 + 93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x07d6 }
            java.lang.String r0 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r1.append(r0)     // Catch:{ all -> 0x07d6 }
            r1.append(r2)     // Catch:{ all -> 0x07d6 }
            java.lang.String r0 = ". Won't retry the operation."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x07d6 }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x07d6 }
            java.lang.Object r0 = r3.A02     // Catch:{ all -> 0x07d6 }
            com.google.firebase.iid.FirebaseInstanceId r0 = (com.google.firebase.iid.FirebaseInstanceId) r0     // Catch:{ all -> 0x07d6 }
            r0.A0A(r5)     // Catch:{ all -> 0x07d6 }
        L_0x037e:
            X.2xA r1 = X.C59592xA.A00()
            android.content.Context r0 = r3.A01()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
            return
        L_0x0394:
            java.lang.Object r9 = r3.A01
            X.34x r9 = (X.C624134x) r9
            java.lang.Object r11 = r3.A02
            X.4uZ r11 = (X.C95814uZ) r11
            java.lang.Object r10 = r3.A03
            X.1QL r10 = (X.AnonymousClass1QL) r10
            long r1 = r3.A00
            if (r9 == 0) goto L_0x0070
            java.lang.Long r0 = X.C624134x.A0A(r9)
            if (r0 == 0) goto L_0x03cd
            if (r11 == 0) goto L_0x03cd
            X.2sd r3 = r10.A0C
            X.2sH r0 = r10.A06
            long r5 = r0.A0H()
            long r7 = r9.A1L
            java.lang.String r4 = "reminder content"
            X.2z0 r0 = X.C56832sd.A00(r11, r3)
            X.1nx r3 = new X.1nx
            r3.<init>(r0, r5)
            r3.A00 = r7
            r3.A02 = r4
            r3.A01 = r1
            X.3Lv r0 = r10.A0A
            r0.A08(r3)
        L_0x03cd:
            X.2W4 r0 = r10.A0B
            X.3dV r0 = r0.A00
            X.4Fq r5 = r0.A04()
            goto L_0x07ed
        L_0x03d7:
            java.lang.Object r10 = r3.A01
            X.2oH r10 = (X.C54162oH) r10
            java.lang.Object r9 = r3.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r11 = r3.A03
            byte[] r11 = (byte[]) r11
            X.2q2 r8 = r10.A05
            android.content.SharedPreferences r0 = r8.A00()
            java.lang.String r13 = "blinding_factor_string"
            r6 = 0
            java.lang.String r0 = r0.getString(r13, r6)
            r5 = 8
            r12 = 0
            if (r0 == 0) goto L_0x0481
            byte[] r4 = android.util.Base64.decode(r0, r5)
        L_0x03f9:
            r1 = 4
            r7 = 0
            if (r4 != 0) goto L_0x0409
            java.lang.String r0 = "ACSToken/processSignedBlindedToken blinding factor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r1)
        L_0x0405:
            r10.A02(r7)
            return
        L_0x0409:
            monitor-enter(r10)
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = r10.A01     // Catch:{ all -> 0x05e1 }
            if (r3 != 0) goto L_0x0415
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x05e1 }
            r3.<init>()     // Catch:{ all -> 0x05e1 }
            r10.A01 = r3     // Catch:{ all -> 0x05e1 }
        L_0x0415:
            monitor-exit(r10)     // Catch:{ all -> 0x05e1 }
            int r2 = r9.length
            int r1 = r4.length
            int r0 = r11.length
            r14 = r3
            r15 = r9
            r16 = r2
            r17 = r4
            r18 = r1
            r19 = r11
            r20 = r0
            byte[] r3 = r14.A01(r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x0478
            int r2 = r3.length
            r4 = 1
            if (r2 == r4) goto L_0x0478
            boolean r0 = r10.A0G
            android.content.SharedPreferences r1 = r8.A00()
            if (r0 == 0) goto L_0x0447
            java.lang.String r0 = "next_original_token_string"
            java.lang.String r6 = r1.getString(r0, r6)
        L_0x043e:
            if (r6 == 0) goto L_0x046f
            byte[] r5 = android.util.Base64.decode(r6, r5)
            if (r5 == 0) goto L_0x046f
            goto L_0x044f
        L_0x0447:
            java.lang.String r0 = "original_token_string"
            java.lang.String r6 = r1.getString(r0, r6)
            goto L_0x043e
        L_0x044f:
            java.lang.String r0 = "SHA-512"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0463 }
            int r0 = r5.length     // Catch:{ NoSuchAlgorithmException -> 0x0463 }
            r1.update(r5, r7, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0463 }
            r1.update(r3, r7, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0463 }
            byte[] r4 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0463 }
            if (r4 == 0) goto L_0x0469
            goto L_0x0484
        L_0x0463:
            r1 = move-exception
            java.lang.String r0 = "ACSToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0469:
            r0 = 14
            r8.A01(r0)
            goto L_0x0405
        L_0x046f:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r4)
            goto L_0x0405
        L_0x0478:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r5)
            goto L_0x0405
        L_0x0481:
            r4 = r6
            goto L_0x03f9
        L_0x0484:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken got a new pair of originalToken and SharedSecret"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r10)
            java.lang.String r3 = "redeem_count"
            r8.A02(r3, r7)     // Catch:{ all -> 0x05de }
            r2 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "shared_secret_string"
            r8.A04(r0, r1)     // Catch:{ all -> 0x05de }
            X.2sH r0 = r10.A07     // Catch:{ all -> 0x05de }
            long r0 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x05de }
            java.lang.String r11 = "base_timestamp"
            r8.A03(r11, r0)     // Catch:{ all -> 0x05de }
            r8.A04(r13, r12)     // Catch:{ all -> 0x05de }
            boolean r0 = r10.A0G     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x04bc
            java.lang.String r0 = "original_token_string"
            r8.A04(r0, r6)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "next_original_token_string"
            r8.A04(r0, r12)     // Catch:{ all -> 0x05de }
            r10.A0G = r7     // Catch:{ all -> 0x05de }
        L_0x04bc:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05de }
            X.5IH r11 = r10.A04     // Catch:{ all -> 0x05de }
            r0 = 0
            long r15 = r17 - r0
            long r0 = r10.A0D     // Catch:{ all -> 0x05de }
            long r17 = r17 - r0
            int r0 = r10.A0B     // Catch:{ all -> 0x05de }
            long r0 = (long) r0     // Catch:{ all -> 0x05de }
            int r12 = r10.A02     // Catch:{ all -> 0x05de }
            r14 = 1
            X.1aH r13 = new X.1aH     // Catch:{ all -> 0x05de }
            r13.<init>()     // Catch:{ all -> 0x05de }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x05de }
            r13.A03 = r14     // Catch:{ all -> 0x05de }
            java.lang.Long r14 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x05de }
            r13.A04 = r14     // Catch:{ all -> 0x05de }
            java.lang.Long r14 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x05de }
            r13.A06 = r14     // Catch:{ all -> 0x05de }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x05de }
            r13.A05 = r0     // Catch:{ all -> 0x05de }
            X.1iO r0 = r11.A00     // Catch:{ all -> 0x05de }
            boolean r0 = r0.A00     // Catch:{ all -> 0x05de }
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05de }
            r13.A01 = r0     // Catch:{ all -> 0x05de }
            X.1im r0 = r11.A01     // Catch:{ all -> 0x05de }
            int r1 = r0.A04     // Catch:{ all -> 0x05de }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ all -> 0x05de }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05de }
            r13.A00 = r0     // Catch:{ all -> 0x05de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05de }
            r13.A02 = r0     // Catch:{ all -> 0x05de }
            X.4FV r12 = r11.A02     // Catch:{ all -> 0x05de }
            r12.BhD(r13)     // Catch:{ all -> 0x05de }
            r0 = 0
            r10.A0E = r0     // Catch:{ all -> 0x05de }
            r10.A0H = r0     // Catch:{ all -> 0x05de }
            r10.A0B = r7     // Catch:{ all -> 0x05de }
            r10.A0F = r7     // Catch:{ all -> 0x05de }
            r0 = 0
            r10.A0D = r0     // Catch:{ all -> 0x05de }
            r8.A01(r7)     // Catch:{ all -> 0x05de }
            X.5II r11 = new X.5II     // Catch:{ all -> 0x05de }
            r11.<init>(r5, r4, r7)     // Catch:{ all -> 0x05de }
            android.content.SharedPreferences r0 = r8.A00()     // Catch:{ all -> 0x05de }
            int r7 = X.C18310x6.A03(r0, r3)     // Catch:{ all -> 0x05de }
            X.1VX r5 = r10.A08     // Catch:{ all -> 0x05de }
            r1 = 1143(0x477, float:1.602E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x05de }
            boolean r0 = r5.A0Y(r0, r1)     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x0562
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05de }
            java.lang.String r0 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ all -> 0x05de }
            r1.append(r0)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x05de }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x05de }
            X.1Wt r0 = new X.1Wt     // Catch:{ all -> 0x05de }
            r0.<init>()     // Catch:{ all -> 0x05de }
            r0.A01 = r1     // Catch:{ all -> 0x05de }
            r0.A00 = r6     // Catch:{ all -> 0x05de }
            r12.BhD(r0)     // Catch:{ all -> 0x05de }
        L_0x0562:
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A00     // Catch:{ all -> 0x05de }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x05de }
        L_0x0568:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x05d9
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x05de }
            X.2aX r9 = (X.C45762aX) r9     // Catch:{ all -> 0x05de }
            java.lang.String r6 = r10.A0A     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "ACSTokenProviderImpl/onNewTokenIssued: new ACS token issued"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x05de }
            java.lang.ref.WeakReference r0 = r9.A02     // Catch:{ all -> 0x05de }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x05de }
            X.66T r12 = (X.AnonymousClass66T) r12     // Catch:{ all -> 0x05de }
            if (r12 == 0) goto L_0x05ce
            byte[] r5 = r11.A01     // Catch:{ Exception -> 0x05b9 }
            if (r5 == 0) goto L_0x05b3
            byte[] r0 = r11.A02     // Catch:{ Exception -> 0x05b9 }
            if (r0 == 0) goto L_0x05b3
            X.3Cx r0 = r9.A03     // Catch:{ Exception -> 0x05b9 }
            java.lang.String r4 = r0.A00(r11)     // Catch:{ Exception -> 0x05b9 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x05b9 }
            if (r0 == 0) goto L_0x059e
            r0 = 2
            r12.BeB(r0)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05ce
        L_0x059e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x05b9 }
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ Exception -> 0x05b9 }
            r1.append(r0)     // Catch:{ Exception -> 0x05b9 }
            java.lang.String r0 = "+"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ Exception -> 0x05b9 }
            r12.BeC(r0)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05ce
        L_0x05b3:
            int r0 = r11.A00     // Catch:{ Exception -> 0x05b9 }
            r12.BeD(r0)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05ce
        L_0x05b9:
            java.lang.String r0 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued Error while fetching ACS token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05d4 }
            X.3Cx r0 = r9.A03     // Catch:{ all -> 0x05d4 }
            X.2qk r5 = r0.A00     // Catch:{ all -> 0x05d4 }
            java.lang.String r4 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued"
            java.lang.String r1 = "Error while fetching ACS token"
            r0 = 1
            r5.A0A(r4, r0, r1)     // Catch:{ all -> 0x05d4 }
            r0 = 5
            r12.BeB(r0)     // Catch:{ all -> 0x05d4 }
        L_0x05ce:
            r9.A00(r6)     // Catch:{ all -> 0x05de }
            int r7 = r7 + 1
            goto L_0x0568
        L_0x05d4:
            r0 = move-exception
            r9.A00(r6)     // Catch:{ all -> 0x05de }
            throw r0     // Catch:{ all -> 0x05de }
        L_0x05d9:
            r8.A02(r3, r7)     // Catch:{ all -> 0x05de }
            monitor-exit(r10)     // Catch:{ all -> 0x05de }
            return
        L_0x05de:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x05de }
            throw r0
        L_0x05e1:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x05e1 }
            throw r0
        L_0x05e4:
            java.lang.Object r0 = r3.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r0
            java.lang.Object r1 = r3.A02
            android.content.Context r1 = (android.content.Context) r1
            long r11 = r3.A00
            java.lang.Object r9 = r3.A03
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.2sH r5 = r0.A0S
            X.3Wi r2 = r0.A0A
            X.66r r3 = r0.A0H
            X.2sW r6 = r0.A0U
            X.2qK r8 = r0.A0X
            X.2rn r7 = r0.A0W
            r10 = 19
            X.8qC r0 = r0.A0n
            X.3LB r4 = X.C48062eH.A00(r0)
            X.AnonymousClass36T.A04(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x060a:
            java.lang.Object r0 = r3.A01
            X.2Vm r0 = (X.C44292Vm) r0
            java.lang.Object r2 = r3.A02
            X.239 r2 = (X.AnonymousClass239) r2
            java.lang.Object r1 = r3.A03
            X.2S3 r1 = (X.AnonymousClass2S3) r1
            long r3 = r3.A00
            X.2qg r0 = r0.A00
            r5 = 1
            r0.A04(r1, r2, r3, r5)
            return
        L_0x061f:
            java.lang.Object r5 = r3.A01
            X.2ry r5 = (X.C56432ry) r5
            java.lang.Object r14 = r3.A02
            byte[] r14 = (byte[]) r14
            java.lang.Object r10 = r3.A03
            byte[] r10 = (byte[]) r10
            X.2qn r4 = r5.A05
            android.content.SharedPreferences r0 = r4.A00()
            java.lang.String r11 = "blinding_factor"
            r8 = 0
            java.lang.String r0 = r0.getString(r11, r8)
            r13 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0641
            byte[] r8 = android.util.Base64.decode(r0, r13)
        L_0x0641:
            r9 = 4
            r2 = 0
            if (r8 != 0) goto L_0x0651
            java.lang.String r0 = "PrivateStatsToken/processSignedBlindedToken blindingFactor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A03(r9)
        L_0x064d:
            r5.A06(r2, r9)
            return
        L_0x0651:
            X.2sH r12 = r5.A03
            long r18 = android.os.SystemClock.elapsedRealtime()
            org.whispersystems.curve25519.NativeVOPRFExtension r7 = r5.A00
            if (r7 != 0) goto L_0x0662
            org.whispersystems.curve25519.NativeVOPRFExtension r7 = new org.whispersystems.curve25519.NativeVOPRFExtension
            r7.<init>()
            r5.A00 = r7
        L_0x0662:
            int r6 = r14.length
            int r1 = r8.length
            int r0 = r10.length
            r25 = r10
            r26 = r0
            r24 = r1
            r23 = r8
            r20 = r7
            r21 = r14
            r22 = r6
            byte[] r15 = r20.A01(r21, r22, r23, r24, r25, r26)
            long r16 = android.os.SystemClock.elapsedRealtime()
            if (r15 == 0) goto L_0x06e3
            int r14 = r15.length
            r6 = 1
            if (r14 == r6) goto L_0x06e3
            r8 = 2
            X.2gg r7 = r5.A04
            long r16 = r16 - r18
            X.1XZ r1 = new X.1XZ
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r1.A01 = r0
            X.4FV r0 = r7.A03
            r0.BhD(r1)
            boolean r0 = r5.A0E
            android.content.SharedPreferences r1 = r4.A00()
            if (r0 == 0) goto L_0x06b4
            java.lang.String r0 = "next_original_token"
        L_0x06a7:
            java.lang.String r10 = r1.getString(r0, r3)
            if (r10 == 0) goto L_0x06d9
            byte[] r13 = android.util.Base64.decode(r10, r13)
            if (r13 == 0) goto L_0x06d9
            goto L_0x06b8
        L_0x06b4:
            java.lang.String r0 = "original_token"
            goto L_0x06a7
        L_0x06b8:
            java.lang.String r0 = "SHA-512"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x06cc }
            int r0 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x06cc }
            r1.update(r13, r2, r0)     // Catch:{ NoSuchAlgorithmException -> 0x06cc }
            r1.update(r15, r2, r14)     // Catch:{ NoSuchAlgorithmException -> 0x06cc }
            byte[] r1 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x06cc }
            if (r1 == 0) goto L_0x06d2
            goto L_0x06ed
        L_0x06cc:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x06d2:
            r0 = 14
            r4.A03(r0)
            goto L_0x064d
        L_0x06d9:
            java.lang.String r0 = "PrivateStatsToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A03(r6)
            goto L_0x064d
        L_0x06e3:
            java.lang.String r0 = "PrivateStatsToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A03(r13)
            goto L_0x064d
        L_0x06ed:
            java.lang.String r0 = "PrivateStatsToken/processSignedBlindedToken got a new pair of originalToken and SharedSecret"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r5)
            r4.A02(r2)     // Catch:{ all -> 0x077a }
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x077a }
            java.lang.String r0 = "shared_secret"
            r4.A05(r0, r1)     // Catch:{ all -> 0x077a }
            X.3Mh r1 = r5.A01     // Catch:{ all -> 0x077a }
            X.1Ek r0 = X.C66663Mh.A07     // Catch:{ all -> 0x077a }
            int r9 = r1.A03(r0)     // Catch:{ all -> 0x077a }
            r1 = 10800(0x2a30, float:1.5134E-41)
            java.util.Random r0 = X.AnonymousClass0x9.A1C()     // Catch:{ all -> 0x077a }
            int r0 = r0.nextInt(r1)     // Catch:{ all -> 0x077a }
            int r9 = r9 - r0
            long r0 = (long) r9     // Catch:{ all -> 0x077a }
            java.lang.String r9 = "time_to_live"
            r4.A04(r9, r0)     // Catch:{ all -> 0x077a }
            long r0 = X.C56612sH.A00(r12)     // Catch:{ all -> 0x077a }
            java.lang.String r9 = "base_timestamp"
            r4.A04(r9, r0)     // Catch:{ all -> 0x077a }
            r4.A05(r11, r3)     // Catch:{ all -> 0x077a }
            boolean r0 = r5.A0E     // Catch:{ all -> 0x077a }
            if (r0 == 0) goto L_0x073a
            java.lang.String r0 = "original_token"
            r4.A05(r0, r10)     // Catch:{ all -> 0x077a }
            java.lang.String r0 = "next_original_token"
            r4.A05(r0, r3)     // Catch:{ all -> 0x077a }
            r5.A0E = r2     // Catch:{ all -> 0x077a }
        L_0x073a:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x077a }
            long r0 = r5.A0A     // Catch:{ all -> 0x077a }
            long r11 = r13 - r0
            long r0 = r5.A0B     // Catch:{ all -> 0x077a }
            long r13 = r13 - r0
            int r0 = r5.A09     // Catch:{ all -> 0x077a }
            long r0 = (long) r0     // Catch:{ all -> 0x077a }
            r10 = r6
            r15 = r0
            r9 = r7
            r9.A01(r10, r11, r13, r15)     // Catch:{ all -> 0x077a }
            r5.A0C = r3     // Catch:{ all -> 0x077a }
            r5.A0F = r3     // Catch:{ all -> 0x077a }
            r5.A09 = r2     // Catch:{ all -> 0x077a }
            r5.A0D = r2     // Catch:{ all -> 0x077a }
            r0 = 0
            r5.A0A = r0     // Catch:{ all -> 0x077a }
            r5.A0B = r0     // Catch:{ all -> 0x077a }
            android.content.SharedPreferences r7 = r4.A00()     // Catch:{ all -> 0x077a }
            java.lang.String r3 = "first_token_stage"
            int r3 = r7.getInt(r3, r2)     // Catch:{ all -> 0x077a }
            if (r3 != r6) goto L_0x0775
            r4.A01(r8)     // Catch:{ all -> 0x077a }
            java.lang.String r3 = "first_token_request_timestamp"
            r4.A04(r3, r0)     // Catch:{ all -> 0x077a }
            java.lang.String r3 = "first_token_delay_time"
            r4.A04(r3, r0)     // Catch:{ all -> 0x077a }
        L_0x0775:
            r4.A03(r2)     // Catch:{ all -> 0x077a }
            monitor-exit(r5)     // Catch:{ all -> 0x077a }
            return
        L_0x077a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x077a }
            throw r0
        L_0x077d:
            java.lang.Object r1 = r3.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            java.lang.Object r4 = r3.A02
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.Object r0 = r3.A03
            java.util.Formatter r0 = (java.util.Formatter) r0
            long r2 = r3.A00
            com.whatsapp.WaTextView r1 = r1.A04
            if (r1 != 0) goto L_0x0796
            java.lang.String r0 = "durationText"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0796:
            java.lang.String r0 = X.AnonymousClass5VT.A01(r4, r0, r2)
            r1.setText(r0)
            return
        L_0x079e:
            java.lang.Object r5 = r3.A01
            X.2rc r5 = (X.C56212rc) r5
            java.lang.Object r6 = r3.A02
            X.4uY r6 = (X.C95804uY) r6
            long r0 = r3.A00
            java.lang.Object r3 = r3.A03
            X.4GP r3 = (X.AnonymousClass4GP) r3
            X.2rZ r2 = r5.A08
            X.34x r2 = r2.A00(r6, r0)
            if (r2 == 0) goto L_0x07b8
            r3.invoke()
            return
        L_0x07b8:
            X.3RM r7 = new X.3RM
            r7.<init>(r3)
            r2 = 25
            long r0 = r0 - r2
            r3 = 99
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x07c8
            r0 = 99
        L_0x07c8:
            X.2nm r5 = r5.A0B
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r12 = 0
            r10 = 50
            r5.A00(r6, r7, r8, r9, r10, r12)
            return
        L_0x07d6:
            r2 = move-exception
            X.2xA r1 = X.C59592xA.A00()
            android.content.Context r0 = r3.A01()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x07ec
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
        L_0x07ec:
            throw r2
        L_0x07ed:
            android.content.ContentValues r4 = X.C18280x3.A09()     // Catch:{ all -> 0x0808 }
            X.C624134x.A0H(r4, r9)     // Catch:{ all -> 0x0808 }
            java.lang.String r0 = "scheduled_reminder_timestamp_ms"
            X.2sg r3 = X.AnonymousClass3H0.A02(r4, r5, r0, r1)     // Catch:{ all -> 0x0808 }
            java.lang.String r2 = "scheduled_reminder_message"
            r1 = 5
            java.lang.String r0 = "ScheduledReminderMessageStore/INSERT"
            r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x0808 }
            r5.close()
            return
        L_0x0808:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x080a }
        L_0x080a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71513cE.run():void");
    }

    public static String A00(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public C71513cE(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j;
    }
}
