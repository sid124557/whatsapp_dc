package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;

/* renamed from: X.0Z0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Z0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String[] A03;
    public final /* synthetic */ boolean[] A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        boolean[] zArr = this.A04;
        int i2 = this.A00;
        DialogInterface dialogInterface2 = dialogInterface;
        singleChoiceListDialogFragment.A02(dialogInterface2, this.A02, this.A03, zArr, i2, i);
    }

    public /* synthetic */ AnonymousClass0Z0(SingleChoiceListDialogFragment singleChoiceListDialogFragment, String str, String[] strArr, boolean[] zArr, int i) {
        this.A01 = singleChoiceListDialogFragment;
        this.A04 = zArr;
        this.A00 = i;
        this.A03 = strArr;
        this.A02 = str;
    }
}
