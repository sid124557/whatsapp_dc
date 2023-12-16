package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1VX;
import X.C06270Wx;
import X.C55682qk;
import X.C69263Wi;
import android.content.Intent;
import android.text.Editable;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import java.text.Normalizer;

public class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    public C55682qk A00;
    public C69263Wi A01;
    public BiometricAuthPlugin A02;
    public AnonymousClass1VX A03;

    public final void A1S(int i) {
        EncBackupViewModel encBackupViewModel;
        int i2;
        if (i == -1 || i == 4) {
            this.A07.A0S(6);
            C06270Wx.A05(this.A07.A0A, true);
            int A0E = this.A07.A0E();
            if (A0E == 4) {
                C06270Wx.A03(this.A07.A03, 302);
                return;
            }
            if (A0E != 5) {
                if (A0E == 7) {
                    encBackupViewModel = this.A07;
                    i2 = 8;
                } else if (A0E == 9) {
                    encBackupViewModel = this.A07;
                    i2 = 10;
                } else {
                    return;
                }
                C06270Wx.A03(encBackupViewModel.A09, i2);
            }
            C06270Wx.A03(this.A07.A03, 300);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r15, android.view.View r16) {
        /*
            r14 = this;
            r0 = r16
            super.A0w(r15, r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            int r1 = r0.A0E()
            r0 = 8
            r3 = 7
            if (r1 != r0) goto L_0x0017
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.08M r0 = r0.A09
            X.C06270Wx.A03(r0, r3)
        L_0x0017:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            int r1 = r0.A0E()
            r0 = 10
            r4 = 9
            if (r1 != r0) goto L_0x002a
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.08M r0 = r0.A09
            X.C06270Wx.A03(r0, r4)
        L_0x002a:
            X.1VX r11 = r14.A03
            X.3Wi r8 = r14.A01
            X.2qk r7 = r14.A00
            X.33i r9 = r14.A08
            X.03q r6 = r14.A0R()
            r12 = 2131888909(0x7f120b0d, float:1.9412467E38)
            r13 = 2131888908(0x7f120b0c, float:1.9412465E38)
            r2 = 1
            X.0w8 r10 = new X.0w8
            r10.<init>(r14, r2)
            com.whatsapp.deviceauth.BiometricAuthPlugin r5 = new com.whatsapp.deviceauth.BiometricAuthPlugin
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A02 = r5
            int r1 = r14.A00
            r0 = 4
            if (r1 != r0) goto L_0x008b
            android.widget.TextView r1 = r14.A04
            r0 = 2131888996(0x7f120b64, float:1.9412643E38)
            X.C08310eF.A0C(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888995(0x7f120b63, float:1.9412641E38)
        L_0x005b:
            X.C08310eF.A0C(r1, r14, r0)
        L_0x005e:
            android.widget.TextView r1 = r14.A01
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A0A
            r0 = 2131888993(0x7f120b61, float:1.9412637E38)
            X.C08310eF.A0C(r1, r14, r0)
            android.widget.TextView r4 = r14.A01
            r1 = 12
            X.0w4 r0 = new X.0w4
            r0.<init>(r14, r1)
            r4.setOnClickListener(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.0WN r0 = r0.A0B
            X.0Qy r0 = r0.A01
            X.0Lx r0 = r0.A00()
            if (r0 == 0) goto L_0x00ae
            r14.A1Q(r2)
            r14.A1L()
            return
        L_0x008b:
            r0 = 5
            if (r1 != r0) goto L_0x009c
            android.widget.TextView r1 = r14.A04
            r0 = 2131888996(0x7f120b64, float:1.9412643E38)
            X.C08310eF.A0C(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888994(0x7f120b62, float:1.941264E38)
            goto L_0x005b
        L_0x009c:
            if (r1 == r3) goto L_0x00a0
            if (r1 != r4) goto L_0x005e
        L_0x00a0:
            android.widget.TextView r1 = r14.A04
            r0 = 2131888986(0x7f120b5a, float:1.9412623E38)
            X.C08310eF.A0C(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888985(0x7f120b59, float:1.941262E38)
            goto L_0x005b
        L_0x00ae:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.08M r0 = r0.A04
            X.C06270Wx.A03(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1K() {
        Editable text = this.A06.getText();
        if (text != null) {
            EncBackupViewModel encBackupViewModel = this.A07;
            encBackupViewModel.A05.A0H(Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC));
            this.A07.A0Q();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A1L():void");
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 12345) {
            A1S(i2);
        }
    }
}
