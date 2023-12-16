package X;

/* renamed from: X.3D7  reason: invalid class name */
public final class AnonymousClass3D7 implements AnonymousClass66U {
    public final C67823Qu A00;

    public AnonymousClass3D7(C67823Qu r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BMd() {
        C67823Qu r5 = this.A00;
        if (C18270x1.A1V(r5.A0M)) {
            AnonymousClass33p r2 = r5.A0C;
            int A02 = C18280x3.A02(AnonymousClass0x2.A0F(r2), "unacked_offline_stanzas_count_while_disconnected");
            if (A02 > 0) {
                C18260x0.A0L(r2, "unacked_offline_stanzas_count_while_disconnected", 0);
                r5.A0A.A0A("app-started-with-unprocessed-offline-msgs", false, AnonymousClass000.A0Y("unacked-offline-stanzas: ", AnonymousClass001.A0o(), A02));
            }
        }
    }

    public String BDW() {
        return "XmppAsyncInit";
    }

    public /* synthetic */ void BMe() {
    }
}
