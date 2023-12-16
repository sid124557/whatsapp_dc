package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;

/* renamed from: X.0EC  reason: invalid class name */
public class AnonymousClass0EC extends C10210hZ {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C10170hV A01;

    public AnonymousClass0EC(ConditionVariable conditionVariable, C10170hV r2) {
        this.A01 = r2;
        this.A00 = conditionVariable;
    }

    public void BLu(boolean z) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("deleteacctconfirm/gdrive-observer/deletion-finished/");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        Log.i(AnonymousClass000.A0X(str, A0o));
        this.A00.open();
    }
}
