package X;

import android.os.CountDownTimer;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.01u  reason: invalid class name and case insensitive filesystem */
public class C001401u extends CountDownTimer {
    public final /* synthetic */ EncBackupViewModel A00;

    public void onFinish() {
        EncBackupViewModel encBackupViewModel = this.A00;
        encBackupViewModel.A00 = null;
        encBackupViewModel.A08.A0G(0L);
        C06270Wx.A04(encBackupViewModel.A04, 1);
    }

    public void onTick(long j) {
        EncBackupViewModel encBackupViewModel = this.A00;
        AnonymousClass08M r5 = encBackupViewModel.A08;
        if (r5.A07() == null || ((Number) r5.A07()).longValue() - j >= 60000) {
            r5.A0G(Long.valueOf(j));
            AnonymousClass08M r1 = encBackupViewModel.A04;
            r1.A0G(r1.A07());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C001401u(EncBackupViewModel encBackupViewModel, long j) {
        super(j, 60000);
        this.A00 = encBackupViewModel;
    }
}
