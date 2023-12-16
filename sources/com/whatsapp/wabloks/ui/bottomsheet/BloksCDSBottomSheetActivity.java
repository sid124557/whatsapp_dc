package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass0GI;
import X.AnonymousClass0TK;
import X.AnonymousClass0VD;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass39C;
import X.AnonymousClass3Z6;
import X.AnonymousClass66R;
import X.AnonymousClass7r0;
import X.AnonymousClass8GO;
import X.AnonymousClass8KI;
import X.AnonymousClass8PJ;
import X.AnonymousClass8X5;
import X.AnonymousClass90L;
import X.AnonymousClass9HT;
import X.C04290Nq;
import X.C08270df;
import X.C09640gW;
import X.C107405bG;
import X.C120515yi;
import X.C13750ng;
import X.C142886xx;
import X.C142896xy;
import X.C142906xz;
import X.C142916y0;
import X.C153427bI;
import X.C156397gY;
import X.C161887qm;
import X.C162457s7;
import X.C165857xk;
import X.C166217yK;
import X.C166287yR;
import X.C174908Wi;
import X.C181528mu;
import X.C18270x1;
import X.C183538qC;
import X.C56972sr;
import X.C626936e;
import X.C73813g7;
import X.C835348u;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.jid.PhoneUserJid;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;

public class BloksCDSBottomSheetActivity extends AnonymousClass9HT {
    public BiometricAuthPlugin A00;
    public C183538qC A01;
    public C183538qC A02;
    public final AnonymousClass66R A03 = new C13750ng(new C120515yi(this), new C174908Wi(this), new AnonymousClass8X5(this), new AnonymousClass8PJ(BloksCDSBottomSheetViewModel.class));

    public void A76(Intent intent, Bundle bundle) {
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("screen_params");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent2.getStringExtra("screen_name");
        C626936e.A06(stringExtra2);
        C183538qC r3 = this.A01;
        if (r3 == null) {
            throw C18270x1.A0S("asyncActionAppIds");
        } else if (((Set) r3.get()).contains(stringExtra2)) {
            View findViewById = findViewById(R.id.progress_bar);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            C162457s7.A0H(stringExtra2);
            C183538qC r32 = this.A02;
            if (r32 != null) {
                WeakReference A14 = AnonymousClass0x9.A14(this);
                boolean A0D = C107405bG.A0D(this);
                C56972sr r33 = this.A01;
                r33.A0P();
                PhoneUserJid phoneUserJid = r33.A05;
                C162457s7.A0H(phoneUserJid);
                ((C04290Nq) r32.get()).A00(new AnonymousClass8KI(this), (AnonymousClass39C) null, stringExtra2, phoneUserJid.getRawString(), stringExtra, A14, A0D);
                return;
            }
            throw C18270x1.A0S("asyncActionLauncherLazy");
        } else {
            C162457s7.A0H(stringExtra2);
            C162457s7.A0J(stringExtra2, 0);
            C142906xz r15 = C142906xz.FULL_SHEET;
            C142896xy r14 = C142896xy.AUTO;
            BkCdsBottomSheetFragment A002 = BkCdsBottomSheetFragment.A00(new C161887qm((AnonymousClass0GI) null, (C153427bI) null, (C165857xk) null, C142916y0.ANIMATED, (C166287yR) null, C142886xx.AUTO, r14, r15, (C166217yK) null, (C166217yK) null, (Integer) null, (String) null, 16542, false, false, true), stringExtra2);
            A002.A02 = this.A01;
            C156397gY r5 = new C156397gY(stringExtra2);
            AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[1];
            AnonymousClass3Z6.A09("params", stringExtra, r4, 0);
            HashMap A08 = C73813g7.A08(r4);
            AnonymousClass0TK r34 = new AnonymousClass0TK();
            r34.A01 = stringExtra2;
            r34.A02 = A08;
            AnonymousClass0VD.A02(A002, this, new C09640gW(r34), (AnonymousClass7r0) null, (C181528mu) null, r5, stringExtra2, 32);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C08270df supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0d.add(new AnonymousClass90L(this, 3));
        B4k().A00(getApplicationContext(), (C835348u) this.A07.get(), this.A01);
        if (getIntent().getBooleanExtra("add_biometric_auth_extra", false)) {
            int intExtra = getIntent().getIntExtra("biometric_auth_title_res_extra", 0);
            AnonymousClass1VX r9 = this.A0D;
            this.A00 = new BiometricAuthPlugin(this, this.A03, this.A05, this.A08, new AnonymousClass8GO(this), r9, intExtra, 0);
        }
    }

    public int A74() {
        return R.layout.f8nameremoved;
    }

    public void onResume() {
        super.onResume();
        B4k().A00(getApplicationContext(), (C835348u) this.A07.get(), this.A01);
    }
}
