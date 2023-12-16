package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.05m  reason: invalid class name and case insensitive filesystem */
public class C005205m extends AnonymousClass0Y8 {
    public static View A00(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) AnonymousClass0H9.A00(activity, i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0c("ID does not reference a View inside this Activity");
    }

    public static TextView A01(Activity activity, int i) {
        return (TextView) A00(activity, i);
    }

    public static void A02(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet A0K = AnonymousClass002.A0K();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = A0K.size();
                if (size > 0) {
                    strArr2 = new String[(length - size)];
                    if (size != length) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < length; i4++) {
                            if (!A0K.contains(Integer.valueOf(i4))) {
                                strArr2[i3] = strArr[i4];
                                i3++;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    strArr2 = strArr;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    C05690Un.A00(activity, strArr, i);
                    return;
                } else if (activity instanceof C15730rq) {
                    AnonymousClass000.A0A().post(new C12570ll(activity, strArr2, i));
                    return;
                } else {
                    return;
                }
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                if (!AnonymousClass0WZ.A01() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    A0K.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Permission request for permissions ");
                A0o.append(Arrays.toString(strArr));
                throw AnonymousClass000.A0F(" must not contain null or empty values", A0o);
            }
        }
    }

    public static boolean A03(Activity activity, String str) {
        if (AnonymousClass0WZ.A01() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 32) {
                return AnonymousClass0HB.A00(activity, str);
            }
            if (i == 31) {
                return AnonymousClass0HA.A00(activity, str);
            }
            if (i >= 23) {
                return C05690Un.A02(activity, str);
            }
        }
        return false;
    }
}
