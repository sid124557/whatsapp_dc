package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3FU  reason: invalid class name */
public class AnonymousClass3FU implements AnonymousClass4E8 {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public void BQX() {
        C55682qk r2;
        String A002;
        String str;
        Log.d("MigrationDailyCron/onDailyCronWithMessageStore()");
        ((C625635p) this.A02.get()).A08();
        C183538qC r5 = this.A00;
        C55462qO r4 = (C55462qO) r5.get();
        PhoneUserJid A04 = C56972sr.A04(r4.A00);
        synchronized (r4) {
            C56022rI r1 = r4.A03;
            AnonymousClass2SN A012 = r1.A01();
            if (!(A012 == null || A04 == null || r4.A04(A04, A012))) {
                r1.A04();
                C18260x0.A1L(AnonymousClass000.A0l("ExportEncryptionManager/onCheckPrefetchedKeyConsistency(); "), "cleared prefetched key, a different user is now logged in or key is old");
            }
        }
        ((C55462qO) r5.get()).A01();
        C183538qC r12 = this.A01;
        ((C56582sE) r12.get()).A04();
        C56582sE r8 = (C56582sE) r12.get();
        AnonymousClass30Q r7 = r8.A0A;
        PackageManager packageManager = r7.A02;
        ComponentName componentName = r7.A00;
        boolean z = false;
        if (AnonymousClass001.A1T(packageManager.getComponentEnabledSetting(componentName))) {
            C183538qC r10 = r7.A05.A02;
            if (C18300x5.A0B(r10).getLong("/export/provider/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C18300x5.A0B(r10).getLong("/export/provider/timestamp", 0)) > AnonymousClass30Q.A07) {
                z = true;
            }
        }
        if (z) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ExportFlowManager/export-provider-expired");
            C18260x0.A1J(A0o, r7.A01());
            r2 = r8.A02;
            A002 = r7.A01();
            str = "xpm-export-provider-expired";
        } else if (!AnonymousClass001.A1T(packageManager.getComponentEnabledSetting(componentName))) {
            C183538qC r6 = r7.A05.A02;
            if (C18300x5.A0B(r6).getLong("/export/provider_closed/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C18300x5.A0B(r6).getLong("/export/provider_closed/timestamp", 0)) > AnonymousClass30Q.A06) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("ExportFlowManager/export-metadata-expired");
                C18260x0.A1J(A0o2, r7.A00());
                r2 = r8.A02;
                A002 = r7.A00();
                str = "xpm-export-metadata-expired";
            } else {
                return;
            }
        } else {
            return;
        }
        r2.A0A(str, false, A002);
        r8.A03();
    }

    public AnonymousClass3FU(C183538qC r1, C183538qC r2, C183538qC r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public String BDW() {
        return "MigrationDailyCron";
    }

    public /* synthetic */ void BQW() {
    }
}
