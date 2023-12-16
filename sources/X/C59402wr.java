package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.2wr  reason: invalid class name and case insensitive filesystem */
public class C59402wr {
    public boolean A00;
    public final C58232uv A01;
    public final LinkedList A02;

    public C59402wr(byte[] bArr) {
        this.A02 = AnonymousClass0x9.A18();
        this.A00 = false;
        C21351Bm r2 = (C21351Bm) C130786cX.A05(C21351Bm.DEFAULT_INSTANCE, bArr);
        AnonymousClass1E1 r1 = r2.currentSession_;
        this.A01 = new C58232uv(r1 == null ? AnonymousClass1E1.DEFAULT_INSTANCE : r1);
        this.A00 = false;
        for (AnonymousClass1E1 r22 : r2.previousSessions_) {
            this.A02.add(new C58232uv(r22));
        }
    }

    public byte[] A00() {
        LinkedList A18 = AnonymousClass0x9.A18();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A18.add(((C58232uv) it.next()).A00);
        }
        C130546c9 A0G = C21351Bm.DEFAULT_INSTANCE.A0G();
        C170208Ch.A05(A18, C18320x8.A0D(A0G, this.A01.A00));
        return C18290x4.A1Z(A0G);
    }

    public C59402wr() {
        this.A02 = AnonymousClass0x9.A18();
        this.A00 = true;
        this.A01 = new C58232uv();
    }
}
