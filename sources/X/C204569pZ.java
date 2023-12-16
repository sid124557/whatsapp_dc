package X;

import java.util.Comparator;

/* renamed from: X.9pZ  reason: invalid class name and case insensitive filesystem */
public class C204569pZ implements Comparator {
    public Object A00;
    public final int A01;

    public C204569pZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.A01 != 0) {
            C166587yw r11 = (C166587yw) obj2;
            C133786hw r0 = (C133786hw) ((C166587yw) obj).A08;
            long j = Long.MAX_VALUE;
            if (r0 != null) {
                long j2 = r0.A06;
                if (j2 >= 0) {
                    j = j2;
                }
            }
            C133786hw r02 = (C133786hw) r11.A08;
            long j3 = Long.MAX_VALUE;
            if (r02 != null) {
                long j4 = r02.A06;
                if (j4 >= 0) {
                    j3 = j4;
                }
            }
            return Long.compare(j, j3);
        }
        AnonymousClass9V8 r10 = (AnonymousClass9V8) obj;
        AnonymousClass9V8 r112 = (AnonymousClass9V8) obj2;
        boolean z = r10.A01;
        boolean z2 = r112.A01;
        if (z == z2) {
            return r10.A02 - r112.A02;
        }
        if (z2) {
            return -1;
        }
        return 1;
    }
}
