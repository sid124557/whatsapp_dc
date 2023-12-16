package com.whatsapp.extensions.bloks;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3E7;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass49I;
import X.AnonymousClass4HY;
import X.AnonymousClass7UQ;
import X.AnonymousClass8DJ;
import X.AnonymousClass98Z;
import X.C08270df;
import X.C107695bk;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C40102En;
import X.C43432Sc;
import X.C44122Ut;
import X.C47382dA;
import X.C626936e;
import X.C64333Db;
import X.C71323bv;
import X.C823843j;
import X.C84704Dj;
import X.C84734Dm;
import X.C84744Dn;
import X.C86034Io;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;
import java.util.Map;

public class WaExtensionsBottomsheetModalActivity extends C89644eZ implements C84704Dj, C84734Dm, C84744Dn {
    public C44122Ut A00;
    public C47382dA A01;
    public AnonymousClass7UQ A02;
    public WaExtensionsNavBarViewModel A03;
    public Map A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A02 = r1.Ahl();
            this.A00 = (C44122Ut) A0I.A4Q.get();
            this.A04 = A0I.ADP();
        }
    }

    public C47382dA BEP() {
        C47382dA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass98Z A002 = this.A00.A00(this, getSupportFragmentManager(), new C40102En(this.A04));
        this.A01 = A002;
        return A002;
    }

    public void Bnb(boolean z) {
        C18320x8.A18(this.A03.A05, z);
    }

    public void Bnc(boolean z) {
        C18320x8.A18(this.A03.A06, z);
    }

    public void Brn(AnonymousClass49G r7) {
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A03;
        try {
            C43432Sc r3 = new C43432Sc(r7.B3p().A0K(40));
            if (r3.A00 != null) {
                waExtensionsNavBarViewModel.A00 = new C86034Io(r3, 29);
            }
            String str = r3.A05;
            if (!C162457s7.A0P(waExtensionsNavBarViewModel.A01, "1")) {
                waExtensionsNavBarViewModel.A07.A0H(str);
            }
            String str2 = r3.A03;
            String str3 = r3.A04;
            if (!C162457s7.A0P(waExtensionsNavBarViewModel.A01, "1")) {
                return;
            }
            if (str3 != null && str3.length() != 0) {
                waExtensionsNavBarViewModel.A0D.BkM(new C71323bv(38, str3, new C823843j(waExtensionsNavBarViewModel, str2)));
            } else if (str2 != null && str2.length() != 0) {
                waExtensionsNavBarViewModel.A08.A00(new AnonymousClass3E7(waExtensionsNavBarViewModel), str2);
            }
        } catch (ClassCastException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "ExtensionsLogger/Bloks: Invalid navigation bar type - ", e);
        }
    }

    public void onBackPressed() {
        AnonymousClass49I r1 = this.A03.A00;
        if (r1 != null) {
            AnonymousClass8DJ.A0B(this.A01, r1);
        } else {
            super.onBackPressed();
        }
    }

    public WaExtensionsBottomsheetModalActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 59);
    }

    public AnonymousClass7UQ B4k() {
        return this.A02;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        getWindow().setStatusBarColor(getResources().getColor(R.color.f5nameremoved));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        if (this.A01 == null) {
            this.A01 = this.A00.A00(this, getSupportFragmentManager(), new C40102En(this.A04));
        }
        this.A03 = (WaExtensionsNavBarViewModel) AnonymousClass0x9.A0H(this).A01(WaExtensionsNavBarViewModel.class);
        Intent intent = getIntent();
        if (intent != null) {
            WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A03;
            String stringExtra = intent.getStringExtra("extensions_impl_type");
            if (stringExtra != null) {
                waExtensionsNavBarViewModel.A01 = stringExtra;
            }
        }
        Intent intent2 = getIntent();
        C162457s7.A0J(intent2, 0);
        ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = new ExtensionsBottomsheetBaseContainer();
        Bundle A08 = AnonymousClass002.A08();
        C18310x6.A0z(intent2, A08, "screen_name");
        C18310x6.A0z(intent2, A08, "screen_params");
        A08.putParcelable("screen_cache_config", intent2.getParcelableExtra("screen_cache_config"));
        C18310x6.A0z(intent2, A08, "chat_id");
        C18310x6.A0z(intent2, A08, "flow_id");
        A08.putBoolean("make_metadata_request", intent2.getBooleanExtra("make_metadata_request", false));
        A08.putBoolean("show_report_menu", intent2.getBooleanExtra("show_report_menu", false));
        extensionsBottomsheetBaseContainer.A0u(A08);
        C08270df supportFragmentManager = getSupportFragmentManager();
        C626936e.A06(supportFragmentManager);
        extensionsBottomsheetBaseContainer.A1O(supportFragmentManager, "extensions_bottom_sheet_container");
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void Bro(AnonymousClass49F r1, AnonymousClass49G r2, boolean z) {
    }

    public WaExtensionsBottomsheetModalActivity() {
        this(0);
    }
}
