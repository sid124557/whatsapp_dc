package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ws  reason: invalid class name and case insensitive filesystem */
public class C59412ws {
    public final List A00;
    public final List A01;
    public final List A02;

    public C59412ws() {
        ArrayList A0I = AnonymousClass002.A0I(3);
        AnonymousClass0x2.A1Q(A0I, 1024);
        AnonymousClass0x2.A1Q(A0I, 10240);
        AnonymousClass0x2.A1Q(A0I, 102400);
        ArrayList A0I2 = AnonymousClass002.A0I(3);
        AnonymousClass0x2.A1Q(A0I2, 1048576);
        AnonymousClass0x2.A1Q(A0I2, 10485760);
        AnonymousClass0x2.A1Q(A0I2, 104857600);
        ArrayList A0I3 = AnonymousClass002.A0I(3);
        AnonymousClass0x2.A1Q(A0I3, 10);
        AnonymousClass0x2.A1Q(A0I3, 100);
        AnonymousClass0x2.A1Q(A0I3, 1000);
        this.A00 = A0I;
        this.A01 = A0I2;
        this.A02 = A0I3;
    }

    public long A01(long j) {
        List list = this.A01;
        if (list.size() >= 2) {
            long A0B = C18310x6.A0B(C18290x4.A0k(list));
            int i = 1;
            while (i < list.size()) {
                long A0B2 = C18310x6.A0B(list.get(i));
                if (j <= A0B2) {
                    break;
                }
                i++;
                A0B = A0B2;
            }
            return Math.round((((double) j) * 1.0d) / ((double) A0B)) * A0B;
        }
        throw AnonymousClass001.A0c("Expected more than 1 bucket");
    }

    public static long A00(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long A022 = C18270x1.A02(it);
            if (j < A022) {
                break;
            }
            j = (j / A022) * A022;
        }
        return j;
    }
}
