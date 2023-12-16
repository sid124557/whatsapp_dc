package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.97T  reason: invalid class name */
public abstract class AnonymousClass97T extends C89644eZ {
    public static void A0r(C89654ea r3, C203499no r4, AnonymousClass8s3 r5, String str) {
        C162457s7.A0J(r4, 1);
        Bundle bundle = new Bundle();
        bundle.putString("referral_screen", str);
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = new BrazilPaymentIncomeCollectionBottomSheet();
        brazilPaymentIncomeCollectionBottomSheet.A0u(bundle);
        brazilPaymentIncomeCollectionBottomSheet.A01 = r5;
        brazilPaymentIncomeCollectionBottomSheet.A00 = r4;
        r3.A6V(brazilPaymentIncomeCollectionBottomSheet, "BrazilPaymentIncomeCollectionBottomSheet");
    }

    public static void A0w(AnonymousClass9U1 r2, C196629bS r3, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        r3.B1N(r2.A04(indiaUpiDeviceBindStepActivity.A0C), true);
    }

    public static void A0z(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, AnonymousClass9SO r3) {
        r3.A00.A0E(3);
        indiaUpiDeviceBindStepActivity.A0P.A00.A0E(3);
    }

    public static void A11(AnonymousClass9SO r2) {
        r2.A00.A0E(4);
    }

    public static Intent A0L(Context context, AnonymousClass9VW r4) {
        Intent intent = new Intent(context, IndiaUpiOnboardingErrorEducationActivity.class);
        if (r4.A01 != null) {
            intent.putExtra("error_text", r4.A02(context));
        }
        return intent;
    }

    public static Intent A0X(AnonymousClass9DC r3) {
        Intent intent = new Intent(r3, C192799Lp.A00(r3.A0D));
        intent.putExtra("extra_payments_entry_type", 6);
        intent.putExtra("extra_is_first_payment_method", !r3.A0I.A0C());
        intent.putExtra("extra_skip_value_props_display", r3.A0I.A0C());
        return intent;
    }

    public static C60152y5 A0a(C64333Db r1, C107695bk r2, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0L = (C203499no) r2.A1J.get();
        brazilPaymentActivity.A0N = (C194029Rh) r1.ANN.get();
        brazilPaymentActivity.A07 = (C617332a) r1.APZ.get();
        brazilPaymentActivity.A0U = (C158777kX) r1.APt.get();
        brazilPaymentActivity.A0D = (C29251iW) r1.API.get();
        brazilPaymentActivity.A0K = (AnonymousClass9TZ) r1.APh.get();
        brazilPaymentActivity.A0B = (C194929Vc) r1.A3V.get();
        return (C60152y5) r1.AVn.get();
    }

    public static String A0b(AnonymousClass9DA r2) {
        if (r2.A0N.A08(r2.A0a)) {
            return "CREDIT";
        }
        return null;
    }

    public static String A0c(AnonymousClass9DA r1) {
        return r1.A7F(r1.A0M.A06());
    }

    public static String A0d(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        return indiaUpiSendPaymentActivity.A05.A00(indiaUpiSendPaymentActivity.A0T, indiaUpiSendPaymentActivity.A0c, indiaUpiSendPaymentActivity.A0n);
    }

    public static void A0i(C88834as r1, C64333Db r2, C107695bk r3, AnonymousClass9DC r4, Object obj) {
        r4.A0K = (C40602Ha) obj;
        r4.A0S = r2.Aoq();
        r4.A06 = (C54292oU) r2.AaB.get();
        r4.A0C = r2.AnI();
        r4.A0Z = (C44562Wn) r2.A52.get();
        r4.A0e = (C55832qz) r2.AAY.get();
        r4.A04 = (AnonymousClass99P) r3.A10.get();
        r4.A05 = (C64223Cq) r2.A6b.get();
        r4.A0O = (C1907099n) r2.AQ8.get();
        r4.A0W = r1.ACu();
        r4.A0L = r2.Aon();
        r4.A0T = (C194969Vi) r2.APk.get();
        r4.A07 = (C66473Lo) r2.A6p.get();
        r4.A0R = r1.ACo();
        r4.A0V = r1.ACs();
    }

    public static void A0j(C88834as r1, C64333Db r2, C107695bk r3, BrazilPaymentActivity brazilPaymentActivity, C60152y5 r5) {
        brazilPaymentActivity.A0a = r5;
        brazilPaymentActivity.A0P = (AnonymousClass9W3) r3.A8g.get();
        brazilPaymentActivity.A0J = (AnonymousClass9VU) r2.AQH.get();
        brazilPaymentActivity.A0I = (C194589Tn) r2.APS.get();
        brazilPaymentActivity.A0F = (C29271iY) r2.AQ0.get();
        brazilPaymentActivity.A0H = (AnonymousClass9RV) r2.APO.get();
        brazilPaymentActivity.A0S = (C194649Ty) r3.A1I.get();
        brazilPaymentActivity.A0O = (AnonymousClass9B2) r3.A1G.get();
        brazilPaymentActivity.A0V = r1.ACt();
        brazilPaymentActivity.A0X = (AnonymousClass9W1) r3.A15.get();
        brazilPaymentActivity.A0Y = (C194219Sa) r3.A18.get();
        brazilPaymentActivity.A0G = (AnonymousClass9RU) r3.A1B.get();
        brazilPaymentActivity.A0A = r1.ACj();
    }

    public static void A0k(C88834as r1, C64333Db r2, C107695bk r3, AnonymousClass9D8 r4) {
        r4.A0V = (AnonymousClass9B3) r3.A6S.get();
        r4.A05 = (C56492s4) r2.AWW.get();
        r4.A01 = (C620733j) r2.AbU.get();
        r4.A0E = (C194259Se) r2.APe.get();
        r4.A02 = (C196719bd) r3.A6N.get();
        r4.A07 = r1.ACl();
        r4.A06 = (C385127z) r2.AQE.get();
        r4.A0A = (AnonymousClass9TZ) r2.APh.get();
        r4.A0C = (C171678Hz) r3.A6U.get();
        r4.A0B = (C115115o9) r3.A2P.get();
        r4.A0D = (C46092b4) r3.A2O.get();
    }

    public static void A0n(C64333Db r1, C107695bk r2, AnonymousClass9DA r3) {
        r3.A0V = (AnonymousClass9B3) r2.A6S.get();
        r3.A05 = (C56492s4) r1.AWW.get();
    }

    public static void A0s(C133686hm r1, AnonymousClass9DA r2, boolean z) {
        r2.startActivity(IndiaUpiPinPrimerFullSheetActivity.A0C(r2, r1, r2.A0a, z));
        r2.A7H();
        r2.finish();
    }

    public static void A0t(C134246ig r1, AnonymousClass9DA r2) {
        r2.A0S.BKA(r1);
    }

    public static void A0u(C134246ig r1, AnonymousClass9DA r2, String str) {
        r1.A0b = str;
        r1.A0Y = r2.A0b;
    }

    public static void A0v(AnonymousClass99H r6, AnonymousClass9DA r7, JSONObject jSONObject) {
        String A04 = r7.A0L.A04(r6);
        jSONObject.put("pspForDeviceBinding", A04);
        jSONObject.put("isDeviceBindingDone", r7.A0M.A0R(r6, r7.A0S, A04));
        AnonymousClass9AG r2 = new AnonymousClass9AG(r7.A06, r7.A0D, r7.A0H, r7.A0L, r7.A0M);
        r2.A00 = jSONObject;
        r2.A00("SKIPPED_DEVICE_BINDING", (List) null);
    }

    public static void A0x(AnonymousClass9DC r2, Object obj, JSONObject jSONObject) {
        jSONObject.put("step", obj);
        jSONObject.put("completedSteps", r2.A0I.A02().toString());
        jSONObject.put("isCompleteWith2FA", r2.A0I.A0D());
        jSONObject.put("isCompleteWithout2FA", r2.A0I.A0E());
    }

    public static void A0y(AnonymousClass9DA r1) {
        r1.A0M.A0D();
        r1.BjL();
        r1.Bp9(R.string.f11nameremoved);
    }

    public static void A10(AnonymousClass9D8 r0) {
        r0.A09.A00();
    }

    public static boolean A12(AnonymousClass9DC r0) {
        return r0.A0I.A0C();
    }

    public AnonymousClass97T() {
        C204019og.A00(this, 18);
    }

    public static AnonymousClass0R8 A0Y(AnonymousClass9DA r2) {
        r2.A7K(R.drawable.onboarding_actionbar_home_close, R.id.scroll_view);
        return r2.getSupportActionBar();
    }

    public static AnonymousClass9ER A0Z(C107695bk r0) {
        return (AnonymousClass9ER) r0.A6R.get();
    }

    public static void A0e(Context context, MenuItem menuItem, int i) {
        menuItem.setIcon(i).setShowAsAction(9);
        AnonymousClass0I5.A00(ColorStateList.valueOf(AnonymousClass0Y8.A04(context, R.color.f5nameremoved)), menuItem);
    }

    public static void A0f(View view, C166587yw r2) {
        Bitmap A09 = r2.A09();
        ImageView imageView = (ImageView) C06560Yg.A02(view, R.id.provider_icon);
        if (A09 != null) {
            imageView.setImageBitmap(A09);
        } else {
            imageView.setImageResource(R.drawable.av_bank);
        }
    }

    public static void A0g(TextView textView, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, int i) {
        textView.setText(i);
        indiaUpiBankAccountAddedLandingActivity.A06.setText(R.string.f11nameremoved);
        indiaUpiBankAccountAddedLandingActivity.A07.setVisibility(8);
    }

    public static void A0h(C88834as r1, C64333Db r2, C107695bk r3, AnonymousClass9DC r4) {
        r4.A0Q = (C194089Rn) r3.A98.get();
        r4.A0H = (AnonymousClass31C) r2.AKw.get();
        r4.A0P = (AnonymousClass9U4) r2.AQC.get();
        r4.A08 = (C66543Lv) r2.A71.get();
        r4.A0b = r2.Apy();
        r4.A0I = (C1906899l) r2.APJ.get();
        r4.A0X = r1.ACv();
        r4.A0M = (AnonymousClass9U5) r2.AQ5.get();
        r4.A0d = (AnonymousClass33O) r2.AX1.get();
        r4.A0N = (C153087ae) r2.AQ7.get();
    }

    public static void A0l(C64333Db r1, C107695bk r2, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0b = (C106715a2) r2.A72.get();
        brazilPaymentActivity.A05 = (AnonymousClass5ZU) r1.AaA.get();
        brazilPaymentActivity.A06 = (C620733j) r1.AbU.get();
        brazilPaymentActivity.A0Z = (C194259Se) r1.APe.get();
        brazilPaymentActivity.A09 = (C195089Vv) r2.A16.get();
        brazilPaymentActivity.A0E = (C620933l) r1.APx.get();
        brazilPaymentActivity.A08 = (AnonymousClass9bR) r2.A14.get();
        brazilPaymentActivity.A0M = (AnonymousClass9SD) r2.A1E.get();
        brazilPaymentActivity.A0R = (AnonymousClass9TJ) r2.A17.get();
        brazilPaymentActivity.A0c = (AnonymousClass5XO) r2.A7B.get();
        brazilPaymentActivity.A0Q = (AnonymousClass9TR) r2.A8k.get();
    }

    public static void A0m(C64333Db r1, C107695bk r2, AnonymousClass9DA r3) {
        r3.A0j = r2.A8x;
        r3.A0W = (C195219Wq) r1.AQK.get();
        r3.A07 = (AnonymousClass36F) r1.AQ1.get();
        r3.A0Q = (C29271iY) r1.AQ0.get();
    }

    public static void A0o(C64333Db r1, C107695bk r2, AnonymousClass9DA r3) {
        r3.A06 = (AnonymousClass5ZU) r1.AaA.get();
        r3.A0C = (AnonymousClass4FV) r1.ASY.get();
        r3.A04 = (AnonymousClass5WY) r1.AUS.get();
        r3.A0D = (AnonymousClass33K) r1.AaW.get();
        r3.A0P = (C620933l) r1.APx.get();
        r3.A0N = (AnonymousClass9W6) r1.AHa.get();
        r3.A0L = (AnonymousClass9U1) r1.AHX.get();
        r3.A0J = (AnonymousClass9VH) r2.A0z.get();
        r3.A0S = (C197109ca) r1.AHW.get();
        r3.A0M = (C196629bS) r1.AHY.get();
        r3.A0R = (AnonymousClass99N) r1.APg.get();
    }

    public static void A0p(C64333Db r0, C107695bk r1, AnonymousClass9Cu r2) {
        r2.A00 = (C56662sM) r0.AaX.get();
        r2.A02 = (AnonymousClass34S) r1.A6O.get();
    }

    public static void A0q(C64333Db r1, C107695bk r2, AnonymousClass9Bs r3) {
        r3.A03 = (C114015mM) r1.A6T.get();
        r3.A01 = (AnonymousClass5UX) r1.A6K.get();
        r3.A0O = (AnonymousClass9V1) r1.AHb.get();
        r3.A04 = (AnonymousClass5ZR) r1.Aag.get();
        r3.A07 = (C617332a) r1.APZ.get();
        r3.A0K = (C158777kX) r1.APt.get();
        r3.A0A = (C29251iW) r1.API.get();
        r3.A0C = (C197769dq) r1.AQB.get();
        r3.A0B = r2.AN7();
        r3.A0H = (C158757kV) r2.A6P.get();
        r3.A0P = r1.ApM();
    }
}
