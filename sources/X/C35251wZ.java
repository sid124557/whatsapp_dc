package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wZ  reason: invalid class name and case insensitive filesystem */
public class C35251wZ extends C41032Ir {
    public C35251wZ(int i) {
        String str;
        switch (i) {
            case 8:
                str = "allow_admin_reports";
                break;
            case 9:
                str = "allow_non_admin_sub_group_creation";
                break;
            case 10:
                str = "announcement";
                break;
            case 11:
                str = "frequently_forwarded_ok";
                break;
            case 12:
                str = "group_history";
                break;
            case 13:
                str = "locked";
                break;
            case 14:
                str = "no_frequently_forwarded";
                break;
            case 15:
                str = "no_group_history";
                break;
            case 16:
                str = "not_allow_admin_reports";
                break;
            default:
                str = "not_allow_non_admin_sub_group_creation";
                break;
        }
        C41032Ir.A0A(C56052rL.A04(str), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (X.C626836d.A0M(r3, r4, r6, r8) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r1.A0J(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r0 = r1.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (X.C626836d.A0M(r3, r4, r6, r8) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r1.A0J(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        X.C56052rL.A07(r1, r2);
        r0 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r9.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35251wZ(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r3 = r10
            switch(r11) {
                case 0: goto L_0x002c;
                case 1: goto L_0x003b;
                case 2: goto L_0x0058;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9.<init>()
            java.lang.String r0 = "description"
            X.2rL r2 = X.C56052rL.A04(r0)
            java.lang.String r0 = "body"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 65536(0x10000, double:3.2379E-319)
        L_0x0019:
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x0022
            r1.A0J(r10)
        L_0x0022:
            X.C56052rL.A07(r1, r2)
            X.36K r0 = r2.A0F()
        L_0x0029:
            r9.A00 = r0
            return
        L_0x002c:
            r9.<init>()
            java.lang.String r0 = "device_log_handle"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 500(0x1f4, double:2.47E-321)
            goto L_0x004a
        L_0x003b:
            r9.<init>()
            java.lang.String r0 = "title"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 1000(0x3e8, double:4.94E-321)
        L_0x004a:
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x0053
            r1.A0J(r10)
        L_0x0053:
            X.36K r0 = r1.A0F()
            goto L_0x0029
        L_0x0058:
            r9.<init>()
            java.lang.String r0 = "product"
            X.2rL r2 = X.C56052rL.A04(r0)
            java.lang.String r0 = "id"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 200(0xc8, double:9.9E-322)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35251wZ.<init>(java.lang.String, int):void");
    }

    public C35251wZ(List list, int i) {
        C56052rL r2;
        switch (i) {
            case 22:
                r2 = C56052rL.A04("approve");
                if (C41032Ir.A0G(list)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C41032Ir.A0F(r2, it);
                    }
                    break;
                }
                break;
            case 24:
                r2 = C56052rL.A04("cancel");
                if (C41032Ir.A0G(list)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C41032Ir.A0F(r2, it2);
                    }
                    break;
                }
                break;
            default:
                r2 = C56052rL.A04("reject");
                if (C41032Ir.A0G(list)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C41032Ir.A0F(r2, it3);
                    }
                    break;
                }
                break;
        }
        C41032Ir.A0A(r2, this);
    }

    public C35251wZ(C35381wm r2, C35391wn r3, C35291wd r4, C35301we r5) {
        C56052rL A04 = C56052rL.A04("picture");
        C18280x3.A0x(A04, r2);
        C41032Ir.A08(A04, r5);
        C41032Ir.A08(A04, r4);
        C41032Ir.A0C(A04, r3, this);
    }

    public C35251wZ(C35381wm r2, int i) {
        C56052rL A04;
        if (3 - i != 0) {
            A04 = C56052rL.A04("sub_group_suggestion");
        } else {
            A04 = C56052rL.A04("context");
        }
        C41032Ir.A0D(A04, r2, this);
    }

    public C35251wZ(UserJid userJid) {
        C56052rL A04 = C56052rL.A04("participant");
        C626836d.A0D(userJid, A04, "jid");
        C41032Ir.A0A(A04, this);
    }

    public C35251wZ(C27991fJ r3) {
        C56052rL A04 = C56052rL.A04("group");
        C626836d.A0D(r3, A04, "jid");
        C41032Ir.A0A(A04, this);
    }

    public C35251wZ(C35391wn r2) {
        C41032Ir.A0C(C56052rL.A04("linked_groups"), r2, this);
    }
}
