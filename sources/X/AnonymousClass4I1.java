package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.4I1  reason: invalid class name */
public class AnonymousClass4I1 implements DialogInterface.OnClickListener {
    public final int A00;

    public AnonymousClass4I1(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 7:
            case 10:
                return;
            case 4:
                dialogInterface.cancel();
                return;
            case 5:
            case 11:
                if (dialogInterface == null) {
                    return;
                }
                break;
            case 18:
                Log.i("BanAppealBaseFragment/showRemoveAccountDialog/dismiss");
                break;
        }
        dialogInterface.dismiss();
    }
}
