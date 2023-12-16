package com.whatsapp.inappsupport.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass3XM;
import X.AnonymousClass4HY;
import X.C04290Nq;
import X.C08310eF;
import X.C107405bG;
import X.C162457s7;
import X.C175738Zn;
import X.C18270x1;
import X.C183538qC;
import X.C56972sr;
import X.C620733j;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;

public final class SupportBloksActivity extends WaBloksActivity {
    public C183538qC A00;
    public boolean A01;

    public C08310eF A75(Intent intent) {
        String stringExtra;
        AnonymousClass39C r1;
        BkFragment supportBkScreenFragment;
        String stringExtra2 = intent.getStringExtra("screen_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (C175738Zn.A0Y(stringExtra2, "com.bloks.www.csf", false) || !C175738Zn.A0Y(stringExtra2, "com.bloks.www.cxthelp", false)) {
            stringExtra = getIntent().getStringExtra("screen_params");
            r1 = (AnonymousClass39C) getIntent().getParcelableExtra("screen_cache_config");
            supportBkScreenFragment = new SupportBkScreenFragment();
        } else {
            stringExtra = getIntent().getStringExtra("screen_params");
            r1 = (AnonymousClass39C) getIntent().getParcelableExtra("screen_cache_config");
            supportBkScreenFragment = new ContextualHelpBkScreenFragment();
        }
        supportBkScreenFragment.A1Q(stringExtra2);
        supportBkScreenFragment.A1P(stringExtra);
        supportBkScreenFragment.A1M(r1);
        return supportBkScreenFragment;
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0x9.A0K(this).ABO(this);
        }
    }

    public SupportBloksActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 70);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            str = AnonymousClass0x9.A1G().put("params", AnonymousClass0x9.A1G().put("locale", C620733j.A02(this.A00).toLanguageTag())).toString();
        } catch (JSONException unused) {
            Log.e("SupportBloksActivity - Could not create bloks parameter");
            str = null;
        }
        C183538qC r0 = this.A00;
        if (r0 != null) {
            WeakReference A14 = AnonymousClass0x9.A14(this);
            boolean A0D = C107405bG.A0D(this);
            PhoneUserJid A04 = C56972sr.A04(this.A01);
            C162457s7.A0H(A04);
            ((C04290Nq) r0.get()).A00(new AnonymousClass3XM(), (AnonymousClass39C) null, "com.bloks.www.csf.whatsapp.gethelp.locale.async", A04.getRawString(), str, A14, A0D);
            return;
        }
        throw C18270x1.A0S("asyncActionLauncherLazy");
    }

    public SupportBloksActivity() {
        this(0);
    }
}
