package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0IT;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1FB;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass20D;
import X.AnonymousClass27N;
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
import X.AnonymousClass4CE;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4MR;
import X.AnonymousClass4MS;
import X.AnonymousClass4SG;
import X.AnonymousClass5GE;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5UX;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass5XU;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass66D;
import X.AnonymousClass68E;
import X.AnonymousClass68H;
import X.AnonymousClass68W;
import X.AnonymousClass694;
import X.AnonymousClass6B5;
import X.C005205m;
import X.C101835Gh;
import X.C10240hc;
import X.C103275Mg;
import X.C104015Ph;
import X.C105265Uf;
import X.C105525Vi;
import X.C106825aE;
import X.C107565bW;
import X.C111095hX;
import X.C116985rC;
import X.C1235268t;
import X.C124366Bz;
import X.C129496aP;
import X.C129526aS;
import X.C166677z5;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C183538qC;
import X.C19340zH;
import X.C197769dq;
import X.C27821ej;
import X.C28861ht;
import X.C29421in;
import X.C30191m3;
import X.C379724t;
import X.C39382Bt;
import X.C44152Uw;
import X.C44772Xk;
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
import X.C56602sG;
import X.C56612sH;
import X.C56882si;
import X.C56912sl;
import X.C56972sr;
import X.C59772xS;
import X.C60152y5;
import X.C613330g;
import X.C614930z;
import X.C616131n;
import X.C618232j;
import X.C619933b;
import X.C620233e;
import X.C620433g;
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
import X.C70033Zp;
import X.C71223bl;
import X.C71373c0;
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
import X.C89024bM;
import X.C89044bO;
import X.C89224c7;
import X.C993755m;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.whatsapp.Me;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.registration.passkeys.PasskeyFacade$checkPasskeyExists$1;
import com.whatsapp.registration.passkeys.PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1;
import com.whatsapp.util.Log;

public class RegisterName extends AnonymousClass1FB implements AnonymousClass66D {
    public static C71223bl A1m;
    public long A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public Button A04;
    public ImageView A05;
    public C116985rC A06;
    public C116985rC A07;
    public C116985rC A08;
    public C116985rC A09;
    public C116985rC A0A;
    public C116985rC A0B;
    public C116985rC A0C;
    public C116985rC A0D;
    public C116985rC A0E;
    public C116985rC A0F;
    public C116985rC A0G;
    public C44152Uw A0H;
    public C55912r7 A0I;
    public AnonymousClass5XU A0J;
    public AnonymousClass5WY A0K;
    public WaEditText A0L;
    public C49712gy A0M;
    public C614930z A0N;
    public C10240hc A0O;
    public C620433g A0P;
    public AnonymousClass2NN A0Q;
    public C44772Xk A0R;
    public AnonymousClass5UX A0S;
    public C64773Ex A0T;
    public C56602sG A0U;
    public C29421in A0V;
    public AnonymousClass5ZU A0W;
    public C56332ro A0X;
    public C613330g A0Y;
    public C64223Cq A0Z;
    public C56882si A0a;
    public C64213Cp A0b;
    public C622334f A0c;
    public AnonymousClass5ZR A0d;
    public C56542sA A0e;
    public C66473Lo A0f;
    public C625835r A0g;
    public AnonymousClass2W1 A0h;
    public C55272q5 A0i;
    public C72303dV A0j;
    public C620233e A0k;
    public AnonymousClass5GE A0l;
    public AnonymousClass3ZH A0m;
    public C46982cW A0n;
    public C49842hB A0o;
    public C89224c7 A0p;
    public AnonymousClass5IY A0q;
    public C27821ej A0r;
    public AnonymousClass5S9 A0s;
    public EmojiSearchProvider A0t;
    public C50102hd A0u;
    public AnonymousClass1VW A0v;
    public C56142rU A0w;
    public AnonymousClass4AF A0x;
    public AnonymousClass4FV A0y;
    public C66493Lq A0z;
    public C53202mi A10;
    public C66523Lt A11;
    public C66423Lj A12;
    public C45342Zq A13;
    public C619933b A14;
    public C197769dq A15;
    public C60152y5 A16;
    public C56452s0 A17;
    public C30191m3 A18;
    public C993755m A19;
    public C28861ht A1A;
    public C46132b8 A1B;
    public C103275Mg A1C;
    public C89024bM A1D;
    public C50152hi A1E;
    public C56912sl A1F;
    public AnonymousClass317 A1G;
    public RegistrationScrollView A1H;
    public C89044bO A1I;
    public C55092pm A1J;
    public C59772xS A1K;
    public AnonymousClass2QW A1L;
    public C53282mq A1M;
    public C618232j A1N;
    public C56502s5 A1O;
    public C101835Gh A1P;
    public C104015Ph A1Q;
    public C105265Uf A1R;
    public AnonymousClass4BG A1S;
    public AnonymousClass4BH A1T;
    public C45602aH A1U;
    public C183538qC A1V;
    public C183538qC A1W;
    public C183538qC A1X;
    public C183538qC A1Y;
    public Integer A1Z;
    public Integer A1a;
    public Integer A1b;
    public Integer A1c;
    public boolean A1d;
    public boolean A1e = false;
    public boolean A1f;
    public boolean A1g;
    public final Handler A1h;
    public final Handler A1i;
    public final AnonymousClass4CE A1j;
    public final AnonymousClass48T A1k;
    public final C166677z5 A1l;

    public RegisterName() {
        super(true, true);
        AnonymousClass68W.A00(this, 84);
        this.A1l = new AnonymousClass68H(this, 13);
        this.A0U = null;
        this.A1h = new AnonymousClass4MR(Looper.getMainLooper(), this);
        this.A1i = new AnonymousClass4MS(Looper.getMainLooper(), this);
        this.A1j = new AnonymousClass694(this, 11);
        this.A1k = new AnonymousClass6B5(this, 0);
    }

    public final void A7D() {
        C69263Wi r2 = this.A05;
        C101835Gh r6 = this.A1P;
        C53282mq r5 = this.A1M;
        C993755m r1 = new C993755m(r2, this.A0i, this, r5, r6);
        this.A19 = r1;
        C18270x1.A0w(r1, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if (r1 == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7F() {
        /*
            r7 = this;
            r2 = r7
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168010(0x7f070b0a, float:1.795031E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168008(0x7f070b08, float:1.7950306E38)
            float r4 = r1.getDimension(r0)
            r6 = 0
            r7.A1f = r6
            X.3ZH r0 = r7.A0m
            if (r0 == 0) goto L_0x0064
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass4SG.A2m(r7)
            boolean r0 = X.AnonymousClass331.A00(r0)
            if (r0 != 0) goto L_0x0064
            android.widget.ImageView r1 = r7.A05
            r0 = 1
            r1.setEnabled(r0)
            android.view.View r1 = r7.A02
            r0 = 8
            r1.setVisibility(r0)
            X.2ro r1 = r7.A0X
            X.3ZH r0 = r7.A0m
            java.io.File r0 = r1.A01(r0)
            X.C626936e.A06(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0055
            X.30g r1 = r7.A0Y
            X.3ZH r3 = r7.A0m
            android.graphics.Bitmap r1 = r1.A03(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0051
            r6 = 1
        L_0x0051:
            r7.A1f = r6
            if (r1 != 0) goto L_0x005e
        L_0x0055:
            X.5UX r1 = r7.A0S
            r0 = 2131232550(0x7f080726, float:1.8081212E38)
            android.graphics.Bitmap r1 = r1.A02(r7, r4, r0, r5)
        L_0x005e:
            android.widget.ImageView r0 = r7.A05
            r0.setImageBitmap(r1)
            return
        L_0x0064:
            android.widget.ImageView r0 = r7.A05
            r0.setEnabled(r6)
            android.view.View r0 = r7.A02
            r0.setVisibility(r6)
            android.graphics.Bitmap r1 = r7.A01
            if (r1 != 0) goto L_0x005e
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r5, r0)
            r7.A01 = r1
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.A7F():void");
    }

    public final boolean A7H() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        char c = 0;
        if (this.A0d.A08()) {
            int i4 = AnonymousClass0x2.A0F(this.A0d.A01).getInt("reg_skip_storage_perm", 0);
            i = R.string.f11nameremoved;
            if (i4 == 2) {
                i = R.string.f11nameremoved;
            }
            i2 = R.string.f11nameremoved;
            iArr = new int[1];
            i3 = R.drawable.permission_contacts_small;
        } else {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            iArr = new int[3];
            iArr[0] = R.drawable.permission_contacts_small;
            iArr[1] = R.drawable.permission_plus;
            c = 2;
            i3 = R.drawable.permission_storage;
        }
        iArr[c] = i3;
        return RequestPermissionActivity.A0o(this, "connect_with_friends", iArr, 17, i, i2, R.string.f11nameremoved, this.A0d.A0H(), !this.A0R.A00());
    }

    public void A5r() {
        if (!this.A1e) {
            this.A1e = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3X(r3, this, AnonymousClass4SG.A32(r3, this));
            AnonymousClass4SG.A3Y(r3, this, C86604Kt.A0V(r3));
            C379724t.A00(this, r3.A00.ALf());
            C88744aj r1 = C88744aj.A00;
            this.A0A = r1;
            this.A0J = AnonymousClass4SG.A2d(r3);
            this.A08 = r1;
            this.A0F = r1;
            this.A0G = r1;
            this.A0y = C86604Kt.A0Z(r3);
            this.A0c = (C622334f) r3.A0v.get();
            this.A0e = C86634Kw.A0e(r3);
            this.A0k = (C620233e) r3.AWq.get();
            this.A0M = (C49712gy) r3.AaZ.get();
            this.A1O = (C56502s5) r3.A00.A5N.get();
            this.A0r = C86604Kt.A0X(r3);
            this.A0q = AnonymousClass4SG.A2j(r3);
            this.A1A = (C28861ht) r3.AJH.get();
            this.A0K = (AnonymousClass5WY) r3.AUS.get();
            this.A09 = r1;
            this.A0w = (C56142rU) r3.A05.get();
            this.A0N = C86614Ku.A0O(r3);
            this.A0v = C86624Kv.A0S(r3);
            this.A0S = C86614Ku.A0Q(r3);
            this.A0T = C86604Kt.A0P(r3);
            this.A11 = AnonymousClass4SG.A2n(r3);
            this.A0W = C86604Kt.A0R(r3);
            this.A1B = (C46132b8) r3.A00.A9v.get();
            this.A0C = r1;
            this.A0V = C86604Kt.A0Q(r3);
            this.A1U = (C45602aH) r3.A9P.get();
            this.A0z = (C66493Lq) r3.AGL.get();
            this.A0b = (C64213Cp) r3.A8E.get();
            this.A1R = r3.A00.ANk();
            this.A0x = (AnonymousClass4AF) r3.ASX.get();
            this.A0X = (C56332ro) r3.A6Q.get();
            this.A0Z = C86604Kt.A0T(r3);
            this.A1N = (C618232j) r3.AJx.get();
            this.A0g = (C625835r) r3.AM8.get();
            this.A12 = (C66423Lj) r3.AUX.get();
            this.A10 = C86634Kw.A0j(r3);
            this.A1E = A2X.AD3();
            this.A0R = C86614Ku.A0P(r3);
            this.A0t = AnonymousClass4SG.A2k(r3);
            this.A0u = (C50102hd) r3.A00.A50.get();
            this.A14 = C86624Kv.A0V(r3);
            this.A0j = C86614Ku.A0a(r3);
            this.A17 = (C56452s0) r3.ARi.get();
            this.A18 = C86634Kw.A0o(r3);
            this.A1G = C86614Ku.A0i(r3);
            this.A0d = C86614Ku.A0V(r3);
            this.A13 = r3.AoK();
            this.A1S = (AnonymousClass4BG) A2X.A43.get();
            this.A1T = (AnonymousClass4BH) A2X.A44.get();
            this.A0I = (C55912r7) r3.ARR.get();
            this.A1J = AnonymousClass4SG.A2o(r3);
            this.A0P = C86634Kw.A0W(r3);
            this.A1L = (AnonymousClass2QW) r3.A8H.get();
            this.A0B = (C116985rC) r3.AOk.get();
            this.A0E = (C116985rC) r3.AOl.get();
            this.A0n = (C46982cW) r3.A8M.get();
            C129496aP builderWithExpectedSize = C129526aS.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(C88834as.A3F());
            builderWithExpectedSize.add((Object) r3.A00.AMj());
            this.A1P = new C101835Gh(builderWithExpectedSize.build());
            this.A1F = (C56912sl) r3.ATe.get();
            this.A0o = r3.AkP();
            this.A15 = (C197769dq) r3.AQB.get();
            this.A16 = C86614Ku.A0g(r3);
            this.A1K = r3.AqS();
            this.A06 = r1;
            this.A0h = (AnonymousClass2W1) r3.AM9.get();
            this.A07 = r1;
            this.A1X = C72343dZ.A00(A2X.A4T);
            this.A0Y = C86634Kw.A0a(r3);
            this.A0f = C86644Kx.A0U(r3);
            this.A0Q = (AnonymousClass2NN) r3.A00.A7i.get();
            this.A1V = C72343dZ.A00(r3.A0o);
            this.A0a = (C56882si) r3.A6h.get();
            this.A1M = (C53282mq) r3.AI9.get();
            this.A0i = (C55272q5) r3.AMB.get();
            this.A0O = (C10240hc) r3.AG8.get();
            this.A1Q = (C104015Ph) r3.A00.A5j.get();
            this.A0D = r1;
            this.A1W = C72343dZ.A00(A2X.A0S);
            this.A0l = r3.A00.ALS();
            this.A1C = new C103275Mg((C56612sH) r3.ASO.get());
            this.A1Y = C72343dZ.A00(r3.A00.ACF);
            this.A0H = (C44152Uw) A2X.A1q.get();
        }
    }

    public C183538qC A74() {
        return new C72333dY(this.A1G, (AnonymousClass4C1) null);
    }

    public void A79() {
        Log.i("RegisterName/start");
        Editable text = this.A0L.getText();
        C626936e.A06(text);
        String trim = text.toString().trim();
        if (C106825aE.A02(trim, C39382Bt.A01)) {
            Log.w("RegisterName/checkmarks in pushname");
            Boo(PushnameEmojiBlacklistDialogFragment.A00(trim));
        } else if (trim.length() == 0) {
            Log.w("RegisterName/no-pushname");
            this.A05.A0H(R.string.f11nameremoved, 0);
        } else {
            Log.i("RegisterName//showNextScreen");
            PasskeyFacade B05 = this.A1S.B05(this.A1T.B06(1));
            if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A1R.A02), "reg_abprop_passkey_create_education_screen") && B05.A03()) {
                Log.i("RegisterName//maybeShowPasskeyCreateEducationScreen");
                C621433s.A01(this, 22);
                C124366Bz r0 = new C124366Bz(this, 9);
                C616131n.A02((C85494Gl) null, new PasskeyFacade$checkPasskeyExists$1(B05, (C84814Du) null, r0), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
            } else if (this.A0o.A01()) {
                Log.i("RegisterName//maybeShowRegistrationEmailCaptureScreen");
                C621433s.A01(this, 22);
                C49842hB r3 = this.A0o;
                r3.A02.A02(new AnonymousClass3M4(r3, new C124366Bz(this, 7)));
            } else {
                A7E();
            }
        }
    }

    public void A7A() {
        this.A0e.A08(false);
        this.A0i.A02();
        this.A0Z.A05();
        A75();
    }

    public final void A7B() {
        Log.i("restore>RegisterName/checking for google and local backups");
        Intent className = C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
        className.setAction("action_show_restore_one_time_setup");
        startActivityForResult(className, 14);
    }

    public final void A7E() {
        C71223bl r2 = A1m;
        if (r2 == null || r2.A03) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("RegisterName/check-initializer, null?");
            C18260x0.A1V(A0o2, AnonymousClass000.A1X(r2));
            C71223bl A002 = this.A0H.A00(this.A1h, this.A1k);
            A1m = A002;
            A002.A01 = this.A00;
            C86624Kv.A1L(this.A04, this, 30);
            C621433s.A01(this, 0);
            if (((CompoundButton) C005205m.A00(this, R.id.cbx_app_shortcut)).isChecked()) {
                AnonymousClass27N.A00(this, getString(R.string.f11nameremoved));
            }
            View view = this.A03;
            if (view != null) {
                view.setVisibility(4);
            }
            C18270x1.A0i(AnonymousClass4SG.A2P(this), "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
            C18270x1.A0j(C18270x1.A03(this.A09), "account_switching_logged_out_phone_number", (String) null);
            C18270x1.A0j(AnonymousClass4SG.A2P(this), "account_switching_banned_account_lid", (String) null);
            C18270x1.A0j(AnonymousClass4SG.A2P(this), "account_switching_banned_account_phone_user_jid", (String) null);
            this.A1i.sendEmptyMessageDelayed(0, 600000);
            this.A1O.A01("home");
        }
    }

    public final void A7G(Integer num, Integer num2) {
        if (this.A0d.A0E() && this.A1c.intValue() == 1) {
            this.A1c = num;
        }
        if (this.A0R.A00() && this.A1b.intValue() == 1) {
            this.A1b = num2;
        }
    }

    public void onBackPressed() {
        C89224c7 r0 = this.A0p;
        if (r0 != null && r0.isShowing()) {
            this.A0p.dismiss();
        } else if (this.A0N.A0B(false)) {
            Log.i("RegisterName/onBackPressed/is adding new account");
            AnonymousClass36l.A0E(this, this.A09, this.A0A);
        } else {
            C111095hX.A06(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3.getBoolean("started_gdrive_new_user_activity", false) == false) goto L_0x0019;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v2, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r2 = r27
            r3 = r28
            super.onCreate(r3)
            r1 = 2131892911(0x7f121aaf, float:1.9420584E38)
            r2.setTitle(r1)
            r4 = 0
            if (r28 == 0) goto L_0x0019
            java.lang.String r0 = "started_gdrive_new_user_activity"
            boolean r3 = r3.getBoolean(r0, r4)
            r0 = 1
            if (r3 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2.A1g = r0
            android.content.SharedPreferences r3 = X.AnonymousClass1Hf.A27(r2)
            java.lang.String r0 = "pref_profile_checkpoint_name"
            r5 = 0
            java.lang.String r0 = r3.getString(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0041
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName"
            r3.setClassName(r1, r0)
        L_0x003a:
            r2.startActivity(r3)
            r2.finish()
            return
        L_0x0041:
            X.5rC r0 = r2.A0F
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "RegisterName/create/setting up new reg flow/build is smb"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5rC r0 = r2.A0F
            r0.A04()
            java.lang.String r0 = "getSmbRegistrationLayoutId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x005a:
            java.lang.String r0 = "RegisterName/create/setting up old reg flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131625895(0x7f0e07a7, float:1.887901E38)
            r2.setContentView((int) r0)
            X.33j r6 = r2.A00
            android.view.View r3 = r2.A00
            r10 = 2131434319(0x7f0b1b4f, float:1.8490449E38)
            X.30z r0 = r2.A0N
            boolean r13 = r0.A0B(r4)
            r11 = r4
            r12 = r4
            r7 = r3
            r8 = r2
            r9 = r6
            X.AnonymousClass36l.A0K(r7, r8, r9, r10, r11, r12, r13)
            int r3 = X.AnonymousClass4SG.A2K(r2)
            r0 = 2
            if (r3 == r0) goto L_0x0094
            r0 = 3
            if (r3 != r0) goto L_0x008e
            java.lang.String r0 = "RegisterName/create/registration already verified bounce to main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0089:
            android.content.Intent r3 = X.C627736r.A03(r2)
            goto L_0x003a
        L_0x008e:
            java.lang.String r0 = "RegisterName/create/bad-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0089
        L_0x0094:
            X.33p r0 = r2.A09
            java.lang.String r7 = r0.A0a()
            X.C107405bG.A05(r2)
            r6 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.view.View r3 = X.C005205m.A00(r2, r6)
            com.whatsapp.WaTextView r3 = (com.whatsapp.WaTextView) r3
            r0 = 2131432958(0x7f0b15fe, float:1.8487688E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r2.A0L = r0
            r0 = 2131432950(0x7f0b15f6, float:1.8487672E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.A04 = r0
            r0 = 2131428685(0x7f0b054d, float:1.8479021E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r2, r0)
            r2.A05 = r0
            r3.setText(r1)
            r0 = 2131427951(0x7f0b026f, float:1.8477533E38)
            android.widget.TextView r1 = X.C005205m.A01(r2, r0)
            r0 = 2131892910(0x7f121aae, float:1.9420582E38)
            r1.setText(r0)
            X.1VW r0 = r2.A0v
            X.AnonymousClass36l.A0M(r2, r0, r6)
            android.widget.Button r1 = r2.A04
            r0 = 26
            X.AnonymousClass0x2.A0y(r1, r2, r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r0 = "RegisterName/create/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.317 r1 = r2.A1G
            r0 = 1
            r1.A0B(r0, r0)
            android.content.Intent r3 = X.C627736r.A04(r2)
            goto L_0x003a
        L_0x00f4:
            r1 = 8
            r0 = 2131433741(0x7f0b190d, float:1.8489276E38)
            X.C86654Ky.A0s(r2, r0, r1)
            r0 = 2131428625(0x7f0b0511, float:1.84789E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r4)
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            android.view.View r13 = r2.findViewById(r0)
            android.widget.ImageButton r13 = (android.widget.ImageButton) r13
            if (r13 == 0) goto L_0x018f
            X.1VX r0 = r2.A0D
            r17 = r0
            X.5Wv r0 = r2.A0B
            r16 = r0
            X.2qk r15 = r2.A03
            X.5Y0 r14 = r2.A0C
            X.1ej r12 = r2.A0r
            X.33i r11 = r2.A08
            X.33j r10 = r2.A00
            X.5IY r9 = r2.A0q
            com.whatsapp.emoji.search.EmojiSearchProvider r8 = r2.A0t
            X.33p r7 = r2.A09
            X.2y5 r6 = r2.A16
            r0 = 2131431144(0x7f0b0ee8, float:1.8484009E38)
            android.view.View r4 = r2.findViewById(r0)
            X.8my r4 = (X.C181568my) r4
            com.whatsapp.WaEditText r0 = r2.A0L
            X.4c7 r1 = new X.4c7
            r22 = r14
            r23 = r8
            r24 = r17
            r25 = r6
            r26 = r16
            r20 = r9
            r21 = r12
            r18 = r7
            r19 = r10
            r16 = r0
            r17 = r11
            r14 = r15
            r15 = r4
            r12 = r2
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.A0p = r1
            X.4CE r0 = r2.A1j
            r1.A0C(r0)
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r9 = r2.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r9 = (com.whatsapp.emoji.search.EmojiSearchContainer) r9
            X.4c7 r8 = r2.A0p
            X.5Y0 r7 = r2.A0C
            X.1ej r6 = r2.A0r
            X.33j r4 = r2.A00
            X.2y5 r0 = r2.A16
            X.5S9 r1 = new X.5S9
            r13 = r0
            r11 = r7
            r12 = r9
            r9 = r8
            r10 = r6
            r6 = r1
            r7 = r2
            r8 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.A0s = r1
            r0 = 7
            X.AnonymousClass5S9.A00(r1, r2, r0)
            X.4c7 r4 = r2.A0p
            r1 = 32
            X.3Zp r0 = new X.3Zp
            r0.<init>(r2, r1)
            r4.A0E = r0
        L_0x018f:
            android.widget.ImageView r1 = r2.A05
            r0 = 2131896250(0x7f1227ba, float:1.9427356E38)
            X.C18300x5.A13(r2, r1, r0)
            android.widget.ImageView r1 = r2.A05
            r0 = 27
            X.AnonymousClass0x2.A0y(r1, r2, r0)
            r0 = 2131428686(0x7f0b054e, float:1.8479023E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.A02 = r0
            X.5ZR r0 = r2.A0d
            boolean r0 = r0.A0E()
            int r0 = X.C18280x3.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A1c = r0
            X.2Xk r0 = r2.A0R
            boolean r0 = r0.A00()
            int r0 = X.C18280x3.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A1b = r0
            X.3bl r0 = A1m
            if (r0 == 0) goto L_0x02a4
            X.1RR r0 = X.AnonymousClass4SG.A2c(r2)
            r2.A0m = r0
            r2.A7F()
            r4 = 0
            X.C621433s.A01(r2, r4)
        L_0x01d8:
            X.33j r1 = r2.A00
            com.whatsapp.WaEditText r0 = r2.A0L
            X.C107555bV.A09(r0, r1)
            r0 = 2131431650(0x7f0b10e2, float:1.8485035E38)
            android.widget.TextView r12 = X.C005205m.A01(r2, r0)
            com.whatsapp.WaEditText r9 = r2.A0L
            X.5Y0 r8 = r2.A0C
            X.33i r7 = r2.A08
            X.33j r6 = r2.A00
            X.2y5 r1 = r2.A16
            X.487 r0 = r2.A0B
            r5 = 25
            X.52T r10 = new X.52T
            r20 = r4
            r21 = r4
            r22 = r4
            r19 = r4
            r17 = r1
            r18 = r5
            r15 = r0
            r16 = r8
            r13 = r7
            r14 = r6
            r11 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9.addTextChangedListener(r10)
            com.whatsapp.WaEditText r1 = r2.A0L
            r0 = 1
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            X.C109095e4.A00(r1, r0, r5)
            r0 = 2131427361(0x7f0b0021, float:1.8476336E38)
            android.view.View r6 = r2.findViewById(r0)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2131434300(0x7f0b1b3c, float:1.849041E38)
            android.view.View r5 = r2.findViewById(r0)
            r0 = 2131427362(0x7f0b0022, float:1.8476338E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 2131432943(0x7f0b15ef, float:1.8487658E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.registration.RegistrationScrollView r0 = (com.whatsapp.registration.RegistrationScrollView) r0
            r2.A1H = r0
            if (r0 == 0) goto L_0x023d
            r0.setTopAndBottomScrollingElevation(r6, r3, r5, r1)
        L_0x023d:
            X.4FS r1 = r2.A04
            r0 = 31
            X.C86624Kv.A1L(r1, r2, r0)
            X.5Uf r0 = r2.A1R
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0251
            com.whatsapp.WaEditText r0 = r2.A0L
            r0.A07(r4)
        L_0x0251:
            X.5rC r0 = r2.A0D
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x025f
            com.whatsapp.WaEditText r1 = r2.A0L
            r0 = 6
            X.AnonymousClass695.A00(r1, r2, r0)
        L_0x025f:
            X.5XU r0 = r2.A0J
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x028f
            java.lang.String r0 = "RegisterName/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Lt r1 = r2.A11
            X.33b r0 = r2.A14
            X.C621533t.A02(r2, r1, r0)
        L_0x0273:
            X.317 r3 = r2.A1G
            r1 = 2
            r0 = 1
            r3.A0B(r1, r0)
            r0 = 38
            X.681 r1 = X.AnonymousClass681.A00(r2, r0)
            r2.A0U = r1
            X.1in r0 = r2.A0V
            r0.A06(r1)
            X.33p r1 = r2.A09
            byte[] r0 = new byte[r4]
            r1.A23(r0)
            return
        L_0x028f:
            X.5XU r0 = r2.A0J
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0273
            java.lang.String r0 = "RegisterName/sw-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Lt r1 = r2.A11
            X.33b r0 = r2.A14
            X.C621533t.A03(r2, r1, r0)
            goto L_0x0273
        L_0x02a4:
            r4 = 0
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x02bb
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "google_migrate_import_canceled"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x02bb
            r2.A78(r4)
            return
        L_0x02bb:
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x02d1
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "google_migrate_import_success"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x02d1
            r2.A7A()
            return
        L_0x02d1:
            X.33p r0 = r2.A09
            boolean r0 = r0.A2A()
            if (r0 != 0) goto L_0x02fa
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r2)
            java.lang.String r0 = "first_party_migration_initiated"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x02fa
            X.1VW r1 = r2.A0v
            r0 = 2989(0xbad, float:4.188E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02fa
            android.content.Intent r1 = X.C627736r.A18(r2, r5, r4, r4)
            r0 = 19
            r2.startActivityForResult(r1, r0)
            goto L_0x01d8
        L_0x02fa:
            boolean r0 = r2.A7H()
            if (r0 == 0) goto L_0x01d8
            r2.A7D()
            goto L_0x01d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i == 0) {
            Log.i("RegisterName/dialog/initprogress");
            if (A1m == null) {
                Log.w("RegisterName/dialog/initprogress/init-null/remove");
                AnonymousClass000.A0A().postDelayed(new C70033Zp(this, 33), 3);
            }
            C89024bM r1 = new C89024bM(this.A08, this.A06, this.A00, this);
            this.A1D = r1;
            r1.setCancelable(false);
            return this.A1D;
        } else if (i2 == 1) {
            Log.w("RegisterName/dialog/failed-net");
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0g(C86604Kt.A0l(this, R.string.f11nameremoved));
            C1235268t.A03(A002, this, 89, R.string.f11nameremoved);
            return A002.create();
        } else if (i2 == 22) {
            return AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
        } else {
            if (i2 == 103) {
                Log.i("RegisterName/dialog/restore");
                AnonymousClass68E r6 = new AnonymousClass68E(this, this.A08, this.A06, this.A00, this.A0g, this.A0j, this.A1G, this, 0);
                this.A1I = r6;
                r6.setCancelable(false);
                C620733j r62 = this.A00;
                Log.d("RegisterName//restorebackupdialog/lastbackup/look at files");
                long A0D2 = this.A0g.A0D();
                if (A0D2 != -1) {
                    C18260x0.A10("RegisterName//restorebackupdialog/lastbackup/fromfiles/set to ", AnonymousClass001.A0o(), A0D2);
                }
                this.A04.BkM(new C71373c0(5, C107565bW.A03(r62, A0D2).toString(), this));
                return this.A1I;
            } else if (i2 != 109) {
                return super.onCreateDialog(i2);
            } else {
                Log.w("RegisterName/dialog/cant-connect");
                AnonymousClass4FS r14 = this.A04;
                return AnonymousClass36l.A02(this, this.A0K, this.A07, this.A08, this.A0d, this.A10, this.A1F, r14);
            }
        }
    }

    public void A75() {
        Me A032;
        if (C86614Ku.A0D(this) == null || !getIntent().getBooleanExtra("debug", false)) {
            A032 = this.A1G.A03();
        } else {
            Me A2b = AnonymousClass4SG.A2b(this);
            C626936e.A06(A2b);
            A032 = new Me(A2b.cc, A2b.number, this.A09.A0a());
        }
        if (A032.jabber_id == null) {
            Log.e("RegisterName/messagestoreverified/missing-params bounce to regphone");
            this.A1G.A0B(1, true);
            A6T(C627736r.A04(this), true);
            return;
        }
        C56972sr r1 = this.A01;
        r1.A0P();
        if (!r1.A0Z(A032, "me")) {
            finish();
            return;
        }
        this.A01.A0R(A032);
        ((AnonymousClass338) this.A1V.get()).A02(this);
        C105525Vi.A00(this.A0J, this.A09);
        Log.i("RegisterName/set_dirty");
        this.A11.A0z = true;
        this.A1G.A07();
        this.A11.A04();
        Log.i("RegisterName//msgstoreverified/group_sync_required");
        this.A0z.A0C(3, true);
        this.A00 = SystemClock.uptimeMillis();
        this.A0m = C86634Kw.A0V(this.A01);
        this.A17.A01(AnonymousClass4SG.A2m(this), 0, 2);
        if (AnonymousClass1Hf.A27(this).getLong("message_store_verified_time", 0) == 0) {
            C18260x0.A0M(this.A09, "message_store_verified_time", System.currentTimeMillis());
        }
        A7F();
        if (this.A1I != null) {
            if (this.A0j.A01() != 0) {
                Log.i("RegisterName/restoredialog/congrats");
                this.A1I.A00(2);
            } else {
                Log.i("RegisterName/restoredialog/empty-msg-restore");
                if (!this.A1g && this.A0O.A0n()) {
                    Intent A072 = C18320x8.A07();
                    A072.setClassName(getPackageName(), "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                    BpY(A072, 15);
                    this.A1g = true;
                }
                C621433s.A00(this, 103);
            }
        } else if (this.A0d.A02("android.permission.GET_ACCOUNTS") != 0) {
            Log.i("RegisterName/delay google drive setup due to lack of permissions");
            AnonymousClass4SG.A3f(this);
        }
        ((C48242ea) this.A1W.get()).A00();
        C86624Kv.A1L(this.A04, this, 34);
        if (!C18280x3.A1W(AnonymousClass0x2.A0F(this.A1R.A02), "reg_abprop_passkey_create_education_screen")) {
            PasskeyFacade B05 = this.A1S.B05(this.A1T.B06(1));
            C124366Bz r0 = new C124366Bz(this, 8);
            C616131n.A02((C85494Gl) null, new PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(this, B05, (C84814Du) null, r0), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        }
        C86624Kv.A1L(this.A04, this, 35);
    }

    public void A78(boolean z) {
        super.A78(z);
        C89044bO r1 = this.A1I;
        if (r1 != null && z) {
            r1.A00(1);
        }
    }

    public final void A7C() {
        View view;
        long A0A2 = AnonymousClass0x2.A0A(AnonymousClass1Hf.A27(this), "com.whatsapp.registername.initializer_start_time");
        if (A0A2 > 0 && AnonymousClass0x9.A05(A0A2) > 600000 && (view = this.A03) != null) {
            view.setVisibility(0);
        }
    }

    public void BaF(int i) {
        Intent intent;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RegisterName/onRestoreStateResult/result = ");
        C18260x0.A1L(A0o2, C993755m.A00(i));
        if (i == 0) {
            A7B();
        } else if (i == 1) {
            AnonymousClass33p r0 = this.A09;
            C18270x1.A0i(C18270x1.A03(r0), "google_migrate_import_start_time", System.currentTimeMillis());
            try {
                intent = AnonymousClass0x9.A08(this, Class.forName("com.whatsapp.migration.android.view.GoogleMigrateImporterActivity"));
            } catch (ClassNotFoundException unused) {
                Log.e("GoogleMigrateUtil/createStartIntent/class not found");
                intent = null;
            }
            startActivityForResult(intent, 18);
        } else if (i == 2) {
            AnonymousClass33p r02 = this.A09;
            C18270x1.A0i(C18270x1.A03(r02), "direct_migration_start_time", SystemClock.elapsedRealtime());
            long A002 = AnonymousClass345.A00(this, "com.whatsapp.w4b");
            C18260x0.A12("RegisterName/checkForMigrateFromConsumerDirectly/providerAppVersionCode = ", AnonymousClass001.A0o(), A002);
            this.A1L.A01.A0A = Long.valueOf(A002);
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity");
            startActivityForResult(A072, 16);
        } else if (i == 3) {
            C621433s.A01(this, 107);
        } else if (i == 4) {
            this.A1O.A03("profile_photo", "no_tap");
            A7A();
            this.A1Z = 4;
            AnonymousClass4SG.A3f(this);
        } else {
            throw C86604Kt.A0h("restore>RegisterName/onRestoreStateResult/result is not recognized/result = ", AnonymousClass001.A0o(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r10.A18.A0G(r10.A0m) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        A7F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r1 = r10.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r1.A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        throw X.AnonymousClass001.A0g("logUserAction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        A7A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        A78(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegisterName/activity-result request:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " result:"
            X.C18260x0.A0y(r0, r1, r12)
            r7 = 5
            r9 = -1
            r6 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r8 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2 = 2
            r5 = 1
            switch(r11) {
                case 12: goto L_0x0027;
                case 13: goto L_0x006a;
                case 14: goto L_0x0153;
                case 15: goto L_0x01f3;
                case 16: goto L_0x01fe;
                case 17: goto L_0x00b8;
                case 18: goto L_0x00db;
                case 19: goto L_0x0117;
                case 20: goto L_0x013a;
                case 21: goto L_0x0248;
                case 22: goto L_0x0248;
                default: goto L_0x0023;
            }
        L_0x0023:
            super.onActivityResult(r11, r12, r13)
        L_0x0026:
            return
        L_0x0027:
            if (r12 != r9) goto L_0x0058
            java.lang.String r2 = "profile_photo"
            if (r13 == 0) goto L_0x0269
            java.lang.String r0 = "is_reset"
            boolean r0 = r13.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x008c
            X.2s5 r1 = r10.A1O
            java.lang.String r0 = "did_not_set"
            r1.A04(r2, r0)
            X.1m3 r1 = r10.A18
            X.3ZH r0 = r10.A0m
            r1.A0E(r0)
            r10.A7F()
            X.5rC r1 = r10.A0D
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0026
            r1.A04()
            java.lang.String r0 = "logUserAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0058:
            X.5rC r1 = r10.A0D
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0026
            r1.A04()
            java.lang.String r0 = "logUserAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x006a:
            X.1m3 r0 = r10.A18
            X.AnonymousClass4SG.A3m(r0)
            if (r12 == r9) goto L_0x0099
            if (r12 != 0) goto L_0x0026
            if (r13 == 0) goto L_0x007a
            X.1m3 r0 = r10.A18
            r0.A04(r13, r10)
        L_0x007a:
            X.5rC r1 = r10.A0D
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x024c
            r1.A04()
            java.lang.String r0 = "logUserAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x008c:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r13.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x0250
            X.1m3 r0 = r10.A18
            X.AnonymousClass4SG.A3m(r0)
        L_0x0099:
            X.1m3 r1 = r10.A18
            X.3ZH r0 = r10.A0m
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x00a6
            r10.A7F()
        L_0x00a6:
            X.5rC r1 = r10.A0D
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0026
            r1.A04()
            java.lang.String r0 = "logUserAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00b8:
            r10.A7G(r1, r1)
            r10.A7D()
            X.5Uf r0 = r10.A1R
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00cb
            com.whatsapp.WaEditText r0 = r10.A0L
            r0.A07(r4)
        L_0x00cb:
            X.2Xk r0 = r10.A0R
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0026
            X.4FS r1 = r10.A04
            r0 = 31
            X.C86624Kv.A1L(r1, r10, r0)
            return
        L_0x00db:
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r6 = X.AnonymousClass1Hf.A27(r10)
            java.lang.String r3 = "google_migrate_import_start_time"
            long r6 = X.AnonymousClass0x2.A0B(r6, r3)
            long r0 = r0 - r6
            if (r12 != r2) goto L_0x00f5
            X.AnonymousClass4SG.A3p(r10, r0)
            java.lang.String r0 = "RegisterName/activity-result/import-via-google-migrate/import-canceled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x014f
        L_0x00f5:
            if (r12 != r5) goto L_0x0100
            X.AnonymousClass4SG.A3p(r10, r0)
            java.lang.String r0 = "RegisterName/activity-result/import-via-google-migrate/import-succeeded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x012a
        L_0x0100:
            if (r12 != r8) goto L_0x0026
            X.317 r0 = r10.A1G
            r0.A09()
            android.content.Intent r1 = X.C627736r.A04(r10)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            r1.putExtra(r0, r5)
            r10.startActivity(r1)
            r10.finish()
            return
        L_0x0117:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass4SG.A2P(r10)
            java.lang.String r0 = "chat_transfer_finished"
            X.C18270x1.A0l(r1, r0, r5)
            if (r12 != r9) goto L_0x012e
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from donor entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A7H()
        L_0x012a:
            r10.A7A()
            return
        L_0x012e:
            if (r12 != 0) goto L_0x0026
            boolean r0 = r10.A7H()
            if (r0 == 0) goto L_0x0026
            r10.A7D()
            return
        L_0x013a:
            if (r12 != r5) goto L_0x0140
            r10.A7B()
            return
        L_0x0140:
            if (r12 != r2) goto L_0x014d
            r0 = 0
            android.content.Intent r1 = X.C627736r.A18(r10, r0, r4, r5)
            r0 = 19
            r10.startActivityForResult(r1, r0)
            return
        L_0x014d:
            if (r12 != r8) goto L_0x0026
        L_0x014f:
            r10.A78(r4)
            return
        L_0x0153:
            X.5Uf r0 = r10.A1R
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0160
            com.whatsapp.WaEditText r0 = r10.A0L
            r0.A07(r4)
        L_0x0160:
            if (r12 != r8) goto L_0x0187
            java.lang.String r0 = "restore>RegisterName/activity-result backup found and is being restored."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A7A()
            r10.A1Z = r1
            X.4bO r0 = r10.A1I
            if (r0 == 0) goto L_0x0173
            r0.hide()
        L_0x0173:
            X.4FS r1 = r10.A04
            r0 = 31
            X.C86624Kv.A1L(r1, r10, r0)
        L_0x017a:
            X.2s5 r2 = r10.A1O
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "no_tap"
            r2.A03(r1, r0)
            r10.A7G(r3, r3)
            return
        L_0x0187:
            if (r12 != 0) goto L_0x0194
            java.lang.String r0 = "restore>RegisterName/activity-result restore canceled because Google Play Services were not available on the device"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ez r0 = r10.A01
            r0.BsA()
            goto L_0x017a
        L_0x0194:
            java.lang.String r1 = "skip"
            if (r12 != r2) goto L_0x01ae
            java.lang.String r0 = "restore>RegisterName/activity-result backup found but not restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A78(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r10.A1Z = r0
            X.2s5 r0 = r10.A1O
            java.lang.String r2 = "backup_found"
        L_0x01aa:
            r0.A03(r2, r1)
            goto L_0x017a
        L_0x01ae:
            java.lang.String r2 = "no_backup_found"
            if (r12 != r5) goto L_0x01c8
            java.lang.String r0 = "restore>RegisterName/activity-result no google backup found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A78(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r10.A1Z = r0
            X.2s5 r1 = r10.A1O
            java.lang.String r0 = "next"
            r1.A03(r2, r0)
            goto L_0x017a
        L_0x01c8:
            if (r12 != r6) goto L_0x01d6
            r10.A78(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r10.A1Z = r0
            X.2s5 r0 = r10.A1O
            goto L_0x01aa
        L_0x01d6:
            if (r12 != r7) goto L_0x01e1
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from receiver entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A7A()
            goto L_0x017a
        L_0x01e1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RegisterName/activity-result unknown result code "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " from RestoreFromBackupActivity."
            X.C18260x0.A1K(r1, r0)
            goto L_0x017a
        L_0x01f3:
            java.lang.String r0 = "RegisterName/activity-result/restore_from_backup/remove"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 103(0x67, float:1.44E-43)
            X.C621433s.A00(r10, r0)
            return
        L_0x01fe:
            if (r12 != r5) goto L_0x0242
            java.lang.String r0 = "RegisterName/activity-result/successfully-restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2og r0 = r10.A0A
            java.lang.String r1 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0225
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x0225
            com.whatsapp.WaEditText r0 = r10.A0L
            r0.setText(r1)
            com.whatsapp.WaEditText r1 = r10.A0L
            int r0 = r1.length()
            r1.setSelection(r0)
        L_0x0225:
            r10.A7A()
        L_0x0228:
            X.2QW r4 = r10.A1L
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r10)
            java.lang.String r0 = "direct_migration_start_time"
            long r0 = X.AnonymousClass0x2.A0A(r1, r0)
            long r2 = r2 - r0
            X.1au r1 = r4.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A09 = r0
            return
        L_0x0242:
            if (r12 != r2) goto L_0x0228
            r10.A7B()
            goto L_0x0228
        L_0x0248:
            r10.A7E()
            return
        L_0x024c:
            r0 = 0
            r10.A1a = r0
            return
        L_0x0250:
            java.lang.String r1 = "photo_source"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x0269
            android.os.Bundle r0 = r13.getExtras()
            X.C626936e.A06(r0)
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A1a = r0
        L_0x0269:
            X.2s5 r1 = r10.A1O
            java.lang.String r0 = "set_photo"
            r1.A04(r2, r0)
            X.1m3 r1 = r10.A18
            r0 = 13
            r1.A05(r13, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89024bM r1 = this.A1D;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
            C89024bM r2 = this.A1D;
            r2.A01.A03 = r2.findViewById(R.id.pay_ed_contact_support);
            A7C();
        }
        C89044bO r12 = this.A1I;
        if (r12 != null) {
            r12.onCreate(r12.onSaveInstanceState());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (isFinishing()) {
            this.A14.A07();
        }
        C56602sG r1 = this.A0U;
        if (r1 != null) {
            this.A0V.A07(r1);
            this.A0U = null;
        }
        C993755m r12 = this.A19;
        if (r12 != null) {
            r12.A00 = null;
            r12.A0D(true);
            this.A19 = null;
        }
        this.A1E.A00();
        RegistrationScrollView registrationScrollView = this.A1H;
        if (registrationScrollView != null) {
            registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A09);
            if (registrationScrollView.A02 != null) {
                registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A02);
            }
            this.A1H = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A1J.A02("register-name");
            this.A1E.A01(this, this.A1J, "register-name");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A1G.A09();
            AnonymousClass4SG.A35(this);
            return true;
        }
    }

    public void onPause() {
        Handler handler;
        super.onPause();
        C71223bl r2 = A1m;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
        Integer num = this.A1Z;
        if (num != null) {
            AnonymousClass33p r0 = this.A09;
            C18270x1.A0h(C18270x1.A03(r0), "reg_backup_status_key", num.intValue());
        }
        Integer num2 = this.A1a;
        if (num2 != null) {
            AnonymousClass33p r02 = this.A09;
            C18270x1.A0h(C18270x1.A03(r02), "reg_profile_pic_source_key", num2.intValue());
        }
        if (this.A1d) {
            C18270x1.A0f(AnonymousClass4SG.A2P(this), "reg_profile_pic_tapped_key");
        }
    }

    public void onResume() {
        super.onResume();
        if (A1m != null) {
            C621433s.A01(this, 0);
            C71223bl r2 = A1m;
            Handler handler = this.A1h;
            if (r2.A03) {
                handler.sendEmptyMessage(0);
            }
            r2.A02 = handler;
            A7C();
        }
        if (this.A09.A02() && this.A1D == null) {
            C621433s.A01(this, 0);
            Log.i("RegisterName/resume reg verified; explicitly display continue screen");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1g);
    }
}
