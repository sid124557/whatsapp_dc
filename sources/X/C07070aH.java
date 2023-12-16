package X;

import android.view.View;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.0aH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07070aH implements View.OnFocusChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public final void onFocusChange(View view, boolean z) {
        this.A01.A02(this.A00, z);
    }

    public /* synthetic */ C07070aH(EncryptionKeyFragment encryptionKeyFragment, int i) {
        this.A01 = encryptionKeyFragment;
        this.A00 = i;
    }
}
