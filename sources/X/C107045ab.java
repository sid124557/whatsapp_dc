package X;

import android.widget.AbsListView;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5ab  reason: invalid class name and case insensitive filesystem */
public class C107045ab implements AbsListView.OnScrollListener {
    public Object A00;
    public final int A01;

    public C107045ab(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r2 <= 1.0f) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.widget.AbsListView r9) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.A00
            X.5ZF r5 = (X.AnonymousClass5ZF) r5
            android.view.ViewGroup r4 = r5.A0F
            if (r4 == 0) goto L_0x0059
            android.content.Context r0 = r9.getContext()
            float r3 = X.C86604Kt.A00(r0)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r1 = r9.getFirstVisiblePosition()
            android.view.View r0 = X.C86644Kx.A0G(r9)
            r7 = 0
            if (r0 != 0) goto L_0x005a
            r0 = 0
        L_0x0023:
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0042
            float r2 = -r0
            android.content.res.Resources r1 = X.C18290x4.A0G(r9)
            r0 = 2131166390(0x7f0704b6, float:1.7947024E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            float r2 = r2 / r0
            float r2 = java.lang.Math.min(r2, r6)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
        L_0x0042:
            float r3 = r3 * r2
        L_0x0043:
            int r1 = r5.A08
            r0 = 1095761920(0x41500000, float:13.0)
            float r2 = r2 * r0
            int r0 = (int) r2
            int r1 = X.AnonymousClass0YI.A06(r1, r0)
            int r0 = r5.A06
            int r0 = X.AnonymousClass0YI.A05(r1, r0)
            r4.setBackgroundColor(r0)
            X.AnonymousClass0YZ.A0B(r4, r3)
        L_0x0059:
            return
        L_0x005a:
            int r0 = r0.getTop()
            float r0 = (float) r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107045ab.A00(android.widget.AbsListView):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
        if (r2 == 0) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x00fc;
                case 2: goto L_0x0104;
                case 3: goto L_0x010c;
                case 4: goto L_0x0015;
                case 5: goto L_0x0091;
                case 6: goto L_0x0005;
                case 7: goto L_0x00d0;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r8.A00(r9)
            java.lang.Object r0 = r8.A00
            X.5ZF r0 = (X.AnonymousClass5ZF) r0
            android.widget.AbsListView$OnScrollListener r0 = r0.A0H
            if (r0 == 0) goto L_0x0005
            r0.onScroll(r9, r10, r11, r12)
            return
        L_0x0015:
            java.lang.Object r5 = r8.A00
            com.whatsapp.collections.observablelistview.ObservableListView r5 = (com.whatsapp.collections.observablelistview.ObservableListView) r5
            android.widget.AbsListView$OnScrollListener r0 = r5.A08
            if (r0 == 0) goto L_0x0020
            r0.onScroll(r9, r10, r11, r12)
        L_0x0020:
            X.8nt r0 = r5.A09
            if (r0 == 0) goto L_0x0005
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x0005
            int r2 = r5.getFirstVisiblePosition()
            int r4 = r5.getFirstVisiblePosition()
            r6 = 0
            r3 = 0
        L_0x0034:
            int r0 = r5.getLastVisiblePosition()
            if (r4 > r0) goto L_0x0064
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.indexOfKey(r4)
            if (r0 < 0) goto L_0x0052
            android.view.View r0 = r5.getChildAt(r3)
            int r1 = r0.getHeight()
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.get(r4)
            if (r1 == r0) goto L_0x005f
        L_0x0052:
            android.util.SparseIntArray r1 = r5.A05
            android.view.View r0 = r5.getChildAt(r3)
            int r0 = r0.getHeight()
            r1.put(r4, r0)
        L_0x005f:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0064:
            android.view.View r7 = r5.getChildAt(r6)
            if (r7 == 0) goto L_0x0005
            int r4 = r5.A01
            r3 = 1
            if (r4 >= r2) goto L_0x0114
            int r0 = r2 - r4
            r4 = 0
            if (r0 == r3) goto L_0x0141
            int r1 = r2 + -1
        L_0x0076:
            int r0 = r5.A01
            if (r1 <= r0) goto L_0x0141
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.indexOfKey(r1)
            if (r0 <= 0) goto L_0x008c
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.get(r1)
        L_0x0088:
            int r4 = r4 + r0
            int r1 = r1 + -1
            goto L_0x0076
        L_0x008c:
            int r0 = r7.getHeight()
            goto L_0x0088
        L_0x0091:
            java.lang.Object r4 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.view.View r1 = r4.A0G
            if (r1 == 0) goto L_0x0005
            if (r10 != 0) goto L_0x0188
            java.util.Map r1 = r4.A3n
            X.6kE r0 = X.C135166kE.A00
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0005
            android.view.View r1 = r4.A0G
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x0005
            android.view.View r2 = r4.A0G
            int r1 = r3.getHeight()
            int r0 = r3.getTop()
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = X.C86664Kz.A02(r3)
            float r1 = r1 / r0
            r2.setAlpha(r1)
            android.view.View r1 = r4.A0G
            int r0 = r3.getTop()
            float r0 = (float) r0
            r1.setTranslationY(r0)
            return
        L_0x00d0:
            java.lang.Object r3 = r8.A00
            X.4c7 r3 = (X.C89224c7) r3
            com.whatsapp.emoji.EmojiPopupFooter r0 = r3.A08
            int r2 = r0.getHeight()
            int r0 = r3.A02
            if (r0 < r10) goto L_0x00e2
            r2 = -1
            if (r0 <= r10) goto L_0x00e2
            r2 = 0
        L_0x00e2:
            r3.A02 = r10
            if (r2 < 0) goto L_0x0005
            com.whatsapp.emoji.EmojiPopupFooter r1 = r3.A08
            int r0 = r1.A00
            if (r2 == r0) goto L_0x0005
            android.view.animation.Animation r1 = r1.getAnimation()
            boolean r0 = r1 instanceof X.AnonymousClass4O9
            if (r0 == 0) goto L_0x018e
            r0 = r1
            X.4O9 r0 = (X.AnonymousClass4O9) r0
            int r0 = r0.A00
            if (r0 != r2) goto L_0x018e
            return
        L_0x00fc:
            java.lang.Object r0 = r8.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            r0.A76()
            return
        L_0x0104:
            java.lang.Object r0 = r8.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            r0.A7K()
            return
        L_0x010c:
            java.lang.Object r0 = r8.A00
            X.4kC r0 = (X.C91504kC) r0
            r0.A08()
            return
        L_0x0114:
            if (r2 >= r4) goto L_0x013e
            int r0 = r4 - r2
            r1 = 0
            if (r0 == r3) goto L_0x0135
            int r4 = r4 - r3
        L_0x011c:
            if (r4 <= r2) goto L_0x0135
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.indexOfKey(r4)
            if (r0 <= 0) goto L_0x0130
            android.util.SparseIntArray r0 = r5.A05
            int r0 = r0.get(r4)
        L_0x012c:
            int r1 = r1 + r0
            int r4 = r4 + -1
            goto L_0x011c
        L_0x0130:
            int r0 = r7.getHeight()
            goto L_0x012c
        L_0x0135:
            int r3 = r5.A03
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            int r3 = r3 - r0
            goto L_0x0147
        L_0x013e:
            if (r2 != 0) goto L_0x014f
            goto L_0x0149
        L_0x0141:
            int r3 = r5.A03
            int r0 = r5.A00
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x0147:
            r5.A03 = r3
        L_0x0149:
            int r0 = r7.getHeight()
            r5.A00 = r0
        L_0x014f:
            int r0 = r5.A00
            if (r0 >= 0) goto L_0x0155
            r5.A00 = r6
        L_0x0155:
            int r4 = r5.A03
            int r0 = r7.getTop()
            int r4 = r4 - r0
            r5.A04 = r4
            r5.A01 = r2
            X.8nt r3 = r5.A09
            boolean r2 = r5.A0E
            boolean r1 = r5.A0D
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.66q r0 = X.AnonymousClass4SG.A2a(r3)
            X.0eF r0 = (X.C08310eF) r0
            if (r0 == 0) goto L_0x017d
            android.view.View r0 = r0.A0B
            if (r0 == 0) goto L_0x017d
            android.view.View r0 = X.C86664Kz.A0i(r0)
            if (r5 != r0) goto L_0x017d
            r3.A7c(r4, r2, r1)
        L_0x017d:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0183
            r5.A0E = r6
        L_0x0183:
            int r0 = r5.A04
            r5.A02 = r0
            return
        L_0x0188:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x018e:
            if (r1 == 0) goto L_0x0193
            r1.cancel()
        L_0x0193:
            com.whatsapp.emoji.EmojiPopupFooter r1 = r3.A08
            X.4O9 r0 = new X.4O9
            r0.<init>(r3, r2)
            r1.startAnimation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107045ab.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (this.A01) {
            case 0:
                A00(absListView);
                AbsListView.OnScrollListener onScrollListener = ((AnonymousClass5ZF) this.A00).A0H;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                    return;
                }
                return;
            case 3:
                ((C91504kC) this.A00).A08();
                return;
            case 4:
                ObservableListView observableListView = (ObservableListView) this.A00;
                AbsListView.OnScrollListener onScrollListener2 = observableListView.A08;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScrollStateChanged(absListView, i);
                }
                C182118nt r1 = observableListView.A09;
                if (r1 != null && i == 0) {
                    r1.Baw(observableListView.A04);
                    return;
                }
                return;
            case 6:
                if (i != 0) {
                    if (i == 1) {
                        ((ConversationsFragment) this.A00).A2a.A01(2);
                    }
                    C110065fd r0 = ((ConversationsFragment) this.A00).A2h;
                    if (r0 != null) {
                        r0.A00();
                        return;
                    }
                    return;
                }
                ((ConversationsFragment) this.A00).A2a.A00();
                return;
            default:
                return;
        }
    }
}
