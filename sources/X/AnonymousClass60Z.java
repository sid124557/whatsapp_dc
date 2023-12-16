package X;

import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;

/* renamed from: X.60Z  reason: invalid class name */
public final class AnonymousClass60Z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ChatLockConfirmSecretCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60Z(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        super(1);
        this.this$0 = chatLockConfirmSecretCodeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity;
        int i;
        AnonymousClass5AU r6 = (AnonymousClass5AU) obj;
        C162457s7.A0J(r6, 0);
        int i2 = 0;
        if (r6.equals(C91634kb.A00)) {
            this.this$0.setResult(-1);
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity2 = this.this$0;
            if (chatLockConfirmSecretCodeActivity2.A00 != 2) {
                i2 = 1;
            }
            AnonymousClass5UK r2 = chatLockConfirmSecretCodeActivity2.A02;
            if (r2 != null) {
                r2.A05(2, Integer.valueOf(i2));
                this.this$0.finish();
            } else {
                throw C18270x1.A0S("chatLockLogger");
            }
        } else {
            if (!r6.equals(C91624ka.A00)) {
                if (r6 instanceof C91614kZ) {
                    int i3 = ((C91614kZ) r6).A00;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            chatLockConfirmSecretCodeActivity = this.this$0;
                            i = R.string.f11nameremoved;
                        } else if (i3 != 3) {
                            chatLockConfirmSecretCodeActivity = this.this$0;
                            i = R.string.f11nameremoved;
                        }
                        chatLockConfirmSecretCodeActivity.A79(i);
                    }
                }
            }
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity3 = this.this$0;
            chatLockConfirmSecretCodeActivity3.A74().setError(chatLockConfirmSecretCodeActivity3.getString(R.string.f11nameremoved));
        }
        return C59022wD.A00;
    }
}
