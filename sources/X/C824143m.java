package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.43m  reason: invalid class name and case insensitive filesystem */
public final class C824143m extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C72183dJ $callbackFuture;
    public final /* synthetic */ AnonymousClass47V this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C824143m(AnonymousClass47V r2, C72183dJ r3) {
        super(1);
        this.this$0 = r2;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass29w r11 = (AnonymousClass29w) obj;
        C162457s7.A0J(r11, 0);
        AnonymousClass47V r4 = this.this$0;
        C72183dJ r3 = this.$callbackFuture;
        if (r11 instanceof C36721zm) {
            C60802zB r7 = (C60802zB) ((C36721zm) r11).A01;
            Map map = r7.A03;
            if (!map.isEmpty()) {
                C55682qk r9 = r4.A00;
                if (r9 != null) {
                    String A00 = AnonymousClass47V.A00("GroupInfoBatchProcessor/FetchTruncatedGroupJob some groups\n          | failed to be fetched due to errors");
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Failed: ");
                    AnonymousClass0x7.A1H(A0o, map);
                    A0o.append(", Errors: [");
                    A0o.append(C73723fy.A0A(", ", map.values(), AnonymousClass451.A00));
                    r9.A0A(A00, false, AnonymousClass0x2.A0f(A0o));
                } else {
                    throw C18270x1.A0S("crashLogs");
                }
            }
            C49052fu r5 = r4.A03;
            if (r5 != null) {
                Set A002 = r5.A00(r7.A02, r4.round, r4.params);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/sent fetched group info for further\n                | processing; round=");
                Log.d(AnonymousClass47V.A00(AnonymousClass000.A0h(A0o2, r4.round)));
                r3.BQt(A002);
            } else {
                throw C18270x1.A0S("groupInfoProcessor");
            }
        } else if (r11 instanceof C36711zl) {
            C36711zl r112 = (C36711zl) r11;
            C823943k r1 = new C823943k(r4, r3);
            if (r112 instanceof C36691zj) {
                r1.invoke(((C36691zj) r112).A01);
            }
            C824043l r12 = new C824043l(r4, r3);
            if (r112 instanceof C36701zk) {
                r12.invoke(((C36701zk) r112).A01);
            }
        }
        return C59022wD.A00;
    }
}
