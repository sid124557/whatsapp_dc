package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass123;
import X.AnonymousClass124;
import X.AnonymousClass262;
import X.AnonymousClass4A9;
import X.AnonymousClass4AB;
import X.AnonymousClass4C8;
import X.AnonymousClass4FV;
import X.AnonymousClass4GR;
import X.AnonymousClass4H3;
import X.AnonymousClass4J6;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C06560Yg;
import X.C106095Xp;
import X.C133876i5;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C18330xA;
import X.C26691cc;
import X.C49872hE;
import X.C56952sp;
import X.C57742u8;
import X.C60152y5;
import X.C620633i;
import X.C635339p;
import X.C72923eW;
import X.C78143uX;
import X.C78153uY;
import X.C78163uZ;
import X.C78173ua;
import X.C78183ub;
import X.C78193uc;
import X.C80433yE;
import X.C80443yF;
import X.C80453yG;
import X.C80463yH;
import X.C819141o;
import X.C819241p;
import X.C84814Du;
import X.C85474Gj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView;
import java.util.concurrent.CancellationException;

public final class GifExpressionsFragment extends Hilt_GifExpressionsFragment implements AnonymousClass4A9, AnonymousClass4AB {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public C620633i A04;
    public ExpressionsSearchViewModel A05;
    public AnonymousClass4FV A06;
    public C106095Xp A07;
    public AnonymousClass123 A08;
    public AdaptiveRecyclerView A09;
    public C60152y5 A0A;
    public final AnonymousClass66R A0B;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A00 = C06560Yg.A02(view, R.id.gifs_search_no_results);
        this.A02 = C06560Yg.A02(view, R.id.retry_panel);
        this.A01 = C06560Yg.A02(view, R.id.retry_button);
        this.A09 = (AdaptiveRecyclerView) C06560Yg.A02(view, R.id.search_result_view);
        this.A03 = C06560Yg.A02(view, R.id.progress_container_layout);
        AnonymousClass262 r8 = new AnonymousClass262(this, 0);
        C106095Xp r7 = this.A07;
        if (r7 != null) {
            AnonymousClass4FV r6 = this.A06;
            if (r6 != null) {
                C620633i r5 = this.A04;
                if (r5 != null) {
                    C60152y5 r9 = this.A0A;
                    if (r9 != null) {
                        this.A08 = new C26691cc(r5, r6, r7, r8, r9);
                        AdaptiveRecyclerView adaptiveRecyclerView = this.A09;
                        if (adaptiveRecyclerView != null) {
                            adaptiveRecyclerView.A0o(new AnonymousClass124(adaptiveRecyclerView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
                            adaptiveRecyclerView.setAdapter(this.A08);
                            adaptiveRecyclerView.A0q(new AnonymousClass4H3(this, 0));
                        }
                        View view2 = this.A01;
                        if (view2 != null) {
                            C635339p.A00(view2, this, 7);
                        }
                        AnonymousClass66R r4 = this.A0B;
                        AnonymousClass4K2.A00(A0V(), ((GifExpressionsSearchViewModel) r4.getValue()).A03, new C819141o(this), 94);
                        AnonymousClass4K2.A00(A0V(), ((GifExpressionsSearchViewModel) r4.getValue()).A02, new C819241p(this), 95);
                        Bundle bundle2 = this.A06;
                        boolean z = false;
                        if (bundle2 != null && bundle2.getBoolean("isExpressionsSearch")) {
                            AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78143uX(new C78163uZ(this)));
                            AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ExpressionsSearchViewModel.class);
                            this.A05 = (ExpressionsSearchViewModel) C18330xA.A02(new C78153uY(A002), new C80443yF(this, A002), new C80433yE(A002), A1E).getValue();
                        }
                        Bundle bundle3 = this.A06;
                        if (bundle3 != null) {
                            z = bundle3.getBoolean("isSelected");
                        }
                        BmS(z);
                        if (C56952sp.A0B(this)) {
                            BmS(true);
                            return;
                        }
                        return;
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                throw C18270x1.A0S("systemServices");
            }
            throw C18270x1.A0S("wamRuntime");
        }
        throw C18270x1.A0S("gifCache");
    }

    public void BmS(boolean z) {
        if (z) {
            AnonymousClass66R r1 = this.A0B;
            if (!(((GifExpressionsSearchViewModel) r1.getValue()).A02.A07() instanceof C133876i5)) {
                GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) r1.getValue();
                C85474Gj r0 = gifExpressionsSearchViewModel.A00;
                if (r0 != null) {
                    r0.AyX((CancellationException) null);
                }
                gifExpressionsSearchViewModel.A00 = C57742u8.A00(AnonymousClass0IV.A00(gifExpressionsSearchViewModel), new AnonymousClass4J6((AnonymousClass4GR) new GifExpressionsSearchViewModel$startDataLoad$1(gifExpressionsSearchViewModel, (C84814Du) null), (AnonymousClass4C8) new C72923eW((C85474Gj) null, gifExpressionsSearchViewModel.A05.A01), 10));
            }
        }
    }

    public GifExpressionsFragment() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78173ua(new C78193uc(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(GifExpressionsSearchViewModel.class);
        this.A0B = C18330xA.A02(new C78183ub(A002), new C80463yH(this, A002), new C80453yG(A002), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A09 = null;
        AnonymousClass123 r0 = this.A08;
        if (r0 != null) {
            r0.A01 = null;
            r0.A0K((C49872hE) null);
        }
        this.A08 = null;
    }

    public void BPL() {
    }
}
