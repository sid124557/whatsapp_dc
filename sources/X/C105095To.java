package X;

import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$1;
import com.whatsapp.util.Log;

/* renamed from: X.5To  reason: invalid class name and case insensitive filesystem */
public final class C105095To {
    public AnonymousClass59T A00 = AnonymousClass59T.UTF8;
    public AnonymousClass59U A01 = AnonymousClass59U.PBKDF2_HMAC_SHA512;
    public final C104115Ps A02;
    public final C103435My A03;
    public final AnonymousClass1VX A04;
    public final C73853gB A05;
    public final C73853gB A06;
    public final AnonymousClass4C6 A07;

    public final AnonymousClass5AU A00(String str) {
        int i;
        C162457s7.A0J(str, 0);
        Log.i("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements");
        if (!C162457s7.A0P(AnonymousClass2AB.A00(str), str)) {
            i = 5;
        } else {
            int length = str.length();
            if (length > 1000) {
                i = 6;
            } else if (C18280x3.A1X(str, new C116975rB("\\p{So}").nativePattern) || length >= 4) {
                return C91634kb.A00;
            } else {
                Log.e("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements: Failed Validation");
                i = 1;
            }
        }
        return new C91614kZ(i);
    }

    public final void A01(String str, AnonymousClass4GQ r7) {
        Log.i("ChatLockPasscodeManager/validatePasscode");
        if ((C18280x3.A1X(str, new C116975rB("\\p{So}").nativePattern) || str.length() >= 4) && str.length() <= 1000) {
            C616131n.A02(this.A06, new ChatLockPasscodeManager$validatePasscode$1(this, str, (C84814Du) null, r7), this.A07, (AnonymousClass20D) null, 2);
            return;
        }
        r7.invoke(new C91614kZ(1));
    }

    public final void A02(AnonymousClass4GQ r6) {
        Log.i("ChatLockPasscodeManager/clearPasscode");
        C616131n.A02(this.A06, new ChatLockPasscodeManager$clearPasscode$1(this, (C84814Du) null, r6), this.A07, (AnonymousClass20D) null, 2);
    }

    public final boolean A03() {
        if (!this.A04.A0X(5854) || !C18280x3.A1W(AnonymousClass0x2.A0F(this.A02.A00), "does_user_have_passcode")) {
            return false;
        }
        return true;
    }

    public C105095To(C104115Ps r2, C103435My r3, AnonymousClass1VX r4, C73853gB r5, C73853gB r6, AnonymousClass4C6 r7) {
        C18260x0.A0c(r4, r3, r2, r5);
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = r5;
        this.A05 = r6;
        this.A07 = r7;
    }
}
