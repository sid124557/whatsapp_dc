package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.35k  reason: invalid class name and case insensitive filesystem */
public class C625235k {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final C48752fP A02;
    public final C51992ki A03;
    public final C59122wO A04;
    public final C54472om A05;

    public static AnonymousClass1ED A01(AnonymousClass1EI r2) {
        Object obj;
        if (r2.formatCase_ == 1) {
            AnonymousClass1EJ A0M = r2.A0M();
            if (A0M.titleCase_ == 4) {
                obj = A0M.title_;
            }
            return AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        AnonymousClass1EK A0V = AnonymousClass0x9.A0V(r2);
        if (A0V.titleCase_ == 4) {
            obj = A0V.title_;
        }
        return AnonymousClass1ED.DEFAULT_INSTANCE;
        return (AnonymousClass1ED) obj;
    }

    public C625235k(C55682qk r1, AnonymousClass1VX r2, C48752fP r3, C51992ki r4, C59122wO r5, C54472om r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static AnonymousClass1ER A00(AnonymousClass1EU r3) {
        if (r3.A0M()) {
            AnonymousClass1EI r0 = r3.templateMessage_;
            AnonymousClass1EI r2 = r0;
            if (r0 == null) {
                r0 = AnonymousClass1EI.DEFAULT_INSTANCE;
            }
            if (r0.formatCase_ == 5) {
                if (r2 == null) {
                    r2 = AnonymousClass1EI.DEFAULT_INSTANCE;
                }
                if (r2.formatCase_ == 5) {
                    return (AnonymousClass1ER) r2.format_;
                }
                return AnonymousClass1ER.DEFAULT_INSTANCE;
            }
        }
        AnonymousClass1ER r02 = r3.interactiveMessage_;
        if (r02 != null) {
            return r02;
        }
        return AnonymousClass1ER.DEFAULT_INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        if (r3 == 2) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        if (r3 == 2) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(X.AnonymousClass1VX r11, X.AnonymousClass1EK r12) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r10 = 0
        L_0x0005:
            X.8ya r0 = r12.hydratedButtons_
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x00de
            X.8ya r0 = r12.hydratedButtons_
            java.lang.Object r2 = r0.get(r10)
            X.1EH r2 = (X.AnonymousClass1EH) r2
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x00c0
            java.lang.Object r0 = r2.hydratedButton_
            X.1B8 r0 = (X.AnonymousClass1B8) r0
            java.lang.String r3 = r0.displayText_
        L_0x0020:
            r0 = 50
            java.lang.String r6 = X.C107575bX.A0D(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0089
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x0096
            java.lang.Object r0 = r2.hydratedButton_
            X.1B8 r0 = (X.AnonymousClass1B8) r0
            java.lang.String r7 = r0.id_
        L_0x0037:
            java.lang.String r8 = ""
            r0 = 1
            if (r3 != r0) goto L_0x00b9
            r9 = 1
        L_0x003d:
            X.2w3 r5 = new X.2w3
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = 5970(0x1752, float:8.366E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r3, r4)
            if (r0 == 0) goto L_0x0086
            boolean r0 = r11.A0Y(r3, r4)
            if (r0 == 0) goto L_0x0094
            int r3 = r2.hydratedButtonCase_
            r0 = 2
            if (r3 != r0) goto L_0x0094
            X.1Ch r0 = r2.A0M()
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0094
            X.1Ch r0 = r2.A0M()
            int r0 = r0.webviewPresentation_
            X.23A r0 = X.AnonymousClass23A.A00(r0)
            if (r0 != 0) goto L_0x006f
            X.23A r0 = X.AnonymousClass23A.FULL
        L_0x006f:
            int r2 = r0.ordinal()
            r0 = 0
            if (r2 == r0) goto L_0x0091
            r0 = 1
            if (r2 == r0) goto L_0x008d
            r0 = 2
            if (r2 != r0) goto L_0x00d9
            java.lang.String r2 = "compact"
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0086
            r5.A03 = r2
        L_0x0086:
            r1.add(r5)
        L_0x0089:
            int r10 = r10 + 1
            goto L_0x0005
        L_0x008d:
            java.lang.String r2 = "tall"
            goto L_0x007e
        L_0x0091:
            java.lang.String r2 = "full"
            goto L_0x007e
        L_0x0094:
            r2 = 0
            goto L_0x007e
        L_0x0096:
            r0 = 2
            if (r3 != r0) goto L_0x00a6
            X.1Ch r0 = r2.A0M()
            java.lang.String r7 = r0.url_
        L_0x009f:
            X.1Ch r0 = r2.A0M()
            java.lang.String r8 = r0.consentedUsersUrl_
            goto L_0x00bd
        L_0x00a6:
            r0 = 3
            if (r3 != r0) goto L_0x00b6
            java.lang.Object r0 = r2.hydratedButton_
            X.1B7 r0 = (X.AnonymousClass1B7) r0
        L_0x00ad:
            java.lang.String r7 = r0.phoneNumber_
            r0 = 1
            if (r3 == r0) goto L_0x0037
            r0 = 2
            if (r3 != r0) goto L_0x0037
            goto L_0x009f
        L_0x00b6:
            X.1B7 r0 = X.AnonymousClass1B7.DEFAULT_INSTANCE
            goto L_0x00ad
        L_0x00b9:
            r0 = 2
            r9 = 3
            if (r3 != r0) goto L_0x003d
        L_0x00bd:
            r9 = 2
            goto L_0x003d
        L_0x00c0:
            r0 = 2
            if (r3 != r0) goto L_0x00cb
            X.1Ch r0 = r2.A0M()
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00cb:
            r0 = 3
            if (r3 != r0) goto L_0x00d6
            java.lang.Object r0 = r2.hydratedButton_
            X.1B7 r0 = (X.AnonymousClass1B7) r0
        L_0x00d2:
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00d6:
            X.1B7 r0 = X.AnonymousClass1B7.DEFAULT_INSTANCE
            goto L_0x00d2
        L_0x00d9:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00de:
            int r0 = r1.size()
            if (r0 > 0) goto L_0x00e5
            r1 = 0
        L_0x00e5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625235k.A02(X.1VX, X.1EK):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0.formatCase_ == 5) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass1EU r2) {
        /*
            boolean r0 = r2.A0M()
            if (r0 == 0) goto L_0x0013
            X.1EI r0 = r2.templateMessage_
            if (r0 != 0) goto L_0x000c
            X.1EI r0 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x000c:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0013
        L_0x0011:
            r1 = 1
        L_0x0012:
            return r1
        L_0x0013:
            int r0 = r2.bitField1_
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625235k.A03(X.1EU):boolean");
    }

    public final void A04(String str, List list) {
        Iterator it = list.iterator();
        C58932w3 r1 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            C58932w3 r4 = (C58932w3) it.next();
            if (r4 == null) {
                i++;
            } else {
                if (r4.A08.isEmpty()) {
                    i2++;
                }
                int i6 = r4.A06;
                if (i6 == 2) {
                    i3++;
                } else if (i6 == 3) {
                    i4++;
                }
                if (!(r1 == null || AnonymousClass001.A1T(r1.A06) == AnonymousClass001.A1T(i6))) {
                    i5++;
                }
                r1 = r4;
            }
        }
        if (list.size() > 10) {
            this.A00.A0A("TemplateMessageHasMoreThanTenTemplateButtons", true, String.format("%s: FMessage field of templateInfo has more than 10 templateButtons", new Object[]{str}));
        }
        if (i > 0) {
            this.A00.A0A("TemplateMessageHasNullInButtonList", true, String.format("%s: FMessage field of templateInfo has at least 1 null templateButton", new Object[]{str}));
        }
        if (i2 > 0) {
            this.A00.A0A("TemplateMessageHasTemplateButtonWithEmptyText", true, String.format("%s: FMessage field of templateInfo has at least 1 button with empty text", new Object[]{str}));
        }
        if (i3 > 2) {
            this.A00.A0A("TemplateMessageHasMoreThanTwoURLButtons", true, String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed URL buttons of 2", new Object[]{str}));
        }
        if (i4 > 1) {
            this.A00.A0A("TemplateMessageHasMoreThanOneCallButton", true, String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[]{str}));
        }
        if (i5 > 1) {
            this.A00.A0A("TemplateMessageHasStaggeredTemplateButtons", true, String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[]{str}));
        }
    }
}
