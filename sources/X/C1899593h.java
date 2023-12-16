package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.CardInputText;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.93h  reason: invalid class name and case insensitive filesystem */
public final class C1899593h {
    public static C166587yw A0A(C617332a r1, C133796hx r2, AnonymousClass36K r3) {
        r2.A04(r1, r3, 0);
        return r2.A07();
    }

    public static AnonymousClass303 A0K() {
        return new AnonymousClass303((String) null, new AnonymousClass303[0]);
    }

    public static AnonymousClass36K A0T(AbstractCollection abstractCollection) {
        return new AnonymousClass36K("account", (AnonymousClass39V[]) abstractCollection.toArray(new AnonymousClass39V[0]));
    }

    public static void A1E(C203499no r1, Integer num, String str, String str2) {
        C626936e.A06(r1);
        r1.BKB(1, num, str, str2);
    }

    public static boolean A1W(AnonymousClass36K r1, String str, String str2) {
        return str2.equals(r1.A0r(str, (String) null));
    }

    public static boolean A1X(String str) {
        return C626836d.A0M(str, 1, 100, true);
    }

    public static int A02(C89654ea r1, List list) {
        if (r1.A0D.A0X(2443)) {
            Collections.sort(list);
        }
        return 2443;
    }

    public static Intent A05(Context context) {
        Intent intent = new Intent(context, IndiaUpiPaymentsAccountSetupActivity.class);
        intent.putExtra("extra_setup_mode", 2);
        return intent;
    }

    public static Intent A06(Context context, Parcelable parcelable, Class cls) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_bank_account", parcelable);
        return intent;
    }

    public static AnonymousClass39Q A08(Object obj, BigDecimal bigDecimal) {
        return new AnonymousClass39Q(bigDecimal, ((AnonymousClass3H6) obj).A01);
    }

    public static C617332a A09(C64333Db r0) {
        return (C617332a) r0.APZ.get();
    }

    public static C166557yt A0B(Object obj) {
        return new C166557yt(new AnonymousClass3QD(), String.class, obj, "upiHandle");
    }

    public static C166557yt A0C(Object obj, String str) {
        return new C166557yt(new AnonymousClass3QD(), String.class, obj, str);
    }

    public static C620933l A0E(C64333Db r0) {
        return (C620933l) r0.APx.get();
    }

    public static AnonymousClass9U5 A0F(C64333Db r0) {
        return (AnonymousClass9U5) r0.AQ5.get();
    }

    public static C1907099n A0H(C64333Db r0) {
        return (C1907099n) r0.AQ8.get();
    }

    public static AnonymousClass9U4 A0I(C64333Db r0) {
        return (AnonymousClass9U4) r0.AQC.get();
    }

    public static C197109ca A0L(C64333Db r0) {
        return (C197109ca) r0.AHW.get();
    }

    public static C203499no A0M(C107695bk r0) {
        return (C203499no) r0.A1J.get();
    }

    public static C158777kX A0O(C64333Db r0) {
        return (C158777kX) r0.APt.get();
    }

    public static PaymentIncentiveViewModel A0P(C15940sD r2) {
        return (PaymentIncentiveViewModel) new AnonymousClass0XL(r2).A01(PaymentIncentiveViewModel.class);
    }

    public static C194259Se A0Q(C64333Db r0) {
        return (C194259Se) r0.APe.get();
    }

    public static AnonymousClass2z0 A0R(C624034w r4) {
        return new AnonymousClass2z0(r4.A0C, r4.A0L, r4.A0Q);
    }

    public static C56052rL A0U() {
        return new C56052rL("account");
    }

    public static Object A0X(C166557yt r0) {
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public static StringBuilder A0c(C620933l r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A07());
        return sb;
    }

    public static List A0f(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static void A0p(C06270Wx r1, Object obj, Object obj2) {
        r1.A0G(new AnonymousClass0PJ(obj, obj2));
    }

    public static void A0q(C195739Zi r1, C203429ng r2, int i, int i2) {
        if (i == i2) {
            r1.A03 = 0;
            r1.A05 = Boolean.TRUE;
            r1.A04 = r2;
            r1.A02.A01();
        }
    }

    public static void A0w(C88854au r1, C64333Db r2, C107695bk r3, ContactPickerFragment contactPickerFragment, AnonymousClass9U4 r5) {
        contactPickerFragment.A2H = r5;
        C107685bj.A1m(contactPickerFragment, C72343dZ.A00(r2.A4q));
        C107685bj.A0h(contactPickerFragment, (C29061iD) r2.A6c.get());
        C107685bj.A0k(contactPickerFragment, (AnonymousClass314) r2.A6v.get());
        C107685bj.A0y(contactPickerFragment, (AnonymousClass30T) r2.AFm.get());
        C107685bj.A1U(contactPickerFragment, (C113995mK) r2.AWt.get());
        C107685bj.A0v(contactPickerFragment, r2.Ajh());
        C107685bj.A01(C116985rC.A01(), contactPickerFragment);
        contactPickerFragment.A1J = (C66413Li) r2.A6U.get();
        C107685bj.A0R(r2.AiJ(), contactPickerFragment);
        C107685bj.A0N(r3.AJu(), contactPickerFragment);
        C107685bj.A1Y(contactPickerFragment, r1.A7T());
        C107685bj.A0j(contactPickerFragment, (C53602nM) r3.A2g.get());
        C107685bj.A1b(contactPickerFragment, (AnonymousClass306) r2.A9s.get());
        C107685bj.A0t(contactPickerFragment, (C104565Rl) r3.A3E.get());
    }

    public static void A0z(C64333Db r1, C107695bk r2, C89644eZ r3, Object obj) {
        r3.A06 = (C56612sH) obj;
        r3.A0B = (C105895Wv) r1.AHN.get();
        r3.A01 = (C56972sr) r1.AJW.get();
        C107435bJ.A05(r3, (AnonymousClass310) r1.A9r.get());
        C107435bJ.A07(r3, (C61072zf) r1.AXI.get());
        r3.A00 = (C111095hX) r1.A0a.get();
        r3.A03 = (AnonymousClass5X8) r1.Aac.get();
        C107435bJ.A04(r3, (C105275Ug) r1.A0q.get());
        C107435bJ.A02((C101625Fm) r2.A7s.get(), r3);
        C107435bJ.A0A(r3, (C29321id) r1.AUK.get());
        C107435bJ.A09(r3, (C51072jE) r1.ATh.get());
        C107435bJ.A08(r3, r1.Ajr());
    }

    public static void A13(C64333Db r1, C107695bk r2, PaymentSettingsFragment paymentSettingsFragment, Object obj) {
        paymentSettingsFragment.A0S = (C64773Ex) obj;
        paymentSettingsFragment.A0T = (AnonymousClass5ZU) r1.AaA.get();
        paymentSettingsFragment.A0r = (C158777kX) r1.APt.get();
        paymentSettingsFragment.A0R = (AnonymousClass5UX) r1.A6K.get();
        paymentSettingsFragment.A0V = (C56612sH) r1.ASO.get();
        paymentSettingsFragment.A0L = (C69263Wi) r1.AG7.get();
        paymentSettingsFragment.A0W = (C54292oU) r1.AaB.get();
        paymentSettingsFragment.A14 = (C106715a2) r2.A72.get();
        paymentSettingsFragment.A15 = (AnonymousClass4FS) r1.AbX.get();
        paymentSettingsFragment.A0O = (C66663Mh) r1.AUd.get();
        paymentSettingsFragment.A0Z = r1.AnI();
        paymentSettingsFragment.A12 = (C194229Sb) r2.A8h.get();
    }

    public static void A15(C64333Db r1, C89654ea r2) {
        r2.A04 = (AnonymousClass4FS) r1.AbX.get();
        r2.A0D = (AnonymousClass1VX) r1.A07.get();
        r2.A05 = (C69263Wi) r1.AG7.get();
        r2.A03 = (C55682qk) r1.A75.get();
        AnonymousClass36R.A01(r2, (C64393Dh) r1.AS1.get());
        r2.A0C = (AnonymousClass5Y0) r1.A8o.get();
        r2.A06 = (C66663Mh) r1.AUd.get();
        r2.A08 = (C620633i) r1.AYG.get();
        r2.A09 = (AnonymousClass33p) r1.Aaj.get();
        r2.A07 = (C29441ip) r1.A68.get();
        AnonymousClass36R.A07(r2, (C54412og) r1.Aam.get());
    }

    public static void A16(C64333Db r1, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A1x = (AnonymousClass1VX) obj;
        C107685bj.A1i(contactPickerFragment, (AnonymousClass2Z2) r1.A2L.get());
        C107685bj.A1Z(contactPickerFragment, (C106675Zy) r1.A73.get());
        C107685bj.A1j(contactPickerFragment, r1.Ari());
        contactPickerFragment.A0a = (C69263Wi) r1.AG7.get();
        C107685bj.A0Z((C114015mM) r1.A6T.get(), contactPickerFragment);
        contactPickerFragment.A0b = (C56972sr) r1.AJW.get();
        C107685bj.A1c(contactPickerFragment, (C56072rN) r1.AGN.get());
        C107685bj.A1D(contactPickerFragment, (C49882hF) r1.AGU.get());
        C107685bj.A1V(contactPickerFragment, (C66433Lk) r1.AEu.get());
        C107685bj.A1e(contactPickerFragment, (C989053r) r1.AJl.get());
        C107685bj.A1f(contactPickerFragment, (C187958y5) r1.ASM.get());
    }

    public static void A18(C64333Db r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0n = (AnonymousClass9U4) r1.AQC.get();
        paymentSettingsFragment.A0i = (C620933l) r1.APx.get();
        paymentSettingsFragment.A0Q = (C44772Xk) r1.A6I.get();
        paymentSettingsFragment.A0a = (AnonymousClass33K) r1.AaW.get();
        paymentSettingsFragment.A0c = (C1906899l) r1.APJ.get();
        paymentSettingsFragment.A0k = (AnonymousClass9U5) r1.AQ5.get();
        paymentSettingsFragment.A0m = (C1907099n) r1.AQ8.get();
    }

    public static void A1C(AnonymousClass31C r7, AnonymousClass4EZ r8, AnonymousClass36K r9, String str) {
        r7.A0D(r8, r9, str, 204, 0);
    }

    public static void A1M(C56052rL r3) {
        r3.A0G(new AnonymousClass39V((Jid) C135206kI.A00, "to"));
        r3.A0G(new AnonymousClass39V("xmlns", "w:pay"));
    }

    public static void A1N(C56052rL r8, String str) {
        if (C626836d.A0M(str, 1, 1000, false)) {
            r8.A0G(new AnonymousClass39V("nonce", str));
        }
    }

    public static void A1O(C56052rL r8, String str, boolean z) {
        if (C626836d.A0M(str, 1, 255, z)) {
            r8.A0G(new AnonymousClass39V("device-id", str));
        }
    }

    public static void A1R(String str, String str2, List list) {
        list.add(new AnonymousClass39V(str, str2));
    }

    public static void A1S(String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass39V(str, i));
    }

    public static boolean A1Y(String str, long j, boolean z) {
        return C626836d.A0M(str, j, 100, z);
    }

    public static boolean A1Z(String str, long j, boolean z) {
        return C626836d.A0M(str, j, 1000, z);
    }

    public static boolean A1a(String str, boolean z) {
        return C626836d.A0M(str, 1, 1000, z);
    }

    public static boolean A1b(String str, boolean z) {
        return C626836d.A0M(str, 1, 200, z);
    }

    public static double A00(AtomicReference atomicReference) {
        return ((Number) atomicReference.get()).doubleValue();
    }

    public static float A01(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A03(CardInputText cardInputText) {
        cardInputText.A04();
        cardInputText.A01 = 1.0f;
        cardInputText.A02 = 2.0f;
        cardInputText.A03 = 24.0f;
        cardInputText.A04 = 8.0f;
        cardInputText.A06 = 4;
        return 4;
    }

    public static int A04(String str, int i, int i2) {
        return Integer.parseInt(str.substring(i, i2).trim());
    }

    public static Toolbar A07(C009707r r1) {
        return (Toolbar) r1.findViewById(R.id.toolbar);
    }

    public static C195909Zz A0D(C107695bk r0) {
        return (C195909Zz) r0.A8b.get();
    }

    public static C153087ae A0G(C64333Db r0) {
        return (C153087ae) r0.AQ7.get();
    }

    public static C194309Sj A0J(C107695bk r0) {
        return (C194309Sj) r0.A8q.get();
    }

    public static C44522Wj A0N(C64333Db r0) {
        return (C44522Wj) r0.AFQ.get();
    }

    public static AnonymousClass36K A0S(C56052rL r0, C56052rL r1, C41032Ir r2) {
        r1.A0H(r0.A0F());
        r1.A0I(r2.A00);
        return r1.A0F();
    }

    public static C106715a2 A0V(C107695bk r0) {
        return (C106715a2) r0.A72.get();
    }

    public static Object A0W(C64333Db r1, C107695bk r2, C89654ea r3) {
        r3.A0B = (AnonymousClass487) r2.A9c.get();
        return r1.ASO.get();
    }

    public static RuntimeException A0Y(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new RuntimeException(sb.toString());
    }

    public static String A0Z(Activity activity) {
        return activity.getIntent().getStringExtra("referral_screen");
    }

    public static String A0a(Activity activity) {
        return activity.getIntent().getStringExtra("extra_referral_screen");
    }

    public static String A0b(C53762nc r0, Object obj, String str) {
        String str2;
        C42132Mx A00 = r0.A00();
        if (A00 == null || (str2 = (String) A00.A02.get(obj)) == null) {
            return str;
        }
        return str2;
    }

    public static AbstractMap A0d(Activity activity) {
        return (AbstractMap) activity.getIntent().getSerializableExtra("screen_params");
    }

    public static ArrayList A0e(String str, String str2, String str3) {
        return new ArrayList(Arrays.asList(new String[]{str, str2, str3}));
    }

    public static JSONObject A0g(C620933l r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A0h(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
    }

    public static void A0i(Context context, ImageView imageView, int i) {
        C107335b8.A0E(imageView, AnonymousClass0Y8.A04(context, i));
    }

    public static void A0j(Context context, AnonymousClass0R8 r2, int i) {
        r2.A0E(C107335b8.A0B(context.getResources().getDrawable(R.drawable.ic_close), i));
    }

    public static void A0k(Intent intent, C89654ea r2, String str, String str2) {
        intent.putExtra(str, str2);
        r2.A6T(intent, true);
    }

    public static void A0l(CaptureRequest.Builder builder, CaptureRequest.Key key, int i) {
        builder.set(key, Integer.valueOf(i));
    }

    public static void A0m(View view, int i, int i2) {
        C107335b8.A0E((ImageView) view.findViewById(i), i2);
    }

    public static void A0n(AnonymousClass0R8 r1, int i) {
        r1.A0B(i);
        r1.A0N(true);
    }

    public static void A0o(AnonymousClass0R8 r1, CharSequence charSequence) {
        r1.A0J(charSequence);
        r1.A0N(true);
    }

    public static void A0r(C111095hX r0, C88834as r1, C64333Db r2, C107695bk r3, ContactPickerFragment contactPickerFragment) {
        C107685bj.A03(r0, contactPickerFragment);
        C107685bj.A1H(contactPickerFragment, r2.Ao7());
        C107685bj.A0O((C29301ib) r2.A57.get(), contactPickerFragment);
        C107685bj.A0g(contactPickerFragment, (C64223Cq) r2.A6b.get());
        C107685bj.A15(contactPickerFragment, (AnonymousClass5QP) r3.A3B.get());
        C107685bj.A0u(contactPickerFragment, (C40362Fn) r2.A7V.get());
        C107685bj.A0b(contactPickerFragment, (C53802nh) r3.A6e.get());
        C107685bj.A1R(contactPickerFragment, (C54482on) r3.A7A.get());
        contactPickerFragment.A0w = (C64773Ex) r2.A6O.get();
        contactPickerFragment.A12 = (AnonymousClass5ZU) r2.AaA.get();
        contactPickerFragment.A1V = (C620733j) r2.AbU.get();
        C107685bj.A0V((C44772Xk) r2.A6I.get(), contactPickerFragment);
        C107685bj.A1F(contactPickerFragment, r1.ACV());
    }

    public static void A0s(C88834as r1, C88854au r2, C64333Db r3, C107695bk r4, ContactPickerFragment contactPickerFragment) {
        C107685bj.A08((C44132Uu) r1.A1U.get(), contactPickerFragment);
        contactPickerFragment.A0u = (C29441ip) r3.A68.get();
        C107685bj.A09((AnonymousClass7CK) r2.A0g.get(), contactPickerFragment);
        C107685bj.A13(contactPickerFragment, (C59972xn) r3.ATY.get());
        C107685bj.A1I(contactPickerFragment, (C104795Sj) r4.A1T.get());
        C107685bj.A18(contactPickerFragment, (AnonymousClass2YA) r3.A8P.get());
        C107685bj.A1n(contactPickerFragment, C72343dZ.A00(r4.A88));
        C107685bj.A16(contactPickerFragment, (C49832hA) r4.A1i.get());
        C107685bj.A0K((AnonymousClass64J) r3.AEN.get(), contactPickerFragment);
        C107685bj.A07((AnonymousClass5M1) r1.A48.get(), contactPickerFragment);
        C107685bj.A1M(contactPickerFragment, (AnonymousClass4rH) r3.ANx.get());
    }

    public static void A0t(C88834as r0, C64333Db r1, C107695bk r2, ContactPickerFragment contactPickerFragment) {
        C107685bj.A0a(contactPickerFragment, r0.ABp());
        C107685bj.A1d(contactPickerFragment, (AnonymousClass2ML) r1.AIy.get());
        C107685bj.A1Q(contactPickerFragment, (C186568vZ) r1.ASw.get());
        C107685bj.A1a(contactPickerFragment, (C50282hv) r1.A8K.get());
        C107685bj.A00((C116985rC) r1.AOi.get(), contactPickerFragment);
        C107685bj.A0T((AnonymousClass33U) r1.A5h.get(), contactPickerFragment);
        C107685bj.A1J(contactPickerFragment, (C105355Up) r2.A1a.get());
        C107685bj.A17(contactPickerFragment, (C48052eG) r2.A3M.get());
        contactPickerFragment.A11 = (C56422rx) r1.AZn.get();
        C107685bj.A0S((C46352bU) r1.A5Y.get(), contactPickerFragment);
    }

    public static void A0u(C88834as r1, C64333Db r2, ContactPickerFragment contactPickerFragment) {
        C107685bj.A0r(contactPickerFragment, (C53412n3) r2.A93.get());
        C107685bj.A0l(contactPickerFragment, (C104985Tc) r1.A0R.get());
        C107685bj.A0q(contactPickerFragment, (C22931Qq) r2.A7Y.get());
        C107685bj.A0d(contactPickerFragment, (C53592nL) r2.A6M.get());
    }

    public static void A0v(C88854au r1, C64333Db r2, C107695bk r3, ContactPickerFragment contactPickerFragment, C56892sj r5) {
        C107685bj.A0z(contactPickerFragment, r5);
        C107685bj.A0s(contactPickerFragment, r2.Ajd());
        C107685bj.A1P(contactPickerFragment, (C60152y5) r2.AVn.get());
        C107685bj.A1S(contactPickerFragment, (AnonymousClass5TZ) r3.AB9.get());
        C107685bj.A0Y(r1.A7G(), contactPickerFragment);
        C107685bj.A0Q(r1.A7F(), contactPickerFragment);
        C107685bj.A11(contactPickerFragment, (C620533h) r2.APC.get());
        C107685bj.A0X((C47882dz) r2.AIl.get(), contactPickerFragment);
        C107685bj.A1X(contactPickerFragment, r1.A7S());
        C107685bj.A0e(contactPickerFragment, (C47102ci) r3.A2Z.get());
        C107685bj.A0i(contactPickerFragment, (C64193Cn) r2.A6f.get());
        C107685bj.A0x(contactPickerFragment, (C66473Lo) r2.A6p.get());
        C107685bj.A1E(contactPickerFragment, (C29241iV) r2.AGn.get());
        C107685bj.A1K(contactPickerFragment, (AnonymousClass5PS) r3.A3Y.get());
    }

    public static void A0x(C88854au r1, C64333Db r2, BkScreenFragment bkScreenFragment) {
        C57662u0.A02(bkScreenFragment, C72343dZ.A00(r2.AS9));
        bkScreenFragment.A04 = (AnonymousClass2XX) r2.AaP.get();
        bkScreenFragment.A04 = (C59842xa) r2.A2v.get();
        bkScreenFragment.A05 = r2.Ahl();
        C88834as r12 = r1.A18;
        bkScreenFragment.A02 = (C44122Ut) r12.A4Q.get();
        bkScreenFragment.A03 = (C48412er) r2.AaL.get();
        bkScreenFragment.A06 = r12.ADP();
    }

    public static void A0y(C64333Db r1, C107695bk r2, C107695bk r3, ContactPickerFragment contactPickerFragment) {
        C1002059z.A00(contactPickerFragment, r2.ANI());
        C107685bj.A1W(contactPickerFragment, (C105025Tg) r1.AK5.get());
        contactPickerFragment.A1S = (C56612sH) r1.ASO.get();
        C107685bj.A1N(contactPickerFragment, (AnonymousClass5QQ) r3.A85.get());
        C107685bj.A06((C55682qk) r1.A75.get(), contactPickerFragment);
        C107685bj.A0G((AnonymousClass5Ul) r1.AUW.get(), contactPickerFragment);
        C107685bj.A1g(contactPickerFragment, (AnonymousClass4FS) r1.AbX.get());
    }

    public static void A10(C64333Db r1, C107695bk r2, ContactPickerFragment contactPickerFragment) {
        C107685bj.A0w(contactPickerFragment, (C56982ss) r1.A5B.get());
        C107685bj.A02((C57012sv) r1.A0Z.get(), contactPickerFragment);
        C107685bj.A1G(contactPickerFragment, (C106685Zz) r1.AJ4.get());
        C107685bj.A1B(contactPickerFragment, (AnonymousClass4FV) r1.ASY.get());
        C107685bj.A0I((C56492s4) r1.AWW.get(), contactPickerFragment);
        C107685bj.A19(contactPickerFragment, (AnonymousClass5Y0) r1.A8o.get());
        C107685bj.A0H((C66663Mh) r1.AUd.get(), contactPickerFragment);
        C107685bj.A14(contactPickerFragment, (C620233e) r1.AWq.get());
        C107685bj.A0J((C48852fa) r2.ABc.get(), contactPickerFragment);
        C107685bj.A0L((C621033m) r1.AZL.get(), contactPickerFragment);
        C107685bj.A1h(contactPickerFragment, (AnonymousClass5TD) r1.AZi.get());
    }

    public static void A11(C64333Db r1, C107695bk r2, ContactPickerFragment contactPickerFragment, AnonymousClass4C1 r4) {
        C107685bj.A0m(contactPickerFragment, (C620633i) r4.get());
        C107685bj.A0P((AnonymousClass5UK) r1.A4p.get(), contactPickerFragment);
        C107685bj.A1l(contactPickerFragment, C72343dZ.A00(r1.A3J));
        C107685bj.A12(contactPickerFragment, (C114635nM) r1.AQW.get());
        C107685bj.A1k(contactPickerFragment, C72343dZ.A00(r1.A3B));
        C107685bj.A1C(contactPickerFragment, (C66493Lq) r1.AGL.get());
        C107685bj.A0M((C56962sq) r1.A2b.get(), contactPickerFragment);
        C107685bj.A0W((C29421in) r1.A6P.get(), contactPickerFragment);
        C107685bj.A05((C106175Xx) r1.ARx.get(), contactPickerFragment);
        C107685bj.A0c(contactPickerFragment, (C49762h3) r2.A6f.get());
        C107685bj.A1O(contactPickerFragment, r1.Aog());
        C107685bj.A1A(contactPickerFragment, r1.Akp());
        C107685bj.A1L(contactPickerFragment, (AnonymousClass5YD) r1.ANq.get());
    }

    public static void A12(C64333Db r1, C107695bk r2, PaymentSettingsFragment paymentSettingsFragment) {
        AnonymousClass31I.A02(paymentSettingsFragment, r2.ANI());
        paymentSettingsFragment.A0M = (C56972sr) r1.AJW.get();
        paymentSettingsFragment.A0P = (C56492s4) r1.AWW.get();
        paymentSettingsFragment.A0N = (AnonymousClass5WY) r1.AUS.get();
        paymentSettingsFragment.A13 = (C195219Wq) r1.AQK.get();
    }

    public static void A14(C64333Db r1, C107695bk r2, WaInAppBrowsingActivity waInAppBrowsingActivity) {
        AnonymousClass346.A00((C85244Fm) r1.AJ2.get(), waInAppBrowsingActivity);
        AnonymousClass346.A02(r2.APo(), waInAppBrowsingActivity);
        AnonymousClass346.A01((AnonymousClass36Y) r1.A7u.get(), waInAppBrowsingActivity);
        AnonymousClass346.A03((AnonymousClass306) r1.A9s.get(), waInAppBrowsingActivity);
    }

    public static void A17(C64333Db r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0l = (C153087ae) r1.AQ7.get();
        paymentSettingsFragment.A0f = (C40602Ha) r1.APq.get();
        paymentSettingsFragment.A0o = (AnonymousClass9b0) r1.APz.get();
        paymentSettingsFragment.A0g = (C1906999m) r1.APr.get();
        paymentSettingsFragment.A0j = (C29271iY) r1.AQ0.get();
        paymentSettingsFragment.A0b = (C194539Ti) r1.AMj.get();
        paymentSettingsFragment.A0h = (C194489Tb) r1.APu.get();
        paymentSettingsFragment.A0Y = (AnonymousClass36F) r1.AQ1.get();
        paymentSettingsFragment.A0U = (C114015mM) r1.A6T.get();
        paymentSettingsFragment.A0X = (C194909Va) r1.AOn.get();
        paymentSettingsFragment.A0e = (C1906699j) r1.APK.get();
    }

    public static void A19(C107695bk r0, WaFragment waFragment) {
        C1002059z.A00(waFragment, r0.ANI());
    }

    public static void A1A(AnonymousClass49I r2, Object obj) {
        C157157hp.A00(AnonymousClass8DJ.A03(obj), C157967jD.A01, r2.B3r());
    }

    public static void A1B(C134246ig r1, int i) {
        r1.A08 = Integer.valueOf(i);
    }

    public static void A1D(C620933l r1, Object obj) {
        r1.A0J(obj.toString());
    }

    public static void A1F(C160757oG r1, Object obj) {
        r1.A06(obj.toString());
    }

    public static void A1G(C160757oG r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A05(sb.toString());
    }

    public static void A1H(C160757oG r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A1I(C160757oG r1, Object obj, StringBuilder sb) {
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A1J(C160757oG r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A06(sb.toString());
    }

    public static void A1K(C160757oG r1, StringBuilder sb, int i) {
        sb.append(i);
        r1.A06(sb.toString());
    }

    public static void A1L(C160757oG r1, StringBuilder sb, boolean z) {
        sb.append(z);
        r1.A06(sb.toString());
    }

    public static void A1P(BkFragment bkFragment, AnonymousClass39C r1, Serializable serializable, String str) {
        bkFragment.A1P(str);
        bkFragment.A1M(r1);
        bkFragment.A1K();
        bkFragment.A0H().putSerializable("qpl_params", serializable);
    }

    public static void A1Q(String str, String str2) {
        Log.e(C160757oG.A01(str, str2));
    }

    public static void A1T(AbstractMap abstractMap, Iterator it) {
        AnonymousClass3ZH r1 = (AnonymousClass3ZH) it.next();
        C95814uZ r0 = r1.A0H;
        if (r0 != null) {
            abstractMap.put(r0.getRawString(), r1);
        }
    }

    public static void A1U(AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        obj.getClass();
        ((CountDownLatch) obj).countDown();
    }

    public static boolean A1V(AnonymousClass9Mv r0, C203589nz r1) {
        return ((Boolean) r1.B3x(r0)).booleanValue();
    }
}
