package com.whatsapp.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3ZH;
import X.AnonymousClass69T;
import X.AnonymousClass7SJ;
import X.C08310eF;
import X.C18280x3;
import X.C184308ra;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

public class CreateOrAddToContactsDialog extends Hilt_CreateOrAddToContactsDialog {
    public long A00;
    public C184308ra A01;
    public boolean A02;

    public static CreateOrAddToContactsDialog A00(AnonymousClass3ZH r5, boolean z) {
        CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putLong("CONTACT_ID_KEY", r5.A0F());
        A08.putBoolean("IS_ME_KEY", z);
        createOrAddToContactsDialog.A0u(A08);
        return createOrAddToContactsDialog;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle A0H = A0H();
        this.A00 = A0H.getLong("CONTACT_ID_KEY");
        this.A02 = A0H.getBoolean("IS_ME_KEY");
        if (bundle != null) {
            this.A00 = bundle.getLong("CONTACT_ID_KEY");
            this.A02 = bundle.getBoolean("IS_ME_KEY");
        }
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putLong("CONTACT_ID_KEY", this.A00);
        bundle.putBoolean("IS_ME_KEY", this.A02);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0eF] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(android.content.Context r3) {
        /*
            r2 = this;
            super.A1G(r3)
            X.0eF r1 = r2.A0E
            boolean r0 = r1 instanceof X.C184308ra
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x000a:
            X.8ra r3 = (X.C184308ra) r3
            r2.A01 = r3
            return
        L_0x000f:
            boolean r0 = r3 instanceof X.C184308ra
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "CreateOrAddToContactsDialog requires a Listener as it's host"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.CreateOrAddToContactsDialog.A1G(android.content.Context):void");
    }

    public Dialog A1J(Bundle bundle) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new AnonymousClass7SJ(C08310eF.A09(this).getString(R.string.f11nameremoved), R.id.menuitem_conversations_add_new_contact));
        A0s.add(new AnonymousClass7SJ(C08310eF.A09(this).getString(R.string.f11nameremoved), R.id.menuitem_conversations_add_to_existing_contact));
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0E(new AnonymousClass69T(this, 10, A0s), new ArrayAdapter(A1D(), 17367043, A0s));
        return A0K.create();
    }
}
