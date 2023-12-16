package com.whatsapp.calling.chatmessages;

import X.AnonymousClass3ZF;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$clickCallButton$1$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$clickCallButton$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $launchVideo;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, AnonymousClass3ZF r4, C84814Du r5, boolean z) {
        super(r5, 2);
        this.this$0 = adhocParticipantBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
        this.$launchVideo = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r1.A00 != 7) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x007d
            X.C57682u2.A01(r7)
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.4Gp r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2m7 r0 = (X.C52832m7) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0019
            r3.add(r1)
            goto L_0x0019
        L_0x002e:
            java.util.ArrayList r5 = X.C73783g4.A0c(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0036:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.2m7 r0 = (X.C52832m7) r0
            X.3ZH r0 = r0.A02
            r5.add(r0)
            goto L_0x0036
        L_0x0048:
            boolean r0 = X.AnonymousClass0x7.A1S(r5)
            if (r0 == 0) goto L_0x0063
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.66r r4 = r0.A05
            android.content.Context r3 = r6.$context
            X.3ZF r1 = r6.$callLog
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x006d
            r2 = 45
        L_0x005e:
            boolean r0 = r6.$launchVideo
            r4.Bpl(r3, r5, r2, r0)
        L_0x0063:
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.4Gp r1 = r0.A0E
            X.2wD r0 = X.C59022wD.A00
            r1.setValue(r0)
            return r0
        L_0x006d:
            X.39J r0 = r1.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x007a
            int r1 = r1.A00
            r0 = 7
            r2 = 47
            if (r1 == r0) goto L_0x005e
        L_0x007a:
            r2 = 46
            goto L_0x005e
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$clickCallButton$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, this.$callLog, r8, this.$launchVideo);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
