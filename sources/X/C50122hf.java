package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2hf  reason: invalid class name and case insensitive filesystem */
public class C50122hf {
    public AnonymousClass30H A00;
    public final C55682qk A01;
    public final AnonymousClass1VX A02;
    public final C64173Cl A03;
    public final C67823Qu A04;
    public final Map A05 = AnonymousClass001.A0t();
    public final Map A06 = AnonymousClass001.A0t();

    public void A00(AnonymousClass39T r6, C84694Di r7) {
        Map map = this.A05;
        synchronized (map) {
            if (map.containsKey(r6)) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "added duplicate ackable stanza: ", r6);
                this.A01.A0A("MessageCallbacksManager/addAckCallback", true, "duplicate_ackable_stanza");
            }
            if (this.A02.A0Y(C58422vE.A01, 5667)) {
                map.put(r6, new C69233Wf(this, this.A03.A00(), r7));
            } else {
                map.put(r6, r7);
            }
            C18260x0.A1P(AnonymousClass001.A0o(), "added ackable stanza: ", r6);
            String str = r6.A05;
            if ("message".equals(str) || "receipt".equals(str)) {
                C67823Qu r3 = this.A04;
                AtomicInteger atomicInteger = r3.A0K;
                if (atomicInteger.incrementAndGet() == 1 || r3.A06 != null) {
                    r3.A04();
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("XmppConnectionMetrics outgoing stanza processing started counter:");
                C18260x0.A1G(A0o, atomicInteger.get());
            }
        }
    }

    public void A01(Exception exc) {
        Map map = this.A06;
        synchronized (map) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                ((C84694Di) AnonymousClass0x2.A0W(A0q)).BQr(exc);
            }
            map.clear();
        }
    }

    public C50122hf(C55682qk r2, AnonymousClass1VX r3, C64173Cl r4, C67823Qu r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
