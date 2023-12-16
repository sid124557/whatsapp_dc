package X;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DO  reason: invalid class name */
public class AnonymousClass3DO implements AnonymousClass66U {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;

    public void A02(String str) {
        boolean delete = C18270x1.A0A(C54292oU.A02(this.A02), ".health", AnonymousClass000.A0l(str)).delete();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Module ");
        A0o.append(str);
        C18260x0.A1E(" health file deleted: ", A0o, delete);
    }

    public boolean A03(String str) {
        return !C18270x1.A0A(C54292oU.A02(this.A02), ".health", AnonymousClass000.A0l(str)).exists();
    }

    public void BMd() {
        AnonymousClass33p r8 = this.A03;
        if (AnonymousClass0x2.A0F(r8).getBoolean("report_unhealthy_module", true)) {
            List A002 = A00();
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                this.A00.A0A(AnonymousClass000.A0V("app-init-module-unhealthy-", AnonymousClass001.A0m(it), AnonymousClass001.A0o()), false, AnonymousClass321.A02());
            }
            if (!A002.isEmpty()) {
                C18270x1.A0v(r8, "report_unhealthy_module", false);
            }
        }
    }

    public AnonymousClass3DO(C55682qk r1, C56612sH r2, C54292oU r3, AnonymousClass33p r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public List A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        if (!A03("breakpad")) {
            A0s.add("breakpad");
        }
        if (!A03("anr_detector")) {
            A0s.add("anr_detector");
        }
        if (!A03("abort_hook")) {
            A0s.add("abort_hook");
        }
        return A0s;
    }

    public void A01(Runnable runnable, String str) {
        boolean A032 = A03(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!A032) {
            A0o.append("Skipping module ");
            A0o.append(str);
            C18260x0.A1M(A0o, " since its unhealthy");
            return;
        }
        C18260x0.A0s("Loading module: ", str, A0o);
        try {
            C18270x1.A0A(C54292oU.A02(this.A02), ".health", AnonymousClass000.A0l(str)).createNewFile();
        } catch (IOException e) {
            C18260x0.A0u("Error creating health file for ", str, AnonymousClass001.A0o(), e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        A02(str);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Module loaded: ");
        A0o2.append(str);
        A0o2.append(" load time: ");
        C18260x0.A1I(A0o2, elapsedRealtime2 - elapsedRealtime);
        return;
    }

    public String BDW() {
        return "SafeModuleLoader";
    }

    public /* synthetic */ void BMe() {
    }
}
