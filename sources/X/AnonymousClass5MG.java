package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5MG  reason: invalid class name */
public class AnonymousClass5MG {
    public final Context A00;

    public static String A01(Context context) {
        return new AnonymousClass5MG(context).A03(R.string.f11nameremoved);
    }

    public static void A02(Context context, Context context2, Intent intent, View view, Object obj) {
        C107275b2.A09(context2, intent, view, new AnonymousClass5MG(context), C107315b6.A06(obj.toString()));
    }

    public String A03(int i) {
        return this.A00.getResources().getString(i);
    }

    public AnonymousClass5MG(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static Bundle A00(Activity activity, View view, AnonymousClass5MG r3) {
        return C107275b2.A05(activity, view, r3.A03(R.string.f11nameremoved));
    }
}
