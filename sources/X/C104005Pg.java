package X;

/* renamed from: X.5Pg  reason: invalid class name and case insensitive filesystem */
public class C104005Pg {
    public final C56612sH A00;
    public final C60152y5 A01;

    public long A00() {
        long A0B = AnonymousClass0x2.A0B(this.A01.A03("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time");
        C18260x0.A12("AccountDefenceLocalDataRepository/get-original-sms-wait-time-diff ", AnonymousClass001.A0o(), A0B);
        return A0B;
    }

    public long A01() {
        long A0B = AnonymousClass0x2.A0B(this.A01.A03("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time");
        C18260x0.A12("AccountDefenceLocalDataRepository/get-original-voice-wait-time-diff ", AnonymousClass001.A0o(), A0B);
        return A0B;
    }

    public C104005Pg(C56612sH r1, C60152y5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
