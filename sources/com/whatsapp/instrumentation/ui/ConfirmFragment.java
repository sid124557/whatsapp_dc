package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass48E;
import X.AnonymousClass5BC;
import X.AnonymousClass5X8;
import X.C635439q;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ConfirmFragment extends Hilt_ConfirmFragment {
    public AnonymousClass5X8 A00;
    public AnonymousClass1VX A01;
    public AnonymousClass48E A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        TextView A09;
        int i2;
        C635439q.A00(view.findViewById(R.id.instrumentation_auth_complete_button), this, 46);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("content_variant");
        } else {
            i = 0;
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_one);
        if (A092 != null) {
            A092.setText(R.string.f11nameremoved);
        }
        TextView A093 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_one_body);
        if (A093 != null) {
            A093.setText(R.string.f11nameremoved);
        }
        TextView A094 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_two);
        if (A094 != null) {
            A094.setText(R.string.f11nameremoved);
        }
        TextView A095 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_three);
        if (A095 != null) {
            A095.setText(R.string.f11nameremoved);
        }
        if (i == 2 || i == 1) {
            TextView A096 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_two_body);
            if (A096 != null) {
                int i3 = R.string.f11nameremoved;
                if (i == 2) {
                    i3 = R.string.f11nameremoved;
                }
                A096.setText(i3);
            }
            TextView A097 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_three_body);
            if (A097 != null) {
                A097.setText(R.string.f11nameremoved);
            }
            String obj = this.A00.A00("https://faq.whatsapp.com/836703167795647").toString();
            TextView A098 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_link);
            if (A098 != null) {
                A098.setText(R.string.f11nameremoved);
                AnonymousClass5BC.A00(A098, this.A01, AnonymousClass000.A1b(obj), R.string.f11nameremoved);
            }
            A09 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_button);
            if (A09 != null) {
                i2 = R.string.f11nameremoved;
            } else {
                return;
            }
        } else {
            TextView A099 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_two_body);
            if (A099 != null) {
                A099.setText(R.string.f11nameremoved);
            }
            TextView A0910 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_bullet_three_body);
            if (A0910 != null) {
                A0910.setText(R.string.f11nameremoved);
            }
            String obj2 = this.A00.A00("https://faq.whatsapp.com/general/security-and-privacy/how-to-use-whatsapp-on-ray-ban-stories/").toString();
            TextView A0911 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_link);
            if (A0911 != null) {
                A0911.setText(R.string.f11nameremoved);
                AnonymousClass5BC.A00(A0911, this.A01, new Object[]{obj2}, R.string.f11nameremoved);
            }
            A09 = AnonymousClass002.A09(view, R.id.instrumentation_auth_complete_button);
            if (A09 != null) {
                i2 = R.string.f11nameremoved;
            } else {
                return;
            }
        }
        A09.setText(i2);
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass48E) {
            this.A02 = (AnonymousClass48E) context;
        }
    }
}
