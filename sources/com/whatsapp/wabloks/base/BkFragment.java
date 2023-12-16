package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass10r;
import X.AnonymousClass2MQ;
import X.AnonymousClass2XX;
import X.AnonymousClass39C;
import X.AnonymousClass3XZ;
import X.AnonymousClass49I;
import X.AnonymousClass4K2;
import X.AnonymousClass5U3;
import X.AnonymousClass7UQ;
import X.AnonymousClass7r0;
import X.AnonymousClass8DF;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C131266dJ;
import X.C151767Wf;
import X.C157157hp;
import X.C157967jD;
import X.C158977kt;
import X.C159037kz;
import X.C160817oM;
import X.C162377rs;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C183538qC;
import X.C40112Eo;
import X.C46202bF;
import X.C46582bs;
import X.C47382dA;
import X.C58422vE;
import X.C59842xa;
import X.C835248t;
import X.C835348u;
import X.C84704Dj;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import com.whatsapp.authgraphql.ui.CommonViewModel;
import com.whatsapp.bloks.WAViewpointLifecycleController;
import com.whatsapp.extensions.bloks.view.WaBkExtensionsScreenFragment;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.List;

public abstract class BkFragment extends C08310eF {
    public static final Integer A08 = AnonymousClass001.A0f();
    public static final Integer A09 = 578497046;
    public RootHostView A00;
    public C159037kz A01;
    public AnonymousClass7r0 A02;
    public C47382dA A03;
    public AnonymousClass2XX A04;
    public C84704Dj A05;
    public AnonymousClass10r A06;
    public C183538qC A07;

    public final void A1L(AnonymousClass49I r7) {
        if (r7.B3r() != null) {
            C47382dA r4 = this.A03;
            C157967jD r3 = C157967jD.A01;
            C835248t B3r = r7.B3r();
            C157157hp.A00(C131266dJ.A00(C162377rs.A01(C158977kt.A00().A00, new SparseArray(), (C160817oM) null, r4, (String) null), ((AnonymousClass8DF) B3r).A01, (List) null), r3, B3r);
        }
    }

    private void A00() {
        AnonymousClass7UQ B4k = this.A05.B4k();
        C003203q A0Q = A0Q();
        A0Q.getClass();
        B4k.A00(A0Q.getApplicationContext(), (C835348u) this.A07.get(), this.A03);
    }

    public void A0c() {
        C159037kz r1 = this.A01;
        if (r1 != null) {
            r1.A03();
            this.A01 = null;
        }
        this.A00 = null;
        super.A0c();
    }

    public void A0u(Bundle bundle) {
        if (this.A06 == null) {
            super.A0u(bundle);
            return;
        }
        throw AnonymousClass001.A0e("arguments already set");
    }

    public int A1H() {
        boolean z = this instanceof SupportBkScreenFragment;
        return R.id.bloks_container;
    }

    public Class A1I() {
        if ((this instanceof SupportBkScreenFragment) || (this instanceof ContextualHelpBkScreenFragment)) {
            return SupportBkLayoutViewModel.class;
        }
        if (this instanceof WaBkExtensionsScreenFragment) {
            return WaBkExtensionsLayoutViewModel.class;
        }
        return CommonViewModel.class;
    }

    public void A1J() {
        if (this instanceof SupportBkScreenFragment) {
            SupportBkScreenFragment supportBkScreenFragment = (SupportBkScreenFragment) this;
            C18270x1.A0p(supportBkScreenFragment.A01);
            AnonymousClass0x2.A0x(supportBkScreenFragment.A00);
        } else if (this instanceof ContextualHelpBkScreenFragment) {
            ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = (ContextualHelpBkScreenFragment) this;
            C18270x1.A0p(contextualHelpBkScreenFragment.A01);
            AnonymousClass0x2.A0x(contextualHelpBkScreenFragment.A00);
        } else if (this instanceof WaBkExtensionsScreenFragment) {
            WaBkExtensionsScreenFragment waBkExtensionsScreenFragment = (WaBkExtensionsScreenFragment) this;
            WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = waBkExtensionsScreenFragment.A0A;
            if (waExtensionsNavBarViewModel == null) {
                throw C18270x1.A0S("waExtensionsNavBarViewModel");
            }
            C18320x8.A18(waExtensionsNavBarViewModel.A04, false);
            C18270x1.A0p(waBkExtensionsScreenFragment.A02);
            FrameLayout frameLayout = waBkExtensionsScreenFragment.A00;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (waBkExtensionsScreenFragment.A06 != null) {
                String string = waBkExtensionsScreenFragment.A0H().getString("qpl_params");
                C59842xa r0 = waBkExtensionsScreenFragment.A05;
                if (r0 != null) {
                    r0.A01(string);
                    return;
                }
                throw C18270x1.A0S("bloksQplHelper");
            }
        }
    }

    public final void A1K() {
        if (this.A06 == null) {
            A0u(AnonymousClass002.A08());
        }
    }

    public void A1N(Exception exc) {
        if (this instanceof SupportBkScreenFragment) {
            SupportBkScreenFragment supportBkScreenFragment = (SupportBkScreenFragment) this;
            C18270x1.A0p(supportBkScreenFragment.A01);
            AnonymousClass0x2.A0x(supportBkScreenFragment.A00);
        } else if (this instanceof ContextualHelpBkScreenFragment) {
            ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = (ContextualHelpBkScreenFragment) this;
            C18270x1.A0p(contextualHelpBkScreenFragment.A01);
            AnonymousClass0x2.A0x(contextualHelpBkScreenFragment.A00);
        } else if (this instanceof WaBkExtensionsScreenFragment) {
            WaBkExtensionsScreenFragment waBkExtensionsScreenFragment = (WaBkExtensionsScreenFragment) this;
            C18270x1.A0p(waBkExtensionsScreenFragment.A02);
            AnonymousClass0x2.A0x(waBkExtensionsScreenFragment.A00);
        }
    }

    public void A0f() {
        super.A0f();
        A00();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1O(A09, C18290x4.A0Z(), "", "START_RENDER");
        C08310eF r2 = this.A0E;
        C003203q A0Q = A0Q();
        if (r2 instanceof C84704Dj) {
            this.A05 = (C84704Dj) r2;
        } else if (A0Q instanceof C84704Dj) {
            this.A05 = (C84704Dj) A0Q;
        } else {
            A0Q.finish();
        }
        this.A03 = this.A05.BEP();
        A00();
        AnonymousClass10r r22 = (AnonymousClass10r) AnonymousClass0x9.A0H(this).A01(A1I());
        this.A06 = r22;
        AnonymousClass7r0 r3 = this.A02;
        if (r3 != null) {
            if (!r22.A02) {
                r22.A02 = true;
                AnonymousClass08M A012 = AnonymousClass08M.A01();
                r22.A01 = A012;
                r22.A00 = A012;
                AnonymousClass3XZ r23 = new AnonymousClass3XZ(A012, (C47382dA) null);
                C46202bF r1 = new C46202bF();
                r1.A01 = r3;
                r1.A00 = 5;
                r23.BaN(r1);
            }
        } else if (A0H().containsKey("screen_name")) {
            String string = A0H().getString("screen_params");
            String string2 = A0H().getString("qpl_params");
            AnonymousClass10r r32 = this.A06;
            C47382dA r4 = this.A03;
            String string3 = A0H().getString("screen_name");
            if (string3 != null) {
                r32.A0E(r4, (AnonymousClass39C) A0H().getParcelable("screen_cache_config"), string3, string, string2);
                return;
            }
            throw AnonymousClass001.A0e("BkFragment is missing screen name");
        } else if (bundle != null) {
            A0R().onBackPressed();
        } else {
            throw AnonymousClass001.A0e("data missing for init");
        }
    }

    public void A0w(Bundle bundle, View view) {
        this.A00 = (RootHostView) C06560Yg.A02(view, A1H());
        String string = A0H().getString("data_module_job_id");
        String string2 = A0H().getString("data_module_namespace");
        if (!(string == null || string2 == null)) {
            AnonymousClass2MQ r0 = (AnonymousClass2MQ) this.A03.A00().get(R.id.bloks_data_module_namespace_manager);
            r0.getClass();
            r0.A00 = string;
            r0.A01 = string2;
        }
        AnonymousClass10r r02 = this.A06;
        r02.A0D();
        AnonymousClass4K2.A00(A0V(), r02.A00, this, 202);
        if (new C40112Eo(this.A03.A02.A01).A00.A00.A0Y(C58422vE.A02, 6190)) {
            WAViewpointLifecycleController wAViewpointLifecycleController = new WAViewpointLifecycleController();
            this.A0L.A00(wAViewpointLifecycleController);
            this.A03.A0A.set(false);
            C151767Wf r3 = this.A03.A01;
            View rootView = view.getRootView();
            if (rootView != null) {
                r3.A01(new C46582bs(rootView, r3.A01), wAViewpointLifecycleController, new AnonymousClass5U3());
            }
        }
    }

    public void A1M(AnonymousClass39C r3) {
        A1K();
        A0H().putParcelable("screen_cache_config", r3);
    }

    public void A1P(String str) {
        A1K();
        A0H().putSerializable("screen_params", str);
    }

    public void A1Q(String str) {
        A1K();
        A0H().putString("screen_name", str);
    }

    public void A1O(Integer num, Integer num2, String str, String str2) {
    }
}
