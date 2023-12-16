package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.voipcalling.Voip;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0x7  reason: invalid class name */
public final class AnonymousClass0x7 {
    public static int A07(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static long A0D(int i) {
        return ((long) i) * 86400000;
    }

    public static Message A0G(int i) {
        return Message.obtain((Handler) null, 0, i, 0);
    }

    public static AnonymousClass4AA A0P(AvatarStickersCategoriesView avatarStickersCategoriesView) {
        C162457s7.A0J(avatarStickersCategoriesView, 0);
        return avatarStickersCategoriesView.A00;
    }

    public static Integer A0f() {
        return -1;
    }

    public static Integer A0g() {
        return 7;
    }

    public static String A0m(C08310eF r1, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        return r1.A0Y(i, objArr);
    }

    public static String A0r(String str, int i) {
        return str.substring(0, i);
    }

    public static void A19(C83904Ag r2, Object obj, int i) {
        r2.Bfr(Message.obtain((Handler) null, 0, i, 0, obj));
    }

    public static void A1B(AnonymousClass5ZM r1, AnonymousClass4FS r2) {
        r2.BkL(r1, new Void[0]);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1N(int[] r4, java.lang.Object[] r5, int r6) {
        /*
            r3 = 0
            r2 = 1
            r4[r3] = r6
            r0 = 25
            r5[r0] = r4
            int[] r1 = new int[r2]
            r0 = 128159(0x1f49f, float:1.79589E-40)
            r1[r3] = r0
            r0 = 26
            r5[r0] = r1
            int[] r1 = new int[r2]
            r0 = 128571(0x1f63b, float:1.80166E-40)
            r1[r3] = r0
            r0 = 27
            r5[r0] = r1
            int[] r1 = new int[r2]
            r0 = 128573(0x1f63d, float:1.80169E-40)
            r1[r3] = r0
            r0 = 28
            r5[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0x7.A1N(int[], java.lang.Object[], int):void");
    }

    public static void A1O(Object[] objArr) {
        objArr[1] = "url_";
        objArr[2] = "mimetype_";
    }

    public static boolean A1P(int i) {
        return i <= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = ((X.C30471mV) r3).A1w();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1Q(int r2, java.lang.Object r3) {
        /*
            r1 = 0
            if (r2 == 0) goto L_0x0013
            X.1mV r3 = (X.C30471mV) r3
            java.lang.String r0 = r3.A1w()
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0013
            r0 = 1
            return r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0x7.A1Q(int, java.lang.Object):boolean");
    }

    public static boolean A1T(Collection collection) {
        C162457s7.A0J(collection, 0);
        return collection.isEmpty();
    }

    public static byte[] A1X(String str) {
        return Base64.decode(str, 2);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A1Y(java.lang.Object[] r6) {
        /*
            r5 = 1
            r4 = 0
            r3 = 2
            r2 = 3
            int[] r1 = new int[r5]
            r0 = 127926(0x1f3b6, float:1.79263E-40)
            r1[r4] = r0
            r6[r4] = r1
            int[] r1 = new int[r5]
            r0 = 127925(0x1f3b5, float:1.79261E-40)
            r1[r4] = r0
            r6[r5] = r1
            int[] r1 = new int[r5]
            r0 = 128131(0x1f483, float:1.7955E-40)
            r1[r4] = r0
            r6[r3] = r1
            int[] r1 = new int[r5]
            r0 = 128378(0x1f57a, float:1.79896E-40)
            r1[r4] = r0
            r6[r2] = r1
            int[] r1 = new int[r5]
            r0 = 128526(0x1f60e, float:1.80103E-40)
            r1[r4] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0x7.A1Y(java.lang.Object[]):int[]");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A1Z(java.lang.Object[] r6) {
        /*
            r5 = 1
            r4 = 0
            r3 = 2
            r2 = 3
            int[] r1 = new int[r5]
            r0 = 128512(0x1f600, float:1.80084E-40)
            r1[r4] = r0
            r6[r4] = r1
            int[] r1 = new int[r5]
            r0 = 128515(0x1f603, float:1.80088E-40)
            r1[r4] = r0
            r6[r5] = r1
            int[] r1 = new int[r5]
            r0 = 128516(0x1f604, float:1.80089E-40)
            r1[r4] = r0
            r6[r3] = r1
            int[] r1 = new int[r5]
            r0 = 128513(0x1f601, float:1.80085E-40)
            r1[r4] = r0
            r6[r2] = r1
            int[] r1 = new int[r5]
            r0 = 128518(0x1f606, float:1.80092E-40)
            r1[r4] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0x7.A1Z(java.lang.Object[]):int[]");
    }

    public static String[] A1a(Object obj, int i) {
        String[] strArr = new String[2];
        strArr[i] = obj;
        return strArr;
    }

    public static String[] A1b(Collection collection) {
        return (String[]) collection.toArray(new String[0]);
    }

    public static int A00(int i, boolean z) {
        int i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return i + i2;
    }

    public static int A02(Cursor cursor) {
        return cursor.getColumnIndexOrThrow("_id");
    }

    public static int A03(C66493Lq r2, Object obj) {
        Integer A00;
        if (!(obj instanceof GroupJid) || (A00 = r2.A0G.A00((GroupJid) obj)) == null) {
            return 0;
        }
        return A00.intValue();
    }

    public static int A05(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static long A0B() {
        return TimeUnit.DAYS.toMillis(1);
    }

    public static long A0C() {
        return TimeUnit.DAYS.toMillis(7);
    }

    public static Bundle A0F(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static SpannableStringBuilder A0H(Context context, Drawable drawable, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        drawable.setColorFilter(context.getResources().getColor(i2), PorterDuff.Mode.SRC_ATOP);
        spannableStringBuilder.setSpan(new C87034Mv(drawable), 0, 1, 33);
        return spannableStringBuilder;
    }

    public static C26451c9 A0Q(Object obj) {
        C26451c9 r1 = (C26451c9) obj;
        C162457s7.A0J(r1, 0);
        return r1;
    }

    public static AnonymousClass1ED A0X(C130546c9 r0) {
        AnonymousClass1ED r02 = ((AnonymousClass1EU) r0.A00).videoMessage_;
        if (r02 == null) {
            return AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass1A0 A0Z() {
        return (AnonymousClass1A0) AnonymousClass1E2.DEFAULT_INSTANCE.A0G();
    }

    public static C108895dj A0a(C182518oY r3, Class cls, Object obj, String str) {
        return new C108895dj(new C166557yt(r3, cls, obj, str), 2);
    }

    public static BufferedInputStream A0c(File file) {
        return new BufferedInputStream(new FileInputStream(file));
    }

    public static BufferedOutputStream A0d(File file) {
        return new BufferedOutputStream(new FileOutputStream(file));
    }

    public static File A0e(File file, String str) {
        File file2 = new File(file, str);
        file2.mkdirs();
        return file2;
    }

    public static Integer A0h() {
        return 10;
    }

    public static Long A0i() {
        return 100L;
    }

    public static String A0n(C08310eF r0, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return r0.A0Y(i2, objArr);
    }

    public static String A0q(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static String A0s(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static MessageDigest A0t() {
        return MessageDigest.getInstance("SHA-256");
    }

    public static SimpleDateFormat A0u(String str) {
        return new SimpleDateFormat(str, Locale.US);
    }

    public static Map A0y() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static JSONObject A11() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        return jSONObject;
    }

    public static JSONObject A12(String str, byte[] bArr) {
        return new JSONObject(new String(bArr, str));
    }

    public static void A18(C06270Wx r1) {
        r1.A0G(Boolean.TRUE);
    }

    public static int A01(long j) {
        return (int) ((1073741823 & j) >> 0);
    }

    public static int A04(Number number, Object obj) {
        C162457s7.A0H(obj);
        C162457s7.A0H(number);
        return number.intValue();
    }

    public static int A06(String str) {
        C162457s7.A0H(str);
        return str.length();
    }

    public static int A08(String str, int i) {
        return i + str.hashCode();
    }

    public static int A09(String str, StringBuilder sb, int i) {
        sb.append(str.charAt(i));
        sb.append('.');
        return i + 1;
    }

    public static int A0A(String str, StringBuilder sb, AbstractMap abstractMap) {
        sb.append(str);
        return abstractMap.size();
    }

    public static long A0E(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static C88864av A0I(C87094Nz r0) {
        return (C88864av) ((C111685iW) r0.generatedComponent());
    }

    public static C131666dx A0J(Context context, C620733j r2, int i) {
        return new C131666dx(AnonymousClass0RP.A00(context, i), r2);
    }

    public static TextEmojiLabel A0K(View view, int i) {
        return (TextEmojiLabel) C06560Yg.A02(view, i);
    }

    public static WaTextView A0L(View view, int i) {
        return (WaTextView) C06560Yg.A02(view, i);
    }

    public static C160617ny A0M(C160617ny r1, String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C160617ny(str);
        }
        return r1;
    }

    public static C625835r A0N(AnonymousClass0N6 r0) {
        return ((C10170hV) r0.A00()).A09;
    }

    public static C52882mC A0O(Iterator it) {
        return (C52882mC) it.next();
    }

    public static DeviceJid A0R(Iterator it) {
        return (DeviceJid) it.next();
    }

    public static Jid A0S(Iterator it) {
        return (Jid) it.next();
    }

    public static C21801Df A0T(C130546c9 r0) {
        r0.A07();
        return (C21801Df) r0.A00;
    }

    public static AnonymousClass1EC A0U(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EC) r0.A00;
    }

    public static AnonymousClass1EE A0V(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EE) r0.A00;
    }

    public static C21841Dj A0W(C130546c9 r0, Object obj) {
        r0.A07();
        C21841Dj r02 = (C21841Dj) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass1E8 A0Y(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1E8) r0.A00;
    }

    public static AnonymousClass39M A0b(Iterator it) {
        return (AnonymousClass39M) it.next();
    }

    public static Long A0j(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static Object A0k(Map.Entry entry, Map map) {
        return map.get(entry.getKey());
    }

    public static String A0l(Activity activity) {
        return activity.getIntent().getStringExtra("jid");
    }

    public static String A0o(File file, String str, StringBuilder sb) {
        sb.append(str);
        return file.getAbsolutePath();
    }

    public static String A0p(File file, String str, StringBuilder sb) {
        sb.append(str);
        return file.getName();
    }

    public static Collection A0v(String str, String str2, CertificateFactory certificateFactory) {
        return certificateFactory.generateCertificates(new ByteArrayInputStream(str.getBytes(str2)));
    }

    public static Iterator A0w(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator A0x(List list) {
        return Collections.unmodifiableList(list).iterator();
    }

    public static Map A0z(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        return (Map) obj2;
    }

    public static Map A10(AnonymousClass66R r0) {
        return (Map) r0.getValue();
    }

    public static JSONObject A13(JSONArray jSONArray, int i) {
        Object obj = jSONArray.get(i);
        C162457s7.A0K(obj, "null cannot be cast to non-null type org.json.JSONObject");
        return (JSONObject) obj;
    }

    public static void A14(Context context, ImageView imageView) {
        C107335b8.A0E(imageView, C107405bG.A00(context, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public static void A15(Drawable drawable, TextView textView, CharSequence charSequence) {
        textView.setText(C87044Mw.A01(textView.getPaint(), drawable, charSequence));
    }

    public static void A16(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A17(C05610Ue r2) {
        r2.A05(System.currentTimeMillis());
        r2.A02(3);
    }

    public static void A1A(C50412i8 r1, String str) {
        if (!TextUtils.isEmpty(str)) {
            r1.A02("error", str);
        }
    }

    public static void A1C(OutputStream outputStream, String str, String str2) {
        outputStream.write(str.getBytes(str2));
    }

    public static void A1D(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj.toString());
    }

    public static void A1E(Object obj, Object[] objArr, int i) {
        objArr[i] = obj.toString();
    }

    public static void A1F(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append("/");
    }

    public static void A1G(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append("; id=");
    }

    public static void A1H(StringBuilder sb, Map map) {
        sb.append(map.size());
    }

    public static void A1I(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(String.valueOf(i));
    }

    public static void A1J(AbstractCollection abstractCollection, Map.Entry entry) {
        abstractCollection.add(entry.getKey());
    }

    public static void A1K(AbstractMap abstractMap, int i) {
        abstractMap.remove(Integer.valueOf(i));
    }

    public static void A1L(Iterator it, JSONArray jSONArray) {
        jSONArray.put(it.next());
    }

    public static void A1M(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static boolean A1R(String str) {
        return str.equals(Voip.getCurrentCallId());
    }

    public static boolean A1S(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }

    public static boolean A1U(List list, int i) {
        return list.contains(Integer.valueOf(i));
    }

    public static boolean A1V(Map map, int i) {
        return map.containsKey(Integer.valueOf(i));
    }

    public static boolean A1W(Object[] objArr, long j) {
        objArr[0] = String.valueOf(j);
        return false;
    }
}
