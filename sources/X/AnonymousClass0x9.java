package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.Spanned;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.wamsys.JniBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0x9  reason: invalid class name */
public final class AnonymousClass0x9 {
    public static int A00(int i) {
        return i != 0 ? 4 : 0;
    }

    public static Spanned A0B(String str) {
        return C107575bX.A02(str, new Object[0]);
    }

    public static C172548Lq A0J(byte[] bArr) {
        return C172548Lq.A02(bArr, 0, bArr.length);
    }

    public static AnonymousClass5ZC A0T(int i, int i2, int i3) {
        return new AnonymousClass5ZC(i, i2, i3, false);
    }

    public static Long A0m(int i) {
        return Long.valueOf((long) i);
    }

    public static Long A0n(long j, long j2) {
        return Long.valueOf(j + j2);
    }

    public static Long A0o(long j, long j2) {
        return Long.valueOf(j / j2);
    }

    public static Object A0t(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static Object A0u(List list) {
        return list.get(1);
    }

    public static void A1M(StringBuilder sb, long j, long j2) {
        sb.append(j / j2);
    }

    public static boolean A1N(Intent intent, String str) {
        return intent.getBooleanExtra(str, false);
    }

    public static AnonymousClass39V[] A1V() {
        return new AnonymousClass39V[1];
    }

    public static AnonymousClass39V[] A1W() {
        return new AnonymousClass39V[4];
    }

    public static Object[] A1X() {
        return new Object[3];
    }

    public static String[] A1Y() {
        return new String[1];
    }

    public static String[] A1Z() {
        return new String[2];
    }

    public static String[] A1a() {
        return new String[3];
    }

    public static int A01(Cursor cursor) {
        return cursor.getColumnIndexOrThrow("jid");
    }

    public static int A04(boolean z) {
        int i = 1237;
        if (z) {
            i = 1231;
        }
        return i * 31;
    }

    public static ContentValues A06() {
        return new ContentValues();
    }

    public static ContentValues A07(int i) {
        return new ContentValues(i);
    }

    public static Intent A08(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static Intent A09(String str) {
        return new Intent(str);
    }

    public static Pair A0C(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static AnonymousClass0PJ A0G(Object obj, Object obj2) {
        return new AnonymousClass0PJ(obj, obj2);
    }

    public static AnonymousClass0XL A0H(C15940sD r1) {
        return new AnonymousClass0XL(r1);
    }

    public static AvatarExpressionsViewModel A0O(AvatarExpressionsFragment avatarExpressionsFragment) {
        return (AvatarExpressionsViewModel) avatarExpressionsFragment.A0M.getValue();
    }

    public static AnonymousClass5ZC A0U(int i, boolean z) {
        return new AnonymousClass5ZC(i, i, i, z);
    }

    public static AnonymousClass1EK A0V(AnonymousClass1EI r0) {
        AnonymousClass1EK r02 = r0.hydratedTemplate_;
        if (r02 == null) {
            return AnonymousClass1EK.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass39W A0Y(Object obj) {
        return ((AnonymousClass4DV) obj).B5s();
    }

    public static AnonymousClass4UC A0b() {
        return new AnonymousClass4UC();
    }

    public static ByteArrayInputStream A0d(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static ByteArrayOutputStream A0e() {
        return new ByteArrayOutputStream();
    }

    public static FileInputStream A0g(File file) {
        return new FileInputStream(file);
    }

    public static FileOutputStream A0h(File file) {
        return new FileOutputStream(file);
    }

    public static AssertionError A0i(Object obj) {
        return new AssertionError(obj);
    }

    public static Integer A0j() {
        return 15;
    }

    public static Integer A0k(int i) {
        return new Integer(i);
    }

    public static Object A0r(JniBridge jniBridge) {
        return jniBridge.wajContext.get();
    }

    public static String A0v(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, "");
    }

    public static String A0w(Me me) {
        return C106675Zy.A01(me.cc, me.number);
    }

    public static String A0z(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static WeakReference A14(Object obj) {
        return new WeakReference(obj);
    }

    public static HashSet A15(Collection collection) {
        return new HashSet(collection);
    }

    public static LinkedHashSet A17() {
        return new LinkedHashSet();
    }

    public static LinkedList A18() {
        return new LinkedList();
    }

    public static List A19(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return AnonymousClass8UF.A0o(objArr);
    }

    public static List A1A(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.asList(objArr);
    }

    public static Random A1C() {
        return new Random();
    }

    public static ConcurrentHashMap A1D() {
        return new ConcurrentHashMap();
    }

    public static AnonymousClass8PJ A1E(Class cls) {
        return new AnonymousClass8PJ(cls);
    }

    public static JSONArray A1F() {
        return new JSONArray();
    }

    public static JSONObject A1G() {
        return new JSONObject();
    }

    public static JSONObject A1H(String str) {
        return new JSONObject(str);
    }

    public static void A1I(C06270Wx r1) {
        r1.A0G(Boolean.FALSE);
    }

    public static void A1J(C89704el r4) {
        AnonymousClass5UF r1 = new AnonymousClass5UF(r4);
        r1.A01 = R.drawable.permission_cam;
        r1.A02 = R.string.f11nameremoved;
        r1.A03 = R.string.f11nameremoved;
        r1.A0D = new String[]{"android.permission.CAMERA"};
        r4.startActivityForResult(r1.A02(), 1);
    }

    public static void A1K(Object obj) {
        ((Runnable) obj).run();
    }

    public static boolean A1Q(Object obj) {
        return C162457s7.A0P(obj, Boolean.TRUE);
    }

    public static int[] A1T(int[] iArr, Object[] objArr, int i, int i2, int i3) {
        iArr[i2] = i;
        objArr[i2] = iArr;
        return new int[i3];
    }

    public static int[] A1U(int[] iArr, Object[] objArr, int i, int i2, int i3) {
        iArr[i2] = i;
        objArr[i3] = iArr;
        return new int[i3];
    }

    public static String[] A1b() {
        return new String[]{"from"};
    }

    public static int A02(Cursor cursor, String str, StringBuilder sb) {
        sb.append(str);
        return cursor.getCount();
    }

    public static int A03(AbstractCollection abstractCollection, int i) {
        return abstractCollection.size() - i;
    }

    public static long A05(long j) {
        return System.currentTimeMillis() - j;
    }

    public static Handler A0A(AnonymousClass66R r0) {
        return (Handler) r0.getValue();
    }

    public static Pair A0D(Iterator it) {
        return (Pair) it.next();
    }

    public static ImageView A0E(View view, int i) {
        return (ImageView) C06560Yg.A02(view, i);
    }

    public static ImageView A0F(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static C01460Ay A0I(C04770Qp r0) {
        return (C01460Ay) r0.A00();
    }

    public static AnonymousClass3DZ A0K(AnonymousClass4SG r0) {
        return (AnonymousClass3DZ) r0.generatedComponent();
    }

    public static WaImageView A0L(View view, int i) {
        return (WaImageView) C06560Yg.A02(view, i);
    }

    public static C66543Lv A0M(C183538qC r0) {
        return (C66543Lv) r0.get();
    }

    public static C56412rw A0N(C183538qC r0) {
        return (C56412rw) r0.get();
    }

    public static AnonymousClass2O4 A0P(AbstractList abstractList, int i) {
        return (AnonymousClass2O4) abstractList.get(i);
    }

    public static DeviceJid A0Q(Map.Entry entry) {
        return (DeviceJid) entry.getKey();
    }

    public static Jid A0R(Map.Entry entry) {
        return (Jid) entry.getKey();
    }

    public static C66523Lt A0S(C183538qC r0) {
        return (C66523Lt) r0.get();
    }

    public static AnonymousClass1EU A0W(C130546c9 r0) {
        return (AnonymousClass1EU) r0.A06();
    }

    public static AnonymousClass1A1 A0X(C130786cX r0) {
        return (AnonymousClass1A1) r0.A0H();
    }

    public static C60142y4 A0Z(Iterator it) {
        return (C60142y4) it.next();
    }

    public static C27841el A0a(C183538qC r0) {
        return (C27841el) r0.get();
    }

    public static C614430u A0c(C183538qC r0) {
        return (C614430u) r0.get();
    }

    public static File A0f(Iterator it) {
        return (File) it.next();
    }

    public static Integer A0l(List list) {
        return Integer.valueOf(list.size());
    }

    public static Number A0p(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static Number A0q(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static Object A0s(Object obj, String str, Map map) {
        Object obj2 = map.get(obj);
        C162457s7.A0K(obj2, str);
        return obj2;
    }

    public static String A0x(SendE2EMessageJob sendE2EMessageJob, String str, StringBuilder sb) {
        sb.append(str);
        return sendE2EMessageJob.A08();
    }

    public static String A0y(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static String A10(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" FROM ");
        return " FROM ";
    }

    public static String A11(String str, StringBuilder sb, long j) {
        sb.append(str);
        return C107175ap.A03(j);
    }

    public static String A12(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static String A13(AnonymousClass66R r0) {
        return (String) r0.getValue();
    }

    public static Iterator A16(Map map) {
        return map.entrySet().iterator();
    }

    public static Map A1B(Object obj, Map map) {
        return (Map) map.get(obj);
    }

    public static void A1L(Object obj) {
        C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
    }

    public static boolean A1O(Uri uri, String str) {
        return str.equals(uri.getHost());
    }

    public static boolean A1P(DeviceJid deviceJid) {
        return !deviceJid.isPrimary();
    }

    public static byte[] A1R(Object obj) {
        return obj.toString().getBytes();
    }

    public static byte[] A1S(String str, JSONObject jSONObject, int i) {
        return Base64.decode(jSONObject.getString(str), i);
    }
}
