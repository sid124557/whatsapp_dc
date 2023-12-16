package X;

import android.widget.EditText;

/* renamed from: X.2tv  reason: invalid class name and case insensitive filesystem */
public class C57612tv {
    public static int A00(EditText editText) {
        if (!editText.isFocused()) {
            return -1;
        }
        String A0m = C18290x4.A0m(editText);
        int i = 0;
        int i2 = 0;
        while (i < editText.getSelectionEnd() && i <= A0m.length()) {
            if (A0m.charAt(i) <= '9' && A0m.charAt(i) >= '0') {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public static void A01(EditText editText, int i) {
        int length = editText.getText().length();
        if (i <= -1 || i > length) {
            if (i > length) {
                editText.requestFocus();
            }
            editText.setSelection(length);
            return;
        }
        editText.requestFocus();
        String A0m = C18290x4.A0m(editText);
        int i2 = 0;
        for (int i3 = 0; i3 < A0m.length() && i > 0; i3++) {
            if (A0m.charAt(i3) <= '9' && A0m.charAt(i3) >= '0') {
                i--;
            }
            i2++;
        }
        editText.setSelection(i2);
    }
}
