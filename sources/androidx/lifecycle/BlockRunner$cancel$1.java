package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0XN;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$cancel$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass0XN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(AnonymousClass0XN r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new BlockRunner$cancel$1(this.this$0, r4);
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (C616231o.A00(this, 5000) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass0XN r1 = this.this$0;
        if (r1.A02.A00 <= 0) {
            C85474Gj A02 = r1.A01;
            if (A02 != null) {
                A02.AyX((CancellationException) null);
            }
            this.this$0.A01 = null;
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
