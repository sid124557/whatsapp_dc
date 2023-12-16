package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.11N  reason: invalid class name */
public class AnonymousClass11N extends C05550Ty implements C1230566x {
    public int A00;
    public int A01;
    public AnonymousClass3ZH A02;
    public C27991fJ A03;
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass08M A08;
    public final AnonymousClass08M A09;
    public final AnonymousClass08M A0A;
    public final AnonymousClass08M A0B;
    public final AnonymousClass08M A0C;
    public final AnonymousClass08M A0D;
    public final AnonymousClass08M A0E;
    public final AnonymousClass08M A0F;
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H;
    public final C69263Wi A0I;
    public final C56972sr A0J;
    public final C29441ip A0K;
    public final C64773Ex A0L;
    public final AnonymousClass5ZU A0M;
    public final C56612sH A0N;
    public final C56982ss A0O;
    public final C28891hw A0P;
    public final C54442oj A0Q;
    public final C56892sj A0R;
    public final AnonymousClass1VX A0S;
    public final AnonymousClass4FV A0T;
    public final AnonymousClass2GW A0U;
    public final C66493Lq A0V;
    public final AnonymousClass4AQ A0W;
    public final C50932j0 A0X;
    public final C66503Lr A0Y;
    public final AnonymousClass3TW A0Z;
    public final AnonymousClass31C A0a;
    public final C48252eb A0b;
    public final AnonymousClass48V A0c;
    public final RtaXmppClient A0d;
    public final C56072rN A0e;
    public final AnonymousClass4UC A0f;
    public final AnonymousClass4UC A0g;
    public final AnonymousClass4UC A0h;
    public final AnonymousClass4FS A0i;

    public void Brz(int i, boolean z) {
        String str;
        StringBuilder sb;
        String str2;
        boolean z2;
        String str3;
        String str4;
        C06270Wx r0;
        String str5;
        String str6;
        String str7;
        int i2 = i;
        boolean z3 = z;
        if (i2 == 1) {
            z2 = !z;
            AnonymousClass3ZH r1 = this.A02;
            if (r1 == null || r1.A14 == z2) {
                str = "EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            C66503Lr r10 = this.A0Y;
            C27991fJ r6 = this.A03;
            AnonymousClass1FE r3 = new AnonymousClass1FE(this.A0P, this.A0V, r6, (String) null, (List) null, 159);
            C18260x0.A1D("GroupXmppMethods/before/set-restrict-mode; restrictModeEnabled=", AnonymousClass001.A0o(), z2);
            if (z2) {
                str3 = "locked";
            } else {
                str3 = "unlocked";
            }
            r10.A0D(r6, r3, r3, str3, (AnonymousClass39V[]) null, 159);
            sb = AnonymousClass001.A0o();
            str2 = "GroupXmppMethods/set-restrict-mode; restrictModeEnabled=";
        } else if (i2 != 2) {
            if (i2 != 3) {
                AnonymousClass3ZH r02 = this.A02;
                if (i2 != 4) {
                    if (r02 != null && r02.A0q != z3) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("GroupPermissionsActivity report to admin toggled ");
                        if (z) {
                            str7 = "On";
                        } else {
                            str7 = "Off";
                        }
                        C18260x0.A1L(A0o, str7);
                        if (z) {
                            AnonymousClass0x7.A18(this.A0D);
                            this.A0d.A03(this.A03, this.A0c, true);
                            return;
                        }
                        r0 = this.A0g;
                    } else {
                        return;
                    }
                } else if (r02 != null && AnonymousClass001.A1T(r02.A04) != z3) {
                    C68173Sd r8 = new C68173Sd(this.A0a);
                    C27991fJ r62 = this.A03;
                    if (z) {
                        str6 = "all_member_add";
                    } else {
                        str6 = "admin_add";
                    }
                    r8.A00 = new AnonymousClass2WO(this);
                    AnonymousClass31C r7 = r8.A01;
                    String A032 = r7.A03();
                    AnonymousClass36K r5 = new AnonymousClass36K("member_add_mode", str6, (AnonymousClass39V[]) null);
                    AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                    AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
                    AnonymousClass39V.A05("xmlns", "w:g2", A1W);
                    AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W);
                    r7.A0D(r8, AnonymousClass36K.A0C(r62, r5, A1W), A032, 336, 0);
                    AnonymousClass1WM r12 = new AnonymousClass1WM();
                    r12.A00 = Boolean.valueOf(z3);
                    this.A0T.BhD(r12);
                    return;
                } else {
                    return;
                }
            } else {
                AnonymousClass3ZH r03 = this.A02;
                if (r03 != null && r03.A13 != z3) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("GroupPermissionsActivity require membership approval toggled ");
                    if (z) {
                        str5 = "On";
                    } else {
                        str5 = "Off";
                    }
                    C18260x0.A1L(A0o2, str5);
                    if (z) {
                        this.A0Z.A01(this.A03, true);
                        r0 = this.A0B;
                    } else {
                        r0 = this.A0f;
                    }
                } else {
                    return;
                }
            }
            AnonymousClass0x7.A18(r0);
            return;
        } else {
            z2 = !z;
            AnonymousClass3ZH r13 = this.A02;
            if (r13 == null || r13.A0e == z2) {
                str = "SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            C66503Lr r102 = this.A0Y;
            C27991fJ r63 = this.A03;
            AnonymousClass1FE r32 = new AnonymousClass1FE(this.A0P, this.A0V, r63, (String) null, (List) null, 161);
            C18260x0.A1D("GroupXmppMethods/before/set-announcements-only; announcementsEnabled=", AnonymousClass001.A0o(), z2);
            if (z2) {
                str4 = "announcement";
            } else {
                str4 = "not_announcement";
            }
            r102.A0D(r63, r32, r32, str4, (AnonymousClass39V[]) null, 161);
            sb = AnonymousClass001.A0o();
            str2 = "GroupXmppMethods/set-announcements-only; announcementsEnabled=";
        }
        str = AnonymousClass000.A0b(str2, sb, z2);
        Log.i(str);
    }

    public void A0C() {
        this.A0X.A01(this.A0W);
    }

    public void B2H(C89654ea r18, List list) {
        int A022;
        int i;
        Object obj;
        int i2;
        C56892sj r5 = this.A0R;
        C27991fJ r14 = this.A03;
        C620533h r6 = r5.A09;
        C129526aS A042 = r6.A07(r14).A04();
        HashSet A0K2 = AnonymousClass002.A0K();
        C172878Nf it = A042.iterator();
        while (it.hasNext()) {
            C60842zG A0G2 = C18320x8.A0G(it);
            UserJid userJid = A0G2.A03;
            if (!(this.A0J.A0a(userJid) || (i2 = A0G2.A01) == 0 || i2 == 2)) {
                A0K2.add(userJid);
            }
        }
        List list2 = list;
        ArrayList A0J2 = AnonymousClass002.A0J(list2);
        A0J2.removeAll(A0K2);
        ArrayList A0J3 = AnonymousClass002.A0J(A0K2);
        A0J3.removeAll(list2);
        if (A0J2.size() != 0 || A0J3.size() != 0) {
            C89654ea r7 = r18;
            if (!this.A0K.A0F()) {
                this.A0I.A0H(C29441ip.A00(r7), 0);
                return;
            }
            if (r5.A04.A06(r14) == 1) {
                A022 = r5.A0D.A0O(C58422vE.A02, 1655);
            } else {
                A022 = r5.A02(r14) - 1;
            }
            if (A022 < (r6.A07(r14).A0D().size() + A0J2.size()) - A0J3.size()) {
                if (this.A0e.A06(r14)) {
                    i = 3019;
                    obj = Integer.valueOf(A022);
                } else {
                    HashMap A0t = AnonymousClass001.A0t();
                    Iterator it2 = A0J2.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass0x2.A1I(it2.next(), A0t, 419);
                    }
                    i = 3003;
                    obj = A0t;
                }
                C18290x4.A1C(C66493Lq.A1H, obj, i);
                return;
            }
            AnonymousClass0x7.A1B(new C33861to(r7, this.A0I, this.A0L, this.A0M, this.A0N, this.A0V, this.A0Y, r14, A0J2, A0J3), this.A0i);
        }
    }

    public void BPd() {
        C06270Wx r2;
        Object obj;
        int i;
        int i2 = this.A00;
        if (i2 <= 0 || i2 <= (i = this.A01)) {
            this.A0Z.A01(this.A03, false);
            r2 = this.A0B;
            obj = Boolean.FALSE;
        } else {
            r2 = this.A0h;
            obj = new C41622Ky(i, i2);
        }
        r2.A0G(obj);
    }

    public void BPg() {
        this.A0Z.A01(this.A03, false);
        AnonymousClass0x9.A1I(this.A0B);
    }

    public void BZi() {
        AnonymousClass0x7.A18(this.A0B);
    }

    public void BZk() {
        AnonymousClass0x7.A18(this.A0B);
    }

    public List B4H() {
        ArrayList A0s = AnonymousClass001.A0s();
        C56892sj r0 = this.A0R;
        C172878Nf A012 = C620533h.A01(r0.A09, this.A03);
        while (A012.hasNext()) {
            C60842zG A0G2 = C18320x8.A0G(A012);
            int i = A0G2.A01;
            if (!(i == 0 || i == 2)) {
                C56972sr r02 = this.A0J;
                UserJid userJid = A0G2.A03;
                if (!r02.A0a(userJid)) {
                    A0s.add(userJid);
                }
            }
        }
        return A0s;
    }

    public C06270Wx B4I() {
        return this.A04;
    }

    public C06270Wx B8U() {
        return this.A05;
    }

    public C06270Wx B8V() {
        return this.A06;
    }

    public C06270Wx B8W() {
        return this.A07;
    }

    public C06270Wx B8X() {
        return this.A08;
    }

    public C06270Wx B8Y() {
        return this.A09;
    }

    public C06270Wx B8Z() {
        return this.A0A;
    }

    public C06270Wx B8a() {
        return this.A0B;
    }

    public C06270Wx B8b() {
        return this.A0C;
    }

    public C06270Wx B8d() {
        return this.A0E;
    }

    public C06270Wx B8e() {
        return this.A0F;
    }

    public C06270Wx B8f() {
        return this.A0G;
    }

    public C06270Wx B8g() {
        return this.A0H;
    }

    public C06270Wx BC9() {
        return this.A0D;
    }

    public AnonymousClass4UC BCz() {
        return this.A0f;
    }

    public C06270Wx BD0() {
        return this.A0g;
    }

    public AnonymousClass4UC BD1() {
        return this.A0h;
    }

    public void Ba2(boolean z) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupPermissionsActivity report to admin dialog result ");
        if (z) {
            str = "off";
        } else {
            str = "On";
        }
        C18260x0.A1L(A0o, str);
        C06270Wx.A05(this.A0D, !z);
        if (z) {
            this.A0d.A03(this.A03, this.A0c, false);
        }
    }

    public AnonymousClass11N(AnonymousClass2CL r10, C69263Wi r11, C56972sr r12, C29441ip r13, C64773Ex r14, AnonymousClass5ZU r15, C56612sH r16, C56982ss r17, C28891hw r18, C54442oj r19, C56892sj r20, AnonymousClass1VX r21, AnonymousClass4FV r22, C66493Lq r23, C50932j0 r24, C66503Lr r25, C27991fJ r26, AnonymousClass31C r27, C48252eb r28, RtaXmppClient rtaXmppClient, C56072rN r30, AnonymousClass4FS r31) {
        Boolean bool = Boolean.FALSE;
        this.A0B = C18330xA.A01(bool);
        this.A0G = C18330xA.A01(bool);
        this.A06 = C18330xA.A01(bool);
        this.A0C = C18330xA.A01(bool);
        this.A05 = C18330xA.A01(bool);
        this.A08 = C18330xA.A01(bool);
        this.A0H = C18330xA.A01(bool);
        this.A07 = C18330xA.A01(bool);
        this.A0F = C18330xA.A01(bool);
        this.A0A = C18330xA.A01(bool);
        this.A0E = C18330xA.A01(bool);
        this.A09 = C18330xA.A01(bool);
        this.A0f = new AnonymousClass4UC(bool);
        this.A0D = C18330xA.A01(bool);
        this.A0g = new AnonymousClass4UC(bool);
        this.A0h = AnonymousClass0x9.A0b();
        this.A00 = 0;
        this.A01 = 0;
        C85864Hx r1 = new C85864Hx(this, 4);
        this.A0W = r1;
        AnonymousClass2GW r7 = new AnonymousClass2GW(this);
        this.A0U = r7;
        this.A0c = new AnonymousClass3UN(this);
        this.A03 = r26;
        this.A0N = r16;
        this.A0S = r21;
        this.A0I = r11;
        this.A0J = r12;
        this.A0i = r31;
        this.A0O = r17;
        this.A0T = r22;
        this.A0a = r27;
        this.A0e = r30;
        this.A0M = r15;
        this.A0L = r14;
        this.A0V = r23;
        this.A0Y = r25;
        this.A0b = r28;
        this.A0P = r18;
        this.A0d = rtaXmppClient;
        C50932j0 r2 = r24;
        this.A0X = r2;
        this.A0R = r20;
        this.A0K = r13;
        this.A0Q = r19;
        C64333Db r0 = r10.A00.A03;
        this.A0Z = new AnonymousClass3TW(C64333Db.A2p(r0), C64333Db.A4B(r0), C64333Db.A4H(r0), r7, C64333Db.A5u(r0));
        r2.A00(r1);
        C69993Zl.A00(this.A0i, this, 44);
    }
}
