package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.0Zt  reason: invalid class name */
public class AnonymousClass0Zt implements TextWatcher {
    public EditText A00;
    public String A01;
    public ArrayList A02;
    public boolean A03 = false;
    public boolean A04 = false;

    public void afterTextChanged(Editable editable) {
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A03 && !this.A04) {
                this.A04 = true;
            } else if (!this.A04) {
                this.A04 = true;
                if (this.A02.contains(Integer.valueOf(selectionStart))) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i = selectionStart - 1;
                        if (this.A01.charAt(i) == '#') {
                            editable.delete(i, selectionStart);
                            selectionStart = i;
                            break;
                        }
                        editable.delete(i, selectionStart);
                        selectionStart--;
                    }
                }
            } else {
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            int i2 = 0;
            for (int i3 = 0; i3 < editable.length(); i3++) {
                if (Character.isDigit(editable.charAt(i3))) {
                    A0o.append(editable.charAt(i3));
                    if (i3 < selectionStart) {
                        i2++;
                    }
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < A0o.length()) {
                String str = this.A01;
                if (i5 >= str.length()) {
                    break;
                }
                if (str.charAt(i5) == '#') {
                    A0o2.append(A0o.charAt(i4));
                    if (i4 < i2) {
                        i6++;
                    }
                    i4++;
                } else {
                    A0o2.append(this.A01.charAt(i5));
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String substring = this.A01.substring(i5);
            if (!substring.isEmpty() && !substring.contains(String.valueOf('#'))) {
                A0o2.append(substring);
                if (i4 <= i2) {
                    i6 += substring.length();
                }
            }
            this.A00.setText(A0o2);
            this.A00.setSelection(i6);
            this.A04 = false;
        }
    }

    public AnonymousClass0Zt(EditText editText, String str) {
        this.A01 = str;
        A00();
        this.A00 = editText;
    }

    public final void A00() {
        this.A02 = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i < str.length()) {
                if (str.charAt(i) != '#') {
                    this.A02.add(Integer.valueOf(i));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = AnonymousClass001.A1Y(i3, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
