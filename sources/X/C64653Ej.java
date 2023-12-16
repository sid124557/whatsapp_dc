package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.group.SuggestGroupRouter;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: X.3Ej  reason: invalid class name and case insensitive filesystem */
public class C64653Ej implements AnonymousClass67D {
    public final C116985rC A00;
    public final C111095hX A01;
    public final C69263Wi A02;
    public final C56942so A03;
    public final C84384Cd A04;
    public final C46352bU A05;
    public final AnonymousClass33U A06;
    public final C29441ip A07;
    public final C64773Ex A08;
    public final AnonymousClass5ZU A09;
    public final C620633i A0A;
    public final C56612sH A0B;
    public final C56982ss A0C;
    public final C56892sj A0D;
    public final AnonymousClass1VX A0E;
    public final C52472lX A0F;
    public final C44562Wn A0G;
    public final C60152y5 A0H;
    public final AnonymousClass4FS A0I;

    public void Bg6(View view, C08310eF r9, GroupJid groupJid) {
        View view2 = view;
        A01(view2, r9.A0T(), r9, groupJid, new C70323aJ(this, view, groupJid, 32));
    }

    public void BgB(View view, C08310eF r9, GroupJid groupJid) {
        View view2 = view;
        A01(view2, r9.A0T(), r9, groupJid, new C70323aJ(this, view, groupJid, 29));
    }

    public void BgD(Context context, C95814uZ r6, int i) {
        Intent putExtra = C627336j.A01(context, r6, 0).putExtra("start_t", SystemClock.uptimeMillis());
        if (i == 5) {
            putExtra.setFlags(67108864);
        }
        AnonymousClass5VI.A00(putExtra, "CommunityHomeActivity:onClickConversation");
        this.A0G.A00();
        if (context instanceof AnonymousClass49T) {
            ((AnonymousClass49T) context).BP5(putExtra);
        } else {
            context.startActivity(putExtra);
        }
        C27991fJ A012 = AnonymousClass34R.A01(r6);
        if (A012 != null) {
            C71733ca.A01(this.A0I, A012, this, i, 21);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r1 == false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BgF(X.C95814uZ r10, X.C84124Bc r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r4 = 0
            X.1fJ r3 = X.AnonymousClass34R.A01(r10)
            if (r3 == 0) goto L_0x0018
            X.2so r6 = r9.A03
            X.1fJ r2 = r6.A01(r3)
            if (r2 != 0) goto L_0x0019
            X.3Wi r2 = r9.A02
            r1 = 2131894136(0x7f121f78, float:1.9423068E38)
            r0 = 0
            r2.A0F(r1, r0)
        L_0x0018:
            return
        L_0x0019:
            X.4FS r1 = r9.A0I
            r0 = 22
            X.C71733ca.A01(r1, r3, r9, r13, r0)
            X.1fJ r7 = X.AnonymousClass34R.A03(r2)
            X.1fJ r5 = X.AnonymousClass34R.A03(r3)
            if (r7 == 0) goto L_0x009b
            X.2rM r0 = r6.A0H
            X.2mC r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x008a
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r1 = r0.equals(r5)
        L_0x0038:
            if (r5 == 0) goto L_0x0041
            X.2ss r0 = r6.A06
            boolean r0 = r0.A0N(r5)
            r1 = r1 | r0
        L_0x0041:
            if (r1 == 0) goto L_0x0054
            r5 = 3
        L_0x0044:
            java.lang.Integer r0 = X.AnonymousClass33U.A00(r13)
            int r0 = r0.intValue()
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = com.whatsapp.community.JoinGroupBottomSheetFragment.A00(r2, r3, r0, r5)
            r11.AwC(r0, r4)
            return
        L_0x0054:
            X.1VX r8 = r6.A0F
            r1 = 5021(0x139d, float:7.036E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0088
            if (r7 == 0) goto L_0x007c
            X.2rM r0 = r6.A0H
            r0.A04()
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r7)
            X.2vX r0 = (X.C58612vX) r0
            if (r0 == 0) goto L_0x007c
            X.2mC r0 = r0.A01
            if (r0 == 0) goto L_0x007c
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r1 = r0.equals(r5)
        L_0x007c:
            if (r5 == 0) goto L_0x0085
            X.2ss r0 = r6.A06
            boolean r0 = r0.A0R(r5)
            r1 = r1 | r0
        L_0x0085:
            r5 = 6
            if (r1 != 0) goto L_0x0044
        L_0x0088:
            r5 = 2
            goto L_0x0044
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunityChatManager/attempting to check SubgroupCache for missing CAG, gid:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; parent: "
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x009b:
            r1 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64653Ej.BgF(X.4uZ, X.4Bc, java.lang.String, int):void");
    }

    public void Bph(Context context, Integer num, Integer num2) {
        Bpi(context, (C27991fJ) null, num, num2);
    }

    public final int A00(GroupJid groupJid) {
        if (this.A0C.A0Q(groupJid)) {
            return 1;
        }
        C27991fJ A012 = AnonymousClass34R.A01(groupJid);
        if (A012 == null) {
            return 0;
        }
        if (this.A0F.A00(this.A08.A0A(A012))) {
            return 4;
        }
        AnonymousClass2L1 r3 = this.A03.A0I;
        if (r3.A01.A02(new AnonymousClass4KD(r3, 6), A012).size() > 0) {
            return 3;
        }
        return 2;
    }

    public void A02(C009707r r7, C27991fJ r8, Integer num) {
        boolean z;
        int intValue;
        C08310eF A002;
        C56942so r1 = this.A03;
        if (r1.A0F(r8)) {
            if (r8 == null || !C56952sp.A0D(r1.A0F)) {
                z = false;
            } else {
                z = !r1.A0H(r8);
                if (z && !this.A07.A0F()) {
                    C19340zH A003 = AnonymousClass5V0.A00(r7);
                    C19340zH.A01(r7, A003, R.string.f11nameremoved);
                    C19340zH.A02(r7, A003);
                    A003.A0S();
                    return;
                }
            }
            C08240dc A0J = AnonymousClass0x2.A0J(r7);
            int i = -1;
            if (z) {
                if (num != null) {
                    i = num.intValue();
                }
                A002 = new SuggestGroupRouter();
                Bundle A082 = AnonymousClass002.A08();
                A082.putString("parent_group", C18290x4.A0n(r8));
                A082.putInt("entry_point", i);
                A002.A0u(A082);
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                A002 = C59002wA.A00(r8, A0s, intValue, this.A0E.A0Y(C58422vE.A02, 3966));
            }
            A0J.A0C(A002, (String) null);
            A0J.A04();
            return;
        }
        Log.e("CommunityNavigator/attempt to add or suggest new group without permission");
    }

    public void BJc(Context context, String str) {
        C111095hX r2 = this.A01;
        Intent A022 = C627736r.A02(context);
        A022.putExtra("snackbar_message", str);
        A022.setFlags(67108864);
        r2.A0A(context, A022);
    }

    public void Bg5(Context context, View view, GroupJid groupJid) {
        C003203q r4 = (C003203q) C111095hX.A03(context, C009707r.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C70323aJ(this, view, groupJid, 34));
    }

    public void Bg7(Context context, View view, GroupJid groupJid) {
        C003203q r4 = (C003203q) C111095hX.A03(context, C009707r.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C70323aJ(this, view, groupJid, 31));
    }

    public void Bg8(Context context, View view, C27991fJ r10) {
        if (r10 != null) {
            C003203q r4 = (C003203q) C111095hX.A03(context, C009707r.class);
            C27991fJ A012 = this.A03.A01(r10);
            if (A012 != null) {
                A01(view, r4.getSupportFragmentManager(), r4, A012, new C70323aJ(this, view, A012, 33));
            }
        }
    }

    public void BgA(Context context, View view, GroupJid groupJid) {
        C003203q r4 = (C003203q) C111095hX.A03(context, C009707r.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C70323aJ(this, view, groupJid, 30));
    }

    public void BpH(C08270df r4, C27991fJ r5, Callable callable) {
        this.A06.A07(r5, 1);
        try {
            C08240dc r2 = new C08240dc(r4);
            r2.A0C((C08310eF) callable.call(), "SUBGROUP_PICKER_TAG");
            r2.A02();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Bpi(Context context, C27991fJ r9, Integer num, Integer num2) {
        C46352bU r1 = this.A05;
        r1.A03 = null;
        r1.A02 = null;
        r1.A01 = 0;
        r1.A00 = 0;
        r1.A04 = false;
        r1.A02 = num2;
        String A0Y = C18280x3.A0Y();
        r1.A03 = A0Y;
        this.A06.A08(AnonymousClass001.A0f(), num, num2, (Long) null, A0Y);
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.community.NewCommunityActivity");
        if (r9 != null) {
            AnonymousClass0x2.A0u(A072, r9, "NewCommunityActivity_group_to_be_added");
        }
        A072.putExtra("NewCommunityActivity_current_screen", num);
        C111095hX.A02(context).startActivity(A072);
    }

    public C64653Ej(C116985rC r2, C111095hX r3, C69263Wi r4, C56942so r5, C84384Cd r6, C46352bU r7, AnonymousClass33U r8, C29441ip r9, C64773Ex r10, AnonymousClass5ZU r11, C620633i r12, C56612sH r13, C56982ss r14, C56892sj r15, AnonymousClass1VX r16, C52472lX r17, C44562Wn r18, C60152y5 r19, AnonymousClass4FS r20) {
        this.A0B = r13;
        this.A0E = r16;
        this.A02 = r4;
        this.A0I = r20;
        this.A0C = r14;
        this.A01 = r3;
        this.A00 = r2;
        this.A0A = r12;
        this.A08 = r10;
        this.A09 = r11;
        this.A0G = r18;
        this.A0F = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A0D = r15;
        this.A0H = r19;
        this.A07 = r9;
    }

    public final void A01(View view, C08270df r10, C15910sA r11, GroupJid groupJid, Runnable runnable) {
        String string;
        int A002 = A00(groupJid);
        if (A002 == 0) {
            C18260x0.A1P(AnonymousClass001.A0o(), "CommunityNavigator: invalid jid: ", groupJid);
        } else if (A002 == 1) {
            C88694ab A012 = C88694ab.A01(view, view.getContext().getString(R.string.f11nameremoved), 0);
            A012.A0D(AnonymousClass0Y8.A04(view.getContext(), AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            C15910sA r3 = r11;
            new C110065fd(r3, A012, this.A0A, Collections.emptyList(), false).A01();
        } else if (A002 == 2) {
            Context context = view.getContext();
            String A0T = this.A09.A0T(groupJid);
            if (A0T != null) {
                string = context.getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0T));
            } else {
                string = context.getString(R.string.f11nameremoved);
            }
            CharSequence A072 = C107635bd.A07(this.A0A, this.A0H, string);
            C50472iE r0 = new C50472iE();
            r0.A08 = A072;
            r0.A00().A1O(r10, (String) null);
            if (this.A0E.A0Y(C58422vE.A02, 6774)) {
                Log.e("CommunityNavigator/checkIfStillParticipatingInCommunity/Not participating");
                this.A0I.BkM(new C71653cS(this, 40, groupJid));
            }
        } else if (A002 != 3) {
            Context context2 = view.getContext();
            this.A01.A0A(context2, C627736r.A0Z(context2, groupJid, false));
        } else {
            runnable.run();
        }
    }

    public void A03(C009707r r9, C27991fJ r10, Integer num) {
        Intent A0T;
        Resources resources = r9.getResources();
        C56942so r7 = this.A03;
        int size = r7.A0H.A03(r10).size();
        AnonymousClass1VX r1 = r7.A0F;
        C58422vE r2 = C58422vE.A02;
        int A0O = r1.A0O(r2, 1238) + 1;
        if (size >= A0O) {
            C69263Wi r22 = this.A02;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, A0O);
            r22.A0W(resources.getQuantityString(R.plurals.f9nameremoved, A0O, objArr), 1);
        } else if (r7.A0A.A0D(r10) || this.A0E.A0Y(r2, 5077)) {
            if (num != null) {
                A0T = C627736r.A0T(r9, r10).putExtra("group_create_entry_point", num.intValue());
            } else {
                A0T = C627736r.A0T(r9, r10);
            }
            AnonymousClass0RN.A00(r9, A0T, (Bundle) null);
        } else {
            A02(r9, r10, num);
        }
    }

    public boolean Bg9(Context context, View view, GroupJid groupJid) {
        StringBuilder sb;
        String str;
        int A002 = A00(groupJid);
        if (A002 == 0) {
            sb = AnonymousClass001.A0o();
            str = "CommunityNavigator/openCommunityHomeOnAnnouncementTab: invalid jid: ";
        } else if (A002 == 1) {
            sb = AnonymousClass001.A0o();
            str = "CommunityNavigator/openCommunityHomeOnAnnouncementTab: deleted locally: ";
        } else if (A002 != 2) {
            Context context2 = view.getContext();
            this.A01.A0A(context2, C627736r.A0U(context2, groupJid, 1));
            return true;
        } else {
            sb = AnonymousClass001.A0o();
            str = "CommunityNavigator/openCommunityHomeOnAnnouncementTab: not a participant: ";
        }
        C18260x0.A1P(sb, str, groupJid);
        return false;
    }
}
