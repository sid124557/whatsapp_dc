package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C60332yN;
import X.C75003pT;
import X.C823243d;
import X.C84814Du;
import X.C85524Gp;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMoreMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMoreMessages$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C60332yN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMoreMessages$1(C60332yN r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        Object value;
        SortedSet sortedSet;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C60332yN r4 = this.this$0;
            C85524Gp r3 = r4.A0B;
            do {
                value = r3.getValue();
                sortedSet = (SortedSet) value;
            } while (!C75003pT.A06(value, sortedSet, new C823243d(r4, sortedSet), r3));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CommentListManager$loadMoreMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CommentListManager$loadMoreMessages$1(this.this$0, (C84814Du) obj2));
    }
}
