package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.6F6  reason: invalid class name */
public class AnonymousClass6F6 extends InputConnectionWrapper {
    public final InputConnection A00;

    public AnonymousClass6F6(InputConnection inputConnection, InputConnection inputConnection2) {
        super(inputConnection2, true);
        this.A00 = inputConnection;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i == 1 && i2 == 0) {
            return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            return this.A00.sendKeyEvent(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
