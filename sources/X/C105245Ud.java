package X;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.5Ud  reason: invalid class name and case insensitive filesystem */
public class C105245Ud {
    public TextWatcher A00;
    public String A01;
    public final Activity A02;
    public final EditText A03;
    public final TextView A04;
    public final TextInputLayout A05;
    public final C106175Xx A06;
    public final C69263Wi A07;
    public final WaEditText A08;
    public final C112815kQ A09;
    public final C104195Qa A0A;
    public final C1225464u A0B;
    public final AnonymousClass5NP A0C;
    public final C620633i A0D;
    public final C620733j A0E;
    public final C106675Zy A0F;
    public final AnonymousClass4FS A0G;
    public final String A0H;

    public void A04(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("iso");
            String stringExtra2 = intent.getStringExtra("cc");
            if (!(stringExtra == null || stringExtra2 == null)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(C86664Kz.A1L(stringExtra));
                this.A03.setText(AnonymousClass000.A0V(" +", stringExtra2, A0o));
                A05(stringExtra);
            }
            C112815kQ r4 = this.A09;
            r4.A00();
            this.A0A.A00();
            Editable text = this.A08.getText();
            Objects.requireNonNull(text);
            if (!A07(text.toString()) && C107195ar.A00(this.A06, A00(), A03()) == 1) {
                String A012 = A01();
                r4.A02 = A012;
                r4.A07.A00();
                C992454z r1 = new C992454z(r4.A04, r4.A06, r4, A012);
                r4.A00 = r1;
                C18270x1.A0w(r1, r4.A0A);
            }
        }
        WaEditText waEditText = this.A08;
        waEditText.requestFocus();
        if (waEditText.getText() != null) {
            waEditText.setSelection(C86624Kv.A03(waEditText));
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.A02.getSystemService("input_method");
        if (inputMethodManager != null && !inputMethodManager.isAcceptingText()) {
            inputMethodManager.toggleSoftInput(1, 1);
        }
    }

    public boolean A07(CharSequence charSequence) {
        String A032;
        if (charSequence == null || (A032 = C107195ar.A03(this.A0H)) == null) {
            return false;
        }
        return A032.equals(C107195ar.A03(AnonymousClass000.A0P(charSequence, A00(), AnonymousClass001.A0o())));
    }

    public String A00() {
        String A0m = C18290x4.A0m(this.A03);
        return A0m.substring(A0m.indexOf("+") + 1);
    }

    public String A03() {
        Editable text = this.A08.getText();
        Objects.requireNonNull(text);
        String obj = text.toString();
        String str = "";
        if (obj != null) {
            str = obj.replaceAll("\\D", str);
        }
        String A002 = A00();
        if (!TextUtils.isEmpty(A002) && TextUtils.isDigitsOnly(A002)) {
            try {
                return this.A06.A02(Integer.parseInt(A002), str);
            } catch (IOException e) {
                Log.e("ContactFormActivity/cc failed trimLeadingZero from CountryPhoneInfo", e);
            }
        }
        return str;
    }

    public boolean A06() {
        WaEditText waEditText = this.A08;
        if (!C86634Kw.A1X(waEditText) && C107195ar.A01(this.A06, A00(), A03()) == 1) {
            return false;
        }
        TextView textView = this.A04;
        boolean A1X = C86634Kw.A1X(waEditText);
        int i = R.string.f11nameremoved;
        if (A1X) {
            i = R.string.f11nameremoved;
        }
        textView.setText(i);
        textView.setVisibility(0);
        TextInputLayout textInputLayout = this.A05;
        textInputLayout.requestFocus();
        this.A0C.A01.A06(textInputLayout.getTop());
        textInputLayout.setError(" ");
        return true;
    }

    public C105245Ud(Activity activity, View view, C106175Xx r9, C69263Wi r10, C112815kQ r11, C104195Qa r12, C1225464u r13, AnonymousClass5NP r14, C620633i r15, C620733j r16, C106675Zy r17, AnonymousClass4FS r18, String str) {
        this.A02 = activity;
        this.A07 = r10;
        this.A0G = r18;
        this.A0F = r17;
        this.A0H = str;
        this.A0D = r15;
        this.A0E = r16;
        this.A06 = r9;
        this.A09 = r11;
        this.A0C = r14;
        this.A0B = r13;
        this.A0A = r12;
        this.A08 = (WaEditText) C06560Yg.A02(view, R.id.phone_field);
        this.A04 = C18300x5.A0G(view, R.id.phone_field_error);
        this.A05 = (TextInputLayout) C06560Yg.A02(view, R.id.phone_input_layout);
        this.A03 = (EditText) C06560Yg.A02(view, R.id.country_code_field);
        TextInputLayout textInputLayout = this.A05;
        Activity activity2 = this.A02;
        textInputLayout.setHint((CharSequence) activity2.getResources().getString(R.string.f11nameremoved));
        ((TextInputLayout) C06560Yg.A02(view, R.id.country_code_selector)).setHint((CharSequence) activity2.getResources().getString(R.string.f11nameremoved));
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(17)};
        WaEditText waEditText = this.A08;
        waEditText.setFilters(inputFilterArr);
        waEditText.setTextDirection(3);
        EditText editText = this.A03;
        editText.setTextDirection(3);
        AnonymousClass0YH.A06(view.findViewById(R.id.cc_phone_container), 0);
        if (C102805Ki.A00(this.A0E)) {
            AnonymousClass0YH.A06(editText, 1);
        }
        AnonymousClass695.A00(waEditText, this, 1);
        waEditText.A01 = new C124156Be(this, 1);
        C18310x6.A17(editText, this, 21);
        this.A0G.BkQ(new C69973Zj(this, 1), "getCountryCode");
    }

    public String A01() {
        String A032 = A03();
        if (TextUtils.isEmpty(A032)) {
            return "";
        }
        return AnonymousClass000.A0V(A00(), A032, AnonymousClass001.A0o());
    }

    public String A02() {
        String A032 = A03();
        if (TextUtils.isEmpty(A032)) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("+");
        return AnonymousClass000.A0V(A00(), A032, A0o);
    }

    public void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                this.A08.removeTextChangedListener(textWatcher);
            }
            try {
                AnonymousClass68G r1 = new AnonymousClass68G(1, str, this);
                this.A00 = r1;
                this.A08.addTextChangedListener(r1);
            } catch (NullPointerException unused) {
                Log.e("PhoneNumberEntry/formatter exception");
            }
            WaEditText waEditText = this.A08;
            Editable text = waEditText.getText();
            Objects.requireNonNull(text);
            String obj = text.toString();
            String str2 = "";
            if (obj != null) {
                str2 = obj.replaceAll("\\D", str2);
            }
            waEditText.setText(str2);
        }
    }
}
