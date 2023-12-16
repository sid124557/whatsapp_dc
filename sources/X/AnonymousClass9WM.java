package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9WM  reason: invalid class name */
public class AnonymousClass9WM {
    public final AnonymousClass9RW A00;
    public final C203499no A01;
    public final C160757oG A02 = C160757oG.A00("PaymentsCommonErrorHelper", "payment", "COMMON");

    public static Integer A02(int i) {
        int i2;
        if (!(i == 6 || i == 7)) {
            switch (i) {
                case -2:
                    break;
                case 400:
                case 500:
                case 503:
                case 4002:
                    i2 = R.string.f11nameremoved;
                    break;
                case 403:
                case 2826001:
                    i2 = R.string.f11nameremoved;
                    break;
                case 443:
                    i2 = R.string.f11nameremoved;
                    break;
                case 10702:
                    i2 = R.string.f11nameremoved;
                    break;
                case 2826004:
                    i2 = R.string.f11nameremoved;
                    break;
                case 2826007:
                    i2 = R.string.f11nameremoved;
                    break;
                case 2826009:
                    i2 = R.string.f11nameremoved;
                    break;
                case 2826012:
                    i2 = R.string.f11nameremoved;
                    break;
                default:
                    return null;
            }
        }
        i2 = R.string.f11nameremoved;
        return Integer.valueOf(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r1 != null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass043 A03(android.content.Context r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, int r8) {
        /*
            r4 = this;
            r0 = 440(0x1b8, float:6.17E-43)
            r2 = 0
            if (r8 == r0) goto L_0x004e
            r0 = 446(0x1be, float:6.25E-43)
            if (r8 == r0) goto L_0x0043
            r0 = 2826026(0x2b1f2a, float:3.960106E-39)
            if (r8 == r0) goto L_0x0038
            r0 = 2826046(0x2b1f3e, float:3.960134E-39)
            if (r8 != r0) goto L_0x0028
            r0 = 2131888422(0x7f120926, float:1.9411479E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0028
            X.9OB r2 = new X.9OB
            r2.<init>(r1, r0)
        L_0x0028:
            r3 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = r2.A00
        L_0x002f:
            if (r0 != 0) goto L_0x0059
            return r3
        L_0x0032:
            java.lang.Integer r0 = A02(r8)
            r1 = r3
            goto L_0x002f
        L_0x0038:
            r0 = 2131894485(0x7f1220d5, float:1.9423776E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131894484(0x7f1220d4, float:1.9423774E38)
            goto L_0x001d
        L_0x0043:
            r0 = 2131892010(0x7f12172a, float:1.9418756E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892009(0x7f121729, float:1.9418754E38)
            goto L_0x001d
        L_0x004e:
            r0 = 2131893782(0x7f121e16, float:1.942235E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131894367(0x7f12205f, float:1.9423537E38)
            goto L_0x001d
        L_0x0059:
            int r0 = r0.intValue()
            java.lang.String r2 = r4.A06(r5, r8, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x0096
            r0 = 403(0x193, float:5.65E-43)
            if (r8 == r0) goto L_0x0096
            r0 = 2826001(0x2b1f11, float:3.960071E-39)
            if (r8 == r0) goto L_0x0096
        L_0x006e:
            if (r1 != 0) goto L_0x0086
            r1 = 2826007(0x2b1f17, float:3.960079E-39)
            r0 = 2131888583(0x7f1209c7, float:1.9411805E38)
            if (r8 == r1) goto L_0x0080
            r0 = 2826009(0x2b1f19, float:3.960082E-39)
            if (r8 != r0) goto L_0x0098
            r0 = 2131892243(0x7f121813, float:1.9419229E38)
        L_0x0080:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0098
        L_0x0086:
            int r0 = r1.intValue()
            java.lang.String r0 = r5.getString(r0)
            r4.A07(r8, r0, r2)
            X.043 r0 = A01(r5, r7, r0, r2)
            return r0
        L_0x0096:
            r7 = r6
            goto L_0x006e
        L_0x0098:
            r4.A07(r8, r3, r2)
            X.043 r0 = A00(r5, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WM.A03(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, int):X.043");
    }

    public AnonymousClass043 A04(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, int i) {
        int i2;
        if (i == 8 || i == 9 || i == 444 || i == 478) {
            i2 = R.string.f11nameremoved;
            onDismissListener2 = onDismissListener;
        } else if (i != 1448) {
            return null;
        } else {
            i2 = R.string.f11nameremoved;
        }
        String A06 = A06(context, i, i2);
        A07(i, (String) null, A06);
        return A00(context, onDismissListener2, A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r9 != 2826008) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r9 != 12750) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        A07(r9, r2, r4.getString(com.whatsapp.R.string.f11nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        A07(r9, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r1 = A06(r4, r9, r0);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        r2 = r4.getString(r0);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r1 = A06(r4, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        return A00(r4, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return A01(r4, r7, r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass043 A05(android.content.Context r4, android.content.DialogInterface.OnDismissListener r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r0 = 405(0x195, float:5.68E-43)
            r1 = 2131892038(0x7f121746, float:1.9418813E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 406(0x196, float:5.69E-43)
            r1 = 2131892035(0x7f121743, float:1.9418807E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 409(0x199, float:5.73E-43)
            if (r9 == r0) goto L_0x00cb
            r0 = 410(0x19a, float:5.75E-43)
            r1 = 2131892037(0x7f121745, float:1.941881E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 426(0x1aa, float:5.97E-43)
            r1 = 2131892034(0x7f121742, float:1.9418805E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 460(0x1cc, float:6.45E-43)
            r1 = 2131892039(0x7f121747, float:1.9418815E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r9 == r0) goto L_0x00cb
        L_0x002c:
            X.043 r0 = r3.A04(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0057
            X.043 r0 = r3.A03(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0057
            r2 = 0
            switch(r9) {
                case 2001: goto L_0x00b8;
                case 2304: goto L_0x00af;
                case 2321: goto L_0x00af;
                case 10010: goto L_0x00ab;
                case 10775: goto L_0x009b;
                case 12750: goto L_0x008c;
                case 2826003: goto L_0x0081;
                case 2826006: goto L_0x0076;
                case 2826015: goto L_0x006b;
                case 2826018: goto L_0x0067;
                case 2896003: goto L_0x005c;
                case 2896004: goto L_0x005c;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            java.lang.String r1 = r3.A06(r4, r9, r0)
        L_0x0043:
            r0 = 12750(0x31ce, float:1.7867E-41)
            if (r9 != r0) goto L_0x0058
            r0 = 2131892051(0x7f121753, float:1.941884E38)
            java.lang.String r0 = r4.getString(r0)
            r3.A07(r9, r2, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x00e4
            X.043 r0 = A01(r4, r7, r2, r1)
        L_0x0057:
            return r0
        L_0x0058:
            r3.A07(r9, r2, r1)
            goto L_0x0051
        L_0x005c:
            r0 = 2131890146(0x7f120fe2, float:1.9414976E38)
            java.lang.String r1 = r3.A06(r4, r9, r0)
            r0 = 2131890147(0x7f120fe3, float:1.9414978E38)
            goto L_0x0096
        L_0x0067:
            r0 = 2131891811(0x7f121663, float:1.9418353E38)
            goto L_0x006e
        L_0x006b:
            r0 = 2131891810(0x7f121662, float:1.941835E38)
        L_0x006e:
            java.lang.String r1 = r3.A06(r4, r9, r0)
            r0 = 2131892243(0x7f121813, float:1.9419229E38)
            goto L_0x00a5
        L_0x0076:
            r0 = 2131892106(0x7f12178a, float:1.941895E38)
            java.lang.String r1 = r3.A06(r4, r9, r0)
            r0 = 2131892011(0x7f12172b, float:1.9418758E38)
            goto L_0x0096
        L_0x0081:
            r0 = 2131891915(0x7f1216cb, float:1.9418564E38)
            java.lang.String r1 = r3.A06(r4, r9, r0)
            r0 = 2131892243(0x7f121813, float:1.9419229E38)
            goto L_0x00c2
        L_0x008c:
            r0 = 2131892051(0x7f121753, float:1.941884E38)
            java.lang.String r1 = X.C86604Kt.A0m(r4, r8, r0)
            r0 = 2131892052(0x7f121754, float:1.9418841E38)
        L_0x0096:
            java.lang.String r2 = r4.getString(r0)
            goto L_0x00b6
        L_0x009b:
            r0 = 2131891802(0x7f12165a, float:1.9418334E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131891803(0x7f12165b, float:1.9418336E38)
        L_0x00a5:
            java.lang.String r2 = r4.getString(r0)
            r5 = r7
            goto L_0x00c6
        L_0x00ab:
            r0 = 2131891907(0x7f1216c3, float:1.9418547E38)
            goto L_0x00b2
        L_0x00af:
            r0 = 2131891703(0x7f1215f7, float:1.9418134E38)
        L_0x00b2:
            java.lang.String r1 = r3.A06(r4, r9, r0)
        L_0x00b6:
            r5 = r6
            goto L_0x00c6
        L_0x00b8:
            r0 = 2131891977(0x7f121709, float:1.941869E38)
            java.lang.String r1 = r3.A06(r4, r9, r0)
            r0 = 2131891978(0x7f12170a, float:1.9418691E38)
        L_0x00c2:
            java.lang.String r2 = r4.getString(r0)
        L_0x00c6:
            if (r1 == 0) goto L_0x003c
            r7 = r5
            goto L_0x0043
        L_0x00cb:
            r1 = 2131892036(0x7f121744, float:1.9418809E38)
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            X.C626936e.A06(r8)
            java.lang.String r0 = X.C86604Kt.A0m(r4, r8, r0)
            X.043 r0 = A00(r4, r6, r0)
            return r0
        L_0x00e4:
            X.043 r0 = A00(r4, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WM.A05(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, java.lang.String, int):X.043");
    }

    public final String A06(Context context, int i, int i2) {
        String A002 = this.A00.A00(i);
        if (A002 == null) {
            return context.getString(i2);
        }
        return A002;
    }

    public final void A07(int i, String str, String str2) {
        C203499no r4 = this.A01;
        if (r4 != null) {
            C134246ig B0d = r4.B0d();
            C1899593h.A1B(B0d, 4);
            B0d.A0b = "error";
            B0d.A0S = String.valueOf(i);
            B0d.A0T = str2;
            if (str != null) {
                B0d.A0U = str;
            }
            C1899593h.A1H(this.A02, r4, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass001.A0o());
            r4.BKA(B0d);
        }
    }

    public AnonymousClass9WM(AnonymousClass9RW r4, C203499no r5) {
        this.A00 = r4;
        this.A01 = r5;
    }

    public static AnonymousClass043 A00(Context context, DialogInterface.OnDismissListener onDismissListener, String str) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0g(str);
        C19340zH.A06(A002);
        AnonymousClass043 create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }

    public static AnonymousClass043 A01(Context context, DialogInterface.OnDismissListener onDismissListener, String str, String str2) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0h(str);
        A002.A0g(str2);
        C19340zH.A06(A002);
        AnonymousClass043 create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }
}
