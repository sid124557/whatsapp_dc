package X;

/* renamed from: X.92j  reason: invalid class name and case insensitive filesystem */
public class C1897192j implements C181848nR, AnonymousClass4C4 {
    public Object A00;
    public final int A01;

    public C1897192j(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C834048g B7u() {
        Class cls;
        String str;
        String str2;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            cls = C152717a0.class;
            str = "onSelected";
            str2 = "onSelected(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
        } else {
            cls = C125206Gt.class;
            str = "setSelectedVariant";
            str2 = "setSelectedVariant(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
        }
        return new AnonymousClass8V2(3, obj, cls, str, str2, 0);
    }

    public final void BGq(C165977xw r7, C166107y9 r8, int i) {
        AnonymousClass4UC r1;
        Boolean bool;
        int i2 = this.A01;
        C162457s7.A0J(r8, 1);
        if (i2 != 0) {
            C152717a0 r5 = (C152717a0) this.A00;
            C165977xw A012 = C154217co.A01(r8, i);
            AnonymousClass7TW r3 = r5.A06;
            if (r3 == null) {
                throw C18270x1.A0S("titleController");
            }
            String str = A012.A01;
            C166027y1 A002 = C154217co.A00(A012, r7, r8.A02);
            boolean z = false;
            if (A002 != null && A002.A02) {
                z = true;
            }
            r3.A00(str, z);
            r5.A04.BGq(r7, r8, i);
            return;
        }
        C125206Gt r2 = (C125206Gt) this.A00;
        C165977xw A013 = C154217co.A01(r8, i);
        if (C154217co.A00(A013, r7, r8.A02) == null && r8.A03.get(A013) == null) {
            r1 = r2.A02;
            bool = Boolean.TRUE;
        } else {
            C06270Wx.A04(r2.A01, i);
            r1 = r2.A02;
            bool = Boolean.FALSE;
        }
        r1.A0G(bool);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C181848nR) || !(obj instanceof AnonymousClass4C4)) {
            return false;
        }
        return C162457s7.A0P(B7u(), ((AnonymousClass4C4) obj).B7u());
    }

    public final int hashCode() {
        return B7u().hashCode();
    }
}
