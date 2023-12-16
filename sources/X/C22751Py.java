package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.1Py  reason: invalid class name and case insensitive filesystem */
public final class C22751Py extends C113155ky {
    public final C621033m A00;
    public final C153167am A01;
    public final AnonymousClass1VX A02;
    public final C49902hH A03;
    public final C48192eV A04;
    public final AnonymousClass4FS A05;

    public boolean A00(C624134x r5) {
        C30561me r0;
        C162457s7.A0J(r5, 0);
        if (this.A04.A00.A0Y(C58422vE.A02, 3140) && this.A03.A00(C369020e.UNPIN, r5) && (r0 = r5.A1T) != null && r0.A00 == 1) {
            return true;
        }
        return false;
    }

    public final boolean A01(C89654ea r7, C624134x r8) {
        AnonymousClass21G r0;
        C19340zH r1;
        int i;
        boolean A1Y = AnonymousClass0x2.A1Y(r8, r7);
        C49902hH r2 = this.A03;
        C369020e r12 = C369020e.UNPIN;
        if (!r2.A01.A0F()) {
            r0 = AnonymousClass21G.NO_CONNECTION_ERROR;
        } else if (!r2.A00(r12, r8)) {
            r0 = AnonymousClass21G.OTHER_ERROR;
        } else {
            r0 = AnonymousClass21G.SUCCESS;
        }
        int ordinal = r0.ordinal();
        if (ordinal == A1Y) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with no connection.");
            r1 = AnonymousClass5V0.A00(r7);
            i = R.string.f11nameremoved;
        } else if (ordinal == 3) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with other error.");
            r1 = AnonymousClass5V0.A00(r7);
            i = R.string.f11nameremoved;
        } else if (ordinal == 0) {
            if (this.A02.A0Y(C58422vE.A02, 6545)) {
                C71333bw.A00(this.A05, this, r8, 42);
            }
            this.A00.A0Q(r8, 0, 0);
            return true;
        } else if (ordinal == 2) {
            Log.e("UnpinInChatSelectionAction/execute Unreacheable/impossible states for unpin.");
            return false;
        } else {
            throw C73153f1.A00();
        }
        r1.A0T(i);
        r1.A0d(r7, (C15930sC) null, R.string.f11nameremoved);
        C18280x3.A0q(r1);
        return false;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.vec_ic_action_unpin_in_chat);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        return C18290x4.A0l(r3.getContext(), R.string.f11nameremoved);
    }

    public C22751Py(C621033m r1, C153167am r2, AnonymousClass1VX r3, C49902hH r4, C48192eV r5, AnonymousClass4FS r6) {
        C18260x0.A0d(r1, r4, r3, r6);
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 25;
    }
}
