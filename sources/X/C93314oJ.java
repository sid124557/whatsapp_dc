package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.ConversationFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4oJ  reason: invalid class name and case insensitive filesystem */
public abstract class C93314oJ extends C93034nl implements C179618jR {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public ProgressDialog A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public ViewGroup A0A;
    public FrameLayout A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public LinearLayout A0H;
    public LinearLayout A0I;
    public LinearLayout A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public AnonymousClass0WH A0O;
    public C116985rC A0P;
    public C116985rC A0Q;
    public C116985rC A0R;
    public C116985rC A0S;
    public C116985rC A0T;
    public C116985rC A0U;
    public C111095hX A0V;
    public AnonymousClass7CX A0W;
    public C69263Wi A0X;
    public C85244Fm A0Y;
    public C56972sr A0Z;
    public AnonymousClass5Ul A0a;
    public C66663Mh A0b;
    public C56492s4 A0c;
    public TextEmojiLabel A0d;
    public TextEmojiLabel A0e;
    public TextEmojiLabel A0f;
    public AnonymousClass5YB A0g;
    public C621033m A0h;
    public WaTextView A0i;
    public C50062hZ A0j;
    public AnonymousClass3N0 A0k;
    public AnonymousClass5T7 A0l;
    public C105405Uu A0m;
    public C105145Tt A0n;
    public AnonymousClass2PX A0o;
    public AnonymousClass5X1 A0p;
    public C56962sq A0q;
    public AnonymousClass4F4 A0r;
    public C29441ip A0s;
    public C64773Ex A0t;
    public C56422rx A0u;
    public AnonymousClass5ZU A0v;
    public C66413Li A0w;
    public C53602nM A0x;
    public AnonymousClass5ST A0y;
    public C49772h4 A0z;
    public C44852Xs A10;
    public AnonymousClass5G6 A11;
    public AnonymousClass4NY A12;
    public ConversationRowParticipantHeaderMainView A13;
    public ConversationRowParticipantHeaderQuotedView A14;
    public C147217Dg A15;
    public C106355Yq A16;
    public C148927Kg A17;
    public AnonymousClass5NQ A18;
    public AnonymousClass5JB A19;
    public C105815Wn A1A;
    public C103565Nm A1B;
    public C114005mL A1C;
    public AnonymousClass4VB A1D;
    public C56612sH A1E;
    public C57162tC A1F;
    public AnonymousClass33p A1G;
    public C66473Lo A1H;
    public C66543Lv A1I;
    public C55672qj A1J;
    public C47972e8 A1K;
    public C56892sj A1L;
    public C114635nM A1M;
    public C55282q6 A1N;
    public C620233e A1O;
    public C620333f A1P;
    public C59862xc A1Q;
    public AnonymousClass5Y0 A1R;
    public C60992zV A1S;
    public AnonymousClass3LP A1T;
    public AnonymousClass5U1 A1U;
    public C66493Lq A1V;
    public C52472lX A1W;
    public C53202mi A1X;
    public AnonymousClass2RM A1Y;
    public C106685Zz A1Z;
    public C55972rD A1a;
    public C52532ld A1b;
    public C106195Xz A1c;
    public C52552lf A1d;
    public AnonymousClass31C A1e;
    public C47052cd A1f;
    public AnonymousClass33S A1g;
    public C54702p9 A1h;
    public C103625Ns A1i;
    public C55042ph A1j;
    public C614030o A1k;
    public C195909Zz A1l;
    public C44562Wn A1m;
    public AnonymousClass5RR A1n;
    public C60152y5 A1o;
    public C49652gs A1p;
    public AnonymousClass5ZD A1q;
    public C55862r2 A1r;
    public C50222hp A1s;
    public C54822pL A1t;
    public C45082Yp A1u;
    public AnonymousClass33O A1v;
    public C97144xh A1w;
    public C55832qz A1x;
    public C56572sD A1y;
    public C69183Wa A1z;
    public C106715a2 A20;
    public C106625Zs A21;
    public C33141sV A22;
    public C187958y5 A23;
    public AnonymousClass5UY A24;
    public AnonymousClass4FS A25;
    public C186998wH A26;
    public C183538qC A27;
    public C183538qC A28;
    public C183538qC A29;
    public C183538qC A2A;
    public C183538qC A2B;
    public C183538qC A2C;
    public C183538qC A2D;
    public C183538qC A2E;
    public C183538qC A2F;
    public C183538qC A2G;
    public C183538qC A2H;
    public Runnable A2I;
    public Runnable A2J;
    public boolean A2K;
    public boolean A2L = false;
    public boolean A2M = false;
    public boolean A2N = false;
    public boolean A2O;
    public boolean A2P = false;
    public boolean A2Q = true;
    public final View.OnClickListener A2R = new C109345eT(this, 15);
    public final View.OnKeyListener A2S = new AnonymousClass6BD(this, 1);
    public final View.OnLongClickListener A2T = new C1891790h(this, 4);
    public final AnonymousClass5MT A2U = new AnonymousClass5MT(this);
    public final C179218in A2V = new AnonymousClass8G0(this);
    public final Runnable A2W = C117085rM.A00(this, 32);

    public int A0x() {
        return Math.max(0, super.A0x());
    }

    public C55162pu A1C(C624134x r6) {
        AnonymousClass4FS r2;
        C71653cS r1;
        if (r6 == null) {
            return null;
        }
        if (this.A0O.A0X(5141)) {
            if (C624134x.A0g(r6)) {
                MessageCommentsManager messageCommentsManager = (MessageCommentsManager) this.A0r;
                r2 = messageCommentsManager.A0B;
                r1 = new C71653cS(messageCommentsManager, r6, (AnonymousClass4GR) null, 18);
            } else if (r6.A1r(16)) {
                MessageCommentsManager messageCommentsManager2 = (MessageCommentsManager) this.A0r;
                r2 = messageCommentsManager2.A0B;
                r1 = new C71653cS(messageCommentsManager2, r6);
            }
            r2.BkM(r1);
        }
        return r6.A0t();
    }

    public void A1H() {
        A1t(false);
    }

    public void A1P(int i) {
        int i2;
        if (this.A0R.A01()) {
            ImageView imageView = this.A0E;
            if (i == 1) {
                if (imageView == null) {
                    this.A0E = C86614Ku.A0H(this);
                    LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
                    A0C2.gravity = 16;
                    A1X(A0C2, this.A08, this.A0E, R.string.f11nameremoved, C86624Kv.A01(this), 2);
                }
                C93244oC.A03(getContext(), this.A0E, this, 2);
                imageView = this.A0E;
                i2 = 0;
            } else if (imageView != null) {
                i2 = 8;
            } else {
                return;
            }
            imageView.setVisibility(i2);
        }
    }

    public void A1S(int i, boolean z) {
        int i2;
        C50062hZ r3 = this.A0j;
        C624134x fMessage = getFMessage();
        boolean A012 = r3.A02.A00().A01(fMessage.A1J.A00);
        if (AnonymousClass3N0.A00(fMessage, (byte) 68)) {
            r3.A06.execute(new C70373aO(r3, fMessage, z, A012));
        } else {
            r3.A01(fMessage, (Runnable) null, (byte) 68, false, A012);
        }
        ImageView imageView = this.A0D;
        if (1 == i) {
            if (imageView == null) {
                this.A0D = C86614Ku.A0H(this);
                LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
                A0C2.gravity = 16;
                A1X(A0C2, this.A08, this.A0D, R.string.f11nameremoved, C86624Kv.A01(this), 1);
            }
            C93244oC.A03(getContext(), this.A0D, this, 1);
            imageView = this.A0D;
            i2 = 0;
        } else if (imageView != null) {
            i2 = 8;
        } else {
            return;
        }
        imageView.setVisibility(i2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1V(android.view.View r5, X.C89654ea r6, com.whatsapp.jid.UserJid r7) {
        /*
            r4 = this;
            r3 = 0
            r0 = r4
            if (r5 == 0) goto L_0x0005
            r0 = r5
        L_0x0005:
            r2 = 0
            X.5XB r1 = new X.5XB
            r1.<init>((android.view.View) r0, (X.C95814uZ) r7, (java.lang.Integer) r3)
            r0 = 1
            if (r5 == 0) goto L_0x000f
            r0 = 2
        L_0x000f:
            r1.A00 = r0
            X.34x r0 = r4.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0025
            X.34x r0 = r4.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r2 = r0.A00
        L_0x0025:
            r1.A01 = r2
            r1.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1V(android.view.View, X.4ea, com.whatsapp.jid.UserJid):void");
    }

    public void A1W(View view, C30771mz r13, boolean z) {
        C30771mz r5 = r13;
        UserJid userJid = r13.A01;
        if (userJid == null) {
            this.A0X.A0H(R.string.f11nameremoved, 0);
            return;
        }
        C105145Tt r1 = this.A0n;
        int i = 3;
        boolean z2 = z;
        if (z) {
            i = 14;
        }
        r1.A01(i);
        boolean A0a2 = this.A0Z.A0a(userJid);
        View view2 = view;
        AnonymousClass5ZY.A02(getContext(), view2, this.A0l, this.A0m, this.A0p, r5, this.A22, 1, z2, A0a2, A0a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        if (((X.C40492Ga) r1.A04()).A00.A0X(5626) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r0 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(android.view.ViewGroup r17, android.widget.TextView r18, X.C624134x r19) {
        /*
            r16 = this;
            r15 = 0
            r9 = r16
            r1 = r18
            r3 = r19
            if (r18 == 0) goto L_0x001a
            r1.setVisibility(r15)
            java.lang.String r0 = X.C87094Nz.A0F(r9, r3)
            r1.setText(r0)
            int r0 = r9.getBroadcastDrawableId()
            r9.A1b(r1, r3, r0)
        L_0x001a:
            r0 = r17
            if (r17 == 0) goto L_0x00ed
            r0.setVisibility(r15)
            boolean r0 = r9 instanceof X.C93294oH
            if (r0 != 0) goto L_0x00ed
            int r1 = r3.A0j()
            r0 = 1
            r9.A1S(r1, r0)
            X.1me r0 = r3.A1T
            if (r0 != 0) goto L_0x0190
            r0 = 0
        L_0x0032:
            r9.A1P(r0)
            boolean r1 = r3.A1F
            android.widget.ImageView r0 = r9.A0F
            if (r1 == 0) goto L_0x018b
            if (r0 != 0) goto L_0x0059
            android.widget.ImageView r0 = X.C86614Ku.A0H(r9)
            r9.A0F = r0
            android.widget.LinearLayout$LayoutParams r10 = X.C86624Kv.A0C()
            r0 = 16
            r10.gravity = r0
            android.widget.ImageView r12 = r9.A0F
            r13 = 2131893944(0x7f121eb8, float:1.9422679E38)
            int r14 = X.C86624Kv.A01(r9)
            android.view.ViewGroup r11 = r9.A08
            r9.A1X(r10, r11, r12, r13, r14, r15)
        L_0x0059:
            android.widget.ImageView r1 = r9.A0F
            android.content.Context r0 = r9.getContext()
            X.C93244oC.A03(r0, r1, r9, r15)
            android.widget.ImageView r0 = r9.A0F
            r0.setVisibility(r15)
        L_0x0067:
            X.1VX r1 = r9.A0O
            X.C162457s7.A0J(r1, r15)
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x009c
            X.2mi r2 = r9.A1X
            X.2z0 r1 = r3.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0183
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0183
            X.5rC r1 = r9.A0P
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0183
            java.lang.Object r0 = r1.A04()
            X.2Ga r0 = (X.C40492Ga) r0
            X.1VX r1 = r0.A00
            r0 = 5626(0x15fa, float:7.884E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0183
        L_0x009c:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            boolean r0 = r3.A1s(r0)
            if (r0 == 0) goto L_0x0183
            android.widget.LinearLayout r0 = r9.A0J
            r4 = 0
            if (r0 != 0) goto L_0x00c3
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r9)
            r0 = 2131626347(0x7f0e096b, float:1.8879928E38)
            android.view.View r2 = X.C86664Kz.A0g(r1, r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r9.A0J = r2
            android.view.ViewGroup r1 = r9.A08
            android.widget.TextView r0 = r9.A0K
            int r0 = r1.indexOfChild(r0)
            r1.addView(r2, r0)
        L_0x00c3:
            android.widget.LinearLayout r0 = r9.A0J
            if (r0 == 0) goto L_0x00ca
        L_0x00c7:
            r0.setVisibility(r4)
        L_0x00ca:
            X.2z0 r0 = r3.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00ed
            X.2ss r0 = r9.A0N
            X.31A r1 = r0.A0A(r1, r15)
            X.1RL r1 = (X.AnonymousClass1RL) r1
            X.2SV r6 = r3.A12()
            X.5UY r4 = r9.A24
            if (r4 == 0) goto L_0x00ed
            boolean r0 = X.C627636p.A0l(r3)
            if (r0 == 0) goto L_0x00ee
            r0 = 8
        L_0x00ea:
            r4.A06(r0)
        L_0x00ed:
            return
        L_0x00ee:
            if (r1 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x00ed
            X.8qC r0 = r9.A2E
            java.lang.Object r5 = r0.get()
            X.5UP r5 = (X.AnonymousClass5UP) r5
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A0K()
            if (r0 == 0) goto L_0x0173
            X.596 r0 = X.AnonymousClass596.ENABLED_ADMIN
        L_0x0106:
            int r2 = r0.value
            X.1VX r1 = r5.A01
            r0 = 4721(0x1271, float:6.616E-42)
            int r0 = r1.A0N(r0)
            if (r0 < r2) goto L_0x00ed
            long r1 = r6.A03
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x011c
            r1 = 1
        L_0x011c:
            android.view.View r5 = r4.A04()
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r6 = r3 instanceof X.C30721mu
            X.8qC r0 = r9.A2G
            java.lang.Object r3 = r0.get()
            X.5QQ r3 = (X.AnonymousClass5QQ) r3
            int r0 = (int) r1
            int r1 = r3.A00(r0)
            java.lang.String r8 = r3.A01(r1)
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            r7 = 2131755226(0x7f1000da, float:1.9141325E38)
            if (r6 == 0) goto L_0x0141
            r7 = 2131755224(0x7f1000d8, float:1.9141321E38)
        L_0x0141:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            X.33j r3 = r9.A0M
            long r1 = (long) r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r15] = r8
            java.lang.String r0 = r3.A0L(r0, r7, r1)
            java.lang.String r3 = "•"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.replace(r3, r2)
            java.lang.String r0 = "\\s{2,}|^[\\s]|\\s+$"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            r6.append(r0)
            r0 = 32
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = X.AnonymousClass001.A0j(r6, r0)
            r5.setText(r0)
            r0 = 0
            goto L_0x00ea
        L_0x0173:
            X.21q r1 = r1.A07
            X.21q r0 = X.C372821q.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0180
            X.596 r0 = X.AnonymousClass596.ENABLED_FOLLOWERS
            goto L_0x0106
        L_0x0180:
            X.596 r0 = X.AnonymousClass596.ENABLED_ALL
            goto L_0x0106
        L_0x0183:
            android.widget.LinearLayout r0 = r9.A0J
            if (r0 == 0) goto L_0x00ca
            r4 = 8
            goto L_0x00c7
        L_0x018b:
            X.C86604Kt.A1A(r0)
            goto L_0x0067
        L_0x0190:
            int r0 = r0.A00
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1Y(android.view.ViewGroup, android.widget.TextView, X.34x):void");
    }

    public void A1c(TextView textView, Integer num, List list, long j) {
        Integer valueOf = Integer.valueOf(list.hashCode());
        textView.setTag(valueOf);
        this.A25.BkV(new C70763b1(this, list, textView, num, valueOf, 1, j), "conversation_row_byte_to_download");
    }

    public void A1r(C624134x r2, boolean z) {
        A1q(r2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1z(X.C51972kg r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0016
            X.1VX r1 = r3.A0O
            r0 = 4652(0x122c, float:6.519E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0016
            X.3ZH r0 = r4.A00
            if (r0 == 0) goto L_0x0016
            X.2qS r0 = r0.A0E
            if (r0 == 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1z(X.2kg):boolean");
    }

    public List getAllMessages() {
        return AnonymousClass0x9.A1A(getFMessage(), new C624134x[1], 0);
    }

    public void setMessageText(String str, TextEmojiLabel textEmojiLabel, C624134x r9) {
        A1d(textEmojiLabel, r9, str, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01df, code lost:
        if (r23 != null) goto L_0x019e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93314oJ(android.content.Context r22, X.AnonymousClass677 r23, X.C624134x r24) {
        /*
            r21 = this;
            r2 = r21
            r8 = r22
            r4 = r23
            r3 = r24
            r2.<init>(r8, r4, r3)
            r5 = 0
            r2.A2L = r5
            r2.A00 = r5
            r2.A01 = r5
            r0 = 1
            r2.A2Q = r0
            r2.A2M = r5
            r1 = 4
            X.90h r0 = new X.90h
            r0.<init>(r2, r1)
            r2.A2T = r0
            r1 = 1
            X.6BD r0 = new X.6BD
            r0.<init>(r2, r1)
            r2.A2S = r0
            r2.A2N = r5
            r2.A2P = r5
            X.8G0 r0 = new X.8G0
            r0.<init>(r2)
            r2.A2V = r0
            X.5MT r0 = new X.5MT
            r0.<init>(r2)
            r2.A2U = r0
            r0 = 32
            X.5rM r0 = X.C117085rM.A00(r2, r0)
            r2.A2W = r0
            r5 = 15
            X.5eT r0 = new X.5eT
            r0.<init>(r2, r5)
            r2.A2R = r0
            r0 = 0
            if (r23 == 0) goto L_0x0058
            int r6 = r4.getContainerType()
            r5 = 2
            boolean r5 = X.AnonymousClass000.A1U(r6, r5)
            r2.A0W = r5
        L_0x0058:
            X.1VX r7 = r2.A0O
            X.2vE r6 = X.C58422vE.A01
            r5 = 4093(0xffd, float:5.736E-42)
            boolean r5 = r7.A0Y(r6, r5)
            r2.A2N = r5
            X.2lX r6 = r2.A1W
            X.2z0 r5 = r3.A1J
            X.4uZ r5 = r5.A00
            boolean r5 = r6.A02(r5)
            r2.A2O = r5
            X.679 r7 = r2.A0n
            int r5 = r2.getUserNameInGroupLayoutOption()
            int r9 = r7.BAa(r5)
            r5 = -1
            if (r9 == r5) goto L_0x0098
            X.34x r6 = r2.getFMessage()
            boolean r5 = r2.A0W
            boolean r5 = r2.A20(r6, r5)
            if (r5 == 0) goto L_0x0098
            r5 = 2131429141(0x7f0b0715, float:1.8479946E38)
            android.view.ViewStub r5 = X.C86664Kz.A0n(r2, r5)
            if (r5 == 0) goto L_0x023b
            r5.setLayoutResource(r9)
            r5.inflate()
        L_0x0098:
            r2.setClipToPadding(r0)
            r2.setClipChildren(r0)
            int r9 = r7.B4s(r8)
            android.content.res.Resources r6 = r2.getResources()
            r5 = 2131167642(0x7f07099a, float:1.7949563E38)
            int r10 = r6.getDimensionPixelSize(r5)
            boolean r5 = r2.A0W
            if (r5 == 0) goto L_0x01e6
            android.content.res.Resources r6 = X.C18290x4.A0G(r2)
            r5 = 2131165300(0x7f070074, float:1.7944813E38)
            int r5 = r6.getDimensionPixelSize(r5)
            r2.setPadding(r0, r5, r0, r5)
        L_0x00bf:
            X.4Lr r5 = new X.4Lr
            r5.<init>(r2)
            r2.setBackground(r5)
            r5 = 2131431770(0x7f0b115a, float:1.8485279E38)
            android.view.View r6 = r2.findViewById(r5)
            if (r6 == 0) goto L_0x00d7
            X.5UY r5 = new X.5UY
            r5.<init>(r6)
            r2.A24 = r5
        L_0x00d7:
            r5 = 2131429275(0x7f0b079b, float:1.8480218E38)
            android.widget.TextView r5 = X.AnonymousClass002.A09(r2, r5)
            r2.A0K = r5
            r5 = 2131433880(0x7f0b1998, float:1.8489558E38)
            android.widget.ImageView r5 = X.AnonymousClass0x9.A0F(r2, r5)
            r2.A0G = r5
            boolean r5 = r2.A0W
            r10 = 0
            if (r5 != 0) goto L_0x01e2
            int r5 = r2.getUserNameViewId()
            android.view.View r5 = r2.findViewById(r5)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r5 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView) r5
            r2.A13 = r5
        L_0x00fa:
            r5 = 2131429294(0x7f0b07ae, float:1.8480257E38)
            android.view.ViewGroup r5 = X.C86644Kx.A0J(r2, r5)
            r2.A08 = r5
            int r5 = r2.getProfilePictureFullWidth()
            r2.A03 = r5
            boolean r5 = r7.Bp4()
            r6 = 2131166688(0x7f0705e0, float:1.7947628E38)
            if (r5 == 0) goto L_0x0115
            r6 = 2131166683(0x7f0705db, float:1.7947618E38)
        L_0x0115:
            boolean r20 = r7.Bp3()
            boolean r5 = r7.Bp5()
            if (r5 == 0) goto L_0x016c
            X.7CX r5 = r2.A0W
            boolean r19 = r2.A1w()
            int r18 = X.C86614Ku.A05(r2, r6)
            X.5su r5 = r5.A00
            X.3Db r10 = r5.A03
            X.2oU r15 = X.C64333Db.A2q(r10)
            X.1VX r16 = X.C64333Db.A4B(r10)
            X.2sr r11 = X.C64333Db.A06(r10)
            X.4FS r17 = X.C64333Db.A8y(r10)
            X.3Ex r12 = X.C64333Db.A26(r10)
            X.4av r5 = r5.A04
            X.3Db r5 = r5.A0K
            X.1VX r9 = X.C86604Kt.A0Y(r5)
            X.3Ex r8 = X.C86604Kt.A0P(r5)
            X.5ZU r6 = X.C86604Kt.A0R(r5)
            X.4C1 r5 = r5.AbU
            java.lang.Object r7 = r5.get()
            X.33j r7 = (X.C620733j) r7
            X.32b r5 = new X.32b
            r5.<init>(r7)
            X.2Qz r14 = new X.2Qz
            r14.<init>(r8, r6, r5, r9)
            X.30g r13 = X.C86624Kv.A0P(r10)
            X.4VB r10 = new X.4VB
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x016c:
            r2.A1D = r10
            r2.A1t(r0)
            boolean r5 = r2.A1v()
            if (r5 == 0) goto L_0x017f
            r2.setLongClickable(r1)
            android.view.View$OnLongClickListener r1 = r2.A2T
            r2.setOnLongClickListener(r1)
        L_0x017f:
            X.677 r1 = r2.A0m
            if (r1 == 0) goto L_0x01d3
            boolean r1 = r1.BFW()
            if (r1 == 0) goto L_0x01d3
            boolean r1 = r2.A1u()
            if (r1 == 0) goto L_0x01d3
            r2.A1J()
            X.4NY r1 = r2.A12
            X.C626936e.A06(r4)
            boolean r0 = r4.BIB(r3)
            r1.setRowSelected(r0)
        L_0x019e:
            X.4VB r0 = r2.A1D
            if (r0 == 0) goto L_0x01c5
            X.08J r3 = r0.A02
            X.0sA r1 = r4.getLifecycleOwner()
            r0 = 181(0xb5, float:2.54E-43)
            X.AnonymousClass6C6.A02(r1, r3, r2, r0)
            X.1VX r1 = r2.A0O
            r0 = 3574(0xdf6, float:5.008E-42)
            boolean r0 = r1.A0X(r0)
            X.4VB r1 = r2.A1D
            if (r0 == 0) goto L_0x01cd
            java.util.Objects.requireNonNull(r1)
            r0 = 31
            X.5rM r0 = X.C117085rM.A00(r1, r0)
            r2.post(r0)
        L_0x01c5:
            X.5RR r0 = new X.5RR
            r0.<init>()
            r2.A1n = r0
            return
        L_0x01cd:
            X.08M r0 = r1.A04
            X.C86654Ky.A1H(r0)
            goto L_0x01c5
        L_0x01d3:
            android.view.View r1 = r2.A0D
            X.C86604Kt.A1A(r1)
            X.4NY r1 = r2.A12
            if (r1 == 0) goto L_0x01df
            r1.setRowSelected(r0)
        L_0x01df:
            if (r23 == 0) goto L_0x01c5
            goto L_0x019e
        L_0x01e2:
            r2.A13 = r10
            goto L_0x00fa
        L_0x01e6:
            int r6 = r3.A0D
            r5 = 6
            if (r6 != r5) goto L_0x020e
            byte r6 = r3.A1I
            r5 = 8
            if (r6 == r5) goto L_0x020e
            android.graphics.Rect r11 = r2.A0d
            int r5 = r11.top
            int r10 = r10 + r5
            android.content.res.Resources r5 = r2.getResources()
            r8 = 2131166162(0x7f0703d2, float:1.7946562E38)
            int r6 = X.C86664Kz.A09(r5, r8, r10)
            int r5 = r11.bottom
            int r9 = r9 + r5
            int r5 = X.C86614Ku.A05(r2, r8)
            int r9 = r9 - r5
            r2.setPadding(r0, r6, r0, r9)
            goto L_0x00bf
        L_0x020e:
            boolean r5 = r2.A14()
            X.33j r8 = r2.A0M
            if (r5 == 0) goto L_0x0238
            android.graphics.Rect r6 = r2.A0c
        L_0x0218:
            int r5 = r6.top
            int r10 = r10 + r5
            int r5 = r6.bottom
            int r9 = r9 + r5
            r15 = r0
            r11 = r2
            r12 = r8
            r13 = r0
            r14 = r10
            r16 = r9
            X.C107555bV.A07(r11, r12, r13, r14, r15, r16)
            android.content.res.Resources r6 = r2.getResources()
            r5 = 2131166063(0x7f07036f, float:1.794636E38)
            int r5 = X.AnonymousClass4L0.A01(r6, r5)
            r2.setMinimumHeight(r5)
            goto L_0x00bf
        L_0x0238:
            android.graphics.Rect r6 = r2.A0d
            goto L_0x0218
        L_0x023b:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "ConversationRow/setUpUserNameInGroupView/You need to add conversation_row_participant_header_view_stub in your new msg xml file. Msg type = "
            r6.append(r5)
            X.34x r5 = r2.getFMessage()
            byte r5 = r5.A1I
            java.lang.String r5 = X.AnonymousClass000.A0h(r6, r5)
            X.C626936e.A0D(r0, r5)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.<init>(android.content.Context, X.677, X.34x):void");
    }

    public static void A0q(View view, C93314oJ r2) {
        view.setOnLongClickListener(r2.A2T);
    }

    public static void A0r(TextView textView) {
        if (textView != null) {
            textView.setEnabled(true);
            textView.setSelectAllOnFocus(true);
            textView.setTextIsSelectable(true);
        }
    }

    public static void A0t(C93244oC r2, AnonymousClass5UY r3) {
        C56232re r0 = r2.A04;
        C626936e.A06(r0);
        r2.A23(r3, C106805aC.A01(r0, (C30471mV) r2.A0S, r3));
    }

    private int getExtraBottomPadding() {
        LinearLayout linearLayout;
        int i = this.A01;
        if ((i != 1 && i != 2) || (linearLayout = this.A0E) == null || linearLayout.getVisibility() == 8) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    @Deprecated
    private C624134x getFailedMessage() {
        C56612sH r4 = this.A1E;
        return C627636p.A07(this.A0Z, r4, this.A0O, this.A1d, getFMessage());
    }

    private C40812Hv getFailedMessageBundle() {
        C56612sH r4 = this.A1E;
        return C627636p.A0C(this.A0Z, r4, this.A0O, this.A1d, getFMessage());
    }

    private C42312Np getMessagePrivacyStateFromDbOnMainThread() {
        return this.A1N.A00(getFMessage().A1L);
    }

    private float getNameInGroupTextFontSize() {
        return this.A0y.A02(getResources());
    }

    private AnonymousClass4QQ getOrCreateActionButtonContainer() {
        if (this.A0J == null) {
            this.A0J = new AnonymousClass4QQ(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0, 0);
            this.A0J.setLayoutParams(marginLayoutParams);
            addView(this.A0J);
            AnonymousClass4QQ r2 = this.A0J;
            r2.A02.setVisibility(8);
            r2.A01.setVisibility(8);
            r2.A03.setVisibility(8);
        }
        return this.A0J;
    }

    private void setupUsernameInGroupViewContainer(C624134x r21) {
        C95814uZ A0n2;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A13;
        if (conversationRowParticipantHeaderMainView != null) {
            TextEmojiLabel A0M2 = C86644Kx.A0M(this, R.id.name_in_group_tv);
            C624134x r8 = r21;
            AnonymousClass2z0 r3 = r8.A1J;
            boolean z = r3.A02;
            if (z) {
                if (this.A0n.Bp3()) {
                    A0n2 = C56972sr.A05(this.A0Z);
                }
                C626936e.A0D(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                return;
            }
            A0n2 = r8.A0n();
            boolean A022 = ((C52782m2) this.A2C.get()).A02(r8);
            if (A0n2 == null && A022) {
                A0n2 = r3.A00;
            }
            int i = 8;
            if (A0n2 == null || A0M2 == null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("conversation_row/missing_rmt_src:");
                C18260x0.A1K(A0o2, C627636p.A0E(r8));
            } else {
                AnonymousClass5YB Azt = this.A0G.Azt(getContext(), A0M2);
                AnonymousClass3ZH A0A2 = this.A0t.A0A(A0n2);
                int A062 = this.A0v.A06(A0A2, r3.A00);
                if (this.A0Z.A0a(A0n2)) {
                    A062 = 8;
                }
                setupUIForUserNameInGroup(r8, Azt, conversationRowParticipantHeaderMainView, A0A2, A062, A0n2);
                if (z) {
                    if (this.A0n.Bp3()) {
                        A1e(Azt, conversationRowParticipantHeaderMainView, A0A2, A062, false);
                    }
                    C626936e.A0D(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                    return;
                }
                A1e(Azt, conversationRowParticipantHeaderMainView, A0A2, A062, true);
            }
            C27991fJ A012 = AnonymousClass34R.A01(r3.A00);
            UserJid A032 = AnonymousClass32Y.A03(A0n2);
            View findViewById = findViewById(R.id.conversation_row_name_in_group_role);
            if (findViewById != null) {
                if (!(getGroupRoleTitle() == null || A032 == null || A012 == null || !this.A1L.A0I(A012, A032))) {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
            if (this.A01 < 2) {
                conversationRowParticipantHeaderMainView.setVisibility(0);
            }
        }
    }

    public int A19(int i) {
        if (AnonymousClass001.A1U(AnonymousClass358.A00(i, 13)) || AnonymousClass001.A1U(AnonymousClass358.A00(i, 5))) {
            return R.drawable.message_got_receipt_from_target;
        }
        if (i == 4) {
            return R.drawable.message_got_receipt_from_server;
        }
        return R.drawable.message_unsent;
    }

    public int A1A(int i) {
        if (AnonymousClass001.A1U(AnonymousClass358.A00(i, 13))) {
            return R.color.f5nameremoved;
        }
        return R.color.f5nameremoved;
    }

    public AnonymousClass5KC A1B() {
        C69263Wi r1 = this.A0X;
        AnonymousClass4FS r5 = this.A25;
        return new AnonymousClass5KC(r1, this.A0c, this.A1K, this.A1Z, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        if (r3.A0O.A0X(6786) == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1I() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C93214o9
            if (r0 == 0) goto L_0x0023
            r1 = r13
            X.4o9 r1 = (X.C93214o9) r1
            java.lang.String r0 = "conversation/row/video/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1pB r4 = r1.getFMessage()
            r0 = 1
            r1.A06 = r0
            X.1sV r2 = r1.A22
            X.C626936e.A06(r2)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r1.A0G
            X.8tp r5 = r1.A0H
            X.2z0 r6 = r4.A1J
            r7 = 0
            r2.A0D(r3, r4, r5, r6, r7)
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r13 instanceof X.C93204o8
            if (r0 == 0) goto L_0x0051
            r0 = r13
            X.4o8 r0 = (X.C93204o8) r0
            X.5Xu r2 = r0.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowSticker/refreshThumbnail, message: "
            r1.append(r0)
            X.1mV r0 = r2.A00
            X.2z0 r0 = r0.A1J
            X.C18260x0.A0m(r0, r1)
            r0 = 1
            r2.A01 = r0
            X.1sV r3 = r2.A0I
            X.C626936e.A06(r3)
            X.1mV r5 = r2.A00
            com.whatsapp.stickers.StickerView r4 = r2.A0F
            X.8tp r6 = r2.A0H
            X.2z0 r7 = r5.A1J
            r8 = 0
            r3.A0D(r4, r5, r6, r7, r8)
            return
        L_0x0051:
            boolean r0 = r13 instanceof X.C92914nZ
            if (r0 == 0) goto L_0x0063
            r1 = r13
            X.4nZ r1 = (X.C92914nZ) r1
            java.lang.String r0 = "conversation/row/ptv/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r1.A0U
            r0.A02()
            return
        L_0x0063:
            boolean r0 = r13 instanceof X.C92904nY
            if (r0 == 0) goto L_0x0083
            r4 = r13
            X.4nY r4 = (X.C92904nY) r4
            java.lang.String r0 = "conversation/row/image/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.34x r3 = r4.A0S
            r0 = 1
            r4.A04 = r0
            X.1sV r0 = r4.A22
            r0.A0G(r3)
            X.1sV r2 = r4.A22
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r4.A0I
            X.8tp r0 = r4.A0J
            r2.A09(r1, r3, r0)
            return
        L_0x0083:
            boolean r0 = r13 instanceof X.AnonymousClass4o3
            if (r0 == 0) goto L_0x0095
            r1 = r13
            X.4o3 r1 = (X.AnonymousClass4o3) r1
            java.lang.String r0 = "conversation/row/image/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.8tp r0 = r1.A0I
            r1.A2C(r0)
            return
        L_0x0095:
            boolean r0 = r13 instanceof X.C93114nv
            if (r0 == 0) goto L_0x00f2
            r3 = r13
            X.4nv r3 = (X.C93114nv) r3
            java.lang.String r0 = "ConversationRowDocument/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.34x r0 = r3.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.30w r0 = r0.A0y()
            X.C626936e.A06(r0)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0022
            X.34x r0 = r3.A0S
            X.1mV r0 = (X.C30471mV) r0
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C989053r.A07(r0)
            if (r0 == 0) goto L_0x00cb
            X.1VX r1 = r3.A0O
            r0 = 6786(0x1a82, float:9.509E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            X.5UY r1 = r3.A0K
            int r0 = X.C86614Ku.A09(r2)
            r1.A06(r0)
            X.1sV r4 = r3.A22
            X.C626936e.A06(r4)
            X.34x r6 = r3.A0S
            if (r2 == 0) goto L_0x00ef
            android.view.View r5 = r1.A04()
        L_0x00e2:
            X.8tp r7 = r3.A0I
            X.2z0 r8 = r6.A1J
            r10 = 0
            r9 = 480(0x1e0, float:6.73E-43)
            r12 = 1
            r11 = r10
            r4.A0C(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00ef:
            android.widget.ImageView r5 = r3.A0A
            goto L_0x00e2
        L_0x00f2:
            boolean r0 = r13 instanceof X.C93084ns
            if (r0 == 0) goto L_0x0022
            r1 = r13
            X.4ns r1 = (X.C93084ns) r1
            java.lang.String r0 = "ConversationRowBotPlugin/refreshThumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4mV r0 = r1.A05
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1I():void");
    }

    public void A1J() {
        View view = this.A0D;
        if (view != null) {
            view.setVisibility(0);
            this.A0D.bringToFront();
            return;
        }
        AnonymousClass4NY r1 = new AnonymousClass4NY(getContext(), this);
        this.A12 = r1;
        this.A0D = r1;
        r1.setClickable(true);
        C109345eT.A00(this.A0D, this, 12);
        setClipToPadding(false);
        setClipChildren(false);
        addView(this.A0D, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0100, code lost:
        if (r4.A2E() == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C93004ni
            if (r0 == 0) goto L_0x001b
            r0 = r9
            X.4nj r0 = (X.C93014nj) r0
            com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r3 = r0.A04
        L_0x0009:
            X.1mV r2 = r0.getFMessage()
            boolean r0 = r3.isInEditMode()
            if (r0 != 0) goto L_0x001a
            X.2re r1 = r3.A01
            X.5UY r0 = r3.A05
            X.C106805aC.A01(r1, r2, r0)
        L_0x001a:
            return
        L_0x001b:
            boolean r0 = r9 instanceof X.C93224oA
            if (r0 == 0) goto L_0x0025
            r0 = r9
            X.4oA r0 = (X.C93224oA) r0
            com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r3 = r0.A07
            goto L_0x0009
        L_0x0025:
            boolean r0 = r9 instanceof X.C93214o9
            if (r0 == 0) goto L_0x0078
            r2 = r9
            X.4o9 r2 = (X.C93214o9) r2
            X.1pB r8 = r2.getFMessage()
            X.1VX r1 = r2.A0O
            r0 = 1418(0x58a, float:1.987E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0070
            android.widget.TextView r4 = r2.A0E
            X.2re r7 = r2.A04
            X.7Kc r5 = r2.A01
            r3 = 0
            r6 = r3
            X.C106805aC.A02(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            X.1pB r0 = r2.getFMessage()
            X.33C r1 = r0.A01
            if (r1 == 0) goto L_0x0061
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x0061
            boolean r0 = r1.A0a
            if (r0 != 0) goto L_0x0061
            X.5UY r0 = r2.A0K
            int r0 = r0.A03()
            if (r0 == 0) goto L_0x0061
            r0 = 0
            r2.A2A(r0)
        L_0x0061:
            X.5UY r1 = r2.A0K
            X.2re r0 = r2.A04
            X.C626936e.A06(r0)
            int r0 = X.C106805aC.A01(r0, r8, r1)
            r2.A23(r1, r0)
            return
        L_0x0070:
            android.widget.TextView r1 = r2.A0E
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0045
        L_0x0078:
            boolean r0 = r9 instanceof X.C93204o8
            if (r0 == 0) goto L_0x0087
            r1 = r9
            X.4o8 r1 = (X.C93204o8) r1
            X.5Xu r0 = r1.A04
            X.5UY r0 = r0.A0N
            A0t(r1, r0)
            return
        L_0x0087:
            boolean r0 = r9 instanceof X.C92914nZ
            if (r0 == 0) goto L_0x0094
            r1 = r9
            X.4nZ r1 = (X.C92914nZ) r1
            X.5UY r0 = r1.A0Z
            A0t(r1, r0)
            return
        L_0x0094:
            boolean r0 = r9 instanceof X.C92904nY
            if (r0 == 0) goto L_0x00a1
            r1 = r9
            X.4nY r1 = (X.C92904nY) r1
            X.5UY r0 = r1.A0L
            A0t(r1, r0)
            return
        L_0x00a1:
            boolean r0 = r9 instanceof X.C92894nX
            if (r0 == 0) goto L_0x00ae
            r1 = r9
            X.4nX r1 = (X.C92894nX) r1
            X.5UY r0 = r1.A09
            A0t(r1, r0)
            return
        L_0x00ae:
            boolean r0 = r9 instanceof X.AnonymousClass4o3
            if (r0 == 0) goto L_0x0109
            r4 = r9
            X.4o3 r4 = (X.AnonymousClass4o3) r4
            android.widget.FrameLayout r5 = r4.A04
            if (r5 == 0) goto L_0x00e0
            boolean r0 = r4.A2E()
            if (r0 == 0) goto L_0x00e0
            X.1n2 r0 = r4.getFMessage()
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00e0
            X.5UY r2 = r4.A0F
        L_0x00cf:
            X.1n2 r1 = r4.getFMessage()
            X.2re r0 = r4.A04
            X.C626936e.A06(r0)
            int r0 = X.C106805aC.A01(r0, r1, r2)
            r4.A23(r2, r0)
            return
        L_0x00e0:
            X.1n2 r3 = r4.getFMessage()
            X.33C r1 = r3.A01
            if (r1 == 0) goto L_0x0106
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x0106
            boolean r0 = r1.A0a
            if (r0 != 0) goto L_0x0106
            X.5UY r0 = r4.A0G
            int r0 = r0.A03()
            if (r0 == 0) goto L_0x0106
            r2 = 0
            if (r5 == 0) goto L_0x0102
            boolean r1 = r4.A2E()
            r0 = 1
            if (r1 != 0) goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            r4.A2A(r3, r2, r0)
        L_0x0106:
            X.5UY r2 = r4.A0G
            goto L_0x00cf
        L_0x0109:
            boolean r0 = r9 instanceof X.C93154nz
            if (r0 == 0) goto L_0x0116
            r1 = r9
            X.4nz r1 = (X.C93154nz) r1
            X.5UY r0 = r1.A0G
            A0t(r1, r0)
            return
        L_0x0116:
            boolean r0 = r9 instanceof X.C93114nv
            if (r0 == 0) goto L_0x0139
            r0 = r9
            X.4nv r0 = (X.C93114nv) r0
            X.34x r6 = r0.A0S
            X.1mV r6 = (X.C30471mV) r6
            android.widget.TextView r2 = r0.A0E
            android.view.ViewGroup r1 = r0.A07
            X.33j r4 = r0.A0M
            X.2re r5 = r0.A04
            X.7Kc r3 = r0.A00
            X.C106805aC.A02(r1, r2, r3, r4, r5, r6)
            X.5UY r1 = r0.A0J
            X.2re r0 = r0.A04
            X.C626936e.A06(r0)
            X.C106805aC.A01(r0, r6, r1)
            return
        L_0x0139:
            boolean r0 = r9 instanceof X.C93074nr
            if (r0 == 0) goto L_0x001a
            r3 = r9
            X.4nr r3 = (X.C93074nr) r3
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r3.A08
            X.5UY r2 = r0.A06
            X.34x r1 = r3.A0S
            X.1mV r1 = (X.C30471mV) r1
            X.2re r0 = r3.A04
            X.C626936e.A06(r0)
            X.C106805aC.A01(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1L():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.4nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.4nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.4o3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.4nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.4nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.4nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: X.4o9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.4oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: X.4o3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.4o9} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cc, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d4, code lost:
        if (r0.BoT() != false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030c, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0317, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0328, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0335, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0369, code lost:
        if (r0 != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x037a, code lost:
        if (r10.A0n.BoT() != false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x037e, code lost:
        if (r10.A2O != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0380, code lost:
        r2 = X.AnonymousClass58V.A02;
        r0 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r4 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a3, code lost:
        X.C18300x5.A13(r4.getContext(), r3, r7);
        r3.setImageDrawable(r2);
        X.C86614Ku.A15(X.C18290x4.A0G(r4), r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c4, code lost:
        X.C162457s7.A0D(r2);
        X.C18300x5.A13(r4.getContext(), r3, r5);
        r3.setImageDrawable(r2);
        X.C86614Ku.A15(X.C18290x4.A0G(r4), r3, com.whatsapp.R.dimen.f6nameremoved);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1M() {
        /*
            r10 = this;
            boolean r0 = r10.A0W
            if (r0 != 0) goto L_0x00f8
            X.34x r1 = r10.getFMessage()
            boolean r0 = r1 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0386
            X.4FG r1 = (X.AnonymousClass4FG) r1
            X.2cm r0 = r1.BDY()
            java.lang.String r1 = r0.A04
        L_0x0014:
            java.lang.String r0 = "MARKETING"
            boolean r9 = r0.equals(r1)
            X.2sr r0 = r10.A0Z
            boolean r0 = r0.A0Y()
            r3 = 0
            if (r0 != 0) goto L_0x01e7
            X.1VX r1 = r10.A0O
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r10 instanceof X.C93204o8
            if (r0 == 0) goto L_0x01e7
            X.1VX r1 = r10.A0O
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01e7
            X.34x r1 = r10.A0S
            X.1mV r1 = (X.C30471mV) r1
            X.1nE r1 = (X.AnonymousClass1nE) r1
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01e7
            X.330 r0 = r1.A04
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x01e7
            X.58V r2 = X.AnonymousClass58V.AVATAR
            r0 = 22
        L_0x0053:
            X.54F r1 = new X.54F
            r1.<init>(r10, r0)
        L_0x0058:
            android.view.View$OnLongClickListener r0 = r10.A2T
            X.5SU r7 = new X.5SU
            r7.<init>(r1, r0, r2, r3)
        L_0x005f:
            X.1VX r1 = r10.A0O
            r0 = 6806(0x1a96, float:9.537E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01e1
            if (r7 == 0) goto L_0x01dd
            X.4QQ r4 = r10.getOrCreateActionButtonContainer()
        L_0x006f:
            if (r4 == 0) goto L_0x00c7
        L_0x0071:
            android.widget.ImageView r0 = r4.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r3 = r4.A01
            r3.setVisibility(r1)
            android.widget.Space r0 = r4.A03
            r0.setVisibility(r1)
            if (r7 == 0) goto L_0x00c7
            X.58V r6 = r7.A02
            android.view.View$OnClickListener r5 = r7.A00
            android.view.View$OnLongClickListener r2 = r7.A01
            boolean r1 = r7.A03
            r0 = 0
            r4.A00 = r6
            r3.setVisibility(r0)
            r3.setOnClickListener(r5)
            r3.setOnLongClickListener(r2)
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L_0x016f;
                case 1: goto L_0x018f;
                case 2: goto L_0x01b6;
                case 3: goto L_0x014f;
                case 4: goto L_0x012e;
                default: goto L_0x009f;
            }
        L_0x009f:
            r2 = 2131232437(0x7f0806b5, float:1.8080983E38)
            if (r1 == 0) goto L_0x00a7
            r2 = 2131232068(0x7f080544, float:1.8080235E38)
        L_0x00a7:
            android.content.Context r1 = r4.getContext()
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A03(r1, r2, r0)
            java.lang.String r0 = "Marketing Opt Out"
            r1 = 2131166597(0x7f070585, float:1.7947444E38)
            r3.setContentDescription(r0)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.C18290x4.A0G(r4)
            X.C86614Ku.A15(r0, r3, r1)
        L_0x00c4:
            r4.A00()
        L_0x00c7:
            r2 = r10
            boolean r0 = r10 instanceof X.C92554ms
            if (r0 == 0) goto L_0x00f9
            X.34x r0 = r10.getFMessage()
        L_0x00d0:
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            java.lang.Long r1 = r0.A00
            if (r1 == 0) goto L_0x00f8
            X.2sH r0 = r2.A1E
            long r3 = r0.A0H()
            long r1 = r1.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f8
            X.4QQ r2 = r10.getOrCreateActionButtonContainer()
            r0 = 21
            X.54F r1 = new X.54F
            r1.<init>(r10, r0)
            android.view.View$OnLongClickListener r0 = r10.A2T
            r2.setupRateButton(r1, r0)
        L_0x00f8:
            return
        L_0x00f9:
            boolean r0 = r10 instanceof X.C92844nM
            if (r0 == 0) goto L_0x0102
            X.34x r0 = r10.A0S
            X.1n9 r0 = (X.AnonymousClass1n9) r0
            goto L_0x00d0
        L_0x0102:
            boolean r0 = r10 instanceof X.C92964ne
            if (r0 == 0) goto L_0x010d
            X.4o9 r2 = (X.C93214o9) r2
            X.1pB r0 = r2.getFMessage()
            goto L_0x00d0
        L_0x010d:
            boolean r0 = r10 instanceof X.AnonymousClass4o2
            if (r0 == 0) goto L_0x0118
            X.4o3 r2 = (X.AnonymousClass4o3) r2
            X.1n2 r0 = r2.getFMessage()
            goto L_0x00d0
        L_0x0118:
            boolean r0 = r10 instanceof X.C92754nC
            if (r0 == 0) goto L_0x0123
            X.34x r0 = r10.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.1pA r0 = (X.C31961pA) r0
            goto L_0x00d0
        L_0x0123:
            boolean r0 = r10 instanceof X.C92724n9
            if (r0 == 0) goto L_0x00f8
            X.34x r0 = r10.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.1nF r0 = (X.AnonymousClass1nF) r0
            goto L_0x00d0
        L_0x012e:
            android.content.res.Resources r2 = X.C18290x4.A0G(r4)
            android.content.Context r1 = r4.getContext()
            r0 = 2131234015(0x7f080cdf, float:1.8084184E38)
            android.graphics.drawable.Drawable r1 = X.C18310x6.A0G(r1, r0)
            X.C162457s7.A0D(r1)
            r5 = 2131886142(0x7f12003e, float:1.9406854E38)
            r0 = 2131165299(0x7f070073, float:1.7944811E38)
            int r0 = r2.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A0A(r2, r1, r0)
            goto L_0x01c4
        L_0x014f:
            r7 = 2131886141(0x7f12003d, float:1.9406852E38)
            android.content.Context r6 = r4.getContext()
            r5 = 2131231715(0x7f0803e3, float:1.8079519E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2130970414(0x7f04072e, float:1.7549537E38)
            r0 = 2131102260(0x7f060a34, float:1.7816953E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A03(r6, r5, r0)
            r1 = 2131165360(0x7f0700b0, float:1.7944935E38)
            goto L_0x01a3
        L_0x016f:
            r7 = 2131886139(0x7f12003b, float:1.9406848E38)
            android.content.Context r6 = r4.getContext()
            r5 = 2131232475(0x7f0806db, float:1.808106E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2130970414(0x7f04072e, float:1.7549537E38)
            r0 = 2131102260(0x7f060a34, float:1.7816953E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A03(r6, r5, r0)
            r1 = 2131167347(0x7f070873, float:1.7948965E38)
            goto L_0x01a3
        L_0x018f:
            r7 = 2131886305(0x7f1200e1, float:1.9407185E38)
            android.content.Context r2 = r4.getContext()
            r1 = 2131232591(0x7f08074f, float:1.8081296E38)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A03(r2, r1, r0)
            r1 = 2131168063(0x7f070b3f, float:1.7950417E38)
        L_0x01a3:
            android.content.Context r0 = r4.getContext()
            X.C18300x5.A13(r0, r3, r7)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.C18290x4.A0G(r4)
            X.C86614Ku.A15(r0, r3, r1)
            goto L_0x00c4
        L_0x01b6:
            r5 = 2131889439(0x7f120d1f, float:1.9413542E38)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231742(0x7f0803fe, float:1.8079574E38)
            android.graphics.drawable.Drawable r2 = X.C18310x6.A0G(r1, r0)
        L_0x01c4:
            X.C162457s7.A0D(r2)
            r1 = 2131166597(0x7f070585, float:1.7947444E38)
            android.content.Context r0 = r4.getContext()
            X.C18300x5.A13(r0, r3, r5)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.C18290x4.A0G(r4)
            X.C86614Ku.A15(r0, r3, r1)
            goto L_0x00c4
        L_0x01dd:
            X.4QQ r4 = r10.A0J
            goto L_0x006f
        L_0x01e1:
            X.4QQ r4 = r10.getOrCreateActionButtonContainer()
            goto L_0x0071
        L_0x01e7:
            r1 = r10
            boolean r5 = r10 instanceof X.C93204o8
            if (r5 == 0) goto L_0x023d
            X.4o8 r1 = (X.C93204o8) r1
            X.8qC r0 = r1.A00
            java.lang.Object r6 = r0.get()
            X.2pQ r6 = (X.C54872pQ) r6
            X.34x r8 = r1.A0S
            X.1mV r8 = (X.C30471mV) r8
            X.1nE r8 = (X.AnonymousClass1nE) r8
            X.2z0 r7 = X.C624134x.A07(r8)
            X.4uZ r1 = r7.A00
            if (r1 == 0) goto L_0x023d
            X.3Lo r0 = r6.A03
            X.3ZH r4 = r0.A01(r1)
            X.2sr r0 = r6.A00
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x023b
            X.4uZ r2 = r0.A0H
        L_0x0214:
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x023d
            boolean r0 = r8.A23()
            r1 = 1
            if (r0 != 0) goto L_0x0227
            X.330 r0 = r8.A04
            if (r0 == 0) goto L_0x023d
            boolean r0 = r0.A06
            if (r0 != r1) goto L_0x023d
        L_0x0227:
            X.5P0 r0 = r6.A05
            boolean r0 = r0.A00(r4, r2)
            if (r0 != 0) goto L_0x023d
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x023d
            X.58V r2 = X.AnonymousClass58V.FUN_STICKER
            r0 = 18
            goto L_0x0053
        L_0x023b:
            r2 = 0
            goto L_0x0214
        L_0x023d:
            if (r9 == 0) goto L_0x026d
            X.8qC r0 = r10.A2C
            java.lang.Object r0 = r0.get()
            X.2m2 r0 = (X.C52782m2) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x026d
            X.34x r0 = r10.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            if (r1 == 0) goto L_0x0267
            X.8qC r0 = r10.A27
            java.lang.Object r0 = r0.get()
            X.2zY r0 = (X.C61012zY) r0
            boolean r3 = r0.A03(r1)
        L_0x0267:
            X.58V r2 = X.AnonymousClass58V.MARKETING_OPT_OUT
            r0 = 19
            goto L_0x0053
        L_0x026d:
            boolean r0 = r10.A16()
            r7 = 0
            if (r0 == 0) goto L_0x0286
            X.67A r0 = X.C86634Kw.A0b(r10)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.BJ3()
            if (r0 != 0) goto L_0x005f
            X.58V r2 = X.AnonymousClass58V.INFO
            r0 = 23
            goto L_0x0053
        L_0x0286:
            r6 = r10
            boolean r4 = r10 instanceof X.C93304oI
            if (r4 == 0) goto L_0x02b6
            X.3Mh r1 = r10.A0b
            X.1Ei r0 = X.C66663Mh.A0q
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x02b6
            X.34x r2 = r10.A0S
            int r1 = r2.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r1, r0)
            if (r0 == 0) goto L_0x02b6
            boolean r1 = r10.A0W
            boolean r0 = X.C627636p.A0s(r2)
            if (r0 == 0) goto L_0x02b6
            if (r1 != 0) goto L_0x02b6
            X.58V r2 = X.AnonymousClass58V.SEARCH
            r0 = 14
            X.5eT r1 = new X.5eT
            r1.<init>(r10, r0)
            goto L_0x0058
        L_0x02b6:
            X.34x r0 = r10.getFMessage()
            int r1 = r0.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r1, r0)
            if (r0 != 0) goto L_0x005f
            if (r4 == 0) goto L_0x02d8
            X.4oI r6 = (X.C93304oI) r6
            boolean r0 = r6.A24()
            if (r0 == 0) goto L_0x005f
        L_0x02ce:
            X.679 r0 = r6.A0n
        L_0x02d0:
            boolean r0 = r0.BoT()
            if (r0 != 0) goto L_0x037c
            goto L_0x005f
        L_0x02d8:
            boolean r0 = r10 instanceof X.C93194o7
            if (r0 == 0) goto L_0x02f0
            X.34x r1 = r10.A0S
            X.1mK r1 = (X.C30361mK) r1
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x02ed
            int r1 = r1.A02
            r0 = 2
            if (r1 == r0) goto L_0x02ed
            goto L_0x005f
        L_0x02ed:
            X.679 r0 = r10.A0n
            goto L_0x02d0
        L_0x02f0:
            boolean r0 = r10 instanceof X.C92544mr
            if (r0 != 0) goto L_0x0374
            boolean r0 = r10 instanceof X.C92604mx
            if (r0 != 0) goto L_0x0374
            boolean r0 = r10 instanceof X.C93214o9
            if (r0 == 0) goto L_0x030f
            X.4o9 r6 = (X.C93214o9) r6
            X.1VX r4 = r6.A0O
            X.3Mh r2 = r6.A0b
            X.1pB r1 = r6.getFMessage()
        L_0x0306:
            X.2hp r0 = r6.A1s
            boolean r0 = X.C627636p.A0U(r2, r4, r1, r0)
            if (r0 == 0) goto L_0x005f
            goto L_0x02ce
        L_0x030f:
            if (r5 == 0) goto L_0x031a
            X.4oC r6 = (X.C93244oC) r6
            boolean r0 = X.C87094Nz.A0j(r6)
            if (r0 == 0) goto L_0x005f
            goto L_0x02ce
        L_0x031a:
            boolean r0 = r10 instanceof X.C92914nZ
            if (r0 != 0) goto L_0x036d
            boolean r0 = r10 instanceof X.C92904nY
            if (r0 == 0) goto L_0x032b
            X.4oC r6 = (X.C93244oC) r6
            boolean r0 = X.C87094Nz.A0j(r6)
            if (r0 == 0) goto L_0x005f
            goto L_0x02ce
        L_0x032b:
            boolean r0 = r10 instanceof X.C92894nX
            if (r0 == 0) goto L_0x0338
            X.4oC r6 = (X.C93244oC) r6
            boolean r0 = X.C87094Nz.A0j(r6)
            if (r0 == 0) goto L_0x005f
            goto L_0x02ce
        L_0x0338:
            boolean r0 = r10 instanceof X.AnonymousClass4o3
            if (r0 == 0) goto L_0x0347
            X.4o3 r6 = (X.AnonymousClass4o3) r6
            X.1VX r4 = r6.A0O
            X.3Mh r2 = r6.A0b
            X.1n2 r1 = r6.getFMessage()
            goto L_0x0306
        L_0x0347:
            boolean r0 = r10 instanceof X.C93154nz
            if (r0 != 0) goto L_0x036d
            boolean r0 = r10 instanceof X.C93114nv
            if (r0 != 0) goto L_0x036d
            boolean r0 = r10 instanceof X.C93074nr
            if (r0 == 0) goto L_0x005f
            X.4nr r6 = (X.C93074nr) r6
            boolean r0 = r6 instanceof X.C92654n2
            if (r0 != 0) goto L_0x005f
            boolean r0 = r6 instanceof X.C93234oB
            if (r0 != 0) goto L_0x005f
            X.1VX r4 = r6.A0O
            X.3Mh r2 = r6.A0b
            X.34x r1 = r6.A0S
            X.2hp r0 = r6.A1s
            boolean r0 = X.C627636p.A0U(r2, r4, r1, r0)
            if (r0 == 0) goto L_0x005f
            goto L_0x02ce
        L_0x036d:
            X.1VX r4 = r10.A0O
            X.3Mh r2 = r10.A0b
            X.34x r1 = r10.A0S
            goto L_0x0306
        L_0x0374:
            X.679 r0 = r10.A0n
            boolean r0 = r0.BoT()
            if (r0 == 0) goto L_0x005f
        L_0x037c:
            boolean r0 = r10.A2O
            if (r0 != 0) goto L_0x005f
            X.58V r2 = X.AnonymousClass58V.FORWARD
            r0 = 20
            goto L_0x0053
        L_0x0386:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1M():void");
    }

    public void A1N() {
    }

    public void A1O(int i) {
        int i2;
        int i3;
        int i4;
        Resources resources;
        int i5;
        this.A01 = i;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A13;
        int i6 = 0;
        if (conversationRowParticipantHeaderMainView != null) {
            conversationRowParticipantHeaderMainView.setVisibility(AnonymousClass001.A08(A1y(this.A1T, getFMessage(), i, this.A0W) ? 1 : 0));
        }
        AnonymousClass4VB r0 = this.A1D;
        if (r0 != null) {
            AnonymousClass5YS.A00(r0.A05, Integer.valueOf(i));
        }
        int extraBottomPadding = getExtraBottomPadding();
        if (this instanceof AnonymousClass482) {
            i6 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            i2 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int A002 = (int) ((C86604Kt.A00(getContext()) * 4.0f) / 3.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        AnonymousClass679 r1 = this.A0n;
        if (r1.BoF()) {
            i3 = r1.B4s(getContext());
            i4 = r1.B4s(getContext());
        } else {
            i3 = A002;
            i4 = dimensionPixelSize;
        }
        int i7 = this.A01;
        if (i7 != 1) {
            if (i7 == 2) {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            } else if (i7 != 3) {
                if (this.A2L) {
                    i6 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
                }
                setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, i4 - i2);
                resources = getResources();
                i5 = R.dimen.f6nameremoved;
            } else {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i4 - i2) + extraBottomPadding);
            }
            resources = getResources();
            i5 = R.dimen.f6nameremoved;
        } else {
            if (this.A2L) {
                i6 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            }
            setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            resources = getResources();
            i5 = R.dimen.f6nameremoved;
        }
        setMinimumHeight(AnonymousClass4L0.A01(resources, i5));
    }

    public final void A1Q(int i) {
        AnonymousClass677 r0 = this.A0m;
        boolean z = false;
        if (r0 != null) {
            if (this.A0I.A02(getFMessage(), r0.getContainerType())) {
                if (this.A0E == null) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    this.A0E = linearLayout;
                    linearLayout.setOrientation(0);
                    addView(this.A0E);
                    this.A0E.bringToFront();
                }
                AnonymousClass4FP messageReactions = getMessageReactions();
                C55162pu messageCommentInfo = getMessageCommentInfo();
                C104525Rh r3 = this.A0I;
                LinearLayout linearLayout2 = this.A0E;
                C624134x fMessage = getFMessage();
                if (messageReactions == null) {
                    messageReactions = new C111495iB(this.A0Z, Collections.emptyList());
                }
                if (i == 28 || i == -1) {
                    z = true;
                }
                C117085rM A002 = C117085rM.A00(this, 29);
                C117085rM A003 = C117085rM.A00(this, 30);
                C18270x1.A14(linearLayout2, fMessage);
                r3.A00(linearLayout2, messageReactions, fMessage, A002, z);
                r3.A01(linearLayout2, messageCommentInfo, A003);
                return;
            }
        }
        LinearLayout linearLayout3 = this.A0E;
        if (linearLayout3 != null) {
            C104525Rh r32 = this.A0I;
            C624134x fMessage2 = getFMessage();
            C111495iB r5 = new C111495iB(this.A0Z, Collections.emptyList());
            C117085rM A004 = C117085rM.A00(this, 27);
            C117085rM A005 = C117085rM.A00(this, 28);
            C162457s7.A0J(fMessage2, 1);
            r32.A00(linearLayout3, r5, fMessage2, A004, false);
            r32.A01(linearLayout3, (C55162pu) null, A005);
        }
    }

    public void A1R(int i, boolean z) {
        ImageView imageView;
        ScaleAnimation A0Q2;
        if (!(this instanceof C93204o8)) {
            if (i == 0) {
                imageView = this.A0F;
            } else if (i != 1) {
                imageView = this.A0E;
            } else {
                imageView = this.A0D;
            }
            if (imageView != null) {
                if (z) {
                    A0Q2 = C86634Kw.A0Q(0.0f, 1.0f);
                    A0Q2.setInterpolator(new OvershootInterpolator());
                    imageView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6AM(imageView, this, i, 0));
                } else {
                    A0Q2 = C86634Kw.A0Q(1.0f, 0.0f);
                    imageView.setVisibility(0);
                    A0Q2.setAnimationListener(new C188988zo(imageView, 3, this));
                    if (!this.A0n.BHf(getFMessage()) || i != 2) {
                        A0Q2.setInterpolator(new AnticipateInterpolator());
                    }
                }
                A0Q2.setDuration(500);
                imageView.startAnimation(A0Q2);
            }
        }
    }

    public void A1T(Bundle bundle) {
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_WIDTH", getWidth());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_HEIGHT", getHeight());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE", this.A01);
        AnonymousClass677 r1 = this.A0m;
        if (r1 != null) {
            bundle.putInt("EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT", r1.BAS(getFMessage()));
        }
    }

    public void A1Z(ViewGroup viewGroup, Runnable runnable, int i, boolean z) {
        if (z) {
            View view = this.A06;
            if (view == null) {
                view = C86604Kt.A0F(C18280x3.A0D(this), R.layout.f8nameremoved);
                this.A06 = view;
            }
            TextView A092 = AnonymousClass002.A09(view, R.id.action_btn);
            A092.setText(i);
            C106905aM.A04(A092);
            if (this.A06.getParent() != null) {
                viewGroup.removeView(this.A06);
            }
            C86624Kv.A15(this.A06, viewGroup);
            C18320x8.A16(this.A06, runnable, this, 40);
            return;
        }
        View view2 = this.A06;
        if (view2 != null) {
            viewGroup.removeView(view2);
            this.A06 = null;
        }
    }

    public final void A1b(TextView textView, C624134x r6, int i) {
        if (r6.A1B) {
            AnonymousClass2z0 r1 = r6.A1J;
            if (r1.A02 && !(r1.A00 instanceof AnonymousClass1fS)) {
                int i2 = R.color.f5nameremoved;
                if (i == R.drawable.broadcast_status_icon) {
                    i2 = R.color.f5nameremoved;
                }
                Drawable A042 = C107335b8.A04(getContext(), i, i2);
                if (C102805Ki.A00(this.A0M)) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C131666dx(A042, this.A0M), (Drawable) null);
                    return;
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A042, (Drawable) null, (Drawable) null, (Drawable) null);
                    return;
                }
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r0.A00 == Integer.MIN_VALUE) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1d(com.whatsapp.TextEmojiLabel r25, X.C624134x r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            r24 = this;
            r3 = r24
            if (r29 == 0) goto L_0x00fe
            float r21 = r3.getTextFontSize()
        L_0x0008:
            X.677 r2 = r3.A0m
            r4 = r26
            if (r2 == 0) goto L_0x00fb
            int r5 = r2.BAS(r4)
        L_0x0012:
            int r1 = r4.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r1, r0)
            if (r0 == 0) goto L_0x00f2
            r1 = 1
            if (r5 != r1) goto L_0x00f2
            r0 = 308(0x134, float:4.32E-43)
            X.8GU r13 = new X.8GU
            r13.<init>(r1, r0)
        L_0x0026:
            android.content.Context r10 = r3.getContext()
            X.5Xz r6 = r3.A1c
            X.5Y0 r15 = r3.A1R
            X.33i r14 = r3.A0L
            X.2y5 r5 = r3.A1o
            r0 = 2
            X.760 r11 = new X.760
            r11.<init>(r3, r0)
            byte r1 = r4.A1I
            boolean r0 = r3.A2N
            r12 = r25
            r19 = r27
            r22 = r28
            r23 = r0
            r20 = r1
            r17 = r5
            r18 = r4
            r16 = r6
            X.7IU r7 = X.C107315b6.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.066 r0 = r12.A06
            if (r0 == 0) goto L_0x005b
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1
            if (r1 != r0) goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            if (r2 == 0) goto L_0x00ef
            java.lang.Class<X.5OL> r0 = X.AnonymousClass5OL.class
            java.lang.Object r6 = r2.B5x(r0)
            X.5OL r6 = (X.AnonymousClass5OL) r6
        L_0x0066:
            java.lang.Object r5 = r7.A00
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r0 = r7.A01
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0094
            r2 = 0
            if (r1 == 0) goto L_0x00e7
            X.066 r0 = r12.A06
            if (r0 != 0) goto L_0x00e7
            X.1VX r1 = r3.A0O
            X.33i r0 = r3.A0L
            X.C107295b4.A07(r12, r0, r1)
            r12.setFocusable(r2)
            r12.setClickable(r2)
            r12.setLongClickable(r2)
        L_0x008d:
            java.lang.CharSequence r0 = r3.A1E(r5)
            X.C86664Kz.A1T(r12, r0)
        L_0x0094:
            if (r6 == 0) goto L_0x00bf
            X.3Ex r10 = r3.A0t
            X.3Lo r9 = r3.A1H
            X.3Lq r8 = r3.A1V
            X.2sr r7 = r3.A0Z
            X.2sD r2 = r3.A1y
            X.1VX r1 = r3.A0O
            X.2ss r0 = r3.A0N
            r15 = r0
            r16 = r9
            r17 = r1
            r18 = r8
            r19 = r4
            r20 = r2
            r13 = r7
            r14 = r10
            boolean r0 = X.C107315b6.A0A(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x00bf
            X.8Fx r0 = new X.8Fx
            r0.<init>(r12, r3, r4)
            r6.A00(r12, r0, r4, r5)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            X.C86654Ky.A13(r3)
        L_0x00c4:
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0102
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r4.A1s(r0)
            if (r0 == 0) goto L_0x0102
            X.5rC r1 = r3.A0Q
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0102
            r1.A04()
            r3.getContext()
            java.lang.String r0 = "premiumMessageInflatePlaceHolders"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00e7:
            r12.setFocusable(r2)
            r0 = 0
            r12.setAccessibilityHelper(r0)
            goto L_0x008d
        L_0x00ef:
            r6 = 0
            goto L_0x0066
        L_0x00f2:
            r0 = 768(0x300, float:1.076E-42)
            X.8GU r13 = new X.8GU
            r13.<init>(r5, r0)
            goto L_0x0026
        L_0x00fb:
            r5 = 0
            goto L_0x0012
        L_0x00fe:
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0008
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1d(com.whatsapp.TextEmojiLabel, X.34x, java.lang.String, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.reactions.ReactionsBottomSheetDialogFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1f(X.AnonymousClass4FP r6, X.C95814uZ r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0008
            java.lang.String r0 = "ConversationRow/onReactionViewClicked null message reactions."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0007:
            return
        L_0x0008:
            android.app.Activity r4 = X.C86614Ku.A0A(r5)
            X.03q r4 = (X.C003203q) r4
            if (r4 == 0) goto L_0x0007
            boolean r0 = r7 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0040
            X.C626936e.A06(r7)
            java.util.List r3 = r5.getAllMessages()
            X.8qC r0 = r5.A2B
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C48062eH) r1
            java.lang.Class<X.3LI> r0 = X.AnonymousClass3LI.class
            r1.A02(r0)
            X.C626936e.A06(r7)
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r2 = new com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet
            r2.<init>()
            r2.A0C = r3
            X.0df r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "newsletter_reaction_sheet"
        L_0x003c:
            r2.A1O(r1, r0)
            return
        L_0x0040:
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = r5.A1D(r6, r7)
            X.0df r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "reactionsheet"
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1f(X.4FP, X.4uZ):void");
    }

    public void A1h(C95814uZ r7) {
        boolean equals;
        C105365Uq r3;
        AnonymousClass3ZH A0A2;
        ImageView imageView;
        ImageView imageView2;
        if (this instanceof C93184o6) {
            C93184o6 r4 = (C93184o6) this;
            C624134x r1 = r4.A0S;
            if (!r1.A1J.A02) {
                UserJid A0o2 = r1.A0o();
                if (r7.equals(A0o2)) {
                    r4.A0K.A08(r4.A0J, r4.A1H.A01(A0o2));
                    return;
                }
                return;
            } else if (r4.A0Z.A0a(r7)) {
                r3 = r4.A0K;
                A0A2 = C86634Kw.A0V(r4.A0Z);
                imageView = r4.A0J;
            } else {
                return;
            }
        } else if (this instanceof C93074nr) {
            C93074nr r2 = (C93074nr) this;
            if (r2 instanceof C93234oB) {
                C93234oB r22 = (C93234oB) r2;
                C30721mu r5 = (C30721mu) ((C30471mV) r22.A0S);
                AnonymousClass2z0 r12 = r5.A1J;
                if (!r12.A02 && !r5.A24()) {
                    C95814uZ r42 = r12.A00;
                    boolean A0K2 = C627336j.A0K(r42);
                    if (A0K2) {
                        r42 = r5.A0n();
                    }
                    if (r7.equals(r42)) {
                        if (A0K2) {
                            imageView2 = r22.A06;
                        } else {
                            imageView2 = r22.A07;
                        }
                        r22.A08.A08(imageView2, r22.A0t.A0A(r42));
                    }
                }
                if (r5.A0z() != null) {
                    C95804uY r13 = r5.A0z().A01;
                    r3 = r22.A08;
                    A0A2 = r22.A0t.A0A(r13);
                    imageView = r22.A07;
                } else {
                    return;
                }
            } else {
                C624134x r14 = r2.A0S;
                if (r14.A1J.A02) {
                    equals = r2.A0Z.A0a(r7);
                } else {
                    equals = r7.equals(r14.A0o());
                }
                if (equals) {
                    r2.A1G();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        r3.A08(imageView, A0A2);
    }

    public void A1j(C624134x r5) {
        this.A29.get();
        C162457s7.A0J(r5, 0);
        boolean A002 = C57322tS.A00(r5);
        if (!C627636p.A0g(r5) || A002) {
            C86604Kt.A1A(this.A0L);
            return;
        }
        if (this.A0L == null) {
            TextView textView = (TextView) C86664Kz.A0g(C18280x3.A0D(this), R.layout.f8nameremoved);
            this.A0L = textView;
            ViewGroup viewGroup = this.A08;
            viewGroup.addView(textView, viewGroup.indexOfChild(this.A0K));
        }
        boolean z = r5.A1J.A02;
        int i = R.style.f12nameremoved;
        if (z) {
            i = R.style.f12nameremoved;
        }
        AnonymousClass0Y9.A06(this.A0L, i);
        this.A0L.setVisibility(0);
    }

    public void A1s(boolean z) {
        int i;
        this.A2L = z;
        WaTextView waTextView = this.A0i;
        if (z) {
            if (waTextView == null) {
                WaTextView waTextView2 = new WaTextView(getContext());
                this.A0i = waTextView2;
                C106905aM.A04(waTextView2);
                this.A0i.setId(R.id.conversation_row_date_divider);
                AnonymousClass0x2.A0q(getContext(), this.A0i, R.color.f5nameremoved);
                this.A0i.setBackgroundResource(R.drawable.date_balloon_normal);
                this.A0i.setGravity(17);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                int A092 = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, dimensionPixelSize);
                marginLayoutParams.bottomMargin = A092;
                if (this instanceof AnonymousClass482) {
                    marginLayoutParams.bottomMargin = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, A092);
                }
                addView(this.A0i, marginLayoutParams);
                waTextView = this.A0i;
                this.A0C = waTextView;
            }
            waTextView.setText(C107565bW.A0E(this.A0M, getFMessage().A0K));
            this.A0i.setTextSize(this.A0y.A01(getResources()));
            waTextView = this.A0i;
            i = 0;
        } else if (waTextView != null) {
            i = 8;
        } else {
            return;
        }
        waTextView.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x031c, code lost:
        if (r1 != 0) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0616, code lost:
        if (r0 != null) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023d, code lost:
        if (r1 != 0) goto L_0x023f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1t(boolean r27) {
        /*
            r26 = this;
            r5 = r26
            X.34x r4 = r5.getFMessage()
            r3 = 0
            if (r27 == 0) goto L_0x000e
            r5.A11()
            r5.A2P = r3
        L_0x000e:
            int r0 = r4.A08
            if (r0 == 0) goto L_0x005a
            X.34x r0 = r5.getFMessage()
            r10 = 8
            int r0 = r0.A08
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1U(r0, r10)
            if (r0 == 0) goto L_0x005a
            boolean r0 = r5.A2P
            if (r0 != 0) goto L_0x005a
            X.1VX r1 = r5.A0O
            r0 = 4900(0x1324, float:6.866E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x005a
            X.34x r9 = r5.getFMessage()
            X.1me r1 = r9.A1T
            r8 = 1
            if (r1 == 0) goto L_0x0058
            int r0 = r1.A00
            if (r0 != r8) goto L_0x0058
            X.2sH r11 = r5.A1E
            long r1 = r1.A01
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            long r6 = r11.A0H()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r0 = 0
            r9.A1T = r0
            int r1 = r9.A08
            int r0 = ~r10
            r0 = r0 & r1
            r9.A08 = r0
        L_0x0058:
            r5.A2P = r8
        L_0x005a:
            X.2z0 r2 = r4.A1J
            r5.setTag(r2)
            android.view.ViewGroup r0 = r5.A0A
            int r7 = X.C86664Kz.A0A(r0)
            X.4VB r8 = r5.A1D
            if (r8 == 0) goto L_0x007b
            X.08M r6 = r8.A07
            X.34x r0 = X.C86664Kz.A1H(r6)
            if (r0 == r4) goto L_0x007b
            if (r0 == 0) goto L_0x06dc
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x06dc
        L_0x007b:
            boolean r0 = r5 instanceof X.AnonymousClass4o4
            if (r0 == 0) goto L_0x05f1
            r0 = r4
            X.1n7 r0 = (X.C30791n7) r0
            X.39W r6 = r0.A00
            if (r6 == 0) goto L_0x05f1
            int r1 = r6.A00
            r0 = 3
            if (r1 != r0) goto L_0x05f1
            java.lang.String r1 = "review_order"
            java.lang.String r0 = r6.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05f1
        L_0x0097:
            X.2Hv r12 = r5.getFailedMessageBundle()
            java.util.List r0 = r12.A00
            int r0 = r0.size()
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r10 = 0
            android.widget.ImageView r0 = r5.A0C
            if (r1 == 0) goto L_0x05e1
            if (r0 != 0) goto L_0x0120
            android.widget.ImageView r1 = X.C86614Ku.A0H(r5)
            r5.A0C = r1
            r0 = 2131430079(0x7f0b0abf, float:1.8481849E38)
            r1.setId(r0)
            android.widget.ImageView r6 = r5.A0C
            android.content.Context r1 = r5.getContext()
            r0 = 2131890773(0x7f121255, float:1.9416247E38)
            X.C18300x5.A13(r1, r6, r0)
            android.widget.ImageView r0 = r5.A0C
            X.C107295b4.A02(r0)
            android.widget.ImageView r0 = r5.A0C
            X.C86664Kz.A1R(r0)
            android.widget.ImageView r1 = r5.A0C
            r0 = 2131232451(0x7f0806c3, float:1.8081012E38)
            r1.setImageResource(r0)
            android.widget.ImageView r6 = r5.A0C
            android.content.Context r1 = r5.getContext()
            r0 = 2131100172(0x7f06020c, float:1.7812718E38)
            X.C86634Kw.A14(r1, r6, r0)
            android.content.res.Resources r1 = X.C18290x4.A0G(r5)
            r0 = 2131166064(0x7f070370, float:1.7946363E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView r0 = r5.A0C
            r5.addView(r0, r1, r1)
            android.widget.ImageView r11 = r5.A0C
            android.content.Context r16 = r5.getContext()
            X.3Wi r14 = r5.A0X
            X.5Ul r13 = r5.A0a
            X.4FS r9 = r5.A25
            X.33m r8 = r5.A0h
            X.2sq r6 = r5.A0q
            X.3Lv r1 = r5.A1I
            X.33f r0 = r5.A1P
            X.1se r15 = new X.1se
            r25 = r9
            r24 = r12
            r23 = r4
            r22 = r0
            r21 = r1
            r20 = r6
            r19 = r8
            r18 = r13
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.setOnClickListener(r15)
        L_0x0120:
            android.widget.ImageView r6 = r5.A0G
            if (r6 == 0) goto L_0x0127
            r6.setVisibility(r7)
        L_0x0127:
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x0596
            X.33j r0 = r5.A0M
            X.C107555bV.A05(r5, r0, r3, r3)
        L_0x0130:
            r5.A1i(r4)
            r7 = -1
            r5.A1Q(r7)
            if (r6 == 0) goto L_0x01a5
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x01a5
            int r9 = r4.A0D
            int r8 = r5.A19(r9)
            int r1 = r5.A1A(r9)
            if (r1 != 0) goto L_0x058c
            r0 = r10
        L_0x014a:
            X.C05040Rr.A00(r0, r6)
            int r0 = r5.A01
            if (r8 == r0) goto L_0x018d
            if (r27 != 0) goto L_0x0584
            if (r0 == 0) goto L_0x0584
            r0 = 13
            int r0 = X.AnonymousClass358.A00(r9, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0584
            X.4OD r9 = new X.4OD
            r9.<init>(r6, r8)
            r0 = 400(0x190, double:1.976E-321)
            X.C86614Ku.A1K(r9, r0)
            r6.startAnimation(r9)
        L_0x016e:
            android.content.Context r11 = r6.getContext()
            int r9 = r4.A0D
            byte r12 = r4.A1I
            r0 = 13
            int r0 = X.AnonymousClass358.A00(r9, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x056b
            r1 = 2131890771(0x7f121253, float:1.9416243E38)
            if (r12 != 0) goto L_0x018a
            r1 = 2131890766(0x7f12124e, float:1.9416233E38)
        L_0x018a:
            X.C18300x5.A13(r11, r6, r1)
        L_0x018d:
            boolean r0 = X.C627636p.A0l(r4)
            if (r0 == 0) goto L_0x01a3
            int r0 = r4.A0D
            r1 = 4
            int r0 = X.AnonymousClass358.A00(r0, r1)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x01a3
            r6.setVisibility(r1)
        L_0x01a3:
            r5.A01 = r8
        L_0x01a5:
            boolean r0 = r5.A0W
            boolean r0 = r5.A20(r4, r0)
            if (r0 == 0) goto L_0x01ba
            X.3LP r1 = r5.A1T
            X.4uZ r0 = r2.A00
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 == 0) goto L_0x0566
            r5.setupChatPSAView(r4)
        L_0x01ba:
            r5.A1M()
            X.7Dg r8 = r5.A15
            boolean r6 = r5.A0W
            X.34x r1 = r5.getFMessage()
            boolean r0 = X.C627636p.A0s(r1)
            if (r0 == 0) goto L_0x0544
            if (r6 != 0) goto L_0x0544
            int r1 = r1.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r8 = X.C18280x3.A1U(r1, r0)
            r6 = 2131889443(0x7f120d23, float:1.941355E38)
            r1 = 2131889443(0x7f120d23, float:1.941355E38)
            r0 = 2131232246(0x7f0805f6, float:1.8080596E38)
            if (r8 == 0) goto L_0x01e9
            r6 = 2131889442(0x7f120d22, float:1.9413548E38)
            r1 = 2131886167(0x7f120057, float:1.9406905E38)
            r0 = 2131232248(0x7f0805f8, float:1.80806E38)
        L_0x01e9:
            X.7Ke r13 = new X.7Ke
            r13.<init>(r6, r1, r0)
        L_0x01ee:
            r9 = -2
            r8 = 2
            r6 = 1
            android.widget.TextView r0 = r5.A0N
            if (r13 == 0) goto L_0x0530
            if (r0 != 0) goto L_0x025f
            int r0 = r5.getTopAttributeTextAnchorId()
            android.view.View r14 = r5.findViewById(r0)
            if (r14 == 0) goto L_0x025f
            android.content.Context r1 = r5.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r5.A0I = r0
            android.content.Context r0 = r5.getContext()
            com.whatsapp.TextEmojiLabel r12 = new com.whatsapp.TextEmojiLabel
            r12.<init>(r0)
            r5.A0N = r12
            r11 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131102573(0x7f060b6d, float:1.7817588E38)
            int r1 = r1.getColor(r0)
            android.widget.TextView r0 = r5.A0N
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r8)
            r5.setTopAttributeTextViewAttributes(r12, r11, r1, r0)
            android.widget.LinearLayout r11 = r5.A0I
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r0 = r5.A13
            if (r0 == 0) goto L_0x023f
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0240
        L_0x023f:
            r0 = 0
        L_0x0240:
            r5.A1a(r11, r0)
            android.widget.LinearLayout r1 = r5.A0I
            android.widget.TextView r0 = r5.A0N
            r1.addView(r0, r9, r9)
            android.widget.LinearLayout r12 = r5.A0I
            android.view.ViewGroup r11 = X.C86664Kz.A0l(r14)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r7, r9)
            r0 = 3
            r1.gravity = r0
            int r0 = r11.indexOfChild(r14)
            r11.addView(r12, r0, r1)
        L_0x025f:
            android.widget.TextView r0 = r5.A0N
            if (r0 == 0) goto L_0x02ad
            int r0 = r13.A02
            int r12 = r13.A01
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.C58152un.A09
            r11.append(r1)
            java.lang.String r0 = X.C86624Kv.A0b(r5, r0)
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r1, r11)
            android.widget.TextView r0 = r5.A0N
            r0.setText(r1)
            android.widget.LinearLayout r11 = r5.A0I
            if (r11 == 0) goto L_0x028a
            android.content.Context r1 = r11.getContext()
            int r0 = r13.A00
            X.C18300x5.A13(r1, r11, r0)
        L_0x028a:
            X.33j r0 = r5.A0M
            boolean r1 = X.C102805Ki.A00(r0)
            android.widget.TextView r0 = r5.A0N
            if (r1 == 0) goto L_0x052b
            r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r12, r3)
        L_0x0297:
            android.content.Context r1 = r5.getContext()
            r0 = 2131102572(0x7f060b6c, float:1.7817586E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            android.widget.TextView r1 = r5.A0N
            if (r0 == 0) goto L_0x0528
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L_0x02aa:
            X.AnonymousClass0Y9.A01(r0, r1)
        L_0x02ad:
            int r0 = r5.getTopAttributeTextAnchorId()
            android.view.View r13 = r5.findViewById(r0)
            X.2mS r1 = r4.A0z()
            X.2kg r11 = r4.A0s()
            if (r13 == 0) goto L_0x0502
            android.widget.LinearLayout r0 = r5.A0I
            if (r0 == 0) goto L_0x0502
            if (r1 == 0) goto L_0x04fc
            X.1VX r1 = r5.A0O
            r0 = 4683(0x124b, float:6.562E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x04fc
        L_0x02cf:
            com.whatsapp.TextEmojiLabel r0 = r5.A0d
            if (r0 != 0) goto L_0x033e
            android.content.Context r1 = r5.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r5.A0H = r0
            android.content.Context r1 = r5.getContext()
            com.whatsapp.TextEmojiLabel r0 = new com.whatsapp.TextEmojiLabel
            r0.<init>(r1)
            r5.A0d = r0
            X.64J r11 = r5.A0G
            android.content.Context r1 = r5.getContext()
            com.whatsapp.TextEmojiLabel r0 = r5.A0d
            X.5YB r0 = r11.Azt(r1, r0)
            r5.A0g = r0
            com.whatsapp.TextEmojiLabel r12 = r5.A0d
            r11 = 2131431773(0x7f0b115d, float:1.8485285E38)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131101304(0x7f060678, float:1.7815014E38)
            int r1 = r1.getColor(r0)
            r5.getContext()
            android.graphics.Typeface r0 = X.C106905aM.A02()
            r5.setTopAttributeTextViewAttributes(r12, r11, r1, r0)
            android.widget.LinearLayout r11 = r5.A0H
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r0 = r5.A13
            if (r0 == 0) goto L_0x031e
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x031f
        L_0x031e:
            r0 = 0
        L_0x031f:
            r5.A1a(r11, r0)
            android.widget.LinearLayout r1 = r5.A0H
            com.whatsapp.TextEmojiLabel r0 = r5.A0d
            r1.addView(r0, r9, r9)
            android.widget.LinearLayout r12 = r5.A0H
            android.view.ViewGroup r11 = X.C86664Kz.A0l(r13)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r7, r9)
            r0 = 3
            r1.gravity = r0
            int r0 = r11.indexOfChild(r13)
            r11.addView(r12, r0, r1)
        L_0x033e:
            X.679 r0 = r5.A0n
            boolean r0 = r0.Bo2()
            if (r0 == 0) goto L_0x0452
            r5.setClipToPadding(r3)
            r5.setClipChildren(r3)
            android.view.View r0 = r5.A07
            if (r0 != 0) goto L_0x03e5
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r5)
            r0 = 2131626078(0x7f0e085e, float:1.8879382E38)
            android.view.View r0 = r1.inflate(r0, r10)
            r5.A07 = r0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setClipToPadding(r3)
            android.view.View r0 = r5.A07
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setClipChildren(r3)
            android.view.View r1 = r5.A07
            r0 = 2131433557(0x7f0b1855, float:1.8488903E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86644Kx.A0M(r1, r0)
            r5.A0f = r1
            float r0 = r5.getNameInGroupTextFontSize()
            r1.setTextSize(r0)
            com.whatsapp.TextEmojiLabel r0 = r5.A0f
            X.C106905aM.A04(r0)
            android.view.View r1 = r5.A07
            r0 = 2131432905(0x7f0b15c9, float:1.848758E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86644Kx.A0M(r1, r0)
            r5.A0e = r1
            float r0 = r5.getNameInGroupTextFontSize()
            r1.setTextSize(r0)
            com.whatsapp.TextEmojiLabel r0 = r5.A0e
            X.C106905aM.A04(r0)
            android.view.View r1 = r5.A07
            r0 = 2131428218(0x7f0b037a, float:1.8478074E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r1, r0)
            float r1 = r5.getNameInGroupTextFontSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r10.setTextSize(r1)
            X.33j r0 = r5.A0M
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x04f8
            java.lang.String r0 = "▶"
        L_0x03b4:
            r10.setText(r0)
            android.view.View r1 = r5.A07
            r0 = 2131431516(0x7f0b105c, float:1.8484763E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r1, r0)
            r5.A0M = r0
            android.view.View r1 = r5.A07
            r0 = 2131428758(0x7f0b0596, float:1.847917E38)
            android.widget.ImageView r11 = X.AnonymousClass0x9.A0F(r1, r0)
            X.33j r10 = r5.A0M
            android.content.Context r1 = r5.getContext()
            r0 = 2131231273(0x7f080229, float:1.8078622E38)
            X.C18270x1.A0d(r1, r11, r10, r0)
            android.view.View r1 = r5.A07
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r7, r9)
            r5.addView(r1, r0)
            android.view.View r0 = r5.A07
            r5.A0C = r0
        L_0x03e5:
            X.4uZ r9 = r2.A00
            boolean r1 = X.C627336j.A0K(r9)
            int r11 = X.C18280x3.A01(r1)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x04c3
            boolean r0 = r9 instanceof X.C95804uY
            if (r0 != 0) goto L_0x04c3
            android.content.Context r1 = r5.getContext()
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r10 = r1.getString(r0)
            X.5ZU r1 = r5.A0v
            X.3Ex r0 = r5.A0t
            java.lang.String r11 = X.AnonymousClass5ZU.A01(r0, r1, r9)
        L_0x040a:
            com.whatsapp.TextEmojiLabel r0 = r5.A0f
            r1 = 0
            r0.A0K(r1, r10)
            com.whatsapp.TextEmojiLabel r0 = r5.A0e
            r0.A0K(r1, r11)
            android.view.View r1 = r5.A07
            r0 = 2131433560(0x7f0b1858, float:1.848891E38)
            android.view.View r9 = X.C06560Yg.A02(r1, r0)
            android.content.Context r7 = r9.getContext()
            r1 = 2131893946(0x7f121eba, float:1.9422683E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r10, r11, r8)
            X.C86624Kv.A0h(r7, r9, r0, r1)
            android.widget.TextView r9 = r5.A0M
            X.2sH r8 = r5.A1E
            X.33j r7 = r5.A0M
            long r0 = r4.A0K
            long r0 = r8.A0I(r0)
            java.lang.String r0 = X.C107565bW.A0F(r7, r0, r3)
            r9.setText(r0)
            android.widget.TextView r8 = r5.A0M
            X.2sH r7 = r5.A1E
            X.33j r3 = r5.A0M
            long r0 = r4.A0K
            long r0 = r7.A0I(r0)
            java.lang.String r0 = X.C107565bW.A0F(r3, r0, r6)
            r8.setContentDescription(r0)
        L_0x0452:
            X.4uZ r3 = r2.A00
            boolean r0 = r3 instanceof X.C95804uY
            if (r0 == 0) goto L_0x04c2
            int r1 = r4.A0D
            r0 = 16
            if (r1 == r0) goto L_0x04c2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x04c2
            boolean r0 = r4 instanceof X.C31971pB
            if (r0 != 0) goto L_0x04c2
            boolean r0 = r4 instanceof X.C30721mu
            if (r0 != 0) goto L_0x04c2
            boolean r0 = r4 instanceof X.C30441mS
            if (r0 != 0) goto L_0x04c2
            X.8qC r0 = r5.A2E
            java.lang.Object r0 = r0.get()
            X.5UP r0 = (X.AnonymousClass5UP) r0
            X.1VX r1 = r0.A01
            r0 = 4760(0x1298, float:6.67E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x04c2
            X.8qC r0 = r5.A2H
            java.lang.Object r7 = r0.get()
            X.2qQ r7 = (X.C55482qQ) r7
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r3, r0)
            X.4uY r3 = (X.C95804uY) r3
            X.4uY r0 = r7.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 != 0) goto L_0x049c
            r7.A04(r6)
            r7.A00 = r3
        L_0x049c:
            java.util.Set r0 = r7.A07
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x04c2
            java.util.concurrent.ConcurrentHashMap r5 = r7.A08
            boolean r0 = r5.contains(r5)
            if (r0 != 0) goto L_0x04c2
            long r2 = android.os.SystemClock.uptimeMillis()
            X.1VX r1 = r7.A05
            r0 = 4648(0x1228, float:6.513E-42)
            long r0 = X.C56952sp.A06(r1, r0)
            long r2 = r2 + r0
            X.AnonymousClass0x2.A1J(r4, r5, r2)
            r7.A01()
            r7.A02()
        L_0x04c2:
            return
        L_0x04c3:
            if (r1 == 0) goto L_0x04e3
            X.5ZU r7 = r5.A0v
            X.3Ex r1 = r5.A0t
            X.4uZ r0 = r4.A0n()
            X.3ZH r0 = X.C64773Ex.A00(r1, r0)
            java.lang.String r10 = r7.A0R(r0, r11, r3)
            X.5ZU r1 = r5.A0v
            X.3Ex r0 = r5.A0t
            X.3ZH r0 = r0.A0A(r9)
            java.lang.String r11 = r1.A0R(r0, r11, r3)
            goto L_0x040a
        L_0x04e3:
            X.5ZU r1 = r5.A0v
            X.3Ex r0 = r5.A0t
            java.lang.String r10 = X.AnonymousClass5ZU.A01(r0, r1, r9)
            android.content.Context r1 = r5.getContext()
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r11 = r1.getString(r0)
            goto L_0x040a
        L_0x04f8:
            java.lang.String r0 = "◀"
            goto L_0x03b4
        L_0x04fc:
            boolean r0 = r5.A1z(r11)
            if (r0 != 0) goto L_0x02cf
        L_0x0502:
            com.whatsapp.TextEmojiLabel r0 = r5.A0d
            if (r0 == 0) goto L_0x051f
            android.widget.LinearLayout r1 = r5.A0H
            if (r1 == 0) goto L_0x051f
            r1.removeView(r0)
            android.view.ViewGroup r0 = X.C86664Kz.A0l(r1)
            r0.removeView(r1)
            android.widget.LinearLayout r0 = r5.A0H
            r0.setOnClickListener(r10)
            r5.A0d = r10
            r5.A0H = r10
            r5.A0g = r10
        L_0x051f:
            android.widget.LinearLayout r0 = r5.A0I
            if (r0 == 0) goto L_0x033e
            r0.setOnClickListener(r10)
            goto L_0x033e
        L_0x0528:
            r0 = 0
            goto L_0x02aa
        L_0x052b:
            r0.setCompoundDrawablesWithIntrinsicBounds(r12, r3, r3, r3)
            goto L_0x0297
        L_0x0530:
            if (r0 == 0) goto L_0x02ad
            android.widget.LinearLayout r1 = r5.A0I
            r1.removeView(r0)
            android.view.ViewGroup r0 = X.C86664Kz.A0l(r1)
            r0.removeView(r1)
            r5.A0N = r10
            r5.A0I = r10
            goto L_0x02ad
        L_0x0544:
            X.2U8 r0 = r1.A0c
            if (r0 == 0) goto L_0x0563
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0563
            X.1VX r1 = r8.A00
            r0 = 1307(0x51b, float:1.831E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0563
            r1 = 2131888407(0x7f120917, float:1.9411448E38)
            r0 = 2131233957(0x7f080ca5, float:1.8084066E38)
            X.7Ke r13 = new X.7Ke
            r13.<init>(r1, r1, r0)
            goto L_0x01ee
        L_0x0563:
            r13 = 0
            goto L_0x01ee
        L_0x0566:
            r5.setupUsernameInGroupViewContainer(r4)
            goto L_0x01ba
        L_0x056b:
            r0 = 5
            int r0 = X.AnonymousClass358.A00(r9, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            r1 = 2131890737(0x7f121231, float:1.9416174E38)
            if (r0 != 0) goto L_0x018a
            r0 = 4
            r1 = 2131890750(0x7f12123e, float:1.94162E38)
            if (r9 != r0) goto L_0x018a
            r1 = 2131890775(0x7f121257, float:1.9416251E38)
            goto L_0x018a
        L_0x0584:
            r6.clearAnimation()
            r6.setImageResource(r8)
            goto L_0x016e
        L_0x058c:
            android.content.Context r0 = r5.getContext()
            android.content.res.ColorStateList r0 = X.AnonymousClass0Y8.A07(r0, r1)
            goto L_0x014a
        L_0x0596:
            android.graphics.Rect r0 = r5.A0d
            int r1 = r0.left
            X.679 r9 = r5.A0n
            android.content.Context r0 = r5.getContext()
            int r7 = r9.BAQ(r0, r1)
            android.content.Context r0 = r5.getContext()
            int r1 = r9.BAN(r0, r1)
            android.content.res.Resources r8 = r5.getResources()
            r0 = 2131165459(0x7f070113, float:1.7945136E38)
            int r8 = r8.getDimensionPixelSize(r0)
            android.widget.ImageView r0 = r5.A0C
            if (r0 == 0) goto L_0x05d0
            boolean r0 = r9.BHd()
            if (r0 == 0) goto L_0x05d7
            boolean r0 = X.C87094Nz.A0g(r5)
            if (r0 == 0) goto L_0x05d7
            int r0 = r9.B4q()
            int r0 = X.AnonymousClass001.A0C(r8, r0, r3)
            int r1 = r1 + r0
        L_0x05d0:
            X.33j r0 = r5.A0M
            X.C107555bV.A05(r5, r0, r7, r1)
            goto L_0x0130
        L_0x05d7:
            int r0 = r9.B4q()
            int r0 = X.AnonymousClass001.A0C(r8, r0, r3)
            int r7 = r7 + r0
            goto L_0x05d0
        L_0x05e1:
            if (r0 == 0) goto L_0x05e8
            r5.removeView(r0)
            r5.A0C = r10
        L_0x05e8:
            android.widget.ImageView r6 = r5.A0G
            if (r6 == 0) goto L_0x0127
            r6.setVisibility(r3)
            goto L_0x0127
        L_0x05f1:
            boolean r0 = r5.A0W
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0097
            X.34x r6 = r5.getFMessage()
            X.34x r8 = r6.A0w()
            if (r8 == 0) goto L_0x06d3
            byte r1 = r8.A1I
            r0 = 95
            if (r1 > r0) goto L_0x06d3
            if (r1 < 0) goto L_0x06d3
            android.view.ViewGroup r0 = r5.A09
            if (r0 != 0) goto L_0x0618
            r0 = 2131432816(0x7f0b1570, float:1.84874E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0J(r5, r0)
            r5.A09 = r0
            if (r0 == 0) goto L_0x0097
        L_0x0618:
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r5.A0B
            if (r0 != 0) goto L_0x067c
            android.content.Context r12 = r5.getContext()
            X.1VX r1 = r5.A0O
            boolean r11 = X.AnonymousClass0x2.A1Y(r12, r1)
            r10 = 2131625869(0x7f0e078d, float:1.8878958E38)
            android.view.ViewGroup r9 = r5.A09
            r0 = 3783(0xec7, float:5.301E-42)
            int r1 = r1.A0N(r0)
            if (r1 == r11) goto L_0x06aa
            r0 = 2
            if (r1 == r0) goto L_0x06aa
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r12)
            android.view.View r9 = r0.inflate(r10, r9, r11)
        L_0x0641:
            r0 = 2131432815(0x7f0b156f, float:1.8487398E38)
            android.widget.FrameLayout r1 = X.C86654Ky.A0L(r9, r0)
            r5.A0B = r1
            android.graphics.drawable.Drawable r0 = r5.getInnerFrameForegroundDrawable()
            r1.setForeground(r0)
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.view.View r1 = X.C06560Yg.A02(r9, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView) r1
            r5.A14 = r1
            r0 = 2131432827(0x7f0b157b, float:1.8487422E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r1, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = r5.A14
            r0 = 2131432813(0x7f0b156d, float:1.8487394E38)
            android.widget.TextView r9 = X.AnonymousClass002.A09(r1, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = r5.A14
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r1, r0)
            float r0 = r5.getNameInGroupTextFontSize()
            X.C106905aM.A05(r10, r9, r1, r0)
        L_0x067c:
            X.67A r0 = X.C86634Kw.A0b(r5)
            if (r0 == 0) goto L_0x0699
            X.4eZ r13 = r0.getActivity()
            android.widget.FrameLayout r0 = r5.A0B
            r14 = 1
            X.549 r9 = new X.549
            r10 = r5
            r11 = r8
            r12 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r0.setOnClickListener(r9)
            android.widget.FrameLayout r0 = r5.A0B
            A0q(r0, r5)
        L_0x0699:
            X.2pL r0 = r5.A1t
            boolean r0 = r0.A03(r6)
            if (r0 == 0) goto L_0x06b6
            X.2pL r1 = r5.A1t
            android.widget.FrameLayout r0 = r5.A0B
            r1.A00(r0, r6)
            goto L_0x0097
        L_0x06aa:
            com.whatsapp.WaFrameLayout r0 = X.AnonymousClass5VA.A00(r12)
            if (r9 == 0) goto L_0x06b4
            r9.addView(r0)
            goto L_0x0641
        L_0x06b4:
            r9 = r0
            goto L_0x0641
        L_0x06b6:
            X.5mL r10 = r5.A1C
            android.widget.FrameLayout r9 = r5.A0B
            X.2z0 r0 = r6.A1J
            X.4uZ r6 = r0.A00
            X.33O r1 = r5.A1v
            X.5Uq r12 = r5.getContactPhotosLoader()
            boolean r0 = r0.A02
            r17 = 1
            r11 = r9
            r13 = r6
            r14 = r8
            r15 = r1
            r16 = r0
            r10.A0H(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0097
        L_0x06d3:
            android.view.ViewGroup r0 = r5.A09
            if (r0 == 0) goto L_0x0097
            r0.setVisibility(r7)
            goto L_0x0097
        L_0x06dc:
            X.08M r0 = r8.A08
            r1 = 0
            X.AnonymousClass5YS.A00(r0, r1)
            X.08M r0 = r8.A05
            X.AnonymousClass5YS.A00(r0, r1)
            r6.A0H(r4)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1t(boolean):void");
    }

    public boolean A1u() {
        return true;
    }

    public boolean A1v() {
        return this.A2Q;
    }

    public boolean A1w() {
        return true;
    }

    public boolean A1x() {
        if (this instanceof C93214o9) {
            C93214o9 r1 = (C93214o9) this;
            if (r1 instanceof C92954nd) {
                return false;
            }
            return C86614Ku.A1Z(r1.getFMessage());
        } else if (this instanceof C92894nX) {
            return C86614Ku.A1Z((C30471mV) this.A0S);
        } else {
            if (this instanceof AnonymousClass4o3) {
                return C86614Ku.A1Z(((AnonymousClass4o3) this).getFMessage());
            }
            if (this instanceof C93154nz) {
                return C86614Ku.A1Z((C30471mV) this.A0S);
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2 == 7) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A20(X.C624134x r5, boolean r6) {
        /*
            r4 = this;
            byte r2 = r5.A1I
            r0 = 21
            if (r2 == r0) goto L_0x000e
            r0 = 22
            if (r2 == r0) goto L_0x000e
            r1 = 7
            r0 = 1
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3 = 0
            if (r0 == 0) goto L_0x0043
            X.2z0 r2 = r5.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0020
            X.679 r0 = r4.A0n
            boolean r0 = r0.Bp3()
            if (r0 == 0) goto L_0x0038
        L_0x0020:
            X.4uZ r0 = r2.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.C57322tS.A01(r5)
            if (r0 == 0) goto L_0x0038
        L_0x002e:
            if (r6 != 0) goto L_0x0038
            X.679 r0 = r4.A0n
            boolean r0 = r0.BHd()
            if (r0 != 0) goto L_0x0042
        L_0x0038:
            X.3LP r1 = r4.A1T
            X.4uZ r0 = r2.A00
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r3 = 1
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A20(X.34x, boolean):boolean");
    }

    public int getCollapseType() {
        return this.A01;
    }

    public int getConfigHash() {
        return this.A00;
    }

    public TextView getDateView() {
        return this.A0K;
    }

    public ViewGroup getDateWrapper() {
        return this.A08;
    }

    public float getDividerFontSize() {
        return this.A0y.A01(getResources());
    }

    public List getHighlightTerms() {
        AnonymousClass677 r0 = this.A0m;
        if (r0 == null) {
            return null;
        }
        return r0.getSearchTerms();
    }

    public int getMessageCount() {
        return 1;
    }

    public float getTextFontSize() {
        AnonymousClass5ST r2 = this.A0y;
        return r2.A03(getResources(), r2.A02);
    }

    public int getVerticalSpaceUsedByReactionsView() {
        LinearLayout linearLayout = this.A0E;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getHeight() - getReactionsViewVerticalOverlap();
    }

    public void onMeasure(int i, int i2) {
        int mode;
        if (this.A02 != 0) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int i3 = this.A02;
            if (mode2 == 0) {
                mode = Integer.MIN_VALUE;
            } else {
                i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
                mode = View.MeasureSpec.getMode(i2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        super.onMeasure(i, i2);
    }

    public void setPressed(boolean z) {
        if (!this.A2M) {
            super.setPressed(z);
        }
    }

    public void setRecipientNameVisibility(boolean z) {
        View view = this.A07;
        if (view != null && this.A0e != null) {
            View findViewById = view.findViewById(R.id.bullet);
            int A082 = AnonymousClass001.A08(z ? 1 : 0);
            findViewById.setVisibility(A082);
            this.A0e.setVisibility(A082);
        }
    }

    public void setSelected(boolean z) {
        AnonymousClass4NY r0 = this.A12;
        if (r0 != null) {
            r0.setRowSelected(z);
        }
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.4b3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r18v2, types: [X.4cA] */
    /* JADX WARNING: type inference failed for: r18v3, types: [X.4cB] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0182, code lost:
        if (r1 != null) goto L_0x0165;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTextWithUrlSpanOverrides(android.text.Spannable r27, com.whatsapp.TextEmojiLabel r28, X.C624134x r29) {
        /*
            r26 = this;
            r4 = r26
            android.content.Context r9 = r4.getContext()
            if (r9 == 0) goto L_0x0185
            X.5Nm r0 = r4.A1B
            r6 = r27
            r10 = r29
            int r17 = r0.A00(r9, r6, r10)
            int r2 = r6.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r0 = 0
            java.lang.Object[] r8 = r6.getSpans(r0, r2, r1)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            r5 = r28
            if (r8 == 0) goto L_0x00f5
            int r3 = r8.length
            r7 = 0
        L_0x0025:
            if (r7 >= r3) goto L_0x00f7
            r0 = r8[r7]
            if (r0 == 0) goto L_0x00f1
            java.lang.String r12 = r0.getURL()
            if (r12 == 0) goto L_0x00f1
            int r2 = r6.getSpanStart(r0)
            int r1 = r6.getSpanEnd(r0)
            int r16 = r6.getSpanFlags(r0)
            X.9Zz r0 = r4.A1l
            X.4b3 r13 = r0.A02(r9, r10, r12)
            if (r13 != 0) goto L_0x007b
            X.5Wn r0 = r4.A1A
            X.4b3 r13 = r0.A01(r9, r10, r12)
            if (r13 != 0) goto L_0x007b
            X.5JB r14 = r4.A19
            r0 = 2
            X.C162457s7.A0J(r10, r0)
            java.lang.String r11 = "order"
            r0 = 1
            X.C162457s7.A0J(r11, r0)
            boolean r0 = r12.startsWith(r11)
            if (r0 == 0) goto L_0x00ba
            X.3Wi r0 = r14.A01
            r15 = r0
            X.33i r11 = r14.A03
            X.4Fm r0 = r14.A02
            X.4cB r13 = new X.4cB
            r21 = r0
            r22 = r14
            r23 = r11
            r24 = r10
            r25 = r12
            r18 = r13
            r19 = r9
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
        L_0x007b:
            X.2PX r14 = r4.A0o
            X.1VX r11 = r14.A01
            r0 = 355(0x163, float:4.97E-43)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x009f
            X.65p r0 = r14.A03
            boolean r0 = r0.BJ8()
            if (r0 == 0) goto L_0x009f
            X.2ep r0 = r14.A00
            boolean r0 = r0.A01(r12)
            if (r0 == 0) goto L_0x009f
            r11 = 0
            X.5YR r0 = new X.5YR
            r0.<init>(r14, r11)
            r13.A02 = r0
        L_0x009f:
            java.lang.Class<X.54J> r0 = X.AnonymousClass54J.class
            java.lang.Object[] r15 = r6.getSpans(r2, r1, r0)
            X.C162457s7.A0D(r15)
            X.54J[] r15 = (X.AnonymousClass54J[]) r15
            int r14 = r15.length
            r12 = 0
            if (r14 == 0) goto L_0x00ec
            r11 = 1
            r13.A05 = r11
        L_0x00b1:
            r0 = r15[r12]
            r0.A02 = r11
            int r12 = r12 + 1
            if (r12 >= r14) goto L_0x00ec
            goto L_0x00b1
        L_0x00ba:
            X.7Kg r13 = r4.A17
            X.677 r0 = r4.A0m
            r15 = r0
            java.lang.String r11 = "commands"
            r0 = 1
            X.C162457s7.A0J(r11, r0)
            boolean r0 = r12.startsWith(r11)
            if (r0 == 0) goto L_0x00e5
            X.3Wi r14 = r13.A00
            X.33i r11 = r13.A02
            X.4Fm r0 = r13.A01
            X.4cA r13 = new X.4cA
            r21 = r0
            r22 = r15
            r23 = r11
            r24 = r12
            r18 = r13
            r19 = r9
            r20 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x007b
        L_0x00e5:
            X.5NQ r0 = r4.A18
            X.4b3 r13 = r0.A00(r9, r10, r12)
            goto L_0x007b
        L_0x00ec:
            r0 = r16
            r6.setSpan(r13, r2, r1, r0)
        L_0x00f1:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x00f5:
            r3 = 0
            goto L_0x010e
        L_0x00f7:
            if (r3 <= 0) goto L_0x010e
            X.066 r0 = r5.A06
            if (r0 != 0) goto L_0x010e
            X.1VX r1 = r4.A0O
            X.33i r0 = r4.A0L
            X.C107295b4.A07(r5, r0, r1)
            r0 = 0
            r5.setFocusable(r0)
            r5.setClickable(r0)
            r5.setLongClickable(r0)
        L_0x010e:
            if (r17 <= 0) goto L_0x0180
            android.view.ViewGroup r0 = r4.A0A
            r9 = 1
            if (r0 != 0) goto L_0x0138
            r0 = 2131434114(0x7f0b1a82, float:1.8490033E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0J(r4, r0)
            r4.A0A = r0
            if (r0 == 0) goto L_0x0138
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r4)
            r1 = 2131626166(0x7f0e08b6, float:1.887956E38)
            android.view.ViewGroup r0 = r4.A0A
            r2.inflate(r1, r0, r9)
            android.view.ViewGroup r1 = r4.A0A
            r0 = 2131434113(0x7f0b1a81, float:1.849003E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r1, r0)
            X.C106905aM.A04(r0)
        L_0x0138:
            android.view.ViewGroup r0 = r4.A0A
            if (r0 == 0) goto L_0x0159
            r8 = 0
            r0.setVisibility(r8)
            android.view.ViewGroup r1 = r4.A0A
            r0 = 2131434113(0x7f0b1a81, float:1.849003E38)
            android.widget.TextView r7 = X.AnonymousClass002.A09(r1, r0)
            if (r3 <= r9) goto L_0x0174
            X.33j r2 = r4.A0M
            r1 = 2131755346(0x7f100152, float:1.9141569E38)
            r0 = r17
            java.lang.String r0 = X.C86604Kt.A0q(r2, r0, r8, r1)
        L_0x0156:
            r7.setText(r0)
        L_0x0159:
            X.4QQ r2 = r4.A0J
            if (r2 == 0) goto L_0x016a
            X.58V r1 = X.AnonymousClass58V.FORWARD
            X.58V r0 = r2.A00
            if (r1 != r0) goto L_0x016a
            android.widget.ImageView r1 = r2.A01
        L_0x0165:
            r0 = 8
            r1.setVisibility(r0)
        L_0x016a:
            if (r3 <= 0) goto L_0x0185
            java.lang.CharSequence r0 = r4.A1E(r6)
            X.C86664Kz.A1T(r5, r0)
            return
        L_0x0174:
            android.content.Context r1 = r4.getContext()
            r0 = 2131894185(0x7f121fa9, float:1.9423168E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0156
        L_0x0180:
            android.view.ViewGroup r1 = r4.A0A
            if (r1 == 0) goto L_0x016a
            goto L_0x0165
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.setTextWithUrlSpanOverrides(android.text.Spannable, com.whatsapp.TextEmojiLabel, X.34x):void");
    }

    public final void setupUIForUserNameInGroup(C624134x r8, AnonymousClass5YB r9, ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView, AnonymousClass3ZH r11, int i, C95814uZ r13) {
        C95814uZ r1;
        Context context;
        int i2;
        int A042;
        View.OnClickListener onClickListener;
        String str;
        if ((r13 instanceof UserJid) && (r1 = r8.A1J.A00) != null) {
            if (C627336j.A0K(r1)) {
                C60842zG A0J2 = C86624Kv.A0J(this.A1L, (C28011fL) r1, (UserJid) r13);
                if (A0J2 != null) {
                    A042 = C86624Kv.A00(getResources(), A0J2);
                }
                context = getContext();
                i2 = R.color.f5nameremoved;
                A042 = AnonymousClass0Y8.A04(context, i2);
            } else {
                if (((C52782m2) this.A2C.get()).A02(r8)) {
                    context = getContext();
                    i2 = R.color.f5nameremoved;
                    A042 = AnonymousClass0Y8.A04(context, i2);
                }
                context = getContext();
                i2 = R.color.f5nameremoved;
                A042 = AnonymousClass0Y8.A04(context, i2);
            }
            TextEmojiLabel textEmojiLabel = r9.A02;
            textEmojiLabel.setTextColor(A042);
            textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
            C106905aM.A04(textEmojiLabel);
            if (C627336j.A0L(getFMessage().A0o())) {
                conversationRowParticipantHeaderMainView.setOnClickListener((View.OnClickListener) null);
                conversationRowParticipantHeaderMainView.setBackground((Drawable) null);
            } else {
                if (this.A0O.A0X(1825)) {
                    onClickListener = new C109345eT(this, 13);
                } else {
                    onClickListener = this.A2R;
                }
                conversationRowParticipantHeaderMainView.setOnClickListener(onClickListener);
                conversationRowParticipantHeaderMainView.setBackgroundResource(R.drawable.selector_orange_gradient);
            }
            A0q(conversationRowParticipantHeaderMainView, this);
            AnonymousClass4VB r5 = this.A1D;
            if (r5 != null) {
                AnonymousClass5ZU r3 = this.A0v;
                AnonymousClass7HU A0B2 = r3.A0B(r11, i);
                String str2 = A0B2.A01;
                C998258i r12 = A0B2.A00;
                String A0G2 = r3.A0G(r12, r11, i);
                if (C998258i.PUSH_NAME == r12 && i == 7) {
                    str2 = r3.A0Q(r11, R.string.f11nameremoved);
                }
                if (!TextUtils.isEmpty(A0G2)) {
                    Context context2 = r3.A02.A00;
                    Object[] A0M2 = AnonymousClass002.A0M();
                    AnonymousClass000.A16(str2, A0G2, A0M2);
                    str2 = context2.getString(R.string.f11nameremoved, A0M2);
                }
                if (str2 != null) {
                    str = str2.trim();
                } else {
                    str = "";
                }
                AnonymousClass5YS.A00(r5.A06, str);
                AnonymousClass5YS.A00(r5.A08, Integer.valueOf(A042));
            }
        }
    }

    /* access modifiers changed from: private */
    public String getMoreInfoString() {
        Context context;
        int i;
        String str;
        AnonymousClass3ZC r3;
        C42312Np messagePrivacyStateFromDbOnMainThread = getMessagePrivacyStateFromDbOnMainThread();
        if (messagePrivacyStateFromDbOnMainThread == null || (r3 = messagePrivacyStateFromDbOnMainThread.A00) == null) {
            context = getContext();
            i = R.string.f11nameremoved;
        } else {
            C623134n r0 = new C623134n(r3, 3, 1);
            context = getContext();
            switch (r0.A01()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 7:
                case 8:
                    i = R.string.f11nameremoved;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    str = null;
                    break;
                default:
                    i = R.string.f11nameremoved;
                    break;
            }
            i = R.string.f11nameremoved;
        }
        str = context.getString(i);
        return C107555bV.A01(this.A0M, str);
    }

    private void setupChatPSAView(C624134x r9) {
        TextEmojiLabel A0M2 = C86644Kx.A0M(this, R.id.name_in_group_tv);
        if (A0M2 != null) {
            AnonymousClass5YB Azt = this.A0G.Azt(getContext(), A0M2);
            AnonymousClass3ZH A0A2 = this.A0t.A0A(r9.A0n());
            Azt.A07(Azt.A03.A0B(A0A2, 1), A0A2, (List) null, 1, Azt.A0C(A0A2));
            int color = getResources().getColor(R.color.f5nameremoved);
            TextEmojiLabel textEmojiLabel = Azt.A02;
            textEmojiLabel.setTextColor(color);
            textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
            C106905aM.A04(textEmojiLabel);
            textEmojiLabel.setVisibility(0);
        }
    }

    public ReactionsBottomSheetDialogFragment A1D(AnonymousClass4FP r4, C95814uZ r5) {
        C626936e.A06(r5);
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
        reactionsBottomSheetDialogFragment.A0J = r5;
        reactionsBottomSheetDialogFragment.A07 = r4;
        reactionsBottomSheetDialogFragment.A0P = false;
        reactionsBottomSheetDialogFragment.A0D = null;
        return reactionsBottomSheetDialogFragment;
    }

    public CharSequence A1E(CharSequence charSequence) {
        List highlightTerms;
        if (TextUtils.isEmpty(charSequence) || (highlightTerms = getHighlightTerms()) == null || highlightTerms.isEmpty()) {
            return charSequence;
        }
        return C86644Kx.A0d(getContext(), this.A0M, C107075ae.A00, charSequence, highlightTerms);
    }

    public void A1F() {
        AnonymousClass677 r1;
        if (A1v() && (r1 = this.A0m) != null && !r1.BFW()) {
            r1.Bpx(getFMessage());
            C71333bw.A00(this.A25, this, getFMessage(), 12);
            C47052cd r2 = this.A1f;
            r2.A01 = r2.A04.A0H();
            r2.A02 = C18280x3.A0Y();
            r2.A00 = 1;
            r2.A03 = r2.A06.A00();
            C47052cd r22 = this.A1f;
            if (r22.A03 && r22.A00 == 1) {
                r22.A00 = 2;
                r22.A00(0);
            }
        }
    }

    public void A1G() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A2W;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A2W;
        if (!handler.hasMessages(0, runnable2)) {
            Message obtain = Message.obtain(handler, runnable2);
            obtain.what = 0;
            obtain.obj = runnable2;
            obtain.sendToTarget();
        }
    }

    public void A1K() {
        UserJid userJid;
        StringBuilder A0o2;
        String str;
        C624134x fMessage = getFMessage();
        C627636p.A0E(fMessage);
        AnonymousClass00M r2 = (AnonymousClass00M) C86614Ku.A0A(this);
        if (r2 != null) {
            if (C627636p.A0d(fMessage)) {
                userJid = ((C31341o8) fMessage).A00;
            } else {
                AnonymousClass2z0 r1 = fMessage.A1J;
                if (!C627336j.A0K(r1.A00) || (r1.A02 && fMessage.A0D != 6)) {
                    userJid = null;
                } else {
                    userJid = C66493Lq.A00(fMessage);
                }
            }
            String str2 = "";
            if (userJid == null) {
                A0o2 = AnonymousClass001.A0o();
                str = "conversation/getdialogitems/remote_resource is null! ";
            } else {
                C95814uZ r3 = fMessage.A1J.A00;
                if (!C627336j.A0K(r3) || !C627336j.A0L(userJid) || this.A1L.A0B(r3)) {
                    C86654Ky.A1G(r2, this.A1L.A03(userJid, AnonymousClass32V.A00(r3)), 77);
                    return;
                } else {
                    A0o2 = AnonymousClass001.A0o();
                    str = "conversation/getdialogitems/remote_resource is lid ";
                }
            }
            A0o2.append(str);
            A0o2.append(C627636p.A0E(fMessage));
            if (fMessage.A0i() == 0) {
                str2 = AnonymousClass000.A0X(fMessage.A13(), AnonymousClass000.A0l(" data="));
            }
            C18260x0.A1L(A0o2, str2);
        }
    }

    public final void A1U(View view) {
        C89654ea A4J;
        UserJid A0o2 = getFMessage().A0o();
        if (A0o2 != null && (A4J = C89654ea.A4J(getContext())) != null) {
            if (C155477ey.A00(A0o2)) {
                AnonymousClass8F2 r3 = new AnonymousClass8F2(view, A4J, this, A0o2);
                ((C112185jK) ((C1229766o) this.A28.get())).A08.A00(A4J, r3, C996357k.INVOKE, C18290x4.A0b());
                return;
            }
            A1V(view, A4J, A0o2);
        }
    }

    public final void A1X(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, ImageView imageView, int i, int i2, int i3) {
        imageView.setLayoutParams(layoutParams);
        C18300x5.A13(imageView.getContext(), imageView, i);
        C107555bV.A05(imageView, this.A0M, 0, i2);
        if (viewGroup != null) {
            viewGroup.addView(imageView, C154307cx.A00(new View[]{this.A0F, this.A0D, this.A0E, null}, i3));
            viewGroup.setClipChildren(false);
        }
    }

    public final void A1a(LinearLayout linearLayout, boolean z) {
        int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        linearLayout.setOrientation(0);
        if (z) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (X.C998258i.A09 != r5.A00) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1e(X.AnonymousClass5YB r11, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r12, X.AnonymousClass3ZH r13, int r14, boolean r15) {
        /*
            r10 = this;
            X.34x r0 = r10.getFMessage()
            boolean r2 = X.C57322tS.A01(r0)
            X.8qC r0 = r10.A2C
            java.lang.Object r1 = r0.get()
            X.2m2 r1 = (X.C52782m2) r1
            X.34x r0 = r10.getFMessage()
            boolean r0 = r1.A02(r0)
            r6 = r13
            r8 = r14
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = "P Message"
            X.58i r0 = X.C998258i.VERIFIED_NAME
            X.7HU r5 = new X.7HU
            r5.<init>(r0, r1)
        L_0x0025:
            r7 = 0
            boolean r9 = r13.A0W()
            r4 = r11
            r4.A07(r5, r6, r7, r8, r9)
            if (r15 == 0) goto L_0x005b
            if (r2 != 0) goto L_0x005b
            r0 = 7
            if (r0 != r14) goto L_0x003c
            X.58i r1 = X.C998258i.PUSH_NAME
            X.58i r0 = r5.A00
            r4 = 1
            if (r1 == r0) goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            X.5mL r3 = r10.A1C
            X.58i r1 = r5.A00
            r0 = 2131433382(0x7f0b17a6, float:1.8488548E38)
            com.whatsapp.TextEmojiLabel r2 = X.C86644Kx.A0M(r10, r0)
            X.5ZU r0 = r3.A06
            java.lang.String r1 = r0.A0G(r1, r13, r14)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x005c
            r0 = 8
        L_0x0056:
            r2.setVisibility(r0)
            r12.A00 = r4
        L_0x005b:
            return
        L_0x005c:
            r2.A0K(r7, r1)
            r0 = 0
            goto L_0x0056
        L_0x0061:
            X.5ZU r0 = r10.A0v
            X.7HU r5 = r0.A0B(r13, r14)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1e(X.5YB, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView, X.3ZH, int, boolean):void");
    }

    public final void A1g(C125096Fh r7, int i) {
        int A0I2;
        int A0I3;
        View view = (View) r7.getParent();
        View A022 = C06560Yg.A02(r7, i);
        r7.layout(view.getPaddingLeft(), view.getPaddingTop(), AnonymousClass001.A0I(view), AnonymousClass4L0.A04(r7, view.getPaddingTop()));
        int top = A022.getTop();
        int bottom = A022.getBottom();
        if (C102805Ki.A00(this.A0M)) {
            A0I2 = r7.getPaddingLeft();
            A0I3 = r7.getPaddingLeft() + A022.getWidth();
        } else {
            A0I2 = AnonymousClass001.A0I(r7) - A022.getWidth();
            A0I3 = AnonymousClass001.A0I(r7);
        }
        A022.layout(A0I2, top, A0I3, bottom);
    }

    public void A1i(C624134x r3) {
        A1Y(getDateWrapper(), getDateView(), r3);
    }

    public void A1k(C624134x r5) {
        Class cls = C181678n9.class;
        Activity A002 = C621633u.A00(getContext());
        Object obj = null;
        if (A002 != null) {
            if (cls.isAssignableFrom(A002.getClass())) {
                obj = cls.cast(A002);
            } else if (A002 instanceof C89644eZ) {
                C08310eF A0D2 = ((C003203q) A002).getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0D2 instanceof ConversationFragment) {
                    ConversationFragment conversationFragment = (ConversationFragment) A0D2;
                    obj = cls.isAssignableFrom(conversationFragment.A02.getClass()) ? cls.cast(conversationFragment.A02) : null;
                }
            }
        }
        C181678n9 r2 = (C181678n9) obj;
        if (r2 != null) {
            r2.BJZ(r5);
        }
    }

    public void A1l(C624134x r5) {
        String A0R2;
        LinearLayout linearLayout;
        int i;
        C53042mS A0z2 = r5.A0z();
        C51972kg A0s2 = r5.A0s();
        if (A0z2 != null && this.A0O.A0X(4683)) {
            String str = A0z2.A03;
            this.A0d.A0E();
            TextEmojiLabel textEmojiLabel = this.A0d;
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.f11nameremoved);
            }
            textEmojiLabel.setText(str);
            C109475eg.A00(this.A0H, this, r5, 5);
            linearLayout = this.A0I;
            i = 6;
        } else if (A1z(A0s2) && (A0R2 = this.A0v.A0R(A0s2.A00, -1, true)) != null && !TextUtils.isEmpty(A0R2)) {
            this.A0g.A02.setText(A0R2);
            this.A0g.A02.A0E();
            C109475eg.A00(this.A0H, this, r5, 7);
            linearLayout = this.A0I;
            i = 8;
        } else {
            return;
        }
        C109475eg.A00(linearLayout, this, r5, i);
    }

    public void A1m(C624134x r3) {
        AnonymousClass677 r0;
        if (A1v() && (r0 = this.A0m) != null) {
            this.A12.setRowSelected(r0.Bqw(r3));
        }
    }

    public void A1n(C624134x r6) {
        byte b;
        int i;
        int i2;
        ViewGroup A0J2 = C86644Kx.A0J(this, R.id.main_layout);
        if (A0J2 != null) {
            if (AnonymousClass000.A1W(r6.A0z()) && this.A0O.A0X(4860) && !this.A0O.A0X(4683)) {
                i = R.string.f11nameremoved;
                i2 = 9;
            } else if (!A1z(r6.A0s()) || !((b = r6.A1I) == 0 || b == 1 || b == 9 || b == 3)) {
                View view = this.A06;
                if (view != null) {
                    A0J2.removeView(view);
                    this.A06 = null;
                    return;
                }
                return;
            } else {
                i = R.string.f11nameremoved;
                i2 = 10;
            }
            A1Z(A0J2, new C71333bw(this, i2, r6), i, true);
        }
    }

    public final void A1o(C624134x r10) {
        if (r10.A0z() != null) {
            C95804uY r4 = r10.A0z().A01;
            long j = (long) r10.A0z().A00;
            Integer A062 = AnonymousClass36E.A06(r10.A1J.A00);
            ((NewsletterLinkLauncher) this.A2F.get()).A03(getContext(), r4, AnonymousClass59N.FORWARDED_MESSAGE, C18310x6.A06(A062), j);
        }
    }

    public void A1p(C624134x r1, int i) {
        setFMessage(r1);
        A1Q(i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A1q(X.C624134x r5, boolean r6) {
        /*
            r4 = this;
            X.34x r3 = r4.getFMessage()
            boolean r2 = X.C18300x5.A1W(r3, r5)
            r4.setFMessage(r5)
            if (r2 != 0) goto L_0x000f
            if (r6 == 0) goto L_0x002f
        L_0x000f:
            boolean r0 = X.AnonymousClass2z0.A0C(r5)
            if (r0 == 0) goto L_0x002c
            X.8qC r0 = r4.A2H
            java.lang.Object r1 = r0.get()
            X.2qQ r1 = (X.C55482qQ) r1
            X.2z0 r0 = X.C624134x.A07(r3)
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x002c
            java.util.concurrent.ConcurrentHashMap r0 = r1.A08
            r0.remove(r3)
        L_0x002c:
            r4.A1t(r2)
        L_0x002f:
            X.677 r2 = r4.A0m
            if (r2 == 0) goto L_0x0051
            boolean r0 = r2.BFW()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r4.A1u()
            if (r0 == 0) goto L_0x0051
            r4.A1J()
            X.4NY r1 = r4.A12
            boolean r0 = r2.BIB(r5)
        L_0x0048:
            r1.setRowSelected(r0)
        L_0x004b:
            X.5RR r0 = r4.A1n
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L_0x005c
        L_0x0051:
            android.view.View r0 = r4.A0D
            X.C86604Kt.A1A(r0)
            X.4NY r1 = r4.A12
            if (r1 == 0) goto L_0x004b
            r0 = 0
            goto L_0x0048
        L_0x005c:
            r1.clear()     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93314oJ.A1q(X.34x, boolean):void");
    }

    public boolean A1y(AnonymousClass3LP r7, C624134x r8, int i, boolean z) {
        if (!A20(r8, z)) {
            return false;
        }
        if (i <= 1 || r8.A0H != 0 || r8.A1I != 0 || C627636p.A0p(r8) || C627636p.A0s(r8) || C57362tW.A00(r7, r8.A1J.A00)) {
            return true;
        }
        return false;
    }

    public boolean A21(AnonymousClass2z0 r2) {
        return getFMessage().A1J.equals(r2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A1n.A01();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A2S.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(isPressed());
        for (FrameLayout frameLayout : getInnerFrameLayouts()) {
            if (frameLayout != null) {
                frameLayout.setPressed(isPressed());
                frameLayout.setForeground(getInnerFrameForegroundDrawable());
            }
        }
    }

    public C105365Uq getContactPhotosLoader() {
        Activity A002 = C621633u.A00(getContext());
        if (A002 instanceof C835648x) {
            return ((C835648x) A002).getContactPhotosLoader();
        }
        return null;
    }

    public String getGroupRoleTitle() {
        return getContext().getString(R.string.f11nameremoved);
    }

    public Drawable getInnerFrameForegroundDrawable() {
        Drawable A002;
        int i;
        int i2;
        boolean isPressed = isPressed();
        boolean A0g2 = C87094Nz.A0g(this);
        if (isPressed) {
            Context context = getContext();
            if (A0g2) {
                A002 = AnonymousClass0RP.A00(context, R.drawable.balloon_outgoing_frame);
                i = R.attr.f3nameremoved;
                i2 = R.color.f5nameremoved;
            } else {
                A002 = AnonymousClass0RP.A00(context, R.drawable.balloon_incoming_frame);
                i = R.attr.f3nameremoved;
                i2 = R.color.f5nameremoved;
            }
            int A032 = C18300x5.A03(context, i, i2);
            C626936e.A06(A002);
            return C107335b8.A0B(A002, A032);
        }
        Context context2 = getContext();
        if (A0g2) {
            return C106205Ya.A02(context2);
        }
        return C106205Ya.A00(context2);
    }

    public Set getInnerFrameLayouts() {
        HashSet A0K2 = AnonymousClass002.A0K();
        FrameLayout frameLayout = this.A0B;
        if (frameLayout != null) {
            A0K2.add(frameLayout);
        }
        View findViewById = findViewById(R.id.link_preview_frame);
        if (findViewById != null) {
            A0K2.add(findViewById);
        }
        return A0K2;
    }

    public Drawable getKeepAnimDrawable() {
        Context context = getContext();
        C162457s7.A0J(context, 0);
        return C107335b8.A04(context, R.drawable.message_keep_teal_anim, AnonymousClass5Yj.A00(context));
    }

    public C55162pu getMessageCommentInfo() {
        return A1C(getFMessage());
    }

    public AnonymousClass4FP getMessageReactions() {
        C624134x fMessage = getFMessage();
        this.A0j.A00(fMessage, (Runnable) null, (byte) 56);
        return fMessage.A0L;
    }

    public byte getMessageType() {
        return getFMessage().A1I;
    }

    public Drawable getPinAnimDrawable() {
        Context context = getContext();
        C162457s7.A0J(context, 0);
        return C107335b8.A04(context, R.drawable.vec_message_badge_pinned_anim, AnonymousClass5Yj.A00(context));
    }

    public Drawable getPopupDrawable() {
        Context context = getContext();
        C162457s7.A0J(context, 0);
        return C107335b8.A04(context, R.drawable.message_star_teal_anim, AnonymousClass5Yj.A00(context));
    }

    public int getProfilePictureFullWidth() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(R.dimen.f6nameremoved) + resources.getDimensionPixelSize(R.dimen.f6nameremoved) + resources.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public int getSecondaryTextColor() {
        boolean A0g2 = C87094Nz.A0g(this);
        int i = R.color.f5nameremoved;
        if (A0g2) {
            i = R.color.f5nameremoved;
        }
        return C86624Kv.A02(this, i);
    }

    public boolean isPressed() {
        if (!super.isPressed()) {
            return false;
        }
        AnonymousClass4NY r0 = this.A12;
        if (r0 == null || !r0.A02) {
            return true;
        }
        return false;
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 7) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0D;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A13;
        if (conversationRowParticipantHeaderMainView != null && conversationRowParticipantHeaderMainView.getVisibility() == 0) {
            A1g(conversationRowParticipantHeaderMainView, R.id.secondary_name_in_group_tv);
        }
        ConversationRowParticipantHeaderQuotedView conversationRowParticipantHeaderQuotedView = this.A14;
        if (!(conversationRowParticipantHeaderQuotedView == null || conversationRowParticipantHeaderQuotedView.getVisibility() != 0 || C06560Yg.A02(this.A14, R.id.quoted_bullet_divider).getVisibility() == 0)) {
            A1g(this.A14, R.id.quoted_subtitle);
        }
        ImageView imageView = this.A0C;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A0C.getDrawable().getIntrinsicHeight();
            View view2 = this.A0l;
            int top = view2.getTop();
            if (this.A0W) {
                paddingTop = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            } else {
                paddingTop = view2.getPaddingTop() + ((AnonymousClass000.A05(view2, view2.getHeight()) - intrinsicHeight) / 2);
            }
            int i5 = top + paddingTop;
            int A022 = C86654Ky.A02(getResources(), R.dimen.f6nameremoved, AnonymousClass5YL.A00(getContext()));
            AnonymousClass679 r1 = this.A0n;
            C626936e.A06(r1);
            boolean BHd = r1.BHd();
            boolean BIr = r1.BIr();
            if (BHd) {
                BIr = AnonymousClass000.A1U(BIr ? 1 : 0, C87094Nz.A0g(this) ? 1 : 0);
            }
            ImageView imageView2 = this.A0C;
            if (BIr) {
                imageView2.layout((getWidth() - intrinsicWidth) - A022, i5, getWidth() - A022, intrinsicHeight + i5);
            } else {
                imageView2.layout(A022, i5, intrinsicWidth + A022, intrinsicHeight + i5);
            }
        }
    }

    public void setCacheInflated(boolean z) {
        this.A2K = z;
    }

    public void setConfigHash(int i) {
        this.A00 = i;
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A2I = runnable;
    }

    public void setIgnorePressedStateUpdates(boolean z) {
        this.A2M = z;
    }

    public void setMaxHeight(int i) {
        this.A02 = i;
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A2J = runnable;
    }

    public void setSelectable(boolean z) {
        this.A2Q = z;
    }

    public final void setTopAttributeTextViewAttributes(TextView textView, int i, int i2, Typeface typeface) {
        int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        textView.setId(i);
        textView.setTextColor(i2);
        textView.setTypeface(typeface);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setTextSize(getNameInGroupTextFontSize());
        C86664Kz.A1S(textView);
        textView.setCompoundDrawablePadding(dimensionPixelSize);
        AnonymousClass0Y9.A02(PorterDuff.Mode.SRC_IN, textView);
        AnonymousClass0YY.A06(textView, 2);
    }

    public int getBroadcastDrawableId() {
        return R.drawable.broadcast_status_icon;
    }

    public int getTopAttributeTextAnchorId() {
        return R.id.quoted_message_holder;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
