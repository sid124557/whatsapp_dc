package X;

import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.5mW  reason: invalid class name and case insensitive filesystem */
public class C114115mW implements C184378rh {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public C114115mW(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public void BUJ() {
        this.A00.A0K.setPadding(0, 0, 0, 0);
    }

    public void BbV() {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        KeyboardPopupLayout keyboardPopupLayout = textStatusComposerActivity.A0K;
        AnonymousClass0XY A06 = C06560Yg.A06(AnonymousClass001.A0Q(textStatusComposerActivity));
        int i = 0;
        if (A06 != null) {
            i = A06.A00.A0C(7).A03;
        }
        keyboardPopupLayout.setPadding(0, 0, 0, i);
    }
}
