package X;

import android.util.Pair;
import com.facebook.debug.tracer.Tracer;
import java.util.Locale;
import java.util.NavigableSet;

/* renamed from: X.0UP  reason: invalid class name */
public class AnonymousClass0UP {
    public int A00;
    public int A01;
    public long A02 = -1;
    public long A03 = Long.MAX_VALUE;
    public Pair A04;
    public Long A05;
    public Long A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C160777oI A0A;
    public final String A0B;

    public static Pair A00(NavigableSet navigableSet) {
        long j;
        long j2 = -1;
        if (navigableSet != null) {
            long j3 = ((C172488Li) navigableSet.first()).A05;
            C172488Li r1 = (C172488Li) navigableSet.last();
            if (!r1.A02()) {
                j2 = r1.A05 + r1.A04;
            }
            j = j2;
            j2 = j3;
        } else {
            j = -1;
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(j));
    }

    public C142146wi A01() {
        boolean z = this.A09;
        if (z && this.A01 == 0) {
            return C142146wi.CACHE_HIT;
        }
        int i = this.A00;
        if (!z) {
            if (i == 0 && this.A01 > 0) {
                return C142146wi.CACHE_MISS;
            }
        } else if (i == 0 && this.A01 > 0) {
            return C142146wi.CACHE_PARTIAL_MISS;
        } else {
            if (i > 0 && this.A01 > 0) {
                return C142146wi.CACHE_PARTIAL_HIT;
            }
        }
        return C142146wi.CACHE_UNKNOWN;
    }

    public void A02() {
        Tracer.A01("VideoRequestEvent.onException");
        try {
            this.A08 = true;
        } finally {
            Tracer.A00();
        }
    }

    public void A03(long j, long j2) {
        Tracer.A01("VideoRequestEvent.onOpenCacheDataSource");
        try {
            this.A00++;
            if (this.A03 > j) {
                this.A03 = j;
            }
            long j3 = j + j2;
            if (this.A02 < j3) {
                this.A02 = j3;
            }
        } finally {
            Tracer.A00();
        }
    }

    public void A04(long j, long j2) {
        Tracer.A01("VideoRequestEvent.onOpenHttpDataStream");
        try {
            this.A01++;
            if (this.A03 > j) {
                this.A03 = j;
            }
            long j3 = j + j2;
            if (this.A02 < j3) {
                this.A02 = j3;
            }
        } finally {
            Tracer.A00();
        }
    }

    public void A05(AnonymousClass0Py r8, C187478xH r9) {
        Tracer.A01("VideoRequestEvent.onOpen");
        try {
            long j = r8.A02;
            this.A06 = Long.valueOf(j);
            long j2 = r8.A01;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j + j2;
            }
            this.A05 = Long.valueOf(j3);
            String str = r8.A06;
            this.A07 = str;
            NavigableSet B55 = r9.B55(str);
            this.A09 = AnonymousClass000.A1W(B55);
            this.A04 = A00(B55);
        } finally {
            Tracer.A00();
        }
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        AnonymousClass001.A1R(objArr, this.A09);
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass000.A1N(objArr, this.A00);
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02));
        return String.format(locale, "isKeyCached=%s, mNetworkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", objArr);
    }

    public AnonymousClass0UP(C160777oI r3, String str) {
        this.A0A = r3;
        this.A0B = str;
    }
}
