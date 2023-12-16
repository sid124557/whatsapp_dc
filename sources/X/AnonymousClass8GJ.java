package X;

import android.content.Context;

/* renamed from: X.8GJ  reason: invalid class name */
public final class AnonymousClass8GJ implements C836849j {
    public final Context A00;
    public final C29441ip A01;
    public final C620633i A02;
    public final C56612sH A03;
    public final AnonymousClass5ZR A04;
    public final AnonymousClass33p A05;
    public final C620733j A06;
    public final C61072zf A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass4FV A09;
    public final C52512lb A0A;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|43|44|45|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0686, code lost:
        if (r3 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013e, code lost:
        if (r8.A0N.A00.getPackageManager().hasSystemFeature("android.hardware.ram.low") == false) goto L_0x0140;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[SYNTHETIC, Splitter:B:60:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1 A[SYNTHETIC, Splitter:B:64:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYP(X.C134256ih r19) {
        /*
            r18 = this;
            r1 = 0
            r7 = r19
            X.C162457s7.A0J(r7, r1)
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            r1 = 1
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.A0P = r0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0021 }
            java.lang.String r0 = "mounted"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0021 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r7.A00 = r0
            r6 = r18
            X.33i r8 = r6.A02
            boolean r0 = X.C627236i.A0E(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0N = r0
            java.lang.Boolean r0 = X.C627236i.A01
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "/system/lib/libc_malloc_debug_qemu.so"
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x004c }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004c }
            X.C627236i.A01 = r0     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x004c }
            X.C627236i.A01 = r0     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C627236i.A01 = r0
        L_0x0050:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0Q = r0
            android.content.Context r5 = r6.A00
            java.lang.Boolean r0 = X.C627236i.A00
            if (r0 != 0) goto L_0x0083
            r4 = 1
            r3 = 0
            java.lang.String r0 = "/dev/com.genymotion.superuser.daemon"
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x006f }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x006f }
            if (r0 == 0) goto L_0x006f
            goto L_0x007b
        L_0x006f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r1 = "com.genymotion.superuser"
            r0 = 128(0x80, float:1.794E-43)
            r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x007c }
            goto L_0x007d
        L_0x007b:
            r3 = 1
        L_0x007c:
            r4 = r3
        L_0x007d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.C627236i.A00 = r0
        L_0x0083:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0L = r0
            r4 = 0
            r9 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00e4, all -> 0x0691 }
            java.lang.String r0 = "ps"
            java.lang.Process r1 = r1.exec(r0)     // Catch:{ Exception -> 0x00e4, all -> 0x0691 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x00e4, all -> 0x0691 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e4, all -> 0x0691 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00e4, all -> 0x0691 }
            java.io.InputStream r0 = r1.getErrorStream()     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
            r1.waitFor()     // Catch:{ Exception -> 0x00db }
            int r1 = r2.available()     // Catch:{ Exception -> 0x00db }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x00db }
            r2.read(r0, r4, r1)     // Catch:{ Exception -> 0x00db }
            int r1 = r3.available()     // Catch:{ Exception -> 0x00db }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x00db }
            r3.read(r0, r4, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00db }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "com.android.commands.monkey"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x00db }
            if (r0 == 0) goto L_0x00d4
            r3.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            r2.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x00f5
        L_0x00d4:
            r3.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r2.close()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00f9
        L_0x00db:
            r0 = move-exception
            goto L_0x00e7
        L_0x00dd:
            r0 = move-exception
            r2 = r9
            goto L_0x0688
        L_0x00e1:
            r0 = move-exception
            r2 = r9
            goto L_0x00e7
        L_0x00e4:
            r0 = move-exception
            r3 = r9
            r2 = r9
        L_0x00e7:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0685 }
            if (r3 == 0) goto L_0x00ef
            r3.close()     // Catch:{ IOException -> 0x00ef }
        L_0x00ef:
            if (r2 == 0) goto L_0x00f9
            r2.close()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00f9
        L_0x00f5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.A0M = r0
        L_0x00f9:
            boolean r0 = X.C627236i.A0C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0O = r0
            android.accounts.AccountManager r2 = android.accounts.AccountManager.get(r5)
            r1 = -1
            if (r2 == 0) goto L_0x0111
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r0 = r2.getAccountsByType(r0)     // Catch:{ Exception -> 0x0111 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0111 }
        L_0x0111:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r7.A0v = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r7.A0j = r0
            java.lang.String r0 = android.os.Build.DISPLAY
            r7.A1V = r0
            java.lang.String r0 = X.AnonymousClass321.A02()
            r7.A1O = r0
            boolean r0 = X.C107385bE.A05()
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = "android.hardware.ram.low"
            X.2oU r0 = r8.A0N
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r1 = r0.hasSystemFeature(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A04 = r0
            X.33j r4 = r6.A06
            java.lang.String r0 = r4.A07()
            r7.A1S = r0
            java.lang.String r0 = r4.A06()
            r7.A1T = r0
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r0 = r1.getInstallerPackageName(r0)
            r7.A1Q = r0
            java.lang.String r0 = r5.getPackageName()
            r7.A1W = r0
            X.1Xz r10 = new X.1Xz
            r10.<init>()
            java.lang.String r0 = "apkhash"
            r10.A02 = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            java.lang.String r9 = X.C627236i.A02(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)
            r10.A00 = r0
            X.4FV r0 = r6.A09
            r0.BhD(r10)
            r7.A1M = r9
            android.content.pm.Signature[] r9 = X.AnonymousClass345.A03(r5)
            r1 = 0
            if (r9 == 0) goto L_0x01c0
            int r3 = r9.length
            if (r3 == 0) goto L_0x01c0
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01a2 }
            goto L_0x01a7
        L_0x01a2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x01c0
        L_0x01a7:
            r2.reset()
            r1 = 0
        L_0x01ab:
            r0 = r9[r1]
            byte[] r0 = r0.toByteArray()
            r2.update(r0)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x01ab
            byte[] r0 = r2.digest()
            java.lang.String r1 = X.C18290x4.A0t(r0)
        L_0x01c0:
            r7.A1Y = r1
            int r0 = X.AnonymousClass321.A00()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r7.A1F = r0
            X.33p r3 = r6.A05
            X.8qC r0 = r3.A01
            r17 = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r17)
            java.lang.String r0 = "phoneyid_id"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            r7.A1X = r0
            X.1VX r9 = r6.A08
            r0 = 3663(0xe4f, float:5.133E-42)
            boolean r0 = r9.A0X(r0)
            r2 = 0
            if (r0 == 0) goto L_0x03e1
            java.util.HashSet r14 = X.AnonymousClass002.A0K()
            r0 = 4
            java.lang.ClassLoader[] r10 = new java.lang.ClassLoader[r0]
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r0.getContextClassLoader()
            r0 = 0
            r10[r0] = r1
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r0 = 1
            r10[r0] = r1
            java.lang.Class<X.34F> r0 = X.AnonymousClass34F.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r0 = 2
            r10[r0] = r1
            r1 = 3
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r10[r1] = r0
            java.util.HashSet r1 = X.C162207rR.newHashSet(r10)
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x03d8 }
            java.util.LinkedList r13 = X.AnonymousClass0x9.A18()
            r13.addAll(r1)
        L_0x0225:
            int r0 = r13.size()
            if (r0 <= 0) goto L_0x0298
            java.lang.Object r1 = r13.pop()
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            if (r1 == 0) goto L_0x0225
            java.lang.ClassLoader r0 = r1.getParent()
            if (r0 == 0) goto L_0x024d
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x024d
            java.lang.ClassLoader r0 = r1.getParent()
            r14.add(r0)
            java.lang.ClassLoader r0 = r1.getParent()
            r13.add(r0)
        L_0x024d:
            java.lang.String r0 = "pathList"
            java.lang.Object r1 = X.AnonymousClass34F.A00(r1, r0)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r0 = "dexElements"
            java.lang.Object r15 = X.AnonymousClass34F.A00(r1, r0)     // Catch:{ Exception -> 0x0293 }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ Exception -> 0x0293 }
            int r12 = r15.length     // Catch:{ Exception -> 0x0293 }
            r10 = 0
        L_0x025d:
            if (r10 >= r12) goto L_0x0225
            r1 = r15[r10]     // Catch:{ Exception -> 0x0293 }
            java.lang.String r0 = "dexFile"
            java.lang.Object r0 = X.AnonymousClass34F.A00(r1, r0)     // Catch:{ Exception -> 0x0293 }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ Exception -> 0x0293 }
            java.util.Enumeration r16 = r0.entries()     // Catch:{ Exception -> 0x0293 }
            if (r16 == 0) goto L_0x0290
        L_0x026f:
            boolean r0 = r16.hasMoreElements()     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x0290
            java.lang.Object r2 = r16.nextElement()     // Catch:{ Exception -> 0x0293 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0293 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x0293 }
            byte[] r0 = r2.getBytes(r0)     // Catch:{ Exception -> 0x0293 }
            r11.update(r0)     // Catch:{ Exception -> 0x0293 }
            java.util.Set r1 = X.AnonymousClass34F.A00     // Catch:{ Exception -> 0x0293 }
            boolean r0 = r1.contains(r2)     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x026f
            r1.remove(r2)     // Catch:{ Exception -> 0x0293 }
            goto L_0x026f
        L_0x0290:
            int r10 = r10 + 1
            goto L_0x025d
        L_0x0293:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0225
        L_0x0298:
            java.util.Set r10 = X.AnonymousClass34F.A00
            monitor-enter(r10)
            java.util.Iterator r2 = r10.iterator()     // Catch:{ all -> 0x03d5 }
        L_0x029f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x02b3
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x03d5 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x03d5 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x03d5 }
            r11.update(r0)     // Catch:{ all -> 0x03d5 }
            goto L_0x029f
        L_0x02b3:
            monitor-exit(r10)     // Catch:{ all -> 0x03d5 }
            X.7hm r10 = X.C157127hm.A00
            X.6bG r10 = (X.C130026bG) r10
            X.7hm r12 = r10.A02
            if (r12 != 0) goto L_0x031a
            X.7Zn r13 = r10.A00
            char[] r14 = r13.A06
            int r2 = r14.length
            r12 = 0
        L_0x02c2:
            if (r12 >= r2) goto L_0x0302
            char r1 = r14[r12]
            r0 = 65
            if (r1 < r0) goto L_0x02ff
            r0 = 90
            if (r1 > r0) goto L_0x02ff
            r12 = 0
        L_0x02cf:
            if (r12 >= r2) goto L_0x02fd
            char r1 = r14[r12]
            r0 = 97
            if (r1 < r0) goto L_0x02fa
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x02fa
            r0 = 1
        L_0x02dc:
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot call lowerCase() on a mixed-case alphabet"
            X.C162187rP.A05(r0, r1)
            char[] r12 = new char[r2]
            r1 = 0
        L_0x02e6:
            if (r1 >= r2) goto L_0x0304
            char r15 = r14[r1]
            r0 = 65
            if (r15 < r0) goto L_0x02f5
            r0 = 90
            if (r15 > r0) goto L_0x02f5
            r0 = r15 ^ 32
            char r15 = (char) r0
        L_0x02f5:
            r12[r1] = r15
            int r1 = r1 + 1
            goto L_0x02e6
        L_0x02fa:
            int r12 = r12 + 1
            goto L_0x02cf
        L_0x02fd:
            r0 = 0
            goto L_0x02dc
        L_0x02ff:
            int r12 = r12 + 1
            goto L_0x02c2
        L_0x0302:
            r2 = r13
            goto L_0x0315
        L_0x0304:
            java.lang.String r0 = r13.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ".lowerCase()"
            java.lang.String r0 = r1.concat(r0)
            X.7Zn r2 = new X.7Zn
            r2.<init>(r0, r12)
        L_0x0315:
            if (r2 != r13) goto L_0x0337
            r12 = r10
        L_0x0318:
            r10.A02 = r12
        L_0x031a:
            byte[] r11 = r11.digest()
            int r10 = r11.length
            r15 = 0
            X.C162187rP.A03(r15, r10, r10)
            X.6bG r12 = (X.C130026bG) r12
            X.7Zn r14 = r12.A00
            int r1 = r14.A02
            int r13 = r14.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = X.C1447572v.A00(r0, r10, r13)
            int r1 = r1 * r0
            java.lang.StringBuilder r2 = X.AnonymousClass6CA.A0Y(r1)
            goto L_0x0353
        L_0x0337:
            java.lang.Character r1 = r10.A01
            boolean r0 = r10 instanceof X.C130006bE
            if (r0 == 0) goto L_0x0343
            X.6bE r12 = new X.6bE
            r12.<init>(r2, r1)
            goto L_0x0318
        L_0x0343:
            boolean r0 = r10 instanceof X.C130016bF
            if (r0 == 0) goto L_0x034d
            X.6bF r12 = new X.6bF
            r12.<init>(r2)
            goto L_0x0318
        L_0x034d:
            X.6bG r12 = new X.6bG
            r12.<init>(r2, r1)
            goto L_0x0318
        L_0x0353:
            boolean r0 = r12 instanceof X.C130006bE     // Catch:{ IOException -> 0x03cf }
            if (r0 == 0) goto L_0x039f
            r13 = r10
            r1 = 0
            X.C162187rP.A03(r15, r10, r10)     // Catch:{ IOException -> 0x03cf }
        L_0x035c:
            r0 = 3
            if (r13 < r0) goto L_0x0398
            int r0 = r1 + 1
            byte r1 = r11[r1]     // Catch:{ IOException -> 0x03cf }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r15 = r0 + 1
            int r0 = X.AnonymousClass6C8.A0G(r11, r0, r1)     // Catch:{ IOException -> 0x03cf }
            int r1 = r15 + 1
            int r16 = X.AnonymousClass6CA.A0C(r11, r15, r0)     // Catch:{ IOException -> 0x03cf }
            int r0 = r16 >>> 18
            char[] r15 = r14.A06     // Catch:{ IOException -> 0x03cf }
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            int r0 = r16 >>> 12
            r0 = r0 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            int r0 = r16 >>> 6
            r0 = r0 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            r0 = r16 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            int r13 = r13 + -3
            goto L_0x035c
        L_0x0398:
            if (r1 >= r10) goto L_0x03dd
            int r10 = r10 - r1
            r12.A00(r2, r11, r1, r10)     // Catch:{ IOException -> 0x03cf }
            goto L_0x03dd
        L_0x039f:
            boolean r0 = r12 instanceof X.C130016bF     // Catch:{ IOException -> 0x03cf }
            if (r0 == 0) goto L_0x03c0
            X.6bF r12 = (X.C130016bF) r12     // Catch:{ IOException -> 0x03cf }
            X.C162187rP.A03(r15, r10, r10)     // Catch:{ IOException -> 0x03cf }
            r13 = 0
        L_0x03a9:
            if (r13 >= r10) goto L_0x03dd
            byte r0 = r11[r13]     // Catch:{ IOException -> 0x03cf }
            r14 = r0 & 255(0xff, float:3.57E-43)
            char[] r1 = r12.A00     // Catch:{ IOException -> 0x03cf }
            char r0 = r1[r14]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            r0 = r14 | 256(0x100, float:3.59E-43)
            char r0 = r1[r0]     // Catch:{ IOException -> 0x03cf }
            r2.append(r0)     // Catch:{ IOException -> 0x03cf }
            int r13 = r13 + 1
            goto L_0x03a9
        L_0x03c0:
            X.C162187rP.A03(r15, r10, r10)     // Catch:{ IOException -> 0x03cf }
            r1 = 0
        L_0x03c4:
            if (r1 >= r10) goto L_0x03dd
            int r0 = X.AnonymousClass6C9.A0A(r10, r1, r13)     // Catch:{ IOException -> 0x03cf }
            r12.A00(r2, r11, r1, r0)     // Catch:{ IOException -> 0x03cf }
            int r1 = r1 + r13
            goto L_0x03c4
        L_0x03cf:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x03d5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x03d5 }
            throw r0
        L_0x03d8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x03e1
        L_0x03dd:
            java.lang.String r2 = r2.toString()
        L_0x03e1:
            r7.A1N = r2
            X.5ZR r10 = r6.A04
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            java.lang.Long r0 = A00(r10, r0)
            r7.A19 = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            java.lang.Long r0 = A00(r10, r0)
            r7.A1D = r0
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            java.lang.Long r0 = A00(r10, r0)
            r7.A18 = r0
            boolean r0 = X.C107385bE.A02()
            java.lang.Long r2 = X.AnonymousClass0x2.A0T()
            if (r0 == 0) goto L_0x05f3
            r0 = r2
        L_0x0408:
            r7.A1A = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Long r0 = A00(r10, r0)
            r7.A1E = r0
            boolean r0 = r10.A0D()
            if (r0 != 0) goto L_0x041e
            r0 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x041e:
            r7.A1C = r2
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.Long r0 = A00(r10, r0)
            r7.A17 = r0
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.Long r0 = A00(r10, r0)
            r7.A15 = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Long r0 = A00(r10, r0)
            r7.A16 = r0
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            java.lang.Long r0 = A00(r10, r0)
            r7.A1B = r0
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x045c
            X.57z r0 = r10.A04()
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0456
            r1 = 2
            if (r2 == r1) goto L_0x0456
            r1 = 3
        L_0x0456:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A0f = r0
        L_0x045c:
            X.2zf r2 = r6.A07
            long r0 = r2.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A1G = r0
            long r0 = r2.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A1H = r0
            long r0 = r2.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0r = r0
            long r0 = r2.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0s = r0
            boolean r0 = X.C61072zf.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A03 = r0
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "autodownload_cellular_mask"
            r10 = 1
            int r2 = r1.getInt(r0, r10)
            r0 = r2 & 2
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A06 = r0
            r0 = r2 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A09 = r0
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0C = r0
            r0 = r2 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0F = r0
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r17)
            java.lang.String r0 = "autodownload_roaming_mask"
            int r2 = r2.getInt(r0, r1)
            r0 = r2 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A07 = r0
            r0 = r2 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0A = r0
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0D = r0
            r0 = r2 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0G = r0
            android.content.SharedPreferences r3 = X.C18300x5.A0B(r17)
            java.lang.String r2 = "autodownload_wifi_mask"
            r0 = 15
            int r2 = r3.getInt(r2, r0)
            r0 = r2 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A08 = r0
            r0 = r2 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0B = r0
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0E = r0
            r0 = r2 & 4
            if (r0 == 0) goto L_0x053b
            r1 = 1
        L_0x053b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.A0H = r0
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r11 = X.C18300x5.A0B(r17)
            java.lang.String r12 = "last_daily_event"
            r0 = 0
            long r15 = r11.getLong(r12, r0)
            r13 = 0
            int r11 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x055f
            long r13 = r2 - r15
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x055f
            r13 = 1
        L_0x055f:
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r17)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C18270x1.A0i(r0, r12, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r7.A1I = r0
            X.1ip r2 = r6.A01
            int r0 = r2.A08(r10)
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0T = r0
            boolean r0 = X.C107385bE.A03()
            if (r0 == 0) goto L_0x0593
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x05ee
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0591:
            r7.A0d = r0
        L_0x0593:
            r0 = 3309(0xced, float:4.637E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x05a7
            android.telephony.TelephonyManager r0 = r8.A0N()
            if (r0 == 0) goto L_0x05ec
            java.lang.String r0 = r0.getNetworkOperatorName()
        L_0x05a5:
            r7.A1U = r0
        L_0x05a7:
            boolean r0 = X.C107385bE.A06()
            if (r0 == 0) goto L_0x0633
            android.app.usage.UsageStatsManager r11 = r8.A0B()
            if (r11 == 0) goto L_0x0623
            int r0 = r11.getAppStandbyBucket()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r7.A0l = r0
            long r2 = java.lang.System.currentTimeMillis()
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r2 - r9
            android.app.usage.UsageEvents r9 = r11.queryEventsForSelf(r0, r2)
            X.C162457s7.A0D(r9)
            android.app.usage.UsageEvents$Event r3 = new android.app.usage.UsageEvents$Event
            r3.<init>()
            r2 = 0
        L_0x05d3:
            boolean r0 = r9.getNextEvent(r3)
            if (r0 == 0) goto L_0x061b
            int r1 = r3.getEventType()
            r0 = 11
            if (r1 != r0) goto L_0x05d3
            int r0 = r3.getAppStandbyBucket()
            if (r0 <= r2) goto L_0x05d3
            int r2 = r3.getAppStandbyBucket()
            goto L_0x05d3
        L_0x05ec:
            r0 = 0
            goto L_0x05a5
        L_0x05ee:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0591
        L_0x05f3:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            boolean r0 = X.C107385bE.A0A()
            if (r0 != 0) goto L_0x0608
            boolean r1 = X.C107385bE.A08()
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r1 != 0) goto L_0x0608
            r11.add(r0)
        L_0x0608:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r11.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r0 = r10.A03(r0)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            goto L_0x0408
        L_0x061b:
            if (r2 == 0) goto L_0x0623
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r7.A11 = r0
        L_0x0623:
            android.app.ActivityManager r0 = r8.A06()
            if (r0 == 0) goto L_0x0633
            boolean r0 = r0.isBackgroundRestricted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0I = r0
        L_0x0633:
            X.0Tx r0 = new X.0Tx
            r0.<init>(r5)
            boolean r0 = r0.A01()
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0g = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            r7.A1P = r0
            boolean r0 = r4.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A05 = r0
            X.2lb r0 = r6.A0A
            java.util.Locale r0 = r0.A00()
            if (r0 == 0) goto L_0x0682
            java.lang.String r2 = r0.getLanguage()
            if (r2 == 0) goto L_0x0674
            java.lang.String r0 = "[a-z]{2}"
            boolean r0 = java.util.regex.Pattern.matches(r0, r2)
            if (r0 != 0) goto L_0x067f
        L_0x0674:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "KeyboardLanguageExtractor/getCurrentKeyboardLanguage/invalid-language "
            X.C18260x0.A0t(r0, r2, r1)
            java.lang.String r2 = "zz"
        L_0x067f:
            r7.A1R = r2
            return
        L_0x0682:
            java.lang.String r2 = ""
            goto L_0x067f
        L_0x0685:
            r0 = move-exception
            if (r3 == 0) goto L_0x068b
        L_0x0688:
            r3.close()     // Catch:{ IOException -> 0x068b }
        L_0x068b:
            if (r2 == 0) goto L_0x0692
            r2.close()     // Catch:{ IOException -> 0x0692 }
            throw r0
        L_0x0691:
            r0 = move-exception
        L_0x0692:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GJ.BYP(X.6ih):void");
    }

    public AnonymousClass8GJ(Context context, C29441ip r3, C620633i r4, C56612sH r5, AnonymousClass5ZR r6, AnonymousClass33p r7, C620733j r8, C61072zf r9, AnonymousClass1VX r10, AnonymousClass4FV r11, C52512lb r12) {
        C18260x0.A0e(r5, r10, r11, r9);
        C18260x0.A0g(r4, r8, r7, r6, r12);
        C162457s7.A0J(r3, 11);
        this.A00 = context;
        this.A03 = r5;
        this.A08 = r10;
        this.A09 = r11;
        this.A07 = r9;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A0A = r12;
        this.A01 = r3;
    }

    public static Long A00(AnonymousClass5ZR r0, String str) {
        return Long.valueOf((long) r0.A02(str));
    }
}
