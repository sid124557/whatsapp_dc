package X;

import android.view.View;
import android.widget.Button;

/* renamed from: X.75S  reason: invalid class name */
public final class AnonymousClass75S {
    public static final void A00(Button button, AnonymousClass7YW r3, int i) {
        String str;
        C162457s7.A0J(button, 0);
        View.OnClickListener onClickListener = null;
        if (r3 != null) {
            str = r3.A01;
        } else {
            str = null;
        }
        button.setText(str);
        if (r3 != null) {
            i = 0;
        }
        button.setVisibility(i);
        if (r3 != null) {
            onClickListener = r3.A00;
        }
        button.setOnClickListener(onClickListener);
    }
}
