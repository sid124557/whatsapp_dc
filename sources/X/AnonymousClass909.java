package X;

import com.whatsapp.stickers.store.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.909  reason: invalid class name */
public class AnonymousClass909 extends C56872sh {
    public Object A00;
    public final int A01;

    public AnonymousClass909(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C185748uB r0 = ((C162157rM) this.A00).A03;
                if (r0 != null) {
                    r0.BZb();
                    return;
                }
                return;
            default:
                super.A01();
                return;
        }
    }

    public void A04() {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C185748uB r1 = ((C162157rM) this.A00).A03;
                if (r1 != null) {
                    r1.BSx(false, false);
                    return;
                }
                return;
            default:
                super.A04();
                return;
        }
    }

    public void A05() {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C185748uB r0 = ((C162157rM) this.A00).A03;
                if (r0 != null) {
                    r0.BZb();
                    return;
                }
                return;
            default:
                super.A05();
                return;
        }
    }

    public void A06() {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                ((C162157rM) this.A00).A02();
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1K();
                return;
            default:
                super.A06();
                return;
        }
    }

    public void A07() {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C162157rM r1 = (C162157rM) this.A00;
                C185748uB r0 = r1.A03;
                if (r0 != null) {
                    r0.BZb();
                }
                AnonymousClass10k r02 = r1.A01;
                if (r02 != null) {
                    r02.A0D();
                    return;
                }
                return;
            default:
                super.A07();
                return;
        }
    }

    public void A08(C50612iT r8) {
        switch (this.A01) {
            case 0:
                C158927km r5 = (C158927km) this.A00;
                ArrayList<AnonymousClass3QV> A0s = AnonymousClass001.A0s();
                Iterator it = r8.A05.iterator();
                while (it.hasNext()) {
                    A0s.add(new AnonymousClass3QV(AnonymousClass0x7.A0b(it), r5.A0V));
                }
                Map map = r5.A0b;
                String str = r8.A0G;
                map.put(str, r8);
                r5.A0G.A01(A0s);
                r5.A0c.put(str, A0s);
                for (AnonymousClass3QV r2 : A0s) {
                    r5.A0g.put(r2.BDW(), r2);
                }
                AnonymousClass6Hm r3 = r5.A0J;
                LinkedHashMap linkedHashMap = r3.A03;
                LinkedHashMap A0r = C18320x8.A0r();
                r3.A03 = A0r;
                A0r.put(str, r3.A0L(r8));
                r3.A03.putAll(linkedHashMap);
                r3.A0N();
                r3.A09(r3.A04.size(), r3.A0G() - r3.A04.size());
                r3.A0O();
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1N(r8);
                return;
            default:
                C162157rM r32 = (C162157rM) this.A00;
                HashMap hashMap = r32.A0G;
                String str2 = r8.A0G;
                hashMap.remove(str2);
                r32.A0H.remove(str2);
                if (r32.A04 != null) {
                    int i = 0;
                    while (true) {
                        int size = r32.A04.size();
                        List list = r32.A04;
                        if (i >= size) {
                            list.add(r8);
                            Collections.sort(r32.A04, new C71843cl());
                        } else if (((C50612iT) list.get(i)).A0G.equals(str2)) {
                            r32.A04.set(i, r8);
                        } else {
                            i++;
                        }
                    }
                    r32.A04((String) null, r32.A04);
                } else {
                    r32.A02();
                }
                r32.A03();
                return;
        }
    }

    public void A09(C50612iT r4) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C162157rM r2 = (C162157rM) this.A00;
                r2.A0H.put(r4.A0G, r4);
                List list = r2.A04;
                if (list != null) {
                    r2.A04((String) null, list);
                    return;
                }
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1O(r4);
                return;
            default:
                super.A09(r4);
                return;
        }
    }

    public void A0A(C50612iT r2) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C185748uB r0 = ((C162157rM) this.A00).A03;
                if (r0 != null) {
                    r0.Bch(r2);
                    return;
                }
                return;
            default:
                super.A0A(r2);
                return;
        }
    }

    public void A0B(String str) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C162157rM r2 = (C162157rM) this.A00;
                r2.A0G.remove(str);
                r2.A0H.remove(str);
                List list = r2.A04;
                if (list != null) {
                    r2.A04((String) null, list);
                    return;
                }
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1R(str);
                return;
            default:
                super.A0B(str);
                return;
        }
    }

    public void A0C(String str) {
        switch (this.A01) {
            case 0:
                C158927km r9 = (C158927km) this.A00;
                r9.A0b.remove(str);
                Map map = r9.A0c;
                Collection<C85164Fe> collection = (Collection) map.get(str);
                if (collection != null) {
                    C67513Po r7 = r9.A0G;
                    synchronized (r7) {
                        for (C85164Fe r5 : collection) {
                            for (C106655Zv r1 : r5.B7I()) {
                                Collection collection2 = (Collection) r7.A04.get(r1);
                                if (collection2 != null) {
                                    collection2.remove(r5);
                                }
                            }
                        }
                    }
                }
                map.remove(str);
                r9.A0J.A0P(str);
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1S(str);
                return;
            default:
                C162157rM r3 = (C162157rM) this.A00;
                if (r3.A04 != null) {
                    boolean z = false;
                    for (int i = 0; i < r3.A04.size(); i++) {
                        if (((C50612iT) r3.A04.get(i)).A0G.equals(str)) {
                            r3.A04.remove(i);
                            z = true;
                        }
                    }
                    if (z) {
                        r3.A04((String) null, r3.A04);
                    }
                }
                r3.A03();
                AnonymousClass10k r0 = r3.A01;
                if (r0 != null) {
                    r0.A0D();
                    return;
                }
                return;
        }
    }

    public void A0D(String str, int i) {
        List list;
        String str2 = str;
        int i2 = i;
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C162157rM r0 = (C162157rM) this.A00;
                C185748uB r1 = r0.A03;
                if (r1 != null && (list = r0.A04) != null) {
                    r1.Bce(str2, r0.A0H, r0.A0G, r0.A0I, list, i2);
                    return;
                }
                return;
            default:
                super.A0D(str, i);
                return;
        }
    }

    public void A0E(String str, String str2) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                ((C162157rM) this.A00).A02();
                return;
            case 4:
                ((StickerStoreTabFragment) this.A00).A1L();
                return;
            default:
                super.A0E(str, str2);
                return;
        }
    }

    public void A0F(Collection collection, boolean z) {
        switch (this.A01) {
            case 0:
                C158927km r1 = (C158927km) this.A00;
                r1.A01(collection, true);
                r1.A0J.A0M();
                return;
            case 1:
            case 2:
            case 3:
                C185748uB r12 = ((C162157rM) this.A00).A03;
                if (r12 != null) {
                    r12.BSx(true, z);
                    return;
                }
                return;
            default:
                super.A0F(collection, z);
                return;
        }
    }

    public void A0G(Collection collection, boolean z) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                C162157rM r2 = (C162157rM) this.A00;
                C185748uB r1 = r2.A03;
                if (r1 != null) {
                    r1.BSx(true, z);
                }
                AnonymousClass10k r0 = r2.A01;
                if (r0 != null) {
                    r0.A0D();
                    return;
                }
                return;
            default:
                super.A0G(collection, z);
                return;
        }
    }
}
