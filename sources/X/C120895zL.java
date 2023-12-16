package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5zL  reason: invalid class name and case insensitive filesystem */
public final class C120895zL extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ AnonymousClass7ZZ $request;
    public final /* synthetic */ C90184gr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120895zL(AnonymousClass7ZZ r2, C90184gr r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C35351wj r11;
        C35351wj r13;
        C90184gr r1 = this.this$0;
        String str = this.$iqId;
        AnonymousClass7ZZ r7 = this.$request;
        C18260x0.A0O(str, r7);
        C620433g r0 = r1.A01;
        UserJid userJid = r7.A03;
        String A01 = r0.A07.A01(userJid);
        if (A01 != null) {
            r1.A00 = r7;
        }
        C35351wj r9 = new C35351wj(AnonymousClass0x9.A0m(r7.A01), AnonymousClass0x9.A0m(r7.A00), 22);
        List list = r7.A04;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0c.add(new C35251wZ(AnonymousClass001.A0m(it), 2));
        }
        C35351wj r10 = new C35351wj((List) A0c);
        C35351wj r12 = null;
        if (A01 != null) {
            r11 = new C35351wj(A01, 20);
        } else {
            r11 = null;
        }
        C52332lJ r4 = r7.A02;
        if (r4 != null) {
            r12 = new C35351wj(C73723fy.A0A(",", r4.A02, C175608Za.A00), 24);
            r13 = new C35351wj(AnonymousClass0x9.A0m(r4.A01), AnonymousClass0x9.A0m(r4.A00), 25);
        } else {
            r13 = null;
        }
        return new C35721xK(userJid, r9, r10, r11, r12, r13, new C35351wj(new C35351wj(str, 19)));
    }
}
