package com.whatsapp.payments.ui.widget;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass94O;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C378924l;
import X.C620633i;
import X.C64773Ex;
import X.C70063Zt;
import X.C95814uZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class ContactMerchantView extends AnonymousClass94O {
    public C64773Ex A00;
    public C620633i A01;
    public AnonymousClass1VX A02;
    public C106715a2 A03;
    public final TextEmojiLabel A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifier(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void A00(C95814uZ r9) {
        TextEmojiLabel textEmojiLabel = this.A04;
        AnonymousClass0x2.A12(textEmojiLabel, getSystemServices());
        AnonymousClass0x2.A14(getAbProps(), textEmojiLabel);
        AnonymousClass3ZH A07 = getContactManager().A07(r9);
        if (A07 != null) {
            String A0J = A07.A0J();
            if (A0J == null) {
                A0J = A07.A0L();
            }
            Context context = getContext();
            textEmojiLabel.setText(getLinkifier().A05(textEmojiLabel.getContext(), new C70063Zt(context, A07), AnonymousClass0x2.A0X(context, A0J, 1, R.string.f11nameremoved), "merchant-name"));
        }
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C106715a2 getLinkifier() {
        C106715a2 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A04 = (TextEmojiLabel) C18280x3.A0E(this, R.id.contact_merchant_label);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactMerchantView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
