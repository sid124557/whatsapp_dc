package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.HashSet;

/* renamed from: X.7aX  reason: invalid class name and case insensitive filesystem */
public class C153017aX {
    public AnonymousClass7OM A00;
    public C55682qk A01;
    public byte[] A02 = null;
    public final C620633i A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.A04.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireAuthResponse", r0);
        r10.A01.A0A("AutoconfManager/acquireAuthResponse", true, r0.getMessage());
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[ExcHandler: 6yP | RemoteException | IllegalArgumentException | SecurityException (r0v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A02(java.lang.String r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 != 0) goto L_0x0009
            java.lang.String r0 = "AutoconfManager/acquireAuthResponse/null authChallenge"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            return r9
        L_0x0009:
            X.7OM r0 = r10.A00
            if (r0 != 0) goto L_0x0010
            r10.A00()
        L_0x0010:
            r0 = 8
            byte[] r3 = android.util.Base64.decode(r11, r0)
            X.7RA r2 = new X.7RA
            r2.<init>()
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "challenge"
            r1.putByteArray(r0, r3)
            r2.A00()
            X.7OM r0 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.C626936e.A06(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.7OM r7 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.7AX r8 = new X.7AX     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r8.<init>(r1)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r0.<init>()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r6 = 0
            X.7bm r5 = r7.A04     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r5.A00(r8)     // Catch:{ Exception -> 0x003d, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0041
        L_0x003d:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0041:
            android.net.Uri r4 = r7.A01     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.7Sj r3 = r7.A02     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.content.ContentResolver r1 = r7.A00     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            java.lang.String r2 = "authenticate"
            android.os.Bundle r0 = r8.A00     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r0 = X.C160857oT.A00(r0)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r1 = X.C153907cE.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.7R9 r0 = r7.A03     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.C153907cE.A01(r1, r0, r2)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            if (r1 == 0) goto L_0x0063
            android.os.Bundle r0 = X.C160857oT.A00(r1)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.7AY r6 = new X.7AY     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0063:
            r5.A01(r6)     // Catch:{ Exception -> 0x0067, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0089
        L_0x0067:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x006c, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0089
        L_0x006c:
            r1 = move-exception
            X.7bm r0 = r7.A04     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r0.A08(r1)     // Catch:{ Exception -> 0x0073, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0077:
            throw r1     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            java.lang.String r3 = "AutoconfManager/acquireAuthResponse"
            com.whatsapp.util.Log.e(r3, r0)
            X.2qk r2 = r10.A01
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0A(r3, r0, r1)
            r6 = r9
        L_0x0089:
            if (r6 == 0) goto L_0x0008
            android.os.Bundle r2 = r6.A00
            java.lang.String r1 = "response"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x009a
            byte[] r9 = r2.getByteArray(r1)
            return r9
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153017aX.A02(java.lang.String):byte[]");
    }

    public final void A00() {
        PackageManager packageManager = this.A04.A00.getPackageManager();
        AnonymousClass5UR A0R = this.A03.A0R();
        AnonymousClass759 r12 = new AnonymousClass759();
        AnonymousClass7R9 r10 = new AnonymousClass7R9(r12);
        HashSet A0K = AnonymousClass002.A0K();
        C626936e.A06(A0R);
        C129626ac builder = C129656af.builder();
        for (Signature put : C1461878z.A02) {
            builder.put(AnonymousClass78K.A01, put);
        }
        this.A00 = new AnonymousClass7OM(A0R.A00, new C150827Sj(packageManager, builder.build(), C129526aS.of()), r10, new C153687bm(r12, A0K), r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r7.A04.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        if ((r4 instanceof android.os.RemoteException) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
        r1 = r10.A05;
        r2 = "error_remote_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        X.C18270x1.A0j(X.C18270x1.A03(r1), "pref_autoconf_feo2_query_status", r2);
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientCapabilities", r4);
        r10.A01.A0A("AutoconfManager/acquireClientCapabilities/error", true, r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if ((r4 instanceof X.C143146yP) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        r1 = r10.A05;
        r2 = "error_wrapped_provider_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        r0 = r4 instanceof java.lang.IllegalArgumentException;
        r1 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        if (r0 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        r2 = "error_illegal_argument_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        r2 = "error_security_exception";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7 A[ExcHandler: 6yP | RemoteException | IllegalArgumentException | SecurityException (r4v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01() {
        /*
            r10 = this;
            byte[] r0 = r10.A02
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/found cached clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.33p r0 = r10.A05
            java.lang.String r2 = "client_capabilities_cached"
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pref_autoconf_feo2_query_status"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x0016:
            byte[] r0 = r10.A02
            return r0
        L_0x0019:
            X.7OM r0 = r10.A00
            if (r0 != 0) goto L_0x0020
            r10.A00()
        L_0x0020:
            X.7OM r0 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.C626936e.A06(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7OM r7 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7RB r0 = new X.7RB     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r0.<init>()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r0.A00()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            android.os.Bundle r0 = r0.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7AZ r9 = new X.7AZ     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r9.<init>(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r0.<init>()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r6 = 0
            r8 = 0
            X.7bm r5 = r7.A04     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r5.A02(r9)     // Catch:{ Exception -> 0x0043, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x0047:
            android.net.Uri r4 = r7.A01     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7Sj r3 = r7.A02     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            android.content.ContentResolver r1 = r7.A00     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            java.lang.String r2 = "query"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            android.os.Bundle r0 = X.C160857oT.A00(r0)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            android.os.Bundle r1 = X.C153907cE.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7R9 r0 = r7.A03     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.C153907cE.A01(r1, r0, r2)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            if (r1 == 0) goto L_0x0069
            android.os.Bundle r0 = X.C160857oT.A00(r1)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.7Aa r8 = new X.7Aa     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x0069:
            r5.A03(r8)     // Catch:{ Exception -> 0x006d, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x009b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x0071:
            if (r8 == 0) goto L_0x0081
            android.os.Bundle r2 = r8.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            java.lang.String r1 = "capabilities"
            boolean r0 = r2.containsKey(r1)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            if (r0 == 0) goto L_0x0096
            byte[] r6 = r2.getByteArray(r1)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x0081:
            r10.A02 = r6     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            X.33p r0 = r10.A05     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            if (r6 != 0) goto L_0x0093
            java.lang.String r2 = "success_null_client_capabilities"
        L_0x0089:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            java.lang.String r0 = "pref_autoconf_feo2_query_status"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            goto L_0x0016
        L_0x0093:
            java.lang.String r2 = "success_get_client_capabilities"
            goto L_0x0089
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            throw r0     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x009b:
            r1 = move-exception
            X.7bm r0 = r7.A04     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            r0.A09(r1)     // Catch:{ Exception -> 0x00a2, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x00a6:
            throw r1     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x00a7 }
        L_0x00a7:
            r4 = move-exception
            boolean r0 = r4 instanceof android.os.RemoteException
            if (r0 == 0) goto L_0x00cc
            X.33p r1 = r10.A05
            java.lang.String r2 = "error_remote_exception"
        L_0x00b0:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "pref_autoconf_feo2_query_status"
            X.C18270x1.A0j(r1, r0, r2)
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities"
            com.whatsapp.util.Log.e(r0, r4)
            X.2qk r3 = r10.A01
            java.lang.String r2 = r4.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/error"
            r3.A0A(r0, r1, r2)
            goto L_0x0016
        L_0x00cc:
            boolean r0 = r4 instanceof X.C143146yP
            if (r0 == 0) goto L_0x00d5
            X.33p r1 = r10.A05
            java.lang.String r2 = "error_wrapped_provider_exception"
            goto L_0x00b0
        L_0x00d5:
            boolean r0 = r4 instanceof java.lang.IllegalArgumentException
            X.33p r1 = r10.A05
            if (r0 == 0) goto L_0x00de
            java.lang.String r2 = "error_illegal_argument_exception"
            goto L_0x00b0
        L_0x00de:
            java.lang.String r2 = "error_security_exception"
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153017aX.A01():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.A04.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientStartMessage", r1);
        r10.A01.A0A("AutoconfManager/acquireClientStartMessage/error", true, r1.getMessage());
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[ExcHandler: 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException (r1v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(java.lang.String r11) {
        /*
            r10 = this;
            X.7OM r0 = r10.A00
            if (r0 != 0) goto L_0x0007
            r10.A00()
        L_0x0007:
            r9 = 0
            X.7OM r0 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.C626936e.A06(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.7RD r3 = new X.7RD     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r3.<init>()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r3.A00()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            if (r11 == 0) goto L_0x0024
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r11, r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.os.Bundle r1 = r3.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r2)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
        L_0x0024:
            X.7OM r7 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.os.Bundle r0 = r3.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.7Ad r8 = new X.7Ad     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r8.<init>(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r0.<init>()     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r6 = 0
            X.7bm r5 = r7.A04     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r5.A06(r8)     // Catch:{ Exception -> 0x0039, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
        L_0x003d:
            android.net.Uri r4 = r7.A01     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.7Sj r3 = r7.A02     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.content.ContentResolver r1 = r7.A00     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            java.lang.String r2 = "start"
            android.os.Bundle r0 = r8.A00     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.os.Bundle r0 = X.C160857oT.A00(r0)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            android.os.Bundle r1 = X.C153907cE.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.7R9 r0 = r7.A03     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.C153907cE.A01(r1, r0, r2)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            if (r1 == 0) goto L_0x005f
            android.os.Bundle r0 = X.C160857oT.A00(r1)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            X.7Ae r6 = new X.7Ae     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
        L_0x005f:
            r5.A07(r6)     // Catch:{ Exception -> 0x0063, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            goto L_0x0087
        L_0x0063:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x0068, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            goto L_0x0087
        L_0x0068:
            r1 = move-exception
            X.7bm r0 = r7.A04     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            r0.A0B(r1)     // Catch:{ Exception -> 0x006f, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074, 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
            goto L_0x0073
        L_0x006f:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
        L_0x0073:
            throw r1     // Catch:{ 6yP | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage"
            com.whatsapp.util.Log.e(r0, r1)
            X.2qk r3 = r10.A01
            java.lang.String r2 = r1.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage/error"
            r3.A0A(r0, r1, r2)
            r6 = r9
        L_0x0087:
            if (r6 == 0) goto L_0x0097
            android.os.Bundle r2 = r6.A00
            java.lang.String r1 = "startMessage"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0098
            byte[] r9 = r2.getByteArray(r1)
        L_0x0097:
            return r9
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153017aX.A03(java.lang.String):byte[]");
    }

    public C153017aX(C620633i r2, C54292oU r3, AnonymousClass33p r4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
