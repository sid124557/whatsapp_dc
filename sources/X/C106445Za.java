package X;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.5Za  reason: invalid class name and case insensitive filesystem */
public class C106445Za {
    public static String A01(Context context, AnonymousClass5ZO r5) {
        String str = r5.A08;
        if (r5.A0A() && TextUtils.isEmpty(str)) {
            return context.getString(R.string.f11nameremoved);
        }
        if (r5.A09() && !TextUtils.isEmpty(str)) {
            return str.trim();
        }
        boolean A07 = r5.A07();
        int i = R.string.f11nameremoved;
        if (A07) {
            i = R.string.f11nameremoved;
        }
        return AnonymousClass0x2.A0X(context, str, 1, i);
    }

    public static String A00(Context context, Address address, float f) {
        String thoroughfare = address.getThoroughfare();
        if (((double) f) <= 200.0d && !TextUtils.isEmpty(thoroughfare)) {
            String subThoroughfare = address.getSubThoroughfare();
            if (TextUtils.isEmpty(subThoroughfare)) {
                return thoroughfare;
            }
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(thoroughfare, subThoroughfare, A0M);
            return context.getString(R.string.f11nameremoved, A0M);
        } else if (!TextUtils.isEmpty(address.getSubLocality())) {
            return address.getSubLocality();
        } else {
            if (!TextUtils.isEmpty(address.getLocality())) {
                return address.getLocality();
            }
            if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                return address.getSubAdminArea();
            }
            return null;
        }
    }
}
