package com.whatsapp.conversationslist;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass2R8;
import X.AnonymousClass33p;
import X.AnonymousClass352;
import X.AnonymousClass3LP;
import X.AnonymousClass4FS;
import X.AnonymousClass4Z6;
import X.AnonymousClass57t;
import X.AnonymousClass5UX;
import X.AnonymousClass5UY;
import X.AnonymousClass5ZN;
import X.AnonymousClass5ZU;
import X.AnonymousClass659;
import X.AnonymousClass9U4;
import X.C06560Yg;
import X.C1001059l;
import X.C103445Mz;
import X.C105075Tm;
import X.C105365Uq;
import X.C106195Xz;
import X.C106905aM;
import X.C107075ae;
import X.C107335b8;
import X.C107555bV;
import X.C116985rC;
import X.C1230266t;
import X.C139986sy;
import X.C15110qn;
import X.C156257gJ;
import X.C18290x4;
import X.C18300x5;
import X.C183538qC;
import X.C1907099n;
import X.C195219Wq;
import X.C40532Gt;
import X.C43642Sx;
import X.C46962cU;
import X.C50222hp;
import X.C52472lX;
import X.C53582nK;
import X.C54292oU;
import X.C56072rN;
import X.C56152rV;
import X.C56322rn;
import X.C56542sA;
import X.C56612sH;
import X.C56722sS;
import X.C56762sW;
import X.C56942so;
import X.C56962sq;
import X.C56972sr;
import X.C56982ss;
import X.C620333f;
import X.C620633i;
import X.C620733j;
import X.C625735q;
import X.C64773Ex;
import X.C69263Wi;
import X.C86654Ky;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class ViewHolder extends AnonymousClass4Z6 implements C15110qn {
    public AnonymousClass5ZN A00;
    public AnonymousClass659 A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ViewStub A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final ImageView A0I;
    public final TextView A0J;
    public final C116985rC A0K;
    public final C53582nK A0L;
    public final C69263Wi A0M;
    public final C56972sr A0N;
    public final C625735q A0O;
    public final TextEmojiLabel A0P;
    public final TextEmojiLabel A0Q;
    public final WaImageView A0R;
    public final WaImageView A0S;
    public final WaTextView A0T;
    public final C56962sq A0U;
    public final C56722sS A0V;
    public final C56942so A0W;
    public final SelectionCheckView A0X;
    public final AnonymousClass5UX A0Y;
    public final C64773Ex A0Z;
    public final AnonymousClass5ZU A0a;
    public final C105365Uq A0b;
    public final C105075Tm A0c;
    public final C103445Mz A0d;
    public final C1230266t A0e;
    public final C620633i A0f;
    public final C56612sH A0g;
    public final C54292oU A0h;
    public final AnonymousClass33p A0i;
    public final C620733j A0j;
    public final C56762sW A0k;
    public final C56542sA A0l;
    public final C56982ss A0m;
    public final C46962cU A0n;
    public final C56322rn A0o;
    public final C56152rV A0p;
    public final C620333f A0q;
    public final AnonymousClass2R8 A0r;
    public final AnonymousClass1VX A0s;
    public final AnonymousClass3LP A0t;
    public final C52472lX A0u;
    public final C40532Gt A0v;
    public final C43642Sx A0w;
    public final C106195Xz A0x;
    public final C1907099n A0y;
    public final AnonymousClass9U4 A0z;
    public final C195219Wq A10;
    public final C50222hp A11;
    public final AnonymousClass1R1 A12;
    public final C56072rN A13;
    public final C107075ae A14;
    public final AnonymousClass5UY A15;
    public final AnonymousClass5UY A16;
    public final AnonymousClass4FS A17;
    public final C156257gJ A18 = new C139986sy();
    public final C183538qC A19;

    public void A0E(boolean z, int i) {
        C156257gJ r0;
        int i2 = 8;
        if (this.A16.A03() == 0) {
            ImageView imageView = this.A0C;
            if (z) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            imageView.setContentDescription(AnonymousClass352.A02(this.A0j, i));
            imageView.setImageResource(R.drawable.ic_chatlist_ephemeral_v2);
            return;
        }
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A0B;
        C156257gJ r1 = wDSProfilePhoto.A04;
        if (!(r1 instanceof C139986sy) || z) {
            if (r1 == null && z) {
                r0 = this.A18;
            }
            this.A0C.setVisibility(8);
        }
        r0 = null;
        wDSProfilePhoto.setProfileBadge(r0);
        this.A0C.setVisibility(8);
    }

    public void A0F(boolean z, boolean z2) {
        AnonymousClass57t r1;
        SelectionCheckView selectionCheckView;
        int i = 8;
        if (this.A16.A03() == 0) {
            selectionCheckView = this.A0X;
            selectionCheckView.A06(z, z2);
            if (z) {
                i = 0;
            }
        } else {
            if (z) {
                r1 = AnonymousClass57t.CHECKED;
            } else {
                r1 = AnonymousClass57t.NONE;
            }
            ((WDSProfilePhoto) this.A0B).A00(r1, z2);
            selectionCheckView = this.A0X;
        }
        selectionCheckView.setVisibility(i);
    }

    public ViewHolder(Context context, View view, C116985rC r15, C116985rC r16, C53582nK r17, C69263Wi r18, C56972sr r19, C625735q r20, C56962sq r21, C56722sS r22, C56942so r23, AnonymousClass5UX r24, C64773Ex r25, AnonymousClass5ZU r26, C105365Uq r27, C103445Mz r28, C1230266t r29, C620633i r30, C56612sH r31, C54292oU r32, AnonymousClass33p r33, C620733j r34, C56762sW r35, C56542sA r36, C56982ss r37, C46962cU r38, C56322rn r39, C56152rV r40, C620333f r41, AnonymousClass2R8 r42, AnonymousClass1VX r43, AnonymousClass3LP r44, C52472lX r45, C40532Gt r46, C43642Sx r47, C106195Xz r48, C1907099n r49, AnonymousClass9U4 r50, C195219Wq r51, C50222hp r52, AnonymousClass1R1 r53, C56072rN r54, C107075ae r55, AnonymousClass4FS r56, C183538qC r57) {
        super(view);
        this.A0g = r31;
        AnonymousClass1VX r11 = r43;
        this.A0s = r11;
        this.A0M = r18;
        this.A0x = r48;
        this.A0N = r19;
        C54292oU r1 = r32;
        this.A0h = r1;
        this.A17 = r56;
        this.A0V = r22;
        this.A0m = r37;
        this.A0t = r44;
        this.A10 = r51;
        this.A0Y = r24;
        this.A0Z = r25;
        this.A0f = r30;
        this.A0L = r17;
        this.A0n = r38;
        AnonymousClass5ZU r9 = r26;
        this.A0a = r9;
        C620733j r10 = r34;
        this.A0j = r10;
        this.A13 = r54;
        this.A0z = r50;
        this.A14 = r55;
        this.A0U = r21;
        this.A0p = r40;
        this.A0u = r45;
        this.A0k = r35;
        this.A12 = r53;
        this.A0b = r27;
        this.A0q = r41;
        this.A0r = r42;
        this.A0i = r33;
        this.A0W = r23;
        this.A0o = r39;
        this.A0y = r49;
        this.A0d = r28;
        this.A0O = r20;
        this.A0K = r16;
        this.A0e = r29;
        this.A11 = r52;
        this.A0w = r47;
        this.A0v = r46;
        this.A19 = r57;
        this.A0l = r36;
        this.A09 = (ViewStub) C06560Yg.A02(view, R.id.conversation_row_label_view_stub);
        C105075Tm r5 = new C105075Tm(r1.A00, r15, (ConversationListRowHeaderView) C06560Yg.A02(view, R.id.conversations_row_header), r9, r10, r11);
        this.A0c = r5;
        this.A06 = C06560Yg.A02(view, R.id.contact_row_container);
        this.A04 = C06560Yg.A02(view, R.id.contact_row_selected);
        C106905aM.A04(r5.A05.A02);
        this.A08 = C06560Yg.A02(view, R.id.progressbar_small);
        this.A0B = AnonymousClass0x9.A0E(view, R.id.contact_photo);
        this.A07 = C06560Yg.A02(view, R.id.hover_action);
        ViewStub viewStub = (ViewStub) C06560Yg.A02(view, R.id.subgroup_contact_photo);
        if (this.A0s.A0X(4160)) {
            viewStub.setLayoutResource(R.layout.f8nameremoved);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            C86654Ky.A0y(context.getResources(), viewStub, layoutParams, R.dimen.f6nameremoved);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            View A022 = C06560Yg.A02(view, R.id.conversations_row_ephemeral_status);
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(A022);
            A0T2.width = dimensionPixelSize2;
            A0T2.height = dimensionPixelSize2;
            A0T2.topMargin = dimensionPixelSize;
            A022.setLayoutParams(A0T2);
        }
        this.A16 = new AnonymousClass5UY(viewStub);
        this.A15 = AnonymousClass0x2.A0M(view, R.id.parent_stack_photo);
        this.A05 = C06560Yg.A02(view, R.id.contact_selector);
        this.A0P = AnonymousClass0x7.A0K(view, R.id.single_msg_tv);
        this.A03 = C06560Yg.A02(view, R.id.bottom_row);
        this.A0Q = AnonymousClass0x7.A0K(view, R.id.msg_from_tv);
        this.A0G = AnonymousClass0x9.A0E(view, R.id.conversation_row_single_subgroup_bullet);
        this.A0S = AnonymousClass0x9.A0L(view, R.id.conversations_row_unseen_important_message_indicator);
        TextView A0G2 = C18300x5.A0G(view, R.id.conversations_row_message_count);
        this.A0J = A0G2;
        this.A0R = AnonymousClass0x9.A0L(view, R.id.community_unread_indicator);
        this.A0H = AnonymousClass0x9.A0E(view, R.id.status_indicator);
        this.A0I = AnonymousClass0x9.A0E(view, R.id.status_reply_indicator);
        this.A0D = AnonymousClass0x9.A0E(view, R.id.message_type_indicator);
        this.A0T = AnonymousClass0x7.A0L(view, R.id.payments_indicator);
        ImageView A0E2 = AnonymousClass0x9.A0E(view, R.id.mute_indicator);
        this.A0E = A0E2;
        ImageView A0E3 = AnonymousClass0x9.A0E(view, R.id.pin_indicator);
        this.A0F = A0E3;
        if (C1001059l.A04) {
            A0E2.setImageResource(R.drawable.ic_inline_mute_filled_wds);
            A0E3.setImageResource(R.drawable.ic_inline_pin_new_filled_wds);
        }
        if (r11.A0X(363)) {
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            C107555bV.A03(A0E2, dimensionPixelSize3, 0);
            C107555bV.A03(A0E3, dimensionPixelSize3, 0);
            C107555bV.A03(A0G2, dimensionPixelSize3, 0);
        }
        if (r11.A0X(363)) {
            C18290x4.A1A(context, A0E3, C1001059l.A04 ? R.drawable.ic_inline_pin_new_filled_wds : R.drawable.ic_inline_pin_new);
        }
        C107335b8.A0E(A0E3, AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
        this.A02 = C06560Yg.A02(view, R.id.archived_indicator);
        this.A0X = (SelectionCheckView) C06560Yg.A02(view, R.id.selection_check);
        this.A0C = AnonymousClass0x9.A0E(view, R.id.conversations_row_ephemeral_status);
        this.A0A = AnonymousClass0x9.A0E(view, R.id.conversations_row_call_type_indicator);
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [X.5ZN] */
    /* JADX WARNING: type inference failed for: r31v4, types: [X.4pw] */
    /* JADX WARNING: type inference failed for: r15v7, types: [X.4px] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.4px] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass659 r69, X.C182338oF r70, X.AnonymousClass5OF r71, int r72, int r73, boolean r74) {
        /*
            r68 = this;
            r13 = r68
            android.content.Context r16 = X.C86664Kz.A0T(r13)
            X.659 r0 = r13.A01
            r2 = r69
            boolean r0 = X.AnonymousClass75J.A00(r0, r2)
            if (r0 != 0) goto L_0x0019
            X.5ZN r0 = r13.A00
            if (r0 == 0) goto L_0x0017
            r0.A06()
        L_0x0017:
            r13.A01 = r2
        L_0x0019:
            X.5ZN r1 = r13.A00
            if (r1 == 0) goto L_0x0027
            X.2m0 r0 = r1.A00
            if (r0 == 0) goto L_0x0027
            r0.A02()
            r0 = 0
            r1.A00 = r0
        L_0x0027:
            android.widget.ImageView r1 = r13.A0B
            r0 = 0
            r1.setTag(r0)
            X.1VX r0 = r13.A0s
            r47 = r0
            r1 = 3580(0xdfc, float:5.017E-42)
            boolean r0 = r0.A0X(r1)
            r56 = r71
            if (r0 == 0) goto L_0x0125
            boolean r0 = r2 instanceof X.C97914zU
            if (r0 == 0) goto L_0x0125
            r61 = 7
            X.2sH r0 = r13.A0g
            r33 = r0
            X.3Wi r0 = r13.A0M
            r67 = r0
            X.5Xz r0 = r13.A0x
            r50 = r0
            X.2sr r0 = r13.A0N
            r66 = r0
            X.2oU r0 = r13.A0h
            r34 = r0
            X.4FS r0 = r13.A17
            r59 = r0
            X.2sS r0 = r13.A0V
            r65 = r0
            X.2ss r0 = r13.A0m
            r39 = r0
            X.3LP r0 = r13.A0t
            r46 = r0
            X.9Wq r0 = r13.A10
            r53 = r0
            X.5UX r0 = r13.A0Y
            r64 = r0
            X.3Ex r0 = r13.A0Z
            r63 = r0
            X.2nK r0 = r13.A0L
            r62 = r0
            X.2cU r0 = r13.A0n
            r40 = r0
            X.33i r0 = r13.A0f
            r29 = r0
            X.5ZU r0 = r13.A0a
            r28 = r0
            X.33j r0 = r13.A0j
            r27 = r0
            X.2rN r0 = r13.A13
            r26 = r0
            X.9U4 r0 = r13.A0z
            r25 = r0
            X.5ae r0 = r13.A14
            r24 = r0
            X.2sq r0 = r13.A0U
            r23 = r0
            X.2rV r0 = r13.A0p
            r22 = r0
            X.2lX r0 = r13.A0u
            r21 = r0
            X.2sW r0 = r13.A0k
            r20 = r0
            X.1R1 r0 = r13.A12
            r19 = r0
            X.33f r0 = r13.A0q
            r18 = r0
            X.2R8 r0 = r13.A0r
            r17 = r0
            X.33p r15 = r13.A0i
            X.2so r14 = r13.A0W
            X.2rn r11 = r13.A0o
            X.5Mz r10 = r13.A0d
            X.99n r9 = r13.A0y
            X.35q r8 = r13.A0O
            X.5rC r7 = r13.A0K
            X.66t r6 = r13.A0e
            X.5Uq r5 = r13.A0b
            X.2hp r4 = r13.A11
            X.2Sx r3 = r13.A0w
            X.2Gt r2 = r13.A0v
            X.8qC r1 = r13.A19
            X.2sA r0 = r13.A0l
            X.4px r12 = new X.4px
            r30 = r6
            r31 = r13
            r32 = r29
            r35 = r15
            r36 = r27
            r37 = r20
            r38 = r0
            r41 = r11
            r42 = r22
            r43 = r18
            r44 = r17
            r45 = r47
            r47 = r21
            r48 = r2
            r49 = r3
            r51 = r9
            r52 = r25
            r54 = r4
            r55 = r19
            r57 = r26
            r58 = r24
            r60 = r1
            r15 = r12
            r17 = r7
            r18 = r62
            r19 = r67
            r20 = r66
            r21 = r8
            r22 = r23
            r23 = r65
            r24 = r14
            r25 = r64
            r26 = r63
            r27 = r28
            r28 = r5
            r29 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
        L_0x0115:
            r13.A00 = r12
        L_0x0117:
            X.5ZN r1 = r13.A00
            X.659 r0 = r13.A01
            r4 = r70
            r3 = r73
            r2 = r74
            r1.A08(r0, r4, r3, r2)
            return
        L_0x0125:
            boolean r0 = r2 instanceof X.C97884zQ
            if (r0 == 0) goto L_0x0201
            X.2sH r0 = r13.A0g
            r33 = r0
            X.3Wi r0 = r13.A0M
            r67 = r0
            X.5Xz r0 = r13.A0x
            r50 = r0
            X.2sr r0 = r13.A0N
            r66 = r0
            X.2oU r0 = r13.A0h
            r34 = r0
            X.4FS r0 = r13.A17
            r59 = r0
            X.2sS r0 = r13.A0V
            r65 = r0
            X.2ss r0 = r13.A0m
            r39 = r0
            X.3LP r0 = r13.A0t
            r46 = r0
            X.9Wq r0 = r13.A10
            r53 = r0
            X.5UX r0 = r13.A0Y
            r64 = r0
            X.3Ex r0 = r13.A0Z
            r63 = r0
            X.2nK r0 = r13.A0L
            r62 = r0
            X.2cU r0 = r13.A0n
            r40 = r0
            X.33i r0 = r13.A0f
            r29 = r0
            X.5ZU r0 = r13.A0a
            r28 = r0
            X.33j r0 = r13.A0j
            r27 = r0
            X.2rN r0 = r13.A13
            r26 = r0
            X.9U4 r0 = r13.A0z
            r25 = r0
            X.5ae r0 = r13.A14
            r24 = r0
            X.2sq r0 = r13.A0U
            r23 = r0
            X.2rV r0 = r13.A0p
            r22 = r0
            X.2lX r0 = r13.A0u
            r21 = r0
            X.2sW r0 = r13.A0k
            r20 = r0
            X.1R1 r0 = r13.A12
            r19 = r0
            X.33f r0 = r13.A0q
            r18 = r0
            X.2R8 r0 = r13.A0r
            r17 = r0
            X.33p r15 = r13.A0i
            X.2so r14 = r13.A0W
            X.2rn r11 = r13.A0o
            X.5Mz r10 = r13.A0d
            X.99n r9 = r13.A0y
            X.35q r8 = r13.A0O
            X.5rC r7 = r13.A0K
            X.66t r6 = r13.A0e
            X.5Uq r5 = r13.A0b
            X.2hp r4 = r13.A11
            X.2Sx r3 = r13.A0w
            X.2Gt r2 = r13.A0v
            X.8qC r1 = r13.A19
            X.2sA r0 = r13.A0l
            X.4px r12 = new X.4px
            r30 = r6
            r31 = r13
            r32 = r29
            r35 = r15
            r36 = r27
            r37 = r20
            r38 = r0
            r41 = r11
            r42 = r22
            r43 = r18
            r44 = r17
            r45 = r47
            r47 = r21
            r48 = r2
            r49 = r3
            r51 = r9
            r52 = r25
            r54 = r4
            r55 = r19
            r57 = r26
            r58 = r24
            r60 = r1
            r61 = r72
            r15 = r12
            r17 = r7
            r18 = r62
            r19 = r67
            r20 = r66
            r21 = r8
            r22 = r23
            r23 = r65
            r24 = r14
            r25 = r64
            r26 = r63
            r27 = r28
            r28 = r5
            r29 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x0115
        L_0x0201:
            boolean r0 = r2 instanceof X.C97874zP
            if (r0 == 0) goto L_0x0286
            X.2oU r0 = r13.A0h
            r26 = r0
            X.2sH r0 = r13.A0g
            r25 = r0
            X.5Xz r0 = r13.A0x
            r24 = r0
            X.2sr r0 = r13.A0N
            r23 = r0
            X.2ss r0 = r13.A0m
            r22 = r0
            X.3LP r0 = r13.A0t
            r21 = r0
            X.9Wq r0 = r13.A10
            r20 = r0
            X.3Ex r0 = r13.A0Z
            r19 = r0
            X.2cU r0 = r13.A0n
            r18 = r0
            X.33i r0 = r13.A0f
            r17 = r0
            X.5ZU r15 = r13.A0a
            X.33j r14 = r13.A0j
            X.2rN r11 = r13.A13
            X.9U4 r10 = r13.A0z
            X.2sq r9 = r13.A0U
            X.2lX r8 = r13.A0u
            X.1R1 r7 = r13.A12
            X.99n r6 = r13.A0y
            X.35q r5 = r13.A0O
            X.5ae r4 = r13.A14
            X.5Uq r3 = r13.A0b
            X.66t r2 = r13.A0e
            X.2hp r1 = r13.A11
            X.8qC r0 = r13.A19
            X.4pw r12 = new X.4pw
            r31 = r12
            r32 = r16
            r33 = r23
            r34 = r5
            r35 = r9
            r36 = r19
            r37 = r15
            r38 = r3
            r39 = r2
            r40 = r13
            r41 = r17
            r42 = r25
            r43 = r26
            r44 = r14
            r45 = r22
            r46 = r18
            r48 = r21
            r49 = r8
            r50 = r24
            r51 = r6
            r52 = r10
            r53 = r20
            r54 = r1
            r55 = r7
            r57 = r11
            r58 = r4
            r59 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            goto L_0x0115
        L_0x0286:
            boolean r0 = r2 instanceof X.AnonymousClass4zO
            if (r0 == 0) goto L_0x0117
            X.2oU r0 = r13.A0h
            r27 = r0
            X.2sH r0 = r13.A0g
            r26 = r0
            X.5Xz r0 = r13.A0x
            r34 = r0
            X.2sr r0 = r13.A0N
            r17 = r0
            X.2ss r0 = r13.A0m
            r29 = r0
            X.3LP r0 = r13.A0t
            r32 = r0
            X.9Wq r0 = r13.A10
            r37 = r0
            X.3Ex r0 = r13.A0Z
            r20 = r0
            X.2cU r0 = r13.A0n
            r30 = r0
            X.33i r15 = r13.A0f
            X.5ZU r14 = r13.A0a
            X.33j r12 = r13.A0j
            X.2rN r11 = r13.A13
            X.9U4 r10 = r13.A0z
            X.2sq r9 = r13.A0U
            X.2lX r8 = r13.A0u
            X.99n r7 = r13.A0y
            X.35q r6 = r13.A0O
            X.5ae r5 = r13.A14
            X.5Mz r4 = r13.A0d
            X.66t r3 = r13.A0e
            X.2hp r2 = r13.A11
            X.8qC r1 = r13.A19
            X.4pv r0 = new X.4pv
            r18 = r6
            r19 = r9
            r21 = r14
            r22 = r4
            r23 = r3
            r24 = r13
            r25 = r15
            r28 = r12
            r31 = r47
            r33 = r8
            r35 = r7
            r36 = r10
            r38 = r2
            r39 = r11
            r40 = r5
            r41 = r1
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r13.A00 = r0
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ViewHolder.A0D(X.659, X.8oF, X.5OF, int, int, boolean):void");
    }
}
