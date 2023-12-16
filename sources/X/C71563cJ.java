package X;

import com.whatsapp.R;

/* renamed from: X.3cJ  reason: invalid class name and case insensitive filesystem */
public class C71563cJ implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public C71563cJ(AnonymousClass331 r2, int i, int i2) {
        this.A02 = i2;
        if (2 - i2 != 0) {
            this.A01 = r2;
            this.A00 = i;
            return;
        }
        this.A01 = r2;
        this.A00 = 401;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.2oC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: X.2hu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: X.2oC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: X.2oC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: X.2oC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: X.2oC} */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0252, code lost:
        r0.BOF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0255, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d6, code lost:
        X.C06270Wx.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        r2.A0H(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0344, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0345, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043a, code lost:
        r0.A0G(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x043d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0180, code lost:
        r8 = (X.C30471mV) r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ef A[LOOP:2: B:102:0x01e9->B:104:0x01ef, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 1: goto L_0x043e;
                case 2: goto L_0x0058;
                case 3: goto L_0x006e;
                case 4: goto L_0x0091;
                case 5: goto L_0x020f;
                case 6: goto L_0x023d;
                case 7: goto L_0x0246;
                case 8: goto L_0x0256;
                case 9: goto L_0x0260;
                case 10: goto L_0x027a;
                case 11: goto L_0x02b0;
                case 12: goto L_0x02c5;
                case 13: goto L_0x02da;
                case 14: goto L_0x02e9;
                case 15: goto L_0x02f3;
                case 16: goto L_0x0316;
                case 17: goto L_0x0005;
                case 18: goto L_0x0349;
                case 19: goto L_0x0005;
                case 20: goto L_0x0370;
                case 21: goto L_0x0391;
                case 22: goto L_0x039d;
                case 23: goto L_0x0416;
                case 24: goto L_0x0428;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r13.A01
            X.2hu r8 = (X.C50272hu) r8
            int r7 = r13.A00
            monitor-enter(r8)
            java.util.HashMap r0 = r8.A00     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = X.C18290x4.A0j(r0, r7)     // Catch:{ all -> 0x0055 }
            X.5Ip r6 = (X.C102375Ip) r6     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0344
            r8.A01(r6)     // Catch:{ all -> 0x0055 }
            X.2sH r2 = r8.A01     // Catch:{ all -> 0x0055 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0055 }
            r6.A00 = r0     // Catch:{ all -> 0x0055 }
            X.1ZE r4 = r6.A01     // Catch:{ all -> 0x0055 }
            X.2aF r0 = r8.A04     // Catch:{ all -> 0x0055 }
            long r2 = r2.A0H()     // Catch:{ all -> 0x0055 }
            X.2Yw r0 = r0.A02     // Catch:{ all -> 0x0055 }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "session_start_timestamp"
            long r0 = X.AnonymousClass0x2.A0A(r1, r0)     // Catch:{ all -> 0x0055 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x0055 }
            r4.A01 = r0     // Catch:{ all -> 0x0055 }
            X.4FS r5 = r8.A05     // Catch:{ all -> 0x0055 }
            X.66R r0 = r8.A06     // Catch:{ all -> 0x0055 }
            long r2 = X.C18290x4.A0D(r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "TimeSpentExternalEventLogger/logExternalEvent"
            r1 = 17
            X.3cJ r0 = new X.3cJ     // Catch:{ all -> 0x0055 }
            r0.<init>((java.lang.Object) r8, (int) r7, (int) r1)     // Catch:{ all -> 0x0055 }
            java.lang.Runnable r0 = r5.Bkn(r0, r4, r2)     // Catch:{ all -> 0x0055 }
            r6.A02 = r0     // Catch:{ all -> 0x0055 }
            goto L_0x0344
        L_0x0055:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0058:
            java.lang.Object r3 = r13.A01
            X.331 r3 = (X.AnonymousClass331) r3
            X.4uZ r2 = r3.A0G
            r1 = 401(0x191, float:5.62E-43)
            r3.A02(r2)
            X.2s0 r0 = r3.A0I
            r0.A00(r2, r1)
            X.3Wi r2 = r3.A05
            r1 = 2131889330(0x7f120cb2, float:1.941332E38)
            goto L_0x008c
        L_0x006e:
            java.lang.Object r3 = r13.A01
            X.331 r3 = (X.AnonymousClass331) r3
            int r2 = r13.A00
            X.4uZ r1 = r3.A0G
            r3.A02(r1)
            X.2s0 r0 = r3.A0I
            r0.A00(r1, r2)
            X.3Wi r2 = r3.A05
            boolean r0 = X.C627336j.A0K(r1)
            r1 = 2131889331(0x7f120cb3, float:1.9413323E38)
            if (r0 == 0) goto L_0x008c
            r1 = 2131889328(0x7f120cb0, float:1.9413316E38)
        L_0x008c:
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0091:
            java.lang.Object r5 = r13.A01
            X.2UP r5 = (X.AnonymousClass2UP) r5
            int r6 = r13.A00
            X.2ny r4 = r5.A0O
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A09
            r0 = 0
            r9 = 1
            boolean r0 = r1.compareAndSet(r0, r9)
            if (r0 == 0) goto L_0x0102
            X.2fo r2 = r4.A03
            r8 = 100
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MmsThumbnailMetadataMessageStore/getMmsThumbnailMetadataToRetry/maxRequested: "
            X.C18260x0.A0w(r0, r1, r8)
            X.3dV r0 = r2.A01
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ed }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE transferred = 0 AND direct_path IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL  ORDER BY message_row_id DESC  LIMIT ? "
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x00ed }
            X.C18270x1.A1O(r1, r8)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "GET_MMS_THUMBNAIL_METADATA_TO_RETRY"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00ed }
            java.util.LinkedList r2 = X.AnonymousClass0x9.A18()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "message_row_id"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00d3:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00dd
            X.C18260x0.A0H(r3, r2, r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d3
        L_0x00dd:
            r3.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00f2
        L_0x00e1:
            r1 = move-exception
            if (r3 == 0) goto L_0x00ec
            r3.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x020a }
            throw r1
        L_0x00f2:
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r7)
            java.lang.String r0 = "ThumbnailAutoDownload/retryThumbnailAutoDownloads num messages to retry:"
            X.C18260x0.A1A(r0, r1, r2)
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            r4.A00(r2, r0)
        L_0x0102:
            if (r6 == 0) goto L_0x0459
            X.319 r6 = r5.A0G
            X.2sH r0 = r5.A09
            long r0 = X.C56612sH.A01(r0)
            r7 = 32
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaMessageStore/getRetryAutodownloadMessages from:"
            X.C18260x0.A10(r2, r3, r0)
            r11 = 0
            X.33M r3 = new X.33M
            r3.<init>((boolean) r11)
            java.lang.String r2 = "msgstore/getRetryAutodownloadMessages"
            r3.A0A(r2)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.2rr r4 = r6.A0B
            X.3dV r4 = r4.A04
            X.4GK r10 = r4.get()
            r4 = r10
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x0205 }
            X.2sg r9 = r4.A03     // Catch:{ all -> 0x0205 }
            java.lang.String r8 = "SELECT sort_id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0205 }
            X.C18280x3.A1R(r4, r11, r0)     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = "GET_SORT_ID_BY_TIMESTAMP"
            android.database.Cursor r4 = r9.A0E(r8, r0, r4)     // Catch:{ all -> 0x0205 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "sort_id"
            long r0 = X.AnonymousClass0x2.A0C(r4, r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x0153
        L_0x0151:
            r0 = 0
        L_0x0153:
            r4.close()     // Catch:{ all -> 0x0205 }
            r10.close()
            r4 = 1
            X.4GK r12 = X.AnonymousClass319.A00(r6)     // Catch:{ IllegalStateException -> 0x01bf, SQLiteDatabaseCorruptException -> 0x01c7, SQLiteDiskIOException -> 0x01b8 }
            r8 = r12
            X.3H0 r8 = (X.AnonymousClass3H0) r8     // Catch:{ all -> 0x01ae }
            X.2sg r10 = r8.A03     // Catch:{ all -> 0x01ae }
            java.lang.String r9 = X.AnonymousClass2CE.A0I     // Catch:{ all -> 0x01ae }
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ all -> 0x01ae }
            X.C18280x3.A1R(r8, r11, r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "GET_NOT_DOWNLOADED_MEDIA_MESSAGES_SQL"
            android.database.Cursor r9 = r10.A0E(r9, r0, r8)     // Catch:{ all -> 0x01ae }
        L_0x0170:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x019b
            X.2qz r0 = r6.A0F     // Catch:{ all -> 0x01a2 }
            X.34x r8 = r0.A03(r9)     // Catch:{ all -> 0x01a2 }
            boolean r0 = r8 instanceof X.C30471mV     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x0195
            X.1mV r8 = (X.C30471mV) r8     // Catch:{ all -> 0x01a2 }
            X.33C r1 = r8.A01     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x0195
            boolean r0 = r1.A0R     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r1.A0c     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r1.A0M     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x0195
            r2.add(r8)     // Catch:{ all -> 0x01a2 }
        L_0x0195:
            int r0 = r2.size()     // Catch:{ all -> 0x01a2 }
            if (r0 < r7) goto L_0x0170
        L_0x019b:
            r9.close()     // Catch:{ all -> 0x01ae }
            r12.close()     // Catch:{ IllegalStateException -> 0x01bf, SQLiteDatabaseCorruptException -> 0x01c7, SQLiteDiskIOException -> 0x01b8 }
            goto L_0x01d0
        L_0x01a2:
            r1 = move-exception
            if (r9 == 0) goto L_0x01ad
            r9.close()     // Catch:{ all -> 0x01a9 }
            goto L_0x01ad
        L_0x01a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ae }
        L_0x01ad:
            throw r1     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x01b3 }
            goto L_0x01b7
        L_0x01b3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x01bf, SQLiteDatabaseCorruptException -> 0x01c7, SQLiteDiskIOException -> 0x01b8 }
        L_0x01b7:
            throw r1     // Catch:{ IllegalStateException -> 0x01bf, SQLiteDatabaseCorruptException -> 0x01c7, SQLiteDiskIOException -> 0x01b8 }
        L_0x01b8:
            r1 = move-exception
            X.1hj r0 = r6.A08
            r0.A08(r4)
            throw r1
        L_0x01bf:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x01d0
        L_0x01c7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r6.A09
            r0.A04()
        L_0x01d0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages "
            X.C18260x0.A19(r0, r1, r2)
            java.lang.String r0 = " | time spent:"
            X.AnonymousClass33M.A05(r3, r0, r1)
            X.1ip r0 = r5.A07
            int r3 = r0.A08(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x01e9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0459
            X.1mV r1 = X.C18320x8.A0S(r2)
            X.3XH r0 = r5.A0M
            r0.A02(r1, r3, r4)
            goto L_0x01e9
        L_0x01f9:
            r1 = move-exception
            if (r4 == 0) goto L_0x0204
            r4.close()     // Catch:{ all -> 0x0200 }
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0205 }
        L_0x0204:
            throw r1     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x020a }
            throw r1
        L_0x020a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x020f:
            java.lang.Object r3 = r13.A01
            X.68l r3 = (X.C1234468l) r3
            int r2 = r13.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ptvcameraui/error "
            X.C18260x0.A0z(r0, r1, r2)
            r0 = 4
            if (r2 != r0) goto L_0x022f
            java.lang.Object r0 = r3.A00
            X.5a4 r0 = (X.C106735a4) r0
            X.3Wi r2 = r0.A0V
            r1 = 2131895021(0x7f1222ed, float:1.9424863E38)
            r0 = 1
            r2.A0H(r1, r0)
        L_0x022f:
            java.lang.Object r1 = r3.A00
            X.5a4 r1 = (X.C106735a4) r1
            r0 = 0
            r1.A0B(r0, r0)
            X.8sw r0 = r1.A0Y
            r0.BOE()
            return
        L_0x023d:
            java.lang.Object r0 = r13.A01
            X.6EW r0 = (X.AnonymousClass6EW) r0
            int r1 = r13.A00
            X.4Eb r0 = r0.A09
            goto L_0x0252
        L_0x0246:
            java.lang.Object r0 = r13.A01
            X.68l r0 = (X.C1234468l) r0
            int r1 = r13.A00
            java.lang.Object r0 = r0.A00
            com.whatsapp.qrcode.QrScannerViewV2 r0 = (com.whatsapp.qrcode.QrScannerViewV2) r0
            X.4Eb r0 = r0.A05
        L_0x0252:
            r0.BOF(r1)
            return
        L_0x0256:
            java.lang.Object r1 = r13.A01
            X.4DZ r1 = (X.AnonymousClass4DZ) r1
            int r0 = r13.A00
            r1.onError(r0)
            return
        L_0x0260:
            java.lang.Object r4 = r13.A01
            com.whatsapp.registration.report.BanReportViewModel r4 = (com.whatsapp.registration.report.BanReportViewModel) r4
            int r3 = r13.A00
            r0 = 5
            if (r3 <= r0) goto L_0x026d
            X.08M r1 = r4.A02
            r0 = 1
            goto L_0x02d6
        L_0x026d:
            X.4FS r2 = r4.A08
            r1 = 10
            X.3cJ r0 = new X.3cJ
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x027a:
            java.lang.Object r3 = r13.A01
            com.whatsapp.registration.report.BanReportViewModel r3 = (com.whatsapp.registration.report.BanReportViewModel) r3
            int r2 = r13.A00
            X.5Fk r0 = r3.A04
            java.lang.String r10 = r3.A00
            X.5sw r1 = r0.A00
            X.3Db r0 = r1.A02
            X.2s4 r5 = X.C64333Db.A07(r0)
            X.33p r6 = X.C64333Db.A2s(r0)
            X.8qC r9 = X.C64333Db.A9V(r0)
            X.3FI r8 = X.C64333Db.A8x(r0)
            X.1VX r7 = X.C64333Db.A4B(r0)
            X.4aw r0 = r1.A03
            X.4C1 r11 = r0.A1r
            X.4C1 r12 = r0.A0H
            X.1q6 r4 = new X.1q6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.3Oi r0 = new X.3Oi
            r0.<init>(r3, r2)
            r4.Bh4(r0)
            return
        L_0x02b0:
            java.lang.Object r0 = r13.A01
            X.3T6 r0 = (X.AnonymousClass3T6) r0
            X.5Gj r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.2qI r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x0459
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r2)
            return
        L_0x02c5:
            java.lang.Object r0 = r13.A01
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            X.5Gi r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.08M r1 = r2.A01
            r0 = 2
            X.C06270Wx.A03(r1, r0)
            X.08M r1 = r2.A02
            r0 = 0
        L_0x02d6:
            X.C06270Wx.A03(r1, r0)
            return
        L_0x02da:
            java.lang.Object r2 = r13.A01
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            int r1 = r13.A00
            com.whatsapp.WaImageButton r0 = r2.A0V
            r0.setVisibility(r1)
            r2.A0C()
            return
        L_0x02e9:
            java.lang.Object r1 = r13.A01
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            int r0 = r13.A00
            X.C71563cJ.super.setTextSize(0, (float) r0)
            return
        L_0x02f3:
            java.lang.Object r1 = r13.A01
            X.52T r1 = (X.AnonymousClass52T) r1
            int r7 = r13.A00
            android.widget.TextView r0 = r1.A05
            android.content.Context r6 = r0.getContext()
            X.33i r5 = r1.A06
            X.33j r4 = r1.A07
            r3 = 2131755370(0x7f10016a, float:1.9141617E38)
            long r1 = (long) r7
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.C18270x1.A1Q(r0, r7)
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            X.C107295b4.A00(r6, r5, r0)
            return
        L_0x0316:
            java.lang.Object r8 = r13.A01
            X.2oC r8 = (X.C54112oC) r8
            int r7 = r13.A00
            monitor-enter(r8)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0346 }
            long r5 = X.C18290x4.A0B(r0)     // Catch:{ all -> 0x0346 }
            long r3 = r8.A03     // Catch:{ all -> 0x0346 }
            long r1 = r5 - r3
            boolean r0 = r8.A06     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x0332
            r8.A01(r5)     // Catch:{ all -> 0x0346 }
            r1 = 0
        L_0x0332:
            if (r7 != 0) goto L_0x0339
            int r0 = (int) r1     // Catch:{ all -> 0x0346 }
            r8.A01 = r0     // Catch:{ all -> 0x0346 }
            r0 = 1
            goto L_0x0342
        L_0x0339:
            boolean r0 = r8.A05     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0344
            int r0 = (int) r1     // Catch:{ all -> 0x0346 }
            r8.A00(r0)     // Catch:{ all -> 0x0346 }
            r0 = 0
        L_0x0342:
            r8.A05 = r0     // Catch:{ all -> 0x0346 }
        L_0x0344:
            monitor-exit(r8)
            return
        L_0x0346:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0349:
            java.lang.Object r4 = r13.A01
            X.2hu r4 = (X.C50272hu) r4
            int r0 = r13.A00
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x036d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x036d }
            X.5Ip r0 = (X.C102375Ip) r0     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x036b
            r4.A01(r0)     // Catch:{ all -> 0x036d }
            X.4FS r1 = r4.A05     // Catch:{ all -> 0x036d }
            java.lang.Runnable r0 = r0.A02     // Catch:{ all -> 0x036d }
            r1.BjN(r0)     // Catch:{ all -> 0x036d }
            r3.remove(r2)     // Catch:{ all -> 0x036d }
        L_0x036b:
            monitor-exit(r4)
            return
        L_0x036d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0370:
            java.lang.Object r3 = r13.A01
            X.4ea r3 = (X.C89654ea) r3
            int r1 = r13.A00
            r3.BjL()
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x038a
            r2 = 2131894499(0x7f1220e3, float:1.9423804E38)
            r1 = 2131894498(0x7f1220e2, float:1.9423802E38)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.Box(r0, r2, r1)
            return
        L_0x038a:
            r0 = 2131894527(0x7f1220ff, float:1.9423861E38)
            r3.Bot(r0)
            return
        L_0x0391:
            java.lang.Object r0 = r13.A01
            X.5ZT r0 = (X.AnonymousClass5ZT) r0
            int r1 = r13.A00
            X.03q r0 = r0.A0a
            X.C621433s.A01(r0, r1)
            return
        L_0x039d:
            java.lang.Object r6 = r13.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r6 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r6
            int r1 = r13.A00
            androidx.recyclerview.widget.RecyclerView r0 = r6.A0G
            X.0Ua r2 = r0.A0F(r1)
            if (r2 == 0) goto L_0x0459
            android.content.Context r0 = r6.A1D()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165535(0x7f07015f, float:1.794529E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            android.view.View r7 = r2.A0H
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            r8 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r2, r0)
            androidx.core.widget.NestedScrollView r0 = r6.A0F
            r0.requestChildRectangleOnScreen(r7, r1, r8)
            int r1 = r6.A06
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            X.AnonymousClass0YY.A04(r0, r7)
            r5 = 255(0xff, float:3.57E-43)
            android.graphics.drawable.Drawable r4 = r7.getBackground()
            r3 = 1
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r3]
            r0 = 2
            int[] r1 = new int[r0]
            r1[r8] = r5
            r1[r3] = r8
            java.lang.String r0 = "alpha"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r0, r1)
            r2[r8] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r2)
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            r2.setTarget(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.setDuration(r0)
            r2.start()
            X.5Uk r1 = r6.A0N
            if (r1 == 0) goto L_0x0459
            boolean r0 = r1.A08()
            if (r0 != 0) goto L_0x0459
            r0 = 3
            r1.A03(r0)
            r1.A06 = r3
            return
        L_0x0416:
            java.lang.Object r1 = r13.A01
            X.2fU r1 = (X.C48792fU) r1
            int r3 = r13.A00
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0459
            X.3Wi r0 = r1.A01
            goto L_0x043a
        L_0x0428:
            java.lang.Object r1 = r13.A01
            X.5IE r1 = (X.AnonymousClass5IE) r1
            r3 = 2131895954(0x7f122692, float:1.9426756E38)
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0459
            X.3Wi r0 = r1.A01
        L_0x043a:
            r0.A0G(r2, r3)
            return
        L_0x043e:
            java.lang.Object r3 = r13.A01
            X.3S8 r3 = (X.AnonymousClass3S8) r3
            int r2 = r13.A00
            X.2qV r0 = r3.A06
            X.66R r0 = r0.A06
            java.util.Map r0 = X.AnonymousClass0x7.A10(r0)
            java.lang.Object r1 = X.AnonymousClass001.A0i(r0, r2)
            X.2yC r1 = (X.C60222yC) r1
            if (r1 == 0) goto L_0x045a
            r0 = 170(0xaa, float:2.38E-43)
            r3.A01(r1, r0)
        L_0x0459:
            return
        L_0x045a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "usernoticecmsmanager/executebadgeselected not found notice in cmscontentmanager noticeid = "
            X.C18260x0.A0x(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71563cJ.run():void");
    }

    public C71563cJ(AnonymousClass5IE r2) {
        this.A02 = 24;
        this.A01 = r2;
        this.A00 = R.string.f11nameremoved;
    }

    public C71563cJ(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }
}
