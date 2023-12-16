package X;

import java.util.List;

/* renamed from: X.2XS  reason: invalid class name */
public class AnonymousClass2XS {
    public final C43072Qq A00;
    public final List A01;

    public AnonymousClass2XS(C43072Qq r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (C43072Qq r0 : this.A01) {
            A0o.append(r0.A01);
            C18320x8.A1K(A0o);
        }
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(this.A00.A01, A0o, A0M);
        return String.format("CategoryResponse{responseCategoryId=%s, subCategories=%s}", A0M);
    }
}
