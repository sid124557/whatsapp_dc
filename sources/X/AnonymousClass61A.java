package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts;
import java.util.AbstractList;

/* renamed from: X.61A  reason: invalid class name */
public final class AnonymousClass61A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92694n6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61A(C92694n6 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractList abstractList = (AbstractList) obj;
        ConversationRowViewInstagramPosts conversationRowViewInstagramPosts = this.this$0.A0B;
        C162457s7.A0H(abstractList);
        C162457s7.A0J(abstractList, 0);
        if (abstractList.size() < 3) {
            conversationRowViewInstagramPosts.setVisibility(8);
        } else {
            conversationRowViewInstagramPosts.setVisibility(0);
            ImageView A0J = C86604Kt.A0J(conversationRowViewInstagramPosts, R.id.first_ig_image);
            ImageView A0J2 = C86604Kt.A0J(conversationRowViewInstagramPosts, R.id.second_ig_image);
            ImageView A0J3 = C86604Kt.A0J(conversationRowViewInstagramPosts, R.id.third_ig_image);
            View A0E = C18280x3.A0E(conversationRowViewInstagramPosts, R.id.see_all);
            C108855df r8 = (C108855df) C86654Ky.A0j(abstractList, 0);
            C108855df r5 = (C108855df) C86654Ky.A0j(abstractList, 1);
            C108855df r1 = (C108855df) C86654Ky.A0j(abstractList, 2);
            AnonymousClass4Uk r0 = conversationRowViewInstagramPosts.A00;
            if (r0 != null) {
                r0.A0D(A0J, r8);
            }
            AnonymousClass4Uk r02 = conversationRowViewInstagramPosts.A00;
            if (r02 != null) {
                r02.A0D(A0J2, r5);
            }
            AnonymousClass4Uk r03 = conversationRowViewInstagramPosts.A00;
            if (r03 != null) {
                r03.A0D(A0J3, r1);
            }
            A0J.setOnClickListener(new C109725f5((Object) conversationRowViewInstagramPosts, (Object) abstractList, (Object) A0J, 37));
            A0J2.setOnClickListener(new C109725f5((Object) conversationRowViewInstagramPosts, (Object) abstractList, (Object) A0J2, 38));
            A0J3.setOnClickListener(new C109725f5((Object) conversationRowViewInstagramPosts, (Object) abstractList, (Object) A0J3, 39));
            C109345eT.A00(A0E, conversationRowViewInstagramPosts, 33);
        }
        return C59022wD.A00;
    }
}
