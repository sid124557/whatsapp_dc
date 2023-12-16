package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass71T;
import X.AnonymousClass8TP;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

public class VideoBandwidthEstimate {
    public static final Map A08 = new AnonymousClass8TP();
    public long A00;
    public AbrContextAwareConfiguration A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.A05 = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A00 = j4;
        this.A04 = j5;
        this.A03 = j6;
        this.A02 = i;
        this.A01 = abrContextAwareConfiguration;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("ttfb=");
        A0o2.append(this.A05);
        AnonymousClass000.A1B(A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(", bw=");
        A0o3.append(this.A00 / 1000);
        AnonymousClass000.A1B(A0o3, A0o);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append(", ttfb_s=");
        A0o4.append(this.A06);
        AnonymousClass000.A1B(A0o4, A0o);
        StringBuilder A0o5 = AnonymousClass001.A0o();
        A0o5.append(", bw_s=");
        A0o5.append(this.A03 / 1000);
        AnonymousClass000.A1B(A0o5, A0o);
        StringBuilder A0o6 = AnonymousClass001.A0o();
        A0o6.append(", s=");
        A0o6.append(this.A02);
        AnonymousClass000.A1B(A0o6, A0o);
        synchronized (AnonymousClass71T.class) {
        }
        return A0o.toString();
    }

    public VideoBandwidthEstimate() {
        this.A05 = -1;
        this.A07 = -1;
        this.A06 = -1;
        this.A00 = -1;
        this.A04 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = null;
    }
}
