package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2p4  reason: invalid class name and case insensitive filesystem */
public class C54652p4 {
    public final C623334p A00;
    public final C72303dV A01;
    public final Object A02 = AnonymousClass002.A0D();
    public final Map A03;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C60212yB A01(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.Object r4 = r7.A02
            monitor-enter(r4)
            java.util.Map r5 = r7.A03     // Catch:{ all -> 0x006b }
            boolean r0 = r5.containsKey(r8)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x006b }
            X.2yB r0 = (X.C60212yB) r0     // Catch:{ all -> 0x006b }
        L_0x0011:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            goto L_0x0054
        L_0x0013:
            java.lang.String[] r6 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x006b }
            X.34p r0 = r7.A00     // Catch:{ all -> 0x006b }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x006b }
            X.C18260x0.A1Y(r6, r0)     // Catch:{ all -> 0x006b }
            X.3dV r0 = r7.A01     // Catch:{ all -> 0x006b }
            X.4GK r3 = r0.get()     // Catch:{ all -> 0x006b }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0061 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type FROM user_device_info WHERE user_jid_row_id = ?"
            java.lang.String r0 = "GET_USER_DEVICE_INFO_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r6)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0042
        L_0x0038:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0036
            X.2yB r0 = r7.A00(r2)     // Catch:{ all -> 0x0055 }
        L_0x0042:
            r5.put(r8, r0)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ all -> 0x0061 }
        L_0x004a:
            r3.close()     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x006b }
            X.2yB r0 = (X.C60212yB) r0     // Catch:{ all -> 0x006b }
            goto L_0x0011
        L_0x0054:
            return r0
        L_0x0055:
            r1 = move-exception
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0061 }
        L_0x0060:
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x006b }
        L_0x006a:
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54652p4.A01(com.whatsapp.jid.UserJid):X.2yB");
    }

    public void A02(C60212yB r20, UserJid userJid) {
        C69833Yo Axl;
        UserJid userJid2 = userJid;
        long A05 = this.A00.A05(userJid2);
        C85284Fq A04 = this.A01.A04();
        try {
            Axl = A04.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            C60212yB r10 = r20;
            int i = r10.A01;
            C18270x1.A0b(A06, "raw_id", i);
            long j = r10.A05;
            C18270x1.A0c(A06, "timestamp", j);
            C18270x1.A0c(A06, "expected_timestamp", r10.A02);
            C18270x1.A0c(A06, "expected_ts_last_device_job_ts", r10.A04);
            C18270x1.A0c(A06, "expected_timestamp_update_ts", r10.A03);
            C56862sg A012 = AnonymousClass3H0.A01(A06, A04, "account_encryption_type", r10.A00);
            String[] strArr = new String[1];
            C18260x0.A1X(strArr, A05);
            if (A012.A05(A06, "user_device_info", "user_jid_row_id = ?", "UPDATE_USER_DEVICE_INFO", strArr) != 1) {
                C18270x1.A0c(A06, "user_jid_row_id", A05);
                A012.A09("user_device_info", "INSERT_USER_DEVICE_INFO", A06);
            }
            Axl.A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("UserDeviceInfoStore/insertOrUpdateUserDeviceInfo/inserted for userJid=");
            A0o.append(userJid2);
            A0o.append("; rawId=");
            A0o.append(i);
            C18260x0.A10("; timestamp", A0o, j);
            A04.B25(new C71343bx(this, 3, userJid2));
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C54652p4(C623334p r2, C72303dV r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = AnonymousClass0x7.A0y();
    }

    public final C60212yB A00(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("raw_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("expected_timestamp");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("expected_ts_last_device_job_ts");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("expected_timestamp_update_ts");
        return new C60212yB(cursor2.getInt(columnIndexOrThrow), C18290x4.A01(cursor2, cursor2.getColumnIndexOrThrow("account_encryption_type")), cursor2.getLong(columnIndexOrThrow2), cursor2.getLong(columnIndexOrThrow3), cursor2.getLong(columnIndexOrThrow4), cursor2.getLong(columnIndexOrThrow5));
    }

    public void A03(UserJid userJid) {
        C69833Yo Axl;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18260x0.A1Y(A1Y, this.A00.A05(userJid));
        C85284Fq A04 = this.A01.A04();
        try {
            Axl = A04.Axl();
            ((AnonymousClass3H0) A04).A03.A07("user_device_info", "user_jid_row_id=?", "deleteUserDeviceInfo/DELETE_USER_DEVICE_INFO", A1Y);
            Axl.A00();
            C18260x0.A1P(AnonymousClass001.A0o(), "UserDeviceInfoStore/insertOrUpdateUserDeviceInfo/deleted for userJid=", userJid);
            A04.B25(new C71343bx(this, 4, userJid));
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
