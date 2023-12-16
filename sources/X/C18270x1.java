package X;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InvalidObjectException;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0x1  reason: invalid class name and case insensitive filesystem */
public final class C18270x1 {
    public static C172548Lq A08(C130546c9 r3, String str) {
        byte[] decode = Base64.decode(str, 0);
        C172548Lq A02 = C172548Lq.A02(decode, 0, decode.length);
        r3.A07();
        return A02;
    }

    public static C172548Lq A09(C130546c9 r2, byte[] bArr) {
        C172548Lq A02 = C172548Lq.A02(bArr, 0, bArr.length);
        r2.A07();
        return A02;
    }

    public static StringBuilder A0X(Object obj) {
        C162457s7.A0J(obj, 0);
        return new StringBuilder();
    }

    public static void A0f(SharedPreferences.Editor editor, String str) {
        editor.putBoolean(str, true).apply();
    }

    public static void A0s(C05610Ue r2, CharSequence charSequence, CharSequence charSequence2) {
        r2.A02(3);
        r2.A0E(true);
        r2.A0B(charSequence);
        r2.A0A(charSequence2);
    }

    public static void A0u(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public static void A0w(AnonymousClass5ZM r1, AnonymousClass4FS r2) {
        r2.BkL(r1, new Void[0]);
    }

    public static void A12(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 3);
    }

    public static void A14(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 1);
    }

    public static void A1Q(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
    }

    public static void A1S(Object[] objArr, long j) {
        objArr[0] = String.valueOf(j);
    }

    public static boolean A1T(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1U(Object obj, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, 1);
        return true;
    }

    public static Object[] A1W() {
        Object[] objArr = new Object[3];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1X() {
        Object[] objArr = new Object[4];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1Y() {
        Object[] objArr = new Object[5];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A1Z() {
        Object[] objArr = new Object[6];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static String[] A1a(Jid jid) {
        return new String[]{jid.getRawString()};
    }

    public static String[] A1b(Object obj) {
        return new String[]{obj};
    }

    public static int A00(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static long A01(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
    }

    public static SharedPreferences.Editor A03(AnonymousClass33p r0) {
        return ((SharedPreferences) r0.A01.get()).edit();
    }

    public static LayoutInflater A06(LayoutInflater layoutInflater, C08310eF r2) {
        return layoutInflater.cloneInContext(new C86674La(layoutInflater, r2));
    }

    public static AnonymousClass0XS A07() {
        AnonymousClass0Pq r1 = new AnonymousClass0Pq();
        r1.A02(C02380Fy.CONNECTED);
        return r1.A00();
    }

    public static RuntimeException A0R() {
        C162457s7.A0M("abProps");
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0T(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static StringBuilder A0W(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb;
    }

    public static void A0p(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A0q(TextView textView, AnonymousClass1VX r2) {
        textView.setMovementMethod(new C86964Mo(r2));
    }

    public static void A0r(C05610Ue r1, CharSequence charSequence) {
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A07(charSequence);
        r1.A08(notificationCompat$BigTextStyle);
    }

    public static void A13(Object obj, Object obj2) {
        C162457s7.A0J(obj, 11);
        C162457s7.A0J(obj2, 12);
    }

    public static void A1I(StringBuilder sb, Job job) {
        sb.append("; persistentId=");
        sb.append(job.A01);
    }

    public static void A1J(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(15000);
        uRLConnection.setReadTimeout(30000);
    }

    public static long A02(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static SharedPreferences.Editor A04(AnonymousClass66R r0) {
        return ((SharedPreferences) r0.getValue()).edit();
    }

    public static SharedPreferences A05(C183538qC r0) {
        return (SharedPreferences) ((AnonymousClass33p) r0.get()).A01.get();
    }

    public static File A0A(File file, String str, StringBuilder sb) {
        sb.append(str);
        return new File(file, sb.toString());
    }

    public static File A0B(String str, AnonymousClass66R r3) {
        return new File(((File) r3.getValue()).getAbsolutePath(), str);
    }

    public static InvalidObjectException A0C(String str, StringBuilder sb) {
        sb.append(str);
        return new InvalidObjectException(sb.toString());
    }

    public static Integer A0D(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 1;
    }

    public static Integer A0E(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 2;
    }

    public static Integer A0F(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 3;
    }

    public static Integer A0G(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 4;
    }

    public static Integer A0H(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 5;
    }

    public static Integer A0I(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 6;
    }

    public static Integer A0J(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 7;
    }

    public static Integer A0K(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 8;
    }

    public static Integer A0L(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 9;
    }

    public static Integer A0M(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 10;
    }

    public static Integer A0N(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 11;
    }

    public static Integer A0O(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 12;
    }

    public static Integer A0P(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 13;
    }

    public static Integer A0Q(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 14;
    }

    public static RuntimeException A0S(String str) {
        C162457s7.A0M(str);
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0U(StringBuilder sb, long j) {
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public static String A0V(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return Base64.encodeToString(messageDigest.digest(), 2);
    }

    public static Iterator A0Y(C183538qC r0) {
        Object obj = r0.get();
        C162457s7.A0D(obj);
        return ((Iterable) obj).iterator();
    }

    public static void A0Z(ContentProviderOperation.Builder builder, Object obj, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(builder.withValue(str, obj).build());
    }

    public static void A0a(ContentValues contentValues, long j) {
        contentValues.put("message_row_id", Long.valueOf(j));
    }

    public static void A0b(ContentValues contentValues, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
    }

    public static void A0c(ContentValues contentValues, String str, long j) {
        contentValues.put(str, Long.valueOf(j));
    }

    public static void A0d(Context context, ImageView imageView, C620733j r3, int i) {
        imageView.setImageDrawable(new C131666dx(AnonymousClass0RP.A00(context, i), r3));
    }

    public static void A0e(SharedPreferences.Editor editor, Object obj, String str) {
        editor.putString(str, obj.toString()).apply();
    }

    public static void A0g(SharedPreferences.Editor editor, String str) {
        editor.remove(str).apply();
    }

    public static void A0h(SharedPreferences.Editor editor, String str, int i) {
        editor.putInt(str, i).apply();
    }

    public static void A0i(SharedPreferences.Editor editor, String str, long j) {
        editor.putLong(str, j).apply();
    }

    public static void A0j(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A0k(SharedPreferences.Editor editor, String str, StringBuilder sb, long j) {
        sb.append(str);
        editor.putLong(sb.toString(), j).apply();
    }

    public static void A0l(SharedPreferences.Editor editor, String str, boolean z) {
        editor.putBoolean(str, z).apply();
    }

    public static void A0m(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A0n(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().remove(str).apply();
    }

    public static void A0o(SharedPreferences sharedPreferences, String str, long j) {
        sharedPreferences.edit().putLong(str, j).apply();
    }

    public static void A0t(DialogFragment dialogFragment, C003203q r3) {
        dialogFragment.A1O(r3.getSupportFragmentManager(), (String) null);
    }

    public static void A0v(AnonymousClass33p r0, String str, boolean z) {
        r0.A0U().putBoolean(str, z).apply();
    }

    public static void A0x(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A0y(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getName());
    }

    public static void A0z(Object obj) {
        C626936e.A0D(false, obj.toString());
    }

    public static void A10(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 2);
    }

    public static void A11(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 4);
    }

    public static void A15(Object obj, Object obj2, Object obj3, int i) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 13);
        C162457s7.A0J(obj3, 14);
    }

    public static void A16(Object obj, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(obj.getClass());
        C626936e.A0E(z, sb.toString());
    }

    public static void A17(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static void A18(Object obj, StringBuilder sb, char c) {
        sb.append(c);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A19(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1A(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(TextUtils.join(",", Collections.nCopies(i, "?")));
    }

    public static void A1B(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.w(sb.toString());
    }

    public static void A1C(String str, StringBuilder sb, StringBuilder sb2) {
        sb.append(str);
        sb2.append(sb.toString());
    }

    public static void A1D(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        abstractCollection.add(sb.toString());
    }

    public static void A1E(StringBuilder sb, char c) {
        sb.append(c);
        Log.d(sb.toString());
    }

    public static void A1F(StringBuilder sb, int i) {
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A1G(StringBuilder sb, String str) {
        sb.append(str);
        C106245Ye.A00(sb.toString());
    }

    public static void A1H(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.toString());
    }

    public static void A1K(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1L(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Jid) it.next()).getRawString());
    }

    public static void A1M(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(String.valueOf(((Number) it.next()).longValue()));
    }

    public static void A1N(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static void A1O(Object[] objArr, int i) {
        objArr[0] = String.valueOf(i);
    }

    public static void A1P(Object[] objArr, int i) {
        objArr[1] = String.valueOf(i);
    }

    public static void A1R(Object[] objArr, long j) {
        objArr[1] = String.valueOf(j);
    }

    public static boolean A1V(AnonymousClass66R r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }
}
