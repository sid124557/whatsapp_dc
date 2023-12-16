package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass043;
import X.AnonymousClass273;
import X.AnonymousClass7H2;
import X.C08310eF;
import X.C181888nV;
import X.C18280x3;
import X.C1891190b;
import X.C19340zH;
import X.C69263Wi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ProductReportReasonDialogFragment extends Hilt_ProductReportReasonDialogFragment {
    public static final String A04 = ProductReportReasonDialogFragment.class.getSimpleName();
    public int A00 = -1;
    public C69263Wi A01;
    public C181888nV A02;
    public final AnonymousClass7H2[] A03 = {new AnonymousClass7H2("no-match", R.string.f11nameremoved), new AnonymousClass7H2("spam", R.string.f11nameremoved), new AnonymousClass7H2("illegal", R.string.f11nameremoved), new AnonymousClass7H2("scam", R.string.f11nameremoved), new AnonymousClass7H2("knockoff", R.string.f11nameremoved), new AnonymousClass7H2("other", R.string.f11nameremoved)};

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        AnonymousClass7H2[] r5 = this.A03;
        int length = r5.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = C08310eF.A09(this).getString(r5[i].A00);
        }
        A0K.A0K(new C1891190b(this, 17), charSequenceArr, this.A00);
        A0K.A0B(R.string.f11nameremoved);
        A0K.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        AnonymousClass043 create = A0K.create();
        create.setOnShowListener(new AnonymousClass273(this, 1));
        return create;
    }
}
