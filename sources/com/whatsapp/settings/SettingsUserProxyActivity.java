package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass3Ci;
import X.AnonymousClass3DZ;
import X.AnonymousClass4F2;
import X.AnonymousClass5Yj;
import X.AnonymousClass693;
import X.C005205m;
import X.C107405bG;
import X.C107575bX;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C124266Bp;
import X.C18290x4;
import X.C385528d;
import X.C56312rm;
import X.C60962zS;
import X.C620633i;
import X.C634139d;
import X.C64333Db;
import X.C69263Wi;
import X.C71293bs;
import X.C85844Hv;
import X.C89644eZ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.concurrent.Executor;

public class SettingsUserProxyActivity extends C89644eZ implements AnonymousClass4F2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SwitchCompat A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public SettingsUserProxyViewModel A09;
    public boolean A0A;

    public final void A74(Intent intent) {
        if (intent == null || intent.getBooleanExtra("intent_proxy_has_changed", true)) {
            this.A09.A0F();
            SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
            if (settingsUserProxyViewModel.A0F.A00.A05() && settingsUserProxyViewModel.A02 != null) {
                settingsUserProxyViewModel.A0E();
            }
            if (!this.A05.isChecked()) {
                this.A05.setChecked(true);
            }
        }
    }

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public final void A75(boolean z) {
        int i;
        int i2;
        if (this.A02 != 0 && this.A00 != 0 && this.A03 != 0 && !this.A09.A0H()) {
            SpannableString spannableString = new SpannableString(this.A07.getText());
            SpannableString spannableString2 = new SpannableString(this.A06.getText());
            if (z) {
                i = this.A03;
            } else {
                i = this.A00;
            }
            spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 0);
            if (z) {
                i2 = this.A02;
            } else {
                i2 = this.A00;
            }
            spannableString2.setSpan(new ForegroundColorSpan(i2), 0, spannableString2.length(), 0);
            this.A07.setText(spannableString);
            this.A06.setText(spannableString2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A09 = (SettingsUserProxyViewModel) AnonymousClass0x9.A0H(this).A01(SettingsUserProxyViewModel.class);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        boolean A2I = AnonymousClass1Hf.A2I(this);
        this.A00 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A03 = C107405bG.A00(this, R.attr.f3nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A02 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A04 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A01 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.proxy_switcher);
        this.A05 = switchCompat;
        switchCompat.setChecked(this.A09.A0F.A00.A05());
        this.A05.setOnCheckedChangeListener(new AnonymousClass693(this, 7));
        AnonymousClass1VX r13 = this.A0D;
        C69263Wi r10 = this.A05;
        C111095hX r9 = this.A00;
        C620633i r12 = this.A08;
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/520504143274092"), r9, r10, AnonymousClass0x7.A0K(this.A00, R.id.proxy_info_description), r12, r13, getString(R.string.f11nameremoved), "learn-more");
        this.A07 = (WaTextView) C005205m.A00(this, R.id.ip_address_text);
        View findViewById = findViewById(R.id.ip_connection_view_group);
        C634139d.A00(findViewById, this, 32);
        findViewById.setOnLongClickListener(new C85844Hv(this, 0));
        this.A06 = (WaTextView) C005205m.A00(this, R.id.connection_status_indicator);
        ViewStub viewStub = (ViewStub) C005205m.A00(this, R.id.connection_media_status_indicator);
        viewStub.setLayoutResource(R.layout.f8nameremoved);
        if (this.A09.A0H()) {
            this.A08 = (WaTextView) viewStub.inflate();
        }
        View findViewById2 = findViewById(R.id.connection_text);
        int i = 8;
        int i2 = 0;
        if (this.A09.A0H()) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        View findViewById3 = findViewById(R.id.user_proxy_section_divider);
        if (this.A09.A0H()) {
            i = 0;
        }
        findViewById3.setVisibility(i);
        A75(this.A09.A0F.A00.A05());
        this.A09.A0F();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
        C56312rm r3 = settingsUserProxyViewModel.A0E;
        if (r3.A06()) {
            AnonymousClass3Ci r5 = settingsUserProxyViewModel.A0H;
            Number number = (Number) r5.A03.A01();
            if (number == null) {
                number = Integer.valueOf(r5.A06.A01.A03("user_proxy_setting_pref").getInt("proxy_connection_status", 0));
            }
            settingsUserProxyViewModel.A00 = number.intValue();
            Number number2 = (Number) r5.A04.A01();
            if (number2 == null) {
                number2 = Integer.valueOf(r5.A06.A01.A03("user_proxy_setting_pref").getInt("proxy_media_connection_status", 0));
            }
            settingsUserProxyViewModel.A01 = number2.intValue();
            r3.A02(settingsUserProxyViewModel.A00);
            r3.A01(settingsUserProxyViewModel.A01);
            C71293bs.A00(settingsUserProxyViewModel.A0I, settingsUserProxyViewModel, 20);
        }
        AnonymousClass3Ci r52 = settingsUserProxyViewModel.A0H;
        C124266Bp r1 = new C124266Bp(settingsUserProxyViewModel, 18);
        Executor executor = settingsUserProxyViewModel.A08.A08;
        r52.A03.A04(r1, executor);
        r52.A04.A04(new C124266Bp(settingsUserProxyViewModel, 19), executor);
        SettingsUserProxyViewModel settingsUserProxyViewModel2 = this.A09;
        settingsUserProxyViewModel2.A05.A0H(settingsUserProxyViewModel2.A0E.A00());
        SettingsUserProxyViewModel settingsUserProxyViewModel3 = this.A09;
        settingsUserProxyViewModel3.A0G(settingsUserProxyViewModel3.A0E.A01.A03("user_proxy_setting_pref").getInt("proxy_connection_status", 0), A2I);
        AnonymousClass1Ha.A21(this, this.A09.A05, 195);
        AnonymousClass1Ha.A21(this, this.A09.A06, 196);
        AnonymousClass1Ha.A22(this, this.A09.A07, 344);
        if ("deeplink".equals(getIntent().getStringExtra("source"))) {
            A74(getIntent());
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null && this.A09.A0H()) {
            MenuItem findItem = menu.findItem(R.id.menuitem_share);
            if (findItem == null) {
                findItem = menu.add(0, R.id.menuitem_share, 0, R.string.f11nameremoved).setIcon(AnonymousClass0RP.A00(this, R.drawable.ic_action_share));
                findItem.setShowAsAction(1);
            }
            findItem.setVisible(!C107575bX.A0F(this.A09.A02));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public SettingsUserProxyActivity(int i) {
        this.A0A = false;
        AnonymousClass1Hf.A2D(this, 101);
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            A74(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C60962zS A002;
        if (menuItem.getItemId() == R.id.menuitem_share) {
            SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
            String str = settingsUserProxyViewModel.A02;
            if (str == null) {
                A002 = new C60962zS();
            } else {
                A002 = C385528d.A00(settingsUserProxyViewModel.A0E, str);
            }
            Uri.Builder builder = new Uri.Builder();
            String str2 = A002.A02;
            if (str2 == null) {
                str2 = A002.A05;
            }
            Uri A0H = C18290x4.A0H(builder.scheme("https").authority("wa.me").path("proxy").appendQueryParameter("host", str2).appendQueryParameter("chatPort", String.valueOf(A002.A00)).appendQueryParameter("mediaPort", String.valueOf(A002.A01)), "chatTLS", String.valueOf(A002.A06));
            if (A0H != null) {
                Intent A092 = AnonymousClass0x9.A09("android.intent.action.SEND");
                A092.setType("text/plain");
                A092.putExtra("android.intent.extra.SUBJECT", getString(R.string.f11nameremoved));
                A092.putExtra("android.intent.extra.TEXT", AnonymousClass002.A0F(this, A0H.toString(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                A092.addFlags(524288);
                startActivity(Intent.createChooser(A092, getString(R.string.f11nameremoved)));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (!this.A05.isChecked() && this.A09.A0H() && C107575bX.A0F(this.A09.A02)) {
            this.A09.A0F();
            this.A05.setChecked(true);
        }
    }

    public void onStop() {
        super.onStop();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
        C56312rm r1 = settingsUserProxyViewModel.A0E;
        r1.A02(settingsUserProxyViewModel.A00);
        r1.A01(settingsUserProxyViewModel.A01);
        r1.A03(settingsUserProxyViewModel.A02);
    }

    public SettingsUserProxyActivity() {
        this(0);
    }
}
