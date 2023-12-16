package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass000;
import X.AnonymousClass0x7;
import X.AnonymousClass3UZ;
import X.AnonymousClass4FW;
import X.AnonymousClass5QT;
import X.AnonymousClass675;
import X.AnonymousClass679;
import X.C100975Cz;
import X.C106995aW;
import X.C112645k4;
import X.C124166Bf;
import X.C18300x5;
import X.C19340zH;
import X.C24231Wp;
import X.C55622qe;
import X.C86654Ky;
import X.C93574oo;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;

public class StarredMessagesActivity extends C93574oo {
    public MenuItem A00;
    public C100975Cz A01;
    public C106995aW A02;
    public AnonymousClass3UZ A03;
    public C55622qe A04;
    public final AnonymousClass4FW A05 = new C124166Bf(this, 8);

    public class UnstarAllDialogFragment extends Hilt_StarredMessagesActivity_UnstarAllDialogFragment {
        public Dialog A1J(Bundle bundle) {
            C19340zH A0L = C18300x5.A0L(this);
            A0L.A0T(R.string.f11nameremoved);
            C19340zH.A08(A0L, this, 56, R.string.f11nameremoved);
            C19340zH.A05(A0L);
            return A0L.create();
        }
    }

    public AnonymousClass675 A75() {
        C106995aW r1 = this.A02;
        if (!r1.A0J || !AnonymousClass0x7.A1S(r1.A03.A03) || this.A0F != null) {
            return super.A75();
        }
        C100975Cz r0 = this.A01;
        return new C112645k4(C86654Ky.A0V(r0.A00.A03), super.A75());
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A00.A0Q.A06;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        this.A00.A0a.A06(this.A05);
        C24231Wp r1 = new C24231Wp();
        if (AnonymousClass000.A1X(this.A0F)) {
            i = 1;
        } else {
            i = 0;
        }
        r1.A00 = i;
        this.A00.A0e.BhD(r1);
        setContentView((int) R.layout.f8nameremoved);
        ListView listView = getListView();
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0J);
        A74(this.A05);
        A78();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        MenuItem add = menu.add(0, R.id.menuitem_unstar_all, 0, R.string.f11nameremoved);
        this.A00 = add;
        add.setShowAsAction(0);
        MenuItem menuItem = this.A00;
        AnonymousClass5QT r1 = this.A00;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        menuItem.setVisible(!listAdapter.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0a.A07(this.A05);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_unstar_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        new UnstarAllDialogFragment().A1O(getSupportFragmentManager(), "UnstarAllDialogFragment");
        return true;
    }
}
