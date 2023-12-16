package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.jid.Jid;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4L0  reason: invalid class name */
public final class AnonymousClass4L0 {
    public static String A0Q(AnonymousClass36K r1) {
        if (r1 != null) {
            return r1.A0n();
        }
        return null;
    }

    public static float[] A0T() {
        return new float[2];
    }

    public static Object[] A0U() {
        return new Object[0];
    }

    public static Object[] A0V(Object obj, Object obj2, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        objArr[1] = obj2;
        return objArr;
    }

    public static Canvas A06(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    public static Point A07() {
        return new Point();
    }

    public static PointF A08(float f, float f2) {
        return new PointF(f, f2);
    }

    public static RectF A09(float f, float f2, float f3, float f4) {
        return new RectF(f, f2, f3, f4);
    }

    public static SpannableString A0A(CharSequence charSequence) {
        return new SpannableString(charSequence);
    }

    public static TypedValue A0B() {
        return new TypedValue();
    }

    public static AlphaAnimation A0C(float f, float f2) {
        return new AlphaAnimation(f, f2);
    }

    public static AnonymousClass08J A0E() {
        return new AnonymousClass08J();
    }

    public static AnonymousClass0XL A0F(C17190ui r1, C15940sD r2) {
        return new AnonymousClass0XL(r1, r2);
    }

    public static C1897492m A0G(Object obj, int i) {
        return new C1897492m(obj, i);
    }

    public static LatLng A0H(double d, double d2) {
        return new LatLng(d, d2);
    }

    public static AnonymousClass8RJ A0I(RemoteException remoteException) {
        return new AnonymousClass8RJ(remoteException);
    }

    public static Jid A0M(AnonymousClass3ZH r1) {
        return r1.A0I(C95814uZ.class);
    }

    public static C137946pW A0N(Object[] objArr, int i) {
        return new C137946pW(objArr, i);
    }

    public static AnonymousClass107 A0O(Object obj) {
        return new AnonymousClass107(obj);
    }

    public static boolean A0S(String str) {
        return str.equals("wa_old");
    }

    public static float A00(View view) {
        return (float) view.getWidth();
    }

    public static int A01(Resources resources, int i) {
        return (int) resources.getDimension(i);
    }

    public static int A02(Drawable drawable, int i) {
        return i - drawable.getIntrinsicHeight();
    }

    public static int A03(View view, int i) {
        return i - view.getPaddingRight();
    }

    public static int A04(View view, int i) {
        return i + view.getMeasuredHeight();
    }

    public static int A05(View view, int i) {
        return i - view.getMeasuredHeight();
    }

    public static C08310eF A0D(Iterator it) {
        return (C08310eF) it.next();
    }

    public static C152217Ya A0J(Iterator it) {
        return (C152217Ya) it.next();
    }

    public static C109065e1 A0K(Iterator it) {
        return (C109065e1) it.next();
    }

    public static AnonymousClass3ZH A0L(List list, int i) {
        return (AnonymousClass3ZH) list.get(i);
    }

    public static AnonymousClass3ZF A0P(AbstractList abstractList, int i) {
        return (AnonymousClass3ZF) abstractList.get(i);
    }

    public static AnonymousClass7OD A0R(Iterator it) {
        return (AnonymousClass7OD) it.next();
    }
}
