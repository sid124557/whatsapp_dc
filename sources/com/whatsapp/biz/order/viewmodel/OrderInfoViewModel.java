package com.whatsapp.biz.order.viewmodel;

import X.AnonymousClass08N;
import X.AnonymousClass5TF;
import X.C108635dJ;
import X.C160617ny;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C39192Ba;
import X.C56972sr;
import X.C57952uT;
import X.C620733j;
import X.C829745q;
import android.app.Application;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

public final class OrderInfoViewModel extends AnonymousClass08N {
    public final C56972sr A00;
    public final C620733j A01;

    public final String A0D(AnonymousClass5TF r5, List list) {
        C160617ny r3;
        if (list.isEmpty()) {
            r3 = null;
        } else {
            r3 = ((C108635dJ) list.get(0)).A01;
        }
        BigDecimal A012 = A01(list);
        if (r3 == null || A012 == null) {
            return null;
        }
        if (r5 != null) {
            A012 = A00(r5, r3, A012);
        }
        return r3.A04(this.A01, A012, true);
    }

    public static final BigDecimal A00(AnonymousClass5TF r3, C160617ny r4, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        long j;
        float f;
        if (r3.A00 != 1) {
            int scale = bigDecimal.scale();
            String str = r3.A03;
            Float f2 = null;
            try {
                if (C18280x3.A1X(str, C39192Ba.A00.nativePattern)) {
                    f2 = Float.valueOf(Float.parseFloat(str));
                    if (f2 != null) {
                        f = f2.floatValue();
                        bigDecimal2 = bigDecimal.subtract(bigDecimal.multiply(BigDecimal.valueOf((double) (f / 100.0f)))).setScale(scale, RoundingMode.UP);
                    }
                }
            } catch (NumberFormatException unused) {
            }
            f = 0.0f;
            bigDecimal2 = bigDecimal.subtract(bigDecimal.multiply(BigDecimal.valueOf((double) (f / 100.0f)))).setScale(scale, RoundingMode.UP);
        } else {
            Long A07 = C829745q.A07(r3.A03);
            if (A07 != null) {
                j = A07.longValue();
            } else {
                j = 0;
            }
            BigDecimal A002 = C57952uT.A00(r4, j);
            if (bigDecimal.compareTo(A002) > 0) {
                bigDecimal2 = bigDecimal.subtract(A002);
            } else {
                bigDecimal2 = BigDecimal.ZERO.setScale(bigDecimal.scale(), RoundingMode.UP);
            }
        }
        C162457s7.A0H(bigDecimal2);
        return bigDecimal2;
    }

    public static final BigDecimal A01(List list) {
        C160617ny r1;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Iterator it = list.iterator();
        C160617ny r4 = null;
        while (true) {
            if (it.hasNext()) {
                C108635dJ r3 = (C108635dJ) it.next();
                BigDecimal bigDecimal2 = r3.A02;
                if (bigDecimal2 == null || (r1 = r3.A01) == null || (r4 != null && !r1.equals(r4))) {
                    break;
                }
                r4 = r1;
                bigDecimal = bigDecimal.add(bigDecimal2.multiply(new BigDecimal(r3.A00)));
            } else if (r4 == null || C162457s7.A0P(bigDecimal, BigDecimal.ZERO)) {
                return null;
            } else {
                return bigDecimal;
            }
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderInfoViewModel(Application application, C56972sr r2, C620733j r3) {
        super(application);
        C18260x0.A0V(application, r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
