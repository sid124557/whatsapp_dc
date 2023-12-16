package X;

/* renamed from: X.3GL  reason: invalid class name */
public final class AnonymousClass3GL implements C836849j {
    public final C66663Mh A00;
    public final C54292oU A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass2W1 A03;

    public void BYP(C134256ih r11) {
        C162457s7.A0J(r11, 0);
        r11.A0n = this.A03.A00();
        AnonymousClass33p r9 = this.A02;
        r11.A0W = Boolean.valueOf(r9.A2G());
        C183538qC r2 = r9.A01;
        C18260x0.A0M(r9, "xmpp:lifecycle_worker_runtime_seconds", 0);
        C18260x0.A0M(r9, "xmpp:logout_worker_runtime_seconds", 0);
        C18260x0.A0M(r9, "xmpp:combined_worker_runtime_seconds", 0);
        r11.A0k = Long.valueOf(C18300x5.A0B(r2).getLong("xmpp:lifecycle_worker_runtime_seconds", 0) + C18300x5.A0B(r2).getLong("xmpp:logout_worker_runtime_seconds", 0) + C18300x5.A0B(r2).getLong("xmpp:combined_worker_runtime_seconds", 0));
        try {
            if (this.A00.A08(C66663Mh.A0t)) {
                AnonymousClass2XM A002 = C158157jW.A00(this.A01.A00);
                if (!A002.A01) {
                    r11.A1L = A002.A00;
                }
            }
        } catch (Throwable th) {
            AnonymousClass3Z0.A01(th);
        }
    }

    public AnonymousClass3GL(C66663Mh r1, C54292oU r2, AnonymousClass33p r3, AnonymousClass2W1 r4) {
        C18260x0.A0c(r2, r1, r3, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
