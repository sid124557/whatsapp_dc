package X;

import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;

/* renamed from: X.0w8  reason: invalid class name */
public class AnonymousClass0w8 implements AnonymousClass65C {
    public Object A00;
    public final int A01;

    public AnonymousClass0w8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BMz(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((VerifyPasswordFragment) obj).A1S(i);
        } else {
            EncryptionKeyInputFragment.A02((EncryptionKeyInputFragment) obj, i);
        }
    }
}
