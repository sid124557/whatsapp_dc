package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.28v  reason: invalid class name and case insensitive filesystem */
public final class C387128v {
    public static final Dialog A00(Activity activity, C69263Wi r13, C621033m r14, AnonymousClass5Y0 r15, AnonymousClass4BL r16, Set set) {
        C69263Wi r7 = r13;
        C162457s7.A0J(r13, 1);
        C621033m r8 = r14;
        Set set2 = set;
        C18260x0.A0a(r15, r14, set2, 2);
        if (set2.isEmpty()) {
            Log.e("dialog/delete no statuses");
            return null;
        }
        Resources resources = activity.getResources();
        int size = set2.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, set2.size());
        String quantityString = resources.getQuantityString(R.plurals.f9nameremoved, size, objArr);
        C162457s7.A0H(quantityString);
        Resources resources2 = activity.getResources();
        C19340zH A00 = AnonymousClass5V0.A00(activity);
        A00.A0R(true);
        A00.A0Q(C107345b9.A05(activity, r15, quantityString));
        A00.setPositiveButton(R.string.f11nameremoved, new C85754Hm(activity, resources2, r7, r8, r16, set2, 1));
        C85804Hr.A00(A00, activity, 97, R.string.f11nameremoved);
        A00.A0D(new C85824Ht(activity, 9));
        return A00.create();
    }
}
