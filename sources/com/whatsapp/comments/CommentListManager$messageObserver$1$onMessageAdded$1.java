package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass41L;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C60332yN;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$messageObserver$1$onMessageAdded$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C624134x $message;
    public int label;
    public final /* synthetic */ C60332yN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$messageObserver$1$onMessageAdded$1(C60332yN r2, C624134x r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final Object A09(Object obj) {
        Object value;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C85524Gp r4 = this.this$0.A0B;
            C624134x r3 = this.$message;
            do {
                value = r4.getValue();
            } while (!C75003pT.A06(value, (SortedSet) value, new AnonymousClass41L(r3), r4));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommentListManager$messageObserver$1$onMessageAdded$1(this.this$0, this.$message, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
