package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.5Xn  reason: invalid class name and case insensitive filesystem */
public final class C106075Xn {
    public int A00;
    public int A01;
    public C142256wt A02;
    public C152777a6 A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final View A0A;
    public final FrameLayout A0B;
    public final C147447Ei A0C = new C147447Ei(this);
    public final Set A0D;
    public final ConcurrentLinkedQueue A0E = new ConcurrentLinkedQueue();
    public final C158577kC[] A0F = {new C158577kC(0, 0, 0.0f), new C158577kC(0, 0, 0.0f)};
    public final AnonymousClass5TM[] A0G;

    public final void A03(C142256wt r8, C152777a6 r9) {
        StringBuilder A0g = C18280x3.A0g(r8, 1);
        A0g.append("CompositeHeroPlayer - appendVideo() - ");
        String str = r9.A0F.A0H;
        A0g.append(str);
        C18260x0.A1P(A0g, " - ", r8);
        if (this.A06) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass001.A1K("CompositeHeroPlayer - appendVideo() - ", str, " - ", A0o);
            A0o.append(r8);
            C18260x0.A1J(A0o, " - ignored as in transition");
            this.A03 = r9;
            this.A02 = r8;
            return;
        }
        int ordinal = r8.ordinal();
        if (ordinal == 0) {
            this.A0E.add(r9);
            A01();
        } else if (ordinal == 1) {
            this.A0E.clear();
            A04(r9, false);
        } else if (ordinal == 2) {
            this.A0E.clear();
            this.A01 = -1;
            A04(r9, true);
        }
    }

    public C106075Xn(Context context, C69263Wi r20, AnonymousClass5NV r21, AnonymousClass4FS r22) {
        Context context2 = context;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A0B = frameLayout;
        this.A0A = frameLayout;
        C69263Wi r9 = r20;
        AnonymousClass5NV r10 = r21;
        AnonymousClass4FS r11 = r22;
        int i = 0;
        AnonymousClass5TM[] r4 = {new AnonymousClass5TM(context2, r9, r10, r11, 0), new AnonymousClass5TM(context2, r9, r10, r11, 1)};
        this.A0G = r4;
        Set newConcurrentHashSet = C162207rR.newConcurrentHashSet();
        C162457s7.A0D(newConcurrentHashSet);
        this.A0D = newConcurrentHashSet;
        this.A01 = -1;
        do {
            AnonymousClass5TM r2 = r4[i];
            r2.A05 = this.A0C;
            r2.A0A.setAlpha(0.0f);
            this.A0B.addView(r2.A0A);
            i++;
        } while (i < 2);
    }

    public final void A02(int i) {
        int height;
        int i2;
        float f;
        C158577kC r1 = this.A0F[i];
        if (r1.A04) {
            FrameLayout frameLayout = this.A0B;
            if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && frameLayout.getParent() != null) {
                ViewParent parent = frameLayout.getParent();
                C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    float A002 = AnonymousClass4L0.A00(view) / C86664Kz.A02(view);
                    float f2 = r1.A00;
                    frameLayout.getWidth();
                    frameLayout.getHeight();
                    float f3 = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, 0.0f));
                    if (f2 <= A002) {
                        i2 = view.getWidth();
                        height = (int) (((float) i2) / f2);
                        f = ((float) (view.getHeight() - height)) * max;
                    } else {
                        height = view.getHeight();
                        i2 = (int) (((float) height) * f2);
                        f3 = ((float) (view.getWidth() - i2)) * max;
                        f = 0.0f;
                    }
                    frameLayout.getLayoutParams().width = i2;
                    C86624Kv.A0w(frameLayout, height);
                    frameLayout.setX(f3);
                    frameLayout.setY(f);
                    frameLayout.requestLayout();
                }
            }
        }
    }

    public static final /* synthetic */ void A00(C106075Xn r4) {
        StringBuilder A0o;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CompositeHeroPlayer - switchToNextPlayer() - ");
        int i = r4.A00;
        A0o2.append(i % 2);
        A0o2.append(" -> ");
        C18260x0.A1F(A0o2, (i + 1) % 2);
        if (r4.A06) {
            A0o = AnonymousClass001.A0o();
            A0o.append("CompositeHeroPlayer - switchToNextPlayer() ignored due to in transition - ");
            int i2 = r4.A00;
            A0o.append(i2 % 2);
            A0o.append(" -> ");
            A0o.append((i2 + 1) % 2);
        } else {
            int i3 = (r4.A00 + 1) % 2;
            AnonymousClass5TM[] r2 = r4.A0G;
            AnonymousClass5TM r0 = r2[i3];
            r4.A02(i3);
            r0.A00();
            r0.A0A.setAlpha(1.0f);
            AnonymousClass5TM r02 = r2[r4.A00 % 2];
            r02.A01();
            r02.A0A.setAlpha(0.0f);
            r4.A00++;
            r4.A07 = false;
            r4.A04 = null;
            r4.A05 = null;
            A0o = AnonymousClass001.A0o();
            A0o.append("CompositeHeroPlayer - switchToNextPlayer() - nextVideoSet: ");
            A0o.append(false);
        }
        AnonymousClass0x2.A18(A0o);
    }

    public final void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompositeHeroPlayer - maybePrepareNextPlayer() - nextVideoSet: ");
        C18260x0.A1U(A0o, this.A07);
        if (!this.A07) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.A0E;
            if (!concurrentLinkedQueue.isEmpty()) {
                C152777a6 r1 = (C152777a6) concurrentLinkedQueue.poll();
                C162457s7.A0H(r1);
                A04(r1, false);
            }
        }
    }

    public final void A04(C152777a6 r4, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompositeHeroPlayer - prepareNextPlayer() - videoId: ");
        String str = r4.A0F.A0H;
        A0o.append(str);
        A0o.append(", nextPlayerId: ");
        C18260x0.A1F(A0o, (this.A00 + 1) % 2);
        AnonymousClass5TM r1 = this.A0G[(this.A00 + 1) % 2];
        this.A04 = str;
        this.A05 = null;
        r1.A01();
        r1.A02(r4, z);
        this.A07 = true;
        C18260x0.A1D("CompositeHeroPlayer - prepareNextPlayer() - nextVideoSet: ", AnonymousClass001.A0o(), true);
    }
}
