package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0w5;
import X.C05550Ty;
import X.C06560Yg;
import X.C08310eF;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public class EnableEducationFragment extends WaFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        C05550Ty A0B = C08310eF.A0B(this);
        TextView A0A = C08310eF.A0A(view, R.id.enable_education_use_encryption_key_button);
        Resources A09 = C08310eF.A09(this);
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L, 64, 0);
        A0A.setText(A09.getQuantityString(R.plurals.f9nameremoved, 64, A0L));
        A0A.setOnClickListener(new AnonymousClass0w5(this, 4, A0B));
        C06560Yg.A02(view, R.id.enable_education_create_password_button).setOnClickListener(new AnonymousClass0w5(this, 5, A0B));
    }
}
