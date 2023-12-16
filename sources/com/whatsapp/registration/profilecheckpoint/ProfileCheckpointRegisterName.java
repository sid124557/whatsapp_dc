package com.whatsapp.registration.profilecheckpoint;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0IT;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1FB;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass20D;
import X.AnonymousClass2NN;
import X.AnonymousClass2QW;
import X.AnonymousClass2W1;
import X.AnonymousClass317;
import X.AnonymousClass338;
import X.AnonymousClass33p;
import X.AnonymousClass345;
import X.AnonymousClass36l;
import X.AnonymousClass3M4;
import X.AnonymousClass3ZH;
import X.AnonymousClass48T;
import X.AnonymousClass4AF;
import X.AnonymousClass4BG;
import X.AnonymousClass4BH;
import X.AnonymousClass4C1;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4MT;
import X.AnonymousClass4MU;
import X.AnonymousClass4SG;
import X.AnonymousClass5GE;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass5XU;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass66D;
import X.AnonymousClass68E;
import X.AnonymousClass68W;
import X.AnonymousClass6B5;
import X.C101835Gh;
import X.C102305Ii;
import X.C10240hc;
import X.C103275Mg;
import X.C104015Ph;
import X.C105265Uf;
import X.C105525Vi;
import X.C107565bW;
import X.C116985rC;
import X.C1235268t;
import X.C124366Bz;
import X.C129496aP;
import X.C129526aS;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C183538qC;
import X.C19340zH;
import X.C197769dq;
import X.C29421in;
import X.C30191m3;
import X.C379724t;
import X.C44152Uw;
import X.C45342Zq;
import X.C45602aH;
import X.C46132b8;
import X.C46982cW;
import X.C48242ea;
import X.C49712gy;
import X.C49842hB;
import X.C50102hd;
import X.C50152hi;
import X.C53202mi;
import X.C53282mq;
import X.C55092pm;
import X.C55272q5;
import X.C55912r7;
import X.C56142rU;
import X.C56332ro;
import X.C56452s0;
import X.C56502s5;
import X.C56542sA;
import X.C56612sH;
import X.C56882si;
import X.C56912sl;
import X.C56972sr;
import X.C59772xS;
import X.C614930z;
import X.C616131n;
import X.C618232j;
import X.C619933b;
import X.C620233e;
import X.C620733j;
import X.C621433s;
import X.C622334f;
import X.C625835r;
import X.C626936e;
import X.C627736r;
import X.C64213Cp;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C66423Lj;
import X.C66473Lo;
import X.C66493Lq;
import X.C66523Lt;
import X.C69263Wi;
import X.C71223bl;
import X.C71373c0;
import X.C71543cH;
import X.C72303dV;
import X.C72333dY;
import X.C72343dZ;
import X.C84814Du;
import X.C85494Gl;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C88744aj;
import X.C88834as;
import X.C89034bN;
import X.C89044bO;
import X.C993755m;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.registration.passkeys.PasskeyFacade$checkPasskeyExists$1;
import com.whatsapp.registration.passkeys.PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1;
import com.whatsapp.util.Log;
import java.io.File;

public class ProfileCheckpointRegisterName extends AnonymousClass1FB implements AnonymousClass66D {
    public static C71223bl A1K;
    public long A00;
    public View A01;
    public C116985rC A02;
    public C116985rC A03;
    public C116985rC A04;
    public C116985rC A05;
    public C116985rC A06;
    public C116985rC A07;
    public C44152Uw A08;
    public C55912r7 A09;
    public AnonymousClass5XU A0A;
    public AnonymousClass5WY A0B;
    public C49712gy A0C;
    public C614930z A0D;
    public C10240hc A0E;
    public AnonymousClass2NN A0F;
    public C64773Ex A0G;
    public C29421in A0H;
    public AnonymousClass5ZU A0I;
    public C56332ro A0J;
    public C64223Cq A0K;
    public C56882si A0L;
    public C64213Cp A0M;
    public C622334f A0N;
    public AnonymousClass5ZR A0O;
    public C56542sA A0P;
    public C66473Lo A0Q;
    public C625835r A0R;
    public AnonymousClass2W1 A0S;
    public C55272q5 A0T;
    public C72303dV A0U;
    public C620233e A0V;
    public AnonymousClass5GE A0W;
    public AnonymousClass3ZH A0X;
    public C46982cW A0Y;
    public C49842hB A0Z;
    public C50102hd A0a;
    public AnonymousClass1VW A0b;
    public C56142rU A0c;
    public AnonymousClass4AF A0d;
    public AnonymousClass4FV A0e;
    public C66493Lq A0f;
    public C53202mi A0g;
    public C66523Lt A0h;
    public C66423Lj A0i;
    public C45342Zq A0j;
    public C619933b A0k;
    public C197769dq A0l;
    public C56452s0 A0m;
    public C30191m3 A0n;
    public C993755m A0o;
    public C46132b8 A0p;
    public C103275Mg A0q;
    public C50152hi A0r;
    public C56912sl A0s;
    public AnonymousClass317 A0t;
    public C89044bO A0u;
    public C55092pm A0v;
    public C59772xS A0w;
    public AnonymousClass2QW A0x;
    public C53282mq A0y;
    public C618232j A0z;
    public C56502s5 A10;
    public C101835Gh A11;
    public C104015Ph A12;
    public C105265Uf A13;
    public AnonymousClass4BG A14;
    public AnonymousClass4BH A15;
    public C89034bN A16;
    public C102305Ii A17;
    public C45602aH A18;
    public C183538qC A19;
    public C183538qC A1A;
    public C183538qC A1B;
    public C183538qC A1C;
    public Integer A1D;
    public String A1E;
    public boolean A1F = false;
    public boolean A1G;
    public final Handler A1H;
    public final Handler A1I;
    public final AnonymousClass48T A1J;

    public ProfileCheckpointRegisterName() {
        super(true, true);
        AnonymousClass68W.A00(this, 89);
        this.A1H = new AnonymousClass4MT(Looper.getMainLooper(), this);
        this.A1I = new AnonymousClass4MU(Looper.getMainLooper(), this);
        this.A1J = new AnonymousClass6B5(this, 1);
    }

    public final void A7C() {
        C69263Wi r2 = this.A05;
        C101835Gh r6 = this.A11;
        C53282mq r5 = this.A0y;
        C993755m r1 = new C993755m(r2, this.A0T, this, r5, r6);
        this.A0o = r1;
        C18270x1.A0w(r1, this.A04);
    }

    public void A5r() {
        if (!this.A1F) {
            this.A1F = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3X(r3, this, AnonymousClass4SG.A32(r3, this));
            AnonymousClass4SG.A3Y(r3, this, C86604Kt.A0V(r3));
            C379724t.A00(this, r3.A00.ALf());
            C88744aj r4 = C88744aj.A00;
            this.A05 = r4;
            this.A0A = AnonymousClass4SG.A2d(r3);
            this.A0e = C86604Kt.A0Z(r3);
            this.A0N = (C622334f) r3.A0v.get();
            this.A0P = C86634Kw.A0e(r3);
            this.A0V = (C620233e) r3.AWq.get();
            this.A0C = (C49712gy) r3.AaZ.get();
            this.A10 = (C56502s5) r3.A00.A5N.get();
            this.A0B = (AnonymousClass5WY) r3.AUS.get();
            this.A04 = r4;
            this.A0c = (C56142rU) r3.A05.get();
            this.A0D = C86614Ku.A0O(r3);
            this.A0b = C86624Kv.A0S(r3);
            this.A0G = C86604Kt.A0P(r3);
            this.A0h = AnonymousClass4SG.A2n(r3);
            this.A0I = C86604Kt.A0R(r3);
            this.A0p = (C46132b8) r3.A00.A9v.get();
            this.A07 = r4;
            this.A0H = C86604Kt.A0Q(r3);
            this.A18 = (C45602aH) r3.A9P.get();
            this.A0f = (C66493Lq) r3.AGL.get();
            this.A0M = (C64213Cp) r3.A8E.get();
            this.A13 = r3.A00.ANk();
            this.A0d = (AnonymousClass4AF) r3.ASX.get();
            this.A0J = (C56332ro) r3.A6Q.get();
            this.A0K = C86604Kt.A0T(r3);
            this.A0z = (C618232j) r3.AJx.get();
            this.A0R = (C625835r) r3.AM8.get();
            this.A0i = (C66423Lj) r3.AUX.get();
            this.A0g = C86634Kw.A0j(r3);
            this.A0r = A2X.AD3();
            this.A0a = (C50102hd) r3.A00.A50.get();
            this.A0k = C86624Kv.A0V(r3);
            this.A0U = C86614Ku.A0a(r3);
            this.A0m = (C56452s0) r3.ARi.get();
            this.A0n = C86634Kw.A0o(r3);
            this.A0t = C86614Ku.A0i(r3);
            this.A0O = C86614Ku.A0V(r3);
            this.A0j = r3.AoK();
            this.A14 = (AnonymousClass4BG) A2X.A43.get();
            this.A15 = (AnonymousClass4BH) A2X.A44.get();
            this.A09 = (C55912r7) r3.ARR.get();
            this.A0v = AnonymousClass4SG.A2o(r3);
            this.A0x = (AnonymousClass2QW) r3.A8H.get();
            this.A17 = (C102305Ii) r3.A00.A9R.get();
            this.A06 = (C116985rC) r3.AOk.get();
            this.A0Y = (C46982cW) r3.A8M.get();
            C129496aP builderWithExpectedSize = C129526aS.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(C88834as.A3F());
            builderWithExpectedSize.add((Object) r3.A00.AMj());
            this.A11 = new C101835Gh(builderWithExpectedSize.build());
            this.A0s = (C56912sl) r3.ATe.get();
            this.A0Z = r3.AkP();
            this.A0l = (C197769dq) r3.AQB.get();
            this.A0w = r3.AqS();
            this.A02 = r4;
            this.A0S = (AnonymousClass2W1) r3.AM9.get();
            this.A03 = r4;
            this.A1B = C72343dZ.A00(A2X.A4T);
            this.A0Q = C86644Kx.A0U(r3);
            this.A0F = (AnonymousClass2NN) r3.A00.A7i.get();
            this.A19 = C72343dZ.A00(r3.A0o);
            this.A0L = (C56882si) r3.A6h.get();
            this.A0y = (C53282mq) r3.AI9.get();
            this.A0T = (C55272q5) r3.AMB.get();
            this.A0E = (C10240hc) r3.AG8.get();
            this.A12 = (C104015Ph) r3.A00.A5j.get();
            this.A1A = C72343dZ.A00(A2X.A0S);
            this.A0W = r3.A00.ALS();
            this.A0q = new C103275Mg((C56612sH) r3.ASO.get());
            this.A1C = C72343dZ.A00(r3.A00.ACF);
            this.A08 = (C44152Uw) A2X.A1q.get();
        }
    }

    public C183538qC A74() {
        return new C72333dY(this.A0t, (AnonymousClass4C1) null);
    }

    public void A75() {
        Me A032;
        Log.i("ProfileCheckpointRegisterName/messageStoreVerified");
        if (C86614Ku.A0D(this) == null || !getIntent().getBooleanExtra("debug", false)) {
            A032 = this.A0t.A03();
        } else {
            Me A2b = AnonymousClass4SG.A2b(this);
            C626936e.A06(A2b);
            A032 = new Me(A2b.cc, A2b.number, this.A09.A0a());
        }
        if (A032.jabber_id == null) {
            Log.e("ProfileCheckpointRegisterName/messagestoreverified/missing-params bounce to regphone");
            this.A0t.A0B(1, true);
            A6T(C627736r.A04(this), true);
            return;
        }
        C56972sr r1 = this.A01;
        r1.A0P();
        if (!r1.A0Z(A032, "me")) {
            Log.i("ProfileCheckpointRegisterName/messageStoreVerified/failed to save me object");
            finish();
            return;
        }
        this.A01.A0R(A032);
        ((AnonymousClass338) this.A19.get()).A02(this);
        C105525Vi.A00(this.A0A, this.A09);
        Log.i("ProfileCheckpointRegisterName/set_dirty");
        this.A0h.A0z = true;
        this.A0t.A07();
        this.A0h.A04();
        Log.i("ProfileCheckpointRegisterName/msgstoreverified/group_sync_required");
        this.A0f.A0C(3, true);
        this.A00 = SystemClock.uptimeMillis();
        this.A0X = C86634Kw.A0V(this.A01);
        File A0S2 = this.A0J.A00.A0S("tmpp");
        if (A0S2.exists()) {
            this.A0n.A0H(this.A0X, A0S2, (byte[]) null, false);
        }
        if (AnonymousClass1Hf.A27(this).getLong("message_store_verified_time", 0) == 0) {
            C18260x0.A0M(this.A09, "message_store_verified_time", System.currentTimeMillis());
        }
        if (this.A0u != null) {
            if (this.A0U.A01() != 0) {
                Log.i("ProfileCheckpointRegisterName/restoredialog/congrats");
                this.A0u.A00(2);
            } else {
                Log.i("ProfileCheckpointRegisterName/restoredialog/empty-msg-restore");
                if (!this.A1G && this.A0E.A0n()) {
                    Intent A072 = C18320x8.A07();
                    A072.setClassName(getPackageName(), "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                    BpY(A072, 15);
                    this.A1G = true;
                }
                C621433s.A00(this, 103);
            }
        } else if (this.A0O.A02("android.permission.GET_ACCOUNTS") != 0) {
            Log.i("ProfileCheckpointRegisterName/delay google drive setup due to lack of permissions");
            AnonymousClass4SG.A3f(this);
        }
        ((C48242ea) this.A1A.get()).A00();
        C86644Kx.A1Q(this.A04, this, 43);
        if (!C18280x3.A1W(AnonymousClass0x2.A0F(this.A13.A02), "reg_abprop_passkey_create_education_screen")) {
            PasskeyFacade B05 = this.A14.B05(this.A15.B06(1));
            C124366Bz r0 = new C124366Bz(this, 11);
            C616131n.A02((C85494Gl) null, new PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(this, B05, (C84814Du) null, r0), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        }
        C86644Kx.A1Q(this.A04, this, 44);
        A7D();
    }

    public void A79() {
        Log.i("ProfileCheckpointRegisterName/runPrepareMessageStoreTaskAfterMessageStoreIsInitialized");
        this.A0P.A08(false);
        this.A0T.A02();
        this.A0K.A05();
        A75();
    }

    public final void A7A() {
        Log.i("restore>ProfileCheckpointRegisterName/checking for google and local backups");
        Intent className = C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
        className.setAction("action_show_restore_one_time_setup");
        startActivityForResult(className, 14);
    }

    public final void A7D() {
        Log.i("ProfileCheckpointRegisterName/showNextScreen");
        PasskeyFacade B05 = this.A14.B05(this.A15.B06(1));
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A13.A02), "reg_abprop_passkey_create_education_screen") && B05.A03()) {
            Log.i("ProfileCheckpointRegisterName/maybeShowPasskeyCreateEducationScreen");
            C124366Bz r0 = new C124366Bz(this, 10);
            C616131n.A02((C85494Gl) null, new PasskeyFacade$checkPasskeyExists$1(B05, (C84814Du) null, r0), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        } else if (this.A0Z.A01()) {
            Log.i("ProfileCheckpointRegisterName/maybeShowRegistrationEmailCaptureScreen");
            C49842hB r3 = this.A0Z;
            r3.A02.A02(new AnonymousClass3M4(r3, new C124366Bz(this, 12)));
        } else {
            A7E();
        }
    }

    public final void A7E() {
        Log.i("ProfileCheckpointRegisterName/startInitializer");
        C71223bl r2 = A1K;
        if (r2 == null || r2.A03) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ProfileCheckpointRegisterName/check-initializer, null?");
            C18260x0.A1V(A0o2, AnonymousClass000.A1X(r2));
            C71223bl A002 = this.A08.A00(this.A1H, this.A1J);
            A1K = A002;
            A002.A01 = this.A00;
            C86644Kx.A1Q(this.A04, this, 45);
            C621433s.A01(this, 0);
            View view = this.A01;
            if (view != null) {
                view.setVisibility(4);
            }
            AnonymousClass33p r0 = this.A09;
            C18270x1.A0i(C18270x1.A03(r0), "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
            C18270x1.A0j(C18270x1.A03(this.A09), "account_switching_logged_out_phone_number", (String) null);
            C18270x1.A0j(AnonymousClass4SG.A2P(this), "account_switching_banned_account_lid", (String) null);
            C18270x1.A0j(AnonymousClass4SG.A2P(this), "account_switching_banned_account_phone_user_jid", (String) null);
            this.A1I.sendEmptyMessageDelayed(0, 600000);
            this.A10.A01("home");
        }
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i == 0) {
            Log.i("ProfileCheckpointRegisterName/dialog/initprogress");
            if (A1K == null) {
                Log.w("ProfileCheckpointRegisterName/dialog/initprogress/init-null/remove");
                AnonymousClass000.A0A().postDelayed(new C71543cH((Object) this, 40), 3);
            }
            C89034bN r1 = new C89034bN(this.A08, this.A06, this.A00, this);
            this.A16 = r1;
            r1.setCancelable(false);
            return this.A16;
        } else if (i2 == 1) {
            Log.w("ProfileCheckpointRegisterName/dialog/failed-net");
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0g(C86604Kt.A0l(this, R.string.f11nameremoved));
            C1235268t.A03(A002, this, 120, R.string.f11nameremoved);
            return A002.create();
        } else if (i2 == 103) {
            Log.i("ProfileCheckpointRegisterName/dialog/restore");
            AnonymousClass68E r6 = new AnonymousClass68E(this, this.A08, this.A06, this.A00, this.A0R, this.A0U, this.A0t, this, 1);
            this.A0u = r6;
            r6.setCancelable(false);
            C620733j r62 = this.A00;
            Log.d("ProfileCheckpointRegisterName/restorebackupdialog/lastbackup/look at files");
            long A0D2 = this.A0R.A0D();
            if (A0D2 != -1) {
                C18260x0.A10("ProfileCheckpointRegisterName/restorebackupdialog/lastbackup/fromfiles/set to ", AnonymousClass001.A0o(), A0D2);
            }
            this.A04.BkM(new C71373c0(8, C107565bW.A03(r62, A0D2).toString(), this));
            return this.A0u;
        } else if (i2 != 109) {
            return super.onCreateDialog(i2);
        } else {
            Log.w("ProfileCheckpointRegisterName/dialog/cant-connect");
            AnonymousClass4FS r14 = this.A04;
            return AnonymousClass36l.A02(this, this.A0B, this.A07, this.A08, this.A0O, this.A0g, this.A0s, r14);
        }
    }

    public void A78(boolean z) {
        super.A78(z);
        C89044bO r1 = this.A0u;
        if (r1 != null && z) {
            r1.A00(1);
        }
    }

    public final void A7B() {
        View view;
        long A0A2 = AnonymousClass0x2.A0A(AnonymousClass1Hf.A27(this), "com.whatsapp.registername.initializer_start_time");
        if (A0A2 > 0 && AnonymousClass0x9.A05(A0A2) > 600000 && (view = this.A01) != null) {
            view.setVisibility(0);
        }
    }

    public void BaF(int i) {
        Intent intent;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>ProfileCheckpointRegisterName/onRestoreStateResult/result = ");
        C18260x0.A1L(A0o2, C993755m.A00(i));
        if (i == 0) {
            A7A();
        } else if (i == 1) {
            C86644Kx.A1Q(this.A04, this, 39);
            try {
                intent = AnonymousClass0x9.A08(this, Class.forName("com.whatsapp.migration.android.view.GoogleMigrateImporterActivity"));
            } catch (ClassNotFoundException unused) {
                Log.e("GoogleMigrateUtil/createStartIntent/class not found");
                intent = null;
            }
            startActivityForResult(intent, 18);
        } else if (i == 2) {
            AnonymousClass33p r0 = this.A09;
            C18270x1.A0i(C18270x1.A03(r0), "direct_migration_start_time", SystemClock.elapsedRealtime());
            long A002 = AnonymousClass345.A00(this, "com.whatsapp.w4b");
            C18260x0.A12("ProfileCheckpointRegisterName/checkForMigrateFromConsumerDirectly/providerAppVersionCode = ", AnonymousClass001.A0o(), A002);
            this.A0x.A01.A0A = Long.valueOf(A002);
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity");
            startActivityForResult(A072, 16);
        } else if (i == 3) {
            C621433s.A01(this, 107);
        } else if (i == 4) {
            A79();
            this.A1D = 4;
            AnonymousClass4SG.A3f(this);
        } else {
            throw C86604Kt.A0h("restore>ProfileCheckpointRegisterName/onRestoreStateResult/result is not recognized/result = ", AnonymousClass001.A0o(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        A79();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        A78(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result request:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " result:"
            X.C18260x0.A0y(r0, r1, r10)
            r7 = 3
            r5 = 0
            r6 = 2
            r4 = 1
            switch(r9) {
                case 14: goto L_0x001c;
                case 15: goto L_0x010b;
                case 16: goto L_0x0116;
                case 17: goto L_0x0018;
                case 18: goto L_0x008d;
                case 19: goto L_0x00c9;
                case 20: goto L_0x00f2;
                case 21: goto L_0x0140;
                case 22: goto L_0x0140;
                default: goto L_0x0018;
            }
        L_0x0018:
            super.onActivityResult(r9, r10, r11)
        L_0x001b:
            return
        L_0x001c:
            if (r10 != r7) goto L_0x0034
            java.lang.String r0 = "restore>ProfileCheckpointRegisterName/activity-result backup found and is being restored."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A79()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r8.A1D = r0
            X.4bO r0 = r8.A0u
            if (r0 == 0) goto L_0x001b
            r0.hide()
            return
        L_0x0034:
            if (r10 != 0) goto L_0x0041
            java.lang.String r0 = "restore>ProfileCheckpointRegisterName/activity-result restore canceled because Google Play Services were not available on the device"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ez r0 = r8.A01
            r0.BsA()
            return
        L_0x0041:
            java.lang.String r1 = "skip"
            if (r10 != r6) goto L_0x005b
            java.lang.String r0 = "restore>ProfileCheckpointRegisterName/activity-result backup found but not restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A78(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r8.A1D = r0
            X.2s5 r0 = r8.A10
            java.lang.String r2 = "backup_found"
        L_0x0057:
            r0.A03(r2, r1)
            return
        L_0x005b:
            java.lang.String r2 = "no_backup_found"
            if (r10 != r4) goto L_0x0075
            java.lang.String r0 = "restore>ProfileCheckpointRegisterName/activity-result no google backup found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A78(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.A1D = r0
            X.2s5 r1 = r8.A10
            java.lang.String r0 = "next"
            r1.A03(r2, r0)
            return
        L_0x0075:
            r0 = 4
            if (r10 != r0) goto L_0x0084
            r8.A78(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.A1D = r0
            X.2s5 r0 = r8.A10
            goto L_0x0057
        L_0x0084:
            r0 = 5
            if (r10 != r0) goto L_0x0144
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/chat-transfer/succeeded from receiver entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00d4
        L_0x008d:
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r8)
            java.lang.String r0 = "google_migrate_import_start_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r2 = r2 - r0
            if (r10 != r6) goto L_0x00a7
            X.AnonymousClass4SG.A3v(r8, r2)
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/import-via-google-migrate/import-canceled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0107
        L_0x00a7:
            if (r10 != r4) goto L_0x00b2
            X.AnonymousClass4SG.A3v(r8, r2)
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/import-via-google-migrate/import-succeeded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x00d4
        L_0x00b2:
            if (r10 != r7) goto L_0x001b
            X.317 r0 = r8.A0t
            r0.A09()
            android.content.Intent r1 = X.C627736r.A04(r8)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            r1.putExtra(r0, r4)
            r8.startActivity(r1)
            r8.finish()
            return
        L_0x00c9:
            r0 = -1
            if (r10 != r0) goto L_0x00d8
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/chat-transfer/succeeded from donor entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A7C()
        L_0x00d4:
            r8.A79()
            return
        L_0x00d8:
            if (r10 != 0) goto L_0x001b
            java.lang.String r0 = "ProfileCheckpointRegisterName/chat-transfer-cancelled-result"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5ZR r0 = r8.A0O
            boolean r0 = r0.A0H()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = "ProfileCheckpointRegisterName/chat-transfer-cancelled/storage-permissions granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A7C()
            return
        L_0x00f2:
            if (r10 != r4) goto L_0x00f8
            r8.A7A()
            return
        L_0x00f8:
            if (r10 != r6) goto L_0x0105
            r0 = 0
            android.content.Intent r1 = X.C627736r.A18(r8, r0, r5, r4)
            r0 = 19
            r8.startActivityForResult(r1, r0)
            return
        L_0x0105:
            if (r10 != r7) goto L_0x001b
        L_0x0107:
            r8.A78(r5)
            return
        L_0x010b:
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/restore_from_backup/remove"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 103(0x67, float:1.44E-43)
            X.C621433s.A00(r8, r0)
            return
        L_0x0116:
            if (r10 != r4) goto L_0x013a
            java.lang.String r0 = "ProfileCheckpointRegisterName/activity-result/successfully-restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A79()
        L_0x0120:
            X.2QW r4 = r8.A0x
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r8)
            java.lang.String r0 = "direct_migration_start_time"
            long r0 = X.AnonymousClass0x2.A0A(r1, r0)
            long r2 = r2 - r0
            X.1au r1 = r4.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A09 = r0
            return
        L_0x013a:
            if (r10 != r6) goto L_0x0120
            r8.A7A()
            goto L_0x0120
        L_0x0140:
            r8.A7E()
            return
        L_0x0144:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>ProfileCheckpointRegisterName/activity-result unknown result code "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " from RestoreFromBackupActivity."
            X.C18260x0.A1K(r1, r0)
            return
        L_0x0156:
            java.lang.String r0 = "ProfileCheckpointRegisterName/chat-transfer-cancelled/storage-permissions NOT granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89034bN r1 = this.A16;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
            C89034bN r2 = this.A16;
            r2.A01.A01 = r2.findViewById(R.id.pay_ed_contact_support);
            A7B();
        }
        C89044bO r12 = this.A0u;
        if (r12 != null) {
            r12.onCreate(r12.onSaveInstanceState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r7.getBoolean("started_gdrive_new_user_activity", false) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131892911(0x7f121aaf, float:1.9420584E38)
            r6.setTitle(r0)
            r2 = 0
            if (r7 == 0) goto L_0x0015
            java.lang.String r0 = "started_gdrive_new_user_activity"
            boolean r1 = r7.getBoolean(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r6.A1G = r0
            r0 = 2131625201(0x7f0e04f1, float:1.8877603E38)
            r6.setContentView((int) r0)
            int r5 = X.AnonymousClass4SG.A2K(r6)
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "pref_profile_checkpoint_name"
            r4 = 0
            java.lang.String r0 = r1.getString(r0, r4)
            r6.A1E = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0059
            r3 = 2
            if (r5 != r3) goto L_0x0059
            X.33p r0 = r6.A09
            java.lang.String r0 = r0.A0a()
            X.C107405bG.A05(r6)
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "ProfileCheckpointRegisterName/create/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.317 r1 = r6.A0t
            r0 = 1
            r1.A0B(r0, r0)
            android.content.Intent r0 = X.C627736r.A04(r6)
        L_0x0052:
            r6.startActivity(r0)
            r6.finish()
            return
        L_0x0059:
            r0 = 3
            if (r5 != r0) goto L_0x0066
            java.lang.String r0 = "ProfileCheckpointRegisterName/create/registration already verified bounce to main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0061:
            android.content.Intent r0 = X.C627736r.A03(r6)
            goto L_0x0052
        L_0x0066:
            java.lang.String r0 = "ProfileCheckpointRegisterName/create/bad-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0061
        L_0x006c:
            X.3bl r0 = A1K
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "ProfileCheckpointRegisterName/onCreate/initializer not null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RR r0 = X.AnonymousClass4SG.A2c(r6)
            r6.A0X = r0
            X.C621433s.A01(r6, r2)
        L_0x007e:
            X.317 r1 = r6.A0t
            r0 = 1
            r1.A0B(r3, r0)
            X.33p r1 = r6.A09
            byte[] r0 = new byte[r2]
            r1.A23(r0)
            return
        L_0x008c:
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00a2
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "google_migrate_import_canceled"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x00a2
            r6.A78(r2)
            return
        L_0x00a2:
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00b8
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "google_migrate_import_success"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x00b8
            r6.A79()
            return
        L_0x00b8:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "first_party_migration_initiated"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x00dd
            X.1VW r1 = r6.A0b
            r0 = 2989(0xbad, float:4.188E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "ProfileCheckpointRegisterName/onCreate/launchFirstPartyMigrationFlow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r1 = X.C627736r.A18(r6, r4, r2, r2)
            r0 = 19
            r6.startActivityForResult(r1, r0)
            goto L_0x007e
        L_0x00dd:
            java.lang.String r0 = "ProfileCheckpointRegisterName/onCreate/runDetermineRestoreStateTask"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A7C()
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (isFinishing()) {
            this.A0k.A07();
        }
        C993755m r1 = this.A0o;
        if (r1 != null) {
            r1.A00 = null;
            r1.A0D(true);
            this.A0o = null;
        }
        this.A0r.A00();
        super.onDestroy();
    }

    public void onPause() {
        Handler handler;
        super.onPause();
        C71223bl r2 = A1K;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
        Integer num = this.A1D;
        if (num != null) {
            AnonymousClass33p r0 = this.A09;
            C18270x1.A0h(C18270x1.A03(r0), "reg_backup_status_key", num.intValue());
        }
    }

    public void onResume() {
        super.onResume();
        if (A1K != null) {
            Log.i("ProfileCheckpointRegisterName/onResume/initializer not null");
            C621433s.A01(this, 0);
            C71223bl r2 = A1K;
            Handler handler = this.A1H;
            if (r2.A03) {
                handler.sendEmptyMessage(0);
            }
            r2.A02 = handler;
            A7B();
        }
        if (this.A09.A02() && this.A16 == null) {
            C621433s.A01(this, 0);
            Log.i("ProfileCheckpointRegisterName/resume reg verified; explicitly display continue screen");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1G);
    }
}
