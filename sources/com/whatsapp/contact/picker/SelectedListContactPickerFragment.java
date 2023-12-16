package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3ZH;
import X.C08310eF;
import X.C107715bm;
import X.C107755bq;
import X.C1231367g;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C198012s;
import X.C86614Ku;
import X.C86664Kz;
import X.C87814Wf;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import java.util.List;
import java.util.Map;

public abstract class SelectedListContactPickerFragment extends ContactPickerFragment {
    public ValueAnimator A00;
    public RelativeLayout A01;
    public RecyclerView A02;
    public C87814Wf A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub A0n;
        C162457s7.A0J(layoutInflater, 0);
        View A0K = super.A0K(bundle, layoutInflater, viewGroup);
        if (!(this instanceof VoipContactPickerFragment) || C18270x1.A1V(((VoipContactPickerFragment) this).A06)) {
            RecyclerView recyclerView = null;
            if (!(A0K == null || (A0n = C86664Kz.A0n(A0K, R.id.selected_contacts_list_stub)) == null)) {
                View inflate = A0n.inflate();
                C162457s7.A0K(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                this.A01 = relativeLayout;
                if (relativeLayout != null) {
                    recyclerView = C86664Kz.A0w(relativeLayout, R.id.selected_items);
                }
                this.A02 = recyclerView;
                A2L(A0K, true);
            }
        }
        return A0K;
    }

    public void A1m(View view, AnonymousClass3ZH r4) {
        C162457s7.A0J(view, 1);
        super.A1m(view, r4);
        if (!(this instanceof VoipContactPickerFragment) || C18270x1.A1V(((VoipContactPickerFragment) this).A06)) {
            A2J().A0K(r4);
        }
    }

    public void A1n(View view, AnonymousClass3ZH r5) {
        C162457s7.A0J(view, 1);
        super.A1n(view, r5);
        if (!(this instanceof VoipContactPickerFragment) || C18270x1.A1V(((VoipContactPickerFragment) this).A06)) {
            C87814Wf A2J = A2J();
            List list = A2J.A00;
            list.add(r5);
            A2J.A07(AnonymousClass002.A03(list));
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null && relativeLayout.getVisibility() == 8) {
                A2K(0, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
            }
            A1b();
        }
    }

    public final C87814Wf A2J() {
        C87814Wf r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("selectedContactsAdapter");
    }

    public final void A2K(int i, int i2) {
        ValueAnimator valueAnimator;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.clearAnimation();
        }
        ValueAnimator valueAnimator2 = this.A00;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.A00) == null)) {
            valueAnimator.end();
        }
        ValueAnimator A0Q = C86664Kz.A0Q(C86664Kz.A1a(i), i2);
        A0Q.addUpdateListener(new C107755bq(this));
        A0Q.addListener(new C107715bm(this));
        A0Q.setDuration(240);
        A0Q.start();
        this.A00 = A0Q;
    }

    public final void A2L(View view, boolean z) {
        List list;
        Map map = this.A3n;
        C162457s7.A0C(map);
        boolean z2 = true;
        int i = 0;
        if (!(!map.isEmpty()) && (!z || (list = this.A36) == null || !C18310x6.A1X(list))) {
            z2 = false;
        }
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(C86614Ku.A09(z2));
        }
        if (z2) {
            i = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        ListView listView = this.A0L;
        if (listView == null) {
            listView = (ListView) C18280x3.A0E(view, 16908298);
        }
        A2M(listView, i);
        if (this.A03 == null) {
            this.A03 = new C87814Wf(this);
        }
        if (A2J().A00.isEmpty()) {
            A2J().A00.addAll(map.values());
        }
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setPadding(0, recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            recyclerView.A0o(new C1231367g(recyclerView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
            recyclerView.getContext();
            SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
            smoothScrollLinearLayoutManager.A1X(0);
            recyclerView.setLayoutManager(smoothScrollLinearLayoutManager);
            recyclerView.setAdapter(A2J());
            recyclerView.setItemAnimator(new C198012s());
        }
    }

    public void A1V() {
        super.A1V();
        if (!(this instanceof VoipContactPickerFragment) || C18270x1.A1V(((VoipContactPickerFragment) this).A06)) {
            ListView listView = this.A0L;
            C162457s7.A0C(listView);
            A2L(listView, false);
            ListView listView2 = this.A0L;
            if (listView2 != null) {
                listView2.setFastScrollAlwaysVisible(false);
                listView2.setFastScrollEnabled(false);
            }
        }
    }

    public final void A2M(ListView listView, int i) {
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i;
            listView.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = i;
                    relativeLayout.setLayoutParams(layoutParams3);
                    return;
                }
                throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            return;
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
