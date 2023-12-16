package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5Ui  reason: invalid class name and case insensitive filesystem */
public abstract class C105295Ui {
    public C993955o A00;
    public boolean A01;
    public boolean A02;
    public final C56962sq A03;
    public final C64773Ex A04;
    public final C56332ro A05;
    public final ConversationsFragment A06;
    public final AnonymousClass4FV A07;
    public final C72173dI A08;

    public void A01() {
        boolean z;
        boolean z2;
        if (this.A02) {
            boolean z3 = this instanceof C94224qQ;
            if (z3) {
                C94224qQ r3 = (C94224qQ) this;
                ConversationsFragment conversationsFragment = r3.A06;
                View findViewById = conversationsFragment.A0J().findViewById(R.id.conversations_empty_nux);
                if (r3.A00 == null) {
                    r3.A01 = AnonymousClass000.A1U(C86604Kt.A0A(conversationsFragment).screenLayout & 15, 1);
                    View findViewById2 = findViewById.findViewById(R.id.contacts_container);
                    if (C620733j.A04(r3.A04)) {
                        AnonymousClass0YH.A06(findViewById2, 1);
                    } else {
                        AnonymousClass0YH.A06(findViewById2, 0);
                    }
                    r3.A00 = new C989553w(r3, 11);
                }
            } else {
                C94234qR r5 = (C94234qR) this;
                if (r5.A01 != null && C102805Ki.A00(r5.A0D)) {
                    r5.A01.postDelayed(C117625sE.A00(r5, 22), 300);
                }
                if (r5.A02 != null && C102805Ki.A00(r5.A0D)) {
                    r5.A02.setRotationY(180.0f);
                }
            }
            C18290x4.A1L(this.A00);
            A02(false);
            this.A02 = false;
            C72173dI r0 = this.A08;
            r0.A02();
            if (z3) {
                this.A00 = new C993955o(this.A03, this.A04, this.A05, this, C94224qQ.A05.length, true, false, true);
            } else {
                C94234qR r14 = (C94234qR) this;
                boolean z4 = r14 instanceof C94104pu;
                C64773Ex r12 = r14.A04;
                C56962sq r11 = r14.A03;
                C56332ro r13 = r14.A05;
                if (z4) {
                    z2 = false;
                    z = false;
                } else {
                    z = false;
                    z2 = true;
                }
                r14.A00 = new C993955o(r11, r12, r13, r14, 15, z, true, z2);
            }
            if (this.A00 != null) {
                A02(true);
                this.A00.A02.executeOnExecutor(r0, new Object[0]);
            }
            this.A02 = false;
        }
    }

    public void A02(boolean z) {
        if (this instanceof C94234qR) {
            C94234qR r3 = (C94234qR) this;
            AnonymousClass5UY r2 = r3.A08;
            int i = 0;
            if (r2 != null) {
                r2.A06(AnonymousClass001.A08(z ? 1 : 0));
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) r3.A08.A04();
                if (z) {
                    shimmerFrameLayout.A02();
                } else {
                    shimmerFrameLayout.A03();
                }
            }
            RelativeLayout relativeLayout = r3.A05;
            if (relativeLayout != null) {
                if (z) {
                    i = 8;
                }
                relativeLayout.setVisibility(i);
            }
        }
    }

    public C105295Ui(C56962sq r2, C64773Ex r3, C56332ro r4, ConversationsFragment conversationsFragment, AnonymousClass4FV r6, AnonymousClass4FS r7) {
        this.A08 = C72173dI.A00(r7);
        this.A07 = r6;
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = conversationsFragment;
    }
}
