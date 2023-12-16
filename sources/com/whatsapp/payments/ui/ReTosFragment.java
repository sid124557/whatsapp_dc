package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass36K;
import X.AnonymousClass9U5;
import X.AnonymousClass9WM;
import X.C06560Yg;
import X.C08310eF;
import X.C160757oG;
import X.C18300x5;
import X.C1899593h;
import X.C1899693i;
import X.C1907599s;
import X.C198289eg;
import X.C198299eh;
import X.C198309ei;
import X.C198319ej;
import X.C198329ek;
import X.C198339el;
import X.C198349em;
import X.C198359en;
import X.C204249p3;
import X.C204539pW;
import X.C620633i;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

public abstract class ReTosFragment extends Hilt_ReTosFragment {
    public Button A00;
    public ProgressBar A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public AnonymousClass9U5 A04;
    public AnonymousClass9WM A05;
    public final C160757oG A06 = C160757oG.A00("ReTosFragment", "onboarding", "COMMON");

    public static /* synthetic */ void A00(ReTosFragment reTosFragment) {
        reTosFragment.A1P(false);
        reTosFragment.A00.setVisibility(8);
        reTosFragment.A01.setVisibility(0);
        AnonymousClass9U5 r5 = reTosFragment.A04;
        boolean z = reTosFragment.A0H().getBoolean("is_consumer");
        boolean z2 = reTosFragment.A0H().getBoolean("is_merchant");
        C204539pW r3 = new C204539pW(reTosFragment, 5);
        ArrayList A0s = AnonymousClass001.A0s();
        C1899593h.A1S("version", A0s, 2);
        if (z) {
            C1899593h.A1S("consumer", A0s, 1);
        }
        if (z2) {
            C1899593h.A1S("merchant", A0s, 1);
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("accept_pay", C18300x5.A1Z(A0s, 0));
        r5.A0H(new C1907599s(r5.A04.A00, r3, r5.A0A, r5, r5.A00, z, z2), A0I, "set", "urn:xmpp:whatsapp:account", 0);
    }

    public void A1a() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("is_consumer", true);
        A08.putBoolean("is_merchant", false);
        A0u(A08);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SpannableString A042;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(A0R, R.id.retos_bottom_sheet_desc);
        AnonymousClass0x2.A12(A0K, this.A02);
        AnonymousClass0x2.A14(this.A03, A0K);
        Context context = A0K.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        if (brazilReTosFragment.A0H().getBoolean("is_merchant")) {
            String[] strArr = {C1899693i.A0c(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/merchant-terms/"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.facebook.com/legal/commerce_product_merchant_agreement"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.cielo.com.br/contrato-de-credenciamento-consolidado/")};
            A042 = brazilReTosFragment.A01.A04(context, C08310eF.A09(brazilReTosFragment).getString(R.string.f11nameremoved), new Runnable[]{new C198339el(), new C198349em(), new C198359en()}, new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, strArr);
        } else {
            String[] strArr2 = {C1899693i.A0c(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.facebook.com/payments_terms"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.facebook.com/policy.php"), C1899693i.A0c(brazilReTosFragment.A00, "https://www.cielo.com.br/termos-fb-pay")};
            A042 = brazilReTosFragment.A01.A04(context, C08310eF.A09(brazilReTosFragment).getString(R.string.f11nameremoved), new Runnable[]{new C198289eg(), new C198299eh(), new C198309ei(), new C198319ej(), new C198329ek()}, new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, strArr2);
        }
        A0K.setText(A042);
        this.A01 = (ProgressBar) C06560Yg.A02(A0R, R.id.progress_bar);
        Button button = (Button) C06560Yg.A02(A0R, R.id.retos_bottom_sheet_button);
        this.A00 = button;
        C204249p3.A02(button, this, 117);
        return A0R;
    }
}
