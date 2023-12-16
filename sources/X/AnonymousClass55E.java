package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55E  reason: invalid class name */
public class AnonymousClass55E extends AnonymousClass5ZM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C621033m A01;
    public final /* synthetic */ AnonymousClass33p A02;
    public final /* synthetic */ C28891hw A03;
    public final /* synthetic */ C97154xi A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55E(C15910sA r2, C621033m r3, AnonymousClass33p r4, C28891hw r5, C97154xi r6, WeakReference weakReference, List list, long j, boolean z) {
        super(r2, true);
        this.A06 = list;
        this.A01 = r3;
        this.A07 = z;
        this.A00 = j;
        this.A05 = weakReference;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            this.A01.A0K(C86604Kt.A0a(C18310x6.A0R(it)), this.A07);
        }
        C89654ea.A4P(this.A00, 300);
        return null;
    }

    public void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A05);
        if (A0F != null && !A0F.isFinishing()) {
            A0F.BjL();
        }
        AnonymousClass33p r5 = this.A02;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r5), "delete_chat_count");
        List list = this.A06;
        int size = A022 + list.size();
        C18260x0.A0w("wa-shared-preferences/setdeletechat ", AnonymousClass001.A0o(), size);
        C18270x1.A0h(C18270x1.A03(r5), "delete_chat_count", size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C95814uZ A0b = C86604Kt.A0b(it);
            if (A0b != null) {
                C97154xi r1 = this.A04;
                if (r1.A0I()) {
                    Iterator A032 = C61102zi.A03(r1);
                    while (A032.hasNext()) {
                        AnonymousClass5UN r12 = (AnonymousClass5UN) A032.next();
                        if (r12 instanceof C95694uG) {
                            C113245l7 r13 = ((C95694uG) r12).A00;
                            if (A0b.equals(r13.A4J)) {
                                C113245l7.A09(r13).A6m();
                            }
                        }
                    }
                }
            }
        }
        this.A03.A09(0);
    }
}
