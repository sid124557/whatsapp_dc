package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass3QD;
import X.AnonymousClass6C7;
import X.AnonymousClass8UF;
import X.AnonymousClass90B;
import X.AnonymousClass90F;
import X.AnonymousClass90I;
import X.AnonymousClass97h;
import X.AnonymousClass9AM;
import X.AnonymousClass9LV;
import X.C137216oK;
import X.C162457s7;
import X.C166557yt;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C1891290c;
import X.C1897692o;
import X.C1901393z;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiCreateCustomNumberActivity extends AnonymousClass97h {
    public LinearLayout A00;
    public TextInputLayout A01;
    public CircularProgressBar A02;
    public WaEditText A03;
    public C196719bd A04;
    public C197109ca A05;
    public IndiaUpiMapperLinkViewModel A06;
    public WDSButton A07;

    public final void A74() {
        WaEditText waEditText = this.A03;
        if (waEditText == null) {
            throw C18270x1.A0S("customNumberEditText");
        }
        String valueOf = String.valueOf(waEditText.getText());
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = this.A06;
        if (indiaUpiMapperLinkViewModel == null) {
            throw C18270x1.A0S("indiaUpiNumberMapperLinkViewModel");
        }
        C162457s7.A0J(valueOf, 0);
        String str = null;
        if (valueOf.startsWith("0")) {
            str = indiaUpiMapperLinkViewModel.A08;
        } else {
            int length = valueOf.length();
            if (length < 8 || length > 9) {
                str = indiaUpiMapperLinkViewModel.A07;
            } else {
                int i = length - 2;
                if (valueOf.charAt(length - 1) == valueOf.charAt(i) && valueOf.charAt(i) == valueOf.charAt(length - 3)) {
                    str = indiaUpiMapperLinkViewModel.A06;
                }
            }
        }
        if (str == null) {
            TextInputLayout textInputLayout = this.A01;
            if (textInputLayout == null) {
                throw C18270x1.A0S("enterCustomNumberTextInputLayout");
            }
            textInputLayout.setErrorEnabled(false);
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                throw C18270x1.A0S("customNumberBulletRulesContainer");
            }
            linearLayout.setVisibility(0);
            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = this.A06;
            if (indiaUpiMapperLinkViewModel2 == null) {
                throw C18270x1.A0S("indiaUpiNumberMapperLinkViewModel");
            }
            indiaUpiMapperLinkViewModel2.A05.A0G(C137216oK.A00);
            AnonymousClass9AM r5 = indiaUpiMapperLinkViewModel2.A03;
            C196629bS r0 = indiaUpiMapperLinkViewModel2.A01;
            String A0C = r0.A0C();
            if (A0C == null) {
                A0C = "";
            }
            r5.A01(r0.A04(), new C166557yt(AnonymousClass3QD.A00(), String.class, valueOf, "upiAlias"), new AnonymousClass90F(indiaUpiMapperLinkViewModel2, 1), A0C, "numeric_id", "add");
            return;
        }
        LinearLayout linearLayout2 = this.A00;
        if (linearLayout2 == null) {
            throw C18270x1.A0S("customNumberBulletRulesContainer");
        }
        linearLayout2.setVisibility(8);
        TextInputLayout textInputLayout2 = this.A01;
        if (textInputLayout2 == null) {
            throw C18270x1.A0S("enterCustomNumberTextInputLayout");
        }
        textInputLayout2.setError(str);
        WaEditText waEditText2 = this.A03;
        if (waEditText2 == null) {
            throw C18270x1.A0S("customNumberEditText");
        }
        waEditText2.requestFocus();
    }

    public final void A75() {
        CircularProgressBar circularProgressBar = this.A02;
        if (circularProgressBar == null) {
            throw C18270x1.A0S("progressBar");
        }
        circularProgressBar.setVisibility(8);
        WDSButton wDSButton = this.A07;
        if (wDSButton == null) {
            throw C18270x1.A0S("continueButton");
        }
        wDSButton.setText(R.string.f11nameremoved);
    }

    public void onBackPressed() {
        C197109ca r3 = this.A05;
        if (r3 != null) {
            Integer A0f = AnonymousClass001.A0f();
            r3.BKB(A0f, A0f, "create_numeric_upi_alias", AnonymousClass6C7.A0h(this));
            super.onBackPressed();
            return;
        }
        throw C18270x1.A0S("fieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C197109ca r4 = this.A05;
        if (r4 != null) {
            Integer A0Z = C18290x4.A0Z();
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("extra_referral_screen");
            } else {
                str = null;
            }
            r4.BKB(A0Z, (Integer) null, "create_numeric_upi_alias", str);
            AnonymousClass6C7.A0y(this);
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_back);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_payment_name");
            this.A07 = (WDSButton) C18290x4.A0N(this, R.id.custom_number_continue);
            this.A02 = (CircularProgressBar) C18290x4.A0N(this, R.id.progress_bar);
            this.A03 = (WaEditText) C18290x4.A0N(this, R.id.enter_custom_upi_number);
            this.A01 = (TextInputLayout) C18290x4.A0N(this, R.id.custom_upi_number_input_layout);
            this.A00 = (LinearLayout) C18290x4.A0N(this, R.id.custom_number_bullet_list_container);
            A75();
            SpannableString spannableString = new SpannableString(getString(R.string.f11nameremoved));
            SpannableString spannableString2 = new SpannableString(getString(R.string.f11nameremoved));
            SpannableString spannableString3 = new SpannableString(getString(R.string.f11nameremoved));
            SpannableString[] spannableStringArr = new SpannableString[3];
            C18280x3.A19(spannableString, spannableString2, spannableStringArr);
            spannableStringArr[2] = spannableString3;
            for (SpannableString spannableString4 : AnonymousClass8UF.A0o(spannableStringArr)) {
                spannableString4.setSpan(new C1901393z((int) getResources().getDimension(R.dimen.f6nameremoved)), 0, spannableString4.length(), 0);
                TextView textView = new TextView(this);
                textView.setText(spannableString4);
                C18320x8.A11(textView.getResources(), textView, R.color.f5nameremoved);
                textView.setTextSize(0, C86664Kz.A01(textView.getResources(), R.dimen.f6nameremoved));
                textView.setPadding(textView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, C86614Ku.A05(textView, R.dimen.f6nameremoved), 0);
                LinearLayout linearLayout = this.A00;
                if (linearLayout == null) {
                    throw C18270x1.A0S("customNumberBulletRulesContainer");
                }
                linearLayout.addView(textView);
            }
            AnonymousClass90B r2 = new AnonymousClass90B(this, 1);
            WaEditText waEditText = this.A03;
            if (waEditText == null) {
                throw C18270x1.A0S("customNumberEditText");
            }
            waEditText.addTextChangedListener(r2);
            WaEditText waEditText2 = this.A03;
            if (waEditText2 == null) {
                throw C18270x1.A0S("customNumberEditText");
            }
            waEditText2.setOnEditorActionListener(new AnonymousClass90I(this, 2));
            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) new AnonymousClass0XL(this).A01(IndiaUpiMapperLinkViewModel.class);
            this.A06 = indiaUpiMapperLinkViewModel;
            if (indiaUpiMapperLinkViewModel == null) {
                throw C18270x1.A0S("indiaUpiNumberMapperLinkViewModel");
            }
            indiaUpiMapperLinkViewModel.A05.A0B(this, new C1897692o(parcelableExtra, 3, this));
            WDSButton wDSButton = this.A07;
            if (wDSButton == null) {
                throw C18270x1.A0S("continueButton");
            }
            C1891290c.A00(wDSButton, this, 26);
            onConfigurationChanged(AnonymousClass001.A0M(this));
            return;
        }
        throw C18270x1.A0S("fieldStatsLogger");
    }
}
