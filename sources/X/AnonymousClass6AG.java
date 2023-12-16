package X;

import android.widget.PopupWindow;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.6AG  reason: invalid class name */
public class AnonymousClass6AG implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6AG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDismiss() {
        ReactionsTrayViewModel reactionsTrayViewModel;
        if (this.A01 != 0) {
            ((C105395Ut) this.A00).A06();
            return;
        }
        C112975kg r2 = (C112975kg) this.A00;
        C89224c7 emojiPopupWindow = r2.A0N.getEmojiPopupWindow();
        if (r2.A0N.BIc() && emojiPopupWindow != null && !emojiPopupWindow.A02 && (reactionsTrayViewModel = r2.A0v) != null) {
            reactionsTrayViewModel.A0D(0);
        }
    }
}
