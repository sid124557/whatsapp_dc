package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.3AB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AB implements TextView.OnEditorActionListener {
    public final /* synthetic */ WaEditText A00;
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet A01;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = this.A01;
        WaEditText waEditText = this.A00;
        if (i != 3) {
            return false;
        }
        C18320x8.A0L(expressionsKeyboardSearchBottomSheet).A0E(String.valueOf(waEditText.getText()));
        waEditText.A05();
        return false;
    }

    public /* synthetic */ AnonymousClass3AB(WaEditText waEditText, ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        this.A01 = expressionsKeyboardSearchBottomSheet;
        this.A00 = waEditText;
    }
}
