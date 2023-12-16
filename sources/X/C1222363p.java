package X;

import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$1;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$2;

/* renamed from: X.63p  reason: invalid class name and case insensitive filesystem */
public final class C1222363p extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1222363p(EmojiExpressionsFragment emojiExpressionsFragment) {
        super(2);
        this.this$0 = emojiExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int A0K = AnonymousClass001.A0K(obj);
        int[] iArr = (int[]) obj2;
        C162457s7.A0J(iArr, 1);
        EmojiExpressionsViewModel A0i = C86634Kw.A0i(this.this$0);
        if (C107425bI.A02(iArr)) {
            C18270x1.A0h(C18270x1.A03(A0i.A02), "skin_emoji_tip", 1);
            C616131n.A02((C85494Gl) null, new EmojiExpressionsViewModel$onEmojiLongTapped$1(A0i, (C84814Du) null, iArr, A0K), AnonymousClass0IV.A00(A0i), (AnonymousClass20D) null, 3);
        } else if (C107425bI.A03(iArr)) {
            C18270x1.A0h(C18270x1.A03(A0i.A02), "skin_emoji_tip", 1);
            C616131n.A02((C85494Gl) null, new EmojiExpressionsViewModel$onEmojiLongTapped$2(A0i, (C84814Du) null, iArr, A0K), AnonymousClass0IV.A00(A0i), (AnonymousClass20D) null, 3);
        }
        return C59022wD.A00;
    }
}
