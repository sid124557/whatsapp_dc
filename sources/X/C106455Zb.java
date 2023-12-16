package X;

/* renamed from: X.5Zb  reason: invalid class name and case insensitive filesystem */
public class C106455Zb implements C183048pP {
    public Object A00;
    public final int A01;

    public C106455Zb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.4zV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.4zX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.4zW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.4zV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.4zV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.4zV} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r3.setDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = X.AnonymousClass35V.A03(r2, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        X.C106805aC.A01(r2, r4.A09, r0.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A0B == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = X.C107565bW.A0G(r2, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BcJ(int r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            java.lang.Object r4 = r6.A00
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0030;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.4zW r4 = (X.C97924zW) r4
            r1 = 8
            if (r7 == 0) goto L_0x005b
            r0 = 1
            if (r7 == r0) goto L_0x00d7
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            X.5UY r0 = r0.A06
            r0.A06(r1)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            X.1mu r1 = r4.A09
            X.33j r2 = r4.A05
        L_0x001d:
            int r0 = r1.A0B
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = X.C107565bW.A0G(r2, r1)
        L_0x0025:
            r3.setDescription(r0)
            return
        L_0x0029:
            long r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            goto L_0x0025
        L_0x0030:
            X.4zX r4 = (X.AnonymousClass4zX) r4
            r2 = 8
            java.lang.String r5 = "audioPlayerView"
            if (r7 == 0) goto L_0x00f2
            r0 = 1
            java.lang.String r1 = "audioPlayerMetadataView"
            if (r7 == r0) goto L_0x00b4
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x0046
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0046:
            X.5UY r0 = r0.A06
            r0.A06(r2)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            if (r3 != 0) goto L_0x0054
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0054:
            X.1mu r1 = r4.A09
            X.33j r2 = r4.getWhatsAppLocale()
            goto L_0x001d
        L_0x005b:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            X.5UY r0 = r0.A06
            r0.A06(r1)
            r4.A04()
            return
        L_0x0066:
            X.4zV r4 = (X.AnonymousClass4zV) r4
            r1 = 8
            if (r7 == 0) goto L_0x00a9
            r0 = 1
            if (r7 == r0) goto L_0x0092
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            X.5UY r0 = r0.A06
            r0.A06(r1)
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r3 = r4.A00
            r3.A00()
            X.1mu r1 = r4.A09
            X.33j r2 = r4.A02
            int r0 = r1.A0B
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = X.C107565bW.A0G(r2, r1)
        L_0x0087:
            r3.setDuration(r0)
            return
        L_0x008b:
            long r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            goto L_0x0087
        L_0x0092:
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r3 = r4.A00
            r3.A00()
            X.33j r2 = r4.A02
            X.1mu r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            r3.setDuration(r0)
            X.2re r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            goto L_0x00ea
        L_0x00a9:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            X.5UY r0 = r0.A06
            r0.A06(r1)
            r4.A04()
            return
        L_0x00b4:
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            if (r3 != 0) goto L_0x00bd
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x00bd:
            X.33j r2 = r4.getWhatsAppLocale()
            X.1mu r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            r3.setDescription(r0)
            X.2re r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x00ea
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x00d7:
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            X.33j r2 = r4.A05
            X.1mu r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            r3.setDescription(r0)
            X.2re r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
        L_0x00ea:
            X.5UY r1 = r0.A06
            X.1mu r0 = r4.A09
            X.C106805aC.A01(r2, r0, r1)
            return
        L_0x00f2:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x00fb:
            X.5UY r0 = r0.A06
            r0.A06(r2)
            r4.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106455Zb.BcJ(int):void");
    }
}
