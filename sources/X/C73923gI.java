package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider", f = "EmojiSearchProvider.kt", i = {}, l = {33}, m = "searchAwait-gIAlu-s", n = {}, s = {})
/* renamed from: X.3gI  reason: invalid class name and case insensitive filesystem */
public final class C73923gI extends C75013pU {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73923gI(EmojiSearchProvider emojiSearchProvider, C84814Du r2) {
        super(r2);
        this.this$0 = emojiSearchProvider;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A02 = this.this$0.A02((String) null, this);
        if (A02 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return new AnonymousClass3Z9(A02);
        }
        return A02;
    }
}
