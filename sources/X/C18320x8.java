package X;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.base.Hilt_WaFragment;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public final class C18320x8 {
    public static int A01(Intent intent, String str) {
        return intent.getIntExtra(str, 0);
    }

    public static Boolean A0U() {
        return false;
    }

    public static String A0i(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static void A1H(Object obj, Object obj2, Object[] objArr) {
        objArr[5] = obj;
        objArr[6] = obj2;
    }

    public static void A1S(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "id_";
    }

    public static boolean A1V(Object obj) {
        C162457s7.A0J(obj, 2);
        return true;
    }

    public static long A05(Object obj) {
        return ((Long) obj).longValue();
    }

    public static long A06(String str, JSONObject jSONObject) {
        return jSONObject.optLong(str, 0);
    }

    public static Intent A07() {
        return new Intent();
    }

    public static Bundle A0A(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        return bundle;
    }

    public static C170218Ci A0B(C130786cX r1) {
        return new C170218Ci(r1);
    }

    public static ExpressionsSearchViewModel A0L(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        return (ExpressionsSearchViewModel) expressionsKeyboardSearchBottomSheet.A0J.getValue();
    }

    public static AnonymousClass1A1 A0Q() {
        return (AnonymousClass1A1) AnonymousClass1ET.DEFAULT_INSTANCE.A0G();
    }

    public static C86674La A0T(Context context, C08310eF r2) {
        return new C86674La(context, r2);
    }

    public static Boolean A0V(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static Integer A0W() {
        return 14;
    }

    public static Integer A0X() {
        return 26;
    }

    public static String A0b(Resources resources, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return resources.getString(i2, objArr);
    }

    public static String A0h(byte[] bArr) {
        return new String(bArr, C58152un.A0B);
    }

    public static StringBuilder A0j(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0k(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        return sb;
    }

    public static StringBuilder A0l(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        return sb;
    }

    public static UnsupportedOperationException A0m() {
        return new UnsupportedOperationException();
    }

    public static ArrayList A0o(Collection collection) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        return arrayList;
    }

    public static Iterator A0q(Object obj) {
        return ((List) obj).iterator();
    }

    public static LinkedHashMap A0r() {
        return new LinkedHashMap();
    }

    public static NoSuchElementException A0t() {
        return new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static Set A0u() {
        return Collections.synchronizedSet(new HashSet());
    }

    public static Cipher A0v() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    public static void A0x(BroadcastReceiver broadcastReceiver, Context context, String str, boolean z) {
        C154317cy.A01(broadcastReceiver, context, new IntentFilter(str), z);
    }

    public static void A10(Intent intent, String str, String str2) {
        intent.setComponent(new ComponentName(str, str2));
    }

    public static void A13(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass54D(obj, i));
    }

    public static void A14(View view, Object obj, int i) {
        view.setOnClickListener(new C109405eZ(obj, i));
    }

    public static void A15(View view, Object obj, int i) {
        view.setOnClickListener(new C109685f1(obj, i));
    }

    public static void A16(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass543(obj, i, obj2));
    }

    public static void A19(RecyclerView recyclerView, int i) {
        recyclerView.setLayoutManager(new LinearLayoutManager(i));
    }

    public static void A1C(AnonymousClass4EJ r1, String str) {
        r1.BSB(new IllegalStateException(str));
    }

    public static void A1K(StringBuilder sb) {
        sb.append(",");
    }

    public static boolean A1T(AnonymousClass5ZM r0) {
        return r0.A02.isCancelled();
    }

    public static byte[] A1X(long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return order.array();
    }

    public static byte[] A1Y(Bitmap bitmap, ByteArrayOutputStream byteArrayOutputStream) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] A1Z(Object obj, int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(obj, 0, bArr, 0, i);
        return bArr;
    }

    public static String[] A1b(String str) {
        return str.split(",");
    }

    public static int A00(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A02(Enum enumR, int i) {
        C162457s7.A0J(enumR, i);
        return enumR.ordinal();
    }

    public static long A03(Number number) {
        C162457s7.A0D(number);
        return number.longValue();
    }

    public static long A04(Number number) {
        C626936e.A06(number);
        return number.longValue();
    }

    public static SharedPreferences.Editor A08(AnonymousClass33p r0, String str, int i) {
        return r0.A0U().putInt(str, i);
    }

    public static Uri A09(Uri.Builder builder, String str, String str2) {
        return builder.appendPath(str).appendPath(str2).build();
    }

    public static C130786cX A0C(C130546c9 r0) {
        r0.A07();
        return r0.A00;
    }

    public static C188248ya A0D(C130546c9 r2, AnonymousClass1E1 r3) {
        r2.A07();
        C21351Bm r1 = (C21351Bm) r2.A00;
        r3.getClass();
        r1.currentSession_ = r3;
        r1.bitField0_ |= 1;
        r2.A07();
        C21351Bm r22 = (C21351Bm) r2.A00;
        C188248ya r12 = r22.previousSessions_;
        if (((AnonymousClass8T6) r12).A00) {
            return r12;
        }
        C188248ya A07 = C130786cX.A07(r12);
        r22.previousSessions_ = A07;
        return A07;
    }

    public static AnonymousClass3DY A0E(Hilt_WaFragment hilt_WaFragment) {
        return (AnonymousClass3DY) hilt_WaFragment.generatedComponent();
    }

    public static C89654ea A0F(Reference reference) {
        return (C89654ea) reference.get();
    }

    public static C60842zG A0G(Iterator it) {
        return (C60842zG) it.next();
    }

    public static C19340zH A0H(C08310eF r0) {
        return AnonymousClass5V0.A00(r0.A1D());
    }

    public static C56722sS A0I(C183538qC r0) {
        return (C56722sS) r0.get();
    }

    public static AnonymousClass33p A0J(C183538qC r0) {
        return (AnonymousClass33p) r0.get();
    }

    public static AnonymousClass33W A0K(Iterator it) {
        return (AnonymousClass33W) it.next();
    }

    public static AnonymousClass30P A0M(C183538qC r0) {
        return (AnonymousClass30P) r0.get();
    }

    public static C95814uZ A0N(Map.Entry entry) {
        return (C95814uZ) entry.getKey();
    }

    public static DeviceJid A0O(Jid jid) {
        DeviceJid of = DeviceJid.of(jid);
        C626936e.A06(of);
        return of;
    }

    public static UserJid A0P(Map.Entry entry) {
        return (UserJid) entry.getKey();
    }

    public static C624134x A0R(List list, int i) {
        return (C624134x) list.get(i);
    }

    public static C30471mV A0S(Iterator it) {
        return (C30471mV) it.next();
    }

    public static Long A0Y(TimeUnit timeUnit, long j) {
        return Long.valueOf(timeUnit.toSeconds(j));
    }

    public static Object A0Z(Map map, Object obj) {
        Object obj2 = map.get(obj);
        C626936e.A06(obj2);
        return obj2;
    }

    public static String A0a(Context context) {
        return context.getString(R.string.f11nameremoved);
    }

    public static String A0c(Cursor cursor, int i) {
        String string = cursor.getString(i);
        C162457s7.A0D(string);
        return string;
    }

    public static String A0d(C172548Lq r0, int i) {
        return Base64.encodeToString(r0.A07(), i);
    }

    public static String A0e(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A0f(String str, String str2) {
        return str2.substring(str.length());
    }

    public static String A0g(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        C162457s7.A0D(lowerCase);
        return lowerCase;
    }

    public static ArrayList A0n(AnonymousClass4GK r0) {
        r0.close();
        return new ArrayList();
    }

    public static HashSet A0p(List list) {
        return new HashSet(list.size());
    }

    public static List A0s(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static void A0w(AlertDialog alertDialog, Context context, int i) {
        alertDialog.setMessage(context.getString(i));
    }

    public static void A0y(Context context, C05610Ue r2) {
        r2.A00 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
    }

    public static void A0z(Context context, C05610Ue r1, int i) {
        r1.A0A(context.getString(i));
    }

    public static void A11(Resources resources, TextView textView, int i) {
        textView.setTextColor(resources.getColor(i));
    }

    public static void A12(Parcel parcel, Class cls, List list) {
        parcel.readList(list, cls.getClassLoader());
    }

    public static void A17(C05610Ue r0, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        r0.A0E(z);
        r0.A0B(charSequence);
        r0.A0A(charSequence2);
    }

    public static void A18(C06270Wx r1, boolean z) {
        r1.A0H(Boolean.valueOf(z));
    }

    public static void A1A(AnonymousClass0Q9 r1, C04770Qp r2) {
        r2.A00.A0B = r1.A00();
    }

    public static void A1B(C130546c9 r0, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A06());
    }

    public static void A1D(SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment) {
        C003203q A0Q;
        C003203q A0Q2 = sMSPreviewInviteBottomSheetFragment.A0Q();
        if (A0Q2 != null && !A0Q2.isFinishing() && (A0Q = sMSPreviewInviteBottomSheetFragment.A0Q()) != null && !A0Q.isDestroyed()) {
            String A0X = sMSPreviewInviteBottomSheetFragment.A0X(R.string.f11nameremoved);
            C162457s7.A0D(A0X);
            sMSPreviewInviteBottomSheetFragment.A1Y(A0X);
        }
    }

    public static void A1E(Object obj) {
        C162457s7.A0H(obj);
        C162457s7.A0J(obj, 1);
    }

    public static void A1F(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(Pair.create(obj, obj2));
    }

    public static void A1G(Object obj, Object obj2, AbstractMap abstractMap) {
        if (!abstractMap.containsKey(obj)) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A1I(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(String.valueOf(obj));
    }

    public static void A1J(String str, Locale locale, Object[] objArr) {
        Log.i(String.format(locale, str, objArr));
    }

    public static void A1L(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" ORDER BY ");
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('\'');
    }

    public static void A1N(StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
    }

    public static void A1O(StringBuilder sb, CopyOnWriteArrayList copyOnWriteArrayList) {
        sb.append(copyOnWriteArrayList.size());
    }

    public static void A1P(StringBuilder sb, Object[] objArr) {
        sb.append(Arrays.toString(objArr));
    }

    public static void A1Q(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.toString(i);
    }

    public static void A1R(Object[] objArr, long j) {
        objArr[5] = Long.valueOf(j);
    }

    public static boolean A1U(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static boolean A1W(Object obj, boolean z) {
        return obj.equals(Boolean.valueOf(z));
    }

    public static byte[] A1a(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        C162457s7.A0D(bytes);
        return bytes;
    }
}
