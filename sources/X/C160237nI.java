package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.7nI  reason: invalid class name and case insensitive filesystem */
public final class C160237nI {
    public final Context A00;
    public final SharedPreferences A01;
    public final C162137rK A02;
    public final Map A03 = new AnonymousClass05C();

    public final synchronized void A02() {
        this.A03.clear();
        Context context = this.A00;
        File A012 = AnonymousClass0RP.A01(context);
        if (A012 == null || !A012.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A012 = context.getFilesDir();
        }
        for (File file : A012.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (X.AnonymousClass6C9.A1Q("FirebaseInstanceId") != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r2 = X.AnonymousClass6CA.A0V(r1);
        android.util.Log.d("FirebaseInstanceId", X.AnonymousClass6C7.A0k("Error creating file in no backup dir: ", r2, r2.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C160237nI(android.content.Context r5) {
        /*
            r4 = this;
            X.7rK r2 = new X.7rK
            r2.<init>()
            java.lang.String r3 = "FirebaseInstanceId"
            r4.<init>()
            X.05C r0 = new X.05C
            r0.<init>()
            r4.A03 = r0
            r4.A00 = r5
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r1, r0)
            r4.A01 = r0
            r4.A02 = r2
            java.io.File r1 = X.AnonymousClass0RP.A01(r5)
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0072
            boolean r0 = r1.createNewFile()     // Catch:{ IOException -> 0x005a }
            if (r0 == 0) goto L_0x0072
            r1 = r4
            monitor-enter(r1)     // Catch:{ IOException -> 0x005a }
            android.content.SharedPreferences r0 = r4.A01     // Catch:{ all -> 0x0057 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0057 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0057 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x005a }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "App restored, clearing state"
            android.util.Log.i(r3, r0)     // Catch:{ IOException -> 0x005a }
            r4.A02()     // Catch:{ IOException -> 0x005a }
            X.7qO r0 = X.C161757qO.A00()     // Catch:{ IOException -> 0x005a }
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x005a }
            r0.A07()     // Catch:{ IOException -> 0x005a }
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x005a }
            throw r0     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r1 = move-exception
            boolean r0 = X.AnonymousClass6C9.A1Q(r3)
            if (r0 == 0) goto L_0x0072
            java.lang.String r2 = X.AnonymousClass6CA.A0V(r1)
            int r1 = r2.length()
            java.lang.String r0 = "Error creating file in no backup dir: "
            java.lang.String r0 = X.AnonymousClass6C7.A0k(r0, r2, r1)
            android.util.Log.d(r3, r0)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160237nI.<init>(android.content.Context):void");
    }

    public static String A00(String str) {
        StringBuilder A0q = AnonymousClass6C7.A0q(str, AnonymousClass6C7.A06("") + 3);
        A0q.append("");
        return AnonymousClass000.A0V("|S|", str, A0q);
    }

    public static String A01(String str, String str2) {
        StringBuilder A0q = AnonymousClass6C7.A0q(str2, AnonymousClass6C7.A06("") + 4 + AnonymousClass6C7.A06(str));
        A0q.append("");
        A0q.append("|T|");
        A0q.append(str);
        return AnonymousClass000.A0V("|", str2, A0q);
    }
}
