package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass97T;
import X.AnonymousClass9Bb;
import X.C003203q;
import X.C06560Yg;
import X.C107695bk;
import X.C18280x3;
import X.C18300x5;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C88834as;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public class IndiaUpiProvideMoreInfoBottomSheetActivity extends AnonymousClass9Bb {
    public boolean A00;

    public class BottomSheetProvideMoreInfoFragment extends RoundedBottomSheetDialogFragment {
        public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
            C003203q A0Q = A0Q();
            if (A0Q != null) {
                C204249p3.A02(C06560Yg.A02(A0R, R.id.close), this, 91);
                C204249p3.A02(C06560Yg.A02(A0R, R.id.account_recovery_info_continue), A0Q, 92);
            }
            return A0R;
        }

        public void A0d() {
            super.A0d();
            C18300x5.A1A(this);
        }
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A00 = C1899593h.A09(r2);
            this.A02 = r1.AN7();
        }
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 87);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new BottomSheetProvideMoreInfoFragment();
        Boo(paymentBottomSheet);
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity() {
        this(0);
    }
}
