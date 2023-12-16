package X;

/* renamed from: X.5oc  reason: invalid class name and case insensitive filesystem */
public class C115405oc implements AnonymousClass66C {
    public final /* synthetic */ AnonymousClass5OW A00;
    public final /* synthetic */ AnonymousClass3ZH A01;

    public C115405oc(AnonymousClass5OW r1, AnonymousClass3ZH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void B27(AnonymousClass30Y r4) {
        String str;
        AnonymousClass3ZH r1 = this.A01;
        if (r1.A0U()) {
            int A03 = this.A00.A02.A09.A03((C28011fL) AnonymousClass3ZH.A05(r1, C27991fJ.class));
            if (A03 < 32) {
                str = "GROUP_32";
            } else if (A03 < 64) {
                str = "GROUP_64";
            } else if (A03 < 128) {
                str = "GROUP_128";
            } else if (A03 < 256) {
                str = "GROUP_256";
            } else if (A03 < 512) {
                str = "GROUP_512";
            } else {
                str = "GROUP_MORE_512";
            }
        } else if (r1.A0H instanceof C95804uY) {
            str = "newsletter";
        } else {
            str = "one_to_one";
        }
        r4.A00(str.length(), "type_of_chat", str);
    }

    public String B9C() {
        return "type_of_chat";
    }
}
