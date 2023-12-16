package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.0Zr  reason: invalid class name and case insensitive filesystem */
public class C06870Zr implements TextWatcher {
    public final /* synthetic */ CodeInputField A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public C06870Zr(CodeInputField codeInputField, EncryptionKeyFragment encryptionKeyFragment) {
        this.A01 = encryptionKeyFragment;
        this.A00 = codeInputField;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int A002;
        String charSequence2 = charSequence.toString();
        EncryptionKeyFragment encryptionKeyFragment = this.A01;
        String lowerCase = charSequence2.toLowerCase(encryptionKeyFragment.A03.A0O());
        if (!charSequence.toString().equals(lowerCase)) {
            CodeInputField codeInputField = this.A00;
            codeInputField.setText(lowerCase);
            codeInputField.setSelection(charSequence.length());
        }
        if (charSequence.length() == 4 && (A002 = encryptionKeyFragment.A00 + 1) < 16) {
            encryptionKeyFragment.A04[A002].requestFocus();
        }
        EncryptionKeyFragment.A03(encryptionKeyFragment);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
