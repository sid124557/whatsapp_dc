package com.whatsapp.events;

import X.AnonymousClass0O1;
import X.AnonymousClass11J;
import X.AnonymousClass1VX;
import X.AnonymousClass21P;
import X.AnonymousClass26D;
import X.AnonymousClass31A;
import X.AnonymousClass487;
import X.AnonymousClass4KP;
import X.AnonymousClass58H;
import X.AnonymousClass5UY;
import X.AnonymousClass5Y0;
import X.AnonymousClass66R;
import X.AnonymousClass94W;
import X.C003403v;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C28071fd;
import X.C45942ap;
import X.C56952sp;
import X.C56982ss;
import X.C60152y5;
import X.C60552yk;
import X.C620633i;
import X.C620733j;
import X.C628036u;
import X.C633839a;
import X.C73853gB;
import X.C77863u5;
import X.C80343y5;
import X.C816740q;
import X.C85814Hs;
import X.C95814uZ;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.fab.WDSFab;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class EventCreationFragment extends Hilt_EventCreationFragment {
    public LinearLayout A00;
    public LinearLayout A01;
    public WaEditText A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaImageView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C620633i A09;
    public C620733j A0A;
    public C56982ss A0B;
    public AnonymousClass487 A0C;
    public AnonymousClass5Y0 A0D;
    public C45942ap A0E;
    public AnonymousClass1VX A0F;
    public C28071fd A0G;
    public C60152y5 A0H;
    public AnonymousClass5UY A0I;
    public AnonymousClass5UY A0J;
    public AnonymousClass5UY A0K;
    public AnonymousClass5UY A0L;
    public AnonymousClass5UY A0M;
    public WDSFab A0N;
    public C73853gB A0O;
    public final DatePickerDialog.OnDateSetListener A0P = new AnonymousClass26D(this, 0);
    public final TimePickerDialog.OnTimeSetListener A0Q = new C628036u(this);
    public final AnonymousClass0O1 A0R = Bid(new AnonymousClass4KP(this, 1), new C003403v());
    public final AnonymousClass66R A0S = C154517dI.A00(AnonymousClass58H.NONE, new C80343y5(this));
    public final AnonymousClass66R A0T = C154517dI.A01(new C77863u5(this));
    public final AnonymousClass66R A0U = C154517dI.A01(C816740q.A00);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x019d, code lost:
        if (r2 == 3) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r19, android.view.View r20) {
        /*
            r18 = this;
            r0 = 0
            r2 = r20
            X.C162457s7.A0J(r2, r0)
            r0 = 2131429917(0x7f0b0a1d, float:1.848152E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r0 = r18
            r0.A02 = r1
            r1 = 2131429955(0x7f0b0a43, float:1.8481597E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r0.A04 = r1
            r1 = 2131429910(0x7f0b0a16, float:1.8481506E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.A01 = r1
            r1 = 2131429906(0x7f0b0a12, float:1.8481498E38)
            com.whatsapp.WaImageView r1 = X.AnonymousClass0x9.A0L(r2, r1)
            r0.A06 = r1
            r1 = 2131429912(0x7f0b0a18, float:1.848151E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass0x7.A0L(r2, r1)
            r0.A08 = r1
            r1 = 2131429911(0x7f0b0a17, float:1.8481508E38)
            X.5UY r1 = X.AnonymousClass0x2.A0M(r2, r1)
            r0.A0M = r1
            r1 = 2131429907(0x7f0b0a13, float:1.84815E38)
            X.5UY r1 = X.AnonymousClass0x2.A0M(r2, r1)
            r0.A0L = r1
            r1 = 2131429916(0x7f0b0a1c, float:1.8481518E38)
            X.5UY r1 = X.AnonymousClass0x2.A0M(r2, r1)
            r0.A0I = r1
            r1 = 2131429939(0x7f0b0a33, float:1.8481565E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.A00 = r1
            r1 = 2131429940(0x7f0b0a34, float:1.8481567E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass0x7.A0L(r2, r1)
            r0.A07 = r1
            r1 = 2131429937(0x7f0b0a31, float:1.848156E38)
            X.5UY r1 = X.AnonymousClass0x2.A0M(r2, r1)
            r0.A0J = r1
            r1 = 2131429938(0x7f0b0a32, float:1.8481563E38)
            X.5UY r1 = X.AnonymousClass0x2.A0M(r2, r1)
            r0.A0K = r1
            r1 = 2131429956(0x7f0b0a44, float:1.84816E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r0.A05 = r1
            r1 = 2131429918(0x7f0b0a1e, float:1.8481522E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r0.A03 = r1
            r1 = 2131429913(0x7f0b0a19, float:1.8481512E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            com.whatsapp.wds.components.fab.WDSFab r1 = (com.whatsapp.wds.components.fab.WDSFab) r1
            r0.A0N = r1
            X.0sA r1 = r0.A0V()
            X.0ni r3 = X.AnonymousClass0IT.A00(r1)
            r4 = 0
            r9 = 0
            com.whatsapp.events.EventCreationFragment$onViewCreated$1 r2 = new com.whatsapp.events.EventCreationFragment$onViewCreated$1
            r2.<init>(r0, r4)
            r1 = 3
            X.C616131n.A02(r4, r2, r3, r4, r1)
            X.0sA r2 = r0.A0V()
            X.0ni r3 = X.AnonymousClass0IT.A00(r2)
            com.whatsapp.events.EventCreationFragment$onViewCreated$2 r2 = new com.whatsapp.events.EventCreationFragment$onViewCreated$2
            r2.<init>(r0, r4)
            X.C616131n.A02(r4, r2, r3, r4, r1)
            X.66R r2 = r0.A0T
            java.lang.Object r2 = r2.getValue()
            X.11J r2 = (X.AnonymousClass11J) r2
            X.4C8 r5 = r2.A09
            com.whatsapp.events.EventCreationFragment$onViewCreated$3 r3 = new com.whatsapp.events.EventCreationFragment$onViewCreated$3
            r3.<init>(r0, r4)
            r2 = 10
            X.4J6 r4 = new X.4J6
            r4.<init>((X.AnonymousClass4GR) r3, (X.AnonymousClass4C8) r5, (int) r2)
            X.0ni r2 = X.AnonymousClass0IT.A00(r0)
            X.3gB r3 = r0.A0O
            if (r3 == 0) goto L_0x0247
            X.4Gl r2 = r2.B61()
            X.4Gl r3 = r2.plus(r3)
            X.3e5 r2 = new X.3e5
            r2.<init>(r3)
            X.C57742u8.A00(r2, r4)
            com.whatsapp.WaEditText r2 = r0.A05
            if (r2 == 0) goto L_0x00f5
            r2.requestFocus()
        L_0x00f5:
            com.whatsapp.WaEditText r4 = r0.A05
            if (r4 == 0) goto L_0x0102
            r3 = 1
            X.4Jx r2 = new X.4Jx
            r2.<init>(r0, r3)
            r4.addTextChangedListener(r2)
        L_0x0102:
            com.whatsapp.WaEditText r8 = r0.A05
            r7 = 0
            r6 = 1
            if (r8 == 0) goto L_0x0120
            android.text.InputFilter$LengthFilter[] r5 = new android.text.InputFilter.LengthFilter[r6]
            X.1VX r4 = r0.A0F
            if (r4 == 0) goto L_0x0242
            r3 = 6207(0x183f, float:8.698E-42)
            X.2vE r2 = X.C58422vE.A02
            int r3 = r4.A0O(r2, r3)
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r3)
            r5[r7] = r2
            r8.setFilters(r5)
        L_0x0120:
            com.whatsapp.WaEditText r8 = r0.A03
            if (r8 == 0) goto L_0x0164
            android.text.InputFilter$LengthFilter[] r6 = new android.text.InputFilter.LengthFilter[r6]
            X.1VX r2 = r0.A0F
            if (r2 == 0) goto L_0x023d
            r5 = 6208(0x1840, float:8.699E-42)
            X.2vE r4 = X.C58422vE.A02
            int r3 = r2.A0O(r4, r5)
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r3)
            r6[r7] = r2
            r8.setFilters(r6)
            X.5Y0 r13 = r0.A0D
            if (r13 == 0) goto L_0x0236
            X.33i r10 = r0.A09
            if (r10 == 0) goto L_0x022e
            X.33j r11 = r0.A1J()
            X.2y5 r14 = r0.A0H
            if (r14 == 0) goto L_0x0226
            X.487 r12 = r0.A0C
            if (r12 == 0) goto L_0x021f
            X.1VX r2 = r0.A0F
            if (r2 == 0) goto L_0x021a
            int r15 = r2.A0O(r4, r5)
            r16 = 0
            r17 = 1
            X.52M r7 = new X.52M
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r8.addTextChangedListener(r7)
        L_0x0164:
            r0.A1N()
            android.content.Context r11 = r0.A0G()
            android.app.TimePickerDialog$OnTimeSetListener r12 = r0.A0Q
            java.util.Calendar r3 = r0.A1K()
            r2 = 11
            int r13 = r3.get(r2)
            java.util.Calendar r3 = r0.A1K()
            r2 = 12
            int r14 = r3.get(r2)
            X.33j r2 = r0.A1J()
            X.5Ki r2 = r2.A05()
            boolean r2 = r2.A00
            r3 = 0
            if (r2 != 0) goto L_0x019f
            X.33j r2 = r0.A1J()
            java.util.Locale r2 = X.C620733j.A02(r2)
            int r2 = X.C162307rf.A00(r2)
            if (r2 == 0) goto L_0x019f
            r15 = 0
            if (r2 != r1) goto L_0x01a0
        L_0x019f:
            r15 = 1
        L_0x01a0:
            android.app.TimePickerDialog r10 = new android.app.TimePickerDialog
            r10.<init>(r11, r12, r13, r14, r15)
            com.whatsapp.WaEditText r1 = r0.A04
            if (r1 == 0) goto L_0x01ac
            r1.setFocusable(r3)
        L_0x01ac:
            com.whatsapp.WaEditText r2 = r0.A04
            if (r2 == 0) goto L_0x01b5
            r1 = 29
            X.C633839a.A00(r2, r10, r1)
        L_0x01b5:
            com.whatsapp.WaEditText r1 = r0.A04
            if (r1 == 0) goto L_0x01bc
            r1.setKeyListener(r9)
        L_0x01bc:
            com.whatsapp.WaEditText r3 = r0.A04
            if (r3 == 0) goto L_0x01cf
            X.33j r2 = r0.A1J()
            java.util.Calendar r1 = r0.A1K()
            java.lang.String r1 = X.C107145am.A03(r2, r1)
            r3.setText(r1)
        L_0x01cf:
            android.widget.LinearLayout r2 = r0.A00
            if (r2 == 0) goto L_0x01d8
            r1 = 27
            X.C633839a.A00(r2, r0, r1)
        L_0x01d8:
            X.5UY r3 = r0.A0K
            if (r3 == 0) goto L_0x01e6
            r2 = 28
            X.39a r1 = new X.39a
            r1.<init>(r0, r2)
            r3.A07(r1)
        L_0x01e6:
            X.5UY r1 = r0.A0K
            if (r1 == 0) goto L_0x01fe
            android.view.View r3 = r1.A04()
            if (r3 == 0) goto L_0x01fe
            r2 = 2131889171(0x7f120c13, float:1.9412998E38)
            android.content.res.Resources r1 = X.C08310eF.A09(r0)
            java.lang.String r1 = r1.getString(r2)
            r3.setContentDescription(r1)
        L_0x01fe:
            com.whatsapp.wds.components.fab.WDSFab r4 = r0.A0N
            if (r4 == 0) goto L_0x0210
            X.33j r3 = r0.A1J()
            android.content.Context r2 = r0.A0G()
            r1 = 2131232985(0x7f0808d9, float:1.8082095E38)
            X.C18270x1.A0d(r2, r4, r3, r1)
        L_0x0210:
            com.whatsapp.wds.components.fab.WDSFab r2 = r0.A0N
            if (r2 == 0) goto L_0x0219
            r1 = 20
            X.C18310x6.A18(r2, r0, r1)
        L_0x0219:
            return
        L_0x021a:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x021f:
            java.lang.String r0 = "emojiRichFormatterStaticCaller"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0226:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022e:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0236:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x023d:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0242:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0247:
            java.lang.String r0 = "mainDispatcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreationFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A0c() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            waEditText.setOnClickListener((View.OnClickListener) null);
        }
        WaEditText waEditText2 = this.A04;
        if (waEditText2 != null) {
            waEditText2.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout2 = this.A00;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        this.A06 = null;
        this.A08 = null;
        this.A0M = null;
        this.A0L = null;
        this.A0I = null;
        this.A0J = null;
        this.A0K = null;
        this.A07 = null;
        this.A00 = null;
        this.A0N = null;
        super.A0c();
    }

    public final C620733j A1J() {
        C620733j r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final Calendar A1K() {
        return (Calendar) C18300x5.A0d(this.A0U);
    }

    public final void A1L() {
        View A042;
        AnonymousClass5UY r0 = this.A0I;
        if (!(r0 == null || (A042 = r0.A04()) == null)) {
            A042.clearFocus();
        }
        C18300x5.A1H(this.A0I);
        WaImageView waImageView = this.A06;
        if (waImageView != null) {
            waImageView.setImageResource(R.drawable.vec_action_video_call);
        }
    }

    public final void A1M() {
        WaTextView waTextView = this.A08;
        if (waTextView != null) {
            waTextView.setText(R.string.f11nameremoved);
        }
        C18300x5.A1H(this.A0M);
        AnonymousClass5UY r1 = this.A0L;
        if (r1 != null) {
            r1.A06(0);
        }
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            C633839a.A00(linearLayout, this, 30);
        }
        A1N();
    }

    public final void A1N() {
        Calendar instance = Calendar.getInstance();
        C162457s7.A0D(instance);
        AnonymousClass94W r9 = new AnonymousClass94W(A0G(), this.A0P, A1K().get(1), A1K().get(2), A1K().get(5));
        DatePicker A042 = r9.A04();
        A042.setMinDate(instance.getTimeInMillis());
        C56982ss r1 = this.A0B;
        if (r1 != null) {
            AnonymousClass31A A002 = C56982ss.A00(r1, (C95814uZ) this.A0S.getValue());
            long j = Long.MAX_VALUE;
            if (A002 != null && A002.A0b.expiration > 0) {
                j = instance.getTimeInMillis() + TimeUnit.SECONDS.toMillis((long) A002.A0b.expiration);
            }
            if (((C60552yk) ((AnonymousClass11J) this.A0T.getValue()).A0C.getValue()).A00 == AnonymousClass21P.SUCCESS) {
                C45942ap r12 = this.A0E;
                if (r12 != null) {
                    j = Math.min(r12.A02.A0H() + TimeUnit.DAYS.toMillis(C56952sp.A06(r12.A03, 6265)), j);
                } else {
                    throw C18270x1.A0S("eventUtils");
                }
            }
            A042.setMaxDate(j);
            WaEditText waEditText = this.A02;
            if (waEditText != null) {
                waEditText.setFocusable(false);
            }
            WaEditText waEditText2 = this.A02;
            if (waEditText2 != null) {
                C85814Hs.A00(waEditText2, r9, 0);
            }
            WaEditText waEditText3 = this.A02;
            if (waEditText3 != null) {
                waEditText3.setKeyListener((KeyListener) null);
            }
            WaEditText waEditText4 = this.A02;
            if (waEditText4 != null) {
                waEditText4.setText(DateFormat.getDateInstance(2, C620733j.A02(A1J())).format(A1K().getTime()));
                return;
            }
            return;
        }
        throw C18270x1.A0S("chatsCache");
    }
}
