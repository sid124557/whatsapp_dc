package com.whatsapp.payments.ui.international;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass23S;
import X.AnonymousClass34V;
import X.AnonymousClass3QD;
import X.AnonymousClass99H;
import X.AnonymousClass9D1;
import X.C133686hm;
import X.C133796hx;
import X.C162457s7;
import X.C166557yt;
import X.C18270x1;
import X.C18320x8;
import X.C196719bd;
import X.C621433s;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.HashMap;

public final class IndiaUpiInternationalDeactivationActivity extends AnonymousClass9D1 {
    public C133686hm A00;
    public C166557yt A01;

    public void A7i(HashMap hashMap) {
        C162457s7.A0J(hashMap, 0);
        Intent putExtra = C18320x8.A07().putExtra("DEACTIVATION_MPIN_BLOB", new C166557yt(AnonymousClass3QD.A00(), String.class, this.A0L.A06("MPIN", hashMap, 3), "pin"));
        C166557yt r1 = this.A01;
        if (r1 == null) {
            throw C18270x1.A0S("seqNumber");
        }
        AnonymousClass0x2.A0m(this, putExtra.putExtra("DEACTIVATION_SEQ_NUMBER", r1));
    }

    public void BVC(AnonymousClass34V r11, String str) {
        Object obj;
        String str2 = str;
        C162457s7.A0J(str, 0);
        if (str.length() > 0) {
            C133686hm r2 = this.A00;
            if (r2 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            String str3 = r2.A0B;
            C166557yt r0 = this.A01;
            if (r0 == null) {
                throw C18270x1.A0S("seqNumber");
            }
            String str4 = (String) r0.A00;
            C133796hx r4 = r2.A08;
            C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            AnonymousClass99H r42 = (AnonymousClass99H) r4;
            C133686hm r02 = this.A00;
            if (r02 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            C166557yt r03 = r02.A09;
            if (r03 == null) {
                obj = null;
            } else {
                obj = r03.A00;
            }
            A7g(r42, str2, str3, str4, (String) obj, 3);
        } else if (r11 != null && !C196719bd.A02(this, "upi-list-keys", r11.A00, false)) {
            if (this.A05.A06("upi-list-keys")) {
                this.A0M.A0D();
                BjL();
                Bp9(R.string.f11nameremoved);
                this.A09.A00();
                return;
            }
            A7b();
            throw AnonymousClass000.A0L();
        }
    }

    public void A7Z() {
        C621433s.A01(this, 19);
    }

    public void A7b() {
        throw AnonymousClass23S.A00();
    }

    public void A7c() {
        throw AnonymousClass23S.A00();
    }

    public void A7d() {
        throw AnonymousClass23S.A00();
    }

    public void BbO(AnonymousClass34V r2) {
        throw AnonymousClass23S.A00();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C133686hm r0 = (C133686hm) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 != null) {
            this.A00 = r0;
        }
        this.A01 = new C166557yt(AnonymousClass3QD.A00(), String.class, A7F(this.A0M.A06()), "upiSequenceNumber");
        this.A09.A00();
    }
}
