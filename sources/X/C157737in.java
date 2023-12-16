package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7in  reason: invalid class name and case insensitive filesystem */
public class C157737in {
    public static final long A0C = ((long) (Math.pow(10.0d, 6.0d) / 30.0d));
    public boolean A00;
    public final C180608lL A01;
    public final C158667kM A02;
    public final C153537bV A03;
    public final C152797a8 A04;
    public final AnonymousClass7QR A05;
    public final C183838qk A06;
    public final AnonymousClass7UB A07;
    public final Map A08 = AnonymousClass001.A0t();
    public final Map A09 = AnonymousClass0x7.A0y();
    public final ExecutorService A0A;
    public volatile boolean A0B;

    public C157737in(C180608lL r5, C158667kM r6, C152797a8 r7, AnonymousClass7QR r8, C183838qk r9, AnonymousClass7UB r10) {
        int size;
        this.A04 = r7;
        this.A05 = r8;
        this.A07 = r10;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r9;
        C153537bV r2 = r8.A05;
        r2.getClass();
        this.A03 = r2;
        C142366x5 r1 = C142366x5.VIDEO;
        if (r2.A02(r1) == null) {
            size = 0;
        } else {
            size = r2.A02(r1).size();
        }
        this.A0A = C157067hf.A00("VIDEO_DEMUX_DECODE", new C172768Mq(), size, false);
    }

    public final void A00(List list) {
        HashMap A0t = AnonymousClass001.A0t();
        Map map = this.A09;
        A0t.putAll(map);
        for (Object remove : list) {
            A0t.remove(remove);
        }
        AnonymousClass7VY r3 = new AnonymousClass7VY();
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            AnonymousClass7RG.A00(new C188878zd(r3, (C186348v9) AnonymousClass0x2.A0W(A0u)));
        }
        Throwable th = r3.A01;
        if (th == null) {
            map.keySet().removeAll(A0t.keySet());
            return;
        }
        throw th;
    }
}
