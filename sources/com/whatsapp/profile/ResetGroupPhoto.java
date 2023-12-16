package com.whatsapp.profile;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4HY;
import X.C003203q;
import X.C18270x1;
import X.C18280x3;
import X.C19340zH;
import X.C64333Db;
import X.C88834as;
import X.C89704el;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ResetGroupPhoto extends C89704el {
    public boolean A00;

    public class ConfirmDialogFragment extends Hilt_ResetGroupPhoto_ConfirmDialogFragment {
        public static ConfirmDialogFragment A00(boolean z) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putBoolean("IS_COMMUNITY_KEY", z);
            confirmDialogFragment.A0u(A08);
            return confirmDialogFragment;
        }

        public Dialog A1J(Bundle bundle) {
            boolean z = A0H().getBoolean("IS_COMMUNITY_KEY", false);
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            C19340zH A0K = C18280x3.A0K(this);
            A0K.A0T(i);
            A0K.A0i(true);
            C19340zH.A07(A0K, this, 78, R.string.f11nameremoved);
            C19340zH.A08(A0K, this, 79, R.string.f11nameremoved);
            return A0K.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C003203q A0Q = A0Q();
            if (A0Q != null) {
                A0Q.finish();
                A0Q.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            this.A04 = C64333Db.A8y(((C88834as) AnonymousClass0x9.A0K(this)).A4Z);
        }
    }

    public ResetGroupPhoto(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 97);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "IS_COMMUNITY_KEY");
        if (bundle == null) {
            C18270x1.A0t(ConfirmDialogFragment.A00(A1N), this);
        }
    }

    public ResetGroupPhoto() {
        this(0);
    }
}
