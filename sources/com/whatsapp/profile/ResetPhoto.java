package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C003203q;
import X.C116985rC;
import X.C18270x1;
import X.C18280x3;
import X.C19340zH;
import X.C621433s;
import X.C64333Db;
import X.C88744aj;
import X.C89704el;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ResetPhoto extends C89704el {
    public C116985rC A00;
    public boolean A01;

    public class ConfirmDialogFragment extends Hilt_ResetPhoto_ConfirmDialogFragment {
        public C116985rC A00;

        public Dialog A1J(Bundle bundle) {
            Bundle bundle2 = this.A06;
            int i = 0;
            if (bundle2 != null) {
                i = bundle2.getInt("photo_type", 0);
            }
            C19340zH A0K = C18280x3.A0K(this);
            if (i == 1) {
                this.A00.A04();
                throw AnonymousClass001.A0g("getRemoveCoverPhotoConfirmationStringId");
            }
            A0K.A0T(R.string.f11nameremoved);
            A0K.A0i(true);
            C19340zH.A07(A0K, this, 80, R.string.f11nameremoved);
            C19340zH.A08(A0K, this, 81, R.string.f11nameremoved);
            return A0K.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C003203q A0Q = A0Q();
            if (A0Q != null && !C621433s.A03(A0Q)) {
                A0Q.finish();
                A0Q.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            this.A04 = C64333Db.A8y(AnonymousClass3DZ.A00(this));
            this.A00 = C88744aj.A00;
        }
    }

    public ResetPhoto(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 98);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("photo_type", 0);
        if (intExtra == 1) {
            this.A00.A04();
            throw AnonymousClass001.A0g("getRemoveCoverPhotoStringId");
        }
        setTitle(R.string.f11nameremoved);
        if (bundle == null) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("photo_type", intExtra);
            confirmDialogFragment.A0u(A08);
            C18270x1.A0t(confirmDialogFragment, this);
        }
    }

    public ResetPhoto() {
        this(0);
    }
}
