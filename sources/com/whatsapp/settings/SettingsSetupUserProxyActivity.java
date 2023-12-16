package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass43I;
import X.AnonymousClass4HQ;
import X.AnonymousClass66R;
import X.AnonymousClass67W;
import X.AnonymousClass6C6;
import X.C107695bk;
import X.C120165y9;
import X.C120175yA;
import X.C120815zD;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18330xA;
import X.C385528d;
import X.C60962zS;
import X.C634139d;
import X.C64333Db;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class SettingsSetupUserProxyActivity extends C89644eZ {
    public View A00;
    public TextInputLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public boolean A04;
    public final AnonymousClass66R A05;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0.equals(r1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74() {
        /*
            r4 = this;
            java.lang.Class<com.whatsapp.settings.SettingsUserProxyActivity> r0 = com.whatsapp.settings.SettingsUserProxyActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r4, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r3 = "source"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = "deeplink"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r2.putExtra(r3, r1)
            X.66R r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.2zS r1 = r0.A00
            X.2zS r0 = r0.A01
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "intent_proxy_has_changed"
            r2.putExtra(r0, r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = r0.getStringExtra(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "deeplink"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            r4.startActivity(r2)
        L_0x004b:
            r4.finish()
            return
        L_0x004f:
            r0 = -1
            r4.setResult(r0, r2)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyActivity.A74():void");
    }

    public SettingsSetupUserProxyActivity(int i) {
        this.A04 = false;
        AnonymousClass1Hf.A2D(this, 100);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        boolean A2I = AnonymousClass1Hf.A2I(this);
        this.A01 = (TextInputLayout) C18290x4.A0N(this, R.id.proxy_host_text_input_layout);
        View findViewById = findViewById(R.id.chat_port_layout);
        View findViewById2 = findViewById(R.id.media_port_layout);
        TextView A09 = AnonymousClass002.A09(findViewById, R.id.proxy_port_name);
        this.A02 = (WaTextView) C18290x4.A0M(findViewById, R.id.proxy_port_indicator);
        A09.setText(R.string.f11nameremoved);
        TextView A092 = AnonymousClass002.A09(findViewById2, R.id.proxy_port_name);
        this.A03 = (WaTextView) C18290x4.A0M(findViewById2, R.id.proxy_port_indicator);
        A092.setText(R.string.f11nameremoved);
        C634139d.A00(findViewById, this, 30);
        C634139d.A00(findViewById2, this, 31);
        this.A00 = C18290x4.A0N(this, R.id.save_proxy_button);
        AnonymousClass66R r3 = this.A05;
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) r3.getValue();
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        String stringExtra = intent.getStringExtra("intent_host_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C60962zS A012 = C385528d.A01(stringExtra, intent.getIntExtra("intent_chat_port", 443), intent.getIntExtra("intent_media_port", 587), intent.getBooleanExtra("intent_use_tls", A2I));
        settingsSetupUserProxyViewModel.A00 = A012;
        settingsSetupUserProxyViewModel.A0E(A012);
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout == null) {
            throw C18270x1.A0S("proxyInputEditText");
        }
        EditText editText = textInputLayout.A0b;
        if (editText != null) {
            editText.addTextChangedListener(new AnonymousClass4HQ(this, 7));
        }
        this.A05.A01(new AnonymousClass67W(this, A2I ? 1 : 0), this);
        ((SettingsSetupUserProxyViewModel) r3.getValue()).A02.A0B(this, new AnonymousClass6C6(new AnonymousClass43I(this), 343));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            A74();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public SettingsSetupUserProxyActivity() {
        this(0);
        this.A05 = C18330xA.A02(new C120175yA(this), new C120165y9(this), new C120815zD(this), AnonymousClass0x9.A1E(SettingsSetupUserProxyViewModel.class));
    }
}
