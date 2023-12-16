package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4WE  reason: invalid class name */
public class AnonymousClass4WE extends AnonymousClass09G {
    public C116985rC A00;
    public C101325Ei A01;
    public C101335Ej A02;

    public AnonymousClass4WE(C116985rC r2, C101325Ei r3, C101335Ej r4) {
        this(C86624Kv.A0E(5), r2, r3, r4);
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r1) {
        ((C125666Ix) r1).A07();
    }

    /* renamed from: A0M */
    public AnonymousClass6mM BQR(ViewGroup viewGroup, int i) {
        C116985rC r1 = this.A00;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("onCreateViewHolder");
        } else if (i == 55) {
            return new AnonymousClass6m0(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
        } else {
            if (i == 58) {
                return new C28391gn(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), viewGroup);
            }
            if (i == 65) {
                return new C96464wP(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            }
            if (i == 70) {
                C101335Ej r3 = this.A02;
                View A0I = C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false);
                C64333Db r32 = r3.A00.A03;
                return new C96814wy(A0I, C64333Db.A2t(r32), C64333Db.A4B(r32), (AnonymousClass2HH) r32.A00.A66.get());
            } else if (i == 72) {
                return new AnonymousClass6mK(viewGroup, new C96224w1((AnonymousClass5ED) this.A01.A00.A01.A2E.get()));
            } else {
                throw C86604Kt.A0h("DirectoryListAdapter/onCreateViewHolder type not handled: ", AnonymousClass001.A0o(), i);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        AnonymousClass6mM r22 = (AnonymousClass6mM) r2;
        r22.A07();
        r22.A09(A0K(i));
    }

    public int getItemViewType(int i) {
        C116985rC r1 = this.A00;
        if (!r1.A07()) {
            return ((C136186lz) A0K(i)).A00;
        }
        A0K(i);
        r1.A04();
        throw AnonymousClass001.A0g("getItemViewType");
    }

    public static AnonymousClass4Rr A00(View view) {
        Context context = view.getContext();
        C162457s7.A0J(context, 0);
        AnonymousClass4Rr r3 = new AnonymousClass4Rr(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        r3.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), dimensionPixelSize, dimensionPixelSize);
        AnonymousClass0YZ.A0B(r3, AnonymousClass5CP.A00(context));
        return r3;
    }

    public AnonymousClass4WE(AnonymousClass0LC r1, C116985rC r2, C101325Ei r3, C101335Ej r4) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
