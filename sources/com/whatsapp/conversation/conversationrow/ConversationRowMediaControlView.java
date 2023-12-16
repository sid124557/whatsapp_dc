package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0x2;
import X.AnonymousClass5UY;
import X.AnonymousClass92F;
import X.C162457s7;
import X.C18280x3;
import X.C86604Kt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public final class ConversationRowMediaControlView extends FrameLayout {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass5UY A04;
    public final AnonymousClass5UY A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A04 = AnonymousClass0x2.A0M(this, R.id.media_control_cancel_btn);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.media_control_progress_bar);
        this.A05 = A0M;
        A0M.A09(new AnonymousClass92F(3));
        this.A01 = C86604Kt.A0J(this, R.id.media_control_icon);
        this.A00 = C18280x3.A0E(this, R.id.media_control_btn);
        this.A02 = AnonymousClass0x2.A0I(this, R.id.media_control_primary_text);
        this.A03 = AnonymousClass0x2.A0I(this, R.id.media_control_secondary_text);
    }

    public final View getButton() {
        return this.A00;
    }

    public final AnonymousClass5UY getCancelBtnViewStubHolder() {
        return this.A04;
    }

    public final ImageView getIcon() {
        return this.A01;
    }

    public final TextView getPrimaryTextView() {
        return this.A02;
    }

    public final AnonymousClass5UY getProgressBarViewStubHolder() {
        return this.A05;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
