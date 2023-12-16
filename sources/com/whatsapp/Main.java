package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0N6;
import X.AnonymousClass0RZ;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1FB;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass27N;
import X.AnonymousClass2OF;
import X.AnonymousClass2XL;
import X.AnonymousClass33p;
import X.AnonymousClass3A3;
import X.AnonymousClass3Au;
import X.AnonymousClass3DZ;
import X.AnonymousClass4AF;
import X.AnonymousClass4HY;
import X.AnonymousClass5V0;
import X.AnonymousClass5XC;
import X.AnonymousClass5XU;
import X.C05680Um;
import X.C107695bk;
import X.C116985rC;
import X.C117645sG;
import X.C1222863u;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C19340zH;
import X.C33691tX;
import X.C50422i9;
import X.C52282lE;
import X.C54292oU;
import X.C54412og;
import X.C56612sH;
import X.C56972sr;
import X.C58422vE;
import X.C614930z;
import X.C621433s;
import X.C627736r;
import X.C64333Db;
import X.C71593cM;
import X.C72303dV;
import X.C72343dZ;
import X.C88744aj;
import X.C95814uZ;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.net.URISyntaxException;

public class Main extends AnonymousClass1FB implements C1222863u {
    public C116985rC A00;
    public C33691tX A01;
    public AnonymousClass5XU A02;
    public C614930z A03;
    public C52282lE A04;
    public C72303dV A05;
    public AnonymousClass2OF A06;
    public WhatsAppLibLoader A07;
    public C183538qC A08;
    public C183538qC A09;
    public C183538qC A0A;
    public C183538qC A0B;
    public C183538qC A0C;
    public C183538qC A0D;
    public C183538qC A0E;
    public C183538qC A0F;
    public C183538qC A0G;
    public C183538qC A0H;
    public C183538qC A0I;
    public boolean A0J;
    public boolean A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        if (isFinishing() != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e0, code lost:
        if (X.AnonymousClass1Hf.A27(r12).getBoolean("support_ban_appeal_screen_before_verification", false) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e2, code lost:
        r4 = X.C18320x8.A07();
        r4.setClassName(getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        r4.putExtra("launch_source", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f7, code lost:
        r4 = A79(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0110, code lost:
        if (X.AnonymousClass1FB.A1h(r12) != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0112, code lost:
        ((X.AnonymousClass317) r12.A0E.get()).A0B(4, true);
        r4 = A79(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0125, code lost:
        ((X.AnonymousClass317) r12.A0E.get()).A0B(1, true);
        r4 = X.C627736r.A04(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        ((X.AnonymousClass317) r12.A0E.get()).A0B(0, true);
        r4 = X.C18320x8.A07();
        r4.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
        r4.putExtra("show_registration_first_dlg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r12.A0J == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A75() {
        /*
            r12 = this;
            r6 = r12
            X.2sr r0 = r12.A01
            com.whatsapp.Me r0 = X.C56972sr.A00(r0)
            if (r0 != 0) goto L_0x0214
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L_0x0062
            X.2jE r0 = r12.A09
            int r3 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Main/messageStoreVerified/registration state is "
            X.C18260x0.A0y(r0, r1, r3)
            r5 = 0
            switch(r3) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0033;
                case 2: goto L_0x0084;
                case 3: goto L_0x0022;
                case 4: goto L_0x0112;
                case 5: goto L_0x0033;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00a7;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00e2;
                case 11: goto L_0x00fd;
                case 12: goto L_0x010c;
                case 13: goto L_0x00f7;
                case 14: goto L_0x0137;
                case 15: goto L_0x0156;
                case 16: goto L_0x017c;
                case 17: goto L_0x00f7;
                case 18: goto L_0x00bb;
                case 19: goto L_0x00f7;
                case 20: goto L_0x0125;
                case 21: goto L_0x0186;
                case 22: goto L_0x01f4;
                case 23: goto L_0x010c;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "main/invalid/registration state="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; default to EULA"
            X.C18260x0.A1K(r1, r0)
        L_0x0033:
            X.8qC r0 = r12.A0E
            java.lang.Object r1 = r0.get()
            X.317 r1 = (X.AnonymousClass317) r1
            r0 = 1
            r1.A0B(r5, r0)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "show_registration_first_dlg"
            r4.putExtra(r0, r5)
        L_0x0052:
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x005f
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L_0x005f
            r12.startActivity(r4)
        L_0x005f:
            r12.finish()
        L_0x0062:
            java.lang.String r0 = "main/me App.me is null, can't proceed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0067:
            return
        L_0x0068:
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "show_registration_first_dlg"
            boolean r2 = r0.getBooleanExtra(r3, r5)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r4.setClassName(r1, r0)
            r4.putExtra(r3, r2)
            goto L_0x0052
        L_0x0084:
            java.lang.String r0 = "main/no-me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r12.A0B
            java.lang.Object r2 = r0.get()
            X.2s5 r2 = (X.C56502s5) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterName"
            r4.setClassName(r1, r0)
            goto L_0x0052
        L_0x00a7:
            java.lang.String r0 = "main/messageStoreVerified/registration-state-is-registration-flash-primary"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0112
        L_0x00ad:
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r4.setClassName(r1, r0)
            goto L_0x0052
        L_0x00bb:
            X.8qC r0 = r12.A0B
            java.lang.Object r2 = r0.get()
            X.2s5 r2 = (X.C56502s5) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            boolean r0 = X.AnonymousClass1FB.A1h(r12)
            android.content.Intent r4 = X.C627736r.A1D(r12, r0)
            goto L_0x0052
        L_0x00d5:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r12)
            java.lang.String r0 = "support_ban_appeal_screen_before_verification"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x00f7
        L_0x00e2:
            r2 = 1
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.userban.ui.BanAppealActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "launch_source"
            r4.putExtra(r0, r2)
            goto L_0x0052
        L_0x00f7:
            android.content.Intent r4 = r12.A79(r3)
            goto L_0x0052
        L_0x00fd:
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity"
            r4.setClassName(r1, r0)
            goto L_0x0052
        L_0x010c:
            boolean r0 = X.AnonymousClass1FB.A1h(r12)
            if (r0 == 0) goto L_0x0125
        L_0x0112:
            X.8qC r0 = r12.A0E
            java.lang.Object r2 = r0.get()
            X.317 r2 = (X.AnonymousClass317) r2
            r1 = 4
            r0 = 1
            r2.A0B(r1, r0)
            android.content.Intent r4 = r12.A79(r3)
            goto L_0x0052
        L_0x0125:
            X.8qC r0 = r12.A0E
            java.lang.Object r1 = r0.get()
            X.317 r1 = (X.AnonymousClass317) r1
            r0 = 1
            r1.A0B(r0, r0)
            android.content.Intent r4 = X.C627736r.A04(r12)
            goto L_0x0052
        L_0x0137:
            boolean r3 = X.AnonymousClass1FB.A1h(r12)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "change_number"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "use_sms_retriever"
            r4.putExtra(r0, r5)
            goto L_0x0052
        L_0x0156:
            boolean r2 = X.AnonymousClass1FB.A1h(r12)
            r1 = 1
            android.content.Intent r4 = X.C18280x3.A0A(r12)
            java.lang.String r0 = "changenumber"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "use_sms_retriever"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "wa_old_eligible"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "code_verification_mode"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "EXTRA_IS_APP_RESTARTED"
            r4.putExtra(r0, r1)
            goto L_0x0052
        L_0x017c:
            boolean r0 = X.AnonymousClass1FB.A1h(r12)
            android.content.Intent r4 = X.C627736r.A1C(r12, r0)
            goto L_0x0052
        L_0x0186:
            X.8qC r0 = r12.A0H
            java.lang.Object r0 = r0.get()
            X.32N r0 = (X.AnonymousClass32N) r0
            X.C626936e.A06(r0)
            r9 = 21
            r7 = 0
            r10 = -1
            r11 = 1
            r8 = r7
            android.content.Intent r4 = X.AnonymousClass32N.A00(r6, r7, r8, r9, r10, r11)
            X.2XB r0 = r0.A05
            java.lang.String r3 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WfacManager/startWfacLogging for main with ban state "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            X.AnonymousClass356.A01(r0)
            int r0 = r3.hashCode()
            java.lang.String r2 = "An operation is not implemented: "
            java.lang.String r1 = "ban action wam logger"
            switch(r0) {
                case -358171056: goto L_0x01e2;
                case 191367207: goto L_0x01df;
                case 272787191: goto L_0x01cd;
                case 1951953694: goto L_0x01bb;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x0052
        L_0x01bb:
            java.lang.String r0 = "BANNED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = X.AnonymousClass000.A0T(r2, r1)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            java.lang.String r0 = "UNBANNED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = X.AnonymousClass000.A0T(r2, r1)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x01df:
            java.lang.String r0 = "CHECKPOINTED"
            goto L_0x01e4
        L_0x01e2:
            java.lang.String r0 = "UNKNOWN_IN_CLIENT"
        L_0x01e4:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = X.AnonymousClass000.A0T(r2, r1)
            X.23S r0 = new X.23S
            r0.<init>(r1)
            throw r0
        L_0x01f4:
            r5 = 0
            boolean r3 = X.AnonymousClass1FB.A1h(r12)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.SendSmsToWa"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "sendSmsNumber"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "changeNumber"
            r4.putExtra(r0, r3)
            goto L_0x0052
        L_0x0214:
            X.2jE r0 = r12.A09
            int r1 = r0.A00()
            r0 = 2
            if (r1 != r0) goto L_0x0250
            java.lang.String r0 = "main/me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r12.A0B
            java.lang.Object r2 = r0.get()
            X.2s5 r2 = (X.C56502s5) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterName"
            r2.setClassName(r1, r0)
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x024c
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L_0x024c
            r12.startActivity(r2)
        L_0x024c:
            r12.finish()
            return
        L_0x0250:
            r2 = 3
            X.2jE r0 = r12.A09
            int r0 = r0.A00()
            if (r0 == r2) goto L_0x0265
            X.8qC r0 = r12.A0E
            java.lang.Object r1 = r0.get()
            X.317 r1 = (X.AnonymousClass317) r1
            r0 = 1
            r1.A0B(r2, r0)
        L_0x0265:
            java.lang.String r0 = "main/verified/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2OF r0 = r12.A06
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x029a
            X.1tX r0 = r12.A01
            if (r0 == 0) goto L_0x028a
            int r1 = r0.A06()
            r0 = 1
            if (r1 != r0) goto L_0x028a
            java.lang.String r0 = "main/show dialog sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x0067
            r0 = 104(0x68, float:1.46E-43)
            X.C621433s.A01(r12, r0)
            return
        L_0x028a:
            X.1tX r2 = new X.1tX
            r2.<init>(r12)
            r12.A01 = r2
            X.4FS r1 = r12.A04
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.BkO(r2, r0)
            return
        L_0x029a:
            java.lang.String r0 = "main/messageStoreVerified/gotoActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "main/gotoActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12.A7A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.A75():void");
    }

    public void onStart() {
        super.onStart();
        this.A0J = true;
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r2 = A002.A00;
            AnonymousClass1Ha.A23(A002, r2, r2, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = r2.ALf();
            this.A0F = C72343dZ.A00(A002.AZG);
            this.A02 = (AnonymousClass5XU) A002.AU0.get();
            this.A09 = C72343dZ.A00(A002.A1u);
            this.A0I = C72343dZ.A00(A002.AbY);
            this.A03 = C64333Db.A0E(A002);
            this.A0D = C72343dZ.A00(A002.AQi);
            this.A0C = C72343dZ.A00(A002.AGL);
            this.A06 = (AnonymousClass2OF) A002.AGr.get();
            this.A0G = C72343dZ.A00(A002.Aak);
            this.A07 = (WhatsAppLibLoader) A002.AbT.get();
            this.A0A = C72343dZ.A00(A002.A4i);
            this.A05 = (C72303dV) A002.AMC.get();
            this.A0E = C72343dZ.A00(A002.ATf);
            this.A04 = (C52282lE) A002.A5z.get();
            this.A0B = C72343dZ.A00(r2.A5N);
            this.A00 = C88744aj.A00;
            this.A08 = C72343dZ.A00(A002.A0U);
            this.A0H = C72343dZ.A00(A002.AbO);
        }
    }

    public final Intent A79(int i) {
        int i2;
        if (i == 13) {
            i2 = 1;
        } else {
            i2 = 0;
            if (i == 9) {
                i2 = 3;
            }
        }
        boolean A1h = AnonymousClass1FB.A1h(this);
        Intent A0A2 = C18280x3.A0A(this);
        A0A2.putExtra("changenumber", A1h);
        A0A2.putExtra("use_sms_retriever", false);
        A0A2.putExtra("wa_old_eligible", 0);
        A0A2.putExtra("code_verification_mode", i2);
        A0A2.putExtra("EXTRA_IS_APP_RESTARTED", true);
        return A0A2;
    }

    public final void A7B(Me me) {
        if (me == null || C72303dV.A00(this.A05)) {
            this.A0J = true;
            A75();
        } else if (this.A01.Ayl()) {
            int A0B2 = AnonymousClass0x7.A0N((AnonymousClass0N6) this.A09.get()).A0B();
            C18260x0.A0y("main/create/backupfilesfound ", AnonymousClass001.A0o(), A0B2);
            if (A0B2 > 0) {
                C621433s.A01(this, 105);
            } else {
                A78(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Intent A072;
        String stringExtra;
        AnonymousClass0RZ.A01("Main/onCreate");
        this.A05 = false;
        this.A06 = false;
        try {
            this.A02.A08("Main");
            this.A02.A09("Main", "onCreate", "_start");
            this.A02.A07("main_onCreate");
            super.onCreate(bundle);
            setTitle(R.string.f11nameremoved);
            if (!this.A07.A03()) {
                Log.i("aborting due to native libraries missing");
                A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.corruptinstallation.CorruptInstallationActivity");
            } else {
                if (AnonymousClass5XU.A00()) {
                    Log.w("main/device-not-supported");
                    setTheme(R.style.f12nameremoved);
                    Boo(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                } else {
                    C52282lE r9 = this.A04;
                    C54292oU r1 = r9.A02;
                    PackageManager packageManager = r1.A00.getPackageManager();
                    ComponentName componentName = r9.A00;
                    if (componentName == null) {
                        componentName = new ComponentName(r1.A00, CompanionStateHolder$CompanionLogoutStateReceiver.class);
                        r9.A00 = componentName;
                    }
                    boolean A1T = AnonymousClass001.A1T(packageManager.getComponentEnabledSetting(componentName));
                    C18260x0.A1D("CompanionStateHolder/getCompanionLogoutState/state=", AnonymousClass001.A0o(), A1T);
                    if (A1T) {
                        A072 = C18320x8.A07();
                        A072.setClassName(getPackageName(), "com.whatsapp.companionmode.registration.CompanionPostLogoutActivity");
                    } else {
                        C614930z r8 = this.A03;
                        Intent intent = getIntent();
                        C162457s7.A0J(intent, 0);
                        if (intent.getBooleanExtra("is_success", false)) {
                            if (intent.hasExtra("request_type")) {
                                boolean z = false;
                                int intExtra = intent.getIntExtra("request_type", 0);
                                if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                                    z = true;
                                }
                                C18260x0.A1E("AccountSwitcher/processIntentAfterAccountSwitching/shouldShowAccountSwitchingToast: ", AnonymousClass001.A0o(), z);
                                AnonymousClass33p r11 = r8.A0A;
                                C18270x1.A0l(C18270x1.A03(r11), "show_account_switching_toast", z);
                                if (1 == intent.getIntExtra("request_type", 0)) {
                                    C18270x1.A0h(C18270x1.A03(r11), "add_account_source", intent.getIntExtra("source", 0));
                                }
                            }
                            int intExtra2 = intent.getIntExtra("request_type", 0);
                            if (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 3 || intExtra2 == 4) {
                                Long A092 = C56612sH.A09(r8.A08);
                                r8.A02 = A092;
                                C18260x0.A1R(AnonymousClass001.A0o(), "AccountSwitcher/processIntentAfterAccountSwitching/lastSwitchedTsMs=", A092);
                            }
                            if (intent.hasExtra("number_of_accounts")) {
                                int intExtra3 = intent.getIntExtra("number_of_accounts", 0);
                                C18260x0.A0y("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_NUMBER_OF_ACCOUNTS: ", AnonymousClass001.A0o(), intExtra3);
                                r8.A0A.A1A(intExtra3);
                                int i = intExtra3 + 1;
                                AnonymousClass4AF r6 = r8.A0E.A0A;
                                Long A0m = AnonymousClass0x9.A0m(i);
                                C162457s7.A0J(r6, 0);
                                C18300x5.A1G(r6, A0m, 15265);
                            }
                        }
                        if (intent.hasExtra("account_language") && (stringExtra = intent.getStringExtra("account_language")) != null) {
                            C18260x0.A0s("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_ACCOUNT_LANGUAGE: ", stringExtra, AnonymousClass001.A0o());
                            C18270x1.A0j(C54412og.A00(r8.A0B), "forced_language", stringExtra);
                            r8.A0C.A0S(stringExtra);
                        }
                        int A002 = this.A09.A00();
                        Me A003 = C56972sr.A00(this.A01);
                        if (A003 == null && A002 == 0) {
                            C614930z r82 = this.A03;
                            Intent intent2 = getIntent();
                            C162457s7.A0J(intent2, 0);
                            Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching");
                            String stringExtra2 = intent2.getStringExtra("device_id");
                            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                                Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init device id");
                                AnonymousClass33p r92 = r82.A0A;
                                if (AnonymousClass0x2.A0F(r92).getString("perf_device_id", (String) null) == null) {
                                    C18270x1.A0j(C18270x1.A03(r92), "perf_device_id", stringExtra2);
                                }
                            }
                            String stringExtra3 = intent2.getStringExtra("phone_id");
                            long longExtra = intent2.getLongExtra("phone_id_timestamp", 0);
                            if (!(stringExtra3 == null || stringExtra3.length() == 0 || longExtra <= AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r82.A0A), "phoneid_timestamp"))) {
                                Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init phone id");
                                ((AnonymousClass3Au) r82.A0J.get()).Bmt(new AnonymousClass2XL(stringExtra3, longExtra));
                            }
                            if (!isFinishing()) {
                                boolean booleanExtra = getIntent().getBooleanExtra("show_registration_first_dlg", false);
                                Intent A073 = C18320x8.A07();
                                A073.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
                                A073.putExtra("show_registration_first_dlg", booleanExtra);
                                startActivity(A073);
                                C05680Um.A00(this);
                            }
                        } else if (A002 != 6) {
                            if (this.A0D.A0Y(C58422vE.A02, 6588) && !this.A05.A09) {
                                Log.i("main/create/message-store-not-ready");
                                View findViewById = findViewById(16908290);
                                if (findViewById == null) {
                                    Log.i("Main/keepSplashscreen/no content view found");
                                } else {
                                    AnonymousClass3A3 r14 = new AnonymousClass3A3();
                                    findViewById.getViewTreeObserver().addOnPreDrawListener(r14);
                                    this.A04.BkP(new C71593cM((Object) this, (Object) findViewById, (Object) r14, (Object) A003, 10));
                                }
                            }
                            A7B(A003);
                        } else if (!isFinishing()) {
                            A072 = C18320x8.A07();
                            A072.setClassName(getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
                        }
                    }
                }
            }
            startActivity(A072);
            finish();
        } finally {
            this.A02.A09("Main", "onCreate", "_end");
            this.A02.A06("main_onCreate");
            AnonymousClass0RZ.A00();
        }
    }

    public Main(int i) {
        this.A0K = false;
        AnonymousClass4HY.A00(this, 2);
    }

    public final void A7A() {
        StringBuilder A0l;
        String obj;
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (intent != null && !C18280x3.A1V(intent, "android.intent.action.MAIN") && (intent.getFlags() & 67108864) != 0 && AnonymousClass1Hf.A27(this).getInt("shortcut_version", 0) == 0) {
                Log.i("main/recreate_shortcut");
                String string = getString(R.string.f11nameremoved);
                Intent A032 = C627736r.A03(this);
                A032.addFlags(268435456);
                A032.addFlags(67108864);
                Intent A072 = C18320x8.A07();
                try {
                    A072.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(A032.toUri(0), 0));
                } catch (URISyntaxException e) {
                    Log.e(AnonymousClass000.A0a("RegisterName/remove-shortcut cannot parse shortcut uri ", AnonymousClass001.A0o(), e), e);
                }
                A072.putExtra("android.intent.extra.shortcut.NAME", string);
                A072.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                sendBroadcast(A072);
                AnonymousClass27N.A00(this, getString(R.string.f11nameremoved));
                C18260x0.A0L(this.A09, "shortcut_version", 1);
            }
            Intent intent2 = getIntent();
            C162457s7.A0J(intent2, 0);
            boolean z = false;
            int intExtra = intent2.getIntExtra("request_type", 0);
            if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4) {
                z = true;
            }
            Intent intent3 = getIntent();
            C162457s7.A0J(intent3, 0);
            boolean booleanExtra = intent3.getBooleanExtra("is_success", false);
            if (z) {
                this.A04.BkM(new C117645sG((Object) this, 46));
                ((C50422i9) this.A0I.get()).A01();
                AnonymousClass5XC r6 = (AnonymousClass5XC) this.A08.get();
                Intent intent4 = getIntent();
                C162457s7.A0J(intent4, 0);
                int intExtra2 = intent4.getIntExtra("source", 0);
                r6.A01 = intExtra2;
                if (intExtra2 == 0) {
                    obj = "AccountSwitchingLogger/cacheAccountSwitchingEventData/invalid source";
                } else {
                    if (intent4.getBooleanExtra("is_success", false)) {
                        Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/success action");
                        r6.A04 = true;
                        r6.A02 = (long) intent4.getIntExtra("inactive_account_num_pending_message_notifs", 0);
                        long longExtra = intent4.getLongExtra("switching_start_time_ms", 0);
                        r6.A03 = longExtra;
                        A0l = AnonymousClass000.A0l("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                        A0l.append(r6.A01);
                        A0l.append(", numPendingMessageNotifs:");
                        A0l.append(r6.A02);
                        A0l.append(", startTimeMs:");
                        A0l.append(longExtra);
                    } else {
                        Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/failed action");
                        r6.A04 = false;
                        int i = 8;
                        if (intent4.getIntExtra("request_type", 0) == 1) {
                            i = 5;
                        }
                        r6.A00 = i;
                        A0l = AnonymousClass000.A0l("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                        A0l.append(r6.A01);
                        A0l.append(", action:");
                        A0l.append(i);
                    }
                    obj = A0l.toString();
                }
                Log.i(obj);
            }
            if (this.A0J && !isFinishing()) {
                Intent A022 = C627736r.A02(this);
                A022.putExtra("show_payment_account_recovery", getIntent().getBooleanExtra("show_payment_account_recovery", false));
                if (z && booleanExtra) {
                    Intent intent5 = getIntent();
                    C162457s7.A0J(intent5, 0);
                    C95814uZ A052 = C95814uZ.A00.A05(intent5.getStringExtra("account_switching_sender_jid"));
                    Intent intent6 = getIntent();
                    C162457s7.A0J(intent6, 0);
                    if (intent6.getBooleanExtra("is_missed_call_notification", false)) {
                        A022 = C18300x5.A07(this).setAction("com.whatsapp.intent.action.CALLS");
                    } else if (A052 != null) {
                        A022 = new C627736r().A1O(this, A052, 0);
                    }
                }
                startActivity(A022);
                overridePendingTransition(0, 0);
            }
            finish();
        }
    }

    public Dialog onCreateDialog(int i) {
        setTheme(R.style.f12nameremoved);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        this.A02.A05("upgrade");
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        C19340zH.A08(A002, this, 2, R.string.f11nameremoved);
        C19340zH.A07(A002, this, 3, R.string.f11nameremoved);
        return A002.create();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
        this.A0J = false;
    }

    public Main() {
        this(0);
    }
}
