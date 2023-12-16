package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass0x9;
import X.AnonymousClass340;
import X.AnonymousClass66R;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C66433Lk;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class PhoneNumberSharedBottomSheet extends Hilt_PhoneNumberSharedBottomSheet {
    public C111095hX A00;
    public C66433Lk A01;
    public final AnonymousClass66R A02 = AnonymousClass340.A00(this, "arg_is_business");
    public final AnonymousClass66R A03 = AnonymousClass340.A02(this, "arg_my_phone_number");
    public final boolean A04 = true;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(AnonymousClass0x9.A13(this.A03));
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(R.string.f11nameremoved);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            boolean A1V = C18270x1.A1V(this.A02);
            int i = R.string.f11nameremoved;
            if (A1V) {
                i = R.string.f11nameremoved;
            }
            textView3.setText(i);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            textView4.setText(R.string.f11nameremoved);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            textView5.setText(R.string.f11nameremoved);
        }
    }

    public void onClick(View view) {
        C162457s7.A0J(view, 0);
        int id = view.getId();
        if (id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive) {
            A1L();
        } else if (id == R.id.share_pn_cta_negative) {
            C66433Lk r1 = this.A01;
            if (r1 != null) {
                Uri A032 = r1.A03("626403979060997");
                C162457s7.A0D(A032);
                Intent A0D = C18310x6.A0D(A032);
                C111095hX r12 = this.A00;
                if (r12 != null) {
                    r12.A0A(A0G(), A0D);
                    return;
                }
                throw C18270x1.A0S("activityUtils");
            }
            throw C18270x1.A0S("faqLinkFactory");
        }
    }
}
