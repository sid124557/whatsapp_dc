package X;

/* renamed from: X.3bV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71063bV implements Runnable {
    public final /* synthetic */ AnonymousClass30M A00;
    public final /* synthetic */ C56232re A01;
    public final /* synthetic */ AnonymousClass3QO A02;
    public final /* synthetic */ C157497iO A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;

    public final void run() {
        AnonymousClass7N0 r4;
        C158797kZ r1;
        C56232re r2 = this.A01;
        AnonymousClass3QO r12 = this.A02;
        AnonymousClass30M r9 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        C157497iO r13 = this.A03;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        byte[] bArr = this.A08;
        if (r12 != null) {
            Number number = (Number) r12.A0B.A01();
            if (!r12.A03 && (number == null || number.intValue() == 0)) {
                if (r9.A00().A1I == 82) {
                    r12.A0M.A0C(Boolean.TRUE);
                }
                boolean A062 = r12.A06();
                StringBuilder A0o = AnonymousClass001.A0o();
                if (A062) {
                    C18260x0.A1P(A0o, "mediajobmanager/enqueuemediaupload/optimistic; existingJob=", r12);
                    C18260x0.A1P(AnonymousClass001.A0o(), "app/mediajobmanager/handleOptimisticAttachment for mediaJob=", r12);
                    r2.A03(r9, r12, z, z2);
                    C619833a r3 = r12.A0M;
                    synchronized (r3) {
                        if (!r3.A0H) {
                            r3.A0B = C18290x4.A0Z();
                        } else if (!r3.A0G) {
                            r3.A0B = C18290x4.A0a();
                        } else {
                            r3.A0B = C18280x3.A0S();
                        }
                    }
                    r3.A07();
                    r2.A0D.A08(r12);
                    return;
                }
                C18260x0.A1P(A0o, "mediajobmanager/enqueuemediaupload/existing job; existingJob=", r12);
                r2.A03(r9, r12, z, z2);
                return;
            }
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "mediajobmanager/enqueuemediaupload/new job; existingJob=", r12);
        AnonymousClass32J A012 = AnonymousClass32J.A01(r2.A02, r9, r2.A09, r2.A0I, r2.A0J, r13, z3);
        C620033c r8 = r2.A0D;
        AnonymousClass3QO A042 = r8.A04(A012, z4);
        r2.A03(r9, A042, z, z2);
        if (!(r12 == null || (r4 = (AnonymousClass7N0) r12.A0F.A01()) == null || !r4.A02)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mediajobmanager/enqueuemediaupload/reusing optimistic transcode result from job=");
            A0o2.append(r12);
            C18260x0.A1P(A0o2, " in job=", A042);
            Object A013 = r12.A09.A01();
            if (A013 != null) {
                A042.A09.A05(A013);
            }
            A042.A0F.A05(r4);
            C619833a r22 = r12.A0M;
            synchronized (r22) {
                r1 = r22.A06;
            }
            if (r1 != null) {
                A042.A0M.A0A(r1);
            }
        }
        if (r9.A00().A1I == 82) {
            A042.A0M.A0C(Boolean.TRUE);
        }
        if (r8.A0H(C47592dV.A00(A042), A042.A00().A0H, A042.A0N.A03.A02)) {
            A042.A04 = bArr;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(r9.A01());
        r8.A0E(A042, AnonymousClass000.A0P(r13, "; action_params: ", A0o3));
    }

    public /* synthetic */ C71063bV(AnonymousClass30M r1, C56232re r2, AnonymousClass3QO r3, C157497iO r4, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = r4;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = bArr;
    }
}
