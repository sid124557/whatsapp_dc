package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0AR;
import X.AnonymousClass0O5;
import X.AnonymousClass0P5;
import X.AnonymousClass0RP;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass3XG;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GJ;
import X.AnonymousClass4XD;
import X.AnonymousClass4XZ;
import X.AnonymousClass4Z7;
import X.AnonymousClass5IO;
import X.AnonymousClass5MO;
import X.AnonymousClass5UY;
import X.AnonymousClass6F5;
import X.AnonymousClass7D2;
import X.AnonymousClass7ZE;
import X.AnonymousClass8GN;
import X.C05570Ua;
import X.C105175Tw;
import X.C105365Uq;
import X.C107335b8;
import X.C114015mM;
import X.C116655qe;
import X.C116855qy;
import X.C117695sL;
import X.C150477Qw;
import X.C158507k5;
import X.C15910sA;
import X.C17280vG;
import X.C179138if;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C187958y5;
import X.C197912r;
import X.C29421in;
import X.C56602sG;
import X.C620733j;
import X.C626936e;
import X.C64773Ex;
import X.C69263Wi;
import X.C69423Wy;
import X.C86604Kt;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C87044Mw;
import X.C91174j2;
import X.C91194j5;
import X.C91224j8;
import X.C998058g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class CallGrid extends FrameLayout implements AnonymousClass4GJ {
    public Parcelable A00;
    public AnonymousClass0P5 A01;
    public AnonymousClass0AR A02;
    public C69263Wi A03;
    public AnonymousClass30B A04;
    public AnonymousClass8GN A05;
    public C179138if A06;
    public AnonymousClass4XD A07;
    public C91174j2 A08;
    public CallGridViewModel A09;
    public AudioChatBottomSheetViewModel A0A;
    public AnonymousClass3XG A0B;
    public ScreenShareViewModel A0C;
    public AnonymousClass5IO A0D;
    public C116655qe A0E;
    public C64773Ex A0F;
    public C29421in A0G;
    public C105365Uq A0H;
    public C114015mM A0I;
    public C620733j A0J;
    public AnonymousClass1VX A0K;
    public C187958y5 A0L;
    public C69423Wy A0M;
    public C116855qy A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final View A0U;
    public final View A0V;
    public final View A0W;
    public final View A0X;
    public final View A0Y;
    public final View A0Z;
    public final TextView A0a;
    public final C17280vG A0b;
    public final LinearLayoutManager A0c;
    public final AnonymousClass0O5 A0d;
    public final AnonymousClass0O5 A0e;
    public final RecyclerView A0f;
    public final RecyclerView A0g;
    public final AnonymousClass7D2 A0h;
    public final AnonymousClass5MO A0i;
    public final C197912r A0j;
    public final CallGridLayoutManager A0k;
    public final AnonymousClass4XZ A0l;
    public final FocusViewContainer A0m;
    public final PipViewContainer A0n;
    public final C56602sG A0o;
    public final AnonymousClass5UY A0p;
    public final AnonymousClass5UY A0q;
    public final AnonymousClass5UY A0r;
    public final AnonymousClass5UY A0s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallGrid(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r20
            r2 = r21
            r0.<init>(r1, r3, r2)
            boolean r2 = r0.A0O
            if (r2 != 0) goto L_0x00df
            r2 = 1
            r0.A0O = r2
            java.lang.Object r4 = r0.generatedComponent()
            X.5iW r4 = (X.C111685iW) r4
            X.4av r4 = (X.C88864av) r4
            X.3Db r3 = r4.A0K
            X.1VX r2 = X.C64333Db.A4B(r3)
            r0.A0K = r2
            X.4as r4 = r4.A0I
            X.4C1 r2 = r4.A0I
            java.lang.Object r2 = r2.get()
            X.4XD r2 = (X.AnonymousClass4XD) r2
            r0.A07 = r2
            X.1VX r13 = X.C86604Kt.A0Y(r3)
            X.4C1 r2 = r4.A22
            java.lang.Object r5 = r2.get()
            X.5E5 r5 = (X.AnonymousClass5E5) r5
            X.4C1 r2 = r4.A23
            java.lang.Object r6 = r2.get()
            X.5E6 r6 = (X.AnonymousClass5E6) r6
            X.4C1 r2 = r4.A24
            java.lang.Object r7 = r2.get()
            X.5E7 r7 = (X.AnonymousClass5E7) r7
            X.4C1 r2 = r4.A26
            java.lang.Object r8 = r2.get()
            X.5E8 r8 = (X.AnonymousClass5E8) r8
            X.4C1 r2 = r4.A27
            java.lang.Object r9 = r2.get()
            X.5E9 r9 = (X.AnonymousClass5E9) r9
            X.4C1 r2 = r4.A28
            java.lang.Object r10 = r2.get()
            X.5EA r10 = (X.AnonymousClass5EA) r10
            X.4C1 r2 = r4.A29
            java.lang.Object r11 = r2.get()
            X.5EB r11 = (X.AnonymousClass5EB) r11
            X.8y5 r14 = X.C86614Ku.A0n(r3)
            X.5bk r2 = r3.A00
            X.4C1 r2 = r2.A9V
            java.lang.Object r12 = r2.get()
            X.8GN r12 = (X.AnonymousClass8GN) r12
            X.4j2 r4 = new X.4j2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A08 = r4
            X.5mM r2 = X.C64333Db.A29(r3)
            r0.A0I = r2
            X.3Ex r2 = X.C64333Db.A26(r3)
            r0.A0F = r2
            X.1in r2 = X.C86614Ku.A0S(r3)
            r0.A0G = r2
            X.30B r2 = X.C86624Kv.A0M(r3)
            r0.A04 = r2
            X.3Wi r2 = X.C64333Db.A04(r3)
            r0.A03 = r2
            X.33j r2 = X.C64333Db.A2t(r3)
            r0.A0J = r2
            X.5bk r4 = r3.A00
            X.4C1 r2 = r4.ABv
            java.lang.Object r2 = r2.get()
            X.5IO r2 = (X.AnonymousClass5IO) r2
            r0.A0D = r2
            X.4C1 r2 = r4.ABw
            java.lang.Object r2 = r2.get()
            X.5qe r2 = (X.C116655qe) r2
            r0.A0E = r2
            X.4C1 r2 = r3.AbX
            java.lang.Object r2 = r2.get()
            X.3Wy r2 = (X.C69423Wy) r2
            r0.A0M = r2
            X.4C1 r2 = r4.A9V
            java.lang.Object r2 = r2.get()
            X.8GN r2 = (X.AnonymousClass8GN) r2
            r0.A05 = r2
            X.8y5 r2 = X.C86614Ku.A0o(r3)
            r0.A0L = r2
            X.4C1 r2 = r3.A4M
            java.lang.Object r2 = r2.get()
            X.3XG r2 = (X.AnonymousClass3XG) r2
            r0.A0B = r2
        L_0x00df:
            r5 = 2
            X.8za r2 = new X.8za
            r2.<init>(r0, r5)
            r0.A0e = r2
            r9 = 3
            X.8za r2 = new X.8za
            r2.<init>(r0, r9)
            r0.A0d = r2
            com.whatsapp.calling.callgrid.view.CallGrid$$ExternalSyntheticLambda1 r2 = new com.whatsapp.calling.callgrid.view.CallGrid$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r0.A0b = r2
            r11 = 1
            X.8zy r2 = new X.8zy
            r2.<init>(r0, r11)
            r0.A0o = r2
            X.5MO r2 = new X.5MO
            r2.<init>(r0)
            r0.A0i = r2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)
            r2 = 2131624280(0x7f0e0158, float:1.8875735E38)
            r3.inflate(r2, r0, r11)
            r2 = 2131428419(0x7f0b0443, float:1.8478482E38)
            androidx.recyclerview.widget.RecyclerView r3 = X.C86654Ky.A0P(r0, r2)
            r0.A0g = r3
            r2 = 2131428416(0x7f0b0440, float:1.8478476E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.C86654Ky.A0P(r0, r2)
            r0.A0f = r4
            java.lang.String r2 = "CallGrid/constructor Setting adapters"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.4XD r2 = r0.A07
            r3.setAdapter(r2)
            X.4j2 r2 = r0.A08
            r4.setAdapter(r2)
            android.content.res.Resources r6 = r0.getResources()
            r2 = 2131168607(0x7f070d5f, float:1.795152E38)
            int r8 = r6.getDimensionPixelSize(r2)
            X.33j r2 = r0.A0J
            boolean r10 = X.C620733j.A04(r2)
            r15 = 0
            X.8GN r7 = r0.A05
            X.4XZ r6 = new X.4XZ
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0o(r6)
            X.4j2 r2 = r0.A08
            r2.A00 = r8
            X.8y5 r2 = r0.A0L
            boolean r2 = r2.BIo()
            if (r2 == 0) goto L_0x015a
            r6.A02 = r11
        L_0x015a:
            r2 = 2131428421(0x7f0b0445, float:1.8478486E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            r0.A0Z = r2
            r2 = 2131428415(0x7f0b043f, float:1.8478474E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            r0.A0U = r2
            r2 = 2131430960(0x7f0b0e30, float:1.8483636E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            r0.A0V = r2
            r2 = 2131433156(0x7f0b16c4, float:1.848809E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            r0.A0Y = r2
            r2 = 2131432455(0x7f0b1407, float:1.8486668E38)
            android.view.View r8 = X.C06560Yg.A02(r0, r2)
            r0.A0X = r8
            r2 = 2131428417(0x7f0b0441, float:1.8478478E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r0, r2)
            r0.A0a = r2
            r2 = 2131428418(0x7f0b0442, float:1.847848E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            r0.A0W = r2
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            int[] r6 = new int[r5]
            android.content.Context r5 = r0.getContext()
            r2 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r2 = X.AnonymousClass0Y8.A04(r5, r2)
            r6[r15] = r2
            android.content.Context r5 = r0.getContext()
            r2 = 2131102581(0x7f060b75, float:1.7817604E38)
            int r2 = X.AnonymousClass0Y8.A04(r5, r2)
            r6[r11] = r2
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r7, r6)
            r8.setBackground(r2)
            X.33j r2 = r0.A0J
            boolean r7 = X.C620733j.A04(r2)
            r6 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            android.view.View r2 = r0.A0V
            if (r7 == 0) goto L_0x02bb
            r2.setRotation(r6)
            android.view.View r2 = r0.A0Y
            r2.setRotation(r5)
        L_0x01d4:
            r0.A08()
            X.7D3 r7 = new X.7D3
            r7.<init>(r0)
            X.12r r6 = new X.12r
            r6.<init>()
            r0.A0j = r6
            X.2FA r2 = new X.2FA
            r2.<init>(r0)
            r6.A00 = r2
            r6.A00 = r15
            X.8GN r2 = r0.A05
            com.whatsapp.calling.callgrid.view.CallGridLayoutManager r5 = new com.whatsapp.calling.callgrid.view.CallGridLayoutManager
            r5.<init>(r2, r6)
            r0.A0k = r5
            r5.A02 = r7
            r2 = 0
            r5.A16(r2)
            int r2 = r5.A01
            if (r15 == r2) goto L_0x0204
            r5.A01 = r15
            r5.A0V()
        L_0x0204:
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r15)
            r0.A0c = r2
            r4.setLayoutManager(r2)
            r2 = 0
            r4.setItemAnimator(r2)
            X.AnonymousClass691.A00(r4, r0, r11)
            X.6HU r2 = new X.6HU
            r2.<init>()
            r2.A06(r4)
            r3.setLayoutManager(r5)
            r3.setItemAnimator(r6)
            android.content.res.Resources r4 = r0.getResources()
            r2 = 2131168606(0x7f070d5e, float:1.7951519E38)
            int r14 = r4.getDimensionPixelSize(r2)
            X.33j r2 = r0.A0J
            boolean r16 = X.C620733j.A04(r2)
            X.8GN r13 = r0.A05
            X.4XZ r12 = new X.4XZ
            r17 = r15
            r12.<init>(r13, r14, r15, r16, r17)
            r0.A0l = r12
            r3.A0o(r12)
            r0.A0R = r15
            r2 = 2131432457(0x7f0b1409, float:1.8486672E38)
            android.view.View r3 = X.C06560Yg.A02(r0, r2)
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r3
            r0.A0n = r3
            X.8FT r2 = new X.8FT
            r2.<init>(r0)
            r3.A05 = r2
            r2 = 2131430195(0x7f0b0b33, float:1.8482084E38)
            android.view.View r2 = X.C06560Yg.A02(r0, r2)
            com.whatsapp.calling.callgrid.view.FocusViewContainer r2 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r2
            r0.A0m = r2
            X.7D2 r2 = new X.7D2
            r2.<init>()
            r0.A0h = r2
            X.1VX r2 = r0.A0K
            boolean r3 = X.C627436k.A0I(r2)
            r2 = 2131431133(0x7f0b0edd, float:1.8483987E38)
            if (r3 == 0) goto L_0x0276
            r2 = 2131434520(0x7f0b1c18, float:1.8490856E38)
        L_0x0276:
            X.5UY r2 = X.AnonymousClass0x2.A0M(r0, r2)
            r0.A0q = r2
            r2 = 2131434757(0x7f0b1d05, float:1.8491337E38)
            X.5UY r2 = X.AnonymousClass0x2.A0M(r0, r2)
            r0.A0s = r2
            r2 = 2131428412(0x7f0b043c, float:1.8478468E38)
            X.5UY r2 = X.AnonymousClass0x2.A0M(r0, r2)
            r0.A0p = r2
            r2 = 2131433847(0x7f0b1977, float:1.8489491E38)
            X.5UY r3 = X.AnonymousClass0x2.A0M(r0, r2)
            r0.A0r = r3
            X.8y5 r2 = r0.A0L
            boolean r2 = r2.BIC()
            if (r2 == 0) goto L_0x02ba
            r2 = 2131234192(0x7f080d90, float:1.8084543E38)
            X.0AR r1 = X.AnonymousClass0AR.A04(r1, r2)
            r0.A02 = r1
            X.8zc r1 = new X.8zc
            r1.<init>(r0, r11)
            r0.A01 = r1
            android.view.View r1 = r3.A04()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.0AR r0 = r0.A02
            r1.setImageDrawable(r0)
        L_0x02ba:
            return
        L_0x02bb:
            r2.setRotation(r5)
            android.view.View r2 = r0.A0Y
            r2.setRotation(r6)
            goto L_0x01d4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static /* synthetic */ void A02(CallGrid callGrid) {
        int size = callGrid.A07.A0I.size();
        C18260x0.A0y("CallGrid/updateGridLayoutMode, nTiles: ", AnonymousClass001.A0o(), size);
        for (int i = 0; i < size; i++) {
            AnonymousClass4Z7 r2 = (AnonymousClass4Z7) callGrid.A0g.A0F(i);
            if ((r2 instanceof C91224j8) || (r2 instanceof C91194j5)) {
                int i2 = 2;
                if (!callGrid.A0S) {
                    if (size <= 2) {
                        i2 = 0;
                    } else if (size <= 8) {
                        i2 = 1;
                    }
                }
                r2.A0A(i2);
            }
        }
        callGrid.A09();
        if (callGrid.A09 != null && callGrid.A0R) {
            if (callGrid.A08.A0I.size() > 0 || callGrid.A0K.A0X(5200)) {
                callGrid.A09.A0V(callGrid.getVisibleParticipantJids());
            }
        }
    }

    public static /* synthetic */ void A03(CallGrid callGrid, AnonymousClass7ZE r6) {
        View view;
        int i;
        int i2;
        AnonymousClass5UY r1;
        int i3;
        if (r6 != null) {
            boolean A1U = C18280x3.A1U(C86664Kz.A0J(callGrid.A0K), 3);
            if (r6.A02) {
                TextView textView = callGrid.A0a;
                textView.setText(String.valueOf(r6.A01));
                if (A1U) {
                    View view2 = callGrid.A0W;
                    float f = ((float) r6.A00) * -90.0f;
                    view2.setRotation(f);
                    textView.setRotation(f);
                }
                i2 = 0;
                textView.setVisibility(0);
            } else {
                i2 = 8;
                callGrid.A0a.setVisibility(8);
            }
            callGrid.A0W.setVisibility(i2);
            if (r6.A03) {
                if (A1U) {
                    callGrid.A0r.A04().setRotation(((float) r6.A00) * -90.0f);
                }
                r1 = callGrid.A0r;
                i3 = 0;
            } else {
                r1 = callGrid.A0r;
                i3 = 8;
            }
            r1.A06(i3);
            view = callGrid.A0X;
            i = 0;
        } else {
            view = callGrid.A0X;
            i = 8;
        }
        view.setVisibility(i);
        callGrid.setSSPipIconAnimation(r6);
    }

    public static /* synthetic */ void A04(CallGrid callGrid, C158507k5 r3) {
        callGrid.A0Q = AnonymousClass000.A1U(r3.A00, 2);
        callGrid.setupLonelyStateContainerMargins(callGrid.A0R);
    }

    /* access modifiers changed from: private */
    public List getVisibleParticipantJids() {
        Collection A0s2;
        C626936e.A0B(this.A0R);
        RecyclerView recyclerView = this.A0g;
        C626936e.A0B(AnonymousClass000.A1W(recyclerView.getLayoutManager()));
        if (this.A0K.A0X(5200)) {
            A0s2 = AnonymousClass002.A0K();
        } else {
            A0s2 = AnonymousClass001.A0s();
        }
        FocusViewContainer focusViewContainer = this.A0m;
        if (focusViewContainer.getVisiblePeerJid() != null) {
            A0s2.add(focusViewContainer.getVisiblePeerJid());
        }
        for (int i = 0; i <= recyclerView.getLayoutManager().A09(); i++) {
            AnonymousClass4Z7 r1 = (AnonymousClass4Z7) recyclerView.A0F(i);
            if (r1 != null && r1.A06() && !r1.A07.A0J) {
                A0s2.add(r1.A07.A0b);
            }
        }
        LinearLayoutManager linearLayoutManager = this.A0c;
        int A1H = linearLayoutManager.A1H();
        int A1J = linearLayoutManager.A1J();
        for (int i2 = A1H; i2 <= A1J; i2++) {
            AnonymousClass4Z7 r3 = (AnonymousClass4Z7) this.A0f.A0F(i2);
            if (r3 != null && r3.A06()) {
                C105175Tw r0 = r3.A07;
                C626936e.A06(r0);
                if (!r0.A0J) {
                    if (i2 == A1H || i2 == A1J) {
                        Rect A0N2 = AnonymousClass001.A0N();
                        View view = r3.A0H;
                        view.getGlobalVisibleRect(A0N2);
                        if (A0N2.width() < view.getWidth() / 3) {
                        }
                    }
                    A0s2.add(r3.A07.A0b);
                }
            }
        }
        if (!(A0s2 instanceof List)) {
            return AnonymousClass002.A0J(A0s2);
        }
        return (List) A0s2;
    }

    /* access modifiers changed from: private */
    public void setIsVoiceChat(boolean z) {
        this.A0S = z;
        CallGridLayoutManager callGridLayoutManager = this.A0k;
        callGridLayoutManager.A07 = z;
        if (z) {
            callGridLayoutManager.A09.post(C117695sL.A00(callGridLayoutManager, 1));
        }
        this.A07.A05 = z;
        this.A0l.A04 = z;
        CallGridViewModel callGridViewModel = this.A09;
        if (callGridViewModel != null && callGridViewModel.A0s.A07() != null) {
            A0B((C998058g) this.A09.A0s.A07());
        }
    }

    private void setSSPipIconAnimation(AnonymousClass7ZE r4) {
        AnonymousClass0P5 r1;
        AnonymousClass0AR r2 = this.A02;
        if (r2 != null && (r1 = this.A01) != null) {
            if (r4 == null || !r4.A03) {
                r2.A0A(r1);
                if (r2.isRunning()) {
                    r2.stop();
                    return;
                }
                return;
            }
            r2.A09(r1);
            if (!r2.isRunning()) {
                r2.start();
            }
        }
    }

    private void setupLonelyStateContainerMargins(boolean z) {
        int i;
        Resources resources;
        int i2;
        if (!this.A0S) {
            View A042 = this.A0q.A04();
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(A042);
            Resources resources2 = getResources();
            if (z) {
                i = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
                if (!this.A0Q) {
                    resources = getResources();
                    i2 = R.dimen.f6nameremoved;
                }
                resources = getResources();
                i2 = R.dimen.f6nameremoved;
            } else {
                i = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
                resources = getResources();
                i2 = R.dimen.f6nameremoved;
            }
            A0T2.setMargins(i, 0, i, resources.getDimensionPixelSize(i2));
            A042.setLayoutParams(A0T2);
        }
    }

    public final C05570Ua A07(C105175Tw r5) {
        int i;
        RecyclerView recyclerView;
        AnonymousClass4XD r2 = this.A07;
        int i2 = 0;
        while (true) {
            List list = r2.A0I;
            if (i >= list.size()) {
                break;
            } else if (!r5.A0b.equals(((C105175Tw) list.get(i)).A0b)) {
                i2 = i + 1;
            } else if (i >= 0) {
                recyclerView = this.A0g;
            }
        }
        C91174j2 r22 = this.A08;
        i = 0;
        while (true) {
            List list2 = r22.A0I;
            if (i >= list2.size()) {
                return null;
            }
            if (!r5.A0b.equals(((C105175Tw) list2.get(i)).A0b)) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                recyclerView = this.A0f;
            }
        }
        return recyclerView.A0F(i);
    }

    public final void A08() {
        View view = this.A0V;
        RecyclerView recyclerView = this.A0f;
        int i = 0;
        view.setVisibility(AnonymousClass001.A08(recyclerView.canScrollHorizontally(-1) ? 1 : 0));
        View view2 = this.A0Y;
        if (!recyclerView.canScrollHorizontally(1)) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A0g.canScrollVertically(-1) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r4 = this;
            android.view.View r2 = r4.A0Z
            boolean r0 = r4.A0R
            r3 = 0
            if (r0 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0g
            r0 = -1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r2.setVisibility(r0)
            android.view.View r2 = r4.A0U
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0g
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r2.setVisibility(r3)
            return
        L_0x0029:
            r3 = 8
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A09():void");
    }

    public void A0A(C15910sA r5, CallGridViewModel callGridViewModel, MenuBottomSheetViewModel menuBottomSheetViewModel, AudioChatBottomSheetViewModel audioChatBottomSheetViewModel, ScreenShareViewModel screenShareViewModel) {
        if (this.A09 == null) {
            this.A09 = callGridViewModel;
            this.A0C = screenShareViewModel;
            if (screenShareViewModel != null) {
                C86604Kt.A1N(r5, screenShareViewModel.A0I, this, 137);
            }
            C86604Kt.A1N(r5, this.A09.A0K, this, 128);
            C86604Kt.A1N(r5, this.A09.A0n, this, 129);
            C86604Kt.A1N(r5, this.A09.A0I, this, 130);
            AnonymousClass08M r2 = this.A09.A0N;
            PipViewContainer pipViewContainer = this.A0n;
            Objects.requireNonNull(pipViewContainer);
            C86604Kt.A1N(r5, r2, pipViewContainer, 131);
            AnonymousClass08M r1 = this.A09.A0G;
            FocusViewContainer focusViewContainer = this.A0m;
            Objects.requireNonNull(focusViewContainer);
            C86604Kt.A1N(r5, r1, focusViewContainer, 132);
            C86604Kt.A1N(r5, this.A09.A0H, this, 133);
            C86604Kt.A1N(r5, this.A09.A0k, this, 134);
            C86604Kt.A1N(r5, this.A09.A0p, this, 135);
            C86604Kt.A1N(r5, this.A09.A0l, this, 136);
            AnonymousClass107 r12 = this.A09.A0o;
            CallGridLayoutManager callGridLayoutManager = this.A0k;
            Objects.requireNonNull(callGridLayoutManager);
            C86604Kt.A1N(r5, r12, callGridLayoutManager, 138);
            AnonymousClass107 r13 = this.A09.A0q;
            Objects.requireNonNull(callGridLayoutManager);
            C86604Kt.A1N(r5, r13, callGridLayoutManager, 139);
            C86604Kt.A1N(r5, this.A09.A0t, this, 140);
            C86604Kt.A1N(r5, this.A09.A0j, this, 121);
            C86604Kt.A1N(r5, this.A09.A0u, this, 122);
            C86604Kt.A1N(r5, this.A09.A0r, this, 123);
            C86604Kt.A1N(r5, this.A09.A0s, this, 124);
            C86604Kt.A1N(r5, this.A09.A0M, this, 125);
            AnonymousClass107 r14 = this.A09.A0v;
            AnonymousClass4XD r22 = this.A07;
            Objects.requireNonNull(r22);
            C86604Kt.A1N(r5, r14, r22, 126);
            C86604Kt.A1N(r5, this.A09.A0i, this, 127);
            r22.A04 = callGridViewModel;
            this.A08.A04 = callGridViewModel;
            if (menuBottomSheetViewModel != null) {
                focusViewContainer.setMenuViewModel(r5, menuBottomSheetViewModel);
            }
            this.A0A = audioChatBottomSheetViewModel;
        }
    }

    public final void A0B(C998058g r6) {
        AnonymousClass5UY r3;
        AnonymousClass5UY r0;
        AnonymousClass3ZH r2;
        int i = 8;
        if (this.A0S) {
            r3 = this.A0s;
            r0 = this.A0q;
        } else {
            r3 = this.A0q;
            r0 = this.A0s;
        }
        r0.A06(8);
        boolean z = false;
        int i2 = 8;
        if (r6 != C998058g.NONE) {
            z = true;
            i2 = 0;
        }
        r3.A06(i2);
        RecyclerView recyclerView = this.A0g;
        int i3 = 1;
        if (z) {
            i3 = 4;
        }
        recyclerView.setImportantForAccessibility(i3);
        if (z) {
            ViewGroup viewGroup = (ViewGroup) r3.A04();
            CallGridViewModel callGridViewModel = this.A09;
            if (callGridViewModel == null) {
                r2 = null;
            } else {
                r2 = callGridViewModel.A05;
            }
            View findViewById = viewGroup.findViewById(R.id.contact_photo);
            if (findViewById != null) {
                if (r2 != null && !this.A0S) {
                    i = 0;
                }
                findViewById.setVisibility(i);
                if (r2 != null) {
                    A0C(r2);
                }
            }
            setupLonelyStateText(viewGroup, r6);
            setupLonelyStateButton(viewGroup, r2, r6);
        }
    }

    public final void A0C(AnonymousClass3ZH r5) {
        ImageView A0F2 = AnonymousClass0x9.A0F(this.A0q.A04(), R.id.contact_photo);
        if (A0F2 != null) {
            C105365Uq r0 = this.A0H;
            if (r0 == null) {
                r0 = this.A0I.A06(getContext(), "lonely-state-contact-photo-loader");
                this.A0H = r0;
            }
            r0.A08(A0F2, r5);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0N;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public FocusViewContainer getFocusViewContainer() {
        return this.A0m;
    }

    public LinearLayout getLonelyState() {
        return (LinearLayout) this.A0q.A04();
    }

    public PipViewContainer getPipViewContainer() {
        return this.A0n;
    }

    public LinearLayout getVoiceChatLonelyStateView() {
        return (LinearLayout) this.A0s.A04();
    }

    public static /* synthetic */ void A05(CallGrid callGrid, boolean z) {
        C18260x0.A1E("CallGrid/onAvSwitched, isVideoEnabled: ", AnonymousClass001.A0o(), z);
        callGrid.A0R = z;
        callGrid.A0k.A06 = z;
        callGrid.A0j.A0D = z;
        callGrid.setupLonelyStateContainerMargins(z);
    }

    /* access modifiers changed from: private */
    public void setMargins(Rect rect) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.rightMargin = rect.right;
            setLayoutParams(marginLayoutParams);
        }
    }

    private void setShouldInvalidateItemDecorations(boolean z) {
        this.A0T = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0286, code lost:
        if (r2.A07.A0b.equals(r3.A0b) != false) goto L_0x0288;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(java.util.List r12, boolean r13) {
        /*
            r11 = this;
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r12)
            r5 = 0
            r4 = r5
            r3 = r5
            r2 = 0
        L_0x0008:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0021
            java.lang.Object r1 = r6.get(r2)
            X.5Tw r1 = (X.C105175Tw) r1
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0019
            r3 = r1
        L_0x0019:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x001e
            r4 = r1
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0021:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0045
            com.whatsapp.calling.callgrid.view.CallGridLayoutManager r0 = r11.A0k
            int r7 = r0.A06
            X.8GN r2 = r11.A05
            int r1 = r6.size()
            boolean r0 = r11.A0P
            int r0 = r2.A01(r1, r0)
            if (r7 != r0) goto L_0x0045
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = r11.A0m
            X.4Z7 r0 = r0.A05
            if (r0 == 0) goto L_0x026c
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x026c
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0g
            r2.setItemAnimator(r5)
            if (r4 == 0) goto L_0x028f
            com.whatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0n
            com.whatsapp.jid.UserJid r7 = r4.A0b
            X.4Z7 r1 = r8.A04
            if (r1 == 0) goto L_0x0255
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0255
            X.5Tw r0 = r1.A07
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0255
            android.graphics.Rect r7 = r8.getGlobalVisibleRect()
        L_0x0068:
            if (r3 == 0) goto L_0x01d7
            r6.remove(r3)
            if (r4 == 0) goto L_0x0189
            com.whatsapp.jid.UserJid r1 = r3.A0b
            com.whatsapp.jid.UserJid r0 = r4.A0b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0189
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0n
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x008f
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x008f
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x008f:
            X.4Z7 r1 = r3.A04
            if (r1 == 0) goto L_0x009c
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x009c
            r1.A08()
        L_0x009c:
            r3.A04 = r5
            r3.removeAllViews()
        L_0x00a1:
            X.0Ua r0 = r11.A07(r4)
            if (r0 == 0) goto L_0x00ac
            X.4Z7 r0 = (X.AnonymousClass4Z7) r0
            r0.A08()
        L_0x00ac:
            com.whatsapp.calling.callgrid.view.FocusViewContainer r3 = r11.A0m
            r5 = 8
            X.4Z7 r1 = r3.A05
            if (r1 == 0) goto L_0x00d5
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x00d5
            X.5Tw r0 = r1.A07
            com.whatsapp.jid.UserJid r1 = r4.A0b
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d0
            boolean r1 = r4.A0A
            X.4Z7 r0 = r3.A05
            X.5Tw r0 = r0.A07
            boolean r0 = r0.A0A
            if (r1 == r0) goto L_0x010b
        L_0x00d0:
            X.4Z7 r0 = r3.A05
            r0.A08()
        L_0x00d5:
            android.widget.FrameLayout r9 = r3.A01
            r9.removeAllViews()
            X.4XD r8 = r3.A04
            boolean r1 = r4.A0A
            r0 = 2
            if (r1 == 0) goto L_0x00e2
            r0 = 6
        L_0x00e2:
            X.0Ua r1 = r8.A04(r3, r0)
            X.4Z7 r1 = (X.AnonymousClass4Z7) r1
            r3.A05 = r1
            boolean r0 = r1 instanceof X.C91234j9
            if (r0 == 0) goto L_0x00f3
            X.4j9 r1 = (X.C91234j9) r1
            r1.A0H()
        L_0x00f3:
            X.4Z7 r0 = r3.A05
            android.view.View r1 = r0.A0H
            int r0 = r4.hashCode()
            r1.setId(r0)
            X.4Z7 r0 = r3.A05
            android.view.View r8 = r0.A0H
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r9.addView(r8, r0)
        L_0x010b:
            X.4Z7 r0 = r3.A05
            if (r0 == 0) goto L_0x0112
            r0.A0G(r4)
        L_0x0112:
            com.whatsapp.WaTextView r8 = r3.A03
            r0 = 0
            r8.setVisibility(r0)
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x017d
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            r8.setText(r0)
        L_0x0122:
            int r0 = r3.getVisibility()
            if (r0 == r5) goto L_0x012c
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x014a
        L_0x012c:
            X.C86624Kv.A0s(r3)
            r0 = 0
            r3.setVisibility(r0)
            int r0 = r7.width()
            if (r0 == 0) goto L_0x014a
            int r0 = r7.height()
            if (r0 == 0) goto L_0x014a
            android.widget.FrameLayout r4 = r3.A01
            r1 = 0
            X.69p r0 = new X.69p
            r0.<init>(r7, r1, r3)
            r4.addOnLayoutChangeListener(r0)
        L_0x014a:
            if (r13 != 0) goto L_0x0295
            X.0Xs r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x0158
            android.os.Parcelable r0 = r0.A0O()
            r11.A00 = r0
        L_0x0158:
            X.4XD r0 = r11.A07
            r0.A0R(r6)
            boolean r0 = r11.A0T
            if (r0 == 0) goto L_0x016f
            r2.A0P()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A09
            if (r0 == 0) goto L_0x016f
            X.107 r1 = r0.A0u
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
        L_0x016f:
            android.os.Parcelable r1 = r11.A00
            if (r1 == 0) goto L_0x017c
            X.0Xs r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x017c
            r0.A0e(r1)
        L_0x017c:
            return
        L_0x017d:
            X.5ZU r1 = r3.A07
            X.3ZH r0 = r4.A0a
            java.lang.String r0 = r1.A0H(r0)
            r8.setText(r0)
            goto L_0x0122
        L_0x0189:
            X.0Ua r0 = r11.A07(r3)
            if (r0 == 0) goto L_0x0194
            X.4Z7 r0 = (X.AnonymousClass4Z7) r0
            r0.A08()
        L_0x0194:
            com.whatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0n
            r0 = 0
            r8.setVisibility(r0)
            X.4Z7 r10 = r8.A04
            if (r10 == 0) goto L_0x01d3
            boolean r9 = r8.A0A
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x01cd
            r1 = 1
        L_0x01a9:
            int r0 = r10.A02
            if (r1 != r0) goto L_0x01d3
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x01c7
            X.5Tw r0 = r10.A07
            X.C626936e.A06(r0)
            com.whatsapp.jid.UserJid r1 = r3.A0b
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01c7
            X.4Z7 r0 = r8.A04
            r0.A08()
        L_0x01c7:
            X.4Z7 r0 = r8.A04
            r0.A0G(r3)
            goto L_0x01ff
        L_0x01cd:
            r1 = 7
            if (r9 == 0) goto L_0x01a9
            r1 = 8
            goto L_0x01a9
        L_0x01d3:
            r8.A04(r3)
            goto L_0x01ff
        L_0x01d7:
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0n
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x01ed
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x01ed:
            X.4Z7 r1 = r3.A04
            if (r1 == 0) goto L_0x01fa
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x01fa
            r1.A08()
        L_0x01fa:
            r3.A04 = r5
            r3.removeAllViews()
        L_0x01ff:
            if (r4 != 0) goto L_0x00a1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A09
            X.08M r0 = r0.A0H
            java.lang.Object r0 = r0.A07()
            if (r0 != 0) goto L_0x014a
            com.whatsapp.calling.callgrid.view.FocusViewContainer r4 = r11.A0m
            r3 = 8
            X.4Z7 r1 = r4.A05
            if (r1 == 0) goto L_0x021c
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x021c
            r1.A08()
        L_0x021c:
            r4.A05 = r5
            android.widget.FrameLayout r0 = r4.A01
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r4.A02
            r0.removeAllViews()
            int r0 = r4.getVisibility()
            if (r0 == r3) goto L_0x014a
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x014a
            X.C86624Kv.A0s(r4)
            r0 = 1
            r4.A0A = r0
            com.whatsapp.WaTextView r0 = r4.A03
            r0.setVisibility(r3)
            android.view.ViewPropertyAnimator r3 = X.C86624Kv.A0A(r4)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            X.8zG r0 = new X.8zG
            r0.<init>(r4)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x014a
        L_0x0255:
            X.0Ua r1 = r11.A07(r4)
            if (r1 == 0) goto L_0x028f
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0068
            android.view.View r0 = r1.A0H
            r0.getGlobalVisibleRect(r7)
            goto L_0x0068
        L_0x026c:
            if (r4 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0288
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = r11.A0n
            X.4Z7 r2 = r0.A04
            if (r2 == 0) goto L_0x0288
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0288
            com.whatsapp.jid.UserJid r1 = r3.A0b
            X.5Tw r0 = r2.A07
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
        L_0x0288:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0g
            X.12r r0 = r11.A0j
            r2.setItemAnimator(r0)
        L_0x028f:
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()
            goto L_0x0068
        L_0x0295:
            X.4j2 r0 = r11.A08
            r0.A0R(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A0D(java.util.List, boolean):void");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PipViewContainer pipViewContainer = this.A0n;
        pipViewContainer.A01 = new Point(i, i2);
        if (pipViewContainer.isLayoutRequested()) {
            pipViewContainer.post(C117695sL.A00(pipViewContainer, 2));
        } else {
            pipViewContainer.A02();
        }
        int measuredHeight = (int) (0.04d * ((double) getMeasuredHeight()));
        C18260x0.A0y("CallGrid/onSizeChanged, scrolling peek height: ", AnonymousClass001.A0o(), measuredHeight);
        View view = this.A0Z;
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        View view2 = this.A0U;
        ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(view2);
        A0T2.height = measuredHeight;
        A0T3.height = measuredHeight;
        if (this.A0S) {
            this.A0g.A0P();
            A0T3.leftMargin = 0;
            A0T3.rightMargin = 0;
        }
        view.setLayoutParams(A0T2);
        view2.setLayoutParams(A0T3);
    }

    public void setCallGridListener(C179138if r1) {
        this.A06 = r1;
    }

    public final void setupLonelyStateButton(ViewGroup viewGroup, AnonymousClass3ZH r8, C998058g r9) {
        int i;
        WDSButton wDSButton = (WDSButton) viewGroup.findViewById(R.id.lonely_state_button);
        if (wDSButton != null) {
            VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = (VoipCallControlRingingDotsIndicator) viewGroup.findViewById(R.id.ringing_dots);
            if (!(r9 == C998058g.RINGING || voipCallControlRingingDotsIndicator == null)) {
                voipCallControlRingingDotsIndicator.clearAnimation();
                voipCallControlRingingDotsIndicator.setVisibility(8);
            }
            int ordinal = r9.ordinal();
            if (ordinal == 2 || ordinal == 6) {
                if (this.A09 != null) {
                    int i2 = 8;
                    if (r8 != null) {
                        i2 = 0;
                    }
                    wDSButton.setVisibility(i2);
                    if (r8 != null) {
                        wDSButton.setIcon(AnonymousClass0RP.A00(C86654Ky.A0B(this, wDSButton, R.string.f11nameremoved), R.drawable.vec_ic_home_tab_chats_filled));
                        i = 29;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (ordinal != 1) {
                if (ordinal != 0) {
                    wDSButton.setVisibility(8);
                    return;
                } else if (this.A09 != null && voipCallControlRingingDotsIndicator != null) {
                    C86634Kw.A1I(wDSButton);
                    wDSButton.setIcon((Drawable) null);
                    wDSButton.setVisibility(0);
                    voipCallControlRingingDotsIndicator.setVisibility(0);
                    Animation animation = voipCallControlRingingDotsIndicator.getAnimation();
                    if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                        AnonymousClass6F5 r1 = new AnonymousClass6F5(voipCallControlRingingDotsIndicator);
                        r1.setRepeatCount(-1);
                        voipCallControlRingingDotsIndicator.startAnimation(r1);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (this.A09 != null) {
                int i3 = 8;
                if (r8 != null) {
                    i3 = 0;
                }
                wDSButton.setVisibility(i3);
                if (r8 != null) {
                    wDSButton.setVisibility(0);
                    wDSButton.setText(R.string.f11nameremoved);
                    wDSButton.setIcon((int) R.drawable.ic_settings_notification);
                    i = 28;
                } else {
                    return;
                }
            } else {
                return;
            }
            C18300x5.A18(wDSButton, this, i);
        }
    }

    public final void setupLonelyStateText(ViewGroup viewGroup, C998058g r6) {
        int i;
        String string;
        C150477Qw r1;
        TextView A092 = AnonymousClass002.A09(viewGroup, R.id.lonely_state_text);
        if (A092 != null) {
            if (r6 == C998058g.CONNECTING) {
                AudioChatBottomSheetViewModel audioChatBottomSheetViewModel = this.A0A;
                if (audioChatBottomSheetViewModel == null || (r1 = audioChatBottomSheetViewModel.A03) == null) {
                    string = getResources().getString(R.string.f11nameremoved);
                } else {
                    string = C86634Kw.A0y(getContext(), r1);
                }
                A092.setText(string);
            } else {
                if (r6 == C998058g.NO_ONE_HERE) {
                    i = R.string.f11nameremoved;
                } else {
                    C998058g r0 = C998058g.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST;
                    i = R.string.f11nameremoved;
                    if (r6 == r0) {
                        i = R.string.f11nameremoved;
                    }
                }
                A092.setText(i);
            }
        }
        TextView A093 = AnonymousClass002.A09(viewGroup, R.id.lonely_state_sub_text);
        if (A093 == null) {
            return;
        }
        if (r6 != C998058g.NO_ONE_HERE) {
            A093.setVisibility(8);
        } else {
            C87044Mw.A05(C107335b8.A04(C86634Kw.A0B(A093, this), R.drawable.vec_ic_show_participants, R.color.f5nameremoved), A093, getContext().getString(R.string.f11nameremoved));
        }
    }

    public CallGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallGrid(Context context) {
        this(context, (AttributeSet) null);
    }
}
