package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public final class C65183Gn implements AnonymousClass4FW {
    public boolean A00 = true;
    public final WfalManager A01;
    public final C56012rH A02;
    public final AnonymousClass4FS A03;
    public final C183538qC A04;
    public final HashMap A05 = AnonymousClass001.A0t();

    public C65183Gn(WfalManager wfalManager, C56012rH r4, AnonymousClass4FS r5, C183538qC r6) {
        C162457s7.A0J(r5, 1);
        C18260x0.A0a(wfalManager, r4, r6, 2);
        this.A03 = r5;
        this.A01 = wfalManager;
        this.A02 = r4;
        this.A04 = r6;
    }

    public void BWU(C624134x r6, int i) {
        AnonymousClass4FS r2;
        int i2;
        C162457s7.A0J(r6, 0);
        if (i == 24 && r6.A0J > 0 && C626736a.A07(r6) && this.A01.A02()) {
            AnonymousClass356.A03(C624134x.A0C(r6, "CrosspostMessageObserver/checking is auto-share crossposting message ", AnonymousClass001.A0o()));
            if (r6.A0O == null) {
                AnonymousClass356.A03("CrosspostMessageObserver/handle auto share message in previous app session");
                r2 = this.A03;
                i2 = 33;
            } else if (!C626736a.A09(C18290x4.A12(r6))) {
                return;
            } else {
                if (this.A00 || this.A05.containsKey(r6.A1J.A01)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("CrosspostMessageObserver/handle omitted auto share message. statusFragmentDestroyed: ");
                    AnonymousClass356.A03(C18300x5.A0m(A0o, this.A00));
                    r2 = this.A03;
                    i2 = 34;
                } else {
                    return;
                }
            }
            r2.BkM(new C70153a2(this, i2, r6));
        }
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
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

    public static final List A00(C624134x r4) {
        ArrayList A0s = AnonymousClass001.A0s();
        C108845de r2 = r4.A0O;
        if (r2 != null) {
            if (r2.A03) {
                A0s.add(AnonymousClass223.FACEBOOK);
            }
            if (r2.A04) {
                A0s.add(AnonymousClass223.INSTAGRAM);
            }
        }
        return A0s;
    }

    public void BWS(C624134x r4, int i) {
        if ((C624134x.A07(r4).A00 instanceof C135166kE) && C626736a.A07(r4) && C626736a.A09(C18290x4.A12(r4)) && this.A01.A02()) {
            this.A03.BkM(new C70153a2(r4, 35, this));
        }
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
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
