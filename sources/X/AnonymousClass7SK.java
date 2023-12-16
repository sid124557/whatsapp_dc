package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.7SK  reason: invalid class name */
public final class AnonymousClass7SK {
    public final C55682qk A00;
    public final C66493Lq A01;

    public C60802zB A00(AnonymousClass3YS r9, AnonymousClass36K r10) {
        C149067Ku r4 = new C149067Ku(this.A00, this.A01);
        C35721xK r5 = (C35721xK) r9.A02.getValue();
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C139756sZ r0 = new C139756sZ(r10, r5);
            ArrayList A0s2 = AnonymousClass001.A0s();
            LinkedHashMap A0r = C18320x8.A0r();
            for (C138956rH r02 : (Iterable) r0.A01) {
                ((C183418q0) r02.A01).Aw2(new C149057Kt(r4, A0s2, A0r));
            }
            C60802zB r2 = new C60802zB(C73723fy.A0F(A0s2), C73813g7.A0D(A0r));
            r4.A00 = r2;
            return r2;
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("BatchGetGroupInfoResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C139266rm r22 = (C139266rm) new C139776sb(r10, r5, 6).A00;
                C162457s7.A0D(r22);
                C60802zB r23 = new C60802zB(String.valueOf(r22.B5b().longValue()), r22.BDZ());
                r4.A00 = r23;
                return r23;
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("BatchGetGroupInfoResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    C184618sE r24 = (C184618sE) ((C138956rH) new C139746sY(r10, r5, 0).A00).A00;
                    C162457s7.A0D(r24);
                    C60802zB r25 = new C60802zB(String.valueOf(r24.B5b().longValue()), r24.BDZ());
                    r4.A00 = r25;
                    return r25;
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("BatchGetGroupInfoResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }

    public AnonymousClass7SK(C55682qk r1, C66493Lq r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
