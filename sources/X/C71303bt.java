package X;

/* renamed from: X.3bt  reason: invalid class name and case insensitive filesystem */
public class C71303bt implements Runnable {
    public Object A00;
    public final int A01;

    public C71303bt(C47282d0 r2) {
        this.A01 = 15;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0204, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r5 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0207, code lost:
        if (r5 != null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0209, code lost:
        com.whatsapp.util.Log.e("PersistentStore/read-job-error:", r3);
        r5.A00.A01.A0A("jobmanager-job-read-error", false, r3.getMessage());
        r2 = r23.rawQuery("SELECT count(1) from queue", (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022a, code lost:
        if (r2.moveToNext() != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("PersistentStorage/read-jobs-error/numJobs:");
        X.C18270x1.A1F(r1, r2.getInt(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0324, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0325, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0328, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c0, code lost:
        r0.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x049b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x049c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014e, code lost:
        if (r8 != 4) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        if (r9 == r12) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016b, code lost:
        r11 = X.C18320x8.A1Z(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016f, code lost:
        r2 = (org.whispersystems.jobqueue.Job) new java.io.ObjectInputStream(X.AnonymousClass0x9.A0d(r11)).readObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2.A02(r17);
        r6.A04.A00(r6.A00, r2);
        r5.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c0, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c3, code lost:
        if (r4 != null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c5, code lost:
        com.whatsapp.util.Log.e("PersistentStore/read-job-error:", r8);
        r4.A00.A01.A0A("jobmanager-job-read-error", false, r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d8, code lost:
        android.util.Log.w("PersistentStore", r8);
        r6.A00(r17);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0204 A[ExcHandler: SQLiteBlobTooBigException | IllegalStateException (r3v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:76:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x00cb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r2 = r35
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0464;
                case 1: goto L_0x0283;
                case 2: goto L_0x028b;
                case 3: goto L_0x0295;
                case 4: goto L_0x032c;
                case 5: goto L_0x0344;
                case 6: goto L_0x0378;
                case 7: goto L_0x039d;
                case 8: goto L_0x03ba;
                case 9: goto L_0x03c4;
                case 10: goto L_0x03d2;
                case 11: goto L_0x03e0;
                case 12: goto L_0x03e8;
                case 13: goto L_0x047c;
                case 14: goto L_0x048d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r2.A00
            X.2d0 r7 = (X.C47282d0) r7
            X.2xK r6 = r7.A08
            r24 = 0
            java.lang.String r28 = "encrypted = 0"
            java.util.LinkedList r5 = X.AnonymousClass0x9.A18()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.A03     // Catch:{ all -> 0x027c }
            r34 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r34.readLock()     // Catch:{ all -> 0x027c }
            r0.lock()     // Catch:{ all -> 0x027c }
            X.6Cp r0 = r6.A05     // Catch:{ all -> 0x027c }
            android.database.sqlite.SQLiteDatabase r23 = r0.getReadableDatabase()     // Catch:{ all -> 0x027c }
            r22 = 1
            r21 = 0
        L_0x002a:
            java.lang.StringBuilder r0 = X.C18320x8.A0j(r21)     // Catch:{ all -> 0x027c }
            X.C18320x8.A1K(r0)     // Catch:{ all -> 0x027c }
            r1 = 50
            java.lang.String r33 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x027c }
            java.lang.String r26 = "queue"
            java.lang.String r32 = "_id ASC"
            r29 = r24
            r30 = r24
            r31 = r24
            r25 = r23
            r27 = r24
            android.database.Cursor r10 = r25.query(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x027c }
            int r0 = r10.getCount()     // Catch:{ all -> 0x0270 }
            if (r0 != r1) goto L_0x0053
            int r21 = r21 + 50
            goto L_0x0055
        L_0x0053:
            r22 = 0
        L_0x0055:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x01e4
            long r17 = X.C18270x1.A01(r10)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "item"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r10, r0)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "encrypted"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0270 }
            r10.getInt(r0)     // Catch:{ all -> 0x0270 }
            byte[] r14 = r1.getBytes()     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r13 = r14.length     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r13 * 3
            int r12 = r0 / 4
            byte[] r11 = new byte[r12]     // Catch:{ ClassNotFoundException -> 0x0196 }
            int[] r20 = X.C177518g0.A00     // Catch:{ ClassNotFoundException -> 0x0196 }
            r19 = 6
            r4 = 0
            r9 = 0
            r8 = 0
            r3 = 0
        L_0x0081:
            r0 = 2
            r1 = 1
            if (r3 >= r13) goto L_0x0146
            if (r8 != 0) goto L_0x00cd
        L_0x0087:
            int r15 = r3 + 4
            if (r15 > r13) goto L_0x00c9
            byte r2 = r14[r3]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r20[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r4 = r2 << 18
            int r2 = r3 + 1
            byte r2 = r14[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r20[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r2 = r2 << 12
            r4 = r4 | r2
            int r2 = r3 + 2
            byte r2 = r14[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r20[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r2 = r2 << r19
            r4 = r4 | r2
            int r2 = r3 + 3
            byte r2 = r14[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r20[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r4 = r4 | r2
            if (r4 < 0) goto L_0x00c9
            int r3 = r9 + 2
            byte r2 = (byte) r4     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r3] = r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r3 = r9 + 1
            int r2 = r4 >> 8
            byte r2 = (byte) r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r3] = r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r2 = r4 >> 16
            byte r2 = (byte) r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r9 = r9 + 3
            r3 = r15
            goto L_0x0087
        L_0x00c9:
            if (r3 < r13) goto L_0x00cd
            goto L_0x0150
        L_0x00cd:
            int r16 = r3 + 1
            byte r2 = r14[r3]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r20[r2]     // Catch:{ ClassNotFoundException -> 0x0196 }
            r2 = -1
            if (r8 == 0) goto L_0x0132
            if (r8 == r1) goto L_0x012d
            r1 = -2
            if (r8 == r0) goto L_0x011c
            r15 = 5
            r0 = 3
            if (r8 == r0) goto L_0x00f0
            r0 = 4
            if (r8 == r0) goto L_0x00ea
            if (r8 != r15) goto L_0x0142
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x00ea:
            if (r3 == r1) goto L_0x0117
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x00f0:
            if (r3 < 0) goto L_0x0107
            int r0 = r4 << 6
            r3 = r3 | r0
            int r1 = r9 + 2
            byte r0 = (byte) r3     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r1 = r9 + 1
            int r0 = r3 >> 8
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r3 >> 16
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            goto L_0x013e
        L_0x0107:
            if (r3 != r1) goto L_0x0119
            int r1 = r9 + 1
            int r0 = r4 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r4 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r9 = r9 + 2
        L_0x0117:
            r8 = 5
            goto L_0x0142
        L_0x0119:
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x011c:
            if (r3 >= 0) goto L_0x0137
            if (r3 != r1) goto L_0x012a
            int r1 = r9 + 1
            int r0 = r4 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r9 = r1
            r8 = 4
            goto L_0x0142
        L_0x012a:
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x012d:
            if (r3 >= 0) goto L_0x0137
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x0132:
            if (r3 >= 0) goto L_0x013a
            if (r3 == r2) goto L_0x0142
            goto L_0x018f
        L_0x0137:
            int r0 = r4 << 6
            r3 = r3 | r0
        L_0x013a:
            int r8 = r8 + 1
            r4 = r3
            goto L_0x0142
        L_0x013e:
            int r9 = r9 + 3
            r4 = r3
            r8 = 0
        L_0x0142:
            r3 = r16
            goto L_0x0081
        L_0x0146:
            if (r8 == r1) goto L_0x018f
            if (r8 == r0) goto L_0x0162
            r0 = 3
            if (r8 == r0) goto L_0x0153
            r0 = 4
            if (r8 == r0) goto L_0x018f
        L_0x0150:
            if (r9 == r12) goto L_0x016f
            goto L_0x016b
        L_0x0153:
            int r1 = r9 + 1
            int r0 = r4 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r9 = r1 + 1
            int r0 = r4 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            goto L_0x0150
        L_0x0162:
            int r1 = r9 + 1
            int r0 = r4 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r11[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            r9 = r1
            goto L_0x0150
        L_0x016b:
            byte[] r11 = X.C18320x8.A1Z(r11, r9)     // Catch:{ ClassNotFoundException -> 0x0196 }
        L_0x016f:
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r11)     // Catch:{ ClassNotFoundException -> 0x0196 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0196 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0196 }
            java.lang.Object r2 = r0.readObject()     // Catch:{ ClassNotFoundException -> 0x0196 }
            org.whispersystems.jobqueue.Job r2 = (org.whispersystems.jobqueue.Job) r2     // Catch:{ ClassNotFoundException -> 0x0196 }
            r0 = r17
            r2.A02(r0)     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            X.5Lr r1 = r6.A04     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            android.content.Context r0 = r6.A00     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            r1.A00(r0, r2)     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            r5.add(r2)     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            goto L_0x0055
        L_0x018f:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0196 }
        L_0x0196:
            r0 = move-exception
            java.io.StringWriter r2 = X.C18300x5.A0W(r0)     // Catch:{ RuntimeException -> 0x01b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x01b0 }
            X.C18320x8.A1N(r1, r0)     // Catch:{ RuntimeException -> 0x01b0 }
            java.lang.String r0 = "\n"
            X.C18270x1.A1H(r1, r0, r2)     // Catch:{ RuntimeException -> 0x01b0 }
            java.lang.String r0 = r1.toString()     // Catch:{ RuntimeException -> 0x01b0 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ RuntimeException -> 0x01b0 }
            throw r0     // Catch:{ RuntimeException -> 0x01b0 }
        L_0x01b0:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            if (r0 == 0) goto L_0x01bf
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
            throw r0     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
        L_0x01bf:
            throw r1     // Catch:{ IOException -> 0x01c0, SQLiteBlobTooBigException | IllegalStateException -> 0x0204, SQLiteBlobTooBigException | IllegalStateException -> 0x0204 }
        L_0x01c0:
            r8 = move-exception
            X.7Cb r4 = r6.A01     // Catch:{ all -> 0x0270 }
            if (r4 == 0) goto L_0x01d8
            java.lang.String r0 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r8.getMessage()     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = "jobmanager-job-read-error"
            r1 = 0
            X.2gy r0 = r4.A00     // Catch:{ all -> 0x0270 }
            X.2qk r0 = r0.A01     // Catch:{ all -> 0x0270 }
            r0.A0A(r2, r1, r3)     // Catch:{ all -> 0x0270 }
        L_0x01d8:
            java.lang.String r0 = "PersistentStore"
            android.util.Log.w(r0, r8)     // Catch:{ all -> 0x0270 }
            r0 = r17
            r6.A00(r0)     // Catch:{ all -> 0x0270 }
            goto L_0x0055
        L_0x01e4:
            r10.close()     // Catch:{ all -> 0x027c }
            if (r22 != 0) goto L_0x002a
            X.C18310x6.A1S(r34)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PersistentStorage/getJobs-total-read:"
            X.C18260x0.A19(r0, r1, r5)
            java.lang.String r1 = r1.toString()
            X.7Cb r0 = r6.A01
            if (r0 == 0) goto L_0x0200
            com.whatsapp.util.Log.d((java.lang.String) r1)
        L_0x0200:
            X.2nb r2 = r7.A06
            monitor-enter(r2)
            goto L_0x024e
        L_0x0204:
            r3 = move-exception
            X.7Cb r5 = r6.A01     // Catch:{ all -> 0x0270 }
            if (r5 == 0) goto L_0x024d
            java.lang.String r0 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0270 }
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = "jobmanager-job-read-error"
            r1 = 0
            X.2gy r0 = r5.A00     // Catch:{ all -> 0x0270 }
            X.2qk r0 = r0.A01     // Catch:{ all -> 0x0270 }
            r0.A0A(r2, r1, r4)     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = "SELECT count(1) from queue"
            r1 = r23
            r0 = r24
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ all -> 0x0270 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x024a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "PersistentStorage/read-jobs-error/numJobs:"
            r1.append(r0)     // Catch:{ all -> 0x023e }
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x023e }
            X.C18270x1.A1F(r1, r0)     // Catch:{ all -> 0x023e }
            goto L_0x024a
        L_0x023e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0249
            r2.close()     // Catch:{ all -> 0x0245 }
            goto L_0x0249
        L_0x0245:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0270 }
        L_0x0249:
            throw r1     // Catch:{ all -> 0x0270 }
        L_0x024a:
            r2.close()     // Catch:{ all -> 0x0270 }
        L_0x024d:
            throw r3     // Catch:{ all -> 0x0270 }
        L_0x024e:
            java.util.LinkedList r0 = r2.A01     // Catch:{ all -> 0x049d }
            r0.addAll(r5)     // Catch:{ all -> 0x049d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x049d }
        L_0x0257:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0267
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x049d }
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0     // Catch:{ all -> 0x049d }
            r2.A01(r0)     // Catch:{ all -> 0x049d }
            goto L_0x0257
        L_0x0267:
            X.3f6 r0 = r2.A05     // Catch:{ all -> 0x049d }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x049d }
            r0.open()     // Catch:{ all -> 0x049d }
            goto L_0x049b
        L_0x0270:
            r1 = move-exception
            if (r10 == 0) goto L_0x027b
            r10.close()     // Catch:{ all -> 0x0277 }
            goto L_0x027b
        L_0x0277:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x027c }
        L_0x027b:
            throw r1     // Catch:{ all -> 0x027c }
        L_0x027c:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.A03
            X.C18310x6.A1S(r0)
            throw r1
        L_0x0283:
            java.lang.Object r0 = r2.A00
            X.2fU r0 = (X.C48792fU) r0
            X.3Wi r0 = r0.A01
            goto L_0x03c0
        L_0x028b:
            java.lang.Object r1 = r2.A00
            X.5hb r1 = (X.C111135hb) r1
            java.lang.String r0 = "BACKGROUND_APP"
            r1.A05(r0)
            return
        L_0x0295:
            java.lang.Object r0 = r2.A00
            X.3YO r0 = (X.AnonymousClass3YO) r0
            X.8qC r0 = r0.A01
            java.lang.Object r6 = r0.get()
            X.30J r6 = (X.AnonymousClass30J) r6
            X.2oy r1 = r6.A01
            r1.A01()
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[REMOVAL ALL NON SUCCESS] method called"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A01()
            X.0i7 r5 = r1.A00
            monitor-enter(r5)
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[REMOVAL ALL NON SUCCESS] method started"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0329 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0329 }
            int r8 = r5.A01()     // Catch:{ all -> 0x0329 }
            r7 = 0
        L_0x02bf:
            if (r7 >= r8) goto L_0x02eb
            long r2 = r5.A02(r7)     // Catch:{ all -> 0x0329 }
            java.lang.Object r4 = r5.A04(r7)     // Catch:{ all -> 0x0329 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0329 }
            if (r4 == 0) goto L_0x02d4
            int r1 = r4.intValue()     // Catch:{ all -> 0x0329 }
            r0 = 3
            if (r1 == r0) goto L_0x02e8
        L_0x02d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[REMOVAL ALL NON SUCCESS] non success record found "
            r1.append(r0)     // Catch:{ all -> 0x0329 }
            r1.append(r2)     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = " with state: "
            X.C18260x0.A1P(r1, r0, r4)     // Catch:{ all -> 0x0329 }
            X.AnonymousClass0x2.A1Q(r9, r2)     // Catch:{ all -> 0x0329 }
        L_0x02e8:
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02eb:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0329 }
        L_0x02ef:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x02fd
            long r0 = X.C18270x1.A02(r2)     // Catch:{ all -> 0x0329 }
            r5.A08(r0)     // Catch:{ all -> 0x0329 }
            goto L_0x02ef
        L_0x02fd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[REMOVAL ALL NON SUCCESS] state after non success removal: "
            X.C18260x0.A1P(r1, r0, r5)     // Catch:{ all -> 0x0329 }
            monitor-exit(r5)
            X.3dV r0 = r6.A00
            X.4Fq r5 = r0.A04()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0322 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0322 }
            java.lang.String r3 = "status_crossposting"
            java.lang.String r2 = "state <> 3"
            java.lang.String r1 = "XFamilyStatusCrosspostingStore/DELETE_ALL_NON_SUCCESS_RECORDS"
            r0 = 0
            r4.A07(r3, r2, r1, r0)     // Catch:{ all -> 0x0322 }
            r5.close()
            return
        L_0x0322:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0324 }
        L_0x0324:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        L_0x0329:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x032c:
            java.lang.Object r2 = r2.A00
            X.3Cs r2 = (X.C64243Cs) r2
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network disconnected"
            X.C106245Ye.A00(r0)
            java.lang.Runnable r1 = r2.A02
            if (r1 == 0) goto L_0x0474
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener cancelled"
            X.C106245Ye.A00(r0)
            X.4FS r0 = r2.A04
            r0.BjN(r1)
            return
        L_0x0344:
            java.lang.Object r5 = r2.A00
            X.3Cs r5 = (X.C64243Cs) r5
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network connected"
            X.C106245Ye.A00(r0)
            X.2rK r1 = r5.A05
            X.21S r0 = X.AnonymousClass21S.A0I
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0474
            java.lang.String r0 = "CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostStatus started scheduling unsent crosspost statuses"
            X.C106245Ye.A00(r0)
            java.lang.Runnable r1 = r5.A02
            if (r1 == 0) goto L_0x0365
            X.4FS r0 = r5.A04
            r0.BjN(r1)
        L_0x0365:
            X.4FS r4 = r5.A04
            long r2 = X.C64243Cs.A0A
            r0 = 6
            X.3bt r1 = new X.3bt
            r1.<init>(r5, r0)
            java.lang.String r0 = "CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostStatusRunnable"
            java.lang.Runnable r0 = r4.Bkn(r1, r0, r2)
            r5.A02 = r0
            return
        L_0x0378:
            java.lang.Object r1 = r2.A00
            X.3Cs r1 = (X.C64243Cs) r1
            java.lang.String r0 = "CrosspostUnsentStatusManager/sendUnsentCrosspostStatus called"
            X.C106245Ye.A00(r0)
            X.1sk r0 = r1.A01
            X.C18290x4.A1L(r0)
            X.2sH r3 = r1.A03
            X.8qC r4 = r1.A06
            X.8qC r5 = r1.A09
            X.8qC r6 = r1.A07
            X.8qC r7 = r1.A08
            X.1sk r2 = new X.1sk
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A01 = r2
            X.4FS r0 = r1.A04
            X.C18270x1.A0w(r2, r0)
            return
        L_0x039d:
            java.lang.Object r0 = r2.A00
            X.3Cs r0 = (X.C64243Cs) r0
            X.8qC r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.2f8 r0 = (X.C48582f8) r0
            X.66R r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.clear()
            java.lang.String r0 = "CrosspostUnsentStatusManager/onUnlink account unlinked, clean up unsent sessions"
            X.C106245Ye.A00(r0)
            return
        L_0x03ba:
            java.lang.Object r0 = r2.A00
            X.5IE r0 = (X.AnonymousClass5IE) r0
            X.3Wi r0 = r0.A01
        L_0x03c0:
            r0.A0D()
            return
        L_0x03c4:
            java.lang.Object r0 = r2.A00
            X.3Qu r0 = (X.C67823Qu) r0
            r1 = 0
            X.C162457s7.A0J(r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0L
            r0.set(r1)
            return
        L_0x03d2:
            java.lang.Object r1 = r2.A00
            X.2zc r1 = (X.C61042zc) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            int r0 = r1.A00
            X.C61042zc.A00(r1, r0)
            return
        L_0x03e0:
            java.lang.Object r1 = r2.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            r0 = 0
            r1.A0J = r0
            return
        L_0x03e8:
            java.lang.Object r3 = r2.A00
            org.npci.upi.security.pinactivitycomponent.s r3 = (org.npci.upi.security.pinactivitycomponent.s) r3
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x0474
            java.util.ArrayList r4 = r3.A06
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x03f9
            int r1 = r1 + -1
        L_0x03f9:
            java.lang.Object r0 = r4.get(r1)
            boolean r0 = r0 instanceof X.C125126Fq
            if (r0 == 0) goto L_0x0474
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x045d
            boolean r1 = r3.A0A
            int r0 = r3.A00
            if (r1 == 0) goto L_0x0415
            int r0 = r0 + -1
        L_0x0415:
            java.lang.Object r4 = r4.get(r0)
            X.6Fq r4 = (X.C125126Fq) r4
            android.content.Context r0 = r3.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0460
            r4.A01()
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x0460
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r0 = r1.equals(r0)
            r1 = 2131895648(0x7f122560, float:1.9426135E38)
            if (r0 == 0) goto L_0x043c
            r1 = 2131895647(0x7f12255f, float:1.9426133E38)
        L_0x043c:
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r7 = r0.getString(r1)
            X.03q r1 = r3.A0Q()
            r0 = 2131231770(0x7f08041a, float:1.807963E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass0RP.A00(r1, r0)
            r0 = 37
            X.5ei r6 = new X.5ei
            r6.<init>(r4, r0, r2)
            r8 = 0
            r9 = 1
            r10 = r9
            r4.Avx(r5, r6, r7, r8, r9, r10)
            return
        L_0x045d:
            int r0 = r3.A00
            goto L_0x0415
        L_0x0460:
            r3.A1K(r4)
            return
        L_0x0464:
            java.lang.Object r3 = r2.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            r2 = 0
            r1 = 1
            X.4xg r0 = r3.A03
            if (r0 == 0) goto L_0x0475
            r0.A08(r2, r2, r2, r1)
            r3.finish()
        L_0x0474:
            return
        L_0x0475:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x047c:
            X.7TF r1 = new X.7TF
            r1.<init>()
            java.lang.String r0 = "SMS"
            r1.A01 = r0
            java.lang.Object r0 = r2.A00
            org.npci.upi.security.pinactivitycomponent.s r0 = (org.npci.upi.security.pinactivitycomponent.s) r0
            r0.A1J(r1)
            return
        L_0x048d:
            java.lang.Object r0 = r2.A00
            X.2d0 r0 = (X.C47282d0) r0
            X.2nb r2 = r0.A06
            monitor-enter(r2)
            X.3f6 r0 = r2.A05     // Catch:{ all -> 0x049d }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x049d }
            r0.open()     // Catch:{ all -> 0x049d }
        L_0x049b:
            monitor-exit(r2)
            return
        L_0x049d:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71303bt.run():void");
    }

    public C71303bt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
