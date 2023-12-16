package com.whatsapp.identity;

import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class QrCodeValidationResultBottomSheet extends WDSBottomSheetDialogFragment {
    public View.OnClickListener A00;
    public View.OnClickListener A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextView A0F = C18280x3.A0F(view, R.id.qr_validation_result_message);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || !bundle2.getBoolean("is_valid")) {
            A0F.setText(R.string.f11nameremoved);
            i = R.id.qr_validation_failure_icon;
        } else {
            A0F.setText(R.string.f11nameremoved);
            i = R.id.qr_validation_success_icon_animation;
        }
        view.findViewById(i).setVisibility(0);
        View findViewById = view.findViewById(R.id.done_button);
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            findViewById.setOnClickListener(onClickListener);
            return;
        }
        throw C18270x1.A0S("doneButtonClickListener");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this.A0B);
            return;
        }
        throw C18270x1.A0S("dismissClickListener");
    }
}
