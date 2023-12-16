package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C106715a2;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C50102hd;
import X.C52282lE;
import X.C614930z;
import X.C634239e;
import X.C64333Db;
import X.C69963Zi;
import X.C89644eZ;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CompanionPostLogoutActivity extends C89644eZ {
    public C614930z A00;
    public C52282lE A01;
    public C50102hd A02;
    public C106715a2 A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = C18280x3.A0Q(r1);
            this.A00 = C64333Db.A0E(A002);
            this.A02 = (C50102hd) r1.A50.get();
            this.A01 = (C52282lE) A002.A5z.get();
        }
    }

    public CompanionPostLogoutActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 46);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        boolean A06 = this.A00.A06();
        if (A06) {
            if (!TextUtils.isEmpty(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "account_switching_logged_out_phone_number"))) {
                AnonymousClass001.A0y(this, C18310x6.A0L(this, R.id.post_logout_title), new Object[]{this.A00.A0I(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "account_switching_logged_out_phone_number"))}, R.string.f11nameremoved);
            } else {
                Log.e("CompanionPostLogoutActivity/init/LoggedOutPhoneNumber is null or empty");
            }
        }
        TextView A0L = C18310x6.A0L(this, R.id.post_logout_text_2);
        A0L.setText(this.A03.A05(A0L.getContext(), C69963Zi.A00(this, 27), AnonymousClass002.A0F(this, "contact-help", new Object[1], 0, R.string.f11nameremoved), "contact-help"));
        C18270x1.A0q(A0L, this.A0D);
        findViewById(R.id.continue_button).setOnClickListener(new C634239e(0, this, A06));
    }

    public CompanionPostLogoutActivity() {
        this(0);
    }
}
