package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3TR  reason: invalid class name */
public final class AnonymousClass3TR implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final C66493Lq A04;
    public final AnonymousClass4EO A05;
    public final AnonymousClass2U1 A06;
    public final AnonymousClass31C A07;
    public final String A08;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r2.A0Y(X.C58422vE.A02, 982) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r2.A0Y(X.C58422vE.A02, 5385) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r10.A09 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
        if (r6.isEmpty() != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        if (r2.A0Y(X.C58422vE.A02, 3011) == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r2.A0Y(X.C58422vE.A02, 982) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r23 = this;
            r4 = r23
            X.31C r0 = r4.A07
            r22 = r0
            java.lang.String r21 = r22.A03()
            X.2U1 r10 = r4.A06
            java.lang.String r9 = r10.A04
            java.util.List r6 = r10.A05
            int r5 = r10.A00
            boolean r14 = r10.A0B
            com.whatsapp.jid.GroupJid r11 = r10.A01
            java.lang.String r15 = r10.A03
            X.1VX r2 = r4.A03
            X.2vE r1 = X.C58422vE.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = r2.A0Y(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002b
            boolean r0 = r10.A09
            r20 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r20 = 0
        L_0x002d:
            boolean r13 = X.AnonymousClass001.A1W(r5)
            if (r11 == 0) goto L_0x003f
            r3 = 982(0x3d6, float:1.376E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r3)
            r19 = 1
            if (r0 != 0) goto L_0x0041
        L_0x003f:
            r19 = 0
        L_0x0041:
            if (r14 == 0) goto L_0x004f
            r3 = 982(0x3d6, float:1.376E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r3)
            r18 = 1
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            r18 = 0
        L_0x0051:
            if (r20 != 0) goto L_0x0055
            if (r14 == 0) goto L_0x0067
        L_0x0055:
            r3 = 982(0x3d6, float:1.376E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r3)
            if (r0 == 0) goto L_0x0067
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r17 = 1
            if (r0 == 0) goto L_0x0069
        L_0x0067:
            r17 = 0
        L_0x0069:
            if (r14 == 0) goto L_0x0077
            r3 = 5385(0x1509, float:7.546E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r3)
            r16 = 1
            if (r0 != 0) goto L_0x0079
        L_0x0077:
            r16 = 0
        L_0x0079:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.lang.String r8 = "jid"
            if (r6 == 0) goto L_0x00a8
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x00a8
            r12 = 0
        L_0x0088:
            int r0 = r6.size()
            if (r12 >= r0) goto L_0x00a8
            java.lang.Object r0 = r6.get(r12)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.39V[] r7 = new X.AnonymousClass39V[r1]
            X.39V r1 = new X.39V
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r8)
            r0 = 0
            r7[r0] = r1
            java.lang.String r0 = "participant"
            X.AnonymousClass36K.A0R(r0, r3, r7)
            int r12 = r12 + 1
            r1 = 1
            goto L_0x0088
        L_0x00a8:
            if (r13 == 0) goto L_0x0213
            X.39V[] r7 = new X.AnonymousClass39V[r1]
            java.lang.String r1 = "expiration"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r5 = X.AnonymousClass39V.A0F(r1, r0, r7)
            java.lang.String r0 = "ephemeral"
            X.AnonymousClass36K.A0R(r0, r3, r7)
        L_0x00bb:
            if (r19 == 0) goto L_0x00c9
            X.39V[] r1 = X.AnonymousClass0x9.A1V()
            X.AnonymousClass39V.A02(r11, r8, r1, r5)
            java.lang.String r0 = "linked_parent"
            X.AnonymousClass36K.A0R(r0, r3, r1)
        L_0x00c9:
            r8 = 0
            if (r18 == 0) goto L_0x0106
            r0 = 2447(0x98f, float:3.429E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0210
            X.39V[] r7 = X.AnonymousClass0x9.A1V()
            java.lang.String r1 = "default_membership_approval_mode"
            java.lang.String r0 = "request_required"
            X.AnonymousClass39V.A04(r1, r0, r7)
        L_0x00e2:
            java.lang.String r0 = "parent"
            X.AnonymousClass36K.A0R(r0, r3, r7)
            r0 = 3829(0xef5, float:5.366E-42)
            boolean r0 = r2.A0Y(r5, r0)
            if (r0 == 0) goto L_0x00fd
            r0 = 4530(0x11b2, float:6.348E-42)
            boolean r0 = r2.A0Y(r5, r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            X.AnonymousClass36K.A0R(r0, r3, r8)
        L_0x00fd:
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "create_general_chat"
            X.AnonymousClass36K.A0R(r0, r3, r8)
        L_0x0106:
            java.lang.String r12 = "membership_approval_mode"
            java.lang.String r13 = "off"
            java.lang.String r11 = "state"
            java.lang.String r7 = "group_join"
            if (r20 == 0) goto L_0x0125
            java.lang.String r0 = "breakout"
            X.AnonymousClass36K.A0R(r0, r3, r8)
            X.39V[] r0 = X.AnonymousClass0x9.A1V()
            X.AnonymousClass39V.A04(r11, r13, r0)
            X.36K r0 = X.AnonymousClass36K.A0I(r7, r0)
            X.AnonymousClass36K.A0O(r0, r12, r3, r8)
        L_0x0125:
            if (r17 == 0) goto L_0x0144
            X.2sH r1 = r4.A02
            X.2sr r0 = r4.A01
            java.lang.String r1 = X.AnonymousClass35J.A02(r0, r1)
            X.39V[] r5 = X.AnonymousClass0x9.A1V()
            java.lang.String r0 = "id"
            X.AnonymousClass39V.A04(r0, r1, r5)
            java.lang.String r0 = "body"
            X.36K r1 = new X.36K
            r1.<init>((java.lang.String) r0, (java.lang.String) r15, (X.AnonymousClass39V[]) r8)
            java.lang.String r0 = "description"
            X.AnonymousClass36K.A0O(r1, r0, r3, r5)
        L_0x0144:
            java.lang.String r5 = "all_member_add"
            java.lang.String r1 = "member_add_mode"
            if (r14 != 0) goto L_0x0209
            if (r20 != 0) goto L_0x0209
            if (r19 != 0) goto L_0x0209
            boolean r0 = r10.A06
            if (r0 != 0) goto L_0x0154
            java.lang.String r5 = "admin_add"
        L_0x0154:
            X.AnonymousClass36K.A0P(r1, r5, r3)
            X.39V[] r1 = X.AnonymousClass0x9.A1V()
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x0162
            java.lang.String r13 = "on"
        L_0x0162:
            X.AnonymousClass39V.A04(r11, r13, r1)
            X.36K r0 = X.AnonymousClass36K.A0I(r7, r1)
            X.AnonymousClass36K.A0O(r0, r12, r3, r8)
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x0175
            java.lang.String r0 = "announcement"
            X.AnonymousClass36K.A0R(r0, r3, r8)
        L_0x0175:
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = "locked"
            X.AnonymousClass36K.A0R(r0, r3, r8)
        L_0x017e:
            if (r18 == 0) goto L_0x0187
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0188
        L_0x0187:
            r1 = 1
        L_0x0188:
            java.lang.String r0 = "CreateGroupApiHandler/getNodeChildren request cannot have both <parent/> and <participant/> tags."
            X.C626936e.A0D(r1, r0)
            int r0 = r3.size()
            if (r0 == 0) goto L_0x0198
            r0 = 0
            X.36K[] r8 = X.C18280x3.A1a(r3, r0)
        L_0x0198:
            java.lang.String r10 = r4.A08
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x01b1
            r1 = 3011(0xbc3, float:4.22E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r5 = 1
            if (r0 != 0) goto L_0x01b2
        L_0x01b1:
            r5 = 0
        L_0x01b2:
            r3 = r5 ^ 1
            r0 = r11 ^ 1
            int r3 = r3 + r0
            X.39V[] r2 = new X.AnonymousClass39V[r3]
            java.lang.String r1 = "key"
            if (r5 == 0) goto L_0x01fd
            if (r11 != 0) goto L_0x01c2
            X.AnonymousClass39V.A0B(r1, r10, r2, r6)
        L_0x01c2:
            r1 = 0
            java.lang.String r0 = "create"
            if (r8 != 0) goto L_0x01f5
            if (r3 > 0) goto L_0x01ca
            r2 = r1
        L_0x01ca:
            X.36K r3 = X.AnonymousClass36K.A0I(r0, r2)
        L_0x01ce:
            X.39V[] r2 = X.AnonymousClass0x9.A1W()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.AnonymousClass39V.A0B(r1, r0, r2, r6)
            java.lang.String r1 = "id"
            r0 = r21
            X.AnonymousClass39V.A0A(r1, r0, r2)
            X.1fO r0 = X.C28041fO.A00
            X.36K r3 = X.AnonymousClass36K.A0C(r0, r3, r2)
            r5 = 14
            r6 = 20000(0x4e20, double:9.8813E-320)
            r1 = r22
            r2 = r4
            r4 = r21
            r1.A0K(r2, r3, r4, r5, r6)
            return
        L_0x01f5:
            if (r3 > 0) goto L_0x01f8
            r2 = r1
        L_0x01f8:
            X.36K r3 = X.AnonymousClass36K.A0J(r0, r2, r8)
            goto L_0x01ce
        L_0x01fd:
            java.lang.String r0 = "subject"
            X.AnonymousClass39V.A0B(r0, r9, r2, r6)
            if (r11 != 0) goto L_0x01c2
            X.AnonymousClass39V.A0B(r1, r10, r2, r7)
            goto L_0x01c2
        L_0x0209:
            if (r16 == 0) goto L_0x017e
            X.AnonymousClass36K.A0P(r1, r5, r3)
            goto L_0x017e
        L_0x0210:
            r7 = r8
            goto L_0x00e2
        L_0x0213:
            r5 = 0
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TR.A00():void");
    }

    public void BQs(String str) {
        this.A05.Be8();
    }

    public AnonymousClass3TR(C55682qk r2, C56972sr r3, C56612sH r4, AnonymousClass1VX r5, C66493Lq r6, AnonymousClass4EO r7, AnonymousClass2U1 r8, AnonymousClass31C r9) {
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r8.A02.getRawString();
        this.A06 = r8;
    }

    public void BSN(AnonymousClass36K r4, String str) {
        Pair A022 = C57492tj.A02(r4);
        if (A022 != null) {
            int A032 = C18280x3.A03(A022);
            String str2 = (String) A022.second;
            if (A032 == 500 && str2 != null && str2.equals("internal-server-error")) {
                A032 = -500;
            }
            this.A05.onError(A032);
        }
    }

    public void BdM(AnonymousClass36K r9, String str) {
        AnonymousClass36K A0j = r9.A0j();
        AnonymousClass36K.A0N(A0j, "group");
        try {
            C27991fJ A082 = AnonymousClass36K.A08(A0j);
            Class<UserJid> cls = UserJid.class;
            A0j.A0g(cls, "creator");
            C615531h.A04(A0j.A0r("creation", (String) null), 0);
            A0j.A0r("subject", (String) null);
            C615531h.A04(A0j.A0r("s_t", (String) null), 0);
            A0j.A0g(cls, "s_o");
            A0j.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            AnonymousClass2RJ r3 = new AnonymousClass2RJ(A082);
            AnonymousClass31X.A00(this.A03, r3, r9, "group");
            Log.i("groupmgr/onGroupCreated/");
            r3.A04.keySet();
            Map map = r3.A02;
            if (!map.isEmpty()) {
                C18290x4.A1C(C66493Lq.A1H, map, 3001);
            }
            this.A05.BdP(r3, A082);
        } catch (AnonymousClass24P unused) {
            this.A05.onError(800);
        }
    }
}
