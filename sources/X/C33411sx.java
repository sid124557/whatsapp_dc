package X;

import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1sx  reason: invalid class name and case insensitive filesystem */
public class C33411sx extends AnonymousClass5ZM {
    public WeakReference A00;
    public final C116985rC A01;
    public final C29041iB A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C41352Jx r6 = (C41352Jx) obj;
        AnonymousClass49V r1 = (AnonymousClass49V) this.A00.get();
        if (r1 != null) {
            List list = r6.A00;
            List list2 = r6.A01;
            AnonymousClass4IP r12 = (AnonymousClass4IP) r1;
            int i = r12.A01;
            Object obj2 = r12.A00;
            if (i != 0) {
                C08310eF r2 = (C08310eF) obj2;
                C003203q A0Q = r2.A0Q();
                if (A0Q != null && !A0Q.isFinishing()) {
                    r2.A0m(C57112t6.A01(r2.A0Q(), 1));
                    return;
                }
                return;
            }
            LinkedDevicesViewModel linkedDevicesViewModel = (LinkedDevicesViewModel) obj2;
            linkedDevicesViewModel.A00 = list;
            linkedDevicesViewModel.A07.A0H((Object) null);
            if (!list.isEmpty() || !list2.isEmpty()) {
                linkedDevicesViewModel.A09.A0H(list);
                linkedDevicesViewModel.A08.A0H(list2);
                return;
            }
            linkedDevicesViewModel.A06.A0H((Object) null);
        }
    }

    public C33411sx(C116985rC r2, AnonymousClass49V r3, C29041iB r4) {
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        int i2;
        List emptyList = Collections.emptyList();
        C116985rC r1 = this.A01;
        ArrayList arrayList = emptyList;
        if (r1.A07()) {
            C46022ax r4 = (C46022ax) r1.A04();
            if (!AnonymousClass2OK.A00(r4.A01)) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                C60692yy r3 = r4.A03;
                Iterator it = r3.A02().iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    AnonymousClass2LA r12 = r4.A02;
                    Number number = (Number) r12.A01.get(A0m);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = R.string.f11nameremoved;
                    }
                    Number number2 = (Number) r12.A00.get(A0m);
                    if (number2 != null) {
                        i2 = number2.intValue();
                    } else {
                        i2 = R.drawable.device_list_ic_unknown_device;
                    }
                    A0s.add(new AnonymousClass2QC(i, i2, A0m, AnonymousClass0x2.A0B(r3.A01(), C60692yy.A00(A0m, "metadata/last_active_time"))));
                }
                arrayList = A0s;
            }
        }
        C29041iB r7 = this.A02;
        List A0C = r7.A0C();
        Collections.sort(A0C, r7.A02);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0C.iterator();
        long A0H = r7.A0D.A0H();
        int i3 = 0;
        while (it2.hasNext()) {
            AnonymousClass33G r122 = (AnonymousClass33G) it2.next();
            long j = r122.A01;
            if (j > 0) {
                if (C107175ap.A00(A0H, j) > 5) {
                    it2.remove();
                    A0s2.add(r122.A07);
                } else {
                    i3++;
                }
            }
        }
        if (i3 > 20) {
            int size = A0C.size();
            ArrayList A0J = AnonymousClass002.A0J(A0C.subList(size - (i3 - 20), size));
            A0C.removeAll(A0J);
            Iterator it3 = A0J.iterator();
            while (it3.hasNext()) {
                A0s2.add(((AnonymousClass33G) it3.next()).A07);
            }
        }
        if (!A0s2.isEmpty()) {
            r7.A0K.A03(C129526aS.copyOf((Collection) A0s2));
        }
        return new C41352Jx(A0C, arrayList);
    }
}
