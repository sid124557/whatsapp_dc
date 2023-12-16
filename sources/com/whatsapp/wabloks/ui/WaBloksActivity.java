package com.whatsapp.wabloks.ui;

import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass7UQ;
import X.AnonymousClass983;
import X.AnonymousClass984;
import X.AnonymousClass98Z;
import X.C08310eF;
import X.C162457s7;
import X.C183538qC;
import X.C185008su;
import X.C1899593h;
import X.C1899693i;
import X.C1904997b;
import X.C34261un;
import X.C379524r;
import X.C40142Er;
import X.C44122Ut;
import X.C47382dA;
import X.C55742qq;
import X.C84704Dj;
import X.C84744Dn;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Map;
import java.util.Set;

public class WaBloksActivity extends C1904997b implements C84704Dj, C84744Dn {
    public C44122Ut A00;
    public C47382dA A01;
    public AnonymousClass7UQ A02;
    public C40142Er A03;
    public C55742qq A04;
    public AnonymousClass983 A05;
    public AnonymousClass984 A06;
    public C183538qC A07;
    public C183538qC A08;
    public String A09;
    public Map A0A;
    public Map A0B;
    public final Set A0C = AnonymousClass002.A0K();
    public final Set A0D = AnonymousClass002.A0K();

    public static Intent A0X(Context context, String str, String str2) {
        return AnonymousClass0x9.A08(context, WaBloksActivity.class).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", (Parcelable) null);
    }

    public C08310eF A75(Intent intent) {
        if (this instanceof WaFcsPreloadedBloksActivity) {
            return BkFcsPreloadingScreenFragment.A00((AnonymousClass39C) intent.getParcelableExtra("screen_cache_config"), intent.getStringExtra("screen_name"), intent.getStringExtra("fds_state_name"), intent.getStringExtra("data_module_job_id"), intent.getStringExtra("data_module_namespace"), intent.getStringExtra("screen_params"), intent.getStringExtra("qpl_param_map"), intent.getStringExtra("fds_manager_id"), intent.getStringExtra("fds_observer_id"));
        } else if (this instanceof WaFcsModalActivity) {
            FdsContentFragmentManager A002 = FdsContentFragmentManager.A00(intent.getStringExtra("fds_observer_id"));
            ((WaFcsModalActivity) this).A00 = A002;
            return A002;
        } else if (this instanceof WaBloksActivityWithCustomPreloadScreens) {
            String stringExtra = intent.getStringExtra("screen_name");
            String stringExtra2 = intent.getStringExtra("screen_params");
            String stringExtra3 = intent.getStringExtra("qpl_param_map");
            BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens = new BkScreenFragmentWithCustomPreloadScreens();
            bkScreenFragmentWithCustomPreloadScreens.A1Q(stringExtra);
            C1899593h.A1P(bkScreenFragmentWithCustomPreloadScreens, (AnonymousClass39C) intent.getParcelableExtra("screen_cache_config"), stringExtra3, stringExtra2);
            return bkScreenFragmentWithCustomPreloadScreens;
        } else {
            String stringExtra4 = intent.getStringExtra("screen_name");
            String stringExtra5 = intent.getStringExtra("screen_params");
            String stringExtra6 = intent.getStringExtra("qpl_param_map");
            BkScreenFragment bkScreenFragment = new BkScreenFragment();
            bkScreenFragment.A1Q(stringExtra4);
            C1899593h.A1P(bkScreenFragment, (AnonymousClass39C) intent.getParcelableExtra("screen_cache_config"), stringExtra6, stringExtra5);
            bkScreenFragment.A07 = false;
            return bkScreenFragment;
        }
    }

    public C47382dA BEP() {
        C47382dA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass98Z A092 = C1899693i.A09(this, getSupportFragmentManager(), this.A00, this.A0A);
        this.A01 = A092;
        return A092;
    }

    public void Brn(AnonymousClass49G r3) {
        if (this.A06.A02.A00(AnonymousClass0GC.CREATED)) {
            this.A05.A02(r3);
        }
    }

    public void Bro(AnonymousClass49F r3, AnonymousClass49G r4, boolean z) {
        if (this.A06.A02.A00(AnonymousClass0GC.CREATED)) {
            AnonymousClass984 r0 = this.A06;
            if (r0 != null) {
                r0.A00(r3, r4);
            }
            if (z) {
                onCreateOptionsMenu(this.A02.getMenu());
            }
        }
    }

    public void onBackPressed() {
        AnonymousClass983 r1 = this.A05;
        if (r1.A03()) {
            r1.A00();
        } else if (getSupportFragmentManager().A07() <= 1) {
            setResult(0, C379524r.A00(getIntent()));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (C185008su BQQ : this.A0D) {
            BQQ.BQQ(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C185008su BXQ : this.A0D) {
            if (BXQ.BXQ(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (C185008su BYj : this.A0D) {
            BYj.BYj(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d A[LOOP:0: B:14:0x0087->B:16:0x008d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A76(android.content.Intent r5, android.os.Bundle r6) {
        /*
            r4 = this;
            X.0df r3 = r4.getSupportFragmentManager()
            X.0eF r2 = r4.A75(r5)
            int r0 = r3.A07()
            if (r0 != 0) goto L_0x0023
            if (r2 == 0) goto L_0x0023
            X.0dc r1 = new X.0dc
            r1.<init>(r3)
            r0 = 2131428054(0x7f0b02d6, float:1.8477742E38)
            r1.A09(r2, r0)
            java.lang.String r0 = r4.A09
            r1.A0I(r0)
            r1.A02()
        L_0x0023:
            java.util.Map r1 = r4.A0B
            java.lang.String r0 = r4.A09
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0097
            java.util.Map r1 = r4.A0B
            java.lang.String r0 = r4.A09
            java.lang.Object r1 = r1.get(r0)
            X.9nM r1 = (X.C203249nM) r1
        L_0x0037:
            X.8qC r0 = r4.A08
            java.lang.Object r0 = r0.get()
            X.2bq r0 = (X.C46562bq) r0
            X.983 r0 = r1.B0r(r4, r0)
            r4.A05 = r0
            X.984 r0 = r1.B0q(r4)
        L_0x0049:
            r4.A06 = r0
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "com.bloks.www.ctwa.messaging.hub"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 2131102203(0x7f0609fb, float:1.7816837E38)
            X.C107405bG.A07(r4, r0)
            r1 = 2131101306(0x7f06067a, float:1.7815018E38)
            r0 = 1
            X.C107405bG.A09(r4, r1, r0)
            r0 = 2131434822(0x7f0b1d46, float:1.8491469E38)
            android.view.View r1 = X.C005205m.A00(r4, r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x0070:
            java.util.Set r2 = r4.A0C
            X.984 r0 = r4.A06
            r2.add(r0)
            java.util.Set r1 = r4.A0D
            X.984 r0 = r4.A06
            r1.add(r0)
            X.983 r0 = r4.A05
            r2.add(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x0087:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r1.next()
            android.app.Application$ActivityLifecycleCallbacks r0 = (android.app.Application.ActivityLifecycleCallbacks) r0
            r0.onActivityCreated(r4, r6)
            goto L_0x0087
        L_0x0097:
            boolean r0 = r4 instanceof X.C202209lY
            if (r0 == 0) goto L_0x00ab
            r0 = r4
            X.9lY r0 = (X.C202209lY) r0
            X.9HW r0 = (X.AnonymousClass9HW) r0
            X.3Xe r1 = r0.A02
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "phoenixBloksActivityHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ab:
            X.33j r1 = r4.A00
            X.9HZ r0 = new X.9HZ
            r0.<init>(r1, r4)
            r4.A05 = r0
            X.9He r0 = new X.9He
            r0.<init>(r1, r4)
            goto L_0x0049
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.WaBloksActivity.A76(android.content.Intent, android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(A74());
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("screen_name");
        this.A09 = stringExtra;
        C40142Er r1 = this.A03;
        C162457s7.A0J(stringExtra, 0);
        r1.A00 = stringExtra;
        if (this.A01 == null) {
            this.A01 = C1899693i.A09(this, getSupportFragmentManager(), this.A00, this.A0A);
        }
        A76(intent, bundle);
    }

    public void onDestroy() {
        if (isFinishing() && getIntent().getStringExtra("wa_screen_options") != null) {
            C55742qq r2 = this.A04;
            String A0a = C1899693i.A0a(this, "wa_screen_options");
            C162457s7.A0J(A0a, 0);
            r2.A04(new C34261un(A0a), "wa_screen_options");
        }
        super.onDestroy();
    }

    public int A74() {
        return R.layout.f8nameremoved;
    }

    public AnonymousClass7UQ B4k() {
        return this.A02;
    }
}
