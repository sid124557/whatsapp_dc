package com.whatsapp.conversation.conversationrow.googlesearch;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass1n2;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C111095hX;
import X.C19340zH;
import X.C30481mW;
import X.C56492s4;
import X.C624134x;
import X.C626936e;
import X.C66663Mh;
import X.C69263Wi;
import X.C85804Hr;
import X.C89654ea;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public class GoogleSearchDialogFragment extends Hilt_GoogleSearchDialogFragment {
    public C111095hX A00;
    public C69263Wi A01;
    public C66663Mh A02;
    public C56492s4 A03;
    public AnonymousClass4FV A04;
    public AnonymousClass4FS A05;

    public static void A00(C89654ea r4, C66663Mh r5, C624134x r6) {
        if (!(r6 instanceof AnonymousClass1n2) && (r6 instanceof C30481mW) && r5.A08(C66663Mh.A0q)) {
            String A13 = r6.A13();
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("search_query_type", 0);
            A08.putString("search_query_text", A13);
            GoogleSearchDialogFragment googleSearchDialogFragment = new GoogleSearchDialogFragment();
            googleSearchDialogFragment.A0u(A08);
            r4.Boo(googleSearchDialogFragment);
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (!(C111095hX.A02(context) instanceof C89654ea)) {
            C626936e.A0D(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
        }
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        C85804Hr r2 = new C85804Hr(this, 55);
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        AnonymousClass0x2.A0t(r2, A002, R.string.f11nameremoved);
        A002.A0A(R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
