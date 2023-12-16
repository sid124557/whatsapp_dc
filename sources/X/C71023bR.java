package X;

import java.security.PublicKey;
import java.util.HashMap;

/* renamed from: X.3bR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71023bR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0PJ A02;
    public final /* synthetic */ AnonymousClass4CV A03;
    public final /* synthetic */ C43842Tr A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        String str;
        String str2;
        C58752vl r12;
        C998758n r1;
        C69263Wi r3;
        int i;
        C43842Tr r11 = this.A04;
        int i2 = this.A00;
        String str3 = this.A05;
        String str4 = this.A06;
        AnonymousClass0PJ r9 = this.A02;
        String str5 = this.A07;
        int i3 = this.A01;
        String str6 = this.A08;
        AnonymousClass4CV r27 = this.A03;
        if (i2 == 0 || str3.length() == 0) {
            str = "";
        } else {
            PublicKey A052 = AnonymousClass341.A05(str3);
            C162457s7.A0D(A052);
            String A002 = AnonymousClass341.A00();
            C162457s7.A0D(A002);
            String valueOf = String.valueOf(C56612sH.A00(r11.A03));
            String A042 = r11.A06.A04(Integer.valueOf(i2), A002, valueOf, A052);
            C162457s7.A0D(A042);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("#PWD_WA:11:");
            A0o.append(valueOf);
            str = AnonymousClass0x2.A0e(A042, A0o, ':');
        }
        if (str4 == null || str4.length() == 0) {
            str2 = "";
        } else {
            str2 = C18290x4.A0t(AnonymousClass36G.A09(r11.A05.A00.A04().A00, AnonymousClass0x2.A1a(AnonymousClass000.A0V("1539", str4, AnonymousClass001.A0o()))));
            C162457s7.A0D(str2);
        }
        Object A0i = AnonymousClass001.A0i(r11.A0B, 551495536);
        if (A0i != null) {
            C111145hc r6 = (C111145hc) A0i;
            r6.A05("WFS_START");
            C56502s5 r5 = r11.A09;
            r5.A03("wfs", "login_wfs");
            C56912sl r32 = r11.A08;
            Object obj = r9.A00;
            C162457s7.A0C(obj);
            String str7 = (String) obj;
            Object obj2 = r9.A01;
            C162457s7.A0C(obj2);
            String str8 = (String) obj2;
            String str9 = "";
            String str10 = str9;
            if (str5 != null) {
                str9 = str5;
            }
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G("foa_authproof", str9);
            if (str4 != null) {
                str10 = str4;
            }
            AnonymousClass0PJ A0G2 = AnonymousClass0x9.A0G("wa_ac_ent_id", str10);
            AnonymousClass0PJ A0G3 = AnonymousClass0x9.A0G("wa_ac_ent_enc_pw", str);
            AnonymousClass0PJ A0G4 = AnonymousClass0x9.A0G("id_ac_sign", str2);
            if (!r32.A0F()) {
                r12 = new C58752vl(C998758n.FAIL_TO_INITIALIZE_WAMSYS);
            } else {
                r32.A0E(true);
                byte[] A0H = r32.A0H(str7, str8);
                byte[] A0G5 = r32.A0G("wfsAuth");
                HashMap A0t = AnonymousClass001.A0t();
                C18280x3.A1B(A0G.A00, (String) A0G.A01, A0t);
                C18280x3.A1B(A0G2.A00, (String) A0G2.A01, A0t);
                C18280x3.A1B(A0G3.A00, (String) A0G3.A01, A0t);
                AnonymousClass0PJ r122 = A0G4;
                C18280x3.A1B(r122.A00, (String) r122.A01, A0t);
                r12 = r32.A00;
                if (r12 == null) {
                    r12 = (C58752vl) C105935Wz.A00(new AnonymousClass56J(r32.A0N, r32.A0P, str7, str8, r32.A05(), A0t, A0H, A0G5));
                }
                r32.A00 = r12;
            }
            r6.A05("WFS_END");
            boolean z = false;
            if (r12 != null) {
                z = C18310x6.A1W(r12.A00);
            }
            if (z) {
                r6.A06("is_2fac", Boolean.FALSE);
                r5.A03("wfs", "successful");
                AnonymousClass33p r33 = r11.A04;
                C18270x1.A0h(C18270x1.A03(r33), "pref_wfs_source", i3);
                C18270x1.A0j(C18270x1.A03(r33), "pref_wfs_name", str6);
                C18270x1.A0j(C18270x1.A03(r33), "pref_wfs_user", str4);
                C18270x1.A0j(C18270x1.A03(r33), "pref_wfs_pw", str);
                C18270x1.A0j(C18270x1.A03(r33), "pref_wfs_id_sign", str2);
                r3 = r11.A00;
                i = 6;
            } else {
                if (r12 != null) {
                    r1 = r12.A01;
                } else {
                    r1 = null;
                }
                if (r1 == C998758n.SECURITY_CODE) {
                    r6.A06("is_2fac", Boolean.TRUE);
                    r5.A03("wfs", "successful");
                    AnonymousClass33p r2 = r11.A04;
                    C18270x1.A0h(C18270x1.A03(r2), "pref_wfs_source", i3);
                    C18270x1.A0j(C18270x1.A03(r2), "pref_wfs_name", str6);
                    C18270x1.A0j(C18270x1.A03(r2), "pref_wfs_blob", str5);
                    C18270x1.A0j(C18270x1.A03(r2), "pref_wfs_user", str4);
                    C18270x1.A0j(C18270x1.A03(r2), "pref_wfs_pw", str);
                    C18270x1.A0j(C18270x1.A03(r2), "pref_wfs_id_sign", str2);
                    r3 = r11.A00;
                    i = 7;
                } else {
                    r5.A03("wfs", "failed");
                    r6.A04("WFS_ERROR");
                    r11.A00.BkS(new C117125rQ(r27, 15));
                    return;
                }
            }
            r3.BkS(new C70323aJ(r27, r9, r12, i));
            r6.A01();
            return;
        }
        throw C18290x4.A0Y();
    }

    public /* synthetic */ C71023bR(AnonymousClass0PJ r1, AnonymousClass4CV r2, C43842Tr r3, String str, String str2, String str3, String str4, int i, int i2) {
        this.A04 = r3;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r1;
        this.A07 = str3;
        this.A01 = i2;
        this.A08 = str4;
        this.A03 = r2;
    }
}
