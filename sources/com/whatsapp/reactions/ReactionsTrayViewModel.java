package com.whatsapp.reactions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass2B2;
import X.AnonymousClass2SV;
import X.AnonymousClass2z0;
import X.AnonymousClass3XA;
import X.AnonymousClass4FP;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass5Q4;
import X.AnonymousClass5U1;
import X.C05550Ty;
import X.C06270Wx;
import X.C106655Zv;
import X.C106755a7;
import X.C107005aX;
import X.C107165ao;
import X.C107425bI;
import X.C56612sH;
import X.C56972sr;
import X.C56982ss;
import X.C58742vk;
import X.C60152y5;
import X.C620633i;
import X.C624134x;
import X.C626936e;
import X.C70133a0;
import X.C86274Jm;
import X.C86604Kt;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class ReactionsTrayViewModel extends C05550Ty {
    public static final int A0H;
    public static final List A0I;
    public int A00;
    public int A01 = 0;
    public List A02 = A0I;
    public boolean A03;
    public final C56972sr A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final C56982ss A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass5U1 A09;
    public final C60152y5 A0A;
    public final C58742vk A0B;
    public final AnonymousClass107 A0C = AnonymousClass4L0.A0O(AnonymousClass0x7.A0f());
    public final AnonymousClass107 A0D = AnonymousClass4L0.A0O(Boolean.FALSE);
    public final AnonymousClass107 A0E = AnonymousClass4L0.A0O(new AnonymousClass5Q4((String) null, false, (String) null));
    public final AnonymousClass4FS A0F;
    public volatile C624134x A0G;

    public void A0D(int i) {
        if (i == 0) {
            this.A03 = AnonymousClass000.A1U(C86604Kt.A05(this.A0C), 2);
        }
        AnonymousClass107 r1 = this.A0C;
        if (C86604Kt.A05(r1) == i) {
            return;
        }
        if (i != 1) {
            C06270Wx.A03(r1, i);
            return;
        }
        throw AnonymousClass001.A0c("Use setDisplayStateToTrayOpen instead of setDisplayState(DisplayState.TRAY_OPEN)");
    }

    public void A0G(String str) {
        A0D(0);
        C106755a7.A04(this.A05);
        AnonymousClass107 r3 = this.A0E;
        if (!str.equals(((AnonymousClass5Q4) r3.A07()).A00)) {
            r3.A0H(new AnonymousClass5Q4(((AnonymousClass5Q4) r3.A07()).A00, true, str));
        }
    }

    static {
        List list = AnonymousClass2B2.A00;
        A0I = list;
        A0H = list.size();
    }

    public void A0E(int i) {
        if (this.A0G != null) {
            AnonymousClass3XA r2 = new AnonymousClass3XA();
            C70133a0.A01(this.A0F, this, r2, 48);
            r2.A03(new C86274Jm(this, i, 2));
        }
    }

    public void A0F(C624134x r10) {
        String A012;
        boolean z;
        AnonymousClass4FP r4 = r10.A0L;
        String str = null;
        if (r4 != null) {
            if (AnonymousClass2z0.A0C(r10)) {
                AnonymousClass2SV A12 = r10.A12();
                if (A12 != null) {
                    str = A12.A05;
                }
            } else {
                str = r4.BBu(C56972sr.A05(this.A04), r10.A1L);
            }
        }
        this.A0G = r10;
        String A032 = C107165ao.A03(str);
        this.A0E.A0H(new AnonymousClass5Q4(A032, false, A032));
        if (TextUtils.isEmpty(str)) {
            A012 = null;
            z = false;
        } else {
            C626936e.A06(str);
            A012 = C106655Zv.A01(C107425bI.A07(new C106655Zv(str).A00));
            z = true;
        }
        List list = A0I;
        this.A02 = AnonymousClass002.A0I(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m.equals(A012)) {
                this.A02.add(str);
                z = false;
            } else {
                int[] iArr = new C106655Zv(A0m).A00;
                if (C107425bI.A03(iArr)) {
                    C60152y5 r42 = this.A0A;
                    if (r42.A03("emoji_modifiers").contains(C107005aX.A01(iArr))) {
                        this.A02.add(new C106655Zv(C107005aX.A05(r42, iArr)).toString());
                    }
                }
                this.A02.add(A0m);
            }
        }
        if (z) {
            this.A02.add(str);
        }
    }

    public ReactionsTrayViewModel(C56972sr r4, C620633i r5, C56612sH r6, C56982ss r7, AnonymousClass1VX r8, AnonymousClass5U1 r9, C60152y5 r10, C58742vk r11, AnonymousClass4FS r12) {
        this.A06 = r6;
        this.A08 = r8;
        this.A0F = r12;
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A0B = r11;
        this.A0A = r10;
        this.A09 = r9;
    }
}
