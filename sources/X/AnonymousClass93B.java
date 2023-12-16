package X;

/* renamed from: X.93B  reason: invalid class name */
public class AnonymousClass93B implements C184408rk {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass93B(AnonymousClass5ZI r1, AnonymousClass4GQ r2, int i) {
        this.A02 = i;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSO(AnonymousClass7T4 r3, int i) {
        AnonymousClass5ZI r1;
        String str;
        switch (this.A02) {
            case 0:
                ((AnonymousClass4GQ) this.A01).invoke(new C132586fc(i));
                r1 = (AnonymousClass5ZI) this.A00;
                if (r1 != null) {
                    str = "text_search_api_business_request_end";
                    break;
                } else {
                    return;
                }
            case 1:
                ((AnonymousClass4GQ) this.A01).invoke(new C132586fc(i));
                r1 = (AnonymousClass5ZI) this.A00;
                if (r1 != null) {
                    str = "text_search_category_request_end";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r1.A09(str);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass5ZI r1;
        String str;
        switch (this.A02) {
            case 0:
                AnonymousClass7QA r3 = (AnonymousClass7QA) obj;
                C162457s7.A0J(r3, 0);
                ((AnonymousClass4GQ) this.A01).invoke(new C132596fd(r3));
                r1 = (AnonymousClass5ZI) this.A00;
                if (r1 != null) {
                    str = "text_search_api_business_request_end";
                    break;
                } else {
                    return;
                }
            case 1:
                AnonymousClass7QA r32 = (AnonymousClass7QA) obj;
                C162457s7.A0J(r32, 0);
                ((AnonymousClass4GQ) this.A01).invoke(new C132596fd(r32));
                r1 = (AnonymousClass5ZI) this.A00;
                if (r1 != null) {
                    str = "text_search_category_request_end";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r1.A09(str);
    }
}
