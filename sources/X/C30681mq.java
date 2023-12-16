package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mq  reason: invalid class name and case insensitive filesystem */
public class C30681mq extends C54192oK {
    public int A00;

    public C30681mq(C55682qk r2) {
        super(r2, (C624134x) null);
    }

    public static Jid A00(C55682qk r3, Jid jid, Class cls, String str) {
        if (jid == null || cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "web-query/failed to cast ", jid);
        A0o.append(" to ");
        C18310x6.A1O(A0o, cls.getName());
        A0o.append(jid);
        String A0V = AnonymousClass000.A0V(")@", str, A0o);
        Log.e(A0V);
        r3.A0A(AnonymousClass000.A0V("web-query/downcast-failure/", str, AnonymousClass001.A0o()), false, A0V);
        return null;
    }

    public static UserJid A02(C55682qk r2, C54192oK r3, String str) {
        return (UserJid) A00(r2, r3.A06, UserJid.class, str);
    }

    public static void A03(C28011fL r0, UserJid userJid, AnonymousClass1A1 r2, AnonymousClass1A3 r3) {
        if (r0 != null) {
            r2.A0C(r0.getRawString());
        } else {
            r2.A09();
        }
        AnonymousClass1A3.A00(userJid, r3);
    }

    public static void A05(AnonymousClass1A1 r1, C54192oK r2) {
        C95814uZ r0 = r2.A05;
        C626936e.A06(r0);
        r1.A0C(r0.getRawString());
    }

    public static void A08(C54192oK r1, C31891p1 r2) {
        r1.A0C = C627336j.A0A(r2.A01);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: X.1yd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: X.1yj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: X.1yd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: X.1yd} */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0582, code lost:
        if (r7 != false) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05c5, code lost:
        if (r7 != false) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0600, code lost:
        if (r7 != false) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x063e, code lost:
        if (r7 != false) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0850, code lost:
        if (r1.length() != 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08ea, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0ac0, code lost:
        if (r7 != null) goto L_0x0822;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0f39, code lost:
        if (r0 != null) goto L_0x12ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x1212, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x1239, code lost:
        r5.A0C(r0);
        r0 = r1.A0n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:0x127a, code lost:
        r1 = "off";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x12cc, code lost:
        if (r0 != null) goto L_0x12ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x12ce, code lost:
        r1 = r0.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1377, code lost:
        if ((r2 instanceof X.AnonymousClass1Nz) != false) goto L_0x1379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0289, code lost:
        if (r1 != null) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x0ec6  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0ee0  */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x1384  */
    /* JADX WARNING: Removed duplicated region for block: B:833:0x1399  */
    /* JADX WARNING: Removed duplicated region for block: B:835:0x139f  */
    /* JADX WARNING: Removed duplicated region for block: B:844:0x13c6  */
    /* JADX WARNING: Removed duplicated region for block: B:863:0x141c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1A3 A0D() {
        /*
            r13 = this;
            X.1ES r0 = X.AnonymousClass1ES.DEFAULT_INSTANCE
            X.6c9 r5 = r0.A0G()
            X.1A3 r5 = (X.AnonymousClass1A3) r5
            X.1A1 r4 = X.C18320x8.A0Q()
            java.lang.String r0 = r13.A09
            r4.A0A(r0)
            boolean r0 = r13.A0E
            r4.A0D(r0)
            long r0 = r13.A04
            long r0 = X.C18290x4.A0B(r0)
            r5.A0A(r0)
            r2 = r13
            boolean r0 = r13 instanceof X.C36271yy
            if (r0 == 0) goto L_0x0053
            X.1yy r2 = (X.C36271yy) r2
            X.C18260x0.A0O(r5, r4)
            X.1ns r3 = r2.A00
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x1461
            X.23Q r0 = X.AnonymousClass23Q.CHANGE_USERNAME
            r5.A0C(r0)
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x145c
            java.lang.String r0 = r0.getRawString()
            r4.A0C(r0)
            java.lang.String r0 = r3.A01
            r5.A0D(r0)
            java.lang.String r1 = r3.A00
        L_0x0046:
            r5.A0D(r1)
        L_0x0049:
            X.6cX r0 = r4.A06()
            X.1ET r0 = (X.AnonymousClass1ET) r0
            r5.A0B(r0)
            return r5
        L_0x0053:
            boolean r0 = r13 instanceof X.C36491zK
            if (r0 == 0) goto L_0x0082
            X.1zK r2 = (X.C36491zK) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r1 = r2.A00
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "attempt to create builder without message"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            goto L_0x0049
        L_0x0067:
            X.23Q r0 = X.C36491zK.A01
            r5.A0C(r0)
            A05(r4, r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.4uZ r3 = r1.A0n()
            java.lang.String r1 = "SUPPORT_AI_EDUCATION"
            X.2qk r0 = r2.A0I
            com.whatsapp.jid.Jid r0 = A00(r0, r3, r6, r1)
            X.4uZ r0 = (X.C95814uZ) r0
            r2.A06 = r0
            goto L_0x0049
        L_0x0082:
            boolean r0 = r13 instanceof X.C36261yx
            if (r0 == 0) goto L_0x00c1
            X.1yx r2 = (X.C36261yx) r2
            X.1o5 r6 = r2.A00
            X.C626936e.A06(r6)
            X.C36541zP.A09(r6, r2)
            X.23Q r0 = X.AnonymousClass23Q.A2l
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "SCHEDULED_CALL_START_MESSAGE"
            X.1fL r1 = A01(r3, r1, r7, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            long r0 = r6.A01
            java.lang.String r0 = java.lang.Long.toString(r0)
            r5.A0D(r0)
            long r0 = r6.A00
            java.lang.String r0 = java.lang.Long.toString(r0)
            r5.A0D(r0)
            java.lang.String r1 = r6.A02
        L_0x00bc:
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = ""
            goto L_0x0046
        L_0x00c1:
            boolean r0 = r13 instanceof X.C36451zG
            if (r0 == 0) goto L_0x0125
            X.1zG r2 = (X.C36451zG) r2
            X.1mS r3 = r2.A05
            X.C626936e.A06(r3)
            X.23Q r0 = r2.A04
            r5.A0C(r0)
            A05(r4, r2)
            java.lang.Class<X.4uZ> r7 = X.C95814uZ.class
            X.4uZ r6 = r2.A06
            java.lang.String r1 = r2.A07
            X.2qk r0 = r2.A0I
            com.whatsapp.jid.Jid r0 = A00(r0, r6, r7, r1)
            X.AnonymousClass1A3.A00(r0, r5)
            byte r1 = r3.A1I
            r0 = 64
            if (r1 != r0) goto L_0x011d
            r6 = r3
            X.1nV r6 = (X.C30961nV) r6
            java.lang.String r0 = r3.A01
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00f3
            r0 = r1
        L_0x00f3:
            r5.A0D(r0)
            com.whatsapp.jid.UserJid r0 = r6.A00
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = r0.getRawString()
        L_0x00fe:
            r5.A0D(r1)
        L_0x0101:
            long r0 = r3.A00
            long r6 = X.C18290x4.A0B(r0)
            X.1ES r1 = X.C18280x3.A0O(r5)
            int r0 = r1.bitField1_
            r0 = r0 | 32
            r1.bitField1_ = r0
            r1.revokeMessageTimestamp_ = r6
            X.3PL r0 = r2.A00
            r0.A00(r5, r3)
            X.AnonymousClass3PU.A00(r5, r3)
            goto L_0x0049
        L_0x011d:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0101
            r5.A0D(r0)
            goto L_0x0101
        L_0x0125:
            boolean r0 = r13 instanceof X.C36251yw
            if (r0 == 0) goto L_0x0187
            X.1yw r2 = (X.C36251yw) r2
            X.C18260x0.A0O(r5, r4)
            X.1nx r3 = r2.A00
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x146b
            X.23Q r0 = X.AnonymousClass23Q.REMINDER_SETUP_MESSAGE
            r5.A0C(r0)
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x1466
            java.lang.String r0 = r0.getRawString()
            r4.A0C(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r8 = com.whatsapp.jid.UserJid.class
            X.4uZ r0 = r3.A0n()
            X.2qk r7 = r2.A0I
            java.lang.String r6 = "REMINDER_SETUP"
            com.whatsapp.jid.Jid r0 = A00(r7, r0, r8, r6)
            X.4uZ r0 = (X.C95814uZ) r0
            r2.A06 = r0
            java.lang.Class<com.whatsapp.jid.GroupJid> r1 = com.whatsapp.jid.GroupJid.class
            X.4uZ r0 = r2.A05
            X.1fL r1 = A01(r7, r0, r1, r6)
            X.4uZ r0 = r2.A06
            com.whatsapp.jid.Jid r0 = A00(r7, r0, r8, r6)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            A03(r1, r0, r4, r5)
            long r0 = r3.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.A0D(r0)
            long r0 = r3.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.A0D(r0)
            java.lang.String r1 = r3.A02
            if (r1 != 0) goto L_0x0046
            java.lang.String r0 = "reminderContent"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0187:
            boolean r0 = r13 instanceof X.C36241yv
            if (r0 == 0) goto L_0x019c
            X.1yv r2 = (X.C36241yv) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r1 = r2.A00
            if (r1 != 0) goto L_0x12b2
            java.lang.String r1 = "PinnedMessageInChatWebQuery/Message is null"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            goto L_0x0049
        L_0x019c:
            boolean r0 = r13 instanceof X.C36391zA
            if (r0 == 0) goto L_0x01b6
            X.1zA r2 = (X.C36391zA) r2
            X.1mI r1 = r2.A01
            X.C626936e.A06(r1)
            A05(r4, r2)
            int r0 = r1.A00
            switch(r0) {
                case 37: goto L_0x1216;
                case 38: goto L_0x01af;
                case 39: goto L_0x121f;
                case 40: goto L_0x1231;
                case 41: goto L_0x1234;
                case 42: goto L_0x1237;
                case 43: goto L_0x01af;
                case 44: goto L_0x1228;
                default: goto L_0x01af;
            }
        L_0x01af:
            java.lang.String r0 = "PaymentWebQuery/onCreateWebInfoBuilder malformed sys message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0049
        L_0x01b6:
            boolean r0 = r13 instanceof X.C36231yu
            if (r0 == 0) goto L_0x01d0
            X.1yu r2 = (X.C36231yu) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            A05(r4, r2)
            int r0 = r3.A00
            switch(r0) {
                case 64: goto L_0x1248;
                case 65: goto L_0x1245;
                case 66: goto L_0x1242;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x01d0:
            boolean r0 = r13 instanceof X.C36221yt
            if (r0 == 0) goto L_0x01fb
            X.1yt r2 = (X.C36221yt) r2
            r3 = 0
            X.C18270x1.A14(r5, r4)
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2m
            r5.A0C(r0)
            if (r1 == 0) goto L_0x01ed
            java.lang.String r0 = r1.A0y
            if (r0 == 0) goto L_0x01ed
            r5.A0D(r0)
        L_0x01ed:
            r4.A0D(r3)
            X.4uZ r0 = r2.A05
            java.lang.String r0 = X.C18290x4.A0n(r0)
            r4.A0C(r0)
            goto L_0x0049
        L_0x01fb:
            boolean r0 = r13 instanceof X.C36211ys
            if (r0 == 0) goto L_0x021d
            X.1ys r2 = (X.C36211ys) r2
            r1 = 0
            X.C18270x1.A14(r5, r4)
            X.1mI r0 = r2.A00
            X.C626936e.A06(r0)
            X.23Q r0 = X.AnonymousClass23Q.A2g
            r5.A0C(r0)
            r4.A0D(r1)
            X.4uZ r0 = r2.A05
            java.lang.String r0 = X.C18290x4.A0n(r0)
            r4.A0C(r0)
            goto L_0x0049
        L_0x021d:
            boolean r0 = r13 instanceof X.C36201yr
            if (r0 == 0) goto L_0x025e
            X.1yr r2 = (X.C36201yr) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r0 = r2.A00
            X.C626936e.A06(r0)
            if (r0 == 0) goto L_0x0235
            X.1p1 r0 = (X.C31891p1) r0
            X.C36541zP.A09(r0, r2)
            A08(r2, r0)
        L_0x0235:
            X.23Q r0 = X.AnonymousClass23Q.A24
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "NON_ADMIN_ADD_GJR"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.util.List r1 = r2.A0C
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>"
            X.C162457s7.A0K(r1, r0)
            java.util.List r0 = X.AnonymousClass360.A01(r1)
            A07(r5, r0)
            goto L_0x0049
        L_0x025e:
            boolean r0 = r13 instanceof X.C36191yq
            if (r0 == 0) goto L_0x028d
            X.1yq r2 = (X.C36191yq) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            A05(r4, r2)
            int r1 = r3.A00
            r0 = 70
            if (r1 != r0) goto L_0x1470
            X.23Q r0 = X.AnonymousClass23Q.A2K
            r5.A0C(r0)
            X.1o6 r3 = (X.C31321o6) r3
            boolean r0 = r3.A02
            int r2 = r3.A00
            java.lang.String r1 = r3.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.A0D(r0)
            X.AnonymousClass1A3.A01(r5, r2)
        L_0x0289:
            if (r1 == 0) goto L_0x0049
            goto L_0x0046
        L_0x028d:
            boolean r0 = r13 instanceof X.C36411zC
            if (r0 == 0) goto L_0x02e2
            X.1zC r2 = (X.C36411zC) r2
            X.1p1 r6 = r2.A02
            X.C626936e.A06(r6)
            X.23Q r0 = X.AnonymousClass23Q.A2J
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r3 = r2.A05
            java.lang.String r1 = "INTEGRITY_UNLINKED_PARENT_GROUP_WEB_QUERY"
            X.2qk r0 = r2.A0I
            X.1fL r0 = A01(r0, r3, r7, r1)
            r3 = 0
            A03(r0, r3, r4, r5)
            boolean r0 = r6 instanceof X.C31791or
            if (r0 == 0) goto L_0x02d1
            X.1p0 r6 = (X.C31881p0) r6
            r0 = 1
            com.whatsapp.jid.GroupJid r3 = r6.A1x(r0)
            X.2ss r0 = r2.A00
            java.lang.String r1 = r0.A0D(r3)
            if (r1 != 0) goto L_0x02c5
            r0 = 1
            java.lang.String r1 = r6.A1y(r0)
        L_0x02c5:
            java.lang.String r0 = X.C627336j.A07(r3)
            if (r0 != 0) goto L_0x02cd
            java.lang.String r0 = ""
        L_0x02cd:
            r5.A0D(r0)
            goto L_0x0289
        L_0x02d1:
            boolean r0 = r6 instanceof X.C31571oV
            if (r0 == 0) goto L_0x02e0
            X.1oV r6 = (X.C31571oV) r6
            com.whatsapp.jid.GroupJid r3 = r6.A01
            X.2ss r0 = r2.A00
            java.lang.String r1 = r0.A0D(r3)
            goto L_0x02c5
        L_0x02e0:
            r1 = r3
            goto L_0x02c5
        L_0x02e2:
            boolean r0 = r13 instanceof X.C36381z9
            if (r0 == 0) goto L_0x0315
            X.1z9 r2 = (X.C36381z9) r2
            X.1nv r3 = r2.A01
            X.C626936e.A06(r3)
            X.3LP r1 = r2.A00
            X.C626936e.A06(r1)
            X.4uZ r0 = r2.A05
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 == 0) goto L_0x0304
            X.23Q r0 = X.AnonymousClass23Q.A1E
        L_0x02fc:
            r5.A0C(r0)
            A05(r4, r2)
            goto L_0x0049
        L_0x0304:
            int r0 = r3.A00
            switch(r0) {
                case 5: goto L_0x030c;
                case 6: goto L_0x030c;
                case 7: goto L_0x030f;
                case 8: goto L_0x030f;
                case 9: goto L_0x030c;
                case 10: goto L_0x030c;
                case 11: goto L_0x0309;
                case 12: goto L_0x0309;
                case 13: goto L_0x0309;
                case 14: goto L_0x0309;
                case 15: goto L_0x030c;
                case 16: goto L_0x030c;
                case 17: goto L_0x0312;
                default: goto L_0x0309;
            }
        L_0x0309:
            X.23Q r0 = X.AnonymousClass23Q.A1b
            goto L_0x02fc
        L_0x030c:
            X.23Q r0 = X.AnonymousClass23Q.A0D
            goto L_0x02fc
        L_0x030f:
            X.23Q r0 = X.AnonymousClass23Q.A0C
            goto L_0x02fc
        L_0x0312:
            X.23Q r0 = X.AnonymousClass23Q.BIZ_COEX_PRIVACY_INIT_SELF
            goto L_0x02fc
        L_0x0315:
            boolean r0 = r13 instanceof X.C35851yI
            if (r0 == 0) goto L_0x0330
            X.23Q r0 = X.AnonymousClass23Q.A16
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.4uZ r2 = r13.A05
            java.lang.String r1 = "ACTION_INITIAL_PN_NOT_SHARED_IN_CAG"
            X.2qk r0 = r13.A0I
            X.1fL r1 = A01(r0, r2, r3, r1)
            r0 = 0
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0330:
            boolean r0 = r13 instanceof X.C35841yH
            if (r0 == 0) goto L_0x033e
            X.23Q r0 = X.AnonymousClass23Q.A2L
            r5.A0C(r0)
            A05(r4, r13)
            goto L_0x0049
        L_0x033e:
            boolean r0 = r13 instanceof X.C36181yp
            if (r0 == 0) goto L_0x0372
            X.1yp r2 = (X.C36181yp) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            r1 = r3
            X.1oY r1 = (X.C31601oY) r1
            X.23Q r0 = X.AnonymousClass23Q.A23
            r5.A0C(r0)
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0357
            java.lang.String r0 = ""
        L_0x0357:
            r5.A0D(r0)
            X.C36541zP.A09(r3, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_MEMBERSHIP_JOIN_APPROVAL_REQUEST_WEB_QUERY"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0372:
            boolean r0 = r13 instanceof X.C36171yo
            if (r0 == 0) goto L_0x03d1
            X.1yo r2 = (X.C36171yo) r2
            X.1mI r6 = r2.A00
            X.C626936e.A06(r6)
            r1 = r6
            X.1oT r1 = (X.C31551oT) r1
            X.23Q r0 = X.AnonymousClass23Q.A22
            r5.A0C(r0)
            int r3 = r1.A00
            r0 = 84
            if (r3 != r0) goto L_0x03c9
            java.lang.String r0 = "on"
        L_0x038e:
            r5.A0D(r0)
            java.lang.String r3 = r1.A00
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x03c5
            java.lang.String r0 = "regular"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x03c5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupMembershipJoinApprovalModeWebQuery/onCreateWebInfoBuilder Cannot parse msg past group role "
            X.C18260x0.A0r(r0, r3, r1)
        L_0x03ad:
            X.C36541zP.A09(r6, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_MEMBERSHIP_JOIN_APPROVAL_MODE_WEB_QUERY"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x03c5:
            r5.A0D(r3)
            goto L_0x03ad
        L_0x03c9:
            r0 = 85
            if (r3 != r0) goto L_0x1477
            java.lang.String r0 = "off"
            goto L_0x038e
        L_0x03d1:
            boolean r0 = r13 instanceof X.C36161yn
            if (r0 == 0) goto L_0x0412
            X.1yn r2 = (X.C36161yn) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r0 = r2.A00
            X.C626936e.A06(r0)
            if (r0 == 0) goto L_0x03f4
            X.C36541zP.A09(r0, r2)
            int r3 = r0.A00
            r0 = 91
            if (r3 == r0) goto L_0x040e
            r0 = 92
            if (r3 != r0) goto L_0x1482
            java.lang.String r0 = "off"
        L_0x03f1:
            r5.A0D(r0)
        L_0x03f4:
            X.23Q r0 = X.AnonymousClass23Q.A25
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_MEMBER_ADD_MODE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x040e:
            java.lang.String r0 = "on"
            goto L_0x03f1
        L_0x0412:
            boolean r0 = r13 instanceof X.C36371z8
            if (r0 == 0) goto L_0x0478
            X.1z8 r2 = (X.C36371z8) r2
            boolean r1 = X.C18270x1.A1U(r5, r4)
            X.1ot r0 = r2.A01
            if (r0 != 0) goto L_0x0428
            java.lang.String r1 = "GroupLinkedWithJoinApprovalModeWebQuery/onCreateWebInfoBuilder msg is null"
        L_0x0422:
            r0 = 0
            X.C626936e.A0D(r0, r1)
            goto L_0x0049
        L_0x0428:
            X.C36541zP.A09(r0, r2)
            int r6 = r0.A00
            com.whatsapp.jid.GroupJid r9 = r0.A1x(r1)
            X.C162457s7.A0D(r9)
            java.lang.String r8 = r0.A1y(r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A00
            java.lang.String r0 = "ACTION_SYSTEM_SUBGROUP_LINKED_WITH_JOIN_APPROVAL_MODE"
            X.1fL r1 = A01(r3, r1, r7, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            X.23Q r0 = X.AnonymousClass23Q.A1M
            r5.A0C(r0)
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0459
            r1 = r0
        L_0x0459:
            r5.A0D(r1)
            if (r8 != 0) goto L_0x045f
            r8 = r0
        L_0x045f:
            r5.A0D(r8)
            r5.A0D(r0)
            java.lang.String r0 = "true"
            java.lang.String r1 = "false"
            switch(r6) {
                case 102: goto L_0x1263;
                case 103: goto L_0x1268;
                case 104: goto L_0x1270;
                default: goto L_0x046d;
            }
        L_0x046d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupLinkedWithJoinApprovalModeWebQuery/onCreateWebInfoBuilder Unrecognized action "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r6)
            goto L_0x0422
        L_0x0478:
            boolean r0 = r13 instanceof X.C36441zF
            if (r0 == 0) goto L_0x04b6
            X.1zF r2 = (X.C36441zF) r2
            X.1oV r7 = r2.A02
            X.C626936e.A06(r7)
            X.23Q r0 = X.AnonymousClass23Q.A1M
            A06(r5, r0, r7, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_GROUP_MEMBERSHIP_APPROVAL_MODE_DISABLED_ON_SUBGROUP_LINK"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            com.whatsapp.jid.GroupJid r1 = r7.A01
            if (r1 == 0) goto L_0x04a6
            java.lang.String r0 = r1.getRawString()
            r5.A0D(r0)
        L_0x04a6:
            X.3Ex r0 = r2.A00
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0049
            X.5ZU r0 = r2.A01
            java.lang.String r1 = r0.A0H(r1)
            goto L_0x0289
        L_0x04b6:
            boolean r0 = r13 instanceof X.C36151ym
            if (r0 == 0) goto L_0x0506
            X.1ym r2 = (X.C36151ym) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            X.23Q r0 = X.AnonymousClass23Q.A1v
            A06(r5, r0, r3, r2)
            int r1 = r3.A00
            r0 = 30
            r8 = 0
            if (r1 != r0) goto L_0x04f3
            r7 = 0
        L_0x04ce:
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_RESTRICT"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            if (r8 == 0) goto L_0x04ef
            java.lang.String r0 = "on"
        L_0x04e6:
            r5.A0D(r0)
            java.lang.String r1 = java.lang.Integer.toString(r7)
            goto L_0x0046
        L_0x04ef:
            java.lang.String r0 = "off"
            goto L_0x04e6
        L_0x04f3:
            r0 = 29
            if (r1 != r0) goto L_0x04fa
            r7 = 0
        L_0x04f8:
            r8 = 1
            goto L_0x04ce
        L_0x04fa:
            r0 = 142(0x8e, float:1.99E-43)
            if (r1 != r0) goto L_0x148d
            X.1oS r3 = (X.C31541oS) r3
            if (r3 == 0) goto L_0x0504
            int r8 = r3.A00
        L_0x0504:
            r7 = r8
            goto L_0x04f8
        L_0x0506:
            boolean r0 = r13 instanceof X.C36501zL
            if (r0 == 0) goto L_0x0558
            X.1zL r2 = (X.C36501zL) r2
            X.C18260x0.A0O(r5, r4)
            X.23Q r0 = X.C36501zL.A02
            r5.A0C(r0)
            X.1mI r3 = r2.A01
            if (r3 == 0) goto L_0x1494
            int r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x1494
            r0 = 140(0x8c, float:1.96E-43)
            if (r1 != r0) goto L_0x0550
            java.lang.String r7 = "on"
        L_0x0527:
            X.C36541zP.A09(r3, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "REPORT_TO_ADMIN_ENABLED_STATUS"
            com.whatsapp.jid.Jid r1 = A00(r3, r1, r6, r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            r5.A0D(r7)
            if (r1 == 0) goto L_0x1275
            X.2sj r0 = r2.A00
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x1275
            java.lang.String r1 = "admin"
            goto L_0x0046
        L_0x0550:
            r0 = 141(0x8d, float:1.98E-43)
            if (r1 != r0) goto L_0x1494
            java.lang.String r7 = "off"
            goto L_0x0527
        L_0x0558:
            boolean r0 = r13 instanceof X.C36141yl
            if (r0 == 0) goto L_0x058f
            X.1yl r2 = (X.C36141yl) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1t
            A06(r5, r0, r1, r2)
            int r1 = r1.A00
            r0 = 54
            if (r1 != r0) goto L_0x0589
            r7 = 0
        L_0x056f:
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_NO_FREQUENTLY_FORWARDED"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            if (r7 == 0) goto L_0x127a
        L_0x0584:
            java.lang.String r1 = "on"
            goto L_0x0046
        L_0x0589:
            r0 = 53
            if (r1 != r0) goto L_0x149b
            r7 = 1
            goto L_0x056f
        L_0x058f:
            boolean r0 = r13 instanceof X.C36591zU
            if (r0 == 0) goto L_0x05ce
            X.1zV r2 = (X.C36601zV) r2
            X.C18260x0.A0O(r5, r4)
            X.23Q r0 = X.C36591zU.A00
            r5.A0C(r0)
            X.1mI r6 = r2.A00
            r3 = 0
            if (r6 == 0) goto L_0x14a2
            int r1 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x14a2
            r0 = 150(0x96, float:2.1E-43)
            if (r1 != r0) goto L_0x05c8
            r7 = 1
        L_0x05af:
            X.C36541zP.A09(r6, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_RECENT_HISTORY_SHARING"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            if (r7 == 0) goto L_0x127a
            goto L_0x0584
        L_0x05c8:
            r0 = 151(0x97, float:2.12E-43)
            if (r1 != r0) goto L_0x14a2
            r7 = 0
            goto L_0x05af
        L_0x05ce:
            boolean r0 = r13 instanceof X.C36571zS
            if (r0 == 0) goto L_0x0609
            X.1zS r2 = (X.C36571zS) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1p
            r5.A0C(r0)
            X.4uZ r3 = r1.A0n()
            r2.A06 = r3
            int r1 = r1.A00
            r0 = 32
            if (r1 != r0) goto L_0x0603
            r7 = 0
        L_0x05eb:
            r2.A06 = r3
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_ANNOUNCE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            if (r7 == 0) goto L_0x127a
            goto L_0x0584
        L_0x0603:
            r0 = 31
            if (r1 != r0) goto L_0x14bc
            r7 = 1
            goto L_0x05eb
        L_0x0609:
            boolean r0 = r13 instanceof X.C36581zT
            if (r0 == 0) goto L_0x0648
            X.1zV r2 = (X.C36601zV) r2
            X.C18260x0.A0O(r5, r4)
            X.23Q r0 = X.C36581zT.A00
            r5.A0C(r0)
            X.1mI r3 = r2.A00
            if (r3 == 0) goto L_0x14c3
            int r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x14c3
            r0 = 137(0x89, float:1.92E-43)
            if (r1 != r0) goto L_0x0642
            r7 = 1
        L_0x0628:
            X.C36541zP.A09(r3, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "COMMUNITY_ALLOW_MEMBER_ADDED_GROUPS"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            if (r7 == 0) goto L_0x127a
            goto L_0x0584
        L_0x0642:
            r0 = 138(0x8a, float:1.93E-43)
            if (r1 != r0) goto L_0x14c3
            r7 = 0
            goto L_0x0628
        L_0x0648:
            boolean r0 = r13 instanceof X.C35831yG
            if (r0 == 0) goto L_0x0666
            X.23Q r0 = X.AnonymousClass23Q.A1n
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r13.A05
            X.2qk r2 = r13.A0I
            java.lang.String r0 = "GROUP_CHANGE_ANNOUNCE"
            X.1fL r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r13, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0666:
            boolean r0 = r13 instanceof X.C36461zH
            if (r0 == 0) goto L_0x06a6
            X.1zH r2 = (X.C36461zH) r2
            X.1mJ r7 = r2.A00
            X.C626936e.A06(r7)
            X.23Q r0 = X.AnonymousClass23Q.A1i
            r5.A0C(r0)
            A05(r4, r2)
            java.lang.Class<X.4uZ> r6 = X.C95814uZ.class
            X.4uZ r3 = r2.A06
            java.lang.String r1 = "FUTURE_WEB_QUERY"
            X.2qk r0 = r2.A0I
            com.whatsapp.jid.Jid r0 = A00(r0, r3, r6, r1)
            X.AnonymousClass1A3.A00(r0, r5)
            byte[] r0 = r7.A1u()
            if (r0 == 0) goto L_0x069f
            X.8Lq r3 = X.C18270x1.A09(r5, r0)
            X.6cX r2 = r5.A00
            X.1ES r2 = (X.AnonymousClass1ES) r2
            int r1 = r2.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.futureproofData_ = r3
        L_0x069f:
            int r0 = r7.A01
            X.AnonymousClass1A3.A01(r5, r0)
            goto L_0x0049
        L_0x06a6:
            boolean r0 = r13 instanceof X.C36131yk
            if (r0 == 0) goto L_0x06c8
            X.1yk r2 = (X.C36131yk) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            X.23Q r0 = X.AnonymousClass23Q.A1h
            r5.A0C(r0)
            A05(r4, r2)
            int r1 = r3.A00
            r0 = 60
            if (r1 != r0) goto L_0x14ca
            X.1nz r3 = (X.C31251nz) r3
            int r0 = r3.A00
            X.AnonymousClass1A3.A01(r5, r0)
            goto L_0x0049
        L_0x06c8:
            boolean r0 = r13 instanceof X.C36121yj
            if (r0 == 0) goto L_0x06e9
            X.1yj r2 = (X.C36121yj) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1g
            r5.A0C(r0)
            A05(r4, r2)
            X.4uZ r0 = r1.A0n()
        L_0x06df:
            r2.A06 = r0
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r0.getRawString()
            goto L_0x0289
        L_0x06e9:
            boolean r0 = r13 instanceof X.C36111yi
            if (r0 == 0) goto L_0x0710
            X.1yi r2 = (X.C36111yi) r2
            X.1ng r1 = r2.A00
            X.C626936e.A06(r1)
            X.4uZ r0 = r1.A0n()
            if (r0 != 0) goto L_0x06fe
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
        L_0x06fe:
            r2.A06 = r0
            A05(r4, r2)
            X.23Q r0 = X.AnonymousClass23Q.A1a
            r5.A0C(r0)
            X.4uZ r0 = r2.A06
            java.lang.String r1 = X.C18300x5.A0i(r0)
            goto L_0x0046
        L_0x0710:
            boolean r0 = r13 instanceof X.C36101yh
            if (r0 == 0) goto L_0x0744
            X.1yh r2 = (X.C36101yh) r2
            X.1o3 r1 = r2.A00
            X.C626936e.A06(r1)
            X.4uZ r0 = r1.A0n()
            if (r0 != 0) goto L_0x0725
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
        L_0x0725:
            r2.A06 = r0
            int r3 = r1.A00
            int r1 = r1.A01
            A05(r4, r2)
            X.23Q r0 = X.AnonymousClass23Q.A1Z
            r5.A0C(r0)
            X.4uZ r0 = r2.A06
            java.lang.String r0 = X.C18300x5.A0i(r0)
            r5.A0D(r0)
            X.AnonymousClass1A3.A01(r5, r3)
            X.AnonymousClass1A3.A01(r5, r1)
            goto L_0x0049
        L_0x0744:
            boolean r0 = r13 instanceof X.C36091yg
            if (r0 == 0) goto L_0x076c
            X.1yg r2 = (X.C36091yg) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1U
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "COMMUNITY_PARTICIPANT_PROMOTE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x076c:
            boolean r0 = r13 instanceof X.C36081yf
            if (r0 == 0) goto L_0x0794
            X.1yf r2 = (X.C36081yf) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1T
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "COMMUNITY_PARTICIPANT_DEMOTE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0794:
            boolean r0 = r13 instanceof X.C36071ye
            if (r0 == 0) goto L_0x07af
            X.1ye r2 = (X.C36071ye) r2
            X.1o2 r0 = r2.A00
            X.C626936e.A06(r0)
            A05(r4, r2)
            java.lang.String r1 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1209
            X.23Q r0 = X.AnonymousClass23Q.A05
            r5.A0C(r0)
            goto L_0x0049
        L_0x07af:
            boolean r0 = r13 instanceof X.C36061yd
            if (r0 == 0) goto L_0x07ec
            X.1yd r2 = (X.C36061yd) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            X.23Q r0 = X.AnonymousClass23Q.A1B
            r5.A0C(r0)
            A05(r4, r2)
            int r1 = r3.A00
            r0 = 59
            if (r1 != r0) goto L_0x07e2
            r0 = r3
            X.1nr r0 = (X.C31171nr) r0
            int r0 = r0.A00
        L_0x07cd:
            X.AnonymousClass1A3.A01(r5, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.4uZ r3 = r3.A0n()
            java.lang.String r1 = "CHANGE_EPHEMERAL"
            X.2qk r0 = r2.A0I
            com.whatsapp.jid.Jid r0 = A00(r0, r3, r6, r1)
            X.4uZ r0 = (X.C95814uZ) r0
            goto L_0x06df
        L_0x07e2:
            r0 = 56
            if (r1 != r0) goto L_0x14d1
            r0 = r3
            X.1oX r0 = (X.C31591oX) r0
            int r0 = r0.A00
            goto L_0x07cd
        L_0x07ec:
            boolean r0 = r13 instanceof X.C36361z7
            if (r0 == 0) goto L_0x0827
            X.1z7 r2 = (X.C36361z7) r2
            X.1mI r1 = r2.A01
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1Y
            r5.A0C(r0)
            X.4uZ r0 = r2.A05
            java.lang.String r7 = X.C18300x5.A0i(r0)
            r4.A0C(r7)
            int r6 = r1.A00
            r3 = 68
            if (r6 != r3) goto L_0x14d8
            r0 = r1
            X.1nq r0 = (X.C31161nq) r0
            int r0 = r0.A00
            X.AnonymousClass1A3.A01(r5, r0)
            int r1 = r1.A00
            r0 = 1
            if (r1 != r0) goto L_0x081e
            X.2sr r0 = r2.A00
            java.lang.String r7 = X.C56972sr.A06(r0)
        L_0x081e:
            if (r7 != 0) goto L_0x0822
            java.lang.String r7 = ""
        L_0x0822:
            r5.A0D(r7)
            goto L_0x0049
        L_0x0827:
            boolean r0 = r13 instanceof X.C36541zP
            if (r0 == 0) goto L_0x0854
            X.1zP r2 = (X.C36541zP) r2
            X.C18260x0.A0O(r5, r4)
            X.23Q r0 = r2.A01
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            java.lang.String r3 = r2.A02
            X.2qk r0 = r2.A0I
            X.1fL r1 = A01(r0, r1, r6, r3)
            com.whatsapp.jid.UserJid r0 = A02(r0, r2, r3)
            A03(r1, r0, r4, r5)
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0049
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0854:
            boolean r0 = r13 instanceof X.C36051yc
            if (r0 == 0) goto L_0x08c6
            X.1yc r2 = (X.C36051yc) r2
            X.1mr r7 = r2.A00
            X.C626936e.A06(r7)
            X.2z0 r6 = r7.A1J
            java.lang.String r0 = r6.A01
            r2.A09 = r0
            X.4uZ r3 = r6.A00
            r2.A06 = r3
            long r0 = r7.A0K
            long r0 = X.C18290x4.A0B(r0)
            r2.A04 = r0
            boolean r0 = r6.A02
            r2.A0E = r0
            java.lang.String r0 = X.C18300x5.A0i(r3)
            r4.A0C(r0)
            boolean r6 = r7.A1z()
            r3 = 2
            r1 = 1
            int r0 = r7.A1y()
            if (r6 == 0) goto L_0x08b4
            if (r0 == 0) goto L_0x08b1
            if (r0 == r1) goto L_0x088e
            if (r0 == r3) goto L_0x08b1
        L_0x088e:
            X.23Q r0 = X.AnonymousClass23Q.A2o
        L_0x0890:
            r5.A0C(r0)
            long r0 = r2.A04
            r5.A0A(r0)
            X.4uZ r0 = r2.A05
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0049
            com.whatsapp.jid.UserJid r0 = r7.A0o()
            if (r0 == 0) goto L_0x0049
            com.whatsapp.jid.UserJid r0 = r7.A0o()
            java.lang.String r0 = r0.getRawString()
            r5.A0E(r0)
            goto L_0x0049
        L_0x08b1:
            X.23Q r0 = X.AnonymousClass23Q.A2n
            goto L_0x0890
        L_0x08b4:
            if (r0 == 0) goto L_0x08c3
            if (r0 == r1) goto L_0x08c0
            if (r0 == r3) goto L_0x08bd
            X.23Q r0 = X.AnonymousClass23Q.A17
            goto L_0x0890
        L_0x08bd:
            X.23Q r0 = X.AnonymousClass23Q.A18
            goto L_0x0890
        L_0x08c0:
            X.23Q r0 = X.AnonymousClass23Q.A19
            goto L_0x0890
        L_0x08c3:
            X.23Q r0 = X.AnonymousClass23Q.A1A
            goto L_0x0890
        L_0x08c6:
            boolean r0 = r13 instanceof X.C36041yb
            if (r0 == 0) goto L_0x08f7
            X.1yb r2 = (X.C36041yb) r2
            X.1o1 r0 = r2.A00
            X.C626936e.A06(r0)
            A05(r4, r2)
            int r2 = r0.A00
            java.lang.String r1 = r0.A01
            r0 = 2
            if (r2 == r0) goto L_0x08f4
            r0 = 3
            if (r2 == r0) goto L_0x08f1
            r0 = 4
            if (r2 == r0) goto L_0x08ee
            X.23Q r0 = X.AnonymousClass23Q.A1c
        L_0x08e3:
            r5.A0C(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0046
        L_0x08ee:
            X.23Q r0 = X.AnonymousClass23Q.BIZ_COEX_PRIVACY_TRANSITION_SELF
            goto L_0x08e3
        L_0x08f1:
            X.23Q r0 = X.AnonymousClass23Q.A0E
            goto L_0x08e3
        L_0x08f4:
            X.23Q r0 = X.AnonymousClass23Q.A0F
            goto L_0x08e3
        L_0x08f7:
            boolean r0 = r13 instanceof X.C36031ya
            if (r0 == 0) goto L_0x0977
            X.1ya r2 = (X.C36031ya) r2
            X.1o1 r1 = r2.A00
            X.C626936e.A06(r1)
            A05(r4, r2)
            int r0 = r1.A00
            java.lang.String r1 = r1.A01
            switch(r0) {
                case 1: goto L_0x0973;
                case 2: goto L_0x096f;
                case 3: goto L_0x096b;
                case 4: goto L_0x0967;
                case 5: goto L_0x0963;
                case 6: goto L_0x0960;
                case 7: goto L_0x095d;
                case 8: goto L_0x095a;
                case 9: goto L_0x0957;
                case 10: goto L_0x0954;
                case 11: goto L_0x0951;
                case 12: goto L_0x094e;
                case 13: goto L_0x094b;
                case 14: goto L_0x0948;
                case 15: goto L_0x0945;
                case 16: goto L_0x0942;
                case 17: goto L_0x093f;
                case 18: goto L_0x093c;
                case 19: goto L_0x0939;
                case 20: goto L_0x0936;
                case 21: goto L_0x0933;
                case 22: goto L_0x0930;
                case 23: goto L_0x092d;
                case 24: goto L_0x092a;
                case 25: goto L_0x0927;
                case 26: goto L_0x0924;
                case 27: goto L_0x0921;
                case 28: goto L_0x091e;
                case 29: goto L_0x091b;
                case 30: goto L_0x0918;
                case 31: goto L_0x0915;
                case 32: goto L_0x0912;
                case 33: goto L_0x090f;
                default: goto L_0x090c;
            }
        L_0x090c:
            X.23Q r0 = X.AnonymousClass23Q.A0r
            goto L_0x08e3
        L_0x090f:
            X.23Q r0 = X.AnonymousClass23Q.A0b
            goto L_0x08e3
        L_0x0912:
            X.23Q r0 = X.AnonymousClass23Q.A0c
            goto L_0x08e3
        L_0x0915:
            X.23Q r0 = X.AnonymousClass23Q.A0d
            goto L_0x08e3
        L_0x0918:
            X.23Q r0 = X.AnonymousClass23Q.A0e
            goto L_0x08e3
        L_0x091b:
            X.23Q r0 = X.AnonymousClass23Q.A0s
            goto L_0x08e3
        L_0x091e:
            X.23Q r0 = X.AnonymousClass23Q.A0q
            goto L_0x08e3
        L_0x0921:
            X.23Q r0 = X.AnonymousClass23Q.A0W
            goto L_0x08e3
        L_0x0924:
            X.23Q r0 = X.AnonymousClass23Q.A0n
            goto L_0x08e3
        L_0x0927:
            X.23Q r0 = X.AnonymousClass23Q.A0f
            goto L_0x08e3
        L_0x092a:
            X.23Q r0 = X.AnonymousClass23Q.A0g
            goto L_0x08e3
        L_0x092d:
            X.23Q r0 = X.AnonymousClass23Q.A0M
            goto L_0x08e3
        L_0x0930:
            X.23Q r0 = X.AnonymousClass23Q.A0L
            goto L_0x08e3
        L_0x0933:
            X.23Q r0 = X.AnonymousClass23Q.A0N
            goto L_0x08e3
        L_0x0936:
            X.23Q r0 = X.AnonymousClass23Q.A0P
            goto L_0x08e3
        L_0x0939:
            X.23Q r0 = X.AnonymousClass23Q.A0i
            goto L_0x08e3
        L_0x093c:
            X.23Q r0 = X.AnonymousClass23Q.A0u
            goto L_0x08e3
        L_0x093f:
            X.23Q r0 = X.AnonymousClass23Q.A0Q
            goto L_0x08e3
        L_0x0942:
            X.23Q r0 = X.AnonymousClass23Q.A0v
            goto L_0x08e3
        L_0x0945:
            X.23Q r0 = X.AnonymousClass23Q.A0w
            goto L_0x08e3
        L_0x0948:
            X.23Q r0 = X.AnonymousClass23Q.A0t
            goto L_0x08e3
        L_0x094b:
            X.23Q r0 = X.AnonymousClass23Q.A0x
            goto L_0x08e3
        L_0x094e:
            X.23Q r0 = X.AnonymousClass23Q.A0T
            goto L_0x08e3
        L_0x0951:
            X.23Q r0 = X.AnonymousClass23Q.A0l
            goto L_0x08e3
        L_0x0954:
            X.23Q r0 = X.AnonymousClass23Q.A0y
            goto L_0x08e3
        L_0x0957:
            X.23Q r0 = X.AnonymousClass23Q.A0U
            goto L_0x08e3
        L_0x095a:
            X.23Q r0 = X.AnonymousClass23Q.A0z
            goto L_0x08e3
        L_0x095d:
            X.23Q r0 = X.AnonymousClass23Q.A10
            goto L_0x08e3
        L_0x0960:
            X.23Q r0 = X.AnonymousClass23Q.A0m
            goto L_0x08e3
        L_0x0963:
            X.23Q r0 = X.AnonymousClass23Q.A0j
            goto L_0x08e3
        L_0x0967:
            X.23Q r0 = X.AnonymousClass23Q.A0a
            goto L_0x08e3
        L_0x096b:
            X.23Q r0 = X.AnonymousClass23Q.A0Y
            goto L_0x08e3
        L_0x096f:
            X.23Q r0 = X.AnonymousClass23Q.A0V
            goto L_0x08e3
        L_0x0973:
            X.23Q r0 = X.AnonymousClass23Q.A0R
            goto L_0x08e3
        L_0x0977:
            boolean r0 = r13 instanceof X.C36021yZ
            if (r0 == 0) goto L_0x09a5
            X.1yZ r2 = (X.C36021yZ) r2
            X.1nu r1 = r2.A00
            X.C626936e.A06(r1)
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x098d
            java.lang.String r0 = r0.getRawString()
            r4.A0C(r0)
        L_0x098d:
            java.lang.String r2 = r1.A00
            int r1 = r1.A00
            r0 = 55
            if (r1 == r0) goto L_0x12a3
            switch(r1) {
                case 22: goto L_0x12a0;
                case 23: goto L_0x129d;
                case 24: goto L_0x129a;
                case 25: goto L_0x1297;
                case 26: goto L_0x1294;
                default: goto L_0x0998;
            }
        L_0x0998:
            switch(r1) {
                case 34: goto L_0x1291;
                case 35: goto L_0x128e;
                case 36: goto L_0x128b;
                default: goto L_0x099b;
            }
        L_0x099b:
            switch(r1) {
                case 46: goto L_0x12a6;
                case 47: goto L_0x1288;
                case 48: goto L_0x1285;
                case 49: goto L_0x1282;
                case 50: goto L_0x127f;
                default: goto L_0x099e;
            }
        L_0x099e:
            java.lang.String r0 = "Invalid system action specified."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x09a5:
            boolean r0 = r13 instanceof X.C36011yY
            if (r0 == 0) goto L_0x09c7
            X.1yY r2 = (X.C36011yY) r2
            X.1mI r0 = r2.A00
            X.C626936e.A06(r0)
            A05(r4, r2)
            int r1 = r0.A00
            r0 = 62
            if (r1 != r0) goto L_0x09c0
            X.23Q r0 = X.AnonymousClass23Q.A1c
        L_0x09bb:
            r5.A0C(r0)
            goto L_0x0049
        L_0x09c0:
            r0 = 63
            if (r1 != r0) goto L_0x14eb
            X.23Q r0 = X.AnonymousClass23Q.A1e
            goto L_0x09bb
        L_0x09c7:
            boolean r0 = r13 instanceof X.C36001yX
            if (r0 == 0) goto L_0x09f1
            X.1yX r2 = (X.C36001yX) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r0 = r2.A00
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x14f7
            int r1 = r0.A00
            r0 = 147(0x93, float:2.06E-43)
            if (r1 != r0) goto L_0x09ee
            X.23Q r0 = X.AnonymousClass23Q.BIZ_BOT_1P_MESSAGING_ENABLED
        L_0x09de:
            r5.A0C(r0)
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x14f2
            java.lang.String r0 = r0.getRawString()
            r4.A0C(r0)
            goto L_0x0049
        L_0x09ee:
            X.23Q r0 = X.AnonymousClass23Q.BIZ_BOT_3P_MESSAGING_ENABLED
            goto L_0x09de
        L_0x09f1:
            boolean r0 = r13 instanceof X.C35991yW
            if (r0 == 0) goto L_0x0a17
            X.1yW r2 = (X.C35991yW) r2
            X.1ny r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A0K
            r5.A0C(r0)
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x0a14
            java.lang.String r0 = r0.getRawString()
        L_0x0a09:
            r4.A0C(r0)
            boolean r0 = r1.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0046
        L_0x0a14:
            java.lang.String r0 = ""
            goto L_0x0a09
        L_0x0a17:
            boolean r0 = r13 instanceof X.C35981yV
            if (r0 == 0) goto L_0x0a3e
            X.1yV r2 = (X.C35981yV) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.4uZ r0 = r1.A0n()
            if (r0 != 0) goto L_0x0a2c
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
        L_0x0a2c:
            r2.A06 = r0
            A05(r4, r2)
            X.23Q r0 = X.AnonymousClass23Q.A1d
            r5.A0C(r0)
            X.4uZ r0 = r2.A06
            java.lang.String r1 = X.C18300x5.A0i(r0)
            goto L_0x0046
        L_0x0a3e:
            boolean r0 = r13 instanceof X.C35971yU
            if (r0 == 0) goto L_0x0a66
            X.1yU r2 = (X.C35971yU) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2F
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_PROMOTE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0a66:
            boolean r0 = r13 instanceof X.C35961yT
            if (r0 == 0) goto L_0x0a8e
            X.1yT r2 = (X.C35961yT) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2A
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_DEMOTE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0a8e:
            boolean r0 = r13 instanceof X.C35951yS
            if (r0 == 0) goto L_0x0ac4
            X.1yS r2 = (X.C35951yS) r2
            X.1oZ r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1w
            A06(r5, r0, r1, r2)
            java.lang.String r8 = r1.A1x()
            java.lang.String r7 = r1.A01
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r3 = r2.A05
            java.lang.String r1 = "GROUP_CHANGE_SUBJECT"
            X.2qk r0 = r2.A0I
            X.1fL r1 = A01(r0, r3, r6, r1)
            X.4uZ r0 = r2.A06
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            A03(r1, r0, r4, r5)
            if (r8 != 0) goto L_0x0abd
            java.lang.String r8 = ""
        L_0x0abd:
            r5.A0D(r8)
            if (r7 == 0) goto L_0x0049
            goto L_0x0822
        L_0x0ac4:
            boolean r0 = r13 instanceof X.C35941yR
            if (r0 == 0) goto L_0x0b21
            X.1yR r2 = (X.C35941yR) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            int r1 = r3.A00
            r0 = 7
            if (r1 != r0) goto L_0x0b14
            r0 = 1
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
            r2.A0C = r1
            X.4uZ r0 = r3.A0n()
            java.lang.String r0 = X.C627336j.A07(r0)
            r1.add(r0)
        L_0x0ae6:
            X.4uZ r0 = r2.A05
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0b06
            X.23Q r0 = X.AnonymousClass23Q.A13
            r5.A0C(r0)
            java.lang.Class<X.1fI> r6 = X.AnonymousClass1fI.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "BROADCAST_REMOVE"
        L_0x0af9:
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0b06:
            X.23Q r0 = X.AnonymousClass23Q.A2G
            r5.A0C(r0)
            java.lang.Class<X.1fL> r6 = X.C28011fL.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_REMOVE"
            goto L_0x0af9
        L_0x0b14:
            r0 = 14
            if (r1 != r0) goto L_0x0ae6
            X.C36541zP.A09(r3, r2)
            X.1p1 r3 = (X.C31891p1) r3
            A08(r2, r3)
            goto L_0x0ae6
        L_0x0b21:
            boolean r0 = r13 instanceof X.C36351z6
            if (r0 == 0) goto L_0x0b5a
            X.1z6 r2 = (X.C36351z6) r2
            X.1o8 r3 = r2.A01
            X.C626936e.A06(r3)
            com.whatsapp.jid.UserJid r0 = r3.A01
            r2.A06 = r0
            r0 = 1
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
            r2.A0C = r1
            com.whatsapp.jid.UserJid r0 = r3.A00
            java.lang.String r0 = X.C627336j.A07(r0)
            r1.add(r0)
            X.23Q r0 = X.AnonymousClass23Q.A29
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_CHANGE_NUMBER"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0b5a:
            boolean r0 = r13 instanceof X.C36341z5
            if (r0 == 0) goto L_0x0bb9
            X.1z5 r2 = (X.C36341z5) r2
            X.1p1 r1 = r2.A01
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A12
            r5.A0C(r0)
            java.util.List r0 = r1.A01
            int r0 = r0.size()
            r2.A00 = r0
            X.C36541zP.A09(r1, r2)
            java.lang.String r0 = r1.A13()
            r2.A0B = r0
            A05(r4, r2)
            X.4uZ r0 = r2.A06
            X.AnonymousClass1A3.A00(r0, r5)
            int r0 = r2.A00
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r5.A0D(r0)
            java.lang.String r0 = r2.A0B
            if (r0 != 0) goto L_0x0b92
            java.lang.String r0 = ""
        L_0x0b92:
            r5.A0D(r0)
            java.util.List r0 = r1.A01
            java.util.ArrayList r0 = X.AnonymousClass000.A0p(r0)
            r2.A0C = r0
            java.util.List r0 = r1.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0ba3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x7.A0S(r1)
            java.lang.String r0 = X.C627336j.A07(r0)
            if (r0 != 0) goto L_0x0bb5
            java.lang.String r0 = ""
        L_0x0bb5:
            r5.A0D(r0)
            goto L_0x0ba3
        L_0x0bb9:
            boolean r0 = r13 instanceof X.C35931yQ
            if (r0 == 0) goto L_0x0c11
            X.1yQ r2 = (X.C35931yQ) r2
            X.1mI r3 = r2.A00
            X.C626936e.A06(r3)
            java.util.List r0 = r3.A19()
            if (r0 == 0) goto L_0x0bfe
            java.util.List r0 = r3.A19()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0bfe
            X.C36541zP.A09(r3, r2)
            java.util.List r1 = r3.A19()
            java.util.ArrayList r0 = X.C18300x5.A0u(r1)
            X.C627336j.A0H(r1, r0)
            r2.A0C = r0
        L_0x0be4:
            X.23Q r0 = X.AnonymousClass23Q.A2D
            r5.A0C(r0)
            java.lang.Class<X.1fL> r6 = X.C28011fL.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_LEAVE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0bfe:
            r0 = 1
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
            r2.A0C = r1
            X.4uZ r0 = r3.A0n()
            java.lang.String r0 = X.C18300x5.A0i(r0)
            r1.add(r0)
            goto L_0x0be4
        L_0x0c11:
            boolean r0 = r13 instanceof X.C35921yP
            if (r0 == 0) goto L_0x0c39
            X.1yP r2 = (X.C35921yP) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A28
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_PARTICIPANT_ADD_REQUEST_JOIN"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0c39:
            boolean r0 = r13 instanceof X.C36551zQ
            if (r0 == 0) goto L_0x0d3d
            X.1zQ r2 = (X.C36551zQ) r2
            X.1p1 r3 = r2.A01
            X.C626936e.A06(r3)
            boolean r6 = r2 instanceof X.C27441dp
            if (r6 == 0) goto L_0x0d21
            X.23Q r0 = X.AnonymousClass23Q.A2B
        L_0x0c4a:
            A06(r5, r0, r3, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            if (r6 == 0) goto L_0x0d05
            java.lang.String r6 = "GROUP_PARTICIPANT_INVITE"
        L_0x0c55:
            X.2qk r0 = r2.A0I
            X.1fL r1 = A01(r0, r1, r7, r6)
            com.whatsapp.jid.UserJid r0 = A02(r0, r2, r6)
            A03(r1, r0, r4, r5)
            boolean r0 = r2 instanceof X.C27471ds
            if (r0 == 0) goto L_0x0cab
            r8 = r2
            X.1ds r8 = (X.C27471ds) r8
            X.1p1 r7 = r8.A01
            if (r7 == 0) goto L_0x0c99
            X.1p0 r7 = (X.C31881p0) r7
            r0 = 2
            com.whatsapp.jid.GroupJid r6 = r7.A1x(r0)
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0c7e
            java.lang.String r0 = r6.getRawString()
            if (r0 != 0) goto L_0x0c7f
        L_0x0c7e:
            r0 = r1
        L_0x0c7f:
            r5.A0D(r0)
            X.2ss r0 = r8.A00
            java.lang.String r0 = r0.A0D(r6)
            if (r0 != 0) goto L_0x0ca9
            r0 = 2
            java.lang.String r0 = r7.A1y(r0)
            if (r0 != 0) goto L_0x0ca9
        L_0x0c91:
            r5.A0D(r1)
            java.lang.String r0 = "false"
            r5.A0D(r0)
        L_0x0c99:
            java.util.List r1 = r3.A01
            java.util.ArrayList r0 = X.C18300x5.A0u(r1)
            X.C627336j.A0H(r1, r0)
            r2.A0C = r0
            A07(r5, r0)
            goto L_0x0049
        L_0x0ca9:
            r1 = r0
            goto L_0x0c91
        L_0x0cab:
            boolean r0 = r2 instanceof X.C27461dr
            if (r0 == 0) goto L_0x0c99
            r8 = r2
            X.1dr r8 = (X.C27461dr) r8
            X.1p1 r7 = r8.A01
            if (r7 == 0) goto L_0x0c99
            boolean r0 = r7 instanceof X.C31801os
            r6 = 0
            if (r0 == 0) goto L_0x0ce4
            X.1p0 r7 = (X.C31881p0) r7
            r0 = 1
            com.whatsapp.jid.GroupJid r1 = r7.A1x(r0)
            if (r1 == 0) goto L_0x0cc8
            java.lang.String r6 = r1.getRawString()
        L_0x0cc8:
            X.2ss r0 = r8.A00
            java.lang.String r1 = r0.A0D(r1)
            if (r1 != 0) goto L_0x0cd5
            r0 = 1
            java.lang.String r1 = r7.A1y(r0)
        L_0x0cd5:
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x0cda
            r6 = r0
        L_0x0cda:
            r5.A0D(r6)
            if (r1 != 0) goto L_0x0ce0
            r1 = r0
        L_0x0ce0:
            r5.A0D(r1)
            goto L_0x0c99
        L_0x0ce4:
            boolean r0 = r7 instanceof X.C31561oU
            if (r0 == 0) goto L_0x0d03
            X.1oU r7 = (X.C31561oU) r7
            X.2z0 r0 = r7.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0d00
            X.2zh r0 = r8.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.1fJ r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0d00
            java.lang.String r6 = r0.getRawString()
        L_0x0d00:
            java.lang.String r1 = r7.A00
            goto L_0x0cd5
        L_0x0d03:
            r1 = r6
            goto L_0x0cd5
        L_0x0d05:
            boolean r0 = r2 instanceof X.C27451dq
            if (r0 == 0) goto L_0x0d0d
            java.lang.String r6 = "CAG_INVITE_AUTO_JOINED"
            goto L_0x0c55
        L_0x0d0d:
            boolean r0 = r2 instanceof X.C27471ds
            if (r0 == 0) goto L_0x0d15
            java.lang.String r6 = "CAG_INVITE_AUTO_ADD"
            goto L_0x0c55
        L_0x0d15:
            boolean r0 = r2 instanceof X.C27431do
            if (r0 == 0) goto L_0x0d1d
            java.lang.String r6 = "GROUP_PARTICIPANT_LINKED_GROUP_JOIN"
            goto L_0x0c55
        L_0x0d1d:
            java.lang.String r6 = "GROUP_PARTICIPANT_JOINED_GROUP_AND_PARENT_GROUP"
            goto L_0x0c55
        L_0x0d21:
            boolean r0 = r2 instanceof X.C27451dq
            if (r0 == 0) goto L_0x0d29
            X.23Q r0 = X.AnonymousClass23Q.A15
            goto L_0x0c4a
        L_0x0d29:
            boolean r0 = r2 instanceof X.C27471ds
            if (r0 == 0) goto L_0x0d31
            X.23Q r0 = X.AnonymousClass23Q.A14
            goto L_0x0c4a
        L_0x0d31:
            boolean r0 = r2 instanceof X.C27431do
            if (r0 == 0) goto L_0x0d39
            X.23Q r0 = X.AnonymousClass23Q.A2E
            goto L_0x0c4a
        L_0x0d39:
            X.23Q r0 = X.AnonymousClass23Q.A2C
            goto L_0x0c4a
        L_0x0d3d:
            boolean r0 = r13 instanceof X.C35911yO
            if (r0 == 0) goto L_0x0d65
            X.1yO r2 = (X.C35911yO) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2H
            A06(r5, r0, r1, r2)
            A08(r2, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_V4_ADD_INVITE_SENT"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0d65:
            boolean r0 = r13 instanceof X.C35901yN
            if (r0 == 0) goto L_0x0d8a
            X.1yN r2 = (X.C35901yN) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1s
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_INVITE_LINK"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0d8a:
            boolean r0 = r13 instanceof X.C36331z4
            if (r0 == 0) goto L_0x0db3
            X.1z4 r2 = (X.C36331z4) r2
            X.1mI r1 = r2.A01
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A21
            r5.A0C(r0)
            int r1 = r1.A00
            r0 = 73
            if (r1 != r0) goto L_0x0dad
            r3 = 1
        L_0x0da1:
            com.whatsapp.jid.GroupJid r1 = r2.A00
            r0 = 0
            A03(r1, r0, r4, r5)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            goto L_0x0046
        L_0x0dad:
            r0 = 74
            if (r1 != r0) goto L_0x14fc
            r3 = 0
            goto L_0x0da1
        L_0x0db3:
            boolean r0 = r13 instanceof X.C35891yM
            if (r0 == 0) goto L_0x0e43
            X.1yM r2 = (X.C35891yM) r2
            X.1o7 r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A1r
            r5.A0C(r0)
            java.lang.String r0 = r1.A1w()
            r2.A0B = r0
            X.C36541zP.A09(r1, r2)
            com.whatsapp.data.ProfilePhotoChange r6 = r1.A00
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CHANGE_ICON"
            X.1fL r1 = A01(r3, r1, r7, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.lang.String r0 = r2.A0B
            if (r0 != 0) goto L_0x0de8
            java.lang.String r0 = "remove"
        L_0x0de8:
            r5.A0D(r0)
            if (r6 == 0) goto L_0x0049
            X.1CV r0 = X.AnonymousClass1CV.DEFAULT_INSTANCE
            X.6c9 r3 = r0.A0G()
            byte[] r0 = r6.oldPhoto
            if (r0 == 0) goto L_0x0e07
            X.8Lq r2 = X.C18270x1.A09(r3, r0)
            X.6cX r1 = r3.A00
            X.1CV r1 = (X.AnonymousClass1CV) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.oldPhoto_ = r2
        L_0x0e07:
            byte[] r0 = r6.newPhoto
            if (r0 == 0) goto L_0x0e1b
            X.8Lq r2 = X.C18270x1.A09(r3, r0)
            X.6cX r1 = r3.A00
            X.1CV r1 = (X.AnonymousClass1CV) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.newPhoto_ = r2
        L_0x0e1b:
            int r2 = r6.newPhotoId
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1CV r1 = (X.AnonymousClass1CV) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newPhotoId_ = r2
            X.6cX r0 = r3.A06()
            X.1CV r0 = (X.AnonymousClass1CV) r0
            X.1ES r2 = X.C18280x3.A0O(r5)
            r0.getClass()
            r2.photoChange_ = r0
            int r1 = r2.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r0
            r2.bitField0_ = r1
            goto L_0x0049
        L_0x0e43:
            boolean r0 = r13 instanceof X.C35881yL
            if (r0 == 0) goto L_0x0e68
            X.1yL r2 = (X.C35881yL) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A20
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_DELETE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0e68:
            boolean r0 = r13 instanceof X.C35871yK
            if (r0 == 0) goto L_0x0e9b
            X.1yK r2 = (X.C35871yK) r2
            X.1mI r1 = r2.A00
            X.C626936e.A06(r1)
            java.lang.String r0 = r1.A13()
            r2.A0B = r0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A07(r1)
            r2.A06 = r0
            X.23Q r0 = X.AnonymousClass23Q.A1x
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GROUP_CREATE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.lang.String r1 = r2.A0B
            goto L_0x00bc
        L_0x0e9b:
            boolean r0 = r13 instanceof X.C36321z3
            if (r0 == 0) goto L_0x0f07
            X.1z3 r2 = (X.C36321z3) r2
            X.1mI r6 = r2.A01
            X.C626936e.A06(r6)
            X.4uZ r3 = r6.A0n()
            r2.A06 = r3
            int r1 = r6.A00
            r0 = 4
            if (r1 != r0) goto L_0x0ef8
            java.util.Set r1 = java.util.Collections.singleton(r3)
        L_0x0eb5:
            java.util.ArrayList r0 = X.C18300x5.A0u(r1)
            X.C627336j.A0H(r1, r0)
            r2.A0C = r0
        L_0x0ebe:
            X.2z0 r0 = r6.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0ee0
            X.23Q r0 = X.AnonymousClass23Q.A11
            r5.A0C(r0)
            java.lang.Class<X.1fI> r6 = X.AnonymousClass1fI.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "BROADCAST_ADD"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
        L_0x0edb:
            A04(r1, r0, r4, r5, r2)
            goto L_0x0049
        L_0x0ee0:
            X.23Q r0 = X.AnonymousClass23Q.A27
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r3 = r2.A05
            java.lang.String r1 = "GROUP_PARTICIPANT_ADD"
            X.2qk r0 = r2.A0I
            X.1fL r1 = A01(r0, r3, r6, r1)
            X.4uZ r0 = r2.A06
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            goto L_0x0edb
        L_0x0ef8:
            r0 = 12
            if (r1 != r0) goto L_0x0ebe
            java.util.List r0 = r6.A19()
            if (r0 == 0) goto L_0x0ebe
            java.util.List r1 = r6.A19()
            goto L_0x0eb5
        L_0x0f07:
            boolean r0 = r13 instanceof X.C36311z2
            if (r0 == 0) goto L_0x0f3f
            X.1z2 r2 = (X.C36311z2) r2
            X.1o8 r1 = r2.A01
            X.C626936e.A06(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2I
            r5.A0C(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            r2.A08 = r0
            com.whatsapp.jid.UserJid r0 = r1.A00
            r2.A07 = r0
            X.4uZ r0 = r2.A05
            if (r0 == 0) goto L_0x0f2a
            java.lang.String r0 = r0.getRawString()
            r4.A0C(r0)
        L_0x0f2a:
            com.whatsapp.jid.UserJid r0 = r2.A08
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0f3d
            java.lang.String r0 = r0.getRawString()
        L_0x0f34:
            r5.A0D(r0)
            com.whatsapp.jid.UserJid r0 = r2.A07
            if (r0 == 0) goto L_0x0046
            goto L_0x12ce
        L_0x0f3d:
            r0 = r1
            goto L_0x0f34
        L_0x0f3f:
            boolean r0 = r13 instanceof X.C35861yJ
            if (r0 == 0) goto L_0x0f8b
            X.1yJ r2 = (X.C35861yJ) r2
            boolean r3 = X.C18270x1.A1U(r5, r4)
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            X.1p0 r1 = (X.C31881p0) r1
            X.23Q r0 = X.AnonymousClass23Q.A1R
            r5.A0C(r0)
            if (r1 == 0) goto L_0x0f88
            X.C36541zP.A09(r1, r2)
            com.whatsapp.jid.GroupJid r8 = r1.A1x(r3)
            java.lang.String r7 = r1.A1y(r3)
        L_0x0f62:
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_PARENT_GROUP_SUBJECT_CHANGED"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x0f7f
            java.lang.String r0 = r8.getRawString()
            if (r0 != 0) goto L_0x0f80
        L_0x0f7f:
            r0 = r1
        L_0x0f80:
            r5.A0D(r0)
        L_0x0f83:
            if (r7 != 0) goto L_0x0822
            r7 = r1
            goto L_0x0822
        L_0x0f88:
            r8 = 0
            r7 = r8
            goto L_0x0f62
        L_0x0f8b:
            boolean r0 = r13 instanceof X.C36561zR
            if (r0 == 0) goto L_0x0fbd
            X.1zR r2 = (X.C36561zR) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r1 = r2.A01
            X.C626936e.A06(r1)
            X.23Q r0 = X.C36561zR.A02
            r5.A0C(r0)
            if (r1 == 0) goto L_0x0fbb
            X.4uZ r0 = r1.A0n()
        L_0x0fa4:
            r2.A06 = r0
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GENERAL_CHAT_AUTO_ADD_DISABLED"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x0fbb:
            r0 = 0
            goto L_0x0fa4
        L_0x0fbd:
            boolean r0 = r13 instanceof X.C36511zM
            if (r0 == 0) goto L_0x100c
            X.1zM r2 = (X.C36511zM) r2
            X.C18260x0.A0O(r5, r4)
            X.1mI r6 = r2.A01
            X.C626936e.A06(r6)
            if (r6 == 0) goto L_0x0049
            X.23Q r0 = X.C36511zM.A03
            A06(r5, r0, r6, r2)
            int r3 = r6.A00
            r0 = 149(0x95, float:2.09E-43)
            java.lang.String r1 = ""
            if (r3 != r0) goto L_0x1004
            X.1p0 r6 = (X.C31881p0) r6
            java.lang.String r0 = r6.A0y
            if (r0 != 0) goto L_0x0fe1
            r0 = r1
        L_0x0fe1:
            r5.A0D(r0)
        L_0x0fe4:
            r0 = 2
            java.lang.String r0 = r6.A1y(r0)
            if (r0 == 0) goto L_0x0fec
            r1 = r0
        L_0x0fec:
            r5.A0D(r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "GENERAL_CHAT_ADD"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            goto L_0x0049
        L_0x1004:
            java.lang.String r0 = "created"
            r5.A0D(r0)
            X.1p0 r6 = (X.C31881p0) r6
            goto L_0x0fe4
        L_0x100c:
            boolean r0 = r13 instanceof X.C36431zE
            if (r0 == 0) goto L_0x1075
            X.1zE r2 = (X.C36431zE) r2
            r1 = 0
            boolean r0 = X.AnonymousClass0x2.A1Y(r5, r4)
            X.1oL r8 = r2.A02
            if (r8 == 0) goto L_0x134b
            X.C36541zP.A09(r8, r2)
            com.whatsapp.jid.GroupJid r9 = r8.A1x(r0)
            java.lang.String r7 = r8.A1y(r0)
            r0 = 2
            java.lang.String r6 = r8.A1y(r0)
            X.23Q r0 = X.AnonymousClass23Q.A1f
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r10 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "EMPTY_SUBGROUP_CREATE"
            X.1fL r1 = A01(r3, r1, r10, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.lang.String r3 = ""
            if (r9 == 0) goto L_0x104d
            java.lang.String r0 = r9.getRawString()
            if (r0 != 0) goto L_0x104e
        L_0x104d:
            r0 = r3
        L_0x104e:
            r5.A0D(r0)
            X.2ss r1 = r2.A00
            java.lang.String r0 = r1.A0D(r9)
            if (r0 != 0) goto L_0x1073
            if (r7 != 0) goto L_0x105c
            r7 = r3
        L_0x105c:
            r5.A0D(r7)
            X.2z0 r0 = r8.A1J
            X.4uZ r0 = r0.A00
            java.lang.String r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x1071
            if (r6 != 0) goto L_0x106c
            r6 = r3
        L_0x106c:
            r5.A0D(r6)
            goto L_0x0049
        L_0x1071:
            r6 = r0
            goto L_0x106c
        L_0x1073:
            r7 = r0
            goto L_0x105c
        L_0x1075:
            boolean r0 = r13 instanceof X.C36301z1
            if (r0 == 0) goto L_0x10af
            X.1z1 r2 = (X.C36301z1) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            r7 = r1
            X.1oW r7 = (X.C31581oW) r7
            X.23Q r0 = X.AnonymousClass23Q.A1R
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_PARENT_GROUP_SUBJECT_CHANGED"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            X.1fJ r0 = r7.A01
            if (r0 != 0) goto L_0x10aa
            java.lang.String r0 = ""
        L_0x10a1:
            r5.A0D(r0)
            java.lang.String r1 = r7.A1x()
            goto L_0x0046
        L_0x10aa:
            java.lang.String r0 = r0.getRawString()
            goto L_0x10a1
        L_0x10af:
            boolean r0 = r13 instanceof X.C36471zI
            if (r0 == 0) goto L_0x1113
            X.1zI r2 = (X.C36471zI) r2
            r3 = 0
            boolean r1 = X.AnonymousClass0x2.A1Y(r5, r4)
            X.1oy r0 = r2.A01
            if (r0 != 0) goto L_0x10c5
            java.lang.String r0 = "attempt to create builder without message"
            X.C626936e.A0D(r3, r0)
            goto L_0x0049
        L_0x10c5:
            X.C36541zP.A09(r0, r2)
            com.whatsapp.jid.GroupJid r8 = r0.A1x(r1)
            java.lang.String r7 = r0.A1y(r1)
            boolean r3 = r2 instanceof X.AnonymousClass1O3
            if (r3 == 0) goto L_0x110d
            r0 = r2
            X.1O3 r0 = (X.AnonymousClass1O3) r0
            X.23Q r0 = r0.A00
        L_0x10d9:
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            if (r3 == 0) goto L_0x110a
            java.lang.String r3 = "SUBGROUP_UNLINKED_FROM_PARENT"
        L_0x10e4:
            X.2qk r0 = r2.A0I
            X.1fL r1 = A01(r0, r1, r6, r3)
            com.whatsapp.jid.UserJid r0 = A02(r0, r2, r3)
            A03(r1, r0, r4, r5)
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x10fb
            java.lang.String r0 = r8.getRawString()
            if (r0 != 0) goto L_0x10fc
        L_0x10fb:
            r0 = r1
        L_0x10fc:
            r5.A0D(r0)
            X.2ss r0 = r2.A00
            java.lang.String r0 = r0.A0D(r8)
            if (r0 == 0) goto L_0x0f83
            r7 = r0
            goto L_0x0822
        L_0x110a:
            java.lang.String r3 = "SUBGROUP_LINKED_TO_PARENT"
            goto L_0x10e4
        L_0x110d:
            r0 = r2
            X.1O2 r0 = (X.AnonymousClass1O2) r0
            X.23Q r0 = r0.A00
            goto L_0x10d9
        L_0x1113:
            boolean r0 = r13 instanceof X.C36421zD
            if (r0 == 0) goto L_0x115f
            X.1zD r2 = (X.C36421zD) r2
            X.1p1 r1 = r2.A02
            X.C626936e.A06(r1)
            r7 = r1
            X.1oV r7 = (X.C31571oV) r7
            int r0 = r7.A00
            boolean r0 = X.C57192tF.A00(r0)
            if (r0 == 0) goto L_0x115c
            X.23Q r0 = X.AnonymousClass23Q.A1L
        L_0x112b:
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_SYSTEM_COMMUNITY_LINK_CHANGED"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            com.whatsapp.jid.GroupJid r1 = r7.A01
            if (r1 == 0) goto L_0x114c
            java.lang.String r0 = r1.getRawString()
            r5.A0D(r0)
        L_0x114c:
            X.3Ex r0 = r2.A00
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0049
            X.5ZU r0 = r2.A01
            java.lang.String r1 = r0.A0H(r1)
            goto L_0x00bc
        L_0x115c:
            X.23Q r0 = X.AnonymousClass23Q.A1V
            goto L_0x112b
        L_0x115f:
            boolean r0 = r13 instanceof X.C36401zB
            if (r0 == 0) goto L_0x1195
            X.1zB r2 = (X.C36401zB) r2
            r1 = 0
            boolean r0 = X.AnonymousClass0x2.A1Y(r5, r4)
            X.1oz r6 = r2.A01
            if (r6 == 0) goto L_0x134b
            X.C36541zP.A09(r6, r2)
            com.whatsapp.jid.GroupJid r9 = r6.A1x(r0)
            java.lang.String r8 = r6.A1y(r0)
            int r7 = r6.A00
            r3 = 144(0x90, float:2.02E-43)
            if (r7 == r3) goto L_0x12e6
            switch(r7) {
                case 122: goto L_0x12d4;
                case 123: goto L_0x12d7;
                case 124: goto L_0x12da;
                case 125: goto L_0x12dd;
                case 126: goto L_0x12e0;
                case 127: goto L_0x12e3;
                case 128: goto L_0x12e9;
                default: goto L_0x1182;
            }
        L_0x1182:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemAction '"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "' not supported."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x1195:
            boolean r0 = r13 instanceof X.C36291z0
            if (r0 == 0) goto L_0x11bf
            X.1z0 r2 = (X.C36291z0) r2
            X.1p1 r1 = r2.A00
            X.C626936e.A06(r1)
            r7 = r1
            X.1oU r7 = (X.C31561oU) r7
            X.23Q r0 = X.AnonymousClass23Q.A1Q
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_PARENT_GROUP_DELETE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            java.lang.String r1 = r7.A00
            goto L_0x0289
        L_0x11bf:
            boolean r0 = r13 instanceof X.C36281yz
            if (r0 == 0) goto L_0x1352
            X.1yz r2 = (X.C36281yz) r2
            X.1p1 r1 = r2.A01
            X.C626936e.A06(r1)
            java.lang.String r0 = r1.A13()
            r2.A0B = r0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A07(r1)
            r2.A06 = r0
            X.23Q r0 = X.AnonymousClass23Q.A1I
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.2qk r3 = r2.A0I
            java.lang.String r0 = "ACTION_COMMUNITY_CREATE"
            X.1fL r1 = A01(r3, r1, r6, r0)
            com.whatsapp.jid.UserJid r0 = A02(r3, r2, r0)
            A03(r1, r0, r4, r5)
            X.2zh r1 = r2.A00
            X.4uZ r0 = r2.A05
            X.1fJ r0 = X.AnonymousClass34R.A03(r0)
            X.1fJ r0 = r1.A02(r0)
            java.lang.String r0 = X.C627336j.A07(r0)
            if (r0 != 0) goto L_0x1202
            java.lang.String r0 = ""
        L_0x1202:
            r5.A0D(r0)
            java.lang.String r1 = r2.A0B
            goto L_0x0289
        L_0x1209:
            X.23Q r0 = X.AnonymousClass23Q.A04
            r5.A0C(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x00bc
        L_0x1216:
            X.9aq r0 = r2.A00
            X.1of r1 = (X.C31671of) r1
            r0.A09(r5, r1)
            goto L_0x0049
        L_0x121f:
            X.9aq r0 = r2.A00
            X.1og r1 = (X.C31681og) r1
            r0.A08(r5, r1)
            goto L_0x0049
        L_0x1228:
            X.9aq r0 = r2.A00
            X.1o9 r1 = (X.C31351o9) r1
            r0.A07(r5, r1)
            goto L_0x0049
        L_0x1231:
            X.23Q r0 = X.AnonymousClass23Q.A2P
            goto L_0x1239
        L_0x1234:
            X.23Q r0 = X.AnonymousClass23Q.A2U
            goto L_0x1239
        L_0x1237:
            X.23Q r0 = X.AnonymousClass23Q.A2T
        L_0x1239:
            r5.A0C(r0)
            X.4uZ r0 = r1.A0n()
            goto L_0x12cc
        L_0x1242:
            X.23Q r0 = X.AnonymousClass23Q.A2Y
            goto L_0x124a
        L_0x1245:
            X.23Q r0 = X.AnonymousClass23Q.A2X
            goto L_0x124a
        L_0x1248:
            X.23Q r0 = X.AnonymousClass23Q.A2Z
        L_0x124a:
            r5.A0C(r0)
            r0 = r3
            X.1o4 r0 = (X.C31301o4) r0
            int r1 = r0.A00
            boolean r0 = r0.A01
            X.AnonymousClass1A3.A01(r5, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.A0D(r0)
            X.4uZ r0 = r3.A0n()
            goto L_0x12cc
        L_0x1263:
            r5.A0D(r1)
            goto L_0x0046
        L_0x1268:
            r5.A0D(r1)
            r5.A0D(r0)
            goto L_0x0049
        L_0x1270:
            r5.A0D(r0)
            goto L_0x0046
        L_0x1275:
            java.lang.String r1 = "regular"
            goto L_0x0046
        L_0x127a:
            java.lang.String r1 = "off"
            goto L_0x0046
        L_0x127f:
            X.23Q r0 = X.AnonymousClass23Q.A0A
            goto L_0x12a8
        L_0x1282:
            X.23Q r0 = X.AnonymousClass23Q.A0J
            goto L_0x12a8
        L_0x1285:
            X.23Q r0 = X.AnonymousClass23Q.A0I
            goto L_0x12a8
        L_0x1288:
            X.23Q r0 = X.AnonymousClass23Q.A0p
            goto L_0x12a8
        L_0x128b:
            X.23Q r0 = X.AnonymousClass23Q.A38
            goto L_0x12a8
        L_0x128e:
            X.23Q r0 = X.AnonymousClass23Q.A3B
            goto L_0x12a8
        L_0x1291:
            X.23Q r0 = X.AnonymousClass23Q.A39
            goto L_0x12a8
        L_0x1294:
            X.23Q r0 = X.AnonymousClass23Q.A2N
            goto L_0x12a8
        L_0x1297:
            X.23Q r0 = X.AnonymousClass23Q.A2x
            goto L_0x12a8
        L_0x129a:
            X.23Q r0 = X.AnonymousClass23Q.A33
            goto L_0x12a8
        L_0x129d:
            X.23Q r0 = X.AnonymousClass23Q.A2y
            goto L_0x12a8
        L_0x12a0:
            X.23Q r0 = X.AnonymousClass23Q.A32
            goto L_0x12a8
        L_0x12a3:
            X.23Q r0 = X.AnonymousClass23Q.A0B
            goto L_0x12a8
        L_0x12a6:
            X.23Q r0 = X.AnonymousClass23Q.A0o
        L_0x12a8:
            r5.A0C(r0)
            if (r2 == 0) goto L_0x0049
            r5.A0D(r2)
            goto L_0x0049
        L_0x12b2:
            X.23Q r0 = X.AnonymousClass23Q.A2f
            r5.A0C(r0)
            A05(r4, r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.4uZ r3 = r1.A0n()
            java.lang.String r1 = "PINNED_MESSAGE_IN_CHAT"
            X.2qk r0 = r2.A0I
            com.whatsapp.jid.Jid r0 = A00(r0, r3, r6, r1)
            X.4uZ r0 = (X.C95814uZ) r0
            r2.A06 = r0
        L_0x12cc:
            if (r0 == 0) goto L_0x0049
        L_0x12ce:
            java.lang.String r1 = r0.getRawString()
            goto L_0x0046
        L_0x12d4:
            X.23Q r0 = X.AnonymousClass23Q.A1I
            goto L_0x12eb
        L_0x12d7:
            X.23Q r0 = X.AnonymousClass23Q.A1K
            goto L_0x12eb
        L_0x12da:
            X.23Q r0 = X.AnonymousClass23Q.A1S
            goto L_0x12eb
        L_0x12dd:
            X.23Q r0 = X.AnonymousClass23Q.A1J
            goto L_0x12eb
        L_0x12e0:
            X.23Q r0 = X.AnonymousClass23Q.A2q
            goto L_0x12eb
        L_0x12e3:
            X.23Q r0 = X.AnonymousClass23Q.A2r
            goto L_0x12eb
        L_0x12e6:
            X.23Q r0 = X.AnonymousClass23Q.A2p
            goto L_0x12eb
        L_0x12e9:
            X.23Q r0 = X.AnonymousClass23Q.A1N
        L_0x12eb:
            r5.A0C(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r10 = com.whatsapp.jid.GroupJid.class
            X.4uZ r1 = r2.A05
            X.6cX r0 = r5.A00
            X.1ES r0 = (X.AnonymousClass1ES) r0
            X.23Q r0 = r0.A0M()
            java.lang.String r0 = r0.name()
            X.2qk r12 = r2.A0I
            X.1fL r11 = A01(r12, r1, r10, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            X.4uZ r1 = r2.A06
            X.6cX r0 = r5.A00
            X.1ES r0 = (X.AnonymousClass1ES) r0
            X.23Q r0 = r0.A0M()
            java.lang.String r0 = r0.name()
            com.whatsapp.jid.Jid r0 = A00(r12, r1, r10, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            A03(r11, r0, r4, r5)
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x1327
            java.lang.String r0 = r9.getRawString()
            if (r0 != 0) goto L_0x1328
        L_0x1327:
            r0 = r1
        L_0x1328:
            r5.A0D(r0)
            X.2ss r0 = r2.A00
            java.lang.String r0 = r0.A0D(r9)
            if (r0 != 0) goto L_0x1349
            if (r8 != 0) goto L_0x1336
            r8 = r1
        L_0x1336:
            r5.A0D(r8)
            if (r7 == r3) goto L_0x133f
            r0 = 125(0x7d, float:1.75E-43)
            if (r7 != r0) goto L_0x0049
        L_0x133f:
            r0 = 2
            java.lang.String r0 = r6.A1y(r0)
            if (r0 == 0) goto L_0x0046
            r1 = r0
            goto L_0x0046
        L_0x1349:
            r8 = r0
            goto L_0x1336
        L_0x134b:
            java.lang.String r0 = "attempt to create builder without message"
            X.C626936e.A0D(r1, r0)
            goto L_0x0049
        L_0x1352:
            boolean r0 = r13 instanceof X.C36481zJ
            if (r0 == 0) goto L_0x0049
            X.1zJ r2 = (X.C36481zJ) r2
            X.1p1 r1 = r2.A02
            X.C626936e.A06(r1)
            boolean r6 = r2 instanceof X.AnonymousClass1O8
            if (r6 != 0) goto L_0x1458
            boolean r0 = r2 instanceof X.AnonymousClass1O7
            if (r0 != 0) goto L_0x1454
            boolean r0 = r2 instanceof X.AnonymousClass1O5
            if (r0 != 0) goto L_0x1379
            boolean r0 = r2 instanceof X.AnonymousClass1O4
            if (r0 != 0) goto L_0x1450
            boolean r0 = r2 instanceof X.AnonymousClass1O1
            if (r0 != 0) goto L_0x1458
            boolean r0 = r2 instanceof X.AnonymousClass1O0
            if (r0 != 0) goto L_0x1454
            boolean r0 = r2 instanceof X.AnonymousClass1Nz
            if (r0 == 0) goto L_0x1450
        L_0x1379:
            X.23Q r0 = X.AnonymousClass23Q.A1W
        L_0x137b:
            A06(r5, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            X.4uZ r3 = r2.A05
            if (r6 == 0) goto L_0x141c
            java.lang.String r6 = "FMessageSystemSubgroupUnlinkInParent"
        L_0x1386:
            X.2qk r0 = r2.A0I
            X.1fL r3 = A01(r0, r3, r7, r6)
            com.whatsapp.jid.UserJid r0 = A02(r0, r2, r6)
            A03(r3, r0, r4, r5)
            X.2ss r6 = r2.A00
            boolean r0 = r1 instanceof X.C31581oW
            if (r0 == 0) goto L_0x13c6
            X.1oW r1 = (X.C31581oW) r1
            java.util.Set r0 = r1.A03
        L_0x139d:
            if (r0 == 0) goto L_0x0049
            java.util.Iterator r3 = r0.iterator()
        L_0x13a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0049
            X.2mC r2 = X.AnonymousClass0x7.A0O(r3)
            com.whatsapp.jid.GroupJid r1 = r2.A02
            java.lang.String r0 = r1.getRawString()
            r5.A0D(r0)
            java.lang.String r0 = r6.A0D(r1)
            if (r0 != 0) goto L_0x13c2
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x13c2
            java.lang.String r0 = ""
        L_0x13c2:
            r5.A0D(r0)
            goto L_0x13a3
        L_0x13c6:
            boolean r0 = r1 instanceof X.C31831ov
            if (r0 == 0) goto L_0x1411
            X.1p0 r1 = (X.C31881p0) r1
            java.util.List r0 = r1.A00
            java.util.ArrayList r7 = X.C18300x5.A0t(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x13d6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x13ec
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.2lq r0 = (X.C52662lq) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x13d6
            r7.add(r2)
            goto L_0x13d6
        L_0x13ec:
            java.util.ArrayList r3 = X.C73783g4.A0c(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x13f4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x140c
            java.lang.Object r0 = r2.next()
            X.2lq r0 = (X.C52662lq) r0
            com.whatsapp.jid.GroupJid r1 = r0.A01
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x1408
            java.lang.String r0 = ""
        L_0x1408:
            X.C52882mC.A00(r1, r0, r3)
            goto L_0x13f4
        L_0x140c:
            java.util.HashSet r0 = X.C73723fy.A0B(r3)
            goto L_0x139d
        L_0x1411:
            boolean r0 = r1 instanceof X.C31841ow
            if (r0 == 0) goto L_0x0049
            X.1ow r1 = (X.C31841ow) r1
            java.util.HashSet r0 = r1.A20()
            goto L_0x139d
        L_0x141c:
            boolean r0 = r2 instanceof X.AnonymousClass1O7
            if (r0 == 0) goto L_0x1424
            java.lang.String r6 = "FMessageSystemSubgroupLinkInParent"
            goto L_0x1386
        L_0x1424:
            boolean r0 = r2 instanceof X.AnonymousClass1O5
            if (r0 == 0) goto L_0x142c
            java.lang.String r6 = "ACTION_SYSTEM_SIBLING_UNLINK_IN_CAG"
            goto L_0x1386
        L_0x142c:
            boolean r0 = r2 instanceof X.AnonymousClass1O4
            if (r0 == 0) goto L_0x1434
            java.lang.String r6 = "ACTION_SYSTEM_SIBLING_LINK_IN_CAG"
            goto L_0x1386
        L_0x1434:
            boolean r0 = r2 instanceof X.AnonymousClass1O1
            if (r0 == 0) goto L_0x143c
            java.lang.String r6 = "ACTION_SYSTEM_SUBGROUP_UNLINK"
            goto L_0x1386
        L_0x143c:
            boolean r0 = r2 instanceof X.AnonymousClass1O0
            if (r0 == 0) goto L_0x1444
            java.lang.String r6 = "ACTION_SYSTEM_SUBGROUP_LINK"
            goto L_0x1386
        L_0x1444:
            boolean r0 = r2 instanceof X.AnonymousClass1Nz
            if (r0 == 0) goto L_0x144c
            java.lang.String r6 = "ACTION_SYSTEM_SIBLING_UNLINK"
            goto L_0x1386
        L_0x144c:
            java.lang.String r6 = "ACTION_SYSTEM_SIBLING_LINK"
            goto L_0x1386
        L_0x1450:
            X.23Q r0 = X.AnonymousClass23Q.A1O
            goto L_0x137b
        L_0x1454:
            X.23Q r0 = X.AnonymousClass23Q.A1P
            goto L_0x137b
        L_0x1458:
            X.23Q r0 = X.AnonymousClass23Q.A1X
            goto L_0x137b
        L_0x145c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r1)
            throw r0
        L_0x1461:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r1)
            throw r0
        L_0x1466:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r1)
            throw r0
        L_0x146b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r1)
            throw r0
        L_0x1470:
            java.lang.String r0 = "Invalid System Action"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1477:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupMembershipJoinApprovalModeWebQuery/onCreateWebInfoBuilder Cannot parse msg action "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x1482:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupMemberAddModeWebQuery/onCreateWebInfoBuilder Cannot parse msg action "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x148d:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1494:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x149b:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14a2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid system action: "
            r1.append(r0)
            if (r6 == 0) goto L_0x14b3
            int r0 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x14b3:
            java.lang.String r0 = X.AnonymousClass000.A0R(r3, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14bc:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14c3:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14ca:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14d1:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid system action. Found: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " Wanted: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x14eb:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x14f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r3)
            throw r0
        L_0x14f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r3)
            throw r0
        L_0x14fc:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30681mq.A0D():X.1A3");
    }

    public static C28011fL A01(C55682qk r0, Jid jid, Class cls, String str) {
        return (C28011fL) A00(r0, jid, cls, str);
    }

    public static void A04(C28011fL r0, UserJid userJid, AnonymousClass1A1 r2, AnonymousClass1A3 r3, C54192oK r4) {
        A03(r0, userJid, r2, r3);
        A07(r3, r4.A0C);
    }

    public static void A06(AnonymousClass1A3 r0, AnonymousClass23Q r1, C624134x r2, C54192oK r3) {
        r0.A0C(r1);
        r3.A06 = r2.A0n();
    }

    public static void A07(AnonymousClass1A3 r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m != null) {
                r2.A0D(A0m);
            }
        }
    }
}
