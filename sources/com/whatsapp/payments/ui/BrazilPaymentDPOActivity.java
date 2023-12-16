package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass9Y8;
import X.C005205m;
import X.C107575bX;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1905197d;
import X.C191539Fh;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C88834as;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrazilPaymentDPOActivity extends C1905197d {
    public C191539Fh A00;
    public List A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A00 = (C191539Fh) A0I.A0D.get();
        }
    }

    public BrazilPaymentDPOActivity(int i) {
        this.A02 = false;
        C204019og.A00(this, 31);
    }

    public void A74() {
        super.A74();
        C005205m.A00(this, R.id.warning).setVisibility(8);
        this.A05.setVisibility(8);
        C005205m.A00(this, R.id.conditions_container).setVisibility(0);
        TextView textView = (TextView) C005205m.A00(this, R.id.condition_relocated_checkbox);
        textView.setText(R.string.f11nameremoved);
        TextView textView2 = (TextView) C005205m.A00(this, R.id.condition_travelled_checkbox);
        textView2.setText(R.string.f11nameremoved);
        TextView textView3 = (TextView) C005205m.A00(this, R.id.condition_foreign_method_checkbox);
        textView3.setText(R.string.f11nameremoved);
        Object[] objArr = new CheckBox[3];
        C18280x3.A19(textView, textView2, objArr);
        objArr[2] = textView3;
        List<TextView> asList = Arrays.asList(objArr);
        this.A01 = asList;
        C191539Fh r2 = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        for (TextView text : asList) {
            A0s.add(text.getText().toString());
        }
        r2.A06.A03("list_of_conditions", C107575bX.A09("|", (CharSequence[]) A0s.toArray(new String[0])));
        for (CompoundButton onCheckedChangeListener : this.A01) {
            onCheckedChangeListener.setOnCheckedChangeListener(new AnonymousClass9Y8(this));
        }
        C204249p3.A02(this.A01, this, 19);
    }

    public BrazilPaymentDPOActivity() {
        this(0);
    }
}
