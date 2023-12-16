package com.whatsapp.base;

import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass5NC;
import X.C06200Wq;
import X.C08270df;
import X.C141996wT;
import X.C620733j;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import com.whatsapp.wds.components.button.WDSButton;

public class WaDialogFragment extends Hilt_WaDialogFragment {
    public int A00 = 0;
    public C620733j A01;
    public AnonymousClass1VX A02;
    public AnonymousClass5NC A03;
    public C141996wT A04;

    public void A15(boolean z) {
        AnonymousClass5NC r1 = this.A03;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
        }
        super.A15(z);
    }

    public void A0g() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        super.A0g();
        Dialog dialog = this.A03;
        if (dialog instanceof AnonymousClass043) {
            AnonymousClass043 r2 = (AnonymousClass043) dialog;
            Button button = r2.A00.A0G;
            if (!(button == null || button.getText() == null)) {
                button.setText(button.getText());
            }
            C06200Wq r3 = r2.A00;
            Button button2 = r3.A0E;
            if (!(button2 == null || button2.getText() == null)) {
                button2.setText(button2.getText());
            }
            Button button3 = r3.A0F;
            if (!(button3 == null || button3.getText() == null)) {
                button3.setText(button3.getText());
            }
            Button button4 = r3.A0G;
            if (!(button4 == null || (text3 = button4.getText()) == null)) {
                button4.setContentDescription(text3);
            }
            Button button5 = r3.A0E;
            if (!(button5 == null || (text2 = button5.getText()) == null)) {
                button5.setContentDescription(text2);
            }
            Button button6 = r3.A0F;
            if (!(button6 == null || (text = button6.getText()) == null)) {
                button6.setContentDescription(text);
            }
            View findViewById = r2.findViewById(16908299);
            if (findViewById != null) {
                int i = 5;
                if (A1T()) {
                    i = 3;
                }
                findViewById.setTextDirection(i);
            }
            Button button7 = r3.A0E;
            int i2 = this.A00;
            if (!(button7 instanceof WDSButton) && i2 != 0) {
                AnonymousClass0x2.A0q(A0G(), button7, i2);
            }
            Button button8 = r3.A0G;
            C141996wT r1 = this.A04;
            if ((button8 instanceof WDSButton) && r1 != null) {
                ((WDSButton) button8).setAction(r1);
            }
        }
    }

    public void A1S(C08270df r2, String str) {
        if (!r2.A0t()) {
            A1O(r2, str);
        }
    }

    public boolean A1T() {
        return false;
    }
}
