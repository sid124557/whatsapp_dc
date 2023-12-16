package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Iu  reason: invalid class name and case insensitive filesystem */
public abstract class C125636Iu extends C05570Ua {
    public void A07(AnonymousClass7DQ r13) {
        CategoryThumbnailLoader categoryThumbnailLoader;
        UserJid userJid;
        C108815db r5;
        AnonymousClass4GQ r9;
        AnonymousClass4GP r7;
        AnonymousClass4GP r8;
        if (this instanceof C132986gT) {
            C132986gT r4 = (C132986gT) this;
            C162457s7.A0J(r13, 0);
            C132936gO r52 = (C132936gO) r13;
            C43072Qq r3 = r52.A00;
            ((TextView) r4.A02.getValue()).setText(r3.A02);
            View view = r4.A0H;
            view.setOnClickListener(new C109465ef(r4, 11, r13));
            C107235av.A02(view);
            CategoryThumbnailLoader categoryThumbnailLoader2 = r4.A00;
            UserJid userJid2 = r52.A01;
            C108815db r72 = r3.A00;
            C162457s7.A0C(r72);
            categoryThumbnailLoader2.A00(r72, userJid2, new AnonymousClass8W4(r4), new AnonymousClass8W5(r4), new AnonymousClass8Y7(r4));
        } else if (this instanceof C133006gV) {
            ((ShimmerFrameLayout) ((C133006gV) this).A00.getValue()).A02();
        } else if (this instanceof C132966gR) {
            C132966gR r32 = (C132966gR) this;
            C162457s7.A0J(r13, 0);
            ((TextView) r32.A01.getValue()).setText(((AnonymousClass6gN) r13).A00.A02);
            View view2 = r32.A0H;
            view2.setOnClickListener(new C109465ef(r32, 10, r13));
            ((WaImageView) r32.A00.getValue()).A01 = true;
            C107235av.A02(view2);
        } else if (!(this instanceof C132946gP)) {
            if (this instanceof C132976gS) {
                C132976gS r33 = (C132976gS) this;
                C162457s7.A0J(r13, 0);
                AnonymousClass6gM r132 = (AnonymousClass6gM) r13;
                C43072Qq r1 = r132.A00;
                ((TextView) r33.A03.getValue()).setText(r1.A02);
                categoryThumbnailLoader = r33.A00;
                userJid = r132.A01;
                r5 = r1.A00;
                C162457s7.A0C(r5);
                r9 = new AnonymousClass8Y6(r33);
                r7 = new C174788Vw(r33);
                r8 = new C174798Vx(r33);
            } else {
                C132956gQ r34 = (C132956gQ) this;
                C162457s7.A0J(r13, 0);
                C132926gL r133 = (C132926gL) r13;
                C43072Qq r12 = r133.A00;
                ((TextView) r34.A02.getValue()).setText(r12.A02);
                C107235av.A02(r34.A0H);
                categoryThumbnailLoader = r34.A00;
                userJid = r133.A01;
                r5 = r12.A00;
                C162457s7.A0C(r5);
                r9 = new AnonymousClass8Y5(r34);
                r7 = new C174748Vs(r34);
                r8 = new C174758Vt(r34);
            }
            categoryThumbnailLoader.A00(r5, userJid, r7, r8, r9);
        }
    }

    public C125636Iu(View view) {
        super(view);
    }
}
