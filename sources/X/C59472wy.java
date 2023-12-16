package X;

import java.util.LinkedList;

/* renamed from: X.2wy  reason: invalid class name and case insensitive filesystem */
public class C59472wy {
    public LinkedList A00 = AnonymousClass0x9.A18();
    public C623634s A01 = new C623634s();
    public boolean A02 = true;

    public static void A00(LinkedList linkedList, C59472wy r3, C623634s r4) {
        linkedList.addFirst(r3.A01);
        r3.A01 = r4;
        if (linkedList.size() > 40) {
            linkedList.removeLast();
        }
    }

    public C59472wy(byte[] bArr) {
        C21351Bm r2 = (C21351Bm) C130786cX.A05(C21351Bm.DEFAULT_INSTANCE, bArr);
        AnonymousClass1E1 r1 = r2.currentSession_;
        this.A01 = new C623634s(r1 == null ? AnonymousClass1E1.DEFAULT_INSTANCE : r1);
        this.A02 = false;
        for (AnonymousClass1E1 r22 : r2.previousSessions_) {
            this.A00.add(new C623634s(r22));
        }
    }

    public C59472wy() {
    }
}
