package com.whatsapp.status.posting;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3FH;
import X.AnonymousClass485;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.AnonymousClass67S;
import X.C08310eF;
import X.C1235268t;
import X.C18330xA;
import X.C19340zH;
import X.C49712gy;
import X.C620233e;
import X.C620733j;
import X.C86604Kt;
import X.C86654Ky;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class FirstStatusConfirmationDialogFragment extends Hilt_FirstStatusConfirmationDialogFragment implements AnonymousClass485 {
    public TextView A00;
    public C49712gy A01;
    public AnonymousClass3FH A02;
    public C620233e A03;
    public AnonymousClass4FS A04;

    public final Spanned A1U() {
        String string;
        int size;
        C620733j r1;
        int i;
        int A022 = this.A03.A02();
        if (A022 != 0) {
            if (A022 == 1) {
                size = this.A03.A07().size();
                r1 = this.A01;
                i = R.plurals.f9nameremoved;
            } else if (A022 == 2) {
                size = this.A03.A08().size();
                if (size != 0) {
                    r1 = this.A01;
                    i = R.plurals.f9nameremoved;
                }
            } else {
                throw AnonymousClass001.A0e("unknown status distribution mode");
            }
            string = C86604Kt.A0q(r1, size, 0, i);
            SpannableStringBuilder A002 = C18330xA.A00(string);
            SpannableStringBuilder A003 = C18330xA.A00(C08310eF.A09(this).getString(R.string.f11nameremoved));
            A003.setSpan(new AnonymousClass67S(this, 2), 0, A003.length(), 33);
            A002.append(" ");
            A002.append(A003);
            return A002;
        }
        string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        SpannableStringBuilder A0022 = C18330xA.A00(string);
        SpannableStringBuilder A0032 = C18330xA.A00(C08310eF.A09(this).getString(R.string.f11nameremoved));
        A0032.setSpan(new AnonymousClass67S(this, 2), 0, A0032.length(), 33);
        A0022.append(" ");
        A0022.append(A0032);
        return A0022;
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 0) {
            this.A00.setText(A1U());
        }
    }

    public Dialog A1J(Bundle bundle) {
        View A0F = C86604Kt.A0F(A0Q().getLayoutInflater(), R.layout.f8nameremoved);
        TextView A09 = AnonymousClass002.A09(A0F, R.id.text);
        this.A00 = A09;
        A09.setText(A1U());
        C86654Ky.A1E(this.A00);
        C19340zH A022 = AnonymousClass5V0.A02(A0Q(), A0F);
        A022.A0i(true);
        C1235268t.A03(A022, this, 127, R.string.f11nameremoved);
        C1235268t.A04(A022, this, 128, R.string.f11nameremoved);
        return A022.create();
    }
}
