package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8NM  reason: invalid class name */
public final class AnonymousClass8NM implements Comparator {
    public final boolean A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C153247av r3 = ((AnonymousClass7W9) obj).A00;
        C153247av r10 = ((AnonymousClass7W9) obj2).A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = r3.A01;
        TimeUnit timeUnit2 = r3.A02;
        long convert = timeUnit.convert(j, timeUnit2);
        long convert2 = timeUnit.convert(r3.A00, timeUnit2);
        long j2 = r10.A01;
        TimeUnit timeUnit3 = r10.A02;
        long convert3 = timeUnit.convert(j2, timeUnit3);
        long convert4 = timeUnit.convert(r10.A00, timeUnit3);
        if (this.A00) {
            int compare = Long.compare(convert, convert3);
            if (compare == 0) {
                return Long.compare(convert2, convert4);
            }
            return compare;
        }
        int compare2 = Long.compare(convert2, convert4);
        if (compare2 == 0) {
            return Long.compare(convert, convert3);
        }
        return compare2;
    }

    public AnonymousClass8NM(boolean z) {
        this.A00 = z;
    }
}
