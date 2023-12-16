package com.whatsapp.biz;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1NI;
import X.AnonymousClass32Y;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CK;
import X.AnonymousClass4H9;
import X.AnonymousClass4HI;
import X.AnonymousClass4HY;
import X.AnonymousClass4KA;
import X.AnonymousClass5ZB;
import X.AnonymousClass5ZU;
import X.C105355Up;
import X.C106185Xy;
import X.C107695bk;
import X.C108915dl;
import X.C111095hX;
import X.C28071fd;
import X.C29241iV;
import X.C29291ia;
import X.C29301ib;
import X.C29421in;
import X.C48372en;
import X.C54232oO;
import X.C55702qm;
import X.C56602sG;
import X.C56972sr;
import X.C620433g;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C64443Dm;
import X.C66473Lo;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class BusinessProfileExtraFieldsActivity extends C89644eZ {
    public AnonymousClass5ZB A00;
    public C620433g A01;
    public C29291ia A02;
    public C48372en A03;
    public C106185Xy A04;
    public C29301ib A05;
    public C29421in A06;
    public AnonymousClass5ZU A07;
    public C620733j A08;
    public C66473Lo A09;
    public AnonymousClass3ZH A0A;
    public C29241iV A0B;
    public UserJid A0C;
    public C28071fd A0D;
    public C105355Up A0E;
    public Integer A0F;
    public boolean A0G;
    public final AnonymousClass4CK A0H;
    public final C54232oO A0I;
    public final C56602sG A0J;
    public final C55702qm A0K;

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A0D = (C28071fd) A002.AJC.get();
            this.A07 = C64333Db.A28(A002);
            this.A08 = C64333Db.A2t(A002);
            this.A06 = (C29421in) A002.A6P.get();
            this.A05 = (C29301ib) A002.A57.get();
            this.A03 = (C48372en) A002.A3x.get();
            this.A01 = (C620433g) A002.A3v.get();
            this.A0E = (C105355Up) r1.A1a.get();
            this.A02 = (C29291ia) A002.A3w.get();
            this.A09 = (C66473Lo) A002.A6p.get();
            this.A0B = (C29241iV) A002.AGn.get();
            this.A04 = (C106185Xy) r1.A1j.get();
        }
    }

    public void A74() {
        AnonymousClass3ZH A012 = this.A09.A01(this.A0C);
        this.A0A = A012;
        setTitle(this.A07.A0H(A012));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A082 = AnonymousClass32Y.A08(AnonymousClass0x7.A0l(this));
        C626936e.A06(A082);
        this.A0C = A082;
        int intExtra = getIntent().getIntExtra("profile_entry_point", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        this.A0F = valueOf;
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A0F = valueOf;
        A74();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        C56972sr r4 = this.A01;
        C111095hX r2 = this.A00;
        C28071fd r11 = this.A0D;
        AnonymousClass5ZU r8 = this.A07;
        C620733j r9 = this.A08;
        C48372en r5 = this.A03;
        C105355Up r12 = this.A0E;
        this.A00 = new AnonymousClass5ZB(this.A00, r2, this, r4, r5, this.A04, (C108915dl) null, r8, r9, this.A0A, r11, r12, this.A0F, true, false);
        this.A01.A06(new AnonymousClass4KA(this, 1), this.A0C);
        this.A06.A06(this.A0J);
        this.A05.A06(this.A0I);
        this.A02.A06(this.A0H);
        this.A0B.A06(this.A0K);
    }

    public BusinessProfileExtraFieldsActivity(int i) {
        this.A0G = false;
        AnonymousClass4HY.A00(this, 14);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A07(this.A0J);
        this.A05.A07(this.A0I);
        this.A02.A07(this.A0H);
        this.A0B.A07(this.A0K);
    }

    public BusinessProfileExtraFieldsActivity() {
        this(0);
        this.A0J = new AnonymousClass4H9(this, 1);
        this.A0I = new AnonymousClass1NI(this);
        this.A0K = new AnonymousClass4HI(this, 0);
        this.A0H = new C64443Dm(this);
    }
}
