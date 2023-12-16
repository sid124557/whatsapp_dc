package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.2rO  reason: invalid class name and case insensitive filesystem */
public class C56082rO {
    public final C56612sH A00;
    public final C49472ga A01;
    public final C72303dV A02;
    public final AnonymousClass4FS A03;
    public final Object A04 = AnonymousClass002.A0D();
    public final Map A05 = AnonymousClass001.A0t();

    public void A02(String str) {
        C85284Fq A042 = this.A02.A04();
        try {
            C622033z.A01(((AnonymousClass3H0) A042).A03, str);
            A042.close();
            synchronized (this.A04) {
                this.A05.remove(str);
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C56082rO(C56612sH r2, C49472ga r3, C72303dV r4, AnonymousClass4FS r5) {
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public long A00(String str, long j) {
        String A012 = A01(str);
        if (A012 == null) {
            return j;
        }
        return Long.parseLong(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r6 = r9.A02.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = ((X.AnonymousClass3H0) r6).A03.A0E("SELECT value FROM props WHERE key = ?", "GET_PROP_VALUE", X.C18270x1.A1b(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r5.moveToNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r4 = X.AnonymousClass0x2.A0Z(r5, "value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r8.put(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        X.C49472ga.A00(r9.A01, "PropsMessageStore/getProp", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        if (r5 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0067, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r10) {
        /*
            r9 = this;
            long r2 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r7 = r9.A04
            monitor-enter(r7)
            java.util.Map r8 = r9.A05     // Catch:{ all -> 0x006a }
            boolean r0 = r8.containsKey(r10)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = X.C18310x6.A0o(r10, r8)     // Catch:{ all -> 0x006a }
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            return r0
        L_0x0015:
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            X.3dV r0 = r9.A02     // Catch:{ all -> 0x0068 }
            X.4GK r6 = r0.get()     // Catch:{ all -> 0x0068 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005e }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x005e }
            java.lang.String r4 = "SELECT value FROM props WHERE key = ?"
            java.lang.String[] r1 = X.C18270x1.A1b(r10)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "GET_PROP_VALUE"
            android.database.Cursor r5 = r5.A0E(r4, r0, r1)     // Catch:{ all -> 0x005e }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "value"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r5, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            r5.close()     // Catch:{ all -> 0x005e }
            r6.close()     // Catch:{ all -> 0x0068 }
            monitor-enter(r7)
            r8.put(r10, r4)     // Catch:{ all -> 0x004f }
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            X.2ga r1 = r9.A01
            java.lang.String r0 = "PropsMessageStore/getProp"
            X.C49472ga.A00(r1, r0, r2)
            return r4
        L_0x004f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            r1 = move-exception
            if (r5 == 0) goto L_0x005d
            r5.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x005e }
        L_0x005d:
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            throw r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56082rO.A01(java.lang.String):java.lang.String");
    }

    public void A03(String str, int i) {
        A05(str, String.valueOf(i));
    }

    public void A04(String str, long j) {
        A05(str, String.valueOf(j));
    }

    public void A05(String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C85284Fq A042 = this.A02.A04();
        try {
            C622033z.A03(((AnonymousClass3H0) A042).A03, str, str2, "PropsMessageStore");
            A042.close();
            synchronized (this.A04) {
                this.A05.put(str, str2);
            }
            C49472ga.A00(this.A01, "PropsMessageStore/setProp", uptimeMillis);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
