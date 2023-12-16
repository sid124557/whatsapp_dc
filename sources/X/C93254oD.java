package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.4oD  reason: invalid class name and case insensitive filesystem */
public final class C93254oD extends C92424mf implements C183138pY, C202509m8 {
    public C50382i5 A00;
    public AnonymousClass5IJ A01;
    public AnonymousClass5ZR A02;
    public C56232re A03;
    public C620133d A04;
    public C1906899l A05;
    public C194599Tr A06;
    public C153087ae A07;
    public C1907099n A08;
    public AnonymousClass9U4 A09;
    public C194589Tn A0A;
    public C196419ao A0B;
    public C195219Wq A0C;
    public C55732qp A0D;
    public AnonymousClass5C5 A0E;
    public C66433Lk A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J = C06560Yg.A02(this, R.id.payment_unsupported_icon);
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final View A0O;
    public final View A0P = C06560Yg.A02(this, R.id.text_and_date);
    public final FrameLayout A0Q = C86654Ky.A0L(this, R.id.payment_amount_container);
    public final FrameLayout A0R;
    public final FrameLayout A0S;
    public final FrameLayout A0T;
    public final ImageView A0U;
    public final LinearLayout A0V = C86654Ky.A0N(this, R.id.main_layout);
    public final TextEmojiLabel A0W;
    public final TextEmojiLabel A0X = AnonymousClass0x7.A0K(this, R.id.payment_note);
    public final TextEmojiLabel A0Y = AnonymousClass0x7.A0K(this, R.id.transaction_status);
    public final WaTextView A0Z = AnonymousClass0x7.A0L(this, R.id.payment_symbol);
    public final ConversationPaymentRowTransactionLayout A0a = ((ConversationPaymentRowTransactionLayout) C06560Yg.A02(this, R.id.transaction_status_container));
    public final C106145Xu A0b;

    public C93254oD(Context context, AnonymousClass677 r17, C624134x r18) {
        super(context, r17, r18);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this, R.id.message_text);
        this.A0W = A0K2;
        A0K2.A0A();
        C86964Mo.A00(this.A0O, A0K2);
        FrameLayout A0L2 = C86654Ky.A0L(this, R.id.payment_container);
        this.A0R = A0L2;
        FrameLayout A0L3 = C86654Ky.A0L(this, R.id.requested_message_holder);
        this.A0T = A0L3;
        this.A0H = C06560Yg.A02(this, R.id.payment_shimmer);
        this.A0I = C06560Yg.A02(this, R.id.payment_loading_error);
        this.A0S = C86654Ky.A0L(this, R.id.payment_security_strip);
        this.A0U = AnonymousClass0x9.A0E(this, R.id.security_strip_image);
        this.A0G = findViewById(R.id.accept_payment_container);
        this.A0N = findViewById(R.id.send_payment_again_container);
        this.A0L = findViewById(R.id.retry_withdrawal_container);
        this.A0K = findViewById(R.id.request_actions_container);
        this.A0M = findViewById(R.id.review_and_cancel_container);
        A0L2.setForeground(getInnerFrameForegroundDrawable());
        A0L3.setForeground(getInnerFrameForegroundDrawable());
        this.A0O = C06560Yg.A02(this, R.id.media_container);
        AnonymousClass1VX r8 = this.A0O;
        AnonymousClass5Ul r4 = this.A0a;
        C621033m r5 = this.A0h;
        C55732qp r11 = this.A0D;
        C620733j r7 = this.A0M;
        C33141sV r14 = this.A22;
        this.A0b = new C106145Xu(this, r4, r5, this.A02, r7, r8, this.A03, this.A04, r11, this.A1v, this.A0E, r14);
        A22();
    }

    public void A1H() {
        A1t(false);
        A22();
    }

    public static /* synthetic */ void A00(C93254oD r2, C203719oC r3, C624134x r4) {
        if (r2.A0Z.A0a(r4.A0P.A0D) || r2.A0Z.A0a(r4.A0P.A0E)) {
            Intent A082 = AnonymousClass0x9.A08(r2.getContext(), r3.BBC());
            C107395bF.A00(A082, r4.A1J);
            C86614Ku.A14(A082, r2);
        } else if (r2.A0B.A08(r4.A0P.A0K)) {
            r2.A0B.A05(r4);
            r2.A0H.setVisibility(0);
            r2.A0I.setVisibility(8);
        }
    }

    public static /* synthetic */ void A02(C93254oD r6, C203719oC r7, C624134x r8) {
        AnonymousClass2z0 r3;
        Class BBC;
        if (!r8.A0P.A0L() || !r8.A0P.A0G()) {
            r3 = r8.A1J;
        } else {
            AnonymousClass36F A0A2 = r6.A09.A0A();
            r3 = r8.A1J;
            C624034w A0F2 = A0A2.A0F(r3.A01);
            if (A0F2 != null) {
                C624034w r4 = r8.A0P;
                if (r4.A02 != 18) {
                    r3 = new AnonymousClass2z0(A0F2.A0C, A0F2.A0L, A0F2.A0Q);
                    if (r4.A05() != null) {
                        r6.A0A.A02(r8.A0P.A05());
                    }
                }
            }
        }
        if (r7 != null && (BBC = r7.BBC()) != null) {
            Intent A082 = AnonymousClass0x9.A08(r6.getContext(), BBC);
            A082.putExtra("referral_screen", "chat");
            A082.putExtra("extra_transaction_id", r8.A0P.A0K);
            C107395bF.A00(A082, r3);
            C86614Ku.A14(A082, r6);
        }
    }

    public static /* synthetic */ void A04(C93254oD r7, C624134x r8) {
        String A072;
        AnonymousClass39U r2;
        C624034w r3 = r8.A0P;
        AnonymousClass1S4 r0 = r3.A0A;
        if (r0 == null || (r2 = r0.A02) == null) {
            C56962sq r1 = r7.A0q;
            C626936e.A06(r3);
            if (C86614Ku.A1X(r1, r3.A0D)) {
                AnonymousClass3ZH A0A2 = r7.A0t.A0A(r8.A0P.A0D);
                Context context = r7.getContext();
                Object[] objArr = new Object[1];
                C18300x5.A1E(r7.A0v, A0A2, objArr, 0);
                ((AnonymousClass4FU) r7.getContext()).Boo(UnblockDialogFragment.A00(new AnonymousClass5AX(r8, 1, r7), context.getString(R.string.f11nameremoved, objArr), 0, false));
                return;
            }
            Intent A002 = r7.A1l.A00(r7.getContext());
            A002.putExtra("extra_payment_preset_amount", r7.A07.A01().B3U(r7.A0M, r8.A0P.A08));
            A002.putExtra("referral_screen", "chat");
            C95814uZ r32 = r8.A1J.A00;
            String str = "extra_jid";
            if (r32 instanceof GroupJid) {
                AnonymousClass0x2.A0u(A002, r32, str);
                A072 = C627336j.A07(r8.A0P.A0D);
                str = "extra_receiver_jid";
            } else {
                A072 = C627336j.A07(r8.A0P.A0D);
            }
            A002.putExtra(str, A072);
            A002.putExtra("extra_payment_note", r8.A13());
            A002.putExtra("extra_conversation_message_type", 1);
            if (r8.A1m()) {
                A002.putExtra("extra_mentioned_jids", C624435a.A01(r8.A18));
            }
            AnonymousClass39R A052 = r8.A0P.A05();
            if (A052 != null) {
                A002.putExtra("extra_payment_background", A052);
            }
            if (r8 instanceof AnonymousClass1nE) {
                AnonymousClass1nE r82 = (AnonymousClass1nE) r8;
                A002.putExtra("extra_payment_sticker", r7.A0D.A00(r82));
                A002.putExtra("extra_payment_sticker_send_origin", r82.A05);
            }
            C86614Ku.A14(A002, r7);
            return;
        }
        AnonymousClass9T2 r4 = new AnonymousClass9T2(r7.A1l, r7.A08);
        C95814uZ r12 = r3.A0C;
        if (r12 == null) {
            r12 = r3.A0D;
        }
        AnonymousClass2z0 r33 = new AnonymousClass2z0(r12, r2.A02, false);
        C95814uZ r22 = r33.A00;
        C626936e.A06(r22);
        r4.A02(r7.getContext(), r22, r33, r8.A0P.A0A.A02.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        if (r13 == 10) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22() {
        /*
            r30 = this;
            r7 = r30
            X.34x r6 = r7.getFMessage()
            com.whatsapp.TextEmojiLabel r11 = r7.A0W
            r11.A0A()
            com.whatsapp.TextEmojiLabel r9 = r7.A0X
            X.1VX r0 = r7.A0O
            X.AnonymousClass0x2.A14(r0, r9)
            android.view.ViewGroup r12 = r7.A08
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165988(0x7f070324, float:1.7946209E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = X.C86614Ku.A05(r7, r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165986(0x7f070322, float:1.7946205E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5 = 0
            r12.setPadding(r3, r5, r2, r0)
            android.view.View r2 = r7.A0P
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r2)
            r0.topMargin = r5
            android.view.View r3 = r7.A0O
            r4 = 8
            r3.setVisibility(r4)
            byte r13 = r6.A1I
            r0 = 12
            r8 = 1
            r10 = 2
            if (r13 != r0) goto L_0x0592
            android.content.Context r2 = r7.getContext()
            X.2i5 r0 = r7.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131889495(0x7f120d57, float:1.9413655E38)
            java.lang.String r0 = X.AnonymousClass5Z5.A01(r2, r1, r0)
        L_0x005a:
            android.text.SpannableString r1 = X.C87094Nz.A09(r7, r0)
            X.33i r0 = r7.A0L
            X.AnonymousClass0x2.A12(r9, r0)
            r9.setText(r1)
            android.graphics.Typeface r0 = r9.getTypeface()
            r9.setTypeface(r0, r10)
        L_0x006d:
            r9.setVisibility(r5)
        L_0x0070:
            com.whatsapp.WaTextView r1 = r7.A0Z
            r1.setVisibility(r5)
            android.view.View r2 = r7.A0J
            r2.setVisibility(r4)
            com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout r0 = r7.A0a
            r21 = r0
            int r0 = r9.getVisibility()
            r3 = 0
            r13 = r3
            if (r0 != r4) goto L_0x0087
            r13 = r12
        L_0x0087:
            r0 = r21
            r0.A00 = r13
            android.view.View r0 = r7.A0H
            r29 = r0
            r0.setVisibility(r4)
            android.view.View r0 = r7.A0I
            r28 = r0
            r0.setVisibility(r4)
            X.34w r13 = r6.A0P
            if (r13 == 0) goto L_0x010b
            int r12 = r13.A03
            r0 = 5
            if (r12 != r0) goto L_0x010b
            r7.A23()
            r1.setVisibility(r4)
            r2.setVisibility(r5)
            android.content.Context r2 = r7.getContext()
            X.2i5 r0 = r7.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131891724(0x7f12160c, float:1.9418176E38)
            java.lang.String r0 = X.AnonymousClass5Z5.A01(r2, r1, r0)
            android.text.SpannableString r1 = X.C87094Nz.A09(r7, r0)
            X.33i r0 = r7.A0L
            X.AnonymousClass0x2.A12(r11, r0)
            r11.setText(r1)
            android.graphics.Typeface r0 = r11.getTypeface()
            r11.setTypeface(r0, r10)
            r11.setVisibility(r5)
        L_0x00d2:
            android.widget.LinearLayout r0 = r7.A0V
            X.C93314oJ.A0q(r0, r7)
            boolean r0 = r7.A24()
            android.widget.FrameLayout r8 = r7.A0S
            if (r0 == 0) goto L_0x0644
            r8.setVisibility(r5)
            X.2z0 r0 = r6.A1J
            boolean r3 = r0.A02
            android.widget.ImageView r2 = r7.A0U
            android.content.Context r1 = r7.getContext()
            r0 = 2131102139(0x7f0609bb, float:1.7816707E38)
            if (r3 == 0) goto L_0x00f4
            r0 = 2131102140(0x7f0609bc, float:1.781671E38)
        L_0x00f4:
            X.C86634Kw.A14(r1, r2, r0)
            android.graphics.drawable.Drawable r1 = r8.getBackground()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r0 = 1500(0x5dc, float:2.102E-42)
            r1.setEnterFadeDuration(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setExitFadeDuration(r0)
            r1.start()
            return
        L_0x010b:
            boolean r0 = X.AnonymousClass36S.A06(r13)
            if (r0 == 0) goto L_0x0125
            r7.A23()
            r11.setVisibility(r5)
            r0 = 2131892007(0x7f121727, float:1.941875E38)
            r11.setText(r0)
            android.graphics.Typeface r0 = r11.getTypeface()
            r11.setTypeface(r0, r10)
            goto L_0x00d2
        L_0x0125:
            X.99n r0 = r7.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x058b
            X.9U4 r2 = r7.A09
            X.34w r0 = r6.A0P
            java.lang.String r0 = r0.A0G
            X.9SU r2 = r2.A0F(r0)
            if (r2 == 0) goto L_0x058b
            X.34w r0 = r6.A0P
            java.lang.String r0 = r0.A0I
            X.9oC r2 = r2.A01(r0)
            if (r2 == 0) goto L_0x058c
            X.99n r0 = r7.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x058c
            X.9nv r20 = r2.B66()
            X.9Vt r19 = r2.B9W()
        L_0x0153:
            r7.setPaymentContext(r6, r11)
            X.34w r12 = r6.A0P
            int r13 = r12.A03
            if (r13 == r8) goto L_0x0170
            if (r13 == r10) goto L_0x0170
            r0 = 100
            if (r13 == r0) goto L_0x0170
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 == r0) goto L_0x0170
            r0 = 20
            if (r13 == r0) goto L_0x0170
            r0 = 10
            r18 = 0
            if (r13 != r0) goto L_0x0172
        L_0x0170:
            r18 = 1
        L_0x0172:
            if (r2 == 0) goto L_0x057d
            int r13 = r2.BDw(r12)
            r0 = r20
            java.lang.String r10 = r2.BB0(r0, r6)
        L_0x017e:
            X.34w r0 = r6.A0P
            boolean r0 = X.AnonymousClass36S.A06(r0)
            r15 = 0
            if (r0 == 0) goto L_0x018a
            r15 = 2131892007(0x7f121727, float:1.941875E38)
        L_0x018a:
            X.34w r0 = r6.A0P
            if (r2 == 0) goto L_0x0577
            int r17 = r2.BDu(r0)
        L_0x0192:
            if (r18 == 0) goto L_0x0570
            if (r13 == 0) goto L_0x0570
            com.whatsapp.TextEmojiLabel r12 = r7.A0Y
            java.lang.String r14 = X.C86624Kv.A0b(r7, r13)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x056d
            android.content.Context r13 = r7.getContext()
            r0 = 2
            java.lang.Object[] r10 = X.AnonymousClass4L0.A0V(r14, r10, r0)
            r0 = 2131892020(0x7f121734, float:1.9418776E38)
            java.lang.String r0 = r13.getString(r0, r10)
        L_0x01b2:
            if (r15 == 0) goto L_0x01cc
            android.content.Context r16 = r7.getContext()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r0
            java.lang.String r0 = X.C86624Kv.A0b(r7, r15)
            r10[r8] = r0
            r13 = 2131892019(0x7f121733, float:1.9418774E38)
            r0 = r16
            java.lang.String r0 = r0.getString(r13, r10)
        L_0x01cc:
            int r13 = r0.indexOf(r14)
            int r15 = X.C86664Kz.A0L(r14, r13)
            android.text.SpannableStringBuilder r10 = X.C18330xA.A00(r0)
            android.content.res.Resources r14 = r7.getResources()
            r0 = r17
            int r0 = r14.getColor(r0)
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r0)
            r10.setSpan(r14, r13, r15, r5)
            r7.getContext()
            X.4N1 r14 = new X.4N1
            r14.<init>()
            r10.setSpan(r14, r13, r15, r5)
            X.C86664Kz.A1T(r12, r10)
            r12.setVisibility(r5)
        L_0x01fb:
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x0566
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x0566
            r0 = r21
            r0.setVisibility(r4)
        L_0x020c:
            android.widget.FrameLayout r0 = r7.A0Q
            r0.setVisibility(r5)
            if (r2 == 0) goto L_0x0554
            X.7Qu r12 = r2.BAi()
            X.1VX r11 = r7.A0O
            X.33j r10 = r7.A0M
            X.9Tn r0 = r7.A0A
            X.8tc r10 = r2.BAj(r10, r11, r0, r12)
        L_0x0221:
            r0 = 2131432121(0x7f0b12b9, float:1.848599E38)
            android.view.ViewStub r0 = X.C86664Kz.A0n(r7, r0)
            if (r0 == 0) goto L_0x0548
            r10.BFl(r0)
        L_0x022d:
            X.34w r0 = r6.A0P
            r10.Axq(r0)
            X.99n r0 = r7.A08
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x0545
            if (r2 == 0) goto L_0x0545
            X.8u9 r13 = r2.B63()
        L_0x0240:
            X.99n r0 = r7.A08
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x053c
            X.34w r12 = r6.A0P
            int r11 = r12.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r11 != r0) goto L_0x053c
            android.view.View r11 = r7.A0G
            if (r11 == 0) goto L_0x053c
            if (r13 == 0) goto L_0x0532
            X.1S4 r0 = r12.A0A
            boolean r0 = r13.Bo1(r0)
            if (r0 == 0) goto L_0x053c
        L_0x025e:
            r0 = 2131427370(0x7f0b002a, float:1.8476354E38)
            android.view.View r12 = r7.findViewById(r0)
            int r0 = r9.getVisibility()
            r12.setVisibility(r0)
            r0 = 2131427367(0x7f0b0027, float:1.8476348E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r11, r0)
            X.C106905aM.A04(r0)
            r11.setVisibility(r5)
            X.90a r0 = new X.90a
            r0.<init>((X.C93254oD) r7, (X.C203719oC) r2, (X.C624134x) r6, (int) r5)
            r11.setOnClickListener(r0)
        L_0x0281:
            android.view.View r12 = r7.A0L
            if (r12 == 0) goto L_0x02a2
            X.99n r0 = r7.A08
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x052d
            if (r2 == 0) goto L_0x052d
            X.34w r0 = r6.A0P
            int r11 = r0.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r11 != r0) goto L_0x052d
            r12.setVisibility(r5)
            X.5ek r0 = new X.5ek
            r0.<init>(r7, r2, r6)
            r12.setOnClickListener(r0)
        L_0x02a2:
            android.view.View r12 = r7.A0N
            if (r12 == 0) goto L_0x02df
            X.99n r0 = r7.A08
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x0528
            X.9Wq r14 = r7.A0C
            X.34w r13 = r6.A0P
            r11 = r19
            r0 = r20
            boolean r0 = r14.A0q(r13, r11, r0, r5)
            if (r0 == 0) goto L_0x0528
            r0 = 2131433532(0x7f0b183c, float:1.8488852E38)
            android.view.View r11 = r7.findViewById(r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r0 = 2131433530(0x7f0b183a, float:1.8488848E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r12, r0)
            X.C106905aM.A04(r11)
            r12.setVisibility(r5)
            X.910 r0 = new X.910
            r0.<init>(r6, r5, r7)
            r11.setOnClickListener(r0)
        L_0x02df:
            X.99n r0 = r7.A08
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x051f
            X.9Wq r11 = r7.A0C
            X.34w r0 = r6.A0P
            boolean r0 = r11.A0p(r0)
            if (r0 == 0) goto L_0x051f
            android.view.View r12 = r7.A0M
            if (r12 == 0) goto L_0x051f
            X.99n r0 = r7.A08
            X.1VX r11 = r0.A02
            r0 = 1905(0x771, float:2.67E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x051f
            X.7pU r11 = X.C161357pU.A0E
            X.7ae r0 = r7.A07
            X.7pU r0 = r0.A02()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x051f
            r0 = 2131433144(0x7f0b16b8, float:1.8488065E38)
            android.view.View r11 = r7.findViewById(r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r0 = 2131433142(0x7f0b16b6, float:1.8488061E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r12, r0)
            X.C106905aM.A04(r11)
            r12.setVisibility(r5)
            X.90a r0 = new X.90a
            r0.<init>((X.C93254oD) r7, (X.C203719oC) r2, (X.C624134x) r6, (int) r8)
            r11.setOnClickListener(r0)
        L_0x0332:
            android.view.View r11 = r7.A0K
            if (r11 == 0) goto L_0x0396
            X.34w r0 = r6.A0P
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x051a
            X.2sr r8 = r7.A0Z
            X.34w r0 = r6.A0P
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r8.A0a(r0)
            if (r0 == 0) goto L_0x051a
            boolean r12 = X.C86654Ky.A1U(r9)
            r0 = 2131433048(0x7f0b1658, float:1.848787E38)
            android.view.View r8 = r7.findViewById(r0)
            int r0 = X.AnonymousClass001.A08(r12)
            r8.setVisibility(r0)
            r0 = 2131428369(0x7f0b0411, float:1.847838E38)
            android.view.View r9 = r7.findViewById(r0)
            android.content.res.Resources r8 = r7.getResources()
            if (r12 == 0) goto L_0x050e
            r0 = 2131100310(0x7f060296, float:1.7812998E38)
            X.C86624Kv.A0l(r8, r9, r0)
        L_0x036f:
            X.2z0 r9 = r6.A1J
            X.4uZ r8 = r9.A00
            if (r8 == 0) goto L_0x0379
            X.34w r0 = r6.A0P
            r0.A0C = r8
        L_0x0379:
            X.34w r8 = r6.A0P
            java.lang.String r0 = r9.A01
            r8.A0L = r0
            X.9Tr r0 = r7.A06
            java.lang.String r26 = "chat"
            r23 = r3
            r19 = r0
            r20 = r11
            r21 = r3
            r22 = r8
            r24 = r7
            r25 = r6
            r27 = r5
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0396:
            if (r18 == 0) goto L_0x04ea
            android.widget.LinearLayout r8 = r7.A0V
            r9 = 2
            X.90a r0 = new X.90a
            r0.<init>((X.C93254oD) r7, (X.C203719oC) r2, (X.C624134x) r6, (int) r9)
            r8.setOnClickListener(r0)
        L_0x03a3:
            android.content.Context r9 = r7.getContext()
            X.34w r0 = r6.A0P
            java.lang.CharSequence r11 = X.C195219Wq.A05(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x048c
            r1.setVisibility(r4)
        L_0x03b6:
            X.34w r0 = r6.A0P
            java.lang.String r0 = r0.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0486
            X.9U4 r0 = r7.A09
            X.36F r11 = r0.A0A()
            X.34w r0 = r6.A0P
            java.lang.String r9 = r0.A0M
            r0 = -1
            X.34w r11 = r11.A0H(r9, r3, r0)
            if (r11 == 0) goto L_0x0486
            int r1 = r11.A02
            r0 = 18
            if (r1 == r0) goto L_0x0486
            r0 = 2131433084(0x7f0b167c, float:1.8487944E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r7, r0)
            r7.setRequestPaymentText(r11, r0)
            r0 = 2131433088(0x7f0b1680, float:1.8487952E38)
            android.view.View r14 = X.C06560Yg.A02(r7, r0)
            r0 = 2131433087(0x7f0b167f, float:1.848795E38)
            android.widget.TextView r13 = X.C18300x5.A0G(r7, r0)
            android.content.Context r12 = r7.getContext()
            X.33j r9 = r7.A0M
            X.34w r0 = r6.A0P
            X.39Q r1 = r0.A08
            X.4Fi r0 = r0.A03()
            android.text.SpannableStringBuilder r1 = X.AnonymousClass9UO.A00(r12, r9, r0, r1)
            boolean r0 = r7.A24()
            if (r0 == 0) goto L_0x047c
            X.39R r12 = r11.A05()
            if (r12 == 0) goto L_0x0472
            r0 = 2131433090(0x7f0b1682, float:1.8487956E38)
            android.widget.TextView r9 = X.C18300x5.A0G(r7, r0)
            r13.setVisibility(r4)
            r14.setVisibility(r5)
            r9.setText(r1)
            X.9Tn r1 = r7.A0A
            r0 = 2131433089(0x7f0b1681, float:1.8487954E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r7, r0)
            r1.A01(r0, r9, r12)
        L_0x042a:
            android.widget.FrameLayout r1 = r7.A0T
            r1.setVisibility(r5)
            X.69c r0 = new X.69c
            r0.<init>(r11, r5, r7)
            r1.setOnClickListener(r0)
        L_0x0437:
            X.34w r9 = r6.A0P
            int r1 = r9.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x00d2
            X.9ao r1 = r7.A0B
            java.lang.String r0 = r9.A0K
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0467
            r0 = r29
            r0.setVisibility(r4)
            r0 = r28
            r0.setVisibility(r5)
        L_0x0453:
            r10.Axq(r3)
            r0 = 2131429142(0x7f0b0716, float:1.8479948E38)
            X.C86604Kt.A1F(r7, r0, r4)
            r1 = 3
            X.90a r0 = new X.90a
            r0.<init>((X.C93254oD) r7, (X.C203719oC) r2, (X.C624134x) r6, (int) r1)
            r8.setOnClickListener(r0)
            goto L_0x00d2
        L_0x0467:
            r0 = r29
            r0.setVisibility(r5)
            r0 = r28
            r0.setVisibility(r4)
            goto L_0x0453
        L_0x0472:
            r13.setVisibility(r5)
            r13.setText(r1)
            r14.setVisibility(r4)
            goto L_0x042a
        L_0x047c:
            r13.setVisibility(r5)
            r13.setText(r1)
            r14.setVisibility(r4)
            goto L_0x042a
        L_0x0486:
            android.widget.FrameLayout r0 = r7.A0T
            r0.setVisibility(r4)
            goto L_0x0437
        L_0x048c:
            android.content.res.Resources r9 = r7.getResources()
            r0 = r17
            X.C18320x8.A11(r9, r1, r0)
            r1.setText(r11)
            android.view.ViewParent r13 = r1.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            X.0XZ r12 = new X.0XZ
            r12.<init>()
            r12.A0B(r13)
            r14 = 4
            r11 = 6
            int r9 = r1.getId()
            if (r18 == 0) goto L_0x04c5
            r0 = 3
            r12.A08(r9, r0, r5, r0)
            int r0 = r1.getId()
            r12.A08(r0, r14, r5, r14)
            int r0 = r1.getId()
            r12.A08(r0, r11, r5, r11)
        L_0x04c0:
            r12.A09(r13)
            goto L_0x03b6
        L_0x04c5:
            java.util.HashMap r14 = r12.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r0 = r14.containsKey(r9)
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r0 = r14.get(r9)
            X.0Oe r0 = (X.C04430Oe) r0
            r9 = -1
            X.0TP r0 = r0.A02
            r0.A0B = r9
            r0.A0A = r9
            r0.A09 = r9
            r0.A0J = r9
        L_0x04e2:
            int r0 = r1.getId()
            r12.A08(r0, r11, r5, r11)
            goto L_0x04c0
        L_0x04ea:
            boolean r0 = r7.A24()
            if (r0 == 0) goto L_0x0507
            X.34w r0 = r6.A0P
            if (r0 == 0) goto L_0x0507
            X.39R r0 = r0.A05()
            if (r0 == 0) goto L_0x0507
            android.widget.LinearLayout r8 = r7.A0V
            r9 = 1
            X.910 r0 = new X.910
            r0.<init>(r6, r9, r7)
            r8.setOnClickListener(r0)
            goto L_0x03a3
        L_0x0507:
            android.widget.LinearLayout r8 = r7.A0V
            r8.setOnClickListener(r3)
            goto L_0x03a3
        L_0x050e:
            r0 = 2131233388(0x7f080a6c, float:1.8082912E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r9.setBackground(r0)
            goto L_0x036f
        L_0x051a:
            r11.setVisibility(r4)
            goto L_0x0396
        L_0x051f:
            android.view.View r0 = r7.A0M
            if (r0 == 0) goto L_0x0332
            r0.setVisibility(r4)
            goto L_0x0332
        L_0x0528:
            r12.setVisibility(r4)
            goto L_0x02df
        L_0x052d:
            r12.setVisibility(r4)
            goto L_0x02a2
        L_0x0532:
            X.99l r0 = r7.A05
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x053c
            goto L_0x025e
        L_0x053c:
            android.view.View r0 = r7.A0G
            if (r0 == 0) goto L_0x0281
            r0.setVisibility(r4)
            goto L_0x0281
        L_0x0545:
            r13 = r3
            goto L_0x0240
        L_0x0548:
            r0 = 2131432120(0x7f0b12b8, float:1.8485988E38)
            android.view.View r0 = r7.findViewById(r0)
            r10.BfU(r0)
            goto L_0x022d
        L_0x0554:
            X.7Qu r13 = new X.7Qu
            r13.<init>()
            X.1VX r12 = r7.A0O
            X.33j r11 = r7.A0M
            X.9Tn r0 = r7.A0A
            X.9ai r10 = new X.9ai
            r10.<init>(r11, r12, r0, r13)
            goto L_0x0221
        L_0x0566:
            r0 = r21
            r0.setVisibility(r5)
            goto L_0x020c
        L_0x056d:
            r0 = r14
            goto L_0x01b2
        L_0x0570:
            com.whatsapp.TextEmojiLabel r12 = r7.A0Y
            r12.setVisibility(r4)
            goto L_0x01fb
        L_0x0577:
            int r17 = X.C195219Wq.A01(r0)
            goto L_0x0192
        L_0x057d:
            X.9Wq r0 = r7.A0C
            int r13 = r0.A0B(r12)
            X.9Wq r0 = r7.A0C
            java.lang.String r10 = r0.A0a(r3, r6)
            goto L_0x017e
        L_0x058b:
            r2 = r3
        L_0x058c:
            r20 = r3
            r19 = r3
            goto L_0x0153
        L_0x0592:
            boolean r0 = X.C626635z.A09(r6)
            if (r0 == 0) goto L_0x05b8
            r0 = 11
            X.3Lk r1 = r7.A0F
            if (r13 != r0) goto L_0x05b5
            java.lang.String r0 = "26000015"
        L_0x05a0:
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            java.lang.String r2 = r0.toString()
            android.content.Context r1 = r7.getContext()
            r0 = 2131891778(0x7f121642, float:1.9418286E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r8, r0)
            goto L_0x005a
        L_0x05b5:
            java.lang.String r0 = "835452491239734"
            goto L_0x05a0
        L_0x05b8:
            X.1VX r1 = r7.A0O
            r0 = 812(0x32c, float:1.138E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x05cc
            X.1VX r1 = r7.A0O
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x05f6
        L_0x05cc:
            boolean r0 = r6 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x05f6
            r2 = r6
            X.1nE r2 = (X.AnonymousClass1nE) r2
            r3.setVisibility(r5)
            X.5Xu r1 = r7.A0b
            r1.A03(r2, r5)
            boolean r0 = X.C627636p.A0z(r2)
            if (r0 == 0) goto L_0x05e6
            r1.A01()
            goto L_0x0070
        L_0x05e6:
            boolean r0 = X.C627636p.A10(r2)
            if (r0 == 0) goto L_0x05f1
            r1.A02()
            goto L_0x0070
        L_0x05f1:
            r1.A00()
            goto L_0x0070
        L_0x05f6:
            java.lang.String r0 = r6.A13()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 != 0) goto L_0x060c
            java.lang.String r0 = r6.A13()
            r7.setMessageText(r0, r9, r6)
            r9.A0A()
            goto L_0x006d
        L_0x060c:
            r9.setVisibility(r4)
            X.34w r0 = r6.A0P
            boolean r0 = X.AnonymousClass36S.A06(r0)
            if (r0 != 0) goto L_0x0070
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167750(0x7f070a06, float:1.7949782E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.C86614Ku.A05(r7, r0)
            r12.setPadding(r1, r5, r0, r5)
            X.C86604Kt.A19(r12)
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass001.A0T(r2)
            int r0 = r12.getMeasuredHeight()
            int r2 = -r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167749(0x7f070a05, float:1.794978E38)
            int r0 = X.C86664Kz.A09(r1, r0, r2)
            r3.topMargin = r0
            goto L_0x0070
        L_0x0644:
            r8.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93254oD.A22():void");
    }

    public final void A23() {
        this.A0Q.setVisibility(8);
        View view = this.A0G;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A0L;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A0N;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.A0V.setOnClickListener((View.OnClickListener) null);
        this.A0Y.setVisibility(8);
        this.A0T.setVisibility(8);
        View view4 = this.A0K;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public final boolean A24() {
        if (this.A0O.A0X(605) || this.A0O.A0X(629)) {
            return true;
        }
        return false;
    }

    public void BpZ() {
        if (this.A0O.A0X(812) || this.A0O.A0X(811)) {
            this.A0b.A0F.A07();
        }
    }

    public int getBubbleAlpha() {
        return 255;
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        return AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) + (AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) * 2);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(AnonymousClass000.A1W(r2.A0P));
        this.A0S = r2;
    }

    public final void setPaymentContext(C624134x r7, TextEmojiLabel textEmojiLabel) {
        Pair A0G2 = this.A0C.A0G(r7);
        String str = (String) A0G2.second;
        if (!TextUtils.isEmpty(str)) {
            String str2 = (String) A0G2.first;
            SpannableStringBuilder A002 = C18330xA.A00(str);
            if (!TextUtils.isEmpty(str2)) {
                getContext();
                AnonymousClass4N1 r2 = new AnonymousClass4N1();
                int length = str.length();
                A002.setSpan(r2, length - str2.length(), length, 0);
                C86664Kz.A1T(textEmojiLabel, A002);
            } else {
                textEmojiLabel.setText(A002);
            }
            textEmojiLabel.setVisibility(0);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    public final void setRequestPaymentText(C624034w r5, TextView textView) {
        Pair A0F2 = this.A0C.A0F(r5);
        String str = (String) A0F2.first;
        SpannableStringBuilder A002 = C18330xA.A00((String) A0F2.second);
        if (!TextUtils.isEmpty(str)) {
            getContext();
            A002.setSpan(new AnonymousClass4N1(), 0, str.length(), 0);
            C86664Kz.A1T(textView, A002);
            return;
        }
        textView.setText(A002);
    }

    public static /* synthetic */ void A03(C93254oD r3, C203719oC r4, C624134x r5) {
        Intent A082 = AnonymousClass0x9.A08(r3.getContext(), r4.BBC());
        A082.putExtra("extra_transaction_id", r5.A0P.A0K);
        C107395bF.A00(A082, r5.A1J);
        C86614Ku.A14(A082, r3);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A0R);
        innerFrameLayouts.add(this.A0T);
        return innerFrameLayouts;
    }

    public void BXw() {
        A1H();
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
