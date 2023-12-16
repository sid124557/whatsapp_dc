package com.whatsapp.wabloks.ui;

import X.AnonymousClass08A;
import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass90L;
import X.AnonymousClass91P;
import X.AnonymousClass9HR;
import X.C04290Nq;
import X.C08270df;
import X.C08310eF;
import X.C107405bG;
import X.C162457s7;
import X.C18270x1;
import X.C56972sr;
import X.C86604Kt;
import X.C86664Kz;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import java.lang.ref.WeakReference;

public final class WaBloksGenericBottomSheetActivity extends AnonymousClass9HR {
    public C04290Nq A00;

    public static /* synthetic */ void A0C(C08310eF r2, WaBloksGenericBottomSheetActivity waBloksGenericBottomSheetActivity) {
        AnonymousClass08A r1;
        if ((r2 instanceof BkBottomSheetContainerFragment) && (r1 = r2.A0L) != null) {
            r1.A00(new WaBloksGenericBottomSheetActivity$addLifecycleObserver$1$1(r2, waBloksGenericBottomSheetActivity));
        }
    }

    public C08310eF A75(Intent intent) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86604Kt.A1L(this, R.id.wabloks_screen);
        C08270df supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0d.add(new AnonymousClass90L(this, 2));
        WeakReference A14 = AnonymousClass0x9.A14(this);
        C04290Nq r2 = this.A00;
        if (r2 != null) {
            String A1J = C86664Kz.A1J(getIntent(), "extra_app_id");
            C162457s7.A0D(A1J);
            boolean A0D = C107405bG.A0D(this);
            r2.A00(new AnonymousClass91P(1), (AnonymousClass39C) null, A1J, C56972sr.A06(this.A01), (String) null, A14, A0D);
            return;
        }
        throw C18270x1.A0S("asyncActionLauncher");
    }
}
