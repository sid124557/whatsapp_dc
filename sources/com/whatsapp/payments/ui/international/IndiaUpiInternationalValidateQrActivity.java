package com.whatsapp.payments.ui.international;

import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass3QD;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass7T9;
import X.AnonymousClass8WY;
import X.AnonymousClass8YW;
import X.AnonymousClass93F;
import X.AnonymousClass9CJ;
import X.AnonymousClass9Wg;
import X.C137006nc;
import X.C154517dI;
import X.C158387jt;
import X.C162457s7;
import X.C166557yt;
import X.C175588Yy;
import X.C195909Zz;
import X.C35371wl;
import X.C35711xJ;
import X.C86604Kt;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class IndiaUpiInternationalValidateQrActivity extends AnonymousClass9CJ {
    public C195909Zz A00;
    public final AnonymousClass66R A01 = C154517dI.A00(AnonymousClass58H.NONE, new AnonymousClass8WY(this));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        AnonymousClass66R r3 = this.A01;
        C86604Kt.A1N(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A00, new AnonymousClass8YW(this), 309);
        C86604Kt.A1N(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A04, new C175588Yy(this), 308);
        IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) r3.getValue();
        Class<String> cls = String.class;
        C166557yt r4 = new C166557yt(AnonymousClass3QD.A00(), cls, A7F(this.A0M.A06()), "upiSequenceNumber");
        C166557yt r32 = new C166557yt(AnonymousClass3QD.A00(), cls, getIntent().getStringExtra("INTERNATIONAL_QR_PAYLOAD"), "invoiceUrl");
        C166557yt A04 = this.A0M.A04();
        String stringExtra = getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = this.A0e;
        C162457s7.A0J(stringExtra, 3);
        AnonymousClass08M r7 = indiaUpiInternationalValidateQrViewModel.A00;
        C158387jt r0 = (C158387jt) r7.A07();
        C158387jt r2 = null;
        if (r0 != null) {
            r2 = new C158387jt(r0.A00, true);
        }
        r7.A0H(r2);
        AnonymousClass303 A0W = AnonymousClass6C9.A0W();
        A0W.A03("payments_request_name", "validate_international_qr");
        AnonymousClass9Wg.A02(A0W, indiaUpiInternationalValidateQrViewModel.A03, (Integer) null, "international_payment_prompt", str, 3);
        C137006nc r22 = indiaUpiInternationalValidateQrViewModel.A02;
        AnonymousClass7T9 r1 = new AnonymousClass7T9(r32, indiaUpiInternationalValidateQrViewModel, stringExtra);
        Log.i("PAY: validateInternationalQrCode called");
        AnonymousClass31C r9 = r22.A00;
        String A03 = r9.A03();
        C35711xJ r33 = new C35711xJ(new C35371wl(A03, 13), r22.A02.A01(), C166557yt.A00(r4), C166557yt.A00(r32), C166557yt.A00(A04));
        AnonymousClass36K r11 = r33.A00;
        C162457s7.A0D(r11);
        r9.A0D(new AnonymousClass93F(r1, 7, r33), r11, A03, 204, 0);
    }
}
