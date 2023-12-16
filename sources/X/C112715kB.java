package X;

/* renamed from: X.5kB  reason: invalid class name and case insensitive filesystem */
public class C112715kB implements AnonymousClass67C {
    public C185668u3 A00;
    public C1225264s A01;
    public boolean A02;
    public boolean A03;

    public static void A00(C1225264s r1, Object obj) {
        C112715kB r2 = (C112715kB) obj;
        r2.A01 = r1;
        C185668u3 r0 = r2.A00;
        if (r0 != null) {
            r0.setVisibilityChangeListener(r1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.4PI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View B0k(X.C009707r r4, X.C56972sr r5, X.AnonymousClass1VX r6, X.C95814uZ r7) {
        /*
            r3 = this;
            java.lang.String r0 = "VoipReturnToCallBannerBridge createInstance"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C627436k.A09(r5, r6)
            if (r0 == 0) goto L_0x0038
            X.0XL r1 = X.AnonymousClass0x9.A0H(r4)
            java.lang.Class<com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel> r0 = com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r0
            X.C18260x0.A0O(r4, r0)
            X.4PI r2 = new X.4PI
            r2.<init>(r4)
            r2.setAudioChatViewModel(r0, r4)
        L_0x0022:
            r3.A00 = r2
            boolean r0 = r3.A02
            r2.setShouldHideBanner(r0)
            X.8u3 r1 = r3.A00
            boolean r0 = r3.A03
            r1.setShouldHideCallDuration(r0)
            X.8u3 r1 = r3.A00
            X.64s r0 = r3.A01
            r1.setVisibilityChangeListener(r0)
            return r2
        L_0x0038:
            r0 = 0
            com.whatsapp.calling.views.VoipReturnToCallBanner r2 = new com.whatsapp.calling.views.VoipReturnToCallBanner
            r2.<init>(r4, r0)
            r2.A0D = r7
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112715kB.B0k(X.07r, X.2sr, X.1VX, X.4uZ):android.view.View");
    }

    public int getBackgroundColorRes() {
        C626936e.A0D(AnonymousClass000.A1W(this.A00), "VoipReturnToCallBannerBridgeImpl/getBackgroudColor no banner when get background color");
        C185668u3 r0 = this.A00;
        if (r0 != null) {
            return r0.getBackgroundColorRes();
        }
        return 0;
    }
}
