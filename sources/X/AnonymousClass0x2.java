package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.net.URI;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.0x2  reason: invalid class name */
public final class AnonymousClass0x2 {
    public static String A0X(Context context, Object obj, int i, int i2) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        return context.getString(i2, objArr);
    }

    public static String A0Y(Resources resources, int i, int i2, int i3) {
        Object[] objArr = new Object[1];
        objArr[i2] = Integer.valueOf(i);
        return resources.getQuantityString(i3, i, objArr);
    }

    public static String A0a(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return parcel.readString();
    }

    public static String A0b(Object obj, StringBuilder sb, C151917Wu r4) {
        sb.append(obj);
        sb.append(", package name: ");
        if (r4 != null) {
            return r4.A02;
        }
        return null;
    }

    public static String A0c(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static JSONObject A0l(Object obj) {
        C162457s7.A0J(obj, 0);
        return new JSONObject();
    }

    public static void A0m(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A15(Jid jid, Object obj, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = jid.getRawString();
    }

    public static void A16(C83904Ag r2, Object obj, int i) {
        r2.Bfr(Message.obtain((Handler) null, 0, i, 0, obj));
    }

    public static void A1B(Object obj, Object obj2) {
        C162457s7.A0J(obj, 7);
        C162457s7.A0J(obj2, 8);
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
    }

    public static void A1R(Object[] objArr) {
        objArr[0] = "bitField0_";
    }

    public static void A1W(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "bitField0_";
    }

    public static boolean A1X(int i) {
        return (i & 1) != 0;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 1);
        return true;
    }

    public static String[] A1b() {
        String valueOf = String.valueOf(0);
        return new String[]{String.valueOf(-1), valueOf, valueOf};
    }

    public static int A00(int i, long j) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A01(int i, boolean z) {
        int i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return (i + i2) * 31;
    }

    public static int A02(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A03(Cursor cursor) {
        return cursor.getInt(cursor.getColumnIndexOrThrow("count"));
    }

    public static int A06(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C162457s7.A0J(obj2, 0);
        return intValue;
    }

    public static long A0A(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, -1);
    }

    public static long A0B(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, 0);
    }

    public static long A0D(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public static SharedPreferences A0F(AnonymousClass33p r0) {
        return (SharedPreferences) r0.A01.get();
    }

    public static Uri A0H(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Long A0T() {
        return 0L;
    }

    public static Long A0U() {
        return 1L;
    }

    public static String A0f(StringBuilder sb) {
        sb.append(']');
        return sb.toString();
    }

    public static String A0g(StringBuilder sb, AbstractMap abstractMap, AbstractMap abstractMap2) {
        sb.append("/");
        sb.append(Arrays.deepToString(abstractMap.keySet().toArray()));
        sb.append("/");
        return Arrays.deepToString(abstractMap2.keySet().toArray());
    }

    public static StringBuilder A0h() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        return sb;
    }

    public static void A0w(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A0x(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A0y(View view, Object obj, int i) {
        view.setOnClickListener(new C109385eX(obj, i));
    }

    public static void A0z(View view, Object obj, int i) {
        view.setOnClickListener(new C109325eR(obj, i));
    }

    public static void A10(View view, Object obj, int i) {
        view.setOnClickListener(new C109745f7(obj, i));
    }

    public static void A12(TextEmojiLabel textEmojiLabel, C620633i r2) {
        textEmojiLabel.setAccessibilityHelper(new AnonymousClass4TJ(textEmojiLabel, r2));
    }

    public static void A13(C623734t r2, C618832q r3, int i) {
        if (i != 0) {
            r3.A05 = r2.A0M.A0E().A00(r3.A0P, r3.A0Q);
        }
    }

    public static void A14(AnonymousClass1VX r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C86964Mo(r1));
    }

    public static void A1C(Object obj, Object obj2) {
        C162457s7.A0J(obj, 17);
        C162457s7.A0J(obj2, 18);
    }

    public static void A1F(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public static void A1G(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass0PJ(obj, obj2));
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str.replace('/', '-'));
    }

    public static byte[] A1a(String str) {
        byte[] bytes = str.getBytes(AnonymousClass79X.A05);
        C162457s7.A0D(bytes);
        return bytes;
    }

    public static int A04(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static int A05(View view) {
        return AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A07(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static int A08(Map.Entry entry) {
        return ((Number) entry.getValue()).intValue();
    }

    public static int A09(AnonymousClass66R r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static long A0C(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    public static SharedPreferences.Editor A0E(C183538qC r0) {
        return ((SharedPreferences) r0.get()).edit();
    }

    public static Drawable A0G(View view) {
        Drawable A00 = AnonymousClass0RP.A00(view.getContext(), R.drawable.ic_ephemeral_v2);
        C626936e.A06(A00);
        return C107335b8.A0B(A00, AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved));
    }

    public static TextView A0I(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (TextView) A02;
    }

    public static C08240dc A0J(C003203q r1) {
        return new C08240dc(r1.getSupportFragmentManager());
    }

    public static C95814uZ A0K(Cursor cursor, int i) {
        return C95814uZ.A00.A05(cursor.getString(i));
    }

    public static AnonymousClass1EU A0L(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1EU r02 = (AnonymousClass1EU) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass5UY A0M(View view, int i) {
        return new AnonymousClass5UY(C06560Yg.A02(view, i));
    }

    public static Integer A0N(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 15;
    }

    public static Integer A0O(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 16;
    }

    public static Integer A0P(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 17;
    }

    public static Integer A0Q(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 18;
    }

    public static NullPointerException A0V(String str, StringBuilder sb) {
        sb.append(str);
        return new NullPointerException(sb.toString());
    }

    public static Object A0W(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static String A0Z(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static String A0d(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static String A0e(String str, StringBuilder sb, char c) {
        sb.append(c);
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList A0i(Object[] objArr) {
        return new ArrayList(Arrays.asList(objArr));
    }

    public static Iterator A0j(C183538qC r0) {
        return ((Set) r0.get()).iterator();
    }

    public static Mac A0k(String str, byte[] bArr) {
        Mac instance = Mac.getInstance(str);
        instance.init(new SecretKeySpec(bArr, str));
        return instance;
    }

    public static void A0n(ContentValues contentValues, Jid jid, String str) {
        contentValues.put(str, jid.getRawString());
    }

    public static void A0o(ContentValues contentValues, String str, boolean z) {
        contentValues.put(str, Boolean.valueOf(z));
    }

    public static void A0p(Context context, ImageView imageView, int i) {
        C05040Rr.A00(ColorStateList.valueOf(AnonymousClass0Y8.A04(context, i)), imageView);
    }

    public static void A0q(Context context, TextView textView, int i) {
        textView.setTextColor(AnonymousClass0Y8.A04(context, i));
    }

    public static void A0r(Context context, TextView textView, C93314oJ r3) {
        textView.setBackgroundResource(R.drawable.date_balloon);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        textView.setTextSize(r3.getDividerFontSize());
    }

    public static void A0s(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A0t(DialogInterface.OnClickListener onClickListener, AnonymousClass0Uj r2, int i) {
        r2.setPositiveButton(i, onClickListener);
        r2.setNegativeButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
    }

    public static void A0u(Intent intent, Jid jid, String str) {
        intent.putExtra(str, jid.getRawString());
    }

    public static void A0v(BaseBundle baseBundle, Jid jid, String str) {
        baseBundle.putString(str, jid.getRawString());
    }

    public static void A11(C160667o6 r1, Object obj, int i) {
        r1.put(obj, Integer.valueOf(i));
    }

    public static void A17(AnonymousClass4FY r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.B9a());
    }

    public static void A18(Object obj) {
        Log.d(obj.toString());
    }

    public static void A19(Object obj) {
        Log.w(obj.toString());
    }

    public static void A1A(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 5);
    }

    public static void A1E(Object obj, Object obj2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append("; participant=");
        sb.append(obj2);
    }

    public static void A1H(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1I(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1J(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1K(Object obj, Map map, long j) {
        map.put(obj, Long.valueOf(j));
    }

    public static void A1L(String str, OutputStream outputStream) {
        outputStream.write(str.getBytes());
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" ");
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" FROM ");
    }

    public static void A1P(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" WHERE ");
    }

    public static void A1Q(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static void A1S(Object[] objArr, int i, long j) {
        objArr[i] = String.valueOf(j);
    }

    public static void A1T(Object[] objArr, long j) {
        objArr[2] = String.valueOf(j);
    }

    public static void A1U(Object[] objArr, long j) {
        objArr[2] = Long.valueOf(j);
    }

    public static void A1V(Object[] objArr, long j) {
        objArr[3] = Long.valueOf(j);
    }

    public static boolean A1Z(Map map, Object obj) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj2).booleanValue();
    }

    public static Long A0R() {
        return -9007199254740991L;
    }

    public static Long A0S() {
        return 9007199254740991L;
    }
}
