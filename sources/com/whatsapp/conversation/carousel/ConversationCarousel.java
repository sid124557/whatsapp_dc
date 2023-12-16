package com.whatsapp.conversation.carousel;

import X.AnonymousClass09Z;
import X.AnonymousClass0R6;
import X.AnonymousClass4GJ;
import X.AnonymousClass4XT;
import X.C06440Xs;
import X.C102805Ki;
import X.C111685iW;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C378924l;
import X.C620733j;
import X.C86624Kv;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class ConversationCarousel extends RecyclerView implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
        setClipToPadding(false);
        setClipChildren(false);
        if (C102805Ki.A00(getWhatsAppLocale())) {
            setLayoutDirection(1);
        }
        A0o(new AnonymousClass4XT(getWhatsAppLocale(), context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
    }

    public final void setLayoutManager(C06440Xs r2, AnonymousClass09Z r3) {
        C162457s7.A0J(r2, 0);
        setLayoutManager(r2);
        if (r3 != null) {
            r3.A06(this);
        }
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void A14(int i) {
        int i2;
        LinearLayoutManager linearLayoutManager;
        AnonymousClass0R6 r0 = this.A0N;
        int i3 = 0;
        if (r0 != null) {
            i2 = r0.A0G();
        } else {
            i2 = 0;
        }
        if (i >= 0 && i < i2) {
            if (i != 0) {
                i3 = -C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            C06440Xs layoutManager = getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.A1Y(i, i3);
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final int getCurrentPosition() {
        C06440Xs layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        C162457s7.A0K(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).A1H();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ ConversationCarousel(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationCarousel(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
