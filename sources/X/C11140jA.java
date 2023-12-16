package X;

/* renamed from: X.0jA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11140jA implements Runnable {
    public final /* synthetic */ C09070fb A00;

    public final void run() {
        C09070fb r6 = this.A00;
        if (r6.A00 == 0) {
            r6.A00 = 1;
            C06240Wu A002 = C06240Wu.A00();
            String str = C09070fb.A0C;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onAllConstraintsMet for ");
            AnonymousClass0PL r7 = r6.A08;
            A002.A04(str, AnonymousClass000.A0R(r7, A0o));
            C09000fU r3 = r6.A06;
            if (r3.A04.A04((C03790Lo) null, r6.A05)) {
                C05410Tf r5 = r3.A07;
                synchronized (r5.A01) {
                    C06240Wu.A02(C06240Wu.A00(), r7, "Starting timer for ", C05410Tf.A04, AnonymousClass001.A0o());
                    r5.A00(r7);
                    C12120l0 r32 = new C12120l0(r7, r5);
                    r5.A03.put(r7, r32);
                    r5.A02.put(r7, r6);
                    ((C08980fS) r5.A00).A00.postDelayed(r32, 600000);
                }
                return;
            }
            r6.A00();
            return;
        }
        C06240Wu A003 = C06240Wu.A00();
        String str2 = C09070fb.A0C;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Already started work for ");
        A003.A04(str2, AnonymousClass000.A0R(r6.A08, A0o2));
    }

    public /* synthetic */ C11140jA(C09070fb r1) {
        this.A00 = r1;
    }
}
