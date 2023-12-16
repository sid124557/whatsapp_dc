package X;

import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;

/* renamed from: X.5NO  reason: invalid class name */
public final class AnonymousClass5NO {
    public final C56972sr A00;
    public final CallAvatarFLMConsentManager A01;
    public final AnonymousClass1VX A02;

    public final boolean A00() {
        CallAvatarFLMConsentManager callAvatarFLMConsentManager = this.A01;
        if ((callAvatarFLMConsentManager.A00() == AnonymousClass59B.DOGFOODING || callAvatarFLMConsentManager.A00() == AnonymousClass59B.US) && !this.A00.A0Y() && this.A02.A0X(1756)) {
            return true;
        }
        return false;
    }

    public AnonymousClass5NO(C56972sr r1, CallAvatarFLMConsentManager callAvatarFLMConsentManager, AnonymousClass1VX r3) {
        C18260x0.A0V(r3, r1, callAvatarFLMConsentManager);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = callAvatarFLMConsentManager;
    }
}
