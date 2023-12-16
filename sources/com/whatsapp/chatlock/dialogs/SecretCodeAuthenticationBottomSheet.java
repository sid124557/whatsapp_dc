package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass0x2;
import X.AnonymousClass5J5;
import X.AnonymousClass5UK;
import X.AnonymousClass68H;
import X.AnonymousClass68X;
import X.C162457s7;
import X.C18310x6;
import X.C86664Kz;
import X.C95814uZ;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public final class SecretCodeAuthenticationBottomSheet extends WDSBottomSheetDialogFragment {
    public TextInputEditText A00;
    public TextInputLayout A01;
    public AnonymousClass5J5 A02;
    public WDSButton A03;
    public WDSButton A04;
    public String A05 = "";
    public final AnonymousClass5UK A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A06.A04((C95814uZ) null, (Integer) null, 0, 17);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.secret_code_input_layout);
        this.A01 = textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setHint((int) R.string.f11nameremoved);
        }
        TextInputLayout textInputLayout2 = this.A01;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconMode(1);
        }
        View findViewById = view.findViewById(R.id.text_input_end_icon);
        if (findViewById != null) {
            findViewById.performClick();
        }
        ColorStateList A0V = C86664Kz.A0V(view.getContext(), R.color.f5nameremoved);
        C162457s7.A0D(A0V);
        TextInputLayout textInputLayout3 = this.A01;
        if (textInputLayout3 != null) {
            textInputLayout3.setHintTextColor(A0V);
        }
        TextInputLayout textInputLayout4 = this.A01;
        if (textInputLayout4 != null) {
            textInputLayout4.setBoxStrokeColorStateList(A0V);
        }
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.secret_code_edit_text);
        this.A00 = textInputEditText;
        if (textInputEditText != null) {
            AnonymousClass68H.A00(textInputEditText, this, 1);
            textInputEditText.setImeOptions(2);
            textInputEditText.setOnEditorActionListener(new AnonymousClass68X(textInputEditText, 0, this));
        }
        TextInputLayout textInputLayout5 = this.A01;
        if (textInputLayout5 != null) {
            textInputLayout5.requestFocus();
        }
        WDSButton wDSButton = (WDSButton) view.findViewById(R.id.secret_code_authenticate_button);
        this.A03 = wDSButton;
        if (wDSButton != null) {
            AnonymousClass0x2.A0z(wDSButton, this, 19);
        }
        WDSButton wDSButton2 = (WDSButton) view.findViewById(R.id.secret_code_forgot_button);
        this.A04 = wDSButton2;
        if (wDSButton2 != null) {
            AnonymousClass0x2.A0z(wDSButton2, this, 20);
        }
    }

    public SecretCodeAuthenticationBottomSheet(AnonymousClass5UK r2) {
        this.A06 = r2;
    }
}
