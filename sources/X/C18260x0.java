package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0x0  reason: invalid class name and case insensitive filesystem */
public final class C18260x0 {
    public static void A0O(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 1);
    }

    public static void A0P(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 2);
    }

    public static void A0Q(Object obj, Object obj2) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 2);
    }

    public static void A0R(Object obj, Object obj2) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 3);
    }

    public static void A0S(Object obj, Object obj2) {
        C162457s7.A0J(obj, 2);
        C162457s7.A0J(obj2, 3);
    }

    public static void A0T(Object obj, Object obj2) {
        C162457s7.A0J(obj, 5);
        C162457s7.A0J(obj2, 6);
    }

    public static void A0U(Object obj, Object obj2) {
        C162457s7.A0J(obj, 6);
        C162457s7.A0J(obj2, 7);
    }

    public static void A0V(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 2);
        C162457s7.A0J(obj3, 3);
    }

    public static void A0W(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 6);
        C162457s7.A0J(obj2, 7);
        C162457s7.A0J(obj3, 8);
    }

    public static void A0c(Object obj, Object obj2, Object obj3, Object obj4) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 2);
        C162457s7.A0J(obj3, 3);
        C162457s7.A0J(obj4, 4);
    }

    public static void A0d(Object obj, Object obj2, Object obj3, Object obj4) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 2);
        C162457s7.A0J(obj3, 4);
        C162457s7.A0J(obj4, 5);
    }

    public static void A0e(Object obj, Object obj2, Object obj3, Object obj4) {
        C162457s7.A0J(obj, 2);
        C162457s7.A0J(obj2, 3);
        C162457s7.A0J(obj3, 4);
        C162457s7.A0J(obj4, 5);
    }

    public static void A0f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C162457s7.A0J(obj, 1);
        C162457s7.A0J(obj2, 2);
        C162457s7.A0J(obj3, 3);
        C162457s7.A0J(obj4, 4);
        C162457s7.A0J(obj5, 5);
    }

    public static void A0g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C162457s7.A0J(obj, 6);
        C162457s7.A0J(obj2, 7);
        C162457s7.A0J(obj3, 8);
        C162457s7.A0J(obj4, 9);
        C162457s7.A0J(obj5, 10);
    }

    public static void A0i(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static void A0j(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static void A1W(Object[] objArr, int i, long j) {
        objArr[0] = String.valueOf(j);
        objArr[1] = String.valueOf(i);
    }

    public static boolean A1Z(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) == 1;
    }

    public static Object[] A1a() {
        Object[] objArr = new Object[2];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static String[] A1b(long j) {
        return new String[]{String.valueOf(j)};
    }

    public static long A00(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        C162457s7.A0J(obj2, 0);
        return longValue;
    }

    public static NullPointerException A02(Class cls) {
        new AnonymousClass8PJ(cls);
        return new NullPointerException("onProcessorExecuted");
    }

    public static String A05(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A06(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder A0B(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashSet A0D() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    public static void A0N(Class cls, StringBuilder sb) {
        sb.append(new AnonymousClass8PJ(cls).BD4());
    }

    public static void A0X(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 8);
        C162457s7.A0J(obj2, 9);
        C162457s7.A0J(obj3, 10);
    }

    public static void A0Y(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 11);
        C162457s7.A0J(obj2, 12);
        C162457s7.A0J(obj3, 13);
    }

    public static void A0h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C162457s7.A0J(obj, 12);
        C162457s7.A0J(obj2, 13);
        C162457s7.A0J(obj3, 14);
        C162457s7.A0J(obj4, 15);
        C162457s7.A0J(obj5, 16);
    }

    public static IllegalArgumentException A01(SendE2EMessageJob sendE2EMessageJob, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(sendE2EMessageJob.A08());
        return new IllegalArgumentException(sb.toString());
    }

    public static String A03(Jid jid, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(jid.getRawString());
        return sb.toString();
    }

    public static String A04(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A07(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static String A08(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        String obj = sb.toString();
        C162457s7.A0D(obj);
        return obj;
    }

    public static String A09(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static String A0A(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList A0C(String str, String str2) {
        return new ArrayList(Arrays.asList(new String[]{str, str2}));
    }

    public static void A0E(Context context, Resources resources, Toolbar toolbar, C620733j r4, int i) {
        toolbar.setNavigationIcon((Drawable) new C131666dx(C107335b8.A0B(resources.getDrawable(i), context.getResources().getColor(R.color.f5nameremoved)), r4));
    }

    public static void A0F(SharedPreferences.Editor editor, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        editor.putString(sb.toString(), str3).apply();
    }

    public static void A0G(SharedPreferences.Editor editor, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        editor.remove(sb.toString()).apply();
    }

    public static void A0H(Cursor cursor, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Long.valueOf(cursor.getLong(i)));
    }

    public static void A0I(C130076bL r2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        r2.A06(new RuntimeException(sb.toString()));
    }

    public static void A0J(C107695bk r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        AnonymousClass75R.A00(r1.ANI(), roundedBottomSheetDialogFragment);
        AnonymousClass73U.A00(roundedBottomSheetDialogFragment, (AnonymousClass5IB) r1.A4i.get());
    }

    public static void A0K(AnonymousClass33p r0, String str) {
        r0.A0U().remove(str).apply();
    }

    public static void A0L(AnonymousClass33p r0, String str, int i) {
        r0.A0U().putInt(str, i).apply();
    }

    public static void A0M(AnonymousClass33p r0, String str, long j) {
        r0.A0U().putLong(str, j).apply();
    }

    public static void A0Z(Object obj, Object obj2, Object obj3, int i) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 2);
        C162457s7.A0J(obj3, 3);
    }

    public static void A0a(Object obj, Object obj2, Object obj3, int i) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 3);
        C162457s7.A0J(obj3, 4);
    }

    public static void A0b(Object obj, Object obj2, Object obj3, int i) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 4);
        C162457s7.A0J(obj3, 5);
    }

    public static void A0k(Object obj, String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString(), th);
    }

    public static void A0l(Object obj, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(obj);
        C626936e.A0E(z, sb.toString());
    }

    public static void A0m(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.d(sb.toString());
    }

    public static void A0n(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.e(sb.toString());
    }

    public static void A0o(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A0p(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A0q(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.d(sb.toString());
    }

    public static void A0r(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A0s(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A0t(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString());
    }

    public static void A0u(String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString(), th);
    }

    public static void A0v(String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString(), th);
    }

    public static void A0w(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.d(sb.toString());
    }

    public static void A0x(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A0y(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A0z(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A10(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.d(sb.toString());
    }

    public static void A11(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.e(sb.toString());
    }

    public static void A12(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A13(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(System.currentTimeMillis() - j);
        Log.i(sb.toString());
    }

    public static void A14(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.w(sb.toString(), th);
    }

    public static void A15(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.e(sb.toString(), th);
    }

    public static void A16(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        Log.e(sb.toString());
    }

    public static void A17(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        Log.w(sb.toString());
    }

    public static void A18(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
    }

    public static void A19(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(abstractCollection.size());
    }

    public static void A1A(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(abstractCollection.size());
        Log.d(sb.toString());
    }

    public static void A1B(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(abstractCollection.size());
        Log.i(sb.toString());
    }

    public static void A1C(String str, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(list.size());
        Log.i(sb.toString());
    }

    public static void A1D(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        Log.d(sb.toString());
    }

    public static void A1E(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1F(StringBuilder sb, int i) {
        sb.append(i);
        Log.d(sb.toString());
    }

    public static void A1G(StringBuilder sb, int i) {
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1H(StringBuilder sb, long j) {
        sb.append(j);
        Log.d(sb.toString());
    }

    public static void A1I(StringBuilder sb, long j) {
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A1J(StringBuilder sb, String str) {
        sb.append(str);
        Log.d(sb.toString());
    }

    public static void A1K(StringBuilder sb, String str) {
        sb.append(str);
        Log.e(sb.toString());
    }

    public static void A1L(StringBuilder sb, String str) {
        sb.append(str);
        Log.i(sb.toString());
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A1N(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        C106245Ye.A00(sb.toString());
    }

    public static void A1O(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.toString());
        Log.e(sb.toString());
    }

    public static void A1P(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        Log.d(sb.toString());
    }

    public static void A1Q(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString());
    }

    public static void A1R(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A1S(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static void A1T(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.getClass().getName());
    }

    public static void A1U(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.d(sb.toString());
    }

    public static void A1V(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1X(Object[] objArr, long j) {
        objArr[0] = String.valueOf(j);
    }

    public static void A1Y(Object[] objArr, long j) {
        objArr[0] = Long.toString(j);
    }
}
