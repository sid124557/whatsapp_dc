package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass273;
import X.AnonymousClass2AT;
import X.AnonymousClass4FS;
import X.C003203q;
import X.C08240dc;
import X.C08310eF;
import X.C117705sM;
import X.C18300x5;
import X.C18700y7;
import X.C57002su;
import X.C613130e;
import X.C620633i;
import X.C626936e;
import X.C69263Wi;
import X.C70043Zq;
import X.C84674Dg;
import X.C85964Ih;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.List;

public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements C84674Dg {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public C69263Wi A04;
    public C620633i A05;
    public C613130e A06;
    public AnonymousClass4FS A07;
    public final Handler A08 = new C18700y7(Looper.getMainLooper(), this);
    public final Runnable A09 = new C70043Zq(this, 44);

    public void A1V() {
        this.A00 = 1;
        this.A04.A0G(0, R.string.f11nameremoved);
        this.A04.A0T(this.A09, 5000);
        C613130e r2 = this.A06;
        Log.i("TwoFactorAuthManager/disableTwoFactorAuth");
        r2.A04("", (String) null);
    }

    public void Bel(int i) {
        if (this.A00 == 1) {
            this.A00 = 0;
            this.A04.A0R(this.A09);
            this.A04.A0T(new C117705sM((Object) this, i, 11), 500);
        }
    }

    public void Bem() {
        if (this.A00 == 1) {
            this.A00 = 3;
            this.A04.A0R(this.A09);
            this.A04.A0T(new C70043Zq(this, 45), 500);
        }
    }

    public void A0e() {
        super.A0e();
        List list = this.A06.A0D;
        C626936e.A0C(list.contains(this));
        list.remove(this);
    }

    public void A0f() {
        super.A0f();
        List list = this.A06.A0D;
        C626936e.A0C(!list.contains(this));
        list.add(this);
    }

    public Dialog A1J(Bundle bundle) {
        Dialog dialog = new Dialog(A0Q());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R.layout.f8nameremoved);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(R.id.nag_text);
        AnonymousClass0x2.A14(this.A02, textEmojiLabel);
        AnonymousClass0x2.A12(textEmojiLabel, this.A05);
        textEmojiLabel.setText(C57002su.A01(new C70043Zq(this, 46), C08310eF.A09(this).getString(R.string.f11nameremoved), "forgot-pin"));
        this.A02 = (TextView) dialog.findViewById(R.id.error);
        this.A03 = (CodeInputField) dialog.findViewById(R.id.code);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, 6, 0);
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved, objArr);
        CodeInputField codeInputField = this.A03;
        codeInputField.A0C(new C85964Ih(this, 0), new AnonymousClass2AT(codeInputField.getContext(), 1), (String) null, string, '*', '*', 6);
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(R.id.progress_bar_code_input_blocked);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new AnonymousClass273(this, 0));
        dialog.getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        return dialog;
    }

    public final void A1W() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            C08240dc A0J = AnonymousClass0x2.A0J(A0Q);
            A0J.A07(this);
            A0J.A07 = 8194;
            A0J.A02();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        int i = this.A00;
        if (i != 2 && i != 4) {
            C18300x5.A1A(this);
        }
    }
}
