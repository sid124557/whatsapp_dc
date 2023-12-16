package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.R;

/* renamed from: X.4m8  reason: invalid class name and case insensitive filesystem */
public class C92124m8 extends C89884fR {
    public final C49992hS A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92124m8(X.C009707r r30, X.C53582nK r31, X.C69263Wi r32, X.C56972sr r33, X.AnonymousClass64J r34, X.AnonymousClass5MG r35, X.C29291ia r36, X.C29301ib r37, X.AnonymousClass5UX r38, X.C29421in r39, X.AnonymousClass5ZU r40, X.C613330g r41, X.C620733j r42, X.C56982ss r43, X.C66473Lo r44, X.AnonymousClass3ZH r45, X.AnonymousClass5Y0 r46, X.AnonymousClass1VX r47, X.C29241iV r48, X.AnonymousClass1fI r49, X.C56072rN r50, X.C187958y5 r51, X.AnonymousClass4FS r52) {
        /*
            r29 = this;
            r18 = 0
            r16 = r41
            r15 = r40
            r14 = r39
            r13 = r38
            r12 = r37
            r11 = r36
            r10 = r35
            r9 = r34
            r8 = r33
            r7 = r32
            r6 = r31
            r2 = r52
            r27 = r51
            r26 = r50
            r3 = r49
            r24 = r48
            r23 = r47
            r22 = r46
            r21 = r45
            r20 = r44
            r19 = r43
            r5 = r30
            r17 = r42
            r4 = r29
            r25 = r3
            r28 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 1
            X.92b r1 = new X.92b
            r1.<init>(r4, r0)
            X.2hS r0 = new X.2hS
            r0.<init>(r15, r1, r3, r2)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92124m8.<init>(X.07r, X.2nK, X.3Wi, X.2sr, X.64J, X.5MG, X.1ia, X.1ib, X.5UX, X.1in, X.5ZU, X.30g, X.33j, X.2ss, X.3Lo, X.3ZH, X.5Y0, X.1VX, X.1iV, X.1fI, X.2rN, X.8y5, X.4FS):void");
    }

    public void A09() {
        super.A09();
        this.A00.A01();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle A002;
        super.onActivityCreated(activity, bundle);
        this.A0F.setText(R.string.f11nameremoved);
        if (this.A0R) {
            A002 = null;
        } else {
            A002 = AnonymousClass5MG.A00(activity, this.A0U.findViewById(R.id.transition_start), this.A0Z);
        }
        A06(new C109725f5((Object) this, (Object) activity, (Object) A002, 33));
        C107295b4.A03(this.A06, R.string.f11nameremoved);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A00.A00();
    }
}
