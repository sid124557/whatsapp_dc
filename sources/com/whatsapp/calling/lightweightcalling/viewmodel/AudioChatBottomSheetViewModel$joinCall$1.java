package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3ZF;
import X.AnonymousClass4GR;
import X.C53312mt;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C627436k;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$joinCall$1", f = "AudioChatBottomSheetViewModel.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
public final class AudioChatBottomSheetViewModel$joinCall$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ AudioChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetViewModel$joinCall$1(Context context, AudioChatBottomSheetViewModel audioChatBottomSheetViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = audioChatBottomSheetViewModel;
        this.$context = context;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AudioChatBottomSheetViewModel audioChatBottomSheetViewModel = this.this$0;
            C53312mt A04 = audioChatBottomSheetViewModel.A0L.A04(C627436k.A08(audioChatBottomSheetViewModel.A04));
            if (A04 != null) {
                AudioChatBottomSheetViewModel audioChatBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                AnonymousClass3ZF A01 = audioChatBottomSheetViewModel2.A0J.A01(A04.A00);
                if (A01 != null) {
                    C73853gB r2 = audioChatBottomSheetViewModel2.A0P;
                    AudioChatBottomSheetViewModel$joinCall$1$1$1$1 audioChatBottomSheetViewModel$joinCall$1$1$1$1 = new AudioChatBottomSheetViewModel$joinCall$1$1$1$1(context, audioChatBottomSheetViewModel2, A01, (C84814Du) null);
                    this.label = 1;
                    if (C616131n.A00(this, r2, audioChatBottomSheetViewModel$joinCall$1$1$1$1) == r6) {
                        return r6;
                    }
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AudioChatBottomSheetViewModel$joinCall$1(this.$context, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
