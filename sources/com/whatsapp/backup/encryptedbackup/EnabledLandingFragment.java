package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0w5;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.C06560Yg;
import X.C08310eF;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class EnabledLandingFragment extends Hilt_EnabledLandingFragment {
    public AnonymousClass33p A00;
    public AnonymousClass1VX A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        TextView A0A = C08310eF.A0A(view, R.id.enc_backup_enabled_landing_password_button);
        if (encBackupViewModel.A0G() > 0) {
            C08310eF.A0A(view, R.id.enc_backup_enabled_landing_privacy_notice).setText(R.string.f11nameremoved);
        }
        if (this.A00.A2F()) {
            TextView A0A2 = C08310eF.A0A(view, R.id.enc_backup_enabled_landing_restore_notice);
            Resources A09 = C08310eF.A09(this);
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, 64, 0);
            A0A2.setText(A09.getQuantityString(R.plurals.f9nameremoved, 64, A0L));
            C08310eF.A0C(A0A, this, R.string.f11nameremoved);
        }
        A0A.setOnClickListener(new AnonymousClass0w5(this, 8, encBackupViewModel));
        C06560Yg.A02(view, R.id.enc_backup_enabled_landing_disable_button).setOnClickListener(new AnonymousClass0w5(this, 9, encBackupViewModel));
        if (this.A01.A0X(5113) && this.A01.A0X(4869)) {
            TextView A0A3 = C08310eF.A0A(view, R.id.enc_backup_enabled_landing_privacy_notice);
            A0A3.setText(R.string.f11nameremoved);
            float dimensionPixelSize = (float) C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
            A0A3.setLineSpacing(dimensionPixelSize, 1.0f);
            TextView A0A4 = C08310eF.A0A(view, R.id.enc_backup_enabled_landing_restore_notice);
            A0A4.setText(R.string.f11nameremoved);
            A0A4.setLineSpacing(dimensionPixelSize, 1.0f);
        }
    }
}
