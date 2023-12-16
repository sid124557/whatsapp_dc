package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2r5  reason: invalid class name and case insensitive filesystem */
public class C55892r5 {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final C28691hc A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final int[] A07 = {0, 1, 2, 3};

    public final synchronized C56202rb A01(int i, long j) {
        if (j <= 0) {
            return null;
        }
        return (C56202rb) C18280x3.A0W(A03(i), j);
    }

    public synchronized void A05(long j) {
        C56202rb A022 = A02(j);
        if (A022 != null) {
            A03(A022.A02).remove(Long.valueOf(A022.A03));
            Iterator A032 = C61102zi.A03(this.A02);
            while (A032.hasNext()) {
                ((AnonymousClass4FA) A032.next()).BRj(A022);
            }
        }
    }

    public synchronized void A06(C56202rb r4) {
        if (this.A01.A0Y(C58422vE.A02, 296)) {
            Map A032 = A03(r4.A02);
            Long valueOf = Long.valueOf(r4.A03);
            if (A032.containsKey(valueOf)) {
                C18260x0.A1S(AnonymousClass001.A0o(), "LoggableStanzaCache/skipped caching loggable stanza:", r4);
            } else {
                A032.put(valueOf, r4);
                Iterator A033 = C61102zi.A03(this.A02);
                while (A033.hasNext()) {
                    ((AnonymousClass4FA) A033.next()).Bc4(r4);
                }
            }
        }
    }

    public static AnonymousClass1gR A00(C55892r5 r3, AnonymousClass39T r4) {
        return (AnonymousClass1gR) r3.A01(2, r4.A00);
    }

    public C56202rb A02(long j) {
        if (j > 0) {
            for (int A012 : this.A07) {
                C56202rb A013 = A01(A012, j);
                if (A013 != null) {
                    return A013;
                }
            }
        }
        return null;
    }

    public Map A03(int i) {
        if (i == 0) {
            return this.A04;
        }
        if (i == 1) {
            return this.A06;
        }
        if (i == 2) {
            return this.A05;
        }
        if (i == 3) {
            return this.A03;
        }
        throw AnonymousClass002.A0E("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public C55892r5(C56612sH r2, AnonymousClass1VX r3, C28691hc r4) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = AnonymousClass001.A0t();
        this.A06 = AnonymousClass001.A0t();
        this.A05 = AnonymousClass001.A0t();
        this.A03 = AnonymousClass001.A0t();
    }

    public void A04(long j) {
        int i;
        C56202rb A022 = A02(j);
        if (!(A022 instanceof C28261gT)) {
            if (A022 instanceof AnonymousClass1gS) {
                i = 6;
            } else if (A022 instanceof AnonymousClass1gR) {
                i = 5;
            } else if (!(A022 instanceof AnonymousClass1gU)) {
                return;
            }
            A022.A03(i);
            return;
        }
        A022.A03(4);
    }
}
