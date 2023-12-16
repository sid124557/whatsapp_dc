package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.8D4  reason: invalid class name */
public final class AnonymousClass8D4 implements C185628tz {
    public C142156wj A00;
    public Object A01;
    public String A02;
    public final AnonymousClass8D5 A03 = new AnonymousClass8D5();
    public final C151147Tp A04;
    public final Stack A05;
    public final Stack A06;

    public C142156wj BLY() {
        C141736w3 r0;
        C142156wj r02;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A05;
        Stack stack2 = this.A06;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((C141736w3) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = C142156wj.START_OBJECT;
            stack.pop();
            r0 = C141736w3.ObjectReadName;
            stack.push(r0);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                stack.pop();
                stack.push(C141736w3.ObjectReadName);
            } else if (ordinal == 3) {
                this.A00 = C142156wj.START_ARRAY;
                stack.pop();
                r0 = C141736w3.ArrayReadValue;
                stack.push(r0);
            } else if (ordinal == 4) {
                this.A01 = null;
                if (it.hasNext()) {
                    this.A01 = it.next();
                } else {
                    this.A00 = C142156wj.END_ARRAY;
                    stack2.pop();
                    stack.pop();
                }
            }
            Object obj = this.A01;
            if (obj == null) {
                r02 = C142156wj.NULL;
            } else if (obj instanceof Boolean) {
                r02 = C142156wj.BOOLEAN;
            } else if (obj instanceof Number) {
                r02 = C142156wj.NUMBER;
            } else if (obj instanceof C155787fV) {
                r02 = C142156wj.EXPRESSION;
            } else if (obj instanceof String) {
                r02 = C142156wj.STRING;
            } else if (obj instanceof List) {
                stack2.push(C18320x8.A0q(obj));
                stack.push(C141736w3.ArrayReadValue);
                r02 = C142156wj.START_ARRAY;
            } else if (obj instanceof Map) {
                stack2.push(AnonymousClass000.A0q((Map) obj));
                stack.push(C141736w3.ObjectReadName);
                r02 = C142156wj.START_OBJECT;
            } else {
                throw AnonymousClass000.A0H(obj, "unknown value type", AnonymousClass001.A0o());
            }
            this.A00 = r02;
        } else {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(it);
                this.A02 = C18310x6.A0q(A0w);
                this.A01 = A0w.getValue();
                this.A00 = C142156wj.NAME;
                stack.pop();
                r0 = C141736w3.ObjectReadValue;
                stack.push(r0);
            } else {
                this.A00 = C142156wj.END_OBJECT;
                stack.pop();
                stack2.pop();
            }
        }
        return this.A00;
    }

    public String Bgf() {
        return this.A02;
    }

    public C142156wj Bgg() {
        return this.A00;
    }

    public C185848uL Bgh() {
        AnonymousClass8D5 r1 = this.A03;
        r1.A00 = this.A01;
        return r1;
    }

    public void BpQ() {
        C142156wj r1 = this.A00;
        C142156wj r3 = C142156wj.START_ARRAY;
        if (r1 == r3 || r1 == C142156wj.START_OBJECT) {
            int i = 1;
            while (true) {
                C142156wj BLY = BLY();
                if (BLY == r3 || BLY == C142156wj.START_OBJECT) {
                    i++;
                } else if (BLY == C142156wj.END_ARRAY || BLY == C142156wj.END_OBJECT) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public AnonymousClass8D4(C151147Tp r4, Iterator it) {
        Stack stack = new Stack();
        this.A06 = stack;
        Stack stack2 = new Stack();
        this.A05 = stack2;
        this.A04 = r4;
        stack.add(it);
        stack2.add(C141736w3.ReadObject);
    }
}
