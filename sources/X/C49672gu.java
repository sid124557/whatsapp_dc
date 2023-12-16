package X;

/* renamed from: X.2gu  reason: invalid class name and case insensitive filesystem */
public final class C49672gu {
    public final AnonymousClass4FS A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public final void A00(AnonymousClass4EJ r5, C54662p5 r6, AnonymousClass24F r7, Runnable runnable, int i) {
        C18270x1.A11(r6, 2, r5);
        if (!(i == 400 || i == 405)) {
            if (!(i == 408 || i == 429)) {
                if (i != 481) {
                    if (i != 500) {
                        if (i != 503) {
                            return;
                        }
                    }
                } else if (r6.A04()) {
                    this.A00.BkP(new C71273bq((Object) runnable, 5));
                    return;
                }
            }
            Long A012 = r6.A01();
            if (A012 != null) {
                this.A00.Bkn(runnable, "AvatarUserIqErrorHelper/retryOperationWithBackoff", A012.longValue());
                return;
            }
        }
        r5.BSB(r7);
    }

    public final void A01(AnonymousClass4EJ r10, C54662p5 r11, AnonymousClass24F r12, Runnable runnable, AnonymousClass4GP r14, AnonymousClass4GQ r15) {
        AnonymousClass4EJ r4 = r10;
        C54662p5 r5 = r11;
        C18260x0.A0R(r11, r10);
        AnonymousClass24F r6 = r12;
        int A012 = C57492tj.A01(r12.node);
        if (A012 == 401 || A012 == 409) {
            C18320x8.A0M(this.A02).A06(new C85954Ig(r10, r12, r14, 2), AnonymousClass2BB.A00, (C54662p5) null, (String) null);
        } else if (A012 != 480) {
            A00(r4, r5, r6, runnable, A012);
        } else {
            AnonymousClass28A r2 = new AnonymousClass28A(r10, 2, r15);
            if (!r11.A04() || r11.A03()) {
                r2.BSB(r12);
                return;
            }
            r11.A02();
            C50912iy r1 = AnonymousClass2BB.A00;
            ((C53182mg) this.A01.get()).A01(r1);
            ((C59532x4) this.A03.get()).A01(r1, r2);
        }
    }

    public C49672gu(AnonymousClass4FS r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        C18260x0.A0c(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
