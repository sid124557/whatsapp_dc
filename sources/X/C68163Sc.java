package X;

/* renamed from: X.3Sc  reason: invalid class name and case insensitive filesystem */
public final class C68163Sc implements AnonymousClass4EZ {
    public C49982hR A00;
    public final AnonymousClass31C A01;

    public void BSN(AnonymousClass36K r4, String str) {
        C162457s7.A0J(r4, 1);
        AnonymousClass36K A0l = r4.A0l("error");
        if (A0l != null) {
            C18260x0.A0x("error getting 1on1 invite code ", AnonymousClass001.A0o(), AnonymousClass36K.A01(A0l, "code"));
        }
        C49982hR r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void BdM(AnonymousClass36K r3, String str) {
        String A0L;
        C162457s7.A0J(r3, 1);
        AnonymousClass36K A0l = r3.A0l("invite");
        if (A0l == null || (A0L = AnonymousClass36K.A0L(A0l, "code")) == null) {
            C49982hR r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C49982hR r02 = this.A00;
        if (r02 != null) {
            r02.A01(A0L);
        }
    }

    public void BQs(String str) {
        C49982hR r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public C68163Sc(AnonymousClass31C r1) {
        this.A01 = r1;
    }
}
