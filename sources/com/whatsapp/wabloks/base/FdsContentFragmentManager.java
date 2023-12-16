package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.C08240dc;
import X.C08310eF;
import X.C197889e2;
import X.C197909e4;
import X.C197969eA;
import X.C204149ot;
import X.C54522or;
import X.C60482yd;
import X.C626936e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.Queue;

public class FdsContentFragmentManager extends Hilt_FdsContentFragmentManager {
    public FrameLayout A00;
    public C60482yd A01;
    public boolean A02 = true;
    public final Queue A03 = AnonymousClass0x9.A18();

    public static FdsContentFragmentManager A00(String str) {
        FdsContentFragmentManager fdsContentFragmentManager = new FdsContentFragmentManager();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("fds_observer_id", str);
        fdsContentFragmentManager.A0u(A08);
        return fdsContentFragmentManager;
    }

    public void A0a() {
        this.A01.A02(A0H().getString("fds_observer_id")).A03(this);
        this.A00 = null;
        super.A0a();
    }

    public void A0w(Bundle bundle, View view) {
        C54522or A022 = this.A01.A02(A0H().getString("fds_observer_id"));
        A022.A00(new C204149ot(this, 3), C197969eA.class, this);
        A022.A00(new C204149ot(this, 4), C197909e4.class, this);
        A022.A01(new C197889e2());
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A00 = (FrameLayout) A0R.findViewById(R.id.wa_fcs_modal_fragment_container);
        return A0R;
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C08310eF A0B = A0T().A0B(R.id.wa_fcs_modal_fragment_container);
        if (A0B != null) {
            A0B.A0y(menu, menuInflater);
        }
    }

    public boolean A1B(MenuItem menuItem) {
        C08310eF A0B = A0T().A0B(R.id.wa_fcs_modal_fragment_container);
        if (A0B != null) {
            return A0B.A1B(menuItem);
        }
        return false;
    }

    public final void A1I(C08310eF r6, String str) {
        C08240dc r4 = new C08240dc(A0T());
        r4.A0I(str);
        r4.A02 = R.anim.f0nameremoved;
        r4.A03 = R.anim.f0nameremoved;
        r4.A05 = R.anim.f0nameremoved;
        r4.A06 = R.anim.f0nameremoved;
        FrameLayout frameLayout = this.A00;
        C626936e.A04(frameLayout);
        r4.A0E(r6, (String) null, frameLayout.getId());
        r4.A01();
    }
}
