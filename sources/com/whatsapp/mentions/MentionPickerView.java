package com.whatsapp.mentions;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass21N;
import X.AnonymousClass34R;
import X.AnonymousClass4FS;
import X.AnonymousClass4XF;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass65O;
import X.C106195Xz;
import X.C106405Yw;
import X.C113905mB;
import X.C114015mM;
import X.C116985rC;
import X.C1231267f;
import X.C172878Nf;
import X.C182728ot;
import X.C18310x6;
import X.C188848za;
import X.C27981fH;
import X.C27991fJ;
import X.C55832qz;
import X.C56612sH;
import X.C56662sM;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C620733j;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C71703cX;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C92314mS;
import X.C95814uZ;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class MentionPickerView extends C92314mS {
    public int A00;
    public LinearLayoutManager A01;
    public RecyclerView A02;
    public C116985rC A03;
    public C69263Wi A04;
    public C56972sr A05;
    public AnonymousClass64J A06;
    public C64773Ex A07;
    public AnonymousClass5ZU A08;
    public C114015mM A09;
    public C113905mB A0A;
    public C56612sH A0B;
    public C620733j A0C;
    public C56982ss A0D;
    public C66543Lv A0E;
    public C56892sj A0F;
    public C56662sM A0G;
    public C95814uZ A0H;
    public C27991fJ A0I;
    public C182728ot A0J;
    public C106195Xz A0K;
    public AnonymousClass4XF A0L;
    public C55832qz A0M;
    public AnonymousClass4FS A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public volatile boolean A0R;

    public static /* synthetic */ void A01(MentionPickerView mentionPickerView) {
        C113905mB r2;
        C95814uZ r1;
        AnonymousClass21N r0;
        if (mentionPickerView.A0H != null) {
            int A1J = mentionPickerView.A01.A1J();
            for (int A1H = mentionPickerView.A01.A1H(); A1H <= A1J; A1H++) {
                int itemViewType = mentionPickerView.A0L.getItemViewType(A1H);
                if (itemViewType != 8) {
                    if (itemViewType == 32 && (mentionPickerView.A00 & 32) == 0) {
                        r2 = mentionPickerView.A0A;
                        r1 = mentionPickerView.A0H;
                        r0 = AnonymousClass21N.DEFAULT_BOT_IMAGINE_CMD_SHOWN;
                    }
                } else if ((mentionPickerView.A00 & 8) == 0) {
                    r2 = mentionPickerView.A0A;
                    r1 = mentionPickerView.A0H;
                    r0 = AnonymousClass21N.DEFAULT_BOT_SHOWN;
                }
                r2.A04(r0, r1);
                mentionPickerView.A00 = itemViewType | mentionPickerView.A00;
            }
        }
    }

    public View getContentView() {
        return this.A02;
    }

    public void setup(AnonymousClass65O r19, Bundle bundle) {
        Bundle bundle2 = bundle;
        C95814uZ A022 = C106405Yw.A02(bundle2, "ARG_JID");
        boolean z = bundle2.getBoolean("ARG_IS_DARK_THEME");
        boolean z2 = bundle2.getBoolean("ARG_HIDE_END_DIVIDER");
        boolean z3 = bundle2.getBoolean("ARG_WITH_BACKGROUND");
        boolean z4 = bundle2.getBoolean("ARG_INCLUDE_BOT_CONTACTS");
        this.A0H = A022;
        this.A0I = AnonymousClass34R.A03(A022);
        getContext();
        this.A01 = new LinearLayoutManager(1);
        RecyclerView A0w = C86664Kz.A0w(this, R.id.list);
        this.A02 = A0w;
        A0w.setLayoutManager(this.A01);
        this.A02.A0q(new C188848za(this, 5));
        setVisibility(8);
        if (z3) {
            if (!z) {
                setBackgroundResource(R.drawable.ib_new_expanded_top);
            } else {
                C86604Kt.A0z(getContext(), this, R.color.f5nameremoved);
            }
        }
        C56612sH r10 = this.A0B;
        AnonymousClass1VX r12 = this.A04;
        Context context = getContext();
        C69263Wi r5 = this.A04;
        C106195Xz r15 = this.A0K;
        C56972sr r6 = this.A05;
        C114015mM r9 = this.A09;
        this.A0L = new AnonymousClass4XF(context, this.A03, r5, r6, this.A06, this.A08, r9, r10, this.A0C, r12, A022, r19, r15, z, z2);
        this.A0N.BkP(new C71703cX(44, (Object) this, z4));
        this.A0L.BiZ(new C1231267f(this, 4));
        this.A02.setAdapter(this.A0L);
    }

    public MentionPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.3ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.3ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.3ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.3ZL} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r1 == 6) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r8.A04.A0X(4087) != false) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(com.whatsapp.mentions.MentionPickerView r8, boolean r9) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.4uZ r1 = r8.A0H
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x004c
            X.2ss r0 = r8.A0D
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x004c
            java.util.List r0 = r8.getUserContacts()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            X.3ZH r2 = X.C18310x6.A0R(r3)
            X.1VX r1 = r8.A04
            r0 = 6172(0x181c, float:8.649E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0042
            X.2sH r1 = r8.A0B
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = X.AnonymousClass31U.A01(r0, r1, r2)
            boolean r0 = X.C107575bX.A0F(r0)
            r1 = 16
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 2
        L_0x0043:
            X.7Hz r0 = new X.7Hz
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x001c
        L_0x004c:
            X.4uZ r1 = r8.A0H
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x00a1
            X.2ss r0 = r8.A0D
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 3
            if (r1 != r0) goto L_0x00a1
            X.1VX r1 = r8.A04
            r0 = 3097(0xc19, float:4.34E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00a1
            X.1VX r1 = r8.A04
            r0 = 3334(0xd06, float:4.672E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0073:
            X.5Xz r1 = r8.A0K
            X.1fJ r0 = r8.A0I
            java.util.List r0 = r1.A04(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x007f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r3 = r5.next()
            X.3ZM r3 = (X.AnonymousClass3ZM) r3
            X.3Ex r1 = r8.A07
            X.4uZ r0 = r3.A00
            X.3ZH r2 = r1.A0A(r0)
            java.lang.String r0 = r3.A01
            r2.A0P = r0
            r1 = 2
            X.7Hz r0 = new X.7Hz
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x007f
        L_0x00a1:
            X.4uZ r1 = r8.A0H
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x00c2
            X.2ss r0 = r8.A0D
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 2
            if (r1 == r0) goto L_0x00b7
            r0 = 6
            if (r1 != r0) goto L_0x00c2
        L_0x00b7:
            X.1VX r1 = r8.A04
            r0 = 4087(0xff7, float:5.727E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c2
            goto L_0x0073
        L_0x00c2:
            if (r9 == 0) goto L_0x015d
            X.5rC r1 = r8.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r1.A04()
            X.5TH r0 = (X.AnonymousClass5TH) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x015d
            X.5rC r0 = r8.A03
            java.lang.Object r3 = r0.A04()
            X.5TH r3 = (X.AnonymousClass5TH) r3
            boolean r1 = r8.A0R
            X.8qC r7 = r3.A08
            java.lang.Object r0 = r7.get()
            X.33R r0 = (X.AnonymousClass33R) r0
            X.3ZH r6 = r0.A02(r1)
            r2 = 0
            r8.A0R = r2
            if (r6 == 0) goto L_0x015d
            r1 = 8
            X.7Hz r0 = new X.7Hz
            r0.<init>(r1, r6)
            r4.add(r2, r0)
            X.1VX r1 = r3.A07
            r0 = 6385(0x18f1, float:8.947E-42)
            boolean r0 = r1.A0X(r0)
            r5 = 0
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r7.get()
            X.33R r0 = (X.AnonymousClass33R) r0
            X.3ZH r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x015d
            X.4uZ r1 = r0.A0H
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x015d
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x015d
            X.8qC r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.2ff r0 = (X.C48902ff) r0
            X.2o1 r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x015d
            java.util.List r0 = r0.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x0132:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3ZL r0 = (X.AnonymousClass3ZL) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "imagine"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0132
            r5 = r2
        L_0x014a:
            X.3ZL r5 = (X.AnonymousClass3ZL) r5
            if (r5 == 0) goto L_0x015d
            X.7Hy r2 = new X.7Hy
            r2.<init>(r5, r6)
            r1 = 32
            X.7Hz r0 = new X.7Hz
            r0.<init>(r1, r2)
            r4.add(r0)
        L_0x015d:
            X.4XF r3 = r8.A0L
            r3.A06 = r4
            r3.A07 = r4
            X.3Wi r2 = r3.A0C
            r1 = 21
            X.3Zn r0 = new X.3Zn
            r0.<init>(r3, r1)
            r2.A0S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionPickerView.A02(com.whatsapp.mentions.MentionPickerView, boolean):void");
    }

    private List getUserContacts() {
        ArrayList A0s = AnonymousClass001.A0s();
        C172878Nf it = C56892sj.A01(this.A0F, this.A0I).A02().iterator();
        while (it.hasNext()) {
            UserJid A0T = C18310x6.A0T(it);
            if (!this.A05.A0a(A0T)) {
                if (A0T instanceof C27981fH) {
                    A0T = this.A0G.A03(A0T);
                }
                if (A0T != null) {
                    C86614Ku.A1P(this.A07, A0T, A0s);
                }
            }
        }
        return A0s;
    }

    public void setVisibilityChangeListener(C182728ot r1) {
        this.A0J = r1;
    }

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A0O = false;
        this.A00 = 0;
        this.A0R = true;
    }

    public MentionPickerView(Context context) {
        super(context);
        A03();
        this.A0O = false;
        this.A00 = 0;
        this.A0R = true;
    }
}
