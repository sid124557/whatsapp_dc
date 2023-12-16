package com.whatsapp.picker.search;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass4BP;
import X.AnonymousClass5RA;
import X.C08310eF;
import X.C115975pX;
import X.C125306Hh;
import X.C150137Pj;
import X.C162457s7;
import X.C175468Ym;
import X.C18270x1;
import X.C626936e;
import X.C86604Kt;
import X.C86654Ky;
import X.C88064Xe;
import X.C94264qq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public final class StickerSearchTabFragment extends Hilt_StickerSearchTabFragment implements AnonymousClass4BP {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public AnonymousClass1VX A02;
    public C125306Hh A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass5RA r0;
        AnonymousClass33O r9;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A01 = C86654Ky.A0P(inflate, R.id.tab_result);
        C162457s7.A0H(inflate);
        C115975pX r6 = A1I().A00;
        C626936e.A06(r6);
        List A0s = AnonymousClass001.A0s();
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("sticker_category_tab");
            C86604Kt.A1N(A0V(), A1I().A1U().A01, new C175468Ym(this, i), 314);
            A0s = A1I().A1V(i);
        }
        C94264qq r02 = r6.A00;
        if (!(r02 == null || (r0 = r02.A0D) == null || (r9 = r0.A0A) == null)) {
            C125306Hh r7 = new C125306Hh(A0G(), r9, this, AnonymousClass001.A0f(), A0s);
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(r7);
                C150137Pj r4 = new C150137Pj(A0G(), viewGroup, recyclerView, r7);
                this.A00 = r4.A05;
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
                AnonymousClass1VX r3 = this.A02;
                if (r3 != null) {
                    recyclerView.A0q(new C88064Xe(C08310eF.A09(this), r4.A06, r3));
                } else {
                    throw C18270x1.A0R();
                }
            }
            this.A03 = r7;
        }
        return inflate;
    }

    public void A0e() {
        C125306Hh r0 = this.A03;
        if (r0 != null) {
            r0.A04 = false;
            r0.A05();
        }
        super.A0e();
    }

    public void A0c() {
        List list;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A01;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A00);
        }
        RecyclerView recyclerView2 = this.A01;
        if (!(recyclerView2 == null || (list = recyclerView2.A0b) == null)) {
            list.clear();
        }
        super.A0c();
        this.A01 = null;
    }

    public final StickerSearchDialogFragment A1I() {
        C08310eF r1 = this.A0E;
        if (r1 instanceof StickerSearchDialogFragment) {
            C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            return (StickerSearchDialogFragment) r1;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }

    public void A0f() {
        super.A0f();
        C125306Hh r0 = this.A03;
        if (r0 != null) {
            r0.A04 = true;
            r0.A05();
        }
    }

    public void Bci(AnonymousClass39M r2, Integer num, int i) {
        A1I().Bci(r2, num, i);
    }
}
