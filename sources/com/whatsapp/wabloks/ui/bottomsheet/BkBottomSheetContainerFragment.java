package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0PJ;
import X.AnonymousClass49I;
import X.AnonymousClass8DJ;
import X.AnonymousClass9V0;
import X.C08240dc;
import X.C08310eF;
import X.C183538qC;
import X.C194709Ue;
import X.C621633u;
import X.C86654Ky;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.Stack;

public class BkBottomSheetContainerFragment extends Hilt_BkBottomSheetContainerFragment {
    public LinearLayout A00;
    public AnonymousClass0PJ A01;
    public AnonymousClass49I A02;
    public C183538qC A03;

    public static BkBottomSheetContainerFragment A00(boolean z) {
        BkBottomSheetContainerFragment bkBottomSheetContainerFragment = new BkBottomSheetContainerFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("restore_saved_instance", z);
        bkBottomSheetContainerFragment.A0u(A08);
        return bkBottomSheetContainerFragment;
    }

    public void A0q(Bundle bundle) {
        Bundle bundle2 = this.A06;
        if (bundle2 == null || !bundle2.getBoolean("restore_saved_instance", false)) {
            C08240dc r0 = new C08240dc(A0R().getSupportFragmentManager());
            r0.A07(this);
            r0.A02();
        }
        super.A0q(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A02 != null) {
            WaBloksActivity waBloksActivity = (WaBloksActivity) A0R();
            AnonymousClass49I r1 = this.A02;
            if (!(r1 == null || r1.B3r() == null)) {
                AnonymousClass8DJ.A0B(waBloksActivity.A01, r1);
            }
        }
        ((AnonymousClass9V0) this.A03.get()).A00(C621633u.A00(A1D()));
        Stack stack = C194709Ue.A01;
        if (!stack.isEmpty()) {
            stack.pop();
        }
        super.onDismiss(dialogInterface);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A00 = C86654Ky.A0N(A0R, R.id.wa_bloks_bottom_sheet_fragment_container);
        AnonymousClass0PJ r0 = this.A01;
        if (!(r0 == null || (obj = r0.A00) == null || (obj2 = r0.A01) == null)) {
            C08240dc r1 = new C08240dc(A0T());
            r1.A0E((C08310eF) obj, (String) obj2, this.A00.getId());
            r1.A01();
        }
        return A0R;
    }

    public void A1a(AnonymousClass0PJ r1) {
        this.A01 = r1;
    }
}
