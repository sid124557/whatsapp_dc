package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0fq  reason: invalid class name and case insensitive filesystem */
public class C09220fq implements C17340vN, C16230sg {
    public AnonymousClass0N4 A00 = new AnonymousClass0N4();
    public boolean A01;
    public final Path A02 = AnonymousClass002.A06();
    public final AnonymousClass01G A03;
    public final C04850Qx A04;
    public final String A05;
    public final boolean A06;

    public void BfC() {
        this.A01 = false;
        this.A03.invalidateSelf();
    }

    public void Bm3(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C16780tx r2 = (C16780tx) list.get(i);
            if (r2 instanceof C09200fo) {
                C09200fo r22 = (C09200fo) r2;
                if (r22.A03 == AnonymousClass0FR.SIMULTANEOUSLY) {
                    this.A00.A00.add(r22);
                    r22.A05.add(this);
                }
            }
        }
    }

    public Path BAd() {
        boolean z = this.A01;
        Path path = this.A02;
        if (!z) {
            path.reset();
            if (!this.A06) {
                path.set((Path) this.A04.A0A());
                path.setFillType(Path.FillType.EVEN_ODD);
                this.A00.A00(path);
            }
            this.A01 = true;
        }
        return path;
    }

    public String getName() {
        return this.A05;
    }

    public C09220fq(AnonymousClass01G r3, C09470gF r4, C09320g0 r5) {
        this.A05 = r4.A02;
        this.A06 = r4.A03;
        this.A03 = r3;
        AnonymousClass0BX r0 = new AnonymousClass0BX(r4.A01.A00);
        this.A04 = r0;
        r5.A08(r0);
        C04850Qx.A06(r0, this);
    }
}
