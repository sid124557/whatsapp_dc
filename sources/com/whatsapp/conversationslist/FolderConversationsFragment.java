package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass4PW;
import X.C06560Yg;
import X.C107295b4;
import X.C117155rT;
import X.C162457s7;
import X.C18300x5;
import X.C18310x6;
import X.C72023d3;
import X.C73783g4;
import X.C86624Kv;
import X.C86634Kw;
import X.C95814uZ;
import X.C97884zQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FolderConversationsFragment extends Hilt_FolderConversationsFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ListView listView;
        C162457s7.A0J(layoutInflater, 0);
        View A0K = super.A0K(bundle, layoutInflater, viewGroup);
        if (!(A0K == null || (listView = (ListView) C06560Yg.A02(A0K, 16908298)) == null)) {
            listView.removeHeaderView(this.A0L);
            listView.removeHeaderView(this.A1O);
        }
        return A0K;
    }

    public int A1K() {
        if (this instanceof LockedConversationsFragment) {
            return 8;
        }
        return 2;
    }

    public List A1P() {
        if (!(this instanceof LockedConversationsFragment)) {
            List A06 = this.A1K.A06();
            ArrayList A0p = AnonymousClass000.A0p(A06);
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                C97884zQ.A00(C18300x5.A0P(it), A0p);
            }
            return A0p;
        } else if (!C86624Kv.A0O(this).A0J) {
            return C72023d3.A00;
        } else {
            List A08 = this.A1K.A08();
            ArrayList A0c = C73783g4.A0c(A08);
            Iterator it2 = A08.iterator();
            while (it2.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it2);
                if (this.A2g.A0i(A0P)) {
                    C117155rT.A00(this.A2u, this, A0P, 36);
                }
                C97884zQ.A00(A0P, A0c);
            }
            return A0c;
        }
    }

    public void A1V() {
        this.A0G.setVisibility(8);
        this.A0I.setVisibility(8);
        A1R();
        AnonymousClass4PW r1 = this.A1M;
        if (r1 != null) {
            r1.setVisibility(false);
        }
    }

    public final View A1t(int i) {
        LayoutInflater A0K = C86634Kw.A0K(this);
        A1H();
        View A0I = C18310x6.A0I(A0K, this.A04, i, false);
        FrameLayout frameLayout = new FrameLayout(A0G());
        C107295b4.A06(frameLayout, false);
        frameLayout.addView(A0I);
        A1H();
        this.A04.addHeaderView(frameLayout, (Object) null, false);
        return A0I;
    }
}
