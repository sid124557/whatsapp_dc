package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.5WH  reason: invalid class name */
public class AnonymousClass5WH {
    public final Context A00;
    public final RecyclerView A01;
    public final C44092Uq A02;
    public final C103145Ls A03;
    public final AnonymousClass11H A04;
    public final AnonymousClass4XG A05;
    public final C105365Uq A06;
    public final AnonymousClass7XG A07;
    public final C56542sA A08;

    public AnonymousClass5WH(Context context, C009707r r9, C15910sA r10, RecyclerView recyclerView, C44092Uq r12, C103145Ls r13, C39542Cj r14, C29291ia r15, C29301ib r16, C44272Vj r17, C29421in r18, C105365Uq r19, C56542sA r20, C28891hw r21, C29241iV r22, C27991fJ r23) {
        this.A02 = r12;
        this.A03 = r13;
        this.A00 = context;
        this.A06 = r19;
        this.A01 = recyclerView;
        this.A08 = r20;
        C105965Xc r2 = new C105965Xc();
        r2.A00 = 10;
        r2.A0C = true;
        if (r17.A00()) {
            r2.A06 = true;
            r2.A09 = true;
            r2.A0B = true;
            r2.A08 = false;
        }
        AnonymousClass11H A002 = AnonymousClass11H.A00(r9, r14, r2, r23);
        this.A04 = A002;
        AnonymousClass4XG A003 = this.A02.A00(this.A06, this.A03.A00(this.A00, (Runnable) null, (Runnable) null), this.A08, 3);
        this.A05 = A003;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(A003);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        recyclerView.A0o(new C125406Hx(context, recyclerView, (C181648n6) null, A003));
        AnonymousClass107 r1 = A002.A11;
        Objects.requireNonNull(A003);
        AnonymousClass6C6.A02(r10, r1, A003, 131);
        AnonymousClass7XG r0 = new AnonymousClass7XG(r15, r16, A003, r18, r21, r22);
        this.A07 = r0;
        r0.A00();
    }
}
