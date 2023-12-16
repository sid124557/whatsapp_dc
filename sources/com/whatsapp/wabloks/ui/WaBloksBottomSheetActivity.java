package com.whatsapp.wabloks.ui;

import X.AnonymousClass08A;
import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass490;
import X.AnonymousClass4SG;
import X.AnonymousClass90L;
import X.AnonymousClass9HS;
import X.C04290Nq;
import X.C08270df;
import X.C08310eF;
import X.C107405bG;
import X.C116675qg;
import X.C162457s7;
import X.C18270x1;
import X.C183538qC;
import X.C54322oX;
import X.C86604Kt;
import X.C86664Kz;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import java.lang.ref.WeakReference;

public final class WaBloksBottomSheetActivity extends AnonymousClass9HS implements AnonymousClass490 {
    public C54322oX A00;
    public C183538qC A01;

    public void BR5(DialogInterface dialogInterface, int i, int i2) {
        C162457s7.A0J(dialogInterface, 1);
        dialogInterface.dismiss();
        finish();
    }

    public static /* synthetic */ void A0C(C08310eF r2, WaBloksBottomSheetActivity waBloksBottomSheetActivity) {
        AnonymousClass08A r1;
        if ((r2 instanceof BkBottomSheetContainerFragment) && (r1 = r2.A0L) != null) {
            r1.A00(new WaBloksBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$1(r2, waBloksBottomSheetActivity));
        }
    }

    public C08310eF A75(Intent intent) {
        return new C08310eF();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        C86604Kt.A1L(this, R.id.wabloks_screen);
        C08270df supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0d.add(new AnonymousClass90L(this, 1));
        String A1J = C86664Kz.A1J(getIntent(), "screen_name");
        String stringExtra = getIntent().getStringExtra("screen_params");
        AnonymousClass39C r4 = (AnonymousClass39C) getIntent().getParcelableExtra("screen_cache_config");
        boolean booleanExtra = getIntent().getBooleanExtra("is_async_component", true);
        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "restore_saved_instance");
        if (booleanExtra) {
            C162457s7.A0H(A1J);
            BpA(0, R.string.f11nameremoved);
            WeakReference A14 = AnonymousClass0x9.A14(this);
            C183538qC r0 = this.A01;
            if (r0 != null) {
                WeakReference A142 = AnonymousClass0x9.A14(this);
                boolean A0D = C107405bG.A0D(this);
                PhoneUserJid A2m = AnonymousClass4SG.A2m(this);
                C162457s7.A0H(A2m);
                ((C04290Nq) r0.get()).A00(new C116675qg(this, A1J, stringExtra, A14), r4, A1J, A2m.getRawString(), stringExtra, A142, A0D);
                return;
            }
            throw C18270x1.A0S("asyncActionLauncherLazy");
        }
        C162457s7.A0H(A1J);
        BkBottomSheetContainerFragment A002 = BkBottomSheetContainerFragment.A00(A1N);
        A002.A1a(AnonymousClass0x9.A0G(BkScreenFragment.A01(r4, A1J, stringExtra), A1J));
        A002.A1O(getSupportFragmentManager(), "bloks_bottomsheet_container");
    }
}
