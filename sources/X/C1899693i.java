package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.Parcelable;
import android.security.KeyPairGeneratorSpec;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Range;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.security.auth.x500.X500Principal;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.93i  reason: invalid class name and case insensitive filesystem */
public final class C1899693i {
    public static Range A05(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i != 0) {
            return Range.create(Integer.valueOf(i2 / 1000), Integer.valueOf(iArr[1] / 1000));
        }
        return Range.create(Integer.valueOf(i2), Integer.valueOf(iArr[1]));
    }

    public static AnonymousClass303 A0Q(C134246ig r2, String str, Object[] objArr) {
        r2.A0a = String.format("%s.%s", objArr);
        AnonymousClass303 r1 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r1.A03("section", str);
        return r1;
    }

    public static short A0g(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 0;
    }

    public static short A0h(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 1;
    }

    public static short A0i(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 2;
    }

    public static void A0p(C89654ea r3, int i) {
        r3.Box(new Object[]{r3.getString(R.string.f11nameremoved)}, 0, i);
    }

    public static boolean A0x(C54902pT r1) {
        return r1.A03(0);
    }

    public static int A00(C195349Xk r1, AnonymousClass32L r2) {
        return C89964fZ.A00(r1, r2.A01);
    }

    public static long A02(AnonymousClass39Q r1) {
        return r1.A00.scaleByPowerOfTen(3).longValue();
    }

    public static Intent A03(Context context) {
        return new Intent(context, BrazilPayBloksActivity.class);
    }

    public static KeyPairGeneratorSpec A04(KeyPairGeneratorSpec.Builder builder, String str, Calendar calendar, Calendar calendar2) {
        return builder.setSubject(new X500Principal(str)).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
    }

    public static VersionedCapability A06(C192319Jc r4, XplatAssetType xplatAssetType, String str, int i, int i2) {
        return new VersionedCapability(str, i, r4, i2, xplatAssetType);
    }

    public static AnonymousClass98Z A09(C009707r r1, C08270df r2, C44122Ut r3, Map map) {
        return r3.A00(r1, r2, new C40102En(map));
    }

    public static AnonymousClass36F A0A(C64333Db r0) {
        return (AnonymousClass36F) r0.AQ1.get();
    }

    public static AnonymousClass39Q A0B(Object obj, String str) {
        return AnonymousClass39Q.A00(str, ((AnonymousClass3H6) obj).A01);
    }

    public static C166557yt A0F(C182518oY r1, Class cls, Object obj, String str) {
        return new C166557yt(r1, cls, obj, str);
    }

    public static C166557yt A0G(C182518oY r2, Object obj, String str) {
        return new C166557yt(r2, String.class, obj, str);
    }

    public static C196719bd A0H(C107695bk r0) {
        return (C196719bd) r0.A6N.get();
    }

    public static C196629bS A0J(C64333Db r0) {
        return (C196629bS) r0.AHY.get();
    }

    public static AnonymousClass99L A0K(C624034w r0) {
        AnonymousClass1S4 r02 = r0.A0A;
        C626936e.A06(r02);
        return (AnonymousClass99L) r02;
    }

    public static AnonymousClass34V A0M() {
        return new AnonymousClass34V();
    }

    public static AnonymousClass9TZ A0P(C64333Db r0) {
        return (AnonymousClass9TZ) r0.APh.get();
    }

    public static IndiaUpiPinPrimerDialogFragment A0R(Parcelable parcelable, C203149nC r3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_bank_account", parcelable);
        IndiaUpiPinPrimerDialogFragment indiaUpiPinPrimerDialogFragment = new IndiaUpiPinPrimerDialogFragment();
        indiaUpiPinPrimerDialogFragment.A0u(bundle);
        indiaUpiPinPrimerDialogFragment.A06 = r3;
        return indiaUpiPinPrimerDialogFragment;
    }

    public static C195219Wq A0S(C64333Db r0) {
        return (C195219Wq) r0.AQK.get();
    }

    public static AnonymousClass36K A0T(AnonymousClass36K r1) {
        return r1.A0l("account");
    }

    public static AnonymousClass36K A0U(AnonymousClass39V[] r2) {
        return new AnonymousClass36K("account", r2);
    }

    public static C60482yd A0V(C64333Db r0) {
        return (C60482yd) r0.AZ5.get();
    }

    public static C35351wj A0W(String str) {
        return new C35351wj(str, 12);
    }

    public static C35371wl A0X(String str) {
        return new C35371wl(str, 12);
    }

    public static Object A0Y(C64333Db r0) {
        return r0.APq.get();
    }

    public static String A0Z(int i) {
        if (i != 0) {
            return "1";
        }
        return "0";
    }

    public static String A0b(C89644eZ r2) {
        return AnonymousClass35J.A02(r2.A01, r2.A06);
    }

    public static String A0e(C166557yt r0) {
        Object obj = r0.A00;
        C626936e.A06(obj);
        return (String) obj;
    }

    public static JSONArray A0f(C161307pP r1) {
        if (!TextUtils.isEmpty(r1.A0C)) {
            return new JSONArray(r1.A0C);
        }
        return new JSONArray();
    }

    public static void A0k(SpannableString spannableString, String str, String str2, String str3) {
        URLSpan uRLSpan = new URLSpan(str);
        int indexOf = str2.indexOf(str3);
        spannableString.setSpan(uRLSpan, indexOf, indexOf + str3.length(), 33);
    }

    public static void A0o(C64333Db r0, WaDialogFragment waDialogFragment) {
        AnonymousClass31I.A02(waDialogFragment, r0.A00.ANI());
    }

    public static void A0q(C624034w r2, AnonymousClass303 r3) {
        r3.A03("transaction_status", AnonymousClass36S.A03(r2.A03, r2.A02));
    }

    public static void A0r(C166557yt r0, String str, JSONObject jSONObject) {
        jSONObject.put(str, r0.A00);
    }

    public static void A0u(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        pinBottomSheetDialogFragment.A1d(j * 1000, true);
    }

    public static boolean A0w(C56952sp r1) {
        return r1.A0X(842);
    }

    public static boolean A0y(Object obj) {
        return "1".equals(obj);
    }

    public static boolean A0z(String str, long j, boolean z) {
        return C626836d.A0M(str, j, 10, z);
    }

    public static boolean A10(String str, long j, boolean z) {
        return C626836d.A0M(str, j, 10000, z);
    }

    public static byte[] A12(C67993Rl r1, byte[] bArr) {
        return r1.B2R(bArr, C627236i.A0I(16));
    }

    public static String[] A14() {
        return new String[]{"CREDIT", "CURRENT", "DEFAULT", "NRE", "NRO", "OD_SECURED", "OD_UNSECURED", "SAVINGS", "UNKNOWN"};
    }

    public static int A01(C89644eZ r2, int i) {
        r2.setContentView(i);
        int A04 = AnonymousClass0Y8.A04(r2, R.color.f5nameremoved);
        r2.setSupportActionBar((Toolbar) r2.findViewById(R.id.pay_service_toolbar));
        return A04;
    }

    public static FingerprintBottomSheet A07() {
        return FingerprintBottomSheet.A00(R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.layout.f8nameremoved);
    }

    public static C19340zH A08(Context context) {
        C19340zH A00 = AnonymousClass5V0.A00(context);
        A00.A0U(R.string.f11nameremoved);
        A00.A0T(R.string.f11nameremoved);
        return A00;
    }

    public static C166587yw A0C(Iterator it) {
        return (C166587yw) it.next();
    }

    public static C166587yw A0D(List list, int i) {
        return (C166587yw) list.get(i);
    }

    public static C624034w A0E(Iterator it) {
        return (C624034w) it.next();
    }

    public static AnonymousClass99H A0I(C160757oG r0, Object obj, String str) {
        C626936e.A07(obj, r0.A02(str));
        return (AnonymousClass99H) obj;
    }

    public static C29251iW A0L(C64333Db r0) {
        return (C29251iW) r0.API.get();
    }

    public static C193999Re A0N(C107695bk r0) {
        return (C193999Re) r0.A8o.get();
    }

    public static C197769dq A0O(C64333Db r0) {
        return (C197769dq) r0.AQB.get();
    }

    public static String A0a(Activity activity, String str) {
        return activity.getIntent().getStringExtra(str);
    }

    public static String A0c(AnonymousClass5X8 r0, String str) {
        return r0.A00(str).toString();
    }

    public static String A0d(AnonymousClass39L r3, Object[] objArr) {
        objArr[0] = new AnonymousClass39V("value", r3.A00());
        objArr[1] = new AnonymousClass39V("offset", r3.A00);
        return ((AnonymousClass3H6) r3.A01).A04;
    }

    public static void A0j(Intent intent, Intent intent2, String str) {
        intent2.putExtra(str, intent.getStringExtra(str));
    }

    public static void A0l(TextView textView, C08310eF r2, Object[] objArr, int i) {
        textView.setText(r2.A0Y(i, objArr));
    }

    public static void A0m(C203689o9 r6, Object obj, String str, String str2, Map map) {
        r6.BKJ(str, str2, map, (long) obj.hashCode());
    }

    public static void A0n(C64333Db r1, C107695bk r2, ContactPicker contactPicker) {
        C379724t.A00(contactPicker, r2.ALf());
        C107255ay.A01((AnonymousClass5Ul) r1.AUW.get(), contactPicker);
        C107255ay.A06(contactPicker, (C106685Zz) r1.AJ4.get());
        C107255ay.A00((AnonymousClass5XU) r1.AU0.get(), contactPicker);
    }

    public static void A0s(AnonymousClass7WN r1, C161307pP r2, Object obj) {
        r2.A0C = obj.toString();
        r1.A01(r2);
    }

    public static void A0t(C160757oG r1, Object obj) {
        r1.A05(obj.toString());
    }

    public static void A0v(AbstractMap abstractMap, int i) {
        abstractMap.put("error_code", String.valueOf(i));
    }

    public static int[] A13(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            return C195239Wt.A02;
        }
        return iArr;
    }

    public static boolean A11(String str, long j, boolean z) {
        return C626836d.A0M(str, j, 9007199254740991L, z);
    }
}
