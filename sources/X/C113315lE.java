package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

/* renamed from: X.5lE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C113315lE implements AnonymousClass658 {
    public final /* synthetic */ ViewNewsletterProfilePhoto A00;
    public final /* synthetic */ boolean A01;

    public final void BPS(Object obj) {
        String str;
        boolean z = this.A01;
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.A00;
        Bitmap bitmap = (Bitmap) obj;
        int i = 8;
        if (bitmap != null || z) {
            viewNewsletterProfilePhoto.A76().setVisibility(0);
            TextView textView = viewNewsletterProfilePhoto.A02;
            if (textView != null) {
                textView.setVisibility(8);
                View view = viewNewsletterProfilePhoto.A00;
                if (view != null) {
                    AnonymousClass1RL A78 = viewNewsletterProfilePhoto.A78();
                    if ((A78 == null || (str = A78.A0J) == null || str.length() == 0) && !z) {
                        i = 0;
                    }
                    view.setVisibility(i);
                    viewNewsletterProfilePhoto.A74().setVisibility(0);
                    if (bitmap != null) {
                        viewNewsletterProfilePhoto.A76().A06(bitmap);
                        viewNewsletterProfilePhoto.A74().setImageBitmap(bitmap);
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("progressView");
            }
            throw C18270x1.A0S("messageView");
        }
        viewNewsletterProfilePhoto.A76().setVisibility(8);
        View view2 = viewNewsletterProfilePhoto.A00;
        if (view2 != null) {
            view2.setVisibility(8);
            TextView textView2 = viewNewsletterProfilePhoto.A02;
            if (textView2 != null) {
                textView2.setVisibility(0);
                viewNewsletterProfilePhoto.A74().setVisibility(8);
                TextView textView3 = viewNewsletterProfilePhoto.A02;
                if (textView3 != null) {
                    textView3.setText(R.string.f11nameremoved);
                    return;
                }
                throw C18270x1.A0S("messageView");
            }
            throw C18270x1.A0S("messageView");
        }
        throw C18270x1.A0S("progressView");
    }

    public /* synthetic */ C113315lE(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto, boolean z) {
        this.A01 = z;
        this.A00 = viewNewsletterProfilePhoto;
    }
}
