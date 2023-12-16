package com.whatsapp.twofactor;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4HQ;
import X.C08310eF;
import X.C117095rN;
import X.C18290x4;
import X.C18320x8;
import X.C19340zH;
import X.C57002su;
import X.C620633i;
import X.C989753y;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

public class SetEmailFragment extends Hilt_SetEmailFragment {
    public int A00;
    public TextWatcher A01 = new AnonymousClass4HQ(this, 8);
    public Button A02;
    public EditText A03;
    public TextView A04;
    public C620633i A05;
    public AnonymousClass1VX A06;
    public TwoFactorAuthActivity A07;

    public void A0c() {
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A07 = null;
        super.A0c();
    }

    public class ConfirmSkipEmailDialog extends Hilt_SetEmailFragment_ConfirmSkipEmailDialog {
        public Dialog A1J(Bundle bundle) {
            C19340zH A0H = C18320x8.A0H(this);
            A0H.A0T(R.string.f11nameremoved);
            C19340zH.A08(A0H, this, 107, R.string.f11nameremoved);
            C19340zH.A05(A0H);
            return A0H.create();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2 == r4.lastIndexOf(64)) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J() {
        /*
            r6 = this;
            android.widget.Button r5 = r6.A02
            if (r5 == 0) goto L_0x0027
            android.widget.EditText r0 = r6.A03
            java.lang.String r0 = X.C18290x4.A0m(r0)
            java.lang.String r4 = r0.trim()
            r3 = 64
            int r2 = r4.indexOf(r3)
            if (r2 <= 0) goto L_0x0028
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            if (r2 >= r0) goto L_0x0028
            int r0 = r4.lastIndexOf(r3)
            if (r2 != r0) goto L_0x0028
        L_0x0024:
            r5.setEnabled(r1)
        L_0x0027:
            return
        L_0x0028:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetEmailFragment.A1J():void");
    }

    public static SetEmailFragment A00(int i) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
        SetEmailFragment setEmailFragment = new SetEmailFragment();
        setEmailFragment.A0u(A08);
        return setEmailFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0f() {
        String str;
        super.A0f();
        EditText editText = this.A03;
        TextWatcher textWatcher = this.A01;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.A03;
        int i = this.A00;
        TwoFactorAuthActivity twoFactorAuthActivity = this.A07;
        if (i == 1) {
            str = twoFactorAuthActivity.A04;
        } else {
            str = twoFactorAuthActivity.A05;
        }
        editText2.setText(str);
        this.A03.addTextChangedListener(textWatcher);
        A1J();
        this.A03.requestFocus();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A00 = A0H().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        this.A07 = (TwoFactorAuthActivity) A0Q();
        Button button = (Button) view.findViewById(R.id.submit);
        this.A02 = button;
        button.setOnClickListener(new C989753y(this, 39));
        this.A03 = (EditText) view.findViewById(R.id.email);
        this.A04 = AnonymousClass002.A09(view, R.id.error);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.description);
        int i2 = this.A00;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                textEmojiLabel.setText(R.string.f11nameremoved);
                this.A02.setText(R.string.f11nameremoved);
                i = 1;
            }
            i = 0;
        } else {
            if (this.A07.A08[0] != 2) {
                AnonymousClass0x2.A14(this.A06, textEmojiLabel);
                AnonymousClass0x2.A12(textEmojiLabel, this.A05);
                String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
                int A042 = AnonymousClass0Y8.A04(A1D(), C18290x4.A00(A1D()));
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(A1D(), R.style.f12nameremoved);
                C117095rN r2 = new C117095rN(this, 11);
                HashMap A0t = AnonymousClass001.A0t();
                A0t.put("skip", r2);
                textEmojiLabel.setText(C57002su.A00(textAppearanceSpan, string, A0t, A042, false));
            } else {
                textEmojiLabel.setText(R.string.f11nameremoved);
            }
            this.A02.setText(R.string.f11nameremoved);
            i = 0;
        }
        TwoFactorAuthActivity twoFactorAuthActivity = this.A07;
        if (!twoFactorAuthActivity.A77(this) || twoFactorAuthActivity.A08.length == 1) {
            i3 = i;
        }
        twoFactorAuthActivity.A74(view, i3);
    }
}
