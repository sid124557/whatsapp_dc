package X;

import android.view.View;

/* renamed from: X.5f4  reason: invalid class name and case insensitive filesystem */
public class C109715f4 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C109715f4(C89654ea r2, C112185jK r3) {
        this.A03 = 0;
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = 4;
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        view.setOnClickListener(new C109715f4(obj, obj2, i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0260;
                case 1: goto L_0x00f8;
                case 2: goto L_0x00e4;
                case 3: goto L_0x007e;
                case 4: goto L_0x024a;
                case 5: goto L_0x0218;
                case 6: goto L_0x0202;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01de;
                case 11: goto L_0x019e;
                case 12: goto L_0x018b;
                case 13: goto L_0x017b;
                case 14: goto L_0x0017;
                case 15: goto L_0x0169;
                case 16: goto L_0x0118;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.4rA r1 = (X.AnonymousClass4rA) r1
            int r0 = r10.A00
            java.lang.Object r2 = r10.A02
            X.4GR r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0, r2)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r2 = r10.A01
            X.121 r2 = (X.AnonymousClass121) r2
            int r7 = r10.A00
            java.lang.Object r6 = r10.A02
            X.39M r6 = (X.AnonymousClass39M) r6
            java.util.List r1 = r2.A06
            if (r1 != 0) goto L_0x0029
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
        L_0x0029:
            if (r7 < 0) goto L_0x0016
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x0016
            java.lang.Object r0 = r1.get(r7)
            X.2mW r0 = (X.C53082mW) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            com.whatsapp.stickers.StickerView r0 = r2.A0E
            if (r0 == 0) goto L_0x0049
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0049
            r2.A0K()
            return
        L_0x0049:
            boolean r0 = r2.A0O(r7)
            if (r0 != 0) goto L_0x0016
            if (r6 == 0) goto L_0x0078
            X.2iT r8 = r2.A04
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0061
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0078
        L_0x0061:
            java.lang.String r0 = r8.A0H
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r6.A09
            if (r0 == 0) goto L_0x027a
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0078
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0078
            int r1 = r6.A01
            r0 = 1
            if (r1 == r0) goto L_0x027a
        L_0x0078:
            X.2iT r0 = r2.A04
            r2.A0N(r6, r0, r7)
            return
        L_0x007e:
            java.lang.Object r4 = r10.A01
            X.4Oe r4 = (X.C87144Oe) r4
            java.lang.Object r5 = r10.A02
            android.view.View r5 = (android.view.View) r5
            int r3 = r10.A00
            java.lang.Object r1 = r5.getTag()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.jid.UserJid r6 = r4.A00
            boolean r0 = r1.equals(r6)
            r2 = 0
            if (r0 != 0) goto L_0x00e1
            r4.A00 = r1
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r4.A02
            java.util.ArrayList r0 = r0.A0b
            java.lang.Object r0 = r0.get(r3)
            X.5Rj r0 = (X.C104545Rj) r0
            int r1 = r0.A00()
            r0 = 5
            if (r1 == r0) goto L_0x00e1
            r0 = 1
            r4.A01(r5, r3, r0)
        L_0x00ae:
            if (r6 == 0) goto L_0x0016
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = r4.A02
            android.widget.ListView r0 = r1.A02
            android.view.View r5 = r0.findViewWithTag(r6)
            java.util.ArrayList r3 = r1.A0b
            java.util.Iterator r2 = r3.iterator()
        L_0x00be:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r1 = r2.next()
            X.5Rj r1 = (X.C104545Rj) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00be
        L_0x00d2:
            if (r5 == 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            int r1 = r3.indexOf(r1)
            r0 = 0
            r4.A01(r5, r1, r0)
            return
        L_0x00df:
            r1 = 0
            goto L_0x00d2
        L_0x00e1:
            r4.A00 = r2
            goto L_0x00ae
        L_0x00e4:
            java.lang.Object r3 = r10.A01
            X.2bn r3 = (X.C46532bn) r3
            java.lang.Object r2 = r10.A02
            X.4oJ r2 = (X.C93314oJ) r2
            int r1 = r10.A00
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0016
            X.5MT r0 = r2.A2U
            r0.A00(r3, r1)
            return
        L_0x00f8:
            java.lang.Object r0 = r10.A01
            com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r0 = (com.whatsapp.conversation.conversationrow.DynamicButtonsLayout) r0
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            X.5MT r2 = (X.AnonymousClass5MT) r2
            java.util.List r1 = r0.A02
            java.lang.Object r0 = r1.get(r3)
            X.2bn r0 = (X.C46532bn) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0016
            java.lang.Object r0 = r1.get(r3)
            X.2bn r0 = (X.C46532bn) r0
            r2.A00(r0, r3)
            return
        L_0x0118:
            java.lang.Object r1 = r10.A01
            X.4Yk r1 = (X.C88354Yk) r1
            java.lang.Object r0 = r10.A02
            X.5SK r0 = (X.AnonymousClass5SK) r0
            int r4 = r10.A00
            X.53Z r6 = r1.A07
            X.1RL r5 = r0.A02
            androidx.recyclerview.widget.LinearLayoutManager r0 = r6.A00
            if (r0 != 0) goto L_0x0131
            java.lang.String r0 = "layoutManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0131:
            java.lang.ref.WeakReference r3 = X.AnonymousClass0x9.A14(r0)
            X.4W1 r0 = r6.A07
            java.lang.ref.WeakReference r2 = X.AnonymousClass0x9.A14(r0)
            X.4WX r0 = r6.A06
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r0)
            int r0 = r4 + 1
            X.5zR r4 = new X.5zR
            r4.<init>(r1, r2, r3, r0)
            com.whatsapp.updates.ui.UpdatesFragment r0 = r6.A05
            X.5Um r3 = r0.A0Y
            if (r3 == 0) goto L_0x0162
            X.03q r2 = r0.A0Q()
            X.AnonymousClass0x9.A1L(r2)
            X.4ea r2 = (X.C89654ea) r2
            X.63L r1 = new X.63L
            r1.<init>(r5, r0, r4)
            X.581 r0 = X.AnonymousClass581.CONSUMER
            r3.A05(r2, r0, r1)
            return
        L_0x0162:
            java.lang.String r0 = "newsletterLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0169:
            java.lang.Object r0 = r10.A01
            X.4Yk r0 = (X.C88354Yk) r0
            java.lang.Object r1 = r10.A02
            X.5SK r1 = (X.AnonymousClass5SK) r1
            X.53Z r0 = r0.A07
            X.1RL r1 = r1.A02
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A05
            r0.A1R(r1)
            return
        L_0x017b:
            java.lang.Object r0 = r10.A01
            X.4Wi r0 = (X.C87844Wi) r0
            java.lang.Object r2 = r10.A02
            X.2iT r2 = (X.C50612iT) r2
            int r1 = r10.A00
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            r0.A1P(r2, r1)
            return
        L_0x018b:
            java.lang.Object r4 = r10.A01
            X.50B r4 = (X.AnonymousClass50B) r4
            java.lang.Object r3 = r10.A02
            X.509 r3 = (X.AnonymousClass509) r3
            int r2 = r10.A00
            X.7IM r1 = r4.A02
            r0 = 0
            r1.A00 = r0
            r4.A0I(r3, r2)
            return
        L_0x019e:
            java.lang.Object r2 = r10.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r2 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r2
            java.lang.Object r3 = r10.A02
            int r5 = r10.A00
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            java.util.ArrayList r0 = r2.A0F
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x01c9
            X.4FS r0 = r2.A0B
            if (r0 == 0) goto L_0x01c2
            r6 = 21
            X.3c6 r1 = new X.3c6
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.BkP(r1)
            return
        L_0x01c2:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01c9:
            r1 = 2131893926(0x7f121ea6, float:1.9422642E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r2)
            java.lang.String r0 = r0.getString(r1)
            X.C162457s7.A0D(r0)
            r2.A1Y(r0)
            r2.A1K()
            return
        L_0x01de:
            java.lang.Object r4 = r10.A01
            X.4XI r4 = (X.AnonymousClass4XI) r4
            java.lang.Object r3 = r10.A02
            X.6IU r3 = (X.AnonymousClass6IU) r3
            int r2 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r4.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.gallery.IMultipleMediaSelection"
            X.C162457s7.A0K(r1, r0)
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r1 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r1
            r4.A0K(r3, r1, r2)
            return
        L_0x01f5:
            java.lang.Object r0 = r10.A01
            X.4rB r0 = (X.C94394rB) r0
            int r1 = r10.A00
            java.lang.Object r3 = r10.A02
            X.4rD r3 = (X.C94404rD) r3
            X.4GR r2 = r0.A03
            goto L_0x020e
        L_0x0202:
            java.lang.Object r0 = r10.A01
            X.4r9 r0 = (X.C94384r9) r0
            int r1 = r10.A00
            java.lang.Object r3 = r10.A02
            X.4rD r3 = (X.C94404rD) r3
            X.4GR r2 = r0.A02
        L_0x020e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int[] r0 = r3.A04
            r2.invoke(r1, r0)
            return
        L_0x0218:
            java.lang.Object r2 = r10.A01
            X.4px r2 = (X.C94134px) r2
            java.lang.Object r7 = r10.A02
            X.4uZ r7 = (X.C95814uZ) r7
            int r8 = r10.A00
            com.whatsapp.conversationslist.ViewHolder r5 = r2.A08
            X.5UY r1 = r5.A16
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0247
            android.view.View r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass651
            if (r0 == 0) goto L_0x0247
            android.view.View r0 = r1.A04()
            X.651 r0 = (X.AnonymousClass651) r0
            android.view.View r4 = r0.getTransitionView()
        L_0x023e:
            X.66t r3 = r2.A0E
            int r9 = r2.A05
            r6 = r5
            r3.BP7(r4, r5, r6, r7, r8, r9)
            return
        L_0x0247:
            android.widget.ImageView r4 = r5.A0B
            goto L_0x023e
        L_0x024a:
            java.lang.Object r0 = r10.A01
            X.4pw r0 = (X.C94124pw) r0
            java.lang.Object r5 = r10.A02
            X.4uZ r5 = (X.C95814uZ) r5
            int r6 = r10.A00
            X.66t r1 = r0.A03
            com.whatsapp.conversationslist.ViewHolder r3 = r0.A08
            r7 = -1
            android.widget.ImageView r2 = r3.A0B
            r4 = r3
            r1.BP7(r2, r3, r4, r5, r6, r7)
            return
        L_0x0260:
            java.lang.Object r0 = r10.A01
            X.5jK r0 = (X.C112185jK) r0
            java.lang.Object r5 = r10.A02
            X.4ea r5 = (X.C89654ea) r5
            java.lang.Integer r4 = X.C18290x4.A0a()
            r3 = 4
            X.2hm r2 = r0.A08
            X.57k r1 = X.C996357k.AGENT
            X.5jI r0 = new X.5jI
            r0.<init>(r5, r4, r3)
            r2.A00(r5, r0, r1, r4)
            return
        L_0x027a:
            X.2IF r0 = r2.A05
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = r0.A00
            java.util.Map r0 = r5.A0W
            if (r0 != 0) goto L_0x0288
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass0x9.A1D()
            r5.A0W = r0
        L_0x0288:
            X.1ty r0 = r5.A0R
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0298
            int r1 = r0.A00
            r0.A0D(r3)
            X.121 r0 = r5.A0Q
            r0.A0M(r1, r4)
        L_0x0298:
            X.1ty r2 = new X.1ty
            r2.<init>(r8, r5, r7)
            r5.A0R = r2
            X.4FS r1 = r5.A04
            X.39M[] r0 = new X.AnonymousClass39M[r3]
            r0[r4] = r6
            r1.BkL(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109715f4.onClick(android.view.View):void");
    }

    public C109715f4(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }
}
