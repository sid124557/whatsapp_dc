package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.36J  reason: invalid class name */
public final class AnonymousClass36J {
    public static final AnonymousClass36J A00 = new AnonymousClass36J();

    public static final int A00(AnonymousClass36K r4) {
        try {
            AnonymousClass36K A0l = r4.A0l("ephemeral");
            if (A0l != null) {
                return A0l.A0b("expiration", 0);
            }
        } catch (Exception e) {
            Log.e(AnonymousClass000.A0a("GroupProtocolTreeNodeHelper/getEphemeralDuration ", AnonymousClass001.A0o(), e), e);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r5 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r3 == null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60912zN A05(X.AnonymousClass36K r7, X.AnonymousClass36K r8) {
        /*
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.lang.String r0 = "description"
            X.36K r4 = r7.A0l(r0)
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = "body"
            X.36K r3 = r4.A0l(r0)
            java.lang.String r0 = "delete"
            X.36K r2 = r4.A0l(r0)
            if (r3 == 0) goto L_0x0052
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Node: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " contains both a body and delete child: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x003b:
            if (r3 != 0) goto L_0x0043
        L_0x003d:
            X.2zN r0 = X.C60912zN.A05
            X.C162457s7.A0F(r0)
            return r0
        L_0x0043:
            java.lang.String r0 = r3.A0n()
            if (r0 == 0) goto L_0x0095
            java.lang.String r5 = r3.A0n()
            if (r5 == 0) goto L_0x0050
            goto L_0x005f
        L_0x0050:
            r4 = 0
            goto L_0x006b
        L_0x0052:
            X.39V[] r0 = r4.A0u()
            if (r0 == 0) goto L_0x003b
            int r0 = r0.length
            if (r0 == 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
            java.lang.String r5 = ""
        L_0x005f:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "id"
            java.lang.String r4 = X.AnonymousClass36K.A0L(r4, r0)
        L_0x006b:
            X.C626936e.A06(r8)
            java.lang.String r0 = "t"
            long r6 = X.AnonymousClass36K.A05(r8, r0)
            X.C626936e.A06(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "participant"
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass36K.A0A(r8, r1, r0)
            X.C626936e.A06(r8)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r2 = r8.A0g(r1, r0)
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
            X.2zN r1 = new X.2zN
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0095:
            java.lang.String r0 = "Non-empty description tag with no body"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36J.A05(X.36K, X.36K):X.2zN");
    }

    public static final boolean A08(AnonymousClass36K r4) {
        AnonymousClass36K A0l;
        AnonymousClass36K A0l2 = r4.A0l("membership_approval_mode");
        if (A0l2 == null || (A0l = A0l2.A0l("group_join")) == null) {
            return false;
        }
        return "on".equals(A0l.A0r("state", ""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.A0l("parent");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.AnonymousClass36K r5) {
        /*
            r4 = this;
            r3 = 0
            int r0 = A02(r5)
            r2 = 1
            if (r0 != r2) goto L_0x0021
            java.lang.String r0 = "parent"
            X.36K r1 = r5.A0l(r0)
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = "default_membership_approval_mode"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r0 = "request_required"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36J.A09(X.36K):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0085, code lost:
        if (r5.equals("false") == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60792zA A0A(X.AnonymousClass36K r45, X.AnonymousClass4GQ r46, X.AnonymousClass4GQ r47, int r48) {
        /*
            r44 = this;
            r1 = 1
            r0 = r45
            X.C162457s7.A0J(r0, r1)
            r1 = 0
            X.1fJ r6 = X.AnonymousClass36K.A08(r0)
            X.C162457s7.A0D(r6)
            java.lang.String r2 = "truncated"
            java.lang.String r2 = r0.A0r(r2, r1)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = "size"
            java.lang.String r1 = r0.A0r(r2, r1)
            r0 = 0
            int r0 = X.C615531h.A01(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2zA r0 = new X.2zA
            r0.<init>(r6, r1)
        L_0x0030:
            r1 = r46
            r1.invoke(r0)
            return r0
        L_0x0036:
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.UserJid r12 = X.AnonymousClass36K.A0A(r0, r7, r2)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r5 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r2 = "creator_pn"
            com.whatsapp.jid.Jid r10 = r0.A0g(r5, r2)
            com.whatsapp.jid.PhoneUserJid r10 = (com.whatsapp.jid.PhoneUserJid) r10
            java.lang.String r2 = "creation"
            java.lang.String r4 = r0.A0r(r2, r1)
            r2 = 0
            long r24 = X.C615531h.A04(r4, r2)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 * r8
            java.lang.String r4 = "subject"
            java.lang.String r16 = r0.A0r(r4, r1)
            java.lang.String r4 = "s_o"
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass36K.A0A(r0, r7, r4)
            java.lang.String r4 = "s_o_pn"
            com.whatsapp.jid.Jid r11 = r0.A0g(r5, r4)
            com.whatsapp.jid.PhoneUserJid r11 = (com.whatsapp.jid.PhoneUserJid) r11
            long r26 = X.C615531h.A02(r0)
            long r26 = r26 * r8
            java.lang.String r4 = "ack"
            java.lang.String r5 = r0.A0r(r4, r1)
            if (r5 == 0) goto L_0x0087
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)
            r39 = 0
            if (r4 != 0) goto L_0x0089
        L_0x0087:
            r39 = 1
        L_0x0089:
            java.lang.String r17 = X.AnonymousClass36K.A0K(r0)
            java.lang.String r4 = "locked"
            boolean r33 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "announcement"
            boolean r34 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "incognito"
            boolean r37 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r35 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "suspended"
            boolean r36 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "support"
            boolean r32 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "p_v_id"
            long r28 = r0.A0e(r4, r2)
            java.lang.String r4 = "a_v_id"
            long r30 = r0.A0e(r4, r2)
            java.lang.String r2 = "addressing_mode"
            java.lang.String r7 = r0.A0r(r2, r1)
            java.lang.String r2 = "allow_admin_reports"
            boolean r40 = X.AnonymousClass36K.A0V(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r41 = X.AnonymousClass36K.A0V(r0, r2)
            r2 = r48 & 1
            if (r2 == 0) goto L_0x0134
            r2 = r47
            java.util.Map r3 = A07(r0, r2)
            int r2 = X.C615531h.A00(r0, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00e5:
            X.2zN r14 = X.C60912zN.A05
            r4 = r48 & 2
            if (r4 == 0) goto L_0x00ef
            X.2zN r14 = A04(r0)
        L_0x00ef:
            int r20 = A00(r0)
            r5 = r44
            X.2fO r15 = r5.A0B(r0)
            java.lang.String r4 = "group_history"
            boolean r42 = X.AnonymousClass36K.A0V(r0, r4)
            java.lang.String r4 = "auto_add_disabled"
            boolean r43 = X.AnonymousClass36K.A0V(r0, r4)
            X.C162457s7.A0H(r14)
            r4 = 3
            X.334 r8 = new X.334
            r8.<init>((java.lang.String) r1, (int) r4)
            int r21 = A02(r0)
            X.1fJ r9 = A03(r0)
            boolean r38 = A08(r0)
            int r22 = r5.A09(r0)
            java.lang.String r18 = X.C381125t.A00(r7)
            int r23 = A01(r0)
            X.2ze r7 = new X.2ze
            r19 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.2zA r0 = new X.2zA
            r0.<init>(r7, r6, r2)
            goto L_0x0030
        L_0x0134:
            r2 = 0
            r3 = 0
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36J.A0A(X.36K, X.4GQ, X.4GQ, int):X.2zA");
    }

    public final C48742fO A0B(AnonymousClass36K r8) {
        if (A02(r8) == 1) {
            return null;
        }
        AnonymousClass36K A0l = r8.A0l("growth_locked");
        if (A0l == null) {
            return new C48742fO(0, 0);
        }
        String A0r = A0l.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
        if ("invite".equals(A0r)) {
            return new C48742fO(1, AnonymousClass36K.A04(A0l, "expiration"));
        }
        C18260x0.A0s("GroupProtocolTreeNodeHelper/getGrowthLock unexpected type: ", A0r, AnonymousClass001.A0o());
        return null;
    }

    public static final int A01(AnonymousClass36K r1) {
        AnonymousClass36K A0l = r1.A0l("member_add_mode");
        if (A0l != null) {
            return "all_member_add".equals(A0l.A0n()) ? 1 : 0;
        }
        return 0;
    }

    public static final int A02(AnonymousClass36K r5) {
        boolean A1W = AnonymousClass000.A1W(r5.A0l("default_sub_group"));
        boolean A0V = AnonymousClass36K.A0V(r5, "linked_parent");
        boolean A0V2 = AnonymousClass36K.A0V(r5, "parent");
        boolean A1W2 = AnonymousClass000.A1W(r5.A0l("general_chat"));
        if (A0V2) {
            return 1;
        }
        if (A1W) {
            return 3;
        }
        if (A1W2) {
            return 6;
        }
        if (A0V) {
            return 2;
        }
        return 0;
    }

    public static final C27991fJ A03(AnonymousClass36K r2) {
        AnonymousClass36K A0l = r2.A0l("linked_parent");
        if (A0l == null) {
            return null;
        }
        return (C27991fJ) A0l.A0g(C27991fJ.class, "jid");
    }

    public static C60912zN A04(AnonymousClass36K r1) {
        return A05(r1, r1.A0l("description"));
    }

    public static Map A06(AnonymousClass36K r2, Object obj) {
        return A07(r2, new C86364Jv(obj, 11));
    }

    public static final Map A07(AnonymousClass36K r7, AnonymousClass4GQ r8) {
        LinkedHashMap A0r = C18320x8.A0r();
        List A0s = r7.A0s("participant");
        C162457s7.A0D(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(it);
            Class<UserJid> cls = UserJid.class;
            UserJid A0A = AnonymousClass36K.A0A(A0Y, cls, "jid");
            if (A0A != null) {
                C46442bd r5 = new C46442bd();
                String A0r2 = A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                C626936e.A06(A0r2);
                r5.A00 = A0A;
                r5.A04 = A0r2;
                UserJid A0A2 = AnonymousClass36K.A0A(A0Y, cls, "lid");
                if (A0A2 != null) {
                    r5.A01 = A0A2;
                }
                String A0L = AnonymousClass36K.A0L(A0Y, "display_name");
                if (A0L != null && !C107575bX.A0F(A0L)) {
                    r5.A03 = A0L;
                }
                UserJid A0A3 = AnonymousClass36K.A0A(A0Y, cls, "phone_number");
                if (A0A3 != null) {
                    if (A0A instanceof PhoneUserJid) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("phone number attribute with pn jid. Mismatch: ");
                        r8.invoke(new C50952j2(C18300x5.A0m(A0o, !A0A.equals(A0A3))));
                    }
                    r5.A02 = A0A3;
                }
                A0r.put(A0A, r5.A00());
            }
        }
        return A0r;
    }
}
