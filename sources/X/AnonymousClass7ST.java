package X;

import java.util.Map;

/* renamed from: X.7ST  reason: invalid class name */
public class AnonymousClass7ST {
    public final /* synthetic */ AnonymousClass8J2 A00;
    public final /* synthetic */ C186568vZ A01;

    public AnonymousClass7ST(AnonymousClass8J2 r1, C186568vZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C150807Sh r13, int i) {
        AnonymousClass8J2 r6 = this.A00;
        if (r6.A02) {
            Map map = r6.A06;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, new AnonymousClass7N9());
            }
            AnonymousClass7N9 r4 = (AnonymousClass7N9) map.get(valueOf);
            r4.A02++;
            r4.A00 += r13.A00;
            r4.A01 += r13.A01;
            r4.A03 += r13.A02;
        }
        if (r6.A01) {
            double d = r13.A00;
            if (!Double.isNaN(d)) {
                long j = r13.A02;
                if (j > 0) {
                    C186568vZ r9 = r6.A05;
                    r9.markerAnnotate(689639794, "timeSpent", j);
                    double d2 = (double) j;
                    r9.markerAnnotate(689639794, "smallFrames", (r13.A01 * 60000.0d) / d2);
                    r9.markerAnnotate(689639794, "largeFrames", (d * 60000.0d) / d2);
                    r9.markerAnnotate(689639794, "scrollSurface", i);
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("scrollperf/surface=");
        A0o.append(i);
        A0o.append(",duration=");
        A0o.append(r13.A02);
        A0o.append(",largeFrameDrop=");
        A0o.append(r13.A00);
        A0o.append(",smallFrameDrop=");
        A0o.append(r13.A01);
        AnonymousClass0x2.A18(A0o);
    }
}
