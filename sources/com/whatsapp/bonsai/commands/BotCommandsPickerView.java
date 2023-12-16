package com.whatsapp.bonsai.commands;

import X.AnonymousClass001;
import X.AnonymousClass21N;
import X.AnonymousClass4WQ;
import X.AnonymousClass91C;
import X.C113905mB;
import X.C1231267f;
import X.C162457s7;
import X.C179098ib;
import X.C179108ic;
import X.C18260x0;
import X.C18270x1;
import X.C86664Kz;
import X.C92294mP;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class BotCommandsPickerView extends C92294mP {
    public LinearLayoutManager A00;
    public RecyclerView A01;
    public AnonymousClass4WQ A02;
    public C179098ib A03;
    public C179108ic A04;
    public C113905mB A05;
    public UserJid A06;
    public List A07;
    public boolean A08 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18270x1.A10(context, 1, attributeSet);
    }

    public final void setChatMessageCounts(C113905mB r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setCommandList(List list, Bitmap bitmap) {
        C162457s7.A0J(list, 0);
        AnonymousClass4WQ r0 = this.A02;
        if (r0 != null) {
            r0.A01 = list;
            r0.A00 = bitmap;
            r0.A05();
        }
    }

    public final void setupView(List list, Bitmap bitmap, C179108ic r6, View view, C179098ib r8, UserJid userJid) {
        C162457s7.A0J(list, 0);
        C18270x1.A11(r6, 2, r8);
        this.A07 = list;
        this.A06 = userJid;
        this.A04 = r6;
        this.A03 = r8;
        this.A01 = C86664Kz.A0w(this, R.id.bot_command_list);
        AnonymousClass4WQ r1 = new AnonymousClass4WQ(bitmap, r8, list);
        this.A02 = r1;
        r1.BiZ(new C1231267f(this, 0));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A00 = linearLayoutManager;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A02);
        }
        setVisibility(8);
        if (view != null) {
            setAnchorWidthView(view);
            view.addOnLayoutChangeListener(new AnonymousClass91C(this, 1, view));
        }
    }

    public final C113905mB getChatMessageCounts() {
        C113905mB r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatMessageCounts");
    }

    public View getContentView() {
        RecyclerView recyclerView = this.A01;
        C162457s7.A0K(recyclerView, "null cannot be cast to non-null type android.view.View");
        return recyclerView;
    }

    public final void A0A(int i) {
        UserJid userJid;
        C18260x0.A0w("BotCommandsPickerView/updatePickerSize itemCount=", AnonymousClass001.A0o(), i);
        A08(i, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        if (i == 0) {
            this.A08 = true;
        } else if (this.A08 && (userJid = this.A06) != null) {
            this.A08 = false;
            getChatMessageCounts().A04(AnonymousClass21N.CMD_PICKER_SHOWN, userJid);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18270x1.A10(context, 1, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }
}
