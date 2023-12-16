package X;

import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: X.8Cu  reason: invalid class name and case insensitive filesystem */
public class C170338Cu implements C181428mk {
    public int A00;
    public int A01 = -1;
    public TextWatcher A02;
    public TextWatcher A03;
    public TextInputEditText A04;
    public String A05;

    public boolean Blj(C153427bI r6, Object obj, int i) {
        TextInputEditText textInputEditText;
        int length;
        int length2;
        boolean z = false;
        if (i != 50) {
            return false;
        }
        this.A05 = (String) obj;
        TextInputEditText textInputEditText2 = this.A04;
        if (textInputEditText2 != null) {
            TextWatcher textWatcher = this.A03;
            if (textWatcher != null) {
                textInputEditText2.removeTextChangedListener(textWatcher);
            }
            TextWatcher textWatcher2 = this.A02;
            if (textWatcher2 != null) {
                this.A04.removeTextChangedListener(textWatcher2);
            }
            int A032 = C86624Kv.A03(this.A04) - this.A04.getSelectionEnd();
            if (this.A04.getSelectionEnd() == 0) {
                z = true;
            }
            this.A04.setText(this.A05);
            if (!z) {
                if (A032 <= 0 || A032 > (length2 = this.A05.length())) {
                    textInputEditText = this.A04;
                    length = this.A05.length();
                } else {
                    textInputEditText = this.A04;
                    length = Math.min(length2 - A032, length2);
                }
                textInputEditText.setSelection(length);
            }
            TextWatcher textWatcher3 = this.A03;
            if (textWatcher3 != null) {
                this.A04.addTextChangedListener(textWatcher3);
            }
            TextWatcher textWatcher4 = this.A02;
            if (textWatcher4 != null) {
                this.A04.addTextChangedListener(textWatcher4);
            }
        }
        return true;
    }

    public C170338Cu(String str) {
        this.A05 = str;
    }
}
