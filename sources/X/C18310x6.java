package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.Statistics$Data;
import com.whatsapp.base.Hilt_WaDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.bottomsheet.Hilt_WDSBottomSheetDialogFragment;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* renamed from: X.0x6  reason: invalid class name and case insensitive filesystem */
public final class C18310x6 {
    public static int A02(int i) {
        return i != 0 ? 2 : 0;
    }

    public static int A03(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, -1);
    }

    public static int A04(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return parcel.readInt();
    }

    public static int A07(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static long A0C(int[] iArr) {
        return (long) (iArr[0] + iArr[1] + iArr[2]);
    }

    public static View A0H(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static Long A0f(long j, long j2) {
        return Long.valueOf(j - j2);
    }

    public static String A0m(C08310eF r2, Object obj, int i) {
        return r2.A0Y(i, obj);
    }

    public static DeflaterOutputStream A0u(OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream, new Deflater(1, false));
    }

    public static void A14(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(1);
    }

    public static void A15(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A1L(String str, String str2, int i, int i2) {
        if (i == 5) {
            Log.logToLogcat(i2, Log.log(str, str2));
        } else {
            Log.log(str, str2);
        }
    }

    public static void A1P(StringBuilder sb, String str) {
        sb.append(C107575bX.A0B(str, 4));
    }

    public static boolean A1W(int i) {
        return i == 1;
    }

    public static URLSpan[] A1Z(SpannableStringBuilder spannableStringBuilder) {
        return (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
    }

    public static Object[] A1a(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        return objArr;
    }

    public static Object[] A1b(Object obj, int i) {
        Object[] objArr = new Object[2];
        objArr[i] = obj;
        return objArr;
    }

    public static int A05(AnonymousClass1ES r0) {
        return r0.messageStubParameters_.size();
    }

    public static int A06(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A08(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.hashCode(objArr);
    }

    public static long A0B(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Intent A0D(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static AnonymousClass5SO A0P(AnonymousClass5SO r4, List list) {
        return new AnonymousClass5SO(r4.A00, list, r4.A03, r4.A02);
    }

    public static C95814uZ A0S(String str) {
        return C95814uZ.A00.A05(str);
    }

    public static AnonymousClass1BB A0U(C21801Df r0, int i) {
        AnonymousClass1BB r02 = ((C21591Ck) r0.buttons_.get(i)).nativeFlowInfo_;
        if (r02 == null) {
            return AnonymousClass1BB.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static BufferedReader A0Z(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static Integer A0e() {
        return 8;
    }

    public static String A0j(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, new JSONObject().toString());
        if (string == null) {
            return new JSONObject().toString();
        }
        return string;
    }

    public static List A0t(String str) {
        return Arrays.asList(str.split(","));
    }

    public static C85474Gj A0v(C85494Gl r1) {
        return (C85474Gj) r1.get(C85474Gj.A00);
    }

    public static void A12(Bitmap bitmap, OutputStream outputStream) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    }

    public static void A16(View view, AnonymousClass0UY r2, C05570Ua r3) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        r2.A02(r3);
    }

    public static void A17(View view, Object obj, int i) {
        view.setOnClickListener(new C109335eS(obj, i));
    }

    public static void A18(View view, Object obj, int i) {
        view.setOnClickListener(new C989553w(obj, i));
    }

    public static void A19(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C109485eh(obj, i, obj2));
    }

    public static void A1C(Statistics$Data statistics$Data) {
        statistics$Data.A0A = 0;
        statistics$Data.A0L = 0;
        statistics$Data.A02 = 0;
        statistics$Data.A0F = 0;
        statistics$Data.A06 = 0;
        statistics$Data.A0H = 0;
        statistics$Data.A09 = 0;
        statistics$Data.A0K = 0;
        statistics$Data.A05 = 0;
        statistics$Data.A04 = 0;
        statistics$Data.A01 = 0;
        statistics$Data.A0E = 0;
        statistics$Data.A03 = 0;
        statistics$Data.A0G = 0;
        statistics$Data.A08 = 0;
        statistics$Data.A0J = 0;
        statistics$Data.A0C = 0;
        statistics$Data.A0N = 0;
        statistics$Data.A0B = 0;
        statistics$Data.A0M = 0;
        statistics$Data.A00 = 0;
        statistics$Data.A0D = 0;
        statistics$Data.A07 = 0;
        statistics$Data.A0I = 0;
    }

    public static void A1E(AnonymousClass983 r2) {
        AnonymousClass0R8 supportActionBar = r2.A03.getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0J(r2.A01);
    }

    public static void A1F(File file, String str) {
        new File(file, str).delete();
    }

    public static void A1H(Object obj) {
        ((C130076bL) obj).A05((Object) null);
    }

    public static void A1I(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[28] = obj;
        objArr[29] = obj2;
        objArr[30] = obj3;
    }

    public static void A1K(Object obj, JSONObject jSONObject) {
        jSONObject.put("client_pub_key", obj);
        jSONObject.put("client_pub_key_type", "RSA 2048");
    }

    public static double A00(Cursor cursor, String str) {
        return cursor.getDouble(cursor.getColumnIndexOrThrow(str));
    }

    public static float A01(Context context) {
        return context.getResources().getDimension(R.dimen.f6nameremoved);
    }

    public static int A09(String str) {
        return str.hashCode() * 31;
    }

    public static long A0A(long j) {
        return SystemClock.uptimeMillis() - j;
    }

    public static SharedPreferences.Editor A0E(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str);
    }

    public static SharedPreferences A0F(AnonymousClass66R r0) {
        return (SharedPreferences) r0.getValue();
    }

    public static Drawable A0G(Context context, int i) {
        Drawable A00 = AnonymousClass0RP.A00(context, i);
        C626936e.A06(A00);
        return A00;
    }

    public static View A0I(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C162457s7.A0D(inflate);
        return inflate;
    }

    public static View A0J(AnonymousClass66R r0) {
        return ((AnonymousClass5UY) r0.getValue()).A04();
    }

    public static LinearLayout.LayoutParams A0K(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public static TextView A0L(C009707r r0, int i) {
        return (TextView) r0.findViewById(i);
    }

    public static C172878Nf A0M(AnonymousClass8OQ r0) {
        return r0.entrySet().iterator();
    }

    public static AnonymousClass3DY A0N(Hilt_WaDialogFragment hilt_WaDialogFragment) {
        return (AnonymousClass3DY) hilt_WaDialogFragment.generatedComponent();
    }

    public static AnonymousClass3DY A0O(Hilt_WDSBottomSheetDialogFragment hilt_WDSBottomSheetDialogFragment) {
        return (AnonymousClass3DY) hilt_WDSBottomSheetDialogFragment.generatedComponent();
    }

    public static AnonymousClass2UO A0Q(C183538qC r0) {
        return (AnonymousClass2UO) r0.get();
    }

    public static AnonymousClass3ZH A0R(Iterator it) {
        return (AnonymousClass3ZH) it.next();
    }

    public static UserJid A0T(Iterator it) {
        return (UserJid) it.next();
    }

    public static AnonymousClass1DR A0V(C130546c9 r1, C130546c9 r2) {
        r1.A07();
        AnonymousClass1DR r12 = (AnonymousClass1DR) r1.A00;
        C130786cX A06 = r2.A06();
        A06.getClass();
        r12.media_ = A06;
        return r12;
    }

    public static AnonymousClass1EM A0W(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EM) r0.A00;
    }

    public static AnonymousClass1ES A0X(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1ES) r0.A00;
    }

    public static AnonymousClass36K A0Y(Iterator it) {
        return (AnonymousClass36K) it.next();
    }

    public static File A0a(Uri uri) {
        return new File(uri.getPath());
    }

    public static InputStream A0b(C56492s4 r1, AnonymousClass4GL r2, Integer num, int i) {
        return r2.B47(r1, num, Integer.valueOf(i));
    }

    public static Class A0c(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        return obj.getClass();
    }

    public static IllegalArgumentException A0d(Object obj) {
        return new IllegalArgumentException(obj.toString());
    }

    public static Long A0g(Number number) {
        return Long.valueOf(number.longValue());
    }

    public static Object A0h(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static RuntimeException A0i(String str, Throwable th) {
        Log.e(str, th);
        return new RuntimeException(th);
    }

    public static String A0k(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        C626936e.A06(string);
        return string;
    }

    public static String A0l(Parcel parcel) {
        String readString = parcel.readString();
        C626936e.A06(readString);
        return readString;
    }

    public static String A0n(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0o(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0p(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" AND ");
        return " AND ";
    }

    public static String A0q(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static HashSet A0r(AbstractCollection abstractCollection) {
        return new HashSet(abstractCollection.size());
    }

    public static HashSet A0s(Map map) {
        return new HashSet(map.keySet());
    }

    public static void A0w(ContentValues contentValues, String str, String str2, String str3) {
        contentValues.putNull(str);
        contentValues.putNull(str2);
        contentValues.putNull(str3);
    }

    public static void A0x(Context context, Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(AnonymousClass0Y8.A04(context, i)));
    }

    public static void A0y(Context context, C111095hX r3, String str) {
        r3.BkW(context, Uri.parse(str), (C624134x) null);
    }

    public static void A0z(Intent intent, BaseBundle baseBundle, String str) {
        baseBundle.putString(str, intent.getStringExtra(str));
    }

    public static void A10(Intent intent, String str, int i) {
        intent.putExtra("source", i);
        intent.putExtra("session_id", str);
    }

    public static void A11(Intent intent, String str, String str2) {
        intent.putExtra("screen_name", str);
        intent.putExtra("screen_params", str2);
    }

    public static void A13(BaseBundle baseBundle, ImageView imageView, String str) {
        int i = baseBundle.getInt(str);
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
    }

    public static void A1A(C08310eF r0) {
        r0.A0R().finish();
    }

    public static void A1B(AnonymousClass0UY r1, Object obj, List list) {
        list.remove(obj);
        if (!r1.A0A()) {
            r1.A01();
        }
    }

    public static void A1D(Jid jid, Object[] objArr) {
        objArr[1] = jid.getRawString();
    }

    public static void A1G(CharSequence charSequence, Iterable iterable, StringBuilder sb) {
        sb.append(TextUtils.join(charSequence, iterable));
    }

    public static void A1J(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", timestamp=");
    }

    public static void A1M(String str, String str2, StringBuilder sb) {
        if (!TextUtils.isEmpty(str)) {
            sb.append(str2);
            sb.append(str);
        }
    }

    public static void A1N(String str, String str2, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("(");
    }

    public static void A1Q(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append(str);
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(it.next());
    }

    public static void A1S(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.readLock().unlock();
    }

    public static void A1T(Object[] objArr, byte b, int i) {
        objArr[i] = Byte.valueOf(b);
    }

    public static void A1U(Object[] objArr, int i) {
        objArr[5] = Integer.valueOf(i);
    }

    public static void A1V(Object[] objArr, int i) {
        objArr[7] = Integer.valueOf(i);
    }

    public static boolean A1X(Collection collection) {
        return !collection.isEmpty();
    }

    public static byte[] A1Y(Key key, AlgorithmParameterSpec algorithmParameterSpec, Cipher cipher, byte[] bArr, int i) {
        cipher.init(i, key, algorithmParameterSpec);
        return cipher.doFinal(bArr);
    }
}
