package X;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.instrumentation.api.InstrumentationProvider;
import com.whatsapp.migration.export.api.ExportMigrationContentProvider;
import com.whatsapp.registration.autoconf.LoginStatusContentProvider;
import com.whatsapp.registration.directmigration.MigrationContentProvider;
import com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider;

/* renamed from: X.0xp  reason: invalid class name and case insensitive filesystem */
public abstract class C18530xp extends ContentProvider {
    public boolean A00;

    public static C183538qC A02(AnonymousClass4C1 r2) {
        C183538qC A002 = C72343dZ.A00(r2);
        C162457s7.A0J(A002, 0);
        return A002;
    }

    public synchronized void A08() {
        if (!this.A00) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WaBaseContentProvider/ensureInitialized called for ");
            AnonymousClass000.A1A(this, A0o);
            C18280x3.A14(A0o);
            if (!C615631i.A02()) {
                C626936e.A00();
                C626936e.A00.block();
            }
            if (this instanceof WhitelistPackQueryContentProvider) {
                WhitelistPackQueryContentProvider whitelistPackQueryContentProvider = (WhitelistPackQueryContentProvider) this;
                whitelistPackQueryContentProvider.A01 = (C60462yb) C389229y.A00(whitelistPackQueryContentProvider.getContext()).AYb.get();
            } else if (this instanceof MigrationContentProvider) {
                MigrationContentProvider migrationContentProvider = (MigrationContentProvider) this;
                C64333Db A01 = C389229y.A01(migrationContentProvider.getContext());
                migrationContentProvider.A01 = A01.BL4();
                migrationContentProvider.A00 = A01.B2z();
                migrationContentProvider.A02 = (C66663Mh) A01.AUd.get();
                migrationContentProvider.A06 = A01.B2w();
                migrationContentProvider.A03 = (AnonymousClass0N6) A01.A1u.get();
                migrationContentProvider.A05 = A01.B2O();
                migrationContentProvider.A0B = (C623834u) A01.AcK.A00.AC9.get();
                migrationContentProvider.A0A = (AnonymousClass1R1) A01.A56.get();
                migrationContentProvider.A08 = A01.BsO();
                migrationContentProvider.A07 = A01.BsN();
                migrationContentProvider.A04 = (C04860Qy) A01.A8p.get();
                migrationContentProvider.A0C = (C23021Qz) A01.AWx.get();
                migrationContentProvider.A09 = (C54412og) A01.Aam.get();
            } else if (this instanceof LoginStatusContentProvider) {
                LoginStatusContentProvider loginStatusContentProvider = (LoginStatusContentProvider) this;
                Context context = loginStatusContentProvider.getContext();
                if (context != null) {
                    C64333Db A012 = C389229y.A01(context);
                    AnonymousClass1VX Avy = A012.Avy();
                    C162457s7.A0J(Avy, 0);
                    loginStatusContentProvider.A03 = Avy;
                    C56972sr BL4 = A012.BL4();
                    C162457s7.A0J(BL4, 0);
                    loginStatusContentProvider.A00 = BL4;
                    C54292oU BsL = A012.BsL();
                    C162457s7.A0J(BsL, 0);
                    loginStatusContentProvider.A01 = BsL;
                    AnonymousClass33p BsO = A012.BsO();
                    C162457s7.A0J(BsO, 0);
                    loginStatusContentProvider.A02 = BsO;
                } else {
                    throw AnonymousClass001.A0e("Context is not attached.");
                }
            } else if (this instanceof ExportMigrationContentProvider) {
                ExportMigrationContentProvider exportMigrationContentProvider = (ExportMigrationContentProvider) this;
                Context context2 = exportMigrationContentProvider.getContext();
                if (context2 != null) {
                    C64333Db A013 = C389229y.A01(context2);
                    exportMigrationContentProvider.A02 = A013.Avy();
                    exportMigrationContentProvider.A01 = A013.Azq();
                    C107695bk r1 = A013.AcK.A00;
                    exportMigrationContentProvider.A05 = (C994755w) r1.A49.get();
                    exportMigrationContentProvider.A03 = r1.AMl();
                    exportMigrationContentProvider.A06 = (C42422Oa) r1.A4C.get();
                    exportMigrationContentProvider.A04 = (AnonymousClass30Q) A013.A9Z.get();
                    UriMatcher uriMatcher = new UriMatcher(-1);
                    String str = AnonymousClass2C6.A03;
                    uriMatcher.addURI(str, "files", 1);
                    uriMatcher.addURI(str, "file/#", 2);
                    exportMigrationContentProvider.A00 = uriMatcher;
                } else {
                    throw AnonymousClass001.A0e("Context is not attached.");
                }
            } else if (this instanceof InstrumentationProvider) {
                InstrumentationProvider instrumentationProvider = (InstrumentationProvider) this;
                Context context3 = instrumentationProvider.getContext();
                if (context3 != null) {
                    C64333Db A014 = C389229y.A01(context3);
                    instrumentationProvider.A02 = (C60692yy) A014.AI1.get();
                    instrumentationProvider.A00 = (AnonymousClass2OK) A014.AHr.get();
                    instrumentationProvider.A03 = (C34211uP) A014.AI2.get();
                    instrumentationProvider.A04 = (C51072jE) A014.ATh.get();
                    instrumentationProvider.A01 = (AnonymousClass2L8) A014.AcK.A00.A2f.get();
                } else {
                    throw AnonymousClass001.A0e("Context is not attached.");
                }
            } else if (this instanceof MediaProvider) {
                MediaProvider mediaProvider = (MediaProvider) this;
                Context context4 = mediaProvider.getContext();
                if (context4 != null) {
                    mediaProvider.A00 = context4;
                    C64333Db A015 = C389229y.A01(context4);
                    mediaProvider.A05 = A015.Bqh();
                    mediaProvider.A01 = A015.B2z();
                    mediaProvider.A02 = C64333Db.A26(A015);
                    mediaProvider.A03 = C64333Db.A28(A015);
                    mediaProvider.A08 = C64333Db.A8F(A015);
                    mediaProvider.A06 = (AnonymousClass319) A015.AJv.get();
                    mediaProvider.A07 = (C48042eF) A015.AVm.get();
                    mediaProvider.A04 = (AnonymousClass314) A015.A6v.get();
                    mediaProvider.A09 = A015.B2x();
                } else {
                    throw AnonymousClass001.A0e("Cannot find context from the provider.");
                }
            } else {
                AccountSwitchingContentProvider accountSwitchingContentProvider = (AccountSwitchingContentProvider) this;
                Context context5 = accountSwitchingContentProvider.getContext();
                if (context5 != null) {
                    C64333Db A016 = C389229y.A01(context5);
                    AnonymousClass4FS BsP = A016.BsP();
                    C162457s7.A0J(BsP, 0);
                    accountSwitchingContentProvider.A08 = BsP;
                    AnonymousClass33S r0 = (AnonymousClass33S) A016.AUY.get();
                    C162457s7.A0J(r0, 0);
                    accountSwitchingContentProvider.A05 = r0;
                    C61072zf r02 = (C61072zf) A016.AXI.get();
                    C162457s7.A0J(r02, 0);
                    accountSwitchingContentProvider.A02 = r02;
                    accountSwitchingContentProvider.A0M = A02(A016.ASG);
                    accountSwitchingContentProvider.A0P = A02(A016.AaZ);
                    accountSwitchingContentProvider.A0O = A02(A016.AXj);
                    accountSwitchingContentProvider.A0L = A02(A016.AJe);
                    accountSwitchingContentProvider.A0F = A02(A016.A1i);
                    accountSwitchingContentProvider.A0A = A02(A016.A0Q);
                    accountSwitchingContentProvider.A0K = A02(A016.AJ7);
                    accountSwitchingContentProvider.A0N = A02(A016.AXG);
                    AnonymousClass1RI r03 = (AnonymousClass1RI) A016.AaU.get();
                    C162457s7.A0J(r03, 0);
                    accountSwitchingContentProvider.A09 = r03;
                    C29411im Bso = A016.Bso();
                    C162457s7.A0J(Bso, 0);
                    accountSwitchingContentProvider.A00 = Bso;
                    accountSwitchingContentProvider.A0H = A02(A016.A5L);
                    C69253Wh r04 = (C69253Wh) A016.AJO.get();
                    C162457s7.A0J(r04, 0);
                    accountSwitchingContentProvider.A07 = r04;
                    accountSwitchingContentProvider.A0G = A02(A016.A56);
                    accountSwitchingContentProvider.A0E = A02(A016.A14);
                    C72303dV BLG = A016.BLG();
                    C162457s7.A0J(BLG, 0);
                    accountSwitchingContentProvider.A03 = BLG;
                    AnonymousClass33p BsO2 = A016.BsO();
                    C162457s7.A0J(BsO2, 0);
                    accountSwitchingContentProvider.A01 = BsO2;
                    C66523Lt r05 = (C66523Lt) A016.ASB.get();
                    C162457s7.A0J(r05, 0);
                    accountSwitchingContentProvider.A04 = r05;
                    accountSwitchingContentProvider.A0B = A02(A016.A0S);
                    accountSwitchingContentProvider.A0C = A02(A016.A0T);
                    C107695bk r12 = A016.AcK.A00;
                    accountSwitchingContentProvider.A0I = A02(r12.A6D);
                    C43162Ra r06 = (C43162Ra) A016.AIz.get();
                    C162457s7.A0J(r06, 0);
                    accountSwitchingContentProvider.A06 = r06;
                    accountSwitchingContentProvider.A0D = A02(A016.A0V);
                    accountSwitchingContentProvider.A0J = A02(r12.A6C);
                } else {
                    throw AnonymousClass001.A0e("Context is not attached.");
                }
            }
            this.A00 = true;
        }
    }

    public static Uri.Builder A00() {
        return new Uri.Builder().scheme("content").authority(MediaProvider.A0B);
    }

    public static C613630k A01(AccountSwitchingContentProvider accountSwitchingContentProvider) {
        return (C613630k) accountSwitchingContentProvider.A09().get();
    }

    public final boolean onCreate() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaBaseContentProvider/onCreate for ");
        AnonymousClass000.A1A(this, A0o);
        AnonymousClass0x2.A18(A0o);
        return true;
    }
}
