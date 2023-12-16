package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.68X  reason: invalid class name */
public class AnonymousClass68X implements TextView.OnEditorActionListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass68X(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        WDSButton wDSButton;
        WDSButton wDSButton2;
        if (this.A02 != 0) {
            AnonymousClass4vO r3 = (AnonymousClass4vO) this.A00;
            C114835ng r2 = (C114835ng) this.A01;
            if (i != 6) {
                return false;
            }
            if (r3 instanceof TextEntryView) {
                TextEntryView textEntryView = (TextEntryView) r3;
                textEntryView.A04.A04(textEntryView.A06);
            }
            r2.A04.A04 = C86614Ku.A0u(textView);
            r2.dismiss();
            return true;
        }
        TextView textView2 = (TextView) this.A00;
        SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = (SecretCodeAuthenticationBottomSheet) this.A01;
        if (((keyEvent == null || keyEvent.getKeyCode() != 66) && i != textView2.getImeOptions()) || (wDSButton = secretCodeAuthenticationBottomSheet.A03) == null || !wDSButton.isEnabled() || (wDSButton2 = secretCodeAuthenticationBottomSheet.A03) == null) {
            return true;
        }
        wDSButton2.callOnClick();
        return true;
    }
}
