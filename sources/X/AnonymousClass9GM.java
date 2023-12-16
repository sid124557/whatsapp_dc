package X;

import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9GM  reason: invalid class name */
public class AnonymousClass9GM extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass9Bs A00;

    public AnonymousClass9GM(AnonymousClass9Bs r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass9U4.A08(this.A00.A0P);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C166587yw A0D;
        C133796hx r0;
        int i;
        List list = (List) obj;
        if (list == null || list.size() == 0) {
            AnonymousClass9Bs r2 = this.A00;
            r2.A0f.A06("PopulateMethodsForSend could not find methods;");
            r2.finish();
            return;
        }
        AnonymousClass9Bs r3 = this.A00;
        C160757oG r4 = r3.A0f;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("onPostExecute got methods: ", A0o, list);
        C1899593h.A1F(r4, A0o);
        List A07 = C166587yw.A07(r3.A0N.A02(), list);
        r3.A0i = A07;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("onPostExecute got paymentMethodList for store: ");
        r4.A04(AnonymousClass000.A0R(AnonymousClass0x9.A0l(A07), A0o2));
        List list2 = r3.A0i;
        if (list2 != null && list2.size() > 0) {
            boolean z = false;
            if (r3.A0B != null) {
                Iterator it = r3.A0i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C166587yw A0C = C1899693i.A0C(it);
                    if (A0C.A0A.equals(r3.A0B.A0A)) {
                        r3.A0i.remove(A0C);
                        break;
                    }
                }
                r3.A0i.add(0, r3.A0B);
            } else {
                if (AnonymousClass9DC.A17(r3)) {
                    List list3 = r3.A0i;
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            A0D = AnonymousClass8EA.A01(list3);
                            break;
                        }
                        A0D = C1899693i.A0C(it2);
                        if ((A0D instanceof C133686hm) && (r0 = A0D.A08) != null && ((AnonymousClass99H) r0).A0H) {
                            break;
                        }
                    }
                } else {
                    A0D = C1899693i.A0D(r3.A0i, 0);
                }
                r3.A0B = A0D;
            }
            if (r3.A0U != null) {
                Iterator it3 = r3.A0i.iterator();
                while (it3.hasNext()) {
                    C166587yw A0C2 = C1899693i.A0C(it3);
                    C158757kV r02 = r3.A0H;
                    String str = A0C2.A0A;
                    C162457s7.A0J(str, 0);
                    if (!((Map) r02.A02.getValue()).containsKey(str)) {
                        r3.A0i.remove(A0C2);
                    }
                }
            }
            PaymentView paymentView = r3.A0N;
            if (paymentView != null) {
                paymentView.setBankLogo(r3.A0B.A09());
                PaymentView paymentView2 = r3.A0N;
                C158777kX r7 = r3.A0K;
                List list4 = r3.A0i;
                C166587yw r42 = r3.A0B;
                if (r42 != null) {
                    i = 0;
                    while (true) {
                        if (i < list4.size()) {
                            if (C1899693i.A0D(list4, i).A0A.equals(r42.A0A)) {
                                break;
                            }
                            i++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                } else {
                    i = C195169Wk.A01(list4);
                }
                C166587yw A0D2 = C1899693i.A0D(list4, i);
                C162457s7.A0J(A0D2, 0);
                paymentView2.setPaymentMethodText(r7.A02(A0D2, true));
                PaymentView paymentView3 = r3.A0N;
                if (r3.A0B == null) {
                    z = true;
                }
                paymentView3.A0F(z);
                PaymentView paymentView4 = r3.A0N;
                if (paymentView4.A00 != 1) {
                    paymentView4.A08();
                }
            }
        }
        r3.A0J = null;
    }
}
