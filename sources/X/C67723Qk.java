package X;

import android.content.Context;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.3Qk  reason: invalid class name and case insensitive filesystem */
public class C67723Qk implements AnonymousClass4DA {
    public final C53962nx A00;
    public final C55682qk A01;
    public final C48352el A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final C29301ib A05;
    public final C65203Gp A06;
    public final C64773Ex A07;
    public final C29421in A08;
    public final C56332ro A09;
    public final C55052pi A0A;
    public final C43862Tt A0B;
    public final C64223Cq A0C;
    public final C56882si A0D;
    public final C44382Vv A0E;
    public final C54292oU A0F;
    public final C52852m9 A0G;
    public final C55152pt A0H;
    public final C56662sM A0I;
    public final AnonymousClass2Q2 A0J;
    public final AnonymousClass1VX A0K;
    public final AnonymousClass7T5 A0L;
    public final C45272Zj A0M;
    public final AnonymousClass31C A0N;
    public final AnonymousClass33S A0O;
    public final C55892r5 A0P;
    public final C48202eW A0Q;
    public final AnonymousClass3S3 A0R;
    public final C56452s0 A0S;
    public final C45602aH A0T;
    public final AnonymousClass4FS A0U;

    public boolean BFA(Message message, int i) {
        String A0F2;
        String string;
        AnonymousClass2SS r2;
        C61272zz A002;
        String str;
        boolean z = false;
        if (i != 25) {
            return false;
        }
        Message message2 = message;
        Parcelable parcelable = message2.getData().getParcelable("stanzaKey");
        C626936e.A07(parcelable, "stanzaKey is null");
        AnonymousClass39T r8 = (AnonymousClass39T) parcelable;
        AnonymousClass36K r9 = (AnonymousClass36K) message2.obj;
        AnonymousClass36K A0k = r9.A0k(0);
        AnonymousClass1gR A003 = C55892r5.A00(this.A0P, r8);
        if (A003 != null) {
            if (A0k != null) {
                str = A0k.A00;
            } else {
                str = null;
            }
            A003.A00 = str;
            A003.A03(3);
        }
        if (A0k != null) {
            if (AnonymousClass36K.A0W(A0k, "add")) {
                C626936e.A0F(!this.A04.A0Y(), "ContactUpdateNotificationHandler/handleContactAdd/add notification should only be sent to primary");
                byte[] bArr = A0k.A01;
                C60982zU r3 = new C60982zU(AnonymousClass227.A0H);
                r3.A02 = true;
                A002 = C60982zU.A00(r3, C59812xW.A0C, bArr);
            } else {
                if (AnonymousClass36K.A0W(A0k, "remove")) {
                    C626936e.A0F(!this.A04.A0Y(), "ContactUpdateNotificationHandler/handleContactRemove/remove notification should only be sent to primary");
                    Jid A062 = AnonymousClass36K.A06(A0k);
                    this.A0G.A01(new C70203a7(this, 38, A062), 45);
                    C70323aJ.A00(this.A0U, this, A062, r8, 46);
                } else {
                    if (AnonymousClass36K.A0W(A0k, "update")) {
                        String A0L2 = AnonymousClass36K.A0L(A0k, "hash");
                        if (A0L2 == null) {
                            C95814uZ r4 = (C95814uZ) AnonymousClass36K.A06(A0k);
                            C64773Ex r7 = this.A07;
                            AnonymousClass3ZH A072 = r7.A07(r4);
                            if (A072 != null) {
                                this.A02.A01(new C70323aJ(this, A072, r4, 44));
                                AnonymousClass3S3 r10 = this.A0R;
                                if (!C627336j.A0K(r4) && ((r2 = (AnonymousClass2SS) r10.A06.get(r4)) == null || r2.A04 != 1)) {
                                    r10.A03(r4, 2, 0);
                                    this.A03.BkS(new C70203a7(this, 37, r4));
                                }
                                if (this.A0E.A00().A01(r4) && this.A0Q.A00 != 3) {
                                    r10.A06(r4);
                                }
                                if (C56952sp.A0F(this.A0K)) {
                                    AnonymousClass2Q2 r5 = this.A0J;
                                    C162457s7.A0J(r4, 0);
                                    C71343bx.A00(r5.A03, r5, r4, 37);
                                } else {
                                    C54292oU r11 = this.A0F;
                                    AnonymousClass4FS r6 = this.A0U;
                                    AnonymousClass2T9 r92 = new AnonymousClass2T9(this.A01, r11, this.A0L, this.A0M, this.A0N, new C68603Tu(this.A03, this.A06, r7, this.A08, r6), r6);
                                    r92.A06.BkM(new C70283aF(r92, r4, 15, A072.A0D));
                                }
                            }
                        } else if (!TextUtils.isEmpty(A0L2)) {
                            byte[] decode = Base64.decode(A0L2.getBytes(), 0);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("contactupdatenotificationhandler/handleContactUpdate decodeHash=");
                            C18260x0.A1J(A0o, Arrays.toString(decode));
                            C60982zU r42 = new C60982zU(AnonymousClass227.A0J);
                            r42.A02 = true;
                            A002 = C60982zU.A00(r42, new C59812xW(false, false, true, true, false, false, false, false, false, false, false, true), decode);
                        }
                    } else if (AnonymousClass36K.A0W(A0k, "sync")) {
                        long j = 0;
                        long A042 = C615531h.A04(A0k.A0r("after", (String) null), 0) * 1000;
                        long A043 = C615531h.A04(r9.A0r("t", (String) null), 0) * 1000;
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("contactupdatenotificationhandler/handleContactSync stanzaKey=");
                        A0o2.append(r8);
                        A0o2.append("; beforeTimestamp=");
                        A0o2.append(A043);
                        C18260x0.A10("; afterTimestamp=", A0o2, A042);
                        C69263Wi r112 = this.A03;
                        C69973Zj r102 = new C69973Zj(this, 25);
                        if (A042 > A043 && A043 > 0) {
                            j = A042 - A043;
                        }
                        r112.A0T(r102, j);
                    } else if (AnonymousClass36K.A0W(A0k, "modify")) {
                        long A032 = C615531h.A03(AnonymousClass36K.A0L(r9, "t")) * 1000;
                        Class<UserJid> cls = UserJid.class;
                        UserJid A0A2 = AnonymousClass36K.A0A(A0k, cls, "old");
                        UserJid A0A3 = AnonymousClass36K.A0A(A0k, cls, "new");
                        Class<C27981fH> cls2 = C27981fH.class;
                        UserJid A0A4 = AnonymousClass36K.A0A(A0k, cls2, "old_lid");
                        Jid A0g = A0k.A0g(cls2, "new_lid");
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("contactupdatenotificationhandler/handleContactModify oldUserJid=");
                        A0o3.append(A0A2);
                        C18260x0.A1R(A0o3, " newUserJid=", A0A3);
                        C53962nx r103 = this.A00;
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("ChangeNumberManager/onContactNumberChanged/oldPnJid=");
                        A0o4.append(A0A2);
                        A0o4.append("; newPnJid=");
                        A0o4.append(A0A3);
                        A0o4.append("/oldLidJid=");
                        A0o4.append(A0A4);
                        C18260x0.A1R(A0o4, "; newLidJid=", A0g);
                        C56832sd r52 = r103.A08;
                        C56832sd r16 = r52;
                        UserJid userJid = A0A3;
                        C31341o8 A082 = r16.A08(A0A2, A0A2, userJid, A032);
                        C66543Lv r43 = r103.A04;
                        r43.A0V(A082);
                        C49792h6 r32 = r103.A03;
                        r32.A01(A0A2, A082);
                        C31341o8 A083 = r52.A08(A0A3, A0A2, A0A3, A032);
                        r43.A0V(A083);
                        r32.A01(A0A3, A083);
                        if (!(A0A4 == null || A0g == null)) {
                            C31341o8 A084 = r16.A08(A0A4, A0A4, userJid, A032);
                            r43.A0V(A084);
                            r32.A01(A0A4, A084);
                            r103.A09.BkM(new C71453c8(r103, A0A4, A0g, A0A2, A0A3, 1));
                        }
                    } else if (AnonymousClass36K.A0W(A0k, "invite")) {
                        C43862Tt r13 = this.A0B;
                        try {
                            C35811xT r113 = new C35811xT(r9);
                            C95814uZ r104 = (C95814uZ) r113.A01;
                            if (r104 != null && !r13.A07.A0L(r104)) {
                                AnonymousClass33T r21 = r13.A06;
                                boolean equalsIgnoreCase = "clicked_invite_link".equalsIgnoreCase(r113.A03);
                                Context context = r13.A05.A00;
                                String A0H2 = r13.A03.A0H(C64773Ex.A00(r13.A02, r104));
                                String string2 = context.getString(R.string.f11nameremoved);
                                if (equalsIgnoreCase) {
                                    A0F2 = AnonymousClass0x2.A0X(context, A0H2, 1, R.string.f11nameremoved);
                                    Object[] objArr = new Object[2];
                                    objArr[0] = A0H2;
                                    string = AnonymousClass002.A0F(context, string2, objArr, 1, R.string.f11nameremoved);
                                } else {
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = A0H2;
                                    A0F2 = AnonymousClass002.A0F(context, string2, objArr2, 1, R.string.f11nameremoved);
                                    string = context.getString(R.string.f11nameremoved);
                                }
                                C05610Ue A004 = C66553Lw.A00(context);
                                A004.A03 = 1;
                                A004.A0C(A0F2);
                                C56612sH r20 = r13.A04;
                                A004.A05(r20.A0H());
                                C18270x1.A0s(A004, A0F2, string);
                                NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = A0H2;
                                notificationCompat$BigTextStyle.A07(AnonymousClass002.A0F(context, string2, objArr3, 1, R.string.f11nameremoved));
                                A004.A08(notificationCompat$BigTextStyle);
                                AnonymousClass33T.A01(C624735e.A00(context, 1, new C627736r().A1O(context, r104, 0), 0), A004);
                                r21.A04(62, A004.A01());
                                C56832sd r44 = r13.A0B;
                                C31051nf r45 = new C31051nf(C56832sd.A01(r104, r44, true), r20.A0H());
                                r45.A1Z(Boolean.toString(equalsIgnoreCase));
                                r13.A08.A0V(r45);
                                r13.A01.A01(new C70323aJ(r13, r113, r104, 47));
                            }
                            r13.A0A.A01(r8);
                        } catch (AnonymousClass24Y unused) {
                        }
                    }
                    this.A0O.A01(r8);
                }
                z = true;
            }
            C70203a7.A00(this.A0U, this, A002, 36);
            this.A0O.A01(r8);
            z = true;
        }
        if (!z) {
            this.A0O.A01(r8);
            C18260x0.A1S(AnonymousClass001.A0o(), "ContactUpdateNotificationHandler/handleXmppMessage/handled-issue/operation was not handled: ", A0k);
            this.A01.A0A("ContactUpdateNotificationHandler/handleXmppMessage", true, "handled-issue");
        }
        return true;
    }

    public C67723Qk(C53962nx r2, C55682qk r3, C48352el r4, C69263Wi r5, C56972sr r6, C29301ib r7, C65203Gp r8, C64773Ex r9, C29421in r10, C56332ro r11, C55052pi r12, C43862Tt r13, C64223Cq r14, C56882si r15, C44382Vv r16, C54292oU r17, C52852m9 r18, C55152pt r19, C56662sM r20, AnonymousClass2Q2 r21, AnonymousClass1VX r22, AnonymousClass7T5 r23, C45272Zj r24, AnonymousClass31C r25, AnonymousClass33S r26, C55892r5 r27, C48202eW r28, AnonymousClass3S3 r29, C56452s0 r30, C45602aH r31, AnonymousClass4FS r32) {
        this.A0K = r22;
        this.A0F = r17;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A0U = r32;
        this.A0O = r26;
        this.A06 = r8;
        this.A0N = r25;
        this.A07 = r9;
        this.A02 = r4;
        this.A0Q = r28;
        this.A0R = r29;
        this.A08 = r10;
        this.A0T = r31;
        this.A0I = r20;
        this.A0G = r18;
        this.A05 = r7;
        this.A09 = r11;
        this.A0C = r14;
        this.A0H = r19;
        this.A0J = r21;
        this.A00 = r2;
        this.A0A = r12;
        this.A0P = r27;
        this.A0S = r30;
        this.A0L = r23;
        this.A0M = r24;
        this.A0D = r15;
        this.A0E = r16;
        this.A0B = r13;
    }

    public int[] B81() {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = 25;
        return A0E2;
    }
}
