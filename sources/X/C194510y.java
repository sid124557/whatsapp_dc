package X;

import com.whatsapp.R;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$executeIfInputIsValid$1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.10y  reason: invalid class name and case insensitive filesystem */
public final class C194510y extends C05550Ty {
    public C60332yN A00;
    public AnonymousClass4FW A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public final C39632Cs A03;
    public final C56972sr A04;
    public final C621033m A05;
    public final MessageCommentsManager A06;
    public final C64773Ex A07;
    public final C620633i A08;
    public final C56892sj A09;
    public final C29431io A0A;
    public final AnonymousClass1VX A0B;
    public final C66493Lq A0C;
    public final C29241iV A0D;
    public final AnonymousClass4HI A0E = new AnonymousClass4HI(this, 5);
    public final C52472lX A0F;
    public final C95814uZ A0G;
    public final C50022hV A0H;
    public final C60152y5 A0I;
    public final AnonymousClass2z0 A0J;
    public final C55832qz A0K;
    public final C73853gB A0L;
    public final C73853gB A0M;
    public final C85504Gn A0N;
    public final C85504Gn A0O;
    public final C85504Gn A0P;
    public final C85504Gn A0Q;
    public final AnonymousClass4C8 A0R;
    public final AnonymousClass4C8 A0S;
    public final AnonymousClass4C8 A0T;
    public final AnonymousClass4C8 A0U;
    public final C85524Gp A0V;
    public final C85564Gt A0W;

    public C194510y(C39632Cs r19, C56972sr r20, C621033m r21, MessageCommentsManager messageCommentsManager, C64773Ex r23, C620633i r24, C56892sj r25, C29431io r26, AnonymousClass1VX r27, C66493Lq r28, C29241iV r29, C52472lX r30, C95814uZ r31, C50022hV r32, C60152y5 r33, AnonymousClass2z0 r34, C55832qz r35, C73853gB r36, C73853gB r37) {
        AnonymousClass1VX r0 = r27;
        C162457s7.A0J(r0, 1);
        C50022hV r6 = r32;
        C64773Ex r13 = r23;
        C620633i r12 = r24;
        C56972sr r16 = r20;
        C18260x0.A0e(r16, r6, r13, r12);
        C29431io r10 = r26;
        C66493Lq r9 = r28;
        C52472lX r7 = r30;
        C55832qz r4 = r35;
        C621033m r15 = r21;
        C18260x0.A0g(r4, r9, r10, r7, r15);
        C56892sj r11 = r25;
        C60152y5 r5 = r33;
        C73853gB r3 = r37;
        MessageCommentsManager messageCommentsManager2 = messageCommentsManager;
        C39632Cs r17 = r19;
        C18260x0.A0h(r3, r11, r5, r17, messageCommentsManager2);
        C29241iV r8 = r29;
        C162457s7.A0J(r8, 17);
        this.A0B = r0;
        this.A04 = r16;
        this.A0H = r6;
        this.A07 = r13;
        this.A08 = r12;
        this.A0K = r4;
        this.A0C = r9;
        this.A0A = r10;
        this.A0F = r7;
        this.A05 = r15;
        C73853gB r42 = r36;
        this.A0L = r42;
        this.A0M = r3;
        this.A09 = r11;
        this.A0I = r5;
        this.A03 = r17;
        this.A06 = messageCommentsManager2;
        this.A0D = r8;
        this.A0G = r31;
        this.A0J = r34;
        List emptyList = Collections.emptyList();
        C162457s7.A0D(emptyList);
        C832246p r02 = new C832246p(new C60932zP((C52322lI) null, (AnonymousClass3ZH) null, (C624134x) null, emptyList, 1, false));
        this.A0V = r02;
        this.A0W = r02;
        C369720l r38 = C369720l.DROP_OLDEST;
        C175748Zo r03 = new C175748Zo(r38, 1);
        this.A0N = r03;
        this.A0R = C154567dN.A01(r03);
        C175748Zo r04 = new C175748Zo(r38, 1);
        this.A0O = r04;
        this.A0S = C154567dN.A01(r04);
        C175748Zo r05 = new C175748Zo(r38, 1);
        this.A0Q = r05;
        this.A0U = C154567dN.A01(r05);
        C175748Zo r06 = new C175748Zo(r38, 1);
        this.A0P = r06;
        this.A0T = C154567dN.A01(r06);
        C616131n.A02(r42, new CommentsBottomSheetViewModel$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }

    public void A0C() {
        C60332yN r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("commentListManager");
        }
        r0.A02.A07(r0.A00);
        this.A0D.A07(this.A0E);
        AnonymousClass4FW r1 = this.A01;
        if (r1 != null) {
            this.A0A.A07(r1);
        }
    }

    public final int A0D(AnonymousClass3ZH r6) {
        AnonymousClass1VX r4 = this.A0B;
        C58422vE r3 = C58422vE.A02;
        if (!r4.A0Y(r3, 4727)) {
            Log.d("CommentsBottomSheet/isCommentSendable : comments send disabled");
            return 3;
        }
        GroupJid groupJid = (GroupJid) r6.A0I(GroupJid.class);
        if (groupJid == null || !this.A09.A0C(groupJid)) {
            return 2;
        }
        C66493Lq r1 = this.A0C;
        if (r1.A0w.A00(r6) || r1.A02(r6) == 1) {
            Log.d("CommentsBottomSheet/isCommentSendable : comments send disabled. Suspended/Deactivated");
            if (this.A0F.A00(r6)) {
                return 5;
            }
            return 4;
        } else if (AnonymousClass0x7.A03(r1, r6.A0H) < r4.A0O(r3, 4728)) {
            return 1;
        } else {
            Log.d("CommentsBottomSheet/isCommentSendable : comments send disabled. Too large");
            return 6;
        }
    }

    public final C147177Dc A0E(C624134x r6) {
        MessageCommentsManager messageCommentsManager = this.A06;
        C162457s7.A0J(r6, 0);
        messageCommentsManager.A0B.BkM(new C71653cS(messageCommentsManager, r6, (AnonymousClass4GR) null, 18));
        byte b = r6.A1I;
        if (b == 15 || b == 64) {
            return new C133396hH(r6);
        }
        if (b == 11) {
            return new C133386hG(r6);
        }
        return new C133376hF(r6);
    }

    public final void A0F(String str) {
        C52322lI r5;
        C85564Gt r7 = this.A0W;
        C624134x r0 = ((C60932zP) r7.getValue()).A03;
        if (r0 != null) {
            C823743i r6 = new C823743i(this, r0);
            String A0B2 = C107635bd.A0B(AnonymousClass2AB.A00(str), false);
            C162457s7.A0D(A0B2);
            int length = A0B2.length();
            if (AnonymousClass000.A1T(length)) {
                r5 = new C52322lI((Integer) null, (Integer) null, false);
            } else {
                if (C107635bd.A0P(this.A08, this.A0I, A0B2)) {
                    if (A0B2.codePointCount(0, length) > 65536) {
                        r5 = new C52322lI((Integer) null, 17, false);
                    } else {
                        C624134x r02 = ((C60932zP) r7.getValue()).A03;
                        if (r02 == null || r02.A1J.A00 != null) {
                            r6.invoke(A0B2);
                            return;
                        }
                    }
                }
                r5 = new C52322lI(Integer.valueOf(R.string.f11nameremoved), (Integer) null, false);
            }
            C616131n.A02(this.A0M, new CommentsBottomSheetViewModel$executeIfInputIsValid$1(r5, this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
        }
    }
}
