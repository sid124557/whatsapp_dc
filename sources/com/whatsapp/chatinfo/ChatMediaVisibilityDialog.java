package com.whatsapp.chatinfo;

import X.AnonymousClass1R1;
import X.AnonymousClass5G1;
import X.AnonymousClass5V0;
import X.AnonymousClass6C6;
import X.C003203q;
import X.C08310eF;
import X.C1235268t;
import X.C15930sC;
import X.C19340zH;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ChatMediaVisibilityDialog extends Hilt_ChatMediaVisibilityDialog {
    public int A00;
    public int A01;
    public AnonymousClass5G1 A02;
    public C95814uZ A03;
    public AnonymousClass1R1 A04;
    public boolean A05;

    public Dialog A1J(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        boolean z = this.A05;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        int i2 = 0;
        charSequenceArr[0] = C08310eF.A09(this).getString(i);
        charSequenceArr[1] = C08310eF.A09(this).getString(R.string.f11nameremoved);
        charSequenceArr[2] = C08310eF.A09(this).getString(R.string.f11nameremoved);
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        C003203q A0R = A0R();
        TextView textView = (TextView) A0R.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        textView.setText(R.string.f11nameremoved);
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0Z(textView);
        A002.A00.A0K(C1235268t.A00(this, 15), charSequenceArr, i2);
        A002.A0d(this, AnonymousClass6C6.A00(this, 73), R.string.f11nameremoved);
        A002.A0c(this, (C15930sC) null, R.string.f11nameremoved);
        return A002.create();
    }

    public ChatMediaVisibilityDialog(AnonymousClass5G1 r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r2 == 2) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A0p(r4)
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = "chatJid"
            X.4uZ r2 = X.C106405Yw.A02(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Chat jid must be passed to "
            r1.append(r0)
            java.lang.Class<com.whatsapp.chatinfo.ChatMediaVisibilityDialog> r0 = com.whatsapp.chatinfo.ChatMediaVisibilityDialog.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A07(r2, r0)
            r3.A03 = r2
            X.1R1 r0 = r3.A04
            X.2sa r0 = r0.A0I()
            int r2 = r0.A01
            if (r2 == 0) goto L_0x0033
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            r3.A05 = r1
            X.1R1 r1 = r3.A04
            X.4uZ r0 = r3.A03
            X.2sa r0 = X.AnonymousClass1R1.A00(r0, r1)
            int r0 = r0.A01
            r3.A00 = r0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatMediaVisibilityDialog.A0p(android.os.Bundle):void");
    }

    public ChatMediaVisibilityDialog() {
    }
}
