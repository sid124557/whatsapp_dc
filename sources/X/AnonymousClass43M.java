package X;

import com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.43M  reason: invalid class name */
public final class AnonymousClass43M extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C43702Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43M(C43702Td r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2 = (String) obj;
        C162457s7.A0H(str2);
        String A00 = AnonymousClass2AB.A00(str2);
        int length = A00.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (A00.charAt(i) != '@') {
                    str = A00.substring(i);
                    C162457s7.A0D(str);
                    break;
                }
                i++;
            } else {
                str = "";
                break;
            }
        }
        C85474Gj r0 = this.this$0.A01;
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        this.this$0.A02.A0G(C72023d3.A00);
        C116975rB r1 = AnonymousClass2BK.A00;
        C162457s7.A0J(str, 0);
        if (C18280x3.A1X(str, r1.nativePattern)) {
            C43702Td r3 = this.this$0;
            r3.A01 = C616131n.A02((C85494Gl) null, new UsernameSearchManager$setSearchSource$2$1(r3, str, (C84814Du) null), r3.A08, (AnonymousClass20D) null, 3);
        }
        return C59022wD.A00;
    }
}
