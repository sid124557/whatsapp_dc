package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

/* renamed from: X.5eA  reason: invalid class name and case insensitive filesystem */
public final class C109155eA implements TextWatcher {
    public String A00 = "";
    public boolean A01;
    public boolean A02;
    public final AnonymousClass8r2 A03;
    public final C181538mv A04;
    public final CodeInputField A05;

    public void afterTextChanged(Editable editable) {
        SpannableStringBuilder spannableStringBuilder;
        AnonymousClass4N0 r4;
        int i;
        int length;
        int length2;
        CodeInputField codeInputField = this.A05;
        int selectionStart = codeInputField.getSelectionStart();
        Editable editable2 = editable;
        String replace = editable2.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A05 = false;
        }
        int i2 = codeInputField.A02 / 2;
        int length3 = replace.length();
        if (length3 > 0 && this.A00.startsWith(replace.substring(0, 1)) && this.A00.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(replace.substring(0, i2 - 1));
            replace = AnonymousClass000.A0X(replace.substring(i2), A0o);
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i2 + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString(160), "");
        int length4 = replace2.length();
        int i3 = codeInputField.A02;
        if (i3 > 4) {
            if (length4 > i2) {
                length4++;
            }
            while (true) {
                length2 = replace2.length();
                if (length2 >= i2) {
                    break;
                }
                replace2 = AnonymousClass001.A0j(AnonymousClass000.A0l(replace2), codeInputField.A01);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(replace2.substring(0, i2));
            A0o2.append(160);
            A0o2.append(replace2.substring(i2, Math.min(codeInputField.A02, length2)));
            while (true) {
                replace2 = A0o2.toString();
                if (replace2.length() >= codeInputField.A02 + 1) {
                    break;
                }
                A0o2 = AnonymousClass000.A0l(replace2);
                A0o2.append(codeInputField.A01);
            }
        } else {
            while (true) {
                length = replace2.length();
                if (length >= i3) {
                    break;
                }
                replace2 = AnonymousClass001.A0j(AnonymousClass000.A0l(replace2), codeInputField.A01);
            }
            if (length > i3) {
                replace2 = replace2.substring(0, i3);
            }
        }
        if (codeInputField.A05) {
            spannableStringBuilder = C18330xA.A00(replace2);
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == codeInputField.A01) {
                    i = i4 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i, 33);
                    r4 = new AnonymousClass4N0(codeInputField.getContext(), AnonymousClass0Y8.A04(codeInputField.getContext(), R.color.f5nameremoved));
                } else if (spannableStringBuilder.charAt(i4) != 160) {
                    r4 = new AnonymousClass4N0(codeInputField.getContext(), AnonymousClass5Yj.A03(codeInputField.getContext(), codeInputField.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                    i = i4 + 1;
                }
                spannableStringBuilder.setSpan(r4, i4, i, 33);
            }
        } else {
            spannableStringBuilder = this.A04.BDB(replace2);
        }
        if (spannableStringBuilder.length() > 0) {
            InputFilter[] filters = editable2.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable2.setFilters(new InputFilter[0]);
            Class<CharacterStyle> cls = CharacterStyle.class;
            for (Object removeSpan : editable2.getSpans(0, editable2.length(), cls)) {
                editable2.removeSpan(removeSpan);
            }
            editable2.replace(0, editable2.length(), spannableStringBuilder.toString());
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
                editable2.setSpan(obj, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), 18);
            }
            editable2.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, replace2.length())));
        if (!this.A01) {
            AnonymousClass8r2 r3 = this.A03;
            String replaceAll = replace2.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() != codeInputField.A02) {
                this.A02 = false;
                r3.BXA(replaceAll);
            } else if (!this.A02) {
                this.A02 = true;
                r3.BPJ(replaceAll);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.A00 = charSequence.toString();
        }
    }

    public C109155eA(AnonymousClass8r2 r2, C181538mv r3, CodeInputField codeInputField) {
        this.A03 = r2;
        this.A05 = codeInputField;
        this.A04 = r3;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
