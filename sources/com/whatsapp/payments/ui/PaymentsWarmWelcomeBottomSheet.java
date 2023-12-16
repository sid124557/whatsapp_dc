package com.whatsapp.payments.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass9XA;
import X.C06560Yg;
import X.C162457s7;
import X.C166777zF;
import X.C18270x1;
import X.C182878p8;
import X.C182888p9;
import X.C18300x5;
import X.C1891290c;
import X.C203499no;
import X.C378924l;
import X.C86614Ku;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class PaymentsWarmWelcomeBottomSheet extends Hilt_PaymentsWarmWelcomeBottomSheet {
    public C203499no A00;
    public C182878p8 A01;
    public C182888p9 A02;
    public final AnonymousClass9XA A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        if (A0H().containsKey("bundle_key_title")) {
            C18300x5.A0G(view, R.id.payments_warm_welcome_bottom_sheet_title).setText(A0H().getInt("bundle_key_title"));
        }
        String string = A0H().getString("referral_screen");
        String string2 = A0H().getString("bundle_screen_name");
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.payments_warm_welcome_bottom_sheet_image);
        int i = 8;
        if (A0H().containsKey("bundle_key_image")) {
            A0E.setImageResource(A0H().getInt("bundle_key_image"));
        } else {
            A0E.setVisibility(8);
        }
        if (A0H().containsKey("bundle_key_headline")) {
            C18300x5.A0G(view, R.id.payments_warm_welcome_bottom_sheet_textview_headline).setText(A0H().getInt("bundle_key_headline"));
        }
        TextEmojiLabel A0M = C86614Ku.A0M(view, R.id.payments_warm_welcome_bottom_sheet_textview_body);
        if (A0H().containsKey("bundle_key_body")) {
            A0M.setText(A0H().getInt("bundle_key_body"));
        }
        C182888p9 r0 = this.A02;
        if (r0 != null) {
            r0.BKQ(A0M);
        }
        View A022 = C06560Yg.A02(view, R.id.payments_warm_welcome_bottom_sheet_header_group);
        if (this.A02 == null) {
            i = 0;
        }
        A022.setVisibility(i);
        C06560Yg.A02(view, R.id.payments_warm_welcome_bottom_sheet_textview_button_primary).setOnClickListener(new C166777zF(this, string2, string));
        C1891290c.A00(C06560Yg.A02(view, R.id.payments_warm_welcome_bottom_sheet_close_image), this, 20);
        C203499no r2 = this.A00;
        if (r2 != null) {
            if (string2 == null) {
                string2 = "";
            }
            r2.BKB(0, (Integer) null, string2, string);
            return;
        }
        throw C18270x1.A0S("paymentUIEventLogger");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        this.A03.onDismiss(dialogInterface);
    }

    public /* synthetic */ PaymentsWarmWelcomeBottomSheet(C378924l r1) {
        this();
    }

    public PaymentsWarmWelcomeBottomSheet() {
        this.A03 = new AnonymousClass9XA();
    }
}
