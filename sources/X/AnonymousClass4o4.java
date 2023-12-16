package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4o4  reason: invalid class name */
public class AnonymousClass4o4 extends C92394mc {
    public int A00;
    public ConversationCarousel A01;
    public AnonymousClass5O8 A02;
    public C92344mW A03;
    public AnonymousClass2OM A04;
    public C49162g5 A05;
    public AnonymousClass2z0 A06 = getFMessage().A1J;
    public C183538qC A07;
    public final int A08;
    public final View A09 = C06560Yg.A02(this, R.id.button_div);
    public final C08270df A0A;
    public final AnonymousClass677 A0B;
    public final InteractiveMessageButton A0C;
    public final InteractiveMessageView A0D;
    public final AnonymousClass5MU A0E;

    private ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return new AnonymousClass6AE(this, 1);
    }

    public void onMeasure(int i, int i2) {
        ConversationCarousel conversationCarousel;
        int i3 = i;
        if (AnonymousClass36V.A06(getFMessage())) {
            i3 = C86664Kz.A05(this.A08);
        }
        int i4 = i2;
        super.onMeasure(i3, i2);
        if (AnonymousClass36V.A07(getFMessage()) && (conversationCarousel = this.A01) != null && conversationCarousel.getVisibility() != 8) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            C107235av.A05(this.A01, i3, 0, 0, i4, measuredHeight);
            ConversationCarousel conversationCarousel2 = this.A01;
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(conversationCarousel2);
            int measuredHeight2 = measuredHeight + conversationCarousel2.getMeasuredHeight() + A0T.topMargin + A0T.bottomMargin;
            int A0y = A0y(i3, i2, measuredHeight2);
            this.A00 = A0y;
            setMeasuredDimension(measuredWidth, (measuredHeight2 + A0y) - getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30791n7);
        this.A0S = r2;
    }

    public AnonymousClass4o4(Context context, C08270df r6, AnonymousClass677 r7, AnonymousClass5MU r8, C30791n7 r9) {
        super(context, r7, r9);
        View A022;
        this.A0A = r6;
        this.A0E = r8;
        this.A0B = r7;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C06560Yg.A02(this, R.id.button);
        this.A0C = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C06560Yg.A02(this, R.id.interactive_view);
        this.A0D = interactiveMessageView;
        interactiveMessageView.setLayoutView(r9.A1J.A02 ^ true ? 1 : 0);
        AnonymousClass5R6 r1 = (AnonymousClass5R6) this.A07.get();
        getFMessage();
        interactiveMessageView.A02(this.A2T, r1);
        interactiveMessageButton.A0E.A00 = r1;
        this.A08 = C87094Nz.A05(this);
        A23();
        if (r1.A09 && (A022 = C06560Yg.A02(this, R.id.conversation_row_lto_offer_content_holder)) != null) {
            C86614Ku.A15(getResources(), A022, R.dimen.f6nameremoved);
        }
    }

    public void A12(AnonymousClass2z0 r2) {
        C93314oJ A22 = A22(r2);
        if (A22 != null) {
            A22.A12(r2);
        } else {
            super.A12(r2);
        }
    }

    public boolean A15() {
        if (AnonymousClass36V.A07(getFMessage())) {
            return false;
        }
        return super.A15();
    }

    public void A1H() {
        A23();
        A1t(false);
    }

    public void A1Y(ViewGroup viewGroup, TextView textView, C624134x r4) {
        if (!AnonymousClass36V.A06(getFMessage())) {
            super.A1Y(viewGroup, textView, r4);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A23();
        }
    }

    public boolean A21(AnonymousClass2z0 r4) {
        C92344mW r1;
        boolean A21 = super.A21(r4);
        if (A21 || !AnonymousClass36V.A07(getFMessage()) || (r1 = this.A03) == null) {
            return A21;
        }
        C162457s7.A0J(r4, 0);
        return AnonymousClass001.A1U(r1.A0K(r4));
    }

    public C93314oJ A22(AnonymousClass2z0 r3) {
        ConversationCarousel conversationCarousel;
        C92344mW r1;
        if (!AnonymousClass36V.A07(getFMessage()) || (conversationCarousel = this.A01) == null || conversationCarousel.getVisibility() == 8 || (r1 = this.A03) == null) {
            return null;
        }
        C162457s7.A0J(r3, 0);
        if (r1.A0K(r3) < 0) {
            return null;
        }
        C05570Ua A0F = this.A01.A0F(this.A03.A0K(r3));
        if (A0F instanceof C92374mZ) {
            return ((C92374mZ) A0F).A00;
        }
        return null;
    }

    public final void A23() {
        int intValue;
        C30791n7 r9 = (C30791n7) getFMessage();
        this.A0D.A03(this, r9);
        if (AnonymousClass36V.A07(getFMessage())) {
            HashSet hashSet = this.A04.A01;
            AnonymousClass2z0 r6 = this.A06;
            if (!hashSet.contains(r6)) {
                this.A05.A00(238890222, "carousel_message_render_tag", C18310x6.A0n(this));
                this.A04.A01.add(r6);
                AnonymousClass6AE.A00(getViewTreeObserver(), this, 1);
            }
            this.A0C.setVisibility(8);
            this.A09.setVisibility(8);
            if (this.A01 == null) {
                ConversationCarousel conversationCarousel = new ConversationCarousel(getContext());
                this.A01 = conversationCarousel;
                conversationCarousel.setId(R.id.conversation_row_detached_carousel);
                ConversationCarousel conversationCarousel2 = this.A01;
                conversationCarousel2.getContext();
                conversationCarousel2.setLayoutManager(new LinearLayoutManager(0), new AnonymousClass6HT(conversationCarousel2.getWhatsAppLocale()));
                C1231767k.A00(this.A01, this, 6);
                addView(this.A01, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            AnonymousClass677 r1 = this.A0B;
            if (r1 != null) {
                this.A03 = new C92344mW(getContext(), this.A0A, r1.getLifecycleOwner(), this.A0K.A0A, r9);
                AnonymousClass679 conversationRowCustomizer = r1.getConversationRowCustomizer();
                int i = C86614Ku.A0E(this).widthPixels;
                int BAQ = conversationRowCustomizer.BAQ(getContext(), this.A0d.left);
                ConversationCarousel conversationCarousel3 = this.A01;
                conversationCarousel3.setPaddingRelative(BAQ, conversationCarousel3.getPaddingTop(), (i - this.A08) - BAQ, conversationCarousel3.getPaddingBottom());
                List list = r9.A01;
                if (list != null) {
                    this.A01.setItemViewCacheSize(list.size());
                }
                this.A01.setAdapter(this.A03);
                AnonymousClass5MU r0 = this.A0E;
                AnonymousClass2z0 r12 = r9.A1J;
                C162457s7.A0J(r12, 0);
                Number A0p = AnonymousClass0x9.A0p(r12, r0.A00);
                if (A0p == null) {
                    intValue = 0;
                } else {
                    intValue = A0p.intValue();
                }
                this.A01.A14(intValue);
            }
            this.A01.setVisibility(0);
        } else {
            ConversationCarousel conversationCarousel4 = this.A01;
            if (conversationCarousel4 != null) {
                conversationCarousel4.setVisibility(8);
            }
            InteractiveMessageButton interactiveMessageButton = this.A0C;
            interactiveMessageButton.setVisibility(0);
            this.A09.setVisibility(0);
            interactiveMessageButton.A00(this.A0A, this, this.A0B, r9);
        }
        A1l(r9);
    }

    public int getGlowContentBottom() {
        ConversationCarousel conversationCarousel;
        if (!AnonymousClass36V.A07(getFMessage()) || (conversationCarousel = this.A01) == null || conversationCarousel.getVisibility() == 8) {
            return super.getGlowContentBottom();
        }
        return this.A01.getBottom();
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        InteractiveMessageView interactiveMessageView = this.A0D;
        if (interactiveMessageView != null) {
            innerFrameLayouts.add(interactiveMessageView.getInnerFrameLayout());
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (AnonymousClass36V.A07(getFMessage()) || AnonymousClass36V.A06(getFMessage())) {
            return this.A08;
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ConversationCarousel conversationCarousel = this.A01;
        if (conversationCarousel != null) {
            Rect A0N = AnonymousClass001.A0N();
            conversationCarousel.getHitRect(A0N);
            if (A0N.contains((int) x, (int) y)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ConversationCarousel conversationCarousel;
        super.onLayout(z, i, i2, i3, i4);
        if (AnonymousClass36V.A07(getFMessage()) && (conversationCarousel = this.A01) != null && conversationCarousel.getVisibility() != 8) {
            int A0w = ((A0w() + this.A00) + AnonymousClass001.A0T(this.A01).topMargin) - getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            int measuredWidth = this.A01.getMeasuredWidth();
            int measuredHeight = this.A01.getMeasuredHeight();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            this.A01.layout(measuredWidth2, A0w, measuredWidth + measuredWidth2, measuredHeight + A0w);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A02.A00(getFMessage(), i);
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
