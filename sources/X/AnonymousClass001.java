package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.CarText;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.001  reason: invalid class name */
public final class AnonymousClass001 {
    public static float A00(float f, float f2, float f3) {
        return f2 + (f3 * (f - f2));
    }

    public static int A06(float f, float f2) {
        return (int) ((f * f2) + 0.5f);
    }

    public static int A07(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A09(int i, float f) {
        return Math.round(Math.abs(f / ((float) i)) * 1000.0f) * 4;
    }

    public static int A0A(int i, int i2) {
        return Math.abs(i - i2);
    }

    public static int A0B(int i, int i2, int i3) {
        return Math.max(i3, i + i2);
    }

    public static int A0C(int i, int i2, int i3) {
        return Math.max(i3, i - i2);
    }

    public static int A0G(Resources.Theme theme, int[] iArr, int i, int i2) {
        iArr[0] = i;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(iArr);
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static View A0R(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static Integer A0f() {
        return 1;
    }

    public static Object A0h(Class cls) {
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0l(NumberFormat numberFormat, int i) {
        return numberFormat.format(((double) i) / 100.0d);
    }

    public static void A0z(TypedArray typedArray, TwoStatePreference twoStatePreference, int i) {
        twoStatePreference.A04 = typedArray.getBoolean(i, typedArray.getBoolean(2, false));
        typedArray.recycle();
    }

    public static void A15(Parcel parcel, Parcelable parcelable, int i) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, i);
    }

    public static void A17(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public static void A1H(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static void A1I(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static boolean A1T(int i) {
        return i == 1;
    }

    public static boolean A1U(int i) {
        return i >= 0;
    }

    public static boolean A1V(int i) {
        return i < 0;
    }

    public static boolean A1W(int i) {
        return i > 0;
    }

    public static boolean A1X(int i, int i2) {
        return i != i2;
    }

    public static boolean A1Y(int i, int i2) {
        return i < i2;
    }

    public static float A02(float f, int i) {
        float f2 = (float) i;
        return f2 + (((float) Math.sin((double) ((Math.min(1.0f, f) - 0.5f) * 0.47123894f))) * f2);
    }

    public static float A05(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A08(int i) {
        return i != 0 ? 0 : 8;
    }

    public static int A0E(int i, String str, String str2) {
        return (((i * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public static int A0F(long j, long j2) {
        return (int) ((100 * j) / j2);
    }

    public static int A0J(C05570Ua r2) {
        int i = r2.A06;
        if (i == -1) {
            return r2.A05;
        }
        return i;
    }

    public static int A0K(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A0L(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Objects.hash(objArr);
    }

    public static Rect A0N() {
        return new Rect();
    }

    public static Handler A0O(Object obj) {
        return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{obj, null, Boolean.TRUE});
    }

    public static IllegalArgumentException A0c(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A0d() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0e(String str) {
        return new IllegalStateException(str);
    }

    public static NullPointerException A0g(String str) {
        return new NullPointerException(str);
    }

    public static StringBuilder A0o() {
        return new StringBuilder();
    }

    public static StringBuilder A0p() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        return sb;
    }

    public static StringBuilder A0q() {
        StringBuilder sb = new StringBuilder();
        sb.append("clients/wa/backups/");
        return sb;
    }

    public static Method A0r(Class cls, Object obj, String str, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getMethod(str, clsArr);
    }

    public static ArrayList A0s() {
        return new ArrayList();
    }

    public static HashMap A0t() {
        return new HashMap();
    }

    public static Cipher A0x(byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return instance;
    }

    public static void A10(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A11(Paint paint, C04850Qx r2) {
        if (r2 != null) {
            paint.setColorFilter((ColorFilter) r2.A0A());
        }
    }

    public static void A12(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A16(MotionEvent motionEvent, RecyclerView recyclerView, int i, int i2) {
        if (i == 5) {
            recyclerView.A0A = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            recyclerView.A07 = x;
            recyclerView.A04 = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            recyclerView.A08 = y;
            recyclerView.A05 = y;
        } else if (i == 6) {
            recyclerView.A0j(motionEvent);
        }
    }

    public static void A1A(AnonymousClass040 r1) {
        if (r1.A0K.getParent() instanceof View) {
            AnonymousClass0V0.A02((View) r1.A0K.getParent());
        }
    }

    public static void A1F(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[24] = obj;
        objArr[25] = obj2;
        objArr[26] = obj3;
        objArr[27] = obj4;
    }

    public static void A1G(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
    }

    public static void A1L(StringBuilder sb) {
        sb.append(" ");
    }

    public static void A1M(StringBuilder sb) {
        sb.append(", ");
    }

    public static boolean A1Z(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static float A03(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static float A04(View view, float f) {
        return f / ((float) view.getWidth());
    }

    public static int A0D(int i, int i2, int i3) {
        return Math.max(i3, Math.min(i, i2));
    }

    public static int A0H(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A0I(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static Configuration A0M(Context context) {
        return context.getResources().getConfiguration();
    }

    public static TypedValue A0P(ThreadLocal threadLocal) {
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static View A0Q(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static View A0S(AbstractList abstractList, int i) {
        return (View) abstractList.get(i);
    }

    public static ViewGroup.MarginLayoutParams A0T(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static LinearLayout.LayoutParams A0U(View view) {
        return (LinearLayout.LayoutParams) view.getLayoutParams();
    }

    public static C07910d1 A0V(AbstractList abstractList, int i) {
        return (C07910d1) abstractList.get(i);
    }

    public static C002002f A0W(View view) {
        return (C002002f) view.getLayoutParams();
    }

    public static AnonymousClass0XY A0X(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new AnonymousClass0XY(windowInsets);
    }

    public static C002102g A0Y(View view) {
        return (C002102g) view.getLayoutParams();
    }

    public static C05570Ua A0Z(AbstractList abstractList, int i) {
        return (C05570Ua) abstractList.get(i);
    }

    public static AnonymousClass0MR A0a(AbstractList abstractList, int i) {
        return (AnonymousClass0MR) abstractList.get(i);
    }

    public static C06230Wt A0b(List list, int i) {
        return (C06230Wt) list.get(i);
    }

    public static Object A0i(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static String A0j(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static String A0k(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static String A0m(Iterator it) {
        return (String) it.next();
    }

    public static String A0n(List list, int i) {
        return (String) list.get(i);
    }

    public static Iterator A0u(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A0v(Map map) {
        return map.values().iterator();
    }

    public static Map.Entry A0w(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A0y(Context context, TextView textView, Object[] objArr, int i) {
        textView.setText(context.getString(i, objArr));
    }

    public static void A13(Drawable drawable, View view) {
        drawable.setState(view.getDrawableState());
    }

    public static void A14(IInterface iInterface, Parcel parcel, String str, String str2) {
        parcel.writeInterfaceToken(str);
        parcel.writeString(str2);
        parcel.writeStrongInterface(iInterface);
    }

    public static void A18(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public static void A19(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A1B(CarText carText, StringBuilder sb) {
        sb.append(CarText.A00(carText));
    }

    public static void A1C(Preference preference) {
        preference.A0O(preference.A0R());
        preference.A06();
    }

    public static void A1D(Preference preference, TwoStatePreference twoStatePreference, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C15970sG r0 = preference.A0A;
        if (r0 != null) {
            r0.BYd(preference, valueOf);
        }
        twoStatePreference.A0V(z);
    }

    public static void A1E(PrintWriter printWriter, int i) {
        printWriter.print(Integer.toHexString(i));
    }

    public static void A1J(Object obj, Map map) {
        AnonymousClass0L6 r2 = (AnonymousClass0L6) map.remove(obj);
        if (r2 != null) {
            r2.A01.A01(r2.A00);
            r2.A00 = null;
        }
    }

    public static void A1K(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1N(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
    }

    public static void A1O(AbstractCollection abstractCollection, byte b) {
        abstractCollection.add(Byte.valueOf(b));
    }

    public static void A1P(Object[] objArr, float f, int i) {
        objArr[i] = Float.valueOf(f);
    }

    public static void A1Q(Object[] objArr, long j) {
        objArr[1] = Long.valueOf(j);
    }

    public static void A1R(Object[] objArr, boolean z) {
        objArr[0] = Boolean.valueOf(z);
    }

    public static void A1S(Object[] objArr, boolean z) {
        objArr[2] = Boolean.valueOf(z);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return obj2.equals(obj.getClass());
    }

    public static boolean A1b(Object obj, boolean z) {
        return Objects.equals(obj, Boolean.valueOf(z));
    }
}
