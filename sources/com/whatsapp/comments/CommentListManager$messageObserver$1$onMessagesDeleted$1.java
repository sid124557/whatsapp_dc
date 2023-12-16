package com.whatsapp.comments;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C60332yN;
import X.C75003pT;
import X.C823443f;
import X.C84814Du;
import X.C85524Gp;
import java.util.Collection;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesDeleted$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$messageObserver$1$onMessagesDeleted$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Collection $messages;
    public int label;
    public final /* synthetic */ C60332yN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$messageObserver$1$onMessagesDeleted$1(C60332yN r2, Collection collection, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$messages = collection;
    }

    public final Object A09(Object obj) {
        Object value;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C60332yN r5 = this.this$0;
            C85524Gp r4 = r5.A0B;
            Collection collection = this.$messages;
            do {
                value = r4.getValue();
            } while (!C75003pT.A06(value, (SortedSet) value, new C823443f(r5, collection), r4));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommentListManager$messageObserver$1$onMessagesDeleted$1(this.this$0, this.$messages, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
