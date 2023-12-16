package X;

import java.util.LinkedList;

/* renamed from: X.5Pc  reason: invalid class name and case insensitive filesystem */
public final class C103965Pc {
    public final LinkedList A00;
    public final /* synthetic */ C87664Uf A01;

    public C103965Pc(C87664Uf r3) {
        this.A01 = r3;
        LinkedList A18 = AnonymousClass0x9.A18();
        this.A00 = A18;
        A18.add(new C113185l1(r3));
    }

    public final boolean A00() {
        LinkedList linkedList = this.A00;
        if (!(!linkedList.isEmpty()) || !(C73723fy.A05(linkedList) instanceof C113185l1)) {
            return false;
        }
        return true;
    }
}
