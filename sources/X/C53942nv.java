package X;

/* renamed from: X.2nv  reason: invalid class name and case insensitive filesystem */
public final class C53942nv {
    public final C56612sH A00;
    public final C66543Lv A01;
    public final C56382rt A02;
    public final C56362rr A03;
    public final AnonymousClass1VX A04;
    public final C56182rZ A05;
    public final C45402Zx A06;
    public final C56832sd A07;
    public final C55832qz A08;

    public final void A00(AnonymousClass1RL r12) {
        if (this.A03.A05(r12.A05()) != 3) {
            C95804uY A0I = r12.A0I();
            Long valueOf = Long.valueOf(r12.A0O);
            A01(A0I, valueOf, 134, 3);
            A01(A0I, valueOf, 132, 4);
            if (r12.A0K() && this.A04.A0Y(C58422vE.A02, 5158)) {
                A01(A0I, valueOf, 154, 5);
            }
        }
    }

    public final void A01(C95814uZ r5, Long l, int i, long j) {
        long A0H;
        C162457s7.A0J(r5, 0);
        if (l != null) {
            A0H = l.longValue();
        } else {
            A0H = this.A00.A0H();
        }
        C56832sd r2 = this.A07;
        C30341mI A002 = r2.A03.A00(C56832sd.A00(r5, r2), i, A0H);
        C162457s7.A0D(A002);
        A002.A1M = j;
        this.A01.A08(A002);
        C45402Zx r22 = this.A06;
        C69253Wh.A00(r22.A02, A002, r22, 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C95804uY r8) {
        /*
            r7 = this;
            X.2rZ r6 = r7.A05
            r5 = 0
            X.3dV r0 = r6.A05     // Catch:{ SQLiteException -> 0x005a }
            X.4Fq r3 = r0.A04()     // Catch:{ SQLiteException -> 0x005a }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            X.2sm r0 = r6.A01     // Catch:{ all -> 0x0053 }
            X.C56922sm.A02(r0, r8, r4, r5)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "133"
            r0 = 1
            X.2sg r2 = X.AnonymousClass3H0.A04(r1, r3, r4, r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "SELECT m._id FROM message_view AS m LEFT JOIN message_system AS ms  ON m._id = ms.message_row_id  WHERE chat_row_id = ?  AND action_type = ?"
            java.lang.String r0 = "SELECT_DELETE_SYSTEM_MESSAGE"
            android.database.Cursor r4 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x0053 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "_id"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x004c }
            if (r0 < 0) goto L_0x0045
            long r1 = r4.getLong(r0)     // Catch:{ all -> 0x004c }
            X.2qz r0 = r6.A0B     // Catch:{ all -> 0x004c }
            X.34x r2 = X.C55122pp.A00(r0, r1)     // Catch:{ all -> 0x004c }
            boolean r0 = r2 instanceof X.C30341mI     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0045
            X.3Lv r1 = r6.A03     // Catch:{ all -> 0x004c }
            java.util.List r0 = X.C18290x4.A12(r2)     // Catch:{ all -> 0x004c }
            r1.A0l(r0, r5)     // Catch:{ all -> 0x004c }
        L_0x0045:
            r4.close()     // Catch:{ all -> 0x0053 }
            r3.close()     // Catch:{ SQLiteException -> 0x005a }
            return
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ SQLiteException -> 0x005a }
            throw r0     // Catch:{ SQLiteException -> 0x005a }
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/deleteNewsletterDeleteSystemMessage"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53942nv.A02(X.4uY):void");
    }

    public C53942nv(C56612sH r2, C66543Lv r3, C56382rt r4, C56362rr r5, AnonymousClass1VX r6, C56182rZ r7, C45402Zx r8, C56832sd r9, C55832qz r10) {
        C18260x0.A0f(r2, r4, r5, r10, r9);
        C18260x0.A0U(r7, r3);
        C162457s7.A0J(r6, 9);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
        this.A07 = r9;
        this.A05 = r7;
        this.A01 = r3;
        this.A06 = r8;
        this.A04 = r6;
    }
}
