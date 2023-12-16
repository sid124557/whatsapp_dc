package X;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7ne  reason: invalid class name and case insensitive filesystem */
public abstract class C160447ne {
    public static final Object A06 = AnonymousClass002.A0D();
    public static final AtomicInteger A07 = new AtomicInteger();
    public static final AtomicReference A08 = new AtomicReference();
    public static volatile AnonymousClass72P A09;
    public final C156337gS A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public volatile int A04 = -1;
    public volatile Object A05;

    public static void A00(Context context) {
        C180948lt r1;
        Context context2;
        if (A09 == null) {
            synchronized (A06) {
                if (A09 == null) {
                    AnonymousClass72P r12 = A09;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (r12 == null || ((C128126Uw) r12).A00 != context) {
                        synchronized (AnonymousClass8A5.class) {
                            try {
                                Map map = AnonymousClass8A5.A07;
                                Iterator A0v = AnonymousClass001.A0v(map);
                                while (A0v.hasNext()) {
                                    AnonymousClass8A5 r0 = (AnonymousClass8A5) A0v.next();
                                    r0.A00.unregisterContentObserver(r0.A01);
                                }
                                map.clear();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        synchronized (AnonymousClass8A3.class) {
                            try {
                                Map map2 = AnonymousClass8A3.A00;
                                Iterator A0v2 = AnonymousClass001.A0v(map2);
                                if (!A0v2.hasNext()) {
                                    map2.clear();
                                } else {
                                    A0v2.next();
                                    throw null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        synchronized (AnonymousClass8A4.class) {
                            try {
                                AnonymousClass8A4 r02 = AnonymousClass8A4.A02;
                                if (!(r02 == null || (context2 = r02.A00) == null || r02.A01 == null)) {
                                    context2.getContentResolver().unregisterContentObserver(AnonymousClass8A4.A02.A01);
                                }
                                AnonymousClass8A4.A02 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        AnonymousClass8A6 r2 = new AnonymousClass8A6(context);
                        if (r2 instanceof Serializable) {
                            r1 = new AnonymousClass8A9(r2);
                        } else {
                            r1 = new AnonymousClass8A7(r2);
                        }
                        A09 = new C128126Uw(context, r1);
                        A07.incrementAndGet();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.7S8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: X.7RN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: X.7S8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.7S8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: X.7RN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: X.7RN} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:20|21|(5:23|24|25|26|27)|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x010b, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x010e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x010f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(r7)), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        android.os.StrictMode.setThreadPolicy(r12);
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x00fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0075 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x010f A[ExcHandler: IllegalStateException | NullPointerException | SecurityException (r2v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:104:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0122 A[Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x012d A[SYNTHETIC, Splitter:B:130:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x013b A[Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x013c A[Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0141 A[Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:46:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00b8 A[Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02() {
        /*
            r13 = this;
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = r13.A02
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "flagName must not be null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x000f:
            java.util.concurrent.atomic.AtomicInteger r0 = A07
            int r5 = r0.get()
            int r0 = r13.A04
            if (r0 >= r5) goto L_0x01a4
            monitor-enter(r13)
            int r0 = r13.A04     // Catch:{ all -> 0x01a1 }
            if (r0 >= r5) goto L_0x019f
            X.72P r4 = A09     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            if (r4 == 0) goto L_0x0194
            X.7gS r8 = r13.A00     // Catch:{ all -> 0x01a1 }
            android.net.Uri r6 = r8.A00     // Catch:{ all -> 0x01a1 }
            r3 = 0
            if (r6 == 0) goto L_0x0178
            X.6Uw r4 = (X.C128126Uw) r4     // Catch:{ all -> 0x01a1 }
            android.content.Context r9 = r4.A00     // Catch:{ all -> 0x01a1 }
            boolean r0 = X.C155347ei.A00(r9, r6)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0057
            android.content.ContentResolver r10 = r9.getContentResolver()     // Catch:{ all -> 0x01a1 }
            X.8Me r7 = X.C172658Me.A00     // Catch:{ all -> 0x01a1 }
            java.lang.Class<X.8A5> r2 = X.AnonymousClass8A5.class
            monitor-enter(r2)     // Catch:{ all -> 0x01a1 }
            java.util.Map r1 = X.AnonymousClass8A5.A07     // Catch:{ all -> 0x0053 }
            java.lang.Object r11 = r1.get(r6)     // Catch:{ all -> 0x0053 }
            X.8A5 r11 = (X.AnonymousClass8A5) r11     // Catch:{ all -> 0x0053 }
            if (r11 != 0) goto L_0x0051
            X.8A5 r0 = new X.8A5     // Catch:{ SecurityException -> 0x0051 }
            r0.<init>(r10, r6, r7)     // Catch:{ SecurityException -> 0x0051 }
            r1.put(r6, r0)     // Catch:{ SecurityException -> 0x0050 }
        L_0x0050:
            r11 = r0
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0198
        L_0x0057:
            r11 = r3
        L_0x0058:
            if (r11 == 0) goto L_0x00b5
            java.lang.String r10 = r13.A02     // Catch:{ all -> 0x01a1 }
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x00a4
            java.lang.Object r7 = r11.A03     // Catch:{ all -> 0x01a1 }
            monitor-enter(r7)     // Catch:{ all -> 0x01a1 }
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x009e
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x00a0 }
            X.7RN r0 = new X.7RN     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            r0.<init>(r11)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            java.lang.Object r0 = r0.A00()     // Catch:{ SecurityException -> 0x0075, SQLiteException | IllegalStateException | SecurityException -> 0x0088, SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            goto L_0x0080
        L_0x0075:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x0083 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
        L_0x0080:
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            goto L_0x0099
        L_0x0083:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
            throw r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0088 }
        L_0x0088:
            java.lang.String r1 = "ConfigurationContentLdr"
            java.lang.String r0 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0094 }
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x00a0 }
            r0 = 0
            goto L_0x009c
        L_0x0094:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x0099:
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x00a0 }
        L_0x009c:
            r11.A06 = r0     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r7)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a0 }
            goto L_0x0198
        L_0x00a4:
            if (r0 != 0) goto L_0x00aa
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x01a1 }
        L_0x00aa:
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r7 = r13.A03(r0)     // Catch:{ all -> 0x01a1 }
            goto L_0x00b6
        L_0x00b5:
            r7 = r3
        L_0x00b6:
            if (r7 != 0) goto L_0x012f
            boolean r0 = r8.A01     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x012a
            java.lang.Class<X.8A4> r8 = X.AnonymousClass8A4.class
            monitor-enter(r8)     // Catch:{ all -> 0x01a1 }
            X.8A4 r1 = X.AnonymousClass8A4.A02     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x00de
            java.lang.String r7 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0127 }
            int r1 = android.os.Process.myUid()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0127 }
            int r0 = X.AnonymousClass0RT.A00(r9, r7, r0, r2, r1)     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x00e0
            X.8A4 r1 = new X.8A4     // Catch:{ all -> 0x0127 }
            r1.<init>(r9)     // Catch:{ all -> 0x0127 }
        L_0x00dc:
            X.AnonymousClass8A4.A02 = r1     // Catch:{ all -> 0x0127 }
        L_0x00de:
            monitor-exit(r8)     // Catch:{ all -> 0x0127 }
            goto L_0x00e6
        L_0x00e0:
            X.8A4 r1 = new X.8A4     // Catch:{ all -> 0x0127 }
            r1.<init>()     // Catch:{ all -> 0x0127 }
            goto L_0x00dc
        L_0x00e6:
            java.lang.String r7 = r13.A02     // Catch:{ all -> 0x01a1 }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x011f
            boolean r0 = X.C161167p7.A01(r0)     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x011f
            X.7S8 r0 = new X.7S8     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            r0.<init>(r1, r7)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            java.lang.Object r0 = r0.A00()     // Catch:{ SecurityException -> 0x00fc, IllegalStateException | NullPointerException | SecurityException -> 0x010f, IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            goto L_0x0107
        L_0x00fc:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x010a }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
        L_0x0107:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            goto L_0x0120
        L_0x010a:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
            throw r0     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010f }
        L_0x010f:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Unable to read GServices for: "
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "GservicesLoader"
            android.util.Log.e(r0, r1, r2)     // Catch:{ all -> 0x01a1 }
        L_0x011f:
            r0 = r3
        L_0x0120:
            if (r0 == 0) goto L_0x012a
            java.lang.Object r7 = r13.A03(r0)     // Catch:{ all -> 0x01a1 }
            goto L_0x012b
        L_0x0127:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0127 }
            goto L_0x0198
        L_0x012a:
            r7 = r3
        L_0x012b:
            if (r7 != 0) goto L_0x012f
            java.lang.Object r7 = r13.A01     // Catch:{ all -> 0x01a1 }
        L_0x012f:
            X.8lt r0 = r4.A01     // Catch:{ all -> 0x01a1 }
            java.lang.Object r2 = r0.BtG()     // Catch:{ all -> 0x01a1 }
            X.8L7 r2 = (X.AnonymousClass8L7) r2     // Catch:{ all -> 0x01a1 }
            boolean r1 = r2 instanceof X.AnonymousClass6V1     // Catch:{ all -> 0x01a1 }
            if (r1 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r0 = 0
            goto L_0x013f
        L_0x013e:
            r0 = 1
        L_0x013f:
            if (r0 == 0) goto L_0x019b
            if (r1 == 0) goto L_0x0171
            X.6V1 r2 = (X.AnonymousClass6V1) r2     // Catch:{ all -> 0x01a1 }
            java.lang.Object r0 = r2.zza     // Catch:{ all -> 0x01a1 }
            X.7BS r0 = (X.AnonymousClass7BS) r0     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = ""
            java.lang.String r2 = r13.A02     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x01a1 }
            X.0Wz r0 = r0.A00     // Catch:{ all -> 0x01a1 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x01a1 }
            X.0Wz r1 = (X.C06290Wz) r1     // Catch:{ all -> 0x01a1 }
            if (r1 == 0) goto L_0x0169
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x01a1 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01a1 }
        L_0x0169:
            if (r3 != 0) goto L_0x016c
            goto L_0x0199
        L_0x016c:
            java.lang.Object r7 = r13.A03(r3)     // Catch:{ all -> 0x01a1 }
            goto L_0x019b
        L_0x0171:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0178:
            boolean r0 = X.C161167p7.A00()     // Catch:{ all -> 0x01a1 }
            r1 = 0
            if (r0 != 0) goto L_0x0198
            java.lang.Class<X.8A3> r2 = X.AnonymousClass8A3.class
            monitor-enter(r2)     // Catch:{ all -> 0x01a1 }
            java.util.Map r0 = X.AnonymousClass8A3.A00     // Catch:{ all -> 0x0191 }
            r0.get(r3)     // Catch:{ all -> 0x0191 }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0191 }
            throw r3     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x0191:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0191 }
            goto L_0x0198
        L_0x0194:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01a1 }
        L_0x0198:
            throw r1     // Catch:{ all -> 0x01a1 }
        L_0x0199:
            java.lang.Object r7 = r13.A01     // Catch:{ all -> 0x01a1 }
        L_0x019b:
            r13.A05 = r7     // Catch:{ all -> 0x01a1 }
            r13.A04 = r5     // Catch:{ all -> 0x01a1 }
        L_0x019f:
            monitor-exit(r13)     // Catch:{ all -> 0x01a1 }
            goto L_0x01a4
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01a1 }
            throw r0
        L_0x01a4:
            java.lang.Object r0 = r13.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160447ne.A02():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass6V0
            if (r0 == 0) goto L_0x001e
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            X.6VG r0 = X.AnonymousClass6VG.A04(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            java.lang.String r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid byte[] value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x001e:
            boolean r0 = r3 instanceof X.C128156Uz
            if (r0 == 0) goto L_0x003b
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x002e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x002e }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x002e }
            return r0
        L_0x002e:
            java.lang.String r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid double value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x003b:
            boolean r0 = r3 instanceof X.C128146Uy
            if (r0 == 0) goto L_0x0062
            java.util.regex.Pattern r0 = X.C155687fJ.A09
            boolean r0 = X.C18280x3.A1X(r4, r0)
            if (r0 == 0) goto L_0x004a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x004a:
            java.util.regex.Pattern r0 = X.C155687fJ.A0A
            boolean r0 = X.C18280x3.A1X(r4, r0)
            if (r0 == 0) goto L_0x0055
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0055:
            java.lang.String r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid boolean value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x0062:
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x006e }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x006e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x006e }
            return r0
        L_0x006e:
            java.lang.String r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid long value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160447ne.A03(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C160447ne(C156337gS r2, Object obj, String str) {
        if (r2.A00 != null) {
            this.A00 = r2;
            this.A02 = str;
            this.A01 = obj;
            this.A03 = true;
            return;
        }
        throw AnonymousClass001.A0c("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void A01(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(": ");
        sb.append((String) obj);
        Log.e("PhenotypeFlag", sb.toString());
    }
}
