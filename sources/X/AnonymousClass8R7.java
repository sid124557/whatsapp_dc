package X;

import java.util.List;

/* renamed from: X.8R7  reason: invalid class name */
public class AnonymousClass8R7 implements C183668qQ {
    public int A00 = -1;
    public final int A01;
    public final List A02;

    public String readLine() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i < this.A01) {
            return ((C148477In) this.A02.get(i)).A00;
        }
        return null;
    }

    public AnonymousClass8R7(List list) {
        this.A02 = list;
        this.A01 = list.size();
    }
}
