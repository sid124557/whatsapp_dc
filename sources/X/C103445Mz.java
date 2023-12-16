package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.5Mz  reason: invalid class name and case insensitive filesystem */
public class C103445Mz {
    public Handler A00 = AnonymousClass000.A0A();
    public Executor A01;

    public static C103445Mz A00(AnonymousClass4FS r2) {
        return new C103445Mz(new C72173dI(r2, true));
    }

    public static void A01(C117935sj r1, C103445Mz r2, Object obj, int i) {
        r2.A02(new C1238269x(obj, i), r1);
    }

    public void A02(AnonymousClass658 r4, C117935sj r5) {
        this.A01.execute(new C70333aK(this, r5, r4, 39));
    }

    public C103445Mz(Executor executor) {
        this.A01 = executor;
    }
}
