package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass304;
import X.AnonymousClass31C;
import X.AnonymousClass32Y;
import X.AnonymousClass3DZ;
import X.AnonymousClass4E7;
import X.AnonymousClass4EE;
import X.AnonymousClass4HY;
import X.AnonymousClass5VI;
import X.C105975Xd;
import X.C107695bk;
import X.C18270x1;
import X.C18300x5;
import X.C33971tz;
import X.C56282rj;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C66413Li;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class ContactSyncActivity extends C89644eZ implements AnonymousClass4E7, AnonymousClass4EE {
    public C105975Xd A00;
    public C66413Li A01;
    public C33971tz A02;
    public UserJid A03;
    public AnonymousClass31C A04;
    public boolean A05;

    public void BRA(int i) {
        if (i == 1 || i == 2) {
            finish();
        }
    }

    public void BZH() {
        this.A02 = null;
        BjL();
    }

    public void Bdo(AnonymousClass304 r5) {
        String str;
        int i;
        this.A02 = null;
        BjL();
        if (r5 != null) {
            if (r5.A00()) {
                finish();
                C105975Xd r0 = this.A00;
                Intent A0N = C627736r.A0N(this, r0.A04.A0A(this.A03));
                AnonymousClass5VI.A00(A0N, "ShareContactUtil");
                startActivity(A0N);
                return;
            } else if (r5.A00 == 0) {
                str = getString(R.string.f11nameremoved);
                i = 1;
                C56282rj r1 = new C56282rj(i);
                r1.A02(str);
                r1.A07(false);
                r1.A05(getString(R.string.f11nameremoved));
                C18300x5.A1B(r1.A00(), getSupportFragmentManager(), (String) null);
            }
        }
        str = getString(R.string.f11nameremoved);
        i = 2;
        C56282rj r12 = new C56282rj(i);
        r12.A02(str);
        r12.A07(false);
        r12.A05(getString(R.string.f11nameremoved));
        C18300x5.A1B(r12.A00(), getSupportFragmentManager(), (String) null);
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = C64333Db.A5u(A002);
            this.A01 = (C66413Li) A002.A6U.get();
            this.A00 = (C105975Xd) r1.AAt.get();
        }
    }

    public void BR8(int i) {
    }

    public void BR9(int i) {
    }

    public ContactSyncActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 50);
    }

    public void Bdp() {
        A6f(getString(R.string.f11nameremoved));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A08 = AnonymousClass32Y.A08(getIntent().getStringExtra("user_jid"));
        C626936e.A06(A08);
        this.A03 = A08;
        if (!this.A07.A0F()) {
            C56282rj r1 = new C56282rj(1);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            C18270x1.A0t(r1.A00(), this);
            return;
        }
        C33971tz r0 = this.A02;
        if (r0 != null) {
            r0.A0D(true);
        }
        C33971tz r12 = new C33971tz(this.A01, this, this.A03, this.A04);
        this.A02 = r12;
        AnonymousClass0x7.A1B(r12, this.A04);
    }

    public void onDestroy() {
        super.onDestroy();
        C33971tz r1 = this.A02;
        if (r1 != null) {
            r1.A0D(true);
            this.A02 = null;
        }
    }

    public ContactSyncActivity() {
        this(0);
    }
}
