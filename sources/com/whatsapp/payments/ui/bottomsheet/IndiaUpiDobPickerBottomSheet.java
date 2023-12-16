package com.whatsapp.payments.ui.bottomsheet;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass4I9;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.AnonymousClass94W;
import X.AnonymousClass9LV;
import X.C003203q;
import X.C06560Yg;
import X.C154517dI;
import X.C158777kX;
import X.C162457s7;
import X.C166557yt;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C620733j;
import X.C627936t;
import X.C78993vu;
import X.C85814Hs;
import X.C89704el;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public final class IndiaUpiDobPickerBottomSheet extends Hilt_IndiaUpiDobPickerBottomSheet {
    public C620733j A00;
    public C158777kX A01;
    public WDSButton A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C78993vu(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        boolean z = A0H().getBoolean("BUNDLE_KEY_SHOW_TOOLBAR", false);
        View A022 = C06560Yg.A02(view, R.id.toolbar);
        if (z) {
            A022.setVisibility(0);
            C003203q A0R = A0R();
            C162457s7.A0K(A0R, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            AnonymousClass9LV.A00((C89704el) A0R, R.drawable.onboarding_actionbar_home_close);
        } else {
            A022.setVisibility(8);
        }
        TextInputLayout textInputLayout = (TextInputLayout) C18280x3.A0E(view, R.id.enter_dob_layout);
        C166557yt r5 = (C166557yt) A0H().getParcelable("BUNDLE_BANK_ACCOUNT");
        if (r5 != null) {
            TextView A0I = AnonymousClass0x2.A0I(view, R.id.enter_dob_description);
            Object[] A0L = AnonymousClass002.A0L();
            if (this.A01 != null) {
                A0I.setText(AnonymousClass0x7.A0n(this, C158777kX.A00(r5), A0L, 0, R.string.f11nameremoved));
            } else {
                throw C18270x1.A0S("paymentMethodPresenter");
            }
        }
        WDSButton wDSButton = (WDSButton) C06560Yg.A02(view, R.id.continue_cta);
        this.A02 = wDSButton;
        if (wDSButton != null) {
            wDSButton.setEnabled(false);
        }
        EditText editText = textInputLayout.A0b;
        if (editText != null) {
            Calendar instance = Calendar.getInstance();
            C162457s7.A0D(instance);
            AnonymousClass94W r4 = new AnonymousClass94W((DatePickerDialog.OnDateSetListener) new C627936t(editText, this), A0G(), instance.get(1), instance.get(2), instance.get(5));
            C85814Hs.A00(editText, r4, 5);
            DatePicker A04 = r4.A04();
            C162457s7.A0D(A04);
            WDSButton wDSButton2 = this.A02;
            if (wDSButton2 != null) {
                wDSButton2.setOnClickListener(new AnonymousClass4I9(A04, 0, this));
                return;
            }
            return;
        }
        throw C18290x4.A0Y();
    }

    public void A1W(AnonymousClass5Vo r4) {
        C162457s7.A0J(r4, 0);
        r4.A00.A06 = A0H().getBoolean("BUNDLE_KEY_SHOW_HANDLE", false);
    }
}
