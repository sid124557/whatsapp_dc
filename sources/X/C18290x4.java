package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcel;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.nio.charset.Charset;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* renamed from: X.0x4  reason: invalid class name and case insensitive filesystem */
public final class C18290x4 {
    public static int A04(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        return menuItem.getItemId();
    }

    public static long A0A(int i) {
        return ((long) i) * 1000;
    }

    public static ContentValues A0E() {
        return new ContentValues(3);
    }

    public static Message A0J(int i, Object obj) {
        return Message.obtain((Handler) null, 0, i, 0, obj);
    }

    public static Integer A0Z() {
        return 0;
    }

    public static Integer A0a() {
        return 3;
    }

    public static Integer A0b() {
        return 4;
    }

    public static Integer A0c() {
        return 5;
    }

    public static Integer A0d() {
        return 6;
    }

    public static Object A0k(List list) {
        return list.get(0);
    }

    public static String A0s(List list) {
        return (String) list.get(1);
    }

    public static String A0t(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static CountDownLatch A14() {
        return new CountDownLatch(1);
    }

    public static void A18(Activity activity) {
        activity.setResult(-1);
        activity.finish();
    }

    public static void A1E(Menu menu, int i, int i2) {
        menu.add(0, i, 0, i2).setShowAsAction(0);
    }

    public static void A1T(List list, Object[] objArr) {
        objArr[0] = list.get(0);
        objArr[1] = list.get(1);
    }

    public static boolean A1W(Object obj) {
        C162457s7.A0J(obj, 1);
        return false;
    }

    public static boolean A1X(Object obj, C85484Gk r2) {
        C162457s7.A0J(obj, 1);
        return C162457s7.A0P(r2.getKey(), obj);
    }

    public static byte[] A1a(Object obj, int i) {
        return (byte[]) JniBridge.jvidispatchOIO(0, (long) i, obj);
    }

    public static int A03(Pair pair) {
        return ((Number) pair.second).intValue();
    }

    public static int A05(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static int A07(byte[] bArr, int i, int i2) {
        return (bArr[i2 + 3] & 255) | ((i & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static long A08() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static long A09(int i) {
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public static long A0B(long j) {
        return j / 1000;
    }

    public static Handler A0I(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static C106655Zv A0Q(int[] iArr, int i, int i2) {
        iArr[i2] = i;
        return new C106655Zv(iArr);
    }

    public static IllegalStateException A0Y() {
        return new IllegalStateException("Required value was null.");
    }

    public static String A0n(Jid jid) {
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public static String A0q(String str, Locale locale, long j) {
        String format = new SimpleDateFormat(str, locale).format(new Date(j));
        C162457s7.A0D(format);
        return format;
    }

    public static StringBuilder A0v(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static UnsupportedOperationException A0x() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static SecretKey A15() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return instance.generateKey();
    }

    public static AnonymousClass8PJ A16() {
        return new AnonymousClass8PJ(AnonymousClass4G5.class);
    }

    public static short A17() {
        if (Build.VERSION.SDK_INT >= 26) {
            return -1;
        }
        return -2;
    }

    public static void A1B(Context context, StringBuilder sb, Object[] objArr, int i) {
        sb.append(context.getString(i, objArr));
        sb.append("\n");
    }

    public static void A1F(View view, Object obj, int i) {
        view.setOnClickListener(new C109365eV(obj, i));
    }

    public static void A1G(View view, Object obj, int i) {
        view.setOnClickListener(new C109355eU(obj, i));
    }

    public static void A1H(View view, Object obj, int i) {
        view.setOnClickListener(new C109425eb(obj, i));
    }

    public static void A1I(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C109465ef(obj, i, obj2));
    }

    public static void A1J(Task task, FirebaseInstanceId firebaseInstanceId, C151127Tn r4) {
        firebaseInstanceId.A04(task.continueWith(r4.A04, new AnonymousClass8BE(r4)).continueWith(AnonymousClass779.A00, new AnonymousClass8BD()));
    }

    public static void A1L(AnonymousClass5ZM r1) {
        if (r1 != null) {
            r1.A0D(true);
        }
    }

    public static void A1M(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C117175rV(obj, i, obj2));
    }

    public static void A1N(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 19);
        C162457s7.A0J(obj2, 20);
        C162457s7.A0J(obj3, 21);
    }

    public static void A1S(Key key, Cipher cipher, byte[] bArr) {
        cipher.init(2, key, new IvParameterSpec(bArr));
    }

    public static byte[] A1b(String str) {
        Charset charset = C58152un.A0D;
        C162457s7.A0F(charset);
        byte[] bytes = str.getBytes(charset);
        C162457s7.A0D(bytes);
        return bytes;
    }

    public static int A00(Context context) {
        return AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A01(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return 0;
        }
        return cursor.getInt(i);
    }

    public static int A02(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        C162457s7.A0D(nextString);
        return Integer.parseInt(nextString);
    }

    public static int A06(Map.Entry entry) {
        return ((List) entry.getValue()).size();
    }

    public static long A0C(Object obj, Map map) {
        return ((Number) map.get(obj)).longValue();
    }

    public static long A0D(AnonymousClass66R r1) {
        return ((Number) r1.getValue()).longValue();
    }

    public static Context A0F(View view) {
        Context context = view.getContext();
        C162457s7.A0D(context);
        return context;
    }

    public static Resources A0G(View view) {
        return view.getContext().getResources();
    }

    public static Uri A0H(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Pair A0K(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static View A0L(Activity activity, int i) {
        View A00 = C005205m.A00(activity, i);
        C162457s7.A0D(A00);
        return A00;
    }

    public static View A0M(View view, int i) {
        View findViewById = view.findViewById(i);
        C162457s7.A0D(findViewById);
        return findViewById;
    }

    public static View A0N(C009707r r0, int i) {
        View findViewById = r0.findViewById(i);
        C162457s7.A0D(findViewById);
        return findViewById;
    }

    public static AnonymousClass0XL A0O(C08310eF r1) {
        return new AnonymousClass0XL(r1.A0R());
    }

    public static C01460Ay A0P(AnonymousClass0XS r3, AnonymousClass0Xq r4, C04770Qp r5, String str) {
        r5.A06(str);
        r5.A04(r3);
        r5.A03(AnonymousClass0FN.EXPONENTIAL, TimeUnit.HOURS, 1);
        r5.A00.A0B = r4;
        return (C01460Ay) r5.A00();
    }

    public static AnonymousClass2SS A0R(Object obj, AbstractMap abstractMap) {
        AnonymousClass2SS r0 = (AnonymousClass2SS) abstractMap.get(obj);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2SS r02 = new AnonymousClass2SS();
        abstractMap.put(obj, r02);
        return r02;
    }

    public static AnonymousClass1ED A0S(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1ED) r0.A00;
    }

    public static AnonymousClass1EU A0T(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EU) r0.A00;
    }

    public static AnonymousClass1EG A0U(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EG) r0.A00;
    }

    public static AnonymousClass1ET A0V(C130546c9 r0) {
        AnonymousClass1ET r02 = (AnonymousClass1ET) r0.A06();
        r02.getClass();
        return r02;
    }

    public static AnonymousClass1EO A0W(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1EO r02 = (AnonymousClass1EO) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass5UY A0X(View view, int i) {
        return new AnonymousClass5UY(view.findViewById(i));
    }

    public static Integer A0e(C160667o6 r1, Object obj, int i) {
        Integer valueOf = Integer.valueOf(i);
        r1.put(obj, valueOf);
        return valueOf;
    }

    public static Integer A0f(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 25;
    }

    public static Long A0g(String str) {
        return Long.valueOf(UUID.fromString(str).getMostSignificantBits() & Long.MAX_VALUE);
    }

    public static Long A0h(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static Object A0i(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        C626936e.A06(obj2);
        return obj2;
    }

    public static Object A0j(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static String A0l(Context context, int i) {
        String string = context.getString(i);
        C162457s7.A0D(string);
        return string;
    }

    public static String A0m(EditText editText) {
        return editText.getText().toString();
    }

    public static String A0o(Object obj) {
        String obj2 = obj.toString();
        C162457s7.A0D(obj2);
        return obj2;
    }

    public static String A0p(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static String A0r(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        C162457s7.A0D(string);
        return string;
    }

    public static StringBuilder A0u(Object obj) {
        C626936e.A06(obj);
        return new StringBuilder();
    }

    public static StringBuilder A0w(String str, StringBuilder sb) {
        sb.append(str);
        return new StringBuilder();
    }

    public static ArrayList A0y(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static ArrayList A0z(Map map) {
        return new ArrayList(map.size());
    }

    public static Iterator A10(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Iterator A11(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static List A12(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C162457s7.A0D(singletonList);
        return singletonList;
    }

    public static Set A13(Object obj) {
        Set singleton = Collections.singleton(obj);
        C162457s7.A0D(singleton);
        return singleton;
    }

    public static void A19(ContentValues contentValues, long j) {
        contentValues.put("timestamp", Long.valueOf(j));
    }

    public static void A1A(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(AnonymousClass0RP.A00(context, i));
    }

    public static void A1C(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A1D(Parcel parcel, Enum enumR) {
        parcel.writeString(enumR.name());
    }

    public static void A1K(AnonymousClass5ZU r0, AnonymousClass3ZH r1, Object[] objArr) {
        objArr[0] = r0.A0H(r1);
    }

    public static void A1O(String str, StringBuilder sb, Collection collection) {
        sb.append(str);
        sb.append(collection.size());
    }

    public static void A1P(String str, StringBuilder sb, Set set) {
        sb.append(str);
        sb.append(set.size());
    }

    public static void A1Q(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(System.currentTimeMillis());
    }

    public static void A1R(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(":");
    }

    public static void A1U(Object[] objArr, int i) {
        objArr[6] = Integer.valueOf(i);
    }

    public static boolean A1V(File file, String str) {
        return str.startsWith(file.getCanonicalPath());
    }

    public static boolean A1Y(AnonymousClass66R r0) {
        return ((File) r0.getValue()).exists();
    }

    public static byte[] A1Z(C130546c9 r0) {
        return r0.A06().A0F();
    }
}
