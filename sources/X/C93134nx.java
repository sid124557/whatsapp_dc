package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4nx  reason: invalid class name and case insensitive filesystem */
public abstract class C93134nx extends C133456hN {
    public C620433g A00;
    public C29421in A01;
    public C114015mM A02;
    public boolean A03 = true;
    public final ViewGroup A04;
    public final AnonymousClass5YB A05 = AnonymousClass5YB.A00(this, this.A0G, R.id.contact_name);
    public final WaTextView A06;
    public final C56602sG A07;
    public final C105365Uq A08;
    public final AnonymousClass3ZH A09 = this.A1H.A01(AnonymousClass2z0.A00(this.A0S));
    public final WDSProfilePhoto A0A;

    public C93134nx(Context context, AnonymousClass677 r5, C30341mI r6) {
        super(context, r5, r6);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C18290x4.A0M(this, R.id.contact_photo);
        this.A0A = wDSProfilePhoto;
        wDSProfilePhoto.setContentDescription(getResources().getText(R.string.f11nameremoved));
        this.A08 = getContactPhotos().A06(context, "conversation-row-contact-info");
        this.A06 = (WaTextView) C18290x4.A0M(this, R.id.info);
        this.A04 = (ViewGroup) C18290x4.A0M(this, R.id.contact_info_header);
        this.A07 = AnonymousClass681.A00(this, 18);
    }

    public void A1q(C624134x r3, boolean z) {
        C162457s7.A0J(r3, 0);
        boolean A1W = C18300x5.A1W(r3, this.A0S);
        super.A1q(r3, z);
        if (z || A1W) {
            A25();
        }
        if (this.A03) {
            getContactObservers().A06(this.A07);
            this.A03 = false;
        }
    }

    public abstract int getLayout();

    public final void setBusinessProfileManager(C620433g r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setContactObservers(C29421in r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0178, code lost:
        if (r10.length() == 0) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A25() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C93124nw
            if (r0 == 0) goto L_0x00cf
            r2 = r15
            X.4nw r2 = (X.C93124nw) r2
            X.33j r1 = r2.A0M
            r0 = 0
            X.C107555bV.A05(r2, r1, r0, r0)
            X.4UP r3 = r2.A0E
            X.7CZ r0 = r3.A02
            X.3ZH r7 = r3.A03
            X.61Q r9 = new X.61Q
            r9.<init>(r3)
            X.5su r1 = r0.A00
            X.3Db r0 = r1.A03
            X.2sr r5 = X.C64333Db.A06(r0)
            X.5ZU r6 = X.C64333Db.A28(r0)
            X.4as r0 = r1.A01
            X.5ON r8 = r0.ACW()
            X.55C r4 = new X.55C
            r4.<init>(r5, r6, r7, r8, r9)
            X.4FS r0 = r3.A04
            X.AnonymousClass0x7.A1B(r4, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168846(0x7f070e4e, float:1.7952005E38)
            int r5 = r1.getDimensionPixelSize(r0)
            X.5Uq r4 = r2.A08
            X.3ZH r3 = r2.A09
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = r2.A0A
            r0 = 1
            r4.A09(r1, r3, r5, r0)
            r2.A26()
            r3 = 8
            X.2sq r1 = r2.A0q
            X.34x r0 = r2.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r0)
            boolean r0 = r1.A0P(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0G
            if (r0 == 0) goto L_0x00b5
            r1.setVisibility(r3)
        L_0x0065:
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A0F
            r0.setVisibility(r3)
        L_0x006a:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0H
            r0 = 26
            X.C109345eT.A00(r1, r2, r0)
            X.1VX r1 = r2.A0O
            r0 = 6140(0x17fc, float:8.604E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0214
            X.34x r0 = r2.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A05(r0)
            if (r1 == 0) goto L_0x0214
            X.2n3 r0 = r2.getEntrypointConversionManager()
            X.2wd r0 = r0.A00
            X.2pe r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0214
            java.lang.String r1 = "business_search"
            java.lang.String r0 = r0.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0214
            X.5rC r0 = r2.getFmxChatAttributionViewUtil()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0214
            X.5rC r0 = r2.getFmxChatAttributionViewUtil()
            r0.A04()
            java.lang.String r0 = "getAttributionTextLayoutId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00b5:
            X.6wT r0 = X.C141996wT.DESTRUCTIVE
            r1.setAction(r0)
            r0 = 24
            X.C109345eT.A00(r1, r2, r0)
            X.2sr r0 = r2.A0Z
            boolean r0 = X.C86664Kz.A1W(r0)
            if (r0 == 0) goto L_0x0065
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0F
            r0 = 25
            X.C109345eT.A00(r1, r2, r0)
            goto L_0x006a
        L_0x00cf:
            r6 = r15
            X.4n6 r6 = (X.C92694n6) r6
            X.2m8 r0 = r6.A26()
            r6.A00 = r0
            X.2Xt r7 = r6.A0C
            X.3ZH r5 = r6.A09
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r5.A0I(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.2m8 r0 = r6.A00
            r2 = 1
            r7.A00(r0, r1, r2)
            X.5YB r1 = r6.A05
            r1.A08(r5)
            boolean r0 = r5.A0P()
            if (r0 == r2) goto L_0x00f6
            r2 = 0
        L_0x00f6:
            r1.A06(r2)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168846(0x7f070e4e, float:1.7952005E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.5Uq r2 = r6.A08
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = r6.A0A
            r0 = 1
            r2.A09(r1, r5, r3, r0)
            X.2qS r0 = r5.A0E
            com.whatsapp.WaTextView r2 = r6.A06
            if (r0 == 0) goto L_0x023c
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131887158(0x7f120436, float:1.9408915E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.setText(r0)
            r0 = 0
        L_0x0121:
            r2.setVisibility(r0)
            X.2m8 r8 = r6.A00
            if (r8 == 0) goto L_0x0204
            r0 = 2131427411(0x7f0b0053, float:1.8476437E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r6, r0)
            java.lang.Long r0 = r8.A00
            if (r0 == 0) goto L_0x0238
            long r0 = r0.longValue()
            X.33j r3 = r6.A0D
            r2 = 178(0xb2, float:2.5E-43)
            java.lang.String r9 = X.C86614Ku.A0v(r3, r2, r0)
            X.C162457s7.A0D(r9)
            android.content.Context r3 = r6.getContext()
            r2 = 2131886759(0x7f1202a7, float:1.9408106E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            r0 = 0
            r1[r0] = r9
            X.AnonymousClass001.A0y(r3, r10, r1, r2)
        L_0x0153:
            r10.setVisibility(r0)
            java.lang.String r2 = r8.A01
            if (r2 == 0) goto L_0x0160
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0215
        L_0x0160:
            java.lang.String r10 = r8.A02
            if (r10 == 0) goto L_0x016a
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0215
        L_0x016a:
            com.whatsapp.jid.Jid r9 = r5.A0I(r4)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            r2 = 0
            if (r10 == 0) goto L_0x017a
            int r1 = r10.length()
            r0 = 0
            if (r1 != 0) goto L_0x017b
        L_0x017a:
            r0 = 1
        L_0x017b:
            r0 = r0 ^ 1
            if (r9 == 0) goto L_0x0204
            if (r0 == 0) goto L_0x0204
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0204
            X.1VX r1 = r6.A0O
            r0 = 4875(0x130b, float:6.831E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0204
            com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts r8 = r6.A0B
            r8.setVisibility(r2)
            X.2m8 r1 = r6.A00
            r0 = 5
            r7.A00(r1, r9, r0)
            X.4eZ r7 = r6.A08
            X.65M r3 = r6.getLinkedAccountMediaGraphQLServiceFactory()
            X.53s r2 = r6.getLinkedAccountMediaCacheManager()
            X.7ai r1 = r6.getLinkedAccountMediaImageLoader()
            X.5gm r0 = new X.5gm
            r0.<init>(r9, r1, r2, r3)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r0, r7)
            java.lang.Class<X.4Uk> r0 = X.AnonymousClass4Uk.class
            X.0Ty r3 = r1.A01(r0)
            X.4Uk r3 = (X.AnonymousClass4Uk) r3
            X.08M r2 = r3.A02
            X.61A r1 = new X.61A
            r1.<init>(r6)
            r0 = 184(0xb8, float:2.58E-43)
            X.C86604Kt.A1N(r7, r2, r1, r0)
            X.08M r2 = r3.A01
            X.61B r1 = new X.61B
            r1.<init>(r6)
            r0 = 185(0xb9, float:2.59E-43)
            X.C86604Kt.A1N(r7, r2, r1, r0)
            X.08M r2 = r3.A00
            X.61C r1 = new X.61C
            r1.<init>(r6)
            r0 = 186(0xba, float:2.6E-43)
            X.C86604Kt.A1N(r7, r2, r1, r0)
            r8.A00 = r3
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168386(0x7f070c82, float:1.7951072E38)
            int r9 = X.AnonymousClass4L0.A01(r1, r0)
            com.whatsapp.jid.UserJid r8 = r3.A03
            r11 = 1
            X.2nU r7 = new X.2nU
            r13 = r11
            r14 = r11
            r10 = r9
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.6BX r1 = new X.6BX
            r1.<init>(r3, r11)
            X.65M r0 = r3.A06
            X.5n8 r0 = r0.B0B(r1, r7)
            r0.A00()
        L_0x0204:
            com.whatsapp.jid.Jid r0 = r5.A0I(r4)
            if (r0 == 0) goto L_0x0214
            r6.getStartFlowPrototypeUtil()
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A0G
            r0 = 8
            r1.setVisibility(r0)
        L_0x0214:
            return
        L_0x0215:
            com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r0 = r6.A09
            r1 = 0
            r6.A27(r1, r0, r2)
            com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r0 = r6.A0A
            java.lang.String r10 = r8.A02
            r6.A27(r1, r0, r10)
            X.33g r3 = r6.getBusinessProfileManager()
            com.whatsapp.jid.Jid r2 = r5.A0I(r4)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r1 = 8
            X.5r6 r0 = new X.5r6
            r0.<init>(r8, r1, r6)
            r3.A06(r0, r2)
            goto L_0x016a
        L_0x0238:
            r0 = 8
            goto L_0x0153
        L_0x023c:
            r0 = 8
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93134nx.A25():void");
    }

    public int getBackgroundResource() {
        return 0;
    }

    public final C620433g getBusinessProfileManager() {
        C620433g r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("businessProfileManager");
    }

    public final AnonymousClass3ZH getContact() {
        return this.A09;
    }

    public final AnonymousClass5YB getContactNameViewController() {
        return this.A05;
    }

    public final C29421in getContactObservers() {
        C29421in r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactObservers");
    }

    public final WDSProfilePhoto getContactPhoto() {
        return this.A0A;
    }

    public final C105365Uq getContactPhotoLoader() {
        return this.A08;
    }

    public final C114015mM getContactPhotos() {
        C114015mM r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final WaTextView getContactType() {
        return this.A06;
    }

    public final ViewGroup getHeader() {
        return this.A04;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public void onDetachedFromWindow() {
        this.A08.A00();
        getContactObservers().A07(this.A07);
        this.A03 = true;
        super.onDetachedFromWindow();
    }

    public void A1H() {
        A25();
        super.A1H();
    }

    public int getCenteredLayoutId() {
        return getLayout();
    }

    public int getIncomingLayoutId() {
        return getLayout();
    }

    public int getOutgoingLayoutId() {
        return getLayout();
    }
}
