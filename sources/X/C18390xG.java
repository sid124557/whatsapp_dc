package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

/* renamed from: X.0xG  reason: invalid class name and case insensitive filesystem */
public class C18390xG extends ProgressDialog {
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 84) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public C18390xG(Context context) {
        super(context);
    }
}
