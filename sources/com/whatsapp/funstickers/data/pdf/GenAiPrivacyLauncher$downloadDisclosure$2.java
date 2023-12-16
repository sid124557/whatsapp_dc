package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass001;
import X.AnonymousClass23T;
import X.AnonymousClass4GR;
import X.C45992au;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$downloadDisclosure$2", f = "GenAiPrivacyLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$downloadDisclosure$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C45992au this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$downloadDisclosure$2(C45992au r2, C84814Du r3, int i) {
        super(r3, 2);
        this.this$0 = r2;
        this.$noticeId = i;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            try {
                return this.this$0.A02.A00(this.$noticeId);
            } catch (AnonymousClass23T e) {
                Log.i("GenAiPrivacyLauncher/downloadDisclosure failed to download disclosure", e);
                return null;
            }
        } else {
            throw AnonymousClass001.A0d();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new GenAiPrivacyLauncher$downloadDisclosure$2(this.this$0, r5, this.$noticeId);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
