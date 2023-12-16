package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.spamreport.ReportSpamDialogFragmentOld;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3bW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71073bW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3ZH A01;
    public final /* synthetic */ AnonymousClass3ZH A02;
    public final /* synthetic */ C112925kb A03;
    public final /* synthetic */ ReportSpamDialogFragmentOld A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        List list;
        C54682p7 r2;
        C95814uZ r1;
        int A1U;
        ReportSpamDialogFragmentOld reportSpamDialogFragmentOld = this.A04;
        AnonymousClass3ZH r9 = this.A01;
        String str = this.A05;
        int i = this.A00;
        boolean z = this.A06;
        C112925kb r8 = this.A03;
        boolean z2 = this.A07;
        AnonymousClass3ZH r10 = this.A02;
        boolean z3 = this.A08;
        Class<C27991fJ> cls = C27991fJ.class;
        if (r9.A0I(cls) != null && reportSpamDialogFragmentOld.A0B.A06((GroupJid) r9.A0I(cls)) == 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ReportSpamDialogFragmentOld/sendingParent/");
            C18260x0.A0n(r9.A0H, A0o);
            reportSpamDialogFragmentOld.A00.A0A("ReportSpamDialogFragmentOld/sendingParent", true, str);
        }
        C624134x r0 = reportSpamDialogFragmentOld.A0G;
        if (r0 != null) {
            list = Collections.singletonList(r0);
        } else {
            list = null;
        }
        if (i == 2) {
            reportSpamDialogFragmentOld.A07.A02(r8, r9, str, list, z);
            r2 = reportSpamDialogFragmentOld.A0F;
            r1 = r9.A0H;
            C626936e.A06(r1);
            C162457s7.A0J(r1, 1);
            A1U = 6;
        } else {
            if (z2 || !z) {
                reportSpamDialogFragmentOld.A07.A04(r9, str, list);
                C69263Wi.A01(reportSpamDialogFragmentOld.A01, reportSpamDialogFragmentOld, 30);
                r2 = reportSpamDialogFragmentOld.A0F;
                r1 = r9.A0H;
                C626936e.A06(r1);
                if (!z2) {
                    A1U = C18270x1.A1U(str, r1);
                }
            } else {
                boolean z4 = true;
                if (r10 == null || i != 0) {
                    r10 = r9;
                    if (r9.A0U()) {
                        z4 = false;
                        r10 = null;
                    }
                }
                C27991fJ r4 = (C27991fJ) r9.A0I(cls);
                if (z4) {
                    AnonymousClass30W r6 = reportSpamDialogFragmentOld.A07;
                    C003203q A0Q = reportSpamDialogFragmentOld.A0Q();
                    C626936e.A06(r10);
                    r6.A01(A0Q, r8, r9, r10, str, list, z3);
                    r2 = reportSpamDialogFragmentOld.A0F;
                    r1 = r9.A0H;
                    C626936e.A06(r1);
                } else if (r4 == null || reportSpamDialogFragmentOld.A03.A01(r4) == null || !reportSpamDialogFragmentOld.A0B.A0N(r4) || !reportSpamDialogFragmentOld.A0C.A0C(r4)) {
                    AnonymousClass30W r12 = reportSpamDialogFragmentOld.A07;
                    boolean z5 = reportSpamDialogFragmentOld.A0K;
                    r12.A04(r9, str, list);
                    r12.A03(r8, r9, z3, z5);
                    r2 = reportSpamDialogFragmentOld.A0F;
                    r1 = r9.A0H;
                    C626936e.A06(r1);
                    C162457s7.A0J(r1, 1);
                    A1U = 5;
                } else {
                    reportSpamDialogFragmentOld.A07.A04(r9, str, list);
                    C69263Wi.A01(reportSpamDialogFragmentOld.A01, reportSpamDialogFragmentOld, 30);
                    C54682p7 r22 = reportSpamDialogFragmentOld.A0F;
                    C95814uZ r13 = r9.A0H;
                    C626936e.A06(r13);
                    C162457s7.A0J(r13, 1);
                    r22.A01(r13, str, 4);
                    C27991fJ A012 = reportSpamDialogFragmentOld.A03.A01(r4);
                    C626936e.A06(A012);
                    C69263Wi.A05(reportSpamDialogFragmentOld.A01, reportSpamDialogFragmentOld, A012, 46);
                    C69263Wi.A01(reportSpamDialogFragmentOld.A01, reportSpamDialogFragmentOld, 31);
                }
            }
            C162457s7.A0J(r1, 1);
            A1U = 3;
        }
        r2.A01(r1, str, A1U);
        C69263Wi.A01(reportSpamDialogFragmentOld.A01, reportSpamDialogFragmentOld, 31);
    }

    public /* synthetic */ C71073bW(AnonymousClass3ZH r1, AnonymousClass3ZH r2, C112925kb r3, ReportSpamDialogFragmentOld reportSpamDialogFragmentOld, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = reportSpamDialogFragmentOld;
        this.A01 = r1;
        this.A05 = str;
        this.A00 = i;
        this.A06 = z;
        this.A03 = r3;
        this.A07 = z2;
        this.A02 = r2;
        this.A08 = z3;
    }
}
