package X;

/* renamed from: X.4J8  reason: invalid class name */
public class AnonymousClass4J8 implements C15630rg {
    public Object A00;
    public final int A01;

    public AnonymousClass4J8(AnonymousClass5RD r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0277, code lost:
        if (r1 == null) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02df, code lost:
        r2.A08("counted");
        r1 = X.AnonymousClass002.A0J(r12.entrySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02f0, code lost:
        if (X.C66533Lu.A01(r3) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f2, code lost:
        X.AnonymousClass4IU.A00(r1, 11);
        r2.A08("sorted");
        r14 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0305, code lost:
        if (X.C66533Lu.A01(r3) == false) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0312, code lost:
        if (r14.hasNext() == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0319, code lost:
        if (r7.size() >= 5) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x031f, code lost:
        if (X.C66533Lu.A01(r3) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0321, code lost:
        r1 = X.C18310x6.A0q(X.AnonymousClass001.A0w(r14));
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x032e, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0336, code lost:
        if (r1.equals("0") != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0348, code lost:
        r11 = (X.C95814uZ) r4.A0C.A0B(X.C95814uZ.class, java.lang.Long.parseLong(r1, 36) - 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        r2.A08("lookup");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x038e, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03b6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013f, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x03b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r21
            r1 = r20
            int r0 = r1.A01
            if (r0 == 0) goto L_0x014a
            java.lang.Object r2 = r1.A00
            X.5RD r2 = (X.AnonymousClass5RD) r2
            X.5I3 r3 = (X.AnonymousClass5I3) r3
            java.lang.Object r1 = r3.A01
            X.2s8 r1 = (X.C56532s8) r1
            int r0 = r1.A02
            if (r0 == 0) goto L_0x001c
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            return r3
        L_0x001c:
            X.08M r4 = r2.A0A
            X.AnonymousClass0x7.A18(r4)
            X.3Lu r6 = r2.A0G
            X.0QU r10 = r3.A00
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FtsMessageStore/getMediaCounts/"
            r2.append(r0)
            java.lang.String r0 = r1.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            X.33M r2 = X.AnonymousClass33M.A01(r0)
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            boolean r0 = r6.A0N()
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x004b:
            r2.A08(r0)
        L_0x004e:
            r2.A07()
        L_0x0051:
            X.AnonymousClass0x9.A1I(r4)
            return r3
        L_0x0055:
            boolean r0 = X.C66533Lu.A01(r10)
            java.lang.String r9 = "cancelled"
            if (r0 != 0) goto L_0x0145
            long r11 = r6.A03()
            r7 = 1
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "v1"
            goto L_0x004b
        L_0x006b:
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.lang.String r0 = r1.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r15 = ""
            if (r0 == 0) goto L_0x00ad
            X.4uZ r0 = r1.A04
            if (r0 != 0) goto L_0x00ad
            r14 = r15
        L_0x0084:
            X.33j r0 = r6.A06
            X.2s8 r11 = new X.2s8
            r11.<init>(r0)
            int[] r8 = X.C66533Lu.A0R
            int r7 = r8.length
            r16 = 0
            r5 = 0
        L_0x0091:
            if (r5 >= r7) goto L_0x00b3
            r1 = r8[r5]
            java.lang.String r0 = "SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? "
            r13.add(r0)
            r11.A02 = r1
            java.lang.String r1 = r6.A0B(r10, r11, r15)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass0x2.A1N(r0, r1)
            X.C18270x1.A1D(r14, r0, r12)
            int r5 = r5 + 1
            goto L_0x0091
        L_0x00ad:
            r0 = 0
            java.lang.String r14 = r6.A0A(r10, r1, r0)
            goto L_0x0084
        L_0x00b3:
            boolean r0 = X.C66533Lu.A01(r10)
            if (r0 != 0) goto L_0x0145
            java.lang.String r0 = " UNION ALL "
            java.lang.String r7 = android.text.TextUtils.join(r0, r13)
            java.lang.String[] r5 = X.C18300x5.A1b(r12)
            java.lang.String r0 = "matchterm"
            r2.A08(r0)
            X.3dV r0 = r6.A0F     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
            X.4GK r11 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x011e }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "GET_MEDIA_COUNTS"
            android.database.Cursor r7 = r1.A0D(r10, r7, r0, r5)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "count"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
        L_0x00df:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0108
            boolean r0 = X.C66533Lu.A01(r10)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00f2
            r2.A08(r9)     // Catch:{ all -> 0x0114 }
            r2.A07()     // Catch:{ all -> 0x0114 }
            goto L_0x0100
        L_0x00f2:
            int r1 = r7.getInt(r5)     // Catch:{ all -> 0x0114 }
            if (r1 <= 0) goto L_0x00fd
            r0 = r8[r16]     // Catch:{ all -> 0x0114 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0114 }
        L_0x00fd:
            int r16 = r16 + 1
            goto L_0x00df
        L_0x0100:
            r7.close()     // Catch:{ all -> 0x011e }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
            goto L_0x0051
        L_0x0108:
            java.lang.String r0 = "counted"
            r2.A08(r0)     // Catch:{ all -> 0x0114 }
            r7.close()     // Catch:{ all -> 0x011e }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
            goto L_0x0141
        L_0x0114:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0119 }
            goto L_0x011d
        L_0x0119:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r1     // Catch:{ all -> 0x011e }
        L_0x011e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
        L_0x0127:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, SQLiteException -> 0x0128, 0nr -> 0x0141, Exception -> 0x013c }
        L_0x0128:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            goto L_0x004b
        L_0x0132:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r6.A0E
            r0.A04()
            goto L_0x0141
        L_0x013c:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x03b6
        L_0x0141:
            java.lang.String r0 = "complete"
            goto L_0x004b
        L_0x0145:
            r2.A08(r9)
            goto L_0x004e
        L_0x014a:
            java.lang.Object r6 = r1.A00
            X.5RD r6 = (X.AnonymousClass5RD) r6
            X.5I3 r3 = (X.AnonymousClass5I3) r3
            java.lang.Object r5 = r3.A01
            X.2s8 r5 = (X.C56532s8) r5
            X.4uZ r0 = r5.A04
            if (r0 == 0) goto L_0x0164
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        L_0x015e:
            X.7LL r3 = new X.7LL
            r3.<init>(r6, r7, r2)
            return r3
        L_0x0164:
            X.08M r0 = r6.A08
            r19 = r0
            X.AnonymousClass0x7.A18(r19)
            X.3Lu r4 = r6.A0G
            X.0QU r3 = r3.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FtsMessageStore/findChats/"
            r1.append(r0)
            java.lang.String r0 = r5.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.33M r2 = X.AnonymousClass33M.A01(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            boolean r0 = r4.A0N()
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x0194:
            r2.A08(r0)
        L_0x0197:
            r2.A07()
        L_0x019a:
            X.1VX r2 = r6.A0H
            r1 = 1448(0x5a8, float:2.029E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x03af
            r0 = 0
            java.util.List r0 = r4.A0G(r3, r5, r0)
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L_0x01b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a8
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r1)
            if (r2 != 0) goto L_0x01c8
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x01b0
        L_0x01c8:
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.retainAll(r0)
            goto L_0x01b0
        L_0x01d0:
            boolean r0 = X.C66533Lu.A01(r3)
            java.lang.String r9 = "cancelled"
            if (r0 == 0) goto L_0x01dc
            r2.A08(r9)
            goto L_0x0197
        L_0x01dc:
            boolean r0 = X.C56532s8.A00(r5)
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "empty"
            goto L_0x0194
        L_0x01e5:
            long r12 = r4.A03()
            r10 = 1
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "v1"
            goto L_0x0194
        L_0x01f3:
            boolean r0 = X.C56532s8.A00(r5)
            if (r0 != 0) goto L_0x0210
            java.lang.String r1 = ""
        L_0x01fb:
            r0 = 0
            java.lang.String r0 = r4.A0A(r3, r5, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)
            java.lang.String r13 = " "
            java.lang.String r1 = X.AnonymousClass000.A0V(r13, r1, r0)
            java.lang.String r0 = "matchterm"
            r2.A08(r0)
            goto L_0x027e
        L_0x0210:
            r0 = 0
            java.util.List r0 = r4.A0G(r3, r5, r0)
            java.util.HashSet r10 = X.AnonymousClass002.A0K()
            java.util.Iterator r11 = r0.iterator()
        L_0x021d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x023f
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r11)
            java.lang.Object r0 = r0.second
            java.util.Iterator r8 = X.C18320x8.A0q(r0)
        L_0x022d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r1 = r8.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x022d
            r10.add(r1)
            goto L_0x022d
        L_0x023f:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0279
            int r0 = r10.size()
            java.lang.String[] r11 = new java.lang.String[r0]
            java.util.Iterator r13 = r10.iterator()
            r12 = 0
        L_0x0250:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0271
            X.4uZ r10 = X.C18300x5.A0P(r13)
            int r8 = r12 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fts_jid:"
            r1.append(r0)
            java.lang.String r0 = r4.A0C(r10)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r11[r12] = r0
            r12 = r8
            goto L_0x0250
        L_0x0271:
            java.lang.String r0 = " OR "
            java.lang.String r1 = android.text.TextUtils.join(r0, r11)
            if (r1 != 0) goto L_0x01fb
        L_0x0279:
            java.lang.String r0 = "no user"
            goto L_0x0194
        L_0x027e:
            X.3dV r0 = r4.A0F     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
            X.4GK r18 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0381 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0381 }
            java.lang.String r8 = "SELECT fts_jid, count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? GROUP BY fts_jid"
            java.lang.String[] r1 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "SEARCH_FTS_JID_SQL"
            android.database.Cursor r8 = r10.A0D(r3, r8, r0, r1)     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "fts_jid"
            int r17 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0377 }
            java.lang.String r0 = "count"
            int r16 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0377 }
            java.util.HashMap r12 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0377 }
        L_0x02a6:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0377 }
            if (r0 == 0) goto L_0x02df
            boolean r0 = X.C66533Lu.A01(r3)     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x0307
            r0 = r17
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x0377 }
            java.lang.String[] r14 = android.text.TextUtils.split(r0, r13)     // Catch:{ all -> 0x0377 }
            r0 = r16
            int r15 = r8.getInt(r0)     // Catch:{ all -> 0x0377 }
            int r11 = r14.length     // Catch:{ all -> 0x0377 }
            r10 = 0
        L_0x02c4:
            if (r10 >= r11) goto L_0x02a6
            r1 = r14[r10]     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r12.get(r1)     // Catch:{ all -> 0x0377 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x02d4
            X.AnonymousClass0x2.A1I(r1, r12, r15)     // Catch:{ all -> 0x0377 }
            goto L_0x02dc
        L_0x02d4:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0377 }
            int r0 = r0 + r15
            X.AnonymousClass0x2.A1I(r1, r12, r0)     // Catch:{ all -> 0x0377 }
        L_0x02dc:
            int r10 = r10 + 1
            goto L_0x02c4
        L_0x02df:
            java.lang.String r0 = "counted"
            r2.A08(r0)     // Catch:{ all -> 0x0377 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x0377 }
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0377 }
            boolean r0 = X.C66533Lu.A01(r3)     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x0307
            r0 = 11
            X.AnonymousClass4IU.A00(r1, r0)     // Catch:{ all -> 0x0377 }
            java.lang.String r0 = "sorted"
            r2.A08(r0)     // Catch:{ all -> 0x0377 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0377 }
            boolean r0 = X.C66533Lu.A01(r3)     // Catch:{ all -> 0x0377 }
            if (r0 == 0) goto L_0x030e
        L_0x0307:
            r2.A08(r9)     // Catch:{ all -> 0x0377 }
            r2.A07()     // Catch:{ all -> 0x0377 }
            goto L_0x0363
        L_0x030e:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0377 }
            if (r0 == 0) goto L_0x036b
            int r1 = r7.size()     // Catch:{ all -> 0x0377 }
            r0 = 5
            if (r1 >= r0) goto L_0x036b
            boolean r0 = X.C66533Lu.A01(r3)     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x0307
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r14)     // Catch:{ all -> 0x0377 }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ all -> 0x0377 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0377 }
            r11 = 0
            if (r0 != 0) goto L_0x0355
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x0355
            r0 = 36
            long r0 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x033f }
            goto L_0x0348
        L_0x033f:
            r10 = move-exception
            X.2qk r1 = r4.A01     // Catch:{ all -> 0x0377 }
            java.lang.String r0 = "ftsMessageStore/corrupt_db"
            r1.A09(r0, r11, r10)     // Catch:{ all -> 0x0377 }
            goto L_0x0355
        L_0x0348:
            X.34p r13 = r4.A0C     // Catch:{ all -> 0x0377 }
            java.lang.Class<X.4uZ> r12 = X.C95814uZ.class
            r10 = 10
            long r0 = r0 - r10
            com.whatsapp.jid.Jid r11 = r13.A0B(r12, r0)     // Catch:{ all -> 0x0377 }
            X.4uZ r11 = (X.C95814uZ) r11     // Catch:{ all -> 0x0377 }
        L_0x0355:
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0377 }
            if (r0 == 0) goto L_0x030e
            X.3Lo r0 = r4.A0A     // Catch:{ all -> 0x0377 }
            X.3ZH r0 = r0.A01(r11)     // Catch:{ all -> 0x0377 }
            r7.add(r0)     // Catch:{ all -> 0x0377 }
            goto L_0x030e
        L_0x0363:
            r8.close()     // Catch:{ all -> 0x0381 }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
            goto L_0x019a
        L_0x036b:
            java.lang.String r0 = "lookup"
            r2.A08(r0)     // Catch:{ all -> 0x0377 }
            r8.close()     // Catch:{ all -> 0x0381 }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
            goto L_0x03a4
        L_0x0377:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x037c }
            goto L_0x0380
        L_0x037c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0381 }
        L_0x0380:
            throw r1     // Catch:{ all -> 0x0381 }
        L_0x0381:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0386 }
            goto L_0x038a
        L_0x0386:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
        L_0x038a:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x039b, SQLiteException -> 0x0391, 0nr -> 0x03a4, Exception -> 0x038b }
        L_0x038b:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x03b6
            goto L_0x03a4
        L_0x0391:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            goto L_0x0194
        L_0x039b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r4.A0E
            r0.A04()
        L_0x03a4:
            java.lang.String r0 = "complete"
            goto L_0x0194
        L_0x03a8:
            if (r2 != 0) goto L_0x03b1
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            goto L_0x03b1
        L_0x03af:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        L_0x03b1:
            X.AnonymousClass0x9.A1I(r19)
            goto L_0x015e
        L_0x03b6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4J8.apply(java.lang.Object):java.lang.Object");
    }
}
