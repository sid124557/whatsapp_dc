package X;

import com.whatsapp.R;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;

/* renamed from: X.61O  reason: invalid class name */
public final class AnonymousClass61O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SingleSelectedMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61O(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        super(1);
        this.this$0 = singleSelectedMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        C162457s7.A0H(bool);
        if (bool.booleanValue()) {
            this.this$0.Bot(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
