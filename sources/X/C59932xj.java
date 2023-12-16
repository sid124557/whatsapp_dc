package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.2xj  reason: invalid class name and case insensitive filesystem */
public final class C59932xj {
    public final C56922sm A00;
    public final C72303dV A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C30461mU r14) {
        /*
            r13 = this;
            r4 = 0
            X.C162457s7.A0J(r14, r4)
            X.3dV r0 = r13.A01
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b5 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "SELECT name, description, join_link, start_time, is_canceled, location_latitude, location_longitude, location_name, location_address, chat_row_id FROM message_event WHERE message_row_id = ? "
            r6 = 1
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x00b5 }
            X.C624134x.A0Y(r14, r1, r4)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "GET_MESSAGE_EVENT_BY_MESSAGE_ROW_ID"
            android.database.Cursor r9 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00b5 }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "name"
            int r12 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "description"
            int r11 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "join_link"
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "start_time"
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "is_canceled"
            int r8 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "location_latitude"
            int r4 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "location_longitude"
            int r2 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "location_name"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "location_address"
            int r3 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = X.C18320x8.A0c(r9, r12)     // Catch:{ all -> 0x00ae }
            r14.A04 = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r9.getString(r11)     // Catch:{ all -> 0x00ae }
            r14.A02 = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r9.getString(r10)     // Catch:{ all -> 0x00ae }
            r14.A03 = r0     // Catch:{ all -> 0x00ae }
            long r0 = r9.getLong(r1)     // Catch:{ all -> 0x00ae }
            r14.A00 = r0     // Catch:{ all -> 0x00ae }
            int r0 = r9.getInt(r8)     // Catch:{ all -> 0x00ae }
            if (r0 > 0) goto L_0x007a
            r6 = 0
        L_0x007a:
            r14.A06 = r6     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = r9.getString(r5)     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = r9.getString(r3)     // Catch:{ all -> 0x00ae }
            double r4 = r9.getDouble(r4)     // Catch:{ all -> 0x00ae }
            java.lang.Double r1 = java.lang.Double.valueOf(r4)     // Catch:{ all -> 0x00ae }
            double r2 = r9.getDouble(r2)     // Catch:{ all -> 0x00ae }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0099
            if (r0 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r1 = 0
            goto L_0x00a0
        L_0x009b:
            X.2k9 r1 = new X.2k9     // Catch:{ all -> 0x00ae }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x00ae }
        L_0x00a0:
            X.2lS r0 = new X.2lS     // Catch:{ all -> 0x00ae }
            r0.<init>(r1, r8, r6)     // Catch:{ all -> 0x00ae }
            r14.A01 = r0     // Catch:{ all -> 0x00ae }
        L_0x00a7:
            r9.close()     // Catch:{ all -> 0x00b5 }
            r7.close()
            return
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59932xj.A01(X.1mU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C30461mU r7) {
        /*
            r6 = this;
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.3dV r0 = r6.A01
            X.4Fq r5 = r0.A04()
            long r0 = r7.A1L     // Catch:{ all -> 0x00b1 }
            r2 = 11
            android.content.ContentValues r4 = X.AnonymousClass0x9.A07(r2)     // Catch:{ all -> 0x00b1 }
            X.C18270x1.A0a(r4, r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "description"
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x00b1 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "join_link"
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x00b1 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b1 }
            long r0 = r7.A00     // Catch:{ all -> 0x00b1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "start_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r7.A06     // Catch:{ all -> 0x00b1 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "is_canceled"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            X.2lS r0 = r7.A01     // Catch:{ all -> 0x00b1 }
            r2 = 0
            if (r0 == 0) goto L_0x00a3
            X.2k9 r0 = r0.A00     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a3
            double r0 = r0.A00     // Catch:{ all -> 0x00b1 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b1 }
        L_0x0051:
            java.lang.String r0 = "location_latitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            X.2lS r0 = r7.A01     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            X.2k9 r0 = r0.A00     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            double r0 = r0.A01     // Catch:{ all -> 0x00b1 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00b1 }
        L_0x0064:
            java.lang.String r0 = "location_longitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            X.2lS r0 = r7.A01     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x00b1 }
        L_0x006f:
            java.lang.String r0 = "location_name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b1 }
            X.2lS r0 = r7.A01     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x00b1 }
        L_0x007a:
            java.lang.String r0 = "location_address"
            r4.put(r0, r2)     // Catch:{ all -> 0x00b1 }
            X.2sm r1 = r6.A00     // Catch:{ all -> 0x00b1 }
            X.4uZ r0 = X.AnonymousClass2z0.A00(r7)     // Catch:{ all -> 0x00b1 }
            long r1 = r1.A07(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "chat_row_id"
            X.2sg r3 = X.AnonymousClass3H0.A02(r4, r5, r0, r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "message_event"
            r1 = 5
            java.lang.String r0 = "EventMessageStore/insertOrUpdateMessageEvent"
            long r3 = r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x00b1 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            goto L_0x00a5
        L_0x009f:
            r1 = r2
            goto L_0x006f
        L_0x00a1:
            r1 = r2
            goto L_0x0064
        L_0x00a3:
            r1 = r2
            goto L_0x0051
        L_0x00a5:
            r5.close()
            return
        L_0x00a9:
            java.lang.String r1 = "EventMessageStore/insertOrUpdateMessageEvent the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x00b1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59932xj.A02(X.1mU):void");
    }

    public C59932xj(C56922sm r1, C72303dV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final void A00(Cursor cursor, List list) {
        while (cursor.moveToNext()) {
            list.add(Long.valueOf(AnonymousClass0x2.A0C(cursor, "message_row_id")));
        }
    }
}
