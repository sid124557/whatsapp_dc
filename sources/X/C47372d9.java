package X;

/* renamed from: X.2d9  reason: invalid class name and case insensitive filesystem */
public class C47372d9 {
    public final C56612sH A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ec, code lost:
        if (r6 == null) goto L_0x05f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0252, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r22.close();
        r1 = r4.A02;
        r1.A03 = "messages.bin";
        r1.A05 = r21;
        r1.A04 = "protobuf";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.CancellationSignal r40, X.C16370su r41, X.C25891bF r42, java.io.File r43) {
        /*
            r39 = this;
            r5 = r39
            X.2Tf r4 = new X.2Tf     // Catch:{ IOException -> 0x069e }
            r4.<init>()     // Catch:{ IOException -> 0x069e }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x069e }
            r4.A00 = r0     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "android"
            r4.A06 = r0     // Catch:{ IOException -> 0x069e }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x069e }
            r4.A07 = r0     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "consumer"
            r4.A03 = r0     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "2.23.26.14"
            r4.A04 = r0     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "1.0"
            r4.A05 = r0     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A07     // Catch:{ IOException -> 0x069e }
            java.lang.Object r6 = r0.get()     // Catch:{ IOException -> 0x069e }
            X.2Rx r6 = (X.C43382Rx) r6     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A04     // Catch:{ IOException -> 0x069e }
            r37 = r0
            java.lang.Object r12 = r37.get()     // Catch:{ IOException -> 0x069e }
            X.2eR r12 = (X.C48152eR) r12     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A05     // Catch:{ IOException -> 0x069e }
            r36 = r0
            java.lang.Object r11 = r36.get()     // Catch:{ IOException -> 0x069e }
            X.2qE r11 = (X.C55362qE) r11     // Catch:{ IOException -> 0x069e }
            r38 = r40
            boolean r0 = r38.isCanceled()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x069e }
        L_0x004e:
            X.2zv r8 = r6.A05     // Catch:{ IOException -> 0x069e }
            java.util.HashSet r3 = r8.A09     // Catch:{ IOException -> 0x069e }
            boolean r0 = r3.isEmpty()     // Catch:{ IOException -> 0x069e }
            r7 = 0
            if (r0 != 0) goto L_0x0268
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x069e }
            int r1 = r2.length()     // Catch:{ IOException -> 0x069e }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r2.substring(r0, r1)     // Catch:{ IOException -> 0x069e }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x069e }
            if (r0 != 0) goto L_0x0268
            goto L_0x0267
        L_0x006f:
            java.lang.String r15 = "messages.bin"
            java.io.File r3 = r12.A00(r15)     // Catch:{ IOException -> 0x069e }
            r0 = 1
            long r1 = r11.A02(r3, r15, r0)     // Catch:{ IOException -> 0x069e }
            r27 = 0
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x068e
            X.34k r0 = r6.A00     // Catch:{ IOException -> 0x0681 }
            r29 = r0
            X.3dV r0 = r6.A03     // Catch:{ IOException -> 0x0681 }
            r35 = r0
            java.io.FileOutputStream r22 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ IOException -> 0x0681 }
            java.util.ArrayList r21 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0677 }
            X.2rt r0 = r6.A04     // Catch:{ all -> 0x0677 }
            long r19 = r0.A01()     // Catch:{ all -> 0x0677 }
            r7 = 1
            r10 = 0
        L_0x009a:
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0255
            r38.throwIfCanceled()     // Catch:{ all -> 0x0677 }
            X.2JR r9 = new X.2JR     // Catch:{ all -> 0x0677 }
            r9.<init>()     // Catch:{ all -> 0x0677 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0677 }
            r0 = 5000(0x1388, float:7.006E-42)
            java.lang.String r30 = "message"
            long r1 = (long) r0     // Catch:{ all -> 0x0677 }
            r31 = r7
            r33 = r1
            X.2JQ r1 = r29.A06(r30, r31, r33)     // Catch:{ all -> 0x0677 }
            java.util.List r1 = r1.A01     // Catch:{ all -> 0x0677 }
            int r2 = r1.size()     // Catch:{ all -> 0x0677 }
            if (r2 == 0) goto L_0x0255
            java.util.ArrayList r13 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0677 }
            java.util.Collections.sort(r13)     // Catch:{ all -> 0x0677 }
            int r1 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r1 <= 0) goto L_0x00da
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0677 }
            int r1 = java.util.Collections.binarySearch(r13, r1)     // Catch:{ all -> 0x0677 }
            int r3 = r1 + 1
            if (r1 >= 0) goto L_0x00db
            int r1 = -r1
            int r3 = r1 + -1
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            int r1 = r13.size()     // Catch:{ all -> 0x0677 }
            if (r3 >= r1) goto L_0x0255
            int r2 = X.AnonymousClass0x9.A03(r13, r3)     // Catch:{ all -> 0x0677 }
            r1 = 100
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0677 }
            int r14 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0677 }
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r14)     // Catch:{ all -> 0x0677 }
        L_0x00f3:
            int r0 = r13.size()     // Catch:{ all -> 0x0677 }
            if (r3 >= r0) goto L_0x0116
            int r0 = r2.size()     // Catch:{ all -> 0x0677 }
            if (r0 >= r14) goto L_0x0116
            java.lang.Object r0 = r13.get(r3)     // Catch:{ all -> 0x0677 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0677 }
            int r16 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r16 < 0) goto L_0x0110
            int r16 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r16 <= 0) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            X.AnonymousClass0x2.A1Q(r2, r0)     // Catch:{ all -> 0x0677 }
            int r3 = r3 + 1
            goto L_0x00f3
        L_0x0116:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "   SELECT "
            r1.append(r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = X.AnonymousClass2C5.A01     // Catch:{ all -> 0x0677 }
            r1.append(r0)     // Catch:{ all -> 0x0677 }
            X.AnonymousClass001.A1M(r1)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "chat_row_id"
            X.AnonymousClass0x2.A1O(r1, r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "available_message_view"
            X.AnonymousClass0x2.A1P(r1, r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "(_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0677 }
            int r0 = r2.size()     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x0677 }
            r1.append(r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            X.C18320x8.A1L(r1, r0)     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "_id ASC"
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0677 }
            java.util.ArrayList r3 = X.C18290x4.A0y(r2)     // Catch:{ all -> 0x0677 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0677 }
        L_0x0159:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0677 }
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0677 }
            X.C18320x8.A1I(r0, r3)     // Catch:{ all -> 0x0677 }
            goto L_0x0159
        L_0x0167:
            r0 = r17
            X.C18280x3.A1K(r3, r0)     // Catch:{ all -> 0x0677 }
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r13, r3)     // Catch:{ all -> 0x0677 }
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x0677 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0677 }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x0677 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0677 }
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0677 }
            java.lang.Object[] r2 = r1.toArray(r0)     // Catch:{ all -> 0x0677 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0677 }
            X.4GK r13 = r35.get()     // Catch:{ all -> 0x0677 }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x066d }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x066d }
            java.lang.String r0 = "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL"
            android.database.Cursor r14 = r1.A0E(r3, r0, r2)     // Catch:{ all -> 0x066d }
            r13.close()     // Catch:{ all -> 0x0677 }
            if (r14 == 0) goto L_0x0255
            int r0 = r14.getCount()     // Catch:{ all -> 0x0668 }
            long r2 = (long) r0     // Catch:{ all -> 0x0668 }
            r9.A01 = r2     // Catch:{ all -> 0x0668 }
            X.2Rz r13 = r4.A02     // Catch:{ all -> 0x0668 }
            long r0 = r13.A02     // Catch:{ all -> 0x0668 }
            long r0 = r0 + r2
            r13.A02 = r0     // Catch:{ all -> 0x0668 }
            boolean r0 = r14.moveToLast()     // Catch:{ all -> 0x0668 }
            if (r0 == 0) goto L_0x0252
            long r17 = X.C18270x1.A01(r14)     // Catch:{ all -> 0x0668 }
            r14.moveToFirst()     // Catch:{ all -> 0x0668 }
            r0 = -1
            r14.move(r0)     // Catch:{ all -> 0x0668 }
            X.20z r2 = X.C371120z.FOR_INCREMENTAL_BACKUP     // Catch:{ all -> 0x0668 }
            r1 = 0
            X.C162457s7.A0J(r2, r1)     // Catch:{ all -> 0x0668 }
            X.2av r0 = new X.2av     // Catch:{ all -> 0x0668 }
            r0.<init>(r2)     // Catch:{ all -> 0x0668 }
            X.2mJ r25 = r0.A00()     // Catch:{ all -> 0x0668 }
            X.2zv r3 = r6.A05     // Catch:{ all -> 0x0668 }
            X.4Jd r0 = new X.4Jd     // Catch:{ all -> 0x0668 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0668 }
            r23 = r3
            r24 = r14
            r26 = r0
            java.util.Map r1 = r23.A01(r24, r25, r26, r27)     // Catch:{ all -> 0x0668 }
            int r0 = r1.size()     // Catch:{ all -> 0x0668 }
            if (r0 == 0) goto L_0x0252
            X.1A0 r13 = X.AnonymousClass0x7.A0Z()     // Catch:{ all -> 0x0668 }
            X.23J r0 = X.AnonymousClass23J.FULL     // Catch:{ all -> 0x0668 }
            r13.A0D(r0)     // Catch:{ all -> 0x0668 }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x0668 }
        L_0x01e7:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0668 }
            if (r0 == 0) goto L_0x020b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r16)     // Catch:{ all -> 0x0668 }
            r38.throwIfCanceled()     // Catch:{ all -> 0x0668 }
            X.4uZ r2 = X.C18320x8.A0N(r0)     // Catch:{ all -> 0x0668 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0668 }
            X.19z r1 = (X.C209619z) r1     // Catch:{ all -> 0x0668 }
            boolean r0 = r2 instanceof X.C28011fL     // Catch:{ all -> 0x0668 }
            if (r0 == 0) goto L_0x0207
            X.1fL r2 = (X.C28011fL) r2     // Catch:{ all -> 0x0668 }
            r3.A02(r2, r1)     // Catch:{ all -> 0x0668 }
        L_0x0207:
            r13.A0B(r1)     // Catch:{ all -> 0x0668 }
            goto L_0x01e7
        L_0x020b:
            r13.A09(r10)     // Catch:{ all -> 0x0668 }
            X.6cX r1 = r13.A06()     // Catch:{ all -> 0x0668 }
            X.1E2 r1 = (X.AnonymousClass1E2) r1     // Catch:{ all -> 0x0668 }
            r0 = r22
            r1.A0E(r0)     // Catch:{ all -> 0x0668 }
            r9.A00 = r10     // Catch:{ all -> 0x0668 }
            r1 = r10
            r0 = r21
            r0.add(r9)     // Catch:{ all -> 0x0668 }
            int r10 = r10 + 1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0668 }
            java.lang.String r0 = "exportMessages - messages exporting in progress, batch number: "
            r2.append(r0)     // Catch:{ all -> 0x0668 }
            r2.append(r1)     // Catch:{ all -> 0x0668 }
            java.lang.String r0 = "; batch start: "
            r2.append(r0)     // Catch:{ all -> 0x0668 }
            r2.append(r7)     // Catch:{ all -> 0x0668 }
            java.lang.String r0 = "; batch end: "
            r2.append(r0)     // Catch:{ all -> 0x0668 }
            r0 = r17
            r2.append(r0)     // Catch:{ all -> 0x0668 }
            java.lang.String r0 = "; messages in batch: "
            r2.append(r0)     // Catch:{ all -> 0x0668 }
            long r0 = r9.A01     // Catch:{ all -> 0x0668 }
            X.C18260x0.A1H(r2, r0)     // Catch:{ all -> 0x0668 }
            r14.close()     // Catch:{ all -> 0x0677 }
            r7 = r17
            goto L_0x009a
        L_0x0252:
            r14.close()     // Catch:{ all -> 0x0677 }
        L_0x0255:
            r22.close()     // Catch:{ IOException -> 0x0681 }
            X.2Rz r1 = r4.A02     // Catch:{ IOException -> 0x0681 }
            r1.A03 = r15     // Catch:{ IOException -> 0x0681 }
            r0 = r21
            r1.A05 = r0     // Catch:{ IOException -> 0x0681 }
            java.lang.String r0 = "protobuf"
            r1.A04 = r0     // Catch:{ IOException -> 0x0681 }
            goto L_0x004e
        L_0x0267:
            r7 = r1
        L_0x0268:
            r9 = r42
            r9.A0E = r7     // Catch:{ IOException -> 0x069e }
            java.util.HashSet r7 = r8.A08     // Catch:{ IOException -> 0x069e }
            boolean r0 = r7.isEmpty()     // Catch:{ IOException -> 0x069e }
            r8 = 0
            if (r0 != 0) goto L_0x028a
            java.lang.String r2 = r7.toString()     // Catch:{ IOException -> 0x069e }
            int r1 = r2.length()     // Catch:{ IOException -> 0x069e }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r2.substring(r0, r1)     // Catch:{ IOException -> 0x069e }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x069e }
            if (r0 != 0) goto L_0x028a
            r8 = r1
        L_0x028a:
            r9.A0D = r8     // Catch:{ IOException -> 0x069e }
            X.2Ea r2 = r4.A01     // Catch:{ IOException -> 0x069e }
            boolean r0 = r38.isCanceled()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x0393
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x069e }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x069e }
        L_0x029d:
            java.util.List r0 = r2.A00     // Catch:{ IOException -> 0x069e }
            r0.addAll(r1)     // Catch:{ IOException -> 0x069e }
            X.2Rz r0 = r4.A02     // Catch:{ IOException -> 0x069e }
            java.util.List r0 = r0.A05     // Catch:{ IOException -> 0x069e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x069e }
            if (r0 <= 0) goto L_0x02b6
            X.2Rz r2 = r4.A02     // Catch:{ IOException -> 0x069e }
            X.34k r0 = r6.A00     // Catch:{ IOException -> 0x069e }
            long r0 = r0.A03()     // Catch:{ IOException -> 0x069e }
            r2.A00 = r0     // Catch:{ IOException -> 0x069e }
        L_0x02b6:
            r3.clear()     // Catch:{ IOException -> 0x069e }
            r7.clear()     // Catch:{ IOException -> 0x069e }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x069e }
            r2 = r41
            r2.AyK(r0)     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A02     // Catch:{ IOException -> 0x069e }
            java.util.Iterator r16 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ IOException -> 0x069e }
        L_0x02cd:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x03a0
            java.lang.Object r3 = r16.next()     // Catch:{ IOException -> 0x069e }
            X.2wb r3 = (X.C59242wb) r3     // Catch:{ IOException -> 0x069e }
            java.util.List r0 = r3.A01     // Catch:{ IOException -> 0x069e }
            java.util.Iterator r15 = X.AnonymousClass0x7.A0x(r0)     // Catch:{ IOException -> 0x069e }
        L_0x02df:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x038a
            java.lang.Object r6 = r15.next()     // Catch:{ IOException -> 0x069e }
            X.2vt r6 = (X.C58832vt) r6     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A03     // Catch:{ IOException -> 0x069e }
            java.lang.Object r7 = r0.get()     // Catch:{ IOException -> 0x069e }
            X.2EY r7 = (X.AnonymousClass2EY) r7     // Catch:{ IOException -> 0x069e }
            java.lang.Object r11 = r37.get()     // Catch:{ IOException -> 0x069e }
            X.2eR r11 = (X.C48152eR) r11     // Catch:{ IOException -> 0x069e }
            java.lang.Object r10 = r36.get()     // Catch:{ IOException -> 0x069e }
            X.2qE r10 = (X.C55362qE) r10     // Catch:{ IOException -> 0x069e }
            java.lang.String r1 = r6.A03     // Catch:{ IOException -> 0x069e }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "_deleted_%d.json"
            java.lang.String r22 = X.AnonymousClass000.A0X(r0, r8)     // Catch:{ IOException -> 0x069e }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x069e }
            java.lang.String r12 = "EntityTableProcessor/"
            r0.append(r12)     // Catch:{ IOException -> 0x069e }
            r0.append(r1)     // Catch:{ IOException -> 0x069e }
            java.lang.String r9 = "/"
            java.lang.String r21 = X.AnonymousClass000.A0X(r9, r0)     // Catch:{ IOException -> 0x069e }
            X.1Im r8 = new X.1Im     // Catch:{ IOException -> 0x069e }
            r23 = r1
            r17 = r8
            r18 = r7
            r19 = r11
            r20 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x069e }
            r0 = r38
            java.util.List r0 = r8.A00(r0)     // Catch:{ IOException -> 0x069e }
            java.util.List r13 = r6.A04     // Catch:{ IOException -> 0x069e }
            r13.addAll(r0)     // Catch:{ IOException -> 0x069e }
            java.lang.String r8 = r6.A02     // Catch:{ IOException -> 0x069e }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "_modified_%d.json"
            java.lang.String r24 = X.AnonymousClass000.A0X(r0, r14)     // Catch:{ IOException -> 0x069e }
            java.lang.String r23 = X.C18260x0.A06(r12, r1, r9)     // Catch:{ IOException -> 0x069e }
            X.1Ik r0 = new X.1Ik     // Catch:{ IOException -> 0x069e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x069e }
            X.1In r9 = new X.1In     // Catch:{ IOException -> 0x069e }
            r17 = r9
            r18 = r38
            r19 = r7
            r20 = r0
            r21 = r11
            r22 = r10
            r25 = r1
            r26 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x069e }
            r0 = r38
            java.util.List r0 = r9.A00(r0)     // Catch:{ IOException -> 0x069e }
            java.util.List r9 = r6.A05     // Catch:{ IOException -> 0x069e }
            r9.addAll(r0)     // Catch:{ IOException -> 0x069e }
            java.util.List r0 = java.util.Collections.unmodifiableList(r13)     // Catch:{ IOException -> 0x069e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x069e }
            if (r0 > 0) goto L_0x0380
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)     // Catch:{ IOException -> 0x069e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x069e }
            if (r0 <= 0) goto L_0x02df
        L_0x0380:
            X.34k r0 = r7.A00     // Catch:{ IOException -> 0x069e }
            long r0 = r0.A04(r1, r8)     // Catch:{ IOException -> 0x069e }
            r6.A00 = r0     // Catch:{ IOException -> 0x069e }
            goto L_0x02df
        L_0x038a:
            java.util.Map r1 = r4.A09     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = r3.A00     // Catch:{ IOException -> 0x069e }
            r1.put(r0, r3)     // Catch:{ IOException -> 0x069e }
            goto L_0x02cd
        L_0x0393:
            X.1Il r1 = new X.1Il     // Catch:{ IOException -> 0x069e }
            r1.<init>(r6, r4, r12, r11)     // Catch:{ IOException -> 0x069e }
            r0 = r38
            java.util.List r1 = r1.A00(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x029d
        L_0x03a0:
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x069e }
            r2.AyK(r0)     // Catch:{ IOException -> 0x069e }
            X.8qC r0 = r5.A0A     // Catch:{ IOException -> 0x069e }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x069e }
            X.2Va r1 = (X.C44192Va) r1     // Catch:{ IOException -> 0x069e }
            java.lang.Object r12 = r37.get()     // Catch:{ IOException -> 0x069e }
            X.2eR r12 = (X.C48152eR) r12     // Catch:{ IOException -> 0x069e }
            java.lang.Object r8 = r36.get()     // Catch:{ IOException -> 0x069e }
            X.2qE r8 = (X.C55362qE) r8     // Catch:{ IOException -> 0x069e }
            boolean r0 = r38.isCanceled()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x03c5
            r10 = 0
            goto L_0x0434
        L_0x03c5:
            java.lang.String r0 = "sequences"
            X.1Ik r11 = new X.1Ik     // Catch:{ IOException -> 0x069e }
            r11.<init>(r0)     // Catch:{ IOException -> 0x069e }
            java.util.Map r0 = r1.A00()     // Catch:{ IOException -> 0x069e }
            java.util.ArrayList r9 = X.C18290x4.A0z(r0)     // Catch:{ IOException -> 0x069e }
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r0)     // Catch:{ IOException -> 0x069e }
        L_0x03d9:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x069e }
            if (r0 == 0) goto L_0x03ff
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r7)     // Catch:{ IOException -> 0x069e }
            java.lang.Object r6 = r0.getKey()     // Catch:{ IOException -> 0x069e }
            java.lang.Object r3 = r0.getValue()     // Catch:{ IOException -> 0x069e }
            java.util.HashMap r1 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "name"
            r1.put(r0, r6)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "value"
            r1.put(r0, r3)     // Catch:{ IOException -> 0x069e }
            r9.add(r1)     // Catch:{ IOException -> 0x069e }
            goto L_0x03d9
        L_0x03ff:
            java.lang.String r10 = "sequences.json"
            java.io.File r7 = r12.A00(r10)     // Catch:{ IOException -> 0x069e }
            java.io.FileOutputStream r6 = X.AnonymousClass0x9.A0h(r7)     // Catch:{ JSONException -> 0x0695 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x065e }
            r3.<init>(r6)     // Catch:{ all -> 0x065e }
            org.json.JSONObject r1 = r11.A01(r9)     // Catch:{ all -> 0x0654 }
            r0 = 4
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x0654 }
            r3.write(r0)     // Catch:{ all -> 0x0654 }
            r3.close()     // Catch:{ all -> 0x065e }
            r6.close()     // Catch:{ JSONException -> 0x0695 }
            r0 = 1
            long r8 = r8.A02(r7, r10, r0)     // Catch:{ IOException -> 0x069e }
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0434
            java.lang.String r0 = "SequencesHandler/Failed to register sequences file in metadata manager."
            java.io.IOException r2 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x0434:
            r4.A08 = r10     // Catch:{ IOException -> 0x069e }
            r0 = 80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x069e }
            r2.AyK(r0)     // Catch:{ IOException -> 0x069e }
            java.lang.Object r0 = r37.get()     // Catch:{ IOException -> 0x069e }
            X.2eR r0 = (X.C48152eR) r0     // Catch:{ IOException -> 0x069e }
            java.lang.Object r7 = r36.get()     // Catch:{ IOException -> 0x069e }
            X.2qE r7 = (X.C55362qE) r7     // Catch:{ IOException -> 0x069e }
            java.lang.String r11 = "header"
            java.io.File r10 = r0.A00(r11)     // Catch:{ IOException -> 0x069e }
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r10)     // Catch:{ JSONException -> 0x0646 }
            r6 = 4
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            org.json.JSONObject r9 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            java.lang.String r12 = "creation_date"
            long r0 = r4.A00     // Catch:{ all -> 0x063c }
            r9.put(r12, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "os"
            java.lang.String r0 = r4.A06     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "os_version"
            java.lang.String r0 = r4.A07     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "app_name"
            java.lang.String r0 = r4.A03     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "app_version"
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "format_version"
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            r3.put(r11, r9)     // Catch:{ all -> 0x063c }
            X.2Rz r11 = r4.A02     // Catch:{ all -> 0x063c }
            org.json.JSONObject r9 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "filename"
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "format"
            java.lang.String r0 = r11.A04     // Catch:{ all -> 0x063c }
            r9.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r12 = "messages_count_on_backup"
            long r0 = r11.A00     // Catch:{ all -> 0x063c }
            r9.put(r12, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r12 = "messages_updated"
            long r0 = r11.A02     // Catch:{ all -> 0x063c }
            r9.put(r12, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r12 = "messages_deleted"
            long r0 = r11.A01     // Catch:{ all -> 0x063c }
            r9.put(r12, r0)     // Catch:{ all -> 0x063c }
            org.json.JSONArray r12 = X.AnonymousClass0x9.A1F()     // Catch:{ all -> 0x063c }
            java.lang.String r0 = "chunks"
            r9.put(r0, r12)     // Catch:{ all -> 0x063c }
            java.util.List r0 = r11.A05     // Catch:{ all -> 0x063c }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x063c }
        L_0x04c8:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x063c }
            if (r0 == 0) goto L_0x04eb
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x063c }
            X.2JR r14 = (X.AnonymousClass2JR) r14     // Catch:{ all -> 0x063c }
            org.json.JSONObject r13 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            java.lang.String r1 = "chunk_number"
            int r0 = r14.A00     // Catch:{ all -> 0x063c }
            r13.put(r1, r0)     // Catch:{ all -> 0x063c }
            java.lang.String r11 = "messages_count"
            long r0 = r14.A01     // Catch:{ all -> 0x063c }
            r13.put(r11, r0)     // Catch:{ all -> 0x063c }
            r12.put(r13)     // Catch:{ all -> 0x063c }
            goto L_0x04c8
        L_0x04eb:
            java.lang.String r0 = "added_messages"
            r3.put(r0, r9)     // Catch:{ all -> 0x063c }
            X.2Ea r0 = r4.A01     // Catch:{ all -> 0x063c }
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x063c }
            int r0 = r1.size()     // Catch:{ all -> 0x063c }
            if (r0 <= 0) goto L_0x0515
            org.json.JSONArray r9 = X.AnonymousClass0x9.A1F()     // Catch:{ all -> 0x063c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x063c }
        L_0x0506:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x063c }
            if (r0 == 0) goto L_0x0510
            X.AnonymousClass0x7.A1L(r1, r9)     // Catch:{ all -> 0x063c }
            goto L_0x0506
        L_0x0510:
            java.lang.String r0 = "deleted_message_ids_files"
            r11.put(r0, r9)     // Catch:{ all -> 0x063c }
        L_0x0515:
            java.lang.String r0 = "deleted_messages"
            r3.put(r0, r11)     // Catch:{ all -> 0x063c }
            java.util.Map r1 = r4.A09     // Catch:{ all -> 0x063c }
            int r0 = r1.size()     // Catch:{ all -> 0x063c }
            if (r0 <= 0) goto L_0x0554
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x063c }
            java.lang.String r0 = "entities"
            r3.put(r0, r11)     // Catch:{ all -> 0x063c }
            java.util.Iterator r12 = X.AnonymousClass001.A0v(r1)     // Catch:{ all -> 0x063c }
        L_0x052f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x063c }
            if (r0 == 0) goto L_0x0554
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x063c }
            X.2wb r0 = (X.C59242wb) r0     // Catch:{ all -> 0x063c }
            java.lang.String r9 = r0.A00     // Catch:{ all -> 0x063c }
            X.1Ih r1 = new X.1Ih     // Catch:{ all -> 0x063c }
            r1.<init>(r9)     // Catch:{ all -> 0x063c }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x063c }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x063c }
            org.json.JSONObject r0 = r1.A01(r0)     // Catch:{ all -> 0x063c }
            org.json.JSONArray r0 = r0.getJSONArray(r9)     // Catch:{ all -> 0x063c }
            r11.put(r9, r0)     // Catch:{ all -> 0x063c }
            goto L_0x052f
        L_0x0554:
            java.lang.String r1 = r3.toString(r6)     // Catch:{ all -> 0x063c }
            java.lang.String r0 = "UTF-8"
            X.AnonymousClass0x7.A1C(r8, r1, r0)     // Catch:{ all -> 0x063c }
            r8.close()     // Catch:{ JSONException -> 0x0646 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "MessageStoreIncrementalBackup/Exported messages:\nUpdated: "
            r6.append(r0)     // Catch:{ IOException -> 0x069e }
            X.2Rz r3 = r4.A02     // Catch:{ IOException -> 0x069e }
            long r0 = r3.A02     // Catch:{ IOException -> 0x069e }
            r6.append(r0)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = ",\nDeleted: "
            r6.append(r0)     // Catch:{ IOException -> 0x069e }
            long r0 = r3.A01     // Catch:{ IOException -> 0x069e }
            X.C18260x0.A1H(r6, r0)     // Catch:{ IOException -> 0x069e }
            java.lang.String r1 = "header.json"
            r0 = 1
            long r6 = r7.A02(r10, r1, r0)     // Catch:{ IOException -> 0x069e }
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0635
            java.io.FileOutputStream r7 = X.AnonymousClass0x9.A0h(r43)     // Catch:{ IOException -> 0x069e }
            java.util.zip.ZipOutputStream r8 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x062b }
            r8.<init>(r7)     // Catch:{ all -> 0x062b }
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x0621 }
            X.2qE r0 = (X.C55362qE) r0     // Catch:{ all -> 0x0621 }
            X.3cu r10 = r0.A03()     // Catch:{ all -> 0x0621 }
        L_0x059a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0617 }
            if (r0 == 0) goto L_0x05f2
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0617 }
            X.2SO r0 = (X.AnonymousClass2SO) r0     // Catch:{ all -> 0x0617 }
            java.io.File r3 = r0.A02     // Catch:{ all -> 0x0617 }
            java.lang.String r9 = r0.A04     // Catch:{ all -> 0x0617 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0617 }
            if (r0 != 0) goto L_0x05ba
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0617 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/archiveFiles, file not found: "
            X.C18260x0.A1P(r1, r0, r3)     // Catch:{ all -> 0x0617 }
            goto L_0x059a
        L_0x05ba:
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0617 }
            r6 = 0
            java.io.FileInputStream r4 = X.AnonymousClass0x9.A0g(r3)     // Catch:{ all -> 0x05eb }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x05e1 }
            r3.<init>(r9)     // Catch:{ all -> 0x05e1 }
            r8.putNextEntry(r3)     // Catch:{ all -> 0x05de }
            X.8qC r0 = r5.A09     // Catch:{ all -> 0x05de }
            r0.get()     // Catch:{ all -> 0x05de }
            r0 = r38
            X.C619032s.A01(r0, r4, r8, r1)     // Catch:{ all -> 0x05de }
            r4.close()     // Catch:{ all -> 0x05dc }
            r8.closeEntry()     // Catch:{ all -> 0x0617 }
            goto L_0x059a
        L_0x05dc:
            r0 = move-exception
            goto L_0x05ee
        L_0x05de:
            r1 = move-exception
            r6 = r3
            goto L_0x05e2
        L_0x05e1:
            r1 = move-exception
        L_0x05e2:
            r4.close()     // Catch:{ all -> 0x05e6 }
            goto L_0x05ea
        L_0x05e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05eb }
        L_0x05ea:
            throw r1     // Catch:{ all -> 0x05eb }
        L_0x05eb:
            r0 = move-exception
            if (r6 == 0) goto L_0x05f1
        L_0x05ee:
            r8.closeEntry()     // Catch:{ all -> 0x0617 }
        L_0x05f1:
            throw r0     // Catch:{ all -> 0x0617 }
        L_0x05f2:
            r10.close()     // Catch:{ all -> 0x0621 }
            r8.close()     // Catch:{ all -> 0x062b }
            r7.close()     // Catch:{ IOException -> 0x069e }
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x069e }
            r2.AyK(r0)     // Catch:{ IOException -> 0x069e }
            java.lang.Object r0 = r36.get()
            X.2qE r0 = (X.C55362qE) r0
            r0.A04()
            java.lang.Object r0 = r37.get()
            X.2eR r0 = (X.C48152eR) r0
            r0.A01()
            return
        L_0x0617:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x061c }
            goto L_0x0620
        L_0x061c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0621 }
        L_0x0620:
            throw r1     // Catch:{ all -> 0x0621 }
        L_0x0621:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0626 }
            goto L_0x062a
        L_0x0626:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x062b }
        L_0x062a:
            throw r1     // Catch:{ all -> 0x062b }
        L_0x062b:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0630 }
            goto L_0x069d
        L_0x0630:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x0635:
            java.lang.String r0 = "Failed to export metadata file."
            java.io.IOException r2 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x063c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0641 }
            goto L_0x0645
        L_0x0641:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x0646 }
        L_0x0645:
            throw r1     // Catch:{ JSONException -> 0x0646 }
        L_0x0646:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x069e }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x0654:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0659 }
            goto L_0x065d
        L_0x0659:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x065e }
        L_0x065d:
            throw r1     // Catch:{ all -> 0x065e }
        L_0x065e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0663 }
            goto L_0x0667
        L_0x0663:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x0695 }
        L_0x0667:
            throw r1     // Catch:{ JSONException -> 0x0695 }
        L_0x0668:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0672 }
            goto L_0x0676
        L_0x066d:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0672 }
            goto L_0x0676
        L_0x0672:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0677 }
        L_0x0676:
            throw r1     // Catch:{ all -> 0x0677 }
        L_0x0677:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x067c }
            goto L_0x0680
        L_0x067c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0681 }
        L_0x0680:
            throw r1     // Catch:{ IOException -> 0x0681 }
        L_0x0681:
            r1 = move-exception
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x069e }
            java.lang.String r0 = "Failed to export messages data."
            java.io.IOException r2 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x068e:
            java.lang.String r0 = "Failed to export messages file."
            java.io.IOException r2 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x069e }
            goto L_0x069d
        L_0x0695:
            r1 = move-exception
            java.lang.String r0 = "SequencesHandler/Failed to write deleted message IDs to JSON"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x069e }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x069e }
        L_0x069d:
            throw r2     // Catch:{ IOException -> 0x069e }
        L_0x069e:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "Failed to export backup data."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x06ab }
            throw r0     // Catch:{ all -> 0x06ab }
        L_0x06ab:
            r1 = move-exception
            X.8qC r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.2qE r0 = (X.C55362qE) r0
            r0.A04()
            X.8qC r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.2eR r0 = (X.C48152eR) r0
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47372d9.A00(android.os.CancellationSignal, X.0su, X.1bF, java.io.File):void");
    }

    public C47372d9(C56612sH r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11) {
        this.A00 = r1;
        this.A07 = r2;
        this.A08 = r3;
        this.A0A = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A01 = r7;
        this.A09 = r8;
        this.A03 = r9;
        this.A05 = r10;
        this.A02 = r11;
    }
}
