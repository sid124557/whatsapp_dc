package X;

/* renamed from: X.2fl  reason: invalid class name and case insensitive filesystem */
public final class C48962fl {
    public final AnonymousClass4FC A00;
    public final C29321id A01;
    public final boolean A02;

    public AnonymousClass4FC A00() {
        AnonymousClass4FC r0;
        if (this.A02 && (r0 = this.A00) != null) {
            return r0;
        }
        throw AnonymousClass0x9.A0i("no active session");
    }

    public boolean A01(C95814uZ r3) {
        AnonymousClass4FC r0;
        if (!this.A02 || (r0 = this.A00) == null || !AnonymousClass75J.A00(r0.getChatJid(), r3) || this.A01.A09()) {
            return false;
        }
        return true;
    }

    public C48962fl(AnonymousClass4FC r1, C29321id r2, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = r2;
    }
}
