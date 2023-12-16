package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5lW  reason: invalid class name and case insensitive filesystem */
public class C113495lW implements AnonymousClass4E8 {
    public final AnonymousClass5QW A00;

    public String BDW() {
        return "DirectoryDailyCron";
    }

    public void BQW() {
        Log.d("DirectoryDailyCron/onDailyCron");
        AnonymousClass5QW r6 = this.A00;
        List<C1223664c> A002 = r6.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C1223664c r7 : A002) {
            if (((double) (((int) (System.currentTimeMillis() - r7.BDf())) / 86400000)) > 90.0d) {
                A0s.add(r7);
            }
        }
        A002.removeAll(A0s);
        C18290x4.A1M(r6.A04, r6, A002, 39);
    }

    public /* synthetic */ void BQX() {
    }

    public C113495lW(AnonymousClass5QW r1) {
        this.A00 = r1;
    }
}
