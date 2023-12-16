package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass3ZF;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$joinCall$1$1$1$1", f = "AudioChatBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AudioChatBottomSheetViewModel$joinCall$1$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ AudioChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetViewModel$joinCall$1$1$1$1(Context context, AudioChatBottomSheetViewModel audioChatBottomSheetViewModel, AnonymousClass3ZF r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = audioChatBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r2 == 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x0071
            X.C57682u2.A01(r11)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r0 = r10.this$0
            X.5b3 r4 = r0.A01
            if (r4 == 0) goto L_0x006c
            android.content.Context r2 = r10.$context
            X.3ZF r3 = r10.$callLog
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C626936e.A06(r1)
            boolean r0 = r4.A1Q
            if (r0 != 0) goto L_0x001f
            X.C86624Kv.A1G(r4, r1)
        L_0x001f:
            X.66r r4 = r4.A1s
            java.util.Map r0 = r1.participants
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)
            java.lang.String r6 = r1.callId
            X.5jl r4 = (X.C112455jl) r4
            r0 = 1
            boolean r0 = r4.A08(r2, r0)
            if (r0 == 0) goto L_0x006c
            X.0PJ r1 = r4.A01
            if (r1 == 0) goto L_0x006f
            java.lang.Object r0 = r1.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.A01
            int r2 = X.AnonymousClass001.A0K(r0)
            if (r2 != 0) goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "CallsManagerImpl/acceptCallFromVoiceChatLobby/ error in VC lobby entry point logging"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Lobby entry point type cannot be 0"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x0055:
            r8 = 0
            int r1 = r3.A0H
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.5Wo r5 = new X.5Wo
            r5.<init>(r3, r2, r8, r0)
            r9 = 1
            int r0 = r4.A04(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x006c
            com.whatsapp.voipcalling.Voip.acceptCall()
        L_0x006c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x006f:
            r2 = 0
            goto L_0x004a
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$joinCall$1$1$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AudioChatBottomSheetViewModel$joinCall$1$1$1$1(this.$context, this.this$0, this.$callLog, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
