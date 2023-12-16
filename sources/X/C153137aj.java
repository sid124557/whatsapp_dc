package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.7aj  reason: invalid class name and case insensitive filesystem */
public abstract class C153137aj {
    public int A00;
    public int A01;
    public int A02;
    public C131676dy A03;
    public C185108t6 A04;
    public final Context A05;
    public final LayoutInflater A06;
    public final AnonymousClass0O5 A07 = new C188848za(this, 6);
    public final AnonymousClass0O5 A08 = new C188848za(this, 7);
    public final AnonymousClass0O5 A09;
    public final ViewPager A0A;
    public final C620733j A0B;

    public final int A02() {
        int i;
        ViewPager viewPager;
        int currentItem;
        Integer num;
        C620733j r8 = this.A0B;
        if (r8.A0T()) {
            viewPager = this.A0A;
            currentItem = viewPager.getCurrentItem();
        } else {
            C131676dy r0 = this.A03;
            if (r0 != null) {
                i = r0.A01.length;
            } else {
                i = 0;
            }
            viewPager = this.A0A;
            currentItem = (i - 1) - viewPager.getCurrentItem();
        }
        if (currentItem < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass6C7.A1V(objArr, 0, r8.A0T());
            C131676dy r02 = this.A03;
            if (r02 != null) {
                num = Integer.valueOf(r02.A01.length);
            } else {
                num = null;
            }
            objArr[1] = num;
            AnonymousClass000.A1N(objArr, viewPager.getCurrentItem());
            Log.i(C86654Ky.A0n(locale, "ContentPicker/getCurrentPageIndex < 0, isLtr: %s, pagerAdapter.getCount(): %d, viewPager.getCurrentItem(): %d", Arrays.copyOf(objArr, 3)));
        }
        return currentItem;
    }

    public void A03(int i) {
        C137896pR r1;
        C137916pT r12;
        if (this instanceof C137306oT) {
            C137306oT r13 = (C137306oT) this;
            try {
                r13.A09(((AnonymousClass8s6) r13.A04.get(i)).getId());
            } catch (Exception e) {
                Log.e("AvatarStickerPicker/onPageSelected/Error changing selected page", e);
            }
        } else {
            C137296oS r4 = (C137296oS) this;
            AnonymousClass8J3 r6 = (AnonymousClass8J3) r4.A0J.get(i);
            r6.A04(true);
            AnonymousClass8J3 r0 = r4.A0F;
            if (!(r0 == null || r0 == r6)) {
                r0.A04(false);
            }
            r4.A0F = r6;
            if (r6 instanceof C137906pS) {
                C50612iT r5 = ((C137906pS) r6).A04;
                r5.A08 = false;
                C56932sn r3 = r4.A0Z;
                Log.d("StickerRepository/markStickerPackAsSeenAsync/begin");
                r3.A0Z.BkM(new C71573cK(r3, 14, r5));
            }
            if (!(r6.getId().equals("recents") || (r12 = r4.A0D) == null || r12.A04 == null)) {
                r12.A01();
            }
            if (!r6.getId().equals("starred") && (r1 = r4.A0E) != null && r1.A04 != null) {
                r1.A01();
            }
        }
    }

    public final void A04(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Integer num;
        boolean z2 = true;
        if (this.A0B.A0T()) {
            i3 = i;
        } else {
            C131676dy r0 = this.A03;
            if (r0 != null) {
                i2 = r0.A01.length;
            } else {
                i2 = 0;
            }
            i3 = (i2 - 1) - i;
        }
        if (i3 < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            C131676dy r1 = this.A03;
            if (r1 != null) {
                num = Integer.valueOf(r1.A01.length);
            } else {
                num = null;
            }
            objArr[0] = num;
            AnonymousClass000.A1P(objArr, i, 1);
            Log.i(C86654Ky.A0n(locale, "ContentPicker/selectPageByIndex/absoluteIndex < 0, pagerAdapter.getCount(): %d, index: %d", Arrays.copyOf(objArr, 2)));
        }
        C131676dy r12 = this.A03;
        if (r12 != null) {
            i4 = r12.A01.length;
        } else {
            i4 = 0;
        }
        if (i >= 0 && i < i4 && this.A00 != i3) {
            ViewPager viewPager = this.A0A;
            if (!z) {
                z2 = false;
            }
            viewPager.A0F(i3, z2);
        }
    }

    public final void A05(C131676dy r4) {
        this.A03 = r4;
        AnonymousClass0O5 r0 = this.A07;
        C162457s7.A0J(r0, 0);
        HashSet hashSet = r4.A05;
        hashSet.add(r0);
        AnonymousClass0O5 r02 = this.A08;
        C162457s7.A0J(r02, 0);
        hashSet.add(r02);
        this.A0A.setAdapter(r4);
    }

    public C153137aj(Context context, ViewGroup viewGroup, AnonymousClass0O5 r7, C620733j r8, int i) {
        C18260x0.A0V(context, r8, viewGroup);
        C162457s7.A0J(r7, 5);
        this.A05 = context;
        this.A0B = r8;
        this.A09 = r7;
        LayoutInflater from = LayoutInflater.from(context);
        C162457s7.A0D(from);
        this.A06 = from;
        this.A01 = AnonymousClass0Y8.A04(context, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A02 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        View findViewById = viewGroup.findViewById(i);
        ViewPager viewPager = (ViewPager) findViewById;
        viewPager.A0G(new C1892690q(this, 1));
        C162457s7.A0D(findViewById);
        this.A0A = viewPager;
    }
}
