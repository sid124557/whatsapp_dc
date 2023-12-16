package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.5g1  reason: invalid class name and case insensitive filesystem */
public class C110305g1 implements TextView.OnEditorActionListener {
    public boolean A00;
    public final /* synthetic */ C113245l7 A01;

    public C110305g1(C113245l7 r1) {
        this.A01 = r1;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("conversation/editor/enter :");
            C18260x0.A1F(A0o, keyEvent.getKeyCode());
        }
        if (i == 4) {
            this.A01.A2J(false);
            return true;
        } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        } else {
            if (this.A00) {
                this.A00 = false;
                return true;
            }
            C113245l7 r3 = this.A01;
            if (AnonymousClass0x2.A0F(C113245l7.A0D(r3)).getBoolean("input_enter_send", true)) {
                r3.A2J(false);
            } else {
                int selectionStart = r3.A4P.getSelectionStart();
                int selectionEnd = r3.A4P.getSelectionEnd();
                if (selectionStart != r3.A4P.length()) {
                    r3.A4P.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), "\n", 0, 1);
                } else {
                    r3.A4P.append("\n");
                }
            }
            this.A00 = true;
            return true;
        }
    }
}
