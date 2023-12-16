package com.whatsapp.search.calls;

import X.AnonymousClass4L0;
import X.AnonymousClass4UG;
import X.AnonymousClass5TW;
import X.AnonymousClass68Q;
import X.C003203q;
import X.C08310eF;
import X.C109745f7;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C183018pM;
import X.C54292oU;
import X.C87514Tf;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public final class CallsSearchFragment extends Hilt_CallsSearchFragment {
    public AnonymousClass5TW A00;
    public C54292oU A01;
    public AnonymousClass4UG A02;
    public WDSConversationSearchView A03;
    public final AnonymousClass68Q A04 = new AnonymousClass68Q(this, 2);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C18260x0.A1R(C18280x3.A0g(layoutInflater, 0), "CallsSearchFragment/onCreateView ", this);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(R.id.search_view);
        this.A03 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A03;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass68Q r1 = this.A04;
            C162457s7.A0J(r1, 0);
            wDSConversationSearchView2.A02.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A03;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A04) == null)) {
            toolbar.setNavigationOnClickListener(new C109745f7((Object) this, 32));
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass5TW r0 = this.A00;
        if (r0 != null) {
            AnonymousClass5TW.A00(this, r0);
            return;
        }
        throw C18270x1.A0S("voipCallState");
    }

    public void A0f() {
        super.A0f();
        AnonymousClass5TW r0 = this.A00;
        if (r0 != null) {
            AnonymousClass5TW.A00(this, r0);
            return;
        }
        throw C18270x1.A0S("voipCallState");
    }

    public void A0p(Bundle bundle) {
        C183018pM r2;
        super.A0p(bundle);
        C003203q A0Q = A0Q();
        if ((A0Q instanceof C183018pM) && (r2 = (C183018pM) A0Q) != null && !r2.isFinishing()) {
            HomeActivity homeActivity = (HomeActivity) r2;
            this.A02 = (AnonymousClass4UG) AnonymousClass4L0.A0F(new C87514Tf(homeActivity, homeActivity.A0h), homeActivity).A01(AnonymousClass4UG.class);
        }
    }
}
