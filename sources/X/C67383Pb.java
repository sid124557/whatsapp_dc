package X;

import android.os.ConditionVariable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Pb  reason: invalid class name and case insensitive filesystem */
public class C67383Pb implements C1228866f {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C622734j A01;
    public final /* synthetic */ StringBuffer A02;

    public C67383Pb(ConditionVariable conditionVariable, C622734j r2, StringBuffer stringBuffer) {
        this.A01 = r2;
        this.A02 = stringBuffer;
        this.A00 = conditionVariable;
    }

    public /* synthetic */ void BPk(String str) {
    }

    public void BQe(long j) {
        C18260x0.A10("sent ", AnonymousClass001.A0o(), j);
    }

    public void BSF(String str) {
        C18260x0.A0r("debug-builder/uploadLogsInternal Error received: ", str, AnonymousClass001.A0o());
    }

    public void BaA(String str, Map map) {
        C18260x0.A0q("debug-builder/uploadLogsInternal Response received: ", str, AnonymousClass001.A0o());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            C18260x0.A1P(AnonymousClass001.A0o(), "Header: ", A0q.next());
        }
        List A0s = C18320x8.A0s("X-Uploaded-File-Id", map);
        if (A0s != null && !A0s.isEmpty()) {
            this.A02.append((String) C18290x4.A0k(A0s));
        }
        this.A00.open();
    }
}
