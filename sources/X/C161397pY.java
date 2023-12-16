package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7pY  reason: invalid class name and case insensitive filesystem */
public class C161397pY {
    public static final int[] A0A;
    public long A00;
    public boolean A01;
    public final long A02;
    public final C1445071v A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final AnonymousClass7S3[] A09;

    static {
        int[] iArr = new int[19];
        A0A = iArr;
        iArr[0] = 8000;
        iArr[1] = 0;
        iArr[2] = 500;
        iArr[3] = 2000;
        iArr[4] = 500;
        iArr[5] = 2000;
        iArr[6] = 500;
        iArr[7] = 2000;
        iArr[8] = 8000;
        iArr[9] = 500;
        iArr[10] = 30000;
        iArr[11] = 30000;
        iArr[16] = 1;
        iArr[17] = 1;
        iArr[18] = 1;
    }

    public static AnonymousClass7S3 A00(AnonymousClass8Kx r1) {
        if (r1 != null) {
            return new AnonymousClass7S3(r1);
        }
        return null;
    }

    public final int A01(int i) {
        C142066wa r0;
        AnonymousClass7S3 r5;
        C160307nP r52;
        long j;
        AnonymousClass7S3[] r7 = this.A09;
        if (r7[i] == null) {
            return A0A[i];
        }
        if (this.A01 && this.A03 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A00 > this.A02) {
                long j2 = -1;
                if (this.A06) {
                    boolean z = this.A07;
                    synchronized (C160307nP.class) {
                        r52 = C160307nP.A07;
                        if (r52 == null) {
                            r52 = new C160307nP(C186588vc.A00);
                            C160307nP.A07 = r52;
                        }
                    }
                    if (z) {
                        j = r52.A00((AbrContextAwareConfiguration) null).A00;
                    } else {
                        synchronized (r52) {
                            j = r52.A02;
                        }
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                }
                List list = this.A05;
                if (j2 >= 0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r0 = C142066wa.EXCELLENT;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        if (j2 < ((long) C18290x4.A03(pair))) {
                            r0 = (C142066wa) pair.first;
                            break;
                        }
                    }
                } else {
                    r0 = C142066wa.UNKNOWN;
                }
                int i2 = 0;
                do {
                    if ((!this.A08 || i2 != 1) && (r5 = r7[i2]) != null) {
                        AnonymousClass8Kx r2 = r5.A01;
                        if (!r2.useNetworkQuality || !r2.useNetworkType) {
                            r5.A00(r0);
                        } else if (!r2.useNetworkQualityWifiOnly && r0 != C142066wa.UNKNOWN) {
                            r5.A00(r0);
                        }
                        if (r2.useNetworkType) {
                            r5.A00 = r2.defaultValue;
                        }
                    }
                    i2++;
                } while (i2 < 19);
                this.A00 = elapsedRealtime;
            }
        }
        return r7[i].A00;
    }

    public C161397pY(AnonymousClass8LG r15, C1445071v r16) {
        AnonymousClass7S3[] r5 = new AnonymousClass7S3[19];
        this.A09 = r5;
        int i = 0;
        this.A01 = false;
        this.A08 = r15.useLatencyForSegmentConcat;
        this.A06 = r15.useAccumulatorForBw;
        this.A07 = r15.useBwBpsForConnectionQuality;
        Pair[] pairArr = new Pair[4];
        C142066wa r12 = C142066wa.DEGRADED;
        AnonymousClass8Kx r6 = r15.latencyBoundMsConfig;
        pairArr[0] = C18290x4.A0K(r12, r6.degradedValue);
        C142066wa r11 = C142066wa.POOR;
        pairArr[1] = C18290x4.A0K(r11, r6.poorValue);
        C142066wa r10 = C142066wa.MODERATE;
        pairArr[2] = C18290x4.A0K(r10, r6.moderateValue);
        C142066wa r8 = C142066wa.GOOD;
        this.A04 = Collections.unmodifiableList(AnonymousClass0x9.A1A(C18290x4.A0K(r8, r6.goodValue), pairArr, 3));
        Pair[] pairArr2 = new Pair[4];
        AnonymousClass8Kx r9 = r15.qualityMapperBoundMsConfig;
        pairArr2[0] = C18290x4.A0K(r12, r9.degradedValue);
        pairArr2[1] = C18290x4.A0K(r11, r9.poorValue);
        pairArr2[2] = C18290x4.A0K(r10, r9.moderateValue);
        this.A05 = Collections.unmodifiableList(AnonymousClass0x9.A1A(C18290x4.A0K(r8, r9.goodValue), pairArr2, 3));
        r5[0] = A00(r15.fetchHttpReadTimeoutMsConfig);
        r5[1] = A00(r15.concatenatedMsPerLoadConfig);
        r5[2] = A00(r15.minBufferMsConfig);
        r5[3] = A00(r15.minRebufferMsConfig);
        r5[4] = A00(r15.liveMinBufferMsConfig);
        r5[5] = A00(r15.liveMinRebufferMsConfig);
        r5[12] = A00(r15.liveAPIMinBufferMsConfig);
        r5[13] = A00(r15.liveAPIMinRebufferMsConfig);
        r5[14] = A00(r15.livePremiumMinBufferMsConfig);
        r5[15] = A00(r15.livePremiumMinRebufferMsConfig);
        r5[6] = A00(r15.fbstoriesMinBufferMsConfig);
        r5[7] = A00(r15.fbstoriesMinRebufferMsConfig);
        r5[8] = A00(r15.fetchCacheSourceHttpConnectTimeoutMsConfig);
        r5[9] = A00(r15.minMicroRebufferMsConfig);
        r5[10] = A00(r15.wifiMaxWatermarkMsConfig);
        r5[11] = A00(r15.cellMaxWatermarkMsConfig);
        r5[16] = A00(r15.networkAwareDisableSecondPhasePrefetch);
        r5[17] = A00(r15.networkAwarePrefetchTaskQueueWorkerNum);
        r5[18] = A00(r15.networkAwareHttpPriorityIncrementalForStreaming);
        while (true) {
            if (this.A09[i] == null) {
                i++;
                if (i >= 19) {
                    break;
                }
            } else {
                this.A01 = true;
                break;
            }
        }
        this.A03 = r16;
        this.A02 = r15.minDelayToRefreshTigonBitrateMs;
    }

    public C161397pY() {
        this(AnonymousClass8LG.A01, (C1445071v) null);
    }
}
