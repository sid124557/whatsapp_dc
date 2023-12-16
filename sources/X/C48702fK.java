package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.2fK  reason: invalid class name and case insensitive filesystem */
public final class C48702fK {
    public final C56922sm A00;
    public final C72303dV A01;

    public final void A00(Cursor cursor, List list) {
        String string;
        Long A0T;
        List list2;
        String string2;
        Cursor cursor2 = cursor;
        int A02 = AnonymousClass0x7.A02(cursor2);
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("chat_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("server_message_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("reaction_from_me");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("reactions_from_me_ts");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("votes_from_me");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("votes_from_me_ts");
        while (cursor2.moveToNext()) {
            long j = cursor2.getLong(A02);
            long j2 = cursor2.getLong(columnIndexOrThrow);
            long j3 = cursor2.getLong(columnIndexOrThrow2);
            Long l = null;
            if (cursor2.isNull(columnIndexOrThrow3)) {
                string = null;
            } else {
                string = cursor2.getString(columnIndexOrThrow3);
            }
            if (cursor2.isNull(columnIndexOrThrow4)) {
                A0T = null;
            } else {
                A0T = C18280x3.A0T(cursor2, columnIndexOrThrow4);
            }
            if (cursor2.isNull(columnIndexOrThrow5) || (string2 = cursor2.getString(columnIndexOrThrow5)) == null || C175738Zn.A0V(string2)) {
                list2 = C72023d3.A00;
            } else {
                list2 = AnonymousClass2AB.A01(string2, ",");
            }
            if (!cursor2.isNull(columnIndexOrThrow6)) {
                l = C18280x3.A0T(cursor2, columnIndexOrThrow6);
            }
            C95804uY r13 = (C95804uY) this.A00.A0B(j2);
            if (r13 != null) {
                list.add(new C53702nW(r13, A0T, l, string, list2, j, j3));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95804uY r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.util.List r22, long r23) {
        /*
            r17 = this;
            r3 = r20
            r10 = r19
            r8 = r22
            r9 = r21
            r12 = 0
            java.lang.String[] r14 = X.AnonymousClass0x9.A1Z()
            r13 = r17
            X.2sm r6 = r13.A00
            r7 = r18
            X.C56922sm.A02(r6, r7, r14, r12)
            r0 = 1
            r1 = r23
            X.AnonymousClass0x2.A1S(r14, r0, r1)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            X.3dV r0 = r13.A01
            r16 = r0
            X.4GK r5 = r16.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ea }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "SELECT _id, chat_row_id, server_message_id, reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message WHERE chat_row_id = ? AND server_message_id = ?"
            java.lang.String r0 = "SELECT_ORPHAN_MY_ADD_ONS_FOR_MESSAGE"
            android.database.Cursor r4 = r15.A0E(r4, r0, r14)     // Catch:{ all -> 0x00ea }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x00e3 }
            r13.A00(r4, r11)     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ all -> 0x00ea }
        L_0x0040:
            r5.close()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.Object r13 = r11.get(r12)
            X.2nW r13 = (X.C53702nW) r13
            if (r21 == 0) goto L_0x0063
            java.lang.Long r0 = r13.A03
            if (r0 == 0) goto L_0x0067
            if (r19 == 0) goto L_0x0063
            long r11 = r0.longValue()
            long r4 = r10.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
        L_0x0063:
            java.lang.String r9 = r13.A05
            java.lang.Long r10 = r13.A03
        L_0x0067:
            if (r22 == 0) goto L_0x007b
            java.lang.Long r0 = r13.A04
            if (r0 == 0) goto L_0x007f
            if (r20 == 0) goto L_0x007b
            long r11 = r0.longValue()
            long r4 = r3.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
        L_0x007b:
            java.util.List r8 = r13.A06
            java.lang.Long r3 = r13.A04
        L_0x007f:
            X.4Fq r4 = r16.A04()     // Catch:{ all -> 0x00d2 }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "chat_row_id"
            long r6 = r6.A07(r7)     // Catch:{ all -> 0x00cb }
            X.C18270x1.A0c(r5, r0, r6)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "server_message_id"
            X.C18270x1.A0c(r5, r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "reaction_from_me"
            r5.put(r0, r9)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "reactions_from_me_ts"
            r5.put(r0, r10)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = "votes_from_me"
            if (r8 != 0) goto L_0x00a9
            r0 = 0
            goto L_0x00af
        L_0x00a9:
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r8)     // Catch:{ all -> 0x00cb }
        L_0x00af:
            r5.put(r1, r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "votes_from_me_ts"
            X.2sg r3 = X.AnonymousClass3H0.A00(r5, r3, r4, r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "newsletter_my_reaction_orphan_message"
            r1 = 5
            java.lang.String r0 = "NewsletterMyAddOnMessageOrphanStore/insertOrReplaceNewsletterOrphanMyAddOns"
            long r0 = r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x00cb }
            r4.close()     // Catch:{ all -> 0x00d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d7
        L_0x00cb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x00d7:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "NewsletterMyAddOnMessageOrphanStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e2:
            return
        L_0x00e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48702fK.A01(X.4uY, java.lang.Long, java.lang.Long, java.lang.String, java.util.List, long):void");
    }

    public C48702fK(C56922sm r1, C72303dV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
