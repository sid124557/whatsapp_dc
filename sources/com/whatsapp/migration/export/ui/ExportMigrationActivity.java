package com.whatsapp.migration.export.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0QJ;
import X.AnonymousClass0R8;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass29R;
import X.AnonymousClass30Q;
import X.AnonymousClass35V;
import X.AnonymousClass3DZ;
import X.AnonymousClass4FV;
import X.AnonymousClass5V0;
import X.AnonymousClass90H;
import X.C005205m;
import X.C10240hc;
import X.C107695bk;
import X.C1235268t;
import X.C18260x0;
import X.C18270x1;
import X.C1891190b;
import X.C1893490y;
import X.C19340zH;
import X.C42422Oa;
import X.C50382i5;
import X.C50992j6;
import X.C54292oU;
import X.C56022rI;
import X.C56582sE;
import X.C56972sr;
import X.C58422vE;
import X.C620733j;
import X.C627736r;
import X.C64333Db;
import X.C70023Zo;
import X.C70403aR;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class ExportMigrationActivity extends C89644eZ {
    public C50382i5 A00;
    public WaNetworkResourceImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public C10240hc A07;
    public AnonymousClass0QJ A08;
    public RoundCornerProgressBar A09;
    public C54292oU A0A;
    public AnonymousClass4FV A0B;
    public C56022rI A0C;
    public C56582sE A0D;
    public ExportMigrationViewModel A0E;
    public C42422Oa A0F;
    public C50992j6 A0G;
    public WDSButton A0H;
    public WDSButton A0I;
    public String A0J;
    public boolean A0K;

    public void onBackPressed() {
        A76(new C70023Zo(this, 6));
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r3 = A002.A00;
            AnonymousClass1Ha.A23(A002, r3, r3, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C50382i5) A002.AZG.get();
            this.A0A = C64333Db.A2q(A002);
            this.A0B = C64333Db.A4H(A002);
            this.A0D = (C56582sE) A002.A9S.get();
            this.A0G = new C50992j6((AnonymousClass4FV) A002.ASY.get());
            this.A0C = (C56022rI) A002.AMv.get();
            this.A0F = (C42422Oa) r3.A4C.get();
            this.A07 = (C10240hc) A002.AG8.get();
            this.A08 = (AnonymousClass0QJ) A002.AGB.get();
        }
    }

    public final void A74(int i) {
        Context context = this.A0A.A00;
        Log.i("xpm-export-service-cancelExport()");
        Intent A092 = AnonymousClass0x9.A09("ACTION_CANCEL_EXPORT");
        A092.setClass(context, MessagesExporterService.class);
        A092.putExtra("IS_FIRST_PARTY", false);
        AnonymousClass29R.A00(context, A092);
        C18260x0.A0y("ExportMigrationActivity/cancelMigrationAndReturn/resultCode: ", AnonymousClass001.A0o(), i);
        setResult(i);
        finish();
    }

    public ExportMigrationActivity(int i) {
        this.A0K = false;
        A5J(new AnonymousClass90H(this, 65));
    }

    public final void A75(long j) {
        String string = getString(R.string.f11nameremoved);
        String A052 = AnonymousClass35V.A05(this.A00, j);
        C620733j r3 = this.A00;
        Object[] A0L = AnonymousClass002.A0L();
        C620733j.A03(r3, A052, A0L, 0);
        runOnUiThread(new C70403aR(this, string, r3.A0L(A0L, R.plurals.f9nameremoved, j), j));
    }

    public final void A76(Runnable runnable) {
        String string = getString(R.string.f11nameremoved);
        if (!this.A0D.A08()) {
            this.A0G.A00(this.A0J, 15);
        }
        C19340zH A002 = C19340zH.A00(this, string);
        String string2 = getString(R.string.f11nameremoved);
        C1891190b r0 = new C1891190b(this, 45);
        AnonymousClass0Uj r3 = A002.A00;
        r3.A0I(r0, string2);
        r3.A0G(new C1893490y(this, 3, runnable), getString(R.string.f11nameremoved));
        A002.A0S();
    }

    public final void A77(Runnable runnable, Runnable runnable2, boolean z) {
        String string = getString(R.string.f11nameremoved);
        String string2 = getString(R.string.f11nameremoved);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0h(string);
        A002.A0g(string2);
        A002.A0i(z);
        String string3 = getString(R.string.f11nameremoved);
        C1235268t r0 = new C1235268t(runnable, 73);
        AnonymousClass0Uj r3 = A002.A00;
        r3.A0I(r0, string3);
        r3.A0G(new C1235268t(runnable2, 74), getString(R.string.f11nameremoved));
        A002.A0S();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String A022 = this.A0C.A02();
        this.A0J = A022;
        this.A0G.A00(A022, 11);
        if (!this.A0D.A0Y(C58422vE.A02, 843)) {
            this.A0G.A01(this.A0J, 18);
            Log.e("ExportMigrationActivity/verifyActivityStartRequest; disabled: platform migration feature is disabled");
            setResult(102);
        } else {
            try {
                C42422Oa r2 = this.A0F;
                synchronized (r2.A00) {
                }
                if (!r2.A02.A00("com.apple.movetoios")) {
                    this.A0G.A01(this.A0J, 19);
                    Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed");
                    this.A03.A0A("xpm-export-activity-permission-denied", false, (String) null);
                    setResult(104);
                    this.A0C.A03();
                    super.finish();
                    return;
                } else if (!this.A0D.A08() && C56972sr.A04(this.A01) == null) {
                    this.A0G.A01(this.A0J, 21);
                    Log.e("ExportMigrationActivity/onCreate/user: no user logged in, skipping.");
                    startActivity(C627736r.A04(this));
                    setResult(105);
                } else if (this.A0D.A08()) {
                    AnonymousClass30Q r3 = this.A0D.A0A;
                    if (!AnonymousClass001.A1T(r3.A02.getComponentEnabledSetting(r3.A00))) {
                        C18270x1.A0g(AnonymousClass0x2.A0E(r3.A05.A02), "/export/provider_closed/timestamp");
                        r3.A03();
                        r3.A02.setComponentEnabledSetting(r3.A00, 1, 1);
                    }
                    Log.i("ExportMigrationActivity/providerReady/finishing");
                    this.A0G.A01(this.A0J, 24);
                    Log.i("ExportMigrationActivity/activateContentProviderAndFinishActivity");
                    setResult(100);
                    finish();
                    return;
                } else {
                    this.A0G.A00(this.A0J, 1);
                    setContentView((int) R.layout.f8nameremoved);
                    setTitle(getString(R.string.f11nameremoved));
                    AnonymousClass0R8 supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A0N(true);
                    }
                    this.A05 = (WaTextView) C005205m.A00(this, R.id.export_migrate_title);
                    this.A04 = (WaTextView) C005205m.A00(this, R.id.export_migrate_sub_title);
                    this.A06 = (WaTextView) C005205m.A00(this, R.id.export_migrate_warning);
                    this.A02 = (WaTextView) C005205m.A00(this, R.id.export_migrate_change_number_action);
                    this.A0H = (WDSButton) C005205m.A00(this, R.id.export_migrate_main_action);
                    this.A0I = (WDSButton) C005205m.A00(this, R.id.export_migrate_sub_action);
                    this.A01 = (WaNetworkResourceImageView) C005205m.A00(this, R.id.export_migrate_image_view);
                    this.A09 = (RoundCornerProgressBar) C005205m.A00(this, R.id.export_migrate_progress_bar);
                    this.A03 = (WaTextView) C005205m.A00(this, R.id.export_migrate_progress_description);
                    ExportMigrationViewModel exportMigrationViewModel = (ExportMigrationViewModel) AnonymousClass0x9.A0H(this).A01(ExportMigrationViewModel.class);
                    this.A0E = exportMigrationViewModel;
                    AnonymousClass1Ha.A21(this, exportMigrationViewModel.A02, 129);
                    AnonymousClass1Ha.A21(this, this.A0E.A00, 130);
                    AnonymousClass1Ha.A21(this, this.A0E.A01, 131);
                    return;
                }
            } catch (SecurityException e) {
                this.A0G.A01(this.A0J, 20);
                Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed", e);
                this.A03.A09("xpm-export-activity-permission-denied", (String) null, e);
                setResult(104);
                this.A0C.A03();
                super.finish();
                return;
            }
        }
        this.A0C.A03();
        super.finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A76((Runnable) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2.A01 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            X.2sE r0 = r3.A0D
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0012
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0E
            r0 = 5
        L_0x000e:
            r1.A0D(r0)
            return
        L_0x0012:
            X.2sE r2 = r3.A0D
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x002d }
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0026
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0E
            r0 = 1
            goto L_0x000e
        L_0x0026:
            X.4FS r1 = r3.A04
            r0 = 7
            X.C70023Zo.A00(r1, r3, r0)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.ui.ExportMigrationActivity.onResume():void");
    }

    public ExportMigrationActivity() {
        this(0);
    }
}
