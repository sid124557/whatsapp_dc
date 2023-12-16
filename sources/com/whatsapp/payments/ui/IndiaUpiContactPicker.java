package com.whatsapp.payments.ui;

import X.AnonymousClass317;
import X.AnonymousClass3DZ;
import X.C107255ay;
import X.C107695bk;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C621033m;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public final class IndiaUpiContactPicker extends ContactPicker {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            C1899693i.A0n(A002, r1, this);
            C107255ay.A05(this, C86604Kt.A0Z(A002));
            C107255ay.A02((C621033m) A002.AZL.get(), this);
            C107255ay.A07(this, (WhatsAppLibLoader) A002.AbT.get());
            C107255ay.A03(C86614Ku.A0P(A002), this);
            C107255ay.A08(this, (AnonymousClass317) A002.ATf.get());
            C107255ay.A04(this, C86614Ku.A0V(A002));
        }
    }

    public IndiaUpiContactPicker(int i) {
        this.A00 = false;
        C204019og.A00(this, 59);
    }

    public ContactPickerFragment A79() {
        if (C86614Ku.A0D(this) == null || !C86614Ku.A0D(this).getBoolean("for_payment_merchants", false)) {
            return new IndiaUpiContactPickerFragment();
        }
        Log.d("PaymentContactPicker: showing supported P2M recent merchant list");
        return new IndiaPaymentMerchantContactPickerFragment();
    }

    public IndiaUpiContactPicker() {
        this(0);
    }
}
