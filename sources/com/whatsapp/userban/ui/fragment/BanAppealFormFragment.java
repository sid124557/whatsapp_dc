package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4K2;
import X.AnonymousClass5X8;
import X.C06560Yg;
import X.C105895Wv;
import X.C107575bX;
import X.C109395eY;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C19320zF;
import X.C53742na;
import X.C620633i;
import X.C69263Wi;
import X.C85244Fm;
import X.C88944b3;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealFormFragment extends Hilt_BanAppealFormFragment {
    public EditText A00;
    public C69263Wi A01;
    public C85244Fm A02;
    public AnonymousClass5X8 A03;
    public C620633i A04;
    public AnonymousClass1VX A05;
    public BanAppealViewModel A06;
    public C105895Wv A07;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A13(true);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0e() {
        super.A0e();
        String A0m = C18290x4.A0m(this.A00);
        C53742na r1 = this.A06.A09;
        Log.i("BanAppealRepository/storeFormReviewDraft");
        C18270x1.A0j(C18270x1.A03(r1.A04), "support_ban_appeal_form_review_draft", A0m);
    }

    public void A0f() {
        super.A0f();
        C53742na r1 = this.A06.A09;
        Log.i("BanAppealRepository/getFormReviewDraft");
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r1.A04), "support_ban_appeal_form_review_draft");
        if (A0Z != null) {
            this.A00.setText(A0Z);
        }
    }

    public void A0w(Bundle bundle, View view) {
        this.A06 = C18280x3.A0P(this);
        BanAppealViewModel.A00(A0R(), true);
        View view2 = view;
        this.A00 = (EditText) C06560Yg.A02(view2, R.id.form_appeal_reason);
        C06560Yg.A02(view2, R.id.submit_button).setOnClickListener(new C109395eY(this, 25));
        AnonymousClass4K2.A00(A0R(), this.A06.A02, this, 200);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view2, R.id.heading);
        AnonymousClass0x2.A14(this.A05, A0K);
        AnonymousClass0x2.A12(A0K, this.A04);
        SpannableStringBuilder A002 = C18330xA.A00(C107575bX.A00(A1D(), new Object[]{this.A03.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.f11nameremoved));
        URLSpan[] A1Z = C18310x6.A1Z(A002);
        if (A1Z != null) {
            for (URLSpan uRLSpan : A1Z) {
                A002.setSpan(new C88944b3(A1D(), this.A02, this.A01, this.A04, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
                A002.removeSpan(uRLSpan);
            }
        }
        A0K.setText(A002);
        A0R().A05.A01(new C19320zF(this), A0V());
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A06.A0F();
        return true;
    }
}
