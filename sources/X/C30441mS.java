package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.1mS  reason: invalid class name and case insensitive filesystem */
public abstract class C30441mS extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public long A00;
    public String A01;

    public C30441mS(AnonymousClass2z0 r9, C30441mS r10, long j) {
        super(r10, r9, j, true);
        this.A01 = r10.A01;
        this.A00 = r10.A00;
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r5) {
        if (this instanceof C30951nU) {
            return new C30951nU(r5, this, this.A0K);
        }
        C30961nV r3 = (C30961nV) this;
        return new C30961nV(r5, r3, r3.A0K);
    }

    public List BDE() {
        C52042kn A02;
        C95814uZ r3;
        C55162pu A0t = A0t();
        if (!C624134x.A0g(this) || A0t == null || (A02 = A0t.A02()) == null || (r3 = A02.A00) == null) {
            return null;
        }
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A04("thread_msg_id", A02.A01.A01, r2);
        r2[1] = new AnonymousClass39V((Jid) r3, "thread_msg_sender_jid");
        return C624134x.A0D(r2);
    }

    public C30441mS(AnonymousClass2z0 r2, byte b, int i, long j) {
        super(r2, b, j);
        this.A01 = i;
        this.A00 = j;
        A1D(0);
    }
}
