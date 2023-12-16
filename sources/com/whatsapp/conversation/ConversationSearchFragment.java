package com.whatsapp.conversation;

import X.AnonymousClass1VX;
import X.AnonymousClass5Q8;
import X.AnonymousClass5TW;
import X.AnonymousClass66R;
import X.AnonymousClass68Q;
import X.AnonymousClass68Y;
import X.AnonymousClass695;
import X.AnonymousClass69E;
import X.AnonymousClass94W;
import X.C08310eF;
import X.C109335eS;
import X.C120975zT;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C54292oU;
import X.C77643tj;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.Calendar;

public final class ConversationSearchFragment extends Hilt_ConversationSearchFragment {
    public DatePickerDialog.OnDateSetListener A00;
    public AnonymousClass5TW A01;
    public ConversationSearchViewModel A02;
    public C54292oU A03;
    public AnonymousClass1VX A04;
    public WDSConversationSearchView A05;
    public boolean A06;
    public final AnonymousClass68Q A07 = new AnonymousClass68Q(this, 1);
    public final AnonymousClass66R A08 = C154517dI.A01(new C120975zT(this));
    public final AnonymousClass66R A09 = C154517dI.A01(new C77643tj(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C18260x0.A1R(C18280x3.A0g(layoutInflater, 0), "CallsSearchFragment/onCreateView ", this);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(R.id.search_view);
        this.A05 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A05;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass68Q r1 = this.A07;
            C162457s7.A0J(r1, 0);
            wDSConversationSearchView2.A02.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A05;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A04) == null)) {
            toolbar.setNavigationOnClickListener(new C109335eS(this, 44));
        }
        WDSConversationSearchView wDSConversationSearchView4 = this.A05;
        if (wDSConversationSearchView4 != null) {
            AnonymousClass695.A00(wDSConversationSearchView4, this, 3);
        }
        WDSConversationSearchView wDSConversationSearchView5 = this.A05;
        if (wDSConversationSearchView5 != null) {
            Toolbar toolbar2 = wDSConversationSearchView5.A04;
            toolbar2.A0B(R.menu.f10nameremoved);
            Menu menu = toolbar2.getMenu();
            C162457s7.A0D(menu);
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                C162457s7.A0D(item);
                AnonymousClass5Q8 r12 = wDSConversationSearchView5.A08;
                if (r12 == null) {
                    throw C18270x1.A0S("style");
                }
                item.setIcon(r12.A00(item.getIcon()));
            }
            AnonymousClass5Q8 r13 = wDSConversationSearchView5.A08;
            if (r13 == null) {
                throw C18270x1.A0S("style");
            }
            toolbar2.setOverflowIcon(r13.A00(toolbar2.getOverflowIcon()));
        }
        WDSConversationSearchView wDSConversationSearchView6 = this.A05;
        if (wDSConversationSearchView6 != null) {
            wDSConversationSearchView6.setOnSearchByDateListener(new C109335eS(this, 45));
        }
        WDSConversationSearchView wDSConversationSearchView7 = this.A05;
        if (wDSConversationSearchView7 != null) {
            Toolbar toolbar3 = wDSConversationSearchView7.A04;
            if (toolbar3 != null) {
                toolbar3.A0R = new AnonymousClass69E(this, 3);
            }
            EditText editText = wDSConversationSearchView7.A02;
            if (editText != null) {
                editText.setOnEditorActionListener(new AnonymousClass68Y(this, 1));
            }
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass5TW r0 = this.A01;
        if (r0 != null) {
            AnonymousClass5TW.A00(this, r0);
            return;
        }
        throw C18270x1.A0S("voipCallState");
    }

    public void A0f() {
        super.A0f();
        AnonymousClass5TW r0 = this.A01;
        if (r0 != null) {
            AnonymousClass5TW.A00(this, r0);
            return;
        }
        throw C18270x1.A0S("voipCallState");
    }

    public final void A1J() {
        Calendar instance = Calendar.getInstance();
        C162457s7.A0D(instance);
        AnonymousClass66R r4 = this.A08;
        ((AnonymousClass94W) r4.getValue()).A04().updateDate(instance.get(1), instance.get(2), instance.get(5));
        ((Dialog) r4.getValue()).show();
    }
}
