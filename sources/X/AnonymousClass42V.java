package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;

/* renamed from: X.42V  reason: invalid class name */
public final class AnonymousClass42V extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AddMembersRouter this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[1];
        AnonymousClass3Z6.A09("AddMembersSuccessJidList", obj, r1, 0);
        Bundle A00 = C02820Hs.A00(r1);
        AddMembersRouter addMembersRouter = this.this$0;
        if (addMembersRouter.A16()) {
            addMembersRouter.A0U().A0n("AddMembersSuccess", A00);
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42V(AddMembersRouter addMembersRouter) {
        super(1);
        this.this$0 = addMembersRouter;
    }
}
