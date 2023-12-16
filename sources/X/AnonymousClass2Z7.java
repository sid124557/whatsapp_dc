package X;

/* renamed from: X.2Z7  reason: invalid class name */
public final class AnonymousClass2Z7 {
    public AnonymousClass30P A00;
    public AnonymousClass4FS A01;

    public final void A00(C54662p5 r6, C84244Bp r7, C27111dI r8, Runnable runnable) {
        boolean A1U = C18270x1.A1U(r8, r6);
        AnonymousClass30P r1 = this.A00;
        if (r1 != null) {
            C60272yH A012 = r1.A01(AnonymousClass2BX.A00);
            if (A012 == null) {
                r7.onError(A1U ? 1 : 0);
                return;
            }
            Object A002 = r8.A00((Object) null);
            C626936e.A06(A002);
            Number number = (Number) A002;
            if (number != null) {
                int intValue = number.intValue();
                if (intValue != 3489016) {
                    if (intValue == 3489018) {
                        if (r6.A04()) {
                            AnonymousClass30P r2 = this.A00;
                            if (r2 != null) {
                                r2.A02(A012, new C85954Ig(r7, number, runnable, 3), r6);
                                return;
                            }
                            throw C18270x1.A0S("fbUserEntityManagement");
                        }
                    } else if (intValue == 3489017) {
                        if (r6.A04()) {
                            AnonymousClass30P r22 = this.A00;
                            if (r22 != null) {
                                r22.A03(A012, new C85954Ig(r7, number, runnable, 4), r6);
                                return;
                            }
                            throw C18270x1.A0S("fbUserEntityManagement");
                        }
                    } else if (intValue == 3489014) {
                        Long A013 = r6.A01();
                        if (A013 != null) {
                            AnonymousClass4FS r3 = this.A01;
                            if (r3 != null) {
                                r3.Bkn(runnable, "WaffleGraphqlErrorHandler/retryWithBackoff", A013.longValue());
                                return;
                            }
                            throw C18270x1.A0S("waWorkers");
                        }
                    }
                }
                r7.onError(intValue);
                return;
            }
            C162457s7.A0H(number);
            r7.onError(number.intValue());
            return;
        }
        throw C18270x1.A0S("fbUserEntityManagement");
    }
}
