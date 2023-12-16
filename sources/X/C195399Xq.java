package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.9Xq  reason: invalid class name and case insensitive filesystem */
public class C195399Xq implements TextWatcher {
    public final /* synthetic */ TextInputEditText A00;
    public final /* synthetic */ TextInputLayout A01;
    public final /* synthetic */ C196199aS A02;
    public final /* synthetic */ boolean A03;

    public C195399Xq(TextInputEditText textInputEditText, TextInputLayout textInputLayout, C196199aS r3, boolean z) {
        this.A02 = r3;
        this.A01 = textInputLayout;
        this.A00 = textInputEditText;
        this.A03 = z;
    }

    public void afterTextChanged(Editable editable) {
        C196199aS.A00(this.A00, this.A01, this.A03);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
