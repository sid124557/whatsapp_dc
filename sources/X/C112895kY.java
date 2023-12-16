package X;

import android.view.KeyEvent;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.util.Log;

/* renamed from: X.5kY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112895kY implements AnonymousClass650 {
    public final /* synthetic */ CaptionView A00;
    public final /* synthetic */ C185458ti A01;

    public final void BUx(KeyEvent keyEvent, int i) {
        CaptionView captionView = this.A00;
        C185458ti r2 = this.A01;
        if (i == 4) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                Log.i("MediaCaptionDialog/dismiss/send");
                r2.onDismiss();
            }
        } else if (i != 66 || keyEvent.getAction() != 1 || !captionView.A04) {
        } else {
            if (keyEvent.isCtrlPressed()) {
                C86624Kv.A1A(captionView.A0E);
            } else {
                r2.BOV();
            }
        }
    }

    public /* synthetic */ C112895kY(CaptionView captionView, C185458ti r2) {
        this.A00 = captionView;
        this.A01 = r2;
    }
}
