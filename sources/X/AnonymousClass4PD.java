package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.4PD  reason: invalid class name */
public final class AnonymousClass4PD extends FrameLayout implements Animator.AnimatorListener, AnonymousClass4GJ {
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public RecyclerView A04;
    public LottieAnimationView A05;
    public AnonymousClass74N A06;
    public C56982ss A07;
    public AnonymousClass1VX A08;
    public AnonymousClass5N3 A09;
    public C116855qy A0A;
    public AnonymousClass4GP A0B;
    public boolean A0C;

    public AnonymousClass4PD(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A08 = C64333Db.A4B(A002);
            this.A07 = C64333Db.A39(A002);
            this.A09 = (AnonymousClass5N3) A002.A00.A6F.get();
        }
        this.A06 = C133586hc.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A03 = frameLayout;
        this.A02 = C18280x3.A0E(frameLayout, R.id.conversations_reveal_header_combo);
        this.A01 = C18280x3.A0E(this.A03, R.id.conversations_locked_header);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C18280x3.A0E(this.A03, R.id.locked_row_icon);
        this.A05 = lottieAnimationView;
        lottieAnimationView.A0F.A0K.addListener(this);
        C107235av.A02(this.A01);
        C107295b4.A02(this.A01);
        TextView A0I = AnonymousClass0x2.A0I(this.A01, R.id.locked_row);
        C106905aM.A04(A0I);
        A0I.setTextColor(AnonymousClass0Y8.A07(context, R.color.f5nameremoved));
        this.A00 = C18280x3.A0E(this.A03, R.id.filter_and_locked_chats_container);
        View A022 = C06560Yg.A02(this.A03, R.id.conversations_reveal_filter_recycler_view);
        C162457s7.A0K(A022, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.A04 = (RecyclerView) A022;
        if (!getInboxFilterHelper().A01()) {
            this.A04.setVisibility(8);
        }
        if (!AnonymousClass0x7.A1S(getChatsCache().A03)) {
            this.A01.setVisibility(8);
        }
        addView(this.A03);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setChatsCache(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setFilterAndLockedChatsContainer(View view) {
        C162457s7.A0J(view, 0);
        this.A00 = view;
    }

    public final void setInboxFilterHelper(AnonymousClass5N3 r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public static View A00(ConversationsFragment conversationsFragment, int i) {
        ViewGroup.LayoutParams layoutParams = conversationsFragment.A1O.A03.getLayoutParams();
        layoutParams.height = i;
        conversationsFragment.A1O.A03.setLayoutParams(layoutParams);
        return conversationsFragment.A1O.A02;
    }

    public final void A01(AnonymousClass4GP r3) {
        AnonymousClass74N r0;
        this.A0B = r3;
        AnonymousClass74N r1 = this.A06;
        if (r1 instanceof C133586hc) {
            LottieAnimationView lottieAnimationView = this.A05;
            lottieAnimationView.setSpeed(0.7f);
            lottieAnimationView.A01();
            r0 = C133596hd.A00;
        } else if (r1 instanceof C133596hd) {
            LottieAnimationView lottieAnimationView2 = this.A05;
            lottieAnimationView2.setSpeed(-0.7f);
            lottieAnimationView2.A01();
            r0 = C133586hc.A00;
        } else {
            return;
        }
        this.A06 = r0;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C56982ss getChatsCache() {
        C56982ss r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final FrameLayout getContainer() {
        return this.A03;
    }

    public final View getFilterAndLockedChatsContainer() {
        return this.A00;
    }

    public final AnonymousClass5N3 getInboxFilterHelper() {
        AnonymousClass5N3 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("inboxFilterHelper");
    }

    public final AnonymousClass74N getLockIconState() {
        return this.A06;
    }

    public final View getLockedRowView() {
        return this.A01;
    }

    public final View getParentViewToBeAnimated() {
        return this.A02;
    }

    public final RecyclerView getRevealFilterRecyclerView() {
        return this.A04;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass4GP r0 = this.A0B;
        if (r0 != null) {
            r0.invoke();
        }
        this.A0B = null;
    }

    public final void setLockedRowVisibility(boolean z) {
        this.A01.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
