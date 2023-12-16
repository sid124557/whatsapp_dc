package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8J1  reason: invalid class name */
public class AnonymousClass8J1 implements AnonymousClass66X {
    public Integer A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final C156907hP A03;
    public final AnonymousClass4FV A04;
    public final C186568vZ A05;
    public final Map A06 = AnonymousClass001.A0t();

    public void Bau(int i, boolean z, boolean z2) {
        this.A01 = z2;
        this.A02 = z;
        if (z2 || z) {
            C156907hP r1 = this.A03;
            if (!r1.A03) {
                r1.A03 = true;
                AnonymousClass7OJ r3 = r1.A05;
                if (!r3.A03) {
                    r3.A00 = -1;
                }
                r3.A03 = true;
                r3.A05.postFrameCallback(r3.A04);
                Log.d("scrollperf/start");
            }
            this.A00 = Integer.valueOf(i);
        }
    }

    public void Bav() {
        C156907hP r9 = this.A03;
        if (r9.A03) {
            r9.A03 = false;
            AnonymousClass7OJ r0 = r9.A05;
            r0.A03 = false;
            r0.A05.removeFrameCallback(r0.A04);
            double min = Math.min(r9.A01, 3600.0d);
            double min2 = Math.min(r9.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(r9.A02, C156907hP.A07));
            AnonymousClass7IA r11 = r9.A06;
            AnonymousClass7J5 r13 = new AnonymousClass7J5(min, min2, millis);
            AnonymousClass8J1 r10 = r11.A00;
            Integer num = r10.A00;
            if (num != null) {
                if (r10.A02) {
                    Map map = r10.A06;
                    if (!map.containsKey(num)) {
                        map.put(r10.A00, new AnonymousClass7N8());
                    }
                    AnonymousClass7N8 r4 = (AnonymousClass7N8) map.get(r10.A00);
                    r4.A02++;
                    r4.A00 += r13.A00;
                    r4.A01 += r13.A01;
                    r4.A03 += r13.A02;
                }
                if (r10.A01) {
                    double d = r13.A00;
                    if (!Double.isNaN(d)) {
                        long j = r13.A02;
                        if (j > 0) {
                            C186568vZ r14 = r10.A05;
                            r14.markerAnnotate(689639794, "timeSpent", j);
                            double d2 = (double) j;
                            r14.markerAnnotate(689639794, "smallFrames", (r13.A01 * 60000.0d) / d2);
                            r14.markerAnnotate(689639794, "largeFrames", (d * 60000.0d) / d2);
                            Integer num2 = r10.A00;
                            if (num2 != null) {
                                r14.markerAnnotate(689639794, "scrollSurface", num2.intValue());
                            }
                            r14.markerEnd(689639794, 2);
                        }
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("scrollperf/surface=");
                A0o.append(r10.A00);
                A0o.append(",duration=");
                A0o.append(r13.A02);
                A0o.append(",largeFrameDrop=");
                A0o.append(r13.A00);
                A0o.append(",smallFrameDrop=");
                A0o.append(r13.A01);
                AnonymousClass0x2.A18(A0o);
            }
            r11.A01.markerEnd(689639794, 2);
            Log.d("scrollperf/stop");
            r9.A01 = 0.0d;
            r9.A00 = 0.0d;
            r9.A02 = 0;
        }
        this.A00 = null;
    }

    public void report() {
        if (this.A02) {
            Map map = this.A06;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                C133936iB r8 = new C133936iB();
                AnonymousClass7N8 r10 = (AnonymousClass7N8) A0w.getValue();
                r8.A03 = Long.valueOf(r10.A03);
                r8.A02 = (Integer) A0w.getKey();
                long j = r10.A03;
                if (j > 0) {
                    double d = (double) j;
                    r8.A00 = Double.valueOf((r10.A01 * 60000.0d) / d);
                    r8.A01 = Double.valueOf((r10.A00 * 60000.0d) / d);
                }
                this.A04.BhD(r8);
            }
            map.clear();
        }
    }

    public AnonymousClass8J1(Context context, AnonymousClass5WR r4, AnonymousClass4FV r5, C186568vZ r6) {
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = new C156907hP(context, r4, new AnonymousClass7IA(this, r6));
    }
}
