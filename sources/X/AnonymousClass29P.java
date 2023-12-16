package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.29P  reason: invalid class name */
public class AnonymousClass29P {
    public static AnonymousClass043 A00(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, AnonymousClass5ZU r16, AnonymousClass3ZH r17, AnonymousClass5Y0 r18, ArrayList arrayList, Map map) {
        Resources resources;
        int i;
        String string;
        Resources resources2;
        int i2;
        AnonymousClass3ZH r3 = r17;
        if (map != null && map.size() == 1) {
            r3 = C18310x6.A0R(AnonymousClass001.A0v(map));
            map.clear();
        }
        AnonymousClass5ZU r6 = r16;
        if (map == null || map.isEmpty()) {
            if (r3 == null || !r3.A0U()) {
                if (arrayList == null || arrayList.size() <= 1) {
                    resources = activity.getResources();
                    i = R.string.f11nameremoved;
                    Object[] objArr = new Object[1];
                    C18300x5.A1E(r6, r3, objArr, 0);
                    string = resources.getString(i, objArr);
                } else {
                    resources2 = activity.getResources();
                    i2 = R.plurals.f9nameremoved;
                }
            } else if (arrayList == null || arrayList.size() <= 1) {
                resources = activity.getResources();
                i = R.string.f11nameremoved;
                Object[] objArr2 = new Object[1];
                C18300x5.A1E(r6, r3, objArr2, 0);
                string = resources.getString(i, objArr2);
            } else {
                resources2 = activity.getResources();
                i2 = R.plurals.f9nameremoved;
            }
            int size = arrayList.size();
            Object[] objArr3 = new Object[2];
            AnonymousClass000.A1P(objArr3, arrayList.size(), 0);
            C18300x5.A1E(r6, r3, objArr3, 1);
            string = resources2.getQuantityString(i2, size, objArr3);
        } else {
            String A0X = r6.A0X(map.values(), 3, -1, false, true);
            if (arrayList == null || arrayList.size() <= 1) {
                string = C18320x8.A0b(activity.getResources(), A0X, new Object[1], 0, R.string.f11nameremoved);
            } else {
                Resources resources3 = activity.getResources();
                int size2 = arrayList.size();
                Object[] objArr4 = new Object[2];
                AnonymousClass000.A1P(objArr4, arrayList.size(), 0);
                objArr4[1] = A0X;
                string = resources3.getQuantityString(R.plurals.f9nameremoved, size2, objArr4);
            }
        }
        C19340zH A00 = AnonymousClass5V0.A00(activity);
        A00.A0g(C107345b9.A05(activity, r18, string));
        A00.A0i(true);
        A00.A0W(onClickListener2, R.string.f11nameremoved);
        A00.A0Y(onClickListener, R.string.f11nameremoved);
        A00.A0V(onCancelListener);
        return A00.create();
    }
}
