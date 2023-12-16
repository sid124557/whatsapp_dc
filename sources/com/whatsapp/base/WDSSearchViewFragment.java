package com.whatsapp.base;

import X.AnonymousClass4UM;
import X.AnonymousClass68Q;
import X.C003203q;
import X.C08310eF;
import X.C107405bG;
import X.C109685f1;
import X.C162457s7;
import X.C184008r6;
import X.C86644Kx;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class WDSSearchViewFragment extends WaFragment {
    public WDSConversationSearchView A00;
    public AnonymousClass4UM A01;
    public final AnonymousClass68Q A02 = new AnonymousClass68Q(this, 0);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        Toolbar toolbar;
        C162457s7.A0J(view, 0);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) view.findViewById(R.id.search_view);
        this.A00 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (!(wDSConversationSearchView2 == null || (toolbar = wDSConversationSearchView2.A04) == null)) {
            toolbar.setNavigationOnClickListener(new C109685f1((Object) this, 24));
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A00;
        if (wDSConversationSearchView3 != null) {
            AnonymousClass68Q r1 = this.A02;
            C162457s7.A0J(r1, 0);
            wDSConversationSearchView3.A02.addTextChangedListener(r1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        C107405bG.A08(A0R(), R.color.f5nameremoved);
    }

    public void A0f() {
        super.A0f();
        C107405bG.A08(A0R(), R.color.f5nameremoved);
    }

    public void A0p(Bundle bundle) {
        C184008r6 r1;
        super.A0p(bundle);
        C003203q A0Q = A0Q();
        if ((A0Q instanceof C184008r6) && (r1 = (C184008r6) A0Q) != null && !r1.isFinishing()) {
            this.A01 = r1.BCX();
        }
    }

    public void A1I() {
        Window window;
        C003203q A0Q = A0Q();
        if (!(A0Q == null || (window = A0Q.getWindow()) == null)) {
            C107405bG.A0C(window, false);
        }
        AnonymousClass4UM r0 = this.A01;
        if (r0 != null) {
            r0.A00.A0H("");
        }
        WDSConversationSearchView wDSConversationSearchView = this.A00;
        if (wDSConversationSearchView != null) {
            EditText editText = wDSConversationSearchView.A02;
            InputMethodManager A0Q2 = wDSConversationSearchView.getSystemServices().A0Q();
            if (A0Q2 != null) {
                C86644Kx.A14(editText, A0Q2);
            }
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass68Q r1 = this.A02;
            C162457s7.A0J(r1, 0);
            wDSConversationSearchView2.A02.removeTextChangedListener(r1);
        }
    }
}
