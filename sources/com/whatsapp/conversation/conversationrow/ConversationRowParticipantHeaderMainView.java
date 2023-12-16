package com.whatsapp.conversation.conversationrow;

import X.C125096Fh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class ConversationRowParticipantHeaderMainView extends C125096Fh {
    public View getPrimaryNameView() {
        return getChildAt(0);
    }

    public View getSecondaryNameView() {
        return getChildAt(1);
    }

    public /* bridge */ /* synthetic */ void setShouldTruncateNameViewWhenNeeded(boolean z) {
        this.A00 = z;
    }

    public ConversationRowParticipantHeaderMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationRowParticipantHeaderMainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRowParticipantHeaderMainView(Context context) {
        super(context);
    }
}
