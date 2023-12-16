package com.whatsapp.biz.product.view.fragment;

import X.C1235268t;
import X.C181888nV;
import X.C18280x3;
import X.C1891190b;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ReportProductDialogFragment extends Hilt_ReportProductDialogFragment {
    public C181888nV A00;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0B(R.string.f11nameremoved);
        A0K.A0A(R.string.f11nameremoved);
        C1235268t.A02(A0K, this, 9, R.string.f11nameremoved);
        A0K.setNegativeButton(R.string.f11nameremoved, new C1891190b(this, 18));
        return A0K.create();
    }
}
