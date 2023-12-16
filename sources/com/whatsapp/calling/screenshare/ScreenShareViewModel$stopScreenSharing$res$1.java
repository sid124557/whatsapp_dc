package com.whatsapp.calling.screenshare;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1", f = "ScreenShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$stopScreenSharing$res$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$stopScreenSharing$res$1(ScreenShareViewModel screenShareViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = screenShareViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return AnonymousClass0x9.A0k(this.this$0.A07.BrE());
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ScreenShareViewModel$stopScreenSharing$res$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ScreenShareViewModel$stopScreenSharing$res$1(this.this$0, (C84814Du) obj2));
    }
}
