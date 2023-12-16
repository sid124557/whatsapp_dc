package X;

import android.text.TextUtils;
import com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.35F  reason: invalid class name */
public final class AnonymousClass35F {
    public static final Set A00;
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[5];
        boolean A1Y = C18300x5.A1Y(numArr, 401);
        numArr[1] = 402;
        numArr[2] = 403;
        numArr[3] = 419;
        numArr[4] = 420;
        A01 = Collections.unmodifiableSet(C18280x3.A0h(numArr));
        Integer[] numArr2 = new Integer[5];
        AnonymousClass000.A1P(numArr2, 405, A1Y ? 1 : 0);
        AnonymousClass000.A1P(numArr2, 416, 1);
        AnonymousClass000.A1P(numArr2, 417, 2);
        AnonymousClass000.A1P(numArr2, 418, 3);
        AnonymousClass000.A1P(numArr2, 421, 4);
        A00 = Collections.unmodifiableSet(C18280x3.A0h(numArr2));
    }

    public static AnonymousClass4DV A00(C66543Lv r9, C95814uZ r10, AnonymousClass33Y r11, AnonymousClass1EU r12, C624134x r13, boolean z) {
        AnonymousClass39S r1;
        try {
            String A03 = C626535y.A03(r12);
            if (A03 != null) {
                JSONObject A1H = AnonymousClass0x9.A1H(A03);
                String string = A1H.getString("reference_id");
                String A02 = C624935g.A02(A03);
                if (A02 != null) {
                    String optString = A1H.getJSONObject("order").optString("description");
                    Iterator it = r9.A1B.A03(r10).iterator();
                    while (it.hasNext()) {
                        C624134x A0T = C18300x5.A0T(it);
                        if (A0T instanceof AnonymousClass4DV) {
                            AnonymousClass4DV r2 = (AnonymousClass4DV) A0T;
                            AnonymousClass39W B5s = r2.B5s();
                            if (!(B5s == null || (r1 = B5s.A01) == null || !string.equals(r1.A0E))) {
                                int A002 = AnonymousClass39S.A00(r1.A07.A01);
                                int A003 = AnonymousClass39S.A00(A02);
                                Set set = (Set) AnonymousClass001.A0i(AnonymousClass39S.A0N, A002);
                                if (set == null || !C18300x5.A1X(set, A003)) {
                                    C49712gy r3 = r11.A02;
                                    AnonymousClass2z0 r0 = r13.A1J;
                                    r3.A02(new SendOrderStatusUpdateFailureReceiptJob(AnonymousClass2z0.A01(r0), r0.A01));
                                    throw AnonymousClass24W.A00(0);
                                }
                                AnonymousClass39S r5 = B5s.A01;
                                r5.A07.A01 = A02;
                                if (z && A02.equals("payment_requested") && r5.A03.equals("captured")) {
                                    r5.A03 = "pending";
                                    r5.A00 = System.currentTimeMillis();
                                }
                                if (!TextUtils.isEmpty(optString)) {
                                    B5s.A01.A07.A00 = optString;
                                }
                                r9.A0Y((C624134x) r2);
                                return r2;
                            }
                        } else {
                            Log.e(C624134x.A0C(A0T, "InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ", AnonymousClass001.A0o()));
                        }
                    }
                    C18260x0.A0r("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage can not find origin checkout NFM with reference id: ", string, AnonymousClass001.A0o());
                }
            }
            return null;
        } catch (JSONException e) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage failed to parse parameters json", e);
            return null;
        }
    }

    public static AnonymousClass4DV A01(C66543Lv r12, C95814uZ r13, AnonymousClass1EU r14, boolean z) {
        AnonymousClass39S r0;
        try {
            String A03 = C626535y.A03(r14);
            if (A03 != null) {
                String string = AnonymousClass0x9.A1H(A03).getString("reference_id");
                JSONObject A1H = AnonymousClass0x9.A1H(A03);
                long A06 = C18320x8.A06("payment_timestamp", A1H);
                String optString = A1H.optString("payment_status");
                String optString2 = A1H.optString("payment_method");
                Iterator it = r12.A1B.A03(r13).iterator();
                while (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    if (A0T instanceof AnonymousClass4DV) {
                        AnonymousClass4DV r5 = (AnonymousClass4DV) A0T;
                        AnonymousClass39W B5s = r5.B5s();
                        if (!(B5s == null || (r0 = B5s.A01) == null || !string.equals(r0.A0E))) {
                            if (!TextUtils.isEmpty(optString)) {
                                AnonymousClass39S r9 = B5s.A01;
                                r9.A03 = optString;
                                if (z) {
                                    if (optString.equals("captured")) {
                                        AnonymousClass39H r3 = r9.A07;
                                        if (r3.A01.equals("payment_requested")) {
                                            r3.A01 = "preparing_to_ship";
                                        }
                                    }
                                    if (optString.equals("pending")) {
                                        AnonymousClass39H r32 = r9.A07;
                                        if (r32.A01.equals("preparing_to_ship")) {
                                            r32.A01 = "payment_requested";
                                        }
                                    }
                                }
                            }
                            if (A06 > 0) {
                                B5s.A01.A00 = A06;
                            }
                            if (!TextUtils.isEmpty(optString2)) {
                                B5s.A01.A02 = optString2;
                            }
                            r12.A0Y((C624134x) r5);
                            return r5;
                        }
                    } else {
                        Log.e(C624134x.A0C(A0T, "InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ", AnonymousClass001.A0o()));
                    }
                }
                C18260x0.A0r("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage can not find origin checkout NFM with reference id: ", string, AnonymousClass001.A0o());
            }
            return null;
        } catch (JSONException e) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage failed to parse parameters json", e);
            return null;
        }
    }

    public static void A02(C69263Wi r10, C66543Lv r11, AnonymousClass36F r12, C837549q r13, C84504Cp r14, AnonymousClass4DV r15, AnonymousClass4FS r16) {
        AnonymousClass39S r0;
        Set set;
        AnonymousClass4DV r7 = r15;
        AnonymousClass39W B5s = r15.B5s();
        C84504Cp r6 = r14;
        if (!(B5s == null || (r0 = B5s.A01) == null)) {
            AnonymousClass39H r02 = r0.A07;
            AnonymousClass393 r1 = r02.A02;
            int A002 = AnonymousClass39S.A00(r02.A01);
            if (r1 != null && r1.A00 <= C18280x3.A07() && (set = (Set) AnonymousClass001.A0i(AnonymousClass39S.A0N, A002)) != null && C18300x5.A1X(set, 4)) {
                String str = r15.B5s().A01.A04;
                C66543Lv r3 = r11;
                AnonymousClass4FS r8 = r16;
                if (TextUtils.isEmpty(str)) {
                    C71343bx.A00(r8, r15, r11, 23);
                    r14.BcX();
                    return;
                }
                r8.BkM(new C71693cW(r10, r3, r12, r13, r6, r7, r8, str));
                return;
            }
        }
        r14.BcU();
    }
}
