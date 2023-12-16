package X;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.7Zw  reason: invalid class name and case insensitive filesystem */
public final class C152677Zw {
    public long A00 = System.currentTimeMillis();
    public boolean A01;
    public final C56612sH A02;
    public final C184548s0 A03;
    public final AnonymousClass7XZ A04;
    public final C152687Zx A05;
    public final String A06;
    public final Set A07 = AnonymousClass0x9.A17();
    public final Stack A08 = new Stack();

    public final void A01(String str) {
        C162457s7.A0J(str, 0);
        if (str.equals(this.A05.A01)) {
            ((AnonymousClass7ZL) this.A08.peek()).A00 = C996857p.COMPLETE;
        }
    }

    public final String A00() {
        Stack stack = this.A05.A08;
        if (stack.isEmpty()) {
            return null;
        }
        String str = (String) stack.peek();
        while (true) {
            Stack stack2 = this.A08;
            if (C162457s7.A0P(((AnonymousClass7ZL) stack2.peek()).A01, str)) {
                return str;
            }
            stack2.pop();
        }
    }

    public C152677Zw(C56612sH r3, C184548s0 r4, AnonymousClass7XZ r5, C152687Zx r6, String str) {
        C18260x0.A0Q(r3, r4);
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = str;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final void A02(String str, Map map) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("stateName: ");
        A0o.append(str);
        C18260x0.A1P(A0o, " resumableData: ", map);
        if (map == null) {
            return;
        }
        if (str == null || str.equals(((AnonymousClass7ZL) this.A08.peek()).A01)) {
            ((AnonymousClass7ZL) this.A08.peek()).A03.putAll(map);
        }
    }
}
