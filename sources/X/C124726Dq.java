package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

/* renamed from: X.6Dq  reason: invalid class name and case insensitive filesystem */
public final class C124726Dq extends Handler {
    public final /* synthetic */ ViewNewsletterProfilePhoto A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124726Dq(Looper looper, ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        super(looper);
        this.A00 = viewNewsletterProfilePhoto;
    }

    public void handleMessage(Message message) {
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.A00;
        viewNewsletterProfilePhoto.A05.A0H(R.string.f11nameremoved, 0);
        viewNewsletterProfilePhoto.findViewById(R.id.progress_bar).setVisibility(8);
    }
}
