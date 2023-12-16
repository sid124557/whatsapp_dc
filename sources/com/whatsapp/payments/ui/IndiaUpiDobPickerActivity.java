package com.whatsapp.payments.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass285;
import X.AnonymousClass9CI;
import X.C08240dc;
import X.C166557yt;
import X.C18320x8;
import X.C84074Ax;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

public final class IndiaUpiDobPickerActivity extends AnonymousClass9CI implements C84074Ax {
    public void BQf(long j, String str) {
        Intent A07 = C18320x8.A07();
        A07.putExtra("dob_timestamp_ms", j);
        AnonymousClass0x2.A0m(this, A07);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        IndiaUpiDobPickerBottomSheet A00 = AnonymousClass285.A00((C166557yt) getIntent().getParcelableExtra("bank_account"), (String) null, true, false);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A09(A00, R.id.fragment_container);
        A0J.A01();
    }
}
