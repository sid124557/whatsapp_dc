package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Oj  reason: invalid class name and case insensitive filesystem */
public class C22521Oj extends C56822sc {
    public final C56972sr A00;
    public final C56792sZ A01;
    public final C56612sH A02;

    public C22521Oj(C56972sr r1, C56792sZ r2, C56612sH r3, C623934v r4) {
        super(r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A0D(boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        int A002 = this.A01.A09.A00();
        if (A002 != 0) {
            Iterator it = AnonymousClass33W.A08.iterator();
            while (it.hasNext()) {
                A0s.add(new AnonymousClass1SH((AnonymousClass33J) null, (String) null, AnonymousClass001.A0m(it), A002, this.A02.A0H(), z));
            }
        }
        return A0s;
    }
}
