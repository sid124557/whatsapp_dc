package X;

import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;

/* renamed from: X.62q  reason: invalid class name and case insensitive filesystem */
public final class C1219862q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ boolean $isConfirmAction;
    public final /* synthetic */ ChatLockCreateSecretCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219862q(ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity, boolean z) {
        super(1);
        this.this$0 = chatLockCreateSecretCodeActivity;
        this.$isConfirmAction = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity = this.this$0;
        if (A1Z) {
            chatLockCreateSecretCodeActivity.setResult(2);
            if (this.$isConfirmAction) {
                AnonymousClass5UK r2 = this.this$0.A03;
                if (r2 != null) {
                    r2.A05(C18290x4.A0c(), 1);
                } else {
                    throw C18270x1.A0S("chatLockLogger");
                }
            }
            this.this$0.finish();
        } else {
            chatLockCreateSecretCodeActivity.A79(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
