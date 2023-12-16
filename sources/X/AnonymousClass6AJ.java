package X;

import android.view.ViewTreeObserver;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.6AJ  reason: invalid class name */
public class AnonymousClass6AJ implements C15580rb {
    public Object A00;
    public final int A01;

    public AnonymousClass6AJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRK(C05430Th r4) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C109735f6 r2 = (C109735f6) obj;
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) r2.A06;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) r2.A06).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) r2.A02);
                }
                r2.A06 = null;
            }
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) r2.A03;
            statusPlaybackBaseFragment.A06 = false;
            statusPlaybackBaseFragment.A1I();
            return;
        }
        AnonymousClass5UG r22 = (AnonymousClass5UG) obj;
        C626936e.A0D(AnonymousClass000.A1W(r22.A00), "GroupConversationMenu/onPopupMenuDismissListener selected menu item is null");
        r22.A00.setAlpha(1.0f);
    }
}
