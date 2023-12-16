package X;

/* renamed from: X.2mN  reason: invalid class name and case insensitive filesystem */
public class C52992mN {
    public final C66663Mh A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass32E A03 = new AnonymousClass32E();

    public synchronized void A00() {
        this.A03.A01++;
    }

    public synchronized void A01() {
        AnonymousClass32E r3 = this.A03;
        r3.A00 = 0;
        r3.A02 = 0;
        r3.A01 = 0;
    }

    public boolean A02() {
        C183538qC r3 = this.A02.A01;
        boolean contains = C18300x5.A0B(r3).contains("c2dm_reg_id");
        if (this.A00.A08(C66663Mh.A0M) || !contains || C18280x3.A02(C18300x5.A0B(r3), "logins_with_messages") >= 3) {
            return false;
        }
        return true;
    }

    public C52992mN(C66663Mh r2, C56612sH r3, AnonymousClass33p r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
