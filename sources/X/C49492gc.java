package X;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: X.2gc  reason: invalid class name and case insensitive filesystem */
public class C49492gc {
    public final C623334p A00;
    public final C72303dV A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b A[SYNTHETIC, Splitter:B:16:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42262Nk A00(X.C27991fJ r12) {
        /*
            r11 = this;
            r6 = r11
            java.util.Map r2 = r11.A02
            monitor-enter(r2)
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0072 }
            X.34p r0 = r11.A00     // Catch:{ all -> 0x0072 }
            long r0 = r0.A05(r12)     // Catch:{ all -> 0x0072 }
            X.C18260x0.A1Y(r5, r0)     // Catch:{ all -> 0x0072 }
            X.3dV r0 = r11.A01     // Catch:{ all -> 0x0072 }
            X.4GK r4 = r0.get()     // Catch:{ all -> 0x0072 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0068 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "SELECT subject_timestamp, announcement_version FROM group_notification_version WHERE group_jid_row_id = ?"
            java.lang.String r0 = "GET_GROUP_NOTIFICATION_VERSION_SQL"
            android.database.Cursor r3 = r3.A0E(r1, r0, r5)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x003e
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "subject_timestamp"
            long r7 = X.AnonymousClass0x2.A0C(r3, r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "announcement_version"
            long r9 = X.AnonymousClass0x2.A0C(r3, r0)     // Catch:{ all -> 0x005c }
            X.2Nk r5 = new X.2Nk     // Catch:{ all -> 0x005c }
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x005c }
            goto L_0x0046
        L_0x003e:
            r7 = 0
            X.2Nk r5 = new X.2Nk     // Catch:{ all -> 0x005c }
            r9 = r7
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x005c }
        L_0x0046:
            r2.put(r12, r5)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ all -> 0x0068 }
        L_0x004e:
            r4.close()     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r2.get(r12)     // Catch:{ all -> 0x0072 }
            X.2Nk r0 = (X.C42262Nk) r0     // Catch:{ all -> 0x0072 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0072 }
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            return r0
        L_0x005c:
            r1 = move-exception
            if (r3 == 0) goto L_0x0067
            r3.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49492gc.A00(X.1fJ):X.2Nk");
    }

    public final void A01(C27991fJ r6, long j, long j2, long j3) {
        C85284Fq A04 = this.A01.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0c(A06, "group_jid_row_id", this.A00.A05(r6));
            C18270x1.A0c(A06, "subject_timestamp", j);
            C18270x1.A0c(A06, "announcement_version", j2);
            AnonymousClass3H0.A02(A06, A04, "participant_version", j3).A08("group_notification_version", "INSERT_GROUP_NOTIFICATION_VERSION", A06);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C49492gc(C623334p r2, C72303dV r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
