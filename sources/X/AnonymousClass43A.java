package X;

import android.text.Editable;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.profile.SetUsernameBottomSheet;

/* renamed from: X.43A  reason: invalid class name */
public final class AnonymousClass43A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SetUsernameBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43A(SetUsernameBottomSheet setUsernameBottomSheet) {
        super(1);
        this.this$0 = setUsernameBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String string;
        Object[] objArr;
        int i;
        C60702yz r8 = (C60702yz) obj;
        SetUsernameBottomSheet setUsernameBottomSheet = this.this$0;
        C162457s7.A0H(r8);
        EditText editText = setUsernameBottomSheet.A00;
        if (editText != null) {
            Integer num = r8.A00;
            if (num != null) {
                int intValue = num.intValue();
                String str = r8.A02;
                if (intValue == R.string.f11nameremoved) {
                    objArr = new Object[1];
                    i = 3;
                } else if (intValue == R.string.f11nameremoved) {
                    objArr = new Object[1];
                    i = 30;
                } else {
                    if (intValue == R.string.f11nameremoved) {
                        string = C18310x6.A0m(setUsernameBottomSheet, str, intValue);
                    } else {
                        string = C08310eF.A09(setUsernameBottomSheet).getString(intValue);
                    }
                    C162457s7.A0D(string);
                    editText.setError(string);
                }
                AnonymousClass000.A1P(objArr, i, 0);
                string = C08310eF.A09(setUsernameBottomSheet).getString(intValue, objArr);
                C162457s7.A0D(string);
                editText.setError(string);
            } else if (C162457s7.A0P(r8.A01, r8.A02)) {
                setUsernameBottomSheet.A1L();
            }
            Editable text = editText.getText();
            C162457s7.A0D(text);
            if (text.length() == 0) {
                editText.setText(r8.A01);
            }
            editText.setSelection(editText.length());
        }
        return C59022wD.A00;
    }
}
