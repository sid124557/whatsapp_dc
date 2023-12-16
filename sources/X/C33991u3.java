package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1u3  reason: invalid class name and case insensitive filesystem */
public abstract class C33991u3 extends AnonymousClass5ZM {
    public final AnonymousClass0QU A00 = new AnonymousClass0QU();
    public final C69263Wi A01;
    public final AnonymousClass2Y1 A02;
    public final AnonymousClass2KV A03;
    public final C60202yA A04;
    public final AnonymousClass319 A05;
    public final C55622qe A06;
    public final C54922pV A07;
    public final C95814uZ A08;
    public final C1907099n A09;
    public final AnonymousClass9U4 A0A;
    public final WeakReference A0B;

    public void A09() {
        this.A00.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c6, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c9, code lost:
        throw r0;
     */
    /* renamed from: A0G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A08(java.lang.Void... r13) {
        /*
            r12 = this;
            X.4MC r6 = r12.A02
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x003e
            X.319 r4 = r12.A05
            X.4uZ r2 = r12.A08
            r1 = 0
            X.4Ks r0 = new X.4Ks
            r0.<init>(r12, r1)
            r3 = 1
            int r0 = r4.A01(r0, r2, r3)
            if (r0 > 0) goto L_0x002c
            X.2yA r0 = r12.A04
            X.0QU r1 = r12.A00
            int r0 = r0.A01(r1, r2)
            if (r0 > 0) goto L_0x002c
            X.2Y1 r0 = r12.A02
            int r0 = r0.A00(r1, r2)
            if (r0 > 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x003e
            X.3Wi r2 = r12.A01
            r1 = 17
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r12, (boolean) r3)
            r2.A0S(r0)
        L_0x003e:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0062
            X.319 r4 = r12.A05
            X.4uZ r3 = r12.A08
            r0 = 0
            X.4Ks r2 = new X.4Ks
            r2.<init>(r12, r0)
            r1 = 12
            r0 = 1
            java.util.ArrayList r2 = r4.A0D(r2, r3, r1, r0)
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0062
            X.3Wi r1 = r12.A01
            r0 = 8
            X.C69263Wi.A08(r1, r12, r2, r0)
        L_0x0062:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x007b
            X.2qe r1 = r12.A06
            X.4uZ r0 = r12.A08
            long r2 = r1.A00(r0)
            X.3Wi r4 = r12.A01
            r1 = 4
            X.3Zv r0 = new X.3Zv
            r0.<init>(r12, r2, r1)
            r4.A0S(r0)
        L_0x007b:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x00d4
            X.2KV r4 = r12.A03
            X.4uZ r5 = r12.A08
            X.3dV r0 = r4.A01
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e5 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id IN (SELECT message_row_id FROM message_ephemeral WHERE keep_in_chat = 1)"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x01e5 }
            X.2sm r0 = r4.A00     // Catch:{ all -> 0x01e5 }
            X.C56922sm.A01(r0, r5, r1)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "GET_KEPT_MESSAGE_COUNT_FOR_JID_SQL"
            android.database.Cursor r4 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x01e5 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "count"
            long r2 = X.AnonymousClass0x2.A0C(r4, r0)     // Catch:{ all -> 0x00be }
            goto L_0x00ba
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "msgstore/countKeptMessages/db no message for "
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x00be }
            r2 = 0
        L_0x00ba:
            r4.close()     // Catch:{ all -> 0x01e5 }
            goto L_0x00c6
        L_0x00be:
            r1 = move-exception
            if (r4 == 0) goto L_0x01e4
            r4.close()     // Catch:{ all -> 0x01e0 }
            goto L_0x01e4
        L_0x00c6:
            r11.close()
            X.3Wi r4 = r12.A01
            r1 = 6
            X.3Zv r0 = new X.3Zv
            r0.<init>(r12, r2, r1)
            r4.A0S(r0)
        L_0x00d4:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x010d
            X.99n r0 = r12.A09
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x010d
            X.9U4 r0 = r12.A0A
            X.36F r9 = r0.A0A()
            X.4uZ r7 = r12.A08
            r8 = 2
            android.util.Pair r10 = r9.A0C(r7)
            r1 = 0
            if (r10 != 0) goto L_0x014d
            X.7oG r4 = r9.A09
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/null selection/version="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r3, r8)
            r4.A05(r0)
        L_0x0102:
            X.3Wi r4 = r12.A01
            r3 = 5
            X.3Zv r0 = new X.3Zv
            r0.<init>(r12, r1, r3)
            r4.A0S(r0)
        L_0x010d:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x01d7
            X.2pV r5 = r12.A07
            X.4uZ r4 = r12.A08
            boolean r0 = r5.A02(r4)
            if (r0 == 0) goto L_0x01d7
            X.1VX r2 = r5.A04
            r1 = 5563(0x15bb, float:7.795E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01d7
            r7 = 0
            X.C162457s7.A0J(r4, r7)
            X.2xj r6 = r5.A03
            X.2sH r0 = r5.A01
            long r2 = r0.A0D()
            X.2sm r0 = r6.A00
            long r0 = r0.A07(r4)
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()
            X.AnonymousClass0x2.A1S(r4, r7, r0)
            r0 = 1
            X.AnonymousClass0x2.A1S(r4, r0, r2)
            X.3dV r0 = r6.A01
            X.4GK r3 = r0.get()
            goto L_0x019f
        L_0x014d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SELECT COUNT(*) as count FROM pay_transaction WHERE "
            r3.append(r0)
            java.lang.Object r0 = r10.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r3)
            java.lang.String r4 = "COUNT_TRANSACTIONS_FOR_JID_SQL"
            X.3dV r0 = r9.A04
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e5 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r10.second     // Catch:{ all -> 0x01e5 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x01e5 }
            android.database.Cursor r5 = r3.A0E(r5, r4, r0)     // Catch:{ all -> 0x01e5 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "count"
            long r1 = X.AnonymousClass0x2.A0C(r5, r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x0197
        L_0x0180:
            X.7oG r4 = r9.A09     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/version="
            r3.append(r0)     // Catch:{ all -> 0x01d9 }
            r3.append(r8)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "/db no message for "
            java.lang.String r0 = X.C18260x0.A03(r7, r0, r3)     // Catch:{ all -> 0x01d9 }
            r4.A06(r0)     // Catch:{ all -> 0x01d9 }
        L_0x0197:
            r5.close()     // Catch:{ all -> 0x01e5 }
            r11.close()
            goto L_0x0102
        L_0x019f:
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01c3 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\n    AND\n    start_time > ?\nORDER BY start_time\nASC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_UPCOMING_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r2 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x01c3 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x01bc }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01bc }
            X.C59932xj.A00(r2, r0)     // Catch:{ all -> 0x01bc }
            if (r2 == 0) goto L_0x01ca
            r2.close()     // Catch:{ all -> 0x01c3 }
            goto L_0x01ca
        L_0x01bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01be }
        L_0x01be:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c5 }
        L_0x01c5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x01ca:
            r3.close()
            java.util.List r2 = r5.A01(r0)
            X.3Wi r1 = r12.A01
            r0 = 7
            X.C69263Wi.A08(r1, r12, r2, r0)
        L_0x01d7:
            r0 = 0
            return r0
        L_0x01d9:
            r1 = move-exception
            if (r5 == 0) goto L_0x01e4
            r5.close()     // Catch:{ all -> 0x01e0 }
            goto L_0x01e4
        L_0x01e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e5 }
        L_0x01e4:
            throw r1     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x01ea }
            throw r1
        L_0x01ea:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33991u3.A08(java.lang.Void[]):java.lang.Void");
    }

    public C33991u3(C69263Wi r2, AnonymousClass10p r3, AnonymousClass2Y1 r4, AnonymousClass2KV r5, C60202yA r6, AnonymousClass319 r7, C55622qe r8, C54922pV r9, C95814uZ r10, C1907099n r11, AnonymousClass9U4 r12) {
        this.A01 = r2;
        this.A0A = r12;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A0B = AnonymousClass0x9.A14(r3);
        this.A08 = r10;
    }
}
