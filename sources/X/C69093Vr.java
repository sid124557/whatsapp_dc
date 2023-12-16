package X;

/* renamed from: X.3Vr  reason: invalid class name and case insensitive filesystem */
public final class C69093Vr implements AnonymousClass4GG {
    public final C183538qC A00;

    public C69093Vr(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BhW(C624134x r5, C378824k r6) {
        C162457s7.A0J(r5, 0);
        if (C624134x.A0c(r5)) {
            ((AnonymousClass35R) this.A00.get()).A07(r5, "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?", r5.A1L);
            if (r6 != null) {
                throw C18260x0.A02(C69093Vr.class);
            }
        }
    }
}
