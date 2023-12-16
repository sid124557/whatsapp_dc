package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2y2  reason: invalid class name and case insensitive filesystem */
public final class C60122y2 {
    public final List A00;
    public final Map A01;
    public final Map A02;
    public final Set A03;

    public final long A00(AnonymousClass21M r3) {
        C162457s7.A0J(r3, 0);
        Map map = this.A02;
        C162457s7.A0J(map, 0);
        return C18310x6.A0B(C57692u3.A02(map, r3));
    }

    public final Long A01(AnonymousClass21M r7, C95814uZ r8) {
        C162457s7.A0J(r7, 0);
        Map map = this.A01;
        C162457s7.A0J(map, 0);
        long indexOf = (long) ((List) C57692u3.A02(map, r7)).indexOf(r8);
        Long valueOf = Long.valueOf(indexOf);
        if (indexOf == -1) {
            return null;
        }
        return valueOf;
    }

    public C60122y2(int i, boolean z) {
        this.A01 = C18320x8.A0r();
        this.A02 = C57692u3.A05(C18320x8.A0r(), AnonymousClass44Y.A00);
        this.A03 = AnonymousClass0x9.A17();
        this.A00 = AnonymousClass001.A0s();
        for (AnonymousClass21M put : AnonymousClass21M.values()) {
            this.A01.put(put, AnonymousClass001.A0s());
        }
    }

    public C60122y2() {
        this(0, true);
    }
}
