package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5Yj;
import X.C107385bE;
import X.C107405bG;
import X.C107695bk;
import X.C18280x3;
import X.C18310x6;
import X.C627136h;
import X.C64333Db;
import X.C89644eZ;
import X.C989653x;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.whatsapp.R;

public class About extends C89644eZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public About(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, C627136h.A03);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        int A02 = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        boolean z = !C107405bG.A0D(this);
        if (C107385bE.A02()) {
            C107405bG.A07(this, A02);
            C107405bG.A0C(getWindow(), z);
        } else {
            C107405bG.A07(this, R.color.f5nameremoved);
        }
        if (C107385bE.A05()) {
            C107405bG.A09(this, A02, C18280x3.A00(z ? 1 : 0));
        }
        AnonymousClass001.A0y(this, C18310x6.A0L(this, R.id.version), new Object[]{"2.23.26.14"}, R.string.f11nameremoved);
        TextView A0L = C18310x6.A0L(this, R.id.about_licenses);
        SpannableString spannableString = new SpannableString(getString(R.string.f11nameremoved));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        A0L.setText(spannableString);
        A0L.setOnClickListener(new C989653x(this, 35));
    }

    public About() {
        this(0);
    }
}
