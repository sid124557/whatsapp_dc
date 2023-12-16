package X;

/* renamed from: X.3hZ  reason: invalid class name and case insensitive filesystem */
public final class C74713hZ extends C75013pU implements AnonymousClass4C9, AnonymousClass4C3 {
    public final C85494Gl collectContext;
    public final int collectContextSize;
    public final AnonymousClass4C9 collector;
    public C84814Du completion;
    public C85494Gl lastEmissionContext;

    public C74713hZ(C85494Gl r3, AnonymousClass4C9 r4) {
        super(C72433di.A01, C72553du.A00);
        this.collector = r4;
        this.collectContext = r3;
        this.collectContextSize = AnonymousClass001.A0K(r3.fold(C18290x4.A0Z(), C828345c.A00));
    }

    public AnonymousClass4C3 B5B() {
        C84814Du r1 = this.completion;
        if (r1 instanceof AnonymousClass4C3) {
            return (AnonymousClass4C3) r1;
        }
        return null;
    }

    public StackTraceElement A07() {
        return null;
    }

    public Object A09(Object obj) {
        Throwable A00 = AnonymousClass3Z9.A00(obj);
        if (A00 != null) {
            C85494Gl r1 = this.lastEmissionContext;
            if (r1 == null) {
                r1 = C72553du.A00;
            }
            this.lastEmissionContext = new C72533ds(r1, A00);
        }
        C84814Du r0 = this.completion;
        if (r0 != null) {
            r0.BkD(obj);
        }
        return AnonymousClass218.COROUTINE_SUSPENDED;
    }

    public Object B2K(Object obj, C84814Du r6) {
        IllegalStateException A0I;
        try {
            C85494Gl B5w = r6.B5w();
            AnonymousClass34A.A02(B5w);
            C85494Gl r2 = this.lastEmissionContext;
            if (r2 != B5w) {
                if (r2 instanceof C72533ds) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    A0o.append(((C72533ds) r2).A00);
                    A0o.append(", but then emission attempt of value '");
                    A0o.append(obj);
                    A0I = AnonymousClass001.A0e(C830345w.A08(AnonymousClass000.A0X("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ", A0o)));
                } else if (AnonymousClass001.A0K(B5w.fold(C18290x4.A0Z(), new AnonymousClass45Q(this))) == this.collectContextSize) {
                    this.lastEmissionContext = B5w;
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    A0o2.append(this.collectContext);
                    A0o2.append(",\n\t\tbut emission happened in ");
                    A0o2.append(B5w);
                    A0I = AnonymousClass000.A0I(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead", A0o2);
                }
                throw A0I;
            }
            this.completion = r6;
            AnonymousClass4GS r22 = C39242Bf.A00;
            AnonymousClass4C9 r1 = this.collector;
            C162457s7.A0K(r1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object BGj = r22.BGj(r1, obj, this);
            AnonymousClass218 r12 = AnonymousClass218.COROUTINE_SUSPENDED;
            if (!C162457s7.A0P(BGj, r12)) {
                this.completion = null;
            }
            if (BGj != r12) {
                return C59022wD.A00;
            }
            return BGj;
        } catch (Throwable th) {
            this.lastEmissionContext = new C72533ds(r6.B5w(), th);
            throw th;
        }
    }
}
