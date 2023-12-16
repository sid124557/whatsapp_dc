package X;

/* renamed from: X.2iz  reason: invalid class name and case insensitive filesystem */
public abstract class C50922iz {
    public boolean A00;

    public void A03() {
        if (this instanceof C26481cC) {
            C26481cC r2 = (C26481cC) this;
            if (r2.A04 == null) {
                throw A01(r2, "subsystem was not specified.");
            } else if (r2.A00 == null) {
                throw A01(r2, "integrationState was not specified.");
            } else if (r2.A03 == null) {
                throw A01(r2, "integrationPoint was not configured.");
            } else if (r2.A02 == null) {
                Object obj = r2.A05.A06.get();
                C162457s7.A0D(obj);
                C26521cG r1 = (C26521cG) obj;
                C162457s7.A0J(r1, 0);
                r2.A02 = r1;
                r1.A04();
                A02(r1);
            }
        } else if (this instanceof C26471cB) {
            C26471cB r12 = (C26471cB) this;
            if (r12.A01 == null) {
                throw A01(r12, "integrationInterface was not specified.");
            } else if (r12.A00 == null) {
                throw A01(r12, "defaultImplementation was not specified.");
            }
        } else if (this instanceof C26511cF) {
            C26511cF r22 = (C26511cF) this;
            if (r22.A00 != -1) {
                C26421c6 A07 = r22.A07();
                A07.A04();
                A07.A06(r22.A00);
                A02(A07);
            }
            C26421c6 r0 = r22.A06;
            if (r0 == null) {
                throw A01(r22, "At least one system action must be specified using systemActions{}");
            } else if (r0.A00.isEmpty()) {
                throw A01(r22, "At least one system action must be specified using systemActions{}");
            } else if (r22.A07 == null) {
                throw A01(r22, "messageClass was not specified.");
            } else if (r22.A01 != null) {
                if (r22.A05 == null) {
                    C26441c8 A002 = A00(r22.A08.A04);
                    r22.A05 = A002;
                    A002.A04();
                    A02(A002);
                }
                if (r22.A04 == null) {
                    Object obj2 = r22.A08.A03.get();
                    C162457s7.A0D(obj2);
                    C26411c5 r13 = (C26411c5) obj2;
                    C162457s7.A0J(r13, 0);
                    r22.A04 = r13;
                    C828044z r02 = C828044z.A00;
                    r13.A04();
                    r02.invoke(r13);
                    A02(r13);
                }
                if (r22.A03 == null) {
                    Object obj3 = r22.A08.A05.get();
                    C162457s7.A0D(obj3);
                    C26531cH r14 = (C26531cH) obj3;
                    C162457s7.A0J(r14, 0);
                    r22.A03 = r14;
                    AnonymousClass450 r03 = AnonymousClass450.A00;
                    r14.A04();
                    r03.invoke(r14);
                    A02(r14);
                }
            } else {
                throw A01(r22, "integrationState was not specified.");
            }
        } else if (this instanceof C26461cA) {
            throw A01(this, "messageClass was not specified.");
        } else if (this instanceof C26451c9) {
            C26451c9 r15 = (C26451c9) this;
            if (r15.A01 == null) {
                throw A01(r15, "integrationInterface was not specified.");
            } else if (r15.A00 == null) {
                throw A01(r15, "defaultImplementation was not specified.");
            }
        } else if (this instanceof C26491cD) {
            C26491cD r23 = (C26491cD) this;
            if (r23.A04 == null) {
                throw A01(r23, "subsystem was not specified.");
            } else if (r23.A00 == null) {
                throw A01(r23, "integrationState was not specified.");
            } else if (r23.A03 == null) {
                throw A01(r23, "integrationPoint was not configured.");
            } else if (r23.A02 == null) {
                Object obj4 = r23.A05.A0A.get();
                C162457s7.A0D(obj4);
                C26521cG r16 = (C26521cG) obj4;
                C162457s7.A0J(r16, 0);
                r23.A02 = r16;
                r16.A04();
                A02(r16);
            }
        } else if (this instanceof C26501cE) {
            C26501cE r24 = (C26501cE) this;
            if (r24.A05 == null) {
                throw A01(r24, "messageType was not specified.");
            } else if (r24.A06 == null) {
                throw A01(r24, "messageClass was not specified.");
            } else if (r24.A00 != null) {
                if (r24.A04 == null) {
                    C26441c8 A003 = A00(r24.A07.A05);
                    r24.A04 = A003;
                    A003.A04();
                    A02(A003);
                }
                if (r24.A03 == null) {
                    Object obj5 = r24.A07.A04.get();
                    C162457s7.A0D(obj5);
                    C26411c5 r17 = (C26411c5) obj5;
                    C162457s7.A0J(r17, 0);
                    r24.A03 = r17;
                    C827844x r04 = C827844x.A00;
                    r17.A04();
                    r04.invoke(r17);
                    A02(r17);
                }
                if (r24.A02 == null) {
                    Object obj6 = r24.A07.A06.get();
                    C162457s7.A0D(obj6);
                    C26531cH r18 = (C26531cH) obj6;
                    C162457s7.A0J(r18, 0);
                    r24.A02 = r18;
                    C827944y r05 = C827944y.A00;
                    r18.A04();
                    r05.invoke(r18);
                    r18.A03();
                    r18.A00 = true;
                }
            } else {
                throw A01(r24, "integrationState was not specified.");
            }
        } else if (this instanceof C26431c7) {
            throw A01(this, "messageClass was not specified.");
        } else if (this instanceof C26401c4) {
            throw A01(this, "link was not specified.");
        } else if (this instanceof C26391c3) {
            throw A01(this, "className was not specified.");
        } else if (this instanceof C26381c2) {
            throw A01(this, "implementationClass was not specified.");
        }
    }

    public final void A04() {
        if (this.A00) {
            throw A01(this, "Builder already configured. Cannot reuse.");
        }
    }

    public static C26441c8 A00(AnonymousClass4C1 r1) {
        Object obj = r1.get();
        C162457s7.A0D(obj);
        C26441c8 r12 = (C26441c8) obj;
        C162457s7.A0J(r12, 0);
        return r12;
    }

    public static RuntimeException A01(C50922iz r0, String str) {
        r0.A05(str);
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static void A02(C50922iz r1) {
        r1.A03();
        r1.A00 = true;
    }

    public final void A05(String str) {
        StringBuilder A0X = C18270x1.A0X(str);
        C18260x0.A0N(getClass(), A0X);
        throw new C73253fB(AnonymousClass000.A0V(": ", str, A0X));
    }
}
