package X;

import android.view.animation.Interpolator;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
public class C10130hR implements C835348u {
    public final C835348u A00;

    public static void A03(C131266dJ r12, C157967jD r13) {
        String str;
        AnonymousClass84O r7 = (AnonymousClass84O) r13.A03(0);
        C153427bI A06 = AnonymousClass8DI.A06(r12, r13, 1);
        if (r7 == null) {
            str = "Cannot show toast with null content.";
        } else {
            AnonymousClass7r0 A002 = AnonymousClass7r0.A00(r12, r7);
            AnonymousClass84O r2 = (AnonymousClass84O) r13.A03(1);
            if (r2 == null) {
                str = "Cannot show toast with invalid options.";
            } else {
                int A0E = r2.A0E(35, 5000);
                int A0E2 = r2.A0E(42, 100);
                int A0E3 = r2.A0E(36, 100);
                Interpolator A003 = A00(r2.A0K(43));
                Interpolator A004 = A00(r2.A0K(38));
                C835248t A0L = r2.A0L(41);
                C835248t A0L2 = r2.A0L(40);
                C04470Ok r22 = new C04470Ok(A06);
                r22.A01(A002);
                r22.A00 = A0E;
                r22.A02 = A0E2;
                r22.A01 = A0E3;
                r22.A04 = A003;
                r22.A03 = A004;
                r22.A07 = A02(r12, A0L);
                r22.A06 = new C18000wa(r12, 1, A0L2);
                r22.A09 = r7.A0N();
                r22.A00().A02();
                return;
            }
        }
        C159737mN.A01("bk.action.toast.ShowToast", str);
    }

    public static void A04(C131266dJ r6, C157967jD r7) {
        AnonymousClass7r0 r5 = (AnonymousClass7r0) r7.A04(0);
        AnonymousClass84O r4 = (AnonymousClass84O) r7.A03(1);
        C153427bI A06 = AnonymousClass8DI.A06(r6, r7, 2);
        if (r4 == null) {
            C159737mN.A01("bk.action.toast.ShowToastV2", "Cannot show toast with invalid options.");
            return;
        }
        C162377rs.A02(A06).A07(r5, (Map) null);
        C04470Ok r3 = new C04470Ok(A06);
        r3.A01(r5);
        r3.A00 = r4.A0E(35, 5000);
        r3.A02 = r4.A0E(42, 100);
        r3.A01 = r4.A0E(36, 100);
        r3.A04 = A00(r4.A0K(43));
        r3.A03 = A00(r4.A0K(38));
        r3.A07 = A02(r6, r4.A0L(41));
        r3.A06 = new C18000wa(r6, 1, r4.A0L(40));
        r3.A09 = r5.A05().A0N();
        r3.A0A = A06(r4);
        r3.A05 = A01(r4);
        r3.A00().A02();
    }

    public static void A05(C157967jD r2) {
        AnonymousClass03E r1;
        String str = (String) r2.A03(0);
        if (str != null && (r1 = (AnonymousClass03E) C06110Wh.A00.get()) != null && str.equals(r1.getTag(R.id.foa_toast_tag_server_id))) {
            r1.A01(r1.A01);
        }
    }

    public static Interpolator A00(AnonymousClass84O r5) {
        if (r5 == null) {
            return C05030Rp.A00(0.0f, 0.0f, 1.0f, 1.0f);
        }
        return C05030Rp.A00(r5.A0B(35, 0.0f), r5.A0B(38, 0.0f), r5.A0B(36, 1.0f), r5.A0B(40, 1.0f));
    }

    public static AnonymousClass0FU A01(AnonymousClass84O r2) {
        int hashCode;
        String A0O = r2.A0O(48);
        if (A0O == null || (hashCode = A0O.hashCode()) == -1383228885 || hashCode != 115029 || !A0O.equals("top")) {
            return AnonymousClass0FU.BOTTOM;
        }
        return AnonymousClass0FU.TOP;
    }

    public static C16320sp A02(C131266dJ r1, C835248t r2) {
        return new C09680ga(r1, r2);
    }

    public static boolean A06(AnonymousClass84O r1) {
        return "mini".equals(r1.A0O(44));
    }

    /* renamed from: A07 */
    public Object B2m(C131266dJ r2, C157967jD r3, C146787Bp r4) {
        try {
            C159567m6.A01(r4.A00);
            return A08(r2, r3, r4);
        } finally {
            C159567m6.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01dd, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01df, code lost:
        X.C159737mN.A01("bk.action.array.Filter", "Got non-boolean result while evaluating filter predicate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e9, code lost:
        if (X.C159427lo.A02(r1) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01eb, code lost:
        r7.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ee, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f1, code lost:
        A03(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f5, code lost:
        r1 = X.C155787fV.A00(r14.A04(1));
        X.AnonymousClass000.A0A().postDelayed(new X.C12980mR(r12, X.AnonymousClass8DI.A06(r13, r14, 2), r13, r1), ((java.lang.Number) r14.A04(0)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0217, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0218, code lost:
        r4 = (android.animation.ValueAnimator) r14.A03(0);
        r3 = X.AnonymousClass001.A05(r14.A04(1));
        r2 = X.AnonymousClass001.A05(r14.A04(2));
        r4.setFloatValues(new float[]{X.AnonymousClass001.A03(r4), r3});
        r4.setDuration((long) (r2 * 1000.0f));
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0241, code lost:
        r4 = (android.animation.Animator) r14.A03(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0247, code lost:
        r4.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x024a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x024b, code lost:
        ((android.animation.Animator) r14.A03(0)).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0254, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0255, code lost:
        A05(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0258, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0259, code lost:
        r3 = (java.util.List) r14.A04(0);
        r2 = X.AnonymousClass001.A0K(r14.A04(1));
        r1 = (java.lang.Number) r14.A03(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026d, code lost:
        if (r2 < 0) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0273, code lost:
        if (r2 >= r3.size()) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0275, code lost:
        if (r1 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0277, code lost:
        r0 = r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x027f, code lost:
        return r3.subList(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0280, code lost:
        r0 = "argument offset is out of bounds";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0287, code lost:
        if (r1.intValue() >= 0) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0289, code lost:
        r0 = "argument length cannot be negative";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028b, code lost:
        X.C159737mN.A01("bk.action.array.Slice", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028f, code lost:
        r0 = java.lang.Math.min(r1.intValue() + r2, r3.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a3, code lost:
        return java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ae, code lost:
        return android.net.Uri.encode((java.lang.String) r14.A04(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02af, code lost:
        r4 = (java.util.List) r14.A03(0);
        r3 = X.C155787fV.A00(r14.A04(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02bd, code lost:
        if (r4 != null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c1, code lost:
        return java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c2, code lost:
        r7 = X.AnonymousClass000.A0p(r4);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02cb, code lost:
        if (r2 >= r4.size()) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02cd, code lost:
        r1 = new X.C152057Xj();
        r1.A05(java.lang.Integer.valueOf(r2), 0);
        r1.A05(r4.get(r2), 1);
        r7.add(X.C157157hp.A00(r13, r1.A03(), r3));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ee, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ef, code lost:
        r3 = new android.animation.ValueAnimator();
        r9 = X.C155787fV.A00(r14.A04(0));
        r8 = X.C155787fV.A00(r14.A04(1));
        r10 = X.AnonymousClass001.A05(r14.A04(2));
        r4 = X.AnonymousClass001.A05(r14.A04(3));
        r2 = X.AnonymousClass001.A05(r14.A04(4));
        r0 = new X.C152057Xj();
        r0.A05(r3, 0);
        r1 = r0.A03();
        r3.addUpdateListener(new X.C06660Yr(r12, r13, r1, r9));
        r3.addListener(new X.C06570Yi(r12, r13, r1, r8));
        r3.setInterpolator(new android.view.animation.LinearInterpolator());
        r3.setFloatValues(new float[]{r10, r4});
        r3.setDuration((long) (r2 * 1000.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x034e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x034f, code lost:
        r3 = (java.lang.String) r14.A03(0);
        r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.determineType(r3);
        r2 = X.AnonymousClass001.A0t();
        r2.put("cardType", r0.getTypeName());
        X.AnonymousClass000.A1C("isValid", r2, com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.isCardNumberValid(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0376, code lost:
        return r2.A0O(41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r8.equals("bk.action.array.Map") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r8.equals("commerce.action.GetCreditCardMetadata") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        return r12.A00.B2m(r14, r15, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r8.equals("bk.action.device.GetDeviceOSVersion") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        if (r8.equals("bk.action.url.Encode") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        switch(r0) {
            case 1: goto L_0x01aa;
            case 2: goto L_0x02af;
            case 3: goto L_0x02ef;
            case 4: goto L_0x01f1;
            case 5: goto L_0x01f5;
            case 6: goto L_0x0218;
            case 7: goto L_0x0241;
            case 8: goto L_0x024b;
            case 9: goto L_0x034f;
            case 10: goto L_0x0255;
            case 11: goto L_0x029d;
            case 12: goto L_0x0259;
            case 13: goto L_0x02a4;
            case 14: goto L_0x00ea;
            case 15: goto L_0x00f7;
            default: goto L_0x00e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        A04(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ea, code lost:
        r0 = (java.lang.String) r14.A03(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f0, code lost:
        if (r0 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f6, code lost:
        return r0.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f7, code lost:
        r2 = (X.AnonymousClass84O) r14.A03(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fd, code lost:
        if (r2 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0105, code lost:
        if (r2.A0D() != 13335) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        r1 = r2.A0K(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r1 == null) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011f, code lost:
        return X.C158977kt.A00().A06().A00(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01aa, code lost:
        r4 = (java.util.List) r14.A03(0);
        r8 = X.C155787fV.A00(r14.A04(1));
        r7 = X.AnonymousClass001.A0s();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c1, code lost:
        if (r5 >= r4.size()) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c3, code lost:
        r2 = r4.get(r5);
        r0 = new X.C152057Xj();
        r0.A05(r2, 0);
        r1 = X.C157157hp.A00(r13, r0.A03(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d9, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x01e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C131266dJ r13, X.C157967jD r14, X.C146787Bp r15) {
        /*
            r12 = this;
            java.lang.String r8 = r15.A00
            int r0 = r8.hashCode()
            java.lang.String r9 = "bk.action.array.FindIndex"
            r1 = 4
            r2 = 3
            java.lang.String r3 = "bk.action.array.Filter"
            java.lang.String r4 = "bk.action.array.Slice"
            r7 = 2
            r5 = 1
            r6 = 0
            switch(r0) {
                case -2026866692: goto L_0x001b;
                case -1946563488: goto L_0x003e;
                case -1483567756: goto L_0x0047;
                case -1334580548: goto L_0x0050;
                case -1244999280: goto L_0x005b;
                case -882687321: goto L_0x0065;
                case -717377024: goto L_0x006f;
                case -686296522: goto L_0x0079;
                case -275596506: goto L_0x0083;
                case -124232119: goto L_0x008e;
                case -79583337: goto L_0x0098;
                case -67237747: goto L_0x00a3;
                case 226394026: goto L_0x00ad;
                case 304820200: goto L_0x00b6;
                case 405636519: goto L_0x00c0;
                case 978494805: goto L_0x00cb;
                case 1851570220: goto L_0x00d6;
                case 1866622129: goto L_0x0120;
                case 1995238836: goto L_0x0170;
                case 2098589378: goto L_0x0193;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.48u r0 = r12.A00
            java.lang.Object r0 = r0.B2m(r14, r15, r13)
            return r0
        L_0x001b:
            java.lang.String r0 = "bk.action.array.Concat"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r14.A03(r6)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r14.A03(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            if (r2 == 0) goto L_0x0038
            r0.addAll(r2)
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r0.addAll(r1)
        L_0x003d:
            return r0
        L_0x003e:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x00e0
        L_0x0047:
            java.lang.String r0 = "bk.action.array.Map"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02af
            goto L_0x0014
        L_0x0050:
            java.lang.String r0 = "bk.action.animation.linear.CreateAnimation"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 3
            goto L_0x00e0
        L_0x005b:
            java.lang.String r0 = "bk.action.toast.ShowToast"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 4
            goto L_0x00e0
        L_0x0065:
            java.lang.String r0 = "bk.action.core.Delay"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 5
            goto L_0x00e0
        L_0x006f:
            java.lang.String r0 = "bk.action.animation.linear.SetNewEndValue"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 6
            goto L_0x00e0
        L_0x0079:
            java.lang.String r0 = "bk.action.animation.linear.Start"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 7
            goto L_0x00e0
        L_0x0083:
            java.lang.String r0 = "bk.action.animation.linear.Cancel"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 8
            goto L_0x00e0
        L_0x008e:
            java.lang.String r0 = "commerce.action.GetCreditCardMetadata"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x034f
            goto L_0x0014
        L_0x0098:
            java.lang.String r0 = "bk.action.toast.DismissToast"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 10
            goto L_0x00e0
        L_0x00a3:
            java.lang.String r0 = "bk.action.device.GetDeviceOSVersion"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x029d
            goto L_0x0014
        L_0x00ad:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x0014
            r0 = 12
            goto L_0x00e0
        L_0x00b6:
            java.lang.String r0 = "bk.action.url.Encode"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02a4
            goto L_0x0014
        L_0x00c0:
            java.lang.String r0 = "bk.action.fb.pmv.TrimString"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 14
            goto L_0x00e0
        L_0x00cb:
            java.lang.String r0 = "bk.action.text.GetText"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 15
            goto L_0x00e0
        L_0x00d6:
            java.lang.String r0 = "bk.action.toast.ShowToastV2"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 16
        L_0x00e0:
            r11 = 1148846080(0x447a0000, float:1000.0)
            r9 = 0
            switch(r0) {
                case 1: goto L_0x01aa;
                case 2: goto L_0x02af;
                case 3: goto L_0x02ef;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01f5;
                case 6: goto L_0x0218;
                case 7: goto L_0x0241;
                case 8: goto L_0x024b;
                case 9: goto L_0x034f;
                case 10: goto L_0x0255;
                case 11: goto L_0x029d;
                case 12: goto L_0x0259;
                case 13: goto L_0x02a4;
                case 14: goto L_0x00ea;
                case 15: goto L_0x00f7;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            A04(r13, r14)
        L_0x00e9:
            return r9
        L_0x00ea:
            java.lang.Object r0 = r14.A03(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00e9
            java.lang.String r9 = r0.trim()
            return r9
        L_0x00f7:
            java.lang.Object r2 = r14.A03(r6)
            X.84O r2 = (X.AnonymousClass84O) r2
            if (r2 == 0) goto L_0x00e9
            int r1 = r2.A0D()
            r0 = 13335(0x3417, float:1.8686E-41)
            if (r1 != r0) goto L_0x00e9
            r0 = 44
            X.84O r1 = r2.A0K(r0)
            if (r1 == 0) goto L_0x0370
            X.7kt r0 = X.C158977kt.A00()
            X.7hj r0 = r0.A06()
            java.lang.CharSequence r0 = r0.A00(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0120:
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r4 = r14.A04(r6)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r14.A04(r5)
            X.48t r5 = X.C155787fV.A00(r0)
            int r3 = r4.size()
            r2 = 0
        L_0x0139:
            if (r2 >= r3) goto L_0x0377
            java.lang.Object r1 = r4.get(r2)
            X.7Xj r0 = new X.7Xj
            r0.<init>()
            r0.A04(r1, r6)
            X.7jD r0 = r0.A03()
            java.lang.Object r1 = X.C157157hp.A00(r13, r0, r5)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x0162
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = "Got non-boolean result while evaluating FindIndex predicate"
            X.C159737mN.A01(r9, r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0162:
            boolean r0 = X.C159427lo.A02(r1)
            if (r0 == 0) goto L_0x016d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x016d:
            int r2 = r2 + 1
            goto L_0x0139
        L_0x0170:
            java.lang.String r0 = "bk.action.array.SortedArray"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r14.A04(r6)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r14.A04(r5)
            X.48t r2 = X.C155787fV.A00(r0)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r1)
            X.0n9 r0 = new X.0n9
            r0.<init>(r12, r13, r2)
            java.util.Collections.sort(r1, r0)
            return r1
        L_0x0193:
            java.lang.String r0 = "bk.action.animation.linear.GetCurrentValue"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r14.A03(r6)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            float r0 = X.AnonymousClass001.A03(r0)
            java.lang.Number r0 = X.C159427lo.A01(r0)
            return r0
        L_0x01aa:
            java.lang.Object r4 = r14.A03(r6)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r14.A04(r5)
            X.48t r8 = X.C155787fV.A00(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            r5 = 0
        L_0x01bd:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x02ee
            java.lang.Object r2 = r4.get(r5)
            X.7Xj r0 = new X.7Xj
            r0.<init>()
            r0.A05(r2, r6)
            X.7jD r0 = r0.A03()
            java.lang.Object r1 = X.C157157hp.A00(r13, r0, r8)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x01e5
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "Got non-boolean result while evaluating filter predicate"
            X.C159737mN.A01(r3, r0)
            return r9
        L_0x01e5:
            boolean r0 = X.C159427lo.A02(r1)
            if (r0 == 0) goto L_0x01ee
            r7.add(r2)
        L_0x01ee:
            int r5 = r5 + 1
            goto L_0x01bd
        L_0x01f1:
            A03(r13, r14)
            return r9
        L_0x01f5:
            java.lang.Object r4 = r14.A04(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r0 = r14.A04(r5)
            X.48t r1 = X.C155787fV.A00(r0)
            X.7bI r0 = X.AnonymousClass8DI.A06(r13, r14, r7)
            android.os.Handler r3 = X.AnonymousClass000.A0A()
            X.0mR r2 = new X.0mR
            r2.<init>(r12, r0, r13, r1)
            long r0 = r4.longValue()
            r3.postDelayed(r2, r0)
            return r9
        L_0x0218:
            java.lang.Object r4 = r14.A03(r6)
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            java.lang.Object r0 = r14.A04(r5)
            float r3 = X.AnonymousClass001.A05(r0)
            java.lang.Object r0 = r14.A04(r7)
            float r2 = X.AnonymousClass001.A05(r0)
            float r1 = X.AnonymousClass001.A03(r4)
            float[] r0 = new float[r7]
            r0[r6] = r1
            r0[r5] = r3
            r4.setFloatValues(r0)
            float r2 = r2 * r11
            long r0 = (long) r2
            r4.setDuration(r0)
            goto L_0x0247
        L_0x0241:
            java.lang.Object r4 = r14.A03(r6)
            android.animation.Animator r4 = (android.animation.Animator) r4
        L_0x0247:
            r4.start()
            return r9
        L_0x024b:
            java.lang.Object r0 = r14.A03(r6)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.cancel()
            return r9
        L_0x0255:
            A05(r14)
            return r9
        L_0x0259:
            java.lang.Object r3 = r14.A04(r6)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r14.A04(r5)
            int r2 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r1 = r14.A03(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r2 < 0) goto L_0x0280
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0280
            if (r1 != 0) goto L_0x0283
            int r0 = r3.size()
        L_0x027b:
            java.util.List r0 = r3.subList(r2, r0)
            return r0
        L_0x0280:
            java.lang.String r0 = "argument offset is out of bounds"
            goto L_0x028b
        L_0x0283:
            int r0 = r1.intValue()
            if (r0 >= 0) goto L_0x028f
            java.lang.String r0 = "argument length cannot be negative"
        L_0x028b:
            X.C159737mN.A01(r4, r0)
            return r9
        L_0x028f:
            int r1 = r1.intValue()
            int r1 = r1 + r2
            int r0 = r3.size()
            int r0 = java.lang.Math.min(r1, r0)
            goto L_0x027b
        L_0x029d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x02a4:
            java.lang.Object r0 = r14.A04(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = android.net.Uri.encode(r0)
            return r0
        L_0x02af:
            java.lang.Object r4 = r14.A03(r6)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r14.A04(r5)
            X.48t r3 = X.C155787fV.A00(r0)
            if (r4 != 0) goto L_0x02c2
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L_0x02c2:
            java.util.ArrayList r7 = X.AnonymousClass000.A0p(r4)
            r2 = 0
        L_0x02c7:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x02ee
            X.7Xj r1 = new X.7Xj
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A05(r0, r6)
            java.lang.Object r0 = r4.get(r2)
            r1.A05(r0, r5)
            X.7jD r0 = r1.A03()
            java.lang.Object r0 = X.C157157hp.A00(r13, r0, r3)
            r7.add(r0)
            int r2 = r2 + 1
            goto L_0x02c7
        L_0x02ee:
            return r7
        L_0x02ef:
            android.animation.ValueAnimator r3 = new android.animation.ValueAnimator
            r3.<init>()
            java.lang.Object r0 = r14.A04(r6)
            X.48t r9 = X.C155787fV.A00(r0)
            java.lang.Object r0 = r14.A04(r5)
            X.48t r8 = X.C155787fV.A00(r0)
            java.lang.Object r0 = r14.A04(r7)
            float r10 = X.AnonymousClass001.A05(r0)
            java.lang.Object r0 = r14.A04(r2)
            float r4 = X.AnonymousClass001.A05(r0)
            java.lang.Object r0 = r14.A04(r1)
            float r2 = X.AnonymousClass001.A05(r0)
            X.7Xj r0 = new X.7Xj
            r0.<init>()
            r0.A05(r3, r6)
            X.7jD r1 = r0.A03()
            X.0Yr r0 = new X.0Yr
            r0.<init>(r12, r13, r1, r9)
            r3.addUpdateListener(r0)
            X.0Yi r0 = new X.0Yi
            r0.<init>(r12, r13, r1, r8)
            r3.addListener(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            float[] r0 = new float[r7]
            r0[r6] = r10
            r0[r5] = r4
            r3.setFloatValues(r0)
            float r2 = r2 * r11
            long r0 = (long) r2
            r3.setDuration(r0)
            return r3
        L_0x034f:
            java.lang.Object r3 = r14.A03(r6)
            java.lang.String r3 = (java.lang.String) r3
            com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardType r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.determineType(r3)
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r1 = "cardType"
            java.lang.String r0 = r0.getTypeName()
            r2.put(r1, r0)
            java.lang.String r1 = "isValid"
            boolean r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.isCardNumberValid(r3)
            X.AnonymousClass000.A1C(r1, r2, r0)
            return r2
        L_0x0370:
            r0 = 41
            java.lang.String r0 = r2.A0O(r0)
            return r0
        L_0x0377:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10130hR.A08(X.6dJ, X.7jD, X.7Bp):java.lang.Object");
    }

    public C10130hR(C835348u r1) {
        this.A00 = r1;
    }
}
