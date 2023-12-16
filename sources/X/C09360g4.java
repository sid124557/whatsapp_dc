package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0g4  reason: invalid class name and case insensitive filesystem */
public abstract class C09360g4 implements C16890uC {
    public final List A00;

    public List B8y() {
        return this.A00;
    }

    public boolean BJ2() {
        List list = this.A00;
        if (list.isEmpty() || (list.size() == 1 && AnonymousClass001.A0b(list, 0).A03())) {
            return true;
        }
        return false;
    }

    public C09360g4(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        List list = this.A00;
        if (!list.isEmpty()) {
            A0o.append("values=");
            A0o.append(Arrays.toString(list.toArray()));
        }
        return A0o.toString();
    }
}
