package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass97X;
import X.AnonymousClass9BX;
import X.AnonymousClass9SH;
import X.AnonymousClass9TZ;
import X.AnonymousClass9VV;
import X.AnonymousClass9bR;
import X.C107695bk;
import X.C18260x0;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C191059Aw;
import X.C194399Ss;
import X.C196709bc;
import X.C204019og;
import X.C64333Db;
import X.C85244Fm;
import X.C86604Kt;
import X.C88834as;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilDyiReportActivity extends AnonymousClass9BX {
    public AnonymousClass9bR A00;
    public C196709bc A01;
    public AnonymousClass9TZ A02;
    public C194399Ss A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            this.A03 = (C85244Fm) r3.AJ2.get();
            this.A0K = (AnonymousClass9VV) r2.A3p.get();
            this.A0R = C86604Kt.A0e(r3);
            this.A0B = C64333Db.A2t(r3);
            this.A0Q = C1899593h.A0Q(r3);
            this.A0I = C1899593h.A0I(r3);
            AnonymousClass97X.A0C(r3, r2, C64333Db.A3D(r3), this);
            this.A00 = (AnonymousClass9bR) r2.A14.get();
            this.A02 = C1899693i.A0P(r3);
            this.A01 = A0I.ACj();
            this.A03 = A0I.ACt();
        }
    }

    public void A7B(String str) {
        FingerprintBottomSheet fingerprintBottomSheet;
        String str2 = this.A0S;
        String str3 = str;
        if (str2.equals("business")) {
            this.A0O.A0J(str3);
        } else if (!str2.equals("personal")) {
            C18260x0.A0r("PAY: DyiReportBaseActivity/dyiReportButtonContainer::onClick - This payment account type is not supported. PaymentAccount = ", str2, AnonymousClass001.A0o());
        } else {
            PinBottomSheetDialogFragment A002 = AnonymousClass9SH.A00();
            if (Build.VERSION.SDK_INT >= 23) {
                fingerprintBottomSheet = C1899693i.A07();
            } else {
                fingerprintBottomSheet = null;
            }
            this.A0O.A0E(this, fingerprintBottomSheet, new C191059Aw(this.A01, this.A06, this.A0F, this.A0L, this, str3), A002, str3, "DYIREPORT", this.A0T);
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog A002 = this.A03.A00((Bundle) null, this, i);
        if (A002 == null) {
            return super.onCreateDialog(i);
        }
        return A002;
    }

    public BrazilDyiReportActivity(int i) {
        this.A04 = false;
        C204019og.A00(this, 20);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A08.setText(R.string.f11nameremoved);
    }

    public BrazilDyiReportActivity() {
        this(0);
    }
}
