package com.whatsapp.wabloks.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass49G;
import X.AnonymousClass84O;
import X.C162457s7;
import X.C183538qC;
import X.C197899e3;
import X.C203979oc;
import X.C204149ot;
import X.C34261un;
import X.C44122Ut;
import X.C54522or;
import X.C55742qq;
import X.C60482yd;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;
import java.util.Map;

public class BkActionBottomSheet extends Hilt_BkActionBottomSheet {
    public C44122Ut A00;
    public C54522or A01;
    public C60482yd A02;
    public C183538qC A03;
    public Map A04;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C54522or A012 = this.A02.A01(A0G());
        this.A01 = A012;
        A012.A00(new C204149ot(this, 5), C197899e3.class, this);
        Bundle A0H = A0H();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        TextView A09 = AnonymousClass002.A09(viewGroup2, R.id.bloks_action_sheet_title);
        TextView A092 = AnonymousClass002.A09(viewGroup2, R.id.bloks_action_sheet_description);
        String string = A0H.getString("action_sheet_title", "");
        String string2 = A0H.getString("action_sheet_message", "");
        if (!TextUtils.isEmpty(string)) {
            A09.setVisibility(0);
            A09.setText(A0H.getString("action_sheet_title"));
        }
        if (!TextUtils.isEmpty(string2)) {
            A092.setVisibility(0);
            A092.setText(A0H.getString("action_sheet_message"));
        }
        if (A0H.getBoolean("action_sheet_has_buttons")) {
            boolean z = A0H.getBoolean("action_sheet_has_buttons", false);
            String string3 = A0H.getString("action_sheet_buttons", "");
            if (z) {
                C162457s7.A0J(string3, 0);
                List<AnonymousClass49G> list = (List) ((C55742qq) this.A03.get()).A01(new C34261un(string3), "action_sheet_buttons");
                if (list != null) {
                    for (AnonymousClass49G r3 : list) {
                        TextView textView = (TextView) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
                        textView.setText(AnonymousClass84O.A07(r3.B3p()));
                        textView.setOnClickListener(new C203979oc(r3, 1, this));
                        viewGroup2.addView(textView);
                    }
                }
            }
            A1K();
        }
        return viewGroup2;
    }

    public static BkActionBottomSheet A00(C55742qq r5, String str, String str2, List list) {
        Bundle A08 = AnonymousClass002.A08();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("action_sheet_buttons");
        String A0h = AnonymousClass000.A0h(A0o, list.hashCode());
        A08.putString("action_sheet_buttons", A0h);
        A08.putString("action_sheet_title", str);
        A08.putString("action_sheet_message", str2);
        A08.putBoolean("action_sheet_has_buttons", true);
        C162457s7.A0J(A0h, 0);
        r5.A03(new C34261un(A0h), list, "action_sheet_buttons");
        BkActionBottomSheet bkActionBottomSheet = new BkActionBottomSheet();
        bkActionBottomSheet.A0u(A08);
        return bkActionBottomSheet;
    }
}
