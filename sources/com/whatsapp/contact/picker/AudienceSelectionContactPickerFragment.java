package com.whatsapp.contact.picker;

import X.AnonymousClass0x9;
import X.AnonymousClass32Y;
import X.AnonymousClass3ZH;
import X.AnonymousClass6Z3;
import X.C06560Yg;
import X.C08310eF;
import X.C108845de;
import X.C129526aS;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C28011fL;
import X.C56892sj;
import X.C56972sr;
import X.C60842zG;
import X.C73723fy;
import X.C95814uZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AudienceSelectionContactPickerFragment extends SelectedListContactPickerFragment {
    public int A00 = 1;
    public MenuItem A01;
    public AnonymousClass6Z3 A02;
    public final Map A03 = C18320x8.A0r();
    public final Set A04 = AnonymousClass0x9.A17();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List list;
        C162457s7.A0J(layoutInflater, 0);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = A1K();
        }
        this.A00 = A1K().getInt("status_distribution_mode");
        C108845de A002 = this.A2M.A00(bundle2);
        this.A1o = A002;
        if (A002 != null) {
            if (this.A00 == 1) {
                list = A002.A01;
            } else {
                list = A002.A02;
            }
            this.A36 = list;
        }
        boolean z = A1K().getBoolean("use_custom_multiselect_limit", false);
        this.A3f = z;
        if (z) {
            this.A02 = A1K().getInt("custom_multiselect_limit");
            this.A03 = R.plurals.f9nameremoved;
        }
        View A0K = super.A0K(bundle, layoutInflater, viewGroup);
        if (A0K != null) {
            AnonymousClass6Z3 r3 = (AnonymousClass6Z3) C06560Yg.A02(A0K, R.id.save_button);
            this.A02 = r3;
            if (r3 != null) {
                List list2 = this.A36;
                int i = 0;
                if ((list2 == null || !C18310x6.A1X(list2)) && this.A00 == 1) {
                    i = 8;
                }
                r3.setVisibility(i);
            }
            AnonymousClass6Z3 r1 = this.A02;
            if (r1 != null) {
                C18310x6.A17(r1, this, 25);
            }
        }
        return A0K;
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        bundle.putInt("status_distribution_mode", this.A00);
        this.A2M.A02(bundle, this.A1o);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18270x1.A14(menu, menuInflater);
        super.A0y(menu, menuInflater);
        MenuItem icon = menu.add(0, R.id.menuitem_select_all, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_unselect_all);
        C162457s7.A0D(icon);
        this.A01 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A01;
        if (menuItem == null) {
            throw C18270x1.A0S("unselectAllMenuItem");
        }
        menuItem.setTitle(R.string.f11nameremoved);
    }

    public boolean A1B(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        if (menuItem.getItemId() != R.id.menuitem_select_all) {
            return super.A1B(menuItem);
        }
        Map map = this.A3n;
        C162457s7.A0C(map);
        if (!map.isEmpty()) {
            map.clear();
            A2J().A00.clear();
            this.A04.clear();
            this.A03.clear();
            A1W();
            A2J().A05();
            A2K(C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), 0);
            A1b();
        }
        return true;
    }

    public void A1n(View view, AnonymousClass3ZH r3) {
        C162457s7.A0J(view, 1);
        super.A1n(view, r3);
        A2O(r3);
        A2N();
    }

    public final void A2N() {
        Set set = this.A04;
        if (!set.isEmpty()) {
            Set A0P = C73723fy.A0P(set);
            set.clear();
            Iterator it = A0P.iterator();
            while (it.hasNext()) {
                UserJid A0T = C18310x6.A0T(it);
                if (A1P(A0T) != null) {
                    Map map = this.A3n;
                    AnonymousClass3ZH r1 = (AnonymousClass3ZH) map.get(A0T);
                    if (r1 != null) {
                        A2J().A0K(r1);
                        map.remove(r1.A0H);
                        A1b();
                        A1W();
                    }
                }
            }
            if (C18310x6.A1X(set)) {
                A1W();
            }
        }
    }

    public void A1V() {
        super.A1V();
        Iterator it = A2J().A00.iterator();
        while (it.hasNext()) {
            A2O(C18310x6.A0R(it));
        }
        A2N();
    }

    public final void A2O(AnonymousClass3ZH r7) {
        C28011fL r1;
        Object obj;
        UserJid A032;
        if (r7.A0U()) {
            C95814uZ r12 = r7.A0H;
            if ((r12 instanceof C28011fL) && (r1 = (C28011fL) r12) != null) {
                C129526aS A042 = C56892sj.A01(this.A1i, r1).A04();
                C162457s7.A0D(A042);
                Iterator it = A042.iterator();
                while (it.hasNext()) {
                    UserJid userJid = ((C60842zG) it.next()).A03;
                    C162457s7.A0C(userJid);
                    if (!C162457s7.A0P(C56972sr.A04(this.A0b), userJid)) {
                        Map map = this.A03;
                        if (!map.containsKey(userJid)) {
                            map.put(userJid, AnonymousClass0x9.A17());
                        }
                        Iterable iterable = (Iterable) map.get(userJid);
                        Object obj2 = null;
                        if (iterable != null) {
                            obj = C73723fy.A01(iterable);
                        } else {
                            obj = null;
                        }
                        Set set = (Set) map.get(userJid);
                        if (set != null) {
                            set.add(r7);
                        }
                        Iterable iterable2 = (Iterable) map.get(userJid);
                        if (iterable2 != null) {
                            obj2 = C73723fy.A01(iterable2);
                        }
                        if (!C162457s7.A0P(obj, obj2) && (A032 = AnonymousClass32Y.A03(userJid)) != null) {
                            this.A04.add(A032);
                        }
                    }
                }
            }
        }
    }
}
