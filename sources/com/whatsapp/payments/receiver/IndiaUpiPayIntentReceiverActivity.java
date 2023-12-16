package com.whatsapp.payments.receiver;

import X.AnonymousClass5V0;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9Qp;
import X.C107695bk;
import X.C18280x3;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C1906899l;
import X.C19340zH;
import X.C195179Wl;
import X.C204019og;
import X.C204219p0;
import X.C621433s;
import X.C64333Db;
import X.C88834as;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;

public class IndiaUpiPayIntentReceiverActivity extends AnonymousClass9DA {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        if (i == 10000) {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0U(R.string.f11nameremoved);
            r2.A0T(R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 3;
        } else if (i != 10001) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0U(R.string.f11nameremoved);
            r2.A0T(R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
            i3 = 4;
        }
        C204219p0.A01(r2, this, i3, i2);
        r2.A0i(false);
        return r2.create();
    }

    public IndiaUpiPayIntentReceiverActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 17);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1020) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass9Qp r2 = new AnonymousClass9Qp(this.A0I);
        C195179Wl A002 = C195179Wl.A00(getIntent().getData(), "DEEP_LINK");
        if (!(getIntent().getData() == null || A002 == null)) {
            C1906899l r1 = r2.A00;
            if (r1.A0D()) {
                Uri data = getIntent().getData();
                String obj = data.toString();
                if (obj == null || !obj.startsWith("upi://mandate") || this.A0D.A0X(2211)) {
                    Context applicationContext = getApplicationContext();
                    Intent A07 = C18320x8.A07();
                    A07.setClassName(applicationContext.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity");
                    A07.setData(data);
                    startActivityForResult(A07, 1020);
                    return;
                }
                setResult(0);
            } else {
                boolean A0E = r1.A0E();
                int i = SearchActionVerificationClientService.NOTIFICATION_ID;
                if (A0E) {
                    i = 10001;
                }
                C621433s.A01(this, i);
                return;
            }
        }
        finish();
    }

    public IndiaUpiPayIntentReceiverActivity() {
        this(0);
    }
}
