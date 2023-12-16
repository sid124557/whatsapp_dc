package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass5X8;
import X.C107575bX;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C620633i;
import X.C69263Wi;
import X.C85244Fm;
import X.C88944b3;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealFormSubmittedFragment extends Hilt_BanAppealFormSubmittedFragment {
    public C69263Wi A00;
    public C85244Fm A01;
    public AnonymousClass5X8 A02;
    public C620633i A03;
    public BanAppealViewModel A04;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A13(true);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        super.A0w(bundle, view2);
        this.A04 = C18280x3.A0P(this);
        BanAppealViewModel.A00(A0R(), true);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view2, R.id.heading);
        AnonymousClass0x2.A14(this.A05, A0K);
        AnonymousClass0x2.A12(A0K, this.A03);
        SpannableStringBuilder A002 = C18330xA.A00(C107575bX.A00(A1D(), new Object[]{this.A02.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.f11nameremoved));
        URLSpan[] A1Z = C18310x6.A1Z(A002);
        if (A1Z != null) {
            for (URLSpan uRLSpan : A1Z) {
                A002.setSpan(new C88944b3(A1D(), this.A01, this.A00, this.A03, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
                A002.removeSpan(uRLSpan);
            }
        }
        A0K.setText(A002);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        if (!this.A01.A07()) {
            C18290x4.A1E(menu, 1, R.string.f11nameremoved);
        }
        super.A0y(menu, menuInflater);
    }

    public boolean A1B(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.A04.A0G(A0R(), false);
            return true;
        } else if (itemId != 16908332) {
            return super.A1B(menuItem);
        } else {
            this.A04.A0A.A0H(Boolean.TRUE);
            return true;
        }
    }
}
