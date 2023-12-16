package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0w5;
import X.AnonymousClass33p;
import X.AnonymousClass5V0;
import X.C06560Yg;
import X.C08310eF;
import X.C09920gy;
import X.C106755a7;
import X.C19340zH;
import X.C620633i;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class EnableDoneFragment extends Hilt_EnableDoneFragment {
    public C620633i A00;
    public AnonymousClass33p A01;

    public static /* synthetic */ void A00(EnableDoneFragment enableDoneFragment, int i) {
        int i2;
        if (i == 4) {
            i2 = R.string.f11nameremoved;
        } else if (i == 8) {
            i2 = R.string.f11nameremoved;
        } else {
            return;
        }
        enableDoneFragment.A1J(C08310eF.A09(enableDoneFragment).getString(i2));
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        C06560Yg.A02(view, R.id.enable_done_create_button).setOnClickListener(new AnonymousClass0w5(this, 2, encBackupViewModel));
        AnonymousClass08M r4 = encBackupViewModel.A04;
        r4.A0B(A0V(), new C09920gy(this, 9));
        C06560Yg.A02(view, R.id.enable_done_cancel_button).setOnClickListener(new AnonymousClass0w5(this, 3, encBackupViewModel));
        r4.A0B(A0V(), new C09920gy(this, 9));
    }

    public final void A1J(String str) {
        C19340zH A002 = AnonymousClass5V0.A00(A0R());
        A002.A0g(str);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.create().show();
        C106755a7.A03(this.A00);
        Log.i(AnonymousClass000.A0V("encb/EnableDoneFragment/error modal shown with message: ", str, AnonymousClass001.A0o()));
    }
}
