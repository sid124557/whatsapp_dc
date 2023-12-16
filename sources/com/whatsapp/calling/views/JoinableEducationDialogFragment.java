package com.whatsapp.calling.views;

import X.AnonymousClass002;
import X.AnonymousClass0AQ;
import X.AnonymousClass0x9;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C08310eF;
import X.C19340zH;
import X.C626936e;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

public class JoinableEducationDialogFragment extends Hilt_JoinableEducationDialogFragment {
    public boolean A00;

    public static JoinableEducationDialogFragment A00() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("bundle_param_voice_call", false);
        JoinableEducationDialogFragment joinableEducationDialogFragment = new JoinableEducationDialogFragment();
        joinableEducationDialogFragment.A0u(A08);
        return joinableEducationDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        if (!(bundle == null && (bundle = this.A06) == null)) {
            this.A00 = bundle.getBoolean("bundle_param_voice_call", false);
        }
        C003203q A0Q = A0Q();
        C626936e.A06(A0Q);
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        View inflate = LayoutInflater.from(A0Q).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        ImageView A0F = AnonymousClass0x9.A0F(inflate, R.id.voip_call_joinable_education_dialog_icon);
        if (this.A00) {
            AnonymousClass0AQ A03 = AnonymousClass0AQ.A03((Resources.Theme) null, C08310eF.A09(this), R.drawable.vec_ic_voip_joinable_calls_education_stars_voice);
            C626936e.A06(A03);
            A0F.setImageDrawable(A03);
            A0F.setContentDescription(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        A002.setView(inflate);
        A002.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
