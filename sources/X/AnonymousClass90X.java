package X;

import java.util.Deque;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.90X  reason: invalid class name */
public class AnonymousClass90X implements C84114Bb {
    public Object A00;
    public final int A01;

    public AnonymousClass90X(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BSV(Object obj) {
        C137066ni r1;
        C55212pz r12;
        C137066ni r3;
        Iterable<AnonymousClass7YN> iterable;
        switch (this.A01) {
            case 0:
                C151217Tw r6 = (C151217Tw) this.A00;
                C172098Jp r14 = (C172098Jp) obj;
                C162457s7.A0J(r14, 1);
                String str = r14.A00;
                int i = 0;
                while (true) {
                    Stack stack = r6.A03;
                    if (!C162457s7.A0P(stack.peek(), str)) {
                        r6.A04.pop();
                        stack.pop();
                        i++;
                    } else {
                        C150567Rh r32 = r6.A00;
                        C40622Hc r2 = r32.A00.A0Q;
                        for (int i2 = 0; i2 < i; i2++) {
                            r2.A00.pop();
                        }
                        Object pollFirst = ((Deque) C162457s7.A03(r6.A04)).pollFirst();
                        C626936e.A06(pollFirst);
                        String str2 = (String) pollFirst;
                        C162457s7.A0H(str2);
                        r32.A00(str2, (Map) null, true);
                        return;
                    }
                }
            case 1:
                C159127lA r62 = (C159127lA) this.A00;
                AnonymousClass7SR r13 = r62.A06;
                if ((r13 instanceof C137066ni) && r13 != null) {
                    String str3 = r13.A01;
                    Map map = r62.A0C;
                    if (map != null && (iterable = (Iterable) map.get(str3)) != null) {
                        for (AnonymousClass7YN r15 : iterable) {
                            ((C44932Ya) r62.A0V.get()).A00(r15.A00, r62.A0Y, r15.A01, r62.hashCode());
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C160717oC r7 = (C160717oC) this.A00;
                C197989eC r142 = (C197989eC) obj;
                C162457s7.A0J(r142, 1);
                C159127lA r4 = r7.A03.A00;
                AnonymousClass7SR r33 = r4.A06;
                if ((r33 instanceof C137066ni) && (r3 = (C137066ni) r33) != null) {
                    C48722fM r22 = r4.A05;
                    if (r22 == null) {
                        throw C18270x1.A0S("fcsLoadingEventManager");
                    }
                    r22.A01((C60752z6) null, "onStartLoading", r3.A00(), (Map) null);
                }
                AnonymousClass1j2 r34 = r4.A0M;
                r34.A00(r4.A00, "actionPerformed");
                r34.A03(r4.A00, "action_performed", "cancel");
                r4.A01();
                r34.A03.A07(r4.A00, 4);
                AnonymousClass7SR r16 = r4.A06;
                if ((r16 instanceof C137066ni) && (r1 = (C137066ni) r16) != null) {
                    C45422Zz B95 = r4.A0R.B95(r1.A04);
                    if (B95 != null) {
                        r12 = B95.A00();
                    } else {
                        r12 = null;
                    }
                    if ((r12 instanceof AnonymousClass1jY) && ((AnonymousClass1jY) r12).A09()) {
                        return;
                    }
                }
                String str4 = r142.A00;
                if (str4 != null) {
                    C368820c r35 = C368820c.BACK_BUTTON;
                    C152387Yr r23 = r7.A04;
                    boolean A012 = r23.A01(str4);
                    if (!r23.A02(str4) && !A012) {
                        r23.A00.remove(r23.A00().A01);
                        Map A013 = r7.A01(str4, r142.A01);
                        r4.A03 = r35;
                        r4.A06((C60752z6) null, C57412tb.A00(str4), (Map) null, A013, false);
                        return;
                    }
                }
                if ((!r142.A02 || r7.A00 != C141816wB.CLOSE) && r7.A00 != null) {
                    r7.A04(C368820c.BACK_BUTTON, (C60752z6) null, str4, r142.A01, (Map) null);
                    return;
                } else {
                    r7.A02(C368820c.BACK_BUTTON);
                    return;
                }
            case 3:
                ((C160717oC) this.A00).A01 = true;
                return;
            case 4:
                ((C160717oC) this.A00).A02(C368820c.BACK_BUTTON);
                return;
            case 5:
                ((AnonymousClass4GP) this.A00).invoke();
                return;
            default:
                C197939e7 r143 = (C197939e7) obj;
                C162457s7.A0J(r143, 1);
                ((C160397nZ) this.A00).A00.Ay7(r143.A00);
                return;
        }
    }
}
