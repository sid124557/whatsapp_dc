package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2l7  reason: invalid class name and case insensitive filesystem */
public class C52212l7 {
    public final C33171sZ A00;
    public final C623334p A01;
    public final C72303dV A02;

    public synchronized long A00(UserJid userJid, String str) {
        C69833Yo Axl;
        long j;
        long A09;
        C626936e.A00();
        C85284Fq A04 = this.A02.A04();
        try {
            Axl = A04.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("token", str);
            if (userJid != null) {
                j = this.A01.A05(userJid);
            } else {
                j = 0;
            }
            A09 = AnonymousClass3H0.A02(A06, A04, "creator_jid_row_id", j).A09("call_link", "call_link_store/insert", A06);
            this.A00.put(str, new C52222l8(userJid, str, A09));
            Axl.A00();
            Axl.close();
            A04.close();
        } catch (Throwable th) {
            try {
                A04.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return A09;
        throw th;
    }

    public synchronized C52222l8 A01(Cursor cursor) {
        C52222l8 r5;
        int i;
        int columnIndex = cursor.getColumnIndex("call_link_id");
        r5 = null;
        if (!(columnIndex == -1 || (i = cursor.getInt(columnIndex)) == 0)) {
            r5 = new C52222l8(AnonymousClass32Y.A02(this.A01, (long) AnonymousClass0x2.A04(cursor, "creator_jid_row_id")), AnonymousClass0x2.A0Z(cursor, "token"), (long) i);
        }
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C52222l8 A02(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.1sZ r6 = r8.A00     // Catch:{ all -> 0x0072 }
            boolean r0 = r6.containsKey(r9)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r6.get(r9)     // Catch:{ all -> 0x0072 }
            X.2l8 r0 = (X.C52222l8) r0     // Catch:{ all -> 0x0072 }
            goto L_0x0052
        L_0x0010:
            X.3dV r0 = r8.A02     // Catch:{ all -> 0x0072 }
            X.4GK r7 = r0.get()     // Catch:{ all -> 0x0072 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0068 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "SELECT _id, token, creator_jid_row_id FROM call_link WHERE token = ?"
            java.lang.String[] r1 = X.C18270x1.A1b(r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "get_call_link_by_token"
            android.database.Cursor r5 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0068 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "_id"
            int r0 = X.AnonymousClass0x2.A04(r5, r0)     // Catch:{ all -> 0x005c }
            long r3 = (long) r0     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "creator_jid_row_id"
            int r0 = X.AnonymousClass0x2.A04(r5, r0)     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0044
            X.34p r2 = r8.A01     // Catch:{ all -> 0x005c }
            long r0 = (long) r0     // Catch:{ all -> 0x005c }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A02(r2, r0)     // Catch:{ all -> 0x005c }
        L_0x0044:
            X.2l8 r0 = new X.2l8     // Catch:{ all -> 0x005c }
            r0.<init>(r1, r9, r3)     // Catch:{ all -> 0x005c }
            r6.put(r9, r0)     // Catch:{ all -> 0x005c }
            r5.close()     // Catch:{ all -> 0x0068 }
            r7.close()     // Catch:{ all -> 0x0072 }
        L_0x0052:
            monitor-exit(r8)
            return r0
        L_0x0054:
            r5.close()     // Catch:{ all -> 0x0068 }
            r7.close()     // Catch:{ all -> 0x0072 }
            monitor-exit(r8)
            return r1
        L_0x005c:
            r1 = move-exception
            if (r5 == 0) goto L_0x0067
            r5.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52212l7.A02(java.lang.String):X.2l8");
    }

    public C52212l7(C33171sZ r1, C623334p r2, C72303dV r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
