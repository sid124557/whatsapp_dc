package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.twofactor.SetCodeFragment;

/* renamed from: X.2AT  reason: invalid class name */
public class AnonymousClass2AT implements C181538mv {
    public Object A00;
    public final int A01;

    public AnonymousClass2AT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final SpannableStringBuilder BDB(String str) {
        SpannableStringBuilder spannableStringBuilder;
        Context context;
        int A02;
        switch (this.A01) {
            case 0:
                CodeInputField codeInputField = (CodeInputField) this.A00;
                spannableStringBuilder = C18330xA.A00(str);
                for (int i = 0; i < spannableStringBuilder.length(); i++) {
                    if (spannableStringBuilder.charAt(i) == codeInputField.A01) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass0Y8.A04(codeInputField.getContext(), R.color.f5nameremoved)), i, i + 1, 33);
                    }
                }
                break;
            case 1:
                Context context2 = (Context) this.A00;
                spannableStringBuilder = C18330xA.A00(str);
                for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                    if (spannableStringBuilder.charAt(i2) == '*') {
                        int i3 = i2 + 1;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                        spannableStringBuilder.setSpan(new AnonymousClass4N0(context2, AnonymousClass0Y8.A04(context2, R.color.f5nameremoved)), i2, i3, 33);
                    } else if (spannableStringBuilder.charAt(i2) != 160) {
                        spannableStringBuilder.setSpan(new AnonymousClass4N0(context2, C18300x5.A03(context2, R.attr.f3nameremoved, R.color.f5nameremoved)), i2, i2 + 1, 33);
                    }
                }
                break;
            default:
                SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
                spannableStringBuilder = C18330xA.A00(str);
                for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                    if (spannableStringBuilder.charAt(i4) == '*') {
                        context = setCodeFragment.A03.getContext();
                        A02 = R.color.f5nameremoved;
                    } else if (spannableStringBuilder.charAt(i4) != 160) {
                        context = setCodeFragment.A03.getContext();
                        A02 = AnonymousClass5Yj.A02(setCodeFragment.A03.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
                    }
                    spannableStringBuilder.setSpan(new AnonymousClass4N0(setCodeFragment.A03.getContext(), AnonymousClass0Y8.A04(context, A02)), i4, i4 + 1, 33);
                }
                break;
        }
        return spannableStringBuilder;
    }
}
