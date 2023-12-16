package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3VO  reason: invalid class name */
public final class AnonymousClass3VO implements AnonymousClass4GF {
    public final C183538qC A00;

    public AnonymousClass3VO(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BhW(C624134x r5, C378824k r6) {
        C162457s7.A0J(r5, 0);
        C55592qb r3 = r5.A0l;
        if (AnonymousClass000.A1U(r5.A0A & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) && r3 != null && r3.A07 == null) {
            ((C48992fo) this.A00.get()).A01(r3, r5.A1L);
            if (r6 != null) {
                throw C18260x0.A02(AnonymousClass3VO.class);
            }
        }
    }
}
