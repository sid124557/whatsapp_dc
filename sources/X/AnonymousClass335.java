package X;

/* renamed from: X.335  reason: invalid class name */
public final class AnonymousClass335 {
    public final AnonymousClass1VX A00;
    public final C54322oX A01;
    public final AnonymousClass4FS A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;

    public static final String A00(int i) {
        if (i == 304) {
            return "ALREADY_EXISTS";
        }
        if (i == 429) {
            return "RATE_OVER_LIMIT";
        }
        if (i == 500) {
            return "INTERNAL_SERVER_ERROR";
        }
        if (i == 503) {
            return "SERVICE_UNAVAILABLE";
        }
        if (i == 400) {
            return "BAD_REQUEST";
        }
        if (i == 401) {
            return "NOT_AUTHORIZED";
        }
        if (i == 405) {
            return "REQUEST_NOT_ALLOWED";
        }
        if (i == 406) {
            return "REQUEST_NOT_ACCEPTABLE";
        }
        if (i == 408) {
            return "REQUEST_TIMEOUT";
        }
        if (i == 409) {
            return "CONFLICT";
        }
        if (i == 480) {
            return "PAYLOAD_ENC_DEC";
        }
        if (i != 481) {
            return "UNKNOWN";
        }
        return "TIMESTAMP_EXPIRED";
    }

    public final void A01(AnonymousClass4EJ r5, C54662p5 r6, AnonymousClass24F r7, Runnable runnable, int i) {
        if (i != 405) {
            if (!(i == 406 || i == 408 || i == 429)) {
                if (i != 481) {
                    if (i != 500) {
                        if (i != 503) {
                            return;
                        }
                    }
                } else if (r6.A04()) {
                    runnable.run();
                    return;
                }
            }
            Long A012 = r6.A01();
            if (A012 != null) {
                this.A02.Bkn(runnable, "SupportUserIqErrorHelper/retryOperationWithDelay", A012.longValue());
                return;
            }
        }
        r5.BSB(r7);
    }

    public final void A03(AnonymousClass4EJ r5, AnonymousClass24F r6, AnonymousClass4GP r7) {
        C183538qC r1 = this.A04;
        AnonymousClass30P A0M = C18320x8.A0M(r1);
        C50912iy r3 = AnonymousClass2B8.A00;
        if (A0M.A01(r3) == null) {
            r7.invoke();
        } else {
            C18320x8.A0M(r1).A06(new C85954Ig(r5, r6, r7, 1), r3, (C54662p5) null, (String) null);
        }
    }

    public AnonymousClass335(AnonymousClass1VX r2, C54322oX r3, AnonymousClass4FS r4, C183538qC r5, C183538qC r6, C183538qC r7) {
        C18260x0.A0f(r4, r5, r6, r7, r3);
        C162457s7.A0J(r2, 6);
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A02(AnonymousClass4EJ r5, C54662p5 r6, AnonymousClass24F r7, AnonymousClass4GQ r8) {
        if (!r6.A04() || r6.A03()) {
            r5.BSB(r7);
            return;
        }
        r6.A02();
        C50912iy r3 = AnonymousClass2B8.A00;
        ((C53182mg) this.A03.get()).A01(r3);
        ((C59532x4) this.A05.get()).A01(r3, new AnonymousClass28A(r5, 1, r8));
    }
}
