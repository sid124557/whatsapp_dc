package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass6g8;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel$restartSubtitleTimer$1", f = "AudioChatCallingViewModel.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
public final class AudioChatCallingViewModel$restartSubtitleTimer$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AudioChatCallingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatCallingViewModel$restartSubtitleTimer$1(AudioChatCallingViewModel audioChatCallingViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = audioChatCallingViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (C616231o.A00(this, 3000) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A0I(AnonymousClass6g8.A00);
        AudioChatCallingViewModel audioChatCallingViewModel = this.this$0;
        audioChatCallingViewModel.A0H(audioChatCallingViewModel.A0H.A08());
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AudioChatCallingViewModel$restartSubtitleTimer$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AudioChatCallingViewModel$restartSubtitleTimer$1(this.this$0, (C84814Du) obj2));
    }
}
