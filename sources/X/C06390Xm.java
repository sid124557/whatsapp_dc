package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
public class C06390Xm {
    public static C18390xG A00;

    public static Dialog A00(Context context) {
        C18390xG r1 = new C18390xG(context);
        A00 = r1;
        r1.setTitle(R.string.f11nameremoved);
        A00.setMessage(context.getString(R.string.f11nameremoved));
        A00.setIndeterminate(true);
        A00.setCancelable(false);
        return A00;
    }

    public static String A03(Activity activity, C620733j r5, long j) {
        int i;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (i2 != 0) {
            Log.d(AnonymousClass000.A0Z("settings-chat/lastbackup/fromfiles/set to ", AnonymousClass001.A0o(), j));
        }
        if (j == 0) {
            i = R.string.f11nameremoved;
        } else if (i2 != 0) {
            return C107565bW.A08(r5, j);
        } else {
            i = R.string.f11nameremoved;
        }
        return activity.getString(i);
    }

    public static void A05(Activity activity, AnonymousClass4FU r3, AnonymousClass0XM r4, AnonymousClass5ZR r5, C620733j r6, C61072zf r7, AnonymousClass3DW r8, C183068pR r9) {
        r8.A02(new C10310hj(activity, r3, r4, r5, r6, r7, r8, r9), 0);
    }

    public static Dialog A01(Context context) {
        int i;
        int i2;
        C17750wB r2;
        if (C61072zf.A01()) {
            boolean equals = "unmounted".equals(Environment.getExternalStorageState());
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            if (equals) {
                i = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
                r2 = new C17750wB(context, 2);
            }
            r2 = null;
        } else {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            r2 = null;
        }
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(i);
        A002.A0T(i2);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        if (r2 != null) {
            A002.setPositiveButton(R.string.f11nameremoved, r2);
        }
        return A002.create();
    }
}
