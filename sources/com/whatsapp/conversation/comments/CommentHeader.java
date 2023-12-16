package com.whatsapp.conversation.comments;

import X.AnonymousClass20D;
import X.AnonymousClass2C4;
import X.AnonymousClass349;
import X.C107145am;
import X.C162457s7;
import X.C18290x4;
import X.C378924l;
import X.C616131n;
import X.C624134x;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class CommentHeader extends LinearLayout {
    public ContactName A00;
    public MessageDate A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = (ContactName) C18290x4.A0M(this, R.id.comment_author_name);
        this.A01 = (MessageDate) C18290x4.A0M(this, R.id.comment_date);
    }

    public final void setContactName(ContactName contactName) {
        C162457s7.A0J(contactName, 0);
        this.A00 = contactName;
    }

    public final void setMessageDate(MessageDate messageDate) {
        C162457s7.A0J(messageDate, 0);
        this.A01 = messageDate;
    }

    public final void A00(C624134x r6) {
        ContactName contactName = this.A00;
        C616131n.A02((C85494Gl) null, new ContactName$bind$1(contactName, r6, (C84814Du) null), AnonymousClass349.A02(AnonymousClass2C4.A01), (AnonymousClass20D) null, 3);
        MessageDate messageDate = this.A01;
        messageDate.setText(C107145am.A00(messageDate.getWhatsAppLocale(), messageDate.getTime().A0I(r6.A0K)));
    }

    public final ContactName getContactName() {
        return this.A00;
    }

    public final MessageDate getMessageDate() {
        return this.A01;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentHeader(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
