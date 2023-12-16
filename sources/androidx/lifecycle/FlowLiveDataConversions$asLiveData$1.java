package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C15920sB;
import X.C18020wc;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class FlowLiveDataConversions$asLiveData$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C8 $this_asLiveData;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(C84814Du r2, AnonymousClass4C8 r3) {
        super(r2, 2);
        this.$this_asLiveData = r3;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(r4, this.$this_asLiveData);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4C8 r1 = this.$this_asLiveData;
            C18020wc r0 = new C18020wc(obj2, 1);
            this.label = 1;
            if (r1.Az8(this, r0) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C15920sB r3, C84814Du r4) {
        return ((AnonymousClass8P9) A0A(r3, r4)).A09(C59022wD.A00);
    }
}
