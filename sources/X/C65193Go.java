package X;

import android.app.ActivityManager;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Go  reason: invalid class name and case insensitive filesystem */
public class C65193Go implements AnonymousClass4FW {
    public boolean A00;
    public boolean A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C48352el A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final AnonymousClass36E A07;
    public final C56352rq A08;
    public final C29301ib A09;
    public final AnonymousClass4F4 A0A;
    public final C65203Gp A0B;
    public final C64773Ex A0C;
    public final C29421in A0D;
    public final C64223Cq A0E;
    public final C54122oD A0F;
    public final C40262Fd A0G;
    public final C44382Vv A0H;
    public final C47912e2 A0I;
    public final C54292oU A0J;
    public final AnonymousClass33p A0K;
    public final AnonymousClass2R2 A0L;
    public final C50202hn A0M;
    public final AnonymousClass2ZV A0N;
    public final C52852m9 A0O;
    public final AnonymousClass2R4 A0P;
    public final C66473Lo A0Q;
    public final C66543Lv A0R;
    public final C29431io A0S;
    public final AnonymousClass300 A0T;
    public final C55282q6 A0U;
    public final C55302q8 A0V;
    public final C56662sM A0W;
    public final AnonymousClass36Y A0X;
    public final AnonymousClass1VX A0Y;
    public final AnonymousClass2YF A0Z;
    public final C621233o A0a;
    public final C54882pR A0b;
    public final C47332d5 A0c;
    public final AnonymousClass3XH A0d;
    public final C620133d A0e;
    public final C53972ny A0f;
    public final C54462ol A0g;
    public final C52992mN A0h;
    public final AnonymousClass33Y A0i;
    public final C66423Lj A0j;
    public final AnonymousClass33S A0k;
    public final C47342d6 A0l;
    public final C619933b A0m;
    public final C55042ph A0n;
    public final C614030o A0o;
    public final C194319Sk A0p;
    public final C194589Tn A0q;
    public final AnonymousClass9Th A0r;
    public final AnonymousClass9R2 A0s;
    public final AnonymousClass3S3 A0t;
    public final C44632Ww A0u;
    public final C50222hp A0v;
    public final C45042Yl A0w;
    public final C42642Oy A0x;
    public final C45542aB A0y;
    public final C55732qp A0z;
    public final C55832qz A10;
    public final C54182oJ A11;
    public final C60312yL A12;
    public final C45162Yx A13;
    public final C989053r A14;
    public final AnonymousClass4FS A15;
    public final C183538qC A16;
    public final C183538qC A17;
    public final C183538qC A18;
    public final C183538qC A19;

    public static final AnonymousClass39T A00(C30341mI r4) {
        C50412i8 r3 = new C50412i8();
        AnonymousClass2z0 r2 = r4.A1J;
        r3.A07 = r2.A01;
        r3.A00 = r4.A1O;
        r3.A02 = r2.A00;
        r3.A01 = null;
        r3.A08 = "picture";
        r3.A05 = "notification";
        return r3.A01();
    }

    public static boolean A01(C624134x r3) {
        if (r3 instanceof C31301o4) {
            C31301o4 r32 = (C31301o4) r3;
            int i = r32.A00;
            if (i == 65 || i == 66 || !r32.A01) {
                return true;
            }
            return false;
        } else if (!(r3 instanceof C30341mI) || ((C30341mI) r3).A00 != 42) {
            return false;
        } else {
            return true;
        }
    }

    @Deprecated
    public final C624134x A02(AnonymousClass2z0 r2) {
        return this.A10.A05(r2);
    }

    public final void A03(long j) {
        String A0h2;
        C42642Oy r3 = this.A0x;
        if (!r3.A02 && j > 900000 && this.A0h.A02()) {
            RegistrationIntentService.A01(this.A0J.A00);
            try {
                ActivityManager A062 = this.A0I.A00.A06();
                if (A062 == null) {
                    A0h2 = "app/logprocess am=null";
                } else {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A062.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (TextUtils.equals(next.processName, "com.google.process.gapps")) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("app/logprocess/procinfo ");
                                A0o2.append(next.processName);
                                A0o2.append(' ');
                                A0h2 = AnonymousClass000.A0h(A0o2, next.pid);
                                break;
                            }
                        }
                    }
                    r3.A02 = true;
                }
                Log.i(A0h2);
            } catch (Exception e) {
                Log.w("app/logprocess/error", e);
            }
            r3.A02 = true;
        }
    }

    public final void A04(C624134x r4) {
        C624034w r0;
        AnonymousClass39R A052;
        AnonymousClass1VX r2 = this.A0Y;
        C58422vE r1 = C58422vE.A02;
        if ((r2.A0Y(r1, 605) || r2.A0Y(r1, 629)) && (r0 = r4.A0P) != null && (A052 = r0.A05()) != null) {
            this.A0q.A03(A052);
        }
    }

    public final void A06(C624134x r9) {
        byte b;
        if (r9 != null) {
            C95814uZ r1 = r9.A1J.A00;
            if ((C155477ey.A00(r1) || C624134x.A0b(r9)) && r9.A0q() != null) {
                C51962kf A0q2 = r9.A0q();
                C626936e.A06(A0q2);
                C624134x A022 = A02(AnonymousClass2z0.A05(r1, A0q2.A01, true));
                if (!(A022 == null || A022.A0I != 0 || A022.A1R != null || (b = A022.A1I) == 87 || b == 88)) {
                    this.A07.A0M(A022, r9, 1);
                }
                if (r9.A0r() != null) {
                    C47332d5 r4 = this.A0c;
                    C53532nF A0r2 = r9.A0r();
                    C162457s7.A0J(A0r2, 1);
                    String str = A0r2.A05;
                    String str2 = A0r2.A03;
                    AnonymousClass1VX r6 = r4.A06;
                    C58422vE r5 = C58422vE.A02;
                    if (r6.A0Y(r5, 6459) && str != null) {
                        C64393Dh r2 = r4.A00;
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        String A042 = C627236i.A04(str);
                        C626936e.A06(A042);
                        A0o2.append(A042);
                        r4.A00(r9, C64393Dh.A00(r2, AnonymousClass000.A0X("-hqthumb", A0o2)), str);
                    }
                    if (r6.A0Y(r5, 6458) && str2 != null) {
                        C64393Dh r22 = r4.A00;
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        String A043 = C627236i.A04(str2);
                        C626936e.A06(A043);
                        A0o3.append(A043);
                        r4.A00(r9, C64393Dh.A00(r22, AnonymousClass000.A0X("-profilephoto", A0o3)), str2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r1.A03(3) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C624134x r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0037
            X.4FS r1 = r3.A15
            r0 = 13
            X.C70173a4.A00(r1, r4, r3, r0)
        L_0x000b:
            X.4FS r2 = r3.A15
            r0 = 18
            X.C70173a4.A00(r2, r4, r3, r0)
            r3.A06(r4)
            boolean r0 = r4 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0036
            X.39W r1 = X.AnonymousClass0x9.A0Y(r4)
            if (r1 == 0) goto L_0x0036
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0036
            X.39S r0 = r1.A01
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x0036
            r0 = 17
            X.C70173a4.A00(r2, r4, r3, r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0075
            X.2qb r0 = r4.A0l
            if (r0 == 0) goto L_0x0075
            X.2z0 r0 = r4.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "MainMessageObserver/onMessageAdded/mms thumbnail for status"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x004c:
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0066
            X.8qC r0 = r3.A19
            java.lang.Object r1 = r0.get()
            X.5UP r1 = (X.AnonymousClass5UP) r1
            r0 = 1
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0066
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x000b
        L_0x0066:
            X.2ny r1 = r3.A0f
            boolean r0 = r1.A01(r4)
            if (r0 == 0) goto L_0x000b
            X.2iO r1 = r1.A06
            r0 = 1
            r1.A01(r4, r0)
            goto L_0x000b
        L_0x0075:
            boolean r0 = X.AnonymousClass36V.A07(r4)
            if (r0 == 0) goto L_0x000b
            r0 = r4
            X.1n7 r0 = (X.C30791n7) r0
            java.util.List r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0084:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            X.34x r0 = X.C18300x5.A0T(r1)
            r3.A07(r0)
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65193Go.A07(X.34x):void");
    }

    public final void A08(C624134x r7) {
        C48352el r2;
        C117715sN r1;
        String str;
        AnonymousClass2z0 r0 = r7.A1J;
        C95814uZ r5 = r0.A00;
        String str2 = r7.A17;
        UserJid A0o2 = r7.A0o();
        if (r0.A02) {
            if ((r5 instanceof C27981fH) && (str = r7.A16) != null) {
                r2 = this.A04;
                r1 = new C117715sN(this, r5, str, 5);
            } else {
                return;
            }
        } else if (C627336j.A0L(A0o2) && r7.A0N == C371321b.USERNAME) {
            if (str2 == null) {
                str2 = "";
            }
            r2 = this.A04;
            r1 = new C117715sN(this, A0o2, str2, 5);
        } else {
            return;
        }
        r2.A01(r1);
    }

    public void BNb(C624134x r7, int i) {
        byte b;
        if (r7.A0p != null && !this.A01 && (b = r7.A1I) != 8 && b != 10 && System.currentTimeMillis() - r7.A0K > 900000) {
            this.A01 = true;
            C52992mN r5 = this.A0h;
            if (r5.A02()) {
                AnonymousClass33p r1 = this.A0K;
                C183538qC r4 = r1.A01;
                r1.A19(C18300x5.A0B(r4).getInt("logins_with_messages", 0) + 1);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("app/msg/offline/logincount ");
                C18260x0.A1F(A0o2, C18300x5.A0B(r4).getInt("logins_with_messages", 0));
                if (!r5.A02()) {
                    AnonymousClass0x9.A0S(this.A18).A06();
                }
            }
        }
    }

    public void BRi(C624134x r5) {
        if (r5 != null && !r5.A1o()) {
            StringBuilder A0l2 = AnonymousClass000.A0l("app/message/received/duplicate ");
            AnonymousClass2z0 r2 = r5.A1J;
            AnonymousClass2z0.A0A(r2, A0l2);
            A0l2.append(" ");
            A0l2.append(C56972sr.A04(this.A06));
            A0l2.append(" ");
            A0l2.append(r2.A00);
            A0l2.append(" ");
            C18260x0.A0o(r5.A0n(), A0l2);
            if (!r2.A02 || r5.A1W) {
                this.A0i.A04(r5);
            } else if (r5 instanceof C31891p1) {
                C31891p1 r52 = (C31891p1) r5;
                AnonymousClass39T r1 = r52.A04;
                if (r1 != null) {
                    this.A0k.A01(r1);
                } else if (r52.A00 == 6) {
                    AnonymousClass33Y r0 = this.A0i;
                    r0.A07.A0H(A00(r52));
                }
            }
        }
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bf, code lost:
        if (r4.A00 == false) goto L_0x02c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWS(X.C624134x r23, int r24) {
        /*
            r22 = this;
            r15 = r23
            r0 = 29
            r2 = r24
            if (r2 == r0) goto L_0x0479
            r7 = 0
            if (r23 == 0) goto L_0x03ee
            X.2z0 r0 = r15.A1J
            X.4uZ r6 = r0.A00
        L_0x000f:
            r5 = 1
            r4 = r22
            if (r23 == 0) goto L_0x03ba
            byte r9 = r15.A1I
            r0 = 8
            if (r9 == r0) goto L_0x03ba
            r3 = 10
            if (r9 == r3) goto L_0x03ba
            r0 = 90
            if (r9 == r0) goto L_0x03ba
            boolean r0 = X.C627636p.A0l(r15)
            if (r0 != 0) goto L_0x03ba
            boolean r0 = r6 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0049
            X.2Vv r0 = r4.A0H
            X.2fl r0 = r0.A00()
            boolean r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x0049
            X.2oD r0 = r4.A0F
            r21 = 0
            r19 = r5
            r20 = r5
            r16 = r0
            r17 = r6
            r18 = r5
            r16.A01(r17, r18, r19, r20, r21)
        L_0x0049:
            com.whatsapp.jid.UserJid r10 = r15.A0o()
            boolean r0 = r15.A1U
            if (r0 == 0) goto L_0x03a7
            X.2hn r8 = r4.A0M
            r1 = 16
        L_0x0055:
            r8.A01(r10, r1)
            X.2ph r14 = r4.A0n
            int r1 = r15.A0D
            r0 = 13
            if (r1 != r0) goto L_0x0087
            X.2z0 r0 = r15.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0087
            boolean r0 = X.C625135j.A03(r15)
            if (r0 == 0) goto L_0x0087
            r16 = 0
            r20 = 5
            X.1VX r8 = r14.A05
            r1 = 3127(0xc37, float:4.382E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0087
            r21 = 4
            r18 = r16
            r19 = r16
            r17 = r16
            r14.A02(r15, r16, r17, r18, r19, r20, r21)
        L_0x0087:
            X.2m9 r1 = r4.A0O
            r8 = 16
            X.8Mj r0 = new X.8Mj
            r0.<init>(r4, r15, r6, r8)
            r1.A01(r0, r3)
            X.1VX r11 = r4.A0Y
            r0 = 4652(0x122c, float:6.519E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r1, r0)
            if (r0 == 0) goto L_0x00af
            X.2kg r10 = r15.A0s()
            if (r10 == 0) goto L_0x00af
            X.4FS r3 = r4.A15
            X.1t5 r0 = new X.1t5
            r0.<init>(r4, r10, r15)
            X.C18270x1.A0w(r0, r3)
        L_0x00af:
            X.2z0 r12 = r15.A1J
            boolean r0 = r12.A02
            r10 = 0
            if (r0 != 0) goto L_0x02dd
            X.2sr r0 = r4.A06
            boolean r0 = X.C627636p.A0R(r0, r15)
            if (r0 != 0) goto L_0x02dd
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r15.A0K
            long r2 = r2 - r0
            X.3Lo r0 = r4.A0Q
            X.3ZH r14 = r0.A01(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgadded/recvdelay="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " offline="
            r1.append(r0)
            java.lang.Integer r0 = r15.A0p
            r1.append(r0)
            java.lang.String r0 = " notified_off="
            r1.append(r0)
            boolean r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = " jid="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " refresh_reqtd="
            r1.append(r0)
            X.2Oy r0 = r4.A0x
            boolean r0 = r0.A02
            X.C18260x0.A1U(r1, r0)
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A07(r15)
            X.3S3 r1 = r4.A0t
            int r0 = r1.A01(r6, r8)
            if (r0 < 0) goto L_0x0114
            r1.A07(r6, r8)
            X.1ib r0 = r4.A09
            r0.A08(r6)
        L_0x0114:
            boolean r0 = r14.A0U()
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r6 instanceof X.C135166kE
            if (r0 != 0) goto L_0x02d3
            r7 = r14
        L_0x011f:
            java.lang.String r0 = r15.A13
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0139
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgadded/from_name is empty  jid:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " message:"
            X.C18260x0.A1S(r1, r0, r12)
        L_0x0139:
            if (r7 == 0) goto L_0x015b
            java.lang.String r0 = r15.A13
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x015b
            java.lang.String r1 = r15.A13
            java.lang.String r0 = r7.A0b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015b
            r7.A0b = r1
            X.2el r11 = r4.A04
            r1 = 14
            X.3a4 r0 = new X.3a4
            r0.<init>(r7, r1, r4)
            r11.A01(r0)
        L_0x015b:
            java.lang.String r12 = r15.A0z
            com.whatsapp.jid.UserJid r11 = r15.A0o()
            if (r12 == 0) goto L_0x0172
            boolean r0 = r11 instanceof X.AnonymousClass1fU
            if (r0 == 0) goto L_0x0172
            X.2el r7 = r4.A04
            r1 = 6
            X.5sN r0 = new X.5sN
            r0.<init>(r4, r11, r12, r1)
            r7.A01(r0)
        L_0x0172:
            r4.A08(r15)
            X.2R4 r13 = r4.A0P
            X.4uZ r12 = r15.A0n()
            boolean r0 = r12 instanceof X.C27981fH
            r11 = 0
            if (r0 == 0) goto L_0x0193
            X.1fH r12 = (X.C27981fH) r12
            if (r12 == 0) goto L_0x0193
            X.21b r0 = r15.A0N
            if (r0 == 0) goto L_0x0193
            X.4C6 r7 = r13.A04
            com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1 r1 = new com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1
            r1.<init>(r0, r13, r12, r11)
            r0 = 3
            X.C616131n.A02(r11, r1, r7, r11, r0)
        L_0x0193:
            r4.A07(r15)
            r4.A04(r15)
            X.34x r0 = r15.A0w()
            if (r0 == 0) goto L_0x01a2
            r4.A04(r0)
        L_0x01a2:
            boolean r0 = r15 instanceof X.C30431mR
            if (r0 == 0) goto L_0x01be
            boolean r0 = r14.A0U()
            if (r0 != 0) goto L_0x01b0
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A05(r6)
        L_0x01b0:
            if (r8 == 0) goto L_0x01be
            r0 = r15
            X.1mR r0 = (X.C30431mR) r0
            int r11 = r0.A00
            long r0 = r0.A01
            X.9Sk r7 = r4.A0p
            r7.A00(r8, r11, r0)
        L_0x01be:
            X.34x r0 = r15.A0w()
            boolean r0 = r0 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x01c9
            r4.A05(r15)
        L_0x01c9:
            boolean r0 = r15 instanceof X.C30801n8
            if (r0 == 0) goto L_0x01dd
            r11 = r15
            X.1n8 r11 = (X.C30801n8) r11
            long r0 = r15.A0K
            int r7 = r11.A00
            int r7 = r7 * 1000
            long r7 = (long) r7
            long r0 = r0 + r7
            X.33o r7 = r4.A0a
            r7.A0Y(r11, r0)
        L_0x01dd:
            boolean r0 = r15 instanceof X.C31301o4
            if (r0 == 0) goto L_0x02d0
            boolean r1 = A01(r15)
        L_0x01e5:
            boolean r0 = r15.A1C
            if (r0 == 0) goto L_0x028e
            java.lang.Integer r0 = r15.A0p
            if (r0 == 0) goto L_0x01f5
            r4.A03(r2)
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x01f5
            r10 = 1
        L_0x01f5:
            r4.A00 = r5
            if (r10 != 0) goto L_0x022b
            X.33b r0 = r4.A0m
            r0.A08(r6)
            java.lang.String r0 = "msgadded/statusbar/cancel"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.33p r0 = r4.A0K
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "conversation_sound"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x022b
            X.2yL r2 = r4.A12
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C58152un.A04
            r1.append(r0)
            r0 = 2132017165(0x7f14000d, float:1.96726E38)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A01(r0)
        L_0x022b:
            X.2z0 r7 = r15.A0f
            if (r7 == 0) goto L_0x023f
            X.33Y r3 = r4.A0i
            X.2YF r2 = r4.A0Z
            X.C626936e.A06(r7)
            long r0 = r15.A0K
            X.34x r0 = r2.A00(r7, r9, r0)
            r3.A04(r0)
        L_0x023f:
            X.30o r1 = r4.A0o
            boolean r0 = r1.A06(r15)
            if (r0 == 0) goto L_0x024e
            X.2oU r0 = r4.A0J
            android.content.Context r0 = r0.A00
            r1.A03(r0, r15)
        L_0x024e:
            X.33Y r0 = r4.A0i
            r0.A04(r15)
        L_0x0253:
            boolean r0 = r15 instanceof X.C31921p4
            if (r0 == 0) goto L_0x041a
            r7 = r15
            X.1p4 r7 = (X.C31921p4) r7
            X.34x r0 = r7.A0w()
            if (r0 == 0) goto L_0x041a
            X.2z0 r0 = r0.A1J
            X.34x r2 = r4.A02(r0)
            boolean r0 = r2 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x03f1
            r0 = r2
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0415
            java.util.Iterator r8 = r0.iterator()
        L_0x0279:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0415
            java.lang.Object r3 = r8.next()
            X.2w3 r3 = (X.C58932w3) r3
            int r1 = r3.A05
            int r0 = r7.A00
            if (r1 != r0) goto L_0x0279
            r3.A04 = r5
            goto L_0x0279
        L_0x028e:
            if (r1 == 0) goto L_0x029b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgadded/bloks_notification is true jid: "
            X.C18260x0.A1S(r1, r0, r6)
            goto L_0x022b
        L_0x029b:
            X.33b r7 = r4.A0m
            android.os.Handler r8 = r7.A03()
            r1 = 26
            X.3aM r0 = new X.3aM
            r0.<init>(r7, r6, r15, r1)
            r8.post(r0)
            boolean r0 = X.C626635z.A09(r15)
            if (r0 != 0) goto L_0x022b
            r0 = 2
            if (r9 != r0) goto L_0x02b8
            int r0 = r15.A09
            if (r0 == r5) goto L_0x022b
        L_0x02b8:
            java.lang.Integer r0 = r15.A0p
            if (r0 == 0) goto L_0x02c1
            boolean r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x02c2
        L_0x02c1:
            r0 = 0
        L_0x02c2:
            r7.A0A(r15, r0, r10)
            java.lang.Integer r0 = r15.A0p
            if (r0 == 0) goto L_0x022b
            r4.A00 = r5
            r4.A03(r2)
            goto L_0x022b
        L_0x02d0:
            r1 = 0
            goto L_0x01e5
        L_0x02d3:
            if (r8 == 0) goto L_0x011f
            X.3Ex r0 = r4.A0C
            X.3ZH r7 = r0.A0A(r8)
            goto L_0x011f
        L_0x02dd:
            boolean r0 = r15.A1W
            if (r0 == 0) goto L_0x02e9
            r4.A07(r15)
            r4.A08(r15)
            goto L_0x024e
        L_0x02e9:
            r0 = -1
            r3 = 6
            if (r2 == r0) goto L_0x02f0
            r0 = 7
            if (r2 != r0) goto L_0x02f9
        L_0x02f0:
            int r0 = r15.A0D
            if (r0 == r3) goto L_0x02f9
            X.3Lj r0 = r4.A0j
            r0.A01(r15)
        L_0x02f9:
            X.2Ww r0 = r4.A0u
            boolean r0 = r0.A00(r15)
            if (r0 == 0) goto L_0x030b
            boolean r0 = r15.A1C
            if (r0 != 0) goto L_0x030b
            boolean r0 = X.C627636p.A0n(r15)
            if (r0 == 0) goto L_0x0317
        L_0x030b:
            if (r2 != r8) goto L_0x032a
            boolean r0 = r15 instanceof X.C30341mI
            if (r0 == 0) goto L_0x032a
            boolean r0 = A01(r15)
            if (r0 != 0) goto L_0x032a
        L_0x0317:
            X.33b r9 = r4.A0m
            android.os.Handler r7 = r9.A03()
            r2 = 26
            X.3aM r0 = new X.3aM
            r0.<init>(r9, r6, r15, r2)
            r7.post(r0)
            r9.A0A(r15, r10, r5)
        L_0x032a:
            X.2Yx r10 = r4.A13
            r0 = 81
            boolean r0 = r10.A00(r15, r0)
            if (r0 != 0) goto L_0x033c
            r0 = 82
            boolean r0 = r10.A00(r15, r0)
            if (r0 == 0) goto L_0x034b
        L_0x033c:
            r0 = 982(0x3d6, float:1.376E-42)
            boolean r0 = r11.A0Y(r1, r0)
            if (r0 == 0) goto L_0x034b
            X.4FS r1 = r4.A15
            r0 = 15
            X.C70173a4.A00(r1, r15, r4, r0)
        L_0x034b:
            boolean r0 = r15 instanceof X.C31891p1
            if (r0 == 0) goto L_0x0379
            r7 = r15
            X.1p1 r7 = (X.C31891p1) r7
            int r9 = r7.A00
            r0 = 145(0x91, float:2.03E-43)
            if (r9 != r0) goto L_0x0370
            java.util.List r0 = r7.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x035e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x039b
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2sr r0 = r10.A00
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x035e
        L_0x0370:
            X.39T r1 = r7.A04
            if (r1 == 0) goto L_0x038d
            X.33S r0 = r4.A0k
            r0.A01(r1)
        L_0x0379:
            boolean r0 = r15 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0253
            r3 = r15
            X.1nE r3 = (X.AnonymousClass1nE) r3
            X.2aB r2 = r4.A0y
            r1 = 0
            X.4IK r0 = new X.4IK
            r0.<init>(r4, r1, r3)
            r2.A00(r3, r0)
            goto L_0x0253
        L_0x038d:
            if (r9 != r3) goto L_0x0379
            X.33Y r0 = r4.A0i
            X.39T r1 = A00(r7)
            X.31C r0 = r0.A07
            r0.A0H(r1)
            goto L_0x0379
        L_0x039b:
            boolean r0 = X.C56952sp.A0D(r11)
            if (r0 == 0) goto L_0x0370
            X.4FS r0 = r4.A15
            X.C70173a4.A00(r0, r15, r4, r8)
            goto L_0x0370
        L_0x03a7:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r15.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.2hn r8 = r4.A0M
            r1 = 15
            if (r0 == 0) goto L_0x0055
            r1 = 14
            goto L_0x0055
        L_0x03ba:
            boolean r0 = r15 instanceof X.C30691mr
            if (r0 != 0) goto L_0x0253
            boolean r0 = X.C627636p.A0l(r15)
            if (r0 == 0) goto L_0x0253
            X.2sr r0 = r4.A06
            boolean r0 = X.C627636p.A0N(r0, r15)
            if (r0 == 0) goto L_0x03e1
            X.33b r3 = r4.A0m
            android.os.Handler r2 = r3.A03()
            r1 = 26
            X.3aM r0 = new X.3aM
            r0.<init>(r3, r6, r15, r1)
            r2.post(r0)
            r3.A0A(r15, r5, r5)
            goto L_0x0253
        L_0x03e1:
            java.lang.String r0 = "msgadded/revoked: Sending the message"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Lj r0 = r4.A0j
            r0.A01(r15)
            goto L_0x0253
        L_0x03ee:
            r6 = r7
            goto L_0x000f
        L_0x03f1:
            boolean r0 = X.AnonymousClass36V.A07(r2)
            if (r0 == 0) goto L_0x041a
            java.lang.Integer r0 = r7.A01
            int r0 = r0.intValue()
            X.34x r0 = X.AnonymousClass36V.A02(r2, r0)
            if (r0 == 0) goto L_0x041a
            X.39W r0 = X.AnonymousClass0x9.A0Y(r0)
            X.39P r0 = r0.A03
            java.util.List r1 = r0.A03
            int r0 = r7.A00
            java.lang.Object r0 = r1.get(r0)
            X.395 r0 = (X.AnonymousClass395) r0
            r0.A00 = r5
        L_0x0415:
            X.3Lv r0 = r4.A0R
            r0.A0Y(r2)
        L_0x041a:
            boolean r0 = X.C626635z.A09(r15)
            if (r0 == 0) goto L_0x0425
            X.2oJ r0 = r4.A11
            r0.A02(r15, r5)
        L_0x0425:
            boolean r0 = r15 instanceof X.C30311mF
            if (r0 != 0) goto L_0x042d
            boolean r0 = r15 instanceof X.C31171nr
            if (r0 == 0) goto L_0x0432
        L_0x042d:
            X.1ib r0 = r4.A09
            r0.A08(r6)
        L_0x0432:
            boolean r0 = r15 instanceof X.C31911p3
            if (r0 == 0) goto L_0x0479
            X.1p3 r15 = (X.C31911p3) r15
            X.34x r1 = r15.A0w()
            if (r1 == 0) goto L_0x0479
            boolean r0 = X.C624134x.A0c(r1)
            if (r0 == 0) goto L_0x0479
            X.2z0 r0 = r1.A1J
            X.34x r6 = r4.A02(r0)
            if (r6 == 0) goto L_0x0479
            X.2Ot r0 = X.C40802Hu.A01(r6)
            if (r0 == 0) goto L_0x0479
            X.2Ot r0 = X.C40802Hu.A01(r6)
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x045c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0474
            java.lang.Object r2 = r3.next()
            X.2bn r2 = (X.C46532bn) r2
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r15.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x045c
            r2.A00 = r5
        L_0x0474:
            X.3Lv r0 = r4.A0R
            r0.A0Y(r6)
        L_0x0479:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65193Go.BWS(X.34x, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1 != 13) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        r11 = (X.C30471mV) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015c, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015e, code lost:
        r10.A09.A08(X.AnonymousClass2z0.A00(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017c, code lost:
        X.C624134x.A0S(r11, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019b, code lost:
        r1.append(X.AnonymousClass2z0.A07(r11, r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a2, code lost:
        X.AnonymousClass0x2.A18(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWU(X.C624134x r11, int r12) {
        /*
            r10 = this;
            r3 = 13
            r6 = 0
            r4 = 1
            switch(r12) {
                case -1: goto L_0x0011;
                case 0: goto L_0x0007;
                case 1: goto L_0x0067;
                case 2: goto L_0x0007;
                case 3: goto L_0x00cf;
                case 4: goto L_0x0067;
                case 5: goto L_0x0118;
                case 6: goto L_0x0168;
                case 7: goto L_0x0007;
                case 8: goto L_0x0010;
                case 9: goto L_0x016f;
                case 10: goto L_0x016f;
                case 11: goto L_0x0176;
                case 12: goto L_0x0010;
                case 13: goto L_0x0010;
                case 14: goto L_0x0180;
                case 15: goto L_0x0180;
                case 16: goto L_0x0195;
                case 17: goto L_0x015a;
                case 18: goto L_0x0010;
                case 19: goto L_0x0010;
                case 20: goto L_0x0007;
                case 21: goto L_0x0010;
                case 22: goto L_0x0007;
                case 23: goto L_0x0010;
                case 24: goto L_0x0011;
                case 25: goto L_0x01a6;
                case 26: goto L_0x01b9;
                case 27: goto L_0x0010;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/messagechanged unknown type "
            X.C18260x0.A0z(r0, r1, r12)
        L_0x0010:
            return
        L_0x0011:
            int r1 = r11.A0D
            r0 = 5
            if (r1 != r0) goto L_0x0027
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r11.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x0027
            X.4FS r1 = r10.A15
            r0 = 4
            X.C71733ca.A01(r1, r11, r10, r12, r0)
        L_0x0027:
            X.2z0 r2 = r11.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            r0 = 24
            if (r12 == r0) goto L_0x003b
            int r1 = r11.A0D
            boolean r0 = X.AnonymousClass358.A01(r1)
            if (r0 != 0) goto L_0x003b
            if (r1 != r3) goto L_0x004d
        L_0x003b:
            X.4uZ r1 = r2.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x004d
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x004d
            X.4FS r1 = r10.A15
            r0 = 5
            X.C71733ca.A01(r1, r11, r10, r12, r0)
        L_0x004d:
            int r0 = r11.A0D
            boolean r0 = X.AnonymousClass358.A01(r0)
            if (r0 == 0) goto L_0x0010
            X.2e5 r0 = r11.A0M
            if (r0 == 0) goto L_0x0010
            X.8qC r0 = r10.A17
            java.lang.Object r1 = r0.get()
            X.2ql r1 = (X.C55692ql) r1
            X.2e5 r0 = r11.A0M
            r1.A02(r0)
            return
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/msgchanged/locationormediaupload/send "
            X.2z0 r2 = X.C624134x.A08(r11, r0, r1)
            java.lang.String r0 = r2.A01
            X.C18260x0.A1J(r1, r0)
            byte r1 = r11.A1I
            boolean r0 = X.C627636p.A0H(r1)
            if (r0 != 0) goto L_0x0098
            boolean r0 = X.C627636p.A0I(r1)
            if (r0 != 0) goto L_0x0098
            r0 = 82
            if (r1 == r0) goto L_0x0098
            r0 = 44
            if (r1 == r0) goto L_0x0098
            X.4uZ r0 = r2.A00
            boolean r1 = r0 instanceof X.C95804uY
            X.3Lj r0 = r10.A0j
            if (r1 == 0) goto L_0x01c2
            r0.A02(r11)
            return
        L_0x0098:
            X.2ol r0 = r10.A0g
            r0.A03(r11)
            boolean r0 = r11 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0010
            X.1nE r11 = (X.AnonymousClass1nE) r11
            X.2aB r1 = r10.A0y
            X.2qp r0 = r10.A0z
            X.39M r4 = r0.A00(r11)
            java.lang.String r0 = r4.A0D
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x00cc
            X.8qC r0 = r1.A01
        L_0x00bb:
            X.1el r3 = X.AnonymousClass0x9.A0a(r0)
            X.3dI r2 = r3.A0C
            r1 = 10
            X.3cK r0 = new X.3cK
            r0.<init>(r3, r1, r4)
            r2.execute(r0)
            return
        L_0x00cc:
            X.8qC r0 = r1.A02
            goto L_0x00bb
        L_0x00cf:
            boolean r0 = r11 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0010
            X.1mV r11 = (X.C30471mV) r11
            X.33C r1 = r11.A01
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x0010
            X.2z0 r0 = r11.A1J
            X.4uZ r2 = r0.A00
            boolean r0 = r2 instanceof X.C135166kE
            if (r0 != 0) goto L_0x0010
            java.io.File r1 = r1.A0F
            if (r1 == 0) goto L_0x00ee
            X.53r r0 = r10.A14
            r0.A0I(r1)
        L_0x00ee:
            X.2Vv r0 = r10.A0H
            X.2fl r0 = r0.A00()
            boolean r0 = r0.A01(r2)
            if (r0 != 0) goto L_0x0010
            byte r1 = r11.A1I
            r0 = 2
            if (r1 != r0) goto L_0x01c6
            int r0 = r11.A09
            if (r0 != r4) goto L_0x01c6
            X.33b r1 = r10.A0m
            java.lang.Integer r0 = r11.A0p
            if (r0 == 0) goto L_0x010e
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x010e
            r6 = 1
        L_0x010e:
            r1.A0A(r11, r6, r4)
            java.lang.Integer r0 = r11.A0p
            if (r0 == 0) goto L_0x0010
            r10.A00 = r4
            return
        L_0x0118:
            X.2m9 r2 = r10.A0O
            r0 = 19
            X.3a4 r1 = new X.3a4
            r1.<init>(r11, r0, r10)
            r0 = 7
            r2.A01(r1, r0)
            X.33b r3 = r10.A0m
            android.os.Handler r2 = r3.A03()
            r1 = 26
            X.3Zz r0 = new X.3Zz
            r0.<init>(r3, r1, r11)
            r2.post(r0)
            r3.A0A(r11, r6, r4)
            boolean r0 = r11 instanceof X.C30801n8
            if (r0 == 0) goto L_0x014c
            long r2 = r11.A0K
            r4 = r11
            X.1n8 r4 = (X.C30801n8) r4
            int r0 = r4.A00
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r2 = r2 + r0
            X.33o r0 = r10.A0a
            r0.A0Y(r4, r2)
        L_0x014c:
            X.34x r0 = r11.A0w()
            boolean r0 = r0 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0157
            r10.A05(r11)
        L_0x0157:
            boolean r0 = r11 instanceof X.C30311mF
            goto L_0x015c
        L_0x015a:
            boolean r0 = r11 instanceof X.C30401mO
        L_0x015c:
            if (r0 == 0) goto L_0x0010
            X.1ib r1 = r10.A09
            X.4uZ r0 = X.AnonymousClass2z0.A00(r11)
            r1.A08(r0)
            return
        L_0x0168:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/msgchanged/futureproofreplaced "
            goto L_0x019b
        L_0x016f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/msgchanged/edit "
            goto L_0x017c
        L_0x0176:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mainmessageobserver/msgchanged/hsm-hydrate "
        L_0x017c:
            X.C624134x.A0S(r11, r0, r1)
            goto L_0x01a2
        L_0x0180:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/msgchanged/paymentdecryptionfailed "
            java.lang.String r0 = X.AnonymousClass2z0.A07(r11, r0, r1)
            X.C18260x0.A1J(r1, r0)
            X.4FS r1 = r10.A15
            r0 = 18
            X.C70173a4.A00(r1, r11, r10, r0)
            return
        L_0x0195:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/msgchanged/paymenttransactionstatusupdate "
        L_0x019b:
            java.lang.String r0 = X.AnonymousClass2z0.A07(r11, r0, r1)
            r1.append(r0)
        L_0x01a2:
            X.AnonymousClass0x2.A18(r1)
            return
        L_0x01a6:
            boolean r0 = X.AnonymousClass34P.A02(r11)
            X.300 r3 = r10.A0T
            X.2z0 r2 = r11.A1J
            X.2JG r1 = new X.2JG
            r1.<init>(r10, r0)
            r0 = 9
            r3.A01(r1, r2, r0)
            return
        L_0x01b9:
            X.300 r2 = r10.A0T
            X.2z0 r1 = r11.A1J
            r0 = 0
            r2.A01(r0, r1, r3)
            return
        L_0x01c2:
            r0.A01(r11)
            return
        L_0x01c6:
            X.33b r2 = r10.A0m
            r3 = 0
            r7 = r4
            r9 = r4
            r5 = r4
            r8 = r6
            r2.A0B(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65193Go.BWU(X.34x, int):void");
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public void BWf(C95814uZ r2) {
        this.A0G.A00.remove(r2);
    }

    public void BWg(Collection collection, Map map) {
        if (map == null) {
            C55042ph r3 = this.A0n;
            C162457s7.A0J(collection, 0);
            r3.A08.BkM(new C70123Zz(collection, 33, r3));
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            C40262Fd r0 = this.A0G;
            r0.A00.remove(AnonymousClass2z0.A00(A0T2));
        }
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public void BXI() {
        C18980yZ r0 = AnonymousClass0x9.A0S(this.A18).A07;
        if (r0 != null) {
            r0.A0i();
        }
    }

    public void BY9(C624134x r3, C624134x r4) {
        this.A11.A02(r4, 3);
        if (r3 != null) {
            C614030o r1 = this.A0o;
            if (r1.A06(r3)) {
                r1.A03(this.A0J.A00, r3);
            }
        }
        A06(r3);
    }

    public final void A05(C624134x r6) {
        String str;
        C30471mV r4 = (C30471mV) r6.A0w();
        if (r4 != null) {
            C624134x A022 = A02(r4.A1J);
            if (A022 == null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A0m(C624134x.A08(r6, "mainmessageobserver/downloadQuotedMessageForSticker/downloading quoted message, parent message", A0o2), A0o2);
                this.A0d.A00(new AnonymousClass4IX(this, 0, r6), r4, 1, false);
                return;
            }
            if (A022 instanceof C30471mV) {
                AnonymousClass1I7 A032 = this.A0e.A03((C30471mV) A022);
                if (A032 != null) {
                    A032.AwR(new C85894Ia(this, r6, r4, 0));
                    return;
                }
                str = "MainMessageObserver/downloadQuotedMessageForSticker original downloader is null";
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                C18260x0.A1T(A0o3, "MainMessageObserver/downloadQuotedMessageForSticker originalMessage not mediaMessage: ", A022);
                str = A0o3.toString();
            }
            Log.e(str);
        }
    }

    public void BX4(C624134x r1) {
        A07(r1);
    }

    public void BWX(C624134x r1, C624134x r2) {
        A06(r2);
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public C65193Go(C116985rC r2, C116985rC r3, C48352el r4, C69263Wi r5, C56972sr r6, AnonymousClass36E r7, C56352rq r8, C29301ib r9, AnonymousClass4F4 r10, C65203Gp r11, C64773Ex r12, C29421in r13, C64223Cq r14, C54122oD r15, C40262Fd r16, C44382Vv r17, C47912e2 r18, C54292oU r19, AnonymousClass33p r20, AnonymousClass2R2 r21, C50202hn r22, AnonymousClass2ZV r23, C52852m9 r24, AnonymousClass2R4 r25, C66473Lo r26, C66543Lv r27, C29431io r28, AnonymousClass300 r29, C55282q6 r30, C55302q8 r31, C56662sM r32, AnonymousClass36Y r33, AnonymousClass1VX r34, AnonymousClass2YF r35, C621233o r36, C54882pR r37, C47332d5 r38, AnonymousClass3XH r39, C620133d r40, C53972ny r41, C54462ol r42, C52992mN r43, AnonymousClass33Y r44, C66423Lj r45, AnonymousClass33S r46, C47342d6 r47, C619933b r48, C55042ph r49, C614030o r50, C194319Sk r51, C194589Tn r52, AnonymousClass9Th r53, AnonymousClass9R2 r54, AnonymousClass3S3 r55, C44632Ww r56, C50222hp r57, C45042Yl r58, C42642Oy r59, C45542aB r60, C55732qp r61, C55832qz r62, C54182oJ r63, C60312yL r64, C45162Yx r65, C989053r r66, AnonymousClass4FS r67, C183538qC r68, C183538qC r69, C183538qC r70, C183538qC r71) {
        this.A0J = r19;
        this.A0Y = r34;
        this.A05 = r5;
        this.A06 = r6;
        this.A15 = r67;
        this.A0k = r46;
        this.A0B = r11;
        this.A0i = r44;
        this.A0s = r54;
        this.A0C = r12;
        this.A0X = r33;
        this.A14 = r66;
        this.A07 = r7;
        this.A0n = r49;
        this.A0z = r61;
        this.A04 = r4;
        this.A0x = r59;
        this.A19 = r68;
        this.A0t = r55;
        this.A12 = r64;
        this.A0D = r13;
        this.A0R = r27;
        this.A10 = r62;
        this.A0W = r32;
        this.A0S = r28;
        this.A11 = r63;
        this.A0P = r25;
        this.A13 = r65;
        this.A0d = r39;
        this.A0o = r50;
        this.A0I = r18;
        this.A0O = r24;
        this.A09 = r9;
        this.A0E = r14;
        this.A0T = r29;
        this.A0j = r45;
        this.A0u = r56;
        this.A0b = r37;
        this.A0h = r43;
        this.A0m = r48;
        this.A0K = r20;
        this.A0e = r40;
        this.A18 = r69;
        this.A0y = r60;
        this.A0g = r42;
        this.A0f = r41;
        this.A0N = r23;
        this.A0a = r36;
        this.A0A = r10;
        this.A0F = r15;
        this.A0c = r38;
        this.A0Z = r35;
        this.A02 = r2;
        this.A0r = r53;
        this.A0U = r30;
        this.A0Q = r26;
        this.A0q = r52;
        this.A08 = r8;
        this.A16 = r70;
        this.A0V = r31;
        this.A0p = r51;
        this.A0M = r22;
        this.A0G = r16;
        this.A17 = r71;
        this.A0H = r17;
        this.A0L = r21;
        this.A0v = r57;
        this.A0w = r58;
        this.A0l = r47;
        this.A03 = r3;
    }
}
