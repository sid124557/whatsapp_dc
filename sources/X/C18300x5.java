package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.JsonReader;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.wamsys.JniBridge;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.0x5  reason: invalid class name and case insensitive filesystem */
public final class C18300x5 {
    public static int A02(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return 0;
        }
        return 3;
    }

    public static ContentValues A06() {
        return new ContentValues(4);
    }

    public static View A0F(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C162457s7.A0H(inflate);
        return inflate;
    }

    public static C172548Lq A0J(C130546c9 r1, byte[] bArr, int i) {
        C172548Lq A02 = C172548Lq.A02(bArr, 0, i);
        r1.A07();
        return A02;
    }

    public static String A0h(AnonymousClass5ZU r1, AnonymousClass3ZH r2) {
        return r1.A0P(r2, -1);
    }

    public static String A0j(AnonymousClass1C7 r2) {
        return ((AnonymousClass1BH) r2.buttons_.get(0)).buttonParamsJson_;
    }

    public static ArrayList A0r(Object obj) {
        C162457s7.A0J(obj, 0);
        return new ArrayList();
    }

    public static void A16(Handler handler, Object obj, int i, int i2) {
        Message.obtain(handler, i, i2, 0, obj).sendToTarget();
    }

    public static void A17(View view, AnonymousClass0UY r2, C05570Ua r3) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        r2.A02(r3);
    }

    public static void A1G(AnonymousClass4AF r1, Object obj, int i) {
        r1.Blk(obj, i, 0);
        r1.Blk(obj, i, 1);
    }

    public static void A1I(Object obj) {
        C162457s7.A0J(obj, 0);
    }

    public static void A1K(Object obj, Object obj2, Object[] objArr) {
        objArr[1] = obj;
        objArr[2] = obj2;
    }

    public static void A1N(String str, Object[] objArr) {
        C626936e.A0D(false, String.format(str, objArr));
    }

    public static void A1Q(Object[] objArr) {
        objArr[1] = "url_";
        objArr[2] = "fileSha256_";
        objArr[3] = "fileEncSha256_";
        objArr[4] = "mediaKey_";
        objArr[5] = "mimetype_";
        objArr[6] = "height_";
        objArr[7] = "width_";
        objArr[8] = "directPath_";
        objArr[9] = "fileLength_";
    }

    public static boolean A1W(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static String[] A1b(AbstractCollection abstractCollection) {
        return (String[]) abstractCollection.toArray(new String[0]);
    }

    public static Intent A07(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.HomeActivity");
    }

    public static Uri.Builder A0C() {
        return new Uri.Builder().scheme("https");
    }

    public static JsonReader A0D(InputStream inputStream) {
        return new JsonReader(new InputStreamReader(inputStream));
    }

    public static NativeHolder A0I(JniBridge jniBridge) {
        return (NativeHolder) jniBridge.wajContext.get();
    }

    public static StickerExpressionsViewModel A0N(StickerExpressionsFragment stickerExpressionsFragment) {
        return (StickerExpressionsViewModel) stickerExpressionsFragment.A0F.getValue();
    }

    public static SearchFunStickersViewModel A0O(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        return (SearchFunStickersViewModel) searchFunStickersBottomSheet.A0W.getValue();
    }

    public static AnonymousClass1A4 A0R() {
        return (AnonymousClass1A4) AnonymousClass1EU.DEFAULT_INSTANCE.A0G();
    }

    public static ErrorDialogFragment A0U(int i) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_ERROR_CODE", i);
        errorDialogFragment.A0u(bundle);
        return errorDialogFragment;
    }

    public static StringWriter A0W(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter;
    }

    public static IllegalArgumentException A0X() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static Integer A0Y() {
        return 9;
    }

    public static Integer A0Z() {
        return 11;
    }

    public static String A0e(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        String string = context.getString(i2, objArr);
        C162457s7.A0D(string);
        return string;
    }

    public static StringBuilder A0n(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected error code: ");
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0o(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("axolotl deleted ");
        sb.append(j);
        return sb;
    }

    public static StringBuilder A0p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(str);
        sb.append(" SET ");
        return sb;
    }

    public static URLConnection A0q(String str) {
        return new URL(str).openConnection();
    }

    public static ArrayList A0s(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static HashSet A0x(Object obj) {
        HashSet hashSet = new HashSet();
        hashSet.add(obj);
        return hashSet;
    }

    public static SecretKeySpec A0y(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static void A18(View view, Object obj, int i) {
        view.setOnClickListener(new C109305eP(obj, i));
    }

    public static void A19(View view, Object obj, int i) {
        view.setOnClickListener(new C109375eW(obj, i));
    }

    public static void A1B(C08310eF r1, C08270df r2, String str) {
        C08240dc r0 = new C08240dc(r2);
        r0.A0C(r1, str);
        r0.A02();
    }

    public static void A1F(AnonymousClass4EJ r1, String str) {
        r1.BSB(new IllegalArgumentException(str));
    }

    public static void A1H(AnonymousClass5UY r1) {
        if (r1 != null) {
            r1.A06(8);
        }
    }

    public static void A1M(Object obj, AbstractCollection abstractCollection, AbstractCollection abstractCollection2, int i) {
        if (i != 0) {
            abstractCollection.add(obj);
        } else {
            abstractCollection2.add(obj);
        }
    }

    public static boolean A1S(AnonymousClass5UP r1) {
        return r1.A04(3877);
    }

    public static boolean A1V(File file, String str) {
        return new File(file, str).exists();
    }

    public static AnonymousClass39V[] A1Z(AbstractCollection abstractCollection, int i) {
        return (AnonymousClass39V[]) abstractCollection.toArray(new AnonymousClass39V[i]);
    }

    public static String[] A1a(Object obj, int i) {
        String[] strArr = new String[i];
        strArr[0] = obj;
        return strArr;
    }

    public static byte A00(Iterator it) {
        return ((Number) it.next()).byteValue();
    }

    public static char A01(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\'');
        return '\'';
    }

    public static int A03(Context context, int i, int i2) {
        return AnonymousClass0Y8.A04(context, AnonymousClass5Yj.A02(context, i, i2));
    }

    public static int A04(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A05(Object obj, Object obj2, int i) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 2);
        return 2;
    }

    public static Intent A08(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static SharedPreferences.Editor A09(AnonymousClass33p r0, String str) {
        return r0.A0U().remove(str);
    }

    public static SharedPreferences.Editor A0A(C183538qC r0) {
        return ((AnonymousClass33p) r0.get()).A0U();
    }

    public static SharedPreferences A0B(C183538qC r0) {
        return (SharedPreferences) r0.get();
    }

    public static Pair A0E(Object obj, int i) {
        return Pair.create(obj, Integer.valueOf(i));
    }

    public static TextView A0G(View view, int i) {
        return (TextView) C06560Yg.A02(view, i);
    }

    public static AnonymousClass043 A0H(AnonymousClass0Uj r0) {
        AnonymousClass043 create = r0.create();
        C162457s7.A0D(create);
        return create;
    }

    public static C130546c9 A0K(C130786cX r0) {
        C130546c9 A0G = r0.A0G();
        A0G.A07();
        return A0G;
    }

    public static C19340zH A0L(C08310eF r0) {
        return AnonymousClass5V0.A00(r0.A0Q());
    }

    public static C19340zH A0M(C08310eF r0) {
        return AnonymousClass5V0.A00(r0.A0R());
    }

    public static C95814uZ A0P(Iterator it) {
        return (C95814uZ) it.next();
    }

    public static AnonymousClass1EF A0Q(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EF) r0.A00;
    }

    public static AnonymousClass1EA A0S(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EA) r0.A00;
    }

    public static C624134x A0T(Iterator it) {
        return (C624134x) it.next();
    }

    public static AnonymousClass5OE A0V(AnonymousClass66R r1) {
        return ((SettingsPasskeysViewModel) r1.getValue()).A03.B06(2);
    }

    public static Integer A0a(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }

    public static Object A0b(C183538qC r0) {
        Object obj = r0.get();
        C162457s7.A0D(obj);
        return obj;
    }

    public static Object A0c(List list) {
        return list.get(list.size() - 1);
    }

    public static Object A0d(AnonymousClass66R r0) {
        Object value = r0.getValue();
        C162457s7.A0D(value);
        return value;
    }

    public static String A0f(Uri.Builder builder) {
        return builder.build().toString();
    }

    public static String A0g(C130546c9 r1, Jid jid) {
        String rawString = jid.getRawString();
        r1.A07();
        return rawString;
    }

    public static String A0i(Jid jid) {
        C626936e.A06(jid);
        return jid.getRawString();
    }

    public static String A0k(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        return obj.toString();
    }

    public static String A0l(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        C162457s7.A0D(optString);
        return optString;
    }

    public static String A0m(StringBuilder sb, boolean z) {
        sb.append(z);
        return sb.toString();
    }

    public static ArrayList A0t(Object obj) {
        C162457s7.A0D(obj);
        return new ArrayList();
    }

    public static ArrayList A0u(Collection collection) {
        return new ArrayList(collection.size());
    }

    public static ArrayList A0v(Map map) {
        return new ArrayList(map.values());
    }

    public static Collection A0w(AnonymousClass66R r0) {
        return ((Map) r0.getValue()).values();
    }

    public static JSONObject A0z(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return new JSONObject();
    }

    public static JSONObject A10(String str, JSONObject jSONObject) {
        return new JSONObject(jSONObject.getString(str));
    }

    public static void A11() {
        Thread.currentThread().interrupt();
    }

    public static void A12(ContentValues contentValues, String str, double d) {
        contentValues.put(str, Double.valueOf(d));
    }

    public static void A13(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A14(Context context, C05610Ue r1, int i) {
        r1.A0B(context.getString(i));
    }

    public static void A15(SharedPreferences.Editor editor, String str, Set set) {
        editor.putStringSet(str, set).apply();
    }

    public static void A1A(C08310eF r0) {
        C003203q A0Q = r0.A0Q();
        if (A0Q != null) {
            A0Q.finish();
        }
    }

    public static void A1C(C107695bk r0, WaDialogFragment waDialogFragment) {
        waDialogFragment.A03 = r0.ANI();
    }

    public static void A1D(C107695bk r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        AnonymousClass75R.A00(r0.ANI(), wDSBottomSheetDialogFragment);
    }

    public static void A1E(AnonymousClass5ZU r0, AnonymousClass3ZH r1, Object[] objArr, int i) {
        objArr[i] = r0.A0H(r1);
    }

    public static void A1J(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 9);
    }

    public static void A1L(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj.toString());
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" = ");
    }

    public static void A1P(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" ON ");
    }

    public static void A1R(Object[] objArr, long j) {
        objArr[4] = Long.valueOf(j);
    }

    public static boolean A1T(C624134x r0) {
        return !C107575bX.A0F(AnonymousClass36V.A04(r0));
    }

    public static boolean A1U(C183538qC r2) {
        ((C66523Lt) r2.get()).A0F(false, 16);
        return false;
    }

    public static boolean A1X(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static boolean A1Y(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
        return false;
    }
}
