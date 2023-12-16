package X;

/* renamed from: X.2md  reason: invalid class name and case insensitive filesystem */
public final class C53152md {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final C49652gs A03;
    public final C73853gB A04;

    public final C41552Kr A00(boolean z) {
        String str;
        if (z) {
            str = "EMOJI";
        } else {
            str = "GIFS";
        }
        String string = AnonymousClass0x2.A0F(this.A01).getString("expressions_keyboard_selected_tab", str);
        C162457s7.A0D(string);
        int ordinal = AnonymousClass22A.valueOf(string).ordinal();
        if (ordinal == 0) {
            return AnonymousClass1TZ.A00;
        }
        if (ordinal == 1) {
            return AnonymousClass1Ta.A00;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw C73153f1.A00();
            }
        } else if (this.A03.A01() || (!this.A00.A0Y() && this.A02.A0Y(C58422vE.A02, 4890))) {
            return AnonymousClass1TY.A00;
        }
        return AnonymousClass1Tb.A00;
    }

    public C53152md(C56972sr r1, AnonymousClass33p r2, AnonymousClass1VX r3, C49652gs r4, C73853gB r5) {
        C18260x0.A0c(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
