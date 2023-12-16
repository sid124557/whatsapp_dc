package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0w5;
import X.C06560Yg;
import X.C08310eF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ForcedRegLandingFragment extends Hilt_ForcedRegLandingFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        C06560Yg.A02(view, R.id.enc_backup_validate_password_continue_button).setOnClickListener(new AnonymousClass0w5(this, 10, encBackupViewModel));
        C06560Yg.A02(view, R.id.enc_backup_validate_password_turn_off_button).setOnClickListener(new AnonymousClass0w5(this, 11, encBackupViewModel));
        if (encBackupViewModel.A0E() == 9) {
            C08310eF.A0A(view, R.id.enc_backup_validate_password_info_subtitle_info).setText(R.string.f11nameremoved);
        }
    }
}
