package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.32T  reason: invalid class name */
public final class AnonymousClass32T {
    public AnonymousClass3ZH A00;
    public C27991fJ A01;
    public final Context A02;
    public final C625735q A03;
    public final C56942so A04;
    public final AnonymousClass67D A05;
    public final C64773Ex A06;
    public final C105365Uq A07;
    public final C114015mM A08;
    public final C182208o2 A09;
    public final C182218o3 A0A;
    public final C182228o4 A0B;
    public final C182238o5 A0C;
    public final AnonymousClass677 A0D;
    public final AnonymousClass3ZH A0E;
    public final C31871oz A0F;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.0z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.4cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.0z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.0z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.571} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.571} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.574} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.574} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.0z5} */
    /* JADX WARNING: type inference failed for: r11v6, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass32T(android.content.Context r18, X.C625735q r19, X.C56942so r20, X.AnonymousClass67D r21, X.C64773Ex r22, X.C114015mM r23, X.AnonymousClass677 r24, X.C31871oz r25) {
        /*
            r17 = this;
            r10 = 1
            r4 = r21
            X.C162457s7.A0J(r4, r10)
            r7 = r19
            r6 = r20
            r5 = r22
            r3 = r23
            X.C18260x0.A0e(r7, r6, r3, r5)
            r1 = r18
            r2 = r24
            r8 = r25
            X.C18260x0.A0W(r1, r8, r2)
            r0 = r17
            r0.<init>()
            r0.A05 = r4
            r0.A03 = r7
            r0.A04 = r6
            r0.A08 = r3
            r0.A06 = r5
            r0.A02 = r1
            r0.A0F = r8
            r0.A0D = r2
            android.app.Activity r3 = X.C621633u.A00(r1)
            boolean r2 = r3 instanceof X.C835648x
            if (r2 == 0) goto L_0x0261
            X.48x r3 = (X.C835648x) r3
            X.5Uq r4 = r3.getContactPhotosLoader()
        L_0x003d:
            X.C162457s7.A0H(r4)
            r0.A07 = r4
            int r3 = r8.A00
            r2 = 139(0x8b, float:1.95E-43)
            r11 = 0
            if (r3 != r2) goto L_0x023c
            r2 = 2
            com.whatsapp.jid.GroupJid r2 = r8.A1x(r2)
            X.1fJ r3 = X.AnonymousClass34R.A03(r2)
        L_0x0052:
            com.whatsapp.jid.GroupJid r2 = r8.A1x(r10)
            X.1fJ r2 = X.AnonymousClass34R.A03(r2)
            r0.A01 = r2
            if (r2 == 0) goto L_0x0239
            if (r3 == 0) goto L_0x0239
            X.1fJ r12 = r6.A01(r3)
        L_0x0064:
            X.1fJ r2 = r0.A01
            if (r2 == 0) goto L_0x0236
            X.3ZH r6 = r5.A0A(r2)
        L_0x006c:
            r0.A0E = r6
            if (r3 == 0) goto L_0x0233
            X.3ZH r5 = r5.A0A(r3)
        L_0x0074:
            r0.A00 = r5
            boolean r2 = r8 instanceof X.C31401oE
            if (r2 == 0) goto L_0x00b1
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r2 = A00(r1, r4, r6)
            r0.A0B = r2
            X.1fJ r6 = r0.A01
            X.570 r7 = new X.570
            r7.<init>(r1)
            if (r6 == 0) goto L_0x0092
            r9 = 2
            X.5en r5 = new X.5en
            r5.<init>(r6, r7, r8, r9, r10)
            r7.setOnClickListener(r5)
        L_0x0092:
            r0.A0A = r7
        L_0x0094:
            X.4cs r2 = new X.4cs
            r2.<init>(r1)
            r2.A0L(r8)
            r0.A0C = r2
            X.4cr r5 = new X.4cr
            r5.<init>(r1)
            X.35q r1 = r5.getSystemMessageTextResolver()
            java.lang.String r1 = r1.A0O(r8, r10)
            r5.A0I(r1)
        L_0x00ae:
            r0.A09 = r5
            return
        L_0x00b1:
            boolean r2 = r8 instanceof X.C31421oG
            if (r2 != 0) goto L_0x0207
            boolean r2 = r8 instanceof X.C31441oI
            if (r2 != 0) goto L_0x0207
            boolean r2 = r8 instanceof X.C31431oH
            if (r2 != 0) goto L_0x0207
            boolean r2 = r8 instanceof X.C31411oF
            if (r2 == 0) goto L_0x012c
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r2 = A00(r1, r4, r6)
            r0.A0B = r2
            if (r6 == 0) goto L_0x00cd
            com.whatsapp.jid.Jid r11 = X.AnonymousClass3ZH.A04(r6)
        L_0x00cd:
            X.572 r6 = new X.572
            r6.<init>(r1)
            if (r11 == 0) goto L_0x00e0
            r15 = 7
            X.5ep r10 = new X.5ep
            r12 = r6
            r13 = r11
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r6.setOnClickListener(r10)
        L_0x00e0:
            r0.A0A = r6
        L_0x00e2:
            X.4cs r2 = new X.4cs
            r2.<init>(r1)
            r2.A0L(r8)
            r0.A0C = r2
            X.0z5 r5 = new X.0z5
            r5.<init>(r1)
            r6 = 0
            X.35q r2 = r5.getSystemMessageTextResolver()
            r1 = 1
            java.lang.String r2 = r2.A0O(r8, r1)
            if (r2 == 0) goto L_0x00ae
            java.lang.String r1 = "\n"
            java.util.List r1 = X.AnonymousClass2AB.A02(r2, r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x0107:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00ae
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r5)
            r1 = 2131624545(0x7f0e0261, float:1.8876273E38)
            android.view.View r2 = r2.inflate(r1, r5, r6)
            r1 = 2131431506(0x7f0b1052, float:1.8484743E38)
            android.view.View r1 = X.C18280x3.A0E(r2, r1)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r1.A0I(r3)
            r5.addView(r2)
            goto L_0x0107
        L_0x012c:
            boolean r2 = r8 instanceof X.C31371oB
            if (r2 != 0) goto L_0x0218
            boolean r2 = r8 instanceof X.C31381oC
            if (r2 != 0) goto L_0x0218
            boolean r2 = r8 instanceof X.C31361oA
            if (r2 == 0) goto L_0x0168
            X.0z6 r2 = A01(r1, r4, r5, r6)
            r0.A0B = r2
            X.1fJ r10 = r0.A01
            X.574 r6 = new X.574
            r6.<init>(r1)
            X.2sr r2 = r6.getMeManager()
            boolean r3 = X.C56972sr.A0A(r2, r8)
            r2 = 2131893244(0x7f121bfc, float:1.942126E38)
            if (r3 == 0) goto L_0x0155
            r2 = 2131893234(0x7f121bf2, float:1.9421239E38)
        L_0x0155:
            r6.setText(r2)
            if (r10 == 0) goto L_0x00e0
            r14 = 6
            X.5ep r9 = new X.5ep
            r11 = r6
            r12 = r8
            r13 = r10
            r9.<init>(r10, r11, r12, r13, r14)
            r6.setOnClickListener(r9)
            goto L_0x00e0
        L_0x0168:
            boolean r2 = r8 instanceof X.C31391oD
            if (r2 == 0) goto L_0x0199
            r2 = 2
            X.C162457s7.A0J(r4, r2)
            r3 = 0
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r2 = new com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader
            r2.<init>(r1, r11, r3)
            r2.A07(r5, r4)
            r0.A0B = r2
            X.573 r4 = new X.573
            r4.<init>(r1)
            r3 = 33
            X.5eg r2 = new X.5eg
            r2.<init>(r8, r3, r4)
            r4.setOnClickListener(r2)
            r0.A0A = r4
            X.4cs r2 = new X.4cs
            r2.<init>(r1)
            r2.A0L(r8)
            r0.A0C = r2
            r0.A09 = r11
            return
        L_0x0199:
            boolean r2 = r8 instanceof X.C31471oL
            if (r2 == 0) goto L_0x01b6
            if (r5 == 0) goto L_0x01ab
            X.C162457s7.A0J(r4, r10)
            r2 = 2
            X.1Nq r11 = new X.1Nq
            r11.<init>(r1)
            r11.setSubgroupProfilePhoto(r5, r2, r4)
        L_0x01ab:
            r0.A0B = r11
            X.3F4 r2 = new X.3F4
            r2.<init>(r1, r3, r12, r8)
            r0.A0A = r2
            goto L_0x0094
        L_0x01b6:
            boolean r2 = r8 instanceof X.C31461oK
            if (r2 == 0) goto L_0x01dd
            r15 = 2
            X.C162457s7.A0J(r4, r15)
            r3 = 0
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r2 = new com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader
            r2.<init>(r1, r11, r3)
            r2.A07(r5, r4)
            r0.A0B = r2
            X.570 r13 = new X.570
            r13.<init>(r1)
            X.5en r11 = new X.5en
            r14 = r8
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r13.setOnClickListener(r11)
            r0.A0A = r13
            goto L_0x00e2
        L_0x01dd:
            boolean r2 = r8 instanceof X.C31451oJ
            if (r2 == 0) goto L_0x026b
            r2 = 2
            X.C162457s7.A0J(r4, r2)
            r3 = 0
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r2 = new com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader
            r2.<init>(r1, r11, r3)
            r2.A07(r5, r4)
            r0.A0B = r2
            X.1fJ r5 = r0.A01
            X.571 r6 = new X.571
            r6.<init>(r1)
            if (r5 == 0) goto L_0x0203
            r9 = 5
            X.5ep r4 = new X.5ep
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            r6.setOnClickListener(r4)
        L_0x0203:
            r0.A0A = r6
            goto L_0x00e2
        L_0x0207:
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r2 = A00(r1, r4, r6)
            r0.A0B = r2
            X.1fJ r5 = r0.A01
            X.572 r6 = new X.572
            r6.<init>(r1)
            if (r5 == 0) goto L_0x00e0
            r9 = 7
            goto L_0x0228
        L_0x0218:
            X.0z6 r2 = A01(r1, r4, r5, r6)
            r0.A0B = r2
            X.1fJ r5 = r0.A01
            X.571 r6 = new X.571
            r6.<init>(r1)
            if (r5 == 0) goto L_0x00e0
            r9 = 5
        L_0x0228:
            X.5ep r4 = new X.5ep
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            r6.setOnClickListener(r4)
            goto L_0x00e0
        L_0x0233:
            r5 = r11
            goto L_0x0074
        L_0x0236:
            r6 = r11
            goto L_0x006c
        L_0x0239:
            r12 = r11
            goto L_0x0064
        L_0x023c:
            r2 = 122(0x7a, float:1.71E-43)
            if (r3 == r2) goto L_0x025e
            r2 = 123(0x7b, float:1.72E-43)
            if (r3 == r2) goto L_0x025e
            r2 = 124(0x7c, float:1.74E-43)
            if (r3 == r2) goto L_0x025e
            r2 = 144(0x90, float:2.02E-43)
            if (r3 == r2) goto L_0x025e
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 == r2) goto L_0x025e
            X.2z0 r2 = r8.A1J
            X.4uZ r3 = r2.A00
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C162457s7.A0K(r3, r2)
            X.1fJ r3 = (X.C27991fJ) r3
            goto L_0x0052
        L_0x025e:
            r3 = r11
            goto L_0x0052
        L_0x0261:
            X.5mM r3 = r0.A08
            java.lang.String r2 = "context-card"
            X.5Uq r4 = r3.A06(r1, r2)
            goto L_0x003d
        L_0x026b:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32T.<init>(android.content.Context, X.35q, X.2so, X.67D, X.3Ex, X.5mM, X.677, X.1oz):void");
    }

    public static final CommunityPhotoHeader A00(Context context, C105365Uq r5, AnonymousClass3ZH r6) {
        C162457s7.A0J(r5, 1);
        CommunityPhotoHeader communityPhotoHeader = new CommunityPhotoHeader(context, (AttributeSet) null, 0);
        r5.A02(communityPhotoHeader, new C626035t(communityPhotoHeader, 4), r6, communityPhotoHeader.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        return communityPhotoHeader;
    }

    public static final C19260z6 A01(Context context, C105365Uq r6, AnonymousClass3ZH r7, AnonymousClass3ZH r8) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        C162457s7.A0J(r6, 3);
        C19260z6 r4 = new C19260z6(context);
        GroupPhotoHeader groupPhotoHeader = r4.A02;
        if (groupPhotoHeader != null) {
            if (r4.getWhatsAppLocale().A05().A06) {
                scaleType2 = ImageView.ScaleType.FIT_START;
            } else {
                scaleType2 = ImageView.ScaleType.FIT_END;
            }
            groupPhotoHeader.setScaleType(scaleType2);
            groupPhotoHeader.A07(r7, r6);
        }
        WaImageView waImageView = r4.A00;
        if (waImageView != null) {
            C18270x1.A0d(r4.getContext(), waImageView, r4.getWhatsAppLocale(), R.drawable.ic_arrow);
        }
        CommunityPhotoHeader communityPhotoHeader = r4.A01;
        if (communityPhotoHeader != null) {
            if (r4.getWhatsAppLocale().A05().A06) {
                scaleType = ImageView.ScaleType.FIT_END;
            } else {
                scaleType = ImageView.ScaleType.FIT_START;
            }
            communityPhotoHeader.setScaleType(scaleType);
            r6.A02(communityPhotoHeader, new C626035t(communityPhotoHeader, 4), r8, communityPhotoHeader.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        }
        return r4;
    }
}
