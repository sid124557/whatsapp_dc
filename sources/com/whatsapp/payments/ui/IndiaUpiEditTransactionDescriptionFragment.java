package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass303;
import X.AnonymousClass487;
import X.AnonymousClass52T;
import X.AnonymousClass5Y0;
import X.AnonymousClass940;
import X.C06560Yg;
import X.C08310eF;
import X.C109095e4;
import X.C18300x5;
import X.C18310x6;
import X.C195379Xo;
import X.C197109ca;
import X.C203229nK;
import X.C204249p3;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C69263Wi;
import X.C86654Ky;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiEditTransactionDescriptionFragment extends Hilt_IndiaUpiEditTransactionDescriptionFragment {
    public C69263Wi A00;
    public WaEditText A01;
    public WaTextView A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass487 A05;
    public AnonymousClass5Y0 A06;
    public C197109ca A07;
    public C203229nK A08;
    public C60152y5 A09;
    public WDSButton A0A;
    public String A0B;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        this.A0B = C18310x6.A0k(A0H(), "arg_payment_description");
        View view2 = view;
        C204249p3.A02(C06560Yg.A02(view2, R.id.common_action_bar_header_back), this, 45);
        this.A0A = C86654Ky.A0f(view2, R.id.save_description_button);
        this.A02 = AnonymousClass0x7.A0L(view2, R.id.payment_description_error);
        WaEditText waEditText = (WaEditText) C06560Yg.A02(view2, R.id.payment_description_text);
        this.A01 = waEditText;
        waEditText.requestFocus();
        this.A01.addTextChangedListener(new C195379Xo(this));
        AnonymousClass5Y0 r10 = this.A06;
        C620633i r7 = this.A03;
        C620733j r8 = this.A04;
        C60152y5 r11 = this.A09;
        AnonymousClass52T r4 = new AnonymousClass52T(this.A01, C18300x5.A0G(view2, R.id.counter), r7, r8, this.A05, r10, r11, 50, 0, true);
        this.A01.setFilters(new InputFilter[]{new C109095e4(50)});
        this.A01.addTextChangedListener(r4);
        if (!TextUtils.isEmpty(this.A0B) && this.A01.getText() != null) {
            this.A01.setText(this.A0B);
            WaEditText waEditText2 = this.A01;
            waEditText2.setSelection(waEditText2.getText().length());
        }
        C204249p3.A02(C06560Yg.A02(view2, R.id.save_description_button), this, 46);
        TextView A0G = C18300x5.A0G(view2, R.id.payment_description_disclaimer_text);
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        String string2 = C08310eF.A09(this).getString(R.string.f11nameremoved, new Object[]{string});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        AnonymousClass940 r3 = new AnonymousClass940(this);
        int length = string2.length();
        spannableStringBuilder.setSpan(r3, length - string.length(), length, 33);
        A0G.setText(spannableStringBuilder);
        A0G.setLinksClickable(true);
        A0G.setMovementMethod(LinkMovementMethod.getInstance());
        this.A07.BKE((AnonymousClass303) null, 0, (Integer) null, "payment_description", (String) null);
    }
}
