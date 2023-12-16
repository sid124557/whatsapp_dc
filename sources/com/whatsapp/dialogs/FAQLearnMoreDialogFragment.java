package com.whatsapp.dialogs;

import X.AnonymousClass5V0;
import X.AnonymousClass5Y0;
import X.C08310eF;
import X.C107345b9;
import X.C111095hX;
import X.C18310x6;
import X.C19340zH;
import X.C66433Lk;
import X.C85764Hn;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class FAQLearnMoreDialogFragment extends Hilt_FAQLearnMoreDialogFragment {
    public C111095hX A00;
    public AnonymousClass5Y0 A01;
    public C66433Lk A02;

    public static Dialog A00(Context context, C111095hX r11, AnonymousClass5Y0 r12, C66433Lk r13, CharSequence charSequence, String str, String str2, String str3) {
        C85764Hn r3 = new C85764Hn(context, r11, r13, str, str3, 0);
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0g(C107345b9.A05(context, r12, charSequence));
        A002.A0i(true);
        A002.A0X(r3, R.string.f11nameremoved);
        A002.setNegativeButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        String str4 = str2;
        if (str2 != null) {
            A002.setTitle(C107345b9.A05(context, r12, str4));
        }
        return A002.create();
    }

    public Dialog A1J(Bundle bundle) {
        String A0k;
        String str;
        A0H();
        String A0k2 = C18310x6.A0k(A0H(), "faq_id");
        if (this.A06.containsKey("message_string_res_id")) {
            A0k = C08310eF.A09(this).getString(this.A06.getInt("message_string_res_id"));
        } else {
            A0k = C18310x6.A0k(A0H(), "message_text");
        }
        String str2 = null;
        if (this.A06.containsKey("title_string_res_id")) {
            str = C08310eF.A09(this).getString(this.A06.getInt("title_string_res_id"));
        } else {
            str = null;
        }
        if (this.A06.containsKey("faq_section_name")) {
            str2 = this.A06.getString("faq_section_name");
        }
        return A00(A0G(), this.A00, this.A01, this.A02, A0k, A0k2, str, str2);
    }
}
