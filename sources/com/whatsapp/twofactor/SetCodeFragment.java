package com.whatsapp.twofactor;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.C08310eF;
import X.C18260x0;
import X.C18280x3;
import X.C49842hB;
import X.C56972sr;
import X.C58422vE;
import X.C613130e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

public class SetCodeFragment extends Hilt_SetCodeFragment {
    public int A00;
    public Button A01;
    public TextView A02;
    public CodeInputField A03;
    public C56972sr A04;
    public AnonymousClass33p A05;
    public C49842hB A06;
    public AnonymousClass1VX A07;
    public TwoFactorAuthActivity A08;
    public C613130e A09;

    public static /* synthetic */ void A00(SetCodeFragment setCodeFragment) {
        TwoFactorAuthActivity twoFactorAuthActivity;
        C08310eF r0;
        int i = setCodeFragment.A00;
        boolean z = true;
        if (i == 1) {
            twoFactorAuthActivity = setCodeFragment.A08;
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 2);
            r0 = new SetCodeFragment();
            r0.A0u(A082);
        } else if (i == 2) {
            twoFactorAuthActivity = setCodeFragment.A08;
            if (twoFactorAuthActivity.A77(setCodeFragment)) {
                if (!setCodeFragment.A06.A00() || !setCodeFragment.A07.A0Y(C58422vE.A02, 5156) || C18280x3.A1W(AnonymousClass0x2.A0F(setCodeFragment.A05), "settings_verification_email_address_verified")) {
                    z = false;
                }
                C18260x0.A1E("SetCodeFragment/shouldShowAddEmailActivity : ", AnonymousClass001.A0o(), z);
                setCodeFragment.A08.A76(z);
                return;
            }
            r0 = SetEmailFragment.A00(1);
        } else {
            return;
        }
        twoFactorAuthActivity.A75(r0, true);
    }

    public final void A1J() {
        String str;
        if (this.A01 != null) {
            boolean z = true;
            if (this.A00 != 1 ? (str = this.A08.A02) == null || !str.contentEquals(this.A03.getCode()) : this.A03.getCode().length() != 6) {
                z = false;
            }
            this.A01.setEnabled(z);
        }
    }

    public final boolean A1K(CharSequence charSequence) {
        this.A02.setText("");
        if (charSequence.length() == 6) {
            int i = this.A00;
            if (i != 1) {
                if (i == 2) {
                    String str = this.A08.A02;
                    if (str == null || !str.contentEquals(this.A03.getCode())) {
                        this.A02.setText(R.string.f11nameremoved);
                    }
                }
                this.A03.requestFocus();
            }
            return true;
        }
        return false;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        this.A08 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A08.A77(r5) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f() {
        /*
            r5 = this;
            super.A0f()
            int r0 = r5.A00
            r4 = 2
            if (r0 != r4) goto L_0x0011
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A08
            boolean r0 = r0.A77(r5)
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.widget.Button r1 = r5.A01
            r0 = 2131891152(0x7f1213d0, float:1.9417016E38)
            if (r2 == 0) goto L_0x001c
            r0 = 2131894531(0x7f122103, float:1.942387E38)
        L_0x001c:
            r1.setText(r0)
            android.widget.Button r0 = r5.A01
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            X.1VX r2 = r5.A07
            r1 = 5711(0x164f, float:8.003E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = -2
            if (r1 == 0) goto L_0x0033
            r0 = -1
        L_0x0033:
            r3.width = r0
            int r0 = r5.A00
            if (r0 != r4) goto L_0x004d
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r5.A08
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x004d
            com.whatsapp.CodeInputField r0 = r5.A03
            r0.setCode(r1)
            com.whatsapp.CodeInputField r0 = r5.A03
            java.lang.String r0 = r0.getCode()
            r5.A1K(r0)
        L_0x004d:
            r5.A1J()
            com.whatsapp.CodeInputField r0 = r5.A03
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0f():void");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A00 = A0H().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r16, android.view.View r17) {
        /*
            r15 = this;
            X.03q r0 = r15.A0Q()
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r0
            r15.A08 = r0
            r0 = 2131434077(0x7f0b1a5d, float:1.8489958E38)
            r4 = r17
            android.view.View r2 = r4.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r15.A01 = r2
            r1 = 38
            X.53y r0 = new X.53y
            r0.<init>(r15, r1)
            r2.setOnClickListener(r0)
            r0 = 2131429875(0x7f0b09f3, float:1.8481435E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r4, r0)
            r15.A02 = r0
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            android.view.View r0 = r4.findViewById(r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r15.A03 = r0
            r6 = 2
            X.2AT r9 = new X.2AT
            r9.<init>(r15, r6)
            r5 = 2131886188(0x7f12006c, float:1.9406948E38)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r14 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 0
            java.lang.String r11 = X.AnonymousClass0x7.A0n(r15, r1, r0, r2, r5)
            com.whatsapp.CodeInputField r7 = r15.A03
            X.4Ih r8 = new X.4Ih
            r8.<init>(r15, r3)
            r12 = 42
            r10 = 0
            r13 = r12
            r7.A0C(r8, r9, r10, r11, r12, r13, r14)
            int r0 = r15.A00
            if (r0 == r3) goto L_0x008c
            if (r0 == r6) goto L_0x007f
            r1 = 2131894536(0x7f122108, float:1.942388E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r15)
            java.lang.String r1 = r0.getString(r1)
        L_0x0068:
            r5 = 0
        L_0x0069:
            r0 = 2131428804(0x7f0b05c4, float:1.8479263E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r4, r0)
            r0.setText(r1)
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r15.A08
            int[] r0 = r1.A08
            int r0 = r0.length
            if (r0 != r3) goto L_0x007b
            r2 = r5
        L_0x007b:
            r1.A74(r4, r2)
            return
        L_0x007f:
            r1 = 2131894506(0x7f1220ea, float:1.9423819E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r15)
            java.lang.String r1 = r0.getString(r1)
            r5 = 1
            goto L_0x0069
        L_0x008c:
            r0 = 2131894502(0x7f1220e6, float:1.942381E38)
            java.lang.String r1 = X.C18310x6.A0m(r15, r1, r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0w(android.os.Bundle, android.view.View):void");
    }
}
