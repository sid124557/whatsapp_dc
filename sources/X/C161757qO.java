package X;

import android.content.Context;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7qO  reason: invalid class name and case insensitive filesystem */
public class C161757qO {
    public static final Object A09 = AnonymousClass002.A0D();
    public static final Map A0A = new AnonymousClass05C();
    public static final Executor A0B = new C173158On();
    public final Context A00;
    public final C152617Zo A01;
    public final C130096bN A02;
    public final AnonymousClass8CV A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final List A06 = new CopyOnWriteArrayList();
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C161757qO A00() {
        /*
            java.lang.Object r5 = A09
            monitor-enter(r5)
            java.util.Map r1 = A0A     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "[DEFAULT]"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0075 }
            X.7qO r0 = (X.C161757qO) r0     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            return r0
        L_0x0011:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "Default FirebaseApp is not initialized in this process "
            r4.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = X.C1442070l.A01     // Catch:{ all -> 0x0075 }
            if (r3 != 0) goto L_0x006b
            int r2 = X.C1442070l.A00     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0028
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0075 }
            X.C1442070l.A00 = r2     // Catch:{ all -> 0x0075 }
        L_0x0028:
            r3 = 0
            if (r2 <= 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            r1.append(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "/cmdline"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0067 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0067 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0062 }
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0062 }
            r1.<init>(r0)     // Catch:{ all -> 0x0062 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0059, all -> 0x005d }
            X.C162177rO.A02(r0)     // Catch:{ IOException -> 0x0059, all -> 0x005d }
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x0059, all -> 0x005d }
        L_0x0059:
            r1.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0069
        L_0x005d:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x0062:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0069:
            X.C1442070l.A01 = r3     // Catch:{ all -> 0x0075 }
        L_0x006b:
            r4.append(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = ". Make sure to call FirebaseApp.initializeApp(Context) first."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r4)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161757qO.A00():X.7qO");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C161757qO A01(android.content.Context r15) {
        /*
            java.lang.Object r6 = A09
            monitor-enter(r6)
            java.util.Map r3 = A0A     // Catch:{ all -> 0x010e }
            java.lang.String r4 = "[DEFAULT]"
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0014
            X.7qO r0 = A00()     // Catch:{ all -> 0x010e }
        L_0x0011:
            monitor-exit(r6)     // Catch:{ all -> 0x010e }
            goto L_0x0106
        L_0x0014:
            X.C162177rO.A02(r15)     // Catch:{ all -> 0x010e }
            android.content.res.Resources r2 = r15.getResources()     // Catch:{ all -> 0x010e }
            r0 = 2131895762(0x7f1225d2, float:1.9426366E38)
            java.lang.String r5 = r2.getResourcePackageName(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "google_app_id"
            java.lang.String r1 = "string"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x002e
            r8 = 0
            goto L_0x0032
        L_0x002e:
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x0032:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "FirebaseApp"
            java.lang.String r0 = "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x010e }
            monitor-exit(r6)     // Catch:{ all -> 0x010e }
            goto L_0x0107
        L_0x0042:
            java.lang.String r0 = "google_api_key"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x004c
            r9 = 0
            goto L_0x0050
        L_0x004c:
            java.lang.String r9 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x0050:
            java.lang.String r0 = "firebase_database_url"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x005a
            r10 = 0
            goto L_0x005e
        L_0x005a:
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x005e:
            java.lang.String r0 = "ga_trackingId"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0068
            r11 = 0
            goto L_0x006c
        L_0x0068:
            java.lang.String r11 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x006c:
            java.lang.String r0 = "gcm_defaultSenderId"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0076
            r12 = 0
            goto L_0x007a
        L_0x0076:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x007a:
            java.lang.String r0 = "google_storage_bucket"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0084
            r13 = 0
            goto L_0x0088
        L_0x0084:
            java.lang.String r13 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x0088:
            java.lang.String r0 = "project_id"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0092
            r14 = 0
            goto L_0x0096
        L_0x0092:
            java.lang.String r14 = r2.getString(r0)     // Catch:{ all -> 0x010e }
        L_0x0096:
            X.7Zo r7 = new X.7Zo     // Catch:{ all -> 0x010e }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x010e }
            android.content.Context r0 = r15.getApplicationContext()     // Catch:{ all -> 0x010e }
            boolean r0 = r0 instanceof android.app.Application     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00c9
            android.content.Context r5 = r15.getApplicationContext()     // Catch:{ all -> 0x010e }
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x010e }
            java.util.concurrent.atomic.AtomicReference r1 = X.AnonymousClass89G.A00     // Catch:{ all -> 0x010e }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x00c9
            X.89G r2 = new X.89G     // Catch:{ all -> 0x010e }
            r2.<init>()     // Catch:{ all -> 0x010e }
            r0 = 0
            boolean r0 = X.AnonymousClass0IR.A00(r0, r2, r1)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00c9
            X.C162637sV.A00(r5)     // Catch:{ all -> 0x010e }
            X.7sV r1 = X.C162637sV.A04     // Catch:{ all -> 0x010e }
            monitor-enter(r1)     // Catch:{ all -> 0x010e }
            java.util.ArrayList r0 = r1.A01     // Catch:{ all -> 0x0109 }
            r0.add(r2)     // Catch:{ all -> 0x0109 }
            monitor-exit(r1)     // Catch:{ all -> 0x0109 }
        L_0x00c9:
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x010e }
            android.content.Context r0 = r15.getApplicationContext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00d7
            android.content.Context r15 = r15.getApplicationContext()     // Catch:{ all -> 0x010e }
        L_0x00d7:
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x010c }
            boolean r2 = X.AnonymousClass000.A1T(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "FirebaseApp name "
            r1.append(r0)     // Catch:{ all -> 0x010c }
            r1.append(r4)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = " already exists!"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x010c }
            X.C162177rO.A04(r0, r2)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "Application context cannot be null."
            X.C162177rO.A03(r15, r0)     // Catch:{ all -> 0x010c }
            X.7qO r0 = new X.7qO     // Catch:{ all -> 0x010c }
            r0.<init>(r15, r7, r4)     // Catch:{ all -> 0x010c }
            r3.put(r4, r0)     // Catch:{ all -> 0x010c }
            r0.A03()     // Catch:{ all -> 0x010e }
            goto L_0x0011
        L_0x0106:
            return r0
        L_0x0107:
            r0 = 0
            return r0
        L_0x0109:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x010c:
            r0 = move-exception
        L_0x010d:
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x010e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161757qO.A01(android.content.Context):X.7qO");
    }

    public final void A02() {
        C162177rO.A04("FirebaseApp was deleted", !this.A08.get());
    }

    public final void A03() {
        Queue queue;
        Context context = this.A00;
        if (Build.VERSION.SDK_INT < 24 || !(!C02860Hw.A00(context))) {
            C130096bN r4 = this.A02;
            A02();
            Iterator A0q = AnonymousClass000.A0q(r4.A01);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                AnonymousClass8CV r2 = (AnonymousClass8CV) A0w.getValue();
                if (((C157587iY) A0w.getKey()).A00 == 1) {
                    r2.get();
                }
            }
            AnonymousClass8CS r3 = r4.A00;
            synchronized (r3) {
                queue = r3.A00;
                if (queue != null) {
                    r3.A00 = null;
                } else {
                    queue = null;
                }
            }
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    it.next();
                    C162177rO.A02((Object) null);
                    synchronized (r3) {
                        Queue queue2 = r3.A00;
                        if (queue2 != null) {
                            queue2.add((Object) null);
                        } else {
                            synchronized (r3) {
                                throw AnonymousClass001.A0g("getType");
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        C124426Cf.A00(context);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C161757qO)) {
            return false;
        }
        String str = this.A04;
        C161757qO r3 = (C161757qO) obj;
        r3.A02();
        return str.equals(r3.A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r2.A00(this.A01, "options");
        return r2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C161757qO(android.content.Context r12, X.C152617Zo r13, java.lang.String r14) {
        /*
            r11 = this;
            r11.<init>()
            r5 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r11.A07 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r11.A08 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r11.A05 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r11.A06 = r0
            X.C162177rO.A02(r12)
            r11.A00 = r12
            X.C162177rO.A05(r14)
            r11.A04 = r14
            r11.A01 = r13
            java.lang.String r6 = "ComponentDiscovery"
            android.content.pm.PackageManager r2 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0087 }
            if (r2 != 0) goto L_0x003a
            java.lang.String r0 = "Context has no PackageManager."
            android.util.Log.w(r6, r0)     // Catch:{ NameNotFoundException -> 0x0087 }
            goto L_0x008c
        L_0x003a:
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r0 = com.google.firebase.components.ComponentDiscoveryService.class
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0087 }
            r1.<init>(r12, r0)     // Catch:{ NameNotFoundException -> 0x0087 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0087 }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "ComponentDiscoveryService has no service info."
            android.util.Log.w(r6, r0)     // Catch:{ NameNotFoundException -> 0x0087 }
            goto L_0x008c
        L_0x004f:
            android.os.Bundle r4 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0087 }
            if (r4 == 0) goto L_0x008c
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x005f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.String r3 = X.AnonymousClass001.A0m(r7)
            java.lang.Object r1 = r4.get(r3)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x005f
            r0 = 31
            java.lang.String r0 = r3.substring(r0)
            r2.add(r0)
            goto L_0x005f
        L_0x0087:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r6, r0)
        L_0x008c:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r6, r0)
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0095:
            java.lang.String r4 = "Could not instantiate %s"
            java.lang.String r3 = "Could not instantiate %s."
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r2.iterator()
        L_0x00a1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r8 = X.AnonymousClass001.A0m(r10)
            r9 = 1
            java.lang.Class r1 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            java.lang.Class<com.google.firebase.iid.Registrar> r0 = com.google.firebase.iid.Registrar.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            if (r0 != 0) goto L_0x00c6
            java.lang.String r2 = "Class %s is not an instance of %s"
            java.lang.Object[] r1 = X.C18310x6.A1b(r8, r5)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            r1[r9] = r0     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            X.AnonymousClass6C8.A1B(r2, r6, r1)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            goto L_0x00a1
        L_0x00c6:
            java.lang.Object r0 = X.AnonymousClass001.A0h(r1)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            r7.add(r0)     // Catch:{ ClassNotFoundException -> 0x00d8, IllegalAccessException | InstantiationException -> 0x00e4, NoSuchMethodException | InvocationTargetException -> 0x00ce }
            goto L_0x00a1
        L_0x00ce:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r8
            java.lang.String r0 = java.lang.String.format(r4, r0)
            goto L_0x00ed
        L_0x00d8:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r8
            java.lang.String r0 = "Class %s is not an found."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x00ed
        L_0x00e4:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r8
            java.lang.String r0 = java.lang.String.format(r3, r0)
        L_0x00ed:
            android.util.Log.w(r6, r0, r2)
            goto L_0x00a1
        L_0x00f1:
            java.util.concurrent.Executor r6 = A0B
            r0 = 6
            X.7iY[] r4 = new X.C157587iY[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.7Zh r1 = new X.7Zh
            r1.<init>(r2, r0)
            X.90Y r0 = new X.90Y
            r0.<init>(r12, r5)
            r1.A02 = r0
            X.7iY r0 = r1.A00()
            r4[r5] = r0
            java.lang.Class<X.7qO> r2 = X.C161757qO.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.7Zh r1 = new X.7Zh
            r1.<init>(r2, r0)
            X.90Y r0 = new X.90Y
            r0.<init>(r11, r5)
            r1.A02 = r0
            X.7iY r1 = r1.A00()
            r0 = 1
            r4[r0] = r1
            java.lang.Class<X.7Zo> r2 = X.C152617Zo.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.7Zh r1 = new X.7Zh
            r1.<init>(r2, r0)
            X.90Y r0 = new X.90Y
            r0.<init>(r13, r5)
            r1.A02 = r0
            X.7iY r1 = r1.A00()
            r0 = 2
            r4[r0] = r1
            java.lang.String r1 = "fire-android"
            java.lang.String r0 = ""
            X.7iY r1 = X.C1447972z.A00(r1, r0)
            r0 = 3
            r4[r0] = r1
            java.lang.String r1 = "fire-core"
            java.lang.String r0 = "19.0.0"
            X.7iY r1 = X.C1447972z.A00(r1, r0)
            r0 = 4
            r4[r0] = r1
            r8 = 5
            java.lang.Class<X.7fw> r1 = X.C156047fw.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.7Zh r3 = new X.7Zh
            r3.<init>(r1, r0)
            java.lang.Class<X.72y> r2 = X.C1447872y.class
            r1 = 2
            X.7Xy r0 = new X.7Xy
            r0.<init>(r2, r1)
            r3.A01(r0)
            X.8CQ r1 = X.AnonymousClass8CQ.A00
            java.lang.String r0 = "Null factory"
            X.C162177rO.A03(r1, r0)
            r3.A02 = r1
            X.7iY r0 = r3.A00()
            r4[r8] = r0
            X.6bN r0 = new X.6bN
            r0.<init>(r7, r6, r4)
            r11.A02 = r0
            X.933 r1 = new X.933
            r1.<init>(r12, r5, r11)
            X.8CV r0 = new X.8CV
            r0.<init>(r1)
            r11.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161757qO.<init>(android.content.Context, X.7Zo, java.lang.String):void");
    }
}
