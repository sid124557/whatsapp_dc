package X;

import java.util.List;

/* renamed from: X.98e  reason: invalid class name */
public class AnonymousClass98e extends AnonymousClass3CG {
    public C203459nj A00;

    public AnonymousClass98e(C203459nj r8) {
        super("bk.action.qpl.userflow.AnnotateV2", "bk.action.qpl.userflow.EndFlowCancelV2", "bk.action.qpl.userflow.EndFlowFailureV2", "bk.action.qpl.userflow.EndFlowSuccessV2", "bk.action.qpl.userflow.MarkErrorV2", "bk.action.qpl.userflow.MarkPointV2", "bk.action.qpl.userflow.StartFlowV2");
        this.A00 = r8;
    }

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r13, C146787Bp r14, C151147Tp r15) {
        String str = r14.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -1507852311:
                s = C1899693i.A0g("bk.action.qpl.userflow.AnnotateV2", str);
                break;
            case -1330718402:
                s = C1899693i.A0h("bk.action.qpl.userflow.EndFlowFailureV2", str);
                break;
            case -921635786:
                s = C1899693i.A0i("bk.action.qpl.userflow.MarkErrorV2", str);
                break;
            case -782725013:
                if (str.equals("bk.action.qpl.userflow.StartFlowV2")) {
                    s = 3;
                    break;
                }
                break;
            case 136195447:
                if (str.equals("bk.action.qpl.userflow.EndFlowSuccessV2")) {
                    s = 4;
                    break;
                }
                break;
            case 156743102:
                if (str.equals("bk.action.qpl.userflow.MarkPointV2")) {
                    s = 5;
                    break;
                }
                break;
            case 959076350:
                if (str.equals("bk.action.qpl.userflow.EndFlowCancelV2")) {
                    s = 6;
                    break;
                }
                break;
        }
        C151147Tp r7 = r15;
        switch (s) {
            case 0:
                C203459nj r4 = this.A00;
                List list = r13.A00;
                r4.Ax1(r15, AnonymousClass6C9.A0k(list, 2), AnonymousClass000.A09(list, 0), AnonymousClass000.A09(list, 1));
                return null;
            case 1:
                C203459nj r6 = this.A00;
                List list2 = r13.A00;
                r6.B2U(r7, AnonymousClass001.A0n(list2, 2), AnonymousClass001.A0n(list2, 3), AnonymousClass000.A09(list2, 0), AnonymousClass000.A09(list2, 1));
                return null;
            case 2:
                C203459nj r62 = this.A00;
                List list3 = r13.A00;
                r62.BKV(r7, AnonymousClass001.A0n(list3, 2), AnonymousClass001.A0n(list3, 3), AnonymousClass000.A09(list3, 0), AnonymousClass000.A09(list3, 1));
                return null;
            case 3:
                List list4 = r13.A00;
                AnonymousClass84O r2 = (AnonymousClass84O) list4.get(2);
                boolean equals = "cancel".equals(r2.A0O(35));
                String A07 = AnonymousClass84O.A07(r2);
                if (A07 == null) {
                    A07 = "WaBloks";
                }
                this.A00.Bq2(r7, A07, AnonymousClass000.A09(list4, 0), AnonymousClass000.A09(list4, 1), equals);
                return null;
            case 4:
                C203459nj r3 = this.A00;
                List list5 = r13.A00;
                r3.B2V(r15, AnonymousClass000.A09(list5, 0), AnonymousClass000.A09(list5, 1));
                return null;
            case 5:
                C203459nj r63 = this.A00;
                List list6 = r13.A00;
                r63.BKW(r7, AnonymousClass001.A0n(list6, 2), AnonymousClass6C9.A0k(list6, 3), AnonymousClass000.A09(list6, 0), AnonymousClass000.A09(list6, 1));
                return null;
            case 6:
                C203459nj r42 = this.A00;
                List list7 = r13.A00;
                r42.B2T(r15, AnonymousClass001.A0n(list7, 2), AnonymousClass000.A09(list7, 0), AnonymousClass000.A09(list7, 1));
                return null;
            default:
                return null;
        }
    }
}
