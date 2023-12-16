package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass4GJ;
import X.AnonymousClass4Uk;
import X.C116855qy;
import X.C162457s7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class ConversationRowViewInstagramPosts extends ConstraintLayout implements AnonymousClass4GJ {
    public AnonymousClass4Uk A00;
    public C116855qy A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowViewInstagramPosts(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4Uk getViewModel() {
        return this.A00;
    }

    public final void setViewModel(AnonymousClass4Uk r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowViewInstagramPosts(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public ConversationRowViewInstagramPosts(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowViewInstagramPosts(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
