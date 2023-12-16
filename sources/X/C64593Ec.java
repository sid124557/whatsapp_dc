package X;

import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.3Ec  reason: invalid class name and case insensitive filesystem */
public final class C64593Ec implements AnonymousClass662 {
    public final /* synthetic */ ChatLockRequestAuthInterstitialActivity A00;
    public final /* synthetic */ C95814uZ A01;

    public C64593Ec(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity, C95814uZ r2) {
        this.A01 = r2;
        this.A00 = chatLockRequestAuthInterstitialActivity;
    }

    public void BOO() {
        ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = this.A00;
        C106995aW r1 = chatLockRequestAuthInterstitialActivity.A00;
        if (r1 != null) {
            r1.A0E(true);
            chatLockRequestAuthInterstitialActivity.setResult(0);
            chatLockRequestAuthInterstitialActivity.finish();
            return;
        }
        throw C18270x1.A0S("chatLockManager");
    }

    public void BOx() {
        int i;
        C95814uZ r0 = this.A01;
        ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = this.A00;
        if (r0 != null) {
            i = 2;
        } else {
            C106995aW r1 = chatLockRequestAuthInterstitialActivity.A00;
            if (r1 != null) {
                r1.A0E(true);
                i = 0;
            } else {
                throw C18270x1.A0S("chatLockManager");
            }
        }
        chatLockRequestAuthInterstitialActivity.setResult(i);
        chatLockRequestAuthInterstitialActivity.finish();
    }
}
