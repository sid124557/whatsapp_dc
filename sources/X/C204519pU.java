package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9pU  reason: invalid class name and case insensitive filesystem */
public class C204519pU implements AnonymousClass4EY {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204519pU(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Ba4(AnonymousClass34V r7) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass9QG) this.A00).A0E.A05("handlePaymentMethodUpdate: sendGetPaymentMethods request error");
                return;
            case 1:
                ((AnonymousClass7SP) this.A01).A00.invoke();
                return;
            case 2:
                C18260x0.A1R(AnonymousClass001.A0o(), "IndiaUpiPaymentSettingsFragment/onDeleteAccount onRequestError: ", r7);
                Activity activity = (Activity) this.A01;
                if (activity instanceof C89654ea) {
                    C89654ea r1 = (C89654ea) activity;
                    r1.BjL();
                    r1.Bot(R.string.f11nameremoved);
                    return;
                }
                return;
            case 5:
                AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A00;
                r3.A0L.A04(AnonymousClass000.A0P(r7, "removePayment/onRequestError. paymentNetworkError: ", AnonymousClass001.A0o()));
                C203499no r12 = (C203499no) this.A01;
                if (r12 != null) {
                    r12.BK0(r7, 13);
                }
                r3.BjL();
                r3.Bot(R.string.f11nameremoved);
                return;
            case 6:
                C194399Ss r32 = (C194399Ss) this.A00;
                r32.A0G.A04(AnonymousClass000.A0P(r7, "onClosePaymentAccountConfirmed/onRequestError. paymentNetworkError: ", AnonymousClass001.A0o()));
                r32.A0C.A01((Context) this.A01, r32.A0B, r32.A0F, r7.A00, R.string.f11nameremoved).show();
                return;
            case 7:
                C1899593h.A1H(((AnonymousClass94y) this.A00).A0f, r7, "syncPendingTransaction onRequestError: ", AnonymousClass001.A0o());
                C203499no r13 = (C203499no) this.A01;
                if (r13 != null) {
                    r13.BK0(r7, 10);
                    return;
                }
                return;
            default:
                AnonymousClass9Bw.A0c((C52792m3) this.A01, (Map) null, r7.A00);
                return;
        }
    }

    public void BaB(AnonymousClass34V r7) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass9QG) this.A00).A0E.A05("handlePaymentMethodUpdate: sendGetPaymentMethods response error");
                return;
            case 1:
                ((AnonymousClass7SP) this.A01).A00.invoke();
                return;
            case 2:
                C18260x0.A1R(AnonymousClass001.A0o(), "IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseError: ", r7);
                Activity activity = (Activity) this.A01;
                if (activity instanceof C89654ea) {
                    C89654ea r1 = (C89654ea) activity;
                    r1.BjL();
                    r1.Bot(R.string.f11nameremoved);
                    return;
                }
                return;
            case 5:
                AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A00;
                C1899593h.A1H(r3.A0L, r7, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o());
                C203499no r12 = (C203499no) this.A01;
                if (r12 != null) {
                    r12.BK0(r7, 13);
                }
                r3.BjL();
                r3.Bot(R.string.f11nameremoved);
                return;
            case 6:
                C194399Ss r32 = (C194399Ss) this.A00;
                C1899593h.A1H(r32.A0G, r7, "onClosePaymentAccountConfirmed/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o());
                C89654ea r13 = (C89654ea) this.A01;
                r13.BjL();
                r32.A0C.A01(r13, r32.A0B, r32.A0F, r7.A00, R.string.f11nameremoved).show();
                return;
            case 7:
                C1899593h.A1H(((AnonymousClass94y) this.A00).A0f, r7, "syncPendingTransaction onResponseError: ", AnonymousClass001.A0o());
                C203499no r14 = (C203499no) this.A01;
                if (r14 != null) {
                    r14.BK0(r7, 10);
                    return;
                }
                return;
            default:
                AnonymousClass9Bw.A0c((C52792m3) this.A01, (Map) null, r7.A00);
                return;
        }
    }

    public void BaC(AnonymousClass2Oi r7) {
        AnonymousClass4GP r0;
        switch (this.A02) {
            case 0:
                ((AnonymousClass9QG) this.A00).A01.A0S(new C200049hh(this, (AnonymousClass36K) this.A01));
                return;
            case 1:
                List list = ((C190859Ac) r7).A00;
                if (list.isEmpty()) {
                    r0 = ((AnonymousClass7SP) this.A01).A00;
                } else {
                    AnonymousClass7SP r5 = (AnonymousClass7SP) this.A01;
                    if (((C194529Tg) this.A00).A03.A0B.A02.A0X(4781)) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        Iterator it = list.iterator();
                        C133706ho r2 = null;
                        while (it.hasNext()) {
                            C166587yw A0C = C1899693i.A0C(it);
                            if (A0C instanceof C133706ho) {
                                r2 = (C133706ho) A0C;
                            } else if (A0C instanceof C133726hq) {
                                A0s.add(A0C);
                            }
                        }
                        if (r2 != null || !A0s.isEmpty()) {
                            r5.A00(r2);
                            return;
                        }
                    } else {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C166587yw A0C2 = C1899693i.A0C(it2);
                            if (A0C2 instanceof C133706ho) {
                                r5.A00((C133706ho) A0C2);
                                return;
                            }
                        }
                    }
                    r0 = r5.A00;
                }
                r0.invoke();
                return;
            case 2:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("IndiaUpiPaymentSettingsFragment/onDeleteAccount onResponseSuccess: ");
                A0o.append(r7.A02);
                C18280x3.A14(A0o);
                if (r7.A02) {
                    IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A00;
                    indiaUpiPaymentSettingsFragment.A0n.A0L(true, true);
                    indiaUpiPaymentSettingsFragment.A1p();
                }
                Activity activity = (Activity) this.A01;
                if (activity instanceof C89654ea) {
                    ((C89654ea) activity).BjL();
                    return;
                }
                return;
            case 5:
                AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A00;
                r3.A0L.A06("removePayment Success");
                C203499no r22 = (C203499no) this.A01;
                if (r22 != null) {
                    r22.BK0((AnonymousClass34V) null, 13);
                }
                r3.BjL();
                r3.Bot(R.string.f11nameremoved);
                return;
            case 6:
                C194399Ss r23 = (C194399Ss) this.A00;
                r23.A0G.A06("onClosePaymentAccountConfirmed/onResponseSuccess");
                C89654ea r32 = (C89654ea) this.A01;
                r32.BjL();
                C18270x1.A0l(C620933l.A00(r23.A04), "payment_brazil_nux_dismissed", true);
                C621433s.A01(r32, 100);
                return;
            case 7:
                ((AnonymousClass94y) this.A00).A0f.A06("syncPendingTransaction onResponseSuccess");
                C203499no r24 = (C203499no) this.A01;
                if (r24 != null) {
                    r24.BK0((AnonymousClass34V) null, 10);
                    return;
                }
                return;
            default:
                ((C52792m3) this.A01).A00("on_success");
                return;
        }
    }
}
