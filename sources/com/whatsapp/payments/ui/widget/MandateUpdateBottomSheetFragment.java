package com.whatsapp.payments.ui.widget;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass38V;
import X.AnonymousClass39Q;
import X.AnonymousClass5Yj;
import X.AnonymousClass94c;
import X.AnonymousClass99L;
import X.AnonymousClass9V1;
import X.AnonymousClass9W2;
import X.AnonymousClass9WN;
import X.C06560Yg;
import X.C08310eF;
import X.C18290x4;
import X.C18300x5;
import X.C195109Vz;
import X.C196629bS;
import X.C197109ca;
import X.C204249p3;
import X.C624034w;
import X.C626936e;
import X.C86654Ky;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class MandateUpdateBottomSheetFragment extends Hilt_MandateUpdateBottomSheetFragment {
    public Button A00;
    public Button A01;
    public LinearLayout A02;
    public TextView A03;
    public C624034w A04;
    public C196629bS A05;
    public C197109ca A06;
    public AnonymousClass94c A07;
    public AnonymousClass9WN A08;
    public AnonymousClass9V1 A09;

    public void A0w(Bundle bundle, View view) {
        int i;
        AnonymousClass39Q r1;
        this.A06.BKC(C18290x4.A0Z(), (Integer) null, "approve_mandate_update_request_prompt", "payment_transaction_details", true);
        this.A07 = (AnonymousClass94c) C18290x4.A0O(this).A01(AnonymousClass94c.class);
        View view2 = view;
        C204249p3.A02(C06560Yg.A02(view2, R.id.close), this, 147);
        String A072 = this.A05.A07();
        if (!TextUtils.isEmpty(A072)) {
            AnonymousClass0x9.A0E(view2, R.id.psp_logo).setImageResource(this.A09.A00(A072, (String) null).A00);
        }
        this.A04 = ((AnonymousClass38V) A0H().getParcelable("transaction")).A00;
        this.A02.setVisibility(0);
        AnonymousClass99L r5 = (AnonymousClass99L) this.A04.A0A;
        AnonymousClass9W2 r0 = r5.A0G;
        C626936e.A06(r0);
        C195109Vz r2 = r0.A0C;
        boolean equals = r2.A09.equals("PENDING");
        TextView textView = this.A03;
        int i2 = R.string.f11nameremoved;
        if (equals) {
            i2 = R.string.f11nameremoved;
        }
        textView.setText(i2);
        long j = r2.A00;
        int i3 = (j > r5.A0G.A01 ? 1 : (j == r5.A0G.A01 ? 0 : -1));
        boolean z = false;
        int i4 = R.string.f11nameremoved;
        if (i3 != 0) {
            z = true;
            i4 = R.string.f11nameremoved;
        }
        String string = C08310eF.A09(this).getString(i4);
        String A042 = this.A08.A04(j);
        LinearLayout linearLayout = this.A02;
        if (z) {
            i = AnonymousClass5Yj.A07(linearLayout);
        } else {
            i = R.color.f5nameremoved;
        }
        linearLayout.addView(A1J(linearLayout, string, A042, i, false));
        boolean equals2 = this.A04.A08.equals(r2.A00());
        int i5 = R.string.f11nameremoved;
        if (equals2) {
            i5 = R.string.f11nameremoved;
        }
        String string2 = C08310eF.A09(this).getString(i5);
        AnonymousClass9WN r3 = this.A08;
        if (r2.A00() != null) {
            r1 = r2.A00();
        } else {
            r1 = this.A04.A08;
        }
        String str = r2.A07;
        if (str == null) {
            str = r5.A0G.A0G;
        }
        String A052 = r3.A05(r1, str);
        LinearLayout linearLayout2 = this.A02;
        linearLayout2.addView(A1J(linearLayout2, string2, A052, AnonymousClass5Yj.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved), true));
        if (!r2.A09.equals("INIT") || !r2.A08.equals("UNKNOWN")) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
            return;
        }
        C204249p3.A02(this.A00, this, 148);
        this.A01.setVisibility(0);
        C204249p3.A02(this.A01, this, 149);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A03 = C18300x5.A0G(A0R, R.id.title);
        this.A02 = C86654Ky.A0N(A0R, R.id.update_mandate_container);
        this.A00 = (Button) C06560Yg.A02(A0R, R.id.positive_button);
        this.A01 = (Button) C06560Yg.A02(A0R, R.id.negative_button);
        return A0R;
    }

    public final View A1J(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        View A0R = AnonymousClass001.A0R(LayoutInflater.from(A0Q()), linearLayout, R.layout.f8nameremoved);
        TextView A0G = C18300x5.A0G(A0R, R.id.left_text);
        TextView A0G2 = C18300x5.A0G(A0R, R.id.right_text);
        A0G.setText(charSequence);
        A0G2.setText(charSequence2);
        if (z) {
            A0G.setTypeface(A0G.getTypeface(), 1);
            A0G2.setTypeface(A0G2.getTypeface(), 1);
        }
        AnonymousClass0x2.A0q(A0G.getContext(), A0G, i);
        AnonymousClass0x2.A0q(A0G2.getContext(), A0G2, i);
        return A0R;
    }
}
