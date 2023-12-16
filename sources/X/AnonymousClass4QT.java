package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.RevokedMessageText;

/* renamed from: X.4QT  reason: invalid class name */
public final class AnonymousClass4QT extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) C18290x4.A0M(this, R.id.revoked_comment_container));
    public CommentHeader A01 = ((CommentHeader) C18290x4.A0M(this, R.id.revoked_comment_header));
    public ContactPictureView A02 = ((ContactPictureView) C18290x4.A0M(this, R.id.revoked_comment_profile_pic));
    public RevokedMessageText A03 = ((RevokedMessageText) C18290x4.A0M(this, R.id.revoked_comment_text));
    public final AnonymousClass66R A04;

    public AnonymousClass4QT(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A04 = C154517dI.A01(new C119435wy(context));
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public final void setRevokedCommentContactPicture(ContactPictureView contactPictureView) {
        C162457s7.A0J(contactPictureView, 0);
        this.A02 = contactPictureView;
    }

    public final void setRevokedCommentContainer(LinearLayout linearLayout) {
        C162457s7.A0J(linearLayout, 0);
        this.A00 = linearLayout;
    }

    public final void setRevokedCommentHeader(CommentHeader commentHeader) {
        C162457s7.A0J(commentHeader, 0);
        this.A01 = commentHeader;
    }

    public final void setRevokedMessageText(RevokedMessageText revokedMessageText) {
        C162457s7.A0J(revokedMessageText, 0);
        this.A03 = revokedMessageText;
    }

    private final void setupClickListener(C624134x r3) {
        C1237169m.A00(this.A00, r3, this, 3);
    }

    public final void A00(C105365Uq r2, C624134x r3) {
        this.A02.A08(r2, r3);
        this.A03.A0L(r3);
        this.A01.A00(r3);
        setupClickListener(r3);
    }

    public final C89654ea getActivity() {
        return (C89654ea) this.A04.getValue();
    }

    public final ContactPictureView getRevokedCommentContactPicture() {
        return this.A02;
    }

    public final LinearLayout getRevokedCommentContainer() {
        return this.A00;
    }

    public final CommentHeader getRevokedCommentHeader() {
        return this.A01;
    }

    public final RevokedMessageText getRevokedMessageText() {
        return this.A03;
    }
}
