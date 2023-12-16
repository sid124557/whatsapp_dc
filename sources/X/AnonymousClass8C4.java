package X;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.8C4  reason: invalid class name */
public class AnonymousClass8C4 implements C181268mT {
    public final /* synthetic */ AnonymousClass6Ff A00;

    public AnonymousClass8C4(AnonymousClass6Ff r1) {
        this.A00 = r1;
    }

    public void BRn(TextInputLayout textInputLayout) {
        View.OnFocusChangeListener onFocusChangeListener;
        AnonymousClass6Ff r3 = this.A00;
        EditText editText = r3.A08;
        if (editText != textInputLayout.A0b) {
            if (editText != null) {
                editText.removeTextChangedListener(r3.A0D);
                View.OnFocusChangeListener onFocusChangeListener2 = r3.A08.getOnFocusChangeListener();
                C153787c0 endIconDelegate = r3.getEndIconDelegate();
                if (endIconDelegate instanceof AnonymousClass6ZR) {
                    onFocusChangeListener = ((AnonymousClass6ZR) endIconDelegate).A0C;
                } else if (endIconDelegate instanceof AnonymousClass6ZQ) {
                    onFocusChangeListener = ((AnonymousClass6ZQ) endIconDelegate).A08;
                } else {
                    onFocusChangeListener = null;
                }
                if (onFocusChangeListener2 == onFocusChangeListener) {
                    r3.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.A0b;
            r3.A08 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(r3.A0D);
            }
            r3.getEndIconDelegate().A05(r3.A08);
            r3.setOnFocusChangeListenersIfNeeded(r3.getEndIconDelegate());
        }
    }
}
