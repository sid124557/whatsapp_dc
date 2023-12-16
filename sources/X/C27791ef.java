package X;

/* renamed from: X.1ef  reason: invalid class name and case insensitive filesystem */
public class C27791ef extends C50432iA {
    public final AnonymousClass33p A00;

    public C27791ef(C29441ip r11, C56612sH r12, AnonymousClass33p r13, C620733j r14, C67463Pj r15, C67483Pl r16, C67523Pp r17, AnonymousClass4FV r18, C52512lb r19, AnonymousClass4FS r20) {
        super(r11, r12, r14, r18, r15, r16, r17, r19, r20);
        this.A00 = r13;
    }

    public C58852vv A00() {
        if (C18280x3.A02(AnonymousClass0x2.A0F(this.A00), "emoji_search_algorithm_version") == 2) {
            return super.A00();
        }
        return new C58852vv();
    }

    public boolean A01(C58852vv r5) {
        boolean A01 = super.A01(r5);
        if (A01) {
            C18270x1.A0h(C18270x1.A03(this.A00), "emoji_search_algorithm_version", 2);
        }
        return A01;
    }
}
