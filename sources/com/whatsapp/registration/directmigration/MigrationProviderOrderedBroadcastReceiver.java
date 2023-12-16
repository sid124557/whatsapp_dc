package com.whatsapp.registration.directmigration;

import X.AnonymousClass002;
import X.AnonymousClass0XM;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.C105275Ug;
import X.C28861ht;
import X.C48772fR;
import X.C53282mq;
import X.C56972sr;
import X.C66663Mh;
import android.content.BroadcastReceiver;

public class MigrationProviderOrderedBroadcastReceiver extends BroadcastReceiver {
    public C56972sr A00;
    public C66663Mh A01;
    public C105275Ug A02;
    public AnonymousClass0XM A03;
    public AnonymousClass33p A04;
    public C28861ht A05;
    public C53282mq A06;
    public C48772fR A07;
    public AnonymousClass4FS A08;
    public final Object A09;
    public volatile boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (X.AnonymousClass345.A00(r11, "com.whatsapp.w4b") <= 656) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0199, code lost:
        if (r2 != false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r10.A09
            monitor-enter(r1)
            boolean r0 = r10.A0A     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.5bk r0 = X.AnonymousClass2A1.A00(r11)     // Catch:{ all -> 0x0017 }
            r0.ARk(r10)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r10.A0A = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/on-receive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sr r0 = r10.A00
            com.whatsapp.Me r2 = X.C56972sr.A00(r0)
            X.5Ug r0 = r10.A02
            boolean r3 = r0.A05()
            java.lang.String r1 = "com.whatsapp.w4b"
            long r7 = X.AnonymousClass345.A00(r11, r1)
            r5 = 231714000(0xdcfacd0, double:1.14481927E-315)
            r4 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r3 == 0) goto L_0x0040
            if (r0 != 0) goto L_0x0040
            r4 = 0
        L_0x0040:
            r3 = 0
            r5 = 1
            if (r4 == 0) goto L_0x0057
            X.2sr r0 = r10.A00
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0057
            long r8 = X.AnonymousClass345.A00(r11, r1)
            r6 = 656(0x290, double:3.24E-321)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = 1
            if (r0 > 0) goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            android.os.Bundle r4 = X.AnonymousClass002.A08()
            if (r12 == 0) goto L_0x014d
            java.lang.String r0 = r12.getAction()
            if (r0 == 0) goto L_0x014d
            X.1ht r0 = r10.A05
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x014d
            if (r2 == 0) goto L_0x014d
            java.lang.String r0 = "com.whatsapp.registration.directmigration.initialMigrationInfoAction"
            boolean r0 = X.C18280x3.A1V(r12, r0)
            java.lang.String r8 = "phone_number"
            java.lang.String r7 = "me_country_code"
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-initial-migration-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r2.cc
            r4.putString(r7, r0)
            java.lang.String r0 = r2.number
            r4.putString(r8, r0)
            android.os.Bundle r1 = r10.getResultExtras(r5)
            java.lang.String r0 = "database_migration_is_enabled_on_requester_side"
            boolean r5 = r1.getBoolean(r0)
            java.lang.String r0 = "sister_app_content_provider_enabled"
            r4.putBoolean(r0, r6)
            X.5Ug r0 = r10.A02
            boolean r1 = r0.A05()
            java.lang.String r0 = "sister_app_is_auth_protected"
            r4.putBoolean(r0, r1)
            X.33p r0 = r10.A04
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r2 = "privacy_fingerprint_timeout"
            r0 = 60000(0xea60, double:2.9644E-319)
            long r1 = r3.getLong(r2, r0)
            java.lang.String r0 = "sister_app_privacy_auth_timeout"
            r4.putLong(r0, r1)
            if (r5 == 0) goto L_0x00e8
            if (r6 == 0) goto L_0x00e8
            X.3Mh r1 = r10.A01
            X.1Ek r0 = X.C66663Mh.A18
            int r1 = r1.A03(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            r4.putInt(r0, r1)
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-database-migration-action"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2mq r2 = r10.A06
            X.4FS r1 = r2.A04
            X.1so r0 = new X.1so
            r0.<init>(r2)
            X.AnonymousClass0x7.A1B(r0, r1)
            X.4FS r2 = r10.A08
            r1 = 17
            X.3a1 r0 = new X.3a1
            r0.<init>(r10, r1, r11)
            r2.BkM(r0)
        L_0x00e8:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = -1
            r0 = 0
            r10.setResult(r1, r0, r4)
            return
        L_0x00f3:
            if (r6 == 0) goto L_0x014d
            java.lang.String r0 = "com.whatsapp.registration.directmigration.recoveryTokenAction"
            boolean r0 = X.C18280x3.A1V(r12, r0)
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r2 = r10.getResultExtras(r5)
            java.lang.String r7 = r2.getString(r7)
            java.lang.String r6 = r2.getString(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x014d
            X.33p r0 = r10.A04
            java.lang.String r0 = r0.A0Z()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x014d
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x014d
            X.33p r0 = r10.A04
            java.lang.String r0 = r0.A0b()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x014d
            X.5Ug r0 = r10.A02
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "auth"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            if (r0 != 0) goto L_0x0156
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/verifyRequester/invalid auth intent; data="
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x014d:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.setResultCode(r3)
            return
        L_0x0156:
            java.lang.String r2 = r0.getCreatorPackage()
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x014d
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r0 = r11.getPackageName()
            int r0 = r1.checkSignatures(r2, r0)
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r6)
            java.lang.String r1 = X.C386028i.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0197
            byte[] r1 = X.C627236i.A0J(r11, r1)
            if (r1 == 0) goto L_0x0197
            java.lang.String r0 = "key_recovery_token"
            r4.putByteArray(r0, r1)
            r2 = 1
        L_0x0188:
            X.33p r0 = r10.A04
            byte[] r1 = X.AnonymousClass36Q.A06(r11, r0, r6, r5)
            if (r1 == 0) goto L_0x0199
            java.lang.String r0 = "key_backup_token"
            r4.putByteArray(r0, r1)
            goto L_0x00e8
        L_0x0197:
            r2 = 0
            goto L_0x0188
        L_0x0199:
            if (r2 == 0) goto L_0x014d
            goto L_0x00e8
        L_0x019d:
            java.lang.String r0 = "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            boolean r0 = X.C18280x3.A1V(r12, r0)
            if (r0 == 0) goto L_0x014d
            android.os.Bundle r0 = r10.getResultExtras(r5)
            X.33p r2 = r10.A04
            java.lang.String r1 = "migration_state_on_provider_side"
            int r0 = r0.getInt(r1, r3)
            X.C18260x0.A0L(r2, r1, r0)
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public MigrationProviderOrderedBroadcastReceiver(int i) {
        this.A0A = false;
        this.A09 = AnonymousClass002.A0D();
    }

    public MigrationProviderOrderedBroadcastReceiver() {
        this(0);
    }
}
