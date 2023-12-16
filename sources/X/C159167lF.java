package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;

/* renamed from: X.7lF  reason: invalid class name and case insensitive filesystem */
public class C159167lF {
    public AnonymousClass7ON A00;
    public C151847Wn A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C10550i7 A05 = new C10550i7();
    public final C124956Ep A06;
    public final AnonymousClass7XT A07;

    public C159167lF(C124956Ep r3) {
        AnonymousClass7XT r1 = C159567m6.A00;
        this.A04 = r3.getContext();
        this.A06 = r3;
        this.A07 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r15 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r14.getBottom() == r1) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass7XT r12, com.facebook.rendercore.RenderTreeNode r13, java.lang.Object r14, boolean r15) {
        /*
            android.graphics.Rect r0 = r13.A04
            android.graphics.Rect r9 = r13.A05
            int r4 = r0.left
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            boolean r0 = r12.A02()
            r11 = 0
            if (r0 == 0) goto L_0x0019
            r11 = 1
            java.lang.String r0 = "applyBoundsToMountContent"
            r12.A01(r0)
        L_0x0019:
            boolean r0 = r14 instanceof android.view.View     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0069
            android.view.View r14 = (android.view.View) r14     // Catch:{ all -> 0x0091 }
            int r8 = r2 - r4
            int r7 = r1 - r3
            if (r9 == 0) goto L_0x0034
            boolean r0 = r14 instanceof X.C124956Ep     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x0034
            int r10 = r9.left     // Catch:{ all -> 0x0091 }
            int r6 = r9.top     // Catch:{ all -> 0x0091 }
            int r5 = r9.right     // Catch:{ all -> 0x0091 }
            int r0 = r9.bottom     // Catch:{ all -> 0x0091 }
            r14.setPadding(r10, r6, r5, r0)     // Catch:{ all -> 0x0091 }
        L_0x0034:
            if (r15 != 0) goto L_0x0042
            int r0 = r14.getMeasuredHeight()     // Catch:{ all -> 0x0091 }
            if (r0 != r7) goto L_0x0042
            int r0 = r14.getMeasuredWidth()     // Catch:{ all -> 0x0091 }
            if (r0 == r8) goto L_0x004d
        L_0x0042:
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)     // Catch:{ all -> 0x0091 }
            X.AnonymousClass001.A19(r14, r7, r5, r0)     // Catch:{ all -> 0x0091 }
            if (r15 != 0) goto L_0x0065
        L_0x004d:
            int r0 = r14.getLeft()     // Catch:{ all -> 0x0091 }
            if (r0 != r4) goto L_0x0065
            int r0 = r14.getTop()     // Catch:{ all -> 0x0091 }
            if (r0 != r3) goto L_0x0065
            int r0 = r14.getRight()     // Catch:{ all -> 0x0091 }
            if (r0 != r2) goto L_0x0065
            int r0 = r14.getBottom()     // Catch:{ all -> 0x0091 }
            if (r0 == r1) goto L_0x0080
        L_0x0065:
            r14.layout(r4, r3, r2, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0080
        L_0x0069:
            boolean r0 = r14 instanceof android.graphics.drawable.Drawable     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x007b
            int r0 = r9.left     // Catch:{ all -> 0x0091 }
            int r4 = r4 + r0
            int r0 = r9.top     // Catch:{ all -> 0x0091 }
            int r3 = r3 + r0
            int r0 = r9.right     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r0
            int r0 = r9.bottom     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r0
        L_0x007b:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14     // Catch:{ all -> 0x0091 }
            r14.setBounds(r4, r3, r2, r1)     // Catch:{ all -> 0x0091 }
        L_0x0080:
            if (r11 == 0) goto L_0x0085
            r12.A00()
        L_0x0085:
            return
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Unsupported mounted content "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r14, r0, r1)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            if (r11 == 0) goto L_0x0097
            r12.A00()
        L_0x0097:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159167lF.A00(X.7XT, com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    public void A02() {
        if (this.A01 != null) {
            AnonymousClass7XT r5 = this.A07;
            boolean A022 = r5.A02();
            if (A022) {
                r5.A01("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : this.A01.A04) {
                AnonymousClass7NY r1 = (AnonymousClass7NY) C10550i7.A00(this.A05, renderTreeNode.A07.A0B());
                if (r1 != null && !r1.A03) {
                    Object obj = r1.A02;
                    A09(r1);
                    if ((obj instanceof View) && !(obj instanceof C124956Ep)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            A00(r5, r1.A01, view, true);
                        }
                    }
                }
            }
            if (A022) {
                r5.A00();
            }
        }
    }

    public void A03() {
        if (this.A01 != null) {
            AnonymousClass7XT r3 = this.A07;
            boolean A022 = r3.A02();
            if (A022) {
                r3.A01("MountState.unbind");
                r3.A01("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : this.A01.A04) {
                AnonymousClass7NY r1 = (AnonymousClass7NY) C10550i7.A00(this.A05, renderTreeNode.A07.A0B());
                if (r1 != null && r1.A03) {
                    A0A(r1);
                }
            }
            if (A022) {
                r3.A00();
                r3.A01("MountState.unbindExtensions");
            }
            AnonymousClass7ON r0 = this.A00;
            if (r0 != null) {
                List list = r0.A04;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i);
                }
            }
            if (A022) {
                r3.A00();
                r3.A00();
            }
        }
    }

    public void A04() {
        if (this.A01 == null) {
            A05();
            return;
        }
        AnonymousClass7XT r3 = this.A07;
        boolean A022 = r3.A02();
        if (A022) {
            r3.A01("MountState.unmountAllItems");
        }
        A06(0);
        A05();
        if (A022) {
            r3.A00();
        }
        this.A03 = true;
    }

    public void A05() {
        AnonymousClass7ON r0 = this.A00;
        if (r0 != null) {
            List list = r0.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
            List list2 = this.A00.A04;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                list2.get(i2);
            }
            this.A00.A04.clear();
        }
    }

    public final void A06(long j) {
        C10550i7 r10 = this.A05;
        AnonymousClass7NY r7 = (AnonymousClass7NY) C10550i7.A00(r10, j);
        if (r7 != null) {
            AnonymousClass7XT r2 = this.A07;
            boolean A022 = r2.A02();
            RenderTreeNode renderTreeNode = r7.A01;
            C161797qU r3 = renderTreeNode.A07;
            Object obj = r7.A02;
            C161317pQ.A00();
            if (A022) {
                A01(r2, r3, "UnmountItem: ", AnonymousClass001.A0o());
            }
            List list = renderTreeNode.A00;
            if (list != null && list.size() > 0) {
                List list2 = renderTreeNode.A00;
                if (list2 != null) {
                    for (int A042 = AnonymousClass002.A04(list2, 1); A042 >= 0; A042--) {
                        A06(((RenderTreeNode) renderTreeNode.A00.get(A042)).A07.A0B());
                    }
                }
                if (((C124956Ep) obj).getMountItemCount() > 0) {
                    throw AnonymousClass001.A0e("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            long A0B = r3.A0B();
            if (A0B == 0) {
                AnonymousClass7NY r5 = (AnonymousClass7NY) C10550i7.A00(r10, 0);
                if (r5 != null) {
                    if (r5.A03) {
                        A0A(r5);
                    }
                    r10.A08(0);
                    RenderTreeNode renderTreeNode2 = this.A01.A02;
                    A08(r5.A04, renderTreeNode2, renderTreeNode2.A07, r5.A02);
                }
            } else {
                r10.A08(A0B);
                C124956Ep r52 = r7.A00;
                if (A022) {
                    A01(r2, r3, "UnmountItem:remove: ", AnonymousClass001.A0o());
                }
                if (r52 != null) {
                    r52.A02(r7);
                }
                if (A022) {
                    r2.A00();
                }
                if (r7.A03) {
                    if (A022) {
                        A01(r2, r3, "UnmountItem:unbind: ", AnonymousClass001.A0o());
                    }
                    A0A(r7);
                    if (A022) {
                        r2.A00();
                    }
                }
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                if (A022) {
                    A01(r2, r3, "UnmountItem:unmount: ", AnonymousClass001.A0o());
                }
                A08(r7.A04, renderTreeNode, r3, obj);
                if (A022) {
                    r2.A00();
                }
                AnonymousClass7JF A002 = C155577f8.A00(this.A04, r7.A01.A07.A0C());
                if (A002 != null) {
                    try {
                        if (A002.A01.Bio(obj)) {
                            A002.A02.incrementAndGet();
                        }
                    } catch (IllegalStateException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Failed to release item to MountItemPool: ");
                        throw new IllegalStateException(AnonymousClass000.A0R(A002.A00, A0o), e);
                    }
                }
            }
            if (A022) {
                r2.A00();
            }
        }
    }

    public final void A08(AnonymousClass7JD r7, RenderTreeNode renderTreeNode, C161797qU r9, Object obj) {
        AnonymousClass7ON r0 = this.A00;
        if (r0 != null) {
            List list = r0.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
        AnonymousClass7JD r2 = r7;
        C161797qU r02 = r9;
        r02.A0J(this.A04, r2, this.A07, obj, renderTreeNode.A08);
    }

    public final void A09(AnonymousClass7NY r8) {
        RenderTreeNode renderTreeNode = r8.A01;
        renderTreeNode.A07.A0G(this.A04, r8.A04, this.A07, r8.A02, renderTreeNode.A08);
        AnonymousClass7ON r0 = this.A00;
        if (r0 != null) {
            List list = r0.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
        r8.A03 = true;
    }

    public final void A0A(AnonymousClass7NY r10) {
        RenderTreeNode renderTreeNode = r10.A01;
        C161797qU r3 = renderTreeNode.A07;
        Object obj = r10.A02;
        Object obj2 = renderTreeNode.A08;
        AnonymousClass7ON r0 = this.A00;
        if (r0 != null) {
            List list = r0.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
        r3.A0H(this.A04, r10.A04, this.A07, obj, obj2);
        r10.A03 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r0 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (((android.view.View) r13).isLayoutRequested() == false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass7NY r18, com.facebook.rendercore.RenderTreeNode r19) {
        /*
            r17 = this;
            r4 = r17
            X.7ON r10 = r4.A00
            X.7XT r11 = r4.A07
            boolean r6 = r11.A02()
            if (r6 == 0) goto L_0x0011
            java.lang.String r0 = "updateMountItemIfNeeded"
            r11.A01(r0)
        L_0x0011:
            r1 = r19
            X.7qU r7 = r1.A07
            java.lang.Object r2 = r1.A08
            r3 = r18
            com.facebook.rendercore.RenderTreeNode r0 = r3.A01
            X.7qU r12 = r0.A07
            java.lang.Object r14 = r0.A08
            java.lang.Object r13 = r3.A02
            r3.A01 = r1
            if (r12 != r7) goto L_0x0049
            if (r14 == r2) goto L_0x0068
            if (r14 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0049
            boolean r0 = r14 instanceof X.C177878gb
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r2 instanceof X.C177878gb
            if (r0 == 0) goto L_0x00a5
            r1 = r14
            X.8gb r1 = (X.C177878gb) r1
            r0 = r2
            X.8gb r0 = (X.C177878gb) r0
            if (r1 == r0) goto L_0x0068
            if (r1 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            X.8xR r1 = (X.C187568xR) r1
            X.8xR r0 = (X.C187568xR) r0
            boolean r0 = r1.BHX(r0)
        L_0x0047:
            if (r0 != 0) goto L_0x0068
        L_0x0049:
            X.C161317pQ.A00()
            if (r6 == 0) goto L_0x0057
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UpdateItem: "
            A01(r11, r7, r0, r1)
        L_0x0057:
            android.content.Context r8 = r4.A04
            X.7JD r9 = r3.A04
            boolean r0 = r3.A03
            r15 = r2
            r16 = r0
            r7.A0F(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x0068
            r11.A00()
        L_0x0068:
            r0 = 1
            r3.A03 = r0
            if (r6 == 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UpdateBounds: "
            A01(r11, r7, r0, r1)
        L_0x0076:
            long r4 = r7.A0B()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r13 instanceof android.view.View
            if (r0 == 0) goto L_0x008e
            r0 = r13
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isLayoutRequested()
            r1 = 1
            if (r0 != 0) goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            com.facebook.rendercore.RenderTreeNode r0 = r3.A01
            A00(r11, r0, r13, r1)
            if (r10 == 0) goto L_0x00aa
            java.util.List r2 = r10.A04
            int r1 = r2.size()
            r0 = 0
        L_0x009d:
            if (r0 >= r1) goto L_0x00aa
            r2.get(r0)
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00a5:
            boolean r0 = X.C153937cI.A01(r14, r2)
            goto L_0x0047
        L_0x00aa:
            if (r6 == 0) goto L_0x00b2
            r11.A00()
            r11.A00()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159167lF.A0B(X.7NY, com.facebook.rendercore.RenderTreeNode):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r13[r15] == null) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C151847Wn r20) {
        /*
            r19 = this;
            r5 = r20
            if (r20 == 0) goto L_0x0211
            X.C161317pQ.A00()
            r2 = 0
            X.92f r1 = new X.92f
            r1.<init>(r5, r2)
            X.92d r0 = new X.92d
            r4 = r19
            r0.<init>(r4, r2, r5)
            X.C161317pQ.A01(r1, r0)
            boolean r0 = r4.A02     // Catch:{ Exception -> 0x01dd }
            if (r0 != 0) goto L_0x01d6
            r0 = 1
            r4.A02 = r0     // Catch:{ Exception -> 0x01dd }
            X.7Wn r8 = r4.A01     // Catch:{ Exception -> 0x01dd }
            if (r5 != r8) goto L_0x0028
            boolean r0 = r4.A03     // Catch:{ Exception -> 0x01dd }
            if (r0 != 0) goto L_0x0028
            goto L_0x01c5
        L_0x0028:
            r4.A01 = r5     // Catch:{ Exception -> 0x01dd }
            X.7XT r6 = r4.A07     // Catch:{ Exception -> 0x01dd }
            boolean r18 = r6.A02()     // Catch:{ Exception -> 0x01dd }
            if (r18 == 0) goto L_0x003c
            java.lang.String r0 = "MountState.mount"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = "RenderCoreExtension.beforeMount"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x003c:
            X.6Ep r3 = r4.A06     // Catch:{ Exception -> 0x01dd }
            if (r18 == 0) goto L_0x0048
            r6.A00()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = "MountState.prepareMount"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x0048:
            X.7Wn r0 = r4.A01     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0140
            if (r8 == 0) goto L_0x0140
            boolean r17 = r6.A02()     // Catch:{ Exception -> 0x01dd }
            if (r17 == 0) goto L_0x0059
            java.lang.String r0 = "unmountOrMoveOldItems"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x0059:
            r7 = 1
        L_0x005a:
            com.facebook.rendercore.RenderTreeNode[] r1 = r8.A04     // Catch:{ Exception -> 0x01dd }
            int r0 = r1.length     // Catch:{ Exception -> 0x01dd }
            if (r7 >= r0) goto L_0x013b
            r0 = r1[r7]     // Catch:{ Exception -> 0x01dd }
            X.7qU r12 = r0.A07     // Catch:{ Exception -> 0x01dd }
            X.7Wn r9 = r4.A01     // Catch:{ Exception -> 0x01dd }
            long r0 = r12.A0B()     // Catch:{ Exception -> 0x01dd }
            android.util.LongSparseArray r10 = r9.A01     // Catch:{ Exception -> 0x01dd }
            java.lang.Integer r9 = X.AnonymousClass0x7.A0f()     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r10.get(r0, r9)     // Catch:{ Exception -> 0x01dd }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x01dd }
            int r14 = X.AnonymousClass001.A0K(r0)     // Catch:{ Exception -> 0x01dd }
            r10 = 0
            r13 = -1
            if (r14 <= r13) goto L_0x0138
            X.7Wn r0 = r4.A01     // Catch:{ Exception -> 0x01dd }
            com.facebook.rendercore.RenderTreeNode[] r0 = r0.A04     // Catch:{ Exception -> 0x01dd }
            r9 = r0[r14]     // Catch:{ Exception -> 0x01dd }
        L_0x0084:
            X.0i7 r11 = r4.A05     // Catch:{ Exception -> 0x01dd }
            long r0 = r12.A0B()     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r12 = r11.A05(r0, r10)     // Catch:{ Exception -> 0x01dd }
            X.7NY r12 = (X.AnonymousClass7NY) r12     // Catch:{ Exception -> 0x01dd }
            if (r12 == 0) goto L_0x0134
            if (r14 == r13) goto L_0x0129
            com.facebook.rendercore.RenderTreeNode r0 = r9.A06     // Catch:{ Exception -> 0x01dd }
            X.7qU r0 = r0.A07     // Catch:{ Exception -> 0x01dd }
            long r0 = r0.A0B()     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r11.A05(r0, r10)     // Catch:{ Exception -> 0x01dd }
            X.7NY r0 = (X.AnonymousClass7NY) r0     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r10 = r0.A02     // Catch:{ Exception -> 0x01dd }
        L_0x00a6:
            X.6Ep r14 = r12.A00     // Catch:{ Exception -> 0x01dd }
            if (r14 == 0) goto L_0x0129
            if (r14 != r10) goto L_0x0129
            com.facebook.rendercore.RenderTreeNode r0 = r12.A01     // Catch:{ Exception -> 0x01dd }
            int r15 = r0.A03     // Catch:{ Exception -> 0x01dd }
            int r1 = r9.A03     // Catch:{ Exception -> 0x01dd }
            if (r15 == r1) goto L_0x0134
            X.6N7 r14 = (X.AnonymousClass6N7) r14     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r11 = r12.A02     // Catch:{ Exception -> 0x01dd }
            r14.invalidate()     // Catch:{ Exception -> 0x01dd }
            com.facebook.rendercore.RenderTreeNode r0 = r12.A01     // Catch:{ Exception -> 0x01dd }
            X.7qU r0 = r0.A07     // Catch:{ Exception -> 0x01dd }
            X.6vF r0 = r0.A04     // Catch:{ Exception -> 0x01dd }
            X.6vF r10 = X.C141236vF.VIEW     // Catch:{ Exception -> 0x01dd }
            if (r0 != r10) goto L_0x00d1
            r0 = 1
            r14.A05 = r0     // Catch:{ Exception -> 0x01dd }
            r0 = r11
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x01dd }
            r0.cancelPendingInputEvents()     // Catch:{ Exception -> 0x01dd }
            X.C06560Yg.A0F(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x00d1:
            X.7NY[] r0 = r14.A07     // Catch:{ Exception -> 0x01dd }
            int r13 = r0.length     // Catch:{ Exception -> 0x01dd }
            if (r1 < r13) goto L_0x00e3
            r9 = r13
        L_0x00d7:
            int r9 = r9 * 2
            if (r1 >= r9) goto L_0x00d7
            X.7NY[] r9 = new X.AnonymousClass7NY[r9]     // Catch:{ Exception -> 0x01dd }
            java.lang.System.arraycopy(r0, r2, r9, r2, r13)     // Catch:{ Exception -> 0x01dd }
            r14.A07 = r9     // Catch:{ Exception -> 0x01dd }
            r0 = r9
        L_0x00e3:
            r13 = r0[r1]     // Catch:{ Exception -> 0x01dd }
            if (r13 == 0) goto L_0x00f2
            X.7NY[] r9 = r14.A08     // Catch:{ Exception -> 0x01dd }
            if (r9 != 0) goto L_0x00f0
            int r9 = r0.length     // Catch:{ Exception -> 0x01dd }
            X.7NY[] r9 = new X.AnonymousClass7NY[r9]     // Catch:{ Exception -> 0x01dd }
            r14.A08 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x00f0:
            r9[r1] = r13     // Catch:{ Exception -> 0x01dd }
        L_0x00f2:
            X.7NY[] r13 = r14.A08     // Catch:{ Exception -> 0x01dd }
            if (r13 == 0) goto L_0x00fc
            r9 = r13[r15]     // Catch:{ Exception -> 0x01dd }
            r16 = 1
            if (r9 != 0) goto L_0x00fe
        L_0x00fc:
            r16 = 0
        L_0x00fe:
            r9 = 0
            if (r16 == 0) goto L_0x0106
            r16 = r13[r15]     // Catch:{ Exception -> 0x01dd }
            r13[r15] = r9     // Catch:{ Exception -> 0x01dd }
            goto L_0x010a
        L_0x0106:
            r16 = r0[r15]     // Catch:{ Exception -> 0x01dd }
            r0[r15] = r9     // Catch:{ Exception -> 0x01dd }
        L_0x010a:
            r0[r1] = r16     // Catch:{ Exception -> 0x01dd }
            if (r13 == 0) goto L_0x011b
            r1 = 0
        L_0x010f:
            int r0 = r13.length     // Catch:{ Exception -> 0x01dd }
            if (r1 >= r0) goto L_0x0119
            r0 = r13[r1]     // Catch:{ Exception -> 0x01dd }
            if (r0 != 0) goto L_0x011b
            int r1 = r1 + 1
            goto L_0x010f
        L_0x0119:
            r14.A08 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x011b:
            com.facebook.rendercore.RenderTreeNode r0 = r12.A01     // Catch:{ Exception -> 0x01dd }
            X.7qU r0 = r0.A07     // Catch:{ Exception -> 0x01dd }
            X.6vF r0 = r0.A04     // Catch:{ Exception -> 0x01dd }
            if (r0 != r10) goto L_0x0134
            android.view.View r11 = (android.view.View) r11     // Catch:{ Exception -> 0x01dd }
            X.C06560Yg.A0E(r11)     // Catch:{ Exception -> 0x01dd }
            goto L_0x0134
        L_0x0129:
            com.facebook.rendercore.RenderTreeNode r0 = r12.A01     // Catch:{ Exception -> 0x01dd }
            X.7qU r0 = r0.A07     // Catch:{ Exception -> 0x01dd }
            long r0 = r0.A0B()     // Catch:{ Exception -> 0x01dd }
            r4.A06(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x0134:
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0138:
            r9 = r10
            goto L_0x0084
        L_0x013b:
            if (r17 == 0) goto L_0x0140
            r6.A00()     // Catch:{ Exception -> 0x01dd }
        L_0x0140:
            X.0i7 r9 = r4.A05     // Catch:{ Exception -> 0x01dd }
            r0 = 0
            java.lang.Object r1 = X.C10550i7.A00(r9, r0)     // Catch:{ Exception -> 0x01dd }
            X.7NY r1 = (X.AnonymousClass7NY) r1     // Catch:{ Exception -> 0x01dd }
            X.7Wn r0 = r4.A01     // Catch:{ Exception -> 0x01dd }
            com.facebook.rendercore.RenderTreeNode[] r0 = r0.A04     // Catch:{ Exception -> 0x01dd }
            r8 = r0[r2]     // Catch:{ Exception -> 0x01dd }
            if (r1 != 0) goto L_0x0167
            X.7NY r7 = new X.7NY     // Catch:{ Exception -> 0x01dd }
            r7.<init>(r8, r3)     // Catch:{ Exception -> 0x01dd }
            X.7qU r1 = r8.A07     // Catch:{ Exception -> 0x01dd }
            X.7JD r0 = r7.A04     // Catch:{ Exception -> 0x01dd }
            r4.A07(r0, r8, r1, r3)     // Catch:{ Exception -> 0x01dd }
            r0 = 0
            r9.A0A(r0, r7)     // Catch:{ Exception -> 0x01dd }
            r4.A09(r7)     // Catch:{ Exception -> 0x01dd }
            goto L_0x016a
        L_0x0167:
            r4.A0B(r1, r8)     // Catch:{ Exception -> 0x01dd }
        L_0x016a:
            if (r18 == 0) goto L_0x016f
            r6.A00()     // Catch:{ Exception -> 0x01dd }
        L_0x016f:
            com.facebook.rendercore.RenderTreeNode[] r10 = r5.A04     // Catch:{ Exception -> 0x01dd }
            int r8 = r10.length     // Catch:{ Exception -> 0x01dd }
            r7 = 1
        L_0x0173:
            if (r7 >= r8) goto L_0x018f
            r3 = r10[r7]     // Catch:{ Exception -> 0x01dd }
            X.7qU r0 = r3.A07     // Catch:{ Exception -> 0x01dd }
            long r0 = r0.A0B()     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = X.C10550i7.A00(r9, r0)     // Catch:{ Exception -> 0x01dd }
            X.7NY r0 = (X.AnonymousClass7NY) r0     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0189
            r4.A0B(r0, r3)     // Catch:{ Exception -> 0x01dd }
            goto L_0x018c
        L_0x0189:
            r4.A0D(r3)     // Catch:{ Exception -> 0x01dd }
        L_0x018c:
            int r7 = r7 + 1
            goto L_0x0173
        L_0x018f:
            r4.A03 = r2     // Catch:{ Exception -> 0x01dd }
            if (r18 == 0) goto L_0x019b
            r6.A00()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = "RenderCoreExtension.afterMount"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
        L_0x019b:
            X.7ON r0 = r4.A00     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01ae
            java.util.List r3 = r0.A04     // Catch:{ Exception -> 0x01dd }
            int r1 = r3.size()     // Catch:{ Exception -> 0x01dd }
            r0 = 0
        L_0x01a6:
            if (r0 >= r1) goto L_0x01ae
            r3.get(r0)     // Catch:{ Exception -> 0x01dd }
            int r0 = r0 + 1
            goto L_0x01a6
        L_0x01ae:
            r4.A02 = r2     // Catch:{ Exception -> 0x01dd }
            X.7ON r0 = r4.A00     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01b7
            if (r18 == 0) goto L_0x01c5
            goto L_0x01ba
        L_0x01b7:
            if (r18 == 0) goto L_0x01c5
            goto L_0x01c2
        L_0x01ba:
            java.lang.String r0 = "MountState.onRenderTreeUpdated"
            r6.A01(r0)     // Catch:{ Exception -> 0x01dd }
            r6.A00()     // Catch:{ Exception -> 0x01dd }
        L_0x01c2:
            r6.A00()     // Catch:{ Exception -> 0x01dd }
        L_0x01c5:
            r4.A02 = r2
            r2 = 1
            X.92f r1 = new X.92f
            r1.<init>(r5, r2)
            X.92d r0 = new X.92d
            r0.<init>(r4, r2, r5)
            X.C161317pQ.A01(r1, r0)
            return
        L_0x01d6:
            java.lang.String r0 = "Trying to mount while already mounting!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x01dd }
            throw r0     // Catch:{ Exception -> 0x01dd }
        L_0x01dd:
            r10 = move-exception
            X.6vE r7 = X.C141226vE.ERROR     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "MountState:Exception"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "Exception while mounting: "
            java.lang.String r9 = X.AnonymousClass000.A0a(r0, r1, r10)     // Catch:{ all -> 0x01ff }
            r11 = 0
            X.8l8 r6 = X.C159557m5.A00()     // Catch:{ all -> 0x01ff }
            r12 = r2
            r6.Bjb(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01ff }
            boolean r0 = r10 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01fa
            throw r10     // Catch:{ all -> 0x01ff }
        L_0x01fa:
            java.lang.RuntimeException r0 = X.C18330xA.A09(r10)     // Catch:{ all -> 0x01ff }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r3 = move-exception
            r4.A02 = r2
            r2 = 1
            X.92f r1 = new X.92f
            r1.<init>(r5, r2)
            X.92d r0 = new X.92d
            r0.<init>(r4, r2, r5)
            X.C161317pQ.A01(r1, r0)
            throw r3
        L_0x0211:
            java.lang.String r0 = "Trying to mount a null RenderTreeNode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159167lF.A0C(X.7Wn):void");
    }

    public final void A0D(RenderTreeNode renderTreeNode) {
        Object B0R;
        C161797qU r6 = renderTreeNode.A07;
        long A0B = r6.A0B();
        if (A0B == 0) {
            C124956Ep r2 = this.A06;
            AnonymousClass7NY r1 = new AnonymousClass7NY(renderTreeNode, r2);
            A07(r1.A04, renderTreeNode, r6, r2);
            this.A05.A0A(0, r1);
            A09(r1);
            return;
        }
        C161317pQ.A00();
        AnonymousClass7XT r5 = this.A07;
        boolean A022 = r5.A02();
        if (A022) {
            A01(r5, r6, "MountItem: ", AnonymousClass001.A0o());
        }
        RenderTreeNode renderTreeNode2 = renderTreeNode.A06;
        C161797qU r8 = renderTreeNode2.A07;
        if (A022) {
            A01(r5, r8, "MountItem:mount-parent ", AnonymousClass001.A0o());
        }
        long A0B2 = r8.A0B();
        C10550i7 r9 = this.A05;
        if (C10550i7.A00(r9, A0B2) == null) {
            A0D(renderTreeNode2);
        }
        if (A022) {
            r5.A00();
        }
        long A0B3 = r8.A0B();
        Object obj = ((AnonymousClass7NY) C10550i7.A00(r9, A0B3)).A02;
        if (obj instanceof C124956Ep) {
            C124956Ep r7 = (C124956Ep) obj;
            if (A022) {
                A01(r5, r6, "MountItem:acquire-content ", AnonymousClass001.A0o());
            }
            Context context = this.A04;
            C184838sd A0C = r6.A0C();
            AnonymousClass7JF A002 = C155577f8.A00(context, A0C);
            if (A002 == null || (B0R = A002.A01.AwG()) == null) {
                B0R = A0C.B0R(context);
            } else {
                A002.A02.decrementAndGet();
            }
            if (A022) {
                r5.A00();
                A01(r5, r6, "MountItem:mount ", AnonymousClass001.A0o());
            }
            AnonymousClass7NY r3 = new AnonymousClass7NY(renderTreeNode, B0R);
            A07(r3.A04, renderTreeNode, r6, B0R);
            r9.A0A(A0B, r3);
            r7.A03(r3, renderTreeNode.A03);
            if (A022) {
                r5.A00();
                A01(r5, r6, "MountItem:bind ", AnonymousClass001.A0o());
            }
            A09(r3);
            if (A022) {
                r5.A00();
                A01(r5, r6, "MountItem:applyBounds ", AnonymousClass001.A0o());
            }
            A00(r5, renderTreeNode, r3.A02, true);
            if (A022) {
                r5.A00();
                A01(r5, r6, "MountItem:after ", AnonymousClass001.A0o());
            }
            AnonymousClass7ON r0 = this.A00;
            if (r0 != null) {
                List list = r0.A04;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i);
                }
            }
            if (A022) {
                r5.A00();
                r5.A00();
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
        AnonymousClass000.A1A(obj, A0o);
        A0o.append("'.\nParent RenderUnit: id=");
        A0o.append(A0B3);
        A0o.append("; contentType='");
        A0o.append(r8.A0D());
        C18310x6.A1N("'.\nChild RenderUnit: id=", "; contentType='", A0o, A0B);
        A0o.append(r6.A0D());
        A0o.append("'.");
        throw AnonymousClass6C7.A0e(A0o);
    }

    public static void A01(AnonymousClass7XT r1, C161797qU r2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r2.A0E());
        r1.A01(sb.toString());
    }

    public final void A07(AnonymousClass7JD r8, RenderTreeNode renderTreeNode, C161797qU r10, Object obj) {
        C161317pQ.A00();
        AnonymousClass7ON r0 = this.A00;
        AnonymousClass7JD r3 = r8;
        C161797qU r1 = r10;
        r1.A0I(this.A04, r3, this.A07, obj, renderTreeNode.A08);
        if (r0 != null) {
            List list = r0.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
    }
}
