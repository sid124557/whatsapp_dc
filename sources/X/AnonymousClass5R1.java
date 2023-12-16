package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5R1  reason: invalid class name */
public final class AnonymousClass5R1 {
    public Map A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass314 A06;
    public final AnonymousClass30T A07;
    public final C620233e A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass1R1 A0A;
    public final AnonymousClass5JU A0B;
    public final Comparator A0C = new AnonymousClass6A5(this, 7);

    public final void A00(List list, Map map, int i) {
        if (i != 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                if (next instanceof UserJid) {
                    A0s.add(next);
                }
            }
            Iterator it = A0s.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    throw C18280x3.A0X();
                }
                int i4 = this.A05;
                int i5 = ((i4 - i2) + 1) * i;
                if (i2 >= i4) {
                    i5 = i;
                }
                C18280x3.A1D(next2, map, C18310x6.A06(AnonymousClass0x9.A0q(next2, map)) + i5);
                i2 = i3;
            }
        }
    }

    public String toString() {
        Map map = this.A00;
        if (map == null) {
            return "";
        }
        ArrayList A0z = C18290x4.A0z(map);
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A0w.getKey());
            A0o.append(": ");
            A0o.append(AnonymousClass0x2.A08(A0w));
            AnonymousClass0x7.A1D(A0o, A0z);
        }
        return C73723fy.A09("\n ", A0z);
    }

    public AnonymousClass5R1(AnonymousClass314 r3, AnonymousClass30T r4, C620233e r5, AnonymousClass1VX r6, AnonymousClass1R1 r7, AnonymousClass5JU r8) {
        C18260x0.A0f(r6, r5, r3, r7, r4);
        this.A09 = r6;
        this.A08 = r5;
        this.A06 = r3;
        this.A0A = r7;
        this.A07 = r4;
        this.A0B = r8;
        this.A01 = r6.A0N(6463);
        this.A03 = r6.A0N(6464);
        this.A02 = r6.A0N(6465);
        this.A04 = r6.A0N(6466);
        this.A05 = r6.A0N(6467);
    }
}
