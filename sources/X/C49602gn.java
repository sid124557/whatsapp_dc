package X;

import java.util.Objects;

/* renamed from: X.2gn  reason: invalid class name and case insensitive filesystem */
public class C49602gn {
    public C135276kP A00;
    public C135276kP A01;
    public final AnonymousClass7E4 A02;
    public final C47622dY A03;

    public final C135276kP A00(C633138t r2) {
        if (r2 == C633138t.A0C || r2 == C633138t.A0j || r2 == C633138t.A0H || r2 == C633138t.A0Z || r2 == C633138t.A07 || r2 == C633138t.A0M || r2 == C633138t.A08 || r2 == C633138t.A0R || r2 == C633138t.A0F) {
            return this.A00;
        }
        return this.A01;
    }

    public C49602gn(C47622dY r6, AnonymousClass4FS r7) {
        this.A03 = r6;
        AnonymousClass7E4 r2 = new AnonymousClass7E4(r7);
        this.A02 = r2;
        Objects.requireNonNull(r2);
        this.A00 = new C135276kP(r6, new C72333dY((Object) null, new AnonymousClass934(r2, 16)));
        C47622dY r3 = this.A03;
        AnonymousClass7E4 r22 = this.A02;
        Objects.requireNonNull(r22);
        this.A01 = new C135276kP(r3, new C72333dY((Object) null, new AnonymousClass934(r22, 17)));
    }

    public void A01(AnonymousClass7UI r3, C633138t r4) {
        A00(r4).A02(r3.A02, r3);
    }
}
