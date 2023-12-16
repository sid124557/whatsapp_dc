package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.2qV  reason: invalid class name and case insensitive filesystem */
public final class C55532qV {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final C56002rG A04;
    public final C34171uL A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C79033vy(this));
    public final AnonymousClass66R A07 = C154517dI.A01(new C79043vz(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C79053w0(this));
    public final AnonymousClass66R A09 = C154517dI.A01(new C79063w1(this));

    public final List A00() {
        Map A10;
        Object obj;
        Map A102 = AnonymousClass0x7.A10(this.A08);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q(A102);
        while (A0q.hasNext()) {
            Object peek = ((PriorityQueue) AnonymousClass0x2.A0W(A0q)).peek();
            if (!(peek == null || (A10 = AnonymousClass0x7.A10(this.A06)) == null || (obj = A10.get(peek)) == null)) {
                A0s.add(obj);
            }
        }
        return A0s;
    }

    public final void A01(int i) {
        String str;
        C53722nY r0 = (C53722nY) AnonymousClass001.A0i(AnonymousClass0x7.A10(this.A07), i);
        if (r0 != null) {
            str = r0.A06;
        } else {
            str = null;
        }
        A02(i, str);
    }

    public final void A02(int i, String str) {
        PriorityQueue priorityQueue;
        Number number;
        Map A10 = AnonymousClass0x7.A10(this.A09);
        Integer valueOf = Integer.valueOf(i);
        A10.remove(valueOf);
        AnonymousClass0x7.A10(this.A06).remove(valueOf);
        AnonymousClass0x7.A10(this.A07).remove(valueOf);
        if (!(str == null || (priorityQueue = (PriorityQueue) C18280x3.A0V(str, this.A08)) == null || (number = (Number) priorityQueue.peek()) == null || i != number.intValue())) {
            priorityQueue.poll();
        }
        C18270x1.A0g(this.A04.A00(), AnonymousClass000.A0Y("badged_notice_", AnonymousClass001.A0o(), i));
    }

    public final void A03(C60222yC r4) {
        AnonymousClass66R r2 = this.A06;
        AnonymousClass0x7.A10(r2).put(Integer.valueOf(r4.A05.A00), r4);
        C56002rG r1 = this.A04;
        r1.A06(C18300x5.A0w(this.A09));
        r1.A04(C18300x5.A0w(r2));
        r1.A05(C18300x5.A0w(this.A07));
    }

    public C55532qV(C56972sr r2, C56612sH r3, C54292oU r4, C620733j r5, C56002rG r6, C34171uL r7) {
        C18260x0.A0f(r3, r2, r4, r7, r5);
        C162457s7.A0J(r6, 6);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
    }
}
