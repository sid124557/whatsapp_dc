package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6rH  reason: invalid class name and case insensitive filesystem */
public class C138956rH extends C41022Iq {
    public Object A00;
    public Object A01;

    public static boolean A04(AnonymousClass36K r8, C138956rH r9) {
        AnonymousClass36K.A0N(r8, "iq");
        r9.A01 = C626836d.A05(r8, UserJid.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"to"}, false);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ae, code lost:
        r0 = X.C626836d.A07(r4, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e2, code lost:
        r3.A01 = X.AnonymousClass92Z.A00(r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = X.C626836d.A02(r4, new X.AnonymousClass92Z(r5, r1), r2 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138956rH(X.AnonymousClass36K r4, X.AnonymousClass36K r5, int r6) {
        /*
            r3 = this;
            switch(r6) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b4;
                case 3: goto L_0x007a;
                case 14: goto L_0x0038;
                case 16: goto L_0x0024;
                case 24: goto L_0x001a;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3.<init>()
            boolean r2 = A04(r4, r3)
            r1 = 103(0x67, float:1.44E-43)
        L_0x000c:
            X.92Z r0 = new X.92Z
            r0.<init>(r5, r1)
            java.lang.Object r0 = X.C626836d.A02(r4, r0, r2)
        L_0x0015:
            r3.A00 = r0
        L_0x0017:
            r3.A00 = r4
            return
        L_0x001a:
            r3.<init>()
            boolean r2 = A04(r4, r3)
            r1 = 72
            goto L_0x000c
        L_0x0024:
            r3.<init>()
            java.lang.String r0 = "iq"
            X.AnonymousClass36K.A0N(r4, r0)
            r0 = 292(0x124, float:4.09E-43)
            java.lang.Object r0 = X.C1896292a.A0J(r4, r0)
            r3.A00 = r0
            r0 = 51
            goto L_0x00e2
        L_0x0038:
            r3.<init>()
            java.lang.String r0 = "iq"
            X.AnonymousClass36K.A0N(r4, r0)
            r1 = 32
            X.92Z r0 = new X.92Z
            r0.<init>(r5, r1)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r4, r0, r2)
            r3.A01 = r0
            r0 = 6
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 251(0xfb, float:3.52E-43)
            X.C1896292a.A0U(r1, r0, r2)
            r0 = 252(0xfc, float:3.53E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 253(0xfd, float:3.55E-43)
            X.C1896292a.A0Q(r1, r0)
            r0 = 254(0xfe, float:3.56E-43)
            X.C1896292a.A0R(r1, r0)
            r0 = 255(0xff, float:3.57E-43)
            X.C1896292a.A0S(r1, r0)
            r0 = 256(0x100, float:3.59E-43)
            X.C1896292a.A0T(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = X.AnonymousClass6CA.A0i()
            java.lang.String r0 = "IQErrorInternalServerError|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorSequencingPending"
            goto L_0x00ae
        L_0x007a:
            r3.<init>()
            java.lang.String r0 = "iq"
            X.AnonymousClass36K.A0N(r4, r0)
            r1 = 18
            X.92Z r0 = new X.92Z
            r0.<init>(r5, r1)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r4, r0, r2)
            r3.A01 = r0
            r0 = 4
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 94
            X.C1896292a.A0U(r1, r0, r2)
            r0 = 95
            X.C1896292a.A0P(r1, r0)
            r0 = 96
            X.C1896292a.A0Q(r1, r0)
            r0 = 97
            java.util.ArrayList r2 = X.C1896292a.A0M(r1, r0)
            java.lang.String[] r1 = X.AnonymousClass6CA.A0i()
            java.lang.String r0 = "IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorPartialServerError|IQErrorFallbackServer"
        L_0x00ae:
            java.lang.Object r0 = X.C626836d.A07(r4, r0, r2, r1)
            goto L_0x0015
        L_0x00b4:
            r3.<init>()
            boolean r2 = A04(r4, r3)
            r1 = 17
            goto L_0x000c
        L_0x00bf:
            r3.<init>()
            boolean r2 = A04(r4, r3)
            r1 = 16
            goto L_0x000c
        L_0x00ca:
            r3.<init>()
            java.lang.String r0 = "iq"
            X.AnonymousClass36K.A0N(r4, r0)
            r0 = 68
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String r0 = "fds"
            java.lang.Object r0 = X.AnonymousClass6C8.A0b(r4, r1, r0)
            r3.A00 = r0
            r0 = 13
        L_0x00e2:
            java.lang.Object r0 = X.AnonymousClass92Z.A00(r5, r4, r0)
            r3.A01 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138956rH.<init>(X.36K, X.36K, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01a6, code lost:
        r0 = X.C626836d.A0B(r6, r7, r8, r9, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138956rH(X.AnonymousClass36K r14, int r15) {
        /*
            r13 = this;
            r6 = r14
            switch(r15) {
                case 4: goto L_0x0372;
                case 5: goto L_0x032e;
                case 6: goto L_0x02ec;
                case 7: goto L_0x02bf;
                case 8: goto L_0x029c;
                case 9: goto L_0x026a;
                case 10: goto L_0x0231;
                case 11: goto L_0x02bf;
                case 12: goto L_0x0212;
                case 13: goto L_0x01dc;
                case 14: goto L_0x0004;
                case 15: goto L_0x01ac;
                case 16: goto L_0x0004;
                case 17: goto L_0x0185;
                case 18: goto L_0x0157;
                case 19: goto L_0x0122;
                case 20: goto L_0x00fe;
                case 21: goto L_0x00d3;
                case 22: goto L_0x009d;
                case 23: goto L_0x007b;
                case 24: goto L_0x0004;
                case 25: goto L_0x0058;
                case 26: goto L_0x0039;
                default: goto L_0x0004;
            }
        L_0x0004:
            r13.<init>()
            java.lang.String r0 = "notice"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "id"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            r12 = 0
            r10 = 0
            java.lang.Long r8 = X.AnonymousClass0x2.A0T()
            java.lang.Long r9 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r0
            java.lang.String r0 = "stage"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
        L_0x0034:
            r13.A01 = r0
        L_0x0036:
            r13.A00 = r14
            return
        L_0x0039:
            r13.<init>()
            java.lang.String r0 = "notice"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "t"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r1 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0b(r14, r0, r2)
            r13.A01 = r0
            r0 = 440(0x1b8, float:6.17E-43)
            java.lang.Object r0 = X.C1896292a.A0L(r14, r0, r1)
            goto L_0x0266
        L_0x0058:
            r13.<init>()
            java.lang.String r0 = "pacing"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "promotion_config"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 403(0x193, float:5.65E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r14, r1, r0)
            r13.A00 = r0
            java.lang.String r0 = "user_info"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 404(0x194, float:5.66E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r14, r1, r0)
            goto L_0x0034
        L_0x007b:
            r13.<init>()
            java.lang.String r0 = "product"
            X.AnonymousClass36K.A0N(r14, r0)
            r0 = 360(0x168, float:5.04E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r14, r0, r2)
            r13.A00 = r0
            r0 = 361(0x169, float:5.06E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r14, r1, r0)     // Catch:{ 24Y -> 0x036f }
            goto L_0x0034
        L_0x009d:
            r13.<init>()
            java.lang.String r0 = "item"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "t"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r1 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0b(r14, r0, r2)
            r13.A01 = r0
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            r2[r1] = r0
            r1 = 1
            java.lang.Class<X.6kC> r0 = X.C135146kC.class
            r2[r1] = r0
            r1 = 2
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.List r1 = X.AnonymousClass0x9.A1A(r0, r2, r1)
            java.lang.String r0 = "from"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.whatsapp.jid.Jid r0 = X.C626836d.A00(r14, r1, r0)
            goto L_0x0266
        L_0x00d3:
            r13.<init>()
            java.lang.String r0 = "status_msgs"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "count"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0b(r14, r0, r1)
            r13.A00 = r0
            java.lang.String r0 = "item"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            r0 = 352(0x160, float:4.93E-43)
            X.92a r7 = X.C1896292a.A00(r0)
            r9 = 1
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x01a6
        L_0x00fe:
            r13.<init>()
            java.lang.String r0 = "thread_metadata"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "status_msgs"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r14, r1, r0)
            r13.A01 = r0
            java.lang.String r0 = "notifications"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 351(0x15f, float:4.92E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r14, r1, r0)
            goto L_0x0266
        L_0x0122:
            r13.<init>()
            java.lang.String r0 = "vote"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "count"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            r12 = 0
            r10 = 0
            java.lang.Long r8 = X.AnonymousClass0x2.A0U()
            java.lang.Long r9 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r0
            java.lang.String r0 = "#elementValue"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<byte[]> r7 = byte[].class
            r0 = 32
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r9 = r8
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0034
        L_0x0157:
            r13.<init>()
            java.lang.String r0 = "message"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "server_id"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            r12 = 0
            r10 = 0
            java.lang.Long r8 = X.AnonymousClass0x2.A0T()
            java.lang.Long r9 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r0
            java.lang.String r1 = "issue"
            java.lang.String r0 = "code"
            java.lang.String[] r11 = new java.lang.String[]{r1, r0}
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0266
        L_0x0185:
            r13.<init>()
            java.lang.String r0 = "messages"
            java.lang.String[] r1 = X.AnonymousClass6C9.A1b(r14, r0)
            java.lang.Class<X.4uY> r0 = X.C95804uY.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r14, r0, r1)
            r13.A00 = r0
            java.lang.String r0 = "message"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            r0 = 308(0x134, float:4.32E-43)
            X.92a r7 = X.C1896292a.A00(r0)
            r9 = 0
            r11 = 5000(0x1388, double:2.4703E-320)
        L_0x01a6:
            java.util.List r0 = X.C626836d.A0B(r6, r7, r8, r9, r11)
            goto L_0x0034
        L_0x01ac:
            r13.<init>()
            java.lang.String r0 = "notification"
            java.lang.String[] r11 = X.AnonymousClass36K.A0Z(r14, r0)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r12 = 0
            java.lang.String r10 = "newsletter"
            java.lang.Long r8 = X.AnonymousClass0x2.A0R()
            java.lang.Long r9 = X.AnonymousClass0x2.A0S()
            X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "from"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<X.4uY> r7 = X.C95804uY.class
            r10 = 0
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r0
            r0 = 286(0x11e, float:4.01E-43)
            java.lang.Object r0 = X.C1896292a.A0L(r14, r0, r12)
            goto L_0x0034
        L_0x01dc:
            r13.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            X.AnonymousClass36K.A0N(r14, r0)
            r0 = 238(0xee, float:3.34E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r3 = 0
            java.lang.Object r0 = X.C626836d.A02(r14, r0, r3)
            r13.A01 = r0
            r0 = 4
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 239(0xef, float:3.35E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 240(0xf0, float:3.36E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 241(0xf1, float:3.38E-43)
            X.C1896292a.A0Q(r1, r0)
            r0 = 242(0xf2, float:3.39E-43)
            java.util.ArrayList r2 = X.C1896292a.A0M(r1, r0)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "SubGroupSuggestionNotFound|SubGroupSuggestionConflict|SubGroupResourceConstraint|SubGroupCreationInternalServerError"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)     // Catch:{ 24Y -> 0x0265 }
            goto L_0x0266
        L_0x0212:
            r13.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "creator"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r1 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r14, r0, r2)
            r13.A00 = r0
            r0 = 236(0xec, float:3.31E-43)
            java.lang.Object r0 = X.C1896292a.A0L(r14, r0, r1)
            goto L_0x0034
        L_0x0231:
            r13.<init>()
            java.lang.String r0 = "linked_groups"
            X.AnonymousClass36K.A0N(r14, r0)
            r0 = 205(0xcd, float:2.87E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r3 = 0
            java.lang.Object r0 = X.C626836d.A02(r14, r0, r3)
            r13.A01 = r0
            r0 = 3
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 206(0xce, float:2.89E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 207(0xcf, float:2.9E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 208(0xd0, float:2.91E-43)
            X.C1896292a.A0Q(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "LeaveLinkedGroupsBadRequest|LeaveLinkedGroupsNotAllowed|LeaveLinkedGroupsServerError"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)     // Catch:{ 24Y -> 0x0265 }
            goto L_0x0266
        L_0x0265:
            r0 = 0
        L_0x0266:
            r13.A00 = r0
            goto L_0x0036
        L_0x026a:
            r13.<init>()
            java.lang.String r0 = "group"
            X.AnonymousClass36K.A0N(r14, r0)
            java.lang.String r0 = "id"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            r3 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r14, r0, r1)
            r13.A00 = r0
            r0 = 2
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 203(0xcb, float:2.84E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 204(0xcc, float:2.86E-43)
            X.C1896292a.A0P(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "LeaveGroupNotAllowed|LeaveGroupServerError"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)     // Catch:{ 24Y -> 0x036f }
            goto L_0x0034
        L_0x029c:
            r13.<init>()
            java.lang.String r0 = "participant"
            X.AnonymousClass36K.A0N(r14, r0)
            r0 = 184(0xb8, float:2.58E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r14, r0, r2)
            r13.A00 = r0
            r0 = 185(0xb9, float:2.59E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r14, r1, r0)     // Catch:{ 24Y -> 0x036f }
            goto L_0x0034
        L_0x02bf:
            r13.<init>()
            java.lang.String r0 = "reporter"
            java.lang.String[] r11 = X.AnonymousClass6C9.A1b(r14, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            r12 = 0
            r10 = 0
            java.lang.Long r8 = X.AnonymousClass0x2.A0R()
            java.lang.Long r9 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r0
            java.lang.String r0 = "timestamp"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            java.lang.Long r8 = X.AnonymousClass0x2.A0T()
            java.lang.Object r0 = X.C626836d.A06(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0034
        L_0x02ec:
            r13.<init>()
            java.lang.String r0 = "picture"
            X.AnonymousClass36K.A0N(r14, r0)
            r5 = 2
            X.4B7[] r1 = new X.AnonymousClass4B7[r5]
            r0 = 121(0x79, float:1.7E-43)
            boolean r4 = X.C1896292a.A0V(r1, r0)
            r0 = 122(0x7a, float:1.71E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r3 = 1
            r1[r3] = r0
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = "ParentGroup|SubGroup"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)
            r13.A00 = r0
            X.4B7[] r1 = new X.AnonymousClass4B7[r5]
            r0 = 123(0x7b, float:1.72E-43)
            X.C1896292a.A0U(r1, r0, r4)
            r0 = 124(0x7c, float:1.74E-43)
            X.C1896292a.A0U(r1, r0, r3)
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = "SuccessProfilePictureResponse|PartialProfilePictureResponse"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)
            goto L_0x0034
        L_0x032e:
            r13.<init>()
            java.lang.String r0 = "group"
            java.lang.String[] r1 = X.AnonymousClass6C9.A1b(r14, r0)
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            r3 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r14, r0, r1)
            r13.A00 = r0
            r0 = 6
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 107(0x6b, float:1.5E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 108(0x6c, float:1.51E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 109(0x6d, float:1.53E-43)
            X.C1896292a.A0Q(r1, r0)
            r0 = 110(0x6e, float:1.54E-43)
            X.C1896292a.A0R(r1, r0)
            r0 = 111(0x6f, float:1.56E-43)
            X.C1896292a.A0S(r1, r0)
            r0 = 112(0x70, float:1.57E-43)
            X.C1896292a.A0T(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass0x2.A0i(r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "SubGroupNotAuthorized|SubGroupNotExist|SubGroupConflict|SubGroupResourceLimit|SubGroupBadRequest|SubGroupServerError"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)     // Catch:{ 24Y -> 0x036f }
            goto L_0x0034
        L_0x036f:
            r0 = 0
            goto L_0x0034
        L_0x0372:
            r13.<init>()
            java.lang.String r0 = "group"
            X.AnonymousClass36K.A0N(r14, r0)
            r0 = 101(0x65, float:1.42E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object r0 = X.C626836d.A04(r14, r1, r0)     // Catch:{ 24Y -> 0x0388 }
            goto L_0x0389
        L_0x0388:
            r0 = 0
        L_0x0389:
            r13.A00 = r0
            r0 = 4
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 102(0x66, float:1.43E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 103(0x67, float:1.44E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 104(0x68, float:1.46E-43)
            X.C1896292a.A0Q(r1, r0)
            r0 = 105(0x69, float:1.47E-43)
            java.util.ArrayList r2 = X.C1896292a.A0M(r1, r0)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "GroupInfo|TruncatedGroupInfo|GroupForbidden|GroupNotExist"
            java.lang.Object r0 = X.C626836d.A07(r14, r0, r2, r1)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138956rH.<init>(X.36K, int):void");
    }
}
