package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Pa  reason: invalid class name and case insensitive filesystem */
public class C67373Pa implements C1228866f {
    public final /* synthetic */ C22121Ep A00;
    public final /* synthetic */ boolean A01;

    public C67373Pa(C22121Ep r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public /* synthetic */ void BPk(String str) {
    }

    public void BQe(long j) {
        C18260x0.A10("app/CrashLogs/uploadCrashData/sent ", AnonymousClass001.A0o(), j);
    }

    public void BSF(String str) {
        C18260x0.A0r("app/CrashLogs/uploadCrashData/error received: ", str, AnonymousClass001.A0o());
        this.A00.A0G(this.A01, "upload-error-from-server");
    }

    public void BaA(String str, Map map) {
        C18260x0.A0q("app/CrashLogs/uploadCrashData/Response received: ", str, AnonymousClass001.A0o());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            C18260x0.A1P(AnonymousClass001.A0o(), "app/CrashLogs/uploadCrashData/Header: ", A0q.next());
        }
    }
}
