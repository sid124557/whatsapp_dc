package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass35J;
import X.AnonymousClass4GJ;
import X.AnonymousClass677;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C18300x5;
import X.C30481mW;
import X.C56612sH;
import X.C56972sr;
import X.C88864av;
import X.C93304oI;
import X.C93314oJ;
import X.C95814uZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class WallpaperMockChatView extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C56972sr A05;
    public C93314oJ A06;
    public C93314oJ A07;
    public C56612sH A08;
    public C116855qy A09;
    public boolean A0A;

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public C93314oJ getOutgoingRow() {
        return this.A07;
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4o(this);
        }
    }

    public void setMessages(String str, String str2, AnonymousClass677 r11) {
        Context context = getContext();
        C30481mW r2 = new C30481mW(AnonymousClass35J.A00(this.A05, this.A08, (C95814uZ) null, false), this.A08.A0H());
        r2.A1Z(str);
        C56612sH r5 = this.A08;
        C56972sr r1 = this.A05;
        C30481mW r52 = new C30481mW(AnonymousClass35J.A00(r1, r5, C56972sr.A04(r1), true), this.A08.A0H());
        r52.A0K = this.A08.A0H();
        r52.A1G(5);
        r52.A1Z(str2);
        setBackgroundResource(0);
        setOrientation(1);
        C93304oI r0 = new C93304oI(context, r11, r2);
        this.A06 = r0;
        r0.A1s(true);
        this.A06.setEnabled(false);
        this.A00 = C06560Yg.A02(this.A06, R.id.date_wrapper);
        this.A03 = C18300x5.A0G(this.A06, R.id.message_text);
        this.A02 = C18300x5.A0G(this.A06, R.id.conversation_row_date_divider);
        C93304oI r02 = new C93304oI(context, r11, r52);
        this.A07 = r02;
        r02.A1s(false);
        this.A07.setEnabled(false);
        this.A01 = C06560Yg.A02(this.A07, R.id.date_wrapper);
        this.A04 = C18300x5.A0G(this.A07, R.id.message_text);
        addView(this.A06);
        addView(this.A07);
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4o(this);
        }
    }

    public WallpaperMockChatView(Context context) {
        this(context, (AttributeSet) null);
    }
}
