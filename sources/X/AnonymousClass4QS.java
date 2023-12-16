package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.DecryptionFailureMessageView;

/* renamed from: X.4QS  reason: invalid class name */
public final class AnonymousClass4QS extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) C18290x4.A0M(this, R.id.decryption_failure_container));
    public CommentHeader A01 = ((CommentHeader) C18290x4.A0M(this, R.id.decryption_failure_header));
    public ContactPictureView A02 = ((ContactPictureView) C18290x4.A0M(this, R.id.decryption_failure_profile_pic));
    public DecryptionFailureMessageView A03 = ((DecryptionFailureMessageView) C18290x4.A0M(this, R.id.decryption_failure_text));
    public final AnonymousClass66R A04;

    public AnonymousClass4QS(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A04 = C154517dI.A01(new C119425wx(context));
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public final void setDecryptionFailureContainer(LinearLayout linearLayout) {
        C162457s7.A0J(linearLayout, 0);
        this.A00 = linearLayout;
    }

    public final void setDecryptionFailureHeader(CommentHeader commentHeader) {
        C162457s7.A0J(commentHeader, 0);
        this.A01 = commentHeader;
    }

    public final void setDecryptionFailureProfilePicture(ContactPictureView contactPictureView) {
        C162457s7.A0J(contactPictureView, 0);
        this.A02 = contactPictureView;
    }

    public final void setDecryptionFailureText(DecryptionFailureMessageView decryptionFailureMessageView) {
        C162457s7.A0J(decryptionFailureMessageView, 0);
        this.A03 = decryptionFailureMessageView;
    }

    private final void setupClickListener(C624134x r3) {
        C1237169m.A00(this.A00, r3, this, 2);
    }

    public final void A00(C105365Uq r5, C624134x r6) {
        this.A02.A08(r5, r6);
        DecryptionFailureMessageView decryptionFailureMessageView = this.A03;
        C18260x0.A0L(decryptionFailureMessageView.getWaSharedPreferences(), "decryption_failure_views", C18280x3.A02(AnonymousClass0x2.A0F(decryptionFailureMessageView.getWaSharedPreferences()), "decryption_failure_views") + 1);
        decryptionFailureMessageView.getUiWamEventHelper().A02(r6, 2);
        this.A01.A00(r6);
        setupClickListener(r6);
    }

    public final C89654ea getActivity() {
        return (C89654ea) this.A04.getValue();
    }

    public final LinearLayout getDecryptionFailureContainer() {
        return this.A00;
    }

    public final CommentHeader getDecryptionFailureHeader() {
        return this.A01;
    }

    public final ContactPictureView getDecryptionFailureProfilePicture() {
        return this.A02;
    }

    public final DecryptionFailureMessageView getDecryptionFailureText() {
        return this.A03;
    }
}
