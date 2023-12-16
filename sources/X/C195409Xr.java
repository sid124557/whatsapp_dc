package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.9Xr  reason: invalid class name and case insensitive filesystem */
public class C195409Xr implements TextWatcher {
    public CharSequence A00;
    public ArrayList A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final EditText A04;
    public final String A05;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if (i3 < i2) {
            z = true;
        }
        this.A02 = z;
        this.A00 = charSequence;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        int length;
        boolean isLetterOrDigit;
        EditText editText = this.A04;
        int selectionStart = editText.getSelectionStart();
        if (!this.A02 && !this.A03) {
            this.A03 = true;
        } else if (!this.A03) {
            this.A03 = true;
            if (C86624Kv.A1a(this.A01, selectionStart)) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i = selectionStart - 1;
                    if (this.A05.charAt(i) == '#') {
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
        InputFilter[] filters = editable.getFilters();
        editText.removeTextChangedListener(this);
        editable.setFilters(new InputFilter[0]);
        int i2 = 0;
        while (true) {
            str = this.A05;
            length = str.length();
            if (i2 >= Math.min(length, editable.length())) {
                break;
            }
            if (str.charAt(i2) == '#') {
                char charAt = editable.charAt(i2);
                if (this instanceof AnonymousClass98a) {
                    isLetterOrDigit = Character.isDigit(charAt);
                } else {
                    isLetterOrDigit = Character.isLetterOrDigit(charAt);
                }
                if (!isLetterOrDigit) {
                    editable.replace(i2, i2 + 1, "");
                    if (i2 < selectionStart) {
                        selectionStart--;
                    }
                    i2--;
                }
            } else if (str.charAt(i2) != editable.charAt(i2)) {
                editable.insert(i2, str.substring(i2, i2 + 1));
                if (i2 <= selectionStart) {
                    selectionStart++;
                }
            }
            i2++;
        }
        while (i2 < length && str.charAt(i2) != '#') {
            editable.append(str.charAt(i2));
            if (selectionStart == i2) {
                selectionStart++;
            }
            i2++;
        }
        editable.setFilters(filters);
        editText.addTextChangedListener(this);
        editText.setSelection(selectionStart);
        this.A03 = false;
    }

    public C195409Xr(EditText editText, String str) {
        int i = 0;
        this.A05 = str;
        this.A04 = editText;
        this.A01 = AnonymousClass001.A0s();
        while (true) {
            String str2 = this.A05;
            if (i < str2.length()) {
                if (str2.charAt(i) != '#') {
                    C18270x1.A1K(this.A01, i);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
