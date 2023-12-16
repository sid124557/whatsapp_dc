package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0wI  reason: invalid class name and case insensitive filesystem */
public class C17820wI implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C17820wI(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((RestoreFromBackupActivity) obj).A1a(this.A01);
                return;
            case 1:
                ((RestoreFromBackupActivity) obj).A1b(this.A01);
                return;
            default:
                ((SettingsGoogleDrive) obj).A1g(this.A01);
                return;
        }
    }
}
