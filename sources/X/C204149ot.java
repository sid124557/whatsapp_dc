package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;
import com.whatsapp.wabloks.ui.WaFcsModalActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* renamed from: X.9ot  reason: invalid class name and case insensitive filesystem */
public class C204149ot implements C84114Bb {
    public Object A00;
    public final int A01;

    public C204149ot(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BSV(Object obj) {
        Queue queue;
        Object obj2;
        String str;
        Collection<C161447pg> values;
        AnonymousClass4GB r1;
        String str2;
        String string;
        switch (this.A01) {
            case 0:
                C197979eB r10 = (C197979eB) obj;
                C203719oC A0H = ((C195069Vt) this.A00).A06.A0H("FBPAY");
                C626936e.A06(A0H);
                C203499no B7b = A0H.B7b();
                if (B7b != null) {
                    C134246ig B0d = B7b.B0d();
                    B0d.A08 = AnonymousClass001.A0f();
                    B0d.A0b = C18310x6.A0o(r10.A01, C195069Vt.A0D);
                    B0d.A07 = (Integer) C195069Vt.A0E.get(r10.A00);
                    B7b.BKA(B0d);
                    return;
                }
                return;
            case 1:
                C197959e9 r102 = (C197959e9) obj;
                C162457s7.A0J(r102, 1);
                C202679mP r2 = ((C195039Vq) this.A00).A00;
                int i = r102.A00;
                Bundle bundle = r102.A01;
                C191039Au r22 = (C191039Au) r2;
                HashMap A0t = AnonymousClass001.A0t();
                if (i == -1) {
                    Log.d("ActivityResult is RESULT_OK");
                    if (bundle != null) {
                        if (!TextUtils.isEmpty(bundle.getString("STEP_UP_RESPONSE", (String) null))) {
                            Log.d("Bundle contains VISA_STEP_UP_RESULT_RESPONSE");
                            A0t.put("stepupresponse", bundle.getString("STEP_UP_RESPONSE"));
                            if (bundle.containsKey("STEP_UP_AUTH_CODE")) {
                                Log.d("Bundle contains VISA_AUTHENTICATION_CODE_RESPONSE");
                                str2 = "stepupauthcode";
                                string = bundle.getString("STEP_UP_AUTH_CODE");
                            }
                        } else if (!TextUtils.isEmpty(bundle.getString("issuerMobileAppAuthResponse", (String) null))) {
                            Log.d("Bundle contains MASTERCARD_STEP_UP_RESULT_RESPONSE");
                            A0t.put("issuerMobileAppAuthResponse", bundle.getString("issuerMobileAppAuthResponse", (String) null));
                            str2 = "TAV";
                            if (bundle.containsKey(str2)) {
                                Log.d("Bundle contains MASTERCARD_AUTHENTICATION_CODE_RESPONSE");
                                string = bundle.getString(str2);
                            }
                        } else {
                            str = "ActivityResult does not contain the required params";
                            Log.d(str);
                            Log.e("PAY: FcsBRActivityResultResource/onDeeplinkActivityResult - response is NULL");
                            A0t.put("stepupresponse", "failure");
                        }
                        A0t.put(str2, string);
                    } else {
                        Log.d("extras is NULL");
                    }
                } else {
                    str = "Activity did not return RESULT_OK";
                    Log.d(str);
                    Log.e("PAY: FcsBRActivityResultResource/onDeeplinkActivityResult - response is NULL");
                    A0t.put("stepupresponse", "failure");
                }
                C47062ce r3 = r22.A01;
                String A002 = C616931w.A00("pay_verify_card", "br_p2p_verify_card", "verify_deeplink");
                C44522Wj r12 = r3.A04;
                synchronized (r12) {
                    values = r12.A00.values();
                }
                for (C161447pg r0 : values) {
                    C159127lA r23 = r0.A00;
                    if (r23 != null) {
                        AnonymousClass7SR r13 = r23.A06;
                        if ((r13 instanceof C137066ni) && (r1 = (AnonymousClass4GB) r23.A00(((C137066ni) r13).A04)) != null && r1.AwF(A002)) {
                            r1.BEt(A002, A0t);
                            return;
                        }
                    }
                }
                return;
            case 2:
                BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = (BkFcsPreloadingScreenFragment) this.A00;
                C198009eE r103 = (C198009eE) obj;
                if (bkFcsPreloadingScreenFragment.A08 != null && TextUtils.equals(r103.A01, bkFcsPreloadingScreenFragment.A05)) {
                    if (!bkFcsPreloadingScreenFragment.A09) {
                        queue = bkFcsPreloadingScreenFragment.A0A;
                        obj2 = new C200759iq(bkFcsPreloadingScreenFragment, r103);
                        break;
                    } else {
                        bkFcsPreloadingScreenFragment.A1V(r103);
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 3:
                FdsContentFragmentManager fdsContentFragmentManager = (FdsContentFragmentManager) this.A00;
                C197969eA r104 = (C197969eA) obj;
                C08310eF r4 = r104.A00;
                String str3 = r104.A01;
                if (fdsContentFragmentManager.A02) {
                    fdsContentFragmentManager.A1I(r4, str3);
                    return;
                } else if (!fdsContentFragmentManager.A0R().isFinishing()) {
                    fdsContentFragmentManager.A01.A02(fdsContentFragmentManager.A0H().getString("fds_observer_id")).A01(new C197939e7(fdsContentFragmentManager.A0R() instanceof WaFcsModalActivity));
                    queue = fdsContentFragmentManager.A03;
                    obj2 = new C201159jc(r4, fdsContentFragmentManager, str3);
                    break;
                } else {
                    return;
                }
            case 4:
                FdsContentFragmentManager fdsContentFragmentManager2 = (FdsContentFragmentManager) this.A00;
                String str4 = ((C197909e4) obj).A00;
                if (fdsContentFragmentManager2.A02) {
                    fdsContentFragmentManager2.A0T().A0z(str4);
                    return;
                } else if (!fdsContentFragmentManager2.A0R().isFinishing()) {
                    queue = fdsContentFragmentManager2.A03;
                    obj2 = new C200769ir(fdsContentFragmentManager2, str4);
                    break;
                } else {
                    return;
                }
            case 5:
                ((DialogFragment) this.A00).A1K();
                return;
            case 6:
                AnonymousClass9HW r24 = (AnonymousClass9HW) this.A00;
                C197919e5 r105 = (C197919e5) obj;
                C162457s7.A0J(r105, 1);
                List list = r105.A00;
                String str5 = r24.A04;
                if (str5 == null) {
                    throw C18270x1.A0S("stateName");
                } else if (!list.contains(str5)) {
                    r24.finish();
                    return;
                } else {
                    return;
                }
            case 7:
                C197929e6 r106 = (C197929e6) obj;
                C162457s7.A0J(r106, 1);
                ((AnonymousClass9HW) this.A00).A05 = r106.A00;
                return;
            case 8:
                C172108Jq r107 = (C172108Jq) obj;
                C162457s7.A0J(r107, 1);
                ((AnonymousClass9HW) this.A00).A03 = r107.A00;
                return;
            case 9:
                WaFcsBottomSheetModalActivity waFcsBottomSheetModalActivity = (WaFcsBottomSheetModalActivity) this.A00;
                if (!((C197919e5) obj).A00.contains(waFcsBottomSheetModalActivity.getIntent().getStringExtra("fds_state_name"))) {
                    waFcsBottomSheetModalActivity.A04.A0Q = false;
                    waFcsBottomSheetModalActivity.finish();
                    return;
                }
                return;
            default:
                C197999eD r108 = (C197999eD) obj;
                String str6 = r108.A01;
                String str7 = r108.A00;
                AnonymousClass9Hc r02 = (AnonymousClass9Hc) ((WaBloksActivity) this.A00).A05;
                C50042hX r14 = r02.A00;
                WaBloksActivity waBloksActivity = r02.A03;
                Toolbar toolbar = r02.A00;
                Objects.requireNonNull(waBloksActivity);
                r14.A01(waBloksActivity, toolbar, new C198099eN(waBloksActivity), str6, (String) null, str7);
                return;
        }
        queue.add(obj2);
    }
}
