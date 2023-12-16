package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass0IT;
import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass349;
import X.AnonymousClass4AB;
import X.AnonymousClass4C6;
import X.AnonymousClass4Rm;
import X.AnonymousClass4Ro;
import X.AnonymousClass4WB;
import X.AnonymousClass4WC;
import X.AnonymousClass58H;
import X.AnonymousClass5OY;
import X.AnonymousClass5SX;
import X.AnonymousClass5Y0;
import X.AnonymousClass61P;
import X.AnonymousClass66R;
import X.AnonymousClass691;
import X.AnonymousClass8PJ;
import X.C003203q;
import X.C06360Xi;
import X.C06440Xs;
import X.C06560Yg;
import X.C08310eF;
import X.C104185Pz;
import X.C105115Tq;
import X.C119595xE;
import X.C119605xF;
import X.C1222263o;
import X.C1222363p;
import X.C1231167e;
import X.C1231767k;
import X.C13750ng;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C616131n;
import X.C78133uW;
import X.C80413yC;
import X.C80423yD;
import X.C84814Du;
import X.C85494Gl;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88034Xb;
import X.C999858y;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.concurrent.CancellationException;

public final class EmojiExpressionsFragment extends Hilt_EmojiExpressionsFragment implements AnonymousClass4AB {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public GridLayoutManager A05;
    public RecyclerView A06;
    public RecyclerView A07;
    public AutoFitGridRecyclerView A08;
    public AnonymousClass4Ro A09;
    public WaImageView A0A;
    public AnonymousClass4Rm A0B;
    public AnonymousClass5Y0 A0C;
    public AnonymousClass4WC A0D;
    public AnonymousClass5SX A0E;
    public AnonymousClass4WB A0F;
    public AnonymousClass5OY A0G;
    public C104185Pz A0H;
    public final AnonymousClass66R A0I;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        C104185Pz A1V = A1V();
        int andIncrement = A1V.A02.getAndIncrement();
        A1V.A01.markerStart(694884634, andIncrement);
        this.A00 = andIncrement;
        A1V().A00(this.A00, "emoji_on_create_view_start", (String) null);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        A1V().A00(this.A00, "emoji_on_create_view_end", (String) null);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        A1V().A00(this.A00, "emoji_on_view_created_start", (String) null);
        this.A02 = C06560Yg.A02(view, R.id.emoji_vscroll_view);
        this.A08 = (AutoFitGridRecyclerView) C06560Yg.A02(view, R.id.items);
        this.A07 = C86654Ky.A0P(view, R.id.sections);
        this.A06 = C86654Ky.A0P(view, R.id.emoji_search_results);
        this.A01 = C06560Yg.A02(view, R.id.emoji_tab_search_no_results);
        this.A0A = AnonymousClass0x9.A0L(view, R.id.no_results_image);
        this.A04 = (CoordinatorLayout) C06560Yg.A02(view, R.id.snack_bar_view);
        this.A03 = C06560Yg.A02(view, R.id.emoji_tip);
        A1V().A00(this.A00, "emoji_set_up_rv_start", (String) null);
        if (this.A02.A0X(6653)) {
            AutoFitGridRecyclerView autoFitGridRecyclerView = this.A08;
            if (autoFitGridRecyclerView != null) {
                if (!C06360Xi.A05(autoFitGridRecyclerView) || autoFitGridRecyclerView.isLayoutRequested()) {
                    AnonymousClass691.A00(autoFitGridRecyclerView, this, 7);
                } else {
                    A1W(A1U());
                }
            }
        } else {
            A1W(0);
        }
        A1V().A00(this.A00, "emoji_set_up_rv_end", (String) null);
        A1V().A00(this.A00, "emoji_set_up_sections_start", (String) null);
        AnonymousClass4WB r1 = new AnonymousClass4WB(new AnonymousClass61P(this));
        this.A0F = r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.setAdapter(r1);
        }
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator((AnonymousClass0UY) null);
        }
        A1V().A00(this.A00, "emoji_set_up_sections_end", (String) null);
        C616131n.A02((C85494Gl) null, new EmojiExpressionsFragment$observeState$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        C616131n.A02((C85494Gl) null, new EmojiExpressionsFragment$observeExpressionsSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        if (!this.A02.A0X(5627)) {
            Bundle bundle2 = this.A06;
            if (bundle2 != null && bundle2.getBoolean("isCollapsed")) {
                BPL();
            }
        } else if (this.A02.A0X(6653)) {
            AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A08;
            if (autoFitGridRecyclerView2 != null) {
                if (!C06360Xi.A05(autoFitGridRecyclerView2) || autoFitGridRecyclerView2.isLayoutRequested()) {
                    AnonymousClass691.A00(autoFitGridRecyclerView2, this, 6);
                } else {
                    C86634Kw.A0i(this).A0D(A1U());
                }
            }
        } else {
            C86634Kw.A0i(this).A0D(0);
        }
        A1V().A00(this.A00, "emoji_on_view_created_end", (String) null);
        A1V().A01(C999858y.SUCCESS, this.A00);
    }

    public void onConfigurationChanged(Configuration configuration) {
        AutoFitGridRecyclerView autoFitGridRecyclerView;
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A02.A0X(6653) && (autoFitGridRecyclerView = this.A08) != null) {
            AnonymousClass691.A00(autoFitGridRecyclerView, this, 5);
        }
    }

    public final int A1U() {
        int i;
        AutoFitGridRecyclerView autoFitGridRecyclerView = this.A08;
        if (autoFitGridRecyclerView != null) {
            i = autoFitGridRecyclerView.getWidth();
        } else {
            i = 0;
        }
        return i / C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public final C104185Pz A1V() {
        C104185Pz r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("expressionsTrayPerformanceLogger");
    }

    public void BPL() {
        EmojiExpressionsViewModel A0i;
        int i;
        if (this.A02.A0X(6653)) {
            AutoFitGridRecyclerView autoFitGridRecyclerView = this.A08;
            if (autoFitGridRecyclerView == null) {
                return;
            }
            if (!C06360Xi.A05(autoFitGridRecyclerView) || autoFitGridRecyclerView.isLayoutRequested()) {
                AnonymousClass691.A00(autoFitGridRecyclerView, this, 4);
                return;
            } else {
                A0i = C86634Kw.A0i(this);
                i = A1U();
            }
        } else {
            A0i = C86634Kw.A0i(this);
            i = 0;
        }
        A0i.A0D(i);
    }

    public EmojiExpressionsFragment() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C119595xE(new C119605xF(this)));
        AnonymousClass8PJ r4 = new AnonymousClass8PJ(EmojiExpressionsViewModel.class);
        this.A0I = new C13750ng(new C78133uW(A002), new C80423yD(this, A002), new C80413yC(A002), r4);
    }

    public void A0c() {
        super.A0c();
        AnonymousClass5OY r2 = this.A0G;
        if (r2 != null) {
            AnonymousClass4C6 r0 = r2.A00;
            if (r0 != null) {
                AnonymousClass349.A03((CancellationException) null, r0);
            }
            r2.A00 = null;
            r2.A04.clear();
            this.A02 = null;
            this.A08 = null;
            this.A05 = null;
            this.A07 = null;
            this.A06 = null;
            this.A01 = null;
            this.A0A = null;
            this.A04 = null;
            this.A0D = null;
            this.A0F = null;
            this.A09 = null;
            this.A0B = null;
            return;
        }
        throw C18270x1.A0S("emojiImageViewLoader");
    }

    public final void A1W(int i) {
        C06440Xs r2;
        Paint A0Z = C86664Kz.A0Z();
        C86614Ku.A10(A0G(), A0Z, R.color.f5nameremoved);
        AnonymousClass1VX r5 = this.A02;
        C162457s7.A0C(r5);
        AnonymousClass5OY r3 = this.A0G;
        if (r3 != null) {
            AnonymousClass4WC r1 = new AnonymousClass4WC(A0Z, r3, A1V(), r5, new C1222263o(this), new C1222363p(this), i, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
            this.A0D = r1;
            AutoFitGridRecyclerView autoFitGridRecyclerView = this.A08;
            if (autoFitGridRecyclerView != null) {
                autoFitGridRecyclerView.setAdapter(r1);
                autoFitGridRecyclerView.setItemAnimator((AnonymousClass0UY) null);
                C1231767k.A00(autoFitGridRecyclerView, this, 8);
                C003203q A0Q = A0Q();
                if (A0Q != null) {
                    C105115Tq r22 = A1V().A00;
                    r22.A02(A0Q);
                    autoFitGridRecyclerView.A0q(new C88034Xb(r22, 11));
                }
            }
            AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A08;
            if (autoFitGridRecyclerView2 != null) {
                r2 = autoFitGridRecyclerView2.getLayoutManager();
            } else {
                r2 = null;
            }
            C162457s7.A0K(r2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
            gridLayoutManager.A01 = new C1231167e(this, 0, gridLayoutManager);
            this.A05 = gridLayoutManager;
            return;
        }
        throw C18270x1.A0S("emojiImageViewLoader");
    }
}
