package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.8J5  reason: invalid class name */
public class AnonymousClass8J5 implements C185108t6 {
    public int A00;
    public int A01 = -1;
    public int A02;
    public long A03 = 0;
    public C153137aj A04;
    public C125316Hi A05;
    public ArrayList A06;
    public final Context A07;
    public final View A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final C620733j A0B;
    public final HashMap A0C = AnonymousClass001.A0t();

    public View BEH() {
        return this.A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXf(int r8) {
        /*
            r7 = this;
            int r3 = r7.A00
            if (r8 == r3) goto L_0x0067
            java.util.ArrayList r1 = r7.A06
            r2 = 0
            if (r1 != 0) goto L_0x00a1
        L_0x0009:
            r2 = -1
        L_0x000a:
            r7.A00 = r8
            X.6Hi r0 = r7.A05
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r1 = r7.A06
            r5 = 0
            if (r1 != 0) goto L_0x008c
        L_0x0015:
            r5 = -1
        L_0x0016:
            if (r5 == r2) goto L_0x0062
            androidx.recyclerview.widget.LinearLayoutManager r4 = r7.A09
            int r6 = r4.A1G()
            int r2 = r4.A1I()
            int r3 = r2 - r6
            X.33j r0 = r7.A0B
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0046
            int r1 = r7.A02
            r0 = -1
            if (r1 == r0) goto L_0x0046
            int r0 = r4.A08()
            int r0 = r0 + -1
            android.view.View r1 = r4.A0Q(r0)
            int r0 = r7.A02
            if (r2 >= r0) goto L_0x0086
            if (r5 >= r0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.clearChildFocus(r1)
        L_0x0046:
            int r0 = r3 * 2
            int r0 = r0 / 5
            int r3 = r5 - r0
            if (r3 >= r6) goto L_0x0068
            if (r3 >= 0) goto L_0x0051
            r3 = 0
        L_0x0051:
            android.view.View r0 = r7.A08
            android.content.Context r1 = r0.getContext()
            r0 = 4
            X.8zX r2 = new X.8zX
            r2.<init>(r1, r7, r0)
            r2.A00 = r3
        L_0x005f:
            r4.A0x(r2)
        L_0x0062:
            X.6Hi r0 = r7.A05
            r0.A05()
        L_0x0067:
            return
        L_0x0068:
            int r5 = r5 + r0
            if (r5 <= r2) goto L_0x0062
            int r0 = r4.A09()
            if (r5 < r0) goto L_0x0077
            int r0 = r4.A09()
            int r5 = r0 + -1
        L_0x0077:
            android.view.View r0 = r7.A08
            android.content.Context r1 = r0.getContext()
            r0 = 4
            X.8zX r2 = new X.8zX
            r2.<init>(r1, r7, r0)
            r2.A00 = r5
            goto L_0x005f
        L_0x0086:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.requestChildFocus(r1, r1)
            goto L_0x0046
        L_0x008c:
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0015
            java.lang.Object r0 = r1.get(r5)
            X.7i7 r0 = (X.C157327i7) r0
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x0016
            int r5 = r5 + 1
            goto L_0x008c
        L_0x00a1:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0009
            java.lang.Object r0 = r1.get(r2)
            X.7i7 r0 = (X.C157327i7) r0
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x000a
            int r2 = r2 + 1
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8J5.BXf(int):void");
    }

    public void Bm2(C153137aj r4) {
        this.A04 = r4;
        if (r4 != null) {
            int A022 = r4.A02();
            if (A022 < 0) {
                C18320x8.A1J("StickerPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, AnonymousClass4L0.A0U());
                A022 = 0;
            }
            BXf(A022);
        }
    }

    public AnonymousClass8J5(Context context, View view, C620733j r8) {
        this.A07 = context;
        this.A0B = r8;
        View A022 = C06560Yg.A02(view, R.id.sticker_picker_header);
        this.A08 = A022;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_header_recycler);
        this.A0A = recyclerView;
        recyclerView.A0h = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A09 = linearLayoutManager;
        linearLayoutManager.A1X(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass6H8 r0 = new AnonymousClass6H8(this);
        r0.A00 = false;
        recyclerView.setItemAnimator(r0);
        linearLayoutManager.A1h(r8.A0U());
        C86604Kt.A0z(context, A022, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[LOOP:0: B:18:0x0062->B:19:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass8J3[] r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r6 = r8.length
            r4 = 0
            if (r6 <= 0) goto L_0x007b
            r1 = r8[r4]
            boolean r0 = r1 instanceof X.C137876pP
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r1.getId()
            X.7i7 r0 = new X.7i7
            r0.<init>((int) r4, (java.lang.String) r1)
            r3.add(r0)
            r5 = 1
        L_0x001b:
            if (r5 >= r6) goto L_0x0031
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.C137916pT
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r1.getId()
            X.7i7 r0 = new X.7i7
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0031:
            if (r5 >= r6) goto L_0x0047
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.C137896pR
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r1.getId()
            X.7i7 r0 = new X.7i7
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0047:
            r2 = -1
            if (r5 >= r6) goto L_0x0071
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.C137886pQ
            if (r0 == 0) goto L_0x0071
            X.6pJ r1 = new X.6pJ
            r1.<init>(r5)
            int r0 = r7.A02
            boolean r2 = X.AnonymousClass000.A1U(r0, r2)
            r7.A02 = r5
            r3.add(r1)
            int r5 = r5 + 4
        L_0x0062:
            if (r5 >= r6) goto L_0x007d
            r1 = r8[r5]
            X.7i7 r0 = new X.7i7
            r0.<init>((X.AnonymousClass8J3) r1, (int) r5)
            r3.add(r0)
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0071:
            int r0 = r7.A02
            if (r0 == r2) goto L_0x0079
            r7.A02 = r2
            r2 = 1
            goto L_0x0062
        L_0x0079:
            r2 = 0
            goto L_0x0062
        L_0x007b:
            r5 = 0
            goto L_0x001b
        L_0x007d:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r7.A09
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0086
            java.util.Collections.reverse(r3)
        L_0x0086:
            java.util.ArrayList r0 = r7.A06
            if (r0 != 0) goto L_0x0098
            X.33j r0 = r7.A0B
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0096
            int r4 = X.C86664Kz.A0M(r3)
        L_0x0096:
            r7.A01 = r4
        L_0x0098:
            r7.A06 = r3
            X.6Hi r0 = r7.A05
            if (r0 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x00a8
            r0.A01 = r8
            r0.A00 = r3
            r0.A05()
            return
        L_0x00a8:
            X.6Hi r1 = new X.6Hi
            r1.<init>(r7, r3, r8)
            r7.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8J5.A00(X.8J3[]):void");
    }
}
