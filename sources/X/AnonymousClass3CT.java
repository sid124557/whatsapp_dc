package X;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

/* renamed from: X.3CT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CT implements C181538mv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CodeInputField A01;

    public final SpannableStringBuilder BDB(String str) {
        int A04;
        int A042;
        CodeInputField codeInputField = this.A01;
        int i = this.A00;
        SpannableStringBuilder A002 = C18330xA.A00(str);
        for (int i2 = 0; i2 < A002.length(); i2++) {
            if (A002.charAt(i2) == ')') {
                int i3 = i2 + 1;
                A002.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                if (i != 0) {
                    A042 = i;
                } else {
                    A042 = AnonymousClass0Y8.A04(codeInputField.getContext(), AnonymousClass34K.A01(codeInputField.getContext(), R.attr.f3nameremoved));
                }
                A002.setSpan(new AnonymousClass4N0(codeInputField.A07, A042), i2, i3, 33);
            } else if (A002.charAt(i2) != 160) {
                if (i != 0) {
                    A04 = i;
                } else {
                    A04 = AnonymousClass0Y8.A04(codeInputField.getContext(), AnonymousClass34K.A01(codeInputField.getContext(), R.attr.f3nameremoved));
                }
                A002.setSpan(new AnonymousClass4N0(codeInputField.A07, A04), i2, i2 + 1, 33);
            }
        }
        return A002;
    }

    public /* synthetic */ AnonymousClass3CT(CodeInputField codeInputField, int i) {
        this.A01 = codeInputField;
        this.A00 = i;
    }
}
