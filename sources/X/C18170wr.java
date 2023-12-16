package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.0wr  reason: invalid class name and case insensitive filesystem */
public class C18170wr implements C16830u2 {
    public Object A00;
    public final int A01;

    public C18170wr(EncBackupViewModel encBackupViewModel, int i) {
        this.A01 = i;
        this.A00 = encBackupViewModel;
    }

    public void BSH(String str, int i, int i2, int i3, int i4) {
        int i5 = this.A01;
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) this.A00;
        if (i5 != 0) {
            encBackupViewModel.A0V(i);
        } else {
            encBackupViewModel.A0W(i, i3, i4);
        }
    }
}
