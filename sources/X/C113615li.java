package X;

/* renamed from: X.5li  reason: invalid class name and case insensitive filesystem */
public class C113615li implements AnonymousClass4E8 {
    public final C106125Xs A00;
    public final C64393Dh A01;

    public String BDW() {
        return "MessageIODailyCron";
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQW() {
        /*
            r24 = this;
            r4 = r24
            X.3Dh r3 = r4.A01
            java.io.File r0 = r3.A0B()
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            X.C627536m.A0E(r0, r1)
            java.io.File r0 = r3.A0C()
            X.C627536m.A0E(r0, r1)
            X.2UN r0 = r3.A08()
            java.io.File r0 = r0.A06
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            X.C627536m.A0E(r0, r1)
            X.2UN r0 = r3.A08()
            java.io.File r0 = r0.A07
            X.C627536m.A0E(r0, r1)
            X.5Xs r5 = r4.A00
            X.2jE r0 = r5.A0C
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01df
            X.310 r0 = r5.A03
            r18 = r0
            java.io.File r0 = r18.A04()
            if (r0 == 0) goto L_0x01df
            int r0 = r5.A01()
            r8 = 5
            if (r0 == r8) goto L_0x01df
            r7 = 1
            r4 = 0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r3 = X.AnonymousClass002.A0A(r1, r0)
            java.io.File r9 = r18.A04()
            X.C626936e.A06(r9)
            java.util.concurrent.atomic.AtomicBoolean r12 = r5.A0D
            boolean r0 = r12.compareAndSet(r4, r7)
            if (r0 == 0) goto L_0x01df
            boolean r11 = r18.A0B()     // Catch:{ all -> 0x01da }
            int r1 = r5.A01()     // Catch:{ all -> 0x01da }
            if (r1 == r8) goto L_0x01ce
            X.1iO r0 = r5.A00     // Catch:{ all -> 0x01da }
            boolean r0 = r0.A00     // Catch:{ all -> 0x01da }
            r6 = 0
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "externaldirmigration/in foreground, don't migrate"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01da }
            r5.A03(r6, r8)     // Catch:{ all -> 0x01da }
            goto L_0x008d
        L_0x007c:
            X.5ZR r0 = r5.A08     // Catch:{ all -> 0x01da }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "externaldirmigration/don't migrate, permission denied"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01da }
            r0 = 7
            r5.A03(r6, r0)     // Catch:{ all -> 0x01da }
        L_0x008d:
            r0 = 0
            goto L_0x01cf
        L_0x0090:
            boolean r0 = r3.exists()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x00ae
            if (r1 != 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "externaldirmigration/don't migrate, source directory doesn't exist: from="
            X.C18260x0.A1P(r1, r0, r3)     // Catch:{ all -> 0x01da }
            X.33p r0 = r5.A09     // Catch:{ all -> 0x01da }
            r0.A13(r8)     // Catch:{ all -> 0x01da }
            r5.A03(r6, r7)     // Catch:{ all -> 0x01da }
            r0.A1n(r11)     // Catch:{ all -> 0x01da }
            goto L_0x01ce
        L_0x00ae:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "externaldirmigration/from="
            r2.append(r0)     // Catch:{ all -> 0x01da }
            r2.append(r3)     // Catch:{ all -> 0x01da }
            java.lang.String r0 = " to="
            X.C18260x0.A1P(r2, r0, r9)     // Catch:{ all -> 0x01da }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01da }
            r15 = 3
            if (r1 == 0) goto L_0x00d3
            r0 = 9
            if (r1 >= r15) goto L_0x00cc
            r0 = 8
        L_0x00cc:
            r5.A03(r6, r0)     // Catch:{ all -> 0x01da }
            r0 = 2
            if (r1 <= r0) goto L_0x00f1
            goto L_0x00ea
        L_0x00d3:
            X.33p r2 = r5.A09     // Catch:{ all -> 0x01da }
            r2.A1n(r4)     // Catch:{ all -> 0x01da }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01da }
            android.content.SharedPreferences$Editor r14 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r13 = "ext_dir_migration_start_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r13, r0)     // Catch:{ all -> 0x01da }
            r0.commit()     // Catch:{ all -> 0x01da }
            goto L_0x0111
        L_0x00ea:
            java.util.HashSet r0 = X.C18300x5.A0x(r9)     // Catch:{ all -> 0x01da }
            r5.A04(r9, r10, r0)     // Catch:{ all -> 0x01da }
        L_0x00f1:
            X.33p r2 = r5.A09     // Catch:{ all -> 0x01da }
            r0 = -1
            android.content.SharedPreferences$Editor r14 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r13 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r13, r0)     // Catch:{ all -> 0x01da }
            r0.commit()     // Catch:{ all -> 0x01da }
            r0 = -1
            android.content.SharedPreferences$Editor r14 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r13 = "ext_dir_migration_rescan_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r13, r0)     // Catch:{ all -> 0x01da }
            r0.commit()     // Catch:{ all -> 0x01da }
        L_0x0111:
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r14 = "external_dir_migration_attempt_n"
            long r0 = X.AnonymousClass0x2.A0A(r0, r14)     // Catch:{ all -> 0x01da }
            r16 = 1
            long r0 = r0 + r16
            android.content.SharedPreferences$Editor r13 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01da }
            android.content.SharedPreferences$Editor r0 = r13.putLong(r14, r0)     // Catch:{ all -> 0x01da }
            r0.commit()     // Catch:{ all -> 0x01da }
            r2.A13(r7)     // Catch:{ all -> 0x01da }
            r0 = r18
            X.8qC r0 = r0.A03     // Catch:{ all -> 0x01da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01da }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01da }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01da }
            r14 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x01da }
            r13.<init>(r4)     // Catch:{ all -> 0x01da }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01da }
            android.util.SparseIntArray r1 = new android.util.SparseIntArray     // Catch:{ all -> 0x01da }
            r1.<init>()     // Catch:{ all -> 0x01da }
            r23 = r11 ^ 1
            X.5Ix r0 = new X.5Ix     // Catch:{ all -> 0x01da }
            r0.<init>(r5, r10, r13, r14)     // Catch:{ all -> 0x01da }
            r19 = r1
            r20 = r0
            r21 = r3
            r22 = r9
            r18 = r5
            r18.A02(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "externaldirmigration/error counters = "
            X.C18260x0.A1P(r9, r0, r1)     // Catch:{ all -> 0x01da }
            r2.A13(r15)     // Catch:{ all -> 0x01da }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ all -> 0x01da }
            android.content.SharedPreferences$Editor r14 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r9 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r9, r0)     // Catch:{ all -> 0x01da }
            r0.commit()     // Catch:{ all -> 0x01da }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "externaldirmigration/rescanning files"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01da }
            boolean r18 = r13.get()     // Catch:{ all -> 0x01da }
            r0 = 4
            r2.A13(r0)     // Catch:{ all -> 0x01da }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01da }
            X.33i r1 = r5.A05     // Catch:{ all -> 0x01da }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01da }
            X.C106125Xs.A00(r0, r1, r3)     // Catch:{ all -> 0x01da }
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01da }
            X.C106125Xs.A00(r0, r1, r3)     // Catch:{ all -> 0x01da }
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01da }
            X.C106125Xs.A00(r0, r1, r3)     // Catch:{ all -> 0x01da }
            X.5rZ r1 = new X.5rZ     // Catch:{ all -> 0x01da }
            r17 = r11
            r13 = r1
            r14 = r5
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x01da }
            X.3Dh r0 = r5.A02     // Catch:{ all -> 0x01da }
            r0.A0c(r1, r10)     // Catch:{ all -> 0x01da }
            goto L_0x01ce
        L_0x01b3:
            java.lang.String r0 = "externaldirmigration/nothing to rescan"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01da }
            r2.A13(r8)     // Catch:{ all -> 0x01da }
            r5.A03(r6, r7)     // Catch:{ all -> 0x01da }
            r2.A1n(r11)     // Catch:{ all -> 0x01da }
            boolean r0 = r13.get()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01ce
            X.3DM r1 = r5.A0A     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "ExternalDirMigration"
            r1.A03(r0)     // Catch:{ all -> 0x01da }
        L_0x01ce:
            r0 = 1
        L_0x01cf:
            r12.set(r4)
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = "MessageIODailyCron/onDailyCronNoMessageStore: storage successfully migrated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01da:
            r0 = move-exception
            r12.set(r4)
            throw r0
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113615li.BQW():void");
    }

    public /* synthetic */ void BQX() {
    }

    public C113615li(C106125Xs r1, C64393Dh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
