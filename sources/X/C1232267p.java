package X;

import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.67p  reason: invalid class name and case insensitive filesystem */
public class C1232267p extends C88674aZ {
    public Object A00;
    public final int A01;

    public C1232267p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        switch (this.A01) {
            case 0:
                ((ContactPickerFragment) this.A00).A2T.A00();
                return;
            case 1:
                C110065fd r1 = (C110065fd) this.A00;
                r1.A03(0);
                r1.A05.clear();
                return;
            default:
                AnonymousClass5YA r2 = (AnonymousClass5YA) this.A00;
                ((C105945Xa) C18300x5.A0b(r2.A0C)).A02("status_fragment");
                C86644Kx.A0c(r2.A0J).A07("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
                return;
        }
    }
}
