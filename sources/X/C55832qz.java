package X;

import android.database.Cursor;

/* renamed from: X.2qz  reason: invalid class name and case insensitive filesystem */
public class C55832qz {
    public final C43262Rl A00;
    public final AnonymousClass2TB A01;
    public final C55122pp A02;
    public final AnonymousClass2TV A03;

    public C624134x A03(Cursor cursor) {
        C162457s7.A0J(cursor, 0);
        C55122pp r1 = this.A02;
        C95814uZ A0C = r1.A03.A0C(cursor);
        if (A0C == null) {
            return null;
        }
        return r1.A02(cursor, A0C, false);
    }

    public C624134x A04(Cursor cursor, C95814uZ r4) {
        C18270x1.A14(cursor, r4);
        return this.A02.A02(cursor, r4, false);
    }

    public static C624134x A00(C66543Lv r0, AnonymousClass2z0 r1) {
        return r0.A2D.A05(r1);
    }

    public static C624134x A01(C95814uZ r1, C55832qz r2, String str, boolean z) {
        return r2.A05(new AnonymousClass2z0(r1, str, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A02(long r12) {
        /*
            r11 = this;
            X.2pp r7 = r11.A02
            java.lang.String r6 = "CachedMessageStore/getMessageBySortId/sortId"
            long r2 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r7.A08     // Catch:{ all -> 0x0053 }
            X.4GK r8 = r0.get()     // Catch:{ all -> 0x0053 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004c }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x004c }
            java.lang.String r4 = X.C58162uo.A0F     // Catch:{ all -> 0x004c }
            java.lang.String[] r1 = X.C18260x0.A1b(r12)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL"
            android.database.Cursor r10 = r5.A0E(r4, r0, r1)     // Catch:{ all -> 0x004c }
            boolean r0 = r10.moveToLast()     // Catch:{ all -> 0x0045 }
            r9 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "chat_row_id"
            long r4 = X.AnonymousClass0x2.A0C(r10, r0)     // Catch:{ all -> 0x0045 }
            X.2sm r0 = r7.A03     // Catch:{ all -> 0x0045 }
            X.4uZ r1 = r0.A0B(r4)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            r0 = 0
            X.34x r9 = r7.A02(r10, r1, r0)     // Catch:{ all -> 0x0045 }
        L_0x0039:
            r10.close()     // Catch:{ all -> 0x004c }
            r8.close()     // Catch:{ all -> 0x0053 }
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r6, r2)
            return r9
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r6, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55832qz.A02(long):X.34x");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A05(X.AnonymousClass2z0 r13) {
        /*
            r12 = this;
            X.2pp r7 = r12.A02
            r11 = 0
            if (r13 == 0) goto L_0x0069
            X.4uZ r6 = r13.A00
            if (r6 == 0) goto L_0x0069
            X.3dV r0 = r7.A08
            X.4GK r5 = r0.get()
            X.34x r11 = r7.A04(r13)     // Catch:{ all -> 0x0062 }
            if (r11 != 0) goto L_0x005e
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0062 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0062 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0062 }
            java.lang.String r9 = X.C58122uk.A02     // Catch:{ all -> 0x0062 }
            java.lang.String[] r8 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0062 }
            X.2sm r0 = r7.A03     // Catch:{ all -> 0x0062 }
            boolean r4 = X.C56922sm.A03(r0, r6, r8)     // Catch:{ all -> 0x0062 }
            boolean r1 = r13.A02     // Catch:{ all -> 0x0062 }
            r0 = 1
            if (r1 == 0) goto L_0x0030
            r4 = 1
        L_0x0030:
            X.C18280x3.A1Q(r8, r4, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x0062 }
            X.C162457s7.A0C(r1)     // Catch:{ all -> 0x0062 }
            r0 = 2
            r8[r0] = r1     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "GET_MESSAGE_BY_KEY_SQL"
            android.database.Cursor r4 = r10.A0E(r9, r0, r8)     // Catch:{ all -> 0x0062 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x004c
            r0 = 0
            X.34x r11 = r7.A02(r4, r6, r0)     // Catch:{ all -> 0x0057 }
        L_0x004c:
            r4.close()     // Catch:{ all -> 0x0062 }
            X.2ga r1 = r7.A05     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "CachedMessageStore/getMessage/key"
            X.C49472ga.A00(r1, r0, r2)     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x005e:
            r5.close()
            return r11
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        L_0x0069:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55832qz.A05(X.2z0):X.34x");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0289 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0363 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036c A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037e A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x038e A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x039a A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03a6 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03c6 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03e8 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0408 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0428 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x044a A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0466 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0474 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0480 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x048c A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04a2 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04c5 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04d0 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0543 A[Catch:{ all -> 0x069c, all -> 0x06a1, all -> 0x06a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C624134x r30) {
        /*
            r29 = this;
            r0 = r29
            X.2TB r4 = r0.A01
            long r13 = android.os.SystemClock.uptimeMillis()
            r5 = r30
            boolean r0 = r5 instanceof X.AnonymousClass48R
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDatabaseInsertMethods/skip storing transient message: "
            X.2z0 r0 = X.C624134x.A08(r5, r0, r1)
            X.C18260x0.A0o(r0, r1)
            return
        L_0x001c:
            X.1VX r2 = r4.A04
            r1 = 5273(0x1499, float:7.389E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c4
            X.2oB r7 = r4.A05
            byte r2 = r5.A1I
            X.66R r1 = r7.A0D
            boolean r0 = X.C53662nS.A01(r1, r2)
            if (r0 == 0) goto L_0x00c4
            X.48B r0 = X.C53662nS.A00(r1, r2)
            boolean r0 = r0 instanceof X.AnonymousClass4BS
            if (r0 == 0) goto L_0x00c4
            X.3dV r0 = r4.A03
            X.4Fq r3 = r0.A04()
            X.3Yo r6 = r3.Axl()     // Catch:{ all -> 0x00bd }
            X.3zb r9 = new X.3zb     // Catch:{ all -> 0x00b6 }
            r9.<init>(r5, r4)     // Catch:{ all -> 0x00b6 }
            boolean r0 = X.C53662nS.A01(r1, r2)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a1
            X.48B r0 = X.C53662nS.A00(r1, r2)     // Catch:{ all -> 0x00b6 }
            boolean r0 = r0 instanceof X.AnonymousClass4BS     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a1
            X.48B r8 = X.C53662nS.A00(r1, r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.insertion.FMessageDatabaseInserter"
            X.C162457s7.A0K(r8, r0)     // Catch:{ all -> 0x00b6 }
            X.4BS r8 = (X.AnonymousClass4BS) r8     // Catch:{ all -> 0x00b6 }
            java.lang.Class r1 = r8.getClass()     // Catch:{ all -> 0x00b6 }
            X.8PJ r0 = new X.8PJ     // Catch:{ all -> 0x00b6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b6 }
            r2 = 0
            X.8qC r0 = r7.A09     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r1 = X.C18270x1.A0Y(r0)     // Catch:{ all -> 0x00b6 }
        L_0x0075:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b6 }
            X.4BQ r0 = (X.AnonymousClass4BQ) r0     // Catch:{ all -> 0x00b6 }
            r0.BhW(r5, r2)     // Catch:{ all -> 0x00b6 }
            goto L_0x0075
        L_0x0085:
            r9.invoke()     // Catch:{ all -> 0x00b6 }
            r8.BGd(r5)     // Catch:{ all -> 0x00b6 }
            X.8qC r0 = r7.A08     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r1 = X.C18270x1.A0Y(r0)     // Catch:{ all -> 0x00b6 }
        L_0x0091:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b6 }
            X.4BQ r0 = (X.AnonymousClass4BQ) r0     // Catch:{ all -> 0x00b6 }
            r0.BhW(r5, r2)     // Catch:{ all -> 0x00b6 }
            goto L_0x0091
        L_0x00a1:
            java.lang.String r2 = "update"
            java.lang.String r1 = "fmessage-database-inserting-not-supported"
            java.lang.String r0 = "message cannot be inserted into the database"
            r7.A01(r5, r0, r2, r1)     // Catch:{ all -> 0x00b6 }
        L_0x00ab:
            r6.A00()     // Catch:{ all -> 0x00b6 }
            r6.close()     // Catch:{ all -> 0x00bd }
            r3.close()
            goto L_0x0690
        L_0x00b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x00c4:
            X.8qC r0 = r4.A06
            X.3Lv r3 = X.AnonymousClass0x9.A0M(r0)
            X.2z0 r2 = r5.A1J
            long r15 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r3.A18
            X.4Fq r19 = r0.A04()
            X.3Yo r20 = r19.Axl()     // Catch:{ all -> 0x06a6 }
            X.34w r0 = r5.A0P     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x00ed
            X.9U4 r0 = r3.A28     // Catch:{ all -> 0x069c }
            X.36F r0 = r0.A0A()     // Catch:{ all -> 0x069c }
            r0.A0a(r5)     // Catch:{ all -> 0x069c }
        L_0x00ed:
            X.2ss r0 = r3.A0X     // Catch:{ all -> 0x069c }
            X.3Ex r7 = r3.A0F     // Catch:{ all -> 0x069c }
            boolean r0 = X.AnonymousClass352.A04(r7, r0, r5)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x00fc
            r0 = 512(0x200, float:7.175E-43)
            r5.A1B(r0)     // Catch:{ all -> 0x069c }
        L_0x00fc:
            X.2sC r0 = r3.A0v     // Catch:{ all -> 0x069c }
            r0.A06(r5)     // Catch:{ all -> 0x069c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x069c }
            java.lang.String r0 = "CoreMessageStore/insertMessage/row_id "
            X.C624134x.A0P(r5, r0, r1)     // Catch:{ all -> 0x069c }
            java.lang.String r0 = " key="
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x069c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x069c }
            java.lang.String r0 = "CoreMessageStore/insertExtraTablesMessage key="
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x069c }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x069c }
            X.34w r0 = r5.A0P     // Catch:{ all -> 0x069c }
            r6 = 1
            if (r0 == 0) goto L_0x0180
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0180
            X.9U4 r0 = r3.A28     // Catch:{ all -> 0x069c }
            X.36F r0 = r0.A0A()     // Catch:{ all -> 0x069c }
            r0.A0J(r5, r6)     // Catch:{ all -> 0x069c }
            X.34w r1 = r5.A0P     // Catch:{ all -> 0x069c }
            r0 = 0
            r1.A0F(r0)     // Catch:{ all -> 0x069c }
            X.2nO r0 = r3.A1F     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
            X.34w r10 = r5.A0P     // Catch:{ all -> 0x069c }
            X.1S4 r0 = r10.A0A     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0180
            X.39U r0 = r0.A02     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0180
            int r1 = r10.A03     // Catch:{ all -> 0x069c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0180
            X.C626936e.A00()     // Catch:{ all -> 0x069c }
            X.1S4 r0 = r10.A0A     // Catch:{ all -> 0x069c }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x069c }
            X.9Va r1 = r3.A1B     // Catch:{ all -> 0x069c }
            X.39U r0 = r0.A02     // Catch:{ all -> 0x069c }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x069c }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x069c }
            X.1n7 r9 = r1.A00(r0)     // Catch:{ all -> 0x069c }
            if (r9 == 0) goto L_0x0180
            X.39W r0 = r9.A00     // Catch:{ all -> 0x069c }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x069c }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x069c }
            X.39S r8 = r0.A01     // Catch:{ all -> 0x069c }
            if (r8 == 0) goto L_0x0195
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x069c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x0189
            java.lang.String r1 = r8.A04     // Catch:{ all -> 0x069c }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x069c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0189
        L_0x0180:
            int r0 = r5.A0A     // Catch:{ all -> 0x069c }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r6)     // Catch:{ all -> 0x069c }
            goto L_0x019b
        L_0x0189:
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x069c }
            r8.A04 = r0     // Catch:{ all -> 0x069c }
            X.35R r8 = r3.A0r     // Catch:{ all -> 0x069c }
            long r0 = r9.A1L     // Catch:{ all -> 0x069c }
            r8.A0F(r9, r0)     // Catch:{ all -> 0x069c }
            goto L_0x0180
        L_0x0195:
            java.lang.String r0 = "CoreMessageStore/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x069c }
            goto L_0x0180
        L_0x019b:
            if (r0 == 0) goto L_0x01bc
            X.2e9 r9 = r3.A0j     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            int r8 = r5.A06     // Catch:{ all -> 0x069c }
            r9.A00(r0, r8)     // Catch:{ all -> 0x069c }
            X.2mS r0 = r5.A0z()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01b1
            X.2f3 r0 = r3.A0k     // Catch:{ all -> 0x069c }
            r0.A01(r5)     // Catch:{ all -> 0x069c }
        L_0x01b1:
            X.2kg r0 = r5.A0s()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01bc
            X.2gZ r0 = r3.A0Q     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
        L_0x01bc:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r5.A0A     // Catch:{ all -> 0x069c }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01cc
            X.2e8 r0 = r3.A0i     // Catch:{ all -> 0x069c }
            r0.A01(r5)     // Catch:{ all -> 0x069c }
        L_0x01cc:
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = r5.A0A     // Catch:{ all -> 0x069c }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01e6
            X.2qb r9 = r5.A0l     // Catch:{ all -> 0x069c }
            if (r9 == 0) goto L_0x01e6
            java.lang.String r0 = r9.A07     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x01e6
            X.2fo r8 = r3.A1A     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            r8.A01(r9, r0)     // Catch:{ all -> 0x069c }
        L_0x01e6:
            int r0 = r5.A05     // Catch:{ all -> 0x069c }
            if (r0 <= 0) goto L_0x01ef
            X.313 r0 = r3.A0g     // Catch:{ all -> 0x069c }
            r0.A09(r5)     // Catch:{ all -> 0x069c }
        L_0x01ef:
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r5.A0A     // Catch:{ all -> 0x069c }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0342
            X.2q6 r0 = r3.A1J     // Catch:{ all -> 0x069c }
            r0.A02(r7, r5)     // Catch:{ all -> 0x069c }
        L_0x01ff:
            boolean r0 = X.C624134x.A0d(r5)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0210
            X.2Ou r0 = r5.A11()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0210
            X.2jy r0 = r3.A13     // Catch:{ all -> 0x069c }
            r0.A02(r5)     // Catch:{ all -> 0x069c }
        L_0x0210:
            X.30w r7 = r5.A0y()     // Catch:{ all -> 0x069c }
            if (r7 == 0) goto L_0x022e
            boolean r0 = r7.A07()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x022e
            byte[] r0 = r7.A09()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x022e
            X.30a r1 = r3.A1f     // Catch:{ all -> 0x069c }
            byte[] r0 = r7.A09()     // Catch:{ all -> 0x069c }
            r1.A03(r5, r0)     // Catch:{ all -> 0x069c }
            r7.A01()     // Catch:{ all -> 0x069c }
        L_0x022e:
            boolean r0 = r5 instanceof X.C30471mV     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0245
            X.30m r0 = r3.A0w     // Catch:{ all -> 0x069c }
            r0.A06(r5)     // Catch:{ all -> 0x069c }
            X.2h7 r8 = r3.A1T     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x069c }
            X.30d r7 = r0.A1v()     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            r8.A01(r7, r0)     // Catch:{ all -> 0x069c }
        L_0x0245:
            boolean r0 = r5 instanceof X.C30721mu     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0257
            r0 = r5
            X.1nC r0 = (X.C30811nC) r0     // Catch:{ all -> 0x069c }
            X.2xx r8 = r0.A00     // Catch:{ all -> 0x069c }
            if (r8 == 0) goto L_0x0257
            X.2eL r7 = r3.A1v     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            r7.A00(r8, r0)     // Catch:{ all -> 0x069c }
        L_0x0257:
            boolean r0 = r5 instanceof X.C30771mz     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x02b3
            X.2ox r1 = r3.A1K     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mz r0 = (X.C30771mz) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x0263:
            boolean r0 = r5 instanceof X.C30421mQ     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0299
            X.30v r7 = r3.A1g     // Catch:{ all -> 0x069c }
            r1 = r5
            X.1mQ r1 = (X.C30421mQ) r1     // Catch:{ all -> 0x069c }
            java.lang.String r0 = r1.A13()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x027b
            java.lang.String r6 = r1.A13()     // Catch:{ all -> 0x069c }
            long r0 = r1.A1L     // Catch:{ all -> 0x069c }
            r7.A07(r6, r0)     // Catch:{ all -> 0x069c }
        L_0x027b:
            X.2gy r1 = r3.A0C     // Catch:{ all -> 0x069c }
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = new com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob     // Catch:{ all -> 0x069c }
            r0.<init>(r5)     // Catch:{ all -> 0x069c }
            r1.A02(r0)     // Catch:{ all -> 0x069c }
        L_0x0285:
            boolean r0 = r5 instanceof X.AnonymousClass4FG     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0293
            X.2xV r0 = r3.A26     // Catch:{ all -> 0x069c }
            r0.A01(r5)     // Catch:{ all -> 0x069c }
            X.302 r0 = r3.A1d     // Catch:{ all -> 0x069c }
            r0.A03(r5)     // Catch:{ all -> 0x069c }
        L_0x0293:
            boolean r0 = X.C624134x.A0c(r5)     // Catch:{ all -> 0x069c }
            goto L_0x0361
        L_0x0299:
            boolean r0 = r5 instanceof X.C30411mP     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x02a6
            X.30v r1 = r3.A1g     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mP r0 = (X.C30411mP) r0     // Catch:{ all -> 0x069c }
            r1.A02(r0)     // Catch:{ all -> 0x069c }
            goto L_0x027b
        L_0x02a6:
            boolean r0 = r5 instanceof X.AnonymousClass1nF     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0285
            X.30v r1 = r3.A1g     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1nF r0 = (X.AnonymousClass1nF) r0     // Catch:{ all -> 0x069c }
            r1.A05(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0285
        L_0x02b3:
            boolean r0 = r5 instanceof X.C30761my     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x02c0
            X.2oi r1 = r3.A0S     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1my r0 = (X.C30761my) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x02c0:
            boolean r0 = r5 instanceof X.C30361mK     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x02cd
            X.2mA r1 = r3.A0u     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mK r0 = (X.C30361mK) r0     // Catch:{ all -> 0x069c }
            r1.A02(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x02cd:
            boolean r0 = r5 instanceof X.C30391mN     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0311
            r8 = r5
            X.1mN r8 = (X.C30391mN) r8     // Catch:{ all -> 0x069c }
            boolean r0 = r8.A07     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x030a
            boolean r0 = r2.A02     // Catch:{ all -> 0x069c }
            X.2qs r7 = r3.A0o     // Catch:{ all -> 0x069c }
            X.1fJ r1 = r8.A02     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x02e7
            com.whatsapp.jid.UserJid r0 = r8.A03     // Catch:{ all -> 0x069c }
            long r0 = r7.A00(r1, r0)     // Catch:{ all -> 0x069c }
            goto L_0x02f3
        L_0x02e7:
            X.2z0 r0 = r8.A1J     // Catch:{ all -> 0x069c }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x069c }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x069c }
            long r0 = r7.A01(r1, r0)     // Catch:{ all -> 0x069c }
        L_0x02f3:
            r9 = -1
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x030a
            X.2qz r7 = r3.A2D     // Catch:{ all -> 0x069c }
            X.34x r1 = X.C55122pp.A00(r7, r0)     // Catch:{ all -> 0x069c }
            X.1mN r1 = (X.C30391mN) r1     // Catch:{ all -> 0x069c }
            if (r1 == 0) goto L_0x030a
            r1.A07 = r6     // Catch:{ all -> 0x069c }
            r0 = 21
            r3.A0b(r1, r0)     // Catch:{ all -> 0x069c }
        L_0x030a:
            X.2qs r0 = r3.A0o     // Catch:{ all -> 0x069c }
            r0.A04(r8)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x0311:
            boolean r0 = r5 instanceof X.C30481mW     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0326
            X.2qC r6 = r3.A1e     // Catch:{ all -> 0x069c }
            r1 = r5
            X.1mW r1 = (X.C30481mW) r1     // Catch:{ all -> 0x069c }
            boolean r0 = r6.A04(r1)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0263
            r0 = 0
            r6.A03(r1, r0)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x0326:
            boolean r0 = r5 instanceof X.C30821nD     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0334
            X.2k0 r1 = r3.A1C     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1nD r0 = (X.C30821nD) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x0334:
            boolean r0 = r5 instanceof X.C30351mJ     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0263
            X.2yi r1 = r3.A0n     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mJ r0 = (X.C30351mJ) r0     // Catch:{ all -> 0x069c }
            r1.A03(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0263
        L_0x0342:
            X.4uZ r0 = r2.A00     // Catch:{ all -> 0x069c }
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01ff
            boolean r0 = r2.A02     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x0350
            boolean r0 = r5.A1W     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x01ff
        L_0x0350:
            byte r1 = r5.A1I     // Catch:{ all -> 0x069c }
            r0 = 7
            if (r1 == r0) goto L_0x01ff
            int r1 = r5.A0D     // Catch:{ all -> 0x069c }
            r0 = 6
            if (r1 == r0) goto L_0x01ff
            X.2q6 r0 = r3.A1J     // Catch:{ all -> 0x069c }
            r0.A04(r5)     // Catch:{ all -> 0x069c }
            goto L_0x01ff
        L_0x0361:
            if (r0 == 0) goto L_0x0368
            X.35R r0 = r3.A0r     // Catch:{ all -> 0x069c }
            X.C40802Hu.A02(r0, r5)     // Catch:{ all -> 0x069c }
        L_0x0368:
            boolean r0 = r5 instanceof X.C31921p4     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x037a
            X.302 r7 = r3.A1d     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1p4 r0 = (X.C31921p4) r0     // Catch:{ all -> 0x069c }
            java.lang.String r6 = r0.A02     // Catch:{ all -> 0x069c }
            int r1 = r0.A00     // Catch:{ all -> 0x069c }
            java.lang.Integer r0 = r0.A01     // Catch:{ all -> 0x069c }
            r7.A04(r5, r0, r6, r1)     // Catch:{ all -> 0x069c }
        L_0x037a:
            boolean r0 = r5 instanceof X.C30691mr     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x038a
            X.2f4 r6 = r3.A19     // Catch:{ all -> 0x069c }
            r1 = r5
            X.1mr r1 = (X.C30691mr) r1     // Catch:{ all -> 0x069c }
            boolean r0 = r1.A00     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x038a
            r6.A01(r1)     // Catch:{ all -> 0x069c }
        L_0x038a:
            boolean r8 = r5 instanceof X.C30341mI     // Catch:{ all -> 0x069c }
            if (r8 == 0) goto L_0x0396
            X.2o0 r1 = r3.A1c     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x0396:
            boolean r9 = r5 instanceof X.C30441mS     // Catch:{ all -> 0x069c }
            if (r9 == 0) goto L_0x03a2
            X.2gv r1 = r3.A2C     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mS r0 = (X.C30441mS) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x03a2:
            boolean r0 = r5 instanceof X.C30311mF     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x03c2
            r6 = r5
            X.1mF r6 = (X.C30311mF) r6     // Catch:{ all -> 0x069c }
            X.2rw r11 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r6.A1L     // Catch:{ all -> 0x069c }
            int r10 = r6.A00     // Catch:{ all -> 0x069c }
            r24 = 0
            int r7 = r6.A04     // Catch:{ all -> 0x069c }
            java.lang.Boolean r6 = r6.A0o     // Catch:{ all -> 0x069c }
            r21 = r11
            r22 = r6
            r23 = r10
            r25 = r7
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x03c2:
            boolean r0 = r5 instanceof X.C30521ma     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x03e4
            r6 = r5
            X.1ma r6 = (X.C30521ma) r6     // Catch:{ all -> 0x069c }
            X.2rw r12 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r6.A1L     // Catch:{ all -> 0x069c }
            int r11 = r6.A00     // Catch:{ all -> 0x069c }
            int r10 = r6.A00     // Catch:{ all -> 0x069c }
            int r7 = r6.A04     // Catch:{ all -> 0x069c }
            java.lang.Boolean r6 = r6.A0o     // Catch:{ all -> 0x069c }
            r21 = r12
            r22 = r6
            r23 = r11
            r24 = r10
            r25 = r7
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x03e4:
            boolean r0 = r5 instanceof X.C31591oX     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0404
            r6 = r5
            X.1oX r6 = (X.C31591oX) r6     // Catch:{ all -> 0x069c }
            X.2rw r11 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r6.A1L     // Catch:{ all -> 0x069c }
            int r10 = r6.A00     // Catch:{ all -> 0x069c }
            r24 = 0
            int r7 = r6.A04     // Catch:{ all -> 0x069c }
            java.lang.Boolean r6 = r6.A0o     // Catch:{ all -> 0x069c }
            r21 = r11
            r22 = r6
            r23 = r10
            r25 = r7
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x0404:
            boolean r0 = r5 instanceof X.C31171nr     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0424
            r6 = r5
            X.1nr r6 = (X.C31171nr) r6     // Catch:{ all -> 0x069c }
            X.2rw r11 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            int r10 = r6.A00     // Catch:{ all -> 0x069c }
            r24 = 0
            int r7 = r6.A04     // Catch:{ all -> 0x069c }
            java.lang.Boolean r6 = r6.A0o     // Catch:{ all -> 0x069c }
            r21 = r11
            r22 = r6
            r23 = r10
            r25 = r7
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x0424:
            boolean r0 = r5 instanceof X.C31161nq     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0446
            r6 = r5
            X.1nq r6 = (X.C31161nq) r6     // Catch:{ all -> 0x069c }
            X.2rw r12 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            int r11 = r6.A00     // Catch:{ all -> 0x069c }
            int r10 = r5.A00     // Catch:{ all -> 0x069c }
            int r7 = r5.A04     // Catch:{ all -> 0x069c }
            java.lang.Boolean r6 = r5.A0o     // Catch:{ all -> 0x069c }
            r21 = r12
            r22 = r6
            r23 = r11
            r24 = r10
            r25 = r7
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x0446:
            boolean r0 = r5 instanceof X.C31521oQ     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0462
            r6 = r5
            X.1oQ r6 = (X.C31521oQ) r6     // Catch:{ all -> 0x069c }
            X.2rw r7 = r3.A0h     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            int r6 = r6.A00     // Catch:{ all -> 0x069c }
            r24 = 0
            r22 = 0
            r21 = r7
            r23 = r6
            r25 = r24
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x069c }
        L_0x0462:
            boolean r0 = r5 instanceof X.AnonymousClass4DV     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0470
            X.35R r7 = r3.A0r     // Catch:{ all -> 0x069c }
            r6 = r5
            X.4DV r6 = (X.AnonymousClass4DV) r6     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            r7.A0F(r6, r0)     // Catch:{ all -> 0x069c }
        L_0x0470:
            boolean r0 = r5 instanceof X.C31901p2     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x047c
            X.35R r1 = r3.A0r     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1p2 r0 = (X.C31901p2) r0     // Catch:{ all -> 0x069c }
            r1.A0C(r0)     // Catch:{ all -> 0x069c }
        L_0x047c:
            boolean r0 = r5 instanceof X.C31911p3     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0488
            X.35R r1 = r3.A0r     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1p3 r0 = (X.C31911p3) r0     // Catch:{ all -> 0x069c }
            r1.A09(r0)     // Catch:{ all -> 0x069c }
        L_0x0488:
            boolean r0 = r5 instanceof X.AnonymousClass4DU     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x049e
            X.2q7 r7 = r3.A1h     // Catch:{ all -> 0x069c }
            r6 = r5
            X.4DU r6 = (X.AnonymousClass4DU) r6     // Catch:{ all -> 0x069c }
            X.34x r6 = (X.C624134x) r6     // Catch:{ all -> 0x069c }
            long r0 = r6.A1L     // Catch:{ all -> 0x069c }
            X.4DU r6 = (X.AnonymousClass4DU) r6     // Catch:{ all -> 0x069c }
            int r6 = r6.BEM()     // Catch:{ all -> 0x069c }
            r7.A00(r0, r6)     // Catch:{ all -> 0x069c }
        L_0x049e:
            boolean r0 = r5 instanceof X.C30431mR     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x04bd
            X.2eB r11 = r3.A1E     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mR r0 = (X.C30431mR) r0     // Catch:{ all -> 0x069c }
            java.lang.String r22 = "message_payment_invite"
            long r6 = r0.A1L     // Catch:{ all -> 0x069c }
            int r10 = r0.A00     // Catch:{ all -> 0x069c }
            long r0 = r0.A01     // Catch:{ all -> 0x069c }
            java.lang.String r23 = "INSERT_PAYMENT_INVITE"
            r21 = r11
            r24 = r10
            r25 = r6
            r27 = r0
            r21.A01(r22, r23, r24, r25, r27)     // Catch:{ all -> 0x069c }
        L_0x04bd:
            X.5rC r1 = r3.A01     // Catch:{ all -> 0x069c }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x04d0
            r1.A04()     // Catch:{ all -> 0x069c }
            java.lang.String r0 = "saveMessageAgentAttribution"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x069c }
        L_0x04cf:
            throw r1     // Catch:{ all -> 0x069c }
        L_0x04d0:
            boolean r0 = X.C624134x.A0f(r5)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x04e1
            java.lang.String r0 = r5.A14()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x04e1
            X.2W2 r0 = r3.A1I     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
        L_0x04e1:
            boolean r0 = r5 instanceof X.C30451mT     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x04ed
            X.2ow r1 = r3.A1H     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mT r0 = (X.C30451mT) r0     // Catch:{ all -> 0x069c }
            r1.A02(r0)     // Catch:{ all -> 0x069c }
        L_0x04ed:
            boolean r0 = r5.A1n()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0501
            byte[] r0 = r5.A1a     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0501
            X.2eA r7 = r3.A15     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            byte[] r6 = r5.A1a     // Catch:{ all -> 0x069c }
            r7.A00(r0, r6)     // Catch:{ all -> 0x069c }
            goto L_0x0515
        L_0x0501:
            boolean r0 = X.C57632tx.A00(r5)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0515
            X.4FV r6 = r3.A1t     // Catch:{ all -> 0x069c }
            X.36E r0 = r3.A0A     // Catch:{ all -> 0x069c }
            int r1 = X.AnonymousClass29K.A00(r0, r5)     // Catch:{ all -> 0x069c }
            java.lang.String r0 = "msgstore/insertExtraTablesMessage"
            X.C59882xe.A00(r6, r0, r1)     // Catch:{ all -> 0x069c }
        L_0x0515:
            if (r8 != 0) goto L_0x0566
            byte r1 = r5.A1I     // Catch:{ all -> 0x069c }
            r0 = 10
            if (r1 == r0) goto L_0x0566
            r0 = 90
            if (r1 == r0) goto L_0x0566
            boolean r0 = r2.A02     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x053f
            X.2sj r1 = r3.A0p     // Catch:{ all -> 0x069c }
            X.4uZ r0 = r2.A00     // Catch:{ all -> 0x069c }
            boolean r1 = r1.A0B(r0)     // Catch:{ all -> 0x069c }
            com.whatsapp.jid.DeviceJid r0 = r5.A1R     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x053f
            X.2sr r0 = r3.A09     // Catch:{ all -> 0x069c }
            if (r1 == 0) goto L_0x053a
            X.6kB r2 = r0.A0G()     // Catch:{ all -> 0x069c }
            goto L_0x0541
        L_0x053a:
            X.6kH r2 = X.C56972sr.A03(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0541
        L_0x053f:
            com.whatsapp.jid.DeviceJid r2 = r5.A1R     // Catch:{ all -> 0x069c }
        L_0x0541:
            if (r2 == 0) goto L_0x0566
            X.34p r0 = r3.A0s     // Catch:{ all -> 0x069c }
            long r6 = r0.A05(r2)     // Catch:{ all -> 0x069c }
            r10 = -1
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0566
            X.2lL r8 = r3.A11     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            r8.A02(r0, r6)     // Catch:{ all -> 0x069c }
            X.2yY r1 = new X.2yY     // Catch:{ all -> 0x069c }
            r1.<init>(r2)     // Catch:{ all -> 0x069c }
            java.lang.Object r0 = r5.A1K     // Catch:{ all -> 0x069c }
            monitor-enter(r0)     // Catch:{ all -> 0x069c }
            r5.A0j = r1     // Catch:{ all -> 0x0562 }
            monitor-exit(r0)     // Catch:{ all -> 0x0562 }
            goto L_0x0566
        L_0x0562:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0562 }
            goto L_0x04cf
        L_0x0566:
            boolean r0 = r5 instanceof X.AnonymousClass1nW     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0572
            X.2eC r1 = r3.A1R     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mX r0 = (X.C30491mX) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x0572:
            byte r1 = r5.A1I     // Catch:{ all -> 0x069c }
            r0 = 88
            if (r1 != r0) goto L_0x0583
            X.8qC r0 = r3.A2K     // Catch:{ all -> 0x069c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x069c }
            X.2du r0 = (X.C47842du) r0     // Catch:{ all -> 0x069c }
            r0.A01(r5)     // Catch:{ all -> 0x069c }
        L_0x0583:
            X.2kf r0 = r5.A0q()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x059a
            X.8qC r0 = r3.A2L     // Catch:{ all -> 0x069c }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x069c }
            X.2jU r6 = (X.C51232jU) r6     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            X.2kf r2 = r5.A0q()     // Catch:{ all -> 0x069c }
            r6.A01(r2, r0)     // Catch:{ all -> 0x069c }
        L_0x059a:
            X.2nF r0 = r5.A0r()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05ab
            X.2e6 r6 = r3.A0P     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            X.2nF r2 = r5.A0r()     // Catch:{ all -> 0x069c }
            r6.A00(r2, r0)     // Catch:{ all -> 0x069c }
        L_0x05ab:
            X.2jD r0 = r5.A0u()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05bc
            X.2e7 r6 = r3.A0c     // Catch:{ all -> 0x069c }
            long r0 = r5.A1L     // Catch:{ all -> 0x069c }
            X.2jD r2 = r5.A0u()     // Catch:{ all -> 0x069c }
            r6.A01(r2, r0)     // Catch:{ all -> 0x069c }
        L_0x05bc:
            boolean r0 = r5 instanceof X.C30401mO     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05c8
            X.2gS r1 = r3.A0D     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mO r0 = (X.C30401mO) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x05c8:
            int r1 = r5.A0E     // Catch:{ all -> 0x069c }
            r0 = 3
            if (r1 == r0) goto L_0x05d2
            X.2eD r0 = r3.A1Y     // Catch:{ all -> 0x069c }
            r0.A01(r5)     // Catch:{ all -> 0x069c }
        L_0x05d2:
            boolean r0 = r5 instanceof X.C30461mU     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05de
            X.2xj r1 = r3.A1q     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mU r0 = (X.C30461mU) r0     // Catch:{ all -> 0x069c }
            r1.A02(r0)     // Catch:{ all -> 0x069c }
        L_0x05de:
            boolean r0 = r5 instanceof X.C30381mM     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05ea
            X.2g2 r1 = r3.A25     // Catch:{ all -> 0x069c }
            r0 = r5
            X.1mM r0 = (X.C30381mM) r0     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x05ea:
            X.2lp r0 = r5.A0g     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x05f3
            X.2f6 r0 = r3.A1O     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
        L_0x05f3:
            X.2pu r0 = r5.A0t()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0606
            X.2pu r0 = r5.A0t()     // Catch:{ all -> 0x069c }
            boolean r0 = r0 instanceof X.C30221m6     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0606
            X.2nN r0 = r3.A0z     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
        L_0x0606:
            X.2ga r6 = r3.A0d     // Catch:{ all -> 0x069c }
            long r0 = X.C18310x6.A0A(r17)     // Catch:{ all -> 0x069c }
            java.lang.String r2 = "CoreMessageStore/insertExtraTablesMessage"
            r6.A02(r2, r0)     // Catch:{ all -> 0x069c }
            X.3Lg r0 = r3.A1M     // Catch:{ all -> 0x069c }
            r0.A02(r5)     // Catch:{ all -> 0x069c }
            X.2yA r0 = r3.A0t     // Catch:{ all -> 0x069c }
            r0.A02(r5)     // Catch:{ all -> 0x069c }
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r5.A0A     // Catch:{ all -> 0x069c }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0633
            boolean r0 = r5.A1F     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0633
            X.2qe r1 = r3.A1W     // Catch:{ all -> 0x069c }
            java.util.Set r0 = java.util.Collections.singleton(r5)     // Catch:{ all -> 0x069c }
            r1.A01(r0)     // Catch:{ all -> 0x069c }
        L_0x0633:
            boolean r0 = X.C624134x.A0g(r5)     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0644
            X.2zm r0 = r3.A10     // Catch:{ all -> 0x069c }
            r0.A03(r5)     // Catch:{ all -> 0x069c }
            X.2nN r1 = r3.A0z     // Catch:{ all -> 0x069c }
            r0 = 0
            r1.A02(r5, r0)     // Catch:{ all -> 0x069c }
        L_0x0644:
            java.util.List r1 = r5.A18     // Catch:{ all -> 0x069c }
            if (r1 == 0) goto L_0x0666
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x069c }
            if (r0 != 0) goto L_0x0666
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x069c }
        L_0x0652:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x069c }
            if (r0 == 0) goto L_0x0666
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x069c }
            X.3ZM r0 = (X.AnonymousClass3ZM) r0     // Catch:{ all -> 0x069c }
            X.34p r1 = r3.A0s     // Catch:{ all -> 0x069c }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x069c }
            r1.A05(r0)     // Catch:{ all -> 0x069c }
            goto L_0x0652
        L_0x0666:
            X.2mb r0 = r3.A0x     // Catch:{ all -> 0x069c }
            r0.A00(r5)     // Catch:{ all -> 0x069c }
            if (r9 != 0) goto L_0x0672
            X.3Lu r0 = r3.A0m     // Catch:{ all -> 0x069c }
            r0.A0K(r5)     // Catch:{ all -> 0x069c }
        L_0x0672:
            r20.A00()     // Catch:{ all -> 0x069c }
            r20.close()     // Catch:{ all -> 0x06a6 }
            r19.close()
            X.3dI r2 = r3.A2F
            r1 = 21
            X.3Zw r0 = new X.3Zw
            r0.<init>(r3, r1, r5)
            r2.execute(r0)
            long r1 = X.C18310x6.A0A(r15)
            java.lang.String r0 = "CoreMessageStore/insertMessage"
            r6.A02(r0, r1)
        L_0x0690:
            X.2ga r3 = r4.A01
            long r1 = X.C18310x6.A0A(r13)
            java.lang.String r0 = "CoreMessageStore/insertMessage"
            r3.A02(r0, r1)
            return
        L_0x069c:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x06a1 }
            goto L_0x06a5
        L_0x06a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06a6 }
        L_0x06a5:
            throw r1     // Catch:{ all -> 0x06a6 }
        L_0x06a6:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x06ab }
            throw r1
        L_0x06ab:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55832qz.A06(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0193, code lost:
        if (r13 != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        if ((r1 instanceof X.C135166kE) != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        if (r5 == 1) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f3, code lost:
        if (r13 == false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C624134x r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            X.2TV r4 = r0.A03
            long r16 = android.os.SystemClock.uptimeMillis()
            X.1VX r2 = r4.A05
            r1 = 6475(0x194b, float:9.073E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r6 = r30
            r5 = r31
            if (r0 == 0) goto L_0x00ba
            X.2oB r8 = r4.A06
            byte r2 = r6.A1I
            X.66R r1 = r8.A0D
            boolean r0 = X.C53662nS.A01(r1, r2)
            if (r0 == 0) goto L_0x00ba
            X.48B r0 = X.C53662nS.A00(r1, r2)
            boolean r0 = r0 instanceof X.AnonymousClass4BU
            if (r0 == 0) goto L_0x00ba
            X.3dV r0 = r4.A04
            X.4Fq r3 = r0.A04()
            X.3Yo r7 = r3.Axl()     // Catch:{ all -> 0x00b3 }
            X.3zy r10 = new X.3zy     // Catch:{ all -> 0x00ac }
            r10.<init>(r6, r4, r5)     // Catch:{ all -> 0x00ac }
            boolean r0 = X.C53662nS.A01(r1, r2)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0091
            X.48B r0 = X.C53662nS.A00(r1, r2)     // Catch:{ all -> 0x00ac }
            boolean r0 = r0 instanceof X.AnonymousClass4BU     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0091
            X.48B r9 = X.C53662nS.A00(r1, r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.update.FMessageDatabaseUpdater"
            X.C162457s7.A0K(r9, r0)     // Catch:{ all -> 0x00ac }
            X.4BU r9 = (X.AnonymousClass4BU) r9     // Catch:{ all -> 0x00ac }
            java.lang.Class r1 = r9.getClass()     // Catch:{ all -> 0x00ac }
            X.8PJ r0 = new X.8PJ     // Catch:{ all -> 0x00ac }
            r0.<init>(r1)     // Catch:{ all -> 0x00ac }
            r2 = 0
            X.8qC r0 = r8.A0C     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = X.C18270x1.A0Y(r0)     // Catch:{ all -> 0x00ac }
        L_0x0065:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00ac }
            X.4BW r0 = (X.AnonymousClass4BW) r0     // Catch:{ all -> 0x00ac }
            r0.BhY(r6, r2, r5)     // Catch:{ all -> 0x00ac }
            goto L_0x0065
        L_0x0075:
            r10.invoke()     // Catch:{ all -> 0x00ac }
            r9.BrV(r6)     // Catch:{ all -> 0x00ac }
            X.8qC r0 = r8.A0B     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = X.C18270x1.A0Y(r0)     // Catch:{ all -> 0x00ac }
        L_0x0081:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00ac }
            X.4BV r0 = (X.AnonymousClass4BV) r0     // Catch:{ all -> 0x00ac }
            r0.BhY(r6, r2, r5)     // Catch:{ all -> 0x00ac }
            goto L_0x0081
        L_0x0091:
            java.lang.String r2 = "insert"
            java.lang.String r1 = "fmessage-database-updating-not-supported"
            java.lang.String r0 = "message cannot be updated into the database"
            r8.A01(r6, r0, r2, r1)     // Catch:{ all -> 0x00ac }
        L_0x009a:
            r7.A00()     // Catch:{ all -> 0x00ac }
            r1 = 33
            X.3cK r0 = new X.3cK     // Catch:{ all -> 0x00ac }
            r0.<init>(r4, r1, r6)     // Catch:{ all -> 0x00ac }
            r3.B25(r0)     // Catch:{ all -> 0x00ac }
            r7.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x03c1
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x00ba:
            X.8qC r0 = r4.A07
            X.3Lv r2 = X.AnonymousClass0x9.A0M(r0)
            long r18 = android.os.SystemClock.uptimeMillis()
            r3 = 1
            r6.A1H(r3)
            X.2z0 r8 = r6.A1J
            r9 = 0
            X.3dV r0 = r2.A18     // Catch:{ IOException -> 0x03ae }
            X.4Fq r21 = r0.A04()     // Catch:{ IOException -> 0x03ae }
            X.3Yo r20 = r21.Axl()     // Catch:{ all -> 0x03a3 }
            boolean r0 = r8.A02     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r6.A1B     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x00e8
            X.4uZ r1 = r8.A00     // Catch:{ all -> 0x0399 }
            boolean r0 = r1 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r1 instanceof X.C135166kE     // Catch:{ all -> 0x0399 }
            r14 = 1
            if (r0 == 0) goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            r0 = 4
            if (r5 == r0) goto L_0x00ef
            r13 = 0
            if (r5 != r3) goto L_0x00f0
        L_0x00ef:
            r13 = 1
        L_0x00f0:
            if (r14 == 0) goto L_0x00f5
            r0 = 1
            if (r13 != 0) goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            r2.A0f(r6, r0)     // Catch:{ all -> 0x0399 }
            X.34w r0 = r6.A0P     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0116
            X.9U4 r0 = r2.A28     // Catch:{ all -> 0x0399 }
            X.36F r0 = r0.A0A()     // Catch:{ all -> 0x0399 }
            r0.A0J(r6, r3)     // Catch:{ all -> 0x0399 }
            X.34w r0 = r6.A0P     // Catch:{ all -> 0x0399 }
            r0.A0F(r9)     // Catch:{ all -> 0x0399 }
            X.2nO r0 = r2.A1F     // Catch:{ all -> 0x0399 }
            r0.A00(r6)     // Catch:{ all -> 0x0399 }
        L_0x0116:
            r10 = 5
            if (r5 != r10) goto L_0x0126
            long r0 = r6.A0H     // Catch:{ all -> 0x0399 }
            r11 = 0
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x0126
            X.3Lg r0 = r2.A1M     // Catch:{ all -> 0x0399 }
            r0.A02(r6)     // Catch:{ all -> 0x0399 }
        L_0x0126:
            r11 = 0
            r7 = 6
            if (r5 == r7) goto L_0x0130
            r0 = 11
            if (r5 == r0) goto L_0x0130
            if (r5 != r10) goto L_0x0135
        L_0x0130:
            X.3Lu r0 = r2.A0m     // Catch:{ all -> 0x0399 }
            r0.A0K(r6)     // Catch:{ all -> 0x0399 }
        L_0x0135:
            if (r5 == r10) goto L_0x0139
            if (r5 != r7) goto L_0x017c
        L_0x0139:
            X.313 r10 = r2.A0g     // Catch:{ all -> 0x0399 }
            long r0 = r6.A0K     // Catch:{ all -> 0x0399 }
            r10.A04(r6, r0)     // Catch:{ all -> 0x0399 }
            X.4uZ r1 = r8.A00     // Catch:{ all -> 0x0399 }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0172
            int r0 = r6.A05     // Catch:{ all -> 0x0399 }
            if (r0 <= 0) goto L_0x014d
            r10.A09(r6)     // Catch:{ all -> 0x0399 }
        L_0x014d:
            X.2rw r0 = r2.A0h     // Catch:{ all -> 0x0399 }
            java.lang.Integer r0 = r0.A03(r6)     // Catch:{ all -> 0x0399 }
            if (r0 != 0) goto L_0x0159
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0399 }
        L_0x0159:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0399 }
            int r0 = r6.A05     // Catch:{ all -> 0x0399 }
            if (r1 == r0) goto L_0x017c
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r6.A0A     // Catch:{ all -> 0x0399 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0399 }
            if (r0 != 0) goto L_0x017c
            r0 = 512(0x200, float:7.175E-43)
            r6.A1B(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x017c
        L_0x0172:
            boolean r0 = X.C627336j.A0K(r1)     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x014d
            r10.A0A(r6)     // Catch:{ all -> 0x0399 }
            goto L_0x014d
        L_0x017c:
            if (r5 != r7) goto L_0x018e
            boolean r0 = X.C624134x.A0g(r6)     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x018e
            X.2zm r0 = r2.A10     // Catch:{ all -> 0x0399 }
            r0.A03(r6)     // Catch:{ all -> 0x0399 }
            X.2nN r0 = r2.A0z     // Catch:{ all -> 0x0399 }
            r0.A02(r6, r9)     // Catch:{ all -> 0x0399 }
        L_0x018e:
            X.2sC r1 = r2.A0v     // Catch:{ all -> 0x0399 }
            if (r14 == 0) goto L_0x0195
            r0 = 1
            if (r13 == 0) goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            r1.A07(r6, r0)     // Catch:{ all -> 0x0399 }
            X.30w r8 = r6.A0y()     // Catch:{ all -> 0x0399 }
            if (r8 == 0) goto L_0x01b7
            boolean r0 = r8.A07()     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01b7
            byte[] r0 = r8.A09()     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01ba
            X.30a r1 = r2.A1f     // Catch:{ all -> 0x0399 }
            byte[] r0 = r8.A09()     // Catch:{ all -> 0x0399 }
            r1.A03(r6, r0)     // Catch:{ all -> 0x0399 }
        L_0x01b4:
            r8.A01()     // Catch:{ all -> 0x0399 }
        L_0x01b7:
            X.2qb r10 = r6.A0l     // Catch:{ all -> 0x0399 }
            goto L_0x01c0
        L_0x01ba:
            X.30a r0 = r2.A1f     // Catch:{ all -> 0x0399 }
            r0.A02(r6)     // Catch:{ all -> 0x0399 }
            goto L_0x01b4
        L_0x01c0:
            if (r10 == 0) goto L_0x01cd
            java.lang.String r0 = r10.A07     // Catch:{ all -> 0x0399 }
            if (r0 != 0) goto L_0x01cd
            X.2fo r8 = r2.A1A     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            r8.A01(r10, r0)     // Catch:{ all -> 0x0399 }
        L_0x01cd:
            boolean r8 = r6 instanceof X.C30471mV     // Catch:{ all -> 0x0399 }
            if (r8 == 0) goto L_0x01d6
            X.30m r0 = r2.A0w     // Catch:{ all -> 0x0399 }
            r0.A06(r6)     // Catch:{ all -> 0x0399 }
        L_0x01d6:
            boolean r0 = r6 instanceof X.C30691mr     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0220
            X.2f4 r9 = r2.A19     // Catch:{ all -> 0x0399 }
            r1 = r6
            X.1mr r1 = (X.C30691mr) r1     // Catch:{ all -> 0x0399 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0399 }
            if (r0 != 0) goto L_0x01e6
            r9.A01(r1)     // Catch:{ all -> 0x0399 }
        L_0x01e6:
            boolean r0 = r6 instanceof X.C31911p3     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01f2
            X.35R r1 = r2.A0r     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1p3 r0 = (X.C31911p3) r0     // Catch:{ all -> 0x0399 }
            r1.A09(r0)     // Catch:{ all -> 0x0399 }
        L_0x01f2:
            boolean r0 = r6 instanceof X.C31901p2     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01fe
            X.35R r1 = r2.A0r     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1p2 r0 = (X.C31901p2) r0     // Catch:{ all -> 0x0399 }
            r1.A0C(r0)     // Catch:{ all -> 0x0399 }
        L_0x01fe:
            boolean r0 = r6 instanceof X.AnonymousClass4FG     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x020c
            X.2xV r0 = r2.A26     // Catch:{ all -> 0x0399 }
            r0.A01(r6)     // Catch:{ all -> 0x0399 }
            X.302 r0 = r2.A1d     // Catch:{ all -> 0x0399 }
            r0.A03(r6)     // Catch:{ all -> 0x0399 }
        L_0x020c:
            boolean r0 = r6 instanceof X.AnonymousClass4DV     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x021a
            X.35R r10 = r2.A0r     // Catch:{ all -> 0x0399 }
            r9 = r6
            X.4DV r9 = (X.AnonymousClass4DV) r9     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            r10.A0F(r9, r0)     // Catch:{ all -> 0x0399 }
        L_0x021a:
            boolean r0 = X.C624134x.A0c(r6)     // Catch:{ all -> 0x0399 }
            goto L_0x031c
        L_0x0220:
            boolean r0 = r6 instanceof X.C30391mN     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x022d
            X.2qs r1 = r2.A0o     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mN r0 = (X.C30391mN) r0     // Catch:{ all -> 0x0399 }
            r1.A04(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x022d:
            boolean r0 = r6 instanceof X.C30361mK     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x023a
            X.2mA r1 = r2.A0u     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mK r0 = (X.C30361mK) r0     // Catch:{ all -> 0x0399 }
            r1.A02(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x023a:
            boolean r0 = r6 instanceof X.C30821nD     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0247
            X.2k0 r1 = r2.A1C     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1nD r0 = (X.C30821nD) r0     // Catch:{ all -> 0x0399 }
            r1.A01(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x0247:
            boolean r0 = r6 instanceof X.C30421mQ     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0260
            X.30v r10 = r2.A1g     // Catch:{ all -> 0x0399 }
            r1 = r6
            X.1mQ r1 = (X.C30421mQ) r1     // Catch:{ all -> 0x0399 }
            java.lang.String r0 = r1.A13()     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r9 = r1.A13()     // Catch:{ all -> 0x0399 }
            long r0 = r1.A1L     // Catch:{ all -> 0x0399 }
            r10.A07(r9, r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x0260:
            boolean r0 = r6 instanceof X.C30411mP     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x026e
            X.30v r1 = r2.A1g     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mP r0 = (X.C30411mP) r0     // Catch:{ all -> 0x0399 }
            r1.A02(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x026e:
            boolean r0 = r6 instanceof X.AnonymousClass1nF     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x027c
            X.30v r1 = r2.A1g     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1nF r0 = (X.AnonymousClass1nF) r0     // Catch:{ all -> 0x0399 }
            r1.A05(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x027c:
            boolean r0 = r6 instanceof X.C30481mW     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x028a
            X.2qC r1 = r2.A1e     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mW r0 = (X.C30481mW) r0     // Catch:{ all -> 0x0399 }
            r1.A02(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x028a:
            boolean r0 = r6 instanceof X.C30351mJ     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0298
            X.2yi r1 = r2.A0n     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mJ r0 = (X.C30351mJ) r0     // Catch:{ all -> 0x0399 }
            r1.A03(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x0298:
            boolean r0 = r6 instanceof X.C30441mS     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x02a6
            X.2gv r1 = r2.A2C     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mS r0 = (X.C30441mS) r0     // Catch:{ all -> 0x0399 }
            r1.A01(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x02a6:
            boolean r0 = r6 instanceof X.C30311mF     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x02cb
            r15 = r6
            X.1mF r15 = (X.C30311mF) r15     // Catch:{ all -> 0x0399 }
            X.2rw r14 = r2.A0h     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            int r13 = r15.A00     // Catch:{ all -> 0x0399 }
            int r12 = r15.A04     // Catch:{ all -> 0x0399 }
            java.lang.Boolean r10 = r15.A0o     // Catch:{ all -> 0x0399 }
            r22 = r14
            r23 = r10
            r24 = r13
            r25 = r9
            r26 = r12
            r27 = r0
            r22.A07(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0399 }
            r14.A04(r11, r15)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x02cb:
            boolean r0 = r6 instanceof X.C30521ma     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x02f2
            r14 = r6
            X.1ma r14 = (X.C30521ma) r14     // Catch:{ all -> 0x0399 }
            X.2rw r13 = r2.A0h     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            int r12 = r14.A00     // Catch:{ all -> 0x0399 }
            int r11 = r14.A00     // Catch:{ all -> 0x0399 }
            int r10 = r14.A04     // Catch:{ all -> 0x0399 }
            java.lang.Boolean r9 = r14.A0o     // Catch:{ all -> 0x0399 }
            r22 = r13
            r23 = r9
            r24 = r12
            r25 = r11
            r26 = r10
            r27 = r0
            r22.A07(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0399 }
            r13.A02(r14)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x02f2:
            boolean r0 = r6 instanceof X.C30451mT     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0300
            X.2ow r1 = r2.A1H     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mT r0 = (X.C30451mT) r0     // Catch:{ all -> 0x0399 }
            r1.A02(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x0300:
            boolean r0 = r6 instanceof X.C30401mO     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x030e
            X.2gS r1 = r2.A0D     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mO r0 = (X.C30401mO) r0     // Catch:{ all -> 0x0399 }
            r1.A01(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x030e:
            boolean r0 = r6 instanceof X.C30381mM     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x01e6
            X.2g2 r1 = r2.A25     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mM r0 = (X.C30381mM) r0     // Catch:{ all -> 0x0399 }
            r1.A01(r0)     // Catch:{ all -> 0x0399 }
            goto L_0x01e6
        L_0x031c:
            if (r0 == 0) goto L_0x0323
            X.35R r0 = r2.A0r     // Catch:{ all -> 0x0399 }
            X.C40802Hu.A02(r0, r6)     // Catch:{ all -> 0x0399 }
        L_0x0323:
            if (r8 == 0) goto L_0x0333
            X.2h7 r9 = r2.A1T     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x0399 }
            X.30d r8 = r0.A1v()     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            r9.A01(r8, r0)     // Catch:{ all -> 0x0399 }
        L_0x0333:
            boolean r0 = r6 instanceof X.C30721mu     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0345
            r0 = r6
            X.1mu r0 = (X.C30721mu) r0     // Catch:{ all -> 0x0399 }
            X.2xx r9 = r0.A00     // Catch:{ all -> 0x0399 }
            if (r9 == 0) goto L_0x0345
            X.2eL r8 = r2.A1v     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            r8.A00(r9, r0)     // Catch:{ all -> 0x0399 }
        L_0x0345:
            if (r5 != r7) goto L_0x034c
            X.2yi r0 = r2.A0n     // Catch:{ all -> 0x0399 }
            r0.A01(r6)     // Catch:{ all -> 0x0399 }
        L_0x034c:
            boolean r0 = r6 instanceof X.C30341mI     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0358
            X.2o0 r1 = r2.A1c     // Catch:{ all -> 0x0399 }
            r0 = r6
            X.1mI r0 = (X.C30341mI) r0     // Catch:{ all -> 0x0399 }
            r1.A01(r0)     // Catch:{ all -> 0x0399 }
        L_0x0358:
            X.2mb r0 = r2.A0x     // Catch:{ all -> 0x0399 }
            r0.A00(r6)     // Catch:{ all -> 0x0399 }
            boolean r0 = r6.A1n()     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x037b
            byte[] r0 = r6.A1a     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x037b
            X.2eA r7 = r2.A15     // Catch:{ all -> 0x0399 }
            long r0 = r6.A1L     // Catch:{ all -> 0x0399 }
            byte[] r5 = r6.A1a     // Catch:{ all -> 0x0399 }
            r7.A00(r0, r5)     // Catch:{ all -> 0x0399 }
        L_0x0370:
            r20.A00()     // Catch:{ all -> 0x0399 }
            r1 = 24
            r0 = r21
            X.C70093Zw.A01(r0, r2, r6, r1)     // Catch:{ all -> 0x0399 }
            goto L_0x0390
        L_0x037b:
            boolean r0 = X.C57632tx.A00(r6)     // Catch:{ all -> 0x0399 }
            if (r0 == 0) goto L_0x0370
            X.4FV r5 = r2.A1t     // Catch:{ all -> 0x0399 }
            java.lang.String r1 = "msgstore/updateMessageOnCurrentThread"
            X.36E r0 = r2.A0A     // Catch:{ all -> 0x0399 }
            int r0 = X.AnonymousClass29K.A00(r0, r6)     // Catch:{ all -> 0x0399 }
            X.C59882xe.A00(r5, r1, r0)     // Catch:{ all -> 0x0399 }
            goto L_0x0370
        L_0x0390:
            r20.close()     // Catch:{ all -> 0x0397 }
            r21.close()     // Catch:{ IOException -> 0x03b1 }
            goto L_0x03b5
        L_0x0397:
            r1 = move-exception
            goto L_0x03a5
        L_0x0399:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x039e }
            goto L_0x03a2
        L_0x039e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a3 }
        L_0x03a2:
            throw r1     // Catch:{ all -> 0x03a3 }
        L_0x03a3:
            r1 = move-exception
            r3 = 0
        L_0x03a5:
            r21.close()     // Catch:{ all -> 0x03a9 }
            goto L_0x03ad
        L_0x03a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03b1 }
        L_0x03ad:
            throw r1     // Catch:{ IOException -> 0x03b1 }
        L_0x03ae:
            r0 = move-exception
            r3 = 0
            goto L_0x03b2
        L_0x03b1:
            r0 = move-exception
        L_0x03b2:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x03b5:
            X.2ga r5 = r2.A0d
            long r1 = X.C18310x6.A0A(r18)
            java.lang.String r0 = "CoreMessageStore/updateMessageOnCurrentThread"
            r5.A02(r0, r1)
            goto L_0x03c5
        L_0x03c1:
            r3.close()
            r3 = 1
        L_0x03c5:
            X.2ga r4 = r4.A01
            long r1 = X.C18310x6.A0A(r16)
            java.lang.String r0 = "CoreMessageStore/updateMessageOnCurrentThread"
            r4.A02(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55832qz.A07(X.34x, int):boolean");
    }

    public C55832qz(C43262Rl r1, AnonymousClass2TB r2, C55122pp r3, AnonymousClass2TV r4) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }
}
