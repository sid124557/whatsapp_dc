package X;

import android.os.Handler;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.3Gm  reason: invalid class name and case insensitive filesystem */
public class C65173Gm implements AnonymousClass4FW {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C29091iG A01;
    public final C105105Tp A02;
    public final Map A03 = C18320x8.A0r();
    public final Executor A04;

    public void A00() {
        Handler handler = this.A00;
        Map map = this.A03;
        Objects.requireNonNull(map);
        handler.post(new C71293bs((Object) map, 44));
    }

    public final void A01(C624134x r4, int i) {
        AnonymousClass33C r1;
        AnonymousClass2z0 r12 = r4.A1J;
        if ((r12.A00 instanceof C135166kE) && r12.A02) {
            if ((r4 instanceof C30471mV) && (i != 1 || (r1 = ((C30471mV) r4).A01) == null || !r1.A0Q || r1.A0c || !r1.A0R)) {
                return;
            }
            if (!(r4 instanceof C30441mS) || ((C30441mS) r4).A01 != null) {
                this.A04.execute(new C71573cK(this, 3, r4));
            }
        }
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public void BWU(C624134x r2, int i) {
        if (r2 instanceof C30471mV) {
            A01(r2, i);
        }
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65173Gm(C29091iG r3, C105105Tp r4, AnonymousClass4FS r5) {
        C72173dI A002 = C72173dI.A00(r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = A002;
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public void BWS(C624134x r1, int i) {
        A01(r1, i);
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
