package com.whatsapp.community;

import X.AnonymousClass1Fk;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Np;
import X.AnonymousClass34R;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass4H9;
import X.AnonymousClass4HY;
import X.AnonymousClass5ZU;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C27991fJ;
import X.C29421in;
import X.C55052pi;
import X.C56602sG;
import X.C60912zN;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.GroupJid;

public class EditCommunityActivity extends AnonymousClass1Np {
    public C64773Ex A00;
    public C29421in A01;
    public AnonymousClass5ZU A02;
    public C55052pi A03;
    public C105365Uq A04;
    public C114015mM A05;
    public AnonymousClass3ZH A06;
    public GroupJid A07;
    public boolean A08;
    public final C56602sG A09;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            AnonymousClass1Fk.A0C(A002, this);
            this.A05 = C64333Db.A29(A002);
            this.A00 = C64333Db.A26(A002);
            this.A02 = C64333Db.A28(A002);
            this.A01 = (C29421in) A002.A6P.get();
            this.A03 = (C55052pi) A002.A6R.get();
        }
    }

    public EditCommunityActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 36);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 64206) {
            if (i != 16436755) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            this.A0F.A02().delete();
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0F.A04(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A01.A09(this.A07);
                    this.A0F.A0E(this.A06);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0F.A02().delete();
                }
            }
            this.A0F.A05(intent, this, 16436755);
            return;
        } else {
            return;
        }
        this.A01.A09(this.A07);
        this.A0F.A0G(this.A06);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = this.A05.A04(this, this, "community-home");
        this.A01.A06(this.A09);
        C27991fJ A042 = AnonymousClass34R.A04(getIntent().getStringExtra("extra_community_jid"));
        C626936e.A06(A042);
        this.A07 = A042;
        AnonymousClass3ZH A0A = this.A00.A0A(A042);
        this.A06 = A0A;
        this.A08.setText(this.A02.A0H(A0A));
        WaEditText waEditText = this.A07;
        C60912zN r0 = this.A06.A0K;
        C626936e.A06(r0);
        waEditText.setText(r0.A03);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04.A09(this.A03, this.A06, dimensionPixelSize, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.A07(this.A09);
    }

    public EditCommunityActivity() {
        this(0);
        this.A09 = new AnonymousClass4H9(this, 4);
    }
}
