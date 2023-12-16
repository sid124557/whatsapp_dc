package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.5Yo  reason: invalid class name and case insensitive filesystem */
public class C106335Yo {
    public static final AnonymousClass5WU A00;
    public static final AnonymousClass5WU A01;
    public static final AnonymousClass5WU A02;

    static {
        AnonymousClass5WU r3 = new AnonymousClass5WU("({[", ")}]");
        A02 = r3;
        AnonymousClass5WU r2 = new AnonymousClass5WU("*~_", "*~_");
        A00 = r2;
        AnonymousClass5WU[] r1 = new AnonymousClass5WU[2];
        AnonymousClass000.A16(r3, r2, r1);
        A01 = new AnonymousClass5WU(r1);
    }

    public static boolean A01(Pair pair, CharSequence charSequence) {
        AnonymousClass5WU r5 = A02;
        Stack stack = new Stack();
        for (int A03 = C18280x3.A03(pair); A03 < C18290x4.A03(pair); A03++) {
            char charAt = charSequence.charAt(A03);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !r5.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static Pair A00(Pair pair, AnonymousClass5WU r6, CharSequence charSequence) {
        char c;
        Object valueOf;
        Object obj;
        int A03 = C18280x3.A03(pair);
        char c2 = 0;
        if (A03 != 0) {
            c = charSequence.charAt(A03 - 1);
        } else {
            c = 0;
        }
        if (C18290x4.A03(pair) != charSequence.length()) {
            c2 = charSequence.charAt(C18290x4.A03(pair));
        }
        char charAt = charSequence.charAt(C18280x3.A03(pair));
        char charAt2 = charSequence.charAt(C18290x4.A03(pair) - 1);
        if (!r6.A00(c, c2)) {
            if (r6.A00(c, charAt2)) {
                valueOf = pair.first;
            } else if (r6.A00(charAt, c2)) {
                valueOf = Integer.valueOf(C18280x3.A03(pair) + 1);
                obj = pair.second;
                return AnonymousClass0x9.A0C(valueOf, obj);
            } else if (r6.A00(charAt, charAt2)) {
                valueOf = Integer.valueOf(C18280x3.A03(pair) + 1);
            }
            obj = Integer.valueOf(C18290x4.A03(pair) - 1);
            return AnonymousClass0x9.A0C(valueOf, obj);
        }
        return pair;
    }
}
