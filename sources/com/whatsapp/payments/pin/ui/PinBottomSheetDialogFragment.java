package com.whatsapp.payments.pin.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass96z;
import X.AnonymousClass9B1;
import X.AnonymousClass9SH;
import X.AnonymousClass9TR;
import X.AnonymousClass9XA;
import X.C003203q;
import X.C08310eF;
import X.C18300x5;
import X.C1899693i;
import X.C1901093w;
import X.C203139nB;
import X.C204249p3;
import X.C204659pi;
import X.C56612sH;
import X.C620733j;
import X.C86614Ku;
import X.C86654Ky;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.wds.components.button.WDSButton;

public class PinBottomSheetDialogFragment extends Hilt_PinBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public TextView A05;
    public CodeInputField A06;
    public C56612sH A07;
    public C620733j A08;
    public AnonymousClass9TR A09;
    public AnonymousClass9SH A0A;
    public C203139nB A0B;
    public WDSButton A0C;
    public boolean A0D;
    public final AnonymousClass9XA A0E = new AnonymousClass9XA();

    public void A1a() {
        A1P(true);
        this.A02.setVisibility(0);
        this.A04.setVisibility(8);
        this.A06.setEnabled(true);
    }

    public void A1b() {
        A1P(false);
        this.A02.setVisibility(4);
        this.A05.setVisibility(4);
        this.A04.setVisibility(0);
        this.A06.setEnabled(false);
    }

    public void A1c(int i, int i2) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A06.setErrorState(true);
        this.A06.A09();
        TextView textView = this.A05;
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, i);
        textView.setText(this.A08.A0L(objArr, i2, (long) i));
        TextView textView2 = this.A05;
        AnonymousClass0x2.A0q(textView2.getContext(), textView2, R.color.f5nameremoved);
        this.A05.setVisibility(A1Y ? 1 : 0);
    }

    public final void A1d(long j, boolean z) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A00 = j;
        TextView textView = this.A05;
        AnonymousClass0x2.A0q(textView.getContext(), textView, R.color.f5nameremoved);
        this.A05.setVisibility(0);
        this.A06.setErrorState(true);
        this.A06.setEnabled(false);
        if (z) {
            this.A06.A09();
        }
        this.A01 = new C1901093w(this, j - this.A07.A0H()).start();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        int i;
        Window window;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        View findViewById = A0R.findViewById(R.id.subtitle);
        this.A03 = findViewById;
        AnonymousClass9SH r0 = this.A0A;
        if (r0 == null || !(r0 instanceof AnonymousClass9B1)) {
            z = false;
        } else {
            z = true;
        }
        if (findViewById != null) {
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        this.A02 = A0R.findViewById(R.id.pin_text_container);
        this.A04 = (ProgressBar) A0R.findViewById(R.id.progress_bar);
        this.A05 = AnonymousClass002.A09(A0R, R.id.error_text);
        WDSButton A0f = C86654Ky.A0f(A0R, R.id.forgot_pin_button);
        this.A0C = A0f;
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        if (this.A0A != null) {
            String string2 = A0G().getString(R.string.f11nameremoved);
            if (!TextUtils.isEmpty(string2)) {
                string = string2;
            }
        }
        C1899693i.A0l(A0f, this, AnonymousClass000.A1b(string), R.string.f11nameremoved);
        C204249p3.A02(this.A0C, this, 9);
        boolean z2 = this.A0D;
        this.A0D = z2;
        WDSButton wDSButton = this.A0C;
        if (wDSButton != null) {
            wDSButton.setVisibility(C86614Ku.A01(z2 ? 1 : 0));
        }
        CodeInputField codeInputField = (CodeInputField) A0R.findViewById(R.id.code);
        this.A06 = codeInputField;
        codeInputField.A0B(new C204659pi(this, 0), 6, C08310eF.A09(this).getColor(R.color.f5nameremoved));
        ((NumberEntryKeyboard) A0R.findViewById(R.id.number_entry_keyboard)).A06 = this.A06;
        if (this.A0A != null) {
            layoutInflater.inflate(R.layout.f8nameremoved, (ViewGroup) A0R.findViewById(R.id.title_view), true);
            TextView A092 = AnonymousClass002.A09(A0R, R.id.header_text);
            if (this.A0A instanceof AnonymousClass9B1) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
            A092.setText(i);
        }
        return A0R;
    }

    public void A0e() {
        super.A0e();
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            A0Q.setRequestedOrientation(10);
        }
    }

    public void A0f() {
        super.A0f();
        long A002 = this.A09.A00() * 1000;
        if (A002 > this.A07.A0H() || this.A01 != null) {
            A1d(A002, false);
        }
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            A0Q.setRequestedOrientation(1);
        }
    }

    public void A1X(View view) {
        super.A1X(view);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        A012.A0a(new AnonymousClass96z(A012, this));
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }
}
