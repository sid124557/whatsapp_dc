package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass0w4;
import X.AnonymousClass5X8;
import X.C08310eF;
import X.C111095hX;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.whatsapp.R;
import java.text.Normalizer;

public class RestorePasswordInputFragment extends Hilt_RestorePasswordInputFragment {
    public C111095hX A00;
    public AnonymousClass5X8 A01;

    public void A1K() {
        Editable text = this.A06.getText();
        if (text != null) {
            EncBackupViewModel encBackupViewModel = this.A07;
            encBackupViewModel.A05.A0H(Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC));
            this.A07.A0O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r2 = this;
            com.whatsapp.CodeInputField r0 = r2.A06
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.toString()
            int r1 = X.AnonymousClass0YS.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.A1R(r0)
            android.widget.TextView r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment.A1L():void");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C08310eF.A0C(this.A04, this, R.string.f11nameremoved);
        C08310eF.A0C(this.A03, this, R.string.f11nameremoved);
        this.A01.setVisibility(0);
        this.A01.setOnClickListener(new AnonymousClass0w4(this, 10));
        C08310eF.A0C(this.A0A, this, R.string.f11nameremoved);
        this.A05.setVisibility(0);
        this.A05.setText(R.string.f11nameremoved);
        this.A05.setOnClickListener(new AnonymousClass0w4(this, 11));
    }
}
