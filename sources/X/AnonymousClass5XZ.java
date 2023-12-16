package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.5XZ  reason: invalid class name */
public final class AnonymousClass5XZ {
    public String A00 = "";
    public String A01 = "";
    public final Context A02;
    public final EditText A03;
    public final EditText A04;
    public final EditText A05;
    public final ImageView A06;
    public final TextInputLayout A07;
    public final AnonymousClass5NP A08;
    public final AnonymousClass5Y0 A09;

    public final String A01() {
        return A00(C18290x4.A0m(this.A04));
    }

    public final String A03() {
        return A00(C18290x4.A0m(this.A05));
    }

    public AnonymousClass5XZ(Context context, View view, AnonymousClass5NP r11, AnonymousClass5Y0 r12) {
        this.A02 = context;
        this.A09 = r12;
        this.A08 = r11;
        EditText editText = (EditText) C18280x3.A0E(view, R.id.first_name_field);
        this.A04 = editText;
        EditText editText2 = (EditText) C18280x3.A0E(view, R.id.last_name_field);
        this.A05 = editText2;
        EditText editText3 = (EditText) C18280x3.A0E(view, R.id.business_name_field);
        this.A03 = editText3;
        this.A06 = C86604Kt.A0J(view, R.id.business_name_icon);
        TextInputLayout textInputLayout = (TextInputLayout) C18280x3.A0E(view, R.id.business_name_input_layout);
        this.A07 = textInputLayout;
        View A022 = C06560Yg.A02(view, R.id.first_name_input_layout);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
        ((TextInputLayout) A022).setHint((CharSequence) context.getResources().getString(R.string.f11nameremoved));
        View A023 = C06560Yg.A02(view, R.id.last_name_input_layout);
        C162457s7.A0K(A023, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
        ((TextInputLayout) A023).setHint((CharSequence) context.getResources().getString(R.string.f11nameremoved));
        textInputLayout.setHint((CharSequence) context.getResources().getString(R.string.f11nameremoved));
        editText.addTextChangedListener(new AnonymousClass68I(this, 0, editText));
        editText2.addTextChangedListener(new AnonymousClass68I(this, 0, editText2));
        editText3.addTextChangedListener(new AnonymousClass68I(this, 0, editText3));
    }

    public static final String A00(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1P = AnonymousClass0x7.A1P(C162457s7.A00(str.charAt(i2), 32));
            if (z) {
                if (!A1P) {
                    break;
                }
                length--;
            } else if (!A1P) {
                z = true;
            } else {
                i++;
            }
        }
        return new C116975rB(" +").A00(str.subSequence(i, length + 1).toString(), " ");
    }

    public final String A02() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A01());
        A0o.append(' ');
        String A0X = AnonymousClass000.A0X(A03(), A0o);
        int length = A0X.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1P = AnonymousClass0x7.A1P(C162457s7.A00(A0X.charAt(i2), 32));
            if (z) {
                if (!A1P) {
                    break;
                }
                length--;
            } else if (!A1P) {
                z = true;
            } else {
                i++;
            }
        }
        return A0X.subSequence(i, length + 1).toString();
    }
}
