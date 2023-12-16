package com.whatsapp.migration.android.view;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass317;
import X.AnonymousClass4FM;
import X.AnonymousClass5ZR;
import X.C05550Ty;
import X.C06270Wx;
import X.C104015Ph;
import X.C114945nr;
import X.C18260x0;
import X.C18290x4;
import X.C28841hr;
import X.C29441ip;
import X.C44772Xk;
import X.C54292oU;
import X.C54622p1;
import X.C56502s5;
import X.C625635p;
import android.content.Context;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

public class GoogleMigrateImporterViewModel extends C05550Ty {
    public AnonymousClass08M A00 = AnonymousClass08M.A01();
    public AnonymousClass08M A01 = AnonymousClass08M.A01();
    public AnonymousClass08M A02 = AnonymousClass08M.A01();
    public AnonymousClass08M A03 = AnonymousClass08M.A01();
    public AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final C29441ip A05;
    public final C44772Xk A06;
    public final C54292oU A07;
    public final AnonymousClass5ZR A08;
    public final C625635p A09;
    public final AnonymousClass4FM A0A;
    public final C28841hr A0B;
    public final AnonymousClass317 A0C;
    public final C56502s5 A0D;
    public final C104015Ph A0E;
    public final C54622p1 A0F;

    public void A0C() {
        this.A0B.A07(this.A0A);
    }

    public void A0D() {
        this.A0C.A01();
        A0F(18);
        this.A00.A0G(C18290x4.A0a());
        this.A09.A0B();
        Context context = this.A07.A00;
        C54622p1 r1 = this.A0F;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }

    public void A0E() {
        C56502s5 r3 = this.A0D;
        C104015Ph r2 = this.A0E;
        r3.A06("google_migrate_import_started", (String) null, r2.A00().getString("google_migrate_ios_funnel_id", (String) null), r2.A00().getString("google_migrate_ios_export_duration", (String) null), 0);
        Context context = this.A07.A00;
        C54622p1 r22 = this.A0F;
        Log.i("GoogleMigrateService/startImport()");
        r22.A03(context, AnonymousClass0x9.A09("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT"), GoogleMigrateService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r5.A06.A00() == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(boolean r6) {
        /*
            r5 = this;
            java.lang.String r2 = "google_migrate_confirm_continue_import"
            X.2s5 r1 = r5.A0D
            if (r6 == 0) goto L_0x0053
            java.lang.String r0 = "google_migrate_recoverable_error"
            r1.A03(r0, r2)
            X.08M r1 = r5.A01
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x0025
            int r1 = X.C86604Kt.A05(r1)
            r0 = 6
            if (r1 == r0) goto L_0x0025
            r0 = 9
            if (r1 == r0) goto L_0x0051
            r0 = 11
            if (r1 == r0) goto L_0x004e
            switch(r1) {
                case 13: goto L_0x0042;
                case 14: goto L_0x0045;
                case 15: goto L_0x0048;
                case 16: goto L_0x004b;
                default: goto L_0x0025;
            }
        L_0x0025:
            r4 = 1
        L_0x0026:
            X.2oU r0 = r5.A07
            android.content.Context r3 = r0.A00
            X.2p1 r2 = r5.A0F
            java.lang.String r0 = "GoogleMigrateService/prepareBeforeRetry()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "migration_error_code"
            r1.putExtra(r0, r4)
            java.lang.Class<com.whatsapp.migration.android.integration.service.GoogleMigrateService> r0 = com.whatsapp.migration.android.integration.service.GoogleMigrateService.class
            r2.A03(r3, r1, r0)
            return
        L_0x0042:
            r4 = 104(0x68, float:1.46E-43)
            goto L_0x0026
        L_0x0045:
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x0026
        L_0x0048:
            r4 = 103(0x67, float:1.44E-43)
            goto L_0x0026
        L_0x004b:
            r4 = 102(0x66, float:1.43E-43)
            goto L_0x0026
        L_0x004e:
            r4 = 301(0x12d, float:4.22E-43)
            goto L_0x0026
        L_0x0051:
            r4 = 2
            goto L_0x0026
        L_0x0053:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            r1.A03(r0, r2)
            X.5ZR r0 = r5.A08
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0069
            X.2Xk r0 = r5.A06
            boolean r1 = r0.A00()
            r0 = 3
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            r5.A0F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0H(boolean):void");
    }

    public GoogleMigrateImporterViewModel(C29441ip r4, C44772Xk r5, C54292oU r6, AnonymousClass5ZR r7, C625635p r8, C28841hr r9, AnonymousClass317 r10, C56502s5 r11, C104015Ph r12, C54622p1 r13) {
        C114945nr r0 = new C114945nr(this);
        this.A0A = r0;
        this.A07 = r6;
        this.A0D = r11;
        this.A0F = r13;
        this.A06 = r5;
        this.A08 = r7;
        this.A0C = r10;
        this.A0B = r9;
        this.A0E = r12;
        this.A05 = r4;
        this.A09 = r8;
        r9.A06(r0);
        int A062 = r8.A06();
        if (A062 == 0) {
            Log.i("GoogleMigrateImporterViewModel/onCreate/REQUEST_FOR_PERMISSION state");
            A0F(0);
            return;
        }
        C18260x0.A0y("GoogleMigrateImporterViewModel/onCreate/already has state. Current screen = ", AnonymousClass001.A0o(), A062);
        A0F(A062);
        if (A062 == 2) {
            A0G(2);
        } else if (A062 == 3) {
            C06270Wx.A04(this.A03, r8.A05());
            A0E();
        } else if (A062 == 18) {
            A0D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = java.lang.Integer.valueOf(r11);
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.AnonymousClass75J.A00(r2, r1.A07()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        com.whatsapp.util.Log.i("GoogleMigrateImporterViewModel/currentScreen/post");
        r1.A0G(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(int r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/setCurrentScreen: "
            X.C18260x0.A0y(r0, r1, r11)
            java.lang.String r0 = "google_migrate_recoverable_error"
            java.lang.String r4 = "unknown"
            r5 = 0
            switch(r11) {
                case 0: goto L_0x002a;
                case 1: goto L_0x002d;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                case 4: goto L_0x004d;
                case 5: goto L_0x0030;
                case 6: goto L_0x0033;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                case 9: goto L_0x0033;
                case 10: goto L_0x0038;
                case 11: goto L_0x003b;
                case 12: goto L_0x003e;
                case 13: goto L_0x0041;
                case 14: goto L_0x0044;
                case 15: goto L_0x0047;
                case 16: goto L_0x004a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            X.08M r1 = r10.A01
            java.lang.Object r0 = r1.A07()
            boolean r0 = X.AnonymousClass75J.A00(r2, r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/post"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0G(r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "google_migrate_permission"
            goto L_0x004c
        L_0x002d:
            java.lang.String r0 = "google_migrate_rejected_permission"
            goto L_0x004c
        L_0x0030:
            java.lang.String r0 = "google_migrate_import_complete"
            goto L_0x004c
        L_0x0033:
            java.lang.String r0 = "google_migrate_unrecoverable_error"
            java.lang.String r5 = "generic_unrecoverable"
            goto L_0x004c
        L_0x0038:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            goto L_0x004c
        L_0x003b:
            java.lang.String r5 = "jabber_id_not_found"
            goto L_0x004c
        L_0x003e:
            java.lang.String r5 = "generic_recoverable"
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "encryption_key_mismatch"
            goto L_0x004c
        L_0x0044:
            java.lang.String r5 = "encryption_key_not_found"
            goto L_0x004c
        L_0x0047:
            java.lang.String r5 = "encryption_timed_out"
            goto L_0x004c
        L_0x004a:
            java.lang.String r5 = "encryption_no_connection"
        L_0x004c:
            r4 = r0
        L_0x004d:
            X.5Ph r3 = r10.A0E
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r2 = 0
            java.lang.String r6 = r1.getString(r0, r2)
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r7 = r1.getString(r0, r2)
            X.2s5 r3 = r10.A0D
            r8 = 0
            r3.A06(r4, r5, r6, r7, r8)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0F(int):void");
    }

    public void A0G(Integer num) {
        int i = 2;
        if (num.intValue() != 2) {
            this.A0D.A04("google_migrate_import_complete", "google_migrate_import_complete_next");
            i = 8;
        }
        A0F(i);
        this.A00.A0G(num);
        this.A09.A0B();
        Context context = this.A07.A00;
        C54622p1 r1 = this.A0F;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }
}
