package X;

import java.util.Map;

/* renamed from: X.9dd  reason: invalid class name and case insensitive filesystem */
public final class C197639dd implements AnonymousClass4DR {
    public final AnonymousClass5ZR A00;
    public final AnonymousClass9VY A01;

    public C197639dd(AnonymousClass5ZR r2, AnonymousClass9VY r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        AnonymousClass9KH r4 = (AnonymousClass9KH) enumR;
        C162457s7.A0J(r4, 1);
        if (r4.ordinal() != 4 || !this.A00.A0F()) {
            return null;
        }
        int A012 = this.A01.A01();
        if (A012 == 0) {
            return "INSTALLED";
        }
        if (A012 != 1) {
            return "INCORRECT_SIM_SELECTED";
        }
        return "NOT_INSTALLED";
    }

    public Class B3E() {
        return AnonymousClass9KH.class;
    }
}
