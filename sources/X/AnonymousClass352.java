package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.352  reason: invalid class name */
public class AnonymousClass352 {
    public static String A01(Context context, int i, boolean z, boolean z2) {
        int i2;
        if (i <= 0) {
            if (z2) {
                i2 = R.string.f11nameremoved;
                if (z) {
                    i2 = R.string.f11nameremoved;
                }
            } else {
                i2 = R.string.f11nameremoved;
                if (z) {
                    i2 = R.string.f11nameremoved;
                }
            }
        } else if (i == 86400) {
            i2 = R.string.f11nameremoved;
            if (!z) {
                i2 = R.string.f11nameremoved;
            }
        } else if (i == 604800) {
            i2 = R.string.f11nameremoved;
            if (!z) {
                i2 = R.string.f11nameremoved;
            }
        } else if (i == 7776000) {
            i2 = R.string.f11nameremoved;
            if (!z) {
                i2 = R.string.f11nameremoved;
            }
        } else {
            int i3 = R.plurals.f9nameremoved;
            if (i > 86400) {
                i /= 86400;
                i3 = R.plurals.f9nameremoved;
            } else if (i >= 3600) {
                i /= 3600;
                i3 = R.plurals.f9nameremoved;
            } else if (i >= 60) {
                i /= 60;
                i3 = R.plurals.f9nameremoved;
            }
            Resources resources = context.getResources();
            Object[] A0L = AnonymousClass002.A0L();
            C18270x1.A1Q(A0L, i);
            return resources.getQuantityString(i3, i, A0L);
        }
        return context.getString(i2);
    }

    public static String A02(C620733j r6, int i) {
        int i2;
        if (i <= 0) {
            return "";
        }
        if (i >= 86400) {
            i /= 86400;
            i2 = R.plurals.f9nameremoved;
        } else if (i >= 3600) {
            i /= 3600;
            i2 = R.plurals.f9nameremoved;
        } else if (i >= 60) {
            i /= 60;
            i2 = R.plurals.f9nameremoved;
        } else {
            i2 = R.plurals.f9nameremoved;
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, i, 0);
        return r6.A0L(objArr, i2, (long) i);
    }

    public static void A03(RadioGroup radioGroup, AnonymousClass1VX r11, int i, boolean z, boolean z2) {
        int[] iArr;
        if (r11.A0Y(C58422vE.A02, 1397)) {
            iArr = C58152un.A0K;
        } else {
            iArr = C58152un.A0L;
        }
        int length = iArr.length;
        AppCompatRadioButton[] appCompatRadioButtonArr = new AppCompatRadioButton[length];
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (!z2 || i4 != 0) {
                Context context = radioGroup.getContext();
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(context, R.style.f12nameremoved));
                appCompatRadioButton.setId(AnonymousClass0YH.A00());
                appCompatRadioButton.setTag(Integer.valueOf(i4));
                appCompatRadioButton.setText(A01(context, i4, true, z));
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                appCompatRadioButtonArr[i3] = appCompatRadioButton;
                radioGroup.addView(appCompatRadioButton);
                if (i4 == i) {
                    i2 = i3;
                }
            }
        }
        if (i2 >= 0) {
            appCompatRadioButtonArr[i2].setChecked(true);
        }
    }

    public static boolean A04(C64773Ex r4, C56982ss r5, C624134x r6) {
        C95814uZ r3 = r6.A1J.A00;
        if ((r3 instanceof AnonymousClass1fS) || AnonymousClass000.A1U(r6.A0A & 16384, 16384) || AnonymousClass000.A1U(r6.A0A & 65536, 65536)) {
            return false;
        }
        C626936e.A06(r3);
        if (A00(r4, r5, r3) != r6.A05) {
            return true;
        }
        return false;
    }

    public static int A00(C64773Ex r1, C56982ss r2, C95814uZ r3) {
        AnonymousClass31A A01;
        AnonymousClass3Z2 r0;
        if (C627336j.A0K(r3)) {
            AnonymousClass3ZH A07 = r1.A07(r3);
            if (A07 != null) {
                return A07.A02;
            }
            return 0;
        } else if (!(r3 instanceof UserJid) || (A01 = C56982ss.A01(r2, (UserJid) r3)) == null || (r0 = A01.A0b) == null) {
            return 0;
        } else {
            return r0.expiration;
        }
    }
}
