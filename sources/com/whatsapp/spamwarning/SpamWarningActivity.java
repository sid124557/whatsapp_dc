package com.whatsapp.spamwarning;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4F2;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C109455ee;
import X.C111095hX;
import X.C18260x0;
import X.C18280x3;
import X.C18310x6;
import X.C18680y5;
import X.C29411im;
import X.C627736r;
import X.C64143Cg;
import X.C64333Db;
import X.C66433Lk;
import X.C89644eZ;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class SpamWarningActivity extends C89644eZ {
    public int A00;
    public AnonymousClass4F2 A01;
    public C29411im A02;
    public C66433Lk A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = C64333Db.A8X(A002);
            this.A02 = (C29411im) A002.AcJ.get();
        }
    }

    public void onDestroy() {
        AnonymousClass4F2 r1 = this.A01;
        if (r1 != null) {
            this.A02.A07(r1);
            this.A01 = null;
        }
        super.onDestroy();
    }

    public SpamWarningActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 119);
    }

    public void onBackPressed() {
        super.onBackPressed();
        C111095hX.A06(this);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SpamWarningActivity started with code ");
        A0o.append(intExtra);
        A0o.append(" and expiry (in seconds) ");
        C18260x0.A1G(A0o, this.A00);
        switch (intExtra) {
            case 101:
                i = R.string.f11nameremoved;
                break;
            case 102:
                i = R.string.f11nameremoved;
                break;
            case 103:
                i = R.string.f11nameremoved;
                break;
            case 104:
                i = R.string.f11nameremoved;
                break;
            case 106:
                i = R.string.f11nameremoved;
                break;
            default:
                int i2 = this.A00;
                i = R.string.f11nameremoved;
                if (i2 == -1) {
                    i = R.string.f11nameremoved;
                    break;
                }
                break;
        }
        findViewById(R.id.btn_spam_warning_learn_more).setOnClickListener(new C109455ee(11, stringExtra2, this));
        TextView A0L = C18310x6.A0L(this, R.id.spam_warning_info_textview);
        if (stringExtra == null || stringExtra.isEmpty()) {
            A0L.setText(i);
        } else {
            A0L.setText(stringExtra);
        }
        if (this.A00 == -1) {
            Log.d("unknown expiry time.");
            C18280x3.A0r(this, R.id.progress_bar, 8);
            if (AnonymousClass000.A1U(this.A02.A04, 2) || this.A02.A04 == 1) {
                startActivity(C627736r.A02(this));
                finish();
                return;
            }
            C64143Cg r1 = new C64143Cg(this);
            this.A01 = r1;
            this.A02.A08(r1);
            return;
        }
        C18280x3.A0r(this, R.id.spam_warning_generic_data_connection_missing_textview, 8);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0I = true;
        circularProgressBar.setMax(this.A00 * 1000);
        new C18680y5(circularProgressBar, this, (long) (this.A00 * 1000)).start();
    }

    public SpamWarningActivity() {
        this(0);
    }
}
