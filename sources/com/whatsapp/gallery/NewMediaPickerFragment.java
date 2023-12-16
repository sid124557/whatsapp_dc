package com.whatsapp.gallery;

import X.AnonymousClass001;
import X.AnonymousClass0R2;
import X.AnonymousClass0R6;
import X.AnonymousClass0x9;
import X.C113975mI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C186058ug;
import X.C53492nB;
import X.C635339p;
import X.C86624Kv;
import X.C86644Kx;
import X.C87884Wm;
import X.C95294tG;
import X.C95804uY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Set;

public class NewMediaPickerFragment extends Hilt_NewMediaPickerFragment {
    public LayoutInflater A00;
    public Menu A01;
    public View A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public final Set A05 = AnonymousClass0x9.A17();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        this.A00 = layoutInflater;
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A03 = C86644Kx.A0J(view, R.id.gallery_selected_container);
        C162457s7.A0D(view.getContext());
        RecyclerView recyclerView = (RecyclerView) C18290x4.A0M(view, R.id.gallery_selected_media);
        this.A04 = recyclerView;
        recyclerView.A0h = true;
        C53492nB r2 = this.A0Q;
        if (r2 != null) {
            LayoutInflater layoutInflater = this.A00;
            if (layoutInflater == null) {
                throw C18270x1.A0S("inflater");
            }
            recyclerView.setAdapter(new C87884Wm(layoutInflater, r2));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1X(0);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        View A0M = C18290x4.A0M(view, R.id.gallery_done_btn);
        this.A02 = A0M;
        C635339p.A00(A0M, this, 35);
    }

    public boolean A1X(C186058ug r4, C95294tG r5) {
        Menu menu;
        Menu menu2;
        if ((this.A0A instanceof C95804uY) && !A1L().A0X(5643)) {
            return false;
        }
        if (!A1V() && (menu = this.A01) != null && menu.size() > 0 && (menu2 = this.A01) != null) {
            MenuItem item = menu2.getItem(0);
            C162457s7.A0D(item);
            A1B(item);
        }
        return super.A1X(r4, r5);
    }

    public final void A1d() {
        ViewGroup viewGroup;
        C87884Wm r1;
        if (C18300x5.A0v(this.A0K.A00).isEmpty()) {
            this.A05.clear();
        }
        Set set = this.A05;
        int A08 = AnonymousClass001.A08(C18310x6.A1X(set) ? 1 : 0);
        ViewGroup viewGroup2 = this.A03;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != A08) && (viewGroup = this.A03) != null) {
            viewGroup.setVisibility(A08);
        }
        RecyclerView recyclerView = this.A04;
        AnonymousClass0R6 r12 = null;
        if (recyclerView != null) {
            r12 = recyclerView.A0N;
        }
        if ((r12 instanceof C87884Wm) && (r1 = (C87884Wm) r12) != null) {
            C86644Kx.A1F(r1, set, r1.A02);
        }
    }

    public void A0c() {
        super.A0c();
        View view = this.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass0R6) null);
        }
        this.A04 = null;
        this.A03 = null;
    }

    public void A0f() {
        super.A0f();
        A1d();
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18260x0.A0O(menu, menuInflater);
        super.A0y(menu, menuInflater);
        this.A01 = menu;
    }

    public void A1Y() {
        super.A1Y();
        this.A05.clear();
        A1d();
    }

    public void A1a(C186058ug r4) {
        ViewGroup viewGroup;
        AnonymousClass0R2 r0;
        C87884Wm r1;
        int i;
        super.A1a(r4);
        boolean A1V = A1V();
        Set set = this.A05;
        if (A1V) {
            if (!set.remove(r4)) {
                if (!this.A0J && set.size() >= (i = this.A01) && !this.A0H) {
                    C86624Kv.A1I(this, i);
                    this.A0H = true;
                }
                if (set.size() < this.A01) {
                    set.add(r4);
                }
            }
            int A08 = AnonymousClass001.A08(C18310x6.A1X(set) ? 1 : 0);
            ViewGroup viewGroup2 = this.A03;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != A08) && (viewGroup = this.A03) != null) {
                viewGroup.setVisibility(A08);
            }
            RecyclerView recyclerView = this.A04;
            AnonymousClass0R6 r12 = null;
            if (recyclerView != null) {
                r12 = recyclerView.A0N;
            }
            if ((r12 instanceof C87884Wm) && (r1 = (C87884Wm) r12) != null) {
                C86644Kx.A1F(r1, set, r1.A02);
            }
            if (set.isEmpty()) {
                C113975mI r02 = this.A0S;
                if (r02 == null) {
                    throw C18270x1.A0S("mediaTray");
                } else if (!r02.A00.A0X(4261) && (r0 = this.A05) != null) {
                    r0.A05();
                }
            }
        } else {
            set.add(r4);
        }
    }
}
