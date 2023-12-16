package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1mT  reason: invalid class name and case insensitive filesystem */
public class C30451mT extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public int A00;
    public int A01;
    public long A02 = 0;
    public String A03 = "";
    public List A04;
    public final List A05 = new CopyOnWriteArrayList();

    public C30451mT(AnonymousClass2z0 r9, C30451mT r10, long j) {
        super(r10, r9, j, true);
        this.A03 = r10.A03;
    }

    public void A1Z(String str) {
        if (str == null) {
            str = "";
        }
        this.A03 = str;
    }

    public void A1v(List list) {
        if (this.A04 == null) {
            this.A04 = list;
            return;
        }
        throw AnonymousClass001.A0e("FMessagePoll/setPollVotes re-assigning pollVotes");
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r4) {
        return new C30451mT(r4, this, this.A0K);
    }

    public List BDE() {
        AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
        AnonymousClass39V.A04("polltype", "creation", A1V);
        return C624134x.A0D(A1V);
    }

    public C30451mT(AnonymousClass2z0 r3, long j) {
        super(r3, (byte) 66, j);
    }
}
