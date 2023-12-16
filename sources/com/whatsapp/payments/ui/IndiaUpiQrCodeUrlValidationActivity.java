package com.whatsapp.payments.ui;

import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass5V0;
import X.AnonymousClass94u;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9QD;
import X.AnonymousClass9Qx;
import X.AnonymousClass9WM;
import X.C105655Vw;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C194759Uj;
import X.C203809oL;
import X.C204019og;
import X.C204219p0;
import X.C204629pf;
import X.C620733j;
import X.C621433s;
import X.C64333Db;
import X.C86624Kv;
import X.C88834as;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.whatsapp.R;

public class IndiaUpiQrCodeUrlValidationActivity extends AnonymousClass9DA {
    public C620733j A00;
    public C95814uZ A01;
    public AnonymousClass9Qx A02;
    public AnonymousClass9WM A03;
    public AnonymousClass9QD A04;
    public C194759Uj A05;
    public AnonymousClass94u A06;
    public C105655Vw A07;
    public String A08;
    public boolean A09;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A05 = (C194759Uj) r1.A6Y.get();
            this.A00 = C64333Db.A2t(r2);
            this.A07 = (C105655Vw) r1.A4I.get();
            this.A04 = (AnonymousClass9QD) r1.A6J.get();
            this.A03 = r1.AN7();
            this.A02 = new AnonymousClass9Qx((AnonymousClass1VX) r2.A07.get());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            C621433s.A01(this, 25);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r4;
        int i2;
        int i3;
        if (i == 21) {
            r4 = AnonymousClass5V0.A00(this);
            C86624Kv.A0i(this, r4, new Object[]{getString(R.string.f11nameremoved)}, R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 61;
        } else if (i == 22) {
            r4 = AnonymousClass5V0.A00(this);
            C86624Kv.A0i(this, r4, new Object[]{getString(R.string.f11nameremoved)}, R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 62;
        } else if (i == 40) {
            r4 = AnonymousClass5V0.A00(this);
            C86624Kv.A0i(this, r4, new Object[]{this.A08}, R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 68;
        } else if (i != 41) {
            switch (i) {
                case 24:
                    r4 = AnonymousClass5V0.A00(this);
                    r4.A0U(R.string.f11nameremoved);
                    r4.A0T(R.string.f11nameremoved);
                    C204219p0.A01(r4, this, 63, R.string.f11nameremoved);
                    C204219p0.A00(r4, this, 64, R.string.f11nameremoved);
                    r4.A0i(true);
                    break;
                case 25:
                    Uri parse = Uri.parse(this.A06.A0D().A0F);
                    String string = getString(R.string.f11nameremoved);
                    SpannableString spannableString = new SpannableString(C105655Vw.A00(parse.toString()));
                    Linkify.addLinks(spannableString, 1);
                    r4 = AnonymousClass5V0.A01(this, R.style.f12nameremoved);
                    r4.A0h(string);
                    r4.A0g(spannableString);
                    r4.setNegativeButton(R.string.f11nameremoved, new C204219p0(this, 65));
                    r4.setPositiveButton(R.string.f11nameremoved, new C204219p0(this, 66));
                    r4.A0R(true);
                    r4.A0L(new C204629pf(this, 19));
                    break;
                case 26:
                    r4 = AnonymousClass5V0.A00(this);
                    C86624Kv.A0i(this, r4, new Object[]{this.A08}, R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                    i3 = 67;
                    break;
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            r4 = AnonymousClass5V0.A00(this);
            C86624Kv.A0i(this, r4, new Object[]{this.A08}, R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 69;
        }
        C204219p0.A01(r4, this, i3, i2);
        r4.A0i(false);
        return r4.create();
    }

    public IndiaUpiQrCodeUrlValidationActivity(int i) {
        this.A09 = false;
        C204019og.A00(this, 89);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = C95814uZ.A00.A05(getIntent().getStringExtra("ARG_JID"));
        this.A06 = (AnonymousClass94u) AnonymousClass4L0.A0F(new C203809oL(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"), 1), this).A01(AnonymousClass94u.class);
    }

    public IndiaUpiQrCodeUrlValidationActivity() {
        this(0);
    }
}
