package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass09N;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1Tb;
import X.AnonymousClass1U4;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2AN;
import X.AnonymousClass2SD;
import X.AnonymousClass2TK;
import X.AnonymousClass2UW;
import X.AnonymousClass33O;
import X.AnonymousClass34B;
import X.AnonymousClass39M;
import X.AnonymousClass45O;
import X.AnonymousClass4A9;
import X.AnonymousClass4AB;
import X.AnonymousClass4BP;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass4H1;
import X.AnonymousClass4HC;
import X.AnonymousClass4J6;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C06440Xs;
import X.C06560Yg;
import X.C08310eF;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C18330xA;
import X.C194911j;
import X.C195211m;
import X.C23491Tl;
import X.C45952aq;
import X.C56352rq;
import X.C56952sp;
import X.C57742u8;
import X.C57752u9;
import X.C59292wg;
import X.C616131n;
import X.C626936e;
import X.C635339p;
import X.C72913eV;
import X.C78233ug;
import X.C78243uh;
import X.C78253ui;
import X.C78263uj;
import X.C78273uk;
import X.C78283ul;
import X.C78293um;
import X.C78303un;
import X.C78313uo;
import X.C78323up;
import X.C80513yM;
import X.C80523yN;
import X.C80533yO;
import X.C80543yP;
import X.C820041x;
import X.C820141y;
import X.C84814Du;
import X.C85494Gl;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;
import com.whatsapp.R;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.util.Log;

public final class StickerExpressionsFragment extends Hilt_StickerExpressionsFragment implements AnonymousClass4BP, AnonymousClass4A9, AnonymousClass4AB {
    public View A00;
    public View A01;
    public View A02;
    public CoordinatorLayout A03;
    public GridLayoutManager A04;
    public RecyclerView A05;
    public AutoFitGridRecyclerView A06;
    public C56352rq A07;
    public ExpressionsSearchViewModel A08;
    public C195211m A09;
    public AnonymousClass2UW A0A;
    public C59292wg A0B;
    public AnonymousClass2SD A0C;
    public C194911j A0D;
    public AnonymousClass33O A0E;
    public final AnonymousClass66R A0F;
    public final AnonymousClass4GR A0G = new AnonymousClass45O(this);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        boolean z;
        int i;
        AnonymousClass4C8 r8;
        AnonymousClass09N r2;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        this.A06 = (AutoFitGridRecyclerView) C06560Yg.A02(view2, R.id.items);
        this.A05 = (RecyclerView) C06560Yg.A02(view2, R.id.packs);
        this.A00 = C06560Yg.A02(view2, R.id.stickers_search_no_results);
        this.A01 = C06560Yg.A02(view2, R.id.stickers_tab_empty);
        this.A02 = C06560Yg.A02(view2, R.id.get_stickers_btn);
        this.A03 = (CoordinatorLayout) C06560Yg.A02(view2, R.id.snack_bar_view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("isExpressionsSearch");
        } else {
            z = false;
        }
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            i = bundle3.getInt("arg_search_opener");
        } else {
            i = 0;
        }
        AnonymousClass66R r1 = this.A0F;
        ((StickerExpressionsViewModel) r1.getValue()).A08 = z;
        ((StickerExpressionsViewModel) r1.getValue()).A00 = i;
        if (z) {
            AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78233ug(new C78253ui(this)));
            AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ExpressionsSearchViewModel.class);
            this.A08 = (ExpressionsSearchViewModel) C18330xA.A02(new C78243uh(A002), new C80523yN(this, A002), new C80513yM(A002), A1E).getValue();
        }
        StickerExpressionsViewModel stickerExpressionsViewModel = (StickerExpressionsViewModel) r1.getValue();
        AnonymousClass2TK r3 = stickerExpressionsViewModel.A0H;
        if (stickerExpressionsViewModel.A00 == 7) {
            r8 = r3.A07;
        } else {
            r8 = r3.A06;
        }
        C57742u8.A00(AnonymousClass0IV.A00(stickerExpressionsViewModel), AnonymousClass2AN.A00(stickerExpressionsViewModel.A0c, new AnonymousClass4J6((AnonymousClass4GR) new StickerExpressionsViewModel$observerSearchProvider$2(stickerExpressionsViewModel, (C84814Du) null), C57752u9.A00(new StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(stickerExpressionsViewModel, (C84814Du) null), AnonymousClass34B.A03(AnonymousClass1U4.A00, r3.A05, r8, new C72913eV(0))), 10)));
        AnonymousClass1VX r82 = this.A02;
        AnonymousClass33O r9 = this.A0E;
        if (r9 != null) {
            C56352rq r6 = this.A07;
            if (r6 != null) {
                int i2 = 6;
                if (z) {
                    i2 = 1;
                }
                AnonymousClass4GR r22 = this.A0G;
                AnonymousClass2SD r7 = this.A0C;
                if (r7 != null) {
                    C162457s7.A0H(r82);
                    C195211m r5 = new C195211m(r6, r7, r82, r9, this, new C78263uj(this), new C78273uk(this), new C78283ul(this), new C78293um(this), new C820041x(this), new C820141y(this), r22, i2);
                    this.A09 = r5;
                    AutoFitGridRecyclerView autoFitGridRecyclerView = this.A06;
                    if (autoFitGridRecyclerView != null) {
                        AnonymousClass0UY r23 = autoFitGridRecyclerView.A0R;
                        if ((r23 instanceof AnonymousClass09N) && (r2 = (AnonymousClass09N) r23) != null) {
                            r2.A00 = false;
                        }
                        autoFitGridRecyclerView.setAdapter(r5);
                    }
                    C194911j r0 = new C194911j(this);
                    this.A0D = r0;
                    RecyclerView recyclerView = this.A05;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(r0);
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setItemAnimator((AnonymousClass0UY) null);
                        recyclerView.getContext();
                        C18320x8.A19(recyclerView, 0);
                    }
                    AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A06;
                    if (autoFitGridRecyclerView2 != null) {
                        autoFitGridRecyclerView2.A0q(new AnonymousClass4HC(C08310eF.A09(this), autoFitGridRecyclerView2.getLayoutManager(), this, this.A02));
                    }
                    View view3 = this.A02;
                    if (view3 != null) {
                        view3.setOnClickListener(new C635339p(this, 22));
                    }
                    A1U();
                    C616131n.A02((C85494Gl) null, new StickerExpressionsFragment$observeState$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                    C616131n.A02((C85494Gl) null, new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                    C616131n.A02((C85494Gl) null, new StickerExpressionsFragment$observeExpressionsUiSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                    if (C56952sp.A0B(this)) {
                        ((StickerExpressionsViewModel) r1.getValue()).A0L();
                        BmS(true);
                        return;
                    }
                    Bundle bundle4 = this.A06;
                    if (bundle4 != null && bundle4.getBoolean("isCollapsed")) {
                        BPL();
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("shapeImageViewLoader");
            }
            throw C18270x1.A0S("referenceCountedFileManager");
        }
        throw C18270x1.A0S("stickerImageFileLoader");
    }

    public void A1V(AnonymousClass2UW r8) {
        int i;
        C23491Tl r1;
        AnonymousClass66R r6 = this.A0F;
        C45952aq r12 = ((StickerExpressionsViewModel) r6.getValue()).A0F;
        AnonymousClass1Tb r0 = AnonymousClass1Tb.A00;
        r12.A00(r0, r0, 5);
        this.A0A = r8;
        C195211m r4 = this.A09;
        if (r4 != null) {
            int A0G2 = r4.A0G();
            i = 0;
            while (true) {
                if (i >= A0G2) {
                    break;
                }
                Object A0K = r4.A0K(i);
                if ((A0K instanceof C23491Tl) && (r1 = (C23491Tl) A0K) != null && C162457s7.A0P(r1.A00, r8)) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        GridLayoutManager gridLayoutManager = this.A04;
        if (gridLayoutManager != null) {
            gridLayoutManager.A1Y(i, 0);
        }
        ((StickerExpressionsViewModel) r6.getValue()).A0M(r8, false);
    }

    public void Bci(AnonymousClass39M r10, Integer num, int i) {
        AnonymousClass39M r5 = r10;
        if (r10 == null) {
            C626936e.A0D(false, "Sticker was null, should not happen.");
            Log.e("null sticker selected, can't send.");
            return;
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.A08;
        Integer num2 = num;
        int i2 = i;
        if (expressionsSearchViewModel != null) {
            C616131n.A02(expressionsSearchViewModel.A0H, new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r5, num2, (C84814Du) null, i2), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 2);
            return;
        }
        StickerExpressionsViewModel A0N = C18300x5.A0N(this);
        C616131n.A02(A0N.A0c, new StickerExpressionsViewModel$onStickerSelected$1(A0N, r5, num2, (C84814Du) null, i2), AnonymousClass0IV.A00(A0N), (AnonymousClass20D) null, 2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1U();
    }

    public final void A1U() {
        AutoFitGridRecyclerView autoFitGridRecyclerView = this.A06;
        C06440Xs r3 = null;
        if (autoFitGridRecyclerView != null && autoFitGridRecyclerView.getLayoutManager() == null) {
            autoFitGridRecyclerView.setLayoutManager(new GridLayoutManagerNonPredictiveAnimations(A0G(), -1));
        }
        AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A06;
        if (autoFitGridRecyclerView2 != null) {
            r3 = autoFitGridRecyclerView2.getLayoutManager();
        }
        C162457s7.A0K(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r3;
        gridLayoutManager.A01 = new AnonymousClass4H1(gridLayoutManager, 2, this);
        this.A04 = gridLayoutManager;
    }

    public void BmS(boolean z) {
        GridLayoutManager gridLayoutManager;
        C195211m r2 = this.A09;
        if (r2 != null) {
            r2.A01 = z;
            r2.A00 = C18280x3.A00(z ? 1 : 0);
            if (z && (gridLayoutManager = this.A04) != null) {
                int A1G = gridLayoutManager.A1G();
                r2.A09(A1G, gridLayoutManager.A1I() - A1G);
            }
        }
    }

    public StickerExpressionsFragment() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78303un(new C78323up(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(StickerExpressionsViewModel.class);
        this.A0F = C18330xA.A02(new C78313uo(A002), new C80543yP(this, A002), new C80533yO(A002), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A06 = null;
        this.A09 = null;
        this.A05 = null;
        this.A0D = null;
        this.A04 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        AnonymousClass33O r0 = this.A0E;
        if (r0 != null) {
            r0.A03();
            this.A02 = null;
            return;
        }
        throw C18270x1.A0S("stickerImageFileLoader");
    }

    public void A12(boolean z) {
        if (C56952sp.A0B(this)) {
            BmS(!z);
        }
    }

    public void BPL() {
        C18300x5.A0N(this).A0L();
    }
}
