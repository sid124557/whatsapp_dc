package X;

import com.whatsapp.biz.catalog.view.CatalogMediaCard;

/* renamed from: X.6Ac  reason: invalid class name and case insensitive filesystem */
public class C123876Ac implements C183228ph {
    public Object A00;
    public Object A01;
    public final int A02;

    public C123876Ac(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTK(C91794l6 r11, int i) {
        C91794l6 r5 = r11;
        if (this.A02 != 0) {
            AnonymousClass5R5 r4 = (AnonymousClass5R5) this.A01;
            r4.A0E.A09(r11, (C624134x) this.A00, new C100625Bq(r4, i, 0));
            return;
        }
        CatalogMediaCard catalogMediaCard = (CatalogMediaCard) this.A00;
        C109015dw r1 = (C109015dw) this.A01;
        if (!r1.A02()) {
            r11.setTag(r1.A0F);
            catalogMediaCard.A03.A02(r5, (C108815db) r1.A07.get(0), new AnonymousClass90T(r11, 1), new AnonymousClass93V(r11, 0), 2);
            return;
        }
        C1448873i.A00(r11);
    }
}
