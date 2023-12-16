package X;

import java.util.List;

/* renamed from: X.4zR  reason: invalid class name and case insensitive filesystem */
public final class C97894zR extends C156137g5 implements AnonymousClass659 {
    public final AnonymousClass3ZH A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97894zR(AnonymousClass3ZH r2, List list) {
        super(r2, 38);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = list;
    }

    public C95814uZ B8o() {
        return AnonymousClass3ZH.A01(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InvitableContactListItem{contact=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
