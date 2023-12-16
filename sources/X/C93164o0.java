package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.4o0  reason: invalid class name and case insensitive filesystem */
public abstract class C93164o0 extends C133436hL {
    public C56942so A00;
    public final Context A01;
    public final AnonymousClass677 A02;
    public final AnonymousClass3ZH A03;
    public final C27991fJ A04;
    public final C30341mI A05;

    public abstract int getLayoutResId();

    public final void setCommunityChatManager(C56942so r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C89644eZ getBaseActivity() {
        Activity A002 = C111095hX.A00(this.A01);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        return (C89644eZ) A002;
    }

    public final C56942so getCommunityChatManager() {
        C56942so r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public final AnonymousClass3ZH getGroupContact() {
        return this.A03;
    }

    public final C27991fJ getGroupJid() {
        return this.A04;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C93164o0(Context context, AnonymousClass677 r4, C30341mI r5) {
        super(context, r4, r5);
        this.A01 = context;
        this.A05 = r5;
        this.A02 = r4;
        C27991fJ A032 = AnonymousClass34R.A03(r5.A1J.A00);
        C626936e.A06(A032);
        C162457s7.A0D(A032);
        this.A04 = A032;
        this.A03 = this.A1H.A01(A032);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
