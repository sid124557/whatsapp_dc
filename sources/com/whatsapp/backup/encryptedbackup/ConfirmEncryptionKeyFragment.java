package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0w4;
import X.C06560Yg;
import X.C08240dc;
import X.C08310eF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class ConfirmEncryptionKeyFragment extends Hilt_ConfirmEncryptionKeyFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C08240dc r2 = new C08240dc(A0T());
        r2.A0A(new EncryptionKeyFragment(), R.id.encryption_key_confirm_encryption_key_container);
        r2.A00(false);
        this.A00 = (RelativeLayout) C06560Yg.A02(view, R.id.enc_key_background);
        C08310eF.A0A(view, R.id.encryption_key_confirm_title).setText(C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, 64, new Object[]{64}));
        TextView A0A = C08310eF.A0A(view, R.id.encryption_key_confirm_button_confirm);
        A0A.setText(C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, 64, new Object[]{64}));
        A0A.setOnClickListener(new AnonymousClass0w4(this, 0));
        C06560Yg.A02(view, R.id.encryption_key_confirm_button_cancel).setOnClickListener(new AnonymousClass0w4(this, 1));
        this.A00.setOnCreateContextMenuListener(this);
    }
}
