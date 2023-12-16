package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0RP;
import X.AnonymousClass4GJ;
import X.AnonymousClass79H;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C86604Kt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class ConversationRowContactInfoLinkedAccount extends LinearLayout implements AnonymousClass4GJ {
    public WaImageView A00;
    public WaTextView A01;
    public C116855qy A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }

    public static /* synthetic */ void getAccountType$annotations() {
    }

    private final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A00;
        if (waImageView == null) {
            throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
        waImageView.setImageDrawable(drawable);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        Context context2;
        int i;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = C18280x3.A0J(this, R.id.linked_account_icon);
        this.A01 = C86604Kt.A0O(this, R.id.linked_account_info);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79H.A01);
        C162457s7.A0D(obtainStyledAttributes);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer != 0) {
                if (integer == 1) {
                    context2 = getContext();
                    i = R.drawable.ic_business_instagram;
                }
            }
            context2 = getContext();
            i = R.drawable.ic_settings_fb;
            setIcon(AnonymousClass0RP.A00(context2, i));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }

    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
