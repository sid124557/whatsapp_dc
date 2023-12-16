package com.whatsapp.payments.ui;

import X.AnonymousClass303;
import X.AnonymousClass6C9;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XA;
import X.C08310eF;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C1891290c;
import X.C203499no;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

public final class BrazilContentCopiedBottomSheet extends Hilt_BrazilContentCopiedBottomSheet {
    public AnonymousClass9XA A00 = new AnonymousClass9XA();
    public C203499no A01;
    public String A02;
    public boolean A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        Bundle A0H = A0H();
        this.A02 = A0H.getString("referral_screen");
        this.A03 = A0H.getBoolean("should_log_event");
        A1e(0, (Integer) null);
        return super.A0K(bundle, layoutInflater, viewGroup);
    }

    public View.OnClickListener A1b() {
        return new C1891290c(this, 0);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        this.A00.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A00.onDismiss(dialogInterface);
    }

    public int A1a() {
        return 0;
    }

    public final void A1e(int i, Integer num) {
        if (this.A03) {
            AnonymousClass303 A0W = AnonymousClass6C9.A0W();
            A0W.A03("payment_method", "pix");
            String str = this.A02;
            C203499no r3 = this.A01;
            if (r3 != null) {
                AnonymousClass9Wg.A02(A0W, r3, num, "pix_payment_instructions_prompt", str, i);
                return;
            }
            throw C18270x1.A0S("fieldStatEventLogger");
        }
    }

    public View A1c() {
        View inflate = LayoutInflater.from(A0G()).inflate(R.layout.f8nameremoved, new FrameLayout(A0G()));
        C162457s7.A0D(inflate);
        C18280x3.A0F(inflate, R.id.title).setText(R.string.f11nameremoved);
        return inflate;
    }

    public String A1d() {
        return C08310eF.A09(this).getString(R.string.f11nameremoved);
    }
}
