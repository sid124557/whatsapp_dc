package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7Tp  reason: invalid class name and case insensitive filesystem */
public class C151147Tp {
    public AnonymousClass71U A00;
    public C154707dc A01;
    public C835348u A02;
    public final AnonymousClass8DE A03 = new AnonymousClass8DE();
    public final List A04;

    public C151147Tp(AnonymousClass71U r2, C154707dc r3, C835348u r4, List list) {
        if (r4 instanceof AnonymousClass8DG) {
            this.A02 = r4;
        } else {
            this.A02 = new AnonymousClass8DG(r4);
        }
        this.A00 = r2;
        if (list == null) {
            this.A04 = Collections.emptyList();
        } else {
            this.A04 = list;
        }
        this.A01 = r3;
    }
}
