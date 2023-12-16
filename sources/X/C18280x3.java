package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.Jid;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.0x3  reason: invalid class name and case insensitive filesystem */
public final class C18280x3 {
    public static int A00(int i) {
        return i != 0 ? 2 : 1;
    }

    public static int A01(int i) {
        return i != 0 ? 1 : 2;
    }

    public static int A02(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, 0);
    }

    public static long A08(long j, long j2) {
        return (j - j2) / 1000;
    }

    public static ContentValues A09() {
        return new ContentValues(2);
    }

    public static C172548Lq A0H(C130546c9 r2, byte[] bArr) {
        C172548Lq A02 = C172548Lq.A02(bArr, 0, bArr.length);
        r2.A07();
        return A02;
    }

    public static Integer A0S() {
        return 2;
    }

    public static String A0Z(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    public static AtomicBoolean A0l() {
        return new AtomicBoolean(false);
    }

    public static void A19(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1A(Object obj, Object obj2, Object[] objArr) {
        objArr[3] = obj;
        objArr[4] = obj2;
    }

    public static void A1E(String str, TextView textView) {
        textView.setText(C107575bX.A02(str, new Object[0]));
    }

    public static void A1F(String str, Throwable th, int i, int i2) {
        if (i == 5) {
            Log.logToLogcat(i2, Log.log(str, Log.getStackTraceString(th)));
        } else {
            Log.log(str, Log.getStackTraceString(th));
        }
    }

    public static void A1M(AbstractList abstractList, Object[] objArr) {
        objArr[0] = abstractList.get(0);
        objArr[1] = abstractList.get(1);
    }

    public static boolean A1U(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1W(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static String[] A1b(AbstractCollection abstractCollection) {
        return (String[]) abstractCollection.toArray(new String[0]);
    }

    public static int A03(Pair pair) {
        return ((Number) pair.first).intValue();
    }

    public static int A04(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Intent A0A(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyPhoneNumber");
    }

    public static Intent A0B(String str) {
        return new Intent(str).setPackage("com.whatsapp");
    }

    public static C53602nM A0L(C107695bk r0) {
        return (C53602nM) r0.A2g.get();
    }

    public static C106715a2 A0Q(C107695bk r0) {
        return (C106715a2) r0.A72.get();
    }

    public static AnonymousClass2UC A0R(Object obj) {
        return JniBridge.INSTANCE.getJniCallbacksIJniCallbacks((NativeHolder) obj);
    }

    public static String A0a(C166557yt r1) {
        Object obj = r1.A00;
        C626936e.A06(obj);
        return String.valueOf(((Number) obj).longValue());
    }

    public static String A0b(C166557yt r0) {
        Object obj = r0.A00;
        C626936e.A06(obj);
        C162457s7.A0D(obj);
        return (String) obj;
    }

    public static String A0d(Map map) {
        return new JSONObject(map).toString();
    }

    public static StringBuilder A0e() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReadReceipts");
        return sb;
    }

    public static void A0n(Context context, Intent intent) {
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A0o(View view, Object obj, int i) {
        view.setOnClickListener(new C109675f0(obj, i));
    }

    public static void A0p(View view, Object obj, int i) {
        view.setOnClickListener(new C109415ea(obj, i));
    }

    public static void A0t(AnonymousClass3ZG r1, AnonymousClass4FV r2, boolean z) {
        r2.Bh7(r1, new AnonymousClass5ZC(z ? 1 : 0, z), z);
    }

    public static void A0x(C56052rL r1, C41032Ir r2) {
        if (r2 != null) {
            r1.A0I(r2.A00);
        }
    }

    public static void A0y(C56052rL r1, Object obj, int i) {
        if (i != 0) {
            r1.A0J(String.valueOf(obj));
        }
    }

    public static void A15(Object obj, Object obj2) {
        C162457s7.A0J(obj, 9);
        C162457s7.A0J(obj2, 10);
    }

    public static void A1L(AbstractCollection abstractCollection, int[][] iArr, int i) {
        abstractCollection.add(new C106655Zv(iArr[i]));
    }

    public static void A1N(Calendar calendar, int i) {
        calendar.set(14, i);
        calendar.set(13, i);
        calendar.set(12, i);
    }

    public static AnonymousClass36K[] A1a(AbstractCollection abstractCollection, int i) {
        return (AnonymousClass36K[]) abstractCollection.toArray(new AnonymousClass36K[i]);
    }

    public static int A05(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static int A06(Map.Entry entry) {
        return ((Number) entry.getKey()).intValue();
    }

    public static long A07() {
        return System.currentTimeMillis() / 1000;
    }

    public static Parcelable A0C(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static LayoutInflater A0D(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static View A0E(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return A02;
    }

    public static TextView A0F(View view, int i) {
        View findViewById = view.findViewById(i);
        C162457s7.A0D(findViewById);
        return (TextView) findViewById;
    }

    public static TextView A0G(AnonymousClass66R r0) {
        Object value = r0.getValue();
        C162457s7.A0D(value);
        return (TextView) value;
    }

    public static C88834as A0I(AnonymousClass4SG r0) {
        return (C88834as) ((AnonymousClass3DZ) r0.generatedComponent());
    }

    public static WaImageView A0J(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (WaImageView) A02;
    }

    public static C19340zH A0K(C08310eF r0) {
        return AnonymousClass5V0.A00(r0.A0G());
    }

    public static AnonymousClass1EB A0M(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EB) r0.A00;
    }

    public static AnonymousClass1EG A0N(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1EG r02 = (AnonymousClass1EG) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass1ES A0O(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1ES) r0.A00;
    }

    public static BanAppealViewModel A0P(C08310eF r1) {
        return (BanAppealViewModel) new AnonymousClass0XL(r1.A0R()).A01(BanAppealViewModel.class);
    }

    public static Long A0T(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public static Long A0U(Number number) {
        return Long.valueOf((long) number.intValue());
    }

    public static Object A0V(Object obj, AnonymousClass66R r2) {
        return ((Map) r2.getValue()).get(obj);
    }

    public static Object A0W(Map map, long j) {
        return map.get(Long.valueOf(j));
    }

    public static RuntimeException A0X() {
        AnonymousClass8UF.A0r();
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0Y() {
        return UUID.randomUUID().toString();
    }

    public static String A0c(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        String obj2 = jSONObject.toString();
        C162457s7.A0D(obj2);
        return obj2;
    }

    public static StringBuilder A0f(AnonymousClass4GK r0) {
        r0.close();
        return new StringBuilder();
    }

    public static StringBuilder A0g(Object obj, int i) {
        C162457s7.A0J(obj, i);
        return new StringBuilder();
    }

    public static HashSet A0h(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0i(Map map) {
        return map.keySet().iterator();
    }

    public static List A0j(long j) {
        List singletonList = Collections.singletonList(Long.valueOf(j));
        C162457s7.A0D(singletonList);
        return singletonList;
    }

    public static List A0k(Object obj, AbstractMap abstractMap) {
        List list = (List) abstractMap.get(obj);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static void A0m(ContentValues contentValues, int i) {
        contentValues.put("status", Integer.valueOf(i));
    }

    public static void A0q(AnonymousClass0Uj r0) {
        r0.create().show();
    }

    public static void A0r(C009707r r0, int i, int i2) {
        r0.findViewById(i).setVisibility(i2);
    }

    public static void A0s(AnonymousClass0QO r0, AnonymousClass0R6 r1, Collection collection, List list) {
        AnonymousClass0U0 A00 = AnonymousClass0SC.A00(r0);
        list.clear();
        list.addAll(collection);
        A00.A02(r1);
    }

    public static void A0u(Jid jid, StringBuilder sb) {
        sb.append(jid.getRawString());
    }

    public static void A0v(Jid jid, Object[] objArr) {
        objArr[0] = jid.getRawString();
    }

    public static void A0w(Jid jid, Object[] objArr, int i) {
        objArr[i] = jid.getRawString();
    }

    public static void A0z(AnonymousClass3FI r1, URLConnection uRLConnection) {
        uRLConnection.setRequestProperty("User-Agent", r1.A00());
    }

    public static void A10(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void A11(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.length());
    }

    public static void A12(Object obj) {
        C162457s7.A0H(obj);
        C162457s7.A0J(obj, 0);
    }

    public static void A13(Object obj) {
        Log.e(obj.toString());
    }

    public static void A14(Object obj) {
        Log.i(obj.toString());
    }

    public static void A16(Object obj, Object obj2, Object obj3) {
        C162457s7.A0H(obj);
        C162457s7.A0H(obj2);
        C162457s7.A0H(obj3);
    }

    public static void A17(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (C162457s7.A0P(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A18(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (!C162457s7.A0P(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A1B(Object obj, String str, AbstractMap abstractMap) {
        abstractMap.put(obj, str.getBytes());
    }

    public static void A1C(Object obj, Throwable th) {
        Log.e(obj.toString(), th);
    }

    public static void A1D(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1G(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.hashCode());
    }

    public static void A1H(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append(" ");
    }

    public static void A1I(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append(' ');
    }

    public static void A1J(StringBuilder sb, byte[] bArr) {
        sb.append(Arrays.toString(bArr));
    }

    public static void A1K(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(String.valueOf(j));
    }

    public static void A1O(Object[] objArr, int i) {
        objArr[2] = String.valueOf(i);
    }

    public static void A1P(Object[] objArr, int i) {
        objArr[4] = Integer.valueOf(i);
    }

    public static void A1Q(Object[] objArr, int i, int i2) {
        objArr[i2] = String.valueOf(i);
    }

    public static void A1R(Object[] objArr, int i, long j) {
        objArr[i] = Long.toString(j);
    }

    public static void A1S(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
    }

    public static void A1T(Object[] objArr, long j) {
        objArr[1] = Long.toString(j);
    }

    public static boolean A1V(Intent intent, String str) {
        return str.equals(intent.getAction());
    }

    public static boolean A1X(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }

    public static boolean A1Y(Map map, Object obj) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj2).booleanValue();
    }

    public static byte[] A1Z(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
