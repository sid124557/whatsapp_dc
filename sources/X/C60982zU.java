package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2zU  reason: invalid class name and case insensitive filesystem */
public class C60982zU {
    public C59812xW A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass227 A05;
    public final List A06 = AnonymousClass001.A0s();
    public final Set A07 = AnonymousClass002.A0K();

    public static C61272zz A00(C60982zU r3, C59812xW r4, byte[] bArr) {
        r3.A00 = r4;
        List list = r3.A06;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Arrays.equals((byte[]) it.next(), bArr)) {
                    break;
                }
            } else {
                list.add(bArr);
                break;
            }
        }
        return r3.A02();
    }

    public C61272zz A02() {
        if (this.A00.A00()) {
            return new C61272zz(this);
        }
        throw AnonymousClass001.A0c("none of the syncs protocols enabled");
    }

    public C60982zU(AnonymousClass227 r2) {
        this.A05 = r2;
    }

    public static /* synthetic */ void A01(C60982zU r5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            List list2 = r5.A06;
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Arrays.equals((byte[]) it2.next(), bArr)) {
                        break;
                    }
                } else {
                    list2.add(bArr);
                    break;
                }
            }
        }
    }
}
