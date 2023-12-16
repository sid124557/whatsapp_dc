package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0w5;
import X.C06560Yg;
import X.C08310eF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ChangePasswordDoneFragment extends Hilt_ChangePasswordDoneFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        C06560Yg.A02(view, R.id.change_password_done_done_button).setOnClickListener(new AnonymousClass0w5(this, 0, encBackupViewModel));
        TextView A0A = C08310eF.A0A(view, R.id.change_password_done_title);
        if (encBackupViewModel.A0E() == 6) {
            i = R.string.f11nameremoved;
        } else if (encBackupViewModel.A0E() == 7 || encBackupViewModel.A0E() == 9) {
            i = R.string.f11nameremoved;
        } else {
            return;
        }
        A0A.setText(i);
    }
}
