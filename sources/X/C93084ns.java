package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ns  reason: invalid class name and case insensitive filesystem */
public final class C93084ns extends C92664n3 {
    public C106435Yz A00;
    public ArrayList A01 = AnonymousClass001.A0s();
    public boolean A02;
    public boolean A03;
    public final ConversationCarousel A04;
    public final C92334mV A05;
    public final AnonymousClass679 A06;
    public final Runnable A07 = C117085rM.A00(this, 33);

    public void A1q(C624134x r5, boolean z) {
        C18260x0.A1D("ConversationRowBotPlugin/convertView needsRefresh=", C18280x3.A0g(r5, 0), z);
        super.A1q(r5, z);
        if (z) {
            AnonymousClass4VP r0 = this.A05;
            if (r0 != null) {
                ArrayList arrayList = this.A01;
                C162457s7.A0J(arrayList, 0);
                AnonymousClass5YS.A00(r0.A03, arrayList);
            }
            A22();
        }
        AnonymousClass677 r2 = this.A0m;
        if (r2 != null && r2.BFW()) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                if (r2.BIB(C18300x5.A0T(it))) {
                    this.A02 = true;
                    return;
                }
            }
        } else if (this.A02) {
            A22();
            this.A02 = false;
        }
    }

    public boolean A21(AnonymousClass2z0 r5) {
        C162457s7.A0J(r5, 0);
        if (!C162457s7.A0P(this.A0S.A1J, r5)) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                if (C162457s7.A0P(C86614Ku.A0h(it), r5)) {
                }
            }
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A2B();
        ConversationCarousel conversationCarousel = this.A04;
        conversationCarousel.A14(conversationCarousel.getCurrentPosition());
    }

    public final void setBotPluginUtil(C106435Yz r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    private final AnonymousClass679 getCarouselCustomizer() {
        AnonymousClass677 r0;
        this.A29.get();
        if (C155477ey.A00(this.A0S.A1J.A00) || (r0 = this.A0m) == null || r0.getContainerType() != 0) {
            return super.getRowCustomizer();
        }
        return this.A0K.A04;
    }

    public void A22() {
        Log.d("ConversationRowBotPlugin/fillView");
        super.A22();
        C92334mV r0 = this.A05;
        if (r0 != null) {
            r0.A05();
            A2A();
        }
    }

    public final void A2A() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((C30481mW) it.next()).A01 == 4) {
                if (!this.A03) {
                    this.A03 = true;
                    this.A0X.A0T(this.A07, C625635p.A0L);
                    return;
                }
                return;
            }
        }
    }

    public final void A2B() {
        ConversationCarousel conversationCarousel = this.A04;
        AnonymousClass679 r5 = this.A06;
        int B4q = r5.B4q();
        Context context = getContext();
        Rect rect = this.A0d;
        conversationCarousel.setPaddingRelative(B4q + r5.BAQ(context, rect.left), conversationCarousel.getPaddingTop(), r5.B4r(this.A0S) + r5.BAN(getContext(), rect.left), conversationCarousel.getPaddingBottom());
    }

    public final List getAlbumMessages() {
        return this.A01;
    }

    public List getAllMessages() {
        return this.A01;
    }

    public final C106435Yz getBotPluginUtil() {
        C106435Yz r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("botPluginUtil");
    }

    public int getMessageCount() {
        return this.A01.size() + 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93084ns(Context context, AnonymousClass677 r6, C30481mW r7) {
        super(context, r6, r7);
        C18260x0.A0V(context, r7, r6);
        C92334mV r1 = new C92334mV(C18290x4.A0F(this), r6, getBotPluginUtil(), this.A01);
        this.A05 = r1;
        A25();
        ConversationCarousel conversationCarousel = (ConversationCarousel) C18290x4.A0M(this, R.id.conversation_links_carousel_recycler_view);
        this.A04 = conversationCarousel;
        conversationCarousel.setVisibility(0);
        conversationCarousel.setAdapter(r1);
        conversationCarousel.getContext();
        conversationCarousel.setLayoutManager(new LinearLayoutManager(0), new AnonymousClass6HT(conversationCarousel.getWhatsAppLocale()));
        this.A06 = getCarouselCustomizer();
        A2B();
        A22();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0X.A0R(this.A07);
        this.A03 = false;
    }
}
