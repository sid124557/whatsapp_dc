package com.whatsapp.chatinfo;

import X.AnonymousClass002;
import X.AnonymousClass11Q;
import X.AnonymousClass1NM;
import X.AnonymousClass20Q;
import X.C107555bV;
import X.C111685iW;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C195411p;
import X.C30461mU;
import X.C30601mi;
import X.C372421m;
import X.C54922pV;
import X.C620733j;
import X.C64333Db;
import X.C73783g4;
import X.C88864av;
import X.C95814uZ;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatInfoEventsCard extends InfoCard {
    public LinearLayout A00;
    public RecyclerView A01;
    public WaTextView A02;
    public C195411p A03;
    public C620733j A04;
    public C54922pV A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A01();
        this.A03 = new C195411p();
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A02 = (WaTextView) C18280x3.A0E(this, R.id.upcoming_events_info);
        this.A00 = (LinearLayout) C18280x3.A0E(this, R.id.upcoming_events_title_row);
        C107555bV.A0B(this.A02, getWhatsAppLocale(), R.drawable.chevron_right);
        RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(this, R.id.upcoming_events_list);
        this.A01 = recyclerView;
        recyclerView.setLayoutDirection(getWhatsAppLocale().A05().A06 ? 1 : 0);
        C18320x8.A19(this.A01, 0);
        this.A01.setAdapter(this.A03);
    }

    public final void setEventMessageManager(C54922pV r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setTitleRowClickListener(C95814uZ r3) {
        C162457s7.A0J(r3, 0);
        C18320x8.A16(this.A00, this, r3, 31);
    }

    public final void setUpcomingEvents(List list) {
        C372421m r1;
        C162457s7.A0J(list, 0);
        C195411p r6 = this.A03;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30461mU r3 = (C30461mU) it.next();
            AnonymousClass20Q r2 = AnonymousClass20Q.UPCOMING;
            C30601mi A002 = getEventMessageManager().A00(r3);
            if (A002 != null) {
                r1 = A002.A01;
            } else {
                r1 = null;
            }
            A0c.add(new AnonymousClass1NM(r2, r3, r1));
        }
        List list2 = r6.A00;
        C18280x3.A0s(new AnonymousClass11Q(list2, A0c), r6, A0c, list2);
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A04 = C64333Db.A2t(r1);
            this.A05 = (C54922pV) r1.A9G.get();
        }
    }

    public final C54922pV getEventMessageManager() {
        C54922pV r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventMessageManager");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void setInfoText(int i) {
        WaTextView waTextView = this.A02;
        Resources resources = getResources();
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        waTextView.setText(resources.getQuantityString(R.plurals.f9nameremoved, i, A0L));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
