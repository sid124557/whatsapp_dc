package com.whatsapp.payments.ui.compliance;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4DN;
import X.AnonymousClass4FS;
import X.AnonymousClass4HQ;
import X.AnonymousClass4I9;
import X.AnonymousClass4JS;
import X.AnonymousClass4TJ;
import X.AnonymousClass5X8;
import X.C08310eF;
import X.C105895Wv;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C194309Sj;
import X.C620633i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class ConfirmLegalNameBottomSheetFragment extends WaFragment {
    public View A00;
    public LinearLayout A01;
    public ProgressBar A02;
    public ScrollView A03;
    public TextEmojiLabel A04;
    public WaEditText A05;
    public AnonymousClass5X8 A06;
    public C620633i A07;
    public AnonymousClass1VX A08;
    public C194309Sj A09;
    public AnonymousClass4DN A0A;
    public C105895Wv A0B;
    public C106715a2 A0C;
    public AnonymousClass4FS A0D;
    public WDSButton A0E;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new AnonymousClass4JS(this);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        boolean z = false;
        this.A00 = C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(A1I(), R.id.confirm_legal_name_desc_view);
        C162457s7.A0J(textEmojiLabel, 0);
        this.A04 = textEmojiLabel;
        WaEditText waEditText = (WaEditText) C18280x3.A0E(A1I(), R.id.full_name_edit_view);
        C162457s7.A0J(waEditText, 0);
        this.A05 = waEditText;
        ProgressBar progressBar = (ProgressBar) C18280x3.A0E(A1I(), R.id.loading_progress);
        C162457s7.A0J(progressBar, 0);
        this.A02 = progressBar;
        LinearLayout linearLayout = (LinearLayout) C18280x3.A0E(A1I(), R.id.confirm_legal_name_input_container);
        C162457s7.A0J(linearLayout, 0);
        this.A01 = linearLayout;
        TextEmojiLabel textEmojiLabel2 = this.A04;
        if (textEmojiLabel2 != null) {
            C620633i r1 = this.A07;
            if (r1 != null) {
                textEmojiLabel2.setAccessibilityHelper(new AnonymousClass4TJ(textEmojiLabel2, r1));
                TextEmojiLabel textEmojiLabel3 = this.A04;
                if (textEmojiLabel3 != null) {
                    AnonymousClass1VX r0 = this.A08;
                    if (r0 != null) {
                        AnonymousClass0x2.A14(r0, textEmojiLabel3);
                        TextEmojiLabel textEmojiLabel4 = this.A04;
                        if (textEmojiLabel4 != null) {
                            textEmojiLabel4.setText(A1J());
                            WDSButton wDSButton = (WDSButton) C18280x3.A0E(A1I(), R.id.continue_btn);
                            C162457s7.A0J(wDSButton, 0);
                            this.A0E = wDSButton;
                            ScrollView scrollView = (ScrollView) C18280x3.A0E(A1I(), R.id.compliance_name_scroll_view);
                            C162457s7.A0J(scrollView, 0);
                            this.A03 = scrollView;
                            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
                            }
                            C08310eF r3 = this.A0E;
                            C162457s7.A0K(r3, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
                            WaEditText waEditText2 = this.A05;
                            if (waEditText2 != null) {
                                waEditText2.addTextChangedListener(new AnonymousClass4HQ(this, 6));
                                WaEditText waEditText3 = this.A05;
                                if (waEditText3 != null) {
                                    if (String.valueOf(waEditText3.getText()).length() > 0) {
                                        z = true;
                                    }
                                    A1L(z);
                                    WDSButton wDSButton2 = this.A0E;
                                    if (wDSButton2 != null) {
                                        wDSButton2.setOnClickListener(new AnonymousClass4I9(r3, 2, this));
                                        C18280x3.A0E(A1I(), R.id.close_btn).setOnClickListener(new AnonymousClass4I9(r3, 3, this));
                                        return A1I();
                                    }
                                    throw C18270x1.A0S("continueButton");
                                }
                                throw C18270x1.A0S("nameEditText");
                            }
                            throw C18270x1.A0S("nameEditText");
                        }
                        throw C18270x1.A0S("descText");
                    }
                    throw C18270x1.A0R();
                }
                throw C18270x1.A0S("descText");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("descText");
    }

    public abstract CharSequence A1J();

    public abstract void A1K(Integer num, String str, String str2, int i);

    public void A0c() {
        ScrollView scrollView = this.A03;
        if (scrollView != null) {
            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A0F);
            }
            super.A0c();
            return;
        }
        throw C18270x1.A0S("scrollView");
    }

    public final View A1I() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        throw C18270x1.A0S("rootView");
    }

    public final void A1L(boolean z) {
        WDSButton wDSButton = this.A0E;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
            return;
        }
        throw C18270x1.A0S("continueButton");
    }
}
