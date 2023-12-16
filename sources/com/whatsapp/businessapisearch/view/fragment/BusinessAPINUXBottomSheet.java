package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C107635bd;
import X.C111095hX;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C620633i;
import X.C69263Wi;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class BusinessAPINUXBottomSheet extends Hilt_BusinessAPINUXBottomSheet implements AnonymousClass64B {
    public C111095hX A00;
    public C69263Wi A01;
    public C620633i A02;
    public AnonymousClass1VX A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        C06560Yg.A0C(AnonymousClass0Y8.A07(A0G(), R.color.f5nameremoved), A0R);
        View A022 = C06560Yg.A02(A0R, R.id.btn_continue);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(A0R, R.id.nux_privacy_policy);
        Uri parse = Uri.parse("https://faq.whatsapp.com/530309022405692/");
        AnonymousClass1VX r10 = this.A03;
        C69263Wi r7 = this.A01;
        String string = A0R.getContext().getString(R.string.f11nameremoved);
        C111095hX r6 = this.A00;
        C620633i r9 = this.A02;
        C162457s7.A0J(parse, 0);
        C18260x0.A0e(r10, r7, string, A0K);
        C18260x0.A0U(r6, r9);
        C107635bd.A0E(A0K.getContext(), parse, r6, r7, A0K, r9, r10, string, "learn-more");
        C18290x4.A1H(C06560Yg.A02(A0R, R.id.nux_close_button), this, 17);
        C18290x4.A1H(A022, this, 18);
        return A0R;
    }

    public void A1X(View view) {
        super.A1X(view);
        BottomSheetBehavior.A01(view).A0d(true);
    }
}
