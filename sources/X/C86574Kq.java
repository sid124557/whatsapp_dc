package X;

import com.whatsapp.chatlock.ChatLockPrivacySettingsActivity;
import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.4Kq  reason: invalid class name and case insensitive filesystem */
public class C86574Kq implements C1225064q {
    public Object A00;
    public final int A01;

    public C86574Kq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BaI(AnonymousClass5S5 r7) {
        ChatLockPrivacySettingsActivity chatLockPrivacySettingsActivity;
        int i;
        if (this.A01 != 0) {
            int ordinal = r7.A02.ordinal();
            if (ordinal == 0) {
                ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = (ChatLockRequestAuthInterstitialActivity) this.A00;
                C106995aW r0 = chatLockRequestAuthInterstitialActivity.A00;
                if (r0 != null) {
                    r0.A0E(false);
                    C18290x4.A18(chatLockRequestAuthInterstitialActivity);
                    return;
                }
                throw C18270x1.A0S("chatLockManager");
            } else if (ordinal != 2) {
                ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity2 = (ChatLockRequestAuthInterstitialActivity) this.A00;
                C106995aW r1 = chatLockRequestAuthInterstitialActivity2.A00;
                if (r1 != null) {
                    r1.A0E(true);
                    chatLockRequestAuthInterstitialActivity2.setResult(0);
                    return;
                }
                throw C18270x1.A0S("chatLockManager");
            } else {
                ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity3 = (ChatLockRequestAuthInterstitialActivity) this.A00;
                C95814uZ r2 = (C95814uZ) chatLockRequestAuthInterstitialActivity3.A03.getValue();
                C106995aW r12 = chatLockRequestAuthInterstitialActivity3.A00;
                if (r12 != null) {
                    r12.A0B(chatLockRequestAuthInterstitialActivity3, r7, new C64593Ec(chatLockRequestAuthInterstitialActivity3, r2), r2);
                    return;
                }
                throw C18270x1.A0S("chatLockManager");
            }
        } else {
            int ordinal2 = r7.A02.ordinal();
            if (ordinal2 == 0 || ordinal2 == 2) {
                chatLockPrivacySettingsActivity = (ChatLockPrivacySettingsActivity) this.A00;
                C106995aW r02 = chatLockPrivacySettingsActivity.A00;
                if (r02 != null) {
                    r02.A06();
                    if (chatLockPrivacySettingsActivity.A00 != null) {
                        AnonymousClass1Hf.A2H(chatLockPrivacySettingsActivity, true);
                        i = 8;
                    } else {
                        throw C18270x1.A0S("chatLockManager");
                    }
                } else {
                    throw C18270x1.A0S("chatLockManager");
                }
            } else {
                chatLockPrivacySettingsActivity = (ChatLockPrivacySettingsActivity) this.A00;
                if (chatLockPrivacySettingsActivity.A00 != null) {
                    AnonymousClass1Hf.A2H(chatLockPrivacySettingsActivity, false);
                    i = 9;
                } else {
                    throw C18270x1.A0S("chatLockManager");
                }
            }
            AnonymousClass5UK r3 = chatLockPrivacySettingsActivity.A01;
            if (r3 != null) {
                r3.A04((C95814uZ) null, C18290x4.A0c(), 1, i);
                return;
            }
            throw C18270x1.A0S("chatLockLogger");
        }
    }
}
