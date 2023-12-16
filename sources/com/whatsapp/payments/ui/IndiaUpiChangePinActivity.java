package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass34V;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9D8;
import X.C107695bk;
import X.C133686hm;
import X.C133796hx;
import X.C160757oG;
import X.C166557yt;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C196719bd;
import X.C199179gA;
import X.C199189gB;
import X.C199199gC;
import X.C199209gD;
import X.C204019og;
import X.C621433s;
import X.C64333Db;
import X.C88834as;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiChangePinActivity extends AnonymousClass9D8 {
    public ProgressBar A00;
    public TextView A01;
    public C133686hm A02;
    public String A03;
    public boolean A04;
    public final C160757oG A05;

    public void BVC(AnonymousClass34V r12, String str) {
        Integer num;
        C133796hx r0;
        C133686hm r02;
        this.A0S.A07(this.A02, r12, 1);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (r02 = this.A02) != null && r02.A08 != null) {
            this.A03 = AnonymousClass97T.A0c(this);
            this.A05.A02("upi-get-credential");
            C133686hm r03 = this.A02;
            A7g((AnonymousClass99H) r03.A08, str2, r03.A0B, this.A03, C166557yt.A00(r03.A09), 2);
        } else if (r12 != null && !C196719bd.A02(this, "upi-list-keys", r12.A00, true)) {
            if (this.A05.A06("upi-list-keys")) {
                this.A0M.A0D();
                this.A05.A0H(R.string.f11nameremoved, 1);
                AnonymousClass97T.A10(this);
                return;
            }
            C160757oG r3 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("IndiaUpiChangePinActivity: onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0o.append(num);
            A0o.append(" bankAccount: ");
            A0o.append(this.A02);
            A0o.append(" countrydata: ");
            C133686hm r04 = this.A02;
            if (r04 != null) {
                r0 = r04.A08;
            } else {
                r0 = null;
            }
            A0o.append(r0);
            r3.A08("payment-settings", AnonymousClass000.A0X(" failed; ; showErrorAndFinish", A0o), (Throwable) null);
            A7b();
        }
    }

    public Dialog onCreateDialog(int i) {
        int i2;
        int i3;
        String str;
        Runnable runnable;
        this.A01.setVisibility(4);
        this.A00.setVisibility(4);
        int i4 = i;
        switch (i) {
            case 10:
                str = getString(R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                runnable = new C199179gA(this);
                break;
            case 11:
                str = getString(R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                runnable = new C199189gB(this);
                break;
            case 12:
                str = getString(R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                runnable = new C199199gC(this);
                break;
            case 13:
                this.A0M.A0E();
                str = getString(R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                runnable = new C199209gD(this);
                break;
            default:
                return super.onCreateDialog(i);
        }
        return A7W(runnable, str, i4, i3, i2);
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0k(A0I, r2, r1, this);
        }
    }

    public void BbO(AnonymousClass34V r5) {
        this.A0S.A07(this.A02, r5, 7);
        if (r5 == null) {
            this.A05.A06("onSetPin success; showSuccessAndFinish");
            A7I();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = this.A0N.A04(this.A02);
            Box(A0L, 0, R.string.f11nameremoved);
        } else if (!C196719bd.A02(this, "upi-change-mpin", r5.A00, true)) {
            int i = r5.A00;
            int i2 = 10;
            if (i != 11459) {
                i2 = 11;
                if (i != 11468) {
                    i2 = 12;
                    if (i != 11454) {
                        if (i == 11456 || i == 11471) {
                            i2 = 13;
                        } else {
                            this.A05.A06(" onSetPin failed; showErrorAndFinish");
                            A7b();
                            return;
                        }
                    }
                }
            }
            C621433s.A01(this, i2);
        }
    }

    public IndiaUpiChangePinActivity(int i) {
        this.A04 = false;
        C204019og.A00(this, 56);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0o(supportActionBar, this.A01.A0C(R.string.f11nameremoved));
        }
        this.A01 = C18310x6.A0L(this, R.id.payments_upi_pin_setup_desc);
        this.A00 = (ProgressBar) findViewById(R.id.progress);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C133686hm r0 = (C133686hm) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = r0;
        if (r0 != null) {
            this.A02.A08 = (C133796hx) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    public void onResume() {
        super.onResume();
        C160757oG r2 = this.A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onResume with states: ");
        C1899593h.A1I(r2, this.A05, A0o);
        if (!this.A05.A07.contains("upi-get-challenge") && this.A0M.A05().A00 == null) {
            this.A05.A02("upi-get-challenge");
            A7Y();
        } else if (!this.A05.A07.contains("upi-get-challenge")) {
            A7c();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C133796hx r1;
        super.onSaveInstanceState(bundle);
        C133686hm r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C133686hm r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public IndiaUpiChangePinActivity() {
        this(0);
        this.A05 = C160757oG.A00("IndiaUpiChangePinActivity", "payment-settings", "IN");
    }
}
