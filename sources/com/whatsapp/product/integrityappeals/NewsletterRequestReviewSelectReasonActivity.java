package com.whatsapp.product.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3A8;
import X.AnonymousClass3DZ;
import X.AnonymousClass3Z6;
import X.AnonymousClass4HY;
import X.AnonymousClass4I2;
import X.AnonymousClass4K2;
import X.AnonymousClass66R;
import X.C107695bk;
import X.C154517dI;
import X.C18280x3;
import X.C18330xA;
import X.C634339f;
import X.C64333Db;
import X.C69903Yy;
import X.C73813g7;
import X.C79083w3;
import X.C79093w4;
import X.C79103w5;
import X.C80963z7;
import X.C822642x;
import X.C89644eZ;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.Map;

public final class NewsletterRequestReviewSelectReasonActivity extends C89644eZ {
    public boolean A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public NewsletterRequestReviewSelectReasonActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 89);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass4K2.A00(this, ((NewsletterRequestReviewViewModel) this.A02.getValue()).A00, new C822642x(this), 163);
        View findViewById = this.A00.findViewById(R.id.request_review_submit_button);
        RadioGroup radioGroup = (RadioGroup) this.A00.findViewById(R.id.request_review_reason_group);
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[4];
        AnonymousClass3Z6.A04(Integer.valueOf(R.string.f11nameremoved), "MISUNDERSTOOD_UPDATES", r2);
        AnonymousClass3Z6.A09(Integer.valueOf(R.string.f11nameremoved), "FOLLOWED_GUIDELINES", r2, 1);
        AnonymousClass3Z6.A06(Integer.valueOf(R.string.f11nameremoved), "ALLOWED_UPDATES", r2);
        AnonymousClass3Z6.A07(Integer.valueOf(R.string.f11nameremoved), "UNJUSTIFIED_SUSPENSION", r2);
        Map A0F = C73813g7.A0F(r2);
        C69903Yy r5 = new C69903Yy();
        r5.element = "UNKNOWN";
        Iterator A0q = AnonymousClass000.A0q(A0F);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            int A06 = C18280x3.A06(A0w);
            String A12 = AnonymousClass0x9.A12(A0w);
            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(this, R.style.f12nameremoved));
            radioButton.setText(A06);
            radioButton.setOnCheckedChangeListener(new AnonymousClass3A8(A12, r5));
            radioGroup.addView(radioButton);
        }
        radioGroup.setOnCheckedChangeListener(new AnonymousClass4I2(findViewById, 1));
        C634339f.A00(findViewById, this, r5, 3);
    }

    public NewsletterRequestReviewSelectReasonActivity() {
        this(0);
        this.A02 = C18330xA.A02(new C79103w5(this), new C79093w4(this), new C80963z7(this), AnonymousClass0x9.A1E(NewsletterRequestReviewViewModel.class));
        this.A01 = C154517dI.A01(new C79083w3(this));
    }
}
