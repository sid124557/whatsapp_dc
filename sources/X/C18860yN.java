package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@Deprecated
/* renamed from: X.0yN  reason: invalid class name and case insensitive filesystem */
public class C18860yN extends Handler {
    public final C69263Wi A00;
    public final C66663Mh A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final C66543Lv A06;
    public final C56892sj A07;
    public final AnonymousClass1VX A08;
    public final C50932j0 A09;
    public final C29071iE A0A;

    public static void A00(Message message, C18860yN r2) {
        r2.A09.A02((C95814uZ) message.obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0572, code lost:
        r3 = r15.A00;
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05fb, code lost:
        r3.A0F(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x061f, code lost:
        r5 = r15.A04.A00;
        r2 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x063a, code lost:
        r0 = X.AnonymousClass002.A0F(r5, r3.obj, new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x065c, code lost:
        r4.A0W(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x065f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x069b, code lost:
        r3.A0H(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x069e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06af, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06b2, code lost:
        r2 = (X.C624134x) r3.obj;
        r15.A06.A0V(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        r15.A00.A0W(r5.toString(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r3 = r16
            int r1 = r3.what
            r0 = 3
            if (r1 == r0) goto L_0x06a3
            r0 = 5
            if (r1 == r0) goto L_0x069f
            r0 = 6
            if (r1 == r0) goto L_0x0481
            r7 = 1
            r6 = 0
            switch(r1) {
                case 1001: goto L_0x045e;
                case 1002: goto L_0x0693;
                case 1003: goto L_0x068a;
                case 1004: goto L_0x045e;
                case 1005: goto L_0x0681;
                case 1006: goto L_0x0681;
                case 1007: goto L_0x0669;
                case 1008: goto L_0x0660;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r1) {
                case 2001: goto L_0x0631;
                case 2002: goto L_0x0627;
                case 2003: goto L_0x0609;
                case 2004: goto L_0x05ff;
                case 2005: goto L_0x05e1;
                case 2006: goto L_0x05cc;
                case 2007: goto L_0x05b7;
                case 2008: goto L_0x05a2;
                case 2009: goto L_0x058b;
                case 2010: goto L_0x0585;
                case 2011: goto L_0x057f;
                case 2012: goto L_0x0579;
                case 2013: goto L_0x0572;
                case 2014: goto L_0x0563;
                case 2015: goto L_0x055c;
                case 2016: goto L_0x0555;
                case 2017: goto L_0x054e;
                case 2018: goto L_0x0547;
                case 2019: goto L_0x0540;
                case 2020: goto L_0x0539;
                case 2021: goto L_0x0532;
                case 2022: goto L_0x052b;
                case 2023: goto L_0x0524;
                case 2024: goto L_0x051d;
                case 2025: goto L_0x0516;
                case 2026: goto L_0x050f;
                case 2027: goto L_0x0508;
                case 2028: goto L_0x0501;
                default: goto L_0x0015;
            }
        L_0x0015:
            r2 = 403(0x193, float:5.65E-43)
            r11 = 419(0x1a3, float:5.87E-43)
            r10 = 406(0x196, float:5.69E-43)
            r9 = 404(0x194, float:5.66E-43)
            java.lang.String r8 = "/"
            java.lang.String r4 = "\n"
            switch(r1) {
                case 3001: goto L_0x01a6;
                case 3002: goto L_0x0149;
                case 3003: goto L_0x00f7;
                case 3004: goto L_0x00a5;
                case 3005: goto L_0x04fa;
                case 3006: goto L_0x04f6;
                case 3007: goto L_0x056a;
                case 3008: goto L_0x04f2;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r1) {
                case 3010: goto L_0x04eb;
                case 3011: goto L_0x04e4;
                case 3012: goto L_0x04dd;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r1) {
                case 3014: goto L_0x0643;
                case 3015: goto L_0x04cd;
                case 3016: goto L_0x04c9;
                case 3017: goto L_0x04c5;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r1) {
                case 3019: goto L_0x002e;
                case 3020: goto L_0x06ad;
                case 3021: goto L_0x04c1;
                case 3022: goto L_0x04bd;
                case 3023: goto L_0x05f6;
                case 3024: goto L_0x04b6;
                case 3025: goto L_0x04af;
                case 3026: goto L_0x06b2;
                case 3027: goto L_0x04ab;
                default: goto L_0x002d;
            }
        L_0x002d:
            return
        L_0x002e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.Object r0 = r3.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r0)
        L_0x003a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x019c
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r12)
            X.4uZ r3 = X.C18320x8.A0N(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/add-cadmins/error/"
            X.AnonymousClass000.A17(r3, r0, r8, r1)
            java.lang.Object r0 = r9.getValue()
            X.C18260x0.A0n(r0, r1)
            int r1 = X.AnonymousClass0x2.A08(r9)
            X.3Ex r0 = r15.A02
            X.3ZH r10 = r0.A0A(r3)
            if (r1 == r2) goto L_0x0099
            if (r1 == r11) goto L_0x007f
            X.2oU r0 = r15.A04
            android.content.Context r9 = r0.A00
            r3 = 2131889060(0x7f120ba4, float:1.9412773E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5ZU r0 = r15.A03
            X.C18300x5.A1E(r0, r10, r1, r6)
            java.lang.String r0 = r9.getString(r3, r1)
        L_0x0078:
            r5.append(r0)
            r5.append(r4)
            goto L_0x003a
        L_0x007f:
            X.2sj r0 = r15.A07
            X.1VX r3 = r0.A0D
            r1 = 1655(0x677, float:2.319E-42)
            X.2vE r0 = X.C58422vE.A02
            int r3 = r3.A0O(r0, r1)
            X.2oU r0 = r15.A04
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131755119(0x7f10006f, float:1.9141108E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r3, r6, r0)
            goto L_0x0078
        L_0x0099:
            X.2oU r0 = r15.A04
            android.content.Context r1 = r0.A00
            r0 = 2131889062(0x7f120ba6, float:1.9412777E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0078
        L_0x00a5:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.Object r0 = r3.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r0)
        L_0x00b1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x019c
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r11)
            X.4uZ r2 = X.C18320x8.A0N(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/remove-admins/error/"
            X.AnonymousClass000.A17(r2, r0, r8, r1)
            java.lang.Object r0 = r3.getValue()
            X.C18260x0.A0n(r0, r1)
            int r1 = X.AnonymousClass0x2.A08(r3)
            X.3Ex r0 = r15.A02
            X.3ZH r4 = r0.A0A(r2)
            if (r1 == r9) goto L_0x00ef
            if (r1 != r10) goto L_0x00ef
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889118(0x7f120bde, float:1.941289E38)
        L_0x00e4:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5ZU r0 = r15.A03
            X.C18300x5.A1E(r0, r4, r1, r6)
            X.C18290x4.A1B(r3, r5, r1, r2)
            goto L_0x00b1
        L_0x00ef:
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889120(0x7f120be0, float:1.9412895E38)
            goto L_0x00e4
        L_0x00f7:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.Object r0 = r3.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r10 = X.AnonymousClass000.A0q(r0)
        L_0x0103:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x019c
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r10)
            X.4uZ r2 = X.C18320x8.A0N(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/add-admins/error/"
            X.AnonymousClass000.A17(r2, r0, r8, r1)
            java.lang.Object r0 = r3.getValue()
            X.C18260x0.A0n(r0, r1)
            int r1 = X.AnonymousClass0x2.A08(r3)
            X.3Ex r0 = r15.A02
            X.3ZH r4 = r0.A0A(r2)
            if (r1 == r9) goto L_0x0141
            if (r1 != r11) goto L_0x0141
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131895908(0x7f122664, float:1.9426662E38)
        L_0x0136:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5ZU r0 = r15.A03
            X.C18300x5.A1E(r0, r4, r1, r6)
            X.C18290x4.A1B(r3, r5, r1, r2)
            goto L_0x0103
        L_0x0141:
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889060(0x7f120ba4, float:1.9412773E38)
            goto L_0x0136
        L_0x0149:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.Object r0 = r3.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r0)
        L_0x0155:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0196
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r11)
            X.4uZ r2 = X.C18320x8.A0N(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/remove-participant/error/"
            X.AnonymousClass000.A17(r2, r0, r8, r1)
            java.lang.Object r0 = r3.getValue()
            X.C18260x0.A0n(r0, r1)
            int r1 = X.AnonymousClass0x2.A08(r3)
            X.3Ex r0 = r15.A02
            X.3ZH r4 = r0.A0A(r2)
            if (r1 == r9) goto L_0x0155
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889121(0x7f120be1, float:1.9412897E38)
            if (r1 == r10) goto L_0x018b
            r2 = 2131889120(0x7f120be0, float:1.9412895E38)
        L_0x018b:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5ZU r0 = r15.A03
            X.C18300x5.A1E(r0, r4, r1, r6)
            X.C18290x4.A1B(r3, r5, r1, r2)
            goto L_0x0155
        L_0x0196:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x002d
        L_0x019c:
            X.3Wi r1 = r15.A00
            java.lang.String r0 = r5.toString()
            r1.A0W(r0, r6)
            return
        L_0x01a6:
            java.lang.Object r0 = r3.obj
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x002d
            int r4 = r0.size()
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.util.Iterator r13 = X.AnonymousClass000.A0q(r0)
        L_0x01b8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01f8
            java.util.Map$Entry r12 = X.AnonymousClass001.A0w(r13)
            java.lang.Object r5 = r12.getKey()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/add-participant/error/"
            X.AnonymousClass000.A17(r5, r0, r8, r3)
            java.lang.Object r0 = r12.getValue()
            X.C18260x0.A0n(r0, r3)
            java.lang.Object r3 = r12.getValue()
            boolean r0 = r1.containsKey(r3)
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r3)
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r5)
            goto L_0x01b8
        L_0x01f0:
            java.util.ArrayList r0 = X.C18300x5.A0s(r5)
            r1.put(r3, r0)
            goto L_0x01b8
        L_0x01f8:
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0224
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0224
            X.3Wi r3 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889908(0x7f120ef4, float:1.9414493E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889907(0x7f120ef3, float:1.941449E38)
        L_0x021c:
            java.lang.String r0 = r2.getString(r0)
            r3.A0X(r1, r0, r6)
            return
        L_0x0224:
            r0 = 421419(0x66e2b, float:5.90534E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024a
            X.3Wi r3 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889082(0x7f120bba, float:1.9412818E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889081(0x7f120bb9, float:1.9412815E38)
            goto L_0x021c
        L_0x024a:
            r0 = 421(0x1a5, float:5.9E-43)
            X.AnonymousClass0x7.A1K(r1, r0)
            r0 = 409(0x199, float:5.73E-43)
            X.AnonymousClass0x7.A1K(r1, r0)
            X.AnonymousClass0x7.A1K(r1, r2)
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass0x7.A1K(r1, r0)
            r0 = 412(0x19c, float:5.77E-43)
            X.AnonymousClass0x7.A1K(r1, r0)
            X.AnonymousClass0x7.A1K(r1, r11)
            r0 = 451(0x1c3, float:6.32E-43)
            X.AnonymousClass0x7.A1K(r1, r0)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r1)
        L_0x0271:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x002d
            java.util.Map$Entry r13 = X.AnonymousClass001.A0w(r14)
            int r1 = X.C18280x3.A06(r13)
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x03ab
            r0 = 402(0x192, float:5.63E-43)
            if (r1 == r0) goto L_0x0369
            if (r1 == r9) goto L_0x0327
            if (r1 == r10) goto L_0x02fe
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x02bd
            r0 = 421304(0x66db8, float:5.90373E-40)
            if (r1 == r0) goto L_0x03ea
            r8.setLength(r6)
            java.lang.Object r0 = r13.getValue()
            java.util.Iterator r11 = X.C18320x8.A0q(r0)
        L_0x029f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03d4
            X.4uZ r10 = X.C18300x5.A0P(r11)
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889060(0x7f120ba4, float:1.9412773E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.5ZU r1 = r15.A03
            X.3Ex r0 = r15.A02
            X.C64773Ex.A01(r0, r1, r10, r2)
            X.C18290x4.A1B(r5, r8, r2, r3)
            goto L_0x029f
        L_0x02bd:
            java.lang.Object r11 = r13.getValue()
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x0421
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0421
            int r2 = r11.size()
            X.2oU r0 = r15.A04
            if (r2 != r7) goto L_0x02f2
            android.content.Context r10 = r0.A00
            r5 = 2131889064(0x7f120ba8, float:1.941278E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.5ZU r2 = r15.A03
            X.3Ex r1 = r15.A02
            java.lang.Object r0 = r11.get(r6)
            X.4uZ r0 = (X.C95814uZ) r0
            X.C64773Ex.A01(r1, r2, r0, r3)
            java.lang.String r1 = r10.getString(r5, r3)
        L_0x02eb:
            X.3Wi r0 = r15.A00
            r0.A0W(r1, r6)
            goto L_0x0421
        L_0x02f2:
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131755105(0x7f100061, float:1.914108E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0Y(r1, r2, r6, r0)
            goto L_0x02eb
        L_0x02fe:
            r8.setLength(r6)
            java.lang.Object r0 = r13.getValue()
            java.util.Iterator r11 = X.C18320x8.A0q(r0)
        L_0x0309:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03d4
            X.4uZ r10 = X.C18300x5.A0P(r11)
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889063(0x7f120ba7, float:1.9412779E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.5ZU r1 = r15.A03
            X.3Ex r0 = r15.A02
            X.C64773Ex.A01(r0, r1, r10, r2)
            X.C18290x4.A1B(r5, r8, r2, r3)
            goto L_0x0309
        L_0x0327:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r7) goto L_0x033f
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131889977(0x7f120f39, float:1.9414633E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889107(0x7f120bd3, float:1.9412868E38)
            goto L_0x0400
        L_0x033f:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r4) goto L_0x0357
            X.3Wi r3 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889977(0x7f120f39, float:1.9414633E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889067(0x7f120bab, float:1.9412787E38)
            goto L_0x043b
        L_0x0357:
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131890031(0x7f120f6f, float:1.9414742E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889127(0x7f120be7, float:1.9412909E38)
            goto L_0x0453
        L_0x0369:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r7) goto L_0x0381
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131889977(0x7f120f39, float:1.9414633E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889106(0x7f120bd2, float:1.9412866E38)
            goto L_0x0400
        L_0x0381:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r4) goto L_0x0399
            X.3Wi r3 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889977(0x7f120f39, float:1.9414633E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889066(0x7f120baa, float:1.9412785E38)
            goto L_0x043b
        L_0x0399:
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131890031(0x7f120f6f, float:1.9414742E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889126(0x7f120be6, float:1.9412907E38)
            goto L_0x0453
        L_0x03ab:
            r8.setLength(r6)
            java.lang.Object r0 = r13.getValue()
            java.util.Iterator r11 = X.C18320x8.A0q(r0)
        L_0x03b6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03d4
            X.4uZ r10 = X.C18300x5.A0P(r11)
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889061(0x7f120ba5, float:1.9412775E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.5ZU r1 = r15.A03
            X.3Ex r0 = r15.A02
            X.C64773Ex.A01(r0, r1, r10, r2)
            X.C18290x4.A1B(r5, r8, r2, r3)
            goto L_0x03b6
        L_0x03d4:
            java.lang.Object r0 = r13.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0421
            X.3Wi r1 = r15.A00
            java.lang.String r0 = r8.toString()
            r1.A0W(r0, r6)
            goto L_0x0421
        L_0x03ea:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r7) goto L_0x0425
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131889080(0x7f120bb8, float:1.9412813E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889105(0x7f120bd1, float:1.9412864E38)
        L_0x0400:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.5ZU r2 = r15.A03
            X.3Ex r1 = r15.A02
            java.lang.Object r0 = r13.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r6)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r0 = r1.A0A(r0)
            java.lang.String r0 = r2.A0H(r0)
        L_0x041a:
            java.lang.String r0 = X.AnonymousClass002.A0F(r11, r0, r3, r6, r12)
            r5.A0X(r10, r0, r6)
        L_0x0421:
            r10 = 406(0x196, float:5.69E-43)
            goto L_0x0271
        L_0x0425:
            int r0 = X.C18290x4.A06(r13)
            if (r0 != r4) goto L_0x0443
            X.3Wi r3 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889080(0x7f120bb8, float:1.9412813E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889065(0x7f120ba9, float:1.9412783E38)
        L_0x043b:
            java.lang.String r0 = r2.getString(r0)
            r3.A0X(r1, r0, r6)
            goto L_0x0421
        L_0x0443:
            X.3Wi r5 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r11 = r0.A00
            r0 = 2131889125(0x7f120be5, float:1.9412905E38)
            java.lang.String r10 = r11.getString(r0)
            r12 = 2131889124(0x7f120be4, float:1.9412903E38)
        L_0x0453:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            int r0 = X.C18290x4.A06(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x041a
        L_0x045e:
            java.lang.Object r1 = r3.obj
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r15.A02
            X.3ZH r5 = r0.A09(r1)
            if (r5 == 0) goto L_0x002d
            X.3Wi r4 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889319(0x7f120ca7, float:1.9413298E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r5.A0J()
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r0, r1, r6, r2)
            r4.A0P(r0, r6)
            return
        L_0x0481:
            X.1iE r0 = r15.A0A
            java.lang.Object r4 = r3.obj
            X.2Kq r4 = (X.C41542Kq) r4
            java.util.Iterator r3 = X.C61102zi.A03(r0)
        L_0x048b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r3.next()
            X.2I6 r0 = (X.AnonymousClass2I6) r0
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r2 = r0.A00
            X.1fJ r1 = r2.A0B
            if (r1 == 0) goto L_0x048b
            X.1fJ r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x048b
            java.lang.String r0 = r4.A01
            r2.A7D(r0)
            goto L_0x048b
        L_0x04ab:
            java.lang.String r0 = "groupmgr/handle groupchat report to admin status change"
            goto L_0x06af
        L_0x04af:
            X.3Wi r3 = r15.A00
            r1 = 2131889085(0x7f120bbd, float:1.9412824E38)
            goto L_0x05fb
        L_0x04b6:
            X.3Wi r3 = r15.A00
            r1 = 2131889084(0x7f120bbc, float:1.9412822E38)
            goto L_0x05fb
        L_0x04bd:
            java.lang.String r0 = "groupmgr/handle group member add mode change"
            goto L_0x06af
        L_0x04c1:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval mode change"
            goto L_0x06af
        L_0x04c5:
            java.lang.String r0 = "groupmgr/handle groupchat ephemeral setting changed"
            goto L_0x06af
        L_0x04c9:
            java.lang.String r0 = "groupmgr/handle groupchat no frequently forwarded change"
            goto L_0x06af
        L_0x04cd:
            java.lang.String r0 = "groupmgr/handle groupchat description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r3.obj
            X.34x r2 = (X.C624134x) r2
            X.3Lv r0 = r15.A06
            r0.A0Y(r2)
            goto L_0x06bb
        L_0x04dd:
            X.3Wi r3 = r15.A00
            r1 = 2131889325(0x7f120cad, float:1.941331E38)
            goto L_0x05fb
        L_0x04e4:
            X.3Wi r3 = r15.A00
            r1 = 2131889327(0x7f120caf, float:1.9413314E38)
            goto L_0x05fb
        L_0x04eb:
            X.3Wi r3 = r15.A00
            r1 = 2131889326(0x7f120cae, float:1.9413312E38)
            goto L_0x05fb
        L_0x04f2:
            java.lang.String r0 = "groupmgr/handle groupchat restrict mode change"
            goto L_0x06af
        L_0x04f6:
            java.lang.String r0 = "groupmgr/handle groupchat description change"
            goto L_0x06af
        L_0x04fa:
            X.3Wi r3 = r15.A00
            r1 = 2131889856(0x7f120ec0, float:1.9414387E38)
            goto L_0x05fb
        L_0x0501:
            X.3Wi r3 = r15.A00
            r1 = 2131890396(0x7f1210dc, float:1.9415483E38)
            goto L_0x05fb
        L_0x0508:
            X.3Wi r3 = r15.A00
            r1 = 2131888360(0x7f1208e8, float:1.9411353E38)
            goto L_0x05fb
        L_0x050f:
            X.3Wi r3 = r15.A00
            r1 = 2131889861(0x7f120ec5, float:1.9414398E38)
            goto L_0x05fb
        L_0x0516:
            X.3Wi r3 = r15.A00
            r1 = 2131889870(0x7f120ece, float:1.9414416E38)
            goto L_0x05fb
        L_0x051d:
            X.3Wi r3 = r15.A00
            r1 = 2131889872(0x7f120ed0, float:1.941442E38)
            goto L_0x05fb
        L_0x0524:
            X.3Wi r3 = r15.A00
            r1 = 2131889873(0x7f120ed1, float:1.9414422E38)
            goto L_0x05fb
        L_0x052b:
            X.3Wi r3 = r15.A00
            r1 = 2131889871(0x7f120ecf, float:1.9414418E38)
            goto L_0x05fb
        L_0x0532:
            X.3Wi r3 = r15.A00
            r1 = 2131889858(0x7f120ec2, float:1.9414391E38)
            goto L_0x05fb
        L_0x0539:
            X.3Wi r3 = r15.A00
            r1 = 2131889860(0x7f120ec4, float:1.9414395E38)
            goto L_0x05fb
        L_0x0540:
            X.3Wi r3 = r15.A00
            r1 = 2131889859(0x7f120ec3, float:1.9414393E38)
            goto L_0x05fb
        L_0x0547:
            X.3Wi r3 = r15.A00
            r1 = 2131889857(0x7f120ec1, float:1.941439E38)
            goto L_0x05fb
        L_0x054e:
            X.3Wi r3 = r15.A00
            r1 = 2131889879(0x7f120ed7, float:1.9414434E38)
            goto L_0x05fb
        L_0x0555:
            X.3Wi r3 = r15.A00
            r1 = 2131889881(0x7f120ed9, float:1.9414438E38)
            goto L_0x05fb
        L_0x055c:
            X.3Wi r3 = r15.A00
            r1 = 2131889880(0x7f120ed8, float:1.9414436E38)
            goto L_0x05fb
        L_0x0563:
            X.3Wi r3 = r15.A00
            r1 = 2131889878(0x7f120ed6, float:1.9414432E38)
            goto L_0x05fb
        L_0x056a:
            X.3Wi r1 = r15.A00
            r0 = 2131889851(0x7f120ebb, float:1.9414377E38)
            r1.A0F(r0, r6)
        L_0x0572:
            X.3Wi r3 = r15.A00
            r1 = 2131889853(0x7f120ebd, float:1.9414381E38)
            goto L_0x05fb
        L_0x0579:
            X.3Wi r3 = r15.A00
            r1 = 2131889855(0x7f120ebf, float:1.9414385E38)
            goto L_0x05fb
        L_0x057f:
            X.3Wi r3 = r15.A00
            r1 = 2131889854(0x7f120ebe, float:1.9414383E38)
            goto L_0x05fb
        L_0x0585:
            X.3Wi r3 = r15.A00
            r1 = 2131889852(0x7f120ebc, float:1.941438E38)
            goto L_0x05fb
        L_0x058b:
            X.3Wi r4 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x061f
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889886(0x7f120ede, float:1.9414448E38)
            goto L_0x063a
        L_0x05a2:
            X.3Wi r3 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 2131889883(0x7f120edb, float:1.9414442E38)
            if (r0 == 0) goto L_0x05fb
            r1 = 2131889875(0x7f120ed3, float:1.9414426E38)
            goto L_0x05fb
        L_0x05b7:
            X.3Wi r3 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 2131889885(0x7f120edd, float:1.9414446E38)
            if (r0 == 0) goto L_0x05fb
            r1 = 2131889877(0x7f120ed5, float:1.941443E38)
            goto L_0x05fb
        L_0x05cc:
            X.3Wi r3 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 2131889884(0x7f120edc, float:1.9414444E38)
            if (r0 == 0) goto L_0x05fb
            r1 = 2131889876(0x7f120ed4, float:1.9414428E38)
            goto L_0x05fb
        L_0x05e1:
            X.3Wi r3 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 2131889882(0x7f120eda, float:1.941444E38)
            if (r0 == 0) goto L_0x05fb
            r1 = 2131889874(0x7f120ed2, float:1.9414424E38)
            goto L_0x05fb
        L_0x05f6:
            X.3Wi r3 = r15.A00
            r1 = 2131889083(0x7f120bbb, float:1.941282E38)
        L_0x05fb:
            r3.A0F(r1, r6)
            return
        L_0x05ff:
            X.3Wi r4 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889866(0x7f120eca, float:1.9414408E38)
            goto L_0x063a
        L_0x0609:
            X.3Wi r4 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x061f
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889864(0x7f120ec8, float:1.9414404E38)
            goto L_0x063a
        L_0x061f:
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889863(0x7f120ec7, float:1.9414402E38)
            goto L_0x063a
        L_0x0627:
            X.3Wi r4 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889865(0x7f120ec9, float:1.9414406E38)
            goto L_0x063a
        L_0x0631:
            X.3Wi r4 = r15.A00
            X.2oU r0 = r15.A04
            android.content.Context r5 = r0.A00
            r2 = 2131889862(0x7f120ec6, float:1.94144E38)
        L_0x063a:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r3.obj
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r6, r2)
            goto L_0x065c
        L_0x0643:
            X.3Mh r1 = r15.A01
            X.1Ek r0 = X.C66663Mh.A13
            int r8 = r1.A03(r0)
            X.3Wi r4 = r15.A00
            X.33j r5 = r15.A05
            r3 = 2131755421(0x7f10019d, float:1.914172E38)
            long r0 = (long) r8
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.AnonymousClass000.A1P(r2, r8, r6)
            java.lang.String r0 = r5.A0L(r2, r3, r0)
        L_0x065c:
            r4.A0W(r0, r6)
            return
        L_0x0660:
            A00(r3, r15)
            X.3Wi r3 = r15.A00
            r1 = 2131889861(0x7f120ec5, float:1.9414398E38)
            goto L_0x069b
        L_0x0669:
            A00(r3, r15)
            X.3Wi r3 = r15.A00
            X.1VX r2 = r15.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 2131889882(0x7f120eda, float:1.941444E38)
            if (r0 == 0) goto L_0x069b
            r1 = 2131889874(0x7f120ed2, float:1.9414424E38)
            goto L_0x069b
        L_0x0681:
            A00(r3, r15)
            X.3Wi r3 = r15.A00
            r1 = 2131889857(0x7f120ec1, float:1.941439E38)
            goto L_0x069b
        L_0x068a:
            A00(r3, r15)
            X.3Wi r3 = r15.A00
            r1 = 2131889878(0x7f120ed6, float:1.9414432E38)
            goto L_0x069b
        L_0x0693:
            A00(r3, r15)
            X.3Wi r3 = r15.A00
            r1 = 2131889852(0x7f120ebc, float:1.941438E38)
        L_0x069b:
            r3.A0H(r1, r6)
            return
        L_0x069f:
            A00(r3, r15)
            return
        L_0x06a3:
            java.lang.String r0 = "groupmgr/conversations/leave group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r3.obj
            X.34x r2 = (X.C624134x) r2
            goto L_0x06bb
        L_0x06ad:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval request"
        L_0x06af:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x06b2:
            java.lang.Object r2 = r3.obj
            X.34x r2 = (X.C624134x) r2
            X.3Lv r0 = r15.A06
            r0.A0V(r2)
        L_0x06bb:
            X.2j0 r1 = r15.A09
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860yN.handleMessage(android.os.Message):void");
    }

    public C18860yN(C69263Wi r2, C66663Mh r3, C64773Ex r4, AnonymousClass5ZU r5, C54292oU r6, C620733j r7, C66543Lv r8, C56892sj r9, AnonymousClass1VX r10, C50932j0 r11, C29071iE r12) {
        super(Looper.getMainLooper());
        this.A08 = r10;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        this.A07 = r9;
        this.A0A = r12;
    }
}
