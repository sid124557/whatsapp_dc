package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass2V3;
import X.AnonymousClass32Y;
import X.AnonymousClass4L0;
import X.AnonymousClass5Vo;
import X.AnonymousClass80M;
import X.C08310eF;
import X.C109705f3;
import X.C121205zq;
import X.C125186Gr;
import X.C139816sf;
import X.C162457s7;
import X.C18290x4;
import X.C18320x8;
import X.C1896892g;
import X.C817640z;
import X.C86604Kt;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class PromotionApplicationFragment extends Hilt_PromotionApplicationFragment {
    public TextInputLayout A00;
    public AnonymousClass2V3 A01;
    public C125186Gr A02;

    public void A0w(Bundle bundle, View view) {
        C125186Gr r0;
        Window window;
        EditText editText;
        String string;
        AnonymousClass2V3 r1;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C08310eF r2 = this.A0E;
        if (r2 == null) {
            Log.d("Parent fragment owning PromotionsViewModel is expected");
            r2 = this;
        }
        Bundle bundle2 = this.A06;
        EditText editText2 = null;
        if (bundle2 == null || (string = bundle2.getString("business.jid.arg")) == null || (r1 = this.A01) == null) {
            r0 = null;
        } else {
            r0 = (C125186Gr) AnonymousClass4L0.A0F(new AnonymousClass80M(r1.A00(AnonymousClass32Y.A0A(string))), r2).A01(C125186Gr.class);
        }
        this.A02 = r0;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.input_promo);
        this.A00 = textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setHint((CharSequence) C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        TextInputLayout textInputLayout2 = this.A00;
        if (!(textInputLayout2 == null || (editText = textInputLayout2.A0b) == null)) {
            editText.addTextChangedListener(new C1896892g(this, 1));
            editText.requestFocus();
            editText2 = editText;
        }
        C109705f3.A00(view.findViewById(R.id.apply_promo_button), editText2, this, 18);
        C125186Gr r02 = this.A02;
        if (r02 != null) {
            C86604Kt.A1N(this, r02.A01.A08, new C121205zq(this), 15);
        }
        View A0M = C18290x4.A0M(view, R.id.apply_divider);
        int i = 8;
        if ((C86604Kt.A0A(this).uiMode & 48) == 32) {
            i = 0;
        }
        A0M.setVisibility(i);
        View findViewById = view.findViewById(R.id.close_promotion_application_cta);
        if (findViewById != null) {
            C18320x8.A15(findViewById, this, 30);
        }
        Dialog dialog = this.A03;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(21);
        }
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A04 = new C139816sf(C817640z.A00);
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
