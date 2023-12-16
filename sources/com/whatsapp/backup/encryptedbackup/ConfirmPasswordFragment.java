package com.whatsapp.backup.encryptedbackup;

import X.C06270Wx;
import X.C08310eF;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.text.Normalizer;

public class ConfirmPasswordFragment extends Hilt_ConfirmPasswordFragment {
    public String A00;

    public void A1K() {
        Editable text = this.A06.getText();
        if (text == null || !Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC).equals(this.A00)) {
            A1P(C08310eF.A09(this).getString(R.string.f11nameremoved), true);
            return;
        }
        int i = this.A00;
        EncBackupViewModel encBackupViewModel = this.A07;
        if (i == 1) {
            C06270Wx.A03(encBackupViewModel.A03, 500);
        } else {
            encBackupViewModel.A0J();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 > 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r3 = this;
            com.whatsapp.CodeInputField r0 = r3.A06
            android.text.Editable r0 = r0.getText()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.toString()
            int r1 = X.AnonymousClass0YS.A00(r0)
            r0 = 1
            if (r1 <= r0) goto L_0x001e
        L_0x0014:
            r3.A1R(r0)
            r0 = 2131888921(0x7f120b19, float:1.941249E38)
            r3.A1N(r2, r0, r2)
            return
        L_0x001e:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment.A1L():void");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        this.A00 = (String) this.A07.A05.A07();
        int i = this.A00;
        TextView textView = this.A04;
        int i2 = R.string.f11nameremoved;
        if (i == 1) {
            i2 = R.string.f11nameremoved;
        }
        C08310eF.A0C(textView, this, i2);
        C08310eF.A0C(this.A03, this, R.string.f11nameremoved);
        C08310eF.A0C(this.A0A, this, R.string.f11nameremoved);
        A1Q(true);
        A1L();
    }
}
