package com.whatsapp.profile;

import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0Y9;
import X.AnonymousClass43A;
import X.AnonymousClass4K2;
import X.AnonymousClass4SH;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C162457s7;
import X.C18310x6;
import X.C633939b;
import X.C79473wg;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import org.wawebrtc.MediaCodecVideoEncoder;

public final class SetUsernameBottomSheet extends Hilt_SetUsernameBottomSheet {
    public EditText A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C79473wg(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        View findViewById;
        BottomSheetBehavior A012;
        C162457s7.A0J(view, 0);
        this.A03 = AnonymousClass002.A09(view, R.id.set_username_dialog_title);
        EditText editText = (EditText) view.findViewById(R.id.set_username_dialog_input);
        AnonymousClass0Y9.A01(ColorStateList.valueOf(AnonymousClass0Y8.A04(editText.getContext(), R.color.f5nameremoved)), editText);
        this.A00 = editText;
        this.A02 = AnonymousClass002.A09(view, R.id.set_username_dialog_positive_cta);
        this.A01 = AnonymousClass002.A09(view, R.id.set_username_dialog_negative_cta);
        TextView textView = this.A03;
        if (textView != null) {
            textView.setText(R.string.f11nameremoved);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setText(R.string.f11nameremoved);
        }
        TextView textView3 = this.A01;
        if (textView3 != null) {
            textView3.setText(R.string.f11nameremoved);
        }
        TextView textView4 = this.A02;
        if (textView4 != null) {
            C633939b.A00(textView4, this, 37);
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            C633939b.A00(textView5, this, 38);
        }
        AnonymousClass4K2.A00(this, ((UsernameViewModel) this.A04.getValue()).A0D(), new AnonymousClass43A(this), MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
        Dialog dialog = this.A03;
        if ((dialog instanceof AnonymousClass4SH) && dialog != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null && (A012 = BottomSheetBehavior.A01(findViewById)) != null) {
            A012.A0S(3);
        }
    }

    public void A0c() {
        super.A0c();
        UsernameViewModel usernameViewModel = (UsernameViewModel) this.A04.getValue();
        usernameViewModel.A00 = null;
        usernameViewModel.A0G((Integer) null);
        this.A03 = null;
        this.A00 = null;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
    }

    public void A0f() {
        super.A0f();
        EditText editText = this.A00;
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }
}
