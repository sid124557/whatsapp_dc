package X;

import java.util.Collection;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7Yr  reason: invalid class name and case insensitive filesystem */
public final class C152387Yr {
    public final Map A00 = C18320x8.A0r();
    public final Stack A01 = new Stack();
    public final Stack A02 = new Stack();

    public final boolean A01(String str) {
        C162457s7.A0J(str, 0);
        Stack<AnonymousClass7YO> stack = this.A01;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (AnonymousClass7YO r0 : stack) {
                if (C162457s7.A0P(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02(String str) {
        C162457s7.A0J(str, 0);
        Stack<AnonymousClass7YO> stack = this.A02;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (AnonymousClass7YO r0 : stack) {
                if (C162457s7.A0P(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AnonymousClass7YO A00() {
        Object peek;
        Stack stack = this.A02;
        if (!stack.isEmpty()) {
            peek = stack.peek();
        } else {
            peek = this.A01.peek();
        }
        C162457s7.A0D(peek);
        return (AnonymousClass7YO) peek;
    }
}
