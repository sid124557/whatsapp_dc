package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: X.3Lr  reason: invalid class name and case insensitive filesystem */
public class C66503Lr implements AnonymousClass485 {
    public static final AnonymousClass39V[] A0H = new AnonymousClass39V[0];
    public final C55682qk A00;
    public final C46342bT A01;
    public final C56612sH A02;
    public final C56662sM A03;
    public final AnonymousClass1VX A04;
    public final C54932pW A05;
    public final AnonymousClass31C A06;
    public final C45602aH A07;
    public final AnonymousClass4FS A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;
    public final C183538qC A0E;
    public final Map A0F = AnonymousClass001.A0t();
    public final Set A0G = C18320x8.A0u();

    public Future A06(C83874Ad r16, AnonymousClass4B6 r17, String str) {
        AnonymousClass31C r8 = this.A06;
        String A032 = r8.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean A0F2 = AnonymousClass39V.A0F("code", str, r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("invite", r2);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, A0F2 ? 1 : 0);
        AnonymousClass39V.A0A("xmlns", "w:g2", A0H2);
        AnonymousClass36K A0C2 = AnonymousClass36K.A0C(C28041fO.A00, A0I, A0H2);
        C130066bK r3 = new C130066bK();
        r8.A0D(new AnonymousClass4KY((Object) r3, (Object) this, (Object) r16, (Object) r17, 3), A0C2, A032, C627136h.A03, 32000);
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r6.A00.A0A("GroupLidInfra/addressing_mode_mismatch", false, X.AnonymousClass000.A0Y(" - ", X.AnonymousClass000.A0l(r8), r9));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C27991fJ r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r0 = 5
            if (r0 == r9) goto L_0x0006
            r0 = 6
            if (r0 != r9) goto L_0x003c
        L_0x0006:
            java.util.Set r5 = r6.A0G
            monitor-enter(r5)
            boolean r0 = r5.contains(r7)     // Catch:{ all -> 0x0028 }
            r4 = 0
            if (r0 == 0) goto L_0x0023
            X.2qk r3 = r6.A00     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "GroupLidInfra/one_in_flight_group_info_mismatch"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = " - "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)     // Catch:{ all -> 0x0028 }
            r3.A0A(r2, r4, r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            return
        L_0x0023:
            r5.add(r7)     // Catch:{ all -> 0x0028 }
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2qk r3 = r6.A00
            java.lang.String r2 = "GroupLidInfra/addressing_mode_mismatch"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)
            java.lang.String r0 = " - "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)
            r3.A0A(r2, r4, r0)
        L_0x003c:
            X.334 r0 = new X.334
            r0.<init>((java.lang.String) r8, (int) r9)
            r6.A08(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66503Lr.A0E(X.1fJ, java.lang.String, int):void");
    }

    public static C66493Lq A00(C66503Lr r0) {
        return (C66493Lq) r0.A09.get();
    }

    public Future A02(AnonymousClass4EP r18, AnonymousClass2QT r19) {
        AnonymousClass31C r10 = this.A06;
        String A032 = r10.A03();
        AnonymousClass39V[] r3 = new AnonymousClass39V[3];
        AnonymousClass2QT r7 = r19;
        boolean A0F2 = AnonymousClass39V.A0F("code", r7.A03, r3);
        boolean A0G2 = AnonymousClass39V.A0G("expiration", Long.toString(r7.A00), r3);
        r3[2] = new AnonymousClass39V((Jid) r7.A02, "admin");
        AnonymousClass36K A0F3 = AnonymousClass36K.A0F(AnonymousClass36K.A0I("add_request", r3), "query", (AnonymousClass39V[]) null);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, A0F2 ? 1 : 0);
        AnonymousClass39V.A0C("xmlns", "w:g2", A0H2, A0G2 ? 1 : 0, 2);
        AnonymousClass39V.A02(r7.A01, "to", A0H2, 3);
        AnonymousClass36K A0G3 = AnonymousClass36K.A0G(A0F3, A0H2);
        C130066bK r0 = new C130066bK();
        r10.A0D(new AnonymousClass4KX(r0, this, r18, 3), A0G3, A032, 208, 32000);
        return r0;
    }

    public Future A03(AnonymousClass4EP r12, String str) {
        AnonymousClass31C r4 = this.A06;
        String A032 = r4.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean A0F2 = AnonymousClass39V.A0F("code", str, r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("invite", r2);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, A0F2 ? 1 : 0);
        AnonymousClass39V.A09("xmlns", "w:g2", A0H2);
        AnonymousClass36K A0C2 = AnonymousClass36K.A0C(C28041fO.A00, A0I, A0H2);
        C130066bK r1 = new C130066bK();
        r4.A0D(new AnonymousClass4KX(r1, this, r12, 2), A0C2, A032, 107, 32000);
        return r1;
    }

    public Future A04(C40582Gy r22, C27991fJ r23, List list) {
        AnonymousClass36K[] r5;
        AnonymousClass31C r14 = this.A06;
        String A032 = r14.A03();
        List list2 = list;
        if (list2.size() > 0) {
            int size = list2.size();
            r5 = new AnonymousClass36K[size];
            for (int i = 0; i < size; i++) {
                AnonymousClass39V[] r1 = new AnonymousClass39V[1];
                AnonymousClass39V.A02((Jid) list2.get(i), "jid", r1, 0);
                AnonymousClass36K.A0U("participant", r1, r5, i);
            }
        } else {
            r5 = null;
        }
        AnonymousClass36K A0J = AnonymousClass36K.A0J("revoke", (AnonymousClass39V[]) null, r5);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, 0);
        AnonymousClass39V.A0A("xmlns", "w:g2", A0H2);
        C27991fJ r12 = r23;
        AnonymousClass36K A0C2 = AnonymousClass36K.A0C(r12, A0J, A0H2);
        C130066bK r9 = new C130066bK();
        r14.A0D(new AnonymousClass4KY((Object) r9, (Object) this, (Object) r22, (Object) r12, 0), A0C2, A032, 210, 32000);
        return r9;
    }

    public Future A05(C83874Ad r23, AnonymousClass4B6 r24, AnonymousClass2QT r25) {
        AnonymousClass2QT r4 = r25;
        C27991fJ r15 = r4.A01;
        AnonymousClass31C r3 = this.A06;
        String A032 = r3.A03();
        C130066bK r12 = new C130066bK();
        C35381wm A002 = C35381wm.A00(r15, A032);
        String str = r4.A03;
        long j = r4.A00;
        Long valueOf = Long.valueOf(j);
        UserJid userJid = r4.A02;
        C56052rL A012 = C56052rL.A01();
        C56052rL A042 = C56052rL.A04("accept");
        if (C626836d.A0M(str, 16, 16, false)) {
            C56052rL.A0D(A042, "code", str);
        }
        if (C626836d.A0K(valueOf, false)) {
            C56052rL.A0C(A042, "expiration", j);
        }
        if (C626836d.A0L(userJid, "accept->admin")) {
            C56052rL.A06(userJid, A042, "admin");
        }
        r3.A0D(new AnonymousClass4KO(r12, this, r23, r15, r24, 0), C41032Ir.A03(A042, A012, A002), A032, 209, 32000);
        return r12;
    }

    public void A08(AnonymousClass334 r18, C27991fJ r19) {
        AnonymousClass39V[] r1;
        C27991fJ r5 = r19;
        if (!this.A07.A00.A02(r5)) {
            Log.w("GroupXmppMethods/skip sendGetGroupInfo");
            return;
        }
        AnonymousClass334 r6 = r18;
        String str = r6.A01;
        String str2 = "GroupXmppMethods/sendGetGroupInfo";
        if (str != null) {
            str2 = AnonymousClass0x2.A0e(str, AnonymousClass000.A0l(str2), '/');
        }
        Log.w(str2);
        AnonymousClass31C r10 = this.A06;
        String A032 = r10.A03();
        AnonymousClass0x2.A1K(r5, this.A0F, this.A02.A0H());
        String str3 = r6.A02;
        if (str == null) {
            r1 = null;
        } else if (str3 != null) {
            r1 = new AnonymousClass39V[2];
            AnonymousClass39V.A0B("request", str, r1, 0);
            AnonymousClass39V.A0B("phash", str3, r1, 1);
        } else {
            r1 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B("request", str, r1, 0);
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("query", r1);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, 0);
        AnonymousClass39V.A0C("xmlns", "w:g2", A0H2, 1, 2);
        r10.A0K(new AnonymousClass4KX(r5, this, r6, 7), AnonymousClass36K.A0C(r5, A0I, A0H2), A032, 20, 32000);
    }

    public void A09(AnonymousClass1FE r15) {
        Log.i("GroupXmppMethod/sendLeaveGroup");
        AnonymousClass31C r7 = this.A06;
        String A032 = r7.A03();
        C27991fJ r2 = r15.A03;
        AnonymousClass36K[] r3 = new AnonymousClass36K[1];
        AnonymousClass36K.A0U("group", new AnonymousClass39V[]{new AnonymousClass39V((Jid) r2, (String) PublicKeyCredentialControllerUtility.JSON_KEY_ID)}, r3, 0);
        AnonymousClass36K A0J = AnonymousClass36K.A0J("leave", (AnonymousClass39V[]) null, r3);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 0);
        AnonymousClass39V.A0A("xmlns", "w:g2", A1W);
        if (r7.A0K(new C68303Sq(this, r15, r15, r15.A06), AnonymousClass36K.A0C(C28041fO.A00, A0J, A1W), A032, 16, 32000)) {
            this.A01.A00(r2, 5);
            this.A08.BkM(new C70103Zx(this, 28, r15));
        }
    }

    public void A0A(AnonymousClass1FE r12) {
        AnonymousClass31C r4 = this.A06;
        String A032 = r4.A03();
        AnonymousClass36K r3 = new AnonymousClass36K("subject", r12.A04, (AnonymousClass39V[]) null);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A05("xmlns", "w:g2", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W);
        AnonymousClass36K A0C2 = AnonymousClass36K.A0C(r12.A03, r3, A1W);
        AnonymousClass4KX r5 = new AnonymousClass4KX(r12, this, r12, 6);
        Log.i("GroupXmppMethods/sendSetGroupSubject");
        r4.A0K(r5, A0C2, A032, 17, 32000);
    }

    public void A0C(C84604Cz r18, AnonymousClass2QT r19) {
        AnonymousClass31C r10 = this.A06;
        String A032 = r10.A03();
        AnonymousClass39V[] r3 = new AnonymousClass39V[3];
        AnonymousClass2QT r5 = r19;
        boolean A0F2 = AnonymousClass39V.A0F("code", r5.A03, r3);
        boolean A0G2 = AnonymousClass39V.A0G("expiration", Long.toString(r5.A00), r3);
        r3[2] = new AnonymousClass39V((Jid) r5.A02, "admin");
        AnonymousClass36K A0F3 = AnonymousClass36K.A0F(AnonymousClass36K.A0I("add_request", r3), "picture", (AnonymousClass39V[]) null);
        AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, A0F2 ? 1 : 0);
        AnonymousClass39V.A0B("xmlns", "w:profile:picture", A0H2, A0G2 ? 1 : 0);
        AnonymousClass39V.A02(r5.A01, "to", A0H2, 2);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0H2, 3);
        r10.A0D(new AnonymousClass4KX(r5, this, r18, 4), AnonymousClass36K.A0G(A0F3, A0H2), A032, 212, 32000);
    }

    public final void A0D(C27991fJ r12, AnonymousClass4B6 r13, Runnable runnable, String str, AnonymousClass39V[] r16, int i) {
        AnonymousClass31C r4 = this.A06;
        String A032 = r4.A03();
        AnonymousClass36K A0I = AnonymousClass36K.A0I(str, r16);
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A0s);
        AnonymousClass39V.A03("xmlns", "w:g2", A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A0s);
        AnonymousClass39V.A01(r12, "to", A0s);
        r4.A0K(new C68293Sp(this, r13, runnable, str), AnonymousClass36K.A0G(A0I, (AnonymousClass39V[]) A0s.toArray(A0H)), A032, i, 32000);
    }

    public C66503Lr(C55682qk r2, C46342bT r3, C56612sH r4, C56662sM r5, AnonymousClass1VX r6, C54932pW r7, AnonymousClass31C r8, C45602aH r9, AnonymousClass4FS r10, C183538qC r11, C183538qC r12, C183538qC r13, C183538qC r14, C183538qC r15, C183538qC r16) {
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A08 = r10;
        this.A06 = r8;
        this.A05 = r7;
        this.A0A = r11;
        this.A03 = r5;
        this.A01 = r3;
        this.A07 = r9;
        this.A09 = r12;
        this.A0D = r13;
        this.A0C = r14;
        this.A0B = r15;
        this.A0E = r16;
    }

    public static final AnonymousClass36K A01(String str, List list) {
        int size = list.size();
        AnonymousClass36K[] r5 = new AnonymousClass36K[size];
        for (int i = 0; i < size; i++) {
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            AnonymousClass39V.A02((Jid) list.get(i), "jid", A1V, 0);
            AnonymousClass36K.A0U("participant", A1V, r5, i);
        }
        return AnonymousClass36K.A0J(str, (AnonymousClass39V[]) null, r5);
    }

    public final void A07(AnonymousClass4GN r25, C27991fJ r26, AnonymousClass4EZ r27, String str, List list, int i, boolean z) {
        Jid jid;
        Jid jid2;
        String str2 = str;
        C18260x0.A0s("GroupXmppMethods/", str2, AnonymousClass001.A0o());
        AnonymousClass4EZ r15 = r27;
        if (r27 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupXmppMethods/before/send/");
            A0o.append(str2);
            A0o.append("; groupId=");
            C27991fJ r10 = r26;
            A0o.append(r10);
            List list2 = list;
            C18260x0.A1P(A0o, "; participants=", list2);
            AnonymousClass31C r17 = this.A06;
            String A032 = r17.A03();
            int size = list2.size();
            AnonymousClass36K[] r11 = new AnonymousClass36K[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList A0s = AnonymousClass001.A0s();
                Jid jid3 = (Jid) list2.get(i3);
                if (((C56892sj) this.A0B.get()).A0B(r10)) {
                    AnonymousClass4GN r0 = r25;
                    if (C627336j.A0L(jid3)) {
                        jid2 = (Jid) r0.inverse().get(jid3);
                        jid = jid3;
                    } else {
                        jid = (Jid) r0.get(jid3);
                        jid2 = jid3;
                    }
                    if (jid == null || jid2 == null) {
                        i2++;
                    } else {
                        AnonymousClass39V.A01(jid2, "phone_number", A0s);
                        jid3 = jid;
                    }
                }
                A0s.add(0, new AnonymousClass39V(jid3, "jid"));
                AnonymousClass36K.A0U("participant", C18300x5.A1Z(A0s, A0s.size()), r11, i3);
            }
            if (i2 > 0) {
                C55682qk r2 = this.A00;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Added ");
                A0o2.append(size);
                A0o2.append(" participants and ");
                A0o2.append(i2);
                r2.A0A("GroupLidInfra/add_participant_normalization", false, AnonymousClass000.A0X(" mapping missing", A0o2));
            }
            AnonymousClass36K A0J = AnonymousClass36K.A0J(str2, (AnonymousClass39V[]) null, r11);
            AnonymousClass39V[] A0H2 = AnonymousClass39V.A0H(A032, 0);
            AnonymousClass39V.A05("xmlns", "w:g2", A0H2);
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A0H2);
            A0H2[3] = new AnonymousClass39V((Jid) r10, "to");
            if (z) {
                A0J = AnonymousClass36K.A0F(A0J, "admin", (AnonymousClass39V[]) null);
            }
            AnonymousClass36K A0G2 = AnonymousClass36K.A0G(A0J, A0H2);
            r17.A0K(new AnonymousClass4KZ(this, r15, str2, 0), A0G2, A032, i, 32000);
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass001.A1K("GroupXmppMethods/send/", str2, "; groupId=", A0o3);
            A0o3.append(r10);
            C18260x0.A1P(A0o3, "; participants=", list2);
        }
    }

    public void A0B(AnonymousClass1FE r8, C27991fJ r9, int i) {
        String str;
        AnonymousClass39V[] r5;
        C18260x0.A0w("GroupXmppMethods/before/set-ephemeral-setting; ephemeralDuration=", AnonymousClass001.A0o(), i);
        if (i > 0) {
            r5 = AnonymousClass0x9.A1V();
            r5[0] = new AnonymousClass39V("expiration", i);
            str = "ephemeral";
        } else {
            str = "not_ephemeral";
            r5 = null;
        }
        A0D(r9, r8, r8, str, r5, 224);
        C18260x0.A0y("GroupXmppMethods/set-ephemeral-setting; ephemeralDuration=", AnonymousClass001.A0o(), i);
    }
}
