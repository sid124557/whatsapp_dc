package X;

/* renamed from: X.5S3  reason: invalid class name */
public abstract class AnonymousClass5S3 {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;
    public final C45682aP A02;

    public int A00() {
        if (this instanceof C90084fo) {
            return 11515;
        }
        if (this instanceof C90074fn) {
            return 11435;
        }
        return 11114;
    }

    public final C833748d A01() {
        String str;
        C45682aP r1 = this.A02;
        int A002 = A00();
        if (this instanceof C90084fo) {
            str = "whatsapp_banner_profile";
        } else if (this instanceof C90074fn) {
            str = "whatsapp_banner_group_info";
        } else {
            str = "whatsapp_banner_chat_list";
        }
        C162457s7.A0J(str, 1);
        return r1.A00.A00((C833648c) null, str, A002);
    }

    public AnonymousClass5S3(AnonymousClass1VX r1, AnonymousClass4FV r2, C45682aP r3) {
        C18260x0.A0S(r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
