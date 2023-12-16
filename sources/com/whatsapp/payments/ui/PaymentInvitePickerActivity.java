package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0XL;
import X.AnonymousClass0x7;
import X.AnonymousClass3ZH;
import X.AnonymousClass5QN;
import X.AnonymousClass995;
import X.AnonymousClass9TK;
import X.AnonymousClass9U4;
import X.C133676hl;
import X.C18310x6;
import X.C1901794j;
import X.C200499iQ;
import X.C626936e;
import X.C86604Kt;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PaymentInvitePickerActivity extends AnonymousClass995 {
    public AnonymousClass9U4 A00;
    public C1901794j A01;

    public void A7I() {
        String str;
        ArrayList A0J = AnonymousClass002.A0J(A7F());
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        AnonymousClass9TK r3 = new AnonymousClass9TK(this, this, this.A05, this.A00, this.A01, (Runnable) null, new C200499iQ(this, A0J), false);
        C626936e.A0B(r3.A02());
        if (AnonymousClass9U4.A04(r3.A03) != null) {
            r3.A01(str, A0J, false);
        }
    }

    public Drawable A7B() {
        return AnonymousClass0x7.A0J(this, this.A0N, R.drawable.ic_fab_next);
    }

    public void A7N(AnonymousClass5QN r3, AnonymousClass3ZH r4) {
        super.A7N(r3, r4);
        TextEmojiLabel textEmojiLabel = r3.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.f11nameremoved);
    }

    public void A7U(ArrayList arrayList) {
        ArrayList A0s = AnonymousClass001.A0s();
        super.A7U(A0s);
        if (AnonymousClass9U4.A04(this.A00) != null) {
            List<C133676hl> A0E = AnonymousClass9U4.A03(this.A00).A0E(new int[]{2}, 3);
            HashMap A0t = AnonymousClass001.A0t();
            for (C133676hl r1 : A0E) {
                A0t.put(r1.A05, r1);
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                Object obj = A0t.get(A0R.A0H);
                if (!C86604Kt.A1a(this.A08, A0R) && obj != null) {
                    arrayList.add(A0R);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("extra_multi_invite_picker_title")) {
            setTitle(intent.getIntExtra("extra_multi_invite_picker_title", R.string.f11nameremoved));
        }
        this.A01 = (C1901794j) new AnonymousClass0XL(this).A01(C1901794j.class);
    }

    public int A75() {
        return R.string.f11nameremoved;
    }

    public int A76() {
        return R.string.f11nameremoved;
    }

    public int A77() {
        return R.plurals.f9nameremoved;
    }

    public int A78() {
        return Integer.MAX_VALUE;
    }

    public int A79() {
        return 1;
    }

    public int A7A() {
        return R.string.f11nameremoved;
    }
}
