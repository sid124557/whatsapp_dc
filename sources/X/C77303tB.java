package X;

import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.3tB  reason: invalid class name and case insensitive filesystem */
public final class C77303tB extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ChatLockRequestAuthInterstitialActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77303tB(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity) {
        super(0);
        this.this$0 = chatLockRequestAuthInterstitialActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C95814uZ.A00.A05(this.this$0.getIntent().getStringExtra("extra_chat_jid"));
    }
}
