package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass5Vo;
import X.AnonymousClass9Ba;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C18300x5;
import X.C191119Cg;
import X.C204249p3;
import X.C204409pJ;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public class IndiaUpiPaymentsValuePropsBottomSheetActivity extends C191119Cg {

    public class BottomSheetValuePropsFragment extends WDSBottomSheetDialogFragment {
        public void A1W(AnonymousClass5Vo r3) {
            r3.A00.A06 = false;
        }

        public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
            View A02 = C06560Yg.A02(inflate, R.id.close);
            AnonymousClass9Ba r3 = (AnonymousClass9Ba) A0Q();
            if (r3 != null) {
                C204409pJ.A00(A02, r3, this, 17);
                TextView A0G = C18300x5.A0G(inflate, R.id.value_props_sub_title);
                View A022 = C06560Yg.A02(inflate, R.id.value_props_contact_img);
                TextSwitcher textSwitcher = (TextSwitcher) C06560Yg.A02(inflate, R.id.value_props_desc);
                TextView A0G2 = C18300x5.A0G(inflate, R.id.value_props_continue);
                if (r3.A02 == 2) {
                    A0G2.setText(R.string.f11nameremoved);
                    A022.setVisibility(8);
                    A0G.setText(R.string.f11nameremoved);
                    textSwitcher.setText(C08310eF.A09(this).getString(R.string.f11nameremoved));
                    r3.A7Z((Long) null);
                    if (r3.A0F != null) {
                        r3.A0S.A0A(AnonymousClass001.A0f(), 55, "chat", r3.A02, r3.A0i, r3.A0h, AnonymousClass000.A1U(r3.A02, 11));
                    }
                } else {
                    r3.A7Y(textSwitcher);
                    if (r3.A02 == 11) {
                        A0G.setText(R.string.f11nameremoved);
                        C86604Kt.A1E(inflate, R.id.value_props_sub_title_2, 0);
                    }
                }
                C204249p3.A02(A0G2, r3, 81);
            }
            return inflate;
        }

        public void A0d() {
            super.A0d();
            C003203q A0Q = A0Q();
            if (A0Q instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
                ((AnonymousClass9Ba) A0Q).A7X();
            }
            C18300x5.A1A(this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Boo(new BottomSheetValuePropsFragment());
    }
}
