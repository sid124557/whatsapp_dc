package com.whatsapp.components;

import X.AnonymousClass4GJ;
import X.AnonymousClass5UY;
import X.C116855qy;
import X.C18290x4;
import X.C86644Kx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class ConversationListRowHeaderView extends LinearLayout implements AnonymousClass4GJ {
    public TextEmojiLabel A00;
    public WaTextView A01;
    public AnonymousClass5UY A02;
    public AnonymousClass5UY A03;
    public C116855qy A04;
    public boolean A05;

    public void A00() {
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContactNameView() {
        return this.A00;
    }

    public WaTextView getDateView() {
        return this.A01;
    }

    public WaImageView getUnreadImportantIndicatorView() {
        return (WaImageView) this.A02.A04();
    }

    public WaTextView getUnreadIndicatorView() {
        return (WaTextView) this.A03.A04();
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(context);
    }

    public final void A01(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = C86644Kx.A0M(this, R.id.conversations_row_contact_name);
        this.A01 = C86644Kx.A0O(this, R.id.conversations_row_date);
        this.A03 = C18290x4.A0X(this, R.id.conversations_row_unread_indicator);
        this.A02 = C18290x4.A0X(this, R.id.conversations_row_important_indicator);
        setOrientation(0);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(context);
    }

    public ConversationListRowHeaderView(Context context) {
        super(context);
        A00();
        A01(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
