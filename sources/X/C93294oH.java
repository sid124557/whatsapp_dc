package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4oH  reason: invalid class name and case insensitive filesystem */
public class C93294oH extends C92634n0 implements C183138pY {
    public AnonymousClass5ZR A00;
    public C56232re A01;
    public C620133d A02;
    public C55732qp A03;
    public AnonymousClass33O A04;
    public AnonymousClass5C5 A05;
    public List A06;
    public final View A07 = C06560Yg.A02(this, R.id.bubble_header);
    public final View A08 = C06560Yg.A02(this, R.id.conversation_row_sticker_album_sticker_container);
    public final ArrayList A09;

    public void A1H() {
        A00(false);
        A1t(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5 == 100) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r8 = this;
            r7 = 0
        L_0x0001:
            java.util.ArrayList r1 = r8.A09
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x006d
            java.util.List r0 = r8.A06
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x0068
            java.lang.Object r0 = r1.get(r7)
            X.5TP r0 = (X.AnonymousClass5TP) r0
            X.5Xu r0 = r0.A0B
            X.5UY r6 = r0.A0N
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.1mV r0 = (X.C30471mV) r0
            X.33C r1 = X.C30471mV.A00(r0)
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x006b
            boolean r0 = r1.A0a
            if (r0 != 0) goto L_0x006b
            long r0 = r1.A0C
            int r2 = (int) r0
            X.2re r1 = r8.A01
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.1mV r0 = (X.C30471mV) r0
            boolean r0 = r1.A05(r0)
            int r5 = r2 / 2
            if (r0 == 0) goto L_0x0046
            int r5 = r5 + 50
        L_0x0046:
            if (r5 == 0) goto L_0x004d
            r0 = 100
            r4 = 0
            if (r5 != r0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            int r3 = r8.A22(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A1A(r8, r1)
            java.lang.String r0 = "#updateProgress"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r1 = 1
            X.92B r0 = new X.92B
            r0.<init>(r5, r3, r1, r4)
            r6.A0A(r0, r2)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0001
        L_0x006b:
            r5 = 0
            goto L_0x004d
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93294oH.A1L():void");
    }

    private void A00(boolean z) {
        C30471mV r0;
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    int size = this.A06.size();
                    AnonymousClass5TP r1 = (AnonymousClass5TP) arrayList.get(i);
                    if (i < size) {
                        r0 = (C30471mV) this.A06.get(i);
                    } else {
                        r0 = null;
                    }
                    r1.A01(r0, z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A11() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass5TP r2 = (AnonymousClass5TP) it.next();
            StickerView stickerView = r2.A0C;
            stickerView.clearAnimation();
            r2.A00 = 0.0f;
            stickerView.invalidate();
        }
    }

    public void A12(AnonymousClass2z0 r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass5TP r1 = (AnonymousClass5TP) it.next();
            if (C86664Kz.A1X(r1.A07, r5)) {
                StickerView stickerView = r1.A0C;
                stickerView.setBackgroundDrawable(new AnonymousClass67P(r1));
                AnonymousClass4O8 r2 = new AnonymousClass4O8(r1);
                C86624Kv.A18(r2, 2400);
                stickerView.startAnimation(r2);
                return;
            }
        }
    }

    public void A1m(C624134x r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass5TP r3 = (AnonymousClass5TP) it.next();
            C30471mV r1 = r3.A07;
            if (r1 != null && C86664Kz.A1X(r1, r5.A1J)) {
                AnonymousClass677 r2 = r3.A0D.A0m;
                if (r2 != null && r2.BFW()) {
                    r3.A02.setSelected(r2.Bqw(r3.A07));
                    return;
                }
                return;
            }
        }
    }

    public void A1p(C624134x r5, int i) {
        if (r5 instanceof C30471mV) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                AnonymousClass5TP r2 = (AnonymousClass5TP) it.next();
                C30471mV r1 = r2.A07;
                if (r1 != null && C86664Kz.A1X(r1, r5.A1J)) {
                    r2.A01 = i;
                    r2.A01((C30471mV) r5, false);
                    return;
                }
            }
        }
    }

    public void A1q(C624134x r2, boolean z) {
        super.A1q(this.A0S, z);
        if (z) {
            A00(false);
        }
        A25();
    }

    public boolean A1u() {
        return false;
    }

    public boolean A1v() {
        return false;
    }

    public boolean A21(AnonymousClass2z0 r4) {
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C86614Ku.A0h(it).equals(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A0S != r6.get(0)) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A24(java.util.List r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A06
            r4 = 0
            if (r0 == 0) goto L_0x000e
            X.34x r1 = r5.A0S
            java.lang.Object r0 = r6.get(r4)
            r3 = 0
            if (r1 == r0) goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            int r1 = r6.size()
            r0 = 2
            if (r1 == r0) goto L_0x001c
            java.lang.String r0 = "ConversationRowStickerAlbum/setAlbumMessages improper number of stickers in sticker album"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x001c:
            if (r7 != 0) goto L_0x0039
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0038
            r2 = 0
        L_0x0023:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0039
            java.util.List r0 = r5.A06
            java.lang.Object r1 = r0.get(r2)
            java.lang.Object r0 = r6.get(r2)
            if (r1 != r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0038:
            r7 = 1
        L_0x0039:
            r5.A06 = r6
            X.34x r0 = X.C18320x8.A0R(r6, r4)
            super.A1q(r0, r7)
            if (r3 != 0) goto L_0x0046
            if (r7 == 0) goto L_0x0049
        L_0x0046:
            r5.A00(r3)
        L_0x0049:
            r5.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93294oH.A24(java.util.List, boolean):void");
    }

    public final void A25() {
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    if (i < this.A06.size()) {
                        AnonymousClass5TP r3 = (AnonymousClass5TP) arrayList.get(i);
                        AnonymousClass677 r2 = r3.A0D.A0m;
                        if (r2 == null || !r2.BFW()) {
                            C86604Kt.A1A(r3.A02);
                        } else {
                            r3.A00();
                            r3.A02.setSelected(r2.BIB(r3.A07));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void BpZ() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass5TP) it.next()).A0C.A07();
        }
    }

    public int getBubbleType() {
        boolean A0N = this.A0N.A0N(C18320x8.A0R(this.A06, 0).A1J.A00);
        if (!AnonymousClass2z0.A0D(C18320x8.A0R(this.A06, 0))) {
            return 0;
        }
        if (!C18320x8.A0R(this.A06, 0).A1J.A02 || A0N) {
            return 1;
        }
        return 0;
    }

    public int getCapabilities() {
        return 0;
    }

    public C30471mV getFMessage() {
        return (C30471mV) this.A0S;
    }

    public int getMainChildMaxWidth() {
        return 0;
    }

    public int getMaxAlbumSize() {
        return 2;
    }

    public int getMessageCount() {
        return C86614Ku.A08(this.A06);
    }

    public int getMinAlbumSize() {
        return 2;
    }

    public C93294oH(Context context, AnonymousClass677 r5, C30471mV r6, AnonymousClass33O r7) {
        super(context, r5, r6);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A09 = A0s;
        this.A04 = r7;
        A0s.add(new AnonymousClass5TP(C86664Kz.A0v(this, R.id.sticker_1), this));
        A0s.add(new AnonymousClass5TP(C86664Kz.A0v(this, R.id.sticker_2), this));
    }

    public boolean A16() {
        return C87094Nz.A0i(this);
    }

    public int getReactionsViewVerticalOverlap() {
        return C86654Ky.A05(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
