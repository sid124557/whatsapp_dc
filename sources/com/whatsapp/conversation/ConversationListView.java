package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass2LL;
import X.AnonymousClass2z0;
import X.AnonymousClass33p;
import X.AnonymousClass4FP;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass4MK;
import X.AnonymousClass4NJ;
import X.AnonymousClass4o1;
import X.AnonymousClass4o3;
import X.AnonymousClass4o4;
import X.AnonymousClass5RN;
import X.AnonymousClass5UP;
import X.AnonymousClass5UY;
import X.AnonymousClass683;
import X.C104165Px;
import X.C105895Wv;
import X.C111095hX;
import X.C116855qy;
import X.C116985rC;
import X.C117085rM;
import X.C133486hS;
import X.C18260x0;
import X.C18320x8;
import X.C187958y5;
import X.C30471mV;
import X.C383227b;
import X.C40262Fd;
import X.C44382Vv;
import X.C48192eV;
import X.C52552lf;
import X.C53502nC;
import X.C56612sH;
import X.C56972sr;
import X.C60312yL;
import X.C624134x;
import X.C626936e;
import X.C627636p;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C87234On;
import X.C88734ai;
import X.C88864av;
import X.C93084ns;
import X.C93244oC;
import X.C93304oI;
import X.C93314oJ;
import X.C93324oK;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConversationListView extends ListView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public C116985rC A03;
    public C56972sr A04;
    public AnonymousClass5RN A05;
    public C40262Fd A06;
    public C44382Vv A07;
    public C56612sH A08;
    public AnonymousClass33p A09;
    public AnonymousClass1VX A0A;
    public C53502nC A0B;
    public C52552lf A0C;
    public AnonymousClass5UP A0D;
    public C48192eV A0E;
    public C60312yL A0F;
    public C105895Wv A0G;
    public C187958y5 A0H;
    public C116855qy A0I;
    public Runnable A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Handler A0S;

    public void A02() {
        if (!this.A0N) {
            this.A0N = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A08 = C64333Db.A2p(A002);
            this.A0A = C64333Db.A4B(A002);
            this.A0G = C86644Kx.A0b(A002);
            this.A04 = C64333Db.A06(A002);
            this.A0H = C86614Ku.A0o(A002);
            this.A0F = (C60312yL) A002.A13.get();
            this.A0C = (C52552lf) A002.AHS.get();
            this.A0D = C86634Kw.A0n(A002);
            this.A09 = C64333Db.A2s(A002);
            this.A03 = C88734ai.A00(A002.A3B);
            this.A0E = A002.ApS();
            this.A06 = (C40262Fd) A002.A6w.get();
            this.A0B = (C53502nC) A002.A00.A82.get();
            this.A07 = (C44382Vv) A002.A6u.get();
        }
    }

    public void A04() {
        if (this.A0P) {
            A0A(true);
            this.A0P = false;
        } else if (getLastVisiblePosition() >= getCount() - 2) {
            A0A(true);
        } else {
            smoothScrollBy(AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved), 100);
        }
    }

    public void A08(C624134x r7, int i, boolean z) {
        boolean z2;
        C87234On conversationCursorAdapter;
        HashSet hashSet;
        AnonymousClass2z0 r2 = r7.A1J;
        C93314oJ A002 = A00(r2);
        if (A002 == null || A002.getFMessage().A1I != r7.A1I) {
            if (getConversationCursorAdapter().A0X.add(r2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("conversation/refresh: no view for ");
                AnonymousClass0x2.A1N(A0o, r2.A01);
                A0o.append(getFirstVisiblePosition());
                A0o.append("-");
                A0o.append(getLastVisiblePosition());
                A0o.append(" (");
                A0o.append(getCount());
                C18260x0.A1L(A0o, ")");
            }
        } else if (i == 8) {
            A002.A1L();
        } else if (i == 12) {
            A002.A1I();
        } else if (i == 20) {
            getConversationCursorAdapter().A0X.add(r2);
        } else {
            if (i == 27 || i == 28 || i == 39 || i == 40) {
                C56612sH r4 = this.A08;
                C56972sr r3 = this.A04;
                C52552lf r22 = this.A0C;
                AnonymousClass1VX r1 = this.A0A;
                AnonymousClass4FP r0 = r7.A0L;
                if (r0 == null || C627636p.A09(r3, r4, r1, r22, r0.B4S()) == null) {
                    A002.A1p(r7, i);
                    A002.A1O(A002.A01);
                    if (this.A0K) {
                        A0A(false);
                        return;
                    }
                    return;
                }
                z2 = true;
            } else {
                if (i == 30) {
                    conversationCursorAdapter = getConversationCursorAdapter();
                    hashSet = conversationCursorAdapter.A0W;
                } else if (i == 34) {
                    if (this.A0E.A01()) {
                        conversationCursorAdapter = getConversationCursorAdapter();
                        hashSet = conversationCursorAdapter.A0Y;
                    } else {
                        return;
                    }
                } else if (i != 35 || !(A002 instanceof AnonymousClass4o3)) {
                    z2 = true;
                    if (z) {
                        A002.A1r(r7, true);
                        return;
                    }
                } else {
                    AnonymousClass4o3 r5 = (AnonymousClass4o3) A002;
                    if (r5.A04 != null && r5.A2E()) {
                        r5.A2C(new AnonymousClass683(r5, 1));
                        return;
                    }
                    return;
                }
                hashSet.add(r2);
                conversationCursorAdapter.notifyDataSetChanged();
                return;
            }
            A002.A1q(r7, z2);
        }
    }

    public void A0A(boolean z) {
        if (this.A0L) {
            this.A0M = false;
            this.A0Q = false;
            Log.d("ConversationListView/postScrollToBottom/ freezeListPos=false dividerCentered=true");
        }
        this.A0K = true;
        C117085rM A002 = C117085rM.A00(this, 4);
        if (z) {
            post(A002);
        } else {
            A002.run();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0I;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C93314oJ r1;
        if (this.A0R) {
            this.A0R = false;
            return;
        }
        AnonymousClass5RN r4 = this.A05;
        r4.A01();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                r1 = null;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.isPressed() && (childAt instanceof C93314oJ)) {
                r1 = (C93314oJ) childAt;
                r1.A2M = true;
                break;
            }
            i5++;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (r1 != null) {
            r1.A2M = false;
        }
        r4.A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NJ r2 = (AnonymousClass4NJ) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0O = r2.A02;
        this.A01 = r2.A00;
        this.A02 = r2.A01;
        requestLayout();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0S = AnonymousClass4MK.A00(this);
        this.A05 = new AnonymousClass5RN();
    }

    private AnonymousClass2LL getDisplayedDownloadableMediaMessages() {
        HashSet A0K2 = AnonymousClass002.A0K();
        HashSet A0K3 = AnonymousClass002.A0K();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C93244oC) {
                C30471mV fMessage = ((C93244oC) childAt).getFMessage();
                if (C383227b.A00(fMessage)) {
                    A0K2.add(fMessage);
                }
            } else if (childAt instanceof C93304oI) {
                C624134x r1 = ((C93324oK) childAt).A0S;
                if (r1.A0l != null && !r1.A0l.A09) {
                    A0K3.add(r1);
                }
            } else if (childAt instanceof AnonymousClass4o1) {
                Iterator it = ((AnonymousClass4o1) childAt).A09.subList(0, 4).iterator();
                while (it.hasNext()) {
                    C30471mV A0S2 = C18320x8.A0S(it);
                    if (C383227b.A00(A0S2)) {
                        A0K2.add(A0S2);
                    }
                }
            }
        }
        return new AnonymousClass2LL(A0K2, A0K3);
    }

    public C93314oJ A00(AnonymousClass2z0 r6) {
        C93314oJ A22;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C93314oJ) {
                C93314oJ r1 = (C93314oJ) childAt;
                if ((childAt instanceof AnonymousClass4o4) && (A22 = ((AnonymousClass4o4) childAt).A22(r6)) != null) {
                    r1 = A22;
                }
                if (r1.A21(r6)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A01() {
        if (getConversationCursorAdapter() != null && getConversationCursorAdapter().getCursor() != null) {
            this.A0B.A01(getDisplayedDownloadableMediaMessages());
        }
    }

    public void A03() {
        getConversationCursorAdapter().notifyDataSetChanged();
        if (this.A0L) {
            this.A0M = false;
            this.A0Q = false;
            Log.d("conversation/adapter/dbgscroll/notifydatasetchanged/dividercentered/true freeze=false scrolltotop=false");
        }
    }

    public void A05() {
        int A012;
        C87234On conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && conversationCursorAdapter.getCursor() != null) {
            Set<String> stringSet = AnonymousClass0x2.A0F(conversationCursorAdapter.A0Q).getStringSet("fmx_card_view_pending_chats", AnonymousClass002.A0K());
            C626936e.A06(stringSet);
            if (stringSet.contains(conversationCursorAdapter.A0S.toString())) {
                A012 = 0;
            } else {
                A012 = conversationCursorAdapter.A01();
            }
            int defaultDividerOffset = getDefaultDividerOffset();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("conversation/center divider pos:");
            A0o.append(conversationCursorAdapter.A01());
            C18260x0.A0w(" yOffset:", A0o, defaultDividerOffset);
            setTranscriptMode(0);
            setSelectionFromTop(A012 + getHeaderViewsCount(), defaultDividerOffset);
            this.A0M = false;
            this.A0L = false;
        }
    }

    public void A06(Cursor cursor) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversationListView/changeCursor/size: ");
        A0o.append(cursor.getCount());
        AnonymousClass0x2.A19(A0o);
        C87234On conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && !cursor.isClosed()) {
            conversationCursorAdapter.A0I.clear();
            conversationCursorAdapter.changeCursor(cursor);
        }
    }

    public void A07(C104165Px r3, boolean z) {
        C87234On conversationCursorAdapter = getConversationCursorAdapter();
        conversationCursorAdapter.A03 = r3.A00;
        conversationCursorAdapter.A04 = r3.A01;
        conversationCursorAdapter.A05 = r3.A02;
        if (z) {
            conversationCursorAdapter.notifyDataSetChanged();
        }
    }

    public final void A09(AnonymousClass5UY r3, int i, int i2, boolean z) {
        int i3;
        if (getFirstVisiblePosition() >= i || getLastVisiblePosition() <= i) {
            if (z) {
                int i4 = -1;
                if (getFirstVisiblePosition() < i) {
                    i4 = 1;
                }
                i3 = ((i4 * getHeight()) / 4) + i2;
            } else {
                i3 = i2;
            }
            setTranscriptMode(0);
            setSelectionFromTop(i, i3);
            smoothScrollToPositionFromTop(i, i2);
            r3.A06(0);
        }
    }

    public boolean A0B(int i) {
        if (getLastVisiblePosition() < (getHeaderViewsCount() + getConversationCursorAdapter().getCount()) - 1 || getChildCount() == 0) {
            return false;
        }
        int bottom = getLastRow().getBottom();
        if (bottom < getHeight() || (bottom >= getHeight() && bottom <= getHeight() + i)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View selectedView;
        if (keyEvent.getKeyCode() != 23 || (selectedView = getSelectedView()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return selectedView.dispatchKeyEvent(keyEvent);
    }

    public Activity getActivity() {
        return C111095hX.A04(this);
    }

    public int getAdjustedVisibleItemCount() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View lastRow = getLastRow();
        if ((lastRow instanceof C133486hS) || (lastRow instanceof C93084ns)) {
            return 0 + (((C93314oJ) lastRow).getMessageCount() - 1);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof X.C87234On) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C87234On getConversationCursorAdapter() {
        /*
            r4 = this;
            android.widget.ListAdapter r3 = r4.getAdapter()
            r2 = 0
            r1 = 1
            if (r3 != 0) goto L_0x000f
            r1 = 0
            java.lang.String r0 = "adapter should be NonNull"
        L_0x000b:
            X.C626936e.A0D(r1, r0)
            return r2
        L_0x000f:
            boolean r0 = r3 instanceof X.C87234On
            if (r0 != 0) goto L_0x0026
            boolean r0 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0029
            android.widget.HeaderViewListAdapter r3 = (android.widget.HeaderViewListAdapter) r3
            android.widget.ListAdapter r3 = r3.getWrappedAdapter()
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "wrapped adapter should be NonNull"
            goto L_0x000b
        L_0x0022:
            boolean r0 = r3 instanceof X.C87234On
            if (r0 == 0) goto L_0x0029
        L_0x0026:
            X.4On r3 = (X.C87234On) r3
            return r3
        L_0x0029:
            java.lang.String r0 = "Unknown adapter type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationListView.getConversationCursorAdapter():X.4On");
    }

    public int getDefaultDividerOffset() {
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(C111095hX.A04(this), A072);
        return (A072.y - (getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2)) / 5;
    }

    public int getFirstPosition() {
        int firstVisiblePosition = getFirstVisiblePosition() - getHeaderViewsCount();
        for (int i = 1; i < getChildCount(); i++) {
            firstVisiblePosition = (getFirstVisiblePosition() + i) - getHeaderViewsCount();
            if (getChildAt(i).getTop() >= getResources().getDimensionPixelSize(R.dimen.f6nameremoved)) {
                break;
            }
        }
        return firstVisiblePosition;
    }

    public View getLastRow() {
        return getChildAt(getChildCount() - 1);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i != -1 && adapter != null) {
            if (i >= adapter.getCount()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:");
                A0o.append(i);
                A0o.append(" count:");
                A0o.append(adapter.getCount());
                AnonymousClass0x2.A19(A0o);
                return;
            }
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        }
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass4NJ r1 = new AnonymousClass4NJ(super.onSaveInstanceState());
        r1.A02 = this.A0O;
        r1.A00 = this.A01;
        r1.A01 = this.A02;
        return r1;
    }

    public void setScrollToBottom(boolean z) {
        this.A0P = z;
    }

    public void setScrollToTop(boolean z) {
        this.A0Q = z;
    }

    public void setShouldIgnoreLayoutUpdate(boolean z) {
        this.A0R = z;
    }

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0S = AnonymousClass4MK.A00(this);
        this.A05 = new AnonymousClass5RN();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0S = AnonymousClass4MK.A00(this);
        this.A05 = new AnonymousClass5RN();
    }

    public ConversationListView(Context context) {
        super(context);
        this.A0S = AnonymousClass4MK.A00(this);
        this.A05 = new AnonymousClass5RN();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
