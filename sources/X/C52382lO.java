package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2lO  reason: invalid class name and case insensitive filesystem */
public class C52382lO {
    public final C04840Qw A00 = new C04840Qw(2500);
    public final C623334p A01;
    public final C72303dV A02;

    public synchronized void A02(UserJid userJid) {
        Long A002 = A00(userJid);
        long j = 1;
        if (A002 != null) {
            j = 1 + A002.longValue();
        }
        long A05 = this.A01.A05(userJid);
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A09 = C18280x3.A09();
            C18270x1.A0c(A09, "user_jid_row_id", A05);
            AnonymousClass3H0.A02(A09, A04, "version", j).A0C("primary_device_version", "INSERT_PRIMARY_DEVICE_VERSION_SQL", A09, 5);
            C04840Qw r1 = this.A00;
            synchronized (r1) {
                r1.A05(userJid);
            }
            A04.close();
        } catch (Throwable th) {
            try {
                A04.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = ((X.AnonymousClass3H0) r3).A03.A0E("SELECT version FROM primary_device_version WHERE user_jid_row_id = ?", "GET_PRIMARY_DEVICE_VERSION_SQL", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r2.moveToNext() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = X.AnonymousClass0x2.A0C(r2, "version");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.Long.valueOf(r0);
        r4.A08(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0068, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r5 = X.AnonymousClass0x9.A1Y();
        X.C18260x0.A1X(r5, r6.A01.A05(r7));
        r3 = r6.A02.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A00(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.0Qw r4 = r6.A00
            monitor-enter(r4)
            java.lang.Object r0 = r4.A04(r7)     // Catch:{ all -> 0x006c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            return r0
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Y()
            X.34p r0 = r6.A01
            long r0 = r0.A05(r7)
            X.C18260x0.A1X(r5, r0)
            X.3dV r0 = r6.A02
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0062 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "SELECT version FROM primary_device_version WHERE user_jid_row_id = ?"
            java.lang.String r0 = "GET_PRIMARY_DEVICE_VERSION_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r5)     // Catch:{ all -> 0x0062 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "version"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0056 }
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004b }
            r4.A08(r7, r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ all -> 0x0062 }
            r3.close()
            return r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x0062 }
            r3.close()
            r0 = 0
            return r0
        L_0x0056:
            r1 = move-exception
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0062 }
        L_0x0061:
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0067 }
            throw r1
        L_0x0067:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x006c:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52382lO.A00(com.whatsapp.jid.UserJid):java.lang.Long");
    }

    public C52382lO(C623334p r3, C72303dV r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public Map A01(Set set) {
        Long valueOf;
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        C04840Qw r7 = this.A00;
        synchronized (r7) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                UserJid A0T = C18310x6.A0T(it);
                if (r7.A04(A0T) != null) {
                    A0t.put(A0T, (Long) r7.A04(A0T));
                } else {
                    A0s.add(A0T);
                }
            }
        }
        String[] strArr = new String[A0s.size()];
        Iterator it2 = A0s.iterator();
        int i = 0;
        while (it2.hasNext()) {
            AnonymousClass0x2.A1S(strArr, i, this.A01.A05(AnonymousClass0x7.A0S(it2)));
            i++;
        }
        AnonymousClass4GK A03 = this.A02.get();
        try {
            C71923ct r8 = new C71923ct(strArr, 975);
            while (r8.hasNext()) {
                String[] A012 = C71923ct.A01(r8);
                C56862sg r3 = ((AnonymousClass3H0) A03).A03;
                int length = A012.length;
                StringBuilder A0o = AnonymousClass001.A0o();
                C57212tH.A02("SELECT user_jid_row_id, version FROM primary_device_version WHERE user_jid_row_id IN ", A0o, length);
                Cursor A0E = r3.A0E(A0o.toString(), "GET_PRIMARY_DEVICE_VERSIONS_SQL", A012);
                try {
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("user_jid_row_id");
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("version");
                    while (A0E.moveToNext()) {
                        UserJid A022 = C623334p.A02(this.A01, UserJid.class, A0E.getLong(columnIndexOrThrow));
                        C626936e.A06(A022);
                        long j = A0E.getLong(columnIndexOrThrow2);
                        synchronized (r7) {
                            valueOf = Long.valueOf(j);
                            r7.A08(A022, valueOf);
                        }
                        A0t.put(A022, valueOf);
                    }
                    A0E.close();
                } catch (Throwable th) {
                    if (A0E != null) {
                        A0E.close();
                    }
                    throw th;
                }
            }
            A03.close();
            return A0t;
        } catch (Throwable th2) {
            try {
                A03.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
