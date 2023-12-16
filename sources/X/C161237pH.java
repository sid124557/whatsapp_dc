package X;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.7pH  reason: invalid class name and case insensitive filesystem */
public class C161237pH {
    public static Object A00;
    public static HashMap A01;
    public static boolean A02;
    public static String[] A03 = new String[0];
    public static final Uri A04 = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri A05 = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final HashMap A06 = AnonymousClass001.A0t();
    public static final HashMap A07 = AnonymousClass001.A0t();
    public static final HashMap A08 = AnonymousClass001.A0t();
    public static final HashMap A09 = AnonymousClass001.A0t();
    public static final AtomicBoolean A0A = new AtomicBoolean();
    public static final Pattern A0B = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern A0C = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r0 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        r2 = r8.query(A04, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r2 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (r2.moveToFirst() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        if (r1 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        if (r3 != A00) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a8, code lost:
        A01.put(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b5, code lost:
        if (r3 != A00) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b7, code lost:
        A01.put(r14, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bc, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bd, code lost:
        if (r2 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c0, code lost:
        if (r1 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c2, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c3, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c6, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cb, code lost:
        if (r2 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cd, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.ContentResolver r13, java.lang.String r14) {
        /*
            java.lang.Class<X.7pH> r7 = X.C161237pH.class
            monitor-enter(r7)
            r8 = r13
            A01(r13)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r3 = A00     // Catch:{ all -> 0x00d1 }
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x00d1 }
            r10 = 0
            if (r0 == 0) goto L_0x0019
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = X.C18320x8.A0e(r14, r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x0076
        L_0x0019:
            java.lang.String[] r12 = A03     // Catch:{ all -> 0x00d1 }
            int r2 = r12.length     // Catch:{ all -> 0x00d1 }
            r6 = 0
            r1 = 0
        L_0x001e:
            r5 = 1
            if (r1 >= r2) goto L_0x0081
            r0 = r12[r1]     // Catch:{ all -> 0x00d1 }
            boolean r0 = r14.startsWith(r0)     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x0045
            boolean r0 = A02     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x0035
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x007f
        L_0x0035:
            java.util.HashMap r4 = A01     // Catch:{ all -> 0x00d1 }
            android.net.Uri r9 = A05     // Catch:{ all -> 0x00d1 }
            r13 = r10
            r11 = r10
            android.database.Cursor r3 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d1 }
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch:{ all -> 0x00d1 }
            r2.<init>()     // Catch:{ all -> 0x00d1 }
            goto L_0x0048
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0048:
            if (r3 != 0) goto L_0x004b
            goto L_0x0060
        L_0x004b:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = r3.getString(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x007a }
            r2.put(r1, r0)     // Catch:{ all -> 0x007a }
            goto L_0x004b
        L_0x005d:
            r3.close()     // Catch:{ all -> 0x00d1 }
        L_0x0060:
            r4.putAll(r2)     // Catch:{ all -> 0x00d1 }
            A02 = r5     // Catch:{ all -> 0x00d1 }
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x007f
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = X.C18320x8.A0e(r14, r0)     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x007f
            goto L_0x0078
        L_0x0076:
            if (r0 == 0) goto L_0x007f
        L_0x0078:
            r10 = r0
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x007f:
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            return r10
        L_0x0081:
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            android.net.Uri r9 = A04
            java.lang.String[] r12 = new java.lang.String[r5]
            r12[r6] = r14
            r13 = r10
            r11 = r10
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)
            if (r2 == 0) goto L_0x00b2
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r2.getString(r5)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1.equals(r10)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00a3
            r1 = r10
        L_0x00a3:
            monitor-enter(r7)     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x00af }
            if (r3 != r0) goto L_0x00ad
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00af }
            r0.put(r14, r1)     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r7)     // Catch:{ all -> 0x00af }
            goto L_0x00c0
        L_0x00af:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00af }
            goto L_0x00c9
        L_0x00b2:
            monitor-enter(r7)     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x00c7 }
            if (r3 != r0) goto L_0x00bc
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00c7 }
            r0.put(r14, r10)     // Catch:{ all -> 0x00c7 }
        L_0x00bc:
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x00c0:
            if (r1 == 0) goto L_0x00c3
            r10 = r1
        L_0x00c3:
            r2.close()
        L_0x00c6:
            return r10
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
        L_0x00c9:
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            if (r2 == 0) goto L_0x00d0
            r2.close()
        L_0x00d0:
            throw r0
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161237pH.A00(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static void A01(ContentResolver contentResolver) {
        if (A01 == null) {
            A0A.set(false);
            A01 = AnonymousClass001.A0t();
            A00 = AnonymousClass002.A0D();
            A02 = false;
            contentResolver.registerContentObserver(A04, true, new C124466Cj());
        } else if (A0A.getAndSet(false)) {
            A01.clear();
            A06.clear();
            A07.clear();
            A08.clear();
            A09.clear();
            A00 = AnonymousClass002.A0D();
            A02 = false;
        }
    }
}
