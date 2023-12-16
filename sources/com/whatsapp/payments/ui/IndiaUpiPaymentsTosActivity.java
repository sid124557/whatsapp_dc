package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass2Oi;
import X.AnonymousClass34V;
import X.AnonymousClass4EY;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.AnonymousClass5VI;
import X.AnonymousClass5Yj;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9ER;
import X.AnonymousClass9TD;
import X.AnonymousClass9VW;
import X.AnonymousClass9g1;
import X.C106715a2;
import X.C107695bk;
import X.C134246ig;
import X.C151007Tb;
import X.C153607bd;
import X.C160757oG;
import X.C165897xo;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C194979Vj;
import X.C196719bd;
import X.C197109ca;
import X.C199369gT;
import X.C199379gU;
import X.C199389gV;
import X.C204019og;
import X.C204219p0;
import X.C204249p3;
import X.C204409pJ;
import X.C620933l;
import X.C64223Cq;
import X.C64333Db;
import X.C88834as;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Objects;

public class IndiaUpiPaymentsTosActivity extends AnonymousClass9DA implements AnonymousClass4EY {
    public C151007Tb A00;
    public C196719bd A01;
    public AnonymousClass9TD A02;
    public AnonymousClass9ER A03;
    public C106715a2 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C134246ig A08;
    public final C160757oG A09;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
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
            this.A04 = C1899593h.A0V(r1);
            this.A02 = (AnonymousClass9TD) r2.APi.get();
            this.A01 = C1899693i.A0H(r1);
            this.A03 = AnonymousClass97T.A0Z(r1);
        }
    }

    public final void A7V(int i) {
        this.A03.A00.A0E(3);
        this.A0S.reset();
        this.A02.A01();
        this.A09.A0A("showErrorAndFinish", (Throwable) null);
        findViewById(R.id.progress).setVisibility(4);
        AnonymousClass9VW A042 = this.A01.A04((C153607bd) null, i);
        if (A042.A00 != 0) {
            AnonymousClass9VW.A00(this, A042).A1O(getSupportFragmentManager(), (String) null);
        } else {
            Bot(R.string.f11nameremoved);
        }
    }

    public void Ba4(AnonymousClass34V r4) {
        C160757oG r2 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("got request error for accept-tos: ");
        r2.A05(AnonymousClass000.A0h(A0o, r4.A00));
        A7V(r4.A00);
    }

    public void BaB(AnonymousClass34V r4) {
        C160757oG r2 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("got response error for accept-tos: ");
        C1899593h.A1K(r2, A0o, r4.A00);
        A7V(r4.A00);
    }

    public void BaC(AnonymousClass2Oi r5) {
        C160757oG r2 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("got response for accept-tos: ");
        C1899593h.A1L(r2, A0o, r5.A02);
        if (!C18280x3.A1W(this.A0P.A03(), "payment_usync_triggered")) {
            AnonymousClass4FS r22 = this.A04;
            C64223Cq r1 = this.A05;
            Objects.requireNonNull(r1);
            r22.BkM(new AnonymousClass9g1(r1));
            C18270x1.A0l(C620933l.A00(this.A0P), "payment_usync_triggered", true);
        }
        if (!this.A00.A03.equals("tos_no_wallet")) {
            return;
        }
        if (r5.A00) {
            this.A03.A00.A0E(3);
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0T(R.string.f11nameremoved);
            C204219p0.A01(A002, this, 54, R.string.f11nameremoved);
            A002.A0S();
            return;
        }
        C165897xo A042 = this.A0P.A04();
        if (A042 != null) {
            String str = A042.A02;
            if (!TextUtils.isEmpty(str) && str.startsWith("tos_upgrade_step_up")) {
                this.A0P.A0A();
            }
        }
        this.A0I.A08(this.A00);
        setResult(-1);
        if (this.A05) {
            Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A7O(A082);
            A082.putExtra("extra_previous_screen", "tos_page");
            AnonymousClass5VI.A00(A082, "tosAccept");
            A6T(A082, true);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (this.A07) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        C134246ig r1 = this.A08;
        r1.A07 = C18290x4.A0a();
        r1.A08 = AnonymousClass001.A0f();
        AnonymousClass97T.A0t(r1, this);
        AnonymousClass97T.A11(this.A03);
    }

    public IndiaUpiPaymentsTosActivity(int i) {
        this.A06 = false;
        C204019og.A00(this, 79);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_img);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        C134246ig r3;
        Boolean bool;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A00 = this.A0I.A01(stringExtra);
                this.A05 = true;
            } else {
                this.A00 = this.A0I.A01("tos_no_wallet");
            }
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView((int) R.layout.f8nameremoved);
        A7L(R.string.f11nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved), R.id.scroll_view);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        TextView A0L = C18310x6.A0L(this, R.id.title);
        if (getIntent() == null || !getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            A0L.setText(R.string.f11nameremoved);
            r3 = this.A08;
            bool = Boolean.FALSE;
        } else {
            this.A07 = true;
            A0L.setText(R.string.f11nameremoved);
            r3 = this.A08;
            bool = Boolean.TRUE;
        }
        r3.A01 = bool;
        C204249p3.A02(findViewById(R.id.learn_more), this, 79);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.payments_tos_desc);
        String[] strArr = new String[3];
        AnonymousClass0x7.A1E(this.A03.A00("https://www.whatsapp.com/legal/payments/india/terms"), strArr, 0);
        AnonymousClass0x7.A1E(this.A03.A00("https://www.whatsapp.com/legal/payments/india/privacy-policy"), strArr, 1);
        strArr[2] = C1899693i.A0c(this.A03, "https://www.whatsapp.com/legal/payments/india/psp");
        SpannableString A042 = this.A04.A04(textEmojiLabel.getContext(), getString(R.string.f11nameremoved), new Runnable[]{new C199369gT(this), new C199379gU(this), new C199389gV(this)}, new String[]{"terms", "privacy-policy", "payment-provider-terms"}, strArr);
        AnonymousClass0x2.A12(textEmojiLabel, this.A08);
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
        textEmojiLabel.setText(A042);
        View findViewById = findViewById(R.id.payments_tos_continue);
        findViewById.setOnClickListener(new C204409pJ((Object) findViewById, 16, (Object) this));
        C160757oG r2 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onCreate step: ");
        C1899593h.A1I(r2, this.A00, A0o);
        C197109ca r1 = this.A0S;
        r1.reset();
        r3.A0b = "tos_page";
        C1899593h.A1B(r3, 0);
        r3.A0Y = this.A0b;
        r3.A0a = this.A0e;
        r1.BKA(r3);
        if (C1899693i.A0w(this.A0D)) {
            this.A0Y = C1899593h.A0P(this);
        }
        onConfigurationChanged(AnonymousClass001.A0M(this));
        this.A0P.A0B();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0P.A0K(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C134246ig r1 = this.A08;
            r1.A07 = C18290x4.A0a();
            r1.A08 = AnonymousClass001.A0f();
            AnonymousClass97T.A0t(r1, this);
            AnonymousClass97T.A11(this.A03);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("extra_show_updated_tos");
    }

    public void onResume() {
        super.onResume();
        this.A03.A00.A0B("tosShown");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A07);
    }

    public IndiaUpiPaymentsTosActivity() {
        this(0);
        this.A00 = C194979Vj.A05;
        this.A05 = false;
        this.A07 = false;
        this.A08 = new C134246ig();
        this.A09 = C160757oG.A00("IndiaUpiPaymentsTosActivity", "onboarding", "IN");
    }
}
