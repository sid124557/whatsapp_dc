package com.whatsapp.chatinfo.view.custom;

import X.C106545Zk;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;

public final class NewsletterInfoLayout extends ChatInfoLayoutV2 {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A01();
    }

    public NewsletterDetailsCard A0I() {
        ViewStub A0n = C86664Kz.A0n(this.A0D, R.id.newsletter_details_card_stub);
        if (A0n == null) {
            return null;
        }
        boolean A01 = C106545Zk.A01(this.A0U);
        int i = R.layout.f8nameremoved;
        if (A01) {
            i = R.layout.f8nameremoved;
        }
        View A0M = C86634Kw.A0M(A0n, i);
        C162457s7.A0K(A0M, "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard");
        return (NewsletterDetailsCard) A0M;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterInfoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ NewsletterInfoLayout(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterInfoLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
