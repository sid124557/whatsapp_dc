package X;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0pM  reason: invalid class name and case insensitive filesystem */
public final class C14320pM extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C15300r7 $embeddingCallback;
    public final /* synthetic */ C08840fC this$0;

    public final void A00(List list) {
        C162457s7.A0J(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (next instanceof SplitInfo) {
                A0s.add(next);
            }
        }
        C15300r7 r1 = this.$embeddingCallback;
        List A09 = this.this$0.A01.A09(A0s);
        C08830fB r12 = (C08830fB) r1;
        r12.A00 = A09;
        Iterator it = r12.A01.A02.iterator();
        while (it.hasNext()) {
            ((C04180Nd) it.next()).A00(A09);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14320pM(C08840fC r2, C15300r7 r3) {
        super(1);
        this.$embeddingCallback = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((List) obj);
        return C59022wD.A00;
    }
}
