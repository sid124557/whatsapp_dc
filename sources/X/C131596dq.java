package X;

import java.util.List;

/* renamed from: X.6dq  reason: invalid class name and case insensitive filesystem */
public class C131596dq extends C153617bf {
    public final String A00;
    public final List A01;

    public C131596dq(List list, char c) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = Character.toString(c);
            return;
        }
        throw C131316dO.A00("Empty properties");
    }
}
