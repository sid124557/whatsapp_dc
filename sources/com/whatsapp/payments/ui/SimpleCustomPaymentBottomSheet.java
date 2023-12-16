package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass32Y;
import X.AnonymousClass5Yj;
import X.AnonymousClass977;
import X.C08310eF;
import X.C1899693i;
import X.C203969ob;
import X.C204249p3;
import X.C56972sr;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class SimpleCustomPaymentBottomSheet extends Hilt_SimpleCustomPaymentBottomSheet {
    public String A1d() {
        Resources A09;
        int i;
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this;
        if (!paymentCustomInstructionsBottomSheet.A07.A0w(C56972sr.A04(paymentCustomInstructionsBottomSheet.A00), AnonymousClass32Y.A03(paymentCustomInstructionsBottomSheet.A03), "55")) {
            A09 = C08310eF.A09(paymentCustomInstructionsBottomSheet);
            i = R.string.f11nameremoved;
        } else {
            boolean A0G = paymentCustomInstructionsBottomSheet.A05.A0G();
            A09 = C08310eF.A09(paymentCustomInstructionsBottomSheet);
            i = R.string.f11nameremoved;
            if (A0G) {
                i = R.string.f11nameremoved;
            }
        }
        return A09.getString(i);
    }

    public View.OnClickListener A1b() {
        return C204249p3.A00(this, 123);
    }

    public View A1c() {
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this;
        View inflate = LayoutInflater.from(paymentCustomInstructionsBottomSheet.A0G()).inflate(R.layout.f8nameremoved, new FrameLayout(paymentCustomInstructionsBottomSheet.A0G()));
        View findViewById = inflate.findViewById(R.id.close);
        TextView A09 = AnonymousClass002.A09(inflate, R.id.payment_instruction_header);
        TextView A092 = AnonymousClass002.A09(inflate, R.id.payment_instruction_title);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.payment_instruction_description);
        if (paymentCustomInstructionsBottomSheet.A07.A0w(C56972sr.A04(paymentCustomInstructionsBottomSheet.A00), AnonymousClass32Y.A03(paymentCustomInstructionsBottomSheet.A03), "55")) {
            C1899693i.A0l(A09, paymentCustomInstructionsBottomSheet, new Object[]{paymentCustomInstructionsBottomSheet.A08}, R.string.f11nameremoved);
        } else {
            A09.setVisibility(8);
            A092.setText(R.string.f11nameremoved);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(paymentCustomInstructionsBottomSheet.A09);
        Linkify.addLinks(spannableStringBuilder, 1);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableStringBuilder2.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder2.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder2.getSpanFlags(uRLSpan);
            spannableStringBuilder2.removeSpan(uRLSpan);
            spannableStringBuilder2.setSpan(new AnonymousClass977(paymentCustomInstructionsBottomSheet.A1D(), uRLSpan, paymentCustomInstructionsBottomSheet, AnonymousClass5Yj.A02(paymentCustomInstructionsBottomSheet.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved)), spanStart, spanEnd, spanFlags);
        }
        AnonymousClass0x2.A14(paymentCustomInstructionsBottomSheet.A02, textEmojiLabel);
        textEmojiLabel.setText(spannableStringBuilder2);
        C203969ob.A00(findViewById, paymentCustomInstructionsBottomSheet, 8);
        if (paymentCustomInstructionsBottomSheet.A1Y()) {
            ((ViewGroup) inflate).getChildAt(0).setBackground((Drawable) null);
        }
        return inflate;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        String A1d = A1d();
        int A1a = A1a();
        View.OnClickListener A1b = A1b();
        View A1c = A1c();
        if (!TextUtils.isEmpty(A1d)) {
            WDSButton wDSButton = (WDSButton) inflate.findViewById(R.id.primary_button);
            wDSButton.setText(A1d);
            wDSButton.setOnClickListener(A1b);
            wDSButton.setVisibility(0);
            if (A1a != 0) {
                wDSButton.setIcon(A1a);
            }
        }
        TextUtils.isEmpty((CharSequence) null);
        ((ViewGroup) inflate.findViewById(R.id.ui_container)).addView(A1c);
        return inflate;
    }

    public int A1a() {
        return 0;
    }
}
