package X;

import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.63I  reason: invalid class name */
public final class AnonymousClass63I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C96974xP $adapter;
    public final /* synthetic */ WaTextView $titleTextView;
    public final /* synthetic */ AnonymousClass4ZS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63I(WaTextView waTextView, C96974xP r3, AnonymousClass4ZS r4) {
        super(1);
        this.this$0 = r4;
        this.$titleTextView = waTextView;
        this.$adapter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7YL r6 = (AnonymousClass7YL) obj;
        AnonymousClass4ZS r3 = this.this$0;
        WaTextView waTextView = this.$titleTextView;
        C162457s7.A0C(waTextView);
        AnonymousClass4ZS.A00(waTextView, r3, r6.A00);
        C96974xP r4 = this.$adapter;
        List<AnonymousClass7ZJ> list = r6.A01;
        ArrayList A0c = C73783g4.A0c(list);
        for (AnonymousClass7ZJ r1 : list) {
            A0c.add(new C136916nT(r1));
        }
        ArrayList A0J = AnonymousClass002.A0J(A0c);
        if (A0J.isEmpty()) {
            A0J.add(C136936nV.A00);
        }
        A0J.add(C136926nU.A00);
        r4.A00.A00(A0J);
        return C59022wD.A00;
    }
}
