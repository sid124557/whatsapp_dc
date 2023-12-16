package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.999  reason: invalid class name */
public class AnonymousClass999 extends AnonymousClass9Gf {
    public final AnonymousClass8EA A00;
    public final String A01;
    public final Set A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0A = this.A00.A0A();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0A) {
            if (!this.A02.contains(next)) {
                A0s.add(next);
            }
        }
        Set set = this.A02;
        A0s.addAll(set);
        AnonymousClass9O5 A0G = A0G(this.A01, A0s);
        ArrayList A0I = AnonymousClass002.A0I(set.size());
        for (Object next2 : A0G.A00) {
            if (set.contains(next2)) {
                A0I.add(next2);
            }
        }
        return new AnonymousClass9O5(A0I, A0G.A01);
    }

    public AnonymousClass999(C202439m1 r3, AnonymousClass8EA r4, PaymentConfiguration paymentConfiguration, AnonymousClass4FS r6, String str, List list) {
        super(r3, r4, paymentConfiguration, r6);
        this.A00 = r4;
        TreeSet treeSet = new TreeSet(new C204579pa(0));
        this.A02 = treeSet;
        treeSet.addAll(list);
        this.A01 = str;
    }
}
