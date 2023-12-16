package X;

import java.util.Set;

/* renamed from: X.5gl  reason: invalid class name and case insensitive filesystem */
public final class C110625gl implements C17190ui {
    public final AnonymousClass08Y A00;
    public final C17190ui A01;
    public final Set A02;

    public C05550Ty Azr(Class cls) {
        if (this.A02.contains(cls.getName())) {
            return this.A00.Azr(cls);
        }
        return this.A01.Azr(cls);
    }

    public C05550Ty B09(AnonymousClass0N3 r3, Class cls) {
        if (this.A02.contains(cls.getName())) {
            return this.A00.B09(r3, cls);
        }
        return this.A01.B09(r3, cls);
    }

    public C110625gl(C17190ui r2, AnonymousClass5W6 r3, Set set) {
        this.A02 = set;
        this.A01 = r2;
        this.A00 = new C87534Th(r3, this);
    }
}
