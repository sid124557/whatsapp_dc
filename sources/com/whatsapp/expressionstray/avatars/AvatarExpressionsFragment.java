package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass09N;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1TW;
import X.AnonymousClass1TY;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2SD;
import X.AnonymousClass2UW;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass45N;
import X.AnonymousClass4A9;
import X.AnonymousClass4AA;
import X.AnonymousClass4AB;
import X.AnonymousClass4BP;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.AnonymousClass4H1;
import X.AnonymousClass4HC;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C06440Xs;
import X.C06560Yg;
import X.C08310eF;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C18330xA;
import X.C195211m;
import X.C23491Tl;
import X.C23551Tr;
import X.C43952Uc;
import X.C45952aq;
import X.C47712dh;
import X.C49932hK;
import X.C54292oU;
import X.C56352rq;
import X.C56952sp;
import X.C58422vE;
import X.C616131n;
import X.C626936e;
import X.C77913uA;
import X.C77923uB;
import X.C77933uC;
import X.C77943uD;
import X.C77953uE;
import X.C77963uF;
import X.C80353y6;
import X.C80363y7;
import X.C80373y8;
import X.C80383y9;
import X.C818841l;
import X.C84814Du;
import X.C85494Gl;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;

public final class AvatarExpressionsFragment extends Hilt_AvatarExpressionsFragment implements AnonymousClass4AA, AnonymousClass4BP, AnonymousClass4A9, AnonymousClass4AB {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public ImageView A05;
    public CoordinatorLayout A06;
    public GridLayoutManager A07;
    public RecyclerView A08;
    public RecyclerView A09;
    public C56352rq A0A;
    public WaImageView A0B;
    public C54292oU A0C;
    public ExpressionsSearchViewModel A0D;
    public AvatarStickersCategoriesView A0E;
    public C195211m A0F;
    public AnonymousClass2UW A0G;
    public AnonymousClass2SD A0H;
    public AnonymousClass33O A0I;
    public StickerView A0J;
    public C49932hK A0K;
    public boolean A0L;
    public final AnonymousClass66R A0M;
    public final AnonymousClass4GR A0N = new AnonymousClass45N(this);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        boolean z;
        C06440Xs r3;
        C06440Xs r1;
        AnonymousClass09N r12;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        this.A03 = C06560Yg.A02(view2, R.id.avatar_vscroll_view);
        this.A09 = (RecyclerView) C06560Yg.A02(view2, R.id.items);
        this.A0E = (AvatarStickersCategoriesView) C06560Yg.A02(view2, R.id.categories);
        this.A08 = (RecyclerView) C06560Yg.A02(view2, R.id.avatar_search_results);
        this.A00 = C06560Yg.A02(view2, R.id.avatar_tab_search_no_results);
        this.A0B = AnonymousClass0x9.A0L(view2, R.id.no_results_image);
        this.A06 = (CoordinatorLayout) C06560Yg.A02(view2, R.id.snack_bar_view);
        ViewStub viewStub = (ViewStub) C06560Yg.A02(view2, R.id.no_avatar_available_stub);
        View inflate = viewStub.inflate();
        this.A01 = C06560Yg.A02(inflate, R.id.no_avatar_available_create_button);
        this.A02 = C06560Yg.A02(inflate, R.id.avatar_not_available_image_set);
        this.A05 = AnonymousClass0x9.A0E(inflate, R.id.avatar_not_available_image2);
        this.A0J = (StickerView) C06560Yg.A02(inflate, R.id.avatar_not_available_image2_animated);
        this.A04 = viewStub;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("isExpressionsSearch");
        } else {
            z = false;
        }
        if (z) {
            AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C77913uA(new C77933uC(this)));
            AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ExpressionsSearchViewModel.class);
            this.A0D = (ExpressionsSearchViewModel) C18330xA.A02(new C77923uB(A002), new C80363y7(this, A002), new C80353y6(A002), A1E).getValue();
        }
        AnonymousClass1VX r6 = this.A02;
        C162457s7.A0C(r6);
        AnonymousClass33O r7 = this.A0I;
        if (r7 != null) {
            C56352rq r4 = this.A0A;
            if (r4 != null) {
                int i = 6;
                if (z) {
                    i = 1;
                }
                AnonymousClass4GR r15 = this.A0N;
                AnonymousClass2SD r5 = this.A0H;
                if (r5 != null) {
                    C195211m r32 = new C195211m(r4, r5, r6, r7, this, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GP) null, new C818841l(this), (AnonymousClass4GQ) null, r15, i);
                    this.A0F = r32;
                    RecyclerView recyclerView = this.A09;
                    if (recyclerView != null) {
                        AnonymousClass0UY r13 = recyclerView.A0R;
                        if ((r13 instanceof AnonymousClass09N) && (r12 = (AnonymousClass09N) r13) != null) {
                            r12.A00 = false;
                        }
                        recyclerView.setAdapter(r32);
                    }
                    AvatarStickersCategoriesView avatarStickersCategoriesView = this.A0E;
                    if (avatarStickersCategoriesView != null) {
                        avatarStickersCategoriesView.A00 = this;
                        avatarStickersCategoriesView.setLifestyleVisibility(C56952sp.A0J(this.A02, 4821));
                    }
                    RecyclerView recyclerView2 = this.A09;
                    if (recyclerView2 != null) {
                        recyclerView2.A0q(new AnonymousClass4HC(C08310eF.A09(this), recyclerView2.getLayoutManager(), this, this.A02));
                    }
                    RecyclerView recyclerView3 = this.A09;
                    if (recyclerView3 != null) {
                        r3 = recyclerView3.getLayoutManager();
                    } else {
                        r3 = null;
                    }
                    C162457s7.A0K(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) r3;
                    gridLayoutManager.A01 = new AnonymousClass4H1(gridLayoutManager, 0, this);
                    this.A07 = gridLayoutManager;
                    C195211m r33 = this.A0F;
                    if (r33 == null) {
                        AnonymousClass1VX r62 = this.A02;
                        AnonymousClass33O r72 = this.A0I;
                        if (r72 != null) {
                            C56352rq r42 = this.A0A;
                            if (r42 != null) {
                                AnonymousClass2SD r52 = this.A0H;
                                if (r52 != null) {
                                    C162457s7.A0H(r62);
                                    r33 = new C195211m(r42, r52, r62, r72, this, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GQ) null, (AnonymousClass4GQ) null, r15, 1);
                                    this.A0F = r33;
                                } else {
                                    throw C18270x1.A0S("shapeImageViewLoader");
                                }
                            } else {
                                throw C18270x1.A0S("referenceCountedFileManager");
                            }
                        } else {
                            throw C18270x1.A0S("stickerImageFileLoader");
                        }
                    }
                    RecyclerView recyclerView4 = this.A08;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(r33);
                    }
                    RecyclerView recyclerView5 = this.A08;
                    if (recyclerView5 != null) {
                        r1 = recyclerView5.getLayoutManager();
                    } else {
                        r1 = null;
                    }
                    C162457s7.A0K(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager2 = (GridLayoutManager) r1;
                    gridLayoutManager2.A01 = new AnonymousClass4H1(gridLayoutManager2, 1, this);
                    Configuration configuration = C08310eF.A09(this).getConfiguration();
                    C162457s7.A0D(configuration);
                    A1U(configuration);
                    C616131n.A02((C85494Gl) null, new AvatarExpressionsFragment$observeState$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                    C616131n.A02((C85494Gl) null, new AvatarExpressionsFragment$observeStarredStickerSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                    boolean z2 = false;
                    if (C56952sp.A0B(this)) {
                        AnonymousClass0x9.A0O(this).A0E();
                        BmS(true);
                    } else {
                        Bundle bundle3 = this.A06;
                        if (bundle3 != null && bundle3.getBoolean("isCollapsed")) {
                            BPL();
                        }
                    }
                    Bundle bundle4 = this.A06;
                    if (bundle4 != null) {
                        z2 = bundle4.getBoolean("isSelected");
                    }
                    BmS(z2);
                    return;
                }
                throw C18270x1.A0S("shapeImageViewLoader");
            }
            throw C18270x1.A0S("referenceCountedFileManager");
        }
        throw C18270x1.A0S("stickerImageFileLoader");
    }

    public void BOc(C43952Uc r7) {
        int i;
        AnonymousClass2UW A012;
        C23491Tl r1;
        C195211m r4 = this.A0F;
        if (r4 != null) {
            int A0G2 = r4.A0G();
            i = 0;
            while (true) {
                if (i >= A0G2) {
                    break;
                }
                Object A0K2 = r4.A0K(i);
                if ((A0K2 instanceof C23491Tl) && (r1 = (C23491Tl) A0K2) != null && (r1.A00 instanceof C23551Tr) && C162457s7.A0P(((C23551Tr) r1.A00).A00, r7)) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        GridLayoutManager gridLayoutManager = this.A07;
        if (gridLayoutManager != null) {
            gridLayoutManager.A1Y(i, 0);
        }
        C195211m r0 = this.A0F;
        if (r0 != null && (A012 = ((C47712dh) r0.A0K(i)).A01()) != null) {
            AnonymousClass66R r3 = this.A0M;
            C45952aq r12 = ((AvatarExpressionsViewModel) r3.getValue()).A03;
            AnonymousClass1TY r02 = AnonymousClass1TY.A00;
            r12.A00(r02, r02, 5);
            this.A0G = A012;
            ((AvatarExpressionsViewModel) r3.getValue()).A0F(A012);
        }
    }

    public void Bci(AnonymousClass39M r10, Integer num, int i) {
        AnonymousClass39M r5 = r10;
        Integer num2 = num;
        int i2 = i;
        if (r10 == null) {
            C626936e.A0D(false, "Sticker was null, should not happen.");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onStickerSelected(sticker=null, origin=");
            A0o.append(num);
            A0o.append(", position=");
            Log.e(C18260x0.A09(A0o, i));
            return;
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.A0D;
        if (expressionsSearchViewModel != null) {
            C616131n.A02(expressionsSearchViewModel.A0H, new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r5, num2, (C84814Du) null, i2), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 2);
            return;
        }
        AvatarExpressionsViewModel A0O = AnonymousClass0x9.A0O(this);
        C616131n.A02(A0O.A0D, new AvatarExpressionsViewModel$onStickerSelected$1(A0O, r5, num2, (C84814Du) null, i2), AnonymousClass0IV.A00(A0O), (AnonymousClass20D) null, 2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C06440Xs r2;
        C06440Xs r22;
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            r2 = recyclerView.getLayoutManager();
        } else {
            r2 = null;
        }
        C162457s7.A0K(r2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
        gridLayoutManager.A01 = new AnonymousClass4H1(gridLayoutManager, 0, this);
        this.A07 = gridLayoutManager;
        RecyclerView recyclerView2 = this.A08;
        if (recyclerView2 != null) {
            r22 = recyclerView2.getLayoutManager();
        } else {
            r22 = null;
        }
        C162457s7.A0K(r22, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) r22;
        gridLayoutManager2.A01 = new AnonymousClass4H1(gridLayoutManager2, 1, this);
        A1U(configuration);
    }

    public final void A1U(Configuration configuration) {
        int i;
        View view = this.A01;
        if (view != null) {
            C18310x6.A18(view, this, 21);
        }
        int i2 = configuration.orientation;
        View view2 = this.A02;
        if (i2 == 1) {
            if (view2 != null) {
                i = 0;
            } else {
                return;
            }
        } else if (view2 != null) {
            i = 8;
        } else {
            return;
        }
        view2.setVisibility(i);
    }

    public void BmS(boolean z) {
        if (this.A0L == z && this.A02.A0Y(C58422vE.A02, 4890)) {
            AvatarExpressionsViewModel A0O = AnonymousClass0x9.A0O(this);
            if (A0O.A0G.getValue() instanceof AnonymousClass1TW) {
                A0O.A06.A03((Boolean) null, 1);
            }
        }
        this.A0L = z;
        C195211m r2 = this.A0F;
        if (r2 != null) {
            r2.A01 = z;
            r2.A00 = C18280x3.A00(z ? 1 : 0);
            GridLayoutManager gridLayoutManager = this.A07;
            if (gridLayoutManager != null) {
                int A1G = gridLayoutManager.A1G();
                r2.A09(A1G, gridLayoutManager.A1I() - A1G);
            }
        }
    }

    public AvatarExpressionsFragment() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C77943uD(new C77963uF(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(AvatarExpressionsViewModel.class);
        this.A0M = C18330xA.A02(new C77953uE(A002), new C80383y9(this, A002), new C80373y8(A002), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A03 = null;
        this.A04 = null;
        this.A09 = null;
        this.A0F = null;
        this.A07 = null;
        this.A0E = null;
        this.A08 = null;
        this.A00 = null;
        this.A0B = null;
        this.A06 = null;
    }

    public void A12(boolean z) {
        if (C56952sp.A0B(this)) {
            BmS(!z);
        }
    }

    public void BPL() {
        AnonymousClass0x9.A0O(this).A0E();
    }
}
