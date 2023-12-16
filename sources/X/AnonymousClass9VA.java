package X;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.9VA  reason: invalid class name */
public class AnonymousClass9VA {
    public static final int[] A0A = {2, 3, 4, 6, 8};
    public ByteBuffer A00;
    public final C202289li A01;
    public final AnonymousClass9PE A02 = new AnonymousClass9PE();
    public final AnonymousClass7X7 A03;
    public final AnonymousClass7KX A04 = new AnonymousClass7KX();
    public final C182108ns A05;
    public final Object A06 = AnonymousClass002.A0D();
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public void A00() {
        if (this.A08) {
            this.A08 = false;
            this.A03.A00();
        }
    }

    public AnonymousClass9VA(AnonymousClass9N6 r5) {
        C196349ah r3 = new C196349ah(this);
        this.A05 = r3;
        this.A01 = new C195599Yn(this);
        Objects.requireNonNull(r5);
        this.A03 = new AnonymousClass7X7(new C196339ag(r5), r3, 3);
    }
}
