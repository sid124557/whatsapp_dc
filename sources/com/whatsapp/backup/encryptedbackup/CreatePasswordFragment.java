package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass0YS;
import X.C06270Wx;
import X.C08310eF;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.text.Normalizer;

public class CreatePasswordFragment extends Hilt_CreatePasswordFragment {
    public void A1K() {
        String str;
        Editable text = this.A06.getText();
        if (text != null) {
            String normalize = Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC);
            int A00 = AnonymousClass0YS.A00(normalize);
            if (A00 == 1) {
                Resources A09 = C08310eF.A09(this);
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, 6, 0);
                str = A09.getQuantityString(R.plurals.f9nameremoved, 6, objArr);
            } else if (A00 == 2) {
                Resources A092 = C08310eF.A09(this);
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1P(objArr2, 1, 0);
                str = A092.getQuantityString(R.plurals.f9nameremoved, 1, objArr2);
            } else if (A00 == 3) {
                str = C08310eF.A09(this).getString(R.string.f11nameremoved);
            } else if (A00 == 4) {
                this.A07.A05.A0H(normalize);
                C06270Wx.A03(this.A07.A03, 400);
                return;
            } else {
                return;
            }
            A1P(str, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 <= 1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r4 = this;
            com.whatsapp.CodeInputField r0 = r4.A06
            android.text.Editable r0 = r0.getText()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.toString()
            int r1 = X.AnonymousClass0YS.A00(r0)
            r0 = 1
            if (r1 > r2) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r4.A1R(r0)
            r0 = 2131755084(0x7f10004c, float:1.9141037E38)
            r4.A1N(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment.A1L():void");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        int i = this.A00;
        TextView textView = this.A04;
        int i2 = R.string.f11nameremoved;
        if (i == 1) {
            i2 = R.string.f11nameremoved;
        }
        C08310eF.A0C(textView, this, i2);
        this.A03.setVisibility(4);
        this.A06.setHint(C08310eF.A09(this).getText(R.string.f11nameremoved));
        C08310eF.A0C(this.A0A, this, R.string.f11nameremoved);
        A1Q(true);
        A1L();
    }
}
