package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0IV;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2C4;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass6C0;
import X.C107295b4;
import X.C110135fk;
import X.C117695sL;
import X.C117705sM;
import X.C117865sc;
import X.C1229166i;
import X.C1230066r;
import X.C140046t4;
import X.C162457s7;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C60122y2;
import X.C616131n;
import X.C619532x;
import X.C71643cR;
import X.C84814Du;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C91904lY;
import X.C91974lt;
import X.C95814uZ;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupCallParticipantPicker extends C91904lY implements C1229166i {
    public GroupCallParticipantSuggestionsViewModel A00 = null;
    public C1230066r A01;
    public C183538qC A02;
    public C183538qC A03;
    public C183538qC A04;
    public C183538qC A05;
    public C183538qC A06;
    public C183538qC A07;
    public ArrayList A08;
    public boolean A09 = true;
    public boolean A0A = false;
    public final List A0B = AnonymousClass001.A0s();

    public void A7K(int i) {
        if (i > 0 || getSupportActionBar() == null || A7i()) {
            super.A7K(i);
            return;
        }
        boolean A7h = A7h();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (A7h) {
            Resources resources = getResources();
            int size = this.A0U.size();
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, this.A0U.size());
            supportActionBar.A0I(resources.getQuantityString(R.plurals.f9nameremoved, size, A0L));
            return;
        }
        supportActionBar.A0A(R.string.f11nameremoved);
    }

    public void A7U(ArrayList arrayList) {
        List A12 = C86634Kw.A12(getIntent(), UserJid.class, "jids");
        ArrayList arrayList2 = arrayList;
        if (A12.isEmpty()) {
            this.A0B.A05.A0U(arrayList2, 2, false, false, false);
            if (this.A08 == null && this.A0D.A0N(6742) == 1) {
                ArrayList A0s = AnonymousClass001.A0s();
                this.A08 = A0s;
                this.A0B.A05.A0U(A0s, 2, true, false, false);
                Collections.sort(this.A08, new C117865sc(this.A0D, this.A0N));
                arrayList.addAll(this.A08);
                return;
            }
            return;
        }
        A7e(arrayList, A12);
    }

    public final void A7c() {
        if (this.A00 != null) {
            boolean A1U = C18320x8.A1U(this.A0S);
            for (Object next : A7F()) {
                C619532x A2i = AnonymousClass4SG.A2i(this);
                C60122y2 r5 = this.A00.A01;
                C162457s7.A0J(next, 0);
                A2i.A02.execute(new C71643cR(A2i, next, r5, 12, A1U));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3.A0f.isEmpty() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7d() {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = r3.A0f
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r2 = 8
        L_0x0013:
            java.util.List r0 = r3.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = X.C86654Ky.A0H(r1)
            r0.setVisibility(r2)
            goto L_0x0019
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A7d():void");
    }

    public boolean A7f() {
        if (!(this instanceof GroupCallParticipantPickerSheet)) {
            AnonymousClass1VX r1 = this.A0D;
            if (r1.A0N(5370) <= 0 || !r1.A0X(5757)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A7g() {
        if (this instanceof GroupCallParticipantPickerSheet) {
            return false;
        }
        return AnonymousClass001.A1W(this.A0D.A0N(5370));
    }

    public void onCreate(Bundle bundle) {
        WDSSearchBar wDSSearchBar;
        if (bundle == null) {
            this.A0A = true;
        }
        super.onCreate(bundle);
        if (A7g() && (wDSSearchBar = this.A0R) != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C140046t4.A00);
            this.A0R.A07.setHint((int) R.string.f11nameremoved);
        }
    }

    public void A74(ListAdapter listAdapter) {
        int intExtra = getIntent().getIntExtra("hidden_jids", 0);
        if (intExtra > 0) {
            ListView listView = getListView();
            View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, listView, false);
            listView.addFooterView(inflate, (Object) null, false);
            AnonymousClass002.A09(inflate, R.id.group_members_not_shown).setText(C86604Kt.A0p(this.A0N, intExtra, R.plurals.f9nameremoved));
            C107295b4.A01(inflate);
        }
        super.A74(listAdapter);
    }

    public void A7H() {
        if (A7f()) {
            if (this.A00 == null) {
                this.A00 = (GroupCallParticipantSuggestionsViewModel) AnonymousClass0x9.A0H(this).A01(GroupCallParticipantSuggestionsViewModel.class);
                C619532x A2i = AnonymousClass4SG.A2i(this);
                C86624Kv.A1K(A2i.A02, A2i, 21);
            }
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel = this.A00;
            List list = this.A0f;
            C162457s7.A0J(list, 0);
            if (groupCallParticipantSuggestionsViewModel.A03 == null && groupCallParticipantSuggestionsViewModel.A01 == null) {
                groupCallParticipantSuggestionsViewModel.A03 = C616131n.A02(AnonymousClass2C4.A01, new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(groupCallParticipantSuggestionsViewModel, list, (C84814Du) null), AnonymousClass0IV.A00(groupCallParticipantSuggestionsViewModel), (AnonymousClass20D) null, 2);
            }
        }
        super.A7H();
    }

    public void A7R(AnonymousClass3ZH r8) {
        super.A7R(r8);
        Jid A032 = AnonymousClass3ZH.A03(r8);
        if (A032 != null && this.A00 != null) {
            C619532x A2i = AnonymousClass4SG.A2i(this);
            boolean A1U = C18320x8.A1U(this.A0S);
            A2i.A02.execute(new C71643cR(A032, A2i, this.A00.A01, 11, A1U));
        }
    }

    public void A7S(AnonymousClass3ZH r8, int i) {
        super.A7S(r8, i);
        C95814uZ r3 = r8.A0H;
        if (r3 != null && this.A00 != null) {
            C619532x A2i = AnonymousClass4SG.A2i(this);
            boolean A1U = C18320x8.A1U(this.A0S);
            A2i.A02.execute(new C71643cR(A2i, r3, this.A00.A01, 13, A1U));
        }
    }

    public void A7T(String str) {
        int i;
        super.A7T(str);
        A7d();
        if (A7f()) {
            C619532x A2i = AnonymousClass4SG.A2i(this);
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            A2i.A02.execute(new C117705sM((Object) A2i, i, 23));
        }
    }

    public void A7Z(List list) {
        WDSSearchBar wDSSearchBar;
        int i;
        if (list.size() > 0 && A7g()) {
            if (C18320x8.A1U(this.A0S)) {
                i = R.string.f11nameremoved;
            } else if (!A7f() || this.A09) {
                i = R.string.f11nameremoved;
            }
            list.add(0, new C91974lt(getString(i)));
        }
        super.A7Z(list);
        if (this.A0A) {
            this.A0A = false;
            if ((A7i() || (A7h() && this.A0D.A0N(5370) != 1)) && (wDSSearchBar = this.A0R) != null) {
                WDSSearchView wDSSearchView = wDSSearchBar.A07;
                AnonymousClass6C0 r2 = new AnonymousClass6C0(this, 2);
                C162457s7.A0J(wDSSearchView, 0);
                if (wDSSearchView.hasWindowFocus()) {
                    wDSSearchView.A09.requestFocus();
                    C117695sL.A01(wDSSearchView, r2, 11);
                    return;
                }
                wDSSearchView.getViewTreeObserver().addOnWindowFocusChangeListener(new C110135fk(wDSSearchView, r2));
                wDSSearchView.A09.requestFocus();
            }
        }
    }

    public final void A7e(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C86614Ku.A1P(this.A0B, C18300x5.A0P(it), arrayList);
        }
    }

    public final boolean A7h() {
        if (getIntent().getIntExtra("call_from_ui", 0) != 44 || !A7g()) {
            return false;
        }
        return true;
    }

    public final boolean A7i() {
        if (getIntent().getIntExtra("call_from_ui", 0) != 16 || !A7g()) {
            return false;
        }
        return true;
    }

    public void Ayk(AnonymousClass3ZH r1) {
        super.Ayk(r1);
        A7d();
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A00 != null) {
            C619532x A2i = AnonymousClass4SG.A2i(this);
            C86624Kv.A1K(A2i.A02, A2i, 20);
        }
    }

    public boolean onSearchRequested() {
        boolean onSearchRequested = super.onSearchRequested();
        if (A7f()) {
            C619532x A2i = AnonymousClass4SG.A2i(this);
            C86624Kv.A1K(A2i.A02, A2i, 16);
        }
        return onSearchRequested;
    }
}
