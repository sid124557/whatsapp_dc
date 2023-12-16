package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;

/* renamed from: X.54G  reason: invalid class name */
public class AnonymousClass54G extends C109665ez {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass54G(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r3.A01();
        r1 = r3.A01;
        r1.A01 = X.AnonymousClass001.A0f();
        r1.A02 = r5;
        r3.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x0137;
                case 1: goto L_0x0120;
                case 2: goto L_0x005f;
                case 3: goto L_0x002f;
                case 4: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.4zb r0 = (X.C97964zb) r0
            X.4Fm r2 = r0.A01
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = r10.A01
            X.C86604Kt.A12(r1, r2, r0)
            return
        L_0x0015:
            java.lang.String r2 = r10.A01
            if (r2 == 0) goto L_0x0024
            java.lang.Object r0 = r10.A00
            com.whatsapp.permissions.RequestPermissionsBottomSheet r0 = (com.whatsapp.permissions.RequestPermissionsBottomSheet) r0
            X.2s5 r1 = r0.A06
            java.lang.String r0 = "not_now"
            r1.A04(r2, r0)
        L_0x0024:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            X.C18300x5.A1A(r0)
            return
        L_0x002f:
            java.lang.String r2 = r10.A01
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "http://"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r0)
        L_0x0049:
            android.content.Intent r1 = X.C18310x6.A0D(r1)
            java.lang.Object r0 = r10.A00     // Catch:{ ActivityNotFoundException -> 0x0055 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ ActivityNotFoundException -> 0x0055 }
            X.C86614Ku.A14(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0055 }
            return
        L_0x0055:
            java.lang.Object r0 = r10.A00
            X.4oJ r0 = (X.C93314oJ) r0
            X.3Wi r0 = r0.A0X
            X.C86654Ky.A1J(r0)
            return
        L_0x005f:
            java.lang.Object r4 = r10.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r4 = (com.whatsapp.conversation.ConversationAttachmentContentView) r4
            X.5U6 r3 = r4.A0H
            java.lang.String r2 = r10.A01
            X.1VX r1 = r3.A04
            r0 = 2914(0xb62, float:4.083E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0086
            X.4ry r0 = r3.A01
            if (r0 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            int r0 = r2.hashCode()
            r9 = 9
            r8 = 8
            r7 = 7
            r6 = 5
            r5 = 3
            r1 = 2
            switch(r0) {
                case -1367751899: goto L_0x0102;
                case -1275762953: goto L_0x00f5;
                case -786681338: goto L_0x00e8;
                case -309474065: goto L_0x00db;
                case -196315310: goto L_0x00ce;
                case 3446719: goto L_0x00c1;
                case 93166550: goto L_0x00b4;
                case 861720859: goto L_0x00a7;
                case 951526432: goto L_0x009a;
                case 1901043637: goto L_0x008d;
                default: goto L_0x0086;
            }
        L_0x0086:
            X.4fS r1 = r4.A0G
            r0 = 0
            r1.A0E(r2, r0)
            return
        L_0x008d:
            java.lang.String r0 = "location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x010e
        L_0x009a:
            java.lang.String r0 = "contact"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L_0x010e
        L_0x00a7:
            java.lang.String r0 = "document"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            goto L_0x010e
        L_0x00b4:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            goto L_0x010e
        L_0x00c1:
            java.lang.String r0 = "poll"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = X.AnonymousClass0x7.A0h()
            goto L_0x010e
        L_0x00ce:
            java.lang.String r0 = "gallery"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L_0x010e
        L_0x00db:
            java.lang.String r0 = "product"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = X.C18320x8.A0W()
            goto L_0x010e
        L_0x00e8:
            java.lang.String r0 = "payment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = X.C18300x5.A0Z()
            goto L_0x010e
        L_0x00f5:
            java.lang.String r0 = "quick reply"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = X.AnonymousClass0x9.A0j()
            goto L_0x010e
        L_0x0102:
            java.lang.String r0 = "camera"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x010e:
            r3.A01()
            X.4ry r1 = r3.A01
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A01 = r0
            r1.A02 = r5
            r3.A00()
            goto L_0x0086
        L_0x0120:
            java.lang.Object r3 = r10.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = (com.whatsapp.calling.callhistory.CallLogActivity) r3
            X.4uZ r2 = r3.A0Y
            java.lang.Integer r0 = X.C18290x4.A0d()
            X.5XB r1 = new X.5XB
            r1.<init>((android.view.View) r11, (X.C95814uZ) r2, (java.lang.Integer) r0)
            java.lang.String r0 = r10.A01
            r1.A04 = r0
            r1.A02(r3)
            return
        L_0x0137:
            java.lang.Object r2 = r10.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            X.2nM r1 = r2.A06
            java.lang.String r0 = "invite-via-link-unavailable"
            r1.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54G.A07(android.view.View):void");
    }

    public AnonymousClass54G(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A02 = 0;
        this.A00 = acceptInviteLinkActivity;
        this.A01 = "invite-via-link-unavailable";
    }
}
