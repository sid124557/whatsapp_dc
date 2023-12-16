package com.whatsapp.newsletter.ui.reactions;

import X.C18260x0;
import X.C378924l;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.reactions.ReactionEmojiTextView;

public final class NewsletterReactionEmojiTextView extends ReactionEmojiTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterReactionEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18260x0.A0Q(context, attributeSet);
    }

    public void A0L() {
        this.A01 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved) / 2.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterReactionEmojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18260x0.A0Q(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewsletterReactionEmojiTextView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
