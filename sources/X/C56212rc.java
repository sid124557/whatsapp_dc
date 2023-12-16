package X;

/* renamed from: X.2rc  reason: invalid class name and case insensitive filesystem */
public final class C56212rc {
    public final C49712gy A00;
    public final C56612sH A01;
    public final C56982ss A02;
    public final C72303dV A03;
    public final C56652sL A04;
    public final C56362rr A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass5UP A07;
    public final C56182rZ A08;
    public final C48702fK A09;
    public final C55632qf A0A;
    public final C53852nm A0B;
    public final C45402Zx A0C;
    public final AnonymousClass4FS A0D;

    public final void A04(C95804uY r10, C83994Ap r11, Long l, int i) {
        C95804uY r2 = r10;
        C162457s7.A0J(r10, 0);
        C56982ss r1 = this.A02;
        AnonymousClass31A A0A2 = r1.A0A(r10, false);
        if (A0A2 == null) {
            return;
        }
        if (!(A0A2 instanceof AnonymousClass1RL)) {
            throw AnonymousClass001.A0c("Failed requirement.");
        } else if (C106855aH.A04(r1, r10, this.A07)) {
            this.A0D.BkM(new C71473cA(r2, r11, A0A2, this, l, i, 4));
        }
    }

    public final void A00(C95804uY r4) {
        AnonymousClass1RL r2;
        AnonymousClass31A A002 = C56982ss.A00(this.A02, r4);
        if (!(A002 instanceof AnonymousClass1RL) || (r2 = (AnonymousClass1RL) A002) == null) {
            throw AnonymousClass001.A0e("NewsletterInfo expected in chatCache");
        } else if (!r2.A0M) {
            C70353aM.A00(this.A0D, this, r4, r2, 21);
        }
    }

    public final void A01(C95804uY r5) {
        long j;
        if (this.A06.A0Y(C58422vE.A02, 4306)) {
            if (r5 != null) {
                j = 300;
            } else {
                j = 1000;
            }
            this.A00.A02(new C28451gt(r5, j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0153, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0156, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0157, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x015a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0146, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x014b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014c, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0150, code lost:
        X.AnonymousClass2A8.A00(r7, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C95804uY r20) {
        /*
            r19 = this;
            r4 = r19
            r2 = r20
            if (r20 != 0) goto L_0x0039
            X.2fK r3 = r4.A09
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.3dV r6 = r3.A01
            X.4GK r5 = r6.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0032 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "SELECT _id, chat_row_id, server_message_id,reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message"
            java.lang.String r0 = "SELECT_ALL_ORPHAN_MY_ADD_ONS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0032 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x002b }
            r3.A00(r2, r8)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0067
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        L_0x0039:
            X.2fK r7 = r4.A09
            r1 = 0
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()
            X.2sm r0 = r7.A00
            X.C56922sm.A02(r0, r2, r3, r1)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.3dV r6 = r7.A01
            X.4GK r5 = r6.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0154 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "SELECT _id, chat_row_id, server_message_id, reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message WHERE chat_row_id = ?"
            java.lang.String r0 = "SELECT_ORPHAN_MY_REACTIONS_FOR"
            android.database.Cursor r2 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0154 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0149 }
            r7.A00(r2, r8)     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ all -> 0x0154 }
        L_0x0067:
            r5.close()
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0148
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r8.iterator()
        L_0x007c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r5 = r9.next()
            X.2nW r5 = (X.C53702nW) r5
            X.2rZ r8 = r4.A08
            X.4uY r7 = r5.A02
            long r0 = r5.A01
            X.34x r11 = r8.A00(r7, r0)
            if (r11 == 0) goto L_0x007c
            long r0 = r5.A00
            X.AnonymousClass0x2.A1Q(r3, r0)
            X.2qf r10 = r4.A0A
            X.2sH r0 = r4.A01
            long r15 = r0.A0H()
            r12 = 0
            java.lang.String r14 = r5.A05
            java.lang.Long r13 = r5.A03
            r18 = 0
            r17 = 1
            r10.A02(r11, r12, r13, r14, r15, r17, r18)
            X.2z0 r0 = r11.A1J
            X.4uZ r8 = r0.A00
            boolean r0 = r8 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r11 instanceof X.C30451mT
            if (r0 == 0) goto L_0x00d1
            java.util.List r7 = r5.A06
            if (r7 == 0) goto L_0x00d1
            java.lang.Long r1 = r5.A04
            if (r1 == 0) goto L_0x00d1
            X.4uY r8 = (X.C95804uY) r8
            r0 = r11
            X.1mT r0 = (X.C30451mT) r0
            long r16 = r1.longValue()
            r12 = r10
            r13 = r8
            r14 = r0
            r15 = r7
            r12.A01(r13, r14, r15, r16)
        L_0x00d1:
            r2.add(r11)
            goto L_0x007c
        L_0x00d5:
            X.3dV r0 = r4.A03
            X.4Fq r5 = r0.A04()
            X.3Yo r7 = r5.Axl()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00e3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00f3
            X.34x r1 = X.C18300x5.A0T(r2)     // Catch:{ all -> 0x0144 }
            X.2rZ r0 = r4.A08     // Catch:{ all -> 0x0144 }
            r0.A04(r1)     // Catch:{ all -> 0x0144 }
            goto L_0x00e3
        L_0x00f3:
            r9 = 0
            X.4Fq r4 = r6.A04()     // Catch:{ all -> 0x0144 }
            X.3Yo r8 = r4.Axl()     // Catch:{ all -> 0x013d }
            java.lang.String r0 = ""
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0136 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x0136 }
        L_0x0106:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x0123
            long r0 = X.C18270x1.A02(r6)     // Catch:{ all -> 0x0136 }
            X.AnonymousClass0x2.A1S(r10, r9, r0)     // Catch:{ all -> 0x0136 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0136 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "newsletter_my_reaction_orphan_message"
            java.lang.String r1 = "_id = ?"
            java.lang.String r0 = "STORE_RESOLVED"
            r3.A07(r2, r1, r0, r10)     // Catch:{ all -> 0x0136 }
            goto L_0x0106
        L_0x0123:
            r8.A00()     // Catch:{ all -> 0x0136 }
            r8.close()     // Catch:{ all -> 0x013d }
            r4.close()     // Catch:{ all -> 0x0144 }
            r7.A00()     // Catch:{ all -> 0x0144 }
            r7.close()     // Catch:{ all -> 0x0154 }
            r5.close()
            return
        L_0x0136:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r1 = move-exception
            goto L_0x0150
        L_0x0148:
            return
        L_0x0149:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x0150:
            X.AnonymousClass2A8.A00(r7, r0)     // Catch:{ all -> 0x0154 }
        L_0x0153:
            throw r1     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56212rc.A02(X.4uY):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C95804uY r22, long r23, long r25) {
        /*
            r21 = this;
            r1 = r23
            r16 = 100
            int r0 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x000a
            r1 = 100
        L_0x000a:
            r8 = r21
            X.2rZ r4 = r8.A08
            r6 = 0
            X.3dV r0 = r4.A05
            X.4GK r5 = r0.get()
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00ac }
            X.2sm r0 = r4.A01     // Catch:{ all -> 0x00ac }
            r4 = r22
            X.C56922sm.A02(r0, r4, r3, r6)     // Catch:{ all -> 0x00ac }
            X.C18270x1.A1R(r3, r1)     // Catch:{ all -> 0x00ac }
            r0 = r25
            X.AnonymousClass0x2.A1T(r3, r0)     // Catch:{ all -> 0x00ac }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ac }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "SELECT sort_id, timestamp  FROM message  WHERE chat_row_id = ? AND sort_id >= ?  AND sort_id <= ?  ORDER BY sort_id DESC"
            java.lang.String r0 = "GET_MESSAGE_SERVER_IDS"
            android.database.Cursor r3 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x00ac }
            r5.close()
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "sort_id"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "timestamp"
            int r7 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00a5 }
            X.2sH r0 = r8.A01     // Catch:{ all -> 0x00a5 }
            long r14 = r0.A0H()     // Catch:{ all -> 0x00a5 }
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r14 = r14 - r0
            long r18 = r3.getLong(r9)     // Catch:{ all -> 0x00a5 }
            long r12 = r3.getLong(r7)     // Catch:{ all -> 0x00a5 }
        L_0x005f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a1
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            long r10 = r3.getLong(r9)     // Catch:{ all -> 0x00a5 }
            long r5 = r3.getLong(r7)     // Catch:{ all -> 0x00a5 }
            r1 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x005f
            long r18 = r18 - r10
            r1 = 1
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r18 = 100
            goto L_0x0091
        L_0x008d:
            r18 = r10
            r12 = r5
            goto L_0x005f
        L_0x0091:
            X.2nm r0 = r8.A0B     // Catch:{ all -> 0x00a5 }
            r15 = 0
            java.lang.Long r17 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00a5 }
            r20 = 1
            r13 = r0
            r14 = r4
            r16 = r15
            r13.A00(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x00a5 }
        L_0x00a1:
            r3.close()
            return
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56212rc.A03(X.4uY, long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.AnonymousClass2A8.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011f, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C95804uY r25, java.lang.Long r26, int r27, long r28) {
        /*
            r24 = this;
            r9 = r24
            X.1VX r6 = r9.A06
            r0 = 4306(0x10d2, float:6.034E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r8, r0)
            if (r0 == 0) goto L_0x0123
            X.2ss r1 = r9.A02
            X.5UP r0 = r9.A07
            r7 = r25
            boolean r0 = X.C106855aH.A04(r1, r7, r0)
            if (r0 == 0) goto L_0x0123
            r0 = r27
            long r2 = (long) r0
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            r2 = 300(0x12c, double:1.48E-321)
        L_0x0025:
            r4 = 1
            if (r26 != 0) goto L_0x005a
            X.2rr r0 = r9.A05
            long r0 = r0.A06(r7)
            r11 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0123
            r11 = 100
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x0123
            java.lang.Long r10 = X.AnonymousClass0x9.A0n(r0, r4)
            r11 = 0
        L_0x0043:
            r1 = 4306(0x10d2, float:6.034E-42)
            boolean r0 = r6.A0Y(r8, r1)
            if (r0 == 0) goto L_0x0123
            r0 = 4326(0x10e6, float:6.062E-42)
            long r16 = X.C56952sp.A04(r6, r0)
            X.2rZ r5 = r9.A08
            X.3dV r0 = r5.A05
            X.4GK r4 = r0.get()
            goto L_0x0078
        L_0x005a:
            long r0 = r26.longValue()
            int r10 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r10 >= 0) goto L_0x0064
            r0 = r28
        L_0x0064:
            r11 = 9007199254740990(0x1ffffffffffffe, double:4.450147717014402E-308)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0072
            r0 = 9007199254740990(0x1ffffffffffffe, double:4.450147717014402E-308)
        L_0x0072:
            r10 = 0
            java.lang.Long r11 = X.C18310x6.A0f(r0, r4)
            goto L_0x0043
        L_0x0078:
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r2
            r18 = r5
            java.lang.String[] r12 = r18.A06(r19, r20, r21, r22)     // Catch:{ all -> 0x011c }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x011c }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x011c }
            java.lang.String r5 = "SELECT MIN(extra_table_last_update_ts) AS temp_min_last_update_ts FROM newsletter_message  WHERE chat_row_id = ? AND server_message_id < ? AND server_message_id > ? ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r0 = "GET_LAST_UPDATE_TS"
            android.database.Cursor r12 = X.C56862sg.A02(r6, r5, r0, r12)     // Catch:{ all -> 0x011c }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "temp_min_last_update_ts"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x0115 }
            long r5 = r12.getLong(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x00a7
        L_0x00a5:
            r5 = -1
        L_0x00a7:
            r12.close()     // Catch:{ all -> 0x011c }
            r4.close()
            r14 = 0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            r5 = 0
        L_0x00b5:
            X.2sH r0 = r9.A01
            long r12 = X.C56612sH.A03(r0, r5)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0123
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0123
            X.2nm r9 = r9.A0B
            monitor-enter(r9)
            X.1VX r0 = r9.A02     // Catch:{ all -> 0x0112 }
            boolean r0 = r0.A0Y(r8, r1)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0110
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0112 }
            X.C18280x3.A0u(r7, r0)     // Catch:{ all -> 0x0112 }
            r0.append(r2)     // Catch:{ all -> 0x0112 }
            r0.append(r10)     // Catch:{ all -> 0x0112 }
            java.lang.String r12 = X.AnonymousClass000.A0R(r11, r0)     // Catch:{ all -> 0x0112 }
            java.util.Set r8 = r9.A07     // Catch:{ all -> 0x0112 }
            boolean r0 = r8.contains(r12)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0110
            X.2ss r1 = r9.A01     // Catch:{ all -> 0x0112 }
            X.5UP r0 = r9.A03     // Catch:{ all -> 0x0112 }
            boolean r0 = X.C106855aH.A04(r1, r7, r0)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0110
            X.2gy r4 = r9.A00     // Catch:{ all -> 0x0112 }
            X.447 r1 = new X.447     // Catch:{ all -> 0x0112 }
            r1.<init>(r9, r12)     // Catch:{ all -> 0x0112 }
            X.1gu r0 = new X.1gu     // Catch:{ all -> 0x0112 }
            r18 = r1
            r19 = r2
            r21 = r5
            r15 = r10
            r16 = r11
            r17 = r12
            r13 = r0
            r14 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0112 }
            r4.A02(r0)     // Catch:{ all -> 0x0112 }
            r8.add(r12)     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r9)
            return
        L_0x0112:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0115:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r12, r1)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011e }
        L_0x011e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56212rc.A05(X.4uY, java.lang.Long, int, long):void");
    }

    public C56212rc(C49712gy r2, C56612sH r3, C56982ss r4, C72303dV r5, C56652sL r6, C56362rr r7, AnonymousClass1VX r8, AnonymousClass5UP r9, C56182rZ r10, C48702fK r11, C55632qf r12, C53852nm r13, C45402Zx r14, AnonymousClass4FS r15) {
        C18260x0.A0f(r3, r8, r15, r4, r7);
        C18260x0.A0g(r2, r6, r9, r5, r10);
        C18270x1.A15(r12, r13, r11, 12);
        this.A01 = r3;
        this.A06 = r8;
        this.A0D = r15;
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A04 = r6;
        this.A07 = r9;
        this.A03 = r5;
        this.A08 = r10;
        this.A0C = r14;
        this.A0A = r12;
        this.A0B = r13;
        this.A09 = r11;
    }
}
