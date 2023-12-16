package com.whatsapp.registration;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass4FV;
import X.AnonymousClass5Yj;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C107575bX;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C24251Wr;
import X.C58422vE;
import X.C620733j;
import X.C626936e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class VerificationCodeBottomSheet extends Hilt_VerificationCodeBottomSheet implements AnonymousClass64B {
    public AnonymousClass33T A00;
    public AnonymousClass33p A01;
    public C620733j A02;
    public AnonymousClass1VX A03;
    public AnonymousClass4FV A04;

    public static VerificationCodeBottomSheet A00(String str) {
        VerificationCodeBottomSheet verificationCodeBottomSheet = new VerificationCodeBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("code", str);
        verificationCodeBottomSheet.A0u(A08);
        return verificationCodeBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        char charAt;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        if (this.A03.A0Y(C58422vE.A02, 3159)) {
            C18300x5.A0G(inflate, R.id.header).setText(R.string.f11nameremoved);
            C18300x5.A0G(inflate, R.id.description).setGravity(17);
            Context A1D = A1D();
            TextView A0G = C18300x5.A0G(inflate, R.id.description);
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = C107575bX.A04(A1D, AnonymousClass5Yj.A02(A1D, R.attr.f3nameremoved, R.color.f5nameremoved));
            A0G.setText(C107575bX.A00(A1D, A0L, R.string.f11nameremoved));
        }
        AnonymousClass0x2.A0y(C06560Yg.A02(inflate, R.id.close_button), this, 36);
        ViewGroup viewGroup2 = (ViewGroup) C06560Yg.A02(inflate, R.id.code_container);
        String string = A0H().getString("code", "");
        C626936e.A0E(!string.isEmpty(), "Invalid code");
        int length = string.length();
        for (int i = 0; i <= length; i++) {
            int i2 = length;
            Context A1D2 = A1D();
            WaTextView waTextView = new WaTextView(A1D2);
            waTextView.setTextAppearance(A1D2, R.style.f12nameremoved);
            if (!C620733j.A04(this.A02)) {
                i2 = 0;
            }
            if (i != i2) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, C18290x4.A0G(waTextView).getDimensionPixelSize(R.dimen.f6nameremoved), 0);
                waTextView.setLayoutParams(layoutParams);
            }
            int i3 = length / 2;
            if (i == i3) {
                charAt = '-';
            } else {
                int i4 = i - 1;
                if (i < i3) {
                    i4 = i;
                }
                if (this.A02.A05().A06) {
                    i4 = (length - i4) - 1;
                }
                charAt = string.charAt(i4);
            }
            waTextView.setText(String.valueOf(charAt));
            viewGroup2.addView(waTextView);
        }
        AnonymousClass33p r3 = this.A01;
        AnonymousClass33T r2 = this.A00;
        C18270x1.A0g(C18270x1.A03(r3), "device_switching_code");
        C18270x1.A0g(C18270x1.A03(r3), "device_switching_code_expiry");
        r2.A05(53, "CodeDisplayed");
        C24251Wr r1 = new C24251Wr();
        r1.A00 = this.A01.A0Y();
        this.A04.BhD(r1);
        return inflate;
    }
}
