package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.profile.ViewProfilePhoto;

/* renamed from: X.4MP  reason: invalid class name */
public class AnonymousClass4MP extends Handler {
    public final /* synthetic */ ViewProfilePhoto A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MP(Looper looper, ViewProfilePhoto viewProfilePhoto) {
        super(looper);
        this.A00 = viewProfilePhoto;
    }

    public void handleMessage(Message message) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        C69263Wi r2 = viewProfilePhoto.A05;
        boolean A0U = viewProfilePhoto.A09.A0U();
        int i = R.string.f11nameremoved;
        if (A0U) {
            i = R.string.f11nameremoved;
        }
        r2.A0H(i, 0);
        viewProfilePhoto.A00.setVisibility(8);
    }
}
