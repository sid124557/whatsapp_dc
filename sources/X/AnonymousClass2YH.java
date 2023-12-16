package X;

/* renamed from: X.2YH  reason: invalid class name */
public class AnonymousClass2YH {
    public final C56892sj A00;
    public final C56832sd A01;

    public C30341mI A00(C27991fJ r10, C48742fO r11, C48742fO r12, long j) {
        C56832sd r2;
        int i;
        if (r12 != null) {
            C27991fJ r4 = r10;
            if (this.A00.A0D(r10)) {
                if (r11 == null) {
                    r11 = new C48742fO(0, 0);
                }
                int i2 = r11.A00;
                if (i2 == 0) {
                    if (r12.A00 == 1) {
                        r2 = this.A01;
                        C18260x0.A1R(AnonymousClass001.A0o(), "SystemMessageFactory/newInviteViaLinkUnavailableSystemMessage/gjid=", r10);
                        i = 73;
                    }
                } else if (i2 == 1 && r12.A00 == 0) {
                    r2 = this.A01;
                    C18260x0.A1R(AnonymousClass001.A0o(), "SystemMessageFactory/newInviteViaLinkAvailableAgainSystemMessage/gjid=", r10);
                    i = 74;
                }
                return r2.A06((C620833k) null, r4, (AnonymousClass39T) null, i, j);
            }
        }
        return null;
    }

    public AnonymousClass2YH(C56892sj r1, C56832sd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
